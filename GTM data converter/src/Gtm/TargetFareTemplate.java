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
 *   <li>{@link Gtm.TargetFareTemplate#getServiceConstraint <em>Service Constraint</em>}</li>
 *   <li>{@link Gtm.TargetFareTemplate#getCarrierConstraint <em>Carrier Constraint</em>}</li>
 *   <li>{@link Gtm.TargetFareTemplate#getServiceClass <em>Service Class</em>}</li>
 *   <li>{@link Gtm.TargetFareTemplate#getServiceLevel <em>Service Level</em>}</li>
 *   <li>{@link Gtm.TargetFareTemplate#getSalesAvailability <em>Sales Availability</em>}</li>
 *   <li>{@link Gtm.TargetFareTemplate#getTravelValidity <em>Travel Validity</em>}</li>
 *   <li>{@link Gtm.TargetFareTemplate#getCombinationConstraint <em>Combination Constraint</em>}</li>
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

} // TargetFareTemplate
