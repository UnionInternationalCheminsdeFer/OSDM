/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Viastation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.LegacyViastation#getPosition <em>Position</em>}</li>
 *   <li>{@link Gtm.LegacyViastation#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacyViastation()
 * @model
 * @generated
 */
public interface LegacyViastation extends EObject {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #isSetPosition()
	 * @see #unsetPosition()
	 * @see #setPosition(int)
	 * @see Gtm.GtmPackage#getLegacyViastation_Position()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getPosition();

	/**
	 * Sets the value of the '{@link Gtm.LegacyViastation#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #isSetPosition()
	 * @see #unsetPosition()
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(int value);

	/**
	 * Unsets the value of the '{@link Gtm.LegacyViastation#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPosition()
	 * @see #getPosition()
	 * @see #setPosition(int)
	 * @generated
	 */
	void unsetPosition();

	/**
	 * Returns whether the value of the '{@link Gtm.LegacyViastation#getPosition <em>Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Position</em>' attribute is set.
	 * @see #unsetPosition()
	 * @see #getPosition()
	 * @see #setPosition(int)
	 * @generated
	 */
	boolean isSetPosition();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #isSetCode()
	 * @see #unsetCode()
	 * @see #setCode(int)
	 * @see Gtm.GtmPackage#getLegacyViastation_Code()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getCode();

	/**
	 * Sets the value of the '{@link Gtm.LegacyViastation#getCode <em>Code</em>}' attribute.
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
	 * Unsets the value of the '{@link Gtm.LegacyViastation#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCode()
	 * @see #getCode()
	 * @see #setCode(int)
	 * @generated
	 */
	void unsetCode();

	/**
	 * Returns whether the value of the '{@link Gtm.LegacyViastation#getCode <em>Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Code</em>' attribute is set.
	 * @see #unsetCode()
	 * @see #getCode()
	 * @see #setCode(int)
	 * @generated
	 */
	boolean isSetCode();

} // LegacyViastation
