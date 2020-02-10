/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.StationResourceLocation;
import Gtm.StationResourceLocations;

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
 * An implementation of the model object '<em><b>Station Resource Locations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.StationResourceLocationsImpl#getStationResourceLocations <em>Station Resource Locations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StationResourceLocationsImpl extends MinimalEObjectImpl.Container implements StationResourceLocations {
	/**
	 * The cached value of the '{@link #getStationResourceLocations() <em>Station Resource Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStationResourceLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<StationResourceLocation> stationResourceLocations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StationResourceLocationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.STATION_RESOURCE_LOCATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StationResourceLocation> getStationResourceLocations() {
		if (stationResourceLocations == null) {
			stationResourceLocations = new EObjectContainmentEList<StationResourceLocation>(StationResourceLocation.class, this, GtmPackage.STATION_RESOURCE_LOCATIONS__STATION_RESOURCE_LOCATIONS);
		}
		return stationResourceLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.STATION_RESOURCE_LOCATIONS__STATION_RESOURCE_LOCATIONS:
				return ((InternalEList<?>)getStationResourceLocations()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.STATION_RESOURCE_LOCATIONS__STATION_RESOURCE_LOCATIONS:
				return getStationResourceLocations();
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
			case GtmPackage.STATION_RESOURCE_LOCATIONS__STATION_RESOURCE_LOCATIONS:
				getStationResourceLocations().clear();
				getStationResourceLocations().addAll((Collection<? extends StationResourceLocation>)newValue);
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
			case GtmPackage.STATION_RESOURCE_LOCATIONS__STATION_RESOURCE_LOCATIONS:
				getStationResourceLocations().clear();
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
			case GtmPackage.STATION_RESOURCE_LOCATIONS__STATION_RESOURCE_LOCATIONS:
				return stationResourceLocations != null && !stationResourceLocations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StationResourceLocationsImpl
