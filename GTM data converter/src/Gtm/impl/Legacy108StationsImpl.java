/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.Legacy108Station;
import Gtm.Legacy108Stations;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legacy108 Stations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.Legacy108StationsImpl#getLegacyStations <em>Legacy Stations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Legacy108StationsImpl extends MinimalEObjectImpl.Container implements Legacy108Stations {
	/**
	 * The cached value of the '{@link #getLegacyStations() <em>Legacy Stations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyStations()
	 * @generated
	 * @ordered
	 */
	protected EList<Legacy108Station> legacyStations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Legacy108StationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LEGACY108_STATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Legacy108Station> getLegacyStations() {
		if (legacyStations == null) {
			legacyStations = new EObjectContainmentEList<Legacy108Station>(Legacy108Station.class, this, GtmPackage.LEGACY108_STATIONS__LEGACY_STATIONS);
		}
		return legacyStations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Legacy108Station findStation(int code) {
		if (legacyStations == null || legacyStations.isEmpty()) return null;
		
		for (Legacy108Station station: legacyStations) {
			if (station.getStationCode() == code && code > 0) return station;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Legacy108Station findByBorderPoint(int code) {
		if (legacyStations == null || legacyStations.isEmpty()) return null;
				for (Legacy108Station station: legacyStations) {
			if (station.getBorderPointCode() == code && code > 0) return station;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.LEGACY108_STATIONS__LEGACY_STATIONS:
				return ((InternalEList<?>)getLegacyStations()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.LEGACY108_STATIONS__LEGACY_STATIONS:
				return getLegacyStations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GtmPackage.LEGACY108_STATIONS__LEGACY_STATIONS:
				getLegacyStations().clear();
				getLegacyStations().addAll((Collection<? extends Legacy108Station>)newValue);
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
			case GtmPackage.LEGACY108_STATIONS__LEGACY_STATIONS:
				getLegacyStations().clear();
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
			case GtmPackage.LEGACY108_STATIONS__LEGACY_STATIONS:
				return legacyStations != null && !legacyStations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GtmPackage.LEGACY108_STATIONS___FIND_STATION__INT:
				return findStation((Integer)arguments.get(0));
			case GtmPackage.LEGACY108_STATIONS___FIND_BY_BORDER_POINT__INT:
				return findByBorderPoint((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //Legacy108StationsImpl
