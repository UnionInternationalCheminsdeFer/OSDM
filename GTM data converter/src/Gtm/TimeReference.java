/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.TimeReference#getRefereceType <em>Referece Type</em>}</li>
 *   <li>{@link Gtm.TimeReference#getUnit <em>Unit</em>}</li>
 *   <li>{@link Gtm.TimeReference#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getTimeReference()
 * @model
 * @generated
 */
public interface TimeReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Referece Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.TimeReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referece Type</em>' attribute.
	 * @see Gtm.TimeReferenceType
	 * @see #setRefereceType(TimeReferenceType)
	 * @see Gtm.GtmPackage#getTimeReference_RefereceType()
	 * @model
	 * @generated
	 */
	TimeReferenceType getRefereceType();

	/**
	 * Sets the value of the '{@link Gtm.TimeReference#getRefereceType <em>Referece Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referece Type</em>' attribute.
	 * @see Gtm.TimeReferenceType
	 * @see #getRefereceType()
	 * @generated
	 */
	void setRefereceType(TimeReferenceType value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.TimeUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see Gtm.TimeUnit
	 * @see #setUnit(TimeUnit)
	 * @see Gtm.GtmPackage#getTimeReference_Unit()
	 * @model
	 * @generated
	 */
	TimeUnit getUnit();

	/**
	 * Sets the value of the '{@link Gtm.TimeReference#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see Gtm.TimeUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(TimeUnit value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see Gtm.GtmPackage#getTimeReference_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link Gtm.TimeReference#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // TimeReference
