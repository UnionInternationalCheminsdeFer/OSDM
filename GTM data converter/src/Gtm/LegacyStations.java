/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Stations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.LegacyStations#getLegacyStations <em>Legacy Stations</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacyStations()
 * @model
 * @generated
 */
public interface LegacyStations extends EObject {
	/**
	 * Returns the value of the '<em><b>Legacy Stations</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.LegacyStation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Stations</em>' containment reference list.
	 * @see Gtm.GtmPackage#getLegacyStations_LegacyStations()
	 * @model containment="true"
	 * @generated
	 */
	EList<LegacyStation> getLegacyStations();

} // LegacyStations
