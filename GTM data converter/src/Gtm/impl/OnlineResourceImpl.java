/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.InterfaceType;
import Gtm.OfferRequestType;
import Gtm.OnlineResource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Online Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.OnlineResourceImpl#getOfferRequestType <em>Offer Request Type</em>}</li>
 *   <li>{@link Gtm.impl.OnlineResourceImpl#getInterfaceType <em>Interface Type</em>}</li>
 *   <li>{@link Gtm.impl.OnlineResourceImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link Gtm.impl.OnlineResourceImpl#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OnlineResourceImpl extends MinimalEObjectImpl.Container implements OnlineResource {
	/**
	 * The default value of the '{@link #getOfferRequestType() <em>Offer Request Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfferRequestType()
	 * @generated
	 * @ordered
	 */
	protected static final OfferRequestType OFFER_REQUEST_TYPE_EDEFAULT = OfferRequestType.POINT2POINT;

	/**
	 * The cached value of the '{@link #getOfferRequestType() <em>Offer Request Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfferRequestType()
	 * @generated
	 * @ordered
	 */
	protected OfferRequestType offerRequestType = OFFER_REQUEST_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterfaceType() <em>Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceType()
	 * @generated
	 * @ordered
	 */
	protected static final InterfaceType INTERFACE_TYPE_EDEFAULT = InterfaceType.IRS90918_1RESERVATION_BINARY;

	/**
	 * The cached value of the '{@link #getInterfaceType() <em>Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceType()
	 * @generated
	 * @ordered
	 */
	protected InterfaceType interfaceType = INTERFACE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystem() <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected String system = SYSTEM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnlineResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.ONLINE_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OfferRequestType getOfferRequestType() {
		return offerRequestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOfferRequestType(OfferRequestType newOfferRequestType) {
		OfferRequestType oldOfferRequestType = offerRequestType;
		offerRequestType = newOfferRequestType == null ? OFFER_REQUEST_TYPE_EDEFAULT : newOfferRequestType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.ONLINE_RESOURCE__OFFER_REQUEST_TYPE, oldOfferRequestType, offerRequestType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceType getInterfaceType() {
		return interfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceType(InterfaceType newInterfaceType) {
		InterfaceType oldInterfaceType = interfaceType;
		interfaceType = newInterfaceType == null ? INTERFACE_TYPE_EDEFAULT : newInterfaceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.ONLINE_RESOURCE__INTERFACE_TYPE, oldInterfaceType, interfaceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.ONLINE_RESOURCE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(String newSystem) {
		String oldSystem = system;
		system = newSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.ONLINE_RESOURCE__SYSTEM, oldSystem, system));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.ONLINE_RESOURCE__OFFER_REQUEST_TYPE:
				return getOfferRequestType();
			case GtmPackage.ONLINE_RESOURCE__INTERFACE_TYPE:
				return getInterfaceType();
			case GtmPackage.ONLINE_RESOURCE__VERSION:
				return getVersion();
			case GtmPackage.ONLINE_RESOURCE__SYSTEM:
				return getSystem();
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
			case GtmPackage.ONLINE_RESOURCE__OFFER_REQUEST_TYPE:
				setOfferRequestType((OfferRequestType)newValue);
				return;
			case GtmPackage.ONLINE_RESOURCE__INTERFACE_TYPE:
				setInterfaceType((InterfaceType)newValue);
				return;
			case GtmPackage.ONLINE_RESOURCE__VERSION:
				setVersion((String)newValue);
				return;
			case GtmPackage.ONLINE_RESOURCE__SYSTEM:
				setSystem((String)newValue);
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
			case GtmPackage.ONLINE_RESOURCE__OFFER_REQUEST_TYPE:
				setOfferRequestType(OFFER_REQUEST_TYPE_EDEFAULT);
				return;
			case GtmPackage.ONLINE_RESOURCE__INTERFACE_TYPE:
				setInterfaceType(INTERFACE_TYPE_EDEFAULT);
				return;
			case GtmPackage.ONLINE_RESOURCE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case GtmPackage.ONLINE_RESOURCE__SYSTEM:
				setSystem(SYSTEM_EDEFAULT);
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
			case GtmPackage.ONLINE_RESOURCE__OFFER_REQUEST_TYPE:
				return offerRequestType != OFFER_REQUEST_TYPE_EDEFAULT;
			case GtmPackage.ONLINE_RESOURCE__INTERFACE_TYPE:
				return interfaceType != INTERFACE_TYPE_EDEFAULT;
			case GtmPackage.ONLINE_RESOURCE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case GtmPackage.ONLINE_RESOURCE__SYSTEM:
				return SYSTEM_EDEFAULT == null ? system != null : !SYSTEM_EDEFAULT.equals(system);
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
		result.append(" (offerRequestType: ");
		result.append(offerRequestType);
		result.append(", interfaceType: ");
		result.append(interfaceType);
		result.append(", version: ");
		result.append(version);
		result.append(", system: ");
		result.append(system);
		result.append(')');
		return result.toString();
	}

} //OnlineResourceImpl
