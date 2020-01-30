/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Route Fares</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.LegacyRouteFares#getRouteFare <em>Route Fare</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacyRouteFares()
 * @model
 * @generated
 */
public interface LegacyRouteFares extends EObject {
	/**
	 * Returns the value of the '<em><b>Route Fare</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.LegacyRouteFare}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Fare</em>' containment reference list.
	 * @see Gtm.GtmPackage#getLegacyRouteFares_RouteFare()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<LegacyRouteFare> getRouteFare();

} // LegacyRouteFares
