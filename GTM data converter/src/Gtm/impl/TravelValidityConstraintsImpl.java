/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.TravelValidityConstraint;
import Gtm.TravelValidityConstraints;

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
 * An implementation of the model object '<em><b>Travel Validity Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.TravelValidityConstraintsImpl#getTravelValidityConstraints <em>Travel Validity Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TravelValidityConstraintsImpl extends MinimalEObjectImpl.Container implements TravelValidityConstraints {
	/**
	 * The cached value of the '{@link #getTravelValidityConstraints() <em>Travel Validity Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelValidityConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<TravelValidityConstraint> travelValidityConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TravelValidityConstraintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.TRAVEL_VALIDITY_CONSTRAINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TravelValidityConstraint> getTravelValidityConstraints() {
		if (travelValidityConstraints == null) {
			travelValidityConstraints = new EObjectContainmentEList<TravelValidityConstraint>(TravelValidityConstraint.class, this, GtmPackage.TRAVEL_VALIDITY_CONSTRAINTS__TRAVEL_VALIDITY_CONSTRAINTS);
		}
		return travelValidityConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINTS__TRAVEL_VALIDITY_CONSTRAINTS:
				return ((InternalEList<?>)getTravelValidityConstraints()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINTS__TRAVEL_VALIDITY_CONSTRAINTS:
				return getTravelValidityConstraints();
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
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINTS__TRAVEL_VALIDITY_CONSTRAINTS:
				getTravelValidityConstraints().clear();
				getTravelValidityConstraints().addAll((Collection<? extends TravelValidityConstraint>)newValue);
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
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINTS__TRAVEL_VALIDITY_CONSTRAINTS:
				getTravelValidityConstraints().clear();
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
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINTS__TRAVEL_VALIDITY_CONSTRAINTS:
				return travelValidityConstraints != null && !travelValidityConstraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TravelValidityConstraintsImpl
