/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>After Sales Rules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.AfterSalesRules#getAfterSalesRules <em>After Sales Rules</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getAfterSalesRules()
 * @model
 * @generated
 */
public interface AfterSalesRules extends EObject {
	/**
	 * Returns the value of the '<em><b>After Sales Rules</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.AfterSalesRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Sales Rules</em>' containment reference list.
	 * @see Gtm.GtmPackage#getAfterSalesRules_AfterSalesRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<AfterSalesRule> getAfterSalesRules();

} // AfterSalesRules
