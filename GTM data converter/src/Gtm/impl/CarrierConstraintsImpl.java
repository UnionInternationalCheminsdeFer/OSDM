/**
 */
package Gtm.impl;

import Gtm.CarrierConstraint;
import Gtm.CarrierConstraints;
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
 * An implementation of the model object '<em><b>Carrier Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.CarrierConstraintsImpl#getCarrierConstraints <em>Carrier Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarrierConstraintsImpl extends MinimalEObjectImpl.Container implements CarrierConstraints {
	/**
	 * The cached value of the '{@link #getCarrierConstraints() <em>Carrier Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<CarrierConstraint> carrierConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarrierConstraintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.CARRIER_CONSTRAINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CarrierConstraint> getCarrierConstraints() {
		if (carrierConstraints == null) {
			carrierConstraints = new EObjectContainmentEList<CarrierConstraint>(CarrierConstraint.class, this, GtmPackage.CARRIER_CONSTRAINTS__CARRIER_CONSTRAINTS);
		}
		return carrierConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.CARRIER_CONSTRAINTS__CARRIER_CONSTRAINTS:
				return ((InternalEList<?>)getCarrierConstraints()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.CARRIER_CONSTRAINTS__CARRIER_CONSTRAINTS:
				return getCarrierConstraints();
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
			case GtmPackage.CARRIER_CONSTRAINTS__CARRIER_CONSTRAINTS:
				getCarrierConstraints().clear();
				getCarrierConstraints().addAll((Collection<? extends CarrierConstraint>)newValue);
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
			case GtmPackage.CARRIER_CONSTRAINTS__CARRIER_CONSTRAINTS:
				getCarrierConstraints().clear();
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
			case GtmPackage.CARRIER_CONSTRAINTS__CARRIER_CONSTRAINTS:
				return carrierConstraints != null && !carrierConstraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CarrierConstraintsImpl
