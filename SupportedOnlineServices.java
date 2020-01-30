/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supported Online Services</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.SupportedOnlineServices#getSupportedOnlineServices <em>Supported Online Services</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getSupportedOnlineServices()
 * @model
 * @generated
 */
public interface SupportedOnlineServices extends EObject {
	/**
	 * Returns the value of the '<em><b>Supported Online Services</b></em>' attribute list.
	 * The list contents are of type {@link Gtm.OnlineServiceType}.
	 * The literals are from the enumeration {@link Gtm.OnlineServiceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Online Services</em>' attribute list.
	 * @see Gtm.OnlineServiceType
	 * @see Gtm.GtmPackage#getSupportedOnlineServices_SupportedOnlineServices()
	 * @model
	 * @generated
	 */
	EList<OnlineServiceType> getSupportedOnlineServices();

} // SupportedOnlineServices
