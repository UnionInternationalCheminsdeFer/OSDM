/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carrier Resource Locations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.CarrierResourceLocations#getCarrierResourceLocations <em>Carrier Resource Locations</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getCarrierResourceLocations()
 * @model
 * @generated
 */
public interface CarrierResourceLocations extends EObject {
	/**
	 * Returns the value of the '<em><b>Carrier Resource Locations</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.CarrierResourceLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Resource Locations</em>' containment reference list.
	 * @see Gtm.GtmPackage#getCarrierResourceLocations_CarrierResourceLocations()
	 * @model containment="true"
	 * @generated
	 */
	EList<CarrierResourceLocation> getCarrierResourceLocations();

} // CarrierResourceLocations
