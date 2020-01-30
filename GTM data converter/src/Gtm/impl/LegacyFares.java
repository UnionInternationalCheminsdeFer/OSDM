/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Fares</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.LegacyFares#getFares <em>Fares</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacyFares()
 * @model
 * @generated
 */
public interface LegacyFares extends EObject {
	/**
	 * Returns the value of the '<em><b>Fares</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.LegacyFare}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fares</em>' containment reference list.
	 * @see Gtm.GtmPackage#getLegacyFares_Fares()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<LegacyFare> getFares();

} // LegacyFares
