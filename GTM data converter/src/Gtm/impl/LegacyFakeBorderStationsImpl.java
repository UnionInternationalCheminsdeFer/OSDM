/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.LegacyFakeBorderStations;
import Gtm.StationSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legacy Fake Border Stations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.LegacyFakeBorderStationsImpl#getStations <em>Stations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegacyFakeBorderStationsImpl extends MinimalEObjectImpl.Container implements LegacyFakeBorderStations {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyFakeBorderStationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LEGACY_FAKE_BORDER_STATIONS;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_FAKE_BORDER_STATIONS__STATIONS, oldStations, newStations);
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
				msgs = ((InternalEObject)stations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.LEGACY_FAKE_BORDER_STATIONS__STATIONS, null, msgs);
			if (newStations != null)
				msgs = ((InternalEObject)newStations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.LEGACY_FAKE_BORDER_STATIONS__STATIONS, null, msgs);
			msgs = basicSetStations(newStations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_FAKE_BORDER_STATIONS__STATIONS, newStations, newStations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.LEGACY_FAKE_BORDER_STATIONS__STATIONS:
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
			case GtmPackage.LEGACY_FAKE_BORDER_STATIONS__STATIONS:
				return getStations();
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
			case GtmPackage.LEGACY_FAKE_BORDER_STATIONS__STATIONS:
				setStations((StationSet)newValue);
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
			case GtmPackage.LEGACY_FAKE_BORDER_STATIONS__STATIONS:
				setStations((StationSet)null);
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
			case GtmPackage.LEGACY_FAKE_BORDER_STATIONS__STATIONS:
				return stations != null;
		}
		return super.eIsSet(featureID);
	}

} //LegacyFakeBorderStationsImpl
