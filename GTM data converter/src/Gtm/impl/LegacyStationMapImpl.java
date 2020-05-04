/**
 */
package Gtm.impl;

import Gtm.DataSource;
import Gtm.GtmPackage;
import Gtm.LegacyStationMap;
import Gtm.Station;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legacy Station Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.LegacyStationMapImpl#getLegacyCode <em>Legacy Code</em>}</li>
 *   <li>{@link Gtm.impl.LegacyStationMapImpl#getStation <em>Station</em>}</li>
 *   <li>{@link Gtm.impl.LegacyStationMapImpl#getDataSource <em>Data Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegacyStationMapImpl extends MinimalEObjectImpl.Container implements LegacyStationMap {
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
	 * The cached value of the '{@link #getStation() <em>Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStation()
	 * @generated
	 * @ordered
	 */
	protected Station station;

	/**
	 * The default value of the '{@link #getDataSource() <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSource()
	 * @generated
	 * @ordered
	 */
	protected static final DataSource DATA_SOURCE_EDEFAULT = DataSource.MANUAL;

	/**
	 * The cached value of the '{@link #getDataSource() <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSource()
	 * @generated
	 * @ordered
	 */
	protected DataSource dataSource = DATA_SOURCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyStationMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LEGACY_STATION_MAP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_STATION_MAP__LEGACY_CODE, oldLegacyCode, legacyCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station getStation() {
		if (station != null && station.eIsProxy()) {
			InternalEObject oldStation = (InternalEObject)station;
			station = (Station)eResolveProxy(oldStation);
			if (station != oldStation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.LEGACY_STATION_MAP__STATION, oldStation, station));
			}
		}
		return station;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station basicGetStation() {
		return station;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStation(Station newStation) {
		Station oldStation = station;
		station = newStation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_STATION_MAP__STATION, oldStation, station));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSource getDataSource() {
		return dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSource(DataSource newDataSource) {
		DataSource oldDataSource = dataSource;
		dataSource = newDataSource == null ? DATA_SOURCE_EDEFAULT : newDataSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_STATION_MAP__DATA_SOURCE, oldDataSource, dataSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.LEGACY_STATION_MAP__LEGACY_CODE:
				return getLegacyCode();
			case GtmPackage.LEGACY_STATION_MAP__STATION:
				if (resolve) return getStation();
				return basicGetStation();
			case GtmPackage.LEGACY_STATION_MAP__DATA_SOURCE:
				return getDataSource();
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
			case GtmPackage.LEGACY_STATION_MAP__LEGACY_CODE:
				setLegacyCode((Integer)newValue);
				return;
			case GtmPackage.LEGACY_STATION_MAP__STATION:
				setStation((Station)newValue);
				return;
			case GtmPackage.LEGACY_STATION_MAP__DATA_SOURCE:
				setDataSource((DataSource)newValue);
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
			case GtmPackage.LEGACY_STATION_MAP__LEGACY_CODE:
				setLegacyCode(LEGACY_CODE_EDEFAULT);
				return;
			case GtmPackage.LEGACY_STATION_MAP__STATION:
				setStation((Station)null);
				return;
			case GtmPackage.LEGACY_STATION_MAP__DATA_SOURCE:
				setDataSource(DATA_SOURCE_EDEFAULT);
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
			case GtmPackage.LEGACY_STATION_MAP__LEGACY_CODE:
				return legacyCode != LEGACY_CODE_EDEFAULT;
			case GtmPackage.LEGACY_STATION_MAP__STATION:
				return station != null;
			case GtmPackage.LEGACY_STATION_MAP__DATA_SOURCE:
				return dataSource != DATA_SOURCE_EDEFAULT;
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
		result.append(", dataSource: ");
		result.append(dataSource);
		result.append(')');
		return result.toString();
	}

} //LegacyStationMapImpl
