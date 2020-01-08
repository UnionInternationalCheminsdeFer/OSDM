/**
 */
package Gtm.impl;

import Gtm.AfterSalesCondition;
import Gtm.AfterSalesTransactionType;
import Gtm.GtmPackage;
import Gtm.Price;
import Gtm.RelativeTime;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>After Sales Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.AfterSalesConditionImpl#getTransactionType <em>Transaction Type</em>}</li>
 *   <li>{@link Gtm.impl.AfterSalesConditionImpl#isIndividualContracts <em>Individual Contracts</em>}</li>
 *   <li>{@link Gtm.impl.AfterSalesConditionImpl#isCarrierFee <em>Carrier Fee</em>}</li>
 *   <li>{@link Gtm.impl.AfterSalesConditionImpl#getFee <em>Fee</em>}</li>
 *   <li>{@link Gtm.impl.AfterSalesConditionImpl#getApplicationTime <em>Application Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AfterSalesConditionImpl extends MinimalEObjectImpl.Container implements AfterSalesCondition {
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
	 * The default value of the '{@link #isIndividualContracts() <em>Individual Contracts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIndividualContracts()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INDIVIDUAL_CONTRACTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIndividualContracts() <em>Individual Contracts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIndividualContracts()
	 * @generated
	 * @ordered
	 */
	protected boolean individualContracts = INDIVIDUAL_CONTRACTS_EDEFAULT;

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
	 * The cached value of the '{@link #getFee() <em>Fee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFee()
	 * @generated
	 * @ordered
	 */
	protected Price fee;

	/**
	 * The cached value of the '{@link #getApplicationTime() <em>Application Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationTime()
	 * @generated
	 * @ordered
	 */
	protected RelativeTime applicationTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AfterSalesConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.AFTER_SALES_CONDITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.AFTER_SALES_CONDITION__TRANSACTION_TYPE, oldTransactionType, transactionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIndividualContracts() {
		return individualContracts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndividualContracts(boolean newIndividualContracts) {
		boolean oldIndividualContracts = individualContracts;
		individualContracts = newIndividualContracts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.AFTER_SALES_CONDITION__INDIVIDUAL_CONTRACTS, oldIndividualContracts, individualContracts));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.AFTER_SALES_CONDITION__CARRIER_FEE, oldCarrierFee, carrierFee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Price getFee() {
		if (fee != null && fee.eIsProxy()) {
			InternalEObject oldFee = (InternalEObject)fee;
			fee = (Price)eResolveProxy(oldFee);
			if (fee != oldFee) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.AFTER_SALES_CONDITION__FEE, oldFee, fee));
			}
		}
		return fee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Price basicGetFee() {
		return fee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFee(Price newFee) {
		Price oldFee = fee;
		fee = newFee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.AFTER_SALES_CONDITION__FEE, oldFee, fee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeTime getApplicationTime() {
		return applicationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicationTime(RelativeTime newApplicationTime, NotificationChain msgs) {
		RelativeTime oldApplicationTime = applicationTime;
		applicationTime = newApplicationTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.AFTER_SALES_CONDITION__APPLICATION_TIME, oldApplicationTime, newApplicationTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationTime(RelativeTime newApplicationTime) {
		if (newApplicationTime != applicationTime) {
			NotificationChain msgs = null;
			if (applicationTime != null)
				msgs = ((InternalEObject)applicationTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.AFTER_SALES_CONDITION__APPLICATION_TIME, null, msgs);
			if (newApplicationTime != null)
				msgs = ((InternalEObject)newApplicationTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.AFTER_SALES_CONDITION__APPLICATION_TIME, null, msgs);
			msgs = basicSetApplicationTime(newApplicationTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.AFTER_SALES_CONDITION__APPLICATION_TIME, newApplicationTime, newApplicationTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.AFTER_SALES_CONDITION__APPLICATION_TIME:
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
			case GtmPackage.AFTER_SALES_CONDITION__TRANSACTION_TYPE:
				return getTransactionType();
			case GtmPackage.AFTER_SALES_CONDITION__INDIVIDUAL_CONTRACTS:
				return isIndividualContracts();
			case GtmPackage.AFTER_SALES_CONDITION__CARRIER_FEE:
				return isCarrierFee();
			case GtmPackage.AFTER_SALES_CONDITION__FEE:
				if (resolve) return getFee();
				return basicGetFee();
			case GtmPackage.AFTER_SALES_CONDITION__APPLICATION_TIME:
				return getApplicationTime();
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
			case GtmPackage.AFTER_SALES_CONDITION__TRANSACTION_TYPE:
				setTransactionType((AfterSalesTransactionType)newValue);
				return;
			case GtmPackage.AFTER_SALES_CONDITION__INDIVIDUAL_CONTRACTS:
				setIndividualContracts((Boolean)newValue);
				return;
			case GtmPackage.AFTER_SALES_CONDITION__CARRIER_FEE:
				setCarrierFee((Boolean)newValue);
				return;
			case GtmPackage.AFTER_SALES_CONDITION__FEE:
				setFee((Price)newValue);
				return;
			case GtmPackage.AFTER_SALES_CONDITION__APPLICATION_TIME:
				setApplicationTime((RelativeTime)newValue);
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
			case GtmPackage.AFTER_SALES_CONDITION__TRANSACTION_TYPE:
				setTransactionType(TRANSACTION_TYPE_EDEFAULT);
				return;
			case GtmPackage.AFTER_SALES_CONDITION__INDIVIDUAL_CONTRACTS:
				setIndividualContracts(INDIVIDUAL_CONTRACTS_EDEFAULT);
				return;
			case GtmPackage.AFTER_SALES_CONDITION__CARRIER_FEE:
				setCarrierFee(CARRIER_FEE_EDEFAULT);
				return;
			case GtmPackage.AFTER_SALES_CONDITION__FEE:
				setFee((Price)null);
				return;
			case GtmPackage.AFTER_SALES_CONDITION__APPLICATION_TIME:
				setApplicationTime((RelativeTime)null);
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
			case GtmPackage.AFTER_SALES_CONDITION__TRANSACTION_TYPE:
				return transactionType != TRANSACTION_TYPE_EDEFAULT;
			case GtmPackage.AFTER_SALES_CONDITION__INDIVIDUAL_CONTRACTS:
				return individualContracts != INDIVIDUAL_CONTRACTS_EDEFAULT;
			case GtmPackage.AFTER_SALES_CONDITION__CARRIER_FEE:
				return carrierFee != CARRIER_FEE_EDEFAULT;
			case GtmPackage.AFTER_SALES_CONDITION__FEE:
				return fee != null;
			case GtmPackage.AFTER_SALES_CONDITION__APPLICATION_TIME:
				return applicationTime != null;
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
		result.append(", individualContracts: ");
		result.append(individualContracts);
		result.append(", carrierFee: ");
		result.append(carrierFee);
		result.append(')');
		return result.toString();
	}

} //AfterSalesConditionImpl
