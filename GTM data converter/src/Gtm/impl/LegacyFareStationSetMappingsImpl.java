/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.LegacyFareStationSetMap;
import Gtm.LegacyFareStationSetMappings;

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
 * An implementation of the model object '<em><b>Legacy Fare Station Set Mappings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.LegacyFareStationSetMappingsImpl#getLegacyFareStationSetMap <em>Legacy Fare Station Set Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegacyFareStationSetMappingsImpl extends MinimalEObjectImpl.Container implements LegacyFareStationSetMappings {
	/**
	 * The cached value of the '{@link #getLegacyFareStationSetMap() <em>Legacy Fare Station Set Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyFareStationSetMap()
	 * @generated
	 * @ordered
	 */
	protected EList<LegacyFareStationSetMap> legacyFareStationSetMap;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyFareStationSetMappingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LEGACY_FARE_STATION_SET_MAPPINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LegacyFareStationSetMap> getLegacyFareStationSetMap() {
		if (legacyFareStationSetMap == null) {
			legacyFareStationSetMap = new EObjectContainmentEList<LegacyFareStationSetMap>(LegacyFareStationSetMap.class, this, GtmPackage.LEGACY_FARE_STATION_SET_MAPPINGS__LEGACY_FARE_STATION_SET_MAP);
		}
		return legacyFareStationSetMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.LEGACY_FARE_STATION_SET_MAPPINGS__LEGACY_FARE_STATION_SET_MAP:
				return ((InternalEList<?>)getLegacyFareStationSetMap()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.LEGACY_FARE_STATION_SET_MAPPINGS__LEGACY_FARE_STATION_SET_MAP:
				return getLegacyFareStationSetMap();
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
			case GtmPackage.LEGACY_FARE_STATION_SET_MAPPINGS__LEGACY_FARE_STATION_SET_MAP:
				getLegacyFareStationSetMap().clear();
				getLegacyFareStationSetMap().addAll((Collection<? extends LegacyFareStationSetMap>)newValue);
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
			case GtmPackage.LEGACY_FARE_STATION_SET_MAPPINGS__LEGACY_FARE_STATION_SET_MAP:
				getLegacyFareStationSetMap().clear();
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
			case GtmPackage.LEGACY_FARE_STATION_SET_MAPPINGS__LEGACY_FARE_STATION_SET_MAP:
				return legacyFareStationSetMap != null && !legacyFareStationSetMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LegacyFareStationSetMappingsImpl
