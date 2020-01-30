/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fare Resource Locations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.FareResourceLocations#getTrainResourceLocations <em>Train Resource Locations</em>}</li>
 *   <li>{@link Gtm.FareResourceLocations#getStationResourceLocations <em>Station Resource Locations</em>}</li>
 *   <li>{@link Gtm.FareResourceLocations#getCarrierResourceLocations <em>Carrier Resource Locations</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getFareResourceLocations()
 * @model
 * @generated
 */
public interface FareResourceLocations extends EObject {
	/**
	 * Returns the value of the '<em><b>Carrier Resource Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Resource Locations</em>' containment reference.
	 * @see #setCarrierResourceLocations(CarrierResourceLocations)
	 * @see Gtm.GtmPackage#getFareResourceLocations_CarrierResourceLocations()
	 * @model containment="true"
	 * @generated
	 */
	CarrierResourceLocations getCarrierResourceLocations();

	/**
	 * Sets the value of the '{@link Gtm.FareResourceLocations#getCarrierResourceLocations <em>Carrier Resource Locations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Resource Locations</em>' containment reference.
	 * @see #getCarrierResourceLocations()
	 * @generated
	 */
	void setCarrierResourceLocations(CarrierResourceLocations value);

	/**
	 * Returns the value of the '<em><b>Station Resource Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station Resource Locations</em>' containment reference.
	 * @see #setStationResourceLocations(StationResourceLocations)
	 * @see Gtm.GtmPackage#getFareResourceLocations_StationResourceLocations()
	 * @model containment="true"
	 * @generated
	 */
	StationResourceLocations getStationResourceLocations();

	/**
	 * Sets the value of the '{@link Gtm.FareResourceLocations#getStationResourceLocations <em>Station Resource Locations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Station Resource Locations</em>' containment reference.
	 * @see #getStationResourceLocations()
	 * @generated
	 */
	void setStationResourceLocations(StationResourceLocations value);

	/**
	 * Returns the value of the '<em><b>Train Resource Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train Resource Locations</em>' containment reference.
	 * @see #setTrainResourceLocations(TrainResourceLocations)
	 * @see Gtm.GtmPackage#getFareResourceLocations_TrainResourceLocations()
	 * @model containment="true"
	 * @generated
	 */
	TrainResourceLocations getTrainResourceLocations();

	/**
	 * Sets the value of the '{@link Gtm.FareResourceLocations#getTrainResourceLocations <em>Train Resource Locations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train Resource Locations</em>' containment reference.
	 * @see #getTrainResourceLocations()
	 * @generated
	 */
	void setTrainResourceLocations(TrainResourceLocations value);

} // FareResourceLocations
