/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.ServiceConstraint#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.ServiceConstraint#getIncludedServiceBrands <em>Included Service Brands</em>}</li>
 *   <li>{@link Gtm.ServiceConstraint#getExcludedServiceBrands <em>Excluded Service Brands</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getServiceConstraint()
 * @model
 * @generated
 */
public interface ServiceConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Gtm.GtmPackage#getServiceConstraint_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Gtm.ServiceConstraint#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Included Service Brands</b></em>' reference list.
	 * The list contents are of type {@link Gtm.ServiceBrand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included Service Brands</em>' reference list.
	 * @see Gtm.GtmPackage#getServiceConstraint_IncludedServiceBrands()
	 * @model
	 * @generated
	 */
	EList<ServiceBrand> getIncludedServiceBrands();

	/**
	 * Returns the value of the '<em><b>Excluded Service Brands</b></em>' reference list.
	 * The list contents are of type {@link Gtm.ServiceBrand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excluded Service Brands</em>' reference list.
	 * @see Gtm.GtmPackage#getServiceConstraint_ExcludedServiceBrands()
	 * @model
	 * @generated
	 */
	EList<ServiceBrand> getExcludedServiceBrands();

} // ServiceConstraint
