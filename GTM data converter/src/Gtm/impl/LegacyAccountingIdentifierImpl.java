/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.LegacyAccountingIdentifier;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legacy Accounting Identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.LegacyAccountingIdentifierImpl#getSeriesId <em>Series Id</em>}</li>
 *   <li>{@link Gtm.impl.LegacyAccountingIdentifierImpl#getTariffId <em>Tariff Id</em>}</li>
 *   <li>{@link Gtm.impl.LegacyAccountingIdentifierImpl#getAddSeriesId <em>Add Series Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegacyAccountingIdentifierImpl extends MinimalEObjectImpl.Container implements LegacyAccountingIdentifier {
	/**
	 * The default value of the '{@link #getSeriesId() <em>Series Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesId()
	 * @generated
	 * @ordered
	 */
	protected static final int SERIES_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeriesId() <em>Series Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesId()
	 * @generated
	 * @ordered
	 */
	protected int seriesId = SERIES_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTariffId() <em>Tariff Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTariffId()
	 * @generated
	 * @ordered
	 */
	protected static final int TARIFF_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTariffId() <em>Tariff Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTariffId()
	 * @generated
	 * @ordered
	 */
	protected int tariffId = TARIFF_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddSeriesId() <em>Add Series Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddSeriesId()
	 * @generated
	 * @ordered
	 */
	protected static final int ADD_SERIES_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAddSeriesId() <em>Add Series Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddSeriesId()
	 * @generated
	 * @ordered
	 */
	protected int addSeriesId = ADD_SERIES_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyAccountingIdentifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LEGACY_ACCOUNTING_IDENTIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeriesId() {
		return seriesId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeriesId(int newSeriesId) {
		int oldSeriesId = seriesId;
		seriesId = newSeriesId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_ACCOUNTING_IDENTIFIER__SERIES_ID, oldSeriesId, seriesId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTariffId() {
		return tariffId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTariffId(int newTariffId) {
		int oldTariffId = tariffId;
		tariffId = newTariffId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_ACCOUNTING_IDENTIFIER__TARIFF_ID, oldTariffId, tariffId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAddSeriesId() {
		return addSeriesId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddSeriesId(int newAddSeriesId) {
		int oldAddSeriesId = addSeriesId;
		addSeriesId = newAddSeriesId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_ACCOUNTING_IDENTIFIER__ADD_SERIES_ID, oldAddSeriesId, addSeriesId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.LEGACY_ACCOUNTING_IDENTIFIER__SERIES_ID:
				return getSeriesId();
			case GtmPackage.LEGACY_ACCOUNTING_IDENTIFIER__TARIFF_ID:
				return getTariffId();
			case GtmPackage.LEGACY_ACCOUNTING_IDENTIFIER__ADD_SERIES_ID:
				return getAddSeriesId();
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
			case GtmPackage.LEGACY_ACCOUNTING_IDENTIFIER__SERIES_ID:
				setSeriesId((Integer)newValue);
				return;
			case GtmPackage.LEGACY_ACCOUNTING_IDENTIFIER__TARIFF_ID:
				setTariffId((Integer)newValue);
				return;
			case GtmPackage.LEGACY_ACCOUNTING_IDENTIFIER__ADD_SERIES_ID:
				setAddSeriesId((Integer)newValue);
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
			case GtmPackage.LEGACY_ACCOUNTING_IDENTIFIER__SERIES_ID:
				setSeriesId(SERIES_ID_EDEFAULT);
				return;
			case GtmPackage.LEGACY_ACCOUNTING_IDENTIFIER__TARIFF_ID:
				setTariffId(TARIFF_ID_EDEFAULT);
				return;
			case GtmPackage.LEGACY_ACCOUNTING_IDENTIFIER__ADD_SERIES_ID:
				setAddSeriesId(ADD_SERIES_ID_EDEFAULT);
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
			case GtmPackage.LEGACY_ACCOUNTING_IDENTIFIER__SERIES_ID:
				return seriesId != SERIES_ID_EDEFAULT;
			case GtmPackage.LEGACY_ACCOUNTING_IDENTIFIER__TARIFF_ID:
				return tariffId != TARIFF_ID_EDEFAULT;
			case GtmPackage.LEGACY_ACCOUNTING_IDENTIFIER__ADD_SERIES_ID:
				return addSeriesId != ADD_SERIES_ID_EDEFAULT;
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
		result.append(" (seriesId: ");
		result.append(seriesId);
		result.append(", tariffId: ");
		result.append(tariffId);
		result.append(", addSeriesId: ");
		result.append(addSeriesId);
		result.append(')');
		return result.toString();
	}

} //LegacyAccountingIdentifierImpl
