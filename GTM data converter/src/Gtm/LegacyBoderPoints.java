/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Boder Points</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.LegacyBoderPoints#getBorderPoints <em>Border Points</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacyBoderPoints()
 * @model
 * @generated
 */
public interface LegacyBoderPoints extends EObject {
	/**
	 * Returns the value of the '<em><b>Border Points</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.BorderPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Points</em>' containment reference list.
	 * @see Gtm.GtmPackage#getLegacyBoderPoints_BorderPoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<BorderPoint> getBorderPoints();

} // LegacyBoderPoints
