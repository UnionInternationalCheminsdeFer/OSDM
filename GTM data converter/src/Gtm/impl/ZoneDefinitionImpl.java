/**
 */
package Gtm.impl;

import Gtm.Carrier;
import Gtm.GtmPackage;
import Gtm.NutsCode;
import Gtm.Polygone;
import Gtm.StationSet;
import Gtm.ZoneDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zone Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.ZoneDefinitionImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link Gtm.impl.ZoneDefinitionImpl#getZoneId <em>Zone Id</em>}</li>
 *   <li>{@link Gtm.impl.ZoneDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link Gtm.impl.ZoneDefinitionImpl#getPolygone <em>Polygone</em>}</li>
 *   <li>{@link Gtm.impl.ZoneDefinitionImpl#getNameUtf8 <em>Name Utf8</em>}</li>
 *   <li>{@link Gtm.impl.ZoneDefinitionImpl#getStationSet <em>Station Set</em>}</li>
 *   <li>{@link Gtm.impl.ZoneDefinitionImpl#getNutsCodes <em>Nuts Codes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZoneDefinitionImpl extends MinimalEObjectImpl.Container implements ZoneDefinition {
	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected Carrier provider;

	/**
	 * The default value of the '{@link #getZoneId() <em>Zone Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoneId()
	 * @generated
	 * @ordered
	 */
	protected static final String ZONE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZoneId() <em>Zone Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoneId()
	 * @generated
	 * @ordered
	 */
	protected String zoneId = ZONE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPolygone() <em>Polygone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolygone()
	 * @generated
	 * @ordered
	 */
	protected Polygone polygone;

	/**
	 * The default value of the '{@link #getNameUtf8() <em>Name Utf8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameUtf8()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_UTF8_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameUtf8() <em>Name Utf8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameUtf8()
	 * @generated
	 * @ordered
	 */
	protected String nameUtf8 = NAME_UTF8_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStationSet() <em>Station Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStationSet()
	 * @generated
	 * @ordered
	 */
	protected StationSet stationSet;

	/**
	 * The cached value of the '{@link #getNutsCodes() <em>Nuts Codes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutsCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<NutsCode> nutsCodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZoneDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.ZONE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carrier getProvider() {
		if (provider != null && provider.eIsProxy()) {
			InternalEObject oldProvider = (InternalEObject)provider;
			provider = (Carrier)eResolveProxy(oldProvider);
			if (provider != oldProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.ZONE_DEFINITION__PROVIDER, oldProvider, provider));
			}
		}
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carrier basicGetProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(Carrier newProvider) {
		Carrier oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.ZONE_DEFINITION__PROVIDER, oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZoneId() {
		return zoneId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZoneId(String newZoneId) {
		String oldZoneId = zoneId;
		zoneId = newZoneId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.ZONE_DEFINITION__ZONE_ID, oldZoneId, zoneId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.ZONE_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Polygone getPolygone() {
		return polygone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolygone(Polygone newPolygone, NotificationChain msgs) {
		Polygone oldPolygone = polygone;
		polygone = newPolygone;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.ZONE_DEFINITION__POLYGONE, oldPolygone, newPolygone);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolygone(Polygone newPolygone) {
		if (newPolygone != polygone) {
			NotificationChain msgs = null;
			if (polygone != null)
				msgs = ((InternalEObject)polygone).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.ZONE_DEFINITION__POLYGONE, null, msgs);
			if (newPolygone != null)
				msgs = ((InternalEObject)newPolygone).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.ZONE_DEFINITION__POLYGONE, null, msgs);
			msgs = basicSetPolygone(newPolygone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.ZONE_DEFINITION__POLYGONE, newPolygone, newPolygone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameUtf8() {
		return nameUtf8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameUtf8(String newNameUtf8) {
		String oldNameUtf8 = nameUtf8;
		nameUtf8 = newNameUtf8;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.ZONE_DEFINITION__NAME_UTF8, oldNameUtf8, nameUtf8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationSet getStationSet() {
		return stationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStationSet(StationSet newStationSet, NotificationChain msgs) {
		StationSet oldStationSet = stationSet;
		stationSet = newStationSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.ZONE_DEFINITION__STATION_SET, oldStationSet, newStationSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStationSet(StationSet newStationSet) {
		if (newStationSet != stationSet) {
			NotificationChain msgs = null;
			if (stationSet != null)
				msgs = ((InternalEObject)stationSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.ZONE_DEFINITION__STATION_SET, null, msgs);
			if (newStationSet != null)
				msgs = ((InternalEObject)newStationSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.ZONE_DEFINITION__STATION_SET, null, msgs);
			msgs = basicSetStationSet(newStationSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.ZONE_DEFINITION__STATION_SET, newStationSet, newStationSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NutsCode> getNutsCodes() {
		if (nutsCodes == null) {
			nutsCodes = new EObjectResolvingEList<NutsCode>(NutsCode.class, this, GtmPackage.ZONE_DEFINITION__NUTS_CODES);
		}
		return nutsCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.ZONE_DEFINITION__POLYGONE:
				return basicSetPolygone(null, msgs);
			case GtmPackage.ZONE_DEFINITION__STATION_SET:
				return basicSetStationSet(null, msgs);
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
			case GtmPackage.ZONE_DEFINITION__PROVIDER:
				if (resolve) return getProvider();
				return basicGetProvider();
			case GtmPackage.ZONE_DEFINITION__ZONE_ID:
				return getZoneId();
			case GtmPackage.ZONE_DEFINITION__NAME:
				return getName();
			case GtmPackage.ZONE_DEFINITION__POLYGONE:
				return getPolygone();
			case GtmPackage.ZONE_DEFINITION__NAME_UTF8:
				return getNameUtf8();
			case GtmPackage.ZONE_DEFINITION__STATION_SET:
				return getStationSet();
			case GtmPackage.ZONE_DEFINITION__NUTS_CODES:
				return getNutsCodes();
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
			case GtmPackage.ZONE_DEFINITION__PROVIDER:
				setProvider((Carrier)newValue);
				return;
			case GtmPackage.ZONE_DEFINITION__ZONE_ID:
				setZoneId((String)newValue);
				return;
			case GtmPackage.ZONE_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case GtmPackage.ZONE_DEFINITION__POLYGONE:
				setPolygone((Polygone)newValue);
				return;
			case GtmPackage.ZONE_DEFINITION__NAME_UTF8:
				setNameUtf8((String)newValue);
				return;
			case GtmPackage.ZONE_DEFINITION__STATION_SET:
				setStationSet((StationSet)newValue);
				return;
			case GtmPackage.ZONE_DEFINITION__NUTS_CODES:
				getNutsCodes().clear();
				getNutsCodes().addAll((Collection<? extends NutsCode>)newValue);
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
			case GtmPackage.ZONE_DEFINITION__PROVIDER:
				setProvider((Carrier)null);
				return;
			case GtmPackage.ZONE_DEFINITION__ZONE_ID:
				setZoneId(ZONE_ID_EDEFAULT);
				return;
			case GtmPackage.ZONE_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GtmPackage.ZONE_DEFINITION__POLYGONE:
				setPolygone((Polygone)null);
				return;
			case GtmPackage.ZONE_DEFINITION__NAME_UTF8:
				setNameUtf8(NAME_UTF8_EDEFAULT);
				return;
			case GtmPackage.ZONE_DEFINITION__STATION_SET:
				setStationSet((StationSet)null);
				return;
			case GtmPackage.ZONE_DEFINITION__NUTS_CODES:
				getNutsCodes().clear();
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
			case GtmPackage.ZONE_DEFINITION__PROVIDER:
				return provider != null;
			case GtmPackage.ZONE_DEFINITION__ZONE_ID:
				return ZONE_ID_EDEFAULT == null ? zoneId != null : !ZONE_ID_EDEFAULT.equals(zoneId);
			case GtmPackage.ZONE_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GtmPackage.ZONE_DEFINITION__POLYGONE:
				return polygone != null;
			case GtmPackage.ZONE_DEFINITION__NAME_UTF8:
				return NAME_UTF8_EDEFAULT == null ? nameUtf8 != null : !NAME_UTF8_EDEFAULT.equals(nameUtf8);
			case GtmPackage.ZONE_DEFINITION__STATION_SET:
				return stationSet != null;
			case GtmPackage.ZONE_DEFINITION__NUTS_CODES:
				return nutsCodes != null && !nutsCodes.isEmpty();
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
		result.append(" (zoneId: ");
		result.append(zoneId);
		result.append(", name: ");
		result.append(name);
		result.append(", nameUtf8: ");
		result.append(nameUtf8);
		result.append(')');
		return result.toString();
	}

} //ZoneDefinitionImpl
