/**
 */
package Gtm.impl;

import Gtm.AfterSalesRules;
import Gtm.Calendars;
import Gtm.CarrierConstraints;
import Gtm.CombinationConstraints;
import Gtm.ConnectionPoints;
import Gtm.FareElements;
import Gtm.FareResourceLocations;
import Gtm.FareStructure;
import Gtm.FulfillmentConstraints;
import Gtm.GtmPackage;
import Gtm.PassengerConstraints;
import Gtm.PersonalDataConstraints;
import Gtm.Prices;
import Gtm.ReductionCards;
import Gtm.ReductionConstraints;
import Gtm.RegionalConstraints;
import Gtm.ReservationParameters;
import Gtm.SalesAvailabilityConstraints;
import Gtm.ServiceClassDefinitions;
import Gtm.ServiceConstraints;
import Gtm.ServiceLevelDefinitions;
import Gtm.SupportedOnlineServices;
import Gtm.Texts;
import Gtm.TravelValidityConstraints;
import Gtm.ZoneDefinitions;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fare Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.FareStructureImpl#getFareElements <em>Fare Elements</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getCombinationConstraints <em>Combination Constraints</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getSalesAvailabilityConstraints <em>Sales Availability Constraints</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getTravelValidityConstraints <em>Travel Validity Constraints</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getPrices <em>Prices</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getRegionalConstraints <em>Regional Constraints</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getConnectionPoints <em>Connection Points</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getCarrierConstraints <em>Carrier Constraints</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getServiceConstraints <em>Service Constraints</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getPassengerConstraints <em>Passenger Constraints</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getReductionConstraints <em>Reduction Constraints</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getAfterSalesRules <em>After Sales Rules</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getPersonalDataConstraints <em>Personal Data Constraints</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getFulfillmentConstraints <em>Fulfillment Constraints</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getReductionCards <em>Reduction Cards</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getServiceLevelDefinitions <em>Service Level Definitions</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getServiceClassDefinitions <em>Service Class Definitions</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getCalendars <em>Calendars</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getTexts <em>Texts</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getZoneDefinitions <em>Zone Definitions</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getReservationParameters <em>Reservation Parameters</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getSupportedOnlineServices <em>Supported Online Services</em>}</li>
 *   <li>{@link Gtm.impl.FareStructureImpl#getFareResourceLocations <em>Fare Resource Locations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FareStructureImpl extends MinimalEObjectImpl.Container implements FareStructure {
	/**
	 * The cached value of the '{@link #getFareElements() <em>Fare Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFareElements()
	 * @generated
	 * @ordered
	 */
	protected FareElements fareElements;

	/**
	 * The cached value of the '{@link #getCombinationConstraints() <em>Combination Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombinationConstraints()
	 * @generated
	 * @ordered
	 */
	protected CombinationConstraints combinationConstraints;

	/**
	 * The cached value of the '{@link #getSalesAvailabilityConstraints() <em>Sales Availability Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesAvailabilityConstraints()
	 * @generated
	 * @ordered
	 */
	protected SalesAvailabilityConstraints salesAvailabilityConstraints;

	/**
	 * The cached value of the '{@link #getTravelValidityConstraints() <em>Travel Validity Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelValidityConstraints()
	 * @generated
	 * @ordered
	 */
	protected TravelValidityConstraints travelValidityConstraints;

	/**
	 * The cached value of the '{@link #getPrices() <em>Prices</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrices()
	 * @generated
	 * @ordered
	 */
	protected Prices prices;

	/**
	 * The cached value of the '{@link #getRegionalConstraints() <em>Regional Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionalConstraints()
	 * @generated
	 * @ordered
	 */
	protected RegionalConstraints regionalConstraints;

	/**
	 * The cached value of the '{@link #getConnectionPoints() <em>Connection Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionPoints()
	 * @generated
	 * @ordered
	 */
	protected ConnectionPoints connectionPoints;

	/**
	 * The cached value of the '{@link #getCarrierConstraints() <em>Carrier Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierConstraints()
	 * @generated
	 * @ordered
	 */
	protected CarrierConstraints carrierConstraints;

	/**
	 * The cached value of the '{@link #getServiceConstraints() <em>Service Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceConstraints()
	 * @generated
	 * @ordered
	 */
	protected ServiceConstraints serviceConstraints;

	/**
	 * The cached value of the '{@link #getPassengerConstraints() <em>Passenger Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerConstraints()
	 * @generated
	 * @ordered
	 */
	protected PassengerConstraints passengerConstraints;

	/**
	 * The cached value of the '{@link #getReductionConstraints() <em>Reduction Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReductionConstraints()
	 * @generated
	 * @ordered
	 */
	protected ReductionConstraints reductionConstraints;

	/**
	 * The cached value of the '{@link #getAfterSalesRules() <em>After Sales Rules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterSalesRules()
	 * @generated
	 * @ordered
	 */
	protected AfterSalesRules afterSalesRules;

	/**
	 * The cached value of the '{@link #getPersonalDataConstraints() <em>Personal Data Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonalDataConstraints()
	 * @generated
	 * @ordered
	 */
	protected PersonalDataConstraints personalDataConstraints;

	/**
	 * The cached value of the '{@link #getFulfillmentConstraints() <em>Fulfillment Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFulfillmentConstraints()
	 * @generated
	 * @ordered
	 */
	protected FulfillmentConstraints fulfillmentConstraints;

	/**
	 * The cached value of the '{@link #getReductionCards() <em>Reduction Cards</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReductionCards()
	 * @generated
	 * @ordered
	 */
	protected ReductionCards reductionCards;

	/**
	 * The cached value of the '{@link #getServiceLevelDefinitions() <em>Service Level Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLevelDefinitions()
	 * @generated
	 * @ordered
	 */
	protected ServiceLevelDefinitions serviceLevelDefinitions;

	/**
	 * The cached value of the '{@link #getServiceClassDefinitions() <em>Service Class Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceClassDefinitions()
	 * @generated
	 * @ordered
	 */
	protected ServiceClassDefinitions serviceClassDefinitions;

	/**
	 * The cached value of the '{@link #getCalendars() <em>Calendars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendars()
	 * @generated
	 * @ordered
	 */
	protected Calendars calendars;

	/**
	 * The cached value of the '{@link #getTexts() <em>Texts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexts()
	 * @generated
	 * @ordered
	 */
	protected Texts texts;

	/**
	 * The cached value of the '{@link #getZoneDefinitions() <em>Zone Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoneDefinitions()
	 * @generated
	 * @ordered
	 */
	protected ZoneDefinitions zoneDefinitions;

	/**
	 * The cached value of the '{@link #getReservationParameters() <em>Reservation Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservationParameters()
	 * @generated
	 * @ordered
	 */
	protected ReservationParameters reservationParameters;

	/**
	 * The cached value of the '{@link #getSupportedOnlineServices() <em>Supported Online Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedOnlineServices()
	 * @generated
	 * @ordered
	 */
	protected SupportedOnlineServices supportedOnlineServices;

	/**
	 * The cached value of the '{@link #getFareResourceLocations() <em>Fare Resource Locations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFareResourceLocations()
	 * @generated
	 * @ordered
	 */
	protected FareResourceLocations fareResourceLocations;

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
	public FareElements getFareElements() {
		return fareElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFareElements(FareElements newFareElements, NotificationChain msgs) {
		FareElements oldFareElements = fareElements;
		fareElements = newFareElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__FARE_ELEMENTS, oldFareElements, newFareElements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFareElements(FareElements newFareElements) {
		if (newFareElements != fareElements) {
			NotificationChain msgs = null;
			if (fareElements != null)
				msgs = ((InternalEObject)fareElements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__FARE_ELEMENTS, null, msgs);
			if (newFareElements != null)
				msgs = ((InternalEObject)newFareElements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__FARE_ELEMENTS, null, msgs);
			msgs = basicSetFareElements(newFareElements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__FARE_ELEMENTS, newFareElements, newFareElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AfterSalesRules getAfterSalesRules() {
		return afterSalesRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAfterSalesRules(AfterSalesRules newAfterSalesRules, NotificationChain msgs) {
		AfterSalesRules oldAfterSalesRules = afterSalesRules;
		afterSalesRules = newAfterSalesRules;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__AFTER_SALES_RULES, oldAfterSalesRules, newAfterSalesRules);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfterSalesRules(AfterSalesRules newAfterSalesRules) {
		if (newAfterSalesRules != afterSalesRules) {
			NotificationChain msgs = null;
			if (afterSalesRules != null)
				msgs = ((InternalEObject)afterSalesRules).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__AFTER_SALES_RULES, null, msgs);
			if (newAfterSalesRules != null)
				msgs = ((InternalEObject)newAfterSalesRules).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__AFTER_SALES_RULES, null, msgs);
			msgs = basicSetAfterSalesRules(newAfterSalesRules, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__AFTER_SALES_RULES, newAfterSalesRules, newAfterSalesRules));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendars getCalendars() {
		return calendars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalendars(Calendars newCalendars, NotificationChain msgs) {
		Calendars oldCalendars = calendars;
		calendars = newCalendars;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__CALENDARS, oldCalendars, newCalendars);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalendars(Calendars newCalendars) {
		if (newCalendars != calendars) {
			NotificationChain msgs = null;
			if (calendars != null)
				msgs = ((InternalEObject)calendars).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__CALENDARS, null, msgs);
			if (newCalendars != null)
				msgs = ((InternalEObject)newCalendars).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__CALENDARS, null, msgs);
			msgs = basicSetCalendars(newCalendars, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__CALENDARS, newCalendars, newCalendars));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceClassDefinitions getServiceClassDefinitions() {
		return serviceClassDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceClassDefinitions(ServiceClassDefinitions newServiceClassDefinitions, NotificationChain msgs) {
		ServiceClassDefinitions oldServiceClassDefinitions = serviceClassDefinitions;
		serviceClassDefinitions = newServiceClassDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__SERVICE_CLASS_DEFINITIONS, oldServiceClassDefinitions, newServiceClassDefinitions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceClassDefinitions(ServiceClassDefinitions newServiceClassDefinitions) {
		if (newServiceClassDefinitions != serviceClassDefinitions) {
			NotificationChain msgs = null;
			if (serviceClassDefinitions != null)
				msgs = ((InternalEObject)serviceClassDefinitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__SERVICE_CLASS_DEFINITIONS, null, msgs);
			if (newServiceClassDefinitions != null)
				msgs = ((InternalEObject)newServiceClassDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__SERVICE_CLASS_DEFINITIONS, null, msgs);
			msgs = basicSetServiceClassDefinitions(newServiceClassDefinitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__SERVICE_CLASS_DEFINITIONS, newServiceClassDefinitions, newServiceClassDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prices getPrices() {
		return prices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrices(Prices newPrices, NotificationChain msgs) {
		Prices oldPrices = prices;
		prices = newPrices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__PRICES, oldPrices, newPrices);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrices(Prices newPrices) {
		if (newPrices != prices) {
			NotificationChain msgs = null;
			if (prices != null)
				msgs = ((InternalEObject)prices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__PRICES, null, msgs);
			if (newPrices != null)
				msgs = ((InternalEObject)newPrices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__PRICES, null, msgs);
			msgs = basicSetPrices(newPrices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__PRICES, newPrices, newPrices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionalConstraints getRegionalConstraints() {
		return regionalConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegionalConstraints(RegionalConstraints newRegionalConstraints, NotificationChain msgs) {
		RegionalConstraints oldRegionalConstraints = regionalConstraints;
		regionalConstraints = newRegionalConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__REGIONAL_CONSTRAINTS, oldRegionalConstraints, newRegionalConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegionalConstraints(RegionalConstraints newRegionalConstraints) {
		if (newRegionalConstraints != regionalConstraints) {
			NotificationChain msgs = null;
			if (regionalConstraints != null)
				msgs = ((InternalEObject)regionalConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__REGIONAL_CONSTRAINTS, null, msgs);
			if (newRegionalConstraints != null)
				msgs = ((InternalEObject)newRegionalConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__REGIONAL_CONSTRAINTS, null, msgs);
			msgs = basicSetRegionalConstraints(newRegionalConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__REGIONAL_CONSTRAINTS, newRegionalConstraints, newRegionalConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Texts getTexts() {
		return texts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTexts(Texts newTexts, NotificationChain msgs) {
		Texts oldTexts = texts;
		texts = newTexts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__TEXTS, oldTexts, newTexts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTexts(Texts newTexts) {
		if (newTexts != texts) {
			NotificationChain msgs = null;
			if (texts != null)
				msgs = ((InternalEObject)texts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__TEXTS, null, msgs);
			if (newTexts != null)
				msgs = ((InternalEObject)newTexts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__TEXTS, null, msgs);
			msgs = basicSetTexts(newTexts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__TEXTS, newTexts, newTexts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevelDefinitions getServiceLevelDefinitions() {
		return serviceLevelDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceLevelDefinitions(ServiceLevelDefinitions newServiceLevelDefinitions, NotificationChain msgs) {
		ServiceLevelDefinitions oldServiceLevelDefinitions = serviceLevelDefinitions;
		serviceLevelDefinitions = newServiceLevelDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__SERVICE_LEVEL_DEFINITIONS, oldServiceLevelDefinitions, newServiceLevelDefinitions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceLevelDefinitions(ServiceLevelDefinitions newServiceLevelDefinitions) {
		if (newServiceLevelDefinitions != serviceLevelDefinitions) {
			NotificationChain msgs = null;
			if (serviceLevelDefinitions != null)
				msgs = ((InternalEObject)serviceLevelDefinitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__SERVICE_LEVEL_DEFINITIONS, null, msgs);
			if (newServiceLevelDefinitions != null)
				msgs = ((InternalEObject)newServiceLevelDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__SERVICE_LEVEL_DEFINITIONS, null, msgs);
			msgs = basicSetServiceLevelDefinitions(newServiceLevelDefinitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__SERVICE_LEVEL_DEFINITIONS, newServiceLevelDefinitions, newServiceLevelDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationParameters getReservationParameters() {
		return reservationParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReservationParameters(ReservationParameters newReservationParameters, NotificationChain msgs) {
		ReservationParameters oldReservationParameters = reservationParameters;
		reservationParameters = newReservationParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__RESERVATION_PARAMETERS, oldReservationParameters, newReservationParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservationParameters(ReservationParameters newReservationParameters) {
		if (newReservationParameters != reservationParameters) {
			NotificationChain msgs = null;
			if (reservationParameters != null)
				msgs = ((InternalEObject)reservationParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__RESERVATION_PARAMETERS, null, msgs);
			if (newReservationParameters != null)
				msgs = ((InternalEObject)newReservationParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__RESERVATION_PARAMETERS, null, msgs);
			msgs = basicSetReservationParameters(newReservationParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__RESERVATION_PARAMETERS, newReservationParameters, newReservationParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConstraints getServiceConstraints() {
		return serviceConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceConstraints(ServiceConstraints newServiceConstraints, NotificationChain msgs) {
		ServiceConstraints oldServiceConstraints = serviceConstraints;
		serviceConstraints = newServiceConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__SERVICE_CONSTRAINTS, oldServiceConstraints, newServiceConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceConstraints(ServiceConstraints newServiceConstraints) {
		if (newServiceConstraints != serviceConstraints) {
			NotificationChain msgs = null;
			if (serviceConstraints != null)
				msgs = ((InternalEObject)serviceConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__SERVICE_CONSTRAINTS, null, msgs);
			if (newServiceConstraints != null)
				msgs = ((InternalEObject)newServiceConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__SERVICE_CONSTRAINTS, null, msgs);
			msgs = basicSetServiceConstraints(newServiceConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__SERVICE_CONSTRAINTS, newServiceConstraints, newServiceConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarrierConstraints getCarrierConstraints() {
		return carrierConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCarrierConstraints(CarrierConstraints newCarrierConstraints, NotificationChain msgs) {
		CarrierConstraints oldCarrierConstraints = carrierConstraints;
		carrierConstraints = newCarrierConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__CARRIER_CONSTRAINTS, oldCarrierConstraints, newCarrierConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarrierConstraints(CarrierConstraints newCarrierConstraints) {
		if (newCarrierConstraints != carrierConstraints) {
			NotificationChain msgs = null;
			if (carrierConstraints != null)
				msgs = ((InternalEObject)carrierConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__CARRIER_CONSTRAINTS, null, msgs);
			if (newCarrierConstraints != null)
				msgs = ((InternalEObject)newCarrierConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__CARRIER_CONSTRAINTS, null, msgs);
			msgs = basicSetCarrierConstraints(newCarrierConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__CARRIER_CONSTRAINTS, newCarrierConstraints, newCarrierConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReductionCards getReductionCards() {
		return reductionCards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReductionCards(ReductionCards newReductionCards, NotificationChain msgs) {
		ReductionCards oldReductionCards = reductionCards;
		reductionCards = newReductionCards;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__REDUCTION_CARDS, oldReductionCards, newReductionCards);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReductionCards(ReductionCards newReductionCards) {
		if (newReductionCards != reductionCards) {
			NotificationChain msgs = null;
			if (reductionCards != null)
				msgs = ((InternalEObject)reductionCards).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__REDUCTION_CARDS, null, msgs);
			if (newReductionCards != null)
				msgs = ((InternalEObject)newReductionCards).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__REDUCTION_CARDS, null, msgs);
			msgs = basicSetReductionCards(newReductionCards, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__REDUCTION_CARDS, newReductionCards, newReductionCards));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalesAvailabilityConstraints getSalesAvailabilityConstraints() {
		return salesAvailabilityConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSalesAvailabilityConstraints(SalesAvailabilityConstraints newSalesAvailabilityConstraints, NotificationChain msgs) {
		SalesAvailabilityConstraints oldSalesAvailabilityConstraints = salesAvailabilityConstraints;
		salesAvailabilityConstraints = newSalesAvailabilityConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__SALES_AVAILABILITY_CONSTRAINTS, oldSalesAvailabilityConstraints, newSalesAvailabilityConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalesAvailabilityConstraints(SalesAvailabilityConstraints newSalesAvailabilityConstraints) {
		if (newSalesAvailabilityConstraints != salesAvailabilityConstraints) {
			NotificationChain msgs = null;
			if (salesAvailabilityConstraints != null)
				msgs = ((InternalEObject)salesAvailabilityConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__SALES_AVAILABILITY_CONSTRAINTS, null, msgs);
			if (newSalesAvailabilityConstraints != null)
				msgs = ((InternalEObject)newSalesAvailabilityConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__SALES_AVAILABILITY_CONSTRAINTS, null, msgs);
			msgs = basicSetSalesAvailabilityConstraints(newSalesAvailabilityConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__SALES_AVAILABILITY_CONSTRAINTS, newSalesAvailabilityConstraints, newSalesAvailabilityConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelValidityConstraints getTravelValidityConstraints() {
		return travelValidityConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTravelValidityConstraints(TravelValidityConstraints newTravelValidityConstraints, NotificationChain msgs) {
		TravelValidityConstraints oldTravelValidityConstraints = travelValidityConstraints;
		travelValidityConstraints = newTravelValidityConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__TRAVEL_VALIDITY_CONSTRAINTS, oldTravelValidityConstraints, newTravelValidityConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTravelValidityConstraints(TravelValidityConstraints newTravelValidityConstraints) {
		if (newTravelValidityConstraints != travelValidityConstraints) {
			NotificationChain msgs = null;
			if (travelValidityConstraints != null)
				msgs = ((InternalEObject)travelValidityConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__TRAVEL_VALIDITY_CONSTRAINTS, null, msgs);
			if (newTravelValidityConstraints != null)
				msgs = ((InternalEObject)newTravelValidityConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__TRAVEL_VALIDITY_CONSTRAINTS, null, msgs);
			msgs = basicSetTravelValidityConstraints(newTravelValidityConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__TRAVEL_VALIDITY_CONSTRAINTS, newTravelValidityConstraints, newTravelValidityConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinationConstraints getCombinationConstraints() {
		return combinationConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCombinationConstraints(CombinationConstraints newCombinationConstraints, NotificationChain msgs) {
		CombinationConstraints oldCombinationConstraints = combinationConstraints;
		combinationConstraints = newCombinationConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__COMBINATION_CONSTRAINTS, oldCombinationConstraints, newCombinationConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCombinationConstraints(CombinationConstraints newCombinationConstraints) {
		if (newCombinationConstraints != combinationConstraints) {
			NotificationChain msgs = null;
			if (combinationConstraints != null)
				msgs = ((InternalEObject)combinationConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__COMBINATION_CONSTRAINTS, null, msgs);
			if (newCombinationConstraints != null)
				msgs = ((InternalEObject)newCombinationConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__COMBINATION_CONSTRAINTS, null, msgs);
			msgs = basicSetCombinationConstraints(newCombinationConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__COMBINATION_CONSTRAINTS, newCombinationConstraints, newCombinationConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassengerConstraints getPassengerConstraints() {
		return passengerConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassengerConstraints(PassengerConstraints newPassengerConstraints, NotificationChain msgs) {
		PassengerConstraints oldPassengerConstraints = passengerConstraints;
		passengerConstraints = newPassengerConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__PASSENGER_CONSTRAINTS, oldPassengerConstraints, newPassengerConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerConstraints(PassengerConstraints newPassengerConstraints) {
		if (newPassengerConstraints != passengerConstraints) {
			NotificationChain msgs = null;
			if (passengerConstraints != null)
				msgs = ((InternalEObject)passengerConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__PASSENGER_CONSTRAINTS, null, msgs);
			if (newPassengerConstraints != null)
				msgs = ((InternalEObject)newPassengerConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__PASSENGER_CONSTRAINTS, null, msgs);
			msgs = basicSetPassengerConstraints(newPassengerConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__PASSENGER_CONSTRAINTS, newPassengerConstraints, newPassengerConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonalDataConstraints getPersonalDataConstraints() {
		return personalDataConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersonalDataConstraints(PersonalDataConstraints newPersonalDataConstraints, NotificationChain msgs) {
		PersonalDataConstraints oldPersonalDataConstraints = personalDataConstraints;
		personalDataConstraints = newPersonalDataConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__PERSONAL_DATA_CONSTRAINTS, oldPersonalDataConstraints, newPersonalDataConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonalDataConstraints(PersonalDataConstraints newPersonalDataConstraints) {
		if (newPersonalDataConstraints != personalDataConstraints) {
			NotificationChain msgs = null;
			if (personalDataConstraints != null)
				msgs = ((InternalEObject)personalDataConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__PERSONAL_DATA_CONSTRAINTS, null, msgs);
			if (newPersonalDataConstraints != null)
				msgs = ((InternalEObject)newPersonalDataConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__PERSONAL_DATA_CONSTRAINTS, null, msgs);
			msgs = basicSetPersonalDataConstraints(newPersonalDataConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__PERSONAL_DATA_CONSTRAINTS, newPersonalDataConstraints, newPersonalDataConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReductionConstraints getReductionConstraints() {
		return reductionConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReductionConstraints(ReductionConstraints newReductionConstraints, NotificationChain msgs) {
		ReductionConstraints oldReductionConstraints = reductionConstraints;
		reductionConstraints = newReductionConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__REDUCTION_CONSTRAINTS, oldReductionConstraints, newReductionConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReductionConstraints(ReductionConstraints newReductionConstraints) {
		if (newReductionConstraints != reductionConstraints) {
			NotificationChain msgs = null;
			if (reductionConstraints != null)
				msgs = ((InternalEObject)reductionConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__REDUCTION_CONSTRAINTS, null, msgs);
			if (newReductionConstraints != null)
				msgs = ((InternalEObject)newReductionConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__REDUCTION_CONSTRAINTS, null, msgs);
			msgs = basicSetReductionConstraints(newReductionConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__REDUCTION_CONSTRAINTS, newReductionConstraints, newReductionConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZoneDefinitions getZoneDefinitions() {
		return zoneDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZoneDefinitions(ZoneDefinitions newZoneDefinitions, NotificationChain msgs) {
		ZoneDefinitions oldZoneDefinitions = zoneDefinitions;
		zoneDefinitions = newZoneDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__ZONE_DEFINITIONS, oldZoneDefinitions, newZoneDefinitions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZoneDefinitions(ZoneDefinitions newZoneDefinitions) {
		if (newZoneDefinitions != zoneDefinitions) {
			NotificationChain msgs = null;
			if (zoneDefinitions != null)
				msgs = ((InternalEObject)zoneDefinitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__ZONE_DEFINITIONS, null, msgs);
			if (newZoneDefinitions != null)
				msgs = ((InternalEObject)newZoneDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__ZONE_DEFINITIONS, null, msgs);
			msgs = basicSetZoneDefinitions(newZoneDefinitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__ZONE_DEFINITIONS, newZoneDefinitions, newZoneDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FulfillmentConstraints getFulfillmentConstraints() {
		return fulfillmentConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFulfillmentConstraints(FulfillmentConstraints newFulfillmentConstraints, NotificationChain msgs) {
		FulfillmentConstraints oldFulfillmentConstraints = fulfillmentConstraints;
		fulfillmentConstraints = newFulfillmentConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__FULFILLMENT_CONSTRAINTS, oldFulfillmentConstraints, newFulfillmentConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFulfillmentConstraints(FulfillmentConstraints newFulfillmentConstraints) {
		if (newFulfillmentConstraints != fulfillmentConstraints) {
			NotificationChain msgs = null;
			if (fulfillmentConstraints != null)
				msgs = ((InternalEObject)fulfillmentConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__FULFILLMENT_CONSTRAINTS, null, msgs);
			if (newFulfillmentConstraints != null)
				msgs = ((InternalEObject)newFulfillmentConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__FULFILLMENT_CONSTRAINTS, null, msgs);
			msgs = basicSetFulfillmentConstraints(newFulfillmentConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__FULFILLMENT_CONSTRAINTS, newFulfillmentConstraints, newFulfillmentConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportedOnlineServices getSupportedOnlineServices() {
		return supportedOnlineServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupportedOnlineServices(SupportedOnlineServices newSupportedOnlineServices, NotificationChain msgs) {
		SupportedOnlineServices oldSupportedOnlineServices = supportedOnlineServices;
		supportedOnlineServices = newSupportedOnlineServices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__SUPPORTED_ONLINE_SERVICES, oldSupportedOnlineServices, newSupportedOnlineServices);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportedOnlineServices(SupportedOnlineServices newSupportedOnlineServices) {
		if (newSupportedOnlineServices != supportedOnlineServices) {
			NotificationChain msgs = null;
			if (supportedOnlineServices != null)
				msgs = ((InternalEObject)supportedOnlineServices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__SUPPORTED_ONLINE_SERVICES, null, msgs);
			if (newSupportedOnlineServices != null)
				msgs = ((InternalEObject)newSupportedOnlineServices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__SUPPORTED_ONLINE_SERVICES, null, msgs);
			msgs = basicSetSupportedOnlineServices(newSupportedOnlineServices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__SUPPORTED_ONLINE_SERVICES, newSupportedOnlineServices, newSupportedOnlineServices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FareResourceLocations getFareResourceLocations() {
		return fareResourceLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFareResourceLocations(FareResourceLocations newFareResourceLocations, NotificationChain msgs) {
		FareResourceLocations oldFareResourceLocations = fareResourceLocations;
		fareResourceLocations = newFareResourceLocations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__FARE_RESOURCE_LOCATIONS, oldFareResourceLocations, newFareResourceLocations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFareResourceLocations(FareResourceLocations newFareResourceLocations) {
		if (newFareResourceLocations != fareResourceLocations) {
			NotificationChain msgs = null;
			if (fareResourceLocations != null)
				msgs = ((InternalEObject)fareResourceLocations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__FARE_RESOURCE_LOCATIONS, null, msgs);
			if (newFareResourceLocations != null)
				msgs = ((InternalEObject)newFareResourceLocations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__FARE_RESOURCE_LOCATIONS, null, msgs);
			msgs = basicSetFareResourceLocations(newFareResourceLocations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__FARE_RESOURCE_LOCATIONS, newFareResourceLocations, newFareResourceLocations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPoints getConnectionPoints() {
		return connectionPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionPoints(ConnectionPoints newConnectionPoints, NotificationChain msgs) {
		ConnectionPoints oldConnectionPoints = connectionPoints;
		connectionPoints = newConnectionPoints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__CONNECTION_POINTS, oldConnectionPoints, newConnectionPoints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionPoints(ConnectionPoints newConnectionPoints) {
		if (newConnectionPoints != connectionPoints) {
			NotificationChain msgs = null;
			if (connectionPoints != null)
				msgs = ((InternalEObject)connectionPoints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__CONNECTION_POINTS, null, msgs);
			if (newConnectionPoints != null)
				msgs = ((InternalEObject)newConnectionPoints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_STRUCTURE__CONNECTION_POINTS, null, msgs);
			msgs = basicSetConnectionPoints(newConnectionPoints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STRUCTURE__CONNECTION_POINTS, newConnectionPoints, newConnectionPoints));
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
				return basicSetFareElements(null, msgs);
			case GtmPackage.FARE_STRUCTURE__COMBINATION_CONSTRAINTS:
				return basicSetCombinationConstraints(null, msgs);
			case GtmPackage.FARE_STRUCTURE__SALES_AVAILABILITY_CONSTRAINTS:
				return basicSetSalesAvailabilityConstraints(null, msgs);
			case GtmPackage.FARE_STRUCTURE__TRAVEL_VALIDITY_CONSTRAINTS:
				return basicSetTravelValidityConstraints(null, msgs);
			case GtmPackage.FARE_STRUCTURE__PRICES:
				return basicSetPrices(null, msgs);
			case GtmPackage.FARE_STRUCTURE__REGIONAL_CONSTRAINTS:
				return basicSetRegionalConstraints(null, msgs);
			case GtmPackage.FARE_STRUCTURE__CONNECTION_POINTS:
				return basicSetConnectionPoints(null, msgs);
			case GtmPackage.FARE_STRUCTURE__CARRIER_CONSTRAINTS:
				return basicSetCarrierConstraints(null, msgs);
			case GtmPackage.FARE_STRUCTURE__SERVICE_CONSTRAINTS:
				return basicSetServiceConstraints(null, msgs);
			case GtmPackage.FARE_STRUCTURE__PASSENGER_CONSTRAINTS:
				return basicSetPassengerConstraints(null, msgs);
			case GtmPackage.FARE_STRUCTURE__REDUCTION_CONSTRAINTS:
				return basicSetReductionConstraints(null, msgs);
			case GtmPackage.FARE_STRUCTURE__AFTER_SALES_RULES:
				return basicSetAfterSalesRules(null, msgs);
			case GtmPackage.FARE_STRUCTURE__PERSONAL_DATA_CONSTRAINTS:
				return basicSetPersonalDataConstraints(null, msgs);
			case GtmPackage.FARE_STRUCTURE__FULFILLMENT_CONSTRAINTS:
				return basicSetFulfillmentConstraints(null, msgs);
			case GtmPackage.FARE_STRUCTURE__REDUCTION_CARDS:
				return basicSetReductionCards(null, msgs);
			case GtmPackage.FARE_STRUCTURE__SERVICE_LEVEL_DEFINITIONS:
				return basicSetServiceLevelDefinitions(null, msgs);
			case GtmPackage.FARE_STRUCTURE__SERVICE_CLASS_DEFINITIONS:
				return basicSetServiceClassDefinitions(null, msgs);
			case GtmPackage.FARE_STRUCTURE__CALENDARS:
				return basicSetCalendars(null, msgs);
			case GtmPackage.FARE_STRUCTURE__TEXTS:
				return basicSetTexts(null, msgs);
			case GtmPackage.FARE_STRUCTURE__ZONE_DEFINITIONS:
				return basicSetZoneDefinitions(null, msgs);
			case GtmPackage.FARE_STRUCTURE__RESERVATION_PARAMETERS:
				return basicSetReservationParameters(null, msgs);
			case GtmPackage.FARE_STRUCTURE__SUPPORTED_ONLINE_SERVICES:
				return basicSetSupportedOnlineServices(null, msgs);
			case GtmPackage.FARE_STRUCTURE__FARE_RESOURCE_LOCATIONS:
				return basicSetFareResourceLocations(null, msgs);
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
			case GtmPackage.FARE_STRUCTURE__COMBINATION_CONSTRAINTS:
				return getCombinationConstraints();
			case GtmPackage.FARE_STRUCTURE__SALES_AVAILABILITY_CONSTRAINTS:
				return getSalesAvailabilityConstraints();
			case GtmPackage.FARE_STRUCTURE__TRAVEL_VALIDITY_CONSTRAINTS:
				return getTravelValidityConstraints();
			case GtmPackage.FARE_STRUCTURE__PRICES:
				return getPrices();
			case GtmPackage.FARE_STRUCTURE__REGIONAL_CONSTRAINTS:
				return getRegionalConstraints();
			case GtmPackage.FARE_STRUCTURE__CONNECTION_POINTS:
				return getConnectionPoints();
			case GtmPackage.FARE_STRUCTURE__CARRIER_CONSTRAINTS:
				return getCarrierConstraints();
			case GtmPackage.FARE_STRUCTURE__SERVICE_CONSTRAINTS:
				return getServiceConstraints();
			case GtmPackage.FARE_STRUCTURE__PASSENGER_CONSTRAINTS:
				return getPassengerConstraints();
			case GtmPackage.FARE_STRUCTURE__REDUCTION_CONSTRAINTS:
				return getReductionConstraints();
			case GtmPackage.FARE_STRUCTURE__AFTER_SALES_RULES:
				return getAfterSalesRules();
			case GtmPackage.FARE_STRUCTURE__PERSONAL_DATA_CONSTRAINTS:
				return getPersonalDataConstraints();
			case GtmPackage.FARE_STRUCTURE__FULFILLMENT_CONSTRAINTS:
				return getFulfillmentConstraints();
			case GtmPackage.FARE_STRUCTURE__REDUCTION_CARDS:
				return getReductionCards();
			case GtmPackage.FARE_STRUCTURE__SERVICE_LEVEL_DEFINITIONS:
				return getServiceLevelDefinitions();
			case GtmPackage.FARE_STRUCTURE__SERVICE_CLASS_DEFINITIONS:
				return getServiceClassDefinitions();
			case GtmPackage.FARE_STRUCTURE__CALENDARS:
				return getCalendars();
			case GtmPackage.FARE_STRUCTURE__TEXTS:
				return getTexts();
			case GtmPackage.FARE_STRUCTURE__ZONE_DEFINITIONS:
				return getZoneDefinitions();
			case GtmPackage.FARE_STRUCTURE__RESERVATION_PARAMETERS:
				return getReservationParameters();
			case GtmPackage.FARE_STRUCTURE__SUPPORTED_ONLINE_SERVICES:
				return getSupportedOnlineServices();
			case GtmPackage.FARE_STRUCTURE__FARE_RESOURCE_LOCATIONS:
				return getFareResourceLocations();
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
				setFareElements((FareElements)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__COMBINATION_CONSTRAINTS:
				setCombinationConstraints((CombinationConstraints)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__SALES_AVAILABILITY_CONSTRAINTS:
				setSalesAvailabilityConstraints((SalesAvailabilityConstraints)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__TRAVEL_VALIDITY_CONSTRAINTS:
				setTravelValidityConstraints((TravelValidityConstraints)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__PRICES:
				setPrices((Prices)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__REGIONAL_CONSTRAINTS:
				setRegionalConstraints((RegionalConstraints)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__CONNECTION_POINTS:
				setConnectionPoints((ConnectionPoints)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__CARRIER_CONSTRAINTS:
				setCarrierConstraints((CarrierConstraints)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__SERVICE_CONSTRAINTS:
				setServiceConstraints((ServiceConstraints)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__PASSENGER_CONSTRAINTS:
				setPassengerConstraints((PassengerConstraints)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__REDUCTION_CONSTRAINTS:
				setReductionConstraints((ReductionConstraints)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__AFTER_SALES_RULES:
				setAfterSalesRules((AfterSalesRules)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__PERSONAL_DATA_CONSTRAINTS:
				setPersonalDataConstraints((PersonalDataConstraints)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__FULFILLMENT_CONSTRAINTS:
				setFulfillmentConstraints((FulfillmentConstraints)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__REDUCTION_CARDS:
				setReductionCards((ReductionCards)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__SERVICE_LEVEL_DEFINITIONS:
				setServiceLevelDefinitions((ServiceLevelDefinitions)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__SERVICE_CLASS_DEFINITIONS:
				setServiceClassDefinitions((ServiceClassDefinitions)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__CALENDARS:
				setCalendars((Calendars)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__TEXTS:
				setTexts((Texts)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__ZONE_DEFINITIONS:
				setZoneDefinitions((ZoneDefinitions)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__RESERVATION_PARAMETERS:
				setReservationParameters((ReservationParameters)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__SUPPORTED_ONLINE_SERVICES:
				setSupportedOnlineServices((SupportedOnlineServices)newValue);
				return;
			case GtmPackage.FARE_STRUCTURE__FARE_RESOURCE_LOCATIONS:
				setFareResourceLocations((FareResourceLocations)newValue);
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
				setFareElements((FareElements)null);
				return;
			case GtmPackage.FARE_STRUCTURE__COMBINATION_CONSTRAINTS:
				setCombinationConstraints((CombinationConstraints)null);
				return;
			case GtmPackage.FARE_STRUCTURE__SALES_AVAILABILITY_CONSTRAINTS:
				setSalesAvailabilityConstraints((SalesAvailabilityConstraints)null);
				return;
			case GtmPackage.FARE_STRUCTURE__TRAVEL_VALIDITY_CONSTRAINTS:
				setTravelValidityConstraints((TravelValidityConstraints)null);
				return;
			case GtmPackage.FARE_STRUCTURE__PRICES:
				setPrices((Prices)null);
				return;
			case GtmPackage.FARE_STRUCTURE__REGIONAL_CONSTRAINTS:
				setRegionalConstraints((RegionalConstraints)null);
				return;
			case GtmPackage.FARE_STRUCTURE__CONNECTION_POINTS:
				setConnectionPoints((ConnectionPoints)null);
				return;
			case GtmPackage.FARE_STRUCTURE__CARRIER_CONSTRAINTS:
				setCarrierConstraints((CarrierConstraints)null);
				return;
			case GtmPackage.FARE_STRUCTURE__SERVICE_CONSTRAINTS:
				setServiceConstraints((ServiceConstraints)null);
				return;
			case GtmPackage.FARE_STRUCTURE__PASSENGER_CONSTRAINTS:
				setPassengerConstraints((PassengerConstraints)null);
				return;
			case GtmPackage.FARE_STRUCTURE__REDUCTION_CONSTRAINTS:
				setReductionConstraints((ReductionConstraints)null);
				return;
			case GtmPackage.FARE_STRUCTURE__AFTER_SALES_RULES:
				setAfterSalesRules((AfterSalesRules)null);
				return;
			case GtmPackage.FARE_STRUCTURE__PERSONAL_DATA_CONSTRAINTS:
				setPersonalDataConstraints((PersonalDataConstraints)null);
				return;
			case GtmPackage.FARE_STRUCTURE__FULFILLMENT_CONSTRAINTS:
				setFulfillmentConstraints((FulfillmentConstraints)null);
				return;
			case GtmPackage.FARE_STRUCTURE__REDUCTION_CARDS:
				setReductionCards((ReductionCards)null);
				return;
			case GtmPackage.FARE_STRUCTURE__SERVICE_LEVEL_DEFINITIONS:
				setServiceLevelDefinitions((ServiceLevelDefinitions)null);
				return;
			case GtmPackage.FARE_STRUCTURE__SERVICE_CLASS_DEFINITIONS:
				setServiceClassDefinitions((ServiceClassDefinitions)null);
				return;
			case GtmPackage.FARE_STRUCTURE__CALENDARS:
				setCalendars((Calendars)null);
				return;
			case GtmPackage.FARE_STRUCTURE__TEXTS:
				setTexts((Texts)null);
				return;
			case GtmPackage.FARE_STRUCTURE__ZONE_DEFINITIONS:
				setZoneDefinitions((ZoneDefinitions)null);
				return;
			case GtmPackage.FARE_STRUCTURE__RESERVATION_PARAMETERS:
				setReservationParameters((ReservationParameters)null);
				return;
			case GtmPackage.FARE_STRUCTURE__SUPPORTED_ONLINE_SERVICES:
				setSupportedOnlineServices((SupportedOnlineServices)null);
				return;
			case GtmPackage.FARE_STRUCTURE__FARE_RESOURCE_LOCATIONS:
				setFareResourceLocations((FareResourceLocations)null);
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
				return fareElements != null;
			case GtmPackage.FARE_STRUCTURE__COMBINATION_CONSTRAINTS:
				return combinationConstraints != null;
			case GtmPackage.FARE_STRUCTURE__SALES_AVAILABILITY_CONSTRAINTS:
				return salesAvailabilityConstraints != null;
			case GtmPackage.FARE_STRUCTURE__TRAVEL_VALIDITY_CONSTRAINTS:
				return travelValidityConstraints != null;
			case GtmPackage.FARE_STRUCTURE__PRICES:
				return prices != null;
			case GtmPackage.FARE_STRUCTURE__REGIONAL_CONSTRAINTS:
				return regionalConstraints != null;
			case GtmPackage.FARE_STRUCTURE__CONNECTION_POINTS:
				return connectionPoints != null;
			case GtmPackage.FARE_STRUCTURE__CARRIER_CONSTRAINTS:
				return carrierConstraints != null;
			case GtmPackage.FARE_STRUCTURE__SERVICE_CONSTRAINTS:
				return serviceConstraints != null;
			case GtmPackage.FARE_STRUCTURE__PASSENGER_CONSTRAINTS:
				return passengerConstraints != null;
			case GtmPackage.FARE_STRUCTURE__REDUCTION_CONSTRAINTS:
				return reductionConstraints != null;
			case GtmPackage.FARE_STRUCTURE__AFTER_SALES_RULES:
				return afterSalesRules != null;
			case GtmPackage.FARE_STRUCTURE__PERSONAL_DATA_CONSTRAINTS:
				return personalDataConstraints != null;
			case GtmPackage.FARE_STRUCTURE__FULFILLMENT_CONSTRAINTS:
				return fulfillmentConstraints != null;
			case GtmPackage.FARE_STRUCTURE__REDUCTION_CARDS:
				return reductionCards != null;
			case GtmPackage.FARE_STRUCTURE__SERVICE_LEVEL_DEFINITIONS:
				return serviceLevelDefinitions != null;
			case GtmPackage.FARE_STRUCTURE__SERVICE_CLASS_DEFINITIONS:
				return serviceClassDefinitions != null;
			case GtmPackage.FARE_STRUCTURE__CALENDARS:
				return calendars != null;
			case GtmPackage.FARE_STRUCTURE__TEXTS:
				return texts != null;
			case GtmPackage.FARE_STRUCTURE__ZONE_DEFINITIONS:
				return zoneDefinitions != null;
			case GtmPackage.FARE_STRUCTURE__RESERVATION_PARAMETERS:
				return reservationParameters != null;
			case GtmPackage.FARE_STRUCTURE__SUPPORTED_ONLINE_SERVICES:
				return supportedOnlineServices != null;
			case GtmPackage.FARE_STRUCTURE__FARE_RESOURCE_LOCATIONS:
				return fareResourceLocations != null;
		}
		return super.eIsSet(featureID);
	}

} //FareStructureImpl
