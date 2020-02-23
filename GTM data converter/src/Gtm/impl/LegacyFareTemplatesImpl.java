/**
 */
package Gtm.impl;

import Gtm.FareTemplate;
import Gtm.GtmPackage;
import Gtm.LegacyFareTemplates;

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
 * An implementation of the model object '<em><b>Legacy Fare Templates</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.LegacyFareTemplatesImpl#getFareTemplates <em>Fare Templates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegacyFareTemplatesImpl extends MinimalEObjectImpl.Container implements LegacyFareTemplates {
	/**
	 * The cached value of the '{@link #getFareTemplates() <em>Fare Templates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFareTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<FareTemplate> fareTemplates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyFareTemplatesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LEGACY_FARE_TEMPLATES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FareTemplate> getFareTemplates() {
		if (fareTemplates == null) {
			fareTemplates = new EObjectContainmentEList<FareTemplate>(FareTemplate.class, this, GtmPackage.LEGACY_FARE_TEMPLATES__FARE_TEMPLATES);
		}
		return fareTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.LEGACY_FARE_TEMPLATES__FARE_TEMPLATES:
				return ((InternalEList<?>)getFareTemplates()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.LEGACY_FARE_TEMPLATES__FARE_TEMPLATES:
				return getFareTemplates();
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
			case GtmPackage.LEGACY_FARE_TEMPLATES__FARE_TEMPLATES:
				getFareTemplates().clear();
				getFareTemplates().addAll((Collection<? extends FareTemplate>)newValue);
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
			case GtmPackage.LEGACY_FARE_TEMPLATES__FARE_TEMPLATES:
				getFareTemplates().clear();
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
			case GtmPackage.LEGACY_FARE_TEMPLATES__FARE_TEMPLATES:
				return fareTemplates != null && !fareTemplates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LegacyFareTemplatesImpl
