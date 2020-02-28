/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reservation Preference Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.ReservationPreferenceGroup#getPreference <em>Preference</em>}</li>
 *   <li>{@link Gtm.ReservationPreferenceGroup#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getReservationPreferenceGroup()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AT_LEAST_ONE_PREFERENCE GROUP_FORMAT'"
 * @generated
 */
public interface ReservationPreferenceGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Preference</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preference</em>' attribute list.
	 * @see Gtm.GtmPackage#getReservationPreferenceGroup_Preference()
	 * @model
	 * @generated
	 */
	EList<String> getPreference();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(String)
	 * @see Gtm.GtmPackage#getReservationPreferenceGroup_Group()
	 * @model
	 * @generated
	 */
	String getGroup();

	/**
	 * Sets the value of the '{@link Gtm.ReservationPreferenceGroup#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(String value);

} // ReservationPreferenceGroup
