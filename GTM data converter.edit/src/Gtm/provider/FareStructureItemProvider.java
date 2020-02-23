/**
 */
package Gtm.provider;


import Gtm.FareStructure;
import Gtm.GtmFactory;
import Gtm.GtmPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link Gtm.FareStructure} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FareStructureItemProvider 
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
	public FareStructureItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(GtmPackage.Literals.FARE_STRUCTURE__SERVICE_CLASS_DEFINITIONS);
			childrenFeatures.add(GtmPackage.Literals.FARE_STRUCTURE__SERVICE_LEVEL_DEFINITIONS);
			childrenFeatures.add(GtmPackage.Literals.FARE_STRUCTURE__STATION_NAMES);
			childrenFeatures.add(GtmPackage.Literals.FARE_STRUCTURE__FARE_STATION_SET_DEFINITIONS);
			childrenFeatures.add(GtmPackage.Literals.FARE_STRUCTURE__CALENDARS);
			childrenFeatures.add(GtmPackage.Literals.FARE_STRUCTURE__TEXTS);
			childrenFeatures.add(GtmPackage.Literals.FARE_STRUCTURE__REDUCTION_CARDS);
			childrenFeatures.add(GtmPackage.Literals.FARE_STRUCTURE__FARE_ELEMENTS);
			childrenFeatures.add(GtmPackage.Literals.FARE_STRUCTURE__COMBINATION_CONSTRAINTS);
			childrenFeatures.add(GtmPackage.Literals.FARE_STRUCTURE__SALES_AVAILABILITY_CONSTRAINTS);
			childrenFeatures.add(GtmPackage.Literals.FARE_STRUCTURE__TRAVEL_VALIDITY_CONSTRAINTS);
			childrenFeatures.add(GtmPackage.Literals.FARE_STRUCTURE__REGIONAL_CONSTRAINTS);
			childrenFeatures.add(GtmPackage.Literals.FARE_STRUCTURE__CONNECTION_POINTS);
			childrenFeatures.add(GtmPackage.Literals.FARE_STRUCTURE__CARRIER_CONSTRAINTS);
			childrenFeatures.add(GtmPackage.Literals.FARE_STRUCTURE__SERVICE_CONSTRAINTS);
			childrenFeatures.add(GtmPackage.Literals.FARE_STRUCTURE__PASSENGER_CONSTRAINTS);
			childrenFeatures.add(GtmPackage.Literals.FARE_STRUCTURE__REDUCTION_CONSTRAINTS);
			childrenFeatures.add(GtmPackage.Literals.FARE_STRUCTURE__PERSONAL_DATA_CONSTRAINTS);
			childrenFeatures.add(GtmPackage.Literals.FARE_STRUCTURE__AFTER_SALES_RULES);
			childrenFeatures.add(GtmPackage.Literals.FARE_STRUCTURE__PRICES);
			childrenFeatures.add(GtmPackage.Literals.FARE_STRUCTURE__FULFILLMENT_CONSTRAINTS);
			childrenFeatures.add(GtmPackage.Literals.FARE_STRUCTURE__RESERVATION_PARAMETERS);
			childrenFeatures.add(GtmPackage.Literals.FARE_STRUCTURE__SUPPORTED_ONLINE_SERVICES);
			childrenFeatures.add(GtmPackage.Literals.FARE_STRUCTURE__FARE_RESOURCE_LOCATIONS);
			childrenFeatures.add(GtmPackage.Literals.FARE_STRUCTURE__ZONE_DEFINITIONS);
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
	 * This returns FareStructure.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FareStructure"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_FareStructure_type");
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

		switch (notification.getFeatureID(FareStructure.class)) {
			case GtmPackage.FARE_STRUCTURE__SERVICE_CLASS_DEFINITIONS:
			case GtmPackage.FARE_STRUCTURE__SERVICE_LEVEL_DEFINITIONS:
			case GtmPackage.FARE_STRUCTURE__STATION_NAMES:
			case GtmPackage.FARE_STRUCTURE__FARE_STATION_SET_DEFINITIONS:
			case GtmPackage.FARE_STRUCTURE__CALENDARS:
			case GtmPackage.FARE_STRUCTURE__TEXTS:
			case GtmPackage.FARE_STRUCTURE__REDUCTION_CARDS:
			case GtmPackage.FARE_STRUCTURE__FARE_ELEMENTS:
			case GtmPackage.FARE_STRUCTURE__COMBINATION_CONSTRAINTS:
			case GtmPackage.FARE_STRUCTURE__SALES_AVAILABILITY_CONSTRAINTS:
			case GtmPackage.FARE_STRUCTURE__TRAVEL_VALIDITY_CONSTRAINTS:
			case GtmPackage.FARE_STRUCTURE__REGIONAL_CONSTRAINTS:
			case GtmPackage.FARE_STRUCTURE__CONNECTION_POINTS:
			case GtmPackage.FARE_STRUCTURE__CARRIER_CONSTRAINTS:
			case GtmPackage.FARE_STRUCTURE__SERVICE_CONSTRAINTS:
			case GtmPackage.FARE_STRUCTURE__PASSENGER_CONSTRAINTS:
			case GtmPackage.FARE_STRUCTURE__REDUCTION_CONSTRAINTS:
			case GtmPackage.FARE_STRUCTURE__PERSONAL_DATA_CONSTRAINTS:
			case GtmPackage.FARE_STRUCTURE__AFTER_SALES_RULES:
			case GtmPackage.FARE_STRUCTURE__PRICES:
			case GtmPackage.FARE_STRUCTURE__FULFILLMENT_CONSTRAINTS:
			case GtmPackage.FARE_STRUCTURE__RESERVATION_PARAMETERS:
			case GtmPackage.FARE_STRUCTURE__SUPPORTED_ONLINE_SERVICES:
			case GtmPackage.FARE_STRUCTURE__FARE_RESOURCE_LOCATIONS:
			case GtmPackage.FARE_STRUCTURE__ZONE_DEFINITIONS:
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
				(GtmPackage.Literals.FARE_STRUCTURE__SERVICE_CLASS_DEFINITIONS,
				 GtmFactory.eINSTANCE.createServiceClassDefinitions()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.FARE_STRUCTURE__SERVICE_LEVEL_DEFINITIONS,
				 GtmFactory.eINSTANCE.createServiceLevelDefinitions()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.FARE_STRUCTURE__STATION_NAMES,
				 GtmFactory.eINSTANCE.createStationNames()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.FARE_STRUCTURE__FARE_STATION_SET_DEFINITIONS,
				 GtmFactory.eINSTANCE.createFareStationSetDefinitions()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.FARE_STRUCTURE__CALENDARS,
				 GtmFactory.eINSTANCE.createCalendars()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.FARE_STRUCTURE__TEXTS,
				 GtmFactory.eINSTANCE.createTexts()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.FARE_STRUCTURE__REDUCTION_CARDS,
				 GtmFactory.eINSTANCE.createReductionCards()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.FARE_STRUCTURE__FARE_ELEMENTS,
				 GtmFactory.eINSTANCE.createFareElements()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.FARE_STRUCTURE__COMBINATION_CONSTRAINTS,
				 GtmFactory.eINSTANCE.createCombinationConstraints()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.FARE_STRUCTURE__SALES_AVAILABILITY_CONSTRAINTS,
				 GtmFactory.eINSTANCE.createSalesAvailabilityConstraints()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.FARE_STRUCTURE__TRAVEL_VALIDITY_CONSTRAINTS,
				 GtmFactory.eINSTANCE.createTravelValidityConstraints()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.FARE_STRUCTURE__REGIONAL_CONSTRAINTS,
				 GtmFactory.eINSTANCE.createRegionalConstraints()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.FARE_STRUCTURE__CONNECTION_POINTS,
				 GtmFactory.eINSTANCE.createConnectionPoints()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.FARE_STRUCTURE__CARRIER_CONSTRAINTS,
				 GtmFactory.eINSTANCE.createCarrierConstraints()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.FARE_STRUCTURE__SERVICE_CONSTRAINTS,
				 GtmFactory.eINSTANCE.createServiceConstraints()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.FARE_STRUCTURE__PASSENGER_CONSTRAINTS,
				 GtmFactory.eINSTANCE.createPassengerConstraints()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.FARE_STRUCTURE__REDUCTION_CONSTRAINTS,
				 GtmFactory.eINSTANCE.createReductionConstraints()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.FARE_STRUCTURE__PERSONAL_DATA_CONSTRAINTS,
				 GtmFactory.eINSTANCE.createPersonalDataConstraints()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.FARE_STRUCTURE__AFTER_SALES_RULES,
				 GtmFactory.eINSTANCE.createAfterSalesRules()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.FARE_STRUCTURE__PRICES,
				 GtmFactory.eINSTANCE.createPrices()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.FARE_STRUCTURE__FULFILLMENT_CONSTRAINTS,
				 GtmFactory.eINSTANCE.createFulfillmentConstraints()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.FARE_STRUCTURE__RESERVATION_PARAMETERS,
				 GtmFactory.eINSTANCE.createReservationParameters()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.FARE_STRUCTURE__SUPPORTED_ONLINE_SERVICES,
				 GtmFactory.eINSTANCE.createSupportedOnlineServices()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.FARE_STRUCTURE__FARE_RESOURCE_LOCATIONS,
				 GtmFactory.eINSTANCE.createFareResourceLocations()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.FARE_STRUCTURE__ZONE_DEFINITIONS,
				 GtmFactory.eINSTANCE.createZoneDefinitions()));
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
