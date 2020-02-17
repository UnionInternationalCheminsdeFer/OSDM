/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Fare Station Set Mappings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.LegacyFareStationSetMappings#getLegacyFareStationSetMap <em>Legacy Fare Station Set Map</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacyFareStationSetMappings()
 * @model
 * @generated
 */
public interface LegacyFareStationSetMappings extends EObject {
	/**
	 * Returns the value of the '<em><b>Legacy Fare Station Set Map</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.LegacyFareStationSetMap}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Fare Station Set Map</em>' containment reference list.
	 * @see Gtm.GtmPackage#getLegacyFareStationSetMappings_LegacyFareStationSetMap()
	 * @model containment="true"
	 * @generated
	 */
	EList<LegacyFareStationSetMap> getLegacyFareStationSetMap();

} // LegacyFareStationSetMappings
