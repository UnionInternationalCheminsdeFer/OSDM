/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link Gtm.FareStructure#getAfterSalesRules <em>After Sales Rules</em>}</li>
 *   <li>{@link Gtm.FareStructure#getCalendars <em>Calendars</em>}</li>
 *   <li>{@link Gtm.FareStructure#getServiceClassDefinitions <em>Service Class Definitions</em>}</li>
 *   <li>{@link Gtm.FareStructure#getPrices <em>Prices</em>}</li>
 *   <li>{@link Gtm.FareStructure#getRegionalConstraints <em>Regional Constraints</em>}</li>
 *   <li>{@link Gtm.FareStructure#getTexts <em>Texts</em>}</li>
 *   <li>{@link Gtm.FareStructure#getServiceLevelDefinitions <em>Service Level Definitions</em>}</li>
 *   <li>{@link Gtm.FareStructure#getReservationParameters <em>Reservation Parameters</em>}</li>
 *   <li>{@link Gtm.FareStructure#getServiceConstraints <em>Service Constraints</em>}</li>
 *   <li>{@link Gtm.FareStructure#getCarrierConstraints <em>Carrier Constraints</em>}</li>
 *   <li>{@link Gtm.FareStructure#getReductionCards <em>Reduction Cards</em>}</li>
 *   <li>{@link Gtm.FareStructure#getSalesAvailabilityConstraints <em>Sales Availability Constraints</em>}</li>
 *   <li>{@link Gtm.FareStructure#getTravelValidityConstraints <em>Travel Validity Constraints</em>}</li>
 *   <li>{@link Gtm.FareStructure#getCombinationConstraints <em>Combination Constraints</em>}</li>
 *   <li>{@link Gtm.FareStructure#getPassengerConstraints <em>Passenger Constraints</em>}</li>
 *   <li>{@link Gtm.FareStructure#getPersonalDataConstraints <em>Personal Data Constraints</em>}</li>
 *   <li>{@link Gtm.FareStructure#getReductionConstraints <em>Reduction Constraints</em>}</li>
 *   <li>{@link Gtm.FareStructure#getZoneDefinitions <em>Zone Definitions</em>}</li>
 *   <li>{@link Gtm.FareStructure#getSupportedOnlineServices <em>Supported Online Services</em>}</li>
 *   <li>{@link Gtm.FareStructure#getFulfillmentConstraint <em>Fulfillment Constraint</em>}</li>
 *   <li>{@link Gtm.FareStructure#getFareResourceLocations <em>Fare Resource Locations</em>}</li>
 *   <li>{@link Gtm.FareStructure#getConnectionPoints <em>Connection Points</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getFareStructure()
 * @model
 * @generated
 */
public interface FareStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Fare Elements</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.FareElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fare Elements</em>' containment reference list.
	 * @see Gtm.GtmPackage#getFareStructure_FareElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<FareElement> getFareElements();

	/**
	 * Returns the value of the '<em><b>After Sales Rules</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.AfterSalesRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Sales Rules</em>' containment reference list.
	 * @see Gtm.GtmPackage#getFareStructure_AfterSalesRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<AfterSalesRule> getAfterSalesRules();

	/**
	 * Returns the value of the '<em><b>Calendars</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.Calendar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calendars</em>' containment reference list.
	 * @see Gtm.GtmPackage#getFareStructure_Calendars()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Calendar> getCalendars();

	/**
	 * Returns the value of the '<em><b>Service Class Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.ServiceClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Class Definitions</em>' containment reference list.
	 * @see Gtm.GtmPackage#getFareStructure_ServiceClassDefinitions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ServiceClass> getServiceClassDefinitions();

	/**
	 * Returns the value of the '<em><b>Prices</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.Price}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prices</em>' containment reference list.
	 * @see Gtm.GtmPackage#getFareStructure_Prices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Price> getPrices();

	/**
	 * Returns the value of the '<em><b>Regional Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.RegionalConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regional Constraints</em>' containment reference list.
	 * @see Gtm.GtmPackage#getFareStructure_RegionalConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<RegionalConstraint> getRegionalConstraints();

	/**
	 * Returns the value of the '<em><b>Texts</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.Text}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texts</em>' containment reference list.
	 * @see Gtm.GtmPackage#getFareStructure_Texts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Text> getTexts();

	/**
	 * Returns the value of the '<em><b>Service Level Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.ServiceLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Level Definitions</em>' containment reference list.
	 * @see Gtm.GtmPackage#getFareStructure_ServiceLevelDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceLevel> getServiceLevelDefinitions();

	/**
	 * Returns the value of the '<em><b>Reservation Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.ReservationParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation Parameters</em>' containment reference list.
	 * @see Gtm.GtmPackage#getFareStructure_ReservationParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReservationParameter> getReservationParameters();

	/**
	 * Returns the value of the '<em><b>Service Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.ServiceConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Constraints</em>' containment reference list.
	 * @see Gtm.GtmPackage#getFareStructure_ServiceConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceConstraint> getServiceConstraints();

	/**
	 * Returns the value of the '<em><b>Carrier Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.CarrierConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Constraints</em>' containment reference list.
	 * @see Gtm.GtmPackage#getFareStructure_CarrierConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<CarrierConstraint> getCarrierConstraints();

	/**
	 * Returns the value of the '<em><b>Reduction Cards</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.ReductionCard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reduction Cards</em>' containment reference list.
	 * @see Gtm.GtmPackage#getFareStructure_ReductionCards()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReductionCard> getReductionCards();

	/**
	 * Returns the value of the '<em><b>Sales Availability Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.SalesAvailabilityConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Availability Constraints</em>' containment reference list.
	 * @see Gtm.GtmPackage#getFareStructure_SalesAvailabilityConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<SalesAvailabilityConstraint> getSalesAvailabilityConstraints();

	/**
	 * Returns the value of the '<em><b>Travel Validity Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.TravelValidityConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Travel Validity Constraints</em>' containment reference list.
	 * @see Gtm.GtmPackage#getFareStructure_TravelValidityConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<TravelValidityConstraint> getTravelValidityConstraints();

	/**
	 * Returns the value of the '<em><b>Combination Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.CombinationConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combination Constraints</em>' containment reference list.
	 * @see Gtm.GtmPackage#getFareStructure_CombinationConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<CombinationConstraint> getCombinationConstraints();

	/**
	 * Returns the value of the '<em><b>Passenger Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.PassengerConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Constraints</em>' containment reference list.
	 * @see Gtm.GtmPackage#getFareStructure_PassengerConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<PassengerConstraint> getPassengerConstraints();

	/**
	 * Returns the value of the '<em><b>Personal Data Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.PersonalDataConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personal Data Constraints</em>' containment reference list.
	 * @see Gtm.GtmPackage#getFareStructure_PersonalDataConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<PersonalDataConstraint> getPersonalDataConstraints();

	/**
	 * Returns the value of the '<em><b>Reduction Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.ReductionConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reduction Constraints</em>' containment reference list.
	 * @see Gtm.GtmPackage#getFareStructure_ReductionConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReductionConstraint> getReductionConstraints();

	/**
	 * Returns the value of the '<em><b>Zone Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.ZoneDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone Definitions</em>' containment reference list.
	 * @see Gtm.GtmPackage#getFareStructure_ZoneDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ZoneDefinition> getZoneDefinitions();

	/**
	 * Returns the value of the '<em><b>Supported Online Services</b></em>' attribute list.
	 * The list contents are of type {@link Gtm.OnlineServiceType}.
	 * The literals are from the enumeration {@link Gtm.OnlineServiceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Online Services</em>' attribute list.
	 * @see Gtm.OnlineServiceType
	 * @see Gtm.GtmPackage#getFareStructure_SupportedOnlineServices()
	 * @model
	 * @generated
	 */
	EList<OnlineServiceType> getSupportedOnlineServices();

	/**
	 * Returns the value of the '<em><b>Fulfillment Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.FulfillmentConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fulfillment Constraint</em>' containment reference list.
	 * @see Gtm.GtmPackage#getFareStructure_FulfillmentConstraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<FulfillmentConstraint> getFulfillmentConstraint();

	/**
	 * Returns the value of the '<em><b>Fare Resource Locations</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.FareResourceLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fare Resource Locations</em>' containment reference list.
	 * @see Gtm.GtmPackage#getFareStructure_FareResourceLocations()
	 * @model containment="true"
	 * @generated
	 */
	EList<FareResourceLocation> getFareResourceLocations();

	/**
	 * Returns the value of the '<em><b>Connection Points</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.ConnectionPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Points</em>' containment reference list.
	 * @see Gtm.GtmPackage#getFareStructure_ConnectionPoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectionPoint> getConnectionPoints();

} // FareStructure
