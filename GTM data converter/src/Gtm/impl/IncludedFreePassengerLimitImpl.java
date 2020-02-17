/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.IncludedFreePassengerLimit;
import Gtm.TravelerType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Included Free Passenger Limit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.IncludedFreePassengerLimitImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link Gtm.impl.IncludedFreePassengerLimitImpl#getPassengerType <em>Passenger Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncludedFreePassengerLimitImpl extends MinimalEObjectImpl.Container implements IncludedFreePassengerLimit {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerType() <em>Passenger Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerType()
	 * @generated
	 * @ordered
	 */
	protected static final TravelerType PASSENGER_TYPE_EDEFAULT = TravelerType.ADULT;

	/**
	 * The cached value of the '{@link #getPassengerType() <em>Passenger Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerType()
	 * @generated
	 * @ordered
	 */
	protected TravelerType passengerType = PASSENGER_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncludedFreePassengerLimitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.INCLUDED_FREE_PASSENGER_LIMIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.INCLUDED_FREE_PASSENGER_LIMIT__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelerType getPassengerType() {
		return passengerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerType(TravelerType newPassengerType) {
		TravelerType oldPassengerType = passengerType;
		passengerType = newPassengerType == null ? PASSENGER_TYPE_EDEFAULT : newPassengerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.INCLUDED_FREE_PASSENGER_LIMIT__PASSENGER_TYPE, oldPassengerType, passengerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.INCLUDED_FREE_PASSENGER_LIMIT__NUMBER:
				return getNumber();
			case GtmPackage.INCLUDED_FREE_PASSENGER_LIMIT__PASSENGER_TYPE:
				return getPassengerType();
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
			case GtmPackage.INCLUDED_FREE_PASSENGER_LIMIT__NUMBER:
				setNumber((Integer)newValue);
				return;
			case GtmPackage.INCLUDED_FREE_PASSENGER_LIMIT__PASSENGER_TYPE:
				setPassengerType((TravelerType)newValue);
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
			case GtmPackage.INCLUDED_FREE_PASSENGER_LIMIT__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case GtmPackage.INCLUDED_FREE_PASSENGER_LIMIT__PASSENGER_TYPE:
				setPassengerType(PASSENGER_TYPE_EDEFAULT);
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
			case GtmPackage.INCLUDED_FREE_PASSENGER_LIMIT__NUMBER:
				return number != NUMBER_EDEFAULT;
			case GtmPackage.INCLUDED_FREE_PASSENGER_LIMIT__PASSENGER_TYPE:
				return passengerType != PASSENGER_TYPE_EDEFAULT;
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
		result.append(" (number: ");
		result.append(number);
		result.append(", passengerType: ");
		result.append(passengerType);
		result.append(')');
		return result.toString();
	}

} //IncludedFreePassengerLimitImpl
