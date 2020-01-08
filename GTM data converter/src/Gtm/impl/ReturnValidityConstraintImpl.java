/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.ReturnValidityConstraint;
import Gtm.WeekDay;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Validity Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.ReturnValidityConstraintImpl#getExcludedWeekdays <em>Excluded Weekdays</em>}</li>
 *   <li>{@link Gtm.impl.ReturnValidityConstraintImpl#getLatestReturn <em>Latest Return</em>}</li>
 *   <li>{@link Gtm.impl.ReturnValidityConstraintImpl#getEarliestReturn <em>Earliest Return</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnValidityConstraintImpl extends MinimalEObjectImpl.Container implements ReturnValidityConstraint {
	/**
	 * The cached value of the '{@link #getExcludedWeekdays() <em>Excluded Weekdays</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludedWeekdays()
	 * @generated
	 * @ordered
	 */
	protected EList<WeekDay> excludedWeekdays;

	/**
	 * The default value of the '{@link #getLatestReturn() <em>Latest Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestReturn()
	 * @generated
	 * @ordered
	 */
	protected static final int LATEST_RETURN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLatestReturn() <em>Latest Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestReturn()
	 * @generated
	 * @ordered
	 */
	protected int latestReturn = LATEST_RETURN_EDEFAULT;

	/**
	 * The default value of the '{@link #getEarliestReturn() <em>Earliest Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarliestReturn()
	 * @generated
	 * @ordered
	 */
	protected static final int EARLIEST_RETURN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEarliestReturn() <em>Earliest Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarliestReturn()
	 * @generated
	 * @ordered
	 */
	protected int earliestReturn = EARLIEST_RETURN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnValidityConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.RETURN_VALIDITY_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WeekDay> getExcludedWeekdays() {
		if (excludedWeekdays == null) {
			excludedWeekdays = new EDataTypeUniqueEList<WeekDay>(WeekDay.class, this, GtmPackage.RETURN_VALIDITY_CONSTRAINT__EXCLUDED_WEEKDAYS);
		}
		return excludedWeekdays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLatestReturn() {
		return latestReturn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatestReturn(int newLatestReturn) {
		int oldLatestReturn = latestReturn;
		latestReturn = newLatestReturn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.RETURN_VALIDITY_CONSTRAINT__LATEST_RETURN, oldLatestReturn, latestReturn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEarliestReturn() {
		return earliestReturn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEarliestReturn(int newEarliestReturn) {
		int oldEarliestReturn = earliestReturn;
		earliestReturn = newEarliestReturn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.RETURN_VALIDITY_CONSTRAINT__EARLIEST_RETURN, oldEarliestReturn, earliestReturn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.RETURN_VALIDITY_CONSTRAINT__EXCLUDED_WEEKDAYS:
				return getExcludedWeekdays();
			case GtmPackage.RETURN_VALIDITY_CONSTRAINT__LATEST_RETURN:
				return getLatestReturn();
			case GtmPackage.RETURN_VALIDITY_CONSTRAINT__EARLIEST_RETURN:
				return getEarliestReturn();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GtmPackage.RETURN_VALIDITY_CONSTRAINT__EXCLUDED_WEEKDAYS:
				getExcludedWeekdays().clear();
				getExcludedWeekdays().addAll((Collection<? extends WeekDay>)newValue);
				return;
			case GtmPackage.RETURN_VALIDITY_CONSTRAINT__LATEST_RETURN:
				setLatestReturn((Integer)newValue);
				return;
			case GtmPackage.RETURN_VALIDITY_CONSTRAINT__EARLIEST_RETURN:
				setEarliestReturn((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GtmPackage.RETURN_VALIDITY_CONSTRAINT__EXCLUDED_WEEKDAYS:
				getExcludedWeekdays().clear();
				return;
			case GtmPackage.RETURN_VALIDITY_CONSTRAINT__LATEST_RETURN:
				setLatestReturn(LATEST_RETURN_EDEFAULT);
				return;
			case GtmPackage.RETURN_VALIDITY_CONSTRAINT__EARLIEST_RETURN:
				setEarliestReturn(EARLIEST_RETURN_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GtmPackage.RETURN_VALIDITY_CONSTRAINT__EXCLUDED_WEEKDAYS:
				return excludedWeekdays != null && !excludedWeekdays.isEmpty();
			case GtmPackage.RETURN_VALIDITY_CONSTRAINT__LATEST_RETURN:
				return latestReturn != LATEST_RETURN_EDEFAULT;
			case GtmPackage.RETURN_VALIDITY_CONSTRAINT__EARLIEST_RETURN:
				return earliestReturn != EARLIEST_RETURN_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (excludedWeekdays: ");
		result.append(excludedWeekdays);
		result.append(", latestReturn: ");
		result.append(latestReturn);
		result.append(", earliestReturn: ");
		result.append(earliestReturn);
		result.append(')');
		return result.toString();
	}

} //ReturnValidityConstraintImpl
