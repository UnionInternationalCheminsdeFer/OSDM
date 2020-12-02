/**
 */
package Gtm.provider;


import Gtm.DataSource;
import Gtm.FareElement;
import Gtm.GtmFactory;
import Gtm.GtmPackage;

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
 * This is the item provider adapter for a {@link Gtm.FareElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FareElementItemProvider 
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
	public FareElementItemProvider(AdapterFactory adapterFactory) {
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
			addTypePropertyDescriptor(object);
			addDataDescriptionPropertyDescriptor(object);
			addTextPropertyDescriptor(object);
			addPricePropertyDescriptor(object);
			addRegionalConstraintPropertyDescriptor(object);
			addServiceConstraintPropertyDescriptor(object);
			addCarrierConstraintPropertyDescriptor(object);
			addServiceClassPropertyDescriptor(object);
			addServiceLevelPropertyDescriptor(object);
			addSalesAvailabilityPropertyDescriptor(object);
			addTravelValidityPropertyDescriptor(object);
			addCombinationConstraintPropertyDescriptor(object);
			addFareDetailDescriptionPropertyDescriptor(object);
			addPersonalDataConstraintPropertyDescriptor(object);
			addReservationParameterPropertyDescriptor(object);
			addReductionConstraintPropertyDescriptor(object);
			addFulfillmentConstraintPropertyDescriptor(object);
			addPassengerConstraintPropertyDescriptor(object);
			addRegulatoryConditionsPropertyDescriptor(object);
			addAfterSalesRulePropertyDescriptor(object);
			addDataSourcePropertyDescriptor(object);
			addLegacyConversionPropertyDescriptor(object);
			addIndividualContractsPropertyDescriptor(object);
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
				 getString("_UI_FareElement_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareElement_id_feature", "_UI_FareElement_type"),
				 GtmPackage.Literals.FARE_ELEMENT__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareElement_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareElement_type_feature", "_UI_FareElement_type"),
				 GtmPackage.Literals.FARE_ELEMENT__TYPE,
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
				 getString("_UI_FareElement_dataDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareElement_dataDescription_feature", "_UI_FareElement_type"),
				 GtmPackage.Literals.FARE_ELEMENT__DATA_DESCRIPTION,
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
				 getString("_UI_FareElement_text_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareElement_text_feature", "_UI_FareElement_type"),
				 GtmPackage.Literals.FARE_ELEMENT__TEXT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Price feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPricePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareElement_price_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareElement_price_feature", "_UI_FareElement_type"),
				 GtmPackage.Literals.FARE_ELEMENT__PRICE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Regional Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRegionalConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareElement_regionalConstraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareElement_regionalConstraint_feature", "_UI_FareElement_type"),
				 GtmPackage.Literals.FARE_ELEMENT__REGIONAL_CONSTRAINT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareElement_serviceConstraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareElement_serviceConstraint_feature", "_UI_FareElement_type"),
				 GtmPackage.Literals.FARE_ELEMENT__SERVICE_CONSTRAINT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Carrier Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCarrierConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareElement_carrierConstraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareElement_carrierConstraint_feature", "_UI_FareElement_type"),
				 GtmPackage.Literals.FARE_ELEMENT__CARRIER_CONSTRAINT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareElement_serviceClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareElement_serviceClass_feature", "_UI_FareElement_type"),
				 GtmPackage.Literals.FARE_ELEMENT__SERVICE_CLASS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareElement_serviceLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareElement_serviceLevel_feature", "_UI_FareElement_type"),
				 GtmPackage.Literals.FARE_ELEMENT__SERVICE_LEVEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sales Availability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSalesAvailabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareElement_salesAvailability_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareElement_salesAvailability_feature", "_UI_FareElement_type"),
				 GtmPackage.Literals.FARE_ELEMENT__SALES_AVAILABILITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Travel Validity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTravelValidityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareElement_travelValidity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareElement_travelValidity_feature", "_UI_FareElement_type"),
				 GtmPackage.Literals.FARE_ELEMENT__TRAVEL_VALIDITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Combination Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCombinationConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareElement_combinationConstraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareElement_combinationConstraint_feature", "_UI_FareElement_type"),
				 GtmPackage.Literals.FARE_ELEMENT__COMBINATION_CONSTRAINT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fare Detail Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFareDetailDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareElement_fareDetailDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareElement_fareDetailDescription_feature", "_UI_FareElement_type"),
				 GtmPackage.Literals.FARE_ELEMENT__FARE_DETAIL_DESCRIPTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Personal Data Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPersonalDataConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareElement_personalDataConstraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareElement_personalDataConstraint_feature", "_UI_FareElement_type"),
				 GtmPackage.Literals.FARE_ELEMENT__PERSONAL_DATA_CONSTRAINT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reservation Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReservationParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareElement_reservationParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareElement_reservationParameter_feature", "_UI_FareElement_type"),
				 GtmPackage.Literals.FARE_ELEMENT__RESERVATION_PARAMETER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reduction Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReductionConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareElement_reductionConstraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareElement_reductionConstraint_feature", "_UI_FareElement_type"),
				 GtmPackage.Literals.FARE_ELEMENT__REDUCTION_CONSTRAINT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fulfillment Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFulfillmentConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareElement_fulfillmentConstraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareElement_fulfillmentConstraint_feature", "_UI_FareElement_type"),
				 GtmPackage.Literals.FARE_ELEMENT__FULFILLMENT_CONSTRAINT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passenger Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassengerConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareElement_passengerConstraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareElement_passengerConstraint_feature", "_UI_FareElement_type"),
				 GtmPackage.Literals.FARE_ELEMENT__PASSENGER_CONSTRAINT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Regulatory Conditions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRegulatoryConditionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareElement_regulatoryConditions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareElement_regulatoryConditions_feature", "_UI_FareElement_type"),
				 GtmPackage.Literals.FARE_ELEMENT__REGULATORY_CONDITIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the After Sales Rule feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAfterSalesRulePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareElement_afterSalesRule_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareElement_afterSalesRule_feature", "_UI_FareElement_type"),
				 GtmPackage.Literals.FARE_ELEMENT__AFTER_SALES_RULE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareElement_dataSource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareElement_dataSource_feature", "_UI_FareElement_type"),
				 GtmPackage.Literals.FARE_ELEMENT__DATA_SOURCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Legacy Conversion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLegacyConversionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareElement_legacyConversion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareElement_legacyConversion_feature", "_UI_FareElement_type"),
				 GtmPackage.Literals.FARE_ELEMENT__LEGACY_CONVERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}



	/**
	 * This adds a property descriptor for the Individual Contracts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIndividualContractsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareElement_individualContracts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareElement_individualContracts_feature", "_UI_FareElement_type"),
				 GtmPackage.Literals.FARE_ELEMENT__INDIVIDUAL_CONTRACTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(GtmPackage.Literals.FARE_ELEMENT__LEGACY_ACCOUNTING_IDENTIFIER);
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
	 * This returns FareElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FareElement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		
		String description = ((FareElement)object).getDataDescription();
		String id = ((FareElement)object).getId();
		String label = null;
		
		if ( ((FareElement)object).getDataSource() == DataSource.CONVERTED){
			label = description;
		} else {
			label = id;
		}

		
		return label == null || label.length() == 0 ?
			getString("_UI_FareElement_type") :
			getString("_UI_FareElement_type") + " " + label;
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

		switch (notification.getFeatureID(FareElement.class)) {
			case GtmPackage.FARE_ELEMENT__ID:
			case GtmPackage.FARE_ELEMENT__TYPE:
			case GtmPackage.FARE_ELEMENT__DATA_DESCRIPTION:
			case GtmPackage.FARE_ELEMENT__REGULATORY_CONDITIONS:
			case GtmPackage.FARE_ELEMENT__DATA_SOURCE:
			case GtmPackage.FARE_ELEMENT__LEGACY_CONVERSION:
			case GtmPackage.FARE_ELEMENT__INDIVIDUAL_CONTRACTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GtmPackage.FARE_ELEMENT__LEGACY_ACCOUNTING_IDENTIFIER:
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
				(GtmPackage.Literals.FARE_ELEMENT__LEGACY_ACCOUNTING_IDENTIFIER,
				 GtmFactory.eINSTANCE.createLegacyAccountingIdentifier()));
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
