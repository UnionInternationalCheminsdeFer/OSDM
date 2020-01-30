/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reservation Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.ReservationOptions#getPreferences <em>Preferences</em>}</li>
 *   <li>{@link Gtm.ReservationOptions#getServiceBrands <em>Service Brands</em>}</li>
 *   <li>{@link Gtm.ReservationOptions#getGraphicalReservation <em>Graphical Reservation</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getReservationOptions()
 * @model
 * @generated
 */
public interface ReservationOptions extends EObject {
	/**
	 * Returns the value of the '<em><b>Preferences</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.ReservationPreferenceGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferences</em>' containment reference list.
	 * @see Gtm.GtmPackage#getReservationOptions_Preferences()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReservationPreferenceGroup> getPreferences();

	/**
	 * Returns the value of the '<em><b>Service Brands</b></em>' reference list.
	 * The list contents are of type {@link Gtm.ServiceBrand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Brands</em>' reference list.
	 * @see Gtm.GtmPackage#getReservationOptions_ServiceBrands()
	 * @model
	 * @generated
	 */
	EList<ServiceBrand> getServiceBrands();

	/**
	 * Returns the value of the '<em><b>Graphical Reservation</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.GraphicalReservationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphical Reservation</em>' attribute.
	 * @see Gtm.GraphicalReservationType
	 * @see #setGraphicalReservation(GraphicalReservationType)
	 * @see Gtm.GtmPackage#getReservationOptions_GraphicalReservation()
	 * @model
	 * @generated
	 */
	GraphicalReservationType getGraphicalReservation();

	/**
	 * Sets the value of the '{@link Gtm.ReservationOptions#getGraphicalReservation <em>Graphical Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphical Reservation</em>' attribute.
	 * @see Gtm.GraphicalReservationType
	 * @see #getGraphicalReservation()
	 * @generated
	 */
	void setGraphicalReservation(GraphicalReservationType value);

} // ReservationOptions
