/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Fare Detail Maps</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.LegacyFareDetailMaps#getLegacyFareDetailMaps <em>Legacy Fare Detail Maps</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacyFareDetailMaps()
 * @model
 * @generated
 */
public interface LegacyFareDetailMaps extends EObject {
	/**
	 * Returns the value of the '<em><b>Legacy Fare Detail Maps</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.LegacyFareDetailMap}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Fare Detail Maps</em>' containment reference list.
	 * @see Gtm.GtmPackage#getLegacyFareDetailMaps_LegacyFareDetailMaps()
	 * @model containment="true"
	 * @generated
	 */
	EList<LegacyFareDetailMap> getLegacyFareDetailMaps();

} // LegacyFareDetailMaps
