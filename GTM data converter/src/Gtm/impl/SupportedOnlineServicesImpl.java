/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.OnlineServiceType;
import Gtm.SupportedOnlineServices;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supported Online Services</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.SupportedOnlineServicesImpl#getSupportedOnlineServices <em>Supported Online Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupportedOnlineServicesImpl extends MinimalEObjectImpl.Container implements SupportedOnlineServices {
	/**
	 * The cached value of the '{@link #getSupportedOnlineServices() <em>Supported Online Services</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedOnlineServices()
	 * @generated
	 * @ordered
	 */
	protected EList<OnlineServiceType> supportedOnlineServices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupportedOnlineServicesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.SUPPORTED_ONLINE_SERVICES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OnlineServiceType> getSupportedOnlineServices() {
		if (supportedOnlineServices == null) {
			supportedOnlineServices = new EDataTypeUniqueEList<OnlineServiceType>(OnlineServiceType.class, this, GtmPackage.SUPPORTED_ONLINE_SERVICES__SUPPORTED_ONLINE_SERVICES);
		}
		return supportedOnlineServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.SUPPORTED_ONLINE_SERVICES__SUPPORTED_ONLINE_SERVICES:
				return getSupportedOnlineServices();
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
			case GtmPackage.SUPPORTED_ONLINE_SERVICES__SUPPORTED_ONLINE_SERVICES:
				getSupportedOnlineServices().clear();
				getSupportedOnlineServices().addAll((Collection<? extends OnlineServiceType>)newValue);
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
			case GtmPackage.SUPPORTED_ONLINE_SERVICES__SUPPORTED_ONLINE_SERVICES:
				getSupportedOnlineServices().clear();
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
			case GtmPackage.SUPPORTED_ONLINE_SERVICES__SUPPORTED_ONLINE_SERVICES:
				return supportedOnlineServices != null && !supportedOnlineServices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (supportedOnlineServices: ");
		result.append(supportedOnlineServices);
		result.append(')');
		return result.toString();
	}

} //SupportedOnlineServicesImpl
