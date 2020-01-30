/**
 */
package Gtm.impl;

import Gtm.FulfillmentConstraint;
import Gtm.FulfillmentConstraints;
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
 * An implementation of the model object '<em><b>Fulfillment Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.FulfillmentConstraintsImpl#getFulfillmentConstraints <em>Fulfillment Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FulfillmentConstraintsImpl extends MinimalEObjectImpl.Container implements FulfillmentConstraints {
	/**
	 * The cached value of the '{@link #getFulfillmentConstraints() <em>Fulfillment Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFulfillmentConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<FulfillmentConstraint> fulfillmentConstraints;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FulfillmentConstraintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.FULFILLMENT_CONSTRAINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FulfillmentConstraint> getFulfillmentConstraints() {
		if (fulfillmentConstraints == null) {
			fulfillmentConstraints = new EObjectContainmentEList<FulfillmentConstraint>(FulfillmentConstraint.class, this, GtmPackage.FULFILLMENT_CONSTRAINTS__FULFILLMENT_CONSTRAINTS);
		}
		return fulfillmentConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.FULFILLMENT_CONSTRAINTS__FULFILLMENT_CONSTRAINTS:
				return ((InternalEList<?>)getFulfillmentConstraints()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.FULFILLMENT_CONSTRAINTS__FULFILLMENT_CONSTRAINTS:
				return getFulfillmentConstraints();
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
			case GtmPackage.FULFILLMENT_CONSTRAINTS__FULFILLMENT_CONSTRAINTS:
				getFulfillmentConstraints().clear();
				getFulfillmentConstraints().addAll((Collection<? extends FulfillmentConstraint>)newValue);
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
			case GtmPackage.FULFILLMENT_CONSTRAINTS__FULFILLMENT_CONSTRAINTS:
				getFulfillmentConstraints().clear();
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
			case GtmPackage.FULFILLMENT_CONSTRAINTS__FULFILLMENT_CONSTRAINTS:
				return fulfillmentConstraints != null && !fulfillmentConstraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FulfillmentConstraintsImpl
