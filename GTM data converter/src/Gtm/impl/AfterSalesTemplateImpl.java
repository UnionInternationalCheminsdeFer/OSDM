/**
 */
package Gtm.impl;

import Gtm.AfterSalesTemplate;
import Gtm.AfterSalesTransactionType;
import Gtm.ApplicationTime;
import Gtm.GtmPackage;

import Gtm.RoundingType;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>After Sales Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.AfterSalesTemplateImpl#getTransactionType <em>Transaction Type</em>}</li>
 *   <li>{@link Gtm.impl.AfterSalesTemplateImpl#isCarrierFee <em>Carrier Fee</em>}</li>
 *   <li>{@link Gtm.impl.AfterSalesTemplateImpl#getApplicationTime <em>Application Time</em>}</li>
 *   <li>{@link Gtm.impl.AfterSalesTemplateImpl#getFeeFactor <em>Fee Factor</em>}</li>
 *   <li>{@link Gtm.impl.AfterSalesTemplateImpl#getRoundingMode <em>Rounding Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AfterSalesTemplateImpl extends MinimalEObjectImpl.Container implements AfterSalesTemplate {
	/**
	 * The default value of the '{@link #getTransactionType() <em>Transaction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionType()
	 * @generated
	 * @ordered
	 */
	protected static final AfterSalesTransactionType TRANSACTION_TYPE_EDEFAULT = AfterSalesTransactionType.REFUND;

	/**
	 * The cached value of the '{@link #getTransactionType() <em>Transaction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionType()
	 * @generated
	 * @ordered
	 */
	protected AfterSalesTransactionType transactionType = TRANSACTION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCarrierFee() <em>Carrier Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCarrierFee()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CARRIER_FEE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCarrierFee() <em>Carrier Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCarrierFee()
	 * @generated
	 * @ordered
	 */
	protected boolean carrierFee = CARRIER_FEE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getApplicationTime() <em>Application Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationTime()
	 * @generated
	 * @ordered
	 */
	protected ApplicationTime applicationTime;

	/**
	 * The default value of the '{@link #getFeeFactor() <em>Fee Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeeFactor()
	 * @generated
	 * @ordered
	 */
	protected static final float FEE_FACTOR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFeeFactor() <em>Fee Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeeFactor()
	 * @generated
	 * @ordered
	 */
	protected float feeFactor = FEE_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoundingMode() <em>Rounding Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoundingMode()
	 * @generated
	 * @ordered
	 */
	protected static final RoundingType ROUNDING_MODE_EDEFAULT = RoundingType.HALFUP;

	/**
	 * The cached value of the '{@link #getRoundingMode() <em>Rounding Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoundingMode()
	 * @generated
	 * @ordered
	 */
	protected RoundingType roundingMode = ROUNDING_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AfterSalesTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.AFTER_SALES_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AfterSalesTransactionType getTransactionType() {
		return transactionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionType(AfterSalesTransactionType newTransactionType) {
		AfterSalesTransactionType oldTransactionType = transactionType;
		transactionType = newTransactionType == null ? TRANSACTION_TYPE_EDEFAULT : newTransactionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.AFTER_SALES_TEMPLATE__TRANSACTION_TYPE, oldTransactionType, transactionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCarrierFee() {
		return carrierFee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarrierFee(boolean newCarrierFee) {
		boolean oldCarrierFee = carrierFee;
		carrierFee = newCarrierFee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.AFTER_SALES_TEMPLATE__CARRIER_FEE, oldCarrierFee, carrierFee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationTime getApplicationTime() {
		return applicationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicationTime(ApplicationTime newApplicationTime, NotificationChain msgs) {
		ApplicationTime oldApplicationTime = applicationTime;
		applicationTime = newApplicationTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.AFTER_SALES_TEMPLATE__APPLICATION_TIME, oldApplicationTime, newApplicationTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationTime(ApplicationTime newApplicationTime) {
		if (newApplicationTime != applicationTime) {
			NotificationChain msgs = null;
			if (applicationTime != null)
				msgs = ((InternalEObject)applicationTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.AFTER_SALES_TEMPLATE__APPLICATION_TIME, null, msgs);
			if (newApplicationTime != null)
				msgs = ((InternalEObject)newApplicationTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.AFTER_SALES_TEMPLATE__APPLICATION_TIME, null, msgs);
			msgs = basicSetApplicationTime(newApplicationTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.AFTER_SALES_TEMPLATE__APPLICATION_TIME, newApplicationTime, newApplicationTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFeeFactor() {
		return feeFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeeFactor(float newFeeFactor) {
		float oldFeeFactor = feeFactor;
		feeFactor = newFeeFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.AFTER_SALES_TEMPLATE__FEE_FACTOR, oldFeeFactor, feeFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoundingType getRoundingMode() {
		return roundingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoundingMode(RoundingType newRoundingMode) {
		RoundingType oldRoundingMode = roundingMode;
		roundingMode = newRoundingMode == null ? ROUNDING_MODE_EDEFAULT : newRoundingMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.AFTER_SALES_TEMPLATE__ROUNDING_MODE, oldRoundingMode, roundingMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.AFTER_SALES_TEMPLATE__APPLICATION_TIME:
				return basicSetApplicationTime(null, msgs);
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
			case GtmPackage.AFTER_SALES_TEMPLATE__TRANSACTION_TYPE:
				return getTransactionType();
			case GtmPackage.AFTER_SALES_TEMPLATE__CARRIER_FEE:
				return isCarrierFee();
			case GtmPackage.AFTER_SALES_TEMPLATE__APPLICATION_TIME:
				return getApplicationTime();
			case GtmPackage.AFTER_SALES_TEMPLATE__FEE_FACTOR:
				return getFeeFactor();
			case GtmPackage.AFTER_SALES_TEMPLATE__ROUNDING_MODE:
				return getRoundingMode();
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
			case GtmPackage.AFTER_SALES_TEMPLATE__TRANSACTION_TYPE:
				setTransactionType((AfterSalesTransactionType)newValue);
				return;
			case GtmPackage.AFTER_SALES_TEMPLATE__CARRIER_FEE:
				setCarrierFee((Boolean)newValue);
				return;
			case GtmPackage.AFTER_SALES_TEMPLATE__APPLICATION_TIME:
				setApplicationTime((ApplicationTime)newValue);
				return;
			case GtmPackage.AFTER_SALES_TEMPLATE__FEE_FACTOR:
				setFeeFactor((Float)newValue);
				return;
			case GtmPackage.AFTER_SALES_TEMPLATE__ROUNDING_MODE:
				setRoundingMode((RoundingType)newValue);
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
			case GtmPackage.AFTER_SALES_TEMPLATE__TRANSACTION_TYPE:
				setTransactionType(TRANSACTION_TYPE_EDEFAULT);
				return;
			case GtmPackage.AFTER_SALES_TEMPLATE__CARRIER_FEE:
				setCarrierFee(CARRIER_FEE_EDEFAULT);
				return;
			case GtmPackage.AFTER_SALES_TEMPLATE__APPLICATION_TIME:
				setApplicationTime((ApplicationTime)null);
				return;
			case GtmPackage.AFTER_SALES_TEMPLATE__FEE_FACTOR:
				setFeeFactor(FEE_FACTOR_EDEFAULT);
				return;
			case GtmPackage.AFTER_SALES_TEMPLATE__ROUNDING_MODE:
				setRoundingMode(ROUNDING_MODE_EDEFAULT);
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
			case GtmPackage.AFTER_SALES_TEMPLATE__TRANSACTION_TYPE:
				return transactionType != TRANSACTION_TYPE_EDEFAULT;
			case GtmPackage.AFTER_SALES_TEMPLATE__CARRIER_FEE:
				return carrierFee != CARRIER_FEE_EDEFAULT;
			case GtmPackage.AFTER_SALES_TEMPLATE__APPLICATION_TIME:
				return applicationTime != null;
			case GtmPackage.AFTER_SALES_TEMPLATE__FEE_FACTOR:
				return feeFactor != FEE_FACTOR_EDEFAULT;
			case GtmPackage.AFTER_SALES_TEMPLATE__ROUNDING_MODE:
				return roundingMode != ROUNDING_MODE_EDEFAULT;
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
		result.append(" (transactionType: ");
		result.append(transactionType);
		result.append(", carrierFee: ");
		result.append(carrierFee);
		result.append(", feeFactor: ");
		result.append(feeFactor);
		result.append(", roundingMode: ");
		result.append(roundingMode);
		result.append(')');
		return result.toString();
	}

} //AfterSalesTemplateImpl
