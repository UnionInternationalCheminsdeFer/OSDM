/**
 */
package Gtm.impl;

import Gtm.CarrierResourceLocation;
import Gtm.FareResourceLocation;
import Gtm.GtmPackage;
import Gtm.StationResourceLocation;
import Gtm.TrainResourceLocation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fare Resource Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.FareResourceLocationImpl#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.impl.FareResourceLocationImpl#getCarrierResourceLocations <em>Carrier Resource Locations</em>}</li>
 *   <li>{@link Gtm.impl.FareResourceLocationImpl#getStationResourceLocations <em>Station Resource Locations</em>}</li>
 *   <li>{@link Gtm.impl.FareResourceLocationImpl#getTrainResourceLocations <em>Train Resource Locations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FareResourceLocationImpl extends MinimalEObjectImpl.Container implements FareResourceLocation {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The cached value of the '{@link #getStationResourceLocations() <em>Station Resource Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStationResourceLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<StationResourceLocation> stationResourceLocations;

	/**
	 * The cached value of the '{@link #getTrainResourceLocations() <em>Train Resource Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainResourceLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<TrainResourceLocation> trainResourceLocations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FareResourceLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.FARE_RESOURCE_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_RESOURCE_LOCATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CarrierResourceLocation> getCarrierResourceLocations() {
		if (carrierResourceLocations == null) {
			carrierResourceLocations = new EObjectContainmentEList<CarrierResourceLocation>(CarrierResourceLocation.class, this, GtmPackage.FARE_RESOURCE_LOCATION__CARRIER_RESOURCE_LOCATIONS);
		}
		return carrierResourceLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StationResourceLocation> getStationResourceLocations() {
		if (stationResourceLocations == null) {
			stationResourceLocations = new EObjectContainmentEList<StationResourceLocation>(StationResourceLocation.class, this, GtmPackage.FARE_RESOURCE_LOCATION__STATION_RESOURCE_LOCATIONS);
		}
		return stationResourceLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrainResourceLocation> getTrainResourceLocations() {
		if (trainResourceLocations == null) {
			trainResourceLocations = new EObjectContainmentEList<TrainResourceLocation>(TrainResourceLocation.class, this, GtmPackage.FARE_RESOURCE_LOCATION__TRAIN_RESOURCE_LOCATIONS);
		}
		return trainResourceLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.FARE_RESOURCE_LOCATION__CARRIER_RESOURCE_LOCATIONS:
				return ((InternalEList<?>)getCarrierResourceLocations()).basicRemove(otherEnd, msgs);
			case GtmPackage.FARE_RESOURCE_LOCATION__STATION_RESOURCE_LOCATIONS:
				return ((InternalEList<?>)getStationResourceLocations()).basicRemove(otherEnd, msgs);
			case GtmPackage.FARE_RESOURCE_LOCATION__TRAIN_RESOURCE_LOCATIONS:
				return ((InternalEList<?>)getTrainResourceLocations()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.FARE_RESOURCE_LOCATION__ID:
				return getId();
			case GtmPackage.FARE_RESOURCE_LOCATION__CARRIER_RESOURCE_LOCATIONS:
				return getCarrierResourceLocations();
			case GtmPackage.FARE_RESOURCE_LOCATION__STATION_RESOURCE_LOCATIONS:
				return getStationResourceLocations();
			case GtmPackage.FARE_RESOURCE_LOCATION__TRAIN_RESOURCE_LOCATIONS:
				return getTrainResourceLocations();
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
			case GtmPackage.FARE_RESOURCE_LOCATION__ID:
				setId((String)newValue);
				return;
			case GtmPackage.FARE_RESOURCE_LOCATION__CARRIER_RESOURCE_LOCATIONS:
				getCarrierResourceLocations().clear();
				getCarrierResourceLocations().addAll((Collection<? extends CarrierResourceLocation>)newValue);
				return;
			case GtmPackage.FARE_RESOURCE_LOCATION__STATION_RESOURCE_LOCATIONS:
				getStationResourceLocations().clear();
				getStationResourceLocations().addAll((Collection<? extends StationResourceLocation>)newValue);
				return;
			case GtmPackage.FARE_RESOURCE_LOCATION__TRAIN_RESOURCE_LOCATIONS:
				getTrainResourceLocations().clear();
				getTrainResourceLocations().addAll((Collection<? extends TrainResourceLocation>)newValue);
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
			case GtmPackage.FARE_RESOURCE_LOCATION__ID:
				setId(ID_EDEFAULT);
				return;
			case GtmPackage.FARE_RESOURCE_LOCATION__CARRIER_RESOURCE_LOCATIONS:
				getCarrierResourceLocations().clear();
				return;
			case GtmPackage.FARE_RESOURCE_LOCATION__STATION_RESOURCE_LOCATIONS:
				getStationResourceLocations().clear();
				return;
			case GtmPackage.FARE_RESOURCE_LOCATION__TRAIN_RESOURCE_LOCATIONS:
				getTrainResourceLocations().clear();
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
			case GtmPackage.FARE_RESOURCE_LOCATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GtmPackage.FARE_RESOURCE_LOCATION__CARRIER_RESOURCE_LOCATIONS:
				return carrierResourceLocations != null && !carrierResourceLocations.isEmpty();
			case GtmPackage.FARE_RESOURCE_LOCATION__STATION_RESOURCE_LOCATIONS:
				return stationResourceLocations != null && !stationResourceLocations.isEmpty();
			case GtmPackage.FARE_RESOURCE_LOCATION__TRAIN_RESOURCE_LOCATIONS:
				return trainResourceLocations != null && !trainResourceLocations.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //FareResourceLocationImpl
