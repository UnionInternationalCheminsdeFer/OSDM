/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.Station;
import Gtm.ZoneDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link Gtm.impl.ZoneDefinitionImpl#getZoneId <em>Zone Id</em>}</li>
 *   <li>{@link Gtm.impl.ZoneDefinitionImpl#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.impl.ZoneDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link Gtm.impl.ZoneDefinitionImpl#getStations <em>Stations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZoneDefinitionImpl extends MinimalEObjectImpl.Container implements ZoneDefinition {
	/**
	 * The default value of the '{@link #getZoneId() <em>Zone Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoneId()
	 * @generated
	 * @ordered
	 */
	protected static final int ZONE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getZoneId() <em>Zone Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoneId()
	 * @generated
	 * @ordered
	 */
	protected int zoneId = ZONE_ID_EDEFAULT;

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
	public int getZoneId() {
		return zoneId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZoneId(int newZoneId) {
		int oldZoneId = zoneId;
		zoneId = newZoneId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.ZONE_DEFINITION__ZONE_ID, oldZoneId, zoneId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.ZONE_DEFINITION__ID, oldId, id));
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
	public EList<Station> getStations() {
		if (stations == null) {
			stations = new EObjectResolvingEList<Station>(Station.class, this, GtmPackage.ZONE_DEFINITION__STATIONS);
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
			case GtmPackage.ZONE_DEFINITION__ZONE_ID:
				return getZoneId();
			case GtmPackage.ZONE_DEFINITION__ID:
				return getId();
			case GtmPackage.ZONE_DEFINITION__NAME:
				return getName();
			case GtmPackage.ZONE_DEFINITION__STATIONS:
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
			case GtmPackage.ZONE_DEFINITION__ZONE_ID:
				setZoneId((Integer)newValue);
				return;
			case GtmPackage.ZONE_DEFINITION__ID:
				setId((String)newValue);
				return;
			case GtmPackage.ZONE_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case GtmPackage.ZONE_DEFINITION__STATIONS:
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
			case GtmPackage.ZONE_DEFINITION__ZONE_ID:
				setZoneId(ZONE_ID_EDEFAULT);
				return;
			case GtmPackage.ZONE_DEFINITION__ID:
				setId(ID_EDEFAULT);
				return;
			case GtmPackage.ZONE_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GtmPackage.ZONE_DEFINITION__STATIONS:
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
			case GtmPackage.ZONE_DEFINITION__ZONE_ID:
				return zoneId != ZONE_ID_EDEFAULT;
			case GtmPackage.ZONE_DEFINITION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GtmPackage.ZONE_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GtmPackage.ZONE_DEFINITION__STATIONS:
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
		result.append(" (zoneId: ");
		result.append(zoneId);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ZoneDefinitionImpl
