/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Border Point Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.LegacyBorderPointMapping#getCode <em>Code</em>}</li>
 *   <li>{@link Gtm.LegacyBorderPointMapping#getName <em>Name</em>}</li>
 *   <li>{@link Gtm.LegacyBorderPointMapping#getStation <em>Station</em>}</li>
 *   <li>{@link Gtm.LegacyBorderPointMapping#getConnectionPoint <em>Connection Point</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacyBorderPointMapping()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CODE_NOT_NULL CONNECTION_POINT_MUST'"
 * @generated
 */
public interface LegacyBorderPointMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #isSetCode()
	 * @see #unsetCode()
	 * @see #setCode(int)
	 * @see Gtm.GtmPackage#getLegacyBorderPointMapping_Code()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getCode();

	/**
	 * Sets the value of the '{@link Gtm.LegacyBorderPointMapping#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #isSetCode()
	 * @see #unsetCode()
	 * @see #getCode()
	 * @generated
	 */
	void setCode(int value);

	/**
	 * Unsets the value of the '{@link Gtm.LegacyBorderPointMapping#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCode()
	 * @see #getCode()
	 * @see #setCode(int)
	 * @generated
	 */
	void unsetCode();

	/**
	 * Returns whether the value of the '{@link Gtm.LegacyBorderPointMapping#getCode <em>Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Code</em>' attribute is set.
	 * @see #unsetCode()
	 * @see #getCode()
	 * @see #setCode(int)
	 * @generated
	 */
	boolean isSetCode();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Gtm.GtmPackage#getLegacyBorderPointMapping_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Gtm.LegacyBorderPointMapping#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station</em>' reference.
	 * @see #setStation(Station)
	 * @see Gtm.GtmPackage#getLegacyBorderPointMapping_Station()
	 * @model
	 * @generated
	 */
	Station getStation();

	/**
	 * Sets the value of the '{@link Gtm.LegacyBorderPointMapping#getStation <em>Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Station</em>' reference.
	 * @see #getStation()
	 * @generated
	 */
	void setStation(Station value);

	/**
	 * Returns the value of the '<em><b>Connection Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Point</em>' reference.
	 * @see #setConnectionPoint(ConnectionPoint)
	 * @see Gtm.GtmPackage#getLegacyBorderPointMapping_ConnectionPoint()
	 * @model
	 * @generated
	 */
	ConnectionPoint getConnectionPoint();

	/**
	 * Sets the value of the '{@link Gtm.LegacyBorderPointMapping#getConnectionPoint <em>Connection Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Point</em>' reference.
	 * @see #getConnectionPoint()
	 * @generated
	 */
	void setConnectionPoint(ConnectionPoint value);

} // LegacyBorderPointMapping
