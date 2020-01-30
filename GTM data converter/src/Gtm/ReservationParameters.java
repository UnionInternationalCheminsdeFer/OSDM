/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reservation Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.ReservationParameters#getReservationParameters <em>Reservation Parameters</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getReservationParameters()
 * @model
 * @generated
 */
public interface ReservationParameters extends EObject {
	/**
	 * Returns the value of the '<em><b>Reservation Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.ReservationParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation Parameters</em>' containment reference list.
	 * @see Gtm.GtmPackage#getReservationParameters_ReservationParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReservationParameter> getReservationParameters();

} // ReservationParameters
