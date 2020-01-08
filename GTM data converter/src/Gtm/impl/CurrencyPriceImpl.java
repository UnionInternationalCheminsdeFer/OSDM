/**
 */
package Gtm.impl;

import Gtm.Currency;
import Gtm.CurrencyPrice;
import Gtm.GtmPackage;
import Gtm.VATDetail;

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
 * An implementation of the model object '<em><b>Currency Price</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.CurrencyPriceImpl#getCurrency <em>Currency</em>}</li>
 *   <li>{@link Gtm.impl.CurrencyPriceImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link Gtm.impl.CurrencyPriceImpl#getVATdetails <em>VA Tdetails</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurrencyPriceImpl extends MinimalEObjectImpl.Container implements CurrencyPrice {
	/**
	 * The cached value of the '{@link #getCurrency() <em>Currency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected Currency currency;

	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected float amount = AMOUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVATdetails() <em>VA Tdetails</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVATdetails()
	 * @generated
	 * @ordered
	 */
	protected EList<VATDetail> vaTdetails;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrencyPriceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.CURRENCY_PRICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Currency getCurrency() {
		if (currency != null && currency.eIsProxy()) {
			InternalEObject oldCurrency = (InternalEObject)currency;
			currency = (Currency)eResolveProxy(oldCurrency);
			if (currency != oldCurrency) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.CURRENCY_PRICE__CURRENCY, oldCurrency, currency));
			}
		}
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Currency basicGetCurrency() {
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrency(Currency newCurrency) {
		Currency oldCurrency = currency;
		currency = newCurrency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CURRENCY_PRICE__CURRENCY, oldCurrency, currency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(float newAmount) {
		float oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CURRENCY_PRICE__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VATDetail> getVATdetails() {
		if (vaTdetails == null) {
			vaTdetails = new EObjectContainmentEList<VATDetail>(VATDetail.class, this, GtmPackage.CURRENCY_PRICE__VA_TDETAILS);
		}
		return vaTdetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.CURRENCY_PRICE__VA_TDETAILS:
				return ((InternalEList<?>)getVATdetails()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.CURRENCY_PRICE__CURRENCY:
				if (resolve) return getCurrency();
				return basicGetCurrency();
			case GtmPackage.CURRENCY_PRICE__AMOUNT:
				return getAmount();
			case GtmPackage.CURRENCY_PRICE__VA_TDETAILS:
				return getVATdetails();
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
			case GtmPackage.CURRENCY_PRICE__CURRENCY:
				setCurrency((Currency)newValue);
				return;
			case GtmPackage.CURRENCY_PRICE__AMOUNT:
				setAmount((Float)newValue);
				return;
			case GtmPackage.CURRENCY_PRICE__VA_TDETAILS:
				getVATdetails().clear();
				getVATdetails().addAll((Collection<? extends VATDetail>)newValue);
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
			case GtmPackage.CURRENCY_PRICE__CURRENCY:
				setCurrency((Currency)null);
				return;
			case GtmPackage.CURRENCY_PRICE__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case GtmPackage.CURRENCY_PRICE__VA_TDETAILS:
				getVATdetails().clear();
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
			case GtmPackage.CURRENCY_PRICE__CURRENCY:
				return currency != null;
			case GtmPackage.CURRENCY_PRICE__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
			case GtmPackage.CURRENCY_PRICE__VA_TDETAILS:
				return vaTdetails != null && !vaTdetails.isEmpty();
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
		result.append(" (amount: ");
		result.append(amount);
		result.append(')');
		return result.toString();
	}

} //CurrencyPriceImpl
