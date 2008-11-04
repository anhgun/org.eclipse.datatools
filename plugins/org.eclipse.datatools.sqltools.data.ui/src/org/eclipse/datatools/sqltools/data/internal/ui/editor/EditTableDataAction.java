/*******************************************************************************
 * Copyright (c) 2001, 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.eclipse.datatools.sqltools.data.internal.ui.editor;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.datatools.connectivity.sqm.core.internal.ui.explorer.popup.AbstractAction;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.sqltools.data.internal.ui.DataUIPlugin;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public class EditTableDataAction extends AbstractAction
{
    private static final String TEXT = Messages.getString("TableDataEditMenu"); //$NON-NLS-1$

    protected Table table = null;

    protected void initialize()
    {    	
    	initializeAction(null, null, TEXT, TEXT);
    }

    public void run()
    {    	
    	if (table == null)
            return;

        IWorkbenchPage workbenchPage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();

        try
        {
            workbenchPage.openEditor(new TableDataEditorInput(table),
                    "org.eclipse.datatools.sqltools.data.internal.ui.editor.tableDataEditor"); //$NON-NLS-1$
        }
        catch (PartInitException e)
        {
            DataUIPlugin.getDefault().writeLog(IStatus.ERROR, 0, e.getMessage(), e);
        }

    }

    public void selectionChanged(SelectionChangedEvent event)
    {
        table = null;

        if (event.getSelection() instanceof IStructuredSelection)
            if (((IStructuredSelection) event.getSelection()).getFirstElement() instanceof Table)
                table = (Table) ((IStructuredSelection) event.getSelection()).getFirstElement();

        boolean b = true;
        b &= table != null && table.getColumns().size() > 0;
        b &= DataUIPlugin.isGroupIDOK(table);
        setEnabled(b);
    }
}
