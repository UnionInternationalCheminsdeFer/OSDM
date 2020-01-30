/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NUTS Codes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.NUTSCodes#getNutsCodes <em>Nuts Codes</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getNUTSCodes()
 * @model
 * @generated
 */
public interface NUTSCodes extends EObject {
	/**
	 * Returns the value of the '<em><b>Nuts Codes</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.NutsCode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nuts Codes</em>' containment reference list.
	 * @see Gtm.GtmPackage#getNUTSCodes_NutsCodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<NutsCode> getNutsCodes();

} // NUTSCodes
