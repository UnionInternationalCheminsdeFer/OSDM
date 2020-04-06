/**
 */
package Gtm.provider;


import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.TravelValidityConstraint;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link Gtm.TravelValidityConstraint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TravelValidityConstraintItemProvider 
	extends ItemProviderAdapter
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
	public TravelValidityConstraintItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdPropertyDescriptor(object);
			addDataDescriptionPropertyDescriptor(object);
			addValidDaysPropertyDescriptor(object);
			addTravelDaysPropertyDescriptor(object);
			addRangePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TravelValidityConstraint_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TravelValidityConstraint_id_feature", "_UI_TravelValidityConstraint_type"),
				 GtmPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TravelValidityConstraint_dataDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TravelValidityConstraint_dataDescription_feature", "_UI_TravelValidityConstraint_type"),
				 GtmPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT__DATA_DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Valid Days feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidDaysPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TravelValidityConstraint_validDays_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TravelValidityConstraint_validDays_feature", "_UI_TravelValidityConstraint_type"),
				 GtmPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT__VALID_DAYS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Travel Days feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTravelDaysPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TravelValidityConstraint_travelDays_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TravelValidityConstraint_travelDays_feature", "_UI_TravelValidityConstraint_type"),
				 GtmPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT__TRAVEL_DAYS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Range feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRangePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TravelValidityConstraint_range_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TravelValidityConstraint_range_feature", "_UI_TravelValidityConstraint_type"),
				 GtmPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT__RANGE,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(GtmPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT__RANGE);
			childrenFeatures.add(GtmPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT__RETURN_CONSTRAINT);
			childrenFeatures.add(GtmPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT__EXCLUDED_TIME_RANGE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns TravelValidityConstraint.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TravelValidityConstraint"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TravelValidityConstraint)object).getDataDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_TravelValidityConstraint_type") :
			getString("_UI_TravelValidityConstraint_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TravelValidityConstraint.class)) {
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__ID:
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__DATA_DESCRIPTION:
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRAVEL_DAYS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RANGE:
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RETURN_CONSTRAINT:
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__EXCLUDED_TIME_RANGE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT__RANGE,
				 GtmFactory.eINSTANCE.createValidityRange()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT__RETURN_CONSTRAINT,
				 GtmFactory.eINSTANCE.createReturnValidityConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT__EXCLUDED_TIME_RANGE,
				 GtmFactory.eINSTANCE.createExcludedTimeRange()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
