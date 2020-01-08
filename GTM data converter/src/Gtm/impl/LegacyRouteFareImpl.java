/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.LegacyRouteFare;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legacy Route Fare</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.LegacyRouteFareImpl#getSeriesNumber <em>Series Number</em>}</li>
 *   <li>{@link Gtm.impl.LegacyRouteFareImpl#getFare2nd <em>Fare2nd</em>}</li>
 *   <li>{@link Gtm.impl.LegacyRouteFareImpl#getFare1st <em>Fare1st</em>}</li>
 *   <li>{@link Gtm.impl.LegacyRouteFareImpl#getFareTableNumber <em>Fare Table Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegacyRouteFareImpl extends MinimalEObjectImpl.Container implements LegacyRouteFare {
	/**
	 * The default value of the '{@link #getSeriesNumber() <em>Series Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int SERIES_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeriesNumber() <em>Series Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesNumber()
	 * @generated
	 * @ordered
	 */
	protected int seriesNumber = SERIES_NUMBER_EDEFAULT;

	/**
	 * This is true if the Series Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean seriesNumberESet;

	/**
	 * The default value of the '{@link #getFare2nd() <em>Fare2nd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFare2nd()
	 * @generated
	 * @ordered
	 */
	protected static final int FARE2ND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFare2nd() <em>Fare2nd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFare2nd()
	 * @generated
	 * @ordered
	 */
	protected int fare2nd = FARE2ND_EDEFAULT;

	/**
	 * This is true if the Fare2nd attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fare2ndESet;

	/**
	 * The default value of the '{@link #getFare1st() <em>Fare1st</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFare1st()
	 * @generated
	 * @ordered
	 */
	protected static final int FARE1ST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFare1st() <em>Fare1st</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFare1st()
	 * @generated
	 * @ordered
	 */
	protected int fare1st = FARE1ST_EDEFAULT;

	/**
	 * This is true if the Fare1st attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fare1stESet;

	/**
	 * The default value of the '{@link #getFareTableNumber() <em>Fare Table Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFareTableNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int FARE_TABLE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFareTableNumber() <em>Fare Table Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFareTableNumber()
	 * @generated
	 * @ordered
	 */
	protected int fareTableNumber = FARE_TABLE_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyRouteFareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LEGACY_ROUTE_FARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeriesNumber() {
		return seriesNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeriesNumber(int newSeriesNumber) {
		int oldSeriesNumber = seriesNumber;
		seriesNumber = newSeriesNumber;
		boolean oldSeriesNumberESet = seriesNumberESet;
		seriesNumberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_ROUTE_FARE__SERIES_NUMBER, oldSeriesNumber, seriesNumber, !oldSeriesNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSeriesNumber() {
		int oldSeriesNumber = seriesNumber;
		boolean oldSeriesNumberESet = seriesNumberESet;
		seriesNumber = SERIES_NUMBER_EDEFAULT;
		seriesNumberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GtmPackage.LEGACY_ROUTE_FARE__SERIES_NUMBER, oldSeriesNumber, SERIES_NUMBER_EDEFAULT, oldSeriesNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSeriesNumber() {
		return seriesNumberESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFare2nd() {
		return fare2nd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFare2nd(int newFare2nd) {
		int oldFare2nd = fare2nd;
		fare2nd = newFare2nd;
		boolean oldFare2ndESet = fare2ndESet;
		fare2ndESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_ROUTE_FARE__FARE2ND, oldFare2nd, fare2nd, !oldFare2ndESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFare2nd() {
		int oldFare2nd = fare2nd;
		boolean oldFare2ndESet = fare2ndESet;
		fare2nd = FARE2ND_EDEFAULT;
		fare2ndESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GtmPackage.LEGACY_ROUTE_FARE__FARE2ND, oldFare2nd, FARE2ND_EDEFAULT, oldFare2ndESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFare2nd() {
		return fare2ndESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFare1st() {
		return fare1st;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFare1st(int newFare1st) {
		int oldFare1st = fare1st;
		fare1st = newFare1st;
		boolean oldFare1stESet = fare1stESet;
		fare1stESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_ROUTE_FARE__FARE1ST, oldFare1st, fare1st, !oldFare1stESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFare1st() {
		int oldFare1st = fare1st;
		boolean oldFare1stESet = fare1stESet;
		fare1st = FARE1ST_EDEFAULT;
		fare1stESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GtmPackage.LEGACY_ROUTE_FARE__FARE1ST, oldFare1st, FARE1ST_EDEFAULT, oldFare1stESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFare1st() {
		return fare1stESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFareTableNumber() {
		return fareTableNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFareTableNumber(int newFareTableNumber) {
		int oldFareTableNumber = fareTableNumber;
		fareTableNumber = newFareTableNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_ROUTE_FARE__FARE_TABLE_NUMBER, oldFareTableNumber, fareTableNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.LEGACY_ROUTE_FARE__SERIES_NUMBER:
				return getSeriesNumber();
			case GtmPackage.LEGACY_ROUTE_FARE__FARE2ND:
				return getFare2nd();
			case GtmPackage.LEGACY_ROUTE_FARE__FARE1ST:
				return getFare1st();
			case GtmPackage.LEGACY_ROUTE_FARE__FARE_TABLE_NUMBER:
				return getFareTableNumber();
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
			case GtmPackage.LEGACY_ROUTE_FARE__SERIES_NUMBER:
				setSeriesNumber((Integer)newValue);
				return;
			case GtmPackage.LEGACY_ROUTE_FARE__FARE2ND:
				setFare2nd((Integer)newValue);
				return;
			case GtmPackage.LEGACY_ROUTE_FARE__FARE1ST:
				setFare1st((Integer)newValue);
				return;
			case GtmPackage.LEGACY_ROUTE_FARE__FARE_TABLE_NUMBER:
				setFareTableNumber((Integer)newValue);
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
			case GtmPackage.LEGACY_ROUTE_FARE__SERIES_NUMBER:
				unsetSeriesNumber();
				return;
			case GtmPackage.LEGACY_ROUTE_FARE__FARE2ND:
				unsetFare2nd();
				return;
			case GtmPackage.LEGACY_ROUTE_FARE__FARE1ST:
				unsetFare1st();
				return;
			case GtmPackage.LEGACY_ROUTE_FARE__FARE_TABLE_NUMBER:
				setFareTableNumber(FARE_TABLE_NUMBER_EDEFAULT);
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
			case GtmPackage.LEGACY_ROUTE_FARE__SERIES_NUMBER:
				return isSetSeriesNumber();
			case GtmPackage.LEGACY_ROUTE_FARE__FARE2ND:
				return isSetFare2nd();
			case GtmPackage.LEGACY_ROUTE_FARE__FARE1ST:
				return isSetFare1st();
			case GtmPackage.LEGACY_ROUTE_FARE__FARE_TABLE_NUMBER:
				return fareTableNumber != FARE_TABLE_NUMBER_EDEFAULT;
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
		result.append(" (seriesNumber: ");
		if (seriesNumberESet) result.append(seriesNumber); else result.append("<unset>");
		result.append(", fare2nd: ");
		if (fare2ndESet) result.append(fare2nd); else result.append("<unset>");
		result.append(", fare1st: ");
		if (fare1stESet) result.append(fare1st); else result.append("<unset>");
		result.append(", fareTableNumber: ");
		result.append(fareTableNumber);
		result.append(')');
		return result.toString();
	}

} //LegacyRouteFareImpl
