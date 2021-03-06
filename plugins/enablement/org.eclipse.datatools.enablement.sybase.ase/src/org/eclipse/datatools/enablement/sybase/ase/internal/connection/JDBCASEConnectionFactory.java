/*******************************************************************************
 * Copyright (c) 2006 Sybase, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    rcernich - initial API and implementation
 *******************************************************************************/ 
package org.eclipse.datatools.enablement.sybase.ase.internal.connection;

import org.eclipse.datatools.connectivity.IConnection;
import org.eclipse.datatools.connectivity.IConnectionFactory;
import org.eclipse.datatools.connectivity.IConnectionProfile;


public class JDBCASEConnectionFactory implements IConnectionFactory {

	public JDBCASEConnectionFactory() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.datatools.connectivity.IConnectionFactory#createConnection(org.eclipse.datatools.connectivity.IConnectionProfile)
	 */
	public IConnection createConnection(IConnectionProfile profile) {
		JDBCASEJDBCConnection connection = new JDBCASEJDBCConnection(profile, getClass());
		connection.open();
		return connection;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.datatools.connectivity.IConnectionFactory#createConnection(org.eclipse.datatools.connectivity.IConnectionProfile,
	 *      java.lang.String, java.lang.String)
	 */
	public IConnection createConnection(IConnectionProfile profile, String uid,
			String pwd) {
		return createConnection(profile);
	}

}
