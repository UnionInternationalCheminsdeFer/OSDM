/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fare Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.FareStructure#getFareElements <em>Fare Elements</em>}</li>
 *   <li>{@link Gtm.FareStructure#getCombinationConstraints <em>Combination Constraints</em>}</li>
 *   <li>{@link Gtm.FareStructure#getSalesAvailabilityConstraints <em>Sales Availability Constraints</em>}</li>
 *   <li>{@link Gtm.FareStructure#getTravelValidityConstraints <em>Travel Validity Constraints</em>}</li>
 *   <li>{@link Gtm.FareStructure#getPrices <em>Prices</em>}</li>
 *   <li>{@link Gtm.FareStructure#getRegionalConstraints <em>Regional Constraints</em>}</li>
 *   <li>{@link Gtm.FareStructure#getConnectionPoints <em>Connection Points</em>}</li>
 *   <li>{@link Gtm.FareStructure#getCarrierConstraints <em>Carrier Constraints</em>}</li>
 *   <li>{@link Gtm.FareStructure#getServiceConstraints <em>Service Constraints</em>}</li>
 *   <li>{@link Gtm.FareStructure#getPassengerConstraints <em>Passenger Constraints</em>}</li>
 *   <li>{@link Gtm.FareStructure#getReductionConstraints <em>Reduction Constraints</em>}</li>
 *   <li>{@link Gtm.FareStructure#getAfterSalesRules <em>After Sales Rules</em>}</li>
 *   <li>{@link Gtm.FareStructure#getPersonalDataConstraints <em>Personal Data Constraints</em>}</li>
 *   <li>{@link Gtm.FareStructure#getFulfillmentConstraints <em>Fulfillment Constraints</em>}</li>
 *   <li>{@link Gtm.FareStructure#getReductionCards <em>Reduction Cards</em>}</li>
 *   <li>{@link Gtm.FareStructure#getServiceLevelDefinitions <em>Service Level Definitions</em>}</li>
 *   <li>{@link Gtm.FareStructure#getServiceClassDefinitions <em>Service Class Definitions</em>}</li>
 *   <li>{@link Gtm.FareStructure#getCalendars <em>Calendars</em>}</li>
 *   <li>{@link Gtm.FareStructure#getTexts <em>Texts</em>}</li>
 *   <li>{@link Gtm.FareStructure#getZoneDefinitions <em>Zone Definitions</em>}</li>
 *   <li>{@link Gtm.FareStructure#getReservationParameters <em>Reservation Parameters</em>}</li>
 *   <li>{@link Gtm.FareStructure#getSupportedOnlineServices <em>Supported Online Services</em>}</li>
 *   <li>{@link Gtm.FareStructure#getFareResourceLocations <em>Fare Resource Locations</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getFareStructure()
 * @model
 * @generated
 */
public interface FareStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Fare Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fare Elements</em>' containment reference.
	 * @see #setFareElements(FareElements)
	 * @see Gtm.GtmPackage#getFareStructure_FareElements()
	 * @model containment="true"
	 * @generated
	 */
	FareElements getFareElements();

	/**
	 * Sets the value of the '{@link Gtm.FareStructure#getFareElements <em>Fare Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fare Elements</em>' containment reference.
	 * @see #getFareElements()
	 * @generated
	 */
	void setFareElements(FareElements value);

	/**
	 * Returns the value of the '<em><b>After Sales Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Sales Rules</em>' containment reference.
	 * @see #setAfterSalesRules(AfterSalesRules)
	 * @see Gtm.GtmPackage#getFareStructure_AfterSalesRules()
	 * @model containment="true"
	 * @generated
	 */
	AfterSalesRules getAfterSalesRules();

	/**
	 * Sets the value of the '{@link Gtm.FareStructure#getAfterSalesRules <em>After Sales Rules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After Sales Rules</em>' containment reference.
	 * @see #getAfterSalesRules()
	 * @generated
	 */
	void setAfterSalesRules(AfterSalesRules value);

	/**
	 * Returns the value of the '<em><b>Calendars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calendars</em>' containment reference.
	 * @see #setCalendars(Calendars)
	 * @see Gtm.GtmPackage#getFareStructure_Calendars()
	 * @model containment="true"
	 * @generated
	 */
	Calendars getCalendars();

	/**
	 * Sets the value of the '{@link Gtm.FareStructure#getCalendars <em>Calendars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calendars</em>' containment reference.
	 * @see #getCalendars()
	 * @generated
	 */
	void setCalendars(Calendars value);

	/**
	 * Returns the value of the '<em><b>Service Class Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Class Definitions</em>' containment reference.
	 * @see #setServiceClassDefinitions(ServiceClassDefinitions)
	 * @see Gtm.GtmPackage#getFareStructure_ServiceClassDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	ServiceClassDefinitions getServiceClassDefinitions();

	/**
	 * Sets the value of the '{@link Gtm.FareStructure#getServiceClassDefinitions <em>Service Class Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Class Definitions</em>' containment reference.
	 * @see #getServiceClassDefinitions()
	 * @generated
	 */
	void setServiceClassDefinitions(ServiceClassDefinitions value);

	/**
	 * Returns the value of the '<em><b>Prices</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prices</em>' containment reference.
	 * @see #setPrices(Prices)
	 * @see Gtm.GtmPackage#getFareStructure_Prices()
	 * @model containment="true"
	 * @generated
	 */
	Prices getPrices();

	/**
	 * Sets the value of the '{@link Gtm.FareStructure#getPrices <em>Prices</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prices</em>' containment reference.
	 * @see #getPrices()
	 * @generated
	 */
	void setPrices(Prices value);

	/**
	 * Returns the value of the '<em><b>Regional Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regional Constraints</em>' containment reference.
	 * @see #setRegionalConstraints(RegionalConstraints)
	 * @see Gtm.GtmPackage#getFareStructure_RegionalConstraints()
	 * @model containment="true"
	 * @generated
	 */
	RegionalConstraints getRegionalConstraints();

	/**
	 * Sets the value of the '{@link Gtm.FareStructure#getRegionalConstraints <em>Regional Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regional Constraints</em>' containment reference.
	 * @see #getRegionalConstraints()
	 * @generated
	 */
	void setRegionalConstraints(RegionalConstraints value);

	/**
	 * Returns the value of the '<em><b>Texts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texts</em>' containment reference.
	 * @see #setTexts(Texts)
	 * @see Gtm.GtmPackage#getFareStructure_Texts()
	 * @model containment="true"
	 * @generated
	 */
	Texts getTexts();

	/**
	 * Sets the value of the '{@link Gtm.FareStructure#getTexts <em>Texts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texts</em>' containment reference.
	 * @see #getTexts()
	 * @generated
	 */
	void setTexts(Texts value);

	/**
	 * Returns the value of the '<em><b>Service Level Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Level Definitions</em>' containment reference.
	 * @see #setServiceLevelDefinitions(ServiceLevelDefinitions)
	 * @see Gtm.GtmPackage#getFareStructure_ServiceLevelDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	ServiceLevelDefinitions getServiceLevelDefinitions();

	/**
	 * Sets the value of the '{@link Gtm.FareStructure#getServiceLevelDefinitions <em>Service Level Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Level Definitions</em>' containment reference.
	 * @see #getServiceLevelDefinitions()
	 * @generated
	 */
	void setServiceLevelDefinitions(ServiceLevelDefinitions value);

	/**
	 * Returns the value of the '<em><b>Reservation Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation Parameters</em>' containment reference.
	 * @see #setReservationParameters(ReservationParameters)
	 * @see Gtm.GtmPackage#getFareStructure_ReservationParameters()
	 * @model containment="true"
	 * @generated
	 */
	ReservationParameters getReservationParameters();

	/**
	 * Sets the value of the '{@link Gtm.FareStructure#getReservationParameters <em>Reservation Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservation Parameters</em>' containment reference.
	 * @see #getReservationParameters()
	 * @generated
	 */
	void setReservationParameters(ReservationParameters value);

	/**
	 * Returns the value of the '<em><b>Service Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Constraints</em>' containment reference.
	 * @see #setServiceConstraints(ServiceConstraints)
	 * @see Gtm.GtmPackage#getFareStructure_ServiceConstraints()
	 * @model containment="true"
	 * @generated
	 */
	ServiceConstraints getServiceConstraints();

	/**
	 * Sets the value of the '{@link Gtm.FareStructure#getServiceConstraints <em>Service Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Constraints</em>' containment reference.
	 * @see #getServiceConstraints()
	 * @generated
	 */
	void setServiceConstraints(ServiceConstraints value);

	/**
	 * Returns the value of the '<em><b>Carrier Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Constraints</em>' containment reference.
	 * @see #setCarrierConstraints(CarrierConstraints)
	 * @see Gtm.GtmPackage#getFareStructure_CarrierConstraints()
	 * @model containment="true"
	 * @generated
	 */
	CarrierConstraints getCarrierConstraints();

	/**
	 * Sets the value of the '{@link Gtm.FareStructure#getCarrierConstraints <em>Carrier Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Constraints</em>' containment reference.
	 * @see #getCarrierConstraints()
	 * @generated
	 */
	void setCarrierConstraints(CarrierConstraints value);

	/**
	 * Returns the value of the '<em><b>Reduction Cards</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reduction Cards</em>' containment reference.
	 * @see #setReductionCards(ReductionCards)
	 * @see Gtm.GtmPackage#getFareStructure_ReductionCards()
	 * @model containment="true"
	 * @generated
	 */
	ReductionCards getReductionCards();

	/**
	 * Sets the value of the '{@link Gtm.FareStructure#getReductionCards <em>Reduction Cards</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reduction Cards</em>' containment reference.
	 * @see #getReductionCards()
	 * @generated
	 */
	void setReductionCards(ReductionCards value);

	/**
	 * Returns the value of the '<em><b>Sales Availability Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Availability Constraints</em>' containment reference.
	 * @see #setSalesAvailabilityConstraints(SalesAvailabilityConstraints)
	 * @see Gtm.GtmPackage#getFareStructure_SalesAvailabilityConstraints()
	 * @model containment="true"
	 * @generated
	 */
	SalesAvailabilityConstraints getSalesAvailabilityConstraints();

	/**
	 * Sets the value of the '{@link Gtm.FareStructure#getSalesAvailabilityConstraints <em>Sales Availability Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Availability Constraints</em>' containment reference.
	 * @see #getSalesAvailabilityConstraints()
	 * @generated
	 */
	void setSalesAvailabilityConstraints(SalesAvailabilityConstraints value);

	/**
	 * Returns the value of the '<em><b>Travel Validity Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Travel Validity Constraints</em>' containment reference.
	 * @see #setTravelValidityConstraints(TravelValidityConstraints)
	 * @see Gtm.GtmPackage#getFareStructure_TravelValidityConstraints()
	 * @model containment="true"
	 * @generated
	 */
	TravelValidityConstraints getTravelValidityConstraints();

	/**
	 * Sets the value of the '{@link Gtm.FareStructure#getTravelValidityConstraints <em>Travel Validity Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Travel Validity Constraints</em>' containment reference.
	 * @see #getTravelValidityConstraints()
	 * @generated
	 */
	void setTravelValidityConstraints(TravelValidityConstraints value);

	/**
	 * Returns the value of the '<em><b>Combination Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combination Constraints</em>' containment reference.
	 * @see #setCombinationConstraints(CombinationConstraints)
	 * @see Gtm.GtmPackage#getFareStructure_CombinationConstraints()
	 * @model containment="true"
	 * @generated
	 */
	CombinationConstraints getCombinationConstraints();

	/**
	 * Sets the value of the '{@link Gtm.FareStructure#getCombinationConstraints <em>Combination Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combination Constraints</em>' containment reference.
	 * @see #getCombinationConstraints()
	 * @generated
	 */
	void setCombinationConstraints(CombinationConstraints value);

	/**
	 * Returns the value of the '<em><b>Passenger Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Constraints</em>' containment reference.
	 * @see #setPassengerConstraints(PassengerConstraints)
	 * @see Gtm.GtmPackage#getFareStructure_PassengerConstraints()
	 * @model containment="true"
	 * @generated
	 */
	PassengerConstraints getPassengerConstraints();

	/**
	 * Sets the value of the '{@link Gtm.FareStructure#getPassengerConstraints <em>Passenger Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Constraints</em>' containment reference.
	 * @see #getPassengerConstraints()
	 * @generated
	 */
	void setPassengerConstraints(PassengerConstraints value);

	/**
	 * Returns the value of the '<em><b>Personal Data Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personal Data Constraints</em>' containment reference.
	 * @see #setPersonalDataConstraints(PersonalDataConstraints)
	 * @see Gtm.GtmPackage#getFareStructure_PersonalDataConstraints()
	 * @model containment="true"
	 * @generated
	 */
	PersonalDataConstraints getPersonalDataConstraints();

	/**
	 * Sets the value of the '{@link Gtm.FareStructure#getPersonalDataConstraints <em>Personal Data Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personal Data Constraints</em>' containment reference.
	 * @see #getPersonalDataConstraints()
	 * @generated
	 */
	void setPersonalDataConstraints(PersonalDataConstraints value);

	/**
	 * Returns the value of the '<em><b>Reduction Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reduction Constraints</em>' containment reference.
	 * @see #setReductionConstraints(ReductionConstraints)
	 * @see Gtm.GtmPackage#getFareStructure_ReductionConstraints()
	 * @model containment="true"
	 * @generated
	 */
	ReductionConstraints getReductionConstraints();

	/**
	 * Sets the value of the '{@link Gtm.FareStructure#getReductionConstraints <em>Reduction Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reduction Constraints</em>' containment reference.
	 * @see #getReductionConstraints()
	 * @generated
	 */
	void setReductionConstraints(ReductionConstraints value);

	/**
	 * Returns the value of the '<em><b>Zone Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone Definitions</em>' containment reference.
	 * @see #setZoneDefinitions(ZoneDefinitions)
	 * @see Gtm.GtmPackage#getFareStructure_ZoneDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	ZoneDefinitions getZoneDefinitions();

	/**
	 * Sets the value of the '{@link Gtm.FareStructure#getZoneDefinitions <em>Zone Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone Definitions</em>' containment reference.
	 * @see #getZoneDefinitions()
	 * @generated
	 */
	void setZoneDefinitions(ZoneDefinitions value);

	/**
	 * Returns the value of the '<em><b>Fulfillment Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fulfillment Constraints</em>' containment reference.
	 * @see #setFulfillmentConstraints(FulfillmentConstraints)
	 * @see Gtm.GtmPackage#getFareStructure_FulfillmentConstraints()
	 * @model containment="true"
	 * @generated
	 */
	FulfillmentConstraints getFulfillmentConstraints();

	/**
	 * Sets the value of the '{@link Gtm.FareStructure#getFulfillmentConstraints <em>Fulfillment Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fulfillment Constraints</em>' containment reference.
	 * @see #getFulfillmentConstraints()
	 * @generated
	 */
	void setFulfillmentConstraints(FulfillmentConstraints value);

	/**
	 * Returns the value of the '<em><b>Supported Online Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Online Services</em>' containment reference.
	 * @see #setSupportedOnlineServices(SupportedOnlineServices)
	 * @see Gtm.GtmPackage#getFareStructure_SupportedOnlineServices()
	 * @model containment="true"
	 * @generated
	 */
	SupportedOnlineServices getSupportedOnlineServices();

	/**
	 * Sets the value of the '{@link Gtm.FareStructure#getSupportedOnlineServices <em>Supported Online Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supported Online Services</em>' containment reference.
	 * @see #getSupportedOnlineServices()
	 * @generated
	 */
	void setSupportedOnlineServices(SupportedOnlineServices value);

	/**
	 * Returns the value of the '<em><b>Fare Resource Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fare Resource Locations</em>' containment reference.
	 * @see #setFareResourceLocations(FareResourceLocations)
	 * @see Gtm.GtmPackage#getFareStructure_FareResourceLocations()
	 * @model containment="true"
	 * @generated
	 */
	FareResourceLocations getFareResourceLocations();

	/**
	 * Sets the value of the '{@link Gtm.FareStructure#getFareResourceLocations <em>Fare Resource Locations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fare Resource Locations</em>' containment reference.
	 * @see #getFareResourceLocations()
	 * @generated
	 */
	void setFareResourceLocations(FareResourceLocations value);

	/**
	 * Returns the value of the '<em><b>Connection Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Points</em>' containment reference.
	 * @see #setConnectionPoints(ConnectionPoints)
	 * @see Gtm.GtmPackage#getFareStructure_ConnectionPoints()
	 * @model containment="true"
	 * @generated
	 */
	ConnectionPoints getConnectionPoints();

	/**
	 * Sets the value of the '{@link Gtm.FareStructure#getConnectionPoints <em>Connection Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Points</em>' containment reference.
	 * @see #getConnectionPoints()
	 * @generated
	 */
	void setConnectionPoints(ConnectionPoints value);

} // FareStructure
