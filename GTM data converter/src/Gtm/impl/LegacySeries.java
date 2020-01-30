/**
 */
package Gtm;

import java.util.Date;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Series</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.LegacySeries#getViastations <em>Viastations</em>}</li>
 *   <li>{@link Gtm.LegacySeries#getDistance1 <em>Distance1</em>}</li>
 *   <li>{@link Gtm.LegacySeries#getPricetype <em>Pricetype</em>}</li>
 *   <li>{@link Gtm.LegacySeries#getValidFrom <em>Valid From</em>}</li>
 *   <li>{@link Gtm.LegacySeries#getValidUntil <em>Valid Until</em>}</li>
 *   <li>{@link Gtm.LegacySeries#getPricing <em>Pricing</em>}</li>
 *   <li>{@link Gtm.LegacySeries#getType <em>Type</em>}</li>
 *   <li>{@link Gtm.LegacySeries#getNumber <em>Number</em>}</li>
 *   <li>{@link Gtm.LegacySeries#getFromStation <em>From Station</em>}</li>
 *   <li>{@link Gtm.LegacySeries#getToStation <em>To Station</em>}</li>
 *   <li>{@link Gtm.LegacySeries#getDistance2 <em>Distance2</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacySeries()
 * @model
 * @generated
 */
public interface LegacySeries extends EObject {
	/**
	 * Returns the value of the '<em><b>Viastations</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.LegacyViastation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viastations</em>' containment reference list.
	 * @see Gtm.GtmPackage#getLegacySeries_Viastations()
	 * @model containment="true"
	 * @generated
	 */
	EList<LegacyViastation> getViastations();

	/**
	 * Returns the value of the '<em><b>Distance1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance1</em>' attribute.
	 * @see #isSetDistance1()
	 * @see #unsetDistance1()
	 * @see #setDistance1(int)
	 * @see Gtm.GtmPackage#getLegacySeries_Distance1()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getDistance1();

	/**
	 * Sets the value of the '{@link Gtm.LegacySeries#getDistance1 <em>Distance1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance1</em>' attribute.
	 * @see #isSetDistance1()
	 * @see #unsetDistance1()
	 * @see #getDistance1()
	 * @generated
	 */
	void setDistance1(int value);

	/**
	 * Unsets the value of the '{@link Gtm.LegacySeries#getDistance1 <em>Distance1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDistance1()
	 * @see #getDistance1()
	 * @see #setDistance1(int)
	 * @generated
	 */
	void unsetDistance1();

	/**
	 * Returns whether the value of the '{@link Gtm.LegacySeries#getDistance1 <em>Distance1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Distance1</em>' attribute is set.
	 * @see #unsetDistance1()
	 * @see #getDistance1()
	 * @see #setDistance1(int)
	 * @generated
	 */
	boolean isSetDistance1();

	/**
	 * Returns the value of the '<em><b>Pricetype</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.LegacyCalculationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pricetype</em>' attribute.
	 * @see Gtm.LegacyCalculationType
	 * @see #isSetPricetype()
	 * @see #unsetPricetype()
	 * @see #setPricetype(LegacyCalculationType)
	 * @see Gtm.GtmPackage#getLegacySeries_Pricetype()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	LegacyCalculationType getPricetype();

	/**
	 * Sets the value of the '{@link Gtm.LegacySeries#getPricetype <em>Pricetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pricetype</em>' attribute.
	 * @see Gtm.LegacyCalculationType
	 * @see #isSetPricetype()
	 * @see #unsetPricetype()
	 * @see #getPricetype()
	 * @generated
	 */
	void setPricetype(LegacyCalculationType value);

	/**
	 * Unsets the value of the '{@link Gtm.LegacySeries#getPricetype <em>Pricetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPricetype()
	 * @see #getPricetype()
	 * @see #setPricetype(LegacyCalculationType)
	 * @generated
	 */
	void unsetPricetype();

	/**
	 * Returns whether the value of the '{@link Gtm.LegacySeries#getPricetype <em>Pricetype</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pricetype</em>' attribute is set.
	 * @see #unsetPricetype()
	 * @see #getPricetype()
	 * @see #setPricetype(LegacyCalculationType)
	 * @generated
	 */
	boolean isSetPricetype();

	/**
	 * Returns the value of the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid From</em>' attribute.
	 * @see #setValidFrom(Date)
	 * @see Gtm.GtmPackage#getLegacySeries_ValidFrom()
	 * @model required="true"
	 * @generated
	 */
	Date getValidFrom();

	/**
	 * Sets the value of the '{@link Gtm.LegacySeries#getValidFrom <em>Valid From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid From</em>' attribute.
	 * @see #getValidFrom()
	 * @generated
	 */
	void setValidFrom(Date value);

	/**
	 * Returns the value of the '<em><b>Valid Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Until</em>' attribute.
	 * @see #setValidUntil(Date)
	 * @see Gtm.GtmPackage#getLegacySeries_ValidUntil()
	 * @model required="true"
	 * @generated
	 */
	Date getValidUntil();

	/**
	 * Sets the value of the '{@link Gtm.LegacySeries#getValidUntil <em>Valid Until</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Until</em>' attribute.
	 * @see #getValidUntil()
	 * @generated
	 */
	void setValidUntil(Date value);

	/**
	 * Returns the value of the '<em><b>Pricing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pricing</em>' attribute.
	 * @see #setPricing(String)
	 * @see Gtm.GtmPackage#getLegacySeries_Pricing()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getPricing();

	/**
	 * Sets the value of the '{@link Gtm.LegacySeries#getPricing <em>Pricing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pricing</em>' attribute.
	 * @see #getPricing()
	 * @generated
	 */
	void setPricing(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.LegacySeriesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see Gtm.LegacySeriesType
	 * @see #setType(LegacySeriesType)
	 * @see Gtm.GtmPackage#getLegacySeries_Type()
	 * @model
	 * @generated
	 */
	LegacySeriesType getType();

	/**
	 * Sets the value of the '{@link Gtm.LegacySeries#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see Gtm.LegacySeriesType
	 * @see #getType()
	 * @generated
	 */
	void setType(LegacySeriesType value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see Gtm.GtmPackage#getLegacySeries_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link Gtm.LegacySeries#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>From Station</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Station</em>' attribute.
	 * @see #setFromStation(int)
	 * @see Gtm.GtmPackage#getLegacySeries_FromStation()
	 * @model
	 * @generated
	 */
	int getFromStation();

	/**
	 * Sets the value of the '{@link Gtm.LegacySeries#getFromStation <em>From Station</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Station</em>' attribute.
	 * @see #getFromStation()
	 * @generated
	 */
	void setFromStation(int value);

	/**
	 * Returns the value of the '<em><b>To Station</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Station</em>' attribute.
	 * @see #setToStation(int)
	 * @see Gtm.GtmPackage#getLegacySeries_ToStation()
	 * @model
	 * @generated
	 */
	int getToStation();

	/**
	 * Sets the value of the '{@link Gtm.LegacySeries#getToStation <em>To Station</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Station</em>' attribute.
	 * @see #getToStation()
	 * @generated
	 */
	void setToStation(int value);

	/**
	 * Returns the value of the '<em><b>Distance2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance2</em>' attribute.
	 * @see #setDistance2(int)
	 * @see Gtm.GtmPackage#getLegacySeries_Distance2()
	 * @model
	 * @generated
	 */
	int getDistance2();

	/**
	 * Sets the value of the '{@link Gtm.LegacySeries#getDistance2 <em>Distance2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance2</em>' attribute.
	 * @see #getDistance2()
	 * @generated
	 */
	void setDistance2(int value);

} // LegacySeries
