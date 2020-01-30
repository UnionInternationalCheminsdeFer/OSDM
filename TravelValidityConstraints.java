/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Travel Validity Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.TravelValidityConstraints#getTravelValidityConstraints <em>Travel Validity Constraints</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getTravelValidityConstraints()
 * @model
 * @generated
 */
public interface TravelValidityConstraints extends EObject {
	/**
	 * Returns the value of the '<em><b>Travel Validity Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.TravelValidityConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Travel Validity Constraints</em>' containment reference list.
	 * @see Gtm.GtmPackage#getTravelValidityConstraints_TravelValidityConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<TravelValidityConstraint> getTravelValidityConstraints();

} // TravelValidityConstraints
