/**
 */
package Gtm.impl;

import Gtm.Country;
import Gtm.GtmPackage;
import Gtm.TaxScope;
import Gtm.VatTemplate;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vat Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.VatTemplateImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link Gtm.impl.VatTemplateImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link Gtm.impl.VatTemplateImpl#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link Gtm.impl.VatTemplateImpl#getTaxId <em>Tax Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VatTemplateImpl extends MinimalEObjectImpl.Container implements VatTemplate {
	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final TaxScope SCOPE_EDEFAULT = TaxScope.INTERNATIONAL;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected TaxScope scope = SCOPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected Country country;

	/**
	 * The default value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final float PERCENTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentage()
	 * @generated
	 * @ordered
	 */
	protected float percentage = PERCENTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaxId() <em>Tax Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxId()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxId() <em>Tax Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxId()
	 * @generated
	 * @ordered
	 */
	protected String taxId = TAX_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VatTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.VAT_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxScope getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(TaxScope newScope) {
		TaxScope oldScope = scope;
		scope = newScope == null ? SCOPE_EDEFAULT : newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.VAT_TEMPLATE__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country getCountry() {
		if (country != null && country.eIsProxy()) {
			InternalEObject oldCountry = (InternalEObject)country;
			country = (Country)eResolveProxy(oldCountry);
			if (country != oldCountry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.VAT_TEMPLATE__COUNTRY, oldCountry, country));
			}
		}
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country basicGetCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(Country newCountry) {
		Country oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.VAT_TEMPLATE__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPercentage() {
		return percentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentage(float newPercentage) {
		float oldPercentage = percentage;
		percentage = newPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.VAT_TEMPLATE__PERCENTAGE, oldPercentage, percentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaxId() {
		return taxId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxId(String newTaxId) {
		String oldTaxId = taxId;
		taxId = newTaxId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.VAT_TEMPLATE__TAX_ID, oldTaxId, taxId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.VAT_TEMPLATE__SCOPE:
				return getScope();
			case GtmPackage.VAT_TEMPLATE__COUNTRY:
				if (resolve) return getCountry();
				return basicGetCountry();
			case GtmPackage.VAT_TEMPLATE__PERCENTAGE:
				return getPercentage();
			case GtmPackage.VAT_TEMPLATE__TAX_ID:
				return getTaxId();
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
			case GtmPackage.VAT_TEMPLATE__SCOPE:
				setScope((TaxScope)newValue);
				return;
			case GtmPackage.VAT_TEMPLATE__COUNTRY:
				setCountry((Country)newValue);
				return;
			case GtmPackage.VAT_TEMPLATE__PERCENTAGE:
				setPercentage((Float)newValue);
				return;
			case GtmPackage.VAT_TEMPLATE__TAX_ID:
				setTaxId((String)newValue);
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
			case GtmPackage.VAT_TEMPLATE__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case GtmPackage.VAT_TEMPLATE__COUNTRY:
				setCountry((Country)null);
				return;
			case GtmPackage.VAT_TEMPLATE__PERCENTAGE:
				setPercentage(PERCENTAGE_EDEFAULT);
				return;
			case GtmPackage.VAT_TEMPLATE__TAX_ID:
				setTaxId(TAX_ID_EDEFAULT);
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
			case GtmPackage.VAT_TEMPLATE__SCOPE:
				return scope != SCOPE_EDEFAULT;
			case GtmPackage.VAT_TEMPLATE__COUNTRY:
				return country != null;
			case GtmPackage.VAT_TEMPLATE__PERCENTAGE:
				return percentage != PERCENTAGE_EDEFAULT;
			case GtmPackage.VAT_TEMPLATE__TAX_ID:
				return TAX_ID_EDEFAULT == null ? taxId != null : !TAX_ID_EDEFAULT.equals(taxId);
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
		result.append(" (scope: ");
		result.append(scope);
		result.append(", percentage: ");
		result.append(percentage);
		result.append(", taxId: ");
		result.append(taxId);
		result.append(')');
		return result.toString();
	}

} //VatTemplateImpl
