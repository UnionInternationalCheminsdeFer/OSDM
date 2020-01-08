/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.ReservationBerthType;
import Gtm.ReservationParams9181;
import Gtm.ReservationService;
import Gtm.ReservationServiceLevel;
import Gtm.ReservationTravelClass;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reservation Params9181</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.ReservationParams9181Impl#getTravelClass <em>Travel Class</em>}</li>
 *   <li>{@link Gtm.impl.ReservationParams9181Impl#getServiceLevel <em>Service Level</em>}</li>
 *   <li>{@link Gtm.impl.ReservationParams9181Impl#getService <em>Service</em>}</li>
 *   <li>{@link Gtm.impl.ReservationParams9181Impl#getBerthType <em>Berth Type</em>}</li>
 *   <li>{@link Gtm.impl.ReservationParams9181Impl#getCoachType <em>Coach Type</em>}</li>
 *   <li>{@link Gtm.impl.ReservationParams9181Impl#getCompartmentType <em>Compartment Type</em>}</li>
 *   <li>{@link Gtm.impl.ReservationParams9181Impl#getTariff <em>Tariff</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReservationParams9181Impl extends MinimalEObjectImpl.Container implements ReservationParams9181 {
	/**
	 * The default value of the '{@link #getTravelClass() <em>Travel Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelClass()
	 * @generated
	 * @ordered
	 */
	protected static final ReservationTravelClass TRAVEL_CLASS_EDEFAULT = ReservationTravelClass.FIRST;

	/**
	 * The cached value of the '{@link #getTravelClass() <em>Travel Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelClass()
	 * @generated
	 * @ordered
	 */
	protected ReservationTravelClass travelClass = TRAVEL_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceLevel() <em>Service Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLevel()
	 * @generated
	 * @ordered
	 */
	protected static final ReservationServiceLevel SERVICE_LEVEL_EDEFAULT = ReservationServiceLevel.A;

	/**
	 * The cached value of the '{@link #getServiceLevel() <em>Service Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLevel()
	 * @generated
	 * @ordered
	 */
	protected ReservationServiceLevel serviceLevel = SERVICE_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getService() <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected static final ReservationService SERVICE_EDEFAULT = ReservationService.SEAT;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected ReservationService service = SERVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBerthType() <em>Berth Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBerthType()
	 * @generated
	 * @ordered
	 */
	protected static final ReservationBerthType BERTH_TYPE_EDEFAULT = ReservationBerthType.SINGLE;

	/**
	 * The cached value of the '{@link #getBerthType() <em>Berth Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBerthType()
	 * @generated
	 * @ordered
	 */
	protected ReservationBerthType berthType = BERTH_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoachType() <em>Coach Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoachType()
	 * @generated
	 * @ordered
	 */
	protected static final int COACH_TYPE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCoachType() <em>Coach Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoachType()
	 * @generated
	 * @ordered
	 */
	protected int coachType = COACH_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompartmentType() <em>Compartment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartmentType()
	 * @generated
	 * @ordered
	 */
	protected static final int COMPARTMENT_TYPE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCompartmentType() <em>Compartment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartmentType()
	 * @generated
	 * @ordered
	 */
	protected int compartmentType = COMPARTMENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTariff() <em>Tariff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTariff()
	 * @generated
	 * @ordered
	 */
	protected static final int TARIFF_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTariff() <em>Tariff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTariff()
	 * @generated
	 * @ordered
	 */
	protected int tariff = TARIFF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReservationParams9181Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.RESERVATION_PARAMS9181;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationTravelClass getTravelClass() {
		return travelClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTravelClass(ReservationTravelClass newTravelClass) {
		ReservationTravelClass oldTravelClass = travelClass;
		travelClass = newTravelClass == null ? TRAVEL_CLASS_EDEFAULT : newTravelClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.RESERVATION_PARAMS9181__TRAVEL_CLASS, oldTravelClass, travelClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationServiceLevel getServiceLevel() {
		return serviceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceLevel(ReservationServiceLevel newServiceLevel) {
		ReservationServiceLevel oldServiceLevel = serviceLevel;
		serviceLevel = newServiceLevel == null ? SERVICE_LEVEL_EDEFAULT : newServiceLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.RESERVATION_PARAMS9181__SERVICE_LEVEL, oldServiceLevel, serviceLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationService getService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(ReservationService newService) {
		ReservationService oldService = service;
		service = newService == null ? SERVICE_EDEFAULT : newService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.RESERVATION_PARAMS9181__SERVICE, oldService, service));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationBerthType getBerthType() {
		return berthType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBerthType(ReservationBerthType newBerthType) {
		ReservationBerthType oldBerthType = berthType;
		berthType = newBerthType == null ? BERTH_TYPE_EDEFAULT : newBerthType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.RESERVATION_PARAMS9181__BERTH_TYPE, oldBerthType, berthType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCoachType() {
		return coachType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoachType(int newCoachType) {
		int oldCoachType = coachType;
		coachType = newCoachType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.RESERVATION_PARAMS9181__COACH_TYPE, oldCoachType, coachType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCompartmentType() {
		return compartmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompartmentType(int newCompartmentType) {
		int oldCompartmentType = compartmentType;
		compartmentType = newCompartmentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.RESERVATION_PARAMS9181__COMPARTMENT_TYPE, oldCompartmentType, compartmentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTariff() {
		return tariff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTariff(int newTariff) {
		int oldTariff = tariff;
		tariff = newTariff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.RESERVATION_PARAMS9181__TARIFF, oldTariff, tariff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.RESERVATION_PARAMS9181__TRAVEL_CLASS:
				return getTravelClass();
			case GtmPackage.RESERVATION_PARAMS9181__SERVICE_LEVEL:
				return getServiceLevel();
			case GtmPackage.RESERVATION_PARAMS9181__SERVICE:
				return getService();
			case GtmPackage.RESERVATION_PARAMS9181__BERTH_TYPE:
				return getBerthType();
			case GtmPackage.RESERVATION_PARAMS9181__COACH_TYPE:
				return getCoachType();
			case GtmPackage.RESERVATION_PARAMS9181__COMPARTMENT_TYPE:
				return getCompartmentType();
			case GtmPackage.RESERVATION_PARAMS9181__TARIFF:
				return getTariff();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GtmPackage.RESERVATION_PARAMS9181__TRAVEL_CLASS:
				setTravelClass((ReservationTravelClass)newValue);
				return;
			case GtmPackage.RESERVATION_PARAMS9181__SERVICE_LEVEL:
				setServiceLevel((ReservationServiceLevel)newValue);
				return;
			case GtmPackage.RESERVATION_PARAMS9181__SERVICE:
				setService((ReservationService)newValue);
				return;
			case GtmPackage.RESERVATION_PARAMS9181__BERTH_TYPE:
				setBerthType((ReservationBerthType)newValue);
				return;
			case GtmPackage.RESERVATION_PARAMS9181__COACH_TYPE:
				setCoachType((Integer)newValue);
				return;
			case GtmPackage.RESERVATION_PARAMS9181__COMPARTMENT_TYPE:
				setCompartmentType((Integer)newValue);
				return;
			case GtmPackage.RESERVATION_PARAMS9181__TARIFF:
				setTariff((Integer)newValue);
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
			case GtmPackage.RESERVATION_PARAMS9181__TRAVEL_CLASS:
				setTravelClass(TRAVEL_CLASS_EDEFAULT);
				return;
			case GtmPackage.RESERVATION_PARAMS9181__SERVICE_LEVEL:
				setServiceLevel(SERVICE_LEVEL_EDEFAULT);
				return;
			case GtmPackage.RESERVATION_PARAMS9181__SERVICE:
				setService(SERVICE_EDEFAULT);
				return;
			case GtmPackage.RESERVATION_PARAMS9181__BERTH_TYPE:
				setBerthType(BERTH_TYPE_EDEFAULT);
				return;
			case GtmPackage.RESERVATION_PARAMS9181__COACH_TYPE:
				setCoachType(COACH_TYPE_EDEFAULT);
				return;
			case GtmPackage.RESERVATION_PARAMS9181__COMPARTMENT_TYPE:
				setCompartmentType(COMPARTMENT_TYPE_EDEFAULT);
				return;
			case GtmPackage.RESERVATION_PARAMS9181__TARIFF:
				setTariff(TARIFF_EDEFAULT);
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
			case GtmPackage.RESERVATION_PARAMS9181__TRAVEL_CLASS:
				return travelClass != TRAVEL_CLASS_EDEFAULT;
			case GtmPackage.RESERVATION_PARAMS9181__SERVICE_LEVEL:
				return serviceLevel != SERVICE_LEVEL_EDEFAULT;
			case GtmPackage.RESERVATION_PARAMS9181__SERVICE:
				return service != SERVICE_EDEFAULT;
			case GtmPackage.RESERVATION_PARAMS9181__BERTH_TYPE:
				return berthType != BERTH_TYPE_EDEFAULT;
			case GtmPackage.RESERVATION_PARAMS9181__COACH_TYPE:
				return coachType != COACH_TYPE_EDEFAULT;
			case GtmPackage.RESERVATION_PARAMS9181__COMPARTMENT_TYPE:
				return compartmentType != COMPARTMENT_TYPE_EDEFAULT;
			case GtmPackage.RESERVATION_PARAMS9181__TARIFF:
				return tariff != TARIFF_EDEFAULT;
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
		result.append(" (travelClass: ");
		result.append(travelClass);
		result.append(", serviceLevel: ");
		result.append(serviceLevel);
		result.append(", service: ");
		result.append(service);
		result.append(", berthType: ");
		result.append(berthType);
		result.append(", coachType: ");
		result.append(coachType);
		result.append(", compartmentType: ");
		result.append(compartmentType);
		result.append(", tariff: ");
		result.append(tariff);
		result.append(')');
		return result.toString();
	}

} //ReservationParams9181Impl
