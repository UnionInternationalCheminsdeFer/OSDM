/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vat Templates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.VatTemplates#getVatTemplates <em>Vat Templates</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getVatTemplates()
 * @model
 * @generated
 */
public interface VatTemplates extends EObject {
	/**
	 * Returns the value of the '<em><b>Vat Templates</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.VatTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vat Templates</em>' containment reference list.
	 * @see Gtm.GtmPackage#getVatTemplates_VatTemplates()
	 * @model containment="true"
	 * @generated
	 */
	EList<VatTemplate> getVatTemplates();

} // VatTemplates
