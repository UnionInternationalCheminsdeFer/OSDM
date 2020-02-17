/**
 */
package Gtm.impl;

import Gtm.FareStationSetDefinition;
import Gtm.GtmPackage;
import Gtm.LegacyFareStationSetMap;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legacy Fare Station Set Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.LegacyFareStationSetMapImpl#getLegacyCode <em>Legacy Code</em>}</li>
 *   <li>{@link Gtm.impl.LegacyFareStationSetMapImpl#getStationSet <em>Station Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegacyFareStationSetMapImpl extends MinimalEObjectImpl.Container implements LegacyFareStationSetMap {
	/**
	 * The default value of the '{@link #getLegacyCode() <em>Legacy Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyCode()
	 * @generated
	 * @ordered
	 */
	protected static final int LEGACY_CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLegacyCode() <em>Legacy Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyCode()
	 * @generated
	 * @ordered
	 */
	protected int legacyCode = LEGACY_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStationSet() <em>Station Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStationSet()
	 * @generated
	 * @ordered
	 */
	protected FareStationSetDefinition stationSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyFareStationSetMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LEGACY_FARE_STATION_SET_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLegacyCode() {
		return legacyCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegacyCode(int newLegacyCode) {
		int oldLegacyCode = legacyCode;
		legacyCode = newLegacyCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_FARE_STATION_SET_MAP__LEGACY_CODE, oldLegacyCode, legacyCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FareStationSetDefinition getStationSet() {
		if (stationSet != null && stationSet.eIsProxy()) {
			InternalEObject oldStationSet = (InternalEObject)stationSet;
			stationSet = (FareStationSetDefinition)eResolveProxy(oldStationSet);
			if (stationSet != oldStationSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.LEGACY_FARE_STATION_SET_MAP__STATION_SET, oldStationSet, stationSet));
			}
		}
		return stationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FareStationSetDefinition basicGetStationSet() {
		return stationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStationSet(FareStationSetDefinition newStationSet) {
		FareStationSetDefinition oldStationSet = stationSet;
		stationSet = newStationSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_FARE_STATION_SET_MAP__STATION_SET, oldStationSet, stationSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.LEGACY_FARE_STATION_SET_MAP__LEGACY_CODE:
				return getLegacyCode();
			case GtmPackage.LEGACY_FARE_STATION_SET_MAP__STATION_SET:
				if (resolve) return getStationSet();
				return basicGetStationSet();
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
			case GtmPackage.LEGACY_FARE_STATION_SET_MAP__LEGACY_CODE:
				setLegacyCode((Integer)newValue);
				return;
			case GtmPackage.LEGACY_FARE_STATION_SET_MAP__STATION_SET:
				setStationSet((FareStationSetDefinition)newValue);
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
			case GtmPackage.LEGACY_FARE_STATION_SET_MAP__LEGACY_CODE:
				setLegacyCode(LEGACY_CODE_EDEFAULT);
				return;
			case GtmPackage.LEGACY_FARE_STATION_SET_MAP__STATION_SET:
				setStationSet((FareStationSetDefinition)null);
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
			case GtmPackage.LEGACY_FARE_STATION_SET_MAP__LEGACY_CODE:
				return legacyCode != LEGACY_CODE_EDEFAULT;
			case GtmPackage.LEGACY_FARE_STATION_SET_MAP__STATION_SET:
				return stationSet != null;
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
		result.append(" (legacyCode: ");
		result.append(legacyCode);
		result.append(')');
		return result.toString();
	}

} //LegacyFareStationSetMapImpl
