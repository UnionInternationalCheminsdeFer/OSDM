/**
 */
package Gtm.impl;

import Gtm.Carrier;
import Gtm.CarrierResourceLocation;
import Gtm.GtmPackage;
import Gtm.OnlineResource;
import Gtm.ServiceBrand;

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
 * An implementation of the model object '<em><b>Carrier Resource Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.CarrierResourceLocationImpl#getCarrier <em>Carrier</em>}</li>
 *   <li>{@link Gtm.impl.CarrierResourceLocationImpl#getServiceBrand <em>Service Brand</em>}</li>
 *   <li>{@link Gtm.impl.CarrierResourceLocationImpl#getOnlineResources <em>Online Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarrierResourceLocationImpl extends MinimalEObjectImpl.Container implements CarrierResourceLocation {
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
	 * The cached value of the '{@link #getServiceBrand() <em>Service Brand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceBrand()
	 * @generated
	 * @ordered
	 */
	protected ServiceBrand serviceBrand;

	/**
	 * The cached value of the '{@link #getOnlineResources() <em>Online Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnlineResources()
	 * @generated
	 * @ordered
	 */
	protected EList<OnlineResource> onlineResources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarrierResourceLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.CARRIER_RESOURCE_LOCATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.CARRIER_RESOURCE_LOCATION__CARRIER, oldCarrier, carrier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CARRIER_RESOURCE_LOCATION__CARRIER, oldCarrier, carrier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBrand getServiceBrand() {
		if (serviceBrand != null && serviceBrand.eIsProxy()) {
			InternalEObject oldServiceBrand = (InternalEObject)serviceBrand;
			serviceBrand = (ServiceBrand)eResolveProxy(oldServiceBrand);
			if (serviceBrand != oldServiceBrand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.CARRIER_RESOURCE_LOCATION__SERVICE_BRAND, oldServiceBrand, serviceBrand));
			}
		}
		return serviceBrand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBrand basicGetServiceBrand() {
		return serviceBrand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceBrand(ServiceBrand newServiceBrand) {
		ServiceBrand oldServiceBrand = serviceBrand;
		serviceBrand = newServiceBrand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CARRIER_RESOURCE_LOCATION__SERVICE_BRAND, oldServiceBrand, serviceBrand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OnlineResource> getOnlineResources() {
		if (onlineResources == null) {
			onlineResources = new EObjectContainmentEList<OnlineResource>(OnlineResource.class, this, GtmPackage.CARRIER_RESOURCE_LOCATION__ONLINE_RESOURCES);
		}
		return onlineResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.CARRIER_RESOURCE_LOCATION__ONLINE_RESOURCES:
				return ((InternalEList<?>)getOnlineResources()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.CARRIER_RESOURCE_LOCATION__CARRIER:
				if (resolve) return getCarrier();
				return basicGetCarrier();
			case GtmPackage.CARRIER_RESOURCE_LOCATION__SERVICE_BRAND:
				if (resolve) return getServiceBrand();
				return basicGetServiceBrand();
			case GtmPackage.CARRIER_RESOURCE_LOCATION__ONLINE_RESOURCES:
				return getOnlineResources();
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
			case GtmPackage.CARRIER_RESOURCE_LOCATION__CARRIER:
				setCarrier((Carrier)newValue);
				return;
			case GtmPackage.CARRIER_RESOURCE_LOCATION__SERVICE_BRAND:
				setServiceBrand((ServiceBrand)newValue);
				return;
			case GtmPackage.CARRIER_RESOURCE_LOCATION__ONLINE_RESOURCES:
				getOnlineResources().clear();
				getOnlineResources().addAll((Collection<? extends OnlineResource>)newValue);
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
			case GtmPackage.CARRIER_RESOURCE_LOCATION__CARRIER:
				setCarrier((Carrier)null);
				return;
			case GtmPackage.CARRIER_RESOURCE_LOCATION__SERVICE_BRAND:
				setServiceBrand((ServiceBrand)null);
				return;
			case GtmPackage.CARRIER_RESOURCE_LOCATION__ONLINE_RESOURCES:
				getOnlineResources().clear();
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
			case GtmPackage.CARRIER_RESOURCE_LOCATION__CARRIER:
				return carrier != null;
			case GtmPackage.CARRIER_RESOURCE_LOCATION__SERVICE_BRAND:
				return serviceBrand != null;
			case GtmPackage.CARRIER_RESOURCE_LOCATION__ONLINE_RESOURCES:
				return onlineResources != null && !onlineResources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CarrierResourceLocationImpl
