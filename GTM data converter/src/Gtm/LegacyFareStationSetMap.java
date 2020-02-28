/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Fare Station Set Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.LegacyFareStationSetMap#getLegacyCode <em>Legacy Code</em>}</li>
 *   <li>{@link Gtm.LegacyFareStationSetMap#getStationSet <em>Station Set</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacyFareStationSetMap()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CODE_NOT_NULL STATION_SET_MUST'"
 * @generated
 */
public interface LegacyFareStationSetMap extends EObject {
	/**
	 * Returns the value of the '<em><b>Legacy Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Code</em>' attribute.
	 * @see #setLegacyCode(int)
	 * @see Gtm.GtmPackage#getLegacyFareStationSetMap_LegacyCode()
	 * @model
	 * @generated
	 */
	int getLegacyCode();

	/**
	 * Sets the value of the '{@link Gtm.LegacyFareStationSetMap#getLegacyCode <em>Legacy Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legacy Code</em>' attribute.
	 * @see #getLegacyCode()
	 * @generated
	 */
	void setLegacyCode(int value);

	/**
	 * Returns the value of the '<em><b>Station Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station Set</em>' reference.
	 * @see #setStationSet(FareStationSetDefinition)
	 * @see Gtm.GtmPackage#getLegacyFareStationSetMap_StationSet()
	 * @model
	 * @generated
	 */
	FareStationSetDefinition getStationSet();

	/**
	 * Sets the value of the '{@link Gtm.LegacyFareStationSetMap#getStationSet <em>Station Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Station Set</em>' reference.
	 * @see #getStationSet()
	 * @generated
	 */
	void setStationSet(FareStationSetDefinition value);

} // LegacyFareStationSetMap
