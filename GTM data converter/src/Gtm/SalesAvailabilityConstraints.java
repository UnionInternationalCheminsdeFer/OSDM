/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sales Availability Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.SalesAvailabilityConstraints#getSalesAvailabilityConstraints <em>Sales Availability Constraints</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getSalesAvailabilityConstraints()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AT_LEAST_ONE'"
 * @generated
 */
public interface SalesAvailabilityConstraints extends EObject {
	/**
	 * Returns the value of the '<em><b>Sales Availability Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.SalesAvailabilityConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Availability Constraints</em>' containment reference list.
	 * @see Gtm.GtmPackage#getSalesAvailabilityConstraints_SalesAvailabilityConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<SalesAvailabilityConstraint> getSalesAvailabilityConstraints();

} // SalesAvailabilityConstraints
