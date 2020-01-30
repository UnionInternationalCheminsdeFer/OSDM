/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cross Border Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.CrossBorderCondition#getFromCountry <em>From Country</em>}</li>
 *   <li>{@link Gtm.CrossBorderCondition#getToCountry <em>To Country</em>}</li>
 *   <li>{@link Gtm.CrossBorderCondition#getAffectedServiceBrands <em>Affected Service Brands</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getCrossBorderCondition()
 * @model
 * @generated
 */
public interface CrossBorderCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>From Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Country</em>' reference.
	 * @see #setFromCountry(Country)
	 * @see Gtm.GtmPackage#getCrossBorderCondition_FromCountry()
	 * @model
	 * @generated
	 */
	Country getFromCountry();

	/**
	 * Sets the value of the '{@link Gtm.CrossBorderCondition#getFromCountry <em>From Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Country</em>' reference.
	 * @see #getFromCountry()
	 * @generated
	 */
	void setFromCountry(Country value);

	/**
	 * Returns the value of the '<em><b>To Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Country</em>' reference.
	 * @see #setToCountry(Country)
	 * @see Gtm.GtmPackage#getCrossBorderCondition_ToCountry()
	 * @model
	 * @generated
	 */
	Country getToCountry();

	/**
	 * Sets the value of the '{@link Gtm.CrossBorderCondition#getToCountry <em>To Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Country</em>' reference.
	 * @see #getToCountry()
	 * @generated
	 */
	void setToCountry(Country value);

	/**
	 * Returns the value of the '<em><b>Affected Service Brands</b></em>' reference list.
	 * The list contents are of type {@link Gtm.ServiceBrand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Service Brands</em>' reference list.
	 * @see Gtm.GtmPackage#getCrossBorderCondition_AffectedServiceBrands()
	 * @model
	 * @generated
	 */
	EList<ServiceBrand> getAffectedServiceBrands();

} // CrossBorderCondition
