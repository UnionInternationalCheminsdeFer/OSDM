/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Station To Service Constraint Mappings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.LegacyStationToServiceConstraintMappings#getLegacyStationToServiceBrandMappings <em>Legacy Station To Service Brand Mappings</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacyStationToServiceConstraintMappings()
 * @model
 * @generated
 */
public interface LegacyStationToServiceConstraintMappings extends EObject {
	/**
	 * Returns the value of the '<em><b>Legacy Station To Service Brand Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.LegacyStationToServiceConstraintMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Station To Service Brand Mappings</em>' containment reference list.
	 * @see Gtm.GtmPackage#getLegacyStationToServiceConstraintMappings_LegacyStationToServiceBrandMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<LegacyStationToServiceConstraintMapping> getLegacyStationToServiceBrandMappings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ServiceConstraint findServiceConstraint(int stationCode);

} // LegacyStationToServiceConstraintMappings
