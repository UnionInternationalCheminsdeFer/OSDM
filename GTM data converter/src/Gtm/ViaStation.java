/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Via Station</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.ViaStation#getStation <em>Station</em>}</li>
 *   <li>{@link Gtm.ViaStation#getCarrier <em>Carrier</em>}</li>
 *   <li>{@link Gtm.ViaStation#getRoute <em>Route</em>}</li>
 *   <li>{@link Gtm.ViaStation#getAlternativeRoutes <em>Alternative Routes</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getViaStation()
 * @model
 * @generated
 */
public interface ViaStation extends EObject {
	/**
	 * Returns the value of the '<em><b>Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station</em>' reference.
	 * @see #setStation(Station)
	 * @see Gtm.GtmPackage#getViaStation_Station()
	 * @model
	 * @generated
	 */
	Station getStation();

	/**
	 * Sets the value of the '{@link Gtm.ViaStation#getStation <em>Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Station</em>' reference.
	 * @see #getStation()
	 * @generated
	 */
	void setStation(Station value);

	/**
	 * Returns the value of the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' containment reference.
	 * @see #setRoute(Route)
	 * @see Gtm.GtmPackage#getViaStation_Route()
	 * @model containment="true"
	 * @generated
	 */
	Route getRoute();

	/**
	 * Sets the value of the '{@link Gtm.ViaStation#getRoute <em>Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' containment reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(Route value);

	/**
	 * Returns the value of the '<em><b>Alternative Routes</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.AlternativeRoute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative Routes</em>' containment reference list.
	 * @see Gtm.GtmPackage#getViaStation_AlternativeRoutes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AlternativeRoute> getAlternativeRoutes();

	/**
	 * Returns the value of the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier</em>' reference.
	 * @see #setCarrier(Carrier)
	 * @see Gtm.GtmPackage#getViaStation_Carrier()
	 * @model
	 * @generated
	 */
	Carrier getCarrier();

	/**
	 * Sets the value of the '{@link Gtm.ViaStation#getCarrier <em>Carrier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier</em>' reference.
	 * @see #getCarrier()
	 * @generated
	 */
	void setCarrier(Carrier value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getDescription();

} // ViaStation
