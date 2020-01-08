/**
 */
package Gtm;

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
 *   <li>{@link Gtm.LegacyRouteFare#getSeriesNumber <em>Series Number</em>}</li>
 *   <li>{@link Gtm.LegacyRouteFare#getFare2nd <em>Fare2nd</em>}</li>
 *   <li>{@link Gtm.LegacyRouteFare#getFare1st <em>Fare1st</em>}</li>
 *   <li>{@link Gtm.LegacyRouteFare#getFareTableNumber <em>Fare Table Number</em>}</li>
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

} // LegacyRouteFare
