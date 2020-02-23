/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.ZoneDefinition;
import Gtm.ZoneDefinitions;

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
 * An implementation of the model object '<em><b>Zone Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.ZoneDefinitionsImpl#getZoneDefinition <em>Zone Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZoneDefinitionsImpl extends MinimalEObjectImpl.Container implements ZoneDefinitions {
	/**
	 * The cached value of the '{@link #getZoneDefinition() <em>Zone Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoneDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<ZoneDefinition> zoneDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZoneDefinitionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.ZONE_DEFINITIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ZoneDefinition> getZoneDefinition() {
		if (zoneDefinition == null) {
			zoneDefinition = new EObjectContainmentEList<ZoneDefinition>(ZoneDefinition.class, this, GtmPackage.ZONE_DEFINITIONS__ZONE_DEFINITION);
		}
		return zoneDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.ZONE_DEFINITIONS__ZONE_DEFINITION:
				return ((InternalEList<?>)getZoneDefinition()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.ZONE_DEFINITIONS__ZONE_DEFINITION:
				return getZoneDefinition();
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
			case GtmPackage.ZONE_DEFINITIONS__ZONE_DEFINITION:
				getZoneDefinition().clear();
				getZoneDefinition().addAll((Collection<? extends ZoneDefinition>)newValue);
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
			case GtmPackage.ZONE_DEFINITIONS__ZONE_DEFINITION:
				getZoneDefinition().clear();
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
			case GtmPackage.ZONE_DEFINITIONS__ZONE_DEFINITION:
				return zoneDefinition != null && !zoneDefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ZoneDefinitionsImpl
