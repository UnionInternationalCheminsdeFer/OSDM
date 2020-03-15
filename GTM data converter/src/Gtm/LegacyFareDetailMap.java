/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Fare Detail Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.LegacyFareDetailMap#getLegacyCode <em>Legacy Code</em>}</li>
 *   <li>{@link Gtm.LegacyFareDetailMap#getFareDetailDescription <em>Fare Detail Description</em>}</li>
 *   <li>{@link Gtm.LegacyFareDetailMap#getFareDetailMappingType <em>Fare Detail Mapping Type</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacyFareDetailMap()
 * @model
 * @generated
 */
public interface LegacyFareDetailMap extends EObject {
	/**
	 * Returns the value of the '<em><b>Legacy Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Code</em>' attribute.
	 * @see #setLegacyCode(int)
	 * @see Gtm.GtmPackage#getLegacyFareDetailMap_LegacyCode()
	 * @model
	 * @generated
	 */
	int getLegacyCode();

	/**
	 * Sets the value of the '{@link Gtm.LegacyFareDetailMap#getLegacyCode <em>Legacy Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legacy Code</em>' attribute.
	 * @see #getLegacyCode()
	 * @generated
	 */
	void setLegacyCode(int value);

	/**
	 * Returns the value of the '<em><b>Fare Detail Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fare Detail Description</em>' reference.
	 * @see #setFareDetailDescription(Text)
	 * @see Gtm.GtmPackage#getLegacyFareDetailMap_FareDetailDescription()
	 * @model
	 * @generated
	 */
	Text getFareDetailDescription();

	/**
	 * Sets the value of the '{@link Gtm.LegacyFareDetailMap#getFareDetailDescription <em>Fare Detail Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fare Detail Description</em>' reference.
	 * @see #getFareDetailDescription()
	 * @generated
	 */
	void setFareDetailDescription(Text value);

	/**
	 * Returns the value of the '<em><b>Fare Detail Mapping Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.StationFareDetailType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fare Detail Mapping Type</em>' attribute.
	 * @see Gtm.StationFareDetailType
	 * @see #setFareDetailMappingType(StationFareDetailType)
	 * @see Gtm.GtmPackage#getLegacyFareDetailMap_FareDetailMappingType()
	 * @model
	 * @generated
	 */
	StationFareDetailType getFareDetailMappingType();

	/**
	 * Sets the value of the '{@link Gtm.LegacyFareDetailMap#getFareDetailMappingType <em>Fare Detail Mapping Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fare Detail Mapping Type</em>' attribute.
	 * @see Gtm.StationFareDetailType
	 * @see #getFareDetailMappingType()
	 * @generated
	 */
	void setFareDetailMappingType(StationFareDetailType value);

} // LegacyFareDetailMap
