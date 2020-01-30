/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Boder Point Mappings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.LegacyBoderPointMappings#getBorderPoints <em>Border Points</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacyBoderPointMappings()
 * @model
 * @generated
 */
public interface LegacyBoderPointMappings extends EObject {
	/**
	 * Returns the value of the '<em><b>Border Points</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.LegacyBorderPointMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Points</em>' containment reference list.
	 * @see Gtm.GtmPackage#getLegacyBoderPointMappings_BorderPoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<LegacyBorderPointMapping> getBorderPoints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model borderPointCodeDataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	LegacyBorderPointMapping getMappingByBorderPointCode(int borderPointCode);

} // LegacyBoderPointMappings
