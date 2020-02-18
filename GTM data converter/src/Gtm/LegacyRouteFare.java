/**
 */
package Gtm;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Route Fare</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.LegacyRouteFare#getFareTableNumber <em>Fare Table Number</em>}</li>
 *   <li>{@link Gtm.LegacyRouteFare#getSeriesNumber <em>Series Number</em>}</li>
 *   <li>{@link Gtm.LegacyRouteFare#getFare2nd <em>Fare2nd</em>}</li>
 *   <li>{@link Gtm.LegacyRouteFare#getFare1st <em>Fare1st</em>}</li>
 *   <li>{@link Gtm.LegacyRouteFare#getReturnFare1st <em>Return Fare1st</em>}</li>
 *   <li>{@link Gtm.LegacyRouteFare#getReturnFare2nd <em>Return Fare2nd</em>}</li>
 *   <li>{@link Gtm.LegacyRouteFare#getValidFrom <em>Valid From</em>}</li>
 *   <li>{@link Gtm.LegacyRouteFare#getValidUntil <em>Valid Until</em>}</li>
 *   <li>{@link Gtm.LegacyRouteFare#getSeries <em>Series</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacyRouteFare()
 * @model
 * @generated
 */
public interface LegacyRouteFare extends EObject {
	/**
	 * Returns the value of the '<em><b>Series Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series Number</em>' attribute.
	 * @see #isSetSeriesNumber()
	 * @see #unsetSeriesNumber()
	 * @see #setSeriesNumber(int)
	 * @see Gtm.GtmPackage#getLegacyRouteFare_SeriesNumber()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getSeriesNumber();

	/**
	 * Sets the value of the '{@link Gtm.LegacyRouteFare#getSeriesNumber <em>Series Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series Number</em>' attribute.
	 * @see #isSetSeriesNumber()
	 * @see #unsetSeriesNumber()
	 * @see #getSeriesNumber()
	 * @generated
	 */
	void setSeriesNumber(int value);

	/**
	 * Unsets the value of the '{@link Gtm.LegacyRouteFare#getSeriesNumber <em>Series Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSeriesNumber()
	 * @see #getSeriesNumber()
	 * @see #setSeriesNumber(int)
	 * @generated
	 */
	void unsetSeriesNumber();

	/**
	 * Returns whether the value of the '{@link Gtm.LegacyRouteFare#getSeriesNumber <em>Series Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Series Number</em>' attribute is set.
	 * @see #unsetSeriesNumber()
	 * @see #getSeriesNumber()
	 * @see #setSeriesNumber(int)
	 * @generated
	 */
	boolean isSetSeriesNumber();

	/**
	 * Returns the value of the '<em><b>Fare2nd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fare2nd</em>' attribute.
	 * @see #isSetFare2nd()
	 * @see #unsetFare2nd()
	 * @see #setFare2nd(int)
	 * @see Gtm.GtmPackage#getLegacyRouteFare_Fare2nd()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getFare2nd();

	/**
	 * Sets the value of the '{@link Gtm.LegacyRouteFare#getFare2nd <em>Fare2nd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fare2nd</em>' attribute.
	 * @see #isSetFare2nd()
	 * @see #unsetFare2nd()
	 * @see #getFare2nd()
	 * @generated
	 */
	void setFare2nd(int value);

	/**
	 * Unsets the value of the '{@link Gtm.LegacyRouteFare#getFare2nd <em>Fare2nd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFare2nd()
	 * @see #getFare2nd()
	 * @see #setFare2nd(int)
	 * @generated
	 */
	void unsetFare2nd();

	/**
	 * Returns whether the value of the '{@link Gtm.LegacyRouteFare#getFare2nd <em>Fare2nd</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fare2nd</em>' attribute is set.
	 * @see #unsetFare2nd()
	 * @see #getFare2nd()
	 * @see #setFare2nd(int)
	 * @generated
	 */
	boolean isSetFare2nd();

	/**
	 * Returns the value of the '<em><b>Fare1st</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fare1st</em>' attribute.
	 * @see #isSetFare1st()
	 * @see #unsetFare1st()
	 * @see #setFare1st(int)
	 * @see Gtm.GtmPackage#getLegacyRouteFare_Fare1st()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getFare1st();

	/**
	 * Sets the value of the '{@link Gtm.LegacyRouteFare#getFare1st <em>Fare1st</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fare1st</em>' attribute.
	 * @see #isSetFare1st()
	 * @see #unsetFare1st()
	 * @see #getFare1st()
	 * @generated
	 */
	void setFare1st(int value);

	/**
	 * Unsets the value of the '{@link Gtm.LegacyRouteFare#getFare1st <em>Fare1st</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFare1st()
	 * @see #getFare1st()
	 * @see #setFare1st(int)
	 * @generated
	 */
	void unsetFare1st();

	/**
	 * Returns whether the value of the '{@link Gtm.LegacyRouteFare#getFare1st <em>Fare1st</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fare1st</em>' attribute is set.
	 * @see #unsetFare1st()
	 * @see #getFare1st()
	 * @see #setFare1st(int)
	 * @generated
	 */
	boolean isSetFare1st();

	/**
	 * Returns the value of the '<em><b>Fare Table Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fare Table Number</em>' attribute.
	 * @see #setFareTableNumber(int)
	 * @see Gtm.GtmPackage#getLegacyRouteFare_FareTableNumber()
	 * @model
	 * @generated
	 */
	int getFareTableNumber();

	/**
	 * Sets the value of the '{@link Gtm.LegacyRouteFare#getFareTableNumber <em>Fare Table Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fare Table Number</em>' attribute.
	 * @see #getFareTableNumber()
	 * @generated
	 */
	void setFareTableNumber(int value);

	/**
	 * Returns the value of the '<em><b>Return Fare1st</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Fare1st</em>' attribute.
	 * @see #setReturnFare1st(int)
	 * @see Gtm.GtmPackage#getLegacyRouteFare_ReturnFare1st()
	 * @model
	 * @generated
	 */
	int getReturnFare1st();

	/**
	 * Sets the value of the '{@link Gtm.LegacyRouteFare#getReturnFare1st <em>Return Fare1st</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Fare1st</em>' attribute.
	 * @see #getReturnFare1st()
	 * @generated
	 */
	void setReturnFare1st(int value);

	/**
	 * Returns the value of the '<em><b>Return Fare2nd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Fare2nd</em>' attribute.
	 * @see #setReturnFare2nd(int)
	 * @see Gtm.GtmPackage#getLegacyRouteFare_ReturnFare2nd()
	 * @model
	 * @generated
	 */
	int getReturnFare2nd();

	/**
	 * Sets the value of the '{@link Gtm.LegacyRouteFare#getReturnFare2nd <em>Return Fare2nd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Fare2nd</em>' attribute.
	 * @see #getReturnFare2nd()
	 * @generated
	 */
	void setReturnFare2nd(int value);

	/**
	 * Returns the value of the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid From</em>' attribute.
	 * @see #setValidFrom(Date)
	 * @see Gtm.GtmPackage#getLegacyRouteFare_ValidFrom()
	 * @model
	 * @generated
	 */
	Date getValidFrom();

	/**
	 * Sets the value of the '{@link Gtm.LegacyRouteFare#getValidFrom <em>Valid From</em>}' attribute.
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
	 * @see Gtm.GtmPackage#getLegacyRouteFare_ValidUntil()
	 * @model
	 * @generated
	 */
	Date getValidUntil();

	/**
	 * Sets the value of the '{@link Gtm.LegacyRouteFare#getValidUntil <em>Valid Until</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Until</em>' attribute.
	 * @see #getValidUntil()
	 * @generated
	 */
	void setValidUntil(Date value);

	/**
	 * Returns the value of the '<em><b>Series</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series</em>' reference.
	 * @see #setSeries(LegacySeries)
	 * @see Gtm.GtmPackage#getLegacyRouteFare_Series()
	 * @model
	 * @generated
	 */
	LegacySeries getSeries();

	/**
	 * Sets the value of the '{@link Gtm.LegacyRouteFare#getSeries <em>Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series</em>' reference.
	 * @see #getSeries()
	 * @generated
	 */
	void setSeries(LegacySeries value);

} // LegacyRouteFare
