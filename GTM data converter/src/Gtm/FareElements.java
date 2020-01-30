/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fare Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.FareElements#getFareElements <em>Fare Elements</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getFareElements()
 * @model
 * @generated
 */
public interface FareElements extends EObject {
	/**
	 * Returns the value of the '<em><b>Fare Elements</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.FareElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fare Elements</em>' containment reference list.
	 * @see Gtm.GtmPackage#getFareElements_FareElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<FareElement> getFareElements();

} // FareElements
