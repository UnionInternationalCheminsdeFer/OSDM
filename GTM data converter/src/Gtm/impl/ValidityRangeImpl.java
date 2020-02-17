/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.TimeUnit;
import Gtm.ValidityRange;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validity Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.ValidityRangeImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link Gtm.impl.ValidityRangeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link Gtm.impl.ValidityRangeImpl#getHoursAfterMidnight <em>Hours After Midnight</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValidityRangeImpl extends MinimalEObjectImpl.Container implements ValidityRange {
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
	protected static final float VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected float value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHoursAfterMidnight() <em>Hours After Midnight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoursAfterMidnight()
	 * @generated
	 * @ordered
	 */
	protected static final float HOURS_AFTER_MIDNIGHT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHoursAfterMidnight() <em>Hours After Midnight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoursAfterMidnight()
	 * @generated
	 * @ordered
	 */
	protected float hoursAfterMidnight = HOURS_AFTER_MIDNIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidityRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.VALIDITY_RANGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.VALIDITY_RANGE__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(float newValue) {
		float oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.VALIDITY_RANGE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHoursAfterMidnight() {
		return hoursAfterMidnight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoursAfterMidnight(float newHoursAfterMidnight) {
		float oldHoursAfterMidnight = hoursAfterMidnight;
		hoursAfterMidnight = newHoursAfterMidnight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.VALIDITY_RANGE__HOURS_AFTER_MIDNIGHT, oldHoursAfterMidnight, hoursAfterMidnight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.VALIDITY_RANGE__UNIT:
				return getUnit();
			case GtmPackage.VALIDITY_RANGE__VALUE:
				return getValue();
			case GtmPackage.VALIDITY_RANGE__HOURS_AFTER_MIDNIGHT:
				return getHoursAfterMidnight();
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
			case GtmPackage.VALIDITY_RANGE__UNIT:
				setUnit((TimeUnit)newValue);
				return;
			case GtmPackage.VALIDITY_RANGE__VALUE:
				setValue((Float)newValue);
				return;
			case GtmPackage.VALIDITY_RANGE__HOURS_AFTER_MIDNIGHT:
				setHoursAfterMidnight((Float)newValue);
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
			case GtmPackage.VALIDITY_RANGE__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case GtmPackage.VALIDITY_RANGE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case GtmPackage.VALIDITY_RANGE__HOURS_AFTER_MIDNIGHT:
				setHoursAfterMidnight(HOURS_AFTER_MIDNIGHT_EDEFAULT);
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
			case GtmPackage.VALIDITY_RANGE__UNIT:
				return unit != UNIT_EDEFAULT;
			case GtmPackage.VALIDITY_RANGE__VALUE:
				return value != VALUE_EDEFAULT;
			case GtmPackage.VALIDITY_RANGE__HOURS_AFTER_MIDNIGHT:
				return hoursAfterMidnight != HOURS_AFTER_MIDNIGHT_EDEFAULT;
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
		result.append(" (unit: ");
		result.append(unit);
		result.append(", value: ");
		result.append(value);
		result.append(", hoursAfterMidnight: ");
		result.append(hoursAfterMidnight);
		result.append(')');
		return result.toString();
	}

} //ValidityRangeImpl
