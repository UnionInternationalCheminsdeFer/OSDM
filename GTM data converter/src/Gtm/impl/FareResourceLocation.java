/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fare Resource Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.FareResourceLocation#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.FareResourceLocation#getCarrierResourceLocations <em>Carrier Resource Locations</em>}</li>
 *   <li>{@link Gtm.FareResourceLocation#getStationResourceLocations <em>Station Resource Locations</em>}</li>
 *   <li>{@link Gtm.FareResourceLocation#getTrainResourceLocations <em>Train Resource Locations</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getFareResourceLocation()
 * @model
 * @generated
 */
public interface FareResourceLocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Gtm.GtmPackage#getFareResourceLocation_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Gtm.FareResourceLocation#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Carrier Resource Locations</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.CarrierResourceLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Resource Locations</em>' containment reference list.
	 * @see Gtm.GtmPackage#getFareResourceLocation_CarrierResourceLocations()
	 * @model containment="true"
	 * @generated
	 */
	EList<CarrierResourceLocation> getCarrierResourceLocations();

	/**
	 * Returns the value of the '<em><b>Station Resource Locations</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.StationResourceLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station Resource Locations</em>' containment reference list.
	 * @see Gtm.GtmPackage#getFareResourceLocation_StationResourceLocations()
	 * @model containment="true"
	 * @generated
	 */
	EList<StationResourceLocation> getStationResourceLocations();

	/**
	 * Returns the value of the '<em><b>Train Resource Locations</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.TrainResourceLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train Resource Locations</em>' containment reference list.
	 * @see Gtm.GtmPackage#getFareResourceLocation_TrainResourceLocations()
	 * @model containment="true"
	 * @generated
	 */
	EList<TrainResourceLocation> getTrainResourceLocations();

} // FareResourceLocation
