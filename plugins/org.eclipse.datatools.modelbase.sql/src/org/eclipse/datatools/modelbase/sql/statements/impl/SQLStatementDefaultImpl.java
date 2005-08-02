/*******************************************************************************
 * Copyright (c) 2001, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.datatools.modelbase.sql.statements.impl;

import java.util.Collection;

import org.eclipse.datatools.modelbase.sql.schema.impl.SQLObjectImpl;
import org.eclipse.datatools.modelbase.sql.statements.SQLStatementDefault;
import org.eclipse.datatools.modelbase.sql.statements.SQLStatementsPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SQL Statement Default</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.statements.impl.SQLStatementDefaultImpl#getSQL <em>SQL</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SQLStatementDefaultImpl extends SQLObjectImpl implements SQLStatementDefault {
	/**
	 * The default value of the '{@link #getSQL() <em>SQL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSQL()
	 * @generated
	 * @ordered
	 */
	protected static final String SQL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSQL() <em>SQL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSQL()
	 * @generated
	 * @ordered
	 */
	protected String sql = SQL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SQLStatementDefaultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SQLStatementsPackage.eINSTANCE.getSQLStatementDefault();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSQL() {
		return sql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSQL(String newSQL) {
		String oldSQL = sql;
		sql = newSQL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQLStatementsPackage.SQL_STATEMENT_DEFAULT__SQL, oldSQL, sql));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case SQLStatementsPackage.SQL_STATEMENT_DEFAULT__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case SQLStatementsPackage.SQL_STATEMENT_DEFAULT__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case SQLStatementsPackage.SQL_STATEMENT_DEFAULT__DEPENDENCIES:
					return ((InternalEList)getDependencies()).basicRemove(otherEnd, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case SQLStatementsPackage.SQL_STATEMENT_DEFAULT__EANNOTATIONS:
				return getEAnnotations();
			case SQLStatementsPackage.SQL_STATEMENT_DEFAULT__NAME:
				return getName();
			case SQLStatementsPackage.SQL_STATEMENT_DEFAULT__DEPENDENCIES:
				return getDependencies();
			case SQLStatementsPackage.SQL_STATEMENT_DEFAULT__DESCRIPTION:
				return getDescription();
			case SQLStatementsPackage.SQL_STATEMENT_DEFAULT__LABEL:
				return getLabel();
			case SQLStatementsPackage.SQL_STATEMENT_DEFAULT__SQL:
				return getSQL();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case SQLStatementsPackage.SQL_STATEMENT_DEFAULT__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case SQLStatementsPackage.SQL_STATEMENT_DEFAULT__NAME:
				setName((String)newValue);
				return;
			case SQLStatementsPackage.SQL_STATEMENT_DEFAULT__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection)newValue);
				return;
			case SQLStatementsPackage.SQL_STATEMENT_DEFAULT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SQLStatementsPackage.SQL_STATEMENT_DEFAULT__LABEL:
				setLabel((String)newValue);
				return;
			case SQLStatementsPackage.SQL_STATEMENT_DEFAULT__SQL:
				setSQL((String)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case SQLStatementsPackage.SQL_STATEMENT_DEFAULT__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case SQLStatementsPackage.SQL_STATEMENT_DEFAULT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SQLStatementsPackage.SQL_STATEMENT_DEFAULT__DEPENDENCIES:
				getDependencies().clear();
				return;
			case SQLStatementsPackage.SQL_STATEMENT_DEFAULT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SQLStatementsPackage.SQL_STATEMENT_DEFAULT__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case SQLStatementsPackage.SQL_STATEMENT_DEFAULT__SQL:
				setSQL(SQL_EDEFAULT);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case SQLStatementsPackage.SQL_STATEMENT_DEFAULT__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case SQLStatementsPackage.SQL_STATEMENT_DEFAULT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SQLStatementsPackage.SQL_STATEMENT_DEFAULT__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case SQLStatementsPackage.SQL_STATEMENT_DEFAULT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SQLStatementsPackage.SQL_STATEMENT_DEFAULT__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case SQLStatementsPackage.SQL_STATEMENT_DEFAULT__SQL:
				return SQL_EDEFAULT == null ? sql != null : !SQL_EDEFAULT.equals(sql);
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (SQL: "); //$NON-NLS-1$
		result.append(sql);
		result.append(')');
		return result.toString();
	}

} //SQLStatementDefaultImpl
