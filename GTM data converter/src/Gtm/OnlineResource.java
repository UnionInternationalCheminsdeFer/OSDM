/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Online Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.OnlineResource#getOfferRequestType <em>Offer Request Type</em>}</li>
 *   <li>{@link Gtm.OnlineResource#getInterfaceType <em>Interface Type</em>}</li>
 *   <li>{@link Gtm.OnlineResource#getVersion <em>Version</em>}</li>
 *   <li>{@link Gtm.OnlineResource#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getOnlineResource()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='REQUEST_TYPE_MUST INTERFACE_TYPE_MUST SYSTEM_MUST'"
 * @generated
 */
public interface OnlineResource extends EObject {
	/**
	 * Returns the value of the '<em><b>Offer Request Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.OfferRequestType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offer Request Type</em>' attribute.
	 * @see Gtm.OfferRequestType
	 * @see #setOfferRequestType(OfferRequestType)
	 * @see Gtm.GtmPackage#getOnlineResource_OfferRequestType()
	 * @model
	 * @generated
	 */
	OfferRequestType getOfferRequestType();

	/**
	 * Sets the value of the '{@link Gtm.OnlineResource#getOfferRequestType <em>Offer Request Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offer Request Type</em>' attribute.
	 * @see Gtm.OfferRequestType
	 * @see #getOfferRequestType()
	 * @generated
	 */
	void setOfferRequestType(OfferRequestType value);

	/**
	 * Returns the value of the '<em><b>Interface Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.InterfaceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Type</em>' attribute.
	 * @see Gtm.InterfaceType
	 * @see #setInterfaceType(InterfaceType)
	 * @see Gtm.GtmPackage#getOnlineResource_InterfaceType()
	 * @model
	 * @generated
	 */
	InterfaceType getInterfaceType();

	/**
	 * Sets the value of the '{@link Gtm.OnlineResource#getInterfaceType <em>Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Type</em>' attribute.
	 * @see Gtm.InterfaceType
	 * @see #getInterfaceType()
	 * @generated
	 */
	void setInterfaceType(InterfaceType value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see Gtm.GtmPackage#getOnlineResource_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link Gtm.OnlineResource#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' attribute.
	 * @see #setSystem(String)
	 * @see Gtm.GtmPackage#getOnlineResource_System()
	 * @model
	 * @generated
	 */
	String getSystem();

	/**
	 * Sets the value of the '{@link Gtm.OnlineResource#getSystem <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' attribute.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(String value);

} // OnlineResource
