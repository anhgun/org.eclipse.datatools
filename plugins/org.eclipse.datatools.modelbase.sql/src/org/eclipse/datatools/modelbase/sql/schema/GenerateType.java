/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenerateType.java,v 1.4 2005/06/15 18:15:25 ledunnel Exp $
 */
package org.eclipse.datatools.modelbase.sql.schema;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Generate Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 4.14.4 Identity columns
 * 
 * The columns of a base table BT can optionally include not more than one identity column. The declared type of an identity column is either an exact numeric type with scale 0 (zero), INTEGER for example, or a distinct type whose source type is an exact numeric type with scale 0 (zero). An identity column has a start value, an increment, a maximum value, a minimum value, and a cycle option.
 * 
 * 
 * An identity column is associated with an internal sequence generator SG. Let IC be the identity column of BT. When a row R is presented for insertion into BT, if R does not contain a column corresponding to IC, then the value V for IC in the row inserted into BT is obtained by applying the General Rules of Subclause 9.21, "Generation of the next value of a sequence generator", to SG. The definition of an identity column may specify GENERATED ALWAYS or GENERATED BY DEFAULT.
 * <!-- end-model-doc -->
 * @see org.eclipse.datatools.modelbase.sql.schema.SQLSchemaPackage#getGenerateType()
 * @model
 * @generated
 */
public final class GenerateType extends AbstractEnumerator {
	/**
	 * The '<em><b>DEFAULT GENERATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_GENERATED_LITERAL
	 * @model 
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_GENERATED = 0;

	/**
	 * The '<em><b>ALWAYS GENERATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALWAYS_GENERATED_LITERAL
	 * @model 
	 * @generated
	 * @ordered
	 */
	public static final int ALWAYS_GENERATED = 1;

	/**
	 * The '<em><b>DEFAULT GENERATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEFAULT GENERATED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_GENERATED
	 * @generated
	 * @ordered
	 */
	public static final GenerateType DEFAULT_GENERATED_LITERAL = new GenerateType(DEFAULT_GENERATED, "DEFAULT_GENERATED"); //$NON-NLS-1$

	/**
	 * The '<em><b>ALWAYS GENERATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALWAYS GENERATED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALWAYS_GENERATED
	 * @generated
	 * @ordered
	 */
	public static final GenerateType ALWAYS_GENERATED_LITERAL = new GenerateType(ALWAYS_GENERATED, "ALWAYS_GENERATED"); //$NON-NLS-1$

	/**
	 * An array of all the '<em><b>Generate Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GenerateType[] VALUES_ARRAY =
		new GenerateType[] {
			DEFAULT_GENERATED_LITERAL,
			ALWAYS_GENERATED_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Generate Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Generate Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenerateType get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GenerateType result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Generate Type</b></em>' literal with the specified value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenerateType get(int value) {
		switch (value) {
			case DEFAULT_GENERATED: return DEFAULT_GENERATED_LITERAL;
			case ALWAYS_GENERATED: return ALWAYS_GENERATED_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private GenerateType(int value, String name) {
		super(value, name);
	}

} //GenerateType
