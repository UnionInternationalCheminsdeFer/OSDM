/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fare Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.FareTemplate#getPriceFactor <em>Price Factor</em>}</li>
 *   <li>{@link Gtm.FareTemplate#getPrice <em>Price</em>}</li>
 *   <li>{@link Gtm.FareTemplate#getRoundingMode <em>Rounding Mode</em>}</li>
 *   <li>{@link Gtm.FareTemplate#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.FareTemplate#getType <em>Type</em>}</li>
 *   <li>{@link Gtm.FareTemplate#getAfterSalesTemplate <em>After Sales Template</em>}</li>
 *   <li>{@link Gtm.FareTemplate#getDataDescription <em>Data Description</em>}</li>
 *   <li>{@link Gtm.FareTemplate#getText <em>Text</em>}</li>
 *   <li>{@link Gtm.FareTemplate#getServiceConstraint <em>Service Constraint</em>}</li>
 *   <li>{@link Gtm.FareTemplate#getCarrierConstraint <em>Carrier Constraint</em>}</li>
 *   <li>{@link Gtm.FareTemplate#getServiceClass <em>Service Class</em>}</li>
 *   <li>{@link Gtm.FareTemplate#getServiceLevel <em>Service Level</em>}</li>
 *   <li>{@link Gtm.FareTemplate#getSalesAvailability <em>Sales Availability</em>}</li>
 *   <li>{@link Gtm.FareTemplate#getTravelValidity <em>Travel Validity</em>}</li>
 *   <li>{@link Gtm.FareTemplate#getCombinationConstraint <em>Combination Constraint</em>}</li>
 *   <li>{@link Gtm.FareTemplate#getSeparateContractCombinationConstraint <em>Separate Contract Combination Constraint</em>}</li>
 *   <li>{@link Gtm.FareTemplate#getFareDetailDescription <em>Fare Detail Description</em>}</li>
 *   <li>{@link Gtm.FareTemplate#getLegacyAccountingIdentifier <em>Legacy Accounting Identifier</em>}</li>
 *   <li>{@link Gtm.FareTemplate#getPersonalDataConstraint <em>Personal Data Constraint</em>}</li>
 *   <li>{@link Gtm.FareTemplate#getReservationParameter <em>Reservation Parameter</em>}</li>
 *   <li>{@link Gtm.FareTemplate#getReductionConstraint <em>Reduction Constraint</em>}</li>
 *   <li>{@link Gtm.FareTemplate#getFulfillmentConstraint <em>Fulfillment Constraint</em>}</li>
 *   <li>{@link Gtm.FareTemplate#getPassengerConstraint <em>Passenger Constraint</em>}</li>
 *   <li>{@link Gtm.FareTemplate#getLegacyConversion <em>Legacy Conversion</em>}</li>
 *   <li>{@link Gtm.FareTemplate#isIndividualContracts <em>Individual Contracts</em>}</li>
 *   <li>{@link Gtm.FareTemplate#getRegulatoryConditions <em>Regulatory Conditions</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getFareTemplate()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PRICE_FACTOR_MUST TYPE_MUST TRAVEL_VALIDITY_MUST COMBINATION_CONSTRAINT_MUST PASSENGER_CONSTRAINT_MUST FULFILMENT_CONSTRAINT_MUST LEGACY_CONVERSION_MUST SERVICE_CLASS_MUST PRICE_OR_FACTOR'"
 * @generated
 */
public interface FareTemplate extends EObject {
	/**
	 * Returns the value of the '<em><b>Price Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price Factor</em>' attribute.
	 * @see #isSetPriceFactor()
	 * @see #unsetPriceFactor()
	 * @see #setPriceFactor(float)
	 * @see Gtm.GtmPackage#getFareTemplate_PriceFactor()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 * @generated
	 */
	float getPriceFactor();

	/**
	 * Sets the value of the '{@link Gtm.FareTemplate#getPriceFactor <em>Price Factor</em>}' attribute.
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
	 * Unsets the value of the '{@link Gtm.FareTemplate#getPriceFactor <em>Price Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriceFactor()
	 * @see #getPriceFactor()
	 * @see #setPriceFactor(float)
	 * @generated
	 */
	void unsetPriceFactor();

	/**
	 * Returns whether the value of the '{@link Gtm.FareTemplate#getPriceFactor <em>Price Factor</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Price</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' reference.
	 * @see #setPrice(Price)
	 * @see Gtm.GtmPackage#getFareTemplate_Price()
	 * @model
	 * @generated
	 */
	Price getPrice();

	/**
	 * Sets the value of the '{@link Gtm.FareTemplate#getPrice <em>Price</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' reference.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(Price value);

	/**
	 * Returns the value of the '<em><b>Rounding Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.RoundingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rounding Mode</em>' attribute.
	 * @see Gtm.RoundingType
	 * @see #setRoundingMode(RoundingType)
	 * @see Gtm.GtmPackage#getFareTemplate_RoundingMode()
	 * @model
	 * @generated
	 */
	RoundingType getRoundingMode();

	/**
	 * Sets the value of the '{@link Gtm.FareTemplate#getRoundingMode <em>Rounding Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rounding Mode</em>' attribute.
	 * @see Gtm.RoundingType
	 * @see #getRoundingMode()
	 * @generated
	 */
	void setRoundingMode(RoundingType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Gtm.GtmPackage#getFareTemplate_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Gtm.FareTemplate#getId <em>Id</em>}' attribute.
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
	 * @see Gtm.GtmPackage#getFareTemplate_Type()
	 * @model
	 * @generated
	 */
	FareType getType();

	/**
	 * Sets the value of the '{@link Gtm.FareTemplate#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see Gtm.FareType
	 * @see #getType()
	 * @generated
	 */
	void setType(FareType value);

	/**
	 * Returns the value of the '<em><b>After Sales Template</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.AfterSalesTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Sales Template</em>' containment reference list.
	 * @see Gtm.GtmPackage#getFareTemplate_AfterSalesTemplate()
	 * @model containment="true"
	 * @generated
	 */
	EList<AfterSalesTemplate> getAfterSalesTemplate();

	/**
	 * Returns the value of the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Description</em>' attribute.
	 * @see #setDataDescription(String)
	 * @see Gtm.GtmPackage#getFareTemplate_DataDescription()
	 * @model
	 * @generated
	 */
	String getDataDescription();

	/**
	 * Sets the value of the '{@link Gtm.FareTemplate#getDataDescription <em>Data Description</em>}' attribute.
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
	 * @see Gtm.GtmPackage#getFareTemplate_Text()
	 * @model
	 * @generated
	 */
	Text getText();

	/**
	 * Sets the value of the '{@link Gtm.FareTemplate#getText <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(Text value);

	/**
	 * Returns the value of the '<em><b>Service Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Constraint</em>' reference.
	 * @see #setServiceConstraint(ServiceConstraint)
	 * @see Gtm.GtmPackage#getFareTemplate_ServiceConstraint()
	 * @model
	 * @generated
	 */
	ServiceConstraint getServiceConstraint();

	/**
	 * Sets the value of the '{@link Gtm.FareTemplate#getServiceConstraint <em>Service Constraint</em>}' reference.
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
	 * @see Gtm.GtmPackage#getFareTemplate_CarrierConstraint()
	 * @model
	 * @generated
	 */
	CarrierConstraint getCarrierConstraint();

	/**
	 * Sets the value of the '{@link Gtm.FareTemplate#getCarrierConstraint <em>Carrier Constraint</em>}' reference.
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
	 * @see Gtm.GtmPackage#getFareTemplate_ServiceClass()
	 * @model
	 * @generated
	 */
	ServiceClass getServiceClass();

	/**
	 * Sets the value of the '{@link Gtm.FareTemplate#getServiceClass <em>Service Class</em>}' reference.
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
	 * @see Gtm.GtmPackage#getFareTemplate_ServiceLevel()
	 * @model
	 * @generated
	 */
	ServiceLevel getServiceLevel();

	/**
	 * Sets the value of the '{@link Gtm.FareTemplate#getServiceLevel <em>Service Level</em>}' reference.
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
	 * @see Gtm.GtmPackage#getFareTemplate_SalesAvailability()
	 * @model
	 * @generated
	 */
	SalesAvailabilityConstraint getSalesAvailability();

	/**
	 * Sets the value of the '{@link Gtm.FareTemplate#getSalesAvailability <em>Sales Availability</em>}' reference.
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
	 * @see Gtm.GtmPackage#getFareTemplate_TravelValidity()
	 * @model
	 * @generated
	 */
	TravelValidityConstraint getTravelValidity();

	/**
	 * Sets the value of the '{@link Gtm.FareTemplate#getTravelValidity <em>Travel Validity</em>}' reference.
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
	 * @see Gtm.GtmPackage#getFareTemplate_CombinationConstraint()
	 * @model
	 * @generated
	 */
	CombinationConstraint getCombinationConstraint();

	/**
	 * Sets the value of the '{@link Gtm.FareTemplate#getCombinationConstraint <em>Combination Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combination Constraint</em>' reference.
	 * @see #getCombinationConstraint()
	 * @generated
	 */
	void setCombinationConstraint(CombinationConstraint value);

	/**
	 * Returns the value of the '<em><b>Separate Contract Combination Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Separate Contract Combination Constraint</em>' reference.
	 * @see #setSeparateContractCombinationConstraint(CombinationConstraint)
	 * @see Gtm.GtmPackage#getFareTemplate_SeparateContractCombinationConstraint()
	 * @model
	 * @generated
	 */
	CombinationConstraint getSeparateContractCombinationConstraint();

	/**
	 * Sets the value of the '{@link Gtm.FareTemplate#getSeparateContractCombinationConstraint <em>Separate Contract Combination Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Separate Contract Combination Constraint</em>' reference.
	 * @see #getSeparateContractCombinationConstraint()
	 * @generated
	 */
	void setSeparateContractCombinationConstraint(CombinationConstraint value);

	/**
	 * Returns the value of the '<em><b>Fare Detail Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fare Detail Description</em>' reference.
	 * @see #setFareDetailDescription(Text)
	 * @see Gtm.GtmPackage#getFareTemplate_FareDetailDescription()
	 * @model
	 * @generated
	 */
	Text getFareDetailDescription();

	/**
	 * Sets the value of the '{@link Gtm.FareTemplate#getFareDetailDescription <em>Fare Detail Description</em>}' reference.
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
	 * @see Gtm.GtmPackage#getFareTemplate_LegacyAccountingIdentifier()
	 * @model containment="true"
	 * @generated
	 */
	LegacyAccountingIdentifier getLegacyAccountingIdentifier();

	/**
	 * Sets the value of the '{@link Gtm.FareTemplate#getLegacyAccountingIdentifier <em>Legacy Accounting Identifier</em>}' containment reference.
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
	 * @see Gtm.GtmPackage#getFareTemplate_PersonalDataConstraint()
	 * @model
	 * @generated
	 */
	PersonalDataConstraint getPersonalDataConstraint();

	/**
	 * Sets the value of the '{@link Gtm.FareTemplate#getPersonalDataConstraint <em>Personal Data Constraint</em>}' reference.
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
	 * @see Gtm.GtmPackage#getFareTemplate_ReservationParameter()
	 * @model
	 * @generated
	 */
	ReservationParameter getReservationParameter();

	/**
	 * Sets the value of the '{@link Gtm.FareTemplate#getReservationParameter <em>Reservation Parameter</em>}' reference.
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
	 * @see Gtm.GtmPackage#getFareTemplate_ReductionConstraint()
	 * @model
	 * @generated
	 */
	ReductionConstraint getReductionConstraint();

	/**
	 * Sets the value of the '{@link Gtm.FareTemplate#getReductionConstraint <em>Reduction Constraint</em>}' reference.
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
	 * @see Gtm.GtmPackage#getFareTemplate_FulfillmentConstraint()
	 * @model
	 * @generated
	 */
	FulfillmentConstraint getFulfillmentConstraint();

	/**
	 * Sets the value of the '{@link Gtm.FareTemplate#getFulfillmentConstraint <em>Fulfillment Constraint</em>}' reference.
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
	 * @see Gtm.GtmPackage#getFareTemplate_PassengerConstraint()
	 * @model
	 * @generated
	 */
	PassengerConstraint getPassengerConstraint();

	/**
	 * Sets the value of the '{@link Gtm.FareTemplate#getPassengerConstraint <em>Passenger Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Constraint</em>' reference.
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	void setPassengerConstraint(PassengerConstraint value);

	/**
	 * Returns the value of the '<em><b>Legacy Conversion</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.LegacyConversionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Conversion</em>' attribute.
	 * @see Gtm.LegacyConversionType
	 * @see #setLegacyConversion(LegacyConversionType)
	 * @see Gtm.GtmPackage#getFareTemplate_LegacyConversion()
	 * @model
	 * @generated
	 */
	LegacyConversionType getLegacyConversion();

	/**
	 * Sets the value of the '{@link Gtm.FareTemplate#getLegacyConversion <em>Legacy Conversion</em>}' attribute.
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
	 * @see Gtm.GtmPackage#getFareTemplate_IndividualContracts()
	 * @model default="false"
	 * @generated
	 */
	boolean isIndividualContracts();

	/**
	 * Sets the value of the '{@link Gtm.FareTemplate#isIndividualContracts <em>Individual Contracts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual Contracts</em>' attribute.
	 * @see #isIndividualContracts()
	 * @generated
	 */
	void setIndividualContracts(boolean value);

	/**
	 * Returns the value of the '<em><b>Regulatory Conditions</b></em>' attribute list.
	 * The list contents are of type {@link Gtm.RegulatoryCondition}.
	 * The literals are from the enumeration {@link Gtm.RegulatoryCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulatory Conditions</em>' attribute list.
	 * @see Gtm.RegulatoryCondition
	 * @see Gtm.GtmPackage#getFareTemplate_RegulatoryConditions()
	 * @model
	 * @generated
	 */
	EList<RegulatoryCondition> getRegulatoryConditions();


} // FareTemplate
