/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Border Points</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.LegacyBorderPoints#getLegacyBorderPoints <em>Legacy Border Points</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacyBorderPoints()
 * @model
 * @generated
 */
public interface LegacyBorderPoints extends EObject {
	/**
	 * Returns the value of the '<em><b>Legacy Border Points</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.LegacyBorderPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Border Points</em>' containment reference list.
	 * @see Gtm.GtmPackage#getLegacyBorderPoints_LegacyBorderPoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<LegacyBorderPoint> getLegacyBorderPoints();

} // LegacyBorderPoints
