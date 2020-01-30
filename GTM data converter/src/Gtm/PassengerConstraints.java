/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Passenger Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.PassengerConstraints#getPassengerConstraints <em>Passenger Constraints</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getPassengerConstraints()
 * @model
 * @generated
 */
public interface PassengerConstraints extends EObject {
	/**
	 * Returns the value of the '<em><b>Passenger Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.PassengerConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Constraints</em>' containment reference list.
	 * @see Gtm.GtmPackage#getPassengerConstraints_PassengerConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<PassengerConstraint> getPassengerConstraints();

} // PassengerConstraints
