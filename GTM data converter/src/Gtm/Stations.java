/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.Stations#getStations <em>Stations</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getStations()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AT_LEAST_ONE'"
 * @generated
 */
public interface Stations extends EObject {
	/**
	 * Returns the value of the '<em><b>Stations</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.Station}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stations</em>' containment reference list.
	 * @see Gtm.GtmPackage#getStations_Stations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Station> getStations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model countryCodeUICDataType="org.eclipse.emf.ecore.xml.type.Int" localCodeDataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	Station findStation(int countryCodeUIC, int localCode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model countryCodeUICDataType="org.eclipse.emf.ecore.xml.type.Int" localCodeDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	Station findStation(int countryCodeUIC, String localCode);

} // Stations
