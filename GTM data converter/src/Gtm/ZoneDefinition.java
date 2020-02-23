/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zone Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.ZoneDefinition#getProvider <em>Provider</em>}</li>
 *   <li>{@link Gtm.ZoneDefinition#getZoneId <em>Zone Id</em>}</li>
 *   <li>{@link Gtm.ZoneDefinition#getName <em>Name</em>}</li>
 *   <li>{@link Gtm.ZoneDefinition#getPolygone <em>Polygone</em>}</li>
 *   <li>{@link Gtm.ZoneDefinition#getNameUtf8 <em>Name Utf8</em>}</li>
 *   <li>{@link Gtm.ZoneDefinition#getStationSet <em>Station Set</em>}</li>
 *   <li>{@link Gtm.ZoneDefinition#getNutsCodes <em>Nuts Codes</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getZoneDefinition()
 * @model
 * @generated
 */
public interface ZoneDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' reference.
	 * @see #setProvider(Carrier)
	 * @see Gtm.GtmPackage#getZoneDefinition_Provider()
	 * @model
	 * @generated
	 */
	Carrier getProvider();

	/**
	 * Sets the value of the '{@link Gtm.ZoneDefinition#getProvider <em>Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(Carrier value);

	/**
	 * Returns the value of the '<em><b>Zone Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone Id</em>' attribute.
	 * @see #setZoneId(String)
	 * @see Gtm.GtmPackage#getZoneDefinition_ZoneId()
	 * @model
	 * @generated
	 */
	String getZoneId();

	/**
	 * Sets the value of the '{@link Gtm.ZoneDefinition#getZoneId <em>Zone Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone Id</em>' attribute.
	 * @see #getZoneId()
	 * @generated
	 */
	void setZoneId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Gtm.GtmPackage#getZoneDefinition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Gtm.ZoneDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Polygone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygone</em>' containment reference.
	 * @see #setPolygone(Polygone)
	 * @see Gtm.GtmPackage#getZoneDefinition_Polygone()
	 * @model containment="true"
	 * @generated
	 */
	Polygone getPolygone();

	/**
	 * Sets the value of the '{@link Gtm.ZoneDefinition#getPolygone <em>Polygone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polygone</em>' containment reference.
	 * @see #getPolygone()
	 * @generated
	 */
	void setPolygone(Polygone value);

	/**
	 * Returns the value of the '<em><b>Name Utf8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Utf8</em>' attribute.
	 * @see #setNameUtf8(String)
	 * @see Gtm.GtmPackage#getZoneDefinition_NameUtf8()
	 * @model
	 * @generated
	 */
	String getNameUtf8();

	/**
	 * Sets the value of the '{@link Gtm.ZoneDefinition#getNameUtf8 <em>Name Utf8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Utf8</em>' attribute.
	 * @see #getNameUtf8()
	 * @generated
	 */
	void setNameUtf8(String value);

	/**
	 * Returns the value of the '<em><b>Station Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station Set</em>' containment reference.
	 * @see #setStationSet(StationSet)
	 * @see Gtm.GtmPackage#getZoneDefinition_StationSet()
	 * @model containment="true"
	 * @generated
	 */
	StationSet getStationSet();

	/**
	 * Sets the value of the '{@link Gtm.ZoneDefinition#getStationSet <em>Station Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Station Set</em>' containment reference.
	 * @see #getStationSet()
	 * @generated
	 */
	void setStationSet(StationSet value);

	/**
	 * Returns the value of the '<em><b>Nuts Codes</b></em>' reference list.
	 * The list contents are of type {@link Gtm.NutsCode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nuts Codes</em>' reference list.
	 * @see Gtm.GtmPackage#getZoneDefinition_NutsCodes()
	 * @model
	 * @generated
	 */
	EList<NutsCode> getNutsCodes();

} // ZoneDefinition
