/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Included Free Passengers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.IncludedFreePassengers#getIncludedFreePassengers <em>Included Free Passengers</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getIncludedFreePassengers()
 * @model
 * @generated
 */
public interface IncludedFreePassengers extends EObject {
	/**
	 * Returns the value of the '<em><b>Included Free Passengers</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.PassengerCombinationConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included Free Passengers</em>' containment reference list.
	 * @see Gtm.GtmPackage#getIncludedFreePassengers_IncludedFreePassengers()
	 * @model containment="true"
	 * @generated
	 */
	EList<PassengerCombinationConstraint> getIncludedFreePassengers();

} // IncludedFreePassengers
