/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Fare Templates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.LegacyFareTemplates#getFareTemplates <em>Fare Templates</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacyFareTemplates()
 * @model
 * @generated
 */
public interface LegacyFareTemplates extends EObject {
	/**
	 * Returns the value of the '<em><b>Fare Templates</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.FareTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fare Templates</em>' containment reference list.
	 * @see Gtm.GtmPackage#getLegacyFareTemplates_FareTemplates()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FareTemplate> getFareTemplates();

} // LegacyFareTemplates
