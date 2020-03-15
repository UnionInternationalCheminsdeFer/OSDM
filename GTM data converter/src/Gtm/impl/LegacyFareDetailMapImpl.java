/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.LegacyFareDetailMap;
import Gtm.StationFareDetailType;
import Gtm.Text;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legacy Fare Detail Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.LegacyFareDetailMapImpl#getLegacyCode <em>Legacy Code</em>}</li>
 *   <li>{@link Gtm.impl.LegacyFareDetailMapImpl#getFareDetailDescription <em>Fare Detail Description</em>}</li>
 *   <li>{@link Gtm.impl.LegacyFareDetailMapImpl#getFareDetailMappingType <em>Fare Detail Mapping Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegacyFareDetailMapImpl extends MinimalEObjectImpl.Container implements LegacyFareDetailMap {
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
	 * The cached value of the '{@link #getFareDetailDescription() <em>Fare Detail Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFareDetailDescription()
	 * @generated
	 * @ordered
	 */
	protected Text fareDetailDescription;

	/**
	 * The default value of the '{@link #getFareDetailMappingType() <em>Fare Detail Mapping Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFareDetailMappingType()
	 * @generated
	 * @ordered
	 */
	protected static final StationFareDetailType FARE_DETAIL_MAPPING_TYPE_EDEFAULT = StationFareDetailType.NO_DESCRIPTION;

	/**
	 * The cached value of the '{@link #getFareDetailMappingType() <em>Fare Detail Mapping Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFareDetailMappingType()
	 * @generated
	 * @ordered
	 */
	protected StationFareDetailType fareDetailMappingType = FARE_DETAIL_MAPPING_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyFareDetailMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LEGACY_FARE_DETAIL_MAP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_FARE_DETAIL_MAP__LEGACY_CODE, oldLegacyCode, legacyCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text getFareDetailDescription() {
		if (fareDetailDescription != null && fareDetailDescription.eIsProxy()) {
			InternalEObject oldFareDetailDescription = (InternalEObject)fareDetailDescription;
			fareDetailDescription = (Text)eResolveProxy(oldFareDetailDescription);
			if (fareDetailDescription != oldFareDetailDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.LEGACY_FARE_DETAIL_MAP__FARE_DETAIL_DESCRIPTION, oldFareDetailDescription, fareDetailDescription));
			}
		}
		return fareDetailDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text basicGetFareDetailDescription() {
		return fareDetailDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFareDetailDescription(Text newFareDetailDescription) {
		Text oldFareDetailDescription = fareDetailDescription;
		fareDetailDescription = newFareDetailDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_FARE_DETAIL_MAP__FARE_DETAIL_DESCRIPTION, oldFareDetailDescription, fareDetailDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationFareDetailType getFareDetailMappingType() {
		return fareDetailMappingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFareDetailMappingType(StationFareDetailType newFareDetailMappingType) {
		StationFareDetailType oldFareDetailMappingType = fareDetailMappingType;
		fareDetailMappingType = newFareDetailMappingType == null ? FARE_DETAIL_MAPPING_TYPE_EDEFAULT : newFareDetailMappingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_FARE_DETAIL_MAP__FARE_DETAIL_MAPPING_TYPE, oldFareDetailMappingType, fareDetailMappingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.LEGACY_FARE_DETAIL_MAP__LEGACY_CODE:
				return getLegacyCode();
			case GtmPackage.LEGACY_FARE_DETAIL_MAP__FARE_DETAIL_DESCRIPTION:
				if (resolve) return getFareDetailDescription();
				return basicGetFareDetailDescription();
			case GtmPackage.LEGACY_FARE_DETAIL_MAP__FARE_DETAIL_MAPPING_TYPE:
				return getFareDetailMappingType();
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
			case GtmPackage.LEGACY_FARE_DETAIL_MAP__LEGACY_CODE:
				setLegacyCode((Integer)newValue);
				return;
			case GtmPackage.LEGACY_FARE_DETAIL_MAP__FARE_DETAIL_DESCRIPTION:
				setFareDetailDescription((Text)newValue);
				return;
			case GtmPackage.LEGACY_FARE_DETAIL_MAP__FARE_DETAIL_MAPPING_TYPE:
				setFareDetailMappingType((StationFareDetailType)newValue);
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
			case GtmPackage.LEGACY_FARE_DETAIL_MAP__LEGACY_CODE:
				setLegacyCode(LEGACY_CODE_EDEFAULT);
				return;
			case GtmPackage.LEGACY_FARE_DETAIL_MAP__FARE_DETAIL_DESCRIPTION:
				setFareDetailDescription((Text)null);
				return;
			case GtmPackage.LEGACY_FARE_DETAIL_MAP__FARE_DETAIL_MAPPING_TYPE:
				setFareDetailMappingType(FARE_DETAIL_MAPPING_TYPE_EDEFAULT);
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
			case GtmPackage.LEGACY_FARE_DETAIL_MAP__LEGACY_CODE:
				return legacyCode != LEGACY_CODE_EDEFAULT;
			case GtmPackage.LEGACY_FARE_DETAIL_MAP__FARE_DETAIL_DESCRIPTION:
				return fareDetailDescription != null;
			case GtmPackage.LEGACY_FARE_DETAIL_MAP__FARE_DETAIL_MAPPING_TYPE:
				return fareDetailMappingType != FARE_DETAIL_MAPPING_TYPE_EDEFAULT;
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
		result.append(" (legacyCode: ");
		result.append(legacyCode);
		result.append(", fareDetailMappingType: ");
		result.append(fareDetailMappingType);
		result.append(')');
		return result.toString();
	}

} //LegacyFareDetailMapImpl
