/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.Zone#getBinaryZoneId <em>Binary Zone Id</em>}</li>
 *   <li>{@link Gtm.Zone#getCarrier <em>Carrier</em>}</li>
 *   <li>{@link Gtm.Zone#getEntryStation <em>Entry Station</em>}</li>
 *   <li>{@link Gtm.Zone#getTerminalStation <em>Terminal Station</em>}</li>
 *   <li>{@link Gtm.Zone#getNutsCode <em>Nuts Code</em>}</li>
 *   <li>{@link Gtm.Zone#getCity <em>City</em>}</li>
 *   <li>{@link Gtm.Zone#getZoneDefinitions <em>Zone Definitions</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getZone()
 * @model
 * @generated
 */
public interface Zone extends EObject {
	/**
	 * Returns the value of the '<em><b>Binary Zone Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Zone Id</em>' attribute.
	 * @see #setBinaryZoneId(byte[])
	 * @see Gtm.GtmPackage#getZone_BinaryZoneId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 * @generated
	 */
	byte[] getBinaryZoneId();

	/**
	 * Sets the value of the '{@link Gtm.Zone#getBinaryZoneId <em>Binary Zone Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary Zone Id</em>' attribute.
	 * @see #getBinaryZoneId()
	 * @generated
	 */
	void setBinaryZoneId(byte[] value);

	/**
	 * Returns the value of the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier</em>' reference.
	 * @see #setCarrier(Carrier)
	 * @see Gtm.GtmPackage#getZone_Carrier()
	 * @model
	 * @generated
	 */
	Carrier getCarrier();

	/**
	 * Sets the value of the '{@link Gtm.Zone#getCarrier <em>Carrier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier</em>' reference.
	 * @see #getCarrier()
	 * @generated
	 */
	void setCarrier(Carrier value);

	/**
	 * Returns the value of the '<em><b>Entry Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Station</em>' reference.
	 * @see #setEntryStation(Station)
	 * @see Gtm.GtmPackage#getZone_EntryStation()
	 * @model
	 * @generated
	 */
	Station getEntryStation();

	/**
	 * Sets the value of the '{@link Gtm.Zone#getEntryStation <em>Entry Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Station</em>' reference.
	 * @see #getEntryStation()
	 * @generated
	 */
	void setEntryStation(Station value);

	/**
	 * Returns the value of the '<em><b>Terminal Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal Station</em>' reference.
	 * @see #setTerminalStation(Station)
	 * @see Gtm.GtmPackage#getZone_TerminalStation()
	 * @model
	 * @generated
	 */
	Station getTerminalStation();

	/**
	 * Sets the value of the '{@link Gtm.Zone#getTerminalStation <em>Terminal Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal Station</em>' reference.
	 * @see #getTerminalStation()
	 * @generated
	 */
	void setTerminalStation(Station value);

	/**
	 * Returns the value of the '<em><b>Nuts Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nuts Code</em>' reference.
	 * @see #setNutsCode(NutsCode)
	 * @see Gtm.GtmPackage#getZone_NutsCode()
	 * @model
	 * @generated
	 */
	NutsCode getNutsCode();

	/**
	 * Sets the value of the '{@link Gtm.Zone#getNutsCode <em>Nuts Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nuts Code</em>' reference.
	 * @see #getNutsCode()
	 * @generated
	 */
	void setNutsCode(NutsCode value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(int)
	 * @see Gtm.GtmPackage#getZone_City()
	 * @model
	 * @generated
	 */
	int getCity();

	/**
	 * Sets the value of the '{@link Gtm.Zone#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(int value);

	/**
	 * Returns the value of the '<em><b>Zone Definitions</b></em>' reference list.
	 * The list contents are of type {@link Gtm.ZoneDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone Definitions</em>' reference list.
	 * @see Gtm.GtmPackage#getZone_ZoneDefinitions()
	 * @model
	 * @generated
	 */
	EList<ZoneDefinition> getZoneDefinitions();

} // Zone
