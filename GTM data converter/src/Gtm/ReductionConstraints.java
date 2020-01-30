/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reduction Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.ReductionConstraints#getReductionConstraints <em>Reduction Constraints</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getReductionConstraints()
 * @model
 * @generated
 */
public interface ReductionConstraints extends EObject {
	/**
	 * Returns the value of the '<em><b>Reduction Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.ReductionConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reduction Constraints</em>' containment reference list.
	 * @see Gtm.GtmPackage#getReductionConstraints_ReductionConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReductionConstraint> getReductionConstraints();

} // ReductionConstraints
