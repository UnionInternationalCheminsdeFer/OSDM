/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.LegacyStationToServiceConstraintMapping;
import Gtm.LegacyStationToServiceConstraintMappings;
import Gtm.ServiceConstraint;

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
 * An implementation of the model object '<em><b>Legacy Station To Service Constraint Mappings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.LegacyStationToServiceConstraintMappingsImpl#getLegacyStationToServiceBrandMappings <em>Legacy Station To Service Brand Mappings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegacyStationToServiceConstraintMappingsImpl extends MinimalEObjectImpl.Container implements LegacyStationToServiceConstraintMappings {
	/**
	 * The cached value of the '{@link #getLegacyStationToServiceBrandMappings() <em>Legacy Station To Service Brand Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyStationToServiceBrandMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<LegacyStationToServiceConstraintMapping> legacyStationToServiceBrandMappings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyStationToServiceConstraintMappingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LegacyStationToServiceConstraintMapping> getLegacyStationToServiceBrandMappings() {
		if (legacyStationToServiceBrandMappings == null) {
			legacyStationToServiceBrandMappings = new EObjectContainmentEList<LegacyStationToServiceConstraintMapping>(LegacyStationToServiceConstraintMapping.class, this, GtmPackage.LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPINGS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS);
		}
		return legacyStationToServiceBrandMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ServiceConstraint findServiceConstraint(int stationCode) {
		if (legacyStationToServiceBrandMappings == null || legacyStationToServiceBrandMappings.isEmpty()) return null;
		for (LegacyStationToServiceConstraintMapping mapping : legacyStationToServiceBrandMappings) {
			if (mapping.getCode() == stationCode) return mapping.getServiceConstraint();
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
			case GtmPackage.LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPINGS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS:
				return ((InternalEList<?>)getLegacyStationToServiceBrandMappings()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPINGS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS:
				return getLegacyStationToServiceBrandMappings();
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
			case GtmPackage.LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPINGS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS:
				getLegacyStationToServiceBrandMappings().clear();
				getLegacyStationToServiceBrandMappings().addAll((Collection<? extends LegacyStationToServiceConstraintMapping>)newValue);
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
			case GtmPackage.LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPINGS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS:
				getLegacyStationToServiceBrandMappings().clear();
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
			case GtmPackage.LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPINGS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS:
				return legacyStationToServiceBrandMappings != null && !legacyStationToServiceBrandMappings.isEmpty();
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
			case GtmPackage.LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPINGS___FIND_SERVICE_CONSTRAINT__INT:
				return findServiceConstraint((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //LegacyStationToServiceConstraintMappingsImpl
