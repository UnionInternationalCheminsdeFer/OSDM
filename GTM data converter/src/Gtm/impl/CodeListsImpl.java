/**
 */
package Gtm.impl;

import Gtm.Carriers;
import Gtm.CodeLists;
import Gtm.Countries;
import Gtm.Currencies;
import Gtm.GtmPackage;
import Gtm.Languages;
import Gtm.NUTSCodes;
import Gtm.ServiceBrands;
import Gtm.Stations;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
	 * The cached value of the '{@link #getCarriers() <em>Carriers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarriers()
	 * @generated
	 * @ordered
	 */
	protected Carriers carriers;

	/**
	 * The cached value of the '{@link #getStations() <em>Stations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStations()
	 * @generated
	 * @ordered
	 */
	protected Stations stations;

	/**
	 * The cached value of the '{@link #getCountries() <em>Countries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountries()
	 * @generated
	 * @ordered
	 */
	protected Countries countries;

	/**
	 * The cached value of the '{@link #getLanguages() <em>Languages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguages()
	 * @generated
	 * @ordered
	 */
	protected Languages languages;

	/**
	 * The cached value of the '{@link #getCurrencies() <em>Currencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencies()
	 * @generated
	 * @ordered
	 */
	protected Currencies currencies;

	/**
	 * The cached value of the '{@link #getServiceBrands() <em>Service Brands</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceBrands()
	 * @generated
	 * @ordered
	 */
	protected ServiceBrands serviceBrands;

	/**
	 * The cached value of the '{@link #getNutsCodes() <em>Nuts Codes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutsCodes()
	 * @generated
	 * @ordered
	 */
	protected NUTSCodes nutsCodes;

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
	public Carriers getCarriers() {
		return carriers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCarriers(Carriers newCarriers, NotificationChain msgs) {
		Carriers oldCarriers = carriers;
		carriers = newCarriers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.CODE_LISTS__CARRIERS, oldCarriers, newCarriers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarriers(Carriers newCarriers) {
		if (newCarriers != carriers) {
			NotificationChain msgs = null;
			if (carriers != null)
				msgs = ((InternalEObject)carriers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CODE_LISTS__CARRIERS, null, msgs);
			if (newCarriers != null)
				msgs = ((InternalEObject)newCarriers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CODE_LISTS__CARRIERS, null, msgs);
			msgs = basicSetCarriers(newCarriers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CODE_LISTS__CARRIERS, newCarriers, newCarriers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stations getStations() {
		return stations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStations(Stations newStations, NotificationChain msgs) {
		Stations oldStations = stations;
		stations = newStations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.CODE_LISTS__STATIONS, oldStations, newStations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStations(Stations newStations) {
		if (newStations != stations) {
			NotificationChain msgs = null;
			if (stations != null)
				msgs = ((InternalEObject)stations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CODE_LISTS__STATIONS, null, msgs);
			if (newStations != null)
				msgs = ((InternalEObject)newStations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CODE_LISTS__STATIONS, null, msgs);
			msgs = basicSetStations(newStations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CODE_LISTS__STATIONS, newStations, newStations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Countries getCountries() {
		return countries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountries(Countries newCountries, NotificationChain msgs) {
		Countries oldCountries = countries;
		countries = newCountries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.CODE_LISTS__COUNTRIES, oldCountries, newCountries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountries(Countries newCountries) {
		if (newCountries != countries) {
			NotificationChain msgs = null;
			if (countries != null)
				msgs = ((InternalEObject)countries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CODE_LISTS__COUNTRIES, null, msgs);
			if (newCountries != null)
				msgs = ((InternalEObject)newCountries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CODE_LISTS__COUNTRIES, null, msgs);
			msgs = basicSetCountries(newCountries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CODE_LISTS__COUNTRIES, newCountries, newCountries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Languages getLanguages() {
		return languages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguages(Languages newLanguages, NotificationChain msgs) {
		Languages oldLanguages = languages;
		languages = newLanguages;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.CODE_LISTS__LANGUAGES, oldLanguages, newLanguages);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguages(Languages newLanguages) {
		if (newLanguages != languages) {
			NotificationChain msgs = null;
			if (languages != null)
				msgs = ((InternalEObject)languages).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CODE_LISTS__LANGUAGES, null, msgs);
			if (newLanguages != null)
				msgs = ((InternalEObject)newLanguages).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CODE_LISTS__LANGUAGES, null, msgs);
			msgs = basicSetLanguages(newLanguages, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CODE_LISTS__LANGUAGES, newLanguages, newLanguages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Currencies getCurrencies() {
		return currencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrencies(Currencies newCurrencies, NotificationChain msgs) {
		Currencies oldCurrencies = currencies;
		currencies = newCurrencies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.CODE_LISTS__CURRENCIES, oldCurrencies, newCurrencies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrencies(Currencies newCurrencies) {
		if (newCurrencies != currencies) {
			NotificationChain msgs = null;
			if (currencies != null)
				msgs = ((InternalEObject)currencies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CODE_LISTS__CURRENCIES, null, msgs);
			if (newCurrencies != null)
				msgs = ((InternalEObject)newCurrencies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CODE_LISTS__CURRENCIES, null, msgs);
			msgs = basicSetCurrencies(newCurrencies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CODE_LISTS__CURRENCIES, newCurrencies, newCurrencies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBrands getServiceBrands() {
		return serviceBrands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceBrands(ServiceBrands newServiceBrands, NotificationChain msgs) {
		ServiceBrands oldServiceBrands = serviceBrands;
		serviceBrands = newServiceBrands;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.CODE_LISTS__SERVICE_BRANDS, oldServiceBrands, newServiceBrands);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceBrands(ServiceBrands newServiceBrands) {
		if (newServiceBrands != serviceBrands) {
			NotificationChain msgs = null;
			if (serviceBrands != null)
				msgs = ((InternalEObject)serviceBrands).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CODE_LISTS__SERVICE_BRANDS, null, msgs);
			if (newServiceBrands != null)
				msgs = ((InternalEObject)newServiceBrands).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CODE_LISTS__SERVICE_BRANDS, null, msgs);
			msgs = basicSetServiceBrands(newServiceBrands, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CODE_LISTS__SERVICE_BRANDS, newServiceBrands, newServiceBrands));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUTSCodes getNutsCodes() {
		return nutsCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNutsCodes(NUTSCodes newNutsCodes, NotificationChain msgs) {
		NUTSCodes oldNutsCodes = nutsCodes;
		nutsCodes = newNutsCodes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.CODE_LISTS__NUTS_CODES, oldNutsCodes, newNutsCodes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNutsCodes(NUTSCodes newNutsCodes) {
		if (newNutsCodes != nutsCodes) {
			NotificationChain msgs = null;
			if (nutsCodes != null)
				msgs = ((InternalEObject)nutsCodes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CODE_LISTS__NUTS_CODES, null, msgs);
			if (newNutsCodes != null)
				msgs = ((InternalEObject)newNutsCodes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CODE_LISTS__NUTS_CODES, null, msgs);
			msgs = basicSetNutsCodes(newNutsCodes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CODE_LISTS__NUTS_CODES, newNutsCodes, newNutsCodes));
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
				return basicSetCarriers(null, msgs);
			case GtmPackage.CODE_LISTS__STATIONS:
				return basicSetStations(null, msgs);
			case GtmPackage.CODE_LISTS__COUNTRIES:
				return basicSetCountries(null, msgs);
			case GtmPackage.CODE_LISTS__LANGUAGES:
				return basicSetLanguages(null, msgs);
			case GtmPackage.CODE_LISTS__CURRENCIES:
				return basicSetCurrencies(null, msgs);
			case GtmPackage.CODE_LISTS__SERVICE_BRANDS:
				return basicSetServiceBrands(null, msgs);
			case GtmPackage.CODE_LISTS__NUTS_CODES:
				return basicSetNutsCodes(null, msgs);
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
				setCarriers((Carriers)newValue);
				return;
			case GtmPackage.CODE_LISTS__STATIONS:
				setStations((Stations)newValue);
				return;
			case GtmPackage.CODE_LISTS__COUNTRIES:
				setCountries((Countries)newValue);
				return;
			case GtmPackage.CODE_LISTS__LANGUAGES:
				setLanguages((Languages)newValue);
				return;
			case GtmPackage.CODE_LISTS__CURRENCIES:
				setCurrencies((Currencies)newValue);
				return;
			case GtmPackage.CODE_LISTS__SERVICE_BRANDS:
				setServiceBrands((ServiceBrands)newValue);
				return;
			case GtmPackage.CODE_LISTS__NUTS_CODES:
				setNutsCodes((NUTSCodes)newValue);
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
				setCarriers((Carriers)null);
				return;
			case GtmPackage.CODE_LISTS__STATIONS:
				setStations((Stations)null);
				return;
			case GtmPackage.CODE_LISTS__COUNTRIES:
				setCountries((Countries)null);
				return;
			case GtmPackage.CODE_LISTS__LANGUAGES:
				setLanguages((Languages)null);
				return;
			case GtmPackage.CODE_LISTS__CURRENCIES:
				setCurrencies((Currencies)null);
				return;
			case GtmPackage.CODE_LISTS__SERVICE_BRANDS:
				setServiceBrands((ServiceBrands)null);
				return;
			case GtmPackage.CODE_LISTS__NUTS_CODES:
				setNutsCodes((NUTSCodes)null);
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
				return carriers != null;
			case GtmPackage.CODE_LISTS__STATIONS:
				return stations != null;
			case GtmPackage.CODE_LISTS__COUNTRIES:
				return countries != null;
			case GtmPackage.CODE_LISTS__LANGUAGES:
				return languages != null;
			case GtmPackage.CODE_LISTS__CURRENCIES:
				return currencies != null;
			case GtmPackage.CODE_LISTS__SERVICE_BRANDS:
				return serviceBrands != null;
			case GtmPackage.CODE_LISTS__NUTS_CODES:
				return nutsCodes != null;
		}
		return super.eIsSet(featureID);
	}

} //CodeListsImpl
