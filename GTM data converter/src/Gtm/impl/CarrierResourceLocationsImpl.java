/**
 */
package Gtm.impl;

import Gtm.CarrierResourceLocation;
import Gtm.CarrierResourceLocations;
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
 * An implementation of the model object '<em><b>Carrier Resource Locations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.CarrierResourceLocationsImpl#getCarrierResourceLocations <em>Carrier Resource Locations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarrierResourceLocationsImpl extends MinimalEObjectImpl.Container implements CarrierResourceLocations {
	/**
	 * The cached value of the '{@link #getCarrierResourceLocations() <em>Carrier Resource Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierResourceLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<CarrierResourceLocation> carrierResourceLocations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarrierResourceLocationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.CARRIER_RESOURCE_LOCATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CarrierResourceLocation> getCarrierResourceLocations() {
		if (carrierResourceLocations == null) {
			carrierResourceLocations = new EObjectContainmentEList<CarrierResourceLocation>(CarrierResourceLocation.class, this, GtmPackage.CARRIER_RESOURCE_LOCATIONS__CARRIER_RESOURCE_LOCATIONS);
		}
		return carrierResourceLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.CARRIER_RESOURCE_LOCATIONS__CARRIER_RESOURCE_LOCATIONS:
				return ((InternalEList<?>)getCarrierResourceLocations()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.CARRIER_RESOURCE_LOCATIONS__CARRIER_RESOURCE_LOCATIONS:
				return getCarrierResourceLocations();
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
			case GtmPackage.CARRIER_RESOURCE_LOCATIONS__CARRIER_RESOURCE_LOCATIONS:
				getCarrierResourceLocations().clear();
				getCarrierResourceLocations().addAll((Collection<? extends CarrierResourceLocation>)newValue);
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
			case GtmPackage.CARRIER_RESOURCE_LOCATIONS__CARRIER_RESOURCE_LOCATIONS:
				getCarrierResourceLocations().clear();
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
			case GtmPackage.CARRIER_RESOURCE_LOCATIONS__CARRIER_RESOURCE_LOCATIONS:
				return carrierResourceLocations != null && !carrierResourceLocations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CarrierResourceLocationsImpl
