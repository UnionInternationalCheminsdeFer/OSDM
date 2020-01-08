/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.TimeReference;
import Gtm.TimeReferenceType;
import Gtm.TimeUnit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.TimeReferenceImpl#getRefereceType <em>Referece Type</em>}</li>
 *   <li>{@link Gtm.impl.TimeReferenceImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link Gtm.impl.TimeReferenceImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeReferenceImpl extends MinimalEObjectImpl.Container implements TimeReference {
	/**
	 * The default value of the '{@link #getRefereceType() <em>Referece Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefereceType()
	 * @generated
	 * @ordered
	 */
	protected static final TimeReferenceType REFERECE_TYPE_EDEFAULT = TimeReferenceType.BEFORE_DEPARTURE;

	/**
	 * The cached value of the '{@link #getRefereceType() <em>Referece Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefereceType()
	 * @generated
	 * @ordered
	 */
	protected TimeReferenceType refereceType = REFERECE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final TimeUnit UNIT_EDEFAULT = TimeUnit.DAY;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected TimeUnit unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.TIME_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeReferenceType getRefereceType() {
		return refereceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefereceType(TimeReferenceType newRefereceType) {
		TimeReferenceType oldRefereceType = refereceType;
		refereceType = newRefereceType == null ? REFERECE_TYPE_EDEFAULT : newRefereceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TIME_REFERENCE__REFERECE_TYPE, oldRefereceType, refereceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(TimeUnit newUnit) {
		TimeUnit oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TIME_REFERENCE__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TIME_REFERENCE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.TIME_REFERENCE__REFERECE_TYPE:
				return getRefereceType();
			case GtmPackage.TIME_REFERENCE__UNIT:
				return getUnit();
			case GtmPackage.TIME_REFERENCE__VALUE:
				return getValue();
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
			case GtmPackage.TIME_REFERENCE__REFERECE_TYPE:
				setRefereceType((TimeReferenceType)newValue);
				return;
			case GtmPackage.TIME_REFERENCE__UNIT:
				setUnit((TimeUnit)newValue);
				return;
			case GtmPackage.TIME_REFERENCE__VALUE:
				setValue((Integer)newValue);
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
			case GtmPackage.TIME_REFERENCE__REFERECE_TYPE:
				setRefereceType(REFERECE_TYPE_EDEFAULT);
				return;
			case GtmPackage.TIME_REFERENCE__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case GtmPackage.TIME_REFERENCE__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case GtmPackage.TIME_REFERENCE__REFERECE_TYPE:
				return refereceType != REFERECE_TYPE_EDEFAULT;
			case GtmPackage.TIME_REFERENCE__UNIT:
				return unit != UNIT_EDEFAULT;
			case GtmPackage.TIME_REFERENCE__VALUE:
				return value != VALUE_EDEFAULT;
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
		result.append(" (refereceType: ");
		result.append(refereceType);
		result.append(", unit: ");
		result.append(unit);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //TimeReferenceImpl
