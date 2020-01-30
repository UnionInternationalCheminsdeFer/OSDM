/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.Edge#getSystem <em>System</em>}</li>
 *   <li>{@link Gtm.Edge#getEastWest <em>East West</em>}</li>
 *   <li>{@link Gtm.Edge#getNorthSouth <em>North South</em>}</li>
 *   <li>{@link Gtm.Edge#getUnit <em>Unit</em>}</li>
 *   <li>{@link Gtm.Edge#getAccuracy <em>Accuracy</em>}</li>
 *   <li>{@link Gtm.Edge#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link Gtm.Edge#getLatitude <em>Latitude</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends EObject {
	/**
	 * Returns the value of the '<em><b>System</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.GeoSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' attribute.
	 * @see Gtm.GeoSystem
	 * @see #setSystem(GeoSystem)
	 * @see Gtm.GtmPackage#getEdge_System()
	 * @model
	 * @generated
	 */
	GeoSystem getSystem();

	/**
	 * Sets the value of the '{@link Gtm.Edge#getSystem <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' attribute.
	 * @see Gtm.GeoSystem
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(GeoSystem value);

	/**
	 * Returns the value of the '<em><b>East West</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.HemisphereEW}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>East West</em>' attribute.
	 * @see Gtm.HemisphereEW
	 * @see #setEastWest(HemisphereEW)
	 * @see Gtm.GtmPackage#getEdge_EastWest()
	 * @model
	 * @generated
	 */
	HemisphereEW getEastWest();

	/**
	 * Sets the value of the '{@link Gtm.Edge#getEastWest <em>East West</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>East West</em>' attribute.
	 * @see Gtm.HemisphereEW
	 * @see #getEastWest()
	 * @generated
	 */
	void setEastWest(HemisphereEW value);

	/**
	 * Returns the value of the '<em><b>North South</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.HemisphereNS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>North South</em>' attribute.
	 * @see Gtm.HemisphereNS
	 * @see #setNorthSouth(HemisphereNS)
	 * @see Gtm.GtmPackage#getEdge_NorthSouth()
	 * @model
	 * @generated
	 */
	HemisphereNS getNorthSouth();

	/**
	 * Sets the value of the '{@link Gtm.Edge#getNorthSouth <em>North South</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>North South</em>' attribute.
	 * @see Gtm.HemisphereNS
	 * @see #getNorthSouth()
	 * @generated
	 */
	void setNorthSouth(HemisphereNS value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.GeoUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see Gtm.GeoUnit
	 * @see #setUnit(GeoUnit)
	 * @see Gtm.GtmPackage#getEdge_Unit()
	 * @model
	 * @generated
	 */
	GeoUnit getUnit();

	/**
	 * Sets the value of the '{@link Gtm.Edge#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see Gtm.GeoUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(GeoUnit value);

	/**
	 * Returns the value of the '<em><b>Accuracy</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.GeoUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accuracy</em>' attribute.
	 * @see Gtm.GeoUnit
	 * @see #setAccuracy(GeoUnit)
	 * @see Gtm.GtmPackage#getEdge_Accuracy()
	 * @model
	 * @generated
	 */
	GeoUnit getAccuracy();

	/**
	 * Sets the value of the '{@link Gtm.Edge#getAccuracy <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accuracy</em>' attribute.
	 * @see Gtm.GeoUnit
	 * @see #getAccuracy()
	 * @generated
	 */
	void setAccuracy(GeoUnit value);

	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' attribute.
	 * @see #setLongitude(float)
	 * @see Gtm.GtmPackage#getEdge_Longitude()
	 * @model
	 * @generated
	 */
	float getLongitude();

	/**
	 * Sets the value of the '{@link Gtm.Edge#getLongitude <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' attribute.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(float value);

	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' attribute.
	 * @see #setLatitude(float)
	 * @see Gtm.GtmPackage#getEdge_Latitude()
	 * @model
	 * @generated
	 */
	float getLatitude();

	/**
	 * Sets the value of the '{@link Gtm.Edge#getLatitude <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' attribute.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(float value);

} // Edge
