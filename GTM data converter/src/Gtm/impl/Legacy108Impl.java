/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.Legacy108;
import Gtm.LegacyDistanceFare;
import Gtm.LegacyFares;
import Gtm.LegacyRouteFare;
import Gtm.LegacySeries;

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
 * An implementation of the model object '<em><b>Legacy108</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.Legacy108Impl#getCarrier <em>Carrier</em>}</li>
 *   <li>{@link Gtm.impl.Legacy108Impl#getSeries <em>Series</em>}</li>
 *   <li>{@link Gtm.impl.Legacy108Impl#getFares <em>Fares</em>}</li>
 *   <li>{@link Gtm.impl.Legacy108Impl#getDistanceFare <em>Distance Fare</em>}</li>
 *   <li>{@link Gtm.impl.Legacy108Impl#getRouteFare <em>Route Fare</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Legacy108Impl extends MinimalEObjectImpl.Container implements Legacy108 {
	/**
	 * The default value of the '{@link #getCarrier() <em>Carrier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrier()
	 * @generated
	 * @ordered
	 */
	protected static final String CARRIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCarrier() <em>Carrier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrier()
	 * @generated
	 * @ordered
	 */
	protected String carrier = CARRIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSeries() <em>Series</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries()
	 * @generated
	 * @ordered
	 */
	protected EList<LegacySeries> series;

	/**
	 * The cached value of the '{@link #getFares() <em>Fares</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFares()
	 * @generated
	 * @ordered
	 */
	protected EList<LegacyFares> fares;

	/**
	 * The cached value of the '{@link #getDistanceFare() <em>Distance Fare</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceFare()
	 * @generated
	 * @ordered
	 */
	protected EList<LegacyDistanceFare> distanceFare;

	/**
	 * The cached value of the '{@link #getRouteFare() <em>Route Fare</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteFare()
	 * @generated
	 * @ordered
	 */
	protected EList<LegacyRouteFare> routeFare;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Legacy108Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LEGACY108;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCarrier() {
		return carrier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarrier(String newCarrier) {
		String oldCarrier = carrier;
		carrier = newCarrier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY108__CARRIER, oldCarrier, carrier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LegacySeries> getSeries() {
		if (series == null) {
			series = new EObjectContainmentEList<LegacySeries>(LegacySeries.class, this, GtmPackage.LEGACY108__SERIES);
		}
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LegacyFares> getFares() {
		if (fares == null) {
			fares = new EObjectContainmentEList<LegacyFares>(LegacyFares.class, this, GtmPackage.LEGACY108__FARES);
		}
		return fares;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LegacyDistanceFare> getDistanceFare() {
		if (distanceFare == null) {
			distanceFare = new EObjectContainmentEList<LegacyDistanceFare>(LegacyDistanceFare.class, this, GtmPackage.LEGACY108__DISTANCE_FARE);
		}
		return distanceFare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LegacyRouteFare> getRouteFare() {
		if (routeFare == null) {
			routeFare = new EObjectContainmentEList<LegacyRouteFare>(LegacyRouteFare.class, this, GtmPackage.LEGACY108__ROUTE_FARE);
		}
		return routeFare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.LEGACY108__SERIES:
				return ((InternalEList<?>)getSeries()).basicRemove(otherEnd, msgs);
			case GtmPackage.LEGACY108__FARES:
				return ((InternalEList<?>)getFares()).basicRemove(otherEnd, msgs);
			case GtmPackage.LEGACY108__DISTANCE_FARE:
				return ((InternalEList<?>)getDistanceFare()).basicRemove(otherEnd, msgs);
			case GtmPackage.LEGACY108__ROUTE_FARE:
				return ((InternalEList<?>)getRouteFare()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.LEGACY108__CARRIER:
				return getCarrier();
			case GtmPackage.LEGACY108__SERIES:
				return getSeries();
			case GtmPackage.LEGACY108__FARES:
				return getFares();
			case GtmPackage.LEGACY108__DISTANCE_FARE:
				return getDistanceFare();
			case GtmPackage.LEGACY108__ROUTE_FARE:
				return getRouteFare();
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
			case GtmPackage.LEGACY108__CARRIER:
				setCarrier((String)newValue);
				return;
			case GtmPackage.LEGACY108__SERIES:
				getSeries().clear();
				getSeries().addAll((Collection<? extends LegacySeries>)newValue);
				return;
			case GtmPackage.LEGACY108__FARES:
				getFares().clear();
				getFares().addAll((Collection<? extends LegacyFares>)newValue);
				return;
			case GtmPackage.LEGACY108__DISTANCE_FARE:
				getDistanceFare().clear();
				getDistanceFare().addAll((Collection<? extends LegacyDistanceFare>)newValue);
				return;
			case GtmPackage.LEGACY108__ROUTE_FARE:
				getRouteFare().clear();
				getRouteFare().addAll((Collection<? extends LegacyRouteFare>)newValue);
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
			case GtmPackage.LEGACY108__CARRIER:
				setCarrier(CARRIER_EDEFAULT);
				return;
			case GtmPackage.LEGACY108__SERIES:
				getSeries().clear();
				return;
			case GtmPackage.LEGACY108__FARES:
				getFares().clear();
				return;
			case GtmPackage.LEGACY108__DISTANCE_FARE:
				getDistanceFare().clear();
				return;
			case GtmPackage.LEGACY108__ROUTE_FARE:
				getRouteFare().clear();
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
			case GtmPackage.LEGACY108__CARRIER:
				return CARRIER_EDEFAULT == null ? carrier != null : !CARRIER_EDEFAULT.equals(carrier);
			case GtmPackage.LEGACY108__SERIES:
				return series != null && !series.isEmpty();
			case GtmPackage.LEGACY108__FARES:
				return fares != null && !fares.isEmpty();
			case GtmPackage.LEGACY108__DISTANCE_FARE:
				return distanceFare != null && !distanceFare.isEmpty();
			case GtmPackage.LEGACY108__ROUTE_FARE:
				return routeFare != null && !routeFare.isEmpty();
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
		result.append(" (carrier: ");
		result.append(carrier);
		result.append(')');
		return result.toString();
	}

} //Legacy108Impl
