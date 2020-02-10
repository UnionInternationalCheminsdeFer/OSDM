/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.ServiceBrand;
import Gtm.ServiceBrands;

import java.lang.reflect.InvocationTargetException;
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
 * An implementation of the model object '<em><b>Service Brands</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.ServiceBrandsImpl#getServiceBrands <em>Service Brands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceBrandsImpl extends MinimalEObjectImpl.Container implements ServiceBrands {
	/**
	 * The cached value of the '{@link #getServiceBrands() <em>Service Brands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceBrands()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceBrand> serviceBrands;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceBrandsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.SERVICE_BRANDS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceBrand> getServiceBrands() {
		if (serviceBrands == null) {
			serviceBrands = new EObjectContainmentEList<ServiceBrand>(ServiceBrand.class, this, GtmPackage.SERVICE_BRANDS__SERVICE_BRANDS);
		}
		return serviceBrands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ServiceBrand findServiceBRand(int code) { 
		if (serviceBrands == null) return null;
		for (ServiceBrand serviceBrand : serviceBrands) {
			if (serviceBrand.getCode() == code) {
				return serviceBrand;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.SERVICE_BRANDS__SERVICE_BRANDS:
				return ((InternalEList<?>)getServiceBrands()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.SERVICE_BRANDS__SERVICE_BRANDS:
				return getServiceBrands();
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
			case GtmPackage.SERVICE_BRANDS__SERVICE_BRANDS:
				getServiceBrands().clear();
				getServiceBrands().addAll((Collection<? extends ServiceBrand>)newValue);
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
			case GtmPackage.SERVICE_BRANDS__SERVICE_BRANDS:
				getServiceBrands().clear();
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
			case GtmPackage.SERVICE_BRANDS__SERVICE_BRANDS:
				return serviceBrands != null && !serviceBrands.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GtmPackage.SERVICE_BRANDS___FIND_SERVICE_BRAND__INT:
				return findServiceBRand((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ServiceBrandsImpl
