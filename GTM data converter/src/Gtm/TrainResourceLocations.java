/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Train Resource Locations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.TrainResourceLocations#getTrainResourceLocations <em>Train Resource Locations</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getTrainResourceLocations()
 * @model
 * @generated
 */
public interface TrainResourceLocations extends EObject {
	/**
	 * Returns the value of the '<em><b>Train Resource Locations</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.TrainResourceLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train Resource Locations</em>' containment reference list.
	 * @see Gtm.GtmPackage#getTrainResourceLocations_TrainResourceLocations()
	 * @model containment="true"
	 * @generated
	 */
	EList<TrainResourceLocation> getTrainResourceLocations();

} // TrainResourceLocations
