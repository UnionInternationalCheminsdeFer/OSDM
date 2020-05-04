/**
 */
package Gtm.impl;

import Gtm.Carrier;
import Gtm.GtmPackage;
import Gtm.LegacyBorderSide;
import Gtm.StationSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legacy Border Side</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.LegacyBorderSideImpl#getCarrier <em>Carrier</em>}</li>
 *   <li>{@link Gtm.impl.LegacyBorderSideImpl#getStations <em>Stations</em>}</li>
 *   <li>{@link Gtm.impl.LegacyBorderSideImpl#getLegacyStationCode <em>Legacy Station Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegacyBorderSideImpl extends MinimalEObjectImpl.Container implements LegacyBorderSide {
	/**
	 * The cached value of the '{@link #getCarrier() <em>Carrier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrier()
	 * @generated
	 * @ordered
	 */
	protected Carrier carrier;

	/**
	 * The cached value of the '{@link #getStations() <em>Stations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStations()
	 * @generated
	 * @ordered
	 */
	protected StationSet stations;

	/**
	 * The default value of the '{@link #getLegacyStationCode() <em>Legacy Station Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyStationCode()
	 * @generated
	 * @ordered
	 */
	protected static final int LEGACY_STATION_CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLegacyStationCode() <em>Legacy Station Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyStationCode()
	 * @generated
	 * @ordered
	 */
	protected int legacyStationCode = LEGACY_STATION_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyBorderSideImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LEGACY_BORDER_SIDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carrier getCarrier() {
		if (carrier != null && carrier.eIsProxy()) {
			InternalEObject oldCarrier = (InternalEObject)carrier;
			carrier = (Carrier)eResolveProxy(oldCarrier);
			if (carrier != oldCarrier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.LEGACY_BORDER_SIDE__CARRIER, oldCarrier, carrier));
			}
		}
		return carrier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carrier basicGetCarrier() {
		return carrier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarrier(Carrier newCarrier) {
		Carrier oldCarrier = carrier;
		carrier = newCarrier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_BORDER_SIDE__CARRIER, oldCarrier, carrier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationSet getStations() {
		return stations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStations(StationSet newStations, NotificationChain msgs) {
		StationSet oldStations = stations;
		stations = newStations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_BORDER_SIDE__STATIONS, oldStations, newStations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStations(StationSet newStations) {
		if (newStations != stations) {
			NotificationChain msgs = null;
			if (stations != null)
				msgs = ((InternalEObject)stations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.LEGACY_BORDER_SIDE__STATIONS, null, msgs);
			if (newStations != null)
				msgs = ((InternalEObject)newStations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.LEGACY_BORDER_SIDE__STATIONS, null, msgs);
			msgs = basicSetStations(newStations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_BORDER_SIDE__STATIONS, newStations, newStations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLegacyStationCode() {
		return legacyStationCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegacyStationCode(int newLegacyStationCode) {
		int oldLegacyStationCode = legacyStationCode;
		legacyStationCode = newLegacyStationCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_BORDER_SIDE__LEGACY_STATION_CODE, oldLegacyStationCode, legacyStationCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.LEGACY_BORDER_SIDE__STATIONS:
				return basicSetStations(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.LEGACY_BORDER_SIDE__CARRIER:
				if (resolve) return getCarrier();
				return basicGetCarrier();
			case GtmPackage.LEGACY_BORDER_SIDE__STATIONS:
				return getStations();
			case GtmPackage.LEGACY_BORDER_SIDE__LEGACY_STATION_CODE:
				return getLegacyStationCode();
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
			case GtmPackage.LEGACY_BORDER_SIDE__CARRIER:
				setCarrier((Carrier)newValue);
				return;
			case GtmPackage.LEGACY_BORDER_SIDE__STATIONS:
				setStations((StationSet)newValue);
				return;
			case GtmPackage.LEGACY_BORDER_SIDE__LEGACY_STATION_CODE:
				setLegacyStationCode((Integer)newValue);
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
			case GtmPackage.LEGACY_BORDER_SIDE__CARRIER:
				setCarrier((Carrier)null);
				return;
			case GtmPackage.LEGACY_BORDER_SIDE__STATIONS:
				setStations((StationSet)null);
				return;
			case GtmPackage.LEGACY_BORDER_SIDE__LEGACY_STATION_CODE:
				setLegacyStationCode(LEGACY_STATION_CODE_EDEFAULT);
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
			case GtmPackage.LEGACY_BORDER_SIDE__CARRIER:
				return carrier != null;
			case GtmPackage.LEGACY_BORDER_SIDE__STATIONS:
				return stations != null;
			case GtmPackage.LEGACY_BORDER_SIDE__LEGACY_STATION_CODE:
				return legacyStationCode != LEGACY_STATION_CODE_EDEFAULT;
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
		result.append(" (legacyStationCode: ");
		result.append(legacyStationCode);
		result.append(')');
		return result.toString();
	}

} //LegacyBorderSideImpl
