/**
 */
package Gtm.impl;

import Gtm.AllowedPersonalDataChanges;
import Gtm.GtmPackage;
import Gtm.PersonalDataChangeReason;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allowed Personal Data Changes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.AllowedPersonalDataChangesImpl#getTimeLimit <em>Time Limit</em>}</li>
 *   <li>{@link Gtm.impl.AllowedPersonalDataChangesImpl#getAcceptedReason <em>Accepted Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllowedPersonalDataChangesImpl extends MinimalEObjectImpl.Container implements AllowedPersonalDataChanges {
	/**
	 * The default value of the '{@link #getTimeLimit() <em>Time Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float TIME_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTimeLimit() <em>Time Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeLimit()
	 * @generated
	 * @ordered
	 */
	protected float timeLimit = TIME_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAcceptedReason() <em>Accepted Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptedReason()
	 * @generated
	 * @ordered
	 */
	protected static final PersonalDataChangeReason ACCEPTED_REASON_EDEFAULT = PersonalDataChangeReason.IN_GENERAL;

	/**
	 * The cached value of the '{@link #getAcceptedReason() <em>Accepted Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptedReason()
	 * @generated
	 * @ordered
	 */
	protected PersonalDataChangeReason acceptedReason = ACCEPTED_REASON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllowedPersonalDataChangesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.ALLOWED_PERSONAL_DATA_CHANGES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTimeLimit() {
		return timeLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeLimit(float newTimeLimit) {
		float oldTimeLimit = timeLimit;
		timeLimit = newTimeLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.ALLOWED_PERSONAL_DATA_CHANGES__TIME_LIMIT, oldTimeLimit, timeLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonalDataChangeReason getAcceptedReason() {
		return acceptedReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcceptedReason(PersonalDataChangeReason newAcceptedReason) {
		PersonalDataChangeReason oldAcceptedReason = acceptedReason;
		acceptedReason = newAcceptedReason == null ? ACCEPTED_REASON_EDEFAULT : newAcceptedReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.ALLOWED_PERSONAL_DATA_CHANGES__ACCEPTED_REASON, oldAcceptedReason, acceptedReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.ALLOWED_PERSONAL_DATA_CHANGES__TIME_LIMIT:
				return getTimeLimit();
			case GtmPackage.ALLOWED_PERSONAL_DATA_CHANGES__ACCEPTED_REASON:
				return getAcceptedReason();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GtmPackage.ALLOWED_PERSONAL_DATA_CHANGES__TIME_LIMIT:
				setTimeLimit((Float)newValue);
				return;
			case GtmPackage.ALLOWED_PERSONAL_DATA_CHANGES__ACCEPTED_REASON:
				setAcceptedReason((PersonalDataChangeReason)newValue);
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
			case GtmPackage.ALLOWED_PERSONAL_DATA_CHANGES__TIME_LIMIT:
				setTimeLimit(TIME_LIMIT_EDEFAULT);
				return;
			case GtmPackage.ALLOWED_PERSONAL_DATA_CHANGES__ACCEPTED_REASON:
				setAcceptedReason(ACCEPTED_REASON_EDEFAULT);
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
			case GtmPackage.ALLOWED_PERSONAL_DATA_CHANGES__TIME_LIMIT:
				return timeLimit != TIME_LIMIT_EDEFAULT;
			case GtmPackage.ALLOWED_PERSONAL_DATA_CHANGES__ACCEPTED_REASON:
				return acceptedReason != ACCEPTED_REASON_EDEFAULT;
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
		result.append(" (timeLimit: ");
		result.append(timeLimit);
		result.append(", acceptedReason: ");
		result.append(acceptedReason);
		result.append(')');
		return result.toString();
	}

} //AllowedPersonalDataChangesImpl
