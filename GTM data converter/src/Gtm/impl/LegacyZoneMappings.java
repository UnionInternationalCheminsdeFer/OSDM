/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Zone Mappings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.LegacyZoneMappings#getLegacyZoneMap <em>Legacy Zone Map</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacyZoneMappings()
 * @model
 * @generated
 */
public interface LegacyZoneMappings extends EObject {
	/**
	 * Returns the value of the '<em><b>Legacy Zone Map</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.LegacyZoneMap}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Zone Map</em>' containment reference list.
	 * @see Gtm.GtmPackage#getLegacyZoneMappings_LegacyZoneMap()
	 * @model containment="true"
	 * @generated
	 */
	EList<LegacyZoneMap> getLegacyZoneMap();

} // LegacyZoneMappings
