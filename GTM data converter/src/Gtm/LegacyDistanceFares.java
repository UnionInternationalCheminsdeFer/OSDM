/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Distance Fares</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.LegacyDistanceFares#getDistanceFare <em>Distance Fare</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacyDistanceFares()
 * @model
 * @generated
 */
public interface LegacyDistanceFares extends EObject {
	/**
	 * Returns the value of the '<em><b>Distance Fare</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.LegacyDistanceFare}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Fare</em>' containment reference list.
	 * @see Gtm.GtmPackage#getLegacyDistanceFares_DistanceFare()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<LegacyDistanceFare> getDistanceFare();

} // LegacyDistanceFares
