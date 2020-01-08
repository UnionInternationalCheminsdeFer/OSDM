/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.PassengerCombinationConstraint;
import Gtm.PassengerConstraint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Passenger Combination Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.PassengerCombinationConstraintImpl#getMaxNumber <em>Max Number</em>}</li>
 *   <li>{@link Gtm.impl.PassengerCombinationConstraintImpl#getPassengerType <em>Passenger Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PassengerCombinationConstraintImpl extends MinimalEObjectImpl.Container implements PassengerCombinationConstraint {
	/**
	 * The default value of the '{@link #getMaxNumber() <em>Max Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxNumber() <em>Max Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumber()
	 * @generated
	 * @ordered
	 */
	protected int maxNumber = MAX_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPassengerType() <em>Passenger Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerType()
	 * @generated
	 * @ordered
	 */
	protected PassengerConstraint passengerType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassengerCombinationConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.PASSENGER_COMBINATION_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxNumber() {
		return maxNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNumber(int newMaxNumber) {
		int oldMaxNumber = maxNumber;
		maxNumber = newMaxNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.PASSENGER_COMBINATION_CONSTRAINT__MAX_NUMBER, oldMaxNumber, maxNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassengerConstraint getPassengerType() {
		if (passengerType != null && passengerType.eIsProxy()) {
			InternalEObject oldPassengerType = (InternalEObject)passengerType;
			passengerType = (PassengerConstraint)eResolveProxy(oldPassengerType);
			if (passengerType != oldPassengerType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.PASSENGER_COMBINATION_CONSTRAINT__PASSENGER_TYPE, oldPassengerType, passengerType));
			}
		}
		return passengerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassengerConstraint basicGetPassengerType() {
		return passengerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerType(PassengerConstraint newPassengerType) {
		PassengerConstraint oldPassengerType = passengerType;
		passengerType = newPassengerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.PASSENGER_COMBINATION_CONSTRAINT__PASSENGER_TYPE, oldPassengerType, passengerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.PASSENGER_COMBINATION_CONSTRAINT__MAX_NUMBER:
				return getMaxNumber();
			case GtmPackage.PASSENGER_COMBINATION_CONSTRAINT__PASSENGER_TYPE:
				if (resolve) return getPassengerType();
				return basicGetPassengerType();
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
			case GtmPackage.PASSENGER_COMBINATION_CONSTRAINT__MAX_NUMBER:
				setMaxNumber((Integer)newValue);
				return;
			case GtmPackage.PASSENGER_COMBINATION_CONSTRAINT__PASSENGER_TYPE:
				setPassengerType((PassengerConstraint)newValue);
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
			case GtmPackage.PASSENGER_COMBINATION_CONSTRAINT__MAX_NUMBER:
				setMaxNumber(MAX_NUMBER_EDEFAULT);
				return;
			case GtmPackage.PASSENGER_COMBINATION_CONSTRAINT__PASSENGER_TYPE:
				setPassengerType((PassengerConstraint)null);
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
			case GtmPackage.PASSENGER_COMBINATION_CONSTRAINT__MAX_NUMBER:
				return maxNumber != MAX_NUMBER_EDEFAULT;
			case GtmPackage.PASSENGER_COMBINATION_CONSTRAINT__PASSENGER_TYPE:
				return passengerType != null;
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
		result.append(" (maxNumber: ");
		result.append(maxNumber);
		result.append(')');
		return result.toString();
	}

} //PassengerCombinationConstraintImpl
