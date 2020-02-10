/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.SalesAvailabilityConstraint;
import Gtm.SalesAvailabilityConstraints;

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
 * An implementation of the model object '<em><b>Sales Availability Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.SalesAvailabilityConstraintsImpl#getSalesAvailabilityConstraints <em>Sales Availability Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SalesAvailabilityConstraintsImpl extends MinimalEObjectImpl.Container implements SalesAvailabilityConstraints {
	/**
	 * The cached value of the '{@link #getSalesAvailabilityConstraints() <em>Sales Availability Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesAvailabilityConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<SalesAvailabilityConstraint> salesAvailabilityConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SalesAvailabilityConstraintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.SALES_AVAILABILITY_CONSTRAINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SalesAvailabilityConstraint> getSalesAvailabilityConstraints() {
		if (salesAvailabilityConstraints == null) {
			salesAvailabilityConstraints = new EObjectContainmentEList<SalesAvailabilityConstraint>(SalesAvailabilityConstraint.class, this, GtmPackage.SALES_AVAILABILITY_CONSTRAINTS__SALES_AVAILABILITY_CONSTRAINTS);
		}
		return salesAvailabilityConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.SALES_AVAILABILITY_CONSTRAINTS__SALES_AVAILABILITY_CONSTRAINTS:
				return ((InternalEList<?>)getSalesAvailabilityConstraints()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.SALES_AVAILABILITY_CONSTRAINTS__SALES_AVAILABILITY_CONSTRAINTS:
				return getSalesAvailabilityConstraints();
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
			case GtmPackage.SALES_AVAILABILITY_CONSTRAINTS__SALES_AVAILABILITY_CONSTRAINTS:
				getSalesAvailabilityConstraints().clear();
				getSalesAvailabilityConstraints().addAll((Collection<? extends SalesAvailabilityConstraint>)newValue);
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
			case GtmPackage.SALES_AVAILABILITY_CONSTRAINTS__SALES_AVAILABILITY_CONSTRAINTS:
				getSalesAvailabilityConstraints().clear();
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
			case GtmPackage.SALES_AVAILABILITY_CONSTRAINTS__SALES_AVAILABILITY_CONSTRAINTS:
				return salesAvailabilityConstraints != null && !salesAvailabilityConstraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SalesAvailabilityConstraintsImpl
