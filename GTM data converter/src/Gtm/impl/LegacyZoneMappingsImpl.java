/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.LegacyZoneMap;
import Gtm.LegacyZoneMappings;

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
 * An implementation of the model object '<em><b>Legacy Zone Mappings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.LegacyZoneMappingsImpl#getLegacyZoneMap <em>Legacy Zone Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegacyZoneMappingsImpl extends MinimalEObjectImpl.Container implements LegacyZoneMappings {
	/**
	 * The cached value of the '{@link #getLegacyZoneMap() <em>Legacy Zone Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyZoneMap()
	 * @generated
	 * @ordered
	 */
	protected EList<LegacyZoneMap> legacyZoneMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyZoneMappingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LEGACY_ZONE_MAPPINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LegacyZoneMap> getLegacyZoneMap() {
		if (legacyZoneMap == null) {
			legacyZoneMap = new EObjectContainmentEList<LegacyZoneMap>(LegacyZoneMap.class, this, GtmPackage.LEGACY_ZONE_MAPPINGS__LEGACY_ZONE_MAP);
		}
		return legacyZoneMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.LEGACY_ZONE_MAPPINGS__LEGACY_ZONE_MAP:
				return ((InternalEList<?>)getLegacyZoneMap()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.LEGACY_ZONE_MAPPINGS__LEGACY_ZONE_MAP:
				return getLegacyZoneMap();
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
			case GtmPackage.LEGACY_ZONE_MAPPINGS__LEGACY_ZONE_MAP:
				getLegacyZoneMap().clear();
				getLegacyZoneMap().addAll((Collection<? extends LegacyZoneMap>)newValue);
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
			case GtmPackage.LEGACY_ZONE_MAPPINGS__LEGACY_ZONE_MAP:
				getLegacyZoneMap().clear();
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
			case GtmPackage.LEGACY_ZONE_MAPPINGS__LEGACY_ZONE_MAP:
				return legacyZoneMap != null && !legacyZoneMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LegacyZoneMappingsImpl
