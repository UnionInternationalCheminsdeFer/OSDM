/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Validity Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.ReturnValidityConstraint#getExcludedWeekdays <em>Excluded Weekdays</em>}</li>
 *   <li>{@link Gtm.ReturnValidityConstraint#getLatestReturn <em>Latest Return</em>}</li>
 *   <li>{@link Gtm.ReturnValidityConstraint#getEarliestReturn <em>Earliest Return</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getReturnValidityConstraint()
 * @model
 * @generated
 */
public interface ReturnValidityConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Excluded Weekdays</b></em>' attribute list.
	 * The list contents are of type {@link Gtm.WeekDay}.
	 * The literals are from the enumeration {@link Gtm.WeekDay}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excluded Weekdays</em>' attribute list.
	 * @see Gtm.WeekDay
	 * @see Gtm.GtmPackage#getReturnValidityConstraint_ExcludedWeekdays()
	 * @model
	 * @generated
	 */
	EList<WeekDay> getExcludedWeekdays();

	/**
	 * Returns the value of the '<em><b>Latest Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latest Return</em>' attribute.
	 * @see #setLatestReturn(int)
	 * @see Gtm.GtmPackage#getReturnValidityConstraint_LatestReturn()
	 * @model
	 * @generated
	 */
	int getLatestReturn();

	/**
	 * Sets the value of the '{@link Gtm.ReturnValidityConstraint#getLatestReturn <em>Latest Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latest Return</em>' attribute.
	 * @see #getLatestReturn()
	 * @generated
	 */
	void setLatestReturn(int value);

	/**
	 * Returns the value of the '<em><b>Earliest Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Earliest Return</em>' attribute.
	 * @see #setEarliestReturn(int)
	 * @see Gtm.GtmPackage#getReturnValidityConstraint_EarliestReturn()
	 * @model
	 * @generated
	 */
	int getEarliestReturn();

	/**
	 * Sets the value of the '{@link Gtm.ReturnValidityConstraint#getEarliestReturn <em>Earliest Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Earliest Return</em>' attribute.
	 * @see #getEarliestReturn()
	 * @generated
	 */
	void setEarliestReturn(int value);

} // ReturnValidityConstraint
