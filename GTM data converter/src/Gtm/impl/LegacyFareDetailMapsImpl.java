/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.LegacyFareDetailMap;
import Gtm.LegacyFareDetailMaps;

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
 * An implementation of the model object '<em><b>Legacy Fare Detail Maps</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.LegacyFareDetailMapsImpl#getLegacyFareDetailMaps <em>Legacy Fare Detail Maps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegacyFareDetailMapsImpl extends MinimalEObjectImpl.Container implements LegacyFareDetailMaps {
	/**
	 * The cached value of the '{@link #getLegacyFareDetailMaps() <em>Legacy Fare Detail Maps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyFareDetailMaps()
	 * @generated
	 * @ordered
	 */
	protected EList<LegacyFareDetailMap> legacyFareDetailMaps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyFareDetailMapsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LEGACY_FARE_DETAIL_MAPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LegacyFareDetailMap> getLegacyFareDetailMaps() {
		if (legacyFareDetailMaps == null) {
			legacyFareDetailMaps = new EObjectContainmentEList<LegacyFareDetailMap>(LegacyFareDetailMap.class, this, GtmPackage.LEGACY_FARE_DETAIL_MAPS__LEGACY_FARE_DETAIL_MAPS);
		}
		return legacyFareDetailMaps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.LEGACY_FARE_DETAIL_MAPS__LEGACY_FARE_DETAIL_MAPS:
				return ((InternalEList<?>)getLegacyFareDetailMaps()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.LEGACY_FARE_DETAIL_MAPS__LEGACY_FARE_DETAIL_MAPS:
				return getLegacyFareDetailMaps();
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
			case GtmPackage.LEGACY_FARE_DETAIL_MAPS__LEGACY_FARE_DETAIL_MAPS:
				getLegacyFareDetailMaps().clear();
				getLegacyFareDetailMaps().addAll((Collection<? extends LegacyFareDetailMap>)newValue);
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
			case GtmPackage.LEGACY_FARE_DETAIL_MAPS__LEGACY_FARE_DETAIL_MAPS:
				getLegacyFareDetailMaps().clear();
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
			case GtmPackage.LEGACY_FARE_DETAIL_MAPS__LEGACY_FARE_DETAIL_MAPS:
				return legacyFareDetailMaps != null && !legacyFareDetailMaps.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LegacyFareDetailMapsImpl
