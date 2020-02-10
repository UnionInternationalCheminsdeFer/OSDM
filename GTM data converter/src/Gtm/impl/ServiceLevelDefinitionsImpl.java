/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.ServiceLevel;
import Gtm.ServiceLevelDefinitions;
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
 * An implementation of the model object '<em><b>Service Level Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.ServiceLevelDefinitionsImpl#getServiceLevelDefinition <em>Service Level Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceLevelDefinitionsImpl extends MinimalEObjectImpl.Container implements ServiceLevelDefinitions {
	/**
	 * The cached value of the '{@link #getServiceLevelDefinition() <em>Service Level Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLevelDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceLevel> serviceLevelDefinition;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceLevelDefinitionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.SERVICE_LEVEL_DEFINITIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceLevel> getServiceLevelDefinition() {
		if (serviceLevelDefinition == null) {
			serviceLevelDefinition = new EObjectContainmentEList<ServiceLevel>(ServiceLevel.class, this, GtmPackage.SERVICE_LEVEL_DEFINITIONS__SERVICE_LEVEL_DEFINITION);
		}
		return serviceLevelDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.SERVICE_LEVEL_DEFINITIONS__SERVICE_LEVEL_DEFINITION:
				return ((InternalEList<?>)getServiceLevelDefinition()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.SERVICE_LEVEL_DEFINITIONS__SERVICE_LEVEL_DEFINITION:
				return getServiceLevelDefinition();
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
			case GtmPackage.SERVICE_LEVEL_DEFINITIONS__SERVICE_LEVEL_DEFINITION:
				getServiceLevelDefinition().clear();
				getServiceLevelDefinition().addAll((Collection<? extends ServiceLevel>)newValue);
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
			case GtmPackage.SERVICE_LEVEL_DEFINITIONS__SERVICE_LEVEL_DEFINITION:
				getServiceLevelDefinition().clear();
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
			case GtmPackage.SERVICE_LEVEL_DEFINITIONS__SERVICE_LEVEL_DEFINITION:
				return serviceLevelDefinition != null && !serviceLevelDefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceLevelDefinitionsImpl
