/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.TimeRange#getScope <em>Scope</em>}</li>
 *   <li>{@link Gtm.TimeRange#getFrom <em>From</em>}</li>
 *   <li>{@link Gtm.TimeRange#getUntil <em>Until</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getTimeRange()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='FROM_TO_ORDER'"
 * @generated
 */
public interface TimeRange extends EObject {
	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.TimeRangeScope}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see Gtm.TimeRangeScope
	 * @see #setScope(TimeRangeScope)
	 * @see Gtm.GtmPackage#getTimeRange_Scope()
	 * @model
	 * @generated
	 */
	TimeRangeScope getScope();

	/**
	 * Sets the value of the '{@link Gtm.TimeRange#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see Gtm.TimeRangeScope
	 * @see #getScope()
	 * @generated
	 */
	void setScope(TimeRangeScope value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(int)
	 * @see Gtm.GtmPackage#getTimeRange_From()
	 * @model
	 * @generated
	 */
	int getFrom();

	/**
	 * Sets the value of the '{@link Gtm.TimeRange#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(int value);

	/**
	 * Returns the value of the '<em><b>Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Until</em>' attribute.
	 * @see #setUntil(int)
	 * @see Gtm.GtmPackage#getTimeRange_Until()
	 * @model
	 * @generated
	 */
	int getUntil();

	/**
	 * Sets the value of the '{@link Gtm.TimeRange#getUntil <em>Until</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Until</em>' attribute.
	 * @see #getUntil()
	 * @generated
	 */
	void setUntil(int value);

} // TimeRange
