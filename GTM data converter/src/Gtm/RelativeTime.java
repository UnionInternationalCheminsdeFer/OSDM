/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.RelativeTime#getUnit <em>Unit</em>}</li>
 *   <li>{@link Gtm.RelativeTime#getReference <em>Reference</em>}</li>
 *   <li>{@link Gtm.RelativeTime#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getRelativeTime()
 * @model
 * @generated
 */
public interface RelativeTime extends EObject {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.TimeUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see Gtm.TimeUnit
	 * @see #setUnit(TimeUnit)
	 * @see Gtm.GtmPackage#getRelativeTime_Unit()
	 * @model
	 * @generated
	 */
	TimeUnit getUnit();

	/**
	 * Sets the value of the '{@link Gtm.RelativeTime#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see Gtm.TimeUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(TimeUnit value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.TimeReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see Gtm.TimeReferenceType
	 * @see #setReference(TimeReferenceType)
	 * @see Gtm.GtmPackage#getRelativeTime_Reference()
	 * @model
	 * @generated
	 */
	TimeReferenceType getReference();

	/**
	 * Sets the value of the '{@link Gtm.RelativeTime#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see Gtm.TimeReferenceType
	 * @see #getReference()
	 * @generated
	 */
	void setReference(TimeReferenceType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see Gtm.GtmPackage#getRelativeTime_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link Gtm.RelativeTime#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // RelativeTime
