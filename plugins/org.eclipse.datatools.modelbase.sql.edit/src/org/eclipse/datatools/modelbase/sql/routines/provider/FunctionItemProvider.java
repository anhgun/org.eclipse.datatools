/**
 * <copyright>
 * </copyright>
 *
 * $Id: FunctionItemProvider.java,v 1.2 2005/06/15 18:16:15 ledunnel Exp $
 */
package org.eclipse.datatools.modelbase.sql.routines.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.datatools.modelbase.sql.routines.Function;
import org.eclipse.datatools.modelbase.sql.routines.SQLRoutinesFactory;
import org.eclipse.datatools.modelbase.sql.routines.SQLRoutinesPackage;
import org.eclipse.datatools.modelbase.sql.schema.provider.SqlmodelEditPlugin;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;


/**
 * This is the item provider adpater for a {@link org.eclipse.datatools.modelbase.sql.routines.Function} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionItemProvider
	extends RoutineItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNullCallPropertyDescriptor(object);
			addStaticPropertyDescriptor(object);
			addTransformGroupPropertyDescriptor(object);
			addTypePreservingPropertyDescriptor(object);
			addMutatorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Null Call feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNullCallPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Function_nullCall_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Function_nullCall_feature", "_UI_Function_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 SQLRoutinesPackage.eINSTANCE.getFunction_NullCall(),
				 true,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE));
	}

	/**
	 * This adds a property descriptor for the Static feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStaticPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Function_static_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Function_static_feature", "_UI_Function_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 SQLRoutinesPackage.eINSTANCE.getFunction_Static(),
				 true,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE));
	}

	/**
	 * This adds a property descriptor for the Transform Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransformGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Function_transformGroup_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Function_transformGroup_feature", "_UI_Function_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 SQLRoutinesPackage.eINSTANCE.getFunction_TransformGroup(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE));
	}

	/**
	 * This adds a property descriptor for the Type Preserving feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePreservingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Function_typePreserving_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Function_typePreserving_feature", "_UI_Function_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 SQLRoutinesPackage.eINSTANCE.getFunction_TypePreserving(),
				 true,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE));
	}

	/**
	 * This adds a property descriptor for the Mutator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMutatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Function_mutator_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Function_mutator_feature", "_UI_Function_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 SQLRoutinesPackage.eINSTANCE.getFunction_Mutator(),
				 true,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SQLRoutinesPackage.eINSTANCE.getFunction_ReturnTable());
			childrenFeatures.add(SQLRoutinesPackage.eINSTANCE.getFunction_ReturnScaler());
			childrenFeatures.add(SQLRoutinesPackage.eINSTANCE.getFunction_ReturnCast());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Function.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/Function"); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((Function)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Function_type") : //$NON-NLS-1$
			getString("_UI_Function_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Function.class)) {
			case SQLRoutinesPackage.FUNCTION__NULL_CALL:
			case SQLRoutinesPackage.FUNCTION__STATIC:
			case SQLRoutinesPackage.FUNCTION__TRANSFORM_GROUP:
			case SQLRoutinesPackage.FUNCTION__TYPE_PRESERVING:
			case SQLRoutinesPackage.FUNCTION__MUTATOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SQLRoutinesPackage.FUNCTION__RETURN_TABLE:
			case SQLRoutinesPackage.FUNCTION__RETURN_SCALER:
			case SQLRoutinesPackage.FUNCTION__RETURN_CAST:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds to the collection of {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing all of the children that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SQLRoutinesPackage.eINSTANCE.getFunction_ReturnTable(),
				 SQLRoutinesFactory.eINSTANCE.createRoutineResultTable()));

		newChildDescriptors.add
			(createChildParameter
				(SQLRoutinesPackage.eINSTANCE.getFunction_ReturnScaler(),
				 SQLRoutinesFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(SQLRoutinesPackage.eINSTANCE.getFunction_ReturnCast(),
				 SQLRoutinesFactory.eINSTANCE.createParameter()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreateChildText(Object owner, Object feature, Object child, Collection selection) {
		boolean qualify =
			feature == SQLRoutinesPackage.eINSTANCE.getRoutine_Parameters() ||
			feature == SQLRoutinesPackage.eINSTANCE.getFunction_ReturnScaler() ||
			feature == SQLRoutinesPackage.eINSTANCE.getFunction_ReturnCast();
		return getString(
			qualify ? "_UI_CreateChild_text2" : "_UI_CreateChild_text", //$NON-NLS-1$ //$NON-NLS-2$
			new Object[] { getTypeText(child), getFeatureText(feature), getTypeText(owner) });
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return SqlmodelEditPlugin.INSTANCE;
	}

}
