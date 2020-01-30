/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Fare</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.LegacyFare#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacyFare()
 * @model
 * @generated
 */
public interface LegacyFare extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.LegacyDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 * @see Gtm.GtmPackage#getLegacyFare_Description()
	 * @model containment="true" upper="5"
	 * @generated
	 */
	EList<LegacyDescription> getDescription();

} // LegacyFare
