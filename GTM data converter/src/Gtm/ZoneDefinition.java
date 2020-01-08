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
 *   <li>{@link Gtm.ZoneDefinition#getZoneId <em>Zone Id</em>}</li>
 *   <li>{@link Gtm.ZoneDefinition#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.ZoneDefinition#getName <em>Name</em>}</li>
 *   <li>{@link Gtm.ZoneDefinition#getStations <em>Stations</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getZoneDefinition()
 * @model
 * @generated
 */
public interface ZoneDefinition extends EObject {
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
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Gtm.GtmPackage#getZoneDefinition_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Gtm.ZoneDefinition#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * Returns the value of the '<em><b>Stations</b></em>' reference list.
	 * The list contents are of type {@link Gtm.Station}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stations</em>' reference list.
	 * @see Gtm.GtmPackage#getZoneDefinition_Stations()
	 * @model
	 * @generated
	 */
	EList<Station> getStations();

} // ZoneDefinition
