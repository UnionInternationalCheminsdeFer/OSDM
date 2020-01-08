/**
 */
package Gtm.impl;

import Gtm.AfterSalesRule;
import Gtm.Calendar;
import Gtm.CarrierConstraint;
import Gtm.CombinationConstraint;
import Gtm.ConnectionPoint;
import Gtm.FareElement;
import Gtm.FareResourceLocation;
import Gtm.FareStructure;
import Gtm.FulfillmentConstraint;
import Gtm.GtmPackage;
import Gtm.OnlineServiceType;
import Gtm.PassengerConstraint;
import Gtm.PersonalDataConstraint;
import Gtm.Price;
import Gtm.ReductionCard;
import Gtm.ReductionConstraint;
import Gtm.RegionalConstraint;
import Gtm.ReservationParameter;
import Gtm.SalesAvailabilityConstraint;
import Gtm.ServiceClass;
import Gtm.ServiceConstraint;
import Gtm.ServiceLevel;
import Gtm.Text;
import Gtm.TravelValidityConstraint;
import Gtm.ZoneDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fare Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.FareStructureImpl#getFareElements <em>Fare Elements</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getAfterSalesRules <em>After Sales Rules</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getCalendars <em>Calendars</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getServiceClassDefinitions <em>Service Class Definitions</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getPrices <em>Prices</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getRegionalConstraints <em>Regional Constraints</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getTexts <em>Texts</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getServiceLevelDefinitions <em>Service Level Definitions</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getReservationParameters <em>Reservation Parameters</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getServiceConstraints <em>Service Constraints</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getCarrierConstraints <em>Carrier Constraints</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getReductionCards <em>Reduction Cards</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getSalesAvailabilityConstraints <em>Sales Availability Constraints</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getTravelValidityConstraints <em>Travel Validity Constraints</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getCombinationConstraints <em>Combination Constraints</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getPassengerConstraints <em>Passenger Constraints</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getPersonalDataConstraints <em>Personal Data Constraints</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getReductionConstraints <em>Reduction Constraints</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getZoneDefinitions <em>Zone Definitions</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getSupportedOnlineServices <em>Supported Online Services</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getFulfillmentConstraint <em>Fulfillment Constraint</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getFareResourceLocations <em>Fare Resource Locations</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getConnectionPoints <em>Connection Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FareStructureImpl extends MinimalEObjectImpl.Container implements FareStructure {
	/**
	 * The cached value of the '{@link #getFareElements() <em>Fare Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFareElements()
	 * @generated
	 * @ordered
	 */
	protected EList<FareElement> fareElements;

	/**
	 * The cached value of the '{@link #getAfterSalesRules() <em>After Sales Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterSalesRules()
	 * @generated
	 * @ordered
	 */
	protected EList<AfterSalesRule> afterSalesRules;

	/**
	 * The cached value of the '{@link #getCalendars() <em>Calendars</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendars()
	 * @generated
	 * @ordered
	 */
	protected EList<Calendar> calendars;

	/**
	 * The cached value of the '{@link #getServiceClassDefinitions() <em>Service Class Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceClassDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceClass> serviceClassDefinitions;

	/**
	 * The cached value of the '{@link #getPrices() <em>Prices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrices()
	 * @generated
	 * @ordered
	 */
	protected EList<Price> prices;

	/**
	 * The cached value of the '{@link #getRegionalConstraints() <em>Regional Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionalConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<RegionalConstraint> regionalConstraints;

	/**
	 * The cached value of the '{@link #getTexts() <em>Texts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexts()
	 * @generated
	 * @ordered
	 */
	protected EList<Text> texts;

	/**
	 * The cached value of the '{@link #getServiceLevelDefinitions() <em>Service Level Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLevelDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceLevel> serviceLevelDefinitions;

	/**
	 * The cached value of the '{@link #getReservationParameters() <em>Reservation Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservationParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ReservationParameter> reservationParameters;

	/**
	 * The cached value of the '{@link #getServiceConstraints() <em>Service Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceConstraint> serviceConstraints;

	/**
	 * The cached value of the '{@link #getCarrierConstraints() <em>Carrier Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<CarrierConstraint> carrierConstraints;

	/**
	 * The cached value of the '{@link #getReductionCards() <em>Reduction Cards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReductionCards()
	 * @generated
	 * @ordered
	 */
	protected EList<ReductionCard> reductionCards;

	/**
	 * The cached value of the '{@link #getSalesAvailabilityConstraints() <em>Sales Availability Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesAvailabilityConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<SalesAvailabilityConstraint> salesAvailabilityConstraints;

	/**
	 * The cached value of the '{@link #getTravelValidityConstraints() <em>Travel Validity Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelValidityConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<TravelValidityConstraint> travelValidityConstraints;

	/**
	 * The cached value of the '{@link #getCombinationConstraints() <em>Combination Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombinationConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<CombinationConstraint> combinationConstraints;

	/**
	 * The cached value of the '{@link #getPassengerConstraints() <em>Passenger Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<PassengerConstraint> passengerConstraints;

	/**
	 * The cached value of the '{@link #getPersonalDataConstraints() <em>Personal Data Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonalDataConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonalDataConstraint> personalDataConstraints;

	/**
	 * The cached value of the '{@link #getReductionConstraints() <em>Reduction Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReductionConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<ReductionConstraint> reductionConstraints;

	/**
	 * The cached value of the '{@link #getZoneDefinitions() <em>Zone Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoneDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ZoneDefinition> zoneDefinitions;

	/**
	 * The cached value of the '{@link #getSupportedOnlineServices() <em>Supported Online Services</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedOnlineServices()
	 * @generated
	 * @ordered
	 */
	protected EList<OnlineServiceType> supportedOnlineServices;

	/**
	 * The cached value of the '{@link #getFulfillmentConstraint() <em>Fulfillment Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFulfillmentConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<FulfillmentConstraint> fulfillmentConstraint;

	/**
	 * The cached value of the '{@link #getFareResourceLocations() <em>Fare Resource Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFareResourceLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<FareResourceLocation> fareResourceLocations;

	/**
	 * The cached value of the '{@link #getConnectionPoints() <em>Connection Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionPoint> connectionPoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FareStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.FARE_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FareElement> getFareElements() {
		if (fareElements == null) {
			fareElements = new EObjectContainmentEList<FareElement>(FareElement.class, this, GtmPackage.FARE_STRUCTURE__FARE_ELEMENTS);
		}
		return fareElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AfterSalesRule> getAfterSalesRules() {
		if (afterSalesRules == null) {
			afterSalesRules = new EObjectContainmentEList<AfterSalesRule>(AfterSalesRule.class, this, GtmPackage.FARE_STRUCTURE__AFTER_SALES_RULES);
		}
		return afterSalesRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Calendar> getCalendars() {
		if (calendars == null) {
			calendars = new EObjectContainmentEList<Calendar>(Calendar.class, this, GtmPackage.FARE_STRUCTURE__CALENDARS);
		}
		return calendars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceClass> getServiceClassDefinitions() {
		if (serviceClassDefinitions == null) {
			serviceClassDefinitions = new EObjectContainmentEList<ServiceClass>(ServiceClass.class, this, GtmPackage.FARE_STRUCTURE__SERVICE_CLASS_DEFINITIONS);
		}
		return serviceClassDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Price> getPrices() {
		if (prices == null) {
			prices = new EObjectContainmentEList<Price>(Price.class, this, GtmPackage.FARE_STRUCTURE__PRICES);
		}
		return prices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegionalConstraint> getRegionalConstraints() {
		if (regionalConstraints == null) {
			regionalConstraints = new EObjectContainmentEList<RegionalConstraint>(RegionalConstraint.class, this, GtmPackage.FARE_STRUCTURE__REGIONAL_CONSTRAINTS);
		}
		return regionalConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Text> getTexts() {
		if (texts == null) {
			texts = new EObjectContainmentEList<Text>(Text.class, this, GtmPackage.FARE_STRUCTURE__TEXTS);
		}
		return texts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceLevel> getServiceLevelDefinitions() {
		if (serviceLevelDefinitions == null) {
			serviceLevelDefinitions = new EObjectContainmentEList<ServiceLevel>(ServiceLevel.class, this, GtmPackage.FARE_STRUCTURE__SERVICE_LEVEL_DEFINITIONS);
		}
		return serviceLevelDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReservationParameter> getReservationParameters() {
		if (reservationParameters == null) {
			reservationParameters = new EObjectContainmentEList<ReservationParameter>(ReservationParameter.class, this, GtmPackage.FARE_STRUCTURE__RESERVATION_PARAMETERS);
		}
		return reservationParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceConstraint> getServiceConstraints() {
		if (serviceConstraints == null) {
			serviceConstraints = new EObjectContainmentEList<ServiceConstraint>(ServiceConstraint.class, this, GtmPackage.FARE_STRUCTURE__SERVICE_CONSTRAINTS);
		}
		return serviceConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CarrierConstraint> getCarrierConstraints() {
		if (carrierConstraints == null) {
			carrierConstraints = new EObjectContainmentEList<CarrierConstraint>(CarrierConstraint.class, this, GtmPackage.FARE_STRUCTURE__CARRIER_CONSTRAINTS);
		}
		return carrierConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReductionCard> getReductionCards() {
		if (reductionCards == null) {
			reductionCards = new EObjectContainmentEList<ReductionCard>(ReductionCard.class, this, GtmPackage.FARE_STRUCTURE__REDUCTION_CARDS);
		}
		return reductionCards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SalesAvailabilityConstraint> getSalesAvailabilityConstraints() {
		if (salesAvailabilityConstraints == null) {
			salesAvailabilityConstraints = new EObjectContainmentEList<SalesAvailabilityConstraint>(SalesAvailabilityConstraint.class, this, GtmPackage.FARE_STRUCTURE__SALES_AVAILABILITY_CONSTRAINTS);
		}
		return salesAvailabilityConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TravelValidityConstraint> getTravelValidityConstraints() {
		if (travelValidityConstraints == null) {
			travelValidityConstraints = new EObjectContainmentEList<TravelValidityConstraint>(TravelValidityConstraint.class, this, GtmPackage.FARE_STRUCTURE__TRAVEL_VALIDITY_CONSTRAINTS);
		}
		return travelValidityConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CombinationConstraint> getCombinationConstraints() {
		if (combinationConstraints == null) {
			combinationConstraints = new EObjectContainmentEList<CombinationConstraint>(CombinationConstraint.class, this, GtmPackage.FARE_STRUCTURE__COMBINATION_CONSTRAINTS);
		}
		return combinationConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PassengerConstraint> getPassengerConstraints() {
		if (passengerConstraints == null) {
			passengerConstraints = new EObjectContainmentEList<PassengerConstraint>(PassengerConstraint.class, this, GtmPackage.FARE_STRUCTURE__PASSENGER_CONSTRAINTS);
		}
		return passengerConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonalDataConstraint> getPersonalDataConstraints() {
		if (personalDataConstraints == null) {
			personalDataConstraints = new EObjectContainmentEList<PersonalDataConstraint>(PersonalDataConstraint.class, this, GtmPackage.FARE_STRUCTURE__PERSONAL_DATA_CONSTRAINTS);
		}
		return personalDataConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReductionConstraint> getReductionConstraints() {
		if (reductionConstraints == null) {
			reductionConstraints = new EObjectContainmentEList<ReductionConstraint>(ReductionConstraint.class, this, GtmPackage.FARE_STRUCTURE__REDUCTION_CONSTRAINTS);
		}
		return reductionConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ZoneDefinition> getZoneDefinitions() {
		if (zoneDefinitions == null) {
			zoneDefinitions = new EObjectContainmentEList<ZoneDefinition>(ZoneDefinition.class, this, GtmPackage.FARE_STRUCTURE__ZONE_DEFINITIONS);
		}
		return zoneDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OnlineServiceType> getSupportedOnlineServices() {
		if (supportedOnlineServices == null) {
			supportedOnlineServices = new EDataTypeUniqueEList<OnlineServiceType>(OnlineServiceType.class, this, GtmPackage.FARE_STRUCTURE__SUPPORTED_ONLINE_SERVICES);
		}
		return supportedOnlineServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FulfillmentConstraint> getFulfillmentConstraint() {
		if (fulfillmentConstraint == null) {
			fulfillmentConstraint = new EObjectContainmentEList<FulfillmentConstraint>(FulfillmentConstraint.class, this, GtmPackage.FARE_STRUCTURE__FULFILLMENT_CONSTRAINT);
		}
		return fulfillmentConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FareResourceLocation> getFareResourceLocations() {
		if (fareResourceLocations == null) {
			fareResourceLocations = new EObjectContainmentEList<FareResourceLocation>(FareResourceLocation.class, this, GtmPackage.FARE_STRUCTURE__FARE_RESOURCE_LOCATIONS);
		}
		return fareResourceLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionPoint> getConnectionPoints() {
		if (connectionPoints == null) {
			connectionPoints = new EObjectContainmentEList<ConnectionPoint>(ConnectionPoint.class, this, GtmPackage.FARE_STRUCTURE__CONNECTION_POINTS);
		}
		return connectionPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.FARE_STRUCTURE__FARE_ELEMENTS:
				return ((InternalEList<?>)getFareElements()).basicRemove(otherEnd, msgs);
			case GtmPackage.FARE_STRUCTURE__AFTER_SALES_RULES:
				return ((InternalEList<?>)getAfterSalesRules()).basicRemove(otherEnd, msgs);
			case GtmPackage.FARE_STRUCTURE__CALENDARS:
				return ((InternalEList<?>)getCalendars()).basicRemove(otherEnd, msgs);
			case GtmPackage.FARE_STRUCTURE__SERVICE_CLASS_DEFINITIONS:
				return ((InternalEList<?>)getServiceClassDefinitions()).basicRemove(otherEnd, msgs);
			case GtmPackage.FARE_STRUCTURE__PRICES:
				return ((InternalEList<?>)getPrices()).basicRemove(otherEnd, msgs);
			case GtmPackage.FARE_STRUCTURE__REGIONAL_CONSTRAINTS:
				return ((InternalEList<?>)getRegionalConstraints()).basicRemove(otherEnd, msgs);
			case GtmPackage.FARE_STRUCTURE__TEXTS:
				return ((InternalEList<?>)getTexts()).basicRemove(otherEnd, msgs);
			case GtmPackage.FARE_STRUCTURE__SERVICE_LEVEL_DEFINITIONS:
				return ((InternalEList<?>)getServiceLevelDefinitions()).basicRemove(otherEnd, msgs);
			case GtmPackage.FARE_STRUCTURE__RESERVATION_PARAMETERS:
				return ((InternalEList<?>)getReservationParameters()).basicRemove(otherEnd, msgs);
			case GtmPackage.FARE_STRUCTURE__SERVICE_CONSTRAINTS:
				return ((InternalEList<?>)getServiceConstraints()).basicRemove(otherEnd, msgs);
			case GtmPackage.FARE_STRUCTURE__CARRIER_CONSTRAINTS:
				return ((InternalEList<?>)getCarrierConstraints()).basicRemove(otherEnd, msgs);
			case GtmPackage.FARE_STRUCTURE__REDUCTION_CARDS:
				return ((InternalEList<?>)getReductionCards()).basicRemove(otherEnd, msgs);
			case GtmPackage.FARE_STRUCTURE__SALES_AVAILABILITY_CONSTRAINTS:
				return ((InternalEList<?>)getSalesAvailabilityConstraints()).basicRemove(otherEnd, msgs);
			case GtmPackage.FARE_STRUCTURE__TRAVEL_VALIDITY_CONSTRAINTS:
				return ((InternalEList<?>)getTravelValidityConstraints()).basicRemove(otherEnd, msgs);
			case GtmPackage.FARE_STRUCTURE__COMBINATION_CONSTRAINTS:
				return ((InternalEList<?>)getCombinationConstraints()).basicRemove(otherEnd, msgs);
			case GtmPackage.FARE_STRUCTURE__PASSENGER_CONSTRAINTS:
				return ((InternalEList<?>)getPassengerConstraints()).basicRemove(otherEnd, msgs);
			case GtmPackage.FARE_STRUCTURE__PERSONAL_DATA_CONSTRAINTS:
				return ((InternalEList<?>)getPersonalDataConstraints()).basicRemove(otherEnd, msgs);
			case GtmPackage.FARE_STRUCTURE__REDUCTION_CONSTRAINTS:
				return ((InternalEList<?>)getReductionConstraints()).basicRemove(otherEnd, msgs);
			case GtmPackage.FARE_STRUCTURE__ZONE_DEFINITIONS:
				return ((InternalEList<?>)getZoneDefinitions()).basicRemove(otherEnd, msgs);
			case GtmPackage.FARE_STRUCTURE__FULFILLMENT_CONSTRAINT:
				return ((InternalEList<?>)getFulfillmentConstraint()).basicRemove(otherEnd, msgs);
			case GtmPackage.FARE_STRUCTURE__FARE_RESOURCE_LOCATIONS:
				return ((InternalEList<?>)getFareResourceLocations()).basicRemove(otherEnd, msgs);
			case GtmPackage.FARE_STRUCTURE__CONNECTION_POINTS:
				return ((InternalEList<?>)getConnectionPoints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.FARE_STRUCTURE__FARE_ELEMENTS:
				return getFareElements();
			case GtmPackage.FARE_STRUCTURE__AFTER_SALES_RULES:
				return getAfterSalesRules();
			case GtmPackage.FARE_STRUCTURE__CALENDARS:
				return getCalendars();
			case GtmPackage.FARE_STRUCTURE__SERVICE_CLASS_DEFINITIONS:
				return getServiceClassDefinitions();
			case GtmPackage.FARE_STRUCTURE__PRICES:
				return getPrices();
			case GtmPackage.FARE_STRUCTURE__REGIONAL_CONSTRAINTS:
				return getRegionalConstraints();
			case GtmPackage.FARE_STRUCTURE__TEXTS:
				return getTexts();
			case GtmPackage.FARE_STRUCTURE__SERVICE_LEVEL_DEFINITIONS:
				return getServiceLevelDefinitions();
			case GtmPackage.FARE_STRUCTURE__RESERVATION_PARAMETERS:
				return getReservationParameters();
			case GtmPackage.FARE_STRUCTURE__SERVICE_CONSTRAINTS:
				return getServiceConstraints();
			case GtmPackage.FARE_STRUCTURE__CARRIER_CONSTRAINTS:
				return getCarrierConstraints();
			case GtmPackage.FARE_STRUCTURE__REDUCTION_CARDS:
				return getReductionCards();
			case GtmPackage.FARE_STRUCTURE__SALES_AVAILABILITY_CONSTRAINTS:
				return getSalesAvailabilityConstraints();
			case GtmPackage.FARE_STRUCTURE__TRAVEL_VALIDITY_CONSTRAINTS:
				return getTravelValidityConstraints();
			case GtmPackage.FARE_STRUCTURE__COMBINATION_CONSTRAINTS:
				return getCombinationConstraints();
			case GtmPackage.FARE_STRUCTURE__PASSENGER_CONSTRAINTS:
				return getPassengerConstraints();
			case GtmPackage.FARE_STRUCTURE__PERSONAL_DATA_CONSTRAINTS:
				return getPersonalDataConstraints();
			case GtmPackage.FARE_STRUCTURE__REDUCTION_CONSTRAINTS:
				return getReductionConstraints();
			case GtmPackage.FARE_STRUCTURE__ZONE_DEFINITIONS:
				return getZoneDefinitions();
			case GtmPackage.FARE_STRUCTURE__SUPPORTED_ONLINE_SERVICES:
				return getSupportedOnlineServices();
			case GtmPackage.FARE_STRUCTURE__FULFILLMENT_CONSTRAINT:
				return getFulfillmentConstraint();
			case GtmPackage.FARE_STRUCTURE__FARE_RESOURCE_LOCATIONS:
				return getFareResourceLocations();
			case GtmPackage.FARE_STRUCTURE__CONNECTION_POINTS:
				return getConnectionPoints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GtmPackage.FARE_STRUCTURE__FARE_ELEMENTS:
				getFareElements().clear();
				getFareElements().addAll((Collection<? extends FareElement>)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__AFTER_SALES_RULES:
				getAfterSalesRules().clear();
				getAfterSalesRules().addAll((Collection<? extends AfterSalesRule>)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__CALENDARS:
				getCalendars().clear();
				getCalendars().addAll((Collection<? extends Calendar>)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__SERVICE_CLASS_DEFINITIONS:
				getServiceClassDefinitions().clear();
				getServiceClassDefinitions().addAll((Collection<? extends ServiceClass>)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__PRICES:
				getPrices().clear();
				getPrices().addAll((Collection<? extends Price>)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__REGIONAL_CONSTRAINTS:
				getRegionalConstraints().clear();
				getRegionalConstraints().addAll((Collection<? extends RegionalConstraint>)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__TEXTS:
				getTexts().clear();
				getTexts().addAll((Collection<? extends Text>)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__SERVICE_LEVEL_DEFINITIONS:
				getServiceLevelDefinitions().clear();
				getServiceLevelDefinitions().addAll((Collection<? extends ServiceLevel>)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__RESERVATION_PARAMETERS:
				getReservationParameters().clear();
				getReservationParameters().addAll((Collection<? extends ReservationParameter>)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__SERVICE_CONSTRAINTS:
				getServiceConstraints().clear();
				getServiceConstraints().addAll((Collection<? extends ServiceConstraint>)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__CARRIER_CONSTRAINTS:
				getCarrierConstraints().clear();
				getCarrierConstraints().addAll((Collection<? extends CarrierConstraint>)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__REDUCTION_CARDS:
				getReductionCards().clear();
				getReductionCards().addAll((Collection<? extends ReductionCard>)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__SALES_AVAILABILITY_CONSTRAINTS:
				getSalesAvailabilityConstraints().clear();
				getSalesAvailabilityConstraints().addAll((Collection<? extends SalesAvailabilityConstraint>)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__TRAVEL_VALIDITY_CONSTRAINTS:
				getTravelValidityConstraints().clear();
				getTravelValidityConstraints().addAll((Collection<? extends TravelValidityConstraint>)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__COMBINATION_CONSTRAINTS:
				getCombinationConstraints().clear();
				getCombinationConstraints().addAll((Collection<? extends CombinationConstraint>)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__PASSENGER_CONSTRAINTS:
				getPassengerConstraints().clear();
				getPassengerConstraints().addAll((Collection<? extends PassengerConstraint>)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__PERSONAL_DATA_CONSTRAINTS:
				getPersonalDataConstraints().clear();
				getPersonalDataConstraints().addAll((Collection<? extends PersonalDataConstraint>)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__REDUCTION_CONSTRAINTS:
				getReductionConstraints().clear();
				getReductionConstraints().addAll((Collection<? extends ReductionConstraint>)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__ZONE_DEFINITIONS:
				getZoneDefinitions().clear();
				getZoneDefinitions().addAll((Collection<? extends ZoneDefinition>)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__SUPPORTED_ONLINE_SERVICES:
				getSupportedOnlineServices().clear();
				getSupportedOnlineServices().addAll((Collection<? extends OnlineServiceType>)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__FULFILLMENT_CONSTRAINT:
				getFulfillmentConstraint().clear();
				getFulfillmentConstraint().addAll((Collection<? extends FulfillmentConstraint>)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__FARE_RESOURCE_LOCATIONS:
				getFareResourceLocations().clear();
				getFareResourceLocations().addAll((Collection<? extends FareResourceLocation>)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__CONNECTION_POINTS:
				getConnectionPoints().clear();
				getConnectionPoints().addAll((Collection<? extends ConnectionPoint>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GtmPackage.FARE_STRUCTURE__FARE_ELEMENTS:
				getFareElements().clear();
				return;
			case GtmPackage.FARE_STRUCTURE__AFTER_SALES_RULES:
				getAfterSalesRules().clear();
				return;
			case GtmPackage.FARE_STRUCTURE__CALENDARS:
				getCalendars().clear();
				return;
			case GtmPackage.FARE_STRUCTURE__SERVICE_CLASS_DEFINITIONS:
				getServiceClassDefinitions().clear();
				return;
			case GtmPackage.FARE_STRUCTURE__PRICES:
				getPrices().clear();
				return;
			case GtmPackage.FARE_STRUCTURE__REGIONAL_CONSTRAINTS:
				getRegionalConstraints().clear();
				return;
			case GtmPackage.FARE_STRUCTURE__TEXTS:
				getTexts().clear();
				return;
			case GtmPackage.FARE_STRUCTURE__SERVICE_LEVEL_DEFINITIONS:
				getServiceLevelDefinitions().clear();
				return;
			case GtmPackage.FARE_STRUCTURE__RESERVATION_PARAMETERS:
				getReservationParameters().clear();
				return;
			case GtmPackage.FARE_STRUCTURE__SERVICE_CONSTRAINTS:
				getServiceConstraints().clear();
				return;
			case GtmPackage.FARE_STRUCTURE__CARRIER_CONSTRAINTS:
				getCarrierConstraints().clear();
				return;
			case GtmPackage.FARE_STRUCTURE__REDUCTION_CARDS:
				getReductionCards().clear();
				return;
			case GtmPackage.FARE_STRUCTURE__SALES_AVAILABILITY_CONSTRAINTS:
				getSalesAvailabilityConstraints().clear();
				return;
			case GtmPackage.FARE_STRUCTURE__TRAVEL_VALIDITY_CONSTRAINTS:
				getTravelValidityConstraints().clear();
				return;
			case GtmPackage.FARE_STRUCTURE__COMBINATION_CONSTRAINTS:
				getCombinationConstraints().clear();
				return;
			case GtmPackage.FARE_STRUCTURE__PASSENGER_CONSTRAINTS:
				getPassengerConstraints().clear();
				return;
			case GtmPackage.FARE_STRUCTURE__PERSONAL_DATA_CONSTRAINTS:
				getPersonalDataConstraints().clear();
				return;
			case GtmPackage.FARE_STRUCTURE__REDUCTION_CONSTRAINTS:
				getReductionConstraints().clear();
				return;
			case GtmPackage.FARE_STRUCTURE__ZONE_DEFINITIONS:
				getZoneDefinitions().clear();
				return;
			case GtmPackage.FARE_STRUCTURE__SUPPORTED_ONLINE_SERVICES:
				getSupportedOnlineServices().clear();
				return;
			case GtmPackage.FARE_STRUCTURE__FULFILLMENT_CONSTRAINT:
				getFulfillmentConstraint().clear();
				return;
			case GtmPackage.FARE_STRUCTURE__FARE_RESOURCE_LOCATIONS:
				getFareResourceLocations().clear();
				return;
			case GtmPackage.FARE_STRUCTURE__CONNECTION_POINTS:
				getConnectionPoints().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GtmPackage.FARE_STRUCTURE__FARE_ELEMENTS:
				return fareElements != null && !fareElements.isEmpty();
			case GtmPackage.FARE_STRUCTURE__AFTER_SALES_RULES:
				return afterSalesRules != null && !afterSalesRules.isEmpty();
			case GtmPackage.FARE_STRUCTURE__CALENDARS:
				return calendars != null && !calendars.isEmpty();
			case GtmPackage.FARE_STRUCTURE__SERVICE_CLASS_DEFINITIONS:
				return serviceClassDefinitions != null && !serviceClassDefinitions.isEmpty();
			case GtmPackage.FARE_STRUCTURE__PRICES:
				return prices != null && !prices.isEmpty();
			case GtmPackage.FARE_STRUCTURE__REGIONAL_CONSTRAINTS:
				return regionalConstraints != null && !regionalConstraints.isEmpty();
			case GtmPackage.FARE_STRUCTURE__TEXTS:
				return texts != null && !texts.isEmpty();
			case GtmPackage.FARE_STRUCTURE__SERVICE_LEVEL_DEFINITIONS:
				return serviceLevelDefinitions != null && !serviceLevelDefinitions.isEmpty();
			case GtmPackage.FARE_STRUCTURE__RESERVATION_PARAMETERS:
				return reservationParameters != null && !reservationParameters.isEmpty();
			case GtmPackage.FARE_STRUCTURE__SERVICE_CONSTRAINTS:
				return serviceConstraints != null && !serviceConstraints.isEmpty();
			case GtmPackage.FARE_STRUCTURE__CARRIER_CONSTRAINTS:
				return carrierConstraints != null && !carrierConstraints.isEmpty();
			case GtmPackage.FARE_STRUCTURE__REDUCTION_CARDS:
				return reductionCards != null && !reductionCards.isEmpty();
			case GtmPackage.FARE_STRUCTURE__SALES_AVAILABILITY_CONSTRAINTS:
				return salesAvailabilityConstraints != null && !salesAvailabilityConstraints.isEmpty();
			case GtmPackage.FARE_STRUCTURE__TRAVEL_VALIDITY_CONSTRAINTS:
				return travelValidityConstraints != null && !travelValidityConstraints.isEmpty();
			case GtmPackage.FARE_STRUCTURE__COMBINATION_CONSTRAINTS:
				return combinationConstraints != null && !combinationConstraints.isEmpty();
			case GtmPackage.FARE_STRUCTURE__PASSENGER_CONSTRAINTS:
				return passengerConstraints != null && !passengerConstraints.isEmpty();
			case GtmPackage.FARE_STRUCTURE__PERSONAL_DATA_CONSTRAINTS:
				return personalDataConstraints != null && !personalDataConstraints.isEmpty();
			case GtmPackage.FARE_STRUCTURE__REDUCTION_CONSTRAINTS:
				return reductionConstraints != null && !reductionConstraints.isEmpty();
			case GtmPackage.FARE_STRUCTURE__ZONE_DEFINITIONS:
				return zoneDefinitions != null && !zoneDefinitions.isEmpty();
			case GtmPackage.FARE_STRUCTURE__SUPPORTED_ONLINE_SERVICES:
				return supportedOnlineServices != null && !supportedOnlineServices.isEmpty();
			case GtmPackage.FARE_STRUCTURE__FULFILLMENT_CONSTRAINT:
				return fulfillmentConstraint != null && !fulfillmentConstraint.isEmpty();
			case GtmPackage.FARE_STRUCTURE__FARE_RESOURCE_LOCATIONS:
				return fareResourceLocations != null && !fareResourceLocations.isEmpty();
			case GtmPackage.FARE_STRUCTURE__CONNECTION_POINTS:
				return connectionPoints != null && !connectionPoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (supportedOnlineServices: ");
		result.append(supportedOnlineServices);
		result.append(')');
		return result.toString();
	}

} //FareStructureImpl
