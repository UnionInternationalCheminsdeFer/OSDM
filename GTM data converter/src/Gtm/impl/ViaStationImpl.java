/**
 */
package Gtm.impl;

import Gtm.AlternativeRoute;
import Gtm.Carrier;
import Gtm.FareStationSetDefinition;
import Gtm.GtmPackage;
import Gtm.Route;
import Gtm.Station;
import Gtm.ViaStation;

import java.lang.reflect.InvocationTargetException;
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
 * An implementation of the model object '<em><b>Via Station</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.ViaStationImpl#getStation <em>Station</em>}</li>
 *   <li>{@link Gtm.impl.ViaStationImpl#getCarrier <em>Carrier</em>}</li>
 *   <li>{@link Gtm.impl.ViaStationImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link Gtm.impl.ViaStationImpl#getAlternativeRoutes <em>Alternative Routes</em>}</li>
 *   <li>{@link Gtm.impl.ViaStationImpl#getDataDescription <em>Data Description</em>}</li>
 *   <li>{@link Gtm.impl.ViaStationImpl#getFareStationSet <em>Fare Station Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViaStationImpl extends MinimalEObjectImpl.Container implements ViaStation {
	/**
	 * The cached value of the '{@link #getStation() <em>Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStation()
	 * @generated
	 * @ordered
	 */
	protected Station station;

	/**
	 * The cached value of the '{@link #getCarrier() <em>Carrier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrier()
	 * @generated
	 * @ordered
	 */
	protected Carrier carrier;

	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected Route route;

	/**
	 * The cached value of the '{@link #getAlternativeRoutes() <em>Alternative Routes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeRoutes()
	 * @generated
	 * @ordered
	 */
	protected EList<AlternativeRoute> alternativeRoutes;

	/**
	 * The default value of the '{@link #getDataDescription() <em>Data Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataDescription() <em>Data Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataDescription()
	 * @generated
	 * @ordered
	 */
	protected String dataDescription = DATA_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFareStationSet() <em>Fare Station Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFareStationSet()
	 * @generated
	 * @ordered
	 */
	protected FareStationSetDefinition fareStationSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViaStationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.VIA_STATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station getStation() {
		if (station != null && station.eIsProxy()) {
			InternalEObject oldStation = (InternalEObject)station;
			station = (Station)eResolveProxy(oldStation);
			if (station != oldStation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.VIA_STATION__STATION, oldStation, station));
			}
		}
		return station;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station basicGetStation() {
		return station;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStation(Station newStation) {
		Station oldStation = station;
		station = newStation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.VIA_STATION__STATION, oldStation, station));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route getRoute() {
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoute(Route newRoute, NotificationChain msgs) {
		Route oldRoute = route;
		route = newRoute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.VIA_STATION__ROUTE, oldRoute, newRoute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoute(Route newRoute) {
		if (newRoute != route) {
			NotificationChain msgs = null;
			if (route != null)
				msgs = ((InternalEObject)route).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.VIA_STATION__ROUTE, null, msgs);
			if (newRoute != null)
				msgs = ((InternalEObject)newRoute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.VIA_STATION__ROUTE, null, msgs);
			msgs = basicSetRoute(newRoute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.VIA_STATION__ROUTE, newRoute, newRoute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlternativeRoute> getAlternativeRoutes() {
		if (alternativeRoutes == null) {
			alternativeRoutes = new EObjectContainmentEList<AlternativeRoute>(AlternativeRoute.class, this, GtmPackage.VIA_STATION__ALTERNATIVE_ROUTES);
		}
		return alternativeRoutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataDescription() {
		return dataDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataDescription(String newDataDescription) {
		String oldDataDescription = dataDescription;
		dataDescription = newDataDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.VIA_STATION__DATA_DESCRIPTION, oldDataDescription, dataDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FareStationSetDefinition getFareStationSet() {
		if (fareStationSet != null && fareStationSet.eIsProxy()) {
			InternalEObject oldFareStationSet = (InternalEObject)fareStationSet;
			fareStationSet = (FareStationSetDefinition)eResolveProxy(oldFareStationSet);
			if (fareStationSet != oldFareStationSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.VIA_STATION__FARE_STATION_SET, oldFareStationSet, fareStationSet));
			}
		}
		return fareStationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FareStationSetDefinition basicGetFareStationSet() {
		return fareStationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFareStationSet(FareStationSetDefinition newFareStationSet) {
		FareStationSetDefinition oldFareStationSet = fareStationSet;
		fareStationSet = newFareStationSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.VIA_STATION__FARE_STATION_SET, oldFareStationSet, fareStationSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carrier getCarrier() {
		if (carrier != null && carrier.eIsProxy()) {
			InternalEObject oldCarrier = (InternalEObject)carrier;
			carrier = (Carrier)eResolveProxy(oldCarrier);
			if (carrier != oldCarrier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.VIA_STATION__CARRIER, oldCarrier, carrier));
			}
		}
		return carrier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carrier basicGetCarrier() {
		return carrier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarrier(Carrier newCarrier) {
		Carrier oldCarrier = carrier;
		carrier = newCarrier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.VIA_STATION__CARRIER, oldCarrier, carrier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getDescription() {
		
		if (this.getStation()!= null) return this.getStation().getName();
		
		StringBuilder label = new StringBuilder();
		
		if (this.getRoute()!= null && this.getRoute().getStations() != null && !this.getRoute().getStations().isEmpty() ) {
			
			for (ViaStation station : this.getRoute().getStations()) {
				
				if (station.getStation()!= null) {
					if (label.length() == 0) {
						label.append(station.getStation().getName());
					} else {
						label.append("*").append(station.getStation().getName());
					}
				}
			}
			return label.toString();
		}
			
		if (this.getAlternativeRoutes()!= null && !this.getAlternativeRoutes().isEmpty()) {
			label.append("(");
			for (AlternativeRoute route : this.getAlternativeRoutes() ) {
				if (label.length() > 1) {
					label.append("/");
				}
				String routeLable ="";
				for (ViaStation via :  route.getStations()) {
					if (routeLable.length() == 0) {
						label.append(via.getDescription());
					} else {
						label.append("*").append(via.getDescription());
					}
				}
			}
			label.append(")");
			
		}
			
		
		return label.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.VIA_STATION__ROUTE:
				return basicSetRoute(null, msgs);
			case GtmPackage.VIA_STATION__ALTERNATIVE_ROUTES:
				return ((InternalEList<?>)getAlternativeRoutes()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.VIA_STATION__STATION:
				if (resolve) return getStation();
				return basicGetStation();
			case GtmPackage.VIA_STATION__CARRIER:
				if (resolve) return getCarrier();
				return basicGetCarrier();
			case GtmPackage.VIA_STATION__ROUTE:
				return getRoute();
			case GtmPackage.VIA_STATION__ALTERNATIVE_ROUTES:
				return getAlternativeRoutes();
			case GtmPackage.VIA_STATION__DATA_DESCRIPTION:
				return getDataDescription();
			case GtmPackage.VIA_STATION__FARE_STATION_SET:
				if (resolve) return getFareStationSet();
				return basicGetFareStationSet();
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
			case GtmPackage.VIA_STATION__STATION:
				setStation((Station)newValue);
				return;
			case GtmPackage.VIA_STATION__CARRIER:
				setCarrier((Carrier)newValue);
				return;
			case GtmPackage.VIA_STATION__ROUTE:
				setRoute((Route)newValue);
				return;
			case GtmPackage.VIA_STATION__ALTERNATIVE_ROUTES:
				getAlternativeRoutes().clear();
				getAlternativeRoutes().addAll((Collection<? extends AlternativeRoute>)newValue);
				return;
			case GtmPackage.VIA_STATION__DATA_DESCRIPTION:
				setDataDescription((String)newValue);
				return;
			case GtmPackage.VIA_STATION__FARE_STATION_SET:
				setFareStationSet((FareStationSetDefinition)newValue);
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
			case GtmPackage.VIA_STATION__STATION:
				setStation((Station)null);
				return;
			case GtmPackage.VIA_STATION__CARRIER:
				setCarrier((Carrier)null);
				return;
			case GtmPackage.VIA_STATION__ROUTE:
				setRoute((Route)null);
				return;
			case GtmPackage.VIA_STATION__ALTERNATIVE_ROUTES:
				getAlternativeRoutes().clear();
				return;
			case GtmPackage.VIA_STATION__DATA_DESCRIPTION:
				setDataDescription(DATA_DESCRIPTION_EDEFAULT);
				return;
			case GtmPackage.VIA_STATION__FARE_STATION_SET:
				setFareStationSet((FareStationSetDefinition)null);
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
			case GtmPackage.VIA_STATION__STATION:
				return station != null;
			case GtmPackage.VIA_STATION__CARRIER:
				return carrier != null;
			case GtmPackage.VIA_STATION__ROUTE:
				return route != null;
			case GtmPackage.VIA_STATION__ALTERNATIVE_ROUTES:
				return alternativeRoutes != null && !alternativeRoutes.isEmpty();
			case GtmPackage.VIA_STATION__DATA_DESCRIPTION:
				return DATA_DESCRIPTION_EDEFAULT == null ? dataDescription != null : !DATA_DESCRIPTION_EDEFAULT.equals(dataDescription);
			case GtmPackage.VIA_STATION__FARE_STATION_SET:
				return fareStationSet != null;
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
			case GtmPackage.VIA_STATION___GET_DESCRIPTION:
				return getDescription();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (dataDescription: ");
		result.append(dataDescription);
		result.append(')');
		return result.toString();
	}

} //ViaStationImpl
