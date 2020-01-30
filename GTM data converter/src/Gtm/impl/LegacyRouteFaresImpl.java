/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.LegacyRouteFare;
import Gtm.LegacyRouteFares;

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
 * An implementation of the model object '<em><b>Legacy Route Fares</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.LegacyRouteFaresImpl#getRouteFare <em>Route Fare</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegacyRouteFaresImpl extends MinimalEObjectImpl.Container implements LegacyRouteFares {
	/**
	 * The cached value of the '{@link #getRouteFare() <em>Route Fare</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteFare()
	 * @generated
	 * @ordered
	 */
	protected EList<LegacyRouteFare> routeFare;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyRouteFaresImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LEGACY_ROUTE_FARES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LegacyRouteFare> getRouteFare() {
		if (routeFare == null) {
			routeFare = new EObjectContainmentEList<LegacyRouteFare>(LegacyRouteFare.class, this, GtmPackage.LEGACY_ROUTE_FARES__ROUTE_FARE);
		}
		return routeFare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.LEGACY_ROUTE_FARES__ROUTE_FARE:
				return ((InternalEList<?>)getRouteFare()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.LEGACY_ROUTE_FARES__ROUTE_FARE:
				return getRouteFare();
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
			case GtmPackage.LEGACY_ROUTE_FARES__ROUTE_FARE:
				getRouteFare().clear();
				getRouteFare().addAll((Collection<? extends LegacyRouteFare>)newValue);
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
			case GtmPackage.LEGACY_ROUTE_FARES__ROUTE_FARE:
				getRouteFare().clear();
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
			case GtmPackage.LEGACY_ROUTE_FARES__ROUTE_FARE:
				return routeFare != null && !routeFare.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LegacyRouteFaresImpl
