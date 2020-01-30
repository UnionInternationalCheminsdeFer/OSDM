/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.LegacyDistanceFare;
import Gtm.LegacyDistanceFares;

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
 * An implementation of the model object '<em><b>Legacy Distance Fares</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.LegacyDistanceFaresImpl#getDistanceFare <em>Distance Fare</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegacyDistanceFaresImpl extends MinimalEObjectImpl.Container implements LegacyDistanceFares {
	/**
	 * The cached value of the '{@link #getDistanceFare() <em>Distance Fare</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceFare()
	 * @generated
	 * @ordered
	 */
	protected EList<LegacyDistanceFare> distanceFare;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyDistanceFaresImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LEGACY_DISTANCE_FARES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LegacyDistanceFare> getDistanceFare() {
		if (distanceFare == null) {
			distanceFare = new EObjectContainmentEList<LegacyDistanceFare>(LegacyDistanceFare.class, this, GtmPackage.LEGACY_DISTANCE_FARES__DISTANCE_FARE);
		}
		return distanceFare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.LEGACY_DISTANCE_FARES__DISTANCE_FARE:
				return ((InternalEList<?>)getDistanceFare()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.LEGACY_DISTANCE_FARES__DISTANCE_FARE:
				return getDistanceFare();
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
			case GtmPackage.LEGACY_DISTANCE_FARES__DISTANCE_FARE:
				getDistanceFare().clear();
				getDistanceFare().addAll((Collection<? extends LegacyDistanceFare>)newValue);
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
			case GtmPackage.LEGACY_DISTANCE_FARES__DISTANCE_FARE:
				getDistanceFare().clear();
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
			case GtmPackage.LEGACY_DISTANCE_FARES__DISTANCE_FARE:
				return distanceFare != null && !distanceFare.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LegacyDistanceFaresImpl
