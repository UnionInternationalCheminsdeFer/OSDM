/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.LegacyTargetFares;
import Gtm.TargetFareTemplate;

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
 * An implementation of the model object '<em><b>Legacy Target Fares</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.LegacyTargetFaresImpl#getTargetFares <em>Target Fares</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegacyTargetFaresImpl extends MinimalEObjectImpl.Container implements LegacyTargetFares {
	/**
	 * The cached value of the '{@link #getTargetFares() <em>Target Fares</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFares()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetFareTemplate> targetFares;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyTargetFaresImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LEGACY_TARGET_FARES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TargetFareTemplate> getTargetFares() {
		if (targetFares == null) {
			targetFares = new EObjectContainmentEList<TargetFareTemplate>(TargetFareTemplate.class, this, GtmPackage.LEGACY_TARGET_FARES__TARGET_FARES);
		}
		return targetFares;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.LEGACY_TARGET_FARES__TARGET_FARES:
				return ((InternalEList<?>)getTargetFares()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.LEGACY_TARGET_FARES__TARGET_FARES:
				return getTargetFares();
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
			case GtmPackage.LEGACY_TARGET_FARES__TARGET_FARES:
				getTargetFares().clear();
				getTargetFares().addAll((Collection<? extends TargetFareTemplate>)newValue);
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
			case GtmPackage.LEGACY_TARGET_FARES__TARGET_FARES:
				getTargetFares().clear();
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
			case GtmPackage.LEGACY_TARGET_FARES__TARGET_FARES:
				return targetFares != null && !targetFares.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LegacyTargetFaresImpl
