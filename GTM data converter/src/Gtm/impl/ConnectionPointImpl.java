/**
 */
package Gtm.impl;

import Gtm.ConnectionPoint;
import Gtm.DataSource;
import Gtm.GtmPackage;
import Gtm.StationSet;
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
 * An implementation of the model object '<em><b>Connection Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.ConnectionPointImpl#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.impl.ConnectionPointImpl#getName <em>Name</em>}</li>
 *   <li>{@link Gtm.impl.ConnectionPointImpl#getLegacyBorderPointCode <em>Legacy Border Point Code</em>}</li>
 *   <li>{@link Gtm.impl.ConnectionPointImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Gtm.impl.ConnectionPointImpl#getConnectedStationSets <em>Connected Station Sets</em>}</li>
 *   <li>{@link Gtm.impl.ConnectionPointImpl#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link Gtm.impl.ConnectionPointImpl#getNameUtf8 <em>Name Utf8</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionPointImpl extends MinimalEObjectImpl.Container implements ConnectionPoint {
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
	 * The default value of the '{@link #getLegacyBorderPointCode() <em>Legacy Border Point Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyBorderPointCode()
	 * @generated
	 * @ordered
	 */
	protected static final int LEGACY_BORDER_POINT_CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLegacyBorderPointCode() <em>Legacy Border Point Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyBorderPointCode()
	 * @generated
	 * @ordered
	 */
	protected int legacyBorderPointCode = LEGACY_BORDER_POINT_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnectedStationSets() <em>Connected Station Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedStationSets()
	 * @generated
	 * @ordered
	 */
	protected EList<StationSet> connectedStationSets;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.CONNECTION_POINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CONNECTION_POINT__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CONNECTION_POINT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLegacyBorderPointCode() {
		return legacyBorderPointCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegacyBorderPointCode(int newLegacyBorderPointCode) {
		int oldLegacyBorderPointCode = legacyBorderPointCode;
		legacyBorderPointCode = newLegacyBorderPointCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CONNECTION_POINT__LEGACY_BORDER_POINT_CODE, oldLegacyBorderPointCode, legacyBorderPointCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CONNECTION_POINT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StationSet> getConnectedStationSets() {
		if (connectedStationSets == null) {
			connectedStationSets = new EObjectContainmentEList<StationSet>(StationSet.class, this, GtmPackage.CONNECTION_POINT__CONNECTED_STATION_SETS);
		}
		return connectedStationSets;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CONNECTION_POINT__DATA_SOURCE, oldDataSource, dataSource));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CONNECTION_POINT__NAME_UTF8, oldNameUtf8, nameUtf8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.CONNECTION_POINT__CONNECTED_STATION_SETS:
				return ((InternalEList<?>)getConnectedStationSets()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.CONNECTION_POINT__ID:
				return getId();
			case GtmPackage.CONNECTION_POINT__NAME:
				return getName();
			case GtmPackage.CONNECTION_POINT__LEGACY_BORDER_POINT_CODE:
				return getLegacyBorderPointCode();
			case GtmPackage.CONNECTION_POINT__DESCRIPTION:
				return getDescription();
			case GtmPackage.CONNECTION_POINT__CONNECTED_STATION_SETS:
				return getConnectedStationSets();
			case GtmPackage.CONNECTION_POINT__DATA_SOURCE:
				return getDataSource();
			case GtmPackage.CONNECTION_POINT__NAME_UTF8:
				return getNameUtf8();
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
			case GtmPackage.CONNECTION_POINT__ID:
				setId((String)newValue);
				return;
			case GtmPackage.CONNECTION_POINT__NAME:
				setName((String)newValue);
				return;
			case GtmPackage.CONNECTION_POINT__LEGACY_BORDER_POINT_CODE:
				setLegacyBorderPointCode((Integer)newValue);
				return;
			case GtmPackage.CONNECTION_POINT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case GtmPackage.CONNECTION_POINT__CONNECTED_STATION_SETS:
				getConnectedStationSets().clear();
				getConnectedStationSets().addAll((Collection<? extends StationSet>)newValue);
				return;
			case GtmPackage.CONNECTION_POINT__DATA_SOURCE:
				setDataSource((DataSource)newValue);
				return;
			case GtmPackage.CONNECTION_POINT__NAME_UTF8:
				setNameUtf8((String)newValue);
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
			case GtmPackage.CONNECTION_POINT__ID:
				setId(ID_EDEFAULT);
				return;
			case GtmPackage.CONNECTION_POINT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GtmPackage.CONNECTION_POINT__LEGACY_BORDER_POINT_CODE:
				setLegacyBorderPointCode(LEGACY_BORDER_POINT_CODE_EDEFAULT);
				return;
			case GtmPackage.CONNECTION_POINT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case GtmPackage.CONNECTION_POINT__CONNECTED_STATION_SETS:
				getConnectedStationSets().clear();
				return;
			case GtmPackage.CONNECTION_POINT__DATA_SOURCE:
				setDataSource(DATA_SOURCE_EDEFAULT);
				return;
			case GtmPackage.CONNECTION_POINT__NAME_UTF8:
				setNameUtf8(NAME_UTF8_EDEFAULT);
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
			case GtmPackage.CONNECTION_POINT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GtmPackage.CONNECTION_POINT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GtmPackage.CONNECTION_POINT__LEGACY_BORDER_POINT_CODE:
				return legacyBorderPointCode != LEGACY_BORDER_POINT_CODE_EDEFAULT;
			case GtmPackage.CONNECTION_POINT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case GtmPackage.CONNECTION_POINT__CONNECTED_STATION_SETS:
				return connectedStationSets != null && !connectedStationSets.isEmpty();
			case GtmPackage.CONNECTION_POINT__DATA_SOURCE:
				return dataSource != DATA_SOURCE_EDEFAULT;
			case GtmPackage.CONNECTION_POINT__NAME_UTF8:
				return NAME_UTF8_EDEFAULT == null ? nameUtf8 != null : !NAME_UTF8_EDEFAULT.equals(nameUtf8);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", LegacyBorderPointCode: ");
		result.append(legacyBorderPointCode);
		result.append(", description: ");
		result.append(description);
		result.append(", dataSource: ");
		result.append(dataSource);
		result.append(", nameUtf8: ");
		result.append(nameUtf8);
		result.append(')');
		return result.toString();
	}

} //ConnectionPointImpl
