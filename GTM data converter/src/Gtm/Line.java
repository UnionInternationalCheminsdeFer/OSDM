/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.Line#getBinaryZoneId <em>Binary Zone Id</em>}</li>
 *   <li>{@link Gtm.Line#getLineId <em>Line Id</em>}</li>
 *   <li>{@link Gtm.Line#getCarrier <em>Carrier</em>}</li>
 *   <li>{@link Gtm.Line#getEntryStation <em>Entry Station</em>}</li>
 *   <li>{@link Gtm.Line#getTerminalStation <em>Terminal Station</em>}</li>
 *   <li>{@link Gtm.Line#getNutsCode <em>Nuts Code</em>}</li>
 *   <li>{@link Gtm.Line#getCity <em>City</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLine()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CARRIER_MUST'"
 * @generated
 */
public interface Line extends EObject {
	/**
	 * Returns the value of the '<em><b>Binary Zone Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Zone Id</em>' attribute.
	 * @see #setBinaryZoneId(byte[])
	 * @see Gtm.GtmPackage#getLine_BinaryZoneId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 * @generated
	 */
	byte[] getBinaryZoneId();

	/**
	 * Sets the value of the '{@link Gtm.Line#getBinaryZoneId <em>Binary Zone Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary Zone Id</em>' attribute.
	 * @see #getBinaryZoneId()
	 * @generated
	 */
	void setBinaryZoneId(byte[] value);

	/**
	 * Returns the value of the '<em><b>Line Id</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Id</em>' attribute list.
	 * @see Gtm.GtmPackage#getLine_LineId()
	 * @model
	 * @generated
	 */
	EList<String> getLineId();

	/**
	 * Returns the value of the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier</em>' reference.
	 * @see #setCarrier(Carrier)
	 * @see Gtm.GtmPackage#getLine_Carrier()
	 * @model
	 * @generated
	 */
	Carrier getCarrier();

	/**
	 * Sets the value of the '{@link Gtm.Line#getCarrier <em>Carrier</em>}' reference.
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
	 * @see Gtm.GtmPackage#getLine_EntryStation()
	 * @model
	 * @generated
	 */
	Station getEntryStation();

	/**
	 * Sets the value of the '{@link Gtm.Line#getEntryStation <em>Entry Station</em>}' reference.
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
	 * @see Gtm.GtmPackage#getLine_TerminalStation()
	 * @model
	 * @generated
	 */
	Station getTerminalStation();

	/**
	 * Sets the value of the '{@link Gtm.Line#getTerminalStation <em>Terminal Station</em>}' reference.
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
	 * @see Gtm.GtmPackage#getLine_NutsCode()
	 * @model
	 * @generated
	 */
	NutsCode getNutsCode();

	/**
	 * Sets the value of the '{@link Gtm.Line#getNutsCode <em>Nuts Code</em>}' reference.
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
	 * @see Gtm.GtmPackage#getLine_City()
	 * @model
	 * @generated
	 */
	int getCity();

	/**
	 * Sets the value of the '{@link Gtm.Line#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(int value);

} // Line
