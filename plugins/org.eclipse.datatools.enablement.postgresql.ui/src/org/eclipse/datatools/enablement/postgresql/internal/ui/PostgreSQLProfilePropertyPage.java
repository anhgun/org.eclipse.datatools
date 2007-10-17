/*******************************************************************************
 * Copyright (c) 2004-2005 Sybase, Inc.
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: brianf - initial API and implementation
 ******************************************************************************/
package org.eclipse.datatools.enablement.postgresql.internal.ui;

import java.util.Properties;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.datatools.connectivity.ConnectionProfileConstants;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.db.generic.GenericDBPlugin;
import org.eclipse.datatools.connectivity.db.generic.IDBConnectionProfileConstants;
import org.eclipse.datatools.connectivity.db.generic.IDBDriverDefinitionConstants;
import org.eclipse.datatools.connectivity.drivers.DriverInstance;
import org.eclipse.datatools.connectivity.internal.ui.DelimitedStringList;
import org.eclipse.datatools.connectivity.internal.ui.DriverListCombo;
import org.eclipse.datatools.connectivity.ui.wizards.ProfileDetailsPropertyPage;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * This class allows the user to edit connection properties for the generic DB
 * connection profile.
 * 
 */
public class PostgreSQLProfilePropertyPage extends ProfileDetailsPropertyPage {

	private static final String EMPTY_STRING = new String();

	private Text mDatabaseNameText;
	private Text mDBUIDText;
	private Text mDBPWDText;
	private Text mURLText;
	private Button mSaveDBPWDCheckbox;

	final DriverListCombo combo = new DriverListCombo();
	private DelimitedStringList mDBConnProps;
	private DriverInstance mDriverInstance;

	private String mDriverCategory;

	public PostgreSQLProfilePropertyPage() {
		super();
		noDefaultAndApplyButton();
		setDriverCategory(IDBDriverDefinitionConstants.DATABASE_CATEGORY_ID);
	}

