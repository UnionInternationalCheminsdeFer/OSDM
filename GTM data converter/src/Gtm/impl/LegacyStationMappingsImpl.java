/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.LegacyStationMap;
import Gtm.LegacyStationMappings;

import Gtm.Station;
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
 * An implementation of the model object '<em><b>Legacy Station Mappings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.LegacyStationMappingsImpl#getStationMappings <em>Station Mappings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegacyStationMappingsImpl extends MinimalEObjectImpl.Container implements LegacyStationMappings {
	/**
	 * The cached value of the '{@link #getStationMappings() <em>Station Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStationMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<LegacyStationMap> stationMappings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyStationMappingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LEGACY_STATION_MAPPINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LegacyStationMap> getStationMappings() {
		if (stationMappings == null) {
			stationMappings = new EObjectContainmentEList<LegacyStationMap>(LegacyStationMap.class, this, GtmPackage.LEGACY_STATION_MAPPINGS__STATION_MAPPINGS);
		}
		return stationMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Station findMappedStation(int stationcode) {
		if (stationcode == 0) return null;
		if (stationMappings == null || stationMappings.isEmpty()) return null;
		
		for (LegacyStationMap map: stationMappings) {
			if (map.getLegacyCode() == stationcode) return map.getStation();
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
			case GtmPackage.LEGACY_STATION_MAPPINGS__STATION_MAPPINGS:
				return ((InternalEList<?>)getStationMappings()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.LEGACY_STATION_MAPPINGS__STATION_MAPPINGS:
				return getStationMappings();
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
			case GtmPackage.LEGACY_STATION_MAPPINGS__STATION_MAPPINGS:
				getStationMappings().clear();
				getStationMappings().addAll((Collection<? extends LegacyStationMap>)newValue);
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
			case GtmPackage.LEGACY_STATION_MAPPINGS__STATION_MAPPINGS:
				getStationMappings().clear();
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
			case GtmPackage.LEGACY_STATION_MAPPINGS__STATION_MAPPINGS:
				return stationMappings != null && !stationMappings.isEmpty();
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
			case GtmPackage.LEGACY_STATION_MAPPINGS___FIND_MAPPED_STATION__INT:
				return findMappedStation((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //LegacyStationMappingsImpl
