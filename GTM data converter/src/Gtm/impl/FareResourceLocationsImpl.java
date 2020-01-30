/**
 */
package Gtm.impl;

import Gtm.CarrierResourceLocations;
import Gtm.FareResourceLocations;
import Gtm.GtmPackage;
import Gtm.StationResourceLocations;
import Gtm.TrainResourceLocations;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fare Resource Locations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.FareResourceLocationsImpl#getTrainResourceLocations <em>Train Resource Locations</em>}</li>
 *   <li>{@link Gtm.impl.FareResourceLocationsImpl#getStationResourceLocations <em>Station Resource Locations</em>}</li>
 *   <li>{@link Gtm.impl.FareResourceLocationsImpl#getCarrierResourceLocations <em>Carrier Resource Locations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FareResourceLocationsImpl extends MinimalEObjectImpl.Container implements FareResourceLocations {
	/**
	 * The cached value of the '{@link #getTrainResourceLocations() <em>Train Resource Locations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainResourceLocations()
	 * @generated
	 * @ordered
	 */
	protected TrainResourceLocations trainResourceLocations;
	/**
	 * The cached value of the '{@link #getStationResourceLocations() <em>Station Resource Locations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStationResourceLocations()
	 * @generated
	 * @ordered
	 */
	protected StationResourceLocations stationResourceLocations;
	/**
	 * The cached value of the '{@link #getCarrierResourceLocations() <em>Carrier Resource Locations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierResourceLocations()
	 * @generated
	 * @ordered
	 */
	protected CarrierResourceLocations carrierResourceLocations;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FareResourceLocationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.FARE_RESOURCE_LOCATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarrierResourceLocations getCarrierResourceLocations() {
		return carrierResourceLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCarrierResourceLocations(CarrierResourceLocations newCarrierResourceLocations, NotificationChain msgs) {
		CarrierResourceLocations oldCarrierResourceLocations = carrierResourceLocations;
		carrierResourceLocations = newCarrierResourceLocations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_RESOURCE_LOCATIONS__CARRIER_RESOURCE_LOCATIONS, oldCarrierResourceLocations, newCarrierResourceLocations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarrierResourceLocations(CarrierResourceLocations newCarrierResourceLocations) {
		if (newCarrierResourceLocations != carrierResourceLocations) {
			NotificationChain msgs = null;
			if (carrierResourceLocations != null)
				msgs = ((InternalEObject)carrierResourceLocations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_RESOURCE_LOCATIONS__CARRIER_RESOURCE_LOCATIONS, null, msgs);
			if (newCarrierResourceLocations != null)
				msgs = ((InternalEObject)newCarrierResourceLocations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_RESOURCE_LOCATIONS__CARRIER_RESOURCE_LOCATIONS, null, msgs);
			msgs = basicSetCarrierResourceLocations(newCarrierResourceLocations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_RESOURCE_LOCATIONS__CARRIER_RESOURCE_LOCATIONS, newCarrierResourceLocations, newCarrierResourceLocations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationResourceLocations getStationResourceLocations() {
		return stationResourceLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStationResourceLocations(StationResourceLocations newStationResourceLocations, NotificationChain msgs) {
		StationResourceLocations oldStationResourceLocations = stationResourceLocations;
		stationResourceLocations = newStationResourceLocations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_RESOURCE_LOCATIONS__STATION_RESOURCE_LOCATIONS, oldStationResourceLocations, newStationResourceLocations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStationResourceLocations(StationResourceLocations newStationResourceLocations) {
		if (newStationResourceLocations != stationResourceLocations) {
			NotificationChain msgs = null;
			if (stationResourceLocations != null)
				msgs = ((InternalEObject)stationResourceLocations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_RESOURCE_LOCATIONS__STATION_RESOURCE_LOCATIONS, null, msgs);
			if (newStationResourceLocations != null)
				msgs = ((InternalEObject)newStationResourceLocations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_RESOURCE_LOCATIONS__STATION_RESOURCE_LOCATIONS, null, msgs);
			msgs = basicSetStationResourceLocations(newStationResourceLocations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_RESOURCE_LOCATIONS__STATION_RESOURCE_LOCATIONS, newStationResourceLocations, newStationResourceLocations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainResourceLocations getTrainResourceLocations() {
		return trainResourceLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrainResourceLocations(TrainResourceLocations newTrainResourceLocations, NotificationChain msgs) {
		TrainResourceLocations oldTrainResourceLocations = trainResourceLocations;
		trainResourceLocations = newTrainResourceLocations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_RESOURCE_LOCATIONS__TRAIN_RESOURCE_LOCATIONS, oldTrainResourceLocations, newTrainResourceLocations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainResourceLocations(TrainResourceLocations newTrainResourceLocations) {
		if (newTrainResourceLocations != trainResourceLocations) {
			NotificationChain msgs = null;
			if (trainResourceLocations != null)
				msgs = ((InternalEObject)trainResourceLocations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_RESOURCE_LOCATIONS__TRAIN_RESOURCE_LOCATIONS, null, msgs);
			if (newTrainResourceLocations != null)
				msgs = ((InternalEObject)newTrainResourceLocations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_RESOURCE_LOCATIONS__TRAIN_RESOURCE_LOCATIONS, null, msgs);
			msgs = basicSetTrainResourceLocations(newTrainResourceLocations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_RESOURCE_LOCATIONS__TRAIN_RESOURCE_LOCATIONS, newTrainResourceLocations, newTrainResourceLocations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.FARE_RESOURCE_LOCATIONS__TRAIN_RESOURCE_LOCATIONS:
				return basicSetTrainResourceLocations(null, msgs);
			case GtmPackage.FARE_RESOURCE_LOCATIONS__STATION_RESOURCE_LOCATIONS:
				return basicSetStationResourceLocations(null, msgs);
			case GtmPackage.FARE_RESOURCE_LOCATIONS__CARRIER_RESOURCE_LOCATIONS:
				return basicSetCarrierResourceLocations(null, msgs);
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
			case GtmPackage.FARE_RESOURCE_LOCATIONS__TRAIN_RESOURCE_LOCATIONS:
				return getTrainResourceLocations();
			case GtmPackage.FARE_RESOURCE_LOCATIONS__STATION_RESOURCE_LOCATIONS:
				return getStationResourceLocations();
			case GtmPackage.FARE_RESOURCE_LOCATIONS__CARRIER_RESOURCE_LOCATIONS:
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
			case GtmPackage.FARE_RESOURCE_LOCATIONS__TRAIN_RESOURCE_LOCATIONS:
				setTrainResourceLocations((TrainResourceLocations)newValue);
				return;
			case GtmPackage.FARE_RESOURCE_LOCATIONS__STATION_RESOURCE_LOCATIONS:
				setStationResourceLocations((StationResourceLocations)newValue);
				return;
			case GtmPackage.FARE_RESOURCE_LOCATIONS__CARRIER_RESOURCE_LOCATIONS:
				setCarrierResourceLocations((CarrierResourceLocations)newValue);
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
			case GtmPackage.FARE_RESOURCE_LOCATIONS__TRAIN_RESOURCE_LOCATIONS:
				setTrainResourceLocations((TrainResourceLocations)null);
				return;
			case GtmPackage.FARE_RESOURCE_LOCATIONS__STATION_RESOURCE_LOCATIONS:
				setStationResourceLocations((StationResourceLocations)null);
				return;
			case GtmPackage.FARE_RESOURCE_LOCATIONS__CARRIER_RESOURCE_LOCATIONS:
				setCarrierResourceLocations((CarrierResourceLocations)null);
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
			case GtmPackage.FARE_RESOURCE_LOCATIONS__TRAIN_RESOURCE_LOCATIONS:
				return trainResourceLocations != null;
			case GtmPackage.FARE_RESOURCE_LOCATIONS__STATION_RESOURCE_LOCATIONS:
				return stationResourceLocations != null;
			case GtmPackage.FARE_RESOURCE_LOCATIONS__CARRIER_RESOURCE_LOCATIONS:
				return carrierResourceLocations != null;
		}
		return super.eIsSet(featureID);
	}

} //FareResourceLocationsImpl
