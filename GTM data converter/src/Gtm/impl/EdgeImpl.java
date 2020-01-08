/**
 */
package Gtm.impl;

import Gtm.Edge;
import Gtm.GeoSystem;
import Gtm.GeoUnit;
import Gtm.GtmPackage;
import Gtm.HemisphereEW;
import Gtm.HemisphereNS;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.EdgeImpl#getSystem <em>System</em>}</li>
 *   <li>{@link Gtm.impl.EdgeImpl#getEastWest <em>East West</em>}</li>
 *   <li>{@link Gtm.impl.EdgeImpl#getNorthSouth <em>North South</em>}</li>
 *   <li>{@link Gtm.impl.EdgeImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link Gtm.impl.EdgeImpl#getAccuracy <em>Accuracy</em>}</li>
 *   <li>{@link Gtm.impl.EdgeImpl#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link Gtm.impl.EdgeImpl#getLatitude <em>Latitude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeImpl extends MinimalEObjectImpl.Container implements Edge {
	/**
	 * The default value of the '{@link #getSystem() <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected static final GeoSystem SYSTEM_EDEFAULT = GeoSystem.WGS84;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected GeoSystem system = SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getEastWest() <em>East West</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEastWest()
	 * @generated
	 * @ordered
	 */
	protected static final HemisphereEW EAST_WEST_EDEFAULT = HemisphereEW.EAST;

	/**
	 * The cached value of the '{@link #getEastWest() <em>East West</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEastWest()
	 * @generated
	 * @ordered
	 */
	protected HemisphereEW eastWest = EAST_WEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getNorthSouth() <em>North South</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNorthSouth()
	 * @generated
	 * @ordered
	 */
	protected static final HemisphereNS NORTH_SOUTH_EDEFAULT = HemisphereNS.NORTH;

	/**
	 * The cached value of the '{@link #getNorthSouth() <em>North South</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNorthSouth()
	 * @generated
	 * @ordered
	 */
	protected HemisphereNS northSouth = NORTH_SOUTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final GeoUnit UNIT_EDEFAULT = GeoUnit.MICRO_DEGREE;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected GeoUnit unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccuracy() <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuracy()
	 * @generated
	 * @ordered
	 */
	protected static final GeoUnit ACCURACY_EDEFAULT = GeoUnit.MICRO_DEGREE;

	/**
	 * The cached value of the '{@link #getAccuracy() <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuracy()
	 * @generated
	 * @ordered
	 */
	protected GeoUnit accuracy = ACCURACY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected static final long LONGITUDE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected long longitude = LONGITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected static final long LATITUDE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected long latitude = LATITUDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoSystem getSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(GeoSystem newSystem) {
		GeoSystem oldSystem = system;
		system = newSystem == null ? SYSTEM_EDEFAULT : newSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.EDGE__SYSTEM, oldSystem, system));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HemisphereEW getEastWest() {
		return eastWest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEastWest(HemisphereEW newEastWest) {
		HemisphereEW oldEastWest = eastWest;
		eastWest = newEastWest == null ? EAST_WEST_EDEFAULT : newEastWest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.EDGE__EAST_WEST, oldEastWest, eastWest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HemisphereNS getNorthSouth() {
		return northSouth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNorthSouth(HemisphereNS newNorthSouth) {
		HemisphereNS oldNorthSouth = northSouth;
		northSouth = newNorthSouth == null ? NORTH_SOUTH_EDEFAULT : newNorthSouth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.EDGE__NORTH_SOUTH, oldNorthSouth, northSouth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoUnit getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(GeoUnit newUnit) {
		GeoUnit oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.EDGE__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoUnit getAccuracy() {
		return accuracy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccuracy(GeoUnit newAccuracy) {
		GeoUnit oldAccuracy = accuracy;
		accuracy = newAccuracy == null ? ACCURACY_EDEFAULT : newAccuracy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.EDGE__ACCURACY, oldAccuracy, accuracy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLongitude() {
		return longitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitude(long newLongitude) {
		long oldLongitude = longitude;
		longitude = newLongitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.EDGE__LONGITUDE, oldLongitude, longitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLatitude() {
		return latitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatitude(long newLatitude) {
		long oldLatitude = latitude;
		latitude = newLatitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.EDGE__LATITUDE, oldLatitude, latitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.EDGE__SYSTEM:
				return getSystem();
			case GtmPackage.EDGE__EAST_WEST:
				return getEastWest();
			case GtmPackage.EDGE__NORTH_SOUTH:
				return getNorthSouth();
			case GtmPackage.EDGE__UNIT:
				return getUnit();
			case GtmPackage.EDGE__ACCURACY:
				return getAccuracy();
			case GtmPackage.EDGE__LONGITUDE:
				return getLongitude();
			case GtmPackage.EDGE__LATITUDE:
				return getLatitude();
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
			case GtmPackage.EDGE__SYSTEM:
				setSystem((GeoSystem)newValue);
				return;
			case GtmPackage.EDGE__EAST_WEST:
				setEastWest((HemisphereEW)newValue);
				return;
			case GtmPackage.EDGE__NORTH_SOUTH:
				setNorthSouth((HemisphereNS)newValue);
				return;
			case GtmPackage.EDGE__UNIT:
				setUnit((GeoUnit)newValue);
				return;
			case GtmPackage.EDGE__ACCURACY:
				setAccuracy((GeoUnit)newValue);
				return;
			case GtmPackage.EDGE__LONGITUDE:
				setLongitude((Long)newValue);
				return;
			case GtmPackage.EDGE__LATITUDE:
				setLatitude((Long)newValue);
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
			case GtmPackage.EDGE__SYSTEM:
				setSystem(SYSTEM_EDEFAULT);
				return;
			case GtmPackage.EDGE__EAST_WEST:
				setEastWest(EAST_WEST_EDEFAULT);
				return;
			case GtmPackage.EDGE__NORTH_SOUTH:
				setNorthSouth(NORTH_SOUTH_EDEFAULT);
				return;
			case GtmPackage.EDGE__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case GtmPackage.EDGE__ACCURACY:
				setAccuracy(ACCURACY_EDEFAULT);
				return;
			case GtmPackage.EDGE__LONGITUDE:
				setLongitude(LONGITUDE_EDEFAULT);
				return;
			case GtmPackage.EDGE__LATITUDE:
				setLatitude(LATITUDE_EDEFAULT);
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
			case GtmPackage.EDGE__SYSTEM:
				return system != SYSTEM_EDEFAULT;
			case GtmPackage.EDGE__EAST_WEST:
				return eastWest != EAST_WEST_EDEFAULT;
			case GtmPackage.EDGE__NORTH_SOUTH:
				return northSouth != NORTH_SOUTH_EDEFAULT;
			case GtmPackage.EDGE__UNIT:
				return unit != UNIT_EDEFAULT;
			case GtmPackage.EDGE__ACCURACY:
				return accuracy != ACCURACY_EDEFAULT;
			case GtmPackage.EDGE__LONGITUDE:
				return longitude != LONGITUDE_EDEFAULT;
			case GtmPackage.EDGE__LATITUDE:
				return latitude != LATITUDE_EDEFAULT;
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
		result.append(" (system: ");
		result.append(system);
		result.append(", eastWest: ");
		result.append(eastWest);
		result.append(", northSouth: ");
		result.append(northSouth);
		result.append(", unit: ");
		result.append(unit);
		result.append(", accuracy: ");
		result.append(accuracy);
		result.append(", longitude: ");
		result.append(longitude);
		result.append(", latitude: ");
		result.append(latitude);
		result.append(')');
		return result.toString();
	}

} //EdgeImpl
