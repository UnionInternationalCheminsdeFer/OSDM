/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Station Resource Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.StationResourceLocation#getOnlineResources <em>Online Resources</em>}</li>
 *   <li>{@link Gtm.StationResourceLocation#getStations <em>Stations</em>}</li>
 *   <li>{@link Gtm.StationResourceLocation#getConnectionPoints <em>Connection Points</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getStationResourceLocation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AT_LEAST_ONE_ONLINE_RESOURCE AT_LEAST_ONE_STATION_OR_CONNECTION_POINT'"
 * @generated
 */
public interface StationResourceLocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Online Resources</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.OnlineResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Online Resources</em>' containment reference list.
	 * @see Gtm.GtmPackage#getStationResourceLocation_OnlineResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<OnlineResource> getOnlineResources();

	/**
	 * Returns the value of the '<em><b>Stations</b></em>' reference list.
	 * The list contents are of type {@link Gtm.Station}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stations</em>' reference list.
	 * @see Gtm.GtmPackage#getStationResourceLocation_Stations()
	 * @model
	 * @generated
	 */
	EList<Station> getStations();

	/**
	 * Returns the value of the '<em><b>Connection Points</b></em>' reference list.
	 * The list contents are of type {@link Gtm.ConnectionPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Points</em>' reference list.
	 * @see Gtm.GtmPackage#getStationResourceLocation_ConnectionPoints()
	 * @model
	 * @generated
	 */
	EList<ConnectionPoint> getConnectionPoints();

} // StationResourceLocation
