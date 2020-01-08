/**
 */
package Gtm.impl;

import Gtm.Carrier;
import Gtm.CodeLists;
import Gtm.Country;
import Gtm.Currency;
import Gtm.GtmPackage;
import Gtm.Language;
import Gtm.NutsCode;
import Gtm.ServiceBrand;
import Gtm.Station;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Lists</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.CodeListsImpl#getCarriers <em>Carriers</em>}</li>
 *   <li>{@link Gtm.impl.CodeListsImpl#getStations <em>Stations</em>}</li>
 *   <li>{@link Gtm.impl.CodeListsImpl#getCountries <em>Countries</em>}</li>
 *   <li>{@link Gtm.impl.CodeListsImpl#getLanguages <em>Languages</em>}</li>
 *   <li>{@link Gtm.impl.CodeListsImpl#getCurrencies <em>Currencies</em>}</li>
 *   <li>{@link Gtm.impl.CodeListsImpl#getServiceBrands <em>Service Brands</em>}</li>
 *   <li>{@link Gtm.impl.CodeListsImpl#getNutsCodes <em>Nuts Codes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeListsImpl extends MinimalEObjectImpl.Container implements CodeLists {
	/**
	 * The cached value of the '{@link #getCarriers() <em>Carriers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarriers()
	 * @generated
	 * @ordered
	 */
	protected EList<Carrier> carriers;

	/**
	 * The cached value of the '{@link #getStations() <em>Stations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStations()
	 * @generated
	 * @ordered
	 */
	protected EList<Station> stations;

	/**
	 * The cached value of the '{@link #getCountries() <em>Countries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountries()
	 * @generated
	 * @ordered
	 */
	protected EList<Country> countries;

	/**
	 * The cached value of the '{@link #getLanguages() <em>Languages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguages()
	 * @generated
	 * @ordered
	 */
	protected EList<Language> languages;

	/**
	 * The cached value of the '{@link #getCurrencies() <em>Currencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Currency> currencies;

	/**
	 * The cached value of the '{@link #getServiceBrands() <em>Service Brands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceBrands()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceBrand> serviceBrands;

	/**
	 * The cached value of the '{@link #getNutsCodes() <em>Nuts Codes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutsCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<NutsCode> nutsCodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeListsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.CODE_LISTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Carrier> getCarriers() {
		if (carriers == null) {
			carriers = new EObjectContainmentEList<Carrier>(Carrier.class, this, GtmPackage.CODE_LISTS__CARRIERS);
		}
		return carriers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Station> getStations() {
		if (stations == null) {
			stations = new EObjectContainmentEList<Station>(Station.class, this, GtmPackage.CODE_LISTS__STATIONS);
		}
		return stations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Country> getCountries() {
		if (countries == null) {
			countries = new EObjectContainmentEList<Country>(Country.class, this, GtmPackage.CODE_LISTS__COUNTRIES);
		}
		return countries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Language> getLanguages() {
		if (languages == null) {
			languages = new EObjectContainmentEList<Language>(Language.class, this, GtmPackage.CODE_LISTS__LANGUAGES);
		}
		return languages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Currency> getCurrencies() {
		if (currencies == null) {
			currencies = new EObjectContainmentEList<Currency>(Currency.class, this, GtmPackage.CODE_LISTS__CURRENCIES);
		}
		return currencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceBrand> getServiceBrands() {
		if (serviceBrands == null) {
			serviceBrands = new EObjectContainmentEList<ServiceBrand>(ServiceBrand.class, this, GtmPackage.CODE_LISTS__SERVICE_BRANDS);
		}
		return serviceBrands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NutsCode> getNutsCodes() {
		if (nutsCodes == null) {
			nutsCodes = new EObjectContainmentEList<NutsCode>(NutsCode.class, this, GtmPackage.CODE_LISTS__NUTS_CODES);
		}
		return nutsCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.CODE_LISTS__CARRIERS:
				return ((InternalEList<?>)getCarriers()).basicRemove(otherEnd, msgs);
			case GtmPackage.CODE_LISTS__STATIONS:
				return ((InternalEList<?>)getStations()).basicRemove(otherEnd, msgs);
			case GtmPackage.CODE_LISTS__COUNTRIES:
				return ((InternalEList<?>)getCountries()).basicRemove(otherEnd, msgs);
			case GtmPackage.CODE_LISTS__LANGUAGES:
				return ((InternalEList<?>)getLanguages()).basicRemove(otherEnd, msgs);
			case GtmPackage.CODE_LISTS__CURRENCIES:
				return ((InternalEList<?>)getCurrencies()).basicRemove(otherEnd, msgs);
			case GtmPackage.CODE_LISTS__SERVICE_BRANDS:
				return ((InternalEList<?>)getServiceBrands()).basicRemove(otherEnd, msgs);
			case GtmPackage.CODE_LISTS__NUTS_CODES:
				return ((InternalEList<?>)getNutsCodes()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.CODE_LISTS__CARRIERS:
				return getCarriers();
			case GtmPackage.CODE_LISTS__STATIONS:
				return getStations();
			case GtmPackage.CODE_LISTS__COUNTRIES:
				return getCountries();
			case GtmPackage.CODE_LISTS__LANGUAGES:
				return getLanguages();
			case GtmPackage.CODE_LISTS__CURRENCIES:
				return getCurrencies();
			case GtmPackage.CODE_LISTS__SERVICE_BRANDS:
				return getServiceBrands();
			case GtmPackage.CODE_LISTS__NUTS_CODES:
				return getNutsCodes();
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
			case GtmPackage.CODE_LISTS__CARRIERS:
				getCarriers().clear();
				getCarriers().addAll((Collection<? extends Carrier>)newValue);
				return;
			case GtmPackage.CODE_LISTS__STATIONS:
				getStations().clear();
				getStations().addAll((Collection<? extends Station>)newValue);
				return;
			case GtmPackage.CODE_LISTS__COUNTRIES:
				getCountries().clear();
				getCountries().addAll((Collection<? extends Country>)newValue);
				return;
			case GtmPackage.CODE_LISTS__LANGUAGES:
				getLanguages().clear();
				getLanguages().addAll((Collection<? extends Language>)newValue);
				return;
			case GtmPackage.CODE_LISTS__CURRENCIES:
				getCurrencies().clear();
				getCurrencies().addAll((Collection<? extends Currency>)newValue);
				return;
			case GtmPackage.CODE_LISTS__SERVICE_BRANDS:
				getServiceBrands().clear();
				getServiceBrands().addAll((Collection<? extends ServiceBrand>)newValue);
				return;
			case GtmPackage.CODE_LISTS__NUTS_CODES:
				getNutsCodes().clear();
				getNutsCodes().addAll((Collection<? extends NutsCode>)newValue);
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
			case GtmPackage.CODE_LISTS__CARRIERS:
				getCarriers().clear();
				return;
			case GtmPackage.CODE_LISTS__STATIONS:
				getStations().clear();
				return;
			case GtmPackage.CODE_LISTS__COUNTRIES:
				getCountries().clear();
				return;
			case GtmPackage.CODE_LISTS__LANGUAGES:
				getLanguages().clear();
				return;
			case GtmPackage.CODE_LISTS__CURRENCIES:
				getCurrencies().clear();
				return;
			case GtmPackage.CODE_LISTS__SERVICE_BRANDS:
				getServiceBrands().clear();
				return;
			case GtmPackage.CODE_LISTS__NUTS_CODES:
				getNutsCodes().clear();
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
			case GtmPackage.CODE_LISTS__CARRIERS:
				return carriers != null && !carriers.isEmpty();
			case GtmPackage.CODE_LISTS__STATIONS:
				return stations != null && !stations.isEmpty();
			case GtmPackage.CODE_LISTS__COUNTRIES:
				return countries != null && !countries.isEmpty();
			case GtmPackage.CODE_LISTS__LANGUAGES:
				return languages != null && !languages.isEmpty();
			case GtmPackage.CODE_LISTS__CURRENCIES:
				return currencies != null && !currencies.isEmpty();
			case GtmPackage.CODE_LISTS__SERVICE_BRANDS:
				return serviceBrands != null && !serviceBrands.isEmpty();
			case GtmPackage.CODE_LISTS__NUTS_CODES:
				return nutsCodes != null && !nutsCodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CodeListsImpl
