/**
 */
package Gtm.provider;


import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.PassengerConstraint;

import Gtm.TravelerType;
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
 * This is the item provider adapter for a {@link Gtm.PassengerConstraint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PassengerConstraintItemProvider 
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
	public PassengerConstraintItemProvider(AdapterFactory adapterFactory) {
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
			addTravelerTypePropertyDescriptor(object);
			addTextPropertyDescriptor(object);
			addUpperAgeLimitPropertyDescriptor(object);
			addLowerAgeLimitPropertyDescriptor(object);
			addTravelAloneAgeLimitPropertyDescriptor(object);
			addReservationAgeLimitPropertyDescriptor(object);
			addIsAncilliaryPropertyDescriptor(object);
			addPassengerWeightPropertyDescriptor(object);
			addMaxTotalPassengerWeightPropertyDescriptor(object);
			addMinTotalPassengerWeightPropertyDescriptor(object);
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
				 getString("_UI_PassengerConstraint_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerConstraint_id_feature", "_UI_PassengerConstraint_type"),
				 GtmPackage.Literals.PASSENGER_CONSTRAINT__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Traveler Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTravelerTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerConstraint_travelerType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerConstraint_travelerType_feature", "_UI_PassengerConstraint_type"),
				 GtmPackage.Literals.PASSENGER_CONSTRAINT__TRAVELER_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Text feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerConstraint_text_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerConstraint_text_feature", "_UI_PassengerConstraint_type"),
				 GtmPackage.Literals.PASSENGER_CONSTRAINT__TEXT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Upper Age Limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpperAgeLimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerConstraint_upperAgeLimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerConstraint_upperAgeLimit_feature", "_UI_PassengerConstraint_type"),
				 GtmPackage.Literals.PASSENGER_CONSTRAINT__UPPER_AGE_LIMIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lower Age Limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLowerAgeLimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerConstraint_lowerAgeLimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerConstraint_lowerAgeLimit_feature", "_UI_PassengerConstraint_type"),
				 GtmPackage.Literals.PASSENGER_CONSTRAINT__LOWER_AGE_LIMIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Travel Alone Age Limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTravelAloneAgeLimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerConstraint_travelAloneAgeLimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerConstraint_travelAloneAgeLimit_feature", "_UI_PassengerConstraint_type"),
				 GtmPackage.Literals.PASSENGER_CONSTRAINT__TRAVEL_ALONE_AGE_LIMIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reservation Age Limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReservationAgeLimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerConstraint_reservationAgeLimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerConstraint_reservationAgeLimit_feature", "_UI_PassengerConstraint_type"),
				 GtmPackage.Literals.PASSENGER_CONSTRAINT__RESERVATION_AGE_LIMIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Ancilliary feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsAncilliaryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerConstraint_isAncilliary_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerConstraint_isAncilliary_feature", "_UI_PassengerConstraint_type"),
				 GtmPackage.Literals.PASSENGER_CONSTRAINT__IS_ANCILLIARY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passenger Weight feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassengerWeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerConstraint_passengerWeight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerConstraint_passengerWeight_feature", "_UI_PassengerConstraint_type"),
				 GtmPackage.Literals.PASSENGER_CONSTRAINT__PASSENGER_WEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Total Passenger Weight feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxTotalPassengerWeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerConstraint_maxTotalPassengerWeight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerConstraint_maxTotalPassengerWeight_feature", "_UI_PassengerConstraint_type"),
				 GtmPackage.Literals.PASSENGER_CONSTRAINT__MAX_TOTAL_PASSENGER_WEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Total Passenger Weight feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinTotalPassengerWeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerConstraint_minTotalPassengerWeight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerConstraint_minTotalPassengerWeight_feature", "_UI_PassengerConstraint_type"),
				 GtmPackage.Literals.PASSENGER_CONSTRAINT__MIN_TOTAL_PASSENGER_WEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
			childrenFeatures.add(GtmPackage.Literals.PASSENGER_CONSTRAINT__INCLUDED_FREE_PASSENGERS);
			childrenFeatures.add(GtmPackage.Literals.PASSENGER_CONSTRAINT__EXCLUDED_PASSENGER_COMBINATIONS);
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
	 * This returns PassengerConstraint.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PassengerConstraint"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		TravelerType labelValue = ((PassengerConstraint)object).getTravelerType();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_PassengerConstraint_type") :
			getString("_UI_PassengerConstraint_type") + " " + label;
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

		switch (notification.getFeatureID(PassengerConstraint.class)) {
			case GtmPackage.PASSENGER_CONSTRAINT__ID:
			case GtmPackage.PASSENGER_CONSTRAINT__TRAVELER_TYPE:
			case GtmPackage.PASSENGER_CONSTRAINT__UPPER_AGE_LIMIT:
			case GtmPackage.PASSENGER_CONSTRAINT__LOWER_AGE_LIMIT:
			case GtmPackage.PASSENGER_CONSTRAINT__TRAVEL_ALONE_AGE_LIMIT:
			case GtmPackage.PASSENGER_CONSTRAINT__RESERVATION_AGE_LIMIT:
			case GtmPackage.PASSENGER_CONSTRAINT__IS_ANCILLIARY:
			case GtmPackage.PASSENGER_CONSTRAINT__PASSENGER_WEIGHT:
			case GtmPackage.PASSENGER_CONSTRAINT__MAX_TOTAL_PASSENGER_WEIGHT:
			case GtmPackage.PASSENGER_CONSTRAINT__MIN_TOTAL_PASSENGER_WEIGHT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GtmPackage.PASSENGER_CONSTRAINT__INCLUDED_FREE_PASSENGERS:
			case GtmPackage.PASSENGER_CONSTRAINT__EXCLUDED_PASSENGER_COMBINATIONS:
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
				(GtmPackage.Literals.PASSENGER_CONSTRAINT__INCLUDED_FREE_PASSENGERS,
				 GtmFactory.eINSTANCE.createIncludedFreePassengerLimit()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.PASSENGER_CONSTRAINT__EXCLUDED_PASSENGER_COMBINATIONS,
				 GtmFactory.eINSTANCE.createPassengerCombinationConstraint()));
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
