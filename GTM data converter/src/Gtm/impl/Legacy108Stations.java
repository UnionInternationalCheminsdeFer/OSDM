/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy108 Stations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.Legacy108Stations#getLegacyStations <em>Legacy Stations</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacy108Stations()
 * @model
 * @generated
 */
public interface Legacy108Stations extends EObject {
	/**
	 * Returns the value of the '<em><b>Legacy Stations</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.Legacy108Station}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Stations</em>' containment reference list.
	 * @see Gtm.GtmPackage#getLegacy108Stations_LegacyStations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Legacy108Station> getLegacyStations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model codeDataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	Legacy108Station findStation(int code);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model codeDataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	Legacy108Station findByBorderPoint(int code);

} // Legacy108Stations
