/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fare Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.FareElement#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.FareElement#getType <em>Type</em>}</li>
 *   <li>{@link Gtm.FareElement#getDataDescription <em>Data Description</em>}</li>
 *   <li>{@link Gtm.FareElement#getText <em>Text</em>}</li>
 *   <li>{@link Gtm.FareElement#getPrice <em>Price</em>}</li>
 *   <li>{@link Gtm.FareElement#getRegionalConstraint <em>Regional Constraint</em>}</li>
 *   <li>{@link Gtm.FareElement#getServiceConstraint <em>Service Constraint</em>}</li>
 *   <li>{@link Gtm.FareElement#getCarrierConstraint <em>Carrier Constraint</em>}</li>
 *   <li>{@link Gtm.FareElement#getServiceClass <em>Service Class</em>}</li>
 *   <li>{@link Gtm.FareElement#getServiceLevel <em>Service Level</em>}</li>
 *   <li>{@link Gtm.FareElement#getSalesAvailability <em>Sales Availability</em>}</li>
 *   <li>{@link Gtm.FareElement#getTravelValidity <em>Travel Validity</em>}</li>
 *   <li>{@link Gtm.FareElement#getCombinationConstraint <em>Combination Constraint</em>}</li>
 *   <li>{@link Gtm.FareElement#getFareDetailDescription <em>Fare Detail Description</em>}</li>
 *   <li>{@link Gtm.FareElement#getPersonalDataConstraint <em>Personal Data Constraint</em>}</li>
 *   <li>{@link Gtm.FareElement#getReservationParameter <em>Reservation Parameter</em>}</li>
 *   <li>{@link Gtm.FareElement#getReductionConstraint <em>Reduction Constraint</em>}</li>
 *   <li>{@link Gtm.FareElement#getFulfillmentConstraint <em>Fulfillment Constraint</em>}</li>
 *   <li>{@link Gtm.FareElement#getPassengerConstraint <em>Passenger Constraint</em>}</li>
 *   <li>{@link Gtm.FareElement#getAfterSalesRule <em>After Sales Rule</em>}</li>
 *   <li>{@link Gtm.FareElement#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link Gtm.FareElement#getLegacyAccountingIdentifier <em>Legacy Accounting Identifier</em>}</li>
 *   <li>{@link Gtm.FareElement#getLegacyConversion <em>Legacy Conversion</em>}</li>
 *   <li>{@link Gtm.FareElement#isIndividualContracts <em>Individual Contracts</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getFareElement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TYPE_MUST PRICE_MUST TEXT_MUST SERVICE_CLASS_MUST SALES_AVAILABILITY_MUST TRAVEL_VALIDITY_MUST COMBINATION_CONSTRAINT_MUST FULFILLMENT_CONSTRAINT_MUST PASSENGER_CONSTRAINT_MUST LEGACY_ACCOUNTING_MISSING CONVERSION_MISSING'"
 * @generated
 */
public interface FareElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Gtm.GtmPackage#getFareElement_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Gtm.FareElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.FareType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see Gtm.FareType
	 * @see #setType(FareType)
	 * @see Gtm.GtmPackage#getFareElement_Type()
	 * @model
	 * @generated
	 */
	FareType getType();

	/**
	 * Sets the value of the '{@link Gtm.FareElement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see Gtm.FareType
	 * @see #getType()
	 * @generated
	 */
	void setType(FareType value);

	/**
	 * Returns the value of the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Description</em>' attribute.
	 * @see #setDataDescription(String)
	 * @see Gtm.GtmPackage#getFareElement_DataDescription()
	 * @model
	 * @generated
	 */
	String getDataDescription();

	/**
	 * Sets the value of the '{@link Gtm.FareElement#getDataDescription <em>Data Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Description</em>' attribute.
	 * @see #getDataDescription()
	 * @generated
	 */
	void setDataDescription(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' reference.
	 * @see #setText(Text)
	 * @see Gtm.GtmPackage#getFareElement_Text()
	 * @model
	 * @generated
	 */
	Text getText();

	/**
	 * Sets the value of the '{@link Gtm.FareElement#getText <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(Text value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' reference.
	 * @see #setPrice(Price)
	 * @see Gtm.GtmPackage#getFareElement_Price()
	 * @model
	 * @generated
	 */
	Price getPrice();

	/**
	 * Sets the value of the '{@link Gtm.FareElement#getPrice <em>Price</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' reference.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(Price value);

	/**
	 * Returns the value of the '<em><b>Regional Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regional Constraint</em>' reference.
	 * @see #setRegionalConstraint(RegionalConstraint)
	 * @see Gtm.GtmPackage#getFareElement_RegionalConstraint()
	 * @model
	 * @generated
	 */
	RegionalConstraint getRegionalConstraint();

	/**
	 * Sets the value of the '{@link Gtm.FareElement#getRegionalConstraint <em>Regional Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regional Constraint</em>' reference.
	 * @see #getRegionalConstraint()
	 * @generated
	 */
	void setRegionalConstraint(RegionalConstraint value);

	/**
	 * Returns the value of the '<em><b>Service Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Constraint</em>' reference.
	 * @see #setServiceConstraint(ServiceConstraint)
	 * @see Gtm.GtmPackage#getFareElement_ServiceConstraint()
	 * @model
	 * @generated
	 */
	ServiceConstraint getServiceConstraint();

	/**
	 * Sets the value of the '{@link Gtm.FareElement#getServiceConstraint <em>Service Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Constraint</em>' reference.
	 * @see #getServiceConstraint()
	 * @generated
	 */
	void setServiceConstraint(ServiceConstraint value);

	/**
	 * Returns the value of the '<em><b>Carrier Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Constraint</em>' reference.
	 * @see #setCarrierConstraint(CarrierConstraint)
	 * @see Gtm.GtmPackage#getFareElement_CarrierConstraint()
	 * @model
	 * @generated
	 */
	CarrierConstraint getCarrierConstraint();

	/**
	 * Sets the value of the '{@link Gtm.FareElement#getCarrierConstraint <em>Carrier Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Constraint</em>' reference.
	 * @see #getCarrierConstraint()
	 * @generated
	 */
	void setCarrierConstraint(CarrierConstraint value);

	/**
	 * Returns the value of the '<em><b>Service Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Class</em>' reference.
	 * @see #setServiceClass(ServiceClass)
	 * @see Gtm.GtmPackage#getFareElement_ServiceClass()
	 * @model
	 * @generated
	 */
	ServiceClass getServiceClass();

	/**
	 * Sets the value of the '{@link Gtm.FareElement#getServiceClass <em>Service Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Class</em>' reference.
	 * @see #getServiceClass()
	 * @generated
	 */
	void setServiceClass(ServiceClass value);

	/**
	 * Returns the value of the '<em><b>Service Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Level</em>' reference.
	 * @see #setServiceLevel(ServiceLevel)
	 * @see Gtm.GtmPackage#getFareElement_ServiceLevel()
	 * @model
	 * @generated
	 */
	ServiceLevel getServiceLevel();

	/**
	 * Sets the value of the '{@link Gtm.FareElement#getServiceLevel <em>Service Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Level</em>' reference.
	 * @see #getServiceLevel()
	 * @generated
	 */
	void setServiceLevel(ServiceLevel value);

	/**
	 * Returns the value of the '<em><b>Sales Availability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Availability</em>' reference.
	 * @see #setSalesAvailability(SalesAvailabilityConstraint)
	 * @see Gtm.GtmPackage#getFareElement_SalesAvailability()
	 * @model
	 * @generated
	 */
	SalesAvailabilityConstraint getSalesAvailability();

	/**
	 * Sets the value of the '{@link Gtm.FareElement#getSalesAvailability <em>Sales Availability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Availability</em>' reference.
	 * @see #getSalesAvailability()
	 * @generated
	 */
	void setSalesAvailability(SalesAvailabilityConstraint value);

	/**
	 * Returns the value of the '<em><b>Travel Validity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Travel Validity</em>' reference.
	 * @see #setTravelValidity(TravelValidityConstraint)
	 * @see Gtm.GtmPackage#getFareElement_TravelValidity()
	 * @model
	 * @generated
	 */
	TravelValidityConstraint getTravelValidity();

	/**
	 * Sets the value of the '{@link Gtm.FareElement#getTravelValidity <em>Travel Validity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Travel Validity</em>' reference.
	 * @see #getTravelValidity()
	 * @generated
	 */
	void setTravelValidity(TravelValidityConstraint value);

	/**
	 * Returns the value of the '<em><b>Combination Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combination Constraint</em>' reference.
	 * @see #setCombinationConstraint(CombinationConstraint)
	 * @see Gtm.GtmPackage#getFareElement_CombinationConstraint()
	 * @model
	 * @generated
	 */
	CombinationConstraint getCombinationConstraint();

	/**
	 * Sets the value of the '{@link Gtm.FareElement#getCombinationConstraint <em>Combination Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combination Constraint</em>' reference.
	 * @see #getCombinationConstraint()
	 * @generated
	 */
	void setCombinationConstraint(CombinationConstraint value);

	/**
	 * Returns the value of the '<em><b>Fare Detail Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fare Detail Description</em>' reference.
	 * @see #setFareDetailDescription(Text)
	 * @see Gtm.GtmPackage#getFareElement_FareDetailDescription()
	 * @model
	 * @generated
	 */
	Text getFareDetailDescription();

	/**
	 * Sets the value of the '{@link Gtm.FareElement#getFareDetailDescription <em>Fare Detail Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fare Detail Description</em>' reference.
	 * @see #getFareDetailDescription()
	 * @generated
	 */
	void setFareDetailDescription(Text value);

	/**
	 * Returns the value of the '<em><b>Personal Data Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personal Data Constraint</em>' reference.
	 * @see #setPersonalDataConstraint(PersonalDataConstraint)
	 * @see Gtm.GtmPackage#getFareElement_PersonalDataConstraint()
	 * @model
	 * @generated
	 */
	PersonalDataConstraint getPersonalDataConstraint();

	/**
	 * Sets the value of the '{@link Gtm.FareElement#getPersonalDataConstraint <em>Personal Data Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personal Data Constraint</em>' reference.
	 * @see #getPersonalDataConstraint()
	 * @generated
	 */
	void setPersonalDataConstraint(PersonalDataConstraint value);

	/**
	 * Returns the value of the '<em><b>Reservation Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation Parameter</em>' reference.
	 * @see #setReservationParameter(ReservationParameter)
	 * @see Gtm.GtmPackage#getFareElement_ReservationParameter()
	 * @model
	 * @generated
	 */
	ReservationParameter getReservationParameter();

	/**
	 * Sets the value of the '{@link Gtm.FareElement#getReservationParameter <em>Reservation Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservation Parameter</em>' reference.
	 * @see #getReservationParameter()
	 * @generated
	 */
	void setReservationParameter(ReservationParameter value);

	/**
	 * Returns the value of the '<em><b>Reduction Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reduction Constraint</em>' reference.
	 * @see #setReductionConstraint(ReductionConstraint)
	 * @see Gtm.GtmPackage#getFareElement_ReductionConstraint()
	 * @model
	 * @generated
	 */
	ReductionConstraint getReductionConstraint();

	/**
	 * Sets the value of the '{@link Gtm.FareElement#getReductionConstraint <em>Reduction Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reduction Constraint</em>' reference.
	 * @see #getReductionConstraint()
	 * @generated
	 */
	void setReductionConstraint(ReductionConstraint value);

	/**
	 * Returns the value of the '<em><b>Fulfillment Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fulfillment Constraint</em>' reference.
	 * @see #setFulfillmentConstraint(FulfillmentConstraint)
	 * @see Gtm.GtmPackage#getFareElement_FulfillmentConstraint()
	 * @model
	 * @generated
	 */
	FulfillmentConstraint getFulfillmentConstraint();

	/**
	 * Sets the value of the '{@link Gtm.FareElement#getFulfillmentConstraint <em>Fulfillment Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fulfillment Constraint</em>' reference.
	 * @see #getFulfillmentConstraint()
	 * @generated
	 */
	void setFulfillmentConstraint(FulfillmentConstraint value);

	/**
	 * Returns the value of the '<em><b>Passenger Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Constraint</em>' reference.
	 * @see #setPassengerConstraint(PassengerConstraint)
	 * @see Gtm.GtmPackage#getFareElement_PassengerConstraint()
	 * @model
	 * @generated
	 */
	PassengerConstraint getPassengerConstraint();

	/**
	 * Sets the value of the '{@link Gtm.FareElement#getPassengerConstraint <em>Passenger Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Constraint</em>' reference.
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	void setPassengerConstraint(PassengerConstraint value);

	/**
	 * Returns the value of the '<em><b>After Sales Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Sales Rule</em>' reference.
	 * @see #setAfterSalesRule(AfterSalesRule)
	 * @see Gtm.GtmPackage#getFareElement_AfterSalesRule()
	 * @model
	 * @generated
	 */
	AfterSalesRule getAfterSalesRule();

	/**
	 * Sets the value of the '{@link Gtm.FareElement#getAfterSalesRule <em>After Sales Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After Sales Rule</em>' reference.
	 * @see #getAfterSalesRule()
	 * @generated
	 */
	void setAfterSalesRule(AfterSalesRule value);

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.DataSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' attribute.
	 * @see Gtm.DataSource
	 * @see #setDataSource(DataSource)
	 * @see Gtm.GtmPackage#getFareElement_DataSource()
	 * @model
	 * @generated
	 */
	DataSource getDataSource();

	/**
	 * Sets the value of the '{@link Gtm.FareElement#getDataSource <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' attribute.
	 * @see Gtm.DataSource
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(DataSource value);

	/**
	 * Returns the value of the '<em><b>Legacy Accounting Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Accounting Identifier</em>' containment reference.
	 * @see #setLegacyAccountingIdentifier(LegacyAccountingIdentifier)
	 * @see Gtm.GtmPackage#getFareElement_LegacyAccountingIdentifier()
	 * @model containment="true"
	 * @generated
	 */
	LegacyAccountingIdentifier getLegacyAccountingIdentifier();

	/**
	 * Sets the value of the '{@link Gtm.FareElement#getLegacyAccountingIdentifier <em>Legacy Accounting Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legacy Accounting Identifier</em>' containment reference.
	 * @see #getLegacyAccountingIdentifier()
	 * @generated
	 */
	void setLegacyAccountingIdentifier(LegacyAccountingIdentifier value);

	/**
	 * Returns the value of the '<em><b>Legacy Conversion</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.LegacyConversionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Conversion</em>' attribute.
	 * @see Gtm.LegacyConversionType
	 * @see #setLegacyConversion(LegacyConversionType)
	 * @see Gtm.GtmPackage#getFareElement_LegacyConversion()
	 * @model
	 * @generated
	 */
	LegacyConversionType getLegacyConversion();

	/**
	 * Sets the value of the '{@link Gtm.FareElement#getLegacyConversion <em>Legacy Conversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legacy Conversion</em>' attribute.
	 * @see Gtm.LegacyConversionType
	 * @see #getLegacyConversion()
	 * @generated
	 */
	void setLegacyConversion(LegacyConversionType value);

	/**
	 * Returns the value of the '<em><b>Individual Contracts</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual Contracts</em>' attribute.
	 * @see #setIndividualContracts(boolean)
	 * @see Gtm.GtmPackage#getFareElement_IndividualContracts()
	 * @model default="false"
	 * @generated
	 */
	boolean isIndividualContracts();

	/**
	 * Sets the value of the '{@link Gtm.FareElement#isIndividualContracts <em>Individual Contracts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual Contracts</em>' attribute.
	 * @see #isIndividualContracts()
	 * @generated
	 */
	void setIndividualContracts(boolean value);

} // FareElement
