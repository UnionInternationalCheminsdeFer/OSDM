/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reservation Preference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.ReservationPreference#getPreference <em>Preference</em>}</li>
 *   <li>{@link Gtm.ReservationPreference#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getReservationPreference()
 * @model
 * @generated
 */
public interface ReservationPreference extends EObject {
	/**
	 * Returns the value of the '<em><b>Preference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preference</em>' attribute.
	 * @see #setPreference(String)
	 * @see Gtm.GtmPackage#getReservationPreference_Preference()
	 * @model required="true"
	 * @generated
	 */
	String getPreference();

	/**
	 * Sets the value of the '{@link Gtm.ReservationPreference#getPreference <em>Preference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preference</em>' attribute.
	 * @see #getPreference()
	 * @generated
	 */
	void setPreference(String value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(String)
	 * @see Gtm.GtmPackage#getReservationPreference_Group()
	 * @model
	 * @generated
	 */
	String getGroup();

	/**
	 * Sets the value of the '{@link Gtm.ReservationPreference#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(String value);

} // ReservationPreference
