/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.Legacy108FareDescription;
import Gtm.Legacy108FaresDescriptions;

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
 * An implementation of the model object '<em><b>Legacy108 Fares Descriptions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.Legacy108FaresDescriptionsImpl#getLegacyFares <em>Legacy Fares</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Legacy108FaresDescriptionsImpl extends MinimalEObjectImpl.Container implements Legacy108FaresDescriptions {
	/**
	 * The cached value of the '{@link #getLegacyFares() <em>Legacy Fares</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyFares()
	 * @generated
	 * @ordered
	 */
	protected EList<Legacy108FareDescription> legacyFares;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Legacy108FaresDescriptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LEGACY108_FARES_DESCRIPTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Legacy108FareDescription> getLegacyFares() {
		if (legacyFares == null) {
			legacyFares = new EObjectContainmentEList<Legacy108FareDescription>(Legacy108FareDescription.class, this, GtmPackage.LEGACY108_FARES_DESCRIPTIONS__LEGACY_FARES);
		}
		return legacyFares;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.LEGACY108_FARES_DESCRIPTIONS__LEGACY_FARES:
				return ((InternalEList<?>)getLegacyFares()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.LEGACY108_FARES_DESCRIPTIONS__LEGACY_FARES:
				return getLegacyFares();
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
			case GtmPackage.LEGACY108_FARES_DESCRIPTIONS__LEGACY_FARES:
				getLegacyFares().clear();
				getLegacyFares().addAll((Collection<? extends Legacy108FareDescription>)newValue);
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
			case GtmPackage.LEGACY108_FARES_DESCRIPTIONS__LEGACY_FARES:
				getLegacyFares().clear();
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
			case GtmPackage.LEGACY108_FARES_DESCRIPTIONS__LEGACY_FARES:
				return legacyFares != null && !legacyFares.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Legacy108FaresDescriptionsImpl
