/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.ServiceClass;
import Gtm.ServiceClassDefinitions;

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
 * An implementation of the model object '<em><b>Service Class Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.ServiceClassDefinitionsImpl#getServiceClassDefinitions <em>Service Class Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceClassDefinitionsImpl extends MinimalEObjectImpl.Container implements ServiceClassDefinitions {
	/**
	 * The cached value of the '{@link #getServiceClassDefinitions() <em>Service Class Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceClassDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceClass> serviceClassDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceClassDefinitionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.SERVICE_CLASS_DEFINITIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceClass> getServiceClassDefinitions() {
		if (serviceClassDefinitions == null) {
			serviceClassDefinitions = new EObjectContainmentEList<ServiceClass>(ServiceClass.class, this, GtmPackage.SERVICE_CLASS_DEFINITIONS__SERVICE_CLASS_DEFINITIONS);
		}
		return serviceClassDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.SERVICE_CLASS_DEFINITIONS__SERVICE_CLASS_DEFINITIONS:
				return ((InternalEList<?>)getServiceClassDefinitions()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.SERVICE_CLASS_DEFINITIONS__SERVICE_CLASS_DEFINITIONS:
				return getServiceClassDefinitions();
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
			case GtmPackage.SERVICE_CLASS_DEFINITIONS__SERVICE_CLASS_DEFINITIONS:
				getServiceClassDefinitions().clear();
				getServiceClassDefinitions().addAll((Collection<? extends ServiceClass>)newValue);
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
			case GtmPackage.SERVICE_CLASS_DEFINITIONS__SERVICE_CLASS_DEFINITIONS:
				getServiceClassDefinitions().clear();
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
			case GtmPackage.SERVICE_CLASS_DEFINITIONS__SERVICE_CLASS_DEFINITIONS:
				return serviceClassDefinitions != null && !serviceClassDefinitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceClassDefinitionsImpl
