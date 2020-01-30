/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.IncludedFreePassengers;
import Gtm.PassengerCombinationConstraint;

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
 * An implementation of the model object '<em><b>Included Free Passengers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.IncludedFreePassengersImpl#getIncludedFreePassengers <em>Included Free Passengers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncludedFreePassengersImpl extends MinimalEObjectImpl.Container implements IncludedFreePassengers {
	/**
	 * The cached value of the '{@link #getIncludedFreePassengers() <em>Included Free Passengers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludedFreePassengers()
	 * @generated
	 * @ordered
	 */
	protected EList<PassengerCombinationConstraint> includedFreePassengers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncludedFreePassengersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.INCLUDED_FREE_PASSENGERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PassengerCombinationConstraint> getIncludedFreePassengers() {
		if (includedFreePassengers == null) {
			includedFreePassengers = new EObjectContainmentEList<PassengerCombinationConstraint>(PassengerCombinationConstraint.class, this, GtmPackage.INCLUDED_FREE_PASSENGERS__INCLUDED_FREE_PASSENGERS);
		}
		return includedFreePassengers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.INCLUDED_FREE_PASSENGERS__INCLUDED_FREE_PASSENGERS:
				return ((InternalEList<?>)getIncludedFreePassengers()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.INCLUDED_FREE_PASSENGERS__INCLUDED_FREE_PASSENGERS:
				return getIncludedFreePassengers();
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
			case GtmPackage.INCLUDED_FREE_PASSENGERS__INCLUDED_FREE_PASSENGERS:
				getIncludedFreePassengers().clear();
				getIncludedFreePassengers().addAll((Collection<? extends PassengerCombinationConstraint>)newValue);
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
			case GtmPackage.INCLUDED_FREE_PASSENGERS__INCLUDED_FREE_PASSENGERS:
				getIncludedFreePassengers().clear();
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
			case GtmPackage.INCLUDED_FREE_PASSENGERS__INCLUDED_FREE_PASSENGERS:
				return includedFreePassengers != null && !includedFreePassengers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IncludedFreePassengersImpl
