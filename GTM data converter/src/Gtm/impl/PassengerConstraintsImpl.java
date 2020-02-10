/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.PassengerConstraint;
import Gtm.PassengerConstraints;

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
 * An implementation of the model object '<em><b>Passenger Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.PassengerConstraintsImpl#getPassengerConstraints <em>Passenger Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PassengerConstraintsImpl extends MinimalEObjectImpl.Container implements PassengerConstraints {
	/**
	 * The cached value of the '{@link #getPassengerConstraints() <em>Passenger Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<PassengerConstraint> passengerConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassengerConstraintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.PASSENGER_CONSTRAINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PassengerConstraint> getPassengerConstraints() {
		if (passengerConstraints == null) {
			passengerConstraints = new EObjectContainmentEList<PassengerConstraint>(PassengerConstraint.class, this, GtmPackage.PASSENGER_CONSTRAINTS__PASSENGER_CONSTRAINTS);
		}
		return passengerConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.PASSENGER_CONSTRAINTS__PASSENGER_CONSTRAINTS:
				return ((InternalEList<?>)getPassengerConstraints()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.PASSENGER_CONSTRAINTS__PASSENGER_CONSTRAINTS:
				return getPassengerConstraints();
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
			case GtmPackage.PASSENGER_CONSTRAINTS__PASSENGER_CONSTRAINTS:
				getPassengerConstraints().clear();
				getPassengerConstraints().addAll((Collection<? extends PassengerConstraint>)newValue);
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
			case GtmPackage.PASSENGER_CONSTRAINTS__PASSENGER_CONSTRAINTS:
				getPassengerConstraints().clear();
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
			case GtmPackage.PASSENGER_CONSTRAINTS__PASSENGER_CONSTRAINTS:
				return passengerConstraints != null && !passengerConstraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PassengerConstraintsImpl
