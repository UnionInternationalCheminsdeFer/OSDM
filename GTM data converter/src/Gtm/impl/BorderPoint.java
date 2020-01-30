/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Border Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.BorderPoint#getCode <em>Code</em>}</li>
 *   <li>{@link Gtm.BorderPoint#getName <em>Name</em>}</li>
 *   <li>{@link Gtm.BorderPoint#getStation1 <em>Station1</em>}</li>
 *   <li>{@link Gtm.BorderPoint#getStation2 <em>Station2</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getBorderPoint()
 * @model
 * @generated
 */
public interface BorderPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #isSetCode()
	 * @see #unsetCode()
	 * @see #setCode(int)
	 * @see Gtm.GtmPackage#getBorderPoint_Code()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getCode();

	/**
	 * Sets the value of the '{@link Gtm.BorderPoint#getCode <em>Code</em>}' attribute.
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
	 * Unsets the value of the '{@link Gtm.BorderPoint#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCode()
	 * @see #getCode()
	 * @see #setCode(int)
	 * @generated
	 */
	void unsetCode();

	/**
	 * Returns whether the value of the '{@link Gtm.BorderPoint#getCode <em>Code</em>}' attribute is set.
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
	 * @see Gtm.GtmPackage#getBorderPoint_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Gtm.BorderPoint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Station1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station1</em>' reference.
	 * @see #setStation1(Station)
	 * @see Gtm.GtmPackage#getBorderPoint_Station1()
	 * @model
	 * @generated
	 */
	Station getStation1();

	/**
	 * Sets the value of the '{@link Gtm.BorderPoint#getStation1 <em>Station1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Station1</em>' reference.
	 * @see #getStation1()
	 * @generated
	 */
	void setStation1(Station value);

	/**
	 * Returns the value of the '<em><b>Station2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station2</em>' reference.
	 * @see #setStation2(Station)
	 * @see Gtm.GtmPackage#getBorderPoint_Station2()
	 * @model
	 * @generated
	 */
	Station getStation2();

	/**
	 * Sets the value of the '{@link Gtm.BorderPoint#getStation2 <em>Station2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Station2</em>' reference.
	 * @see #getStation2()
	 * @generated
	 */
	void setStation2(Station value);

} // BorderPoint
