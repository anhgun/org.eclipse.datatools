/*******************************************************************************
 * Copyright (c) 2004, 2005 Sybase, Inc. and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sybase, Inc. - initial API and implementation
 *******************************************************************************/
package org.eclipse.datatools.sqltools.test;

import java.util.Properties;

import org.eclipse.datatools.sqltools.tests.verification.hooks.Messages;
import org.eclipse.datatools.sqltools.tests.verification.hooks.SQLToolsTestUtil;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The main plugin class to be used in the desktop.
 * @author Hui Cao
 */
public class Activator extends AbstractUIPlugin implements IStartup {

	//The shared instance.
	private static Activator plugin;
	
	/**
	 * The constructor.
	 */
	public Activator() {
		plugin = this;
	}

	/**
	 * This method is called upon plug-in activation
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	/**
	 * This method is called when the plug-in is stopped
	 */
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		plugin = null;
	}

	/**
	 * Returns the shared instance.
	 *
	 * @return the shared instance.
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path.
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return AbstractUIPlugin.imageDescriptorFromPlugin("org.eclipse.datatools.sqltools.test", path);
	}

	public void earlyStartup() {
		try {
			Properties props = new Properties();
			SQLToolsTestUtil.loadProps(SQLToolsTestUtil.class
					.getResource("ASAControlConnectionTest.props"),props);
			//construct properties for profile
			SQLToolsTestUtil.createProfile(props);

			Messages.log("derby profile created");
			System.out.println("derby profile created.");
		} catch (Exception e) {
			Messages.log("derby profile creation failed");
			e.printStackTrace();
		}
		
	}
}
