/**
 */
package Gtm.impl;

import Gtm.Country;
import Gtm.CrossBorderCondition;
import Gtm.GtmPackage;
import Gtm.ServiceBrand;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cross Border Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.CrossBorderConditionImpl#getFromCountry <em>From Country</em>}</li>
 *   <li>{@link Gtm.impl.CrossBorderConditionImpl#getToCountry <em>To Country</em>}</li>
 *   <li>{@link Gtm.impl.CrossBorderConditionImpl#getAffectedServiceBrands <em>Affected Service Brands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CrossBorderConditionImpl extends MinimalEObjectImpl.Container implements CrossBorderCondition {
	/**
	 * The cached value of the '{@link #getFromCountry() <em>From Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromCountry()
	 * @generated
	 * @ordered
	 */
	protected Country fromCountry;

	/**
	 * The cached value of the '{@link #getToCountry() <em>To Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToCountry()
	 * @generated
	 * @ordered
	 */
	protected Country toCountry;

	/**
	 * The cached value of the '{@link #getAffectedServiceBrands() <em>Affected Service Brands</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedServiceBrands()
	 * @generated
	 * @ordered
	 */
	protected ServiceBrand affectedServiceBrands;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CrossBorderConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.CROSS_BORDER_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country getFromCountry() {
		if (fromCountry != null && fromCountry.eIsProxy()) {
			InternalEObject oldFromCountry = (InternalEObject)fromCountry;
			fromCountry = (Country)eResolveProxy(oldFromCountry);
			if (fromCountry != oldFromCountry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.CROSS_BORDER_CONDITION__FROM_COUNTRY, oldFromCountry, fromCountry));
			}
		}
		return fromCountry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country basicGetFromCountry() {
		return fromCountry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromCountry(Country newFromCountry) {
		Country oldFromCountry = fromCountry;
		fromCountry = newFromCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CROSS_BORDER_CONDITION__FROM_COUNTRY, oldFromCountry, fromCountry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country getToCountry() {
		if (toCountry != null && toCountry.eIsProxy()) {
			InternalEObject oldToCountry = (InternalEObject)toCountry;
			toCountry = (Country)eResolveProxy(oldToCountry);
			if (toCountry != oldToCountry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.CROSS_BORDER_CONDITION__TO_COUNTRY, oldToCountry, toCountry));
			}
		}
		return toCountry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country basicGetToCountry() {
		return toCountry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToCountry(Country newToCountry) {
		Country oldToCountry = toCountry;
		toCountry = newToCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CROSS_BORDER_CONDITION__TO_COUNTRY, oldToCountry, toCountry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBrand getAffectedServiceBrands() {
		if (affectedServiceBrands != null && affectedServiceBrands.eIsProxy()) {
			InternalEObject oldAffectedServiceBrands = (InternalEObject)affectedServiceBrands;
			affectedServiceBrands = (ServiceBrand)eResolveProxy(oldAffectedServiceBrands);
			if (affectedServiceBrands != oldAffectedServiceBrands) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.CROSS_BORDER_CONDITION__AFFECTED_SERVICE_BRANDS, oldAffectedServiceBrands, affectedServiceBrands));
			}
		}
		return affectedServiceBrands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBrand basicGetAffectedServiceBrands() {
		return affectedServiceBrands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAffectedServiceBrands(ServiceBrand newAffectedServiceBrands) {
		ServiceBrand oldAffectedServiceBrands = affectedServiceBrands;
		affectedServiceBrands = newAffectedServiceBrands;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CROSS_BORDER_CONDITION__AFFECTED_SERVICE_BRANDS, oldAffectedServiceBrands, affectedServiceBrands));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.CROSS_BORDER_CONDITION__FROM_COUNTRY:
				if (resolve) return getFromCountry();
				return basicGetFromCountry();
			case GtmPackage.CROSS_BORDER_CONDITION__TO_COUNTRY:
				if (resolve) return getToCountry();
				return basicGetToCountry();
			case GtmPackage.CROSS_BORDER_CONDITION__AFFECTED_SERVICE_BRANDS:
				if (resolve) return getAffectedServiceBrands();
				return basicGetAffectedServiceBrands();
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
			case GtmPackage.CROSS_BORDER_CONDITION__FROM_COUNTRY:
				setFromCountry((Country)newValue);
				return;
			case GtmPackage.CROSS_BORDER_CONDITION__TO_COUNTRY:
				setToCountry((Country)newValue);
				return;
			case GtmPackage.CROSS_BORDER_CONDITION__AFFECTED_SERVICE_BRANDS:
				setAffectedServiceBrands((ServiceBrand)newValue);
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
			case GtmPackage.CROSS_BORDER_CONDITION__FROM_COUNTRY:
				setFromCountry((Country)null);
				return;
			case GtmPackage.CROSS_BORDER_CONDITION__TO_COUNTRY:
				setToCountry((Country)null);
				return;
			case GtmPackage.CROSS_BORDER_CONDITION__AFFECTED_SERVICE_BRANDS:
				setAffectedServiceBrands((ServiceBrand)null);
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
			case GtmPackage.CROSS_BORDER_CONDITION__FROM_COUNTRY:
				return fromCountry != null;
			case GtmPackage.CROSS_BORDER_CONDITION__TO_COUNTRY:
				return toCountry != null;
			case GtmPackage.CROSS_BORDER_CONDITION__AFFECTED_SERVICE_BRANDS:
				return affectedServiceBrands != null;
		}
		return super.eIsSet(featureID);
	}

} //CrossBorderConditionImpl
