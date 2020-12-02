/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vat Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.VatTemplate#getScope <em>Scope</em>}</li>
 *   <li>{@link Gtm.VatTemplate#getCountry <em>Country</em>}</li>
 *   <li>{@link Gtm.VatTemplate#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link Gtm.VatTemplate#getTaxId <em>Tax Id</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getVatTemplate()
 * @model
 * @generated
 */
public interface VatTemplate extends EObject {
	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.TaxScope}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see Gtm.TaxScope
	 * @see #setScope(TaxScope)
	 * @see Gtm.GtmPackage#getVatTemplate_Scope()
	 * @model
	 * @generated
	 */
	TaxScope getScope();

	/**
	 * Sets the value of the '{@link Gtm.VatTemplate#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see Gtm.TaxScope
	 * @see #getScope()
	 * @generated
	 */
	void setScope(TaxScope value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' reference.
	 * @see #setCountry(Country)
	 * @see Gtm.GtmPackage#getVatTemplate_Country()
	 * @model
	 * @generated
	 */
	Country getCountry();

	/**
	 * Sets the value of the '{@link Gtm.VatTemplate#getCountry <em>Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(Country value);

	/**
	 * Returns the value of the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage</em>' attribute.
	 * @see #setPercentage(float)
	 * @see Gtm.GtmPackage#getVatTemplate_Percentage()
	 * @model
	 * @generated
	 */
	float getPercentage();

	/**
	 * Sets the value of the '{@link Gtm.VatTemplate#getPercentage <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage</em>' attribute.
	 * @see #getPercentage()
	 * @generated
	 */
	void setPercentage(float value);

	/**
	 * Returns the value of the '<em><b>Tax Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Id</em>' attribute.
	 * @see #setTaxId(String)
	 * @see Gtm.GtmPackage#getVatTemplate_TaxId()
	 * @model
	 * @generated
	 */
	String getTaxId();

	/**
	 * Sets the value of the '{@link Gtm.VatTemplate#getTaxId <em>Tax Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Id</em>' attribute.
	 * @see #getTaxId()
	 * @generated
	 */
	void setTaxId(String value);

} // VatTemplate
