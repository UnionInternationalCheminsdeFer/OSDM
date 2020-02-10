/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.RegionalConstraint;
import Gtm.RegionalConstraints;

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
 * An implementation of the model object '<em><b>Regional Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.RegionalConstraintsImpl#getRegionalConstraints <em>Regional Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegionalConstraintsImpl extends MinimalEObjectImpl.Container implements RegionalConstraints {
	/**
	 * The cached value of the '{@link #getRegionalConstraints() <em>Regional Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionalConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<RegionalConstraint> regionalConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionalConstraintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.REGIONAL_CONSTRAINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegionalConstraint> getRegionalConstraints() {
		if (regionalConstraints == null) {
			regionalConstraints = new EObjectContainmentEList<RegionalConstraint>(RegionalConstraint.class, this, GtmPackage.REGIONAL_CONSTRAINTS__REGIONAL_CONSTRAINTS);
		}
		return regionalConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.REGIONAL_CONSTRAINTS__REGIONAL_CONSTRAINTS:
				return ((InternalEList<?>)getRegionalConstraints()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.REGIONAL_CONSTRAINTS__REGIONAL_CONSTRAINTS:
				return getRegionalConstraints();
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
			case GtmPackage.REGIONAL_CONSTRAINTS__REGIONAL_CONSTRAINTS:
				getRegionalConstraints().clear();
				getRegionalConstraints().addAll((Collection<? extends RegionalConstraint>)newValue);
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
			case GtmPackage.REGIONAL_CONSTRAINTS__REGIONAL_CONSTRAINTS:
				getRegionalConstraints().clear();
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
			case GtmPackage.REGIONAL_CONSTRAINTS__REGIONAL_CONSTRAINTS:
				return regionalConstraints != null && !regionalConstraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RegionalConstraintsImpl
