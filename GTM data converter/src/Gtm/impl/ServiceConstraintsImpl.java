/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.ServiceConstraint;
import Gtm.ServiceConstraints;

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
 * An implementation of the model object '<em><b>Service Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.ServiceConstraintsImpl#getServiceConstraints <em>Service Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceConstraintsImpl extends MinimalEObjectImpl.Container implements ServiceConstraints {
	/**
	 * The cached value of the '{@link #getServiceConstraints() <em>Service Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceConstraint> serviceConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceConstraintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.SERVICE_CONSTRAINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceConstraint> getServiceConstraints() {
		if (serviceConstraints == null) {
			serviceConstraints = new EObjectContainmentEList<ServiceConstraint>(ServiceConstraint.class, this, GtmPackage.SERVICE_CONSTRAINTS__SERVICE_CONSTRAINTS);
		}
		return serviceConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.SERVICE_CONSTRAINTS__SERVICE_CONSTRAINTS:
				return ((InternalEList<?>)getServiceConstraints()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.SERVICE_CONSTRAINTS__SERVICE_CONSTRAINTS:
				return getServiceConstraints();
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
			case GtmPackage.SERVICE_CONSTRAINTS__SERVICE_CONSTRAINTS:
				getServiceConstraints().clear();
				getServiceConstraints().addAll((Collection<? extends ServiceConstraint>)newValue);
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
			case GtmPackage.SERVICE_CONSTRAINTS__SERVICE_CONSTRAINTS:
				getServiceConstraints().clear();
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
			case GtmPackage.SERVICE_CONSTRAINTS__SERVICE_CONSTRAINTS:
				return serviceConstraints != null && !serviceConstraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceConstraintsImpl
