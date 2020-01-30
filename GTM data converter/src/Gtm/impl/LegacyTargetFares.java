/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Target Fares</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.LegacyTargetFares#getTargetFares <em>Target Fares</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacyTargetFares()
 * @model
 * @generated
 */
public interface LegacyTargetFares extends EObject {
	/**
	 * Returns the value of the '<em><b>Target Fares</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.TargetFareTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Fares</em>' containment reference list.
	 * @see Gtm.GtmPackage#getLegacyTargetFares_TargetFares()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TargetFareTemplate> getTargetFares();

} // LegacyTargetFares
