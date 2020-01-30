/**
 */
package Gtm.impl;

import Gtm.CombinationConstraint;
import Gtm.CombinationConstraints;
import Gtm.GtmPackage;

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
 * An implementation of the model object '<em><b>Combination Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.CombinationConstraintsImpl#getCombinationConstraints <em>Combination Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CombinationConstraintsImpl extends MinimalEObjectImpl.Container implements CombinationConstraints {
	/**
	 * The cached value of the '{@link #getCombinationConstraints() <em>Combination Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombinationConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<CombinationConstraint> combinationConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CombinationConstraintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.COMBINATION_CONSTRAINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CombinationConstraint> getCombinationConstraints() {
		if (combinationConstraints == null) {
			combinationConstraints = new EObjectContainmentEList<CombinationConstraint>(CombinationConstraint.class, this, GtmPackage.COMBINATION_CONSTRAINTS__COMBINATION_CONSTRAINTS);
		}
		return combinationConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.COMBINATION_CONSTRAINTS__COMBINATION_CONSTRAINTS:
				return ((InternalEList<?>)getCombinationConstraints()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.COMBINATION_CONSTRAINTS__COMBINATION_CONSTRAINTS:
				return getCombinationConstraints();
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
			case GtmPackage.COMBINATION_CONSTRAINTS__COMBINATION_CONSTRAINTS:
				getCombinationConstraints().clear();
				getCombinationConstraints().addAll((Collection<? extends CombinationConstraint>)newValue);
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
			case GtmPackage.COMBINATION_CONSTRAINTS__COMBINATION_CONSTRAINTS:
				getCombinationConstraints().clear();
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
			case GtmPackage.COMBINATION_CONSTRAINTS__COMBINATION_CONSTRAINTS:
				return combinationConstraints != null && !combinationConstraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CombinationConstraintsImpl
