/*******************************************************************************
 * Copyright (c) 2004-2007 Sybase, Inc.
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: shongxum - initial API and implementation
 ******************************************************************************/
package org.eclipse.datatools.connectivity.ui.actions;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.ProfileManager;
import org.eclipse.datatools.connectivity.internal.ui.ConnectivityUIPlugin;
import org.eclipse.datatools.connectivity.internal.ui.dialogs.ExceptionHandler;
import org.eclipse.datatools.connectivity.internal.ui.refactoring.ConnectionProfileCopyProcessor;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ltk.core.refactoring.CheckConditionsOperation;
import org.eclipse.ltk.core.refactoring.PerformRefactoringOperation;
import org.eclipse.ltk.core.refactoring.participants.CopyRefactoring;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;

/**
 * @author shongxum, brianf
 */
public class DuplicateProfileAction extends Action implements IActionDelegate {

	private Shell mParentShell = null;

	private IConnectionProfile mConnectionProfile = null;
	
	/**
	 * 
	 */
	public DuplicateProfileAction() {
		Display display = Display.getCurrent();
		mParentShell = display.getActiveShell();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.action.Action#run()
	 */
	public void run() {
		try {
			refactor(mConnectionProfile);
//			String newProfile = ProfileManager.getInstance().duplicateProfile(
//					mConnectionProfile);
//			IConnectionProfile profile = ProfileManager.getInstance()
//					.getProfileByName(newProfile);
//			if (profile.isAutoConnect())
//				profile.connect();
			
//		} catch (ConnectionProfileException e) {
//			ExceptionHandler.showException(mParentShell, ConnectivityUIPlugin
//					.getDefault().getResourceString("dialog.title.error"), e //$NON-NLS-1$
//					.getMessage(), e);
		} catch (CoreException e) {
			ExceptionHandler.showException(mParentShell, ConnectivityUIPlugin
				.getDefault().getResourceString("dialog.title.error"), e //$NON-NLS-1$
				.getMessage(), e);
		}
	}
	
	private void refactor (IConnectionProfile profile) throws CoreException {
    	//  Refactor for rename
    	PerformRefactoringOperation refOperation = new PerformRefactoringOperation(
				new CopyRefactoring(new ConnectionProfileCopyProcessor(
						new IConnectionProfile[] { profile}, profile
								.getParentProfile() == null ? ProfileManager
								.getInstance() : profile.getParentProfile())),
				CheckConditionsOperation.ALL_CONDITIONS);
    	try 
    	{
    		ResourcesPlugin.getWorkspace().run(refOperation, null);
    	}
    	catch (OperationCanceledException oce) 
    	{
    		throw new OperationCanceledException();			
    	}
    	catch (CoreException ce) 
    	{
    		throw ce;
    	}	
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {
		run();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		mConnectionProfile = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			action.setEnabled(false);
			if (structuredSelection.size() == 1) {
				Object selectedResource = structuredSelection.getFirstElement();
				action.setEnabled(selectedResource instanceof IConnectionProfile);
				if (selectedResource instanceof IConnectionProfile)
					mConnectionProfile = (IConnectionProfile) selectedResource;
			}
		}
	}
}