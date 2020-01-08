/**
 */
package Gtm.impl;

import Gtm.BorderPoints;
import Gtm.Country;
import Gtm.CoversionParams;
import Gtm.GtmPackage;
import Gtm.LegacyStationMap;
import Gtm.TargetFareTemplate;

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
 * An implementation of the model object '<em><b>Coversion Params</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.CoversionParamsImpl#getBorderPoints <em>Border Points</em>}</li>
 *   <li>{@link Gtm.impl.CoversionParamsImpl#getTargetFares <em>Target Fares</em>}</li>
 *   <li>{@link Gtm.impl.CoversionParamsImpl#getStationMappings <em>Station Mappings</em>}</li>
 *   <li>{@link Gtm.impl.CoversionParamsImpl#getTaxId <em>Tax Id</em>}</li>
 *   <li>{@link Gtm.impl.CoversionParamsImpl#getVATpercentage <em>VA Tpercentage</em>}</li>
 *   <li>{@link Gtm.impl.CoversionParamsImpl#getTaxCountry <em>Tax Country</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoversionParamsImpl extends MinimalEObjectImpl.Container implements CoversionParams {
	/**
	 * The cached value of the '{@link #getBorderPoints() <em>Border Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<BorderPoints> borderPoints;

	/**
	 * The cached value of the '{@link #getTargetFares() <em>Target Fares</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFares()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetFareTemplate> targetFares;

	/**
	 * The cached value of the '{@link #getStationMappings() <em>Station Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStationMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<LegacyStationMap> stationMappings;

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
	 * The default value of the '{@link #getVATpercentage() <em>VA Tpercentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVATpercentage()
	 * @generated
	 * @ordered
	 */
	protected static final float VA_TPERCENTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVATpercentage() <em>VA Tpercentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVATpercentage()
	 * @generated
	 * @ordered
	 */
	protected float vaTpercentage = VA_TPERCENTAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTaxCountry() <em>Tax Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxCountry()
	 * @generated
	 * @ordered
	 */
	protected Country taxCountry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoversionParamsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.COVERSION_PARAMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BorderPoints> getBorderPoints() {
		if (borderPoints == null) {
			borderPoints = new EObjectContainmentEList<BorderPoints>(BorderPoints.class, this, GtmPackage.COVERSION_PARAMS__BORDER_POINTS);
		}
		return borderPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TargetFareTemplate> getTargetFares() {
		if (targetFares == null) {
			targetFares = new EObjectContainmentEList<TargetFareTemplate>(TargetFareTemplate.class, this, GtmPackage.COVERSION_PARAMS__TARGET_FARES);
		}
		return targetFares;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LegacyStationMap> getStationMappings() {
		if (stationMappings == null) {
			stationMappings = new EObjectContainmentEList<LegacyStationMap>(LegacyStationMap.class, this, GtmPackage.COVERSION_PARAMS__STATION_MAPPINGS);
		}
		return stationMappings;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.COVERSION_PARAMS__TAX_ID, oldTaxId, taxId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVATpercentage() {
		return vaTpercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVATpercentage(float newVATpercentage) {
		float oldVATpercentage = vaTpercentage;
		vaTpercentage = newVATpercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.COVERSION_PARAMS__VA_TPERCENTAGE, oldVATpercentage, vaTpercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country getTaxCountry() {
		if (taxCountry != null && taxCountry.eIsProxy()) {
			InternalEObject oldTaxCountry = (InternalEObject)taxCountry;
			taxCountry = (Country)eResolveProxy(oldTaxCountry);
			if (taxCountry != oldTaxCountry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.COVERSION_PARAMS__TAX_COUNTRY, oldTaxCountry, taxCountry));
			}
		}
		return taxCountry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country basicGetTaxCountry() {
		return taxCountry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxCountry(Country newTaxCountry) {
		Country oldTaxCountry = taxCountry;
		taxCountry = newTaxCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.COVERSION_PARAMS__TAX_COUNTRY, oldTaxCountry, taxCountry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.COVERSION_PARAMS__BORDER_POINTS:
				return ((InternalEList<?>)getBorderPoints()).basicRemove(otherEnd, msgs);
			case GtmPackage.COVERSION_PARAMS__TARGET_FARES:
				return ((InternalEList<?>)getTargetFares()).basicRemove(otherEnd, msgs);
			case GtmPackage.COVERSION_PARAMS__STATION_MAPPINGS:
				return ((InternalEList<?>)getStationMappings()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.COVERSION_PARAMS__BORDER_POINTS:
				return getBorderPoints();
			case GtmPackage.COVERSION_PARAMS__TARGET_FARES:
				return getTargetFares();
			case GtmPackage.COVERSION_PARAMS__STATION_MAPPINGS:
				return getStationMappings();
			case GtmPackage.COVERSION_PARAMS__TAX_ID:
				return getTaxId();
			case GtmPackage.COVERSION_PARAMS__VA_TPERCENTAGE:
				return getVATpercentage();
			case GtmPackage.COVERSION_PARAMS__TAX_COUNTRY:
				if (resolve) return getTaxCountry();
				return basicGetTaxCountry();
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
			case GtmPackage.COVERSION_PARAMS__BORDER_POINTS:
				getBorderPoints().clear();
				getBorderPoints().addAll((Collection<? extends BorderPoints>)newValue);
				return;
			case GtmPackage.COVERSION_PARAMS__TARGET_FARES:
				getTargetFares().clear();
				getTargetFares().addAll((Collection<? extends TargetFareTemplate>)newValue);
				return;
			case GtmPackage.COVERSION_PARAMS__STATION_MAPPINGS:
				getStationMappings().clear();
				getStationMappings().addAll((Collection<? extends LegacyStationMap>)newValue);
				return;
			case GtmPackage.COVERSION_PARAMS__TAX_ID:
				setTaxId((String)newValue);
				return;
			case GtmPackage.COVERSION_PARAMS__VA_TPERCENTAGE:
				setVATpercentage((Float)newValue);
				return;
			case GtmPackage.COVERSION_PARAMS__TAX_COUNTRY:
				setTaxCountry((Country)newValue);
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
			case GtmPackage.COVERSION_PARAMS__BORDER_POINTS:
				getBorderPoints().clear();
				return;
			case GtmPackage.COVERSION_PARAMS__TARGET_FARES:
				getTargetFares().clear();
				return;
			case GtmPackage.COVERSION_PARAMS__STATION_MAPPINGS:
				getStationMappings().clear();
				return;
			case GtmPackage.COVERSION_PARAMS__TAX_ID:
				setTaxId(TAX_ID_EDEFAULT);
				return;
			case GtmPackage.COVERSION_PARAMS__VA_TPERCENTAGE:
				setVATpercentage(VA_TPERCENTAGE_EDEFAULT);
				return;
			case GtmPackage.COVERSION_PARAMS__TAX_COUNTRY:
				setTaxCountry((Country)null);
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
			case GtmPackage.COVERSION_PARAMS__BORDER_POINTS:
				return borderPoints != null && !borderPoints.isEmpty();
			case GtmPackage.COVERSION_PARAMS__TARGET_FARES:
				return targetFares != null && !targetFares.isEmpty();
			case GtmPackage.COVERSION_PARAMS__STATION_MAPPINGS:
				return stationMappings != null && !stationMappings.isEmpty();
			case GtmPackage.COVERSION_PARAMS__TAX_ID:
				return TAX_ID_EDEFAULT == null ? taxId != null : !TAX_ID_EDEFAULT.equals(taxId);
			case GtmPackage.COVERSION_PARAMS__VA_TPERCENTAGE:
				return vaTpercentage != VA_TPERCENTAGE_EDEFAULT;
			case GtmPackage.COVERSION_PARAMS__TAX_COUNTRY:
				return taxCountry != null;
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
		result.append(" (TaxId: ");
		result.append(taxId);
		result.append(", VATpercentage: ");
		result.append(vaTpercentage);
		result.append(')');
		return result.toString();
	}

} //CoversionParamsImpl
