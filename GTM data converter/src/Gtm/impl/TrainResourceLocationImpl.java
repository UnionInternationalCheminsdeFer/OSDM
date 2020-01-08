/**
 */
package Gtm.impl;

import Gtm.Carrier;
import Gtm.GtmPackage;
import Gtm.OnlineResource;
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
 * An implementation of the model object '<em><b>Train Resource Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.TrainResourceLocationImpl#getCarrier <em>Carrier</em>}</li>
 *   <li>{@link Gtm.impl.TrainResourceLocationImpl#getOnlineResources <em>Online Resources</em>}</li>
 *   <li>{@link Gtm.impl.TrainResourceLocationImpl#getTrainId <em>Train Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrainResourceLocationImpl extends MinimalEObjectImpl.Container implements TrainResourceLocation {
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
	 * The cached value of the '{@link #getOnlineResources() <em>Online Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnlineResources()
	 * @generated
	 * @ordered
	 */
	protected EList<OnlineResource> onlineResources;

	/**
	 * The default value of the '{@link #getTrainId() <em>Train Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainId()
	 * @generated
	 * @ordered
	 */
	protected static final String TRAIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrainId() <em>Train Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainId()
	 * @generated
	 * @ordered
	 */
	protected String trainId = TRAIN_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrainResourceLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.TRAIN_RESOURCE_LOCATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.TRAIN_RESOURCE_LOCATION__CARRIER, oldCarrier, carrier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TRAIN_RESOURCE_LOCATION__CARRIER, oldCarrier, carrier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OnlineResource> getOnlineResources() {
		if (onlineResources == null) {
			onlineResources = new EObjectContainmentEList<OnlineResource>(OnlineResource.class, this, GtmPackage.TRAIN_RESOURCE_LOCATION__ONLINE_RESOURCES);
		}
		return onlineResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrainId() {
		return trainId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainId(String newTrainId) {
		String oldTrainId = trainId;
		trainId = newTrainId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TRAIN_RESOURCE_LOCATION__TRAIN_ID, oldTrainId, trainId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.TRAIN_RESOURCE_LOCATION__ONLINE_RESOURCES:
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
			case GtmPackage.TRAIN_RESOURCE_LOCATION__CARRIER:
				if (resolve) return getCarrier();
				return basicGetCarrier();
			case GtmPackage.TRAIN_RESOURCE_LOCATION__ONLINE_RESOURCES:
				return getOnlineResources();
			case GtmPackage.TRAIN_RESOURCE_LOCATION__TRAIN_ID:
				return getTrainId();
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
			case GtmPackage.TRAIN_RESOURCE_LOCATION__CARRIER:
				setCarrier((Carrier)newValue);
				return;
			case GtmPackage.TRAIN_RESOURCE_LOCATION__ONLINE_RESOURCES:
				getOnlineResources().clear();
				getOnlineResources().addAll((Collection<? extends OnlineResource>)newValue);
				return;
			case GtmPackage.TRAIN_RESOURCE_LOCATION__TRAIN_ID:
				setTrainId((String)newValue);
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
			case GtmPackage.TRAIN_RESOURCE_LOCATION__CARRIER:
				setCarrier((Carrier)null);
				return;
			case GtmPackage.TRAIN_RESOURCE_LOCATION__ONLINE_RESOURCES:
				getOnlineResources().clear();
				return;
			case GtmPackage.TRAIN_RESOURCE_LOCATION__TRAIN_ID:
				setTrainId(TRAIN_ID_EDEFAULT);
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
			case GtmPackage.TRAIN_RESOURCE_LOCATION__CARRIER:
				return carrier != null;
			case GtmPackage.TRAIN_RESOURCE_LOCATION__ONLINE_RESOURCES:
				return onlineResources != null && !onlineResources.isEmpty();
			case GtmPackage.TRAIN_RESOURCE_LOCATION__TRAIN_ID:
				return TRAIN_ID_EDEFAULT == null ? trainId != null : !TRAIN_ID_EDEFAULT.equals(trainId);
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
		result.append(" (trainId: ");
		result.append(trainId);
		result.append(')');
		return result.toString();
	}

} //TrainResourceLocationImpl
