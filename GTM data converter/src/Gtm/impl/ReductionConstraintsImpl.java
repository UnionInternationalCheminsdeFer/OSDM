/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.ReductionConstraint;
import Gtm.ReductionConstraints;

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
 * An implementation of the model object '<em><b>Reduction Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.ReductionConstraintsImpl#getReductionConstraints <em>Reduction Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReductionConstraintsImpl extends MinimalEObjectImpl.Container implements ReductionConstraints {
	/**
	 * The cached value of the '{@link #getReductionConstraints() <em>Reduction Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReductionConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<ReductionConstraint> reductionConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReductionConstraintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.REDUCTION_CONSTRAINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReductionConstraint> getReductionConstraints() {
		if (reductionConstraints == null) {
			reductionConstraints = new EObjectContainmentEList<ReductionConstraint>(ReductionConstraint.class, this, GtmPackage.REDUCTION_CONSTRAINTS__REDUCTION_CONSTRAINTS);
		}
		return reductionConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.REDUCTION_CONSTRAINTS__REDUCTION_CONSTRAINTS:
				return ((InternalEList<?>)getReductionConstraints()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.REDUCTION_CONSTRAINTS__REDUCTION_CONSTRAINTS:
				return getReductionConstraints();
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
			case GtmPackage.REDUCTION_CONSTRAINTS__REDUCTION_CONSTRAINTS:
				getReductionConstraints().clear();
				getReductionConstraints().addAll((Collection<? extends ReductionConstraint>)newValue);
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
			case GtmPackage.REDUCTION_CONSTRAINTS__REDUCTION_CONSTRAINTS:
				getReductionConstraints().clear();
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
			case GtmPackage.REDUCTION_CONSTRAINTS__REDUCTION_CONSTRAINTS:
				return reductionConstraints != null && !reductionConstraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReductionConstraintsImpl
