/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.LegacySeparateContractSeries;

import Gtm.LegacySeries;
import java.util.Date;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legacy Separate Contract Series</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.LegacySeparateContractSeriesImpl#getSeriesNumber <em>Series Number</em>}</li>
 *   <li>{@link Gtm.impl.LegacySeparateContractSeriesImpl#getValidFrom <em>Valid From</em>}</li>
 *   <li>{@link Gtm.impl.LegacySeparateContractSeriesImpl#getValidUntil <em>Valid Until</em>}</li>
 *   <li>{@link Gtm.impl.LegacySeparateContractSeriesImpl#getSeries <em>Series</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegacySeparateContractSeriesImpl extends MinimalEObjectImpl.Container implements LegacySeparateContractSeries {
	/**
	 * The default value of the '{@link #getSeriesNumber() <em>Series Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int SERIES_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeriesNumber() <em>Series Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesNumber()
	 * @generated
	 * @ordered
	 */
	protected int seriesNumber = SERIES_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidFrom() <em>Valid From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFrom()
	 * @generated
	 * @ordered
	 */
	protected static final Date VALID_FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidFrom() <em>Valid From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFrom()
	 * @generated
	 * @ordered
	 */
	protected Date validFrom = VALID_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidUntil() <em>Valid Until</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidUntil()
	 * @generated
	 * @ordered
	 */
	protected static final Date VALID_UNTIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidUntil() <em>Valid Until</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidUntil()
	 * @generated
	 * @ordered
	 */
	protected Date validUntil = VALID_UNTIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSeries() <em>Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries()
	 * @generated
	 * @ordered
	 */
	protected LegacySeries series;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacySeparateContractSeriesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LEGACY_SEPARATE_CONTRACT_SERIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeriesNumber() {
		return seriesNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeriesNumber(int newSeriesNumber) {
		int oldSeriesNumber = seriesNumber;
		seriesNumber = newSeriesNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_SEPARATE_CONTRACT_SERIES__SERIES_NUMBER, oldSeriesNumber, seriesNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getValidFrom() {
		return validFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidFrom(Date newValidFrom) {
		Date oldValidFrom = validFrom;
		validFrom = newValidFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_SEPARATE_CONTRACT_SERIES__VALID_FROM, oldValidFrom, validFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getValidUntil() {
		return validUntil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidUntil(Date newValidUntil) {
		Date oldValidUntil = validUntil;
		validUntil = newValidUntil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_SEPARATE_CONTRACT_SERIES__VALID_UNTIL, oldValidUntil, validUntil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacySeries getSeries() {
		if (series != null && series.eIsProxy()) {
			InternalEObject oldSeries = (InternalEObject)series;
			series = (LegacySeries)eResolveProxy(oldSeries);
			if (series != oldSeries) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.LEGACY_SEPARATE_CONTRACT_SERIES__SERIES, oldSeries, series));
			}
		}
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacySeries basicGetSeries() {
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeries(LegacySeries newSeries) {
		LegacySeries oldSeries = series;
		series = newSeries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_SEPARATE_CONTRACT_SERIES__SERIES, oldSeries, series));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.LEGACY_SEPARATE_CONTRACT_SERIES__SERIES_NUMBER:
				return getSeriesNumber();
			case GtmPackage.LEGACY_SEPARATE_CONTRACT_SERIES__VALID_FROM:
				return getValidFrom();
			case GtmPackage.LEGACY_SEPARATE_CONTRACT_SERIES__VALID_UNTIL:
				return getValidUntil();
			case GtmPackage.LEGACY_SEPARATE_CONTRACT_SERIES__SERIES:
				if (resolve) return getSeries();
				return basicGetSeries();
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
			case GtmPackage.LEGACY_SEPARATE_CONTRACT_SERIES__SERIES_NUMBER:
				setSeriesNumber((Integer)newValue);
				return;
			case GtmPackage.LEGACY_SEPARATE_CONTRACT_SERIES__VALID_FROM:
				setValidFrom((Date)newValue);
				return;
			case GtmPackage.LEGACY_SEPARATE_CONTRACT_SERIES__VALID_UNTIL:
				setValidUntil((Date)newValue);
				return;
			case GtmPackage.LEGACY_SEPARATE_CONTRACT_SERIES__SERIES:
				setSeries((LegacySeries)newValue);
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
			case GtmPackage.LEGACY_SEPARATE_CONTRACT_SERIES__SERIES_NUMBER:
				setSeriesNumber(SERIES_NUMBER_EDEFAULT);
				return;
			case GtmPackage.LEGACY_SEPARATE_CONTRACT_SERIES__VALID_FROM:
				setValidFrom(VALID_FROM_EDEFAULT);
				return;
			case GtmPackage.LEGACY_SEPARATE_CONTRACT_SERIES__VALID_UNTIL:
				setValidUntil(VALID_UNTIL_EDEFAULT);
				return;
			case GtmPackage.LEGACY_SEPARATE_CONTRACT_SERIES__SERIES:
				setSeries((LegacySeries)null);
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
			case GtmPackage.LEGACY_SEPARATE_CONTRACT_SERIES__SERIES_NUMBER:
				return seriesNumber != SERIES_NUMBER_EDEFAULT;
			case GtmPackage.LEGACY_SEPARATE_CONTRACT_SERIES__VALID_FROM:
				return VALID_FROM_EDEFAULT == null ? validFrom != null : !VALID_FROM_EDEFAULT.equals(validFrom);
			case GtmPackage.LEGACY_SEPARATE_CONTRACT_SERIES__VALID_UNTIL:
				return VALID_UNTIL_EDEFAULT == null ? validUntil != null : !VALID_UNTIL_EDEFAULT.equals(validUntil);
			case GtmPackage.LEGACY_SEPARATE_CONTRACT_SERIES__SERIES:
				return series != null;
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
		result.append(" (seriesNumber: ");
		result.append(seriesNumber);
		result.append(", validFrom: ");
		result.append(validFrom);
		result.append(", validUntil: ");
		result.append(validUntil);
		result.append(')');
		return result.toString();
	}

} //LegacySeparateContractSeriesImpl
