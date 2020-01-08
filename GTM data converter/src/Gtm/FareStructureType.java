/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fare Structure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.FareStructureType#getFareElements <em>Fare Elements</em>}</li>
 *   <li>{@link Gtm.FareStructureType#getCalendars <em>Calendars</em>}</li>
 *   <li>{@link Gtm.FareStructureType#getServiceClassDefinitions <em>Service Class Definitions</em>}</li>
 *   <li>{@link Gtm.FareStructureType#getPrices <em>Prices</em>}</li>
 *   <li>{@link Gtm.FareStructureType#getRegionalConstraints <em>Regional Constraints</em>}</li>
 *   <li>{@link Gtm.FareStructureType#getTexts <em>Texts</em>}</li>
 *   <li>{@link Gtm.FareStructureType#getServiceLevelDefinitions <em>Service Level Definitions</em>}</li>
 *   <li>{@link Gtm.FareStructureType#getReservationParameters <em>Reservation Parameters</em>}</li>
 *   <li>{@link Gtm.FareStructureType#getServiceConstraints <em>Service Constraints</em>}</li>
 *   <li>{@link Gtm.FareStructureType#getCarrierConstraints <em>Carrier Constraints</em>}</li>
 *   <li>{@link Gtm.FareStructureType#getReductionCards <em>Reduction Cards</em>}</li>
 *   <li>{@link Gtm.FareStructureType#getSalesAvailabilityConstraints <em>Sales Availability Constraints</em>}</li>
 *   <li>{@link Gtm.FareStructureType#getTravelValidityConstraints <em>Travel Validity Constraints</em>}</li>
 *   <li>{@link Gtm.FareStructureType#getCombinationConstraints <em>Combination Constraints</em>}</li>
 *   <li>{@link Gtm.FareStructureType#getPassengerConstraints <em>Passenger Constraints</em>}</li>
 *   <li>{@link Gtm.FareStructureType#getZoneDefinitions <em>Zone Definitions</em>}</li>
 *   <li>{@link Gtm.FareStructureType#getFareResourceLocations <em>Fare Resource Locations</em>}</li>
 *   <li>{@link Gtm.FareStructureType#getSupportedOnlineServices <em>Supported Online Services</em>}</li>
 *   <li>{@link Gtm.FareStructureType#getFullfillmentConstraints <em>Fullfillment Constraints</em>}</li>
 *   <li>{@link Gtm.FareStructureType#getReductionConstraints <em>Reduction Constraints</em>}</li>
 *   <li>{@link Gtm.FareStructureType#getPersonalDataConstraints <em>Personal Data Constraints</em>}</li>
 *   <li>{@link Gtm.FareStructureType#getAfterSalesConditions <em>After Sales Conditions</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getFareStructureType()
 * @model
 * @generated
 */
public interface FareStructureType extends EObject {
	/**
	 * Returns the value of the '<em><b>Fare Elements</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.FareElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fare Elements</em>' containment reference list.
	 * @see Gtm.GtmPackage#getFareStructureType_FareElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<FareElement> getFareElements();

	/**
	 * Returns the value of the '<em><b>Calendars</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.Calendar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calendars</em>' containment reference list.
	 * @see Gtm.GtmPackage#getFareStructureType_Calendars()
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
	 * @see Gtm.GtmPackage#getFareStructureType_ServiceClassDefinitions()
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
	 * @see Gtm.GtmPackage#getFareStructureType_Prices()
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
	 * @see Gtm.GtmPackage#getFareStructureType_RegionalConstraints()
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
	 * @see Gtm.GtmPackage#getFareStructureType_Texts()
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
	 * @see Gtm.GtmPackage#getFareStructureType_ServiceLevelDefinitions()
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
	 * @see Gtm.GtmPackage#getFareStructureType_ReservationParameters()
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
	 * @see Gtm.GtmPackage#getFareStructureType_ServiceConstraints()
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
	 * @see Gtm.GtmPackage#getFareStructureType_CarrierConstraints()
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
	 * @see Gtm.GtmPackage#getFareStructureType_ReductionCards()
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
	 * @see Gtm.GtmPackage#getFareStructureType_SalesAvailabilityConstraints()
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
	 * @see Gtm.GtmPackage#getFareStructureType_TravelValidityConstraints()
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
	 * @see Gtm.GtmPackage#getFareStructureType_CombinationConstraints()
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
	 * @see Gtm.GtmPackage#getFareStructureType_PassengerConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<PassengerConstraint> getPassengerConstraints();

	/**
	 * Returns the value of the '<em><b>Zone Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.ZoneDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone Definitions</em>' containment reference list.
	 * @see Gtm.GtmPackage#getFareStructureType_ZoneDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ZoneDefinition> getZoneDefinitions();

	/**
	 * Returns the value of the '<em><b>Fare Resource Locations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fare Resource Locations</em>' attribute.
	 * @see #setFareResourceLocations(String)
	 * @see Gtm.GtmPackage#getFareStructureType_FareResourceLocations()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getFareResourceLocations();

	/**
	 * Sets the value of the '{@link Gtm.FareStructureType#getFareResourceLocations <em>Fare Resource Locations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fare Resource Locations</em>' attribute.
	 * @see #getFareResourceLocations()
	 * @generated
	 */
	void setFareResourceLocations(String value);

	/**
	 * Returns the value of the '<em><b>Supported Online Services</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Online Services</em>' attribute.
	 * @see #setSupportedOnlineServices(String)
	 * @see Gtm.GtmPackage#getFareStructureType_SupportedOnlineServices()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getSupportedOnlineServices();

	/**
	 * Sets the value of the '{@link Gtm.FareStructureType#getSupportedOnlineServices <em>Supported Online Services</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supported Online Services</em>' attribute.
	 * @see #getSupportedOnlineServices()
	 * @generated
	 */
	void setSupportedOnlineServices(String value);

	/**
	 * Returns the value of the '<em><b>Fullfillment Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fullfillment Constraints</em>' attribute.
	 * @see #setFullfillmentConstraints(String)
	 * @see Gtm.GtmPackage#getFareStructureType_FullfillmentConstraints()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getFullfillmentConstraints();

	/**
	 * Sets the value of the '{@link Gtm.FareStructureType#getFullfillmentConstraints <em>Fullfillment Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fullfillment Constraints</em>' attribute.
	 * @see #getFullfillmentConstraints()
	 * @generated
	 */
	void setFullfillmentConstraints(String value);

	/**
	 * Returns the value of the '<em><b>Reduction Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reduction Constraints</em>' attribute.
	 * @see #setReductionConstraints(String)
	 * @see Gtm.GtmPackage#getFareStructureType_ReductionConstraints()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getReductionConstraints();

	/**
	 * Sets the value of the '{@link Gtm.FareStructureType#getReductionConstraints <em>Reduction Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reduction Constraints</em>' attribute.
	 * @see #getReductionConstraints()
	 * @generated
	 */
	void setReductionConstraints(String value);

	/**
	 * Returns the value of the '<em><b>Personal Data Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personal Data Constraints</em>' attribute.
	 * @see #setPersonalDataConstraints(String)
	 * @see Gtm.GtmPackage#getFareStructureType_PersonalDataConstraints()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getPersonalDataConstraints();

	/**
	 * Sets the value of the '{@link Gtm.FareStructureType#getPersonalDataConstraints <em>Personal Data Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personal Data Constraints</em>' attribute.
	 * @see #getPersonalDataConstraints()
	 * @generated
	 */
	void setPersonalDataConstraints(String value);

	/**
	 * Returns the value of the '<em><b>After Sales Conditions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Sales Conditions</em>' attribute.
	 * @see #setAfterSalesConditions(String)
	 * @see Gtm.GtmPackage#getFareStructureType_AfterSalesConditions()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getAfterSalesConditions();

	/**
	 * Sets the value of the '{@link Gtm.FareStructureType#getAfterSalesConditions <em>After Sales Conditions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After Sales Conditions</em>' attribute.
	 * @see #getAfterSalesConditions()
	 * @generated
	 */
	void setAfterSalesConditions(String value);

} // FareStructureType
