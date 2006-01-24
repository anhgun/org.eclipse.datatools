/*******************************************************************************
 * Copyright (c) 2004-2005 Sybase, Inc.
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: rcernich - initial API and implementation
 ******************************************************************************/
package org.eclipse.datatools.connectivity;

import java.util.Map;
import java.util.Properties;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.IJobChangeListener;
import org.eclipse.ui.IPropertyListener;

/**
 * The interface used when working with an instance of a connection profile.
 * 
 * @author rcernich
 * 
 * Created on Jan 14, 2004
 */
public interface IConnectionProfile {

	/**
	 * Property ID for <code>isConnected()</code>
	 */
	static final int PROP_CONNECTED = 0x01;
	/**
	 * Property ID for <code>getBaseProperties()</code> and
	 * <code>getProperties()</code>
	 */
	static final int PROP_PROPERTIES = 0x02;
	/**
	 * Property ID for <code>getName()</code>
	 */
	static final int PROP_NAME = 0x03;
	/**
	 * Property ID for <code>getDescription()</code>
	 */
	static final int PROP_DESCRIPTION = 0x04;

	// General profile methods

	/**
	 * @return the name of this connection profile
	 */
	String getName();

	/**
	 * @return the description of this connection profile
	 */
	String getDescription();

	/**
	 * @return whether it's autoconnect or not
	 */
	boolean isAutoConnect();
	
	/**
	 * @return the static ID for this connection profile
	 */
	String getInstanceID();

	/**
	 * This method returns the connection profile that this connection profile
	 * derives from. For example, a JMS queue session may depend on an instance
	 * of a JNDI connection profile.
	 * 
	 * @return the connection profile this connection profile is derived from.
	 */
	IConnectionProfile getParentProfile();

	/**
	 * This method returns the properties managed by the base connection profile
	 * extension.
	 * 
	 * @return a properties object containing properties defined by the base
	 *         connection profile extension.
	 */
	Properties getBaseProperties();

	/**
	 * This method sets the properties managed by the base connection profile
	 * extension.
	 * 
	 * @param props the properties to set as the base properties.
	 */
	void setBaseProperties(Properties props);

	/**
	 * This method returns the properties associated with a connection profile
	 * profile extension. The type specified must match the id of a profile
	 * extension or the base profile.
	 * 
	 * @param type the type of properties.
	 * 
	 * @return the properties managed by the specified profile extension.
	 */
	Properties getProperties(String type);

	/**
	 * This method sets the properties managed by a specific profile extension.
	 * The type specified must match the id of a profile extension or the base
	 * profile.
	 * 
	 * @param type the type of properties.
	 * @param props the properties to set.
	 */
	void setProperties(String type, Properties props);

	/**
	 * Sets the connected state for this profile. The connected state is used by
	 * content extensions and other consumers of the framework as a hint
	 * indicating that they should create a connection to the profile.
	 * 
	 * @param connected the connected state.
	 * 
	 * @deprecated Use one of the connect() methods instead. This method now
	 *             delegates to connect().
	 */
	void setConnected(boolean connected);

	/**
	 * @return true if consumers should create connections to this profile
	 */
	boolean isConnected();

	/**
	 * This method blocks until all registered connect listeners have been
	 * notified to open connections.
	 * 
	 * @return the status of the connect operation. Status.OK_STATUS if all went
	 *         well.
	 */
	IStatus connect();

	/**
	 * This method returns immediately after spawning a Job which notifies all
	 * registered connect listeners to open connections. The caller can pass in
	 * a job listener so it can be notified of the status of the job. The status
	 * returned by the job upon completion can be used to determine whether or
	 * not the connect operation was successful.
	 * 
	 * @param listener a job listener that can be used to notify the caller of
	 *        the state of the job spawned to open the connections. Can be null.
	 */
	void connect(IJobChangeListener listener);

