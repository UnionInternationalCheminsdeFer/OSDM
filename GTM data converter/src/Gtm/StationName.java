/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Station Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.StationName#getStation <em>Station</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getStationName()
 * @model
 * @generated
 */
public interface StationName extends EObject {
	/**
	 * Returns the value of the '<em><b>Station</b></em>' reference list.
	 * The list contents are of type {@link Gtm.Station}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station</em>' reference list.
	 * @see Gtm.GtmPackage#getStationName_Station()
	 * @model
	 * @generated
	 */
	EList<Station> getStation();

} // StationName
