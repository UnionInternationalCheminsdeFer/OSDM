/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Fare Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.TargetFareTemplate#getPriceFactor <em>Price Factor</em>}</li>
 *   <li>{@link Gtm.TargetFareTemplate#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.TargetFareTemplate#getType <em>Type</em>}</li>
 *   <li>{@link Gtm.TargetFareTemplate#getDataDescription <em>Data Description</em>}</li>
 *   <li>{@link Gtm.TargetFareTemplate#getText <em>Text</em>}</li>
 *   <li>{@link Gtm.TargetFareTemplate#getPrice <em>Price</em>}</li>
 *   <li>{@link Gtm.TargetFareTemplate#getRegionalConstraint <em>Regional Constraint</em>}</li>
 *   <li>{@link Gtm.TargetFareTemplate#getServiceConstraint <em>Service Constraint</em>}</li>
 *   <li>{@link Gtm.TargetFareTemplate#getCarrierConstraint <em>Carrier Constraint</em>}</li>
 *   <li>{@link Gtm.TargetFareTemplate#getServiceClass <em>Service Class</em>}</li>
 *   <li>{@link Gtm.TargetFareTemplate#getServiceLevel <em>Service Level</em>}</li>
 *   <li>{@link Gtm.TargetFareTemplate#getSalesAvailability <em>Sales Availability</em>}</li>
 *   <li>{@link Gtm.TargetFareTemplate#getTravelValidity <em>Travel Validity</em>}</li>
 *   <li>{@link Gtm.TargetFareTemplate#getCombinationConstraint <em>Combination Constraint</em>}</li>
 *   <li>{@link Gtm.TargetFareTemplate#getFareDetailDescription <em>Fare Detail Description</em>}</li>
 *   <li>{@link Gtm.TargetFareTemplate#getLegacyAccountingIdentifier <em>Legacy Accounting Identifier</em>}</li>
 *   <li>{@link Gtm.TargetFareTemplate#getPersonalDataConstraint <em>Personal Data Constraint</em>}</li>
 *   <li>{@link Gtm.TargetFareTemplate#getReservationParameter <em>Reservation Parameter</em>}</li>
 *   <li>{@link Gtm.TargetFareTemplate#getReductionConstraint <em>Reduction Constraint</em>}</li>
 *   <li>{@link Gtm.TargetFareTemplate#getFulfillmentConstraint <em>Fulfillment Constraint</em>}</li>
 *   <li>{@link Gtm.TargetFareTemplate#getPassengerConstraint <em>Passenger Constraint</em>}</li>
 *   <li>{@link Gtm.TargetFareTemplate#getAfterSalesRule <em>After Sales Rule</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getTargetFareTemplate()
 * @model
 * @generated
 */
public interface TargetFareTemplate extends EObject {
	/**
	 * Returns the value of the '<em><b>Price Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price Factor</em>' attribute.
	 * @see #isSetPriceFactor()
	 * @see #unsetPriceFactor()
	 * @see #setPriceFactor(float)
	 * @see Gtm.GtmPackage#getTargetFareTemplate_PriceFactor()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 * @generated
	 */
	float getPriceFactor();

	/**
	 * Sets the value of the '{@link Gtm.TargetFareTemplate#getPriceFactor <em>Price Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price Factor</em>' attribute.
	 * @see #isSetPriceFactor()
	 * @see #unsetPriceFactor()
	 * @see #getPriceFactor()
	 * @generated
	 */
	void setPriceFactor(float value);

	/**
	 * Unsets the value of the '{@link Gtm.TargetFareTemplate#getPriceFactor <em>Price Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriceFactor()
	 * @see #getPriceFactor()
	 * @see #setPriceFactor(float)
	 * @generated
	 */
	void unsetPriceFactor();

	/**
	 * Returns whether the value of the '{@link Gtm.TargetFareTemplate#getPriceFactor <em>Price Factor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Price Factor</em>' attribute is set.
	 * @see #unsetPriceFactor()
	 * @see #getPriceFactor()
	 * @see #setPriceFactor(float)
	 * @generated
	 */
	boolean isSetPriceFactor();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Gtm.GtmPackage#getTargetFareTemplate_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Gtm.TargetFareTemplate#getId <em>Id</em>}' attribute.
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
	 * @see Gtm.GtmPackage#getTargetFareTemplate_Type()
	 * @model
	 * @generated
	 */
	FareType getType();

	/**
	 * Sets the value of the '{@link Gtm.TargetFareTemplate#getType <em>Type</em>}' attribute.
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
	 * @see Gtm.GtmPackage#getTargetFareTemplate_DataDescription()
	 * @model
	 * @generated
	 */
	String getDataDescription();

	/**
	 * Sets the value of the '{@link Gtm.TargetFareTemplate#getDataDescription <em>Data Description</em>}' attribute.
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
	 * @see Gtm.GtmPackage#getTargetFareTemplate_Text()
	 * @model
	 * @generated
	 */
	Text getText();

	/**
	 * Sets the value of the '{@link Gtm.TargetFareTemplate#getText <em>Text</em>}' reference.
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
	 * @see Gtm.GtmPackage#getTargetFareTemplate_Price()
	 * @model
	 * @generated
	 */
	Price getPrice();

	/**
	 * Sets the value of the '{@link Gtm.TargetFareTemplate#getPrice <em>Price</em>}' reference.
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
	 * @see Gtm.GtmPackage#getTargetFareTemplate_RegionalConstraint()
	 * @model
	 * @generated
	 */
	RegionalConstraint getRegionalConstraint();

	/**
	 * Sets the value of the '{@link Gtm.TargetFareTemplate#getRegionalConstraint <em>Regional Constraint</em>}' reference.
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
	 * @see Gtm.GtmPackage#getTargetFareTemplate_ServiceConstraint()
	 * @model
	 * @generated
	 */
	ServiceConstraint getServiceConstraint();

	/**
	 * Sets the value of the '{@link Gtm.TargetFareTemplate#getServiceConstraint <em>Service Constraint</em>}' reference.
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
	 * @see Gtm.GtmPackage#getTargetFareTemplate_CarrierConstraint()
	 * @model
	 * @generated
	 */
	CarrierConstraint getCarrierConstraint();

	/**
	 * Sets the value of the '{@link Gtm.TargetFareTemplate#getCarrierConstraint <em>Carrier Constraint</em>}' reference.
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
	 * @see Gtm.GtmPackage#getTargetFareTemplate_ServiceClass()
	 * @model
	 * @generated
	 */
	ServiceClass getServiceClass();

	/**
	 * Sets the value of the '{@link Gtm.TargetFareTemplate#getServiceClass <em>Service Class</em>}' reference.
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
	 * @see Gtm.GtmPackage#getTargetFareTemplate_ServiceLevel()
	 * @model
	 * @generated
	 */
	ServiceLevel getServiceLevel();

	/**
	 * Sets the value of the '{@link Gtm.TargetFareTemplate#getServiceLevel <em>Service Level</em>}' reference.
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
	 * @see Gtm.GtmPackage#getTargetFareTemplate_SalesAvailability()
	 * @model
	 * @generated
	 */
	SalesAvailabilityConstraint getSalesAvailability();

	/**
	 * Sets the value of the '{@link Gtm.TargetFareTemplate#getSalesAvailability <em>Sales Availability</em>}' reference.
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
	 * @see Gtm.GtmPackage#getTargetFareTemplate_TravelValidity()
	 * @model
	 * @generated
	 */
	TravelValidityConstraint getTravelValidity();

	/**
	 * Sets the value of the '{@link Gtm.TargetFareTemplate#getTravelValidity <em>Travel Validity</em>}' reference.
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
	 * @see Gtm.GtmPackage#getTargetFareTemplate_CombinationConstraint()
	 * @model
	 * @generated
	 */
	CombinationConstraint getCombinationConstraint();

	/**
	 * Sets the value of the '{@link Gtm.TargetFareTemplate#getCombinationConstraint <em>Combination Constraint</em>}' reference.
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
	 * @see Gtm.GtmPackage#getTargetFareTemplate_FareDetailDescription()
	 * @model
	 * @generated
	 */
	Text getFareDetailDescription();

	/**
	 * Sets the value of the '{@link Gtm.TargetFareTemplate#getFareDetailDescription <em>Fare Detail Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fare Detail Description</em>' reference.
	 * @see #getFareDetailDescription()
	 * @generated
	 */
	void setFareDetailDescription(Text value);

	/**
	 * Returns the value of the '<em><b>Legacy Accounting Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Accounting Identifier</em>' containment reference.
	 * @see #setLegacyAccountingIdentifier(LegacyAccountingIdentifier)
	 * @see Gtm.GtmPackage#getTargetFareTemplate_LegacyAccountingIdentifier()
	 * @model containment="true"
	 * @generated
	 */
	LegacyAccountingIdentifier getLegacyAccountingIdentifier();

	/**
	 * Sets the value of the '{@link Gtm.TargetFareTemplate#getLegacyAccountingIdentifier <em>Legacy Accounting Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legacy Accounting Identifier</em>' containment reference.
	 * @see #getLegacyAccountingIdentifier()
	 * @generated
	 */
	void setLegacyAccountingIdentifier(LegacyAccountingIdentifier value);

	/**
	 * Returns the value of the '<em><b>Personal Data Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personal Data Constraint</em>' reference.
	 * @see #setPersonalDataConstraint(PersonalDataConstraint)
	 * @see Gtm.GtmPackage#getTargetFareTemplate_PersonalDataConstraint()
	 * @model
	 * @generated
	 */
	PersonalDataConstraint getPersonalDataConstraint();

	/**
	 * Sets the value of the '{@link Gtm.TargetFareTemplate#getPersonalDataConstraint <em>Personal Data Constraint</em>}' reference.
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
	 * @see Gtm.GtmPackage#getTargetFareTemplate_ReservationParameter()
	 * @model
	 * @generated
	 */
	ReservationParameter getReservationParameter();

	/**
	 * Sets the value of the '{@link Gtm.TargetFareTemplate#getReservationParameter <em>Reservation Parameter</em>}' reference.
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
	 * @see Gtm.GtmPackage#getTargetFareTemplate_ReductionConstraint()
	 * @model
	 * @generated
	 */
	ReductionConstraint getReductionConstraint();

	/**
	 * Sets the value of the '{@link Gtm.TargetFareTemplate#getReductionConstraint <em>Reduction Constraint</em>}' reference.
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
	 * @see Gtm.GtmPackage#getTargetFareTemplate_FulfillmentConstraint()
	 * @model
	 * @generated
	 */
	FulfillmentConstraint getFulfillmentConstraint();

	/**
	 * Sets the value of the '{@link Gtm.TargetFareTemplate#getFulfillmentConstraint <em>Fulfillment Constraint</em>}' reference.
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
	 * @see Gtm.GtmPackage#getTargetFareTemplate_PassengerConstraint()
	 * @model
	 * @generated
	 */
	PassengerConstraint getPassengerConstraint();

	/**
	 * Sets the value of the '{@link Gtm.TargetFareTemplate#getPassengerConstraint <em>Passenger Constraint</em>}' reference.
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
	 * @see Gtm.GtmPackage#getTargetFareTemplate_AfterSalesRule()
	 * @model
	 * @generated
	 */
	AfterSalesRule getAfterSalesRule();

	/**
	 * Sets the value of the '{@link Gtm.TargetFareTemplate#getAfterSalesRule <em>After Sales Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After Sales Rule</em>' reference.
	 * @see #getAfterSalesRule()
	 * @generated
	 */
	void setAfterSalesRule(AfterSalesRule value);

} // TargetFareTemplate
