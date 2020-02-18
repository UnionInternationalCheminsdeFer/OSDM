/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.Legacy108Station;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legacy108 Station</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.Legacy108StationImpl#getName <em>Name</em>}</li>
 *   <li>{@link Gtm.impl.Legacy108StationImpl#getBorderPointCode <em>Border Point Code</em>}</li>
 *   <li>{@link Gtm.impl.Legacy108StationImpl#getNameUTF8 <em>Name UTF8</em>}</li>
 *   <li>{@link Gtm.impl.Legacy108StationImpl#getStationCode <em>Station Code</em>}</li>
 *   <li>{@link Gtm.impl.Legacy108StationImpl#getFareReferenceStationCode <em>Fare Reference Station Code</em>}</li>
 *   <li>{@link Gtm.impl.Legacy108StationImpl#getShortName <em>Short Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Legacy108StationImpl extends MinimalEObjectImpl.Container implements Legacy108Station {
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
	 * The default value of the '{@link #getBorderPointCode() <em>Border Point Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderPointCode()
	 * @generated
	 * @ordered
	 */
	protected static final int BORDER_POINT_CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBorderPointCode() <em>Border Point Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderPointCode()
	 * @generated
	 * @ordered
	 */
	protected int borderPointCode = BORDER_POINT_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameUTF8() <em>Name UTF8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameUTF8()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_UTF8_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameUTF8() <em>Name UTF8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameUTF8()
	 * @generated
	 * @ordered
	 */
	protected String nameUTF8 = NAME_UTF8_EDEFAULT;

	/**
	 * The default value of the '{@link #getStationCode() <em>Station Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStationCode()
	 * @generated
	 * @ordered
	 */
	protected static final int STATION_CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStationCode() <em>Station Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStationCode()
	 * @generated
	 * @ordered
	 */
	protected int stationCode = STATION_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFareReferenceStationCode() <em>Fare Reference Station Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFareReferenceStationCode()
	 * @generated
	 * @ordered
	 */
	protected static final int FARE_REFERENCE_STATION_CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFareReferenceStationCode() <em>Fare Reference Station Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFareReferenceStationCode()
	 * @generated
	 * @ordered
	 */
	protected int fareReferenceStationCode = FARE_REFERENCE_STATION_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected String shortName = SHORT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Legacy108StationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LEGACY108_STATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY108_STATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBorderPointCode() {
		return borderPointCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderPointCode(int newBorderPointCode) {
		int oldBorderPointCode = borderPointCode;
		borderPointCode = newBorderPointCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY108_STATION__BORDER_POINT_CODE, oldBorderPointCode, borderPointCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameUTF8() {
		return nameUTF8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameUTF8(String newNameUTF8) {
		String oldNameUTF8 = nameUTF8;
		nameUTF8 = newNameUTF8;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY108_STATION__NAME_UTF8, oldNameUTF8, nameUTF8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStationCode() {
		return stationCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStationCode(int newStationCode) {
		int oldStationCode = stationCode;
		stationCode = newStationCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY108_STATION__STATION_CODE, oldStationCode, stationCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFareReferenceStationCode() {
		return fareReferenceStationCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFareReferenceStationCode(int newFareReferenceStationCode) {
		int oldFareReferenceStationCode = fareReferenceStationCode;
		fareReferenceStationCode = newFareReferenceStationCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY108_STATION__FARE_REFERENCE_STATION_CODE, oldFareReferenceStationCode, fareReferenceStationCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortName(String newShortName) {
		String oldShortName = shortName;
		shortName = newShortName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY108_STATION__SHORT_NAME, oldShortName, shortName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.LEGACY108_STATION__NAME:
				return getName();
			case GtmPackage.LEGACY108_STATION__BORDER_POINT_CODE:
				return getBorderPointCode();
			case GtmPackage.LEGACY108_STATION__NAME_UTF8:
				return getNameUTF8();
			case GtmPackage.LEGACY108_STATION__STATION_CODE:
				return getStationCode();
			case GtmPackage.LEGACY108_STATION__FARE_REFERENCE_STATION_CODE:
				return getFareReferenceStationCode();
			case GtmPackage.LEGACY108_STATION__SHORT_NAME:
				return getShortName();
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
			case GtmPackage.LEGACY108_STATION__NAME:
				setName((String)newValue);
				return;
			case GtmPackage.LEGACY108_STATION__BORDER_POINT_CODE:
				setBorderPointCode((Integer)newValue);
				return;
			case GtmPackage.LEGACY108_STATION__NAME_UTF8:
				setNameUTF8((String)newValue);
				return;
			case GtmPackage.LEGACY108_STATION__STATION_CODE:
				setStationCode((Integer)newValue);
				return;
			case GtmPackage.LEGACY108_STATION__FARE_REFERENCE_STATION_CODE:
				setFareReferenceStationCode((Integer)newValue);
				return;
			case GtmPackage.LEGACY108_STATION__SHORT_NAME:
				setShortName((String)newValue);
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
			case GtmPackage.LEGACY108_STATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GtmPackage.LEGACY108_STATION__BORDER_POINT_CODE:
				setBorderPointCode(BORDER_POINT_CODE_EDEFAULT);
				return;
			case GtmPackage.LEGACY108_STATION__NAME_UTF8:
				setNameUTF8(NAME_UTF8_EDEFAULT);
				return;
			case GtmPackage.LEGACY108_STATION__STATION_CODE:
				setStationCode(STATION_CODE_EDEFAULT);
				return;
			case GtmPackage.LEGACY108_STATION__FARE_REFERENCE_STATION_CODE:
				setFareReferenceStationCode(FARE_REFERENCE_STATION_CODE_EDEFAULT);
				return;
			case GtmPackage.LEGACY108_STATION__SHORT_NAME:
				setShortName(SHORT_NAME_EDEFAULT);
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
			case GtmPackage.LEGACY108_STATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GtmPackage.LEGACY108_STATION__BORDER_POINT_CODE:
				return borderPointCode != BORDER_POINT_CODE_EDEFAULT;
			case GtmPackage.LEGACY108_STATION__NAME_UTF8:
				return NAME_UTF8_EDEFAULT == null ? nameUTF8 != null : !NAME_UTF8_EDEFAULT.equals(nameUTF8);
			case GtmPackage.LEGACY108_STATION__STATION_CODE:
				return stationCode != STATION_CODE_EDEFAULT;
			case GtmPackage.LEGACY108_STATION__FARE_REFERENCE_STATION_CODE:
				return fareReferenceStationCode != FARE_REFERENCE_STATION_CODE_EDEFAULT;
			case GtmPackage.LEGACY108_STATION__SHORT_NAME:
				return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", borderPointCode: ");
		result.append(borderPointCode);
		result.append(", nameUTF8: ");
		result.append(nameUTF8);
		result.append(", stationCode: ");
		result.append(stationCode);
		result.append(", fareReferenceStationCode: ");
		result.append(fareReferenceStationCode);
		result.append(", shortName: ");
		result.append(shortName);
		result.append(')');
		return result.toString();
	}

} //Legacy108StationImpl
