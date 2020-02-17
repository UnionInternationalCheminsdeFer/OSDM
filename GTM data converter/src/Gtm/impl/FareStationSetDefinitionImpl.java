/**
 */
package Gtm.impl;

import Gtm.Carrier;
import Gtm.DataSource;
import Gtm.FareStationSetDefinition;
import Gtm.GtmPackage;
import Gtm.Station;

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
 * An implementation of the model object '<em><b>Fare Station Set Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.FareStationSetDefinitionImpl#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link Gtm.impl.FareStationSetDefinitionImpl#getCarrier <em>Carrier</em>}</li>
 *   <li>{@link Gtm.impl.FareStationSetDefinitionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link Gtm.impl.FareStationSetDefinitionImpl#getLegacyCode <em>Legacy Code</em>}</li>
 *   <li>{@link Gtm.impl.FareStationSetDefinitionImpl#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.impl.FareStationSetDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link Gtm.impl.FareStationSetDefinitionImpl#getNameUtf8 <em>Name Utf8</em>}</li>
 *   <li>{@link Gtm.impl.FareStationSetDefinitionImpl#getStations <em>Stations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FareStationSetDefinitionImpl extends MinimalEObjectImpl.Container implements FareStationSetDefinition {
	/**
	 * The default value of the '{@link #getDataSource() <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSource()
	 * @generated
	 * @ordered
	 */
	protected static final DataSource DATA_SOURCE_EDEFAULT = DataSource.MANUAL;

	/**
	 * The cached value of the '{@link #getDataSource() <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSource()
	 * @generated
	 * @ordered
	 */
	protected DataSource dataSource = DATA_SOURCE_EDEFAULT;

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
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLegacyCode() <em>Legacy Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyCode()
	 * @generated
	 * @ordered
	 */
	protected static final int LEGACY_CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLegacyCode() <em>Legacy Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyCode()
	 * @generated
	 * @ordered
	 */
	protected int legacyCode = LEGACY_CODE_EDEFAULT;

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
	 * The cached value of the '{@link #getStations() <em>Stations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStations()
	 * @generated
	 * @ordered
	 */
	protected EList<Station> stations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FareStationSetDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.FARE_STATION_SET_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSource getDataSource() {
		return dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSource(DataSource newDataSource) {
		DataSource oldDataSource = dataSource;
		dataSource = newDataSource == null ? DATA_SOURCE_EDEFAULT : newDataSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STATION_SET_DEFINITION__DATA_SOURCE, oldDataSource, dataSource));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_STATION_SET_DEFINITION__CARRIER, oldCarrier, carrier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STATION_SET_DEFINITION__CARRIER, oldCarrier, carrier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STATION_SET_DEFINITION__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLegacyCode() {
		return legacyCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegacyCode(int newLegacyCode) {
		int oldLegacyCode = legacyCode;
		legacyCode = newLegacyCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STATION_SET_DEFINITION__LEGACY_CODE, oldLegacyCode, legacyCode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STATION_SET_DEFINITION__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STATION_SET_DEFINITION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_STATION_SET_DEFINITION__NAME_UTF8, oldNameUtf8, nameUtf8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Station> getStations() {
		if (stations == null) {
			stations = new EObjectResolvingEList<Station>(Station.class, this, GtmPackage.FARE_STATION_SET_DEFINITION__STATIONS);
		}
		return stations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.FARE_STATION_SET_DEFINITION__DATA_SOURCE:
				return getDataSource();
			case GtmPackage.FARE_STATION_SET_DEFINITION__CARRIER:
				if (resolve) return getCarrier();
				return basicGetCarrier();
			case GtmPackage.FARE_STATION_SET_DEFINITION__CODE:
				return getCode();
			case GtmPackage.FARE_STATION_SET_DEFINITION__LEGACY_CODE:
				return getLegacyCode();
			case GtmPackage.FARE_STATION_SET_DEFINITION__ID:
				return getId();
			case GtmPackage.FARE_STATION_SET_DEFINITION__NAME:
				return getName();
			case GtmPackage.FARE_STATION_SET_DEFINITION__NAME_UTF8:
				return getNameUtf8();
			case GtmPackage.FARE_STATION_SET_DEFINITION__STATIONS:
				return getStations();
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
			case GtmPackage.FARE_STATION_SET_DEFINITION__DATA_SOURCE:
				setDataSource((DataSource)newValue);
				return;
			case GtmPackage.FARE_STATION_SET_DEFINITION__CARRIER:
				setCarrier((Carrier)newValue);
				return;
			case GtmPackage.FARE_STATION_SET_DEFINITION__CODE:
				setCode((String)newValue);
				return;
			case GtmPackage.FARE_STATION_SET_DEFINITION__LEGACY_CODE:
				setLegacyCode((Integer)newValue);
				return;
			case GtmPackage.FARE_STATION_SET_DEFINITION__ID:
				setId((String)newValue);
				return;
			case GtmPackage.FARE_STATION_SET_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case GtmPackage.FARE_STATION_SET_DEFINITION__NAME_UTF8:
				setNameUtf8((String)newValue);
				return;
			case GtmPackage.FARE_STATION_SET_DEFINITION__STATIONS:
				getStations().clear();
				getStations().addAll((Collection<? extends Station>)newValue);
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
			case GtmPackage.FARE_STATION_SET_DEFINITION__DATA_SOURCE:
				setDataSource(DATA_SOURCE_EDEFAULT);
				return;
			case GtmPackage.FARE_STATION_SET_DEFINITION__CARRIER:
				setCarrier((Carrier)null);
				return;
			case GtmPackage.FARE_STATION_SET_DEFINITION__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case GtmPackage.FARE_STATION_SET_DEFINITION__LEGACY_CODE:
				setLegacyCode(LEGACY_CODE_EDEFAULT);
				return;
			case GtmPackage.FARE_STATION_SET_DEFINITION__ID:
				setId(ID_EDEFAULT);
				return;
			case GtmPackage.FARE_STATION_SET_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GtmPackage.FARE_STATION_SET_DEFINITION__NAME_UTF8:
				setNameUtf8(NAME_UTF8_EDEFAULT);
				return;
			case GtmPackage.FARE_STATION_SET_DEFINITION__STATIONS:
				getStations().clear();
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
			case GtmPackage.FARE_STATION_SET_DEFINITION__DATA_SOURCE:
				return dataSource != DATA_SOURCE_EDEFAULT;
			case GtmPackage.FARE_STATION_SET_DEFINITION__CARRIER:
				return carrier != null;
			case GtmPackage.FARE_STATION_SET_DEFINITION__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case GtmPackage.FARE_STATION_SET_DEFINITION__LEGACY_CODE:
				return legacyCode != LEGACY_CODE_EDEFAULT;
			case GtmPackage.FARE_STATION_SET_DEFINITION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GtmPackage.FARE_STATION_SET_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GtmPackage.FARE_STATION_SET_DEFINITION__NAME_UTF8:
				return NAME_UTF8_EDEFAULT == null ? nameUtf8 != null : !NAME_UTF8_EDEFAULT.equals(nameUtf8);
			case GtmPackage.FARE_STATION_SET_DEFINITION__STATIONS:
				return stations != null && !stations.isEmpty();
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
		result.append(" (dataSource: ");
		result.append(dataSource);
		result.append(", code: ");
		result.append(code);
		result.append(", legacyCode: ");
		result.append(legacyCode);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", nameUtf8: ");
		result.append(nameUtf8);
		result.append(')');
		return result.toString();
	}

} //FareStationSetDefinitionImpl
