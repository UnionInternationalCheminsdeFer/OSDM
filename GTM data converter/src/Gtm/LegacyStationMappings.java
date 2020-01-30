/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Station Mappings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.LegacyStationMappings#getStationMappings <em>Station Mappings</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacyStationMappings()
 * @model
 * @generated
 */
public interface LegacyStationMappings extends EObject {
	/**
	 * Returns the value of the '<em><b>Station Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.LegacyStationMap}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station Mappings</em>' containment reference list.
	 * @see Gtm.GtmPackage#getLegacyStationMappings_StationMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<LegacyStationMap> getStationMappings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model stationcodeDataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	Station findMappedStation(int stationcode);

} // LegacyStationMappings
