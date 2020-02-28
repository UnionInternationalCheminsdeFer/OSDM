/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Brands</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.ServiceBrands#getServiceBrands <em>Service Brands</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getServiceBrands()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AT_LEAST_ONE'"
 * @generated
 */
public interface ServiceBrands extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Brands</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.ServiceBrand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Brands</em>' containment reference list.
	 * @see Gtm.GtmPackage#getServiceBrands_ServiceBrands()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceBrand> getServiceBrands();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model codeDataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	ServiceBrand findServiceBRand(int code);

} // ServiceBrands
