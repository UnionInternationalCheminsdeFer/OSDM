/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carrier Resource Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.CarrierResourceLocation#getCarrier <em>Carrier</em>}</li>
 *   <li>{@link Gtm.CarrierResourceLocation#getServiceBrand <em>Service Brand</em>}</li>
 *   <li>{@link Gtm.CarrierResourceLocation#getOnlineResources <em>Online Resources</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getCarrierResourceLocation()
 * @model
 * @generated
 */
public interface CarrierResourceLocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier</em>' reference.
	 * @see #setCarrier(Carrier)
	 * @see Gtm.GtmPackage#getCarrierResourceLocation_Carrier()
	 * @model required="true"
	 * @generated
	 */
	Carrier getCarrier();

	/**
	 * Sets the value of the '{@link Gtm.CarrierResourceLocation#getCarrier <em>Carrier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier</em>' reference.
	 * @see #getCarrier()
	 * @generated
	 */
	void setCarrier(Carrier value);

	/**
	 * Returns the value of the '<em><b>Service Brand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Brand</em>' reference.
	 * @see #setServiceBrand(ServiceBrand)
	 * @see Gtm.GtmPackage#getCarrierResourceLocation_ServiceBrand()
	 * @model
	 * @generated
	 */
	ServiceBrand getServiceBrand();

	/**
	 * Sets the value of the '{@link Gtm.CarrierResourceLocation#getServiceBrand <em>Service Brand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Brand</em>' reference.
	 * @see #getServiceBrand()
	 * @generated
	 */
	void setServiceBrand(ServiceBrand value);

	/**
	 * Returns the value of the '<em><b>Online Resources</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.OnlineResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Online Resources</em>' containment reference list.
	 * @see Gtm.GtmPackage#getCarrierResourceLocation_OnlineResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<OnlineResource> getOnlineResources();

} // CarrierResourceLocation