	/**
	 * @see PreferencePage#createContents(Composite)
	 */
	protected void createCustomContents(Composite parent) {
		Composite content = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout(2, false);
		content.setLayout(layout);

		this.combo.setLabelText(GenericDBPlugin.getDefault().getResourceString(
				"GenericDBProfileDetailsWizardPage.driverCombo.label")); //$NON-NLS-1$
		this.combo.setCategory(getDriverCategory());
		this.combo.setNullDriverIsValid(false);
		this.combo.createContents(content);

		this.mDatabaseNameText = (Text) createLabelTextPair(
				content,
				GenericDBPlugin.getDefault().getResourceString(
						"GenericDBProfileDetailsWizardPage.databaseName.label"), //$NON-NLS-1$
				this.mURLText, SWT.BORDER, GridData.FILL_HORIZONTAL);		
		this.mURLText = (Text) createLabelTextPair(content, GenericDBPlugin
				.getDefault().getResourceString(
						"GenericDBProfileDetailsWizardPage.url.label"), //$NON-NLS-1$
				this.mURLText, SWT.BORDER, GridData.FILL_HORIZONTAL);
		this.mDBUIDText = (Text) createLabelTextPair(content, GenericDBPlugin
				.getDefault().getResourceString(
						"GenericDBProfileDetailsWizardPage.userName.label"), //$NON-NLS-1$ 
				this.mDBUIDText, SWT.BORDER, GridData.FILL_HORIZONTAL);

		this.mDBPWDText = (Text) createLabelTextPair(content, GenericDBPlugin
				.getDefault().getResourceString(
						"GenericDBProfileDetailsWizardPage.password.label"), //$NON-NLS-1$, 
				this.mDBPWDText, SWT.BORDER | SWT.PASSWORD, GridData.FILL_HORIZONTAL);

		this.mSaveDBPWDCheckbox = new Button(content, SWT.CHECK);
		this.mSaveDBPWDCheckbox.setText(GenericDBPlugin.getDefault()
				.getResourceString(
						"GenericDBProfileDetailsWizardPage.persistpassword.label")); //$NON-NLS-1$
		this.mSaveDBPWDCheckbox.setLayoutData(new GridData(GridData.BEGINNING,
				GridData.CENTER, true, false, 2, 1));

		Composite spacer = new Composite(content, SWT.NULL);
		GridData gdata = new GridData(GridData.FILL_HORIZONTAL);
		gdata.horizontalSpan = 2;
		gdata.heightHint = 20;
		spacer.setLayoutData(gdata);

		Label label = new Label(content, SWT.NULL);
		gdata = new GridData(GridData.FILL_HORIZONTAL);
		gdata.horizontalSpan = 2;
		label.setLayoutData(gdata);
		label.setText(GenericDBPlugin.getDefault().getResourceString(
				"GenericDBProfileDetailsWizardPage.optionalProps.label")); //$NON-NLS-1$

		this.mDBConnProps = new DelimitedStringList(content, SWT.NONE);
		gdata = new GridData(GridData.FILL_HORIZONTAL);
		gdata.horizontalSpan = 2;
		this.mDBConnProps.setLayoutData(gdata);

		this.mDBConnProps.addChangeListener(new ChangeListener() {

			public void stateChanged(ChangeEvent arg0) {
				setErrorMessage(null);
				if (PostgreSQLProfilePropertyPage.this.mDBConnProps.getWarning() != null) {
					setErrorMessage(PostgreSQLProfilePropertyPage.this.mDBConnProps
							.getWarning());
				}
			}

		});

		this.combo.addChangeListener(new ChangeListener() {

			public void stateChanged(ChangeEvent arg0) {
				PostgreSQLProfilePropertyPage.this.mDriverInstance = PostgreSQLProfilePropertyPage.this.combo
						.getSelectedDriverInstance();
				setErrorMessage(null);
				if (PostgreSQLProfilePropertyPage.this.combo.getErrorMessage() != null) {
					setErrorMessage(PostgreSQLProfilePropertyPage.this.combo
							.getErrorMessage());
				}
				else
					PostgreSQLProfilePropertyPage.this.mURLText
							.setText(getDriverURL());
				String username = PostgreSQLProfilePropertyPage.this
						.getPropertyFromDriverInstance(IDBDriverDefinitionConstants.USERNAME_PROP_ID);
				if (username == null || username.trim().length() == 0)
					username = new String();
				String oldUsername = PostgreSQLProfilePropertyPage.this.mDBUIDText
						.getText();
				if (oldUsername == null || oldUsername.trim().length() == 0)
					oldUsername = new String();
				if (oldUsername.length() == 0)
					PostgreSQLProfilePropertyPage.this.mDBUIDText
							.setText(username);

				String password = PostgreSQLProfilePropertyPage.this
						.getPropertyFromDriverInstance(IDBDriverDefinitionConstants.PASSWORD_PROP_ID);
				if (password == null || password.trim().length() == 0)
					password = new String();
				String oldPassword = PostgreSQLProfilePropertyPage.this.mDBPWDText
						.getText();
				if (oldPassword == null || oldPassword.trim().length() == 0)
					oldPassword = new String();
				if (oldPassword.length() == 0)
					PostgreSQLProfilePropertyPage.this.mDBPWDText
							.setText(password);
			}

		});

		initControls();

		// return content;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.preference.IPreferencePage#performOk()
	 */
	protected Properties collectProperties() {
		Properties props = new Properties();

		String driverID = EMPTY_STRING;

		if (this.combo.getSelectedDriverInstance() != null) {
			DriverInstance instance = this.combo.getSelectedDriverInstance();
			driverID = instance.getId();
		}

		props.setProperty(ConnectionProfileConstants.PROP_DRIVER_DEFINITION_ID,
				driverID);
		props.setProperty(
				IDBConnectionProfileConstants.CONNECTION_PROPERTIES_PROP_ID,
				this.mDBConnProps.getSelection());	
		props.setProperty(IDBDriverDefinitionConstants.DATABASE_VENDOR_PROP_ID, getPropertyFromDriverInstance(IDBDriverDefinitionConstants.DATABASE_VENDOR_PROP_ID));		
		props.setProperty(IDBDriverDefinitionConstants.DATABASE_VERSION_PROP_ID, getPropertyFromDriverInstance(IDBDriverDefinitionConstants.DATABASE_VERSION_PROP_ID));		
		props.setProperty(IDBDriverDefinitionConstants.DRIVER_CLASS_PROP_ID, getPropertyFromDriverInstance(IDBDriverDefinitionConstants.DRIVER_CLASS_PROP_ID));	
		props.setProperty(IDBDriverDefinitionConstants.DATABASE_NAME_PROP_ID, this.mDatabaseNameText
				.getText());
		props.setProperty(IDBDriverDefinitionConstants.PASSWORD_PROP_ID, this.mDBPWDText
				.getText());
		props.setProperty(IDBDriverDefinitionConstants.USERNAME_PROP_ID, this.mDBUIDText
				.getText());
		props.setProperty(IDBDriverDefinitionConstants.URL_PROP_ID,
				this.mURLText.getText());
		props.setProperty(
				IDBConnectionProfileConstants.SAVE_PASSWORD_PROP_ID, String
						.valueOf(this.mSaveDBPWDCheckbox.getSelection()));

		return props;
	}

	/**
	 * 
	 */
	private void initControls() {
		IConnectionProfile profile = getConnectionProfile();
		String driverID = profile.getBaseProperties().getProperty(
				ConnectionProfileConstants.PROP_DRIVER_DEFINITION_ID);
		if (driverID != null) {
			this.combo.setSelectionToID(driverID);
		}

		String connectionProps = profile.getBaseProperties().getProperty(
				IDBConnectionProfileConstants.CONNECTION_PROPERTIES_PROP_ID);
		if (connectionProps != null) {
			this.mDBConnProps.setSelection(connectionProps);
		}

		String databaseName = profile.getBaseProperties().getProperty(
				IDBDriverDefinitionConstants.DATABASE_NAME_PROP_ID);
		if (databaseName != null) {
			this.mDatabaseNameText.setText(databaseName);
		}
		
		String databasePwd = profile.getBaseProperties().getProperty(
				IDBDriverDefinitionConstants.PASSWORD_PROP_ID);
		if (databasePwd != null) {
			this.mDBPWDText.setText(databasePwd);
		}

		String databaseUid = profile.getBaseProperties().getProperty(
				IDBDriverDefinitionConstants.USERNAME_PROP_ID);
		if (databaseUid != null) {
			this.mDBUIDText.setText(databaseUid);
		}

		String urlText = profile.getBaseProperties().getProperty(
				IDBDriverDefinitionConstants.URL_PROP_ID);
		if (urlText != null) {
			this.mURLText.setText(urlText);
		}

		this.mSaveDBPWDCheckbox.setSelection(Boolean.valueOf(
				profile.getBaseProperties().getProperty(
						IDBConnectionProfileConstants.SAVE_PASSWORD_PROP_ID,
						Boolean.FALSE.toString())).booleanValue());

		setErrorMessage(null);
		if (this.combo.getErrorMessage() != null) {
			setErrorMessage(this.combo.getErrorMessage());
		}
	}

	private String getPropertyFromDriverInstance(String propertyID) {
		String returnStr = new String();
		if (this.mDriverInstance != null
				&& this.mDriverInstance.getProperty(propertyID) != null) {
			returnStr = this.mDriverInstance.getProperty(propertyID);
		}
		return returnStr;
	}

	/**
	 * @param parent
	 * @param labelText
	 * @param ctl
	 * @param style
	 * @param gData
	 * @return
	 */
	private Control createLabelTextPair(Composite parent, String labelText,
			Control ctl, int style, int gData) {
		Label label = new Label(parent, SWT.NULL);
		label.setLayoutData(new GridData());
		label.setText(labelText);

		ctl = new Text(parent, style);
		ctl.setLayoutData(new GridData(gData));

		return ctl;
	}

	/**
	 * @return
	 */
	public String getDriverURL() {
		return this.mDriverInstance
				.getProperty(IDBDriverDefinitionConstants.URL_PROP_ID);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.preference.IPreferencePage#isValid()
	 */
	public boolean isValid() {
		if (getErrorMessage() != null) {
			return false;
		}
		return super.isValid();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.dialogs.DialogPage#setErrorMessage(java.lang.String)
	 */
	public void setErrorMessage(String newMessage) {
		super.setErrorMessage(newMessage);
		isValid();
	}

	public String getDriverCategory() {
		return mDriverCategory;
	}

	
	/**
	 * Sets the driver category that should be used for displaying available
	 * driver defnitions.
	 * 
	 * @param driverCategory
	 */
	public void setDriverCategory(String driverCategory) {
		mDriverCategory = driverCategory;
		if (combo != null) {
			combo.setCategory(mDriverCategory);
		}
	}

}

