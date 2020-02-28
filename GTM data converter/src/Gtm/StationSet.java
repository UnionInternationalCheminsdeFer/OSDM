/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Station Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.StationSet#getStations <em>Stations</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getStationSet()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AT_LEAST_ONE'"
 * @generated
 */
public interface StationSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Stations</b></em>' reference list.
	 * The list contents are of type {@link Gtm.Station}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stations</em>' reference list.
	 * @see Gtm.GtmPackage#getStationSet_Stations()
	 * @model
	 * @generated
	 */
	EList<Station> getStations();

} // StationSet
