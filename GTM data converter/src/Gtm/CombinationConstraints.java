/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combination Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.CombinationConstraints#getCombinationConstraints <em>Combination Constraints</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getCombinationConstraints()
 * @model
 * @generated
 */
public interface CombinationConstraints extends EObject {
	/**
	 * Returns the value of the '<em><b>Combination Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.CombinationConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combination Constraints</em>' containment reference list.
	 * @see Gtm.GtmPackage#getCombinationConstraints_CombinationConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<CombinationConstraint> getCombinationConstraints();

} // CombinationConstraints
