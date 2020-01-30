/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Currencies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.Currencies#getCurrencies <em>Currencies</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getCurrencies()
 * @model
 * @generated
 */
public interface Currencies extends EObject {
	/**
	 * Returns the value of the '<em><b>Currencies</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.Currency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currencies</em>' containment reference list.
	 * @see Gtm.GtmPackage#getCurrencies_Currencies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Currency> getCurrencies();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ISOcodeDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	Currency findCurrency(String ISOcode);

} // Currencies
