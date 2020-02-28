/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Currency Price</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.CurrencyPrice#getCurrency <em>Currency</em>}</li>
 *   <li>{@link Gtm.CurrencyPrice#getAmount <em>Amount</em>}</li>
 *   <li>{@link Gtm.CurrencyPrice#getVATdetails <em>VA Tdetails</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getCurrencyPrice()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='VAT_PLAUSIBILITY_CHECK CURRENCY_MUST AMOUNT_MUST'"
 * @generated
 */
public interface CurrencyPrice extends EObject {
	/**
	 * Returns the value of the '<em><b>Currency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency</em>' reference.
	 * @see #setCurrency(Currency)
	 * @see Gtm.GtmPackage#getCurrencyPrice_Currency()
	 * @model
	 * @generated
	 */
	Currency getCurrency();

	/**
	 * Sets the value of the '{@link Gtm.CurrencyPrice#getCurrency <em>Currency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' reference.
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(Currency value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(float)
	 * @see Gtm.GtmPackage#getCurrencyPrice_Amount()
	 * @model
	 * @generated
	 */
	float getAmount();

	/**
	 * Sets the value of the '{@link Gtm.CurrencyPrice#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(float value);

	/**
	 * Returns the value of the '<em><b>VA Tdetails</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.VATDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VA Tdetails</em>' containment reference list.
	 * @see Gtm.GtmPackage#getCurrencyPrice_VATdetails()
	 * @model containment="true"
	 * @generated
	 */
	EList<VATDetail> getVATdetails();

} // CurrencyPrice
