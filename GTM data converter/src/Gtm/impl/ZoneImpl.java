/**
 */
package Gtm.impl;

import Gtm.Carrier;
import Gtm.GtmPackage;
import Gtm.NutsCode;
import Gtm.Station;
import Gtm.Zone;

import Gtm.ZoneDefinition;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.ZoneImpl#getBinaryZoneId <em>Binary Zone Id</em>}</li>
 *   <li>{@link Gtm.impl.ZoneImpl#getCarrier <em>Carrier</em>}</li>
 *   <li>{@link Gtm.impl.ZoneImpl#getEntryStation <em>Entry Station</em>}</li>
 *   <li>{@link Gtm.impl.ZoneImpl#getTerminalStation <em>Terminal Station</em>}</li>
 *   <li>{@link Gtm.impl.ZoneImpl#getNutsCode <em>Nuts Code</em>}</li>
 *   <li>{@link Gtm.impl.ZoneImpl#getCity <em>City</em>}</li>
 *   <li>{@link Gtm.impl.ZoneImpl#getZoneDefinitions <em>Zone Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZoneImpl extends MinimalEObjectImpl.Container implements Zone {
	/**
	 * The default value of the '{@link #getBinaryZoneId() <em>Binary Zone Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryZoneId()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] BINARY_ZONE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBinaryZoneId() <em>Binary Zone Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryZoneId()
	 * @generated
	 * @ordered
	 */
	protected byte[] binaryZoneId = BINARY_ZONE_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getEntryStation() <em>Entry Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryStation()
	 * @generated
	 * @ordered
	 */
	protected Station entryStation;

	/**
	 * The cached value of the '{@link #getTerminalStation() <em>Terminal Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminalStation()
	 * @generated
	 * @ordered
	 */
	protected Station terminalStation;

	/**
	 * The cached value of the '{@link #getNutsCode() <em>Nuts Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutsCode()
	 * @generated
	 * @ordered
	 */
	protected NutsCode nutsCode;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final int CITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected int city = CITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getZoneDefinitions() <em>Zone Definitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoneDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ZoneDefinition> zoneDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.ZONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getBinaryZoneId() {
		return binaryZoneId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinaryZoneId(byte[] newBinaryZoneId) {
		byte[] oldBinaryZoneId = binaryZoneId;
		binaryZoneId = newBinaryZoneId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.ZONE__BINARY_ZONE_ID, oldBinaryZoneId, binaryZoneId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.ZONE__CARRIER, oldCarrier, carrier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.ZONE__CARRIER, oldCarrier, carrier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station getEntryStation() {
		if (entryStation != null && entryStation.eIsProxy()) {
			InternalEObject oldEntryStation = (InternalEObject)entryStation;
			entryStation = (Station)eResolveProxy(oldEntryStation);
			if (entryStation != oldEntryStation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.ZONE__ENTRY_STATION, oldEntryStation, entryStation));
			}
		}
		return entryStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station basicGetEntryStation() {
		return entryStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryStation(Station newEntryStation) {
		Station oldEntryStation = entryStation;
		entryStation = newEntryStation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.ZONE__ENTRY_STATION, oldEntryStation, entryStation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station getTerminalStation() {
		if (terminalStation != null && terminalStation.eIsProxy()) {
			InternalEObject oldTerminalStation = (InternalEObject)terminalStation;
			terminalStation = (Station)eResolveProxy(oldTerminalStation);
			if (terminalStation != oldTerminalStation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.ZONE__TERMINAL_STATION, oldTerminalStation, terminalStation));
			}
		}
		return terminalStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station basicGetTerminalStation() {
		return terminalStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminalStation(Station newTerminalStation) {
		Station oldTerminalStation = terminalStation;
		terminalStation = newTerminalStation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.ZONE__TERMINAL_STATION, oldTerminalStation, terminalStation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutsCode getNutsCode() {
		if (nutsCode != null && nutsCode.eIsProxy()) {
			InternalEObject oldNutsCode = (InternalEObject)nutsCode;
			nutsCode = (NutsCode)eResolveProxy(oldNutsCode);
			if (nutsCode != oldNutsCode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.ZONE__NUTS_CODE, oldNutsCode, nutsCode));
			}
		}
		return nutsCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutsCode basicGetNutsCode() {
		return nutsCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNutsCode(NutsCode newNutsCode) {
		NutsCode oldNutsCode = nutsCode;
		nutsCode = newNutsCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.ZONE__NUTS_CODE, oldNutsCode, nutsCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(int newCity) {
		int oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.ZONE__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ZoneDefinition> getZoneDefinitions() {
		if (zoneDefinitions == null) {
			zoneDefinitions = new EObjectResolvingEList<ZoneDefinition>(ZoneDefinition.class, this, GtmPackage.ZONE__ZONE_DEFINITIONS);
		}
		return zoneDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.ZONE__BINARY_ZONE_ID:
				return getBinaryZoneId();
			case GtmPackage.ZONE__CARRIER:
				if (resolve) return getCarrier();
				return basicGetCarrier();
			case GtmPackage.ZONE__ENTRY_STATION:
				if (resolve) return getEntryStation();
				return basicGetEntryStation();
			case GtmPackage.ZONE__TERMINAL_STATION:
				if (resolve) return getTerminalStation();
				return basicGetTerminalStation();
			case GtmPackage.ZONE__NUTS_CODE:
				if (resolve) return getNutsCode();
				return basicGetNutsCode();
			case GtmPackage.ZONE__CITY:
				return getCity();
			case GtmPackage.ZONE__ZONE_DEFINITIONS:
				return getZoneDefinitions();
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
			case GtmPackage.ZONE__BINARY_ZONE_ID:
				setBinaryZoneId((byte[])newValue);
				return;
			case GtmPackage.ZONE__CARRIER:
				setCarrier((Carrier)newValue);
				return;
			case GtmPackage.ZONE__ENTRY_STATION:
				setEntryStation((Station)newValue);
				return;
			case GtmPackage.ZONE__TERMINAL_STATION:
				setTerminalStation((Station)newValue);
				return;
			case GtmPackage.ZONE__NUTS_CODE:
				setNutsCode((NutsCode)newValue);
				return;
			case GtmPackage.ZONE__CITY:
				setCity((Integer)newValue);
				return;
			case GtmPackage.ZONE__ZONE_DEFINITIONS:
				getZoneDefinitions().clear();
				getZoneDefinitions().addAll((Collection<? extends ZoneDefinition>)newValue);
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
			case GtmPackage.ZONE__BINARY_ZONE_ID:
				setBinaryZoneId(BINARY_ZONE_ID_EDEFAULT);
				return;
			case GtmPackage.ZONE__CARRIER:
				setCarrier((Carrier)null);
				return;
			case GtmPackage.ZONE__ENTRY_STATION:
				setEntryStation((Station)null);
				return;
			case GtmPackage.ZONE__TERMINAL_STATION:
				setTerminalStation((Station)null);
				return;
			case GtmPackage.ZONE__NUTS_CODE:
				setNutsCode((NutsCode)null);
				return;
			case GtmPackage.ZONE__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case GtmPackage.ZONE__ZONE_DEFINITIONS:
				getZoneDefinitions().clear();
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
			case GtmPackage.ZONE__BINARY_ZONE_ID:
				return BINARY_ZONE_ID_EDEFAULT == null ? binaryZoneId != null : !BINARY_ZONE_ID_EDEFAULT.equals(binaryZoneId);
			case GtmPackage.ZONE__CARRIER:
				return carrier != null;
			case GtmPackage.ZONE__ENTRY_STATION:
				return entryStation != null;
			case GtmPackage.ZONE__TERMINAL_STATION:
				return terminalStation != null;
			case GtmPackage.ZONE__NUTS_CODE:
				return nutsCode != null;
			case GtmPackage.ZONE__CITY:
				return city != CITY_EDEFAULT;
			case GtmPackage.ZONE__ZONE_DEFINITIONS:
				return zoneDefinitions != null && !zoneDefinitions.isEmpty();
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
		result.append(" (binaryZoneId: ");
		result.append(binaryZoneId);
		result.append(", city: ");
		result.append(city);
		result.append(')');
		return result.toString();
	}

} //ZoneImpl