	/**
	 * This method blocks until all registered connect listeners have been
	 * notified to close connections.
	 * 
	 * @return the status of the disconnect operation. Status.OK_STATUS if all
	 *         went well.
	 */
	IStatus disconnect();

	/**
	 * This method returns immediately after spawning a Job which notifies all
	 * registered connect listeners to close connections. The caller can pass in
	 * a job listener so it can be notified of the status of the job. The status
	 * returned by the job upon completion can be used to determine whether or
	 * not the disconnect operation was successful.
	 * 
	 * @param listener a job listener that can be used to notify the caller of
	 *        the state of the job spawned to close the connections. Can be
	 *        null.
	 */
	void disconnect(IJobChangeListener listener);

	/**
	 * Add a connect listener to this profile.
	 * 
	 * @param listener
	 * 
	 * @deprecated use IManagedConnection.removeConnectionListener()
	 */
	void addConnectListener(IConnectListener listener);

	/**
	 * Remove a connect listener from this profile.
	 * 
	 * @param listener
	 * 
	 * @deprecated use IManagedConnection.removeConnectionListener()
	 */
	void removeConnectListener(IConnectListener listener);
	
	/**
	 * @param type the ID of the connection factory responsible for creating the
	 *        connection
	 * 
	 * @return the managed connection
	 */
	IManagedConnection getManagedConnection(String type);

	/**
	 * Add property listener to this profile. Property events sent:
	 * 
	 * @param listener
	 */
	void addPropertyListener(IPropertyListener listener);

	/**
	 * @param listener
	 */
	void removePropertyListener(IPropertyListener listener);

	// ConnectionProfileProvider derived methods

	/**
	 * This method is a shortcut for getProvider().getName().
	 * 
	 * @return the name of the provider managing this profile
	 * 
	 * @see IConnectionProfileProvider#getConfigurationType()
	 */
	String getProviderName();

	/**
	 * This method is a shortcut for getProvider().getProviderId().
	 * 
	 * @return the id of the provider managing this profile
	 * 
	 * @see IConnectionProfileProvider#getProviderId()
	 */
	String getProviderId();

	/**
	 * This method is a shortcut for getProvider().getCategory().
	 * 
	 * @return the category this connection profile belongs to.
	 * 
	 * @see IConnectionProfileProvider#getCategory()
	 */
	ICategory getCategory();

	/**
	 * This method is a shortcut for getProvider().getConfigurationType().
	 * 
	 * @return the configuration type of this connection profile.
	 * 
	 * @see IConnectionProfileProvider#getConfigurationType()
	 */
	IConfigurationType getConfigurationType();

	/**
	 * This method is a shortcut for getProvider().getProfileExtensions().
	 * 
	 * @return a list of profile extensions supporting this profile
	 * 
	 * @see IConnectionProfileProvider#getProfileExtensions()
	 */
	Map getProfileExtensions();

	/**
	 * This method is a shortcut for
	 * getProvider()getConnectionFactory(factoryId).createConnection(this).
	 * 
	 * @param factoryId the connection factory id
	 * 
	 * @return a connection if successful; otherwise null
	 * 
	 * @see IConnectionFactoryProvider#createConnection(IConnectionProfile)
	 */
	IConnection createConnection(String factory);

	/**
	 * This method is a shortcut for
	 * getProvider()getConnectionFactory(factoryId).createConnection(this,uid,pwd).
	 * 
	 * @param factoryId the connection factory id
	 * @param uid the user id
	 * @param pwd the user's password
	 * 
	 * @return a connection if successful; otherwise null
	 * 
	 * @see IConnectionFactoryProvider#createConnection(IConnectionProfile,String,String)
	 */
	IConnection createConnection(String factoryId, String uid, String pwd);

	/**
	 * Returns the provider responsible for managing this connection profile.
	 * 
	 * @return the provider managing this connection profile
	 */
	IConnectionProfileProvider getProvider();

}