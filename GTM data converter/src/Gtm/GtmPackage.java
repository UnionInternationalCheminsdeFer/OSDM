/**
 */
package Gtm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Gtm.GtmFactory
 * @model kind="package"
 * @generated
 */
public interface GtmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Gtm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/GTM%20data%20converter/model/gtm.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Gtm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GtmPackage eINSTANCE = Gtm.impl.GtmPackageImpl.init();

	/**
	 * The meta object id for the '{@link Gtm.impl.GTMToolImpl <em>GTM Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.GTMToolImpl
	 * @see Gtm.impl.GtmPackageImpl#getGTMTool()
	 * @generated
	 */
	int GTM_TOOL = 0;

	/**
	 * The feature id for the '<em><b>Conversion From Legacy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTM_TOOL__CONVERSION_FROM_LEGACY = 0;

	/**
	 * The feature id for the '<em><b>Code Lists</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTM_TOOL__CODE_LISTS = 1;

	/**
	 * The feature id for the '<em><b>General Tariff Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTM_TOOL__GENERAL_TARIFF_MODEL = 2;

	/**
	 * The number of structural features of the '<em>GTM Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTM_TOOL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>GTM Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTM_TOOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.CodeListsImpl <em>Code Lists</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CodeListsImpl
	 * @see Gtm.impl.GtmPackageImpl#getCodeLists()
	 * @generated
	 */
	int CODE_LISTS = 1;

	/**
	 * The feature id for the '<em><b>Carriers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTS__CARRIERS = 0;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTS__STATIONS = 1;

	/**
	 * The feature id for the '<em><b>Countries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTS__COUNTRIES = 2;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTS__LANGUAGES = 3;

	/**
	 * The feature id for the '<em><b>Currencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTS__CURRENCIES = 4;

	/**
	 * The feature id for the '<em><b>Service Brands</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTS__SERVICE_BRANDS = 5;

	/**
	 * The feature id for the '<em><b>Nuts Codes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTS__NUTS_CODES = 6;

	/**
	 * The number of structural features of the '<em>Code Lists</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTS_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Code Lists</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.NUTSCodesImpl <em>NUTS Codes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.NUTSCodesImpl
	 * @see Gtm.impl.GtmPackageImpl#getNUTSCodes()
	 * @generated
	 */
	int NUTS_CODES = 2;

	/**
	 * The feature id for the '<em><b>Nuts Codes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTS_CODES__NUTS_CODES = 0;

	/**
	 * The number of structural features of the '<em>NUTS Codes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTS_CODES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>NUTS Codes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTS_CODES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.NutsCodeImpl <em>Nuts Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.NutsCodeImpl
	 * @see Gtm.impl.GtmPackageImpl#getNutsCode()
	 * @generated
	 */
	int NUTS_CODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTS_CODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTS_CODE__CODE = 1;

	/**
	 * The number of structural features of the '<em>Nuts Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTS_CODE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Nuts Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTS_CODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.ServiceBrandsImpl <em>Service Brands</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ServiceBrandsImpl
	 * @see Gtm.impl.GtmPackageImpl#getServiceBrands()
	 * @generated
	 */
	int SERVICE_BRANDS = 4;

	/**
	 * The feature id for the '<em><b>Service Brands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BRANDS__SERVICE_BRANDS = 0;

	/**
	 * The number of structural features of the '<em>Service Brands</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BRANDS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Find Service BRand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BRANDS___FIND_SERVICE_BRAND__INT = 0;

	/**
	 * The number of operations of the '<em>Service Brands</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BRANDS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Gtm.impl.ServiceBrandImpl <em>Service Brand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ServiceBrandImpl
	 * @see Gtm.impl.GtmPackageImpl#getServiceBrand()
	 * @generated
	 */
	int SERVICE_BRAND = 5;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BRAND__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BRAND__NAME = 1;

	/**
	 * The feature id for the '<em><b>Abbreviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BRAND__ABBREVIATION = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BRAND__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Service Brand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BRAND_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Service Brand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BRAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.CountriesImpl <em>Countries</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CountriesImpl
	 * @see Gtm.impl.GtmPackageImpl#getCountries()
	 * @generated
	 */
	int COUNTRIES = 6;

	/**
	 * The feature id for the '<em><b>Countries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRIES__COUNTRIES = 0;

	/**
	 * The number of structural features of the '<em>Countries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRIES_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Find Country</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRIES___FIND_COUNTRY__INT = 0;

	/**
	 * The number of operations of the '<em>Countries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRIES_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Gtm.impl.CountryImpl <em>Country</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CountryImpl
	 * @see Gtm.impl.GtmPackageImpl#getCountry()
	 * @generated
	 */
	int COUNTRY = 7;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__NAME = 1;

	/**
	 * The feature id for the '<em><b>IS Ocode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__IS_OCODE = 2;

	/**
	 * The number of structural features of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.LanguagesImpl <em>Languages</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LanguagesImpl
	 * @see Gtm.impl.GtmPackageImpl#getLanguages()
	 * @generated
	 */
	int LANGUAGES = 8;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGES__LANGUAGES = 0;

	/**
	 * The number of structural features of the '<em>Languages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Languages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.LanguageImpl <em>Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LanguageImpl
	 * @see Gtm.impl.GtmPackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__CODE = 1;

	/**
	 * The number of structural features of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.CurrenciesImpl <em>Currencies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CurrenciesImpl
	 * @see Gtm.impl.GtmPackageImpl#getCurrencies()
	 * @generated
	 */
	int CURRENCIES = 10;

	/**
	 * The feature id for the '<em><b>Currencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCIES__CURRENCIES = 0;

	/**
	 * The number of structural features of the '<em>Currencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCIES_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Find Currency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCIES___FIND_CURRENCY__STRING = 0;

	/**
	 * The number of operations of the '<em>Currencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCIES_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Gtm.impl.CurrencyImpl <em>Currency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CurrencyImpl
	 * @see Gtm.impl.GtmPackageImpl#getCurrency()
	 * @generated
	 */
	int CURRENCY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Iso Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY__ISO_CODE = 1;

	/**
	 * The number of structural features of the '<em>Currency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Currency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.StationsImpl <em>Stations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.StationsImpl
	 * @see Gtm.impl.GtmPackageImpl#getStations()
	 * @generated
	 */
	int STATIONS = 12;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONS__STATIONS = 0;

	/**
	 * The number of structural features of the '<em>Stations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Find Station</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONS___FIND_STATION__INT_INT = 0;

	/**
	 * The operation id for the '<em>Find Station</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONS___FIND_STATION__INT_STRING = 1;

	/**
	 * The number of operations of the '<em>Stations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONS_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link Gtm.impl.StationImpl <em>Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.StationImpl
	 * @see Gtm.impl.GtmPackageImpl#getStation()
	 * @generated
	 */
	int STATION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__COUNTRY = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__CODE = 2;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__LONGITUDE = 3;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__LATITUDE = 4;

	/**
	 * The feature id for the '<em><b>Timetable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__TIMETABLE_NAME = 5;

	/**
	 * The feature id for the '<em><b>Border Station</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__BORDER_STATION = 6;

	/**
	 * The feature id for the '<em><b>Name Case UTF8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__NAME_CASE_UTF8 = 7;

	/**
	 * The feature id for the '<em><b>Name Case ASCII</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__NAME_CASE_ASCII = 8;

	/**
	 * The feature id for the '<em><b>Short Name Case ASCII</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__SHORT_NAME_CASE_ASCII = 9;

	/**
	 * The feature id for the '<em><b>Short Name Case UTF8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__SHORT_NAME_CASE_UTF8 = 10;

	/**
	 * The number of structural features of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.CarrierImpl <em>Carrier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CarrierImpl
	 * @see Gtm.impl.GtmPackageImpl#getCarrier()
	 * @generated
	 */
	int CARRIER = 14;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER__SHORT_NAME = 2;

	/**
	 * The number of structural features of the '<em>Carrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Carrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.CarriersImpl <em>Carriers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CarriersImpl
	 * @see Gtm.impl.GtmPackageImpl#getCarriers()
	 * @generated
	 */
	int CARRIERS = 15;

	/**
	 * The feature id for the '<em><b>Carriers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIERS__CARRIERS = 0;

	/**
	 * The number of structural features of the '<em>Carriers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIERS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Find Carrier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIERS___FIND_CARRIER__STRING = 0;

	/**
	 * The number of operations of the '<em>Carriers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIERS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Gtm.impl.StationSetImpl <em>Station Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.StationSetImpl
	 * @see Gtm.impl.GtmPackageImpl#getStationSet()
	 * @generated
	 */
	int STATION_SET = 16;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SET__STATIONS = 0;

	/**
	 * The number of structural features of the '<em>Station Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Station Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.GeneralTariffModelImpl <em>General Tariff Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.GeneralTariffModelImpl
	 * @see Gtm.impl.GtmPackageImpl#getGeneralTariffModel()
	 * @generated
	 */
	int GENERAL_TARIFF_MODEL = 17;

	/**
	 * The feature id for the '<em><b>Delivery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_TARIFF_MODEL__DELIVERY = 0;

	/**
	 * The feature id for the '<em><b>Fare Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_TARIFF_MODEL__FARE_STRUCTURE = 1;

	/**
	 * The number of structural features of the '<em>General Tariff Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_TARIFF_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>General Tariff Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_TARIFF_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.DeliveryImpl <em>Delivery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.DeliveryImpl
	 * @see Gtm.impl.GtmPackageImpl#getDelivery()
	 * @generated
	 */
	int DELIVERY = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__ID = 0;

	/**
	 * The feature id for the '<em><b>Previous Delivery Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__PREVIOUS_DELIVERY_ID = 1;

	/**
	 * The feature id for the '<em><b>Replaced Delivery Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__REPLACED_DELIVERY_ID = 2;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__OPTIONAL = 3;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__PROVIDER = 4;

	/**
	 * The feature id for the '<em><b>Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__SCHEMA_VERSION = 5;

	/**
	 * The feature id for the '<em><b>Accepted Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__ACCEPTED_SCHEMA_VERSION = 6;

	/**
	 * The number of structural features of the '<em>Delivery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Delivery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.AfterSalesRulesImpl <em>After Sales Rules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.AfterSalesRulesImpl
	 * @see Gtm.impl.GtmPackageImpl#getAfterSalesRules()
	 * @generated
	 */
	int AFTER_SALES_RULES = 19;

	/**
	 * The feature id for the '<em><b>After Sales Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_RULES__AFTER_SALES_RULES = 0;

	/**
	 * The number of structural features of the '<em>After Sales Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_RULES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>After Sales Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_RULES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.AfterSalesRuleImpl <em>After Sales Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.AfterSalesRuleImpl
	 * @see Gtm.impl.GtmPackageImpl#getAfterSalesRule()
	 * @generated
	 */
	int AFTER_SALES_RULE = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_RULE__ID = 0;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_RULE__CONDITIONS = 1;

	/**
	 * The number of structural features of the '<em>After Sales Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_RULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>After Sales Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.AfterSalesConditionImpl <em>After Sales Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.AfterSalesConditionImpl
	 * @see Gtm.impl.GtmPackageImpl#getAfterSalesCondition()
	 * @generated
	 */
	int AFTER_SALES_CONDITION = 21;

	/**
	 * The feature id for the '<em><b>Transaction Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_CONDITION__TRANSACTION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Individual Contracts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_CONDITION__INDIVIDUAL_CONTRACTS = 1;

	/**
	 * The feature id for the '<em><b>Carrier Fee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_CONDITION__CARRIER_FEE = 2;

	/**
	 * The feature id for the '<em><b>Fee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_CONDITION__FEE = 3;

	/**
	 * The feature id for the '<em><b>Application Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_CONDITION__APPLICATION_TIME = 4;

	/**
	 * The number of structural features of the '<em>After Sales Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_CONDITION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>After Sales Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.RelativeTimeImpl <em>Relative Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.RelativeTimeImpl
	 * @see Gtm.impl.GtmPackageImpl#getRelativeTime()
	 * @generated
	 */
	int RELATIVE_TIME = 92;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME__UNIT = 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME__REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Relative Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Relative Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.ApplicationTimeImpl <em>Application Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ApplicationTimeImpl
	 * @see Gtm.impl.GtmPackageImpl#getApplicationTime()
	 * @generated
	 */
	int APPLICATION_TIME = 22;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TIME__UNIT = RELATIVE_TIME__UNIT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TIME__REFERENCE = RELATIVE_TIME__REFERENCE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TIME__VALUE = RELATIVE_TIME__VALUE;

	/**
	 * The number of structural features of the '<em>Application Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TIME_FEATURE_COUNT = RELATIVE_TIME_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Application Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TIME_OPERATION_COUNT = RELATIVE_TIME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.FareStructureImpl <em>Fare Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.FareStructureImpl
	 * @see Gtm.impl.GtmPackageImpl#getFareStructure()
	 * @generated
	 */
	int FARE_STRUCTURE = 23;

	/**
	 * The feature id for the '<em><b>Service Class Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__SERVICE_CLASS_DEFINITIONS = 0;

	/**
	 * The feature id for the '<em><b>Service Level Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__SERVICE_LEVEL_DEFINITIONS = 1;

	/**
	 * The feature id for the '<em><b>Station Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__STATION_NAMES = 2;

	/**
	 * The feature id for the '<em><b>Fare Station Set Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__FARE_STATION_SET_DEFINITIONS = 3;

	/**
	 * The feature id for the '<em><b>Calendars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__CALENDARS = 4;

	/**
	 * The feature id for the '<em><b>Texts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__TEXTS = 5;

	/**
	 * The feature id for the '<em><b>Reduction Cards</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__REDUCTION_CARDS = 6;

	/**
	 * The feature id for the '<em><b>Fare Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__FARE_ELEMENTS = 7;

	/**
	 * The feature id for the '<em><b>Combination Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__COMBINATION_CONSTRAINTS = 8;

	/**
	 * The feature id for the '<em><b>Sales Availability Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__SALES_AVAILABILITY_CONSTRAINTS = 9;

	/**
	 * The feature id for the '<em><b>Travel Validity Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__TRAVEL_VALIDITY_CONSTRAINTS = 10;

	/**
	 * The feature id for the '<em><b>Regional Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__REGIONAL_CONSTRAINTS = 11;

	/**
	 * The feature id for the '<em><b>Connection Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__CONNECTION_POINTS = 12;

	/**
	 * The feature id for the '<em><b>Carrier Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__CARRIER_CONSTRAINTS = 13;

	/**
	 * The feature id for the '<em><b>Service Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__SERVICE_CONSTRAINTS = 14;

	/**
	 * The feature id for the '<em><b>Passenger Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__PASSENGER_CONSTRAINTS = 15;

	/**
	 * The feature id for the '<em><b>Reduction Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__REDUCTION_CONSTRAINTS = 16;

	/**
	 * The feature id for the '<em><b>Personal Data Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__PERSONAL_DATA_CONSTRAINTS = 17;

	/**
	 * The feature id for the '<em><b>After Sales Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__AFTER_SALES_RULES = 18;

	/**
	 * The feature id for the '<em><b>Prices</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__PRICES = 19;

	/**
	 * The feature id for the '<em><b>Fulfillment Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__FULFILLMENT_CONSTRAINTS = 20;

	/**
	 * The feature id for the '<em><b>Reservation Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__RESERVATION_PARAMETERS = 21;

	/**
	 * The feature id for the '<em><b>Supported Online Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__SUPPORTED_ONLINE_SERVICES = 22;

	/**
	 * The feature id for the '<em><b>Fare Resource Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__FARE_RESOURCE_LOCATIONS = 23;

	/**
	 * The number of structural features of the '<em>Fare Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE_FEATURE_COUNT = 24;

	/**
	 * The number of operations of the '<em>Fare Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.ConnectionPointsImpl <em>Connection Points</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ConnectionPointsImpl
	 * @see Gtm.impl.GtmPackageImpl#getConnectionPoints()
	 * @generated
	 */
	int CONNECTION_POINTS = 24;

	/**
	 * The feature id for the '<em><b>Connection Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINTS__CONNECTION_POINTS = 0;

	/**
	 * The number of structural features of the '<em>Connection Points</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINTS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Find Simple Connection Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINTS___FIND_SIMPLE_CONNECTION_POINT__STATION = 0;

	/**
	 * The number of operations of the '<em>Connection Points</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINTS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Gtm.impl.ConnectionPointImpl <em>Connection Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ConnectionPointImpl
	 * @see Gtm.impl.GtmPackageImpl#getConnectionPoint()
	 * @generated
	 */
	int CONNECTION_POINT = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Legacy Border Point Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__LEGACY_BORDER_POINT_CODE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Connected Station Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__CONNECTED_STATION_SETS = 4;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__DATA_SOURCE = 5;

	/**
	 * The feature id for the '<em><b>Name Utf8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__NAME_UTF8 = 6;

	/**
	 * The number of structural features of the '<em>Connection Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Connection Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.FareResourceLocationsImpl <em>Fare Resource Locations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.FareResourceLocationsImpl
	 * @see Gtm.impl.GtmPackageImpl#getFareResourceLocations()
	 * @generated
	 */
	int FARE_RESOURCE_LOCATIONS = 26;

	/**
	 * The feature id for the '<em><b>Train Resource Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_RESOURCE_LOCATIONS__TRAIN_RESOURCE_LOCATIONS = 0;

	/**
	 * The feature id for the '<em><b>Station Resource Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_RESOURCE_LOCATIONS__STATION_RESOURCE_LOCATIONS = 1;

	/**
	 * The feature id for the '<em><b>Carrier Resource Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_RESOURCE_LOCATIONS__CARRIER_RESOURCE_LOCATIONS = 2;

	/**
	 * The number of structural features of the '<em>Fare Resource Locations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_RESOURCE_LOCATIONS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Fare Resource Locations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_RESOURCE_LOCATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.TrainResourceLocationsImpl <em>Train Resource Locations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.TrainResourceLocationsImpl
	 * @see Gtm.impl.GtmPackageImpl#getTrainResourceLocations()
	 * @generated
	 */
	int TRAIN_RESOURCE_LOCATIONS = 27;

	/**
	 * The feature id for the '<em><b>Train Resource Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_RESOURCE_LOCATIONS__TRAIN_RESOURCE_LOCATIONS = 0;

	/**
	 * The number of structural features of the '<em>Train Resource Locations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_RESOURCE_LOCATIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Train Resource Locations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_RESOURCE_LOCATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.StationResourceLocationsImpl <em>Station Resource Locations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.StationResourceLocationsImpl
	 * @see Gtm.impl.GtmPackageImpl#getStationResourceLocations()
	 * @generated
	 */
	int STATION_RESOURCE_LOCATIONS = 28;

	/**
	 * The feature id for the '<em><b>Station Resource Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_RESOURCE_LOCATIONS__STATION_RESOURCE_LOCATIONS = 0;

	/**
	 * The number of structural features of the '<em>Station Resource Locations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_RESOURCE_LOCATIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Station Resource Locations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_RESOURCE_LOCATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.CarrierResourceLocationsImpl <em>Carrier Resource Locations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CarrierResourceLocationsImpl
	 * @see Gtm.impl.GtmPackageImpl#getCarrierResourceLocations()
	 * @generated
	 */
	int CARRIER_RESOURCE_LOCATIONS = 29;

	/**
	 * The feature id for the '<em><b>Carrier Resource Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_RESOURCE_LOCATIONS__CARRIER_RESOURCE_LOCATIONS = 0;

	/**
	 * The number of structural features of the '<em>Carrier Resource Locations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_RESOURCE_LOCATIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Carrier Resource Locations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_RESOURCE_LOCATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.TrainResourceLocationImpl <em>Train Resource Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.TrainResourceLocationImpl
	 * @see Gtm.impl.GtmPackageImpl#getTrainResourceLocation()
	 * @generated
	 */
	int TRAIN_RESOURCE_LOCATION = 30;

	/**
	 * The feature id for the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_RESOURCE_LOCATION__CARRIER = 0;

	/**
	 * The feature id for the '<em><b>Online Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_RESOURCE_LOCATION__ONLINE_RESOURCES = 1;

	/**
	 * The feature id for the '<em><b>Train Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_RESOURCE_LOCATION__TRAIN_ID = 2;

	/**
	 * The number of structural features of the '<em>Train Resource Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_RESOURCE_LOCATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Train Resource Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_RESOURCE_LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.StationResourceLocationImpl <em>Station Resource Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.StationResourceLocationImpl
	 * @see Gtm.impl.GtmPackageImpl#getStationResourceLocation()
	 * @generated
	 */
	int STATION_RESOURCE_LOCATION = 31;

	/**
	 * The feature id for the '<em><b>Online Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_RESOURCE_LOCATION__ONLINE_RESOURCES = 0;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_RESOURCE_LOCATION__STATIONS = 1;

	/**
	 * The feature id for the '<em><b>Connection Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_RESOURCE_LOCATION__CONNECTION_POINTS = 2;

	/**
	 * The number of structural features of the '<em>Station Resource Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_RESOURCE_LOCATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Station Resource Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_RESOURCE_LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.OnlineResourceImpl <em>Online Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.OnlineResourceImpl
	 * @see Gtm.impl.GtmPackageImpl#getOnlineResource()
	 * @generated
	 */
	int ONLINE_RESOURCE = 32;

	/**
	 * The feature id for the '<em><b>Offer Request Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_RESOURCE__OFFER_REQUEST_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_RESOURCE__INTERFACE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_RESOURCE__VERSION = 2;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_RESOURCE__SYSTEM = 3;

	/**
	 * The number of structural features of the '<em>Online Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_RESOURCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Online Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.FulfillmentConstraintsImpl <em>Fulfillment Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.FulfillmentConstraintsImpl
	 * @see Gtm.impl.GtmPackageImpl#getFulfillmentConstraints()
	 * @generated
	 */
	int FULFILLMENT_CONSTRAINTS = 33;

	/**
	 * The feature id for the '<em><b>Fulfillment Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINTS__FULFILLMENT_CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Fulfillment Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Fulfillment Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.FulfillmentConstraintImpl <em>Fulfillment Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.FulfillmentConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getFulfillmentConstraint()
	 * @generated
	 */
	int FULFILLMENT_CONSTRAINT = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Accepted Fulfilment Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT__ACCEPTED_FULFILMENT_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Required Control Data Exchange</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT__REQUIRED_CONTROL_DATA_EXCHANGE = 2;

	/**
	 * The feature id for the '<em><b>Individual Ticketing Permitted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT__INDIVIDUAL_TICKETING_PERMITTED = 3;

	/**
	 * The feature id for the '<em><b>Accepted Barcodes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODES = 4;

	/**
	 * The feature id for the '<em><b>Required Barcodes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT__REQUIRED_BARCODES = 5;

	/**
	 * The number of structural features of the '<em>Fulfillment Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Fulfillment Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.RequiredBarcodesImpl <em>Required Barcodes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.RequiredBarcodesImpl
	 * @see Gtm.impl.GtmPackageImpl#getRequiredBarcodes()
	 * @generated
	 */
	int REQUIRED_BARCODES = 35;

	/**
	 * The feature id for the '<em><b>Required Barcodes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_BARCODES__REQUIRED_BARCODES = 0;

	/**
	 * The number of structural features of the '<em>Required Barcodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_BARCODES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Required Barcodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_BARCODES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.AcceptedBarcodesImpl <em>Accepted Barcodes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.AcceptedBarcodesImpl
	 * @see Gtm.impl.GtmPackageImpl#getAcceptedBarcodes()
	 * @generated
	 */
	int ACCEPTED_BARCODES = 36;

	/**
	 * The feature id for the '<em><b>Accepted Barcodes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTED_BARCODES__ACCEPTED_BARCODES = 0;

	/**
	 * The number of structural features of the '<em>Accepted Barcodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTED_BARCODES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Accepted Barcodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTED_BARCODES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.SupportedOnlineServicesImpl <em>Supported Online Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.SupportedOnlineServicesImpl
	 * @see Gtm.impl.GtmPackageImpl#getSupportedOnlineServices()
	 * @generated
	 */
	int SUPPORTED_ONLINE_SERVICES = 37;

	/**
	 * The feature id for the '<em><b>Supported Online Services</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ONLINE_SERVICES__SUPPORTED_ONLINE_SERVICES = 0;

	/**
	 * The number of structural features of the '<em>Supported Online Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ONLINE_SERVICES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Supported Online Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ONLINE_SERVICES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.StationNamesImpl <em>Station Names</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.StationNamesImpl
	 * @see Gtm.impl.GtmPackageImpl#getStationNames()
	 * @generated
	 */
	int STATION_NAMES = 38;

	/**
	 * The feature id for the '<em><b>Station Name</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_NAMES__STATION_NAME = 0;

	/**
	 * The number of structural features of the '<em>Station Names</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_NAMES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Station Names</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_NAMES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.FareElementImpl <em>Fare Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.FareElementImpl
	 * @see Gtm.impl.GtmPackageImpl#getFareElement()
	 * @generated
	 */
	int FARE_ELEMENT = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__DATA_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__TEXT = 3;

	/**
	 * The feature id for the '<em><b>Price</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__PRICE = 4;

	/**
	 * The feature id for the '<em><b>Regional Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__REGIONAL_CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Service Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__SERVICE_CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Carrier Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__CARRIER_CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Service Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__SERVICE_CLASS = 8;

	/**
	 * The feature id for the '<em><b>Service Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__SERVICE_LEVEL = 9;

	/**
	 * The feature id for the '<em><b>Sales Availability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__SALES_AVAILABILITY = 10;

	/**
	 * The feature id for the '<em><b>Travel Validity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__TRAVEL_VALIDITY = 11;

	/**
	 * The feature id for the '<em><b>Combination Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__COMBINATION_CONSTRAINT = 12;

	/**
	 * The feature id for the '<em><b>Fare Detail Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__FARE_DETAIL_DESCRIPTION = 13;

	/**
	 * The feature id for the '<em><b>Personal Data Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__PERSONAL_DATA_CONSTRAINT = 14;

	/**
	 * The feature id for the '<em><b>Reservation Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__RESERVATION_PARAMETER = 15;

	/**
	 * The feature id for the '<em><b>Reduction Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__REDUCTION_CONSTRAINT = 16;

	/**
	 * The feature id for the '<em><b>Fulfillment Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__FULFILLMENT_CONSTRAINT = 17;

	/**
	 * The feature id for the '<em><b>Passenger Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__PASSENGER_CONSTRAINT = 18;

	/**
	 * The feature id for the '<em><b>After Sales Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__AFTER_SALES_RULE = 19;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__DATA_SOURCE = 20;

	/**
	 * The feature id for the '<em><b>Legacy Accounting Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__LEGACY_ACCOUNTING_IDENTIFIER = 21;

	/**
	 * The number of structural features of the '<em>Fare Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT_FEATURE_COUNT = 22;

	/**
	 * The number of operations of the '<em>Fare Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.FareStationSetDefinitionsImpl <em>Fare Station Set Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.FareStationSetDefinitionsImpl
	 * @see Gtm.impl.GtmPackageImpl#getFareStationSetDefinitions()
	 * @generated
	 */
	int FARE_STATION_SET_DEFINITIONS = 40;

	/**
	 * The feature id for the '<em><b>Fare Station Set Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITIONS__FARE_STATION_SET_DEFINITIONS = 0;

	/**
	 * The number of structural features of the '<em>Fare Station Set Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITIONS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Find Fare Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITIONS___FIND_FARE_SET__CARRIER_INT = 0;

	/**
	 * The number of operations of the '<em>Fare Station Set Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITIONS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Gtm.impl.FareStationSetDefinitionImpl <em>Fare Station Set Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.FareStationSetDefinitionImpl
	 * @see Gtm.impl.GtmPackageImpl#getFareStationSetDefinition()
	 * @generated
	 */
	int FARE_STATION_SET_DEFINITION = 41;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITION__DATA_SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITION__CARRIER = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITION__CODE = 2;

	/**
	 * The feature id for the '<em><b>Legacy Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITION__LEGACY_CODE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITION__ID = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITION__NAME = 5;

	/**
	 * The feature id for the '<em><b>Name Utf8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITION__NAME_UTF8 = 6;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITION__STATIONS = 7;

	/**
	 * The number of structural features of the '<em>Fare Station Set Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Fare Station Set Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyAccountingIdentifierImpl <em>Legacy Accounting Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyAccountingIdentifierImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyAccountingIdentifier()
	 * @generated
	 */
	int LEGACY_ACCOUNTING_IDENTIFIER = 42;

	/**
	 * The feature id for the '<em><b>Series Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ACCOUNTING_IDENTIFIER__SERIES_ID = 0;

	/**
	 * The feature id for the '<em><b>Tariff Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ACCOUNTING_IDENTIFIER__TARIFF_ID = 1;

	/**
	 * The feature id for the '<em><b>Add Series Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ACCOUNTING_IDENTIFIER__ADD_SERIES_ID = 2;

	/**
	 * The number of structural features of the '<em>Legacy Accounting Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ACCOUNTING_IDENTIFIER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Legacy Accounting Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ACCOUNTING_IDENTIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.ReductionConstraintsImpl <em>Reduction Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ReductionConstraintsImpl
	 * @see Gtm.impl.GtmPackageImpl#getReductionConstraints()
	 * @generated
	 */
	int REDUCTION_CONSTRAINTS = 43;

	/**
	 * The feature id for the '<em><b>Reduction Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CONSTRAINTS__REDUCTION_CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Reduction Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Reduction Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.FareElementsImpl <em>Fare Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.FareElementsImpl
	 * @see Gtm.impl.GtmPackageImpl#getFareElements()
	 * @generated
	 */
	int FARE_ELEMENTS = 44;

	/**
	 * The feature id for the '<em><b>Fare Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENTS__FARE_ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Fare Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Fare Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.PersonalDataConstraintsImpl <em>Personal Data Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.PersonalDataConstraintsImpl
	 * @see Gtm.impl.GtmPackageImpl#getPersonalDataConstraints()
	 * @generated
	 */
	int PERSONAL_DATA_CONSTRAINTS = 45;

	/**
	 * The feature id for the '<em><b>Personal Data Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_CONSTRAINTS__PERSONAL_DATA_CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Personal Data Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Personal Data Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.PersonalDataConstraintImpl <em>Personal Data Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.PersonalDataConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getPersonalDataConstraint()
	 * @generated
	 */
	int PERSONAL_DATA_CONSTRAINT = 46;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Required Personal Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_CONSTRAINT__REQUIRED_PERSONAL_DATA = 1;

	/**
	 * The feature id for the '<em><b>Allowed Changes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_CONSTRAINT__ALLOWED_CHANGES = 2;

	/**
	 * The number of structural features of the '<em>Personal Data Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Personal Data Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.RequiredPersonalDataImpl <em>Required Personal Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.RequiredPersonalDataImpl
	 * @see Gtm.impl.GtmPackageImpl#getRequiredPersonalData()
	 * @generated
	 */
	int REQUIRED_PERSONAL_DATA = 47;

	/**
	 * The feature id for the '<em><b>Ticket Holder Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PERSONAL_DATA__TICKET_HOLDER_ONLY = 0;

	/**
	 * The feature id for the '<em><b>Data Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PERSONAL_DATA__DATA_ITEM = 1;

	/**
	 * The feature id for the '<em><b>Transfer</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PERSONAL_DATA__TRANSFER = 2;

	/**
	 * The feature id for the '<em><b>Fulfillment Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PERSONAL_DATA__FULFILLMENT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Cross Border</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PERSONAL_DATA__CROSS_BORDER = 4;

	/**
	 * The number of structural features of the '<em>Required Personal Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PERSONAL_DATA_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Required Personal Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PERSONAL_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.AllowedPersonalDataChangesImpl <em>Allowed Personal Data Changes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.AllowedPersonalDataChangesImpl
	 * @see Gtm.impl.GtmPackageImpl#getAllowedPersonalDataChanges()
	 * @generated
	 */
	int ALLOWED_PERSONAL_DATA_CHANGES = 48;

	/**
	 * The feature id for the '<em><b>Time Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_PERSONAL_DATA_CHANGES__TIME_LIMIT = 0;

	/**
	 * The feature id for the '<em><b>Accepted Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_PERSONAL_DATA_CHANGES__ACCEPTED_REASON = 1;

	/**
	 * The number of structural features of the '<em>Allowed Personal Data Changes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_PERSONAL_DATA_CHANGES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Allowed Personal Data Changes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_PERSONAL_DATA_CHANGES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.PassengerConstraintsImpl <em>Passenger Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.PassengerConstraintsImpl
	 * @see Gtm.impl.GtmPackageImpl#getPassengerConstraints()
	 * @generated
	 */
	int PASSENGER_CONSTRAINTS = 49;

	/**
	 * The feature id for the '<em><b>Passenger Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINTS__PASSENGER_CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Passenger Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Passenger Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.PassengerConstraintImpl <em>Passenger Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.PassengerConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getPassengerConstraint()
	 * @generated
	 */
	int PASSENGER_CONSTRAINT = 50;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Traveler Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__TRAVELER_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__TEXT = 2;

	/**
	 * The feature id for the '<em><b>Upper Age Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__UPPER_AGE_LIMIT = 3;

	/**
	 * The feature id for the '<em><b>Lower Age Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__LOWER_AGE_LIMIT = 4;

	/**
	 * The feature id for the '<em><b>Travel Alone Age Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__TRAVEL_ALONE_AGE_LIMIT = 5;

	/**
	 * The feature id for the '<em><b>Reservation Age Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__RESERVATION_AGE_LIMIT = 6;

	/**
	 * The feature id for the '<em><b>Is Ancilliary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__IS_ANCILLIARY = 7;

	/**
	 * The feature id for the '<em><b>Passenger Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__PASSENGER_WEIGHT = 8;

	/**
	 * The feature id for the '<em><b>Max Total Passenger Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__MAX_TOTAL_PASSENGER_WEIGHT = 9;

	/**
	 * The feature id for the '<em><b>Min Total Passenger Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__MIN_TOTAL_PASSENGER_WEIGHT = 10;

	/**
	 * The feature id for the '<em><b>Included Free Passengers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__INCLUDED_FREE_PASSENGERS = 11;

	/**
	 * The feature id for the '<em><b>Excluded Passenger Combinations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__EXCLUDED_PASSENGER_COMBINATIONS = 12;

	/**
	 * The number of structural features of the '<em>Passenger Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Passenger Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.PassengerCombinationConstraintImpl <em>Passenger Combination Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.PassengerCombinationConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getPassengerCombinationConstraint()
	 * @generated
	 */
	int PASSENGER_COMBINATION_CONSTRAINT = 51;

	/**
	 * The feature id for the '<em><b>Max Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_COMBINATION_CONSTRAINT__MAX_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Passenger Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_COMBINATION_CONSTRAINT__PASSENGER_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Passenger Combination Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_COMBINATION_CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Passenger Combination Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_COMBINATION_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.IncludedFreePassengerLimitImpl <em>Included Free Passenger Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.IncludedFreePassengerLimitImpl
	 * @see Gtm.impl.GtmPackageImpl#getIncludedFreePassengerLimit()
	 * @generated
	 */
	int INCLUDED_FREE_PASSENGER_LIMIT = 52;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_FREE_PASSENGER_LIMIT__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Passenger Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_FREE_PASSENGER_LIMIT__PASSENGER_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Included Free Passenger Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_FREE_PASSENGER_LIMIT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Included Free Passenger Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_FREE_PASSENGER_LIMIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.CombinationConstraintsImpl <em>Combination Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CombinationConstraintsImpl
	 * @see Gtm.impl.GtmPackageImpl#getCombinationConstraints()
	 * @generated
	 */
	int COMBINATION_CONSTRAINTS = 53;

	/**
	 * The feature id for the '<em><b>Combination Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_CONSTRAINTS__COMBINATION_CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Combination Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Combination Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.CombinationConstraintImpl <em>Combination Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CombinationConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getCombinationConstraint()
	 * @generated
	 */
	int COMBINATION_CONSTRAINT = 54;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_CONSTRAINT__DATA_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Combination Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_CONSTRAINT__COMBINATION_MODELS = 2;

	/**
	 * The number of structural features of the '<em>Combination Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Combination Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.TravelValidityConstraintsImpl <em>Travel Validity Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.TravelValidityConstraintsImpl
	 * @see Gtm.impl.GtmPackageImpl#getTravelValidityConstraints()
	 * @generated
	 */
	int TRAVEL_VALIDITY_CONSTRAINTS = 55;

	/**
	 * The feature id for the '<em><b>Travel Validity Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINTS__TRAVEL_VALIDITY_CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Travel Validity Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Travel Validity Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.TravelValidityConstraintImpl <em>Travel Validity Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.TravelValidityConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getTravelValidityConstraint()
	 * @generated
	 */
	int TRAVEL_VALIDITY_CONSTRAINT = 56;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT__DATA_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Valid Days</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT__VALID_DAYS = 2;

	/**
	 * The feature id for the '<em><b>Travel Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT__TRAVEL_DAYS = 3;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT__RANGE = 4;

	/**
	 * The feature id for the '<em><b>Return Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT__RETURN_CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Excluded Time Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT__EXCLUDED_TIME_RANGE = 6;

	/**
	 * The number of structural features of the '<em>Travel Validity Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Travel Validity Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.SalesAvailabilityConstraintsImpl <em>Sales Availability Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.SalesAvailabilityConstraintsImpl
	 * @see Gtm.impl.GtmPackageImpl#getSalesAvailabilityConstraints()
	 * @generated
	 */
	int SALES_AVAILABILITY_CONSTRAINTS = 57;

	/**
	 * The feature id for the '<em><b>Sales Availability Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_AVAILABILITY_CONSTRAINTS__SALES_AVAILABILITY_CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Sales Availability Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_AVAILABILITY_CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sales Availability Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_AVAILABILITY_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.SalesAvailabilityConstraintImpl <em>Sales Availability Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.SalesAvailabilityConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getSalesAvailabilityConstraint()
	 * @generated
	 */
	int SALES_AVAILABILITY_CONSTRAINT = 58;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_AVAILABILITY_CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_AVAILABILITY_CONSTRAINT__DATA_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_AVAILABILITY_CONSTRAINT__RESTRICTIONS = 2;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_AVAILABILITY_CONSTRAINT__DATA_SOURCE = 3;

	/**
	 * The number of structural features of the '<em>Sales Availability Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_AVAILABILITY_CONSTRAINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Sales Availability Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_AVAILABILITY_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.SalesRestrictionImpl <em>Sales Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.SalesRestrictionImpl
	 * @see Gtm.impl.GtmPackageImpl#getSalesRestriction()
	 * @generated
	 */
	int SALES_RESTRICTION = 59;

	/**
	 * The feature id for the '<em><b>Sales Dates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_RESTRICTION__SALES_DATES = 0;

	/**
	 * The feature id for the '<em><b>Start Of Sale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_RESTRICTION__START_OF_SALE = 1;

	/**
	 * The feature id for the '<em><b>End Of Sale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_RESTRICTION__END_OF_SALE = 2;

	/**
	 * The number of structural features of the '<em>Sales Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_RESTRICTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Sales Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_RESTRICTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.EndOfSaleImpl <em>End Of Sale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.EndOfSaleImpl
	 * @see Gtm.impl.GtmPackageImpl#getEndOfSale()
	 * @generated
	 */
	int END_OF_SALE = 60;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OF_SALE__UNIT = RELATIVE_TIME__UNIT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OF_SALE__REFERENCE = RELATIVE_TIME__REFERENCE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OF_SALE__VALUE = RELATIVE_TIME__VALUE;

	/**
	 * The number of structural features of the '<em>End Of Sale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OF_SALE_FEATURE_COUNT = RELATIVE_TIME_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>End Of Sale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OF_SALE_OPERATION_COUNT = RELATIVE_TIME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.StartOfSaleImpl <em>Start Of Sale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.StartOfSaleImpl
	 * @see Gtm.impl.GtmPackageImpl#getStartOfSale()
	 * @generated
	 */
	int START_OF_SALE = 61;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OF_SALE__UNIT = RELATIVE_TIME__UNIT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OF_SALE__REFERENCE = RELATIVE_TIME__REFERENCE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OF_SALE__VALUE = RELATIVE_TIME__VALUE;

	/**
	 * The number of structural features of the '<em>Start Of Sale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OF_SALE_FEATURE_COUNT = RELATIVE_TIME_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Start Of Sale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OF_SALE_OPERATION_COUNT = RELATIVE_TIME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.ReductionCardsImpl <em>Reduction Cards</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ReductionCardsImpl
	 * @see Gtm.impl.GtmPackageImpl#getReductionCards()
	 * @generated
	 */
	int REDUCTION_CARDS = 62;

	/**
	 * The feature id for the '<em><b>Reduction Cards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARDS__REDUCTION_CARDS = 0;

	/**
	 * The number of structural features of the '<em>Reduction Cards</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARDS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Reduction Cards</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARDS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.ReductionCardImpl <em>Reduction Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ReductionCardImpl
	 * @see Gtm.impl.GtmPackageImpl#getReductionCard()
	 * @generated
	 */
	int REDUCTION_CARD = 63;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARD__ID = 0;

	/**
	 * The feature id for the '<em><b>Card Issuer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARD__CARD_ISSUER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARD__NAME = 2;

	/**
	 * The feature id for the '<em><b>Service Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARD__SERVICE_CLASSES = 3;

	/**
	 * The feature id for the '<em><b>Id Required For Booking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARD__ID_REQUIRED_FOR_BOOKING = 4;

	/**
	 * The number of structural features of the '<em>Reduction Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARD_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Reduction Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.CarrierConstraintsImpl <em>Carrier Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CarrierConstraintsImpl
	 * @see Gtm.impl.GtmPackageImpl#getCarrierConstraints()
	 * @generated
	 */
	int CARRIER_CONSTRAINTS = 64;

	/**
	 * The feature id for the '<em><b>Carrier Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CONSTRAINTS__CARRIER_CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Carrier Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Carrier Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.CarrierConstraintImpl <em>Carrier Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CarrierConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getCarrierConstraint()
	 * @generated
	 */
	int CARRIER_CONSTRAINT = 65;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Included Carriers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CONSTRAINT__INCLUDED_CARRIERS = 1;

	/**
	 * The feature id for the '<em><b>Excluded Carriers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CONSTRAINT__EXCLUDED_CARRIERS = 2;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CONSTRAINT__DATA_DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Carrier Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CONSTRAINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Carrier Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.ServiceConstraintsImpl <em>Service Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ServiceConstraintsImpl
	 * @see Gtm.impl.GtmPackageImpl#getServiceConstraints()
	 * @generated
	 */
	int SERVICE_CONSTRAINTS = 66;

	/**
	 * The feature id for the '<em><b>Service Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSTRAINTS__SERVICE_CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Service Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.ServiceConstraintImpl <em>Service Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ServiceConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getServiceConstraint()
	 * @generated
	 */
	int SERVICE_CONSTRAINT = 67;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Included Service Brands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSTRAINT__INCLUDED_SERVICE_BRANDS = 1;

	/**
	 * The feature id for the '<em><b>Excluded Service Brands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSTRAINT__EXCLUDED_SERVICE_BRANDS = 2;

	/**
	 * The number of structural features of the '<em>Service Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.RegionalConstraintsImpl <em>Regional Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.RegionalConstraintsImpl
	 * @see Gtm.impl.GtmPackageImpl#getRegionalConstraints()
	 * @generated
	 */
	int REGIONAL_CONSTRAINTS = 68;

	/**
	 * The feature id for the '<em><b>Regional Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINTS__REGIONAL_CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Regional Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Regional Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.RegionalConstraintImpl <em>Regional Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.RegionalConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getRegionalConstraint()
	 * @generated
	 */
	int REGIONAL_CONSTRAINT = 69;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINT__DISTANCE = 1;

	/**
	 * The feature id for the '<em><b>Entry Connection Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINT__ENTRY_CONNECTION_POINT = 2;

	/**
	 * The feature id for the '<em><b>Exit Connection Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINT__EXIT_CONNECTION_POINT = 3;

	/**
	 * The feature id for the '<em><b>Regional Validity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINT__REGIONAL_VALIDITY = 4;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINT__DATA_SOURCE = 5;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINT__DATA_DESCRIPTION = 6;

	/**
	 * The number of structural features of the '<em>Regional Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Regional Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.RegionalValidityImpl <em>Regional Validity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.RegionalValidityImpl
	 * @see Gtm.impl.GtmPackageImpl#getRegionalValidity()
	 * @generated
	 */
	int REGIONAL_VALIDITY = 70;

	/**
	 * The feature id for the '<em><b>Seq Nb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_VALIDITY__SEQ_NB = 0;

	/**
	 * The feature id for the '<em><b>Via Station</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_VALIDITY__VIA_STATION = 1;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_VALIDITY__ZONE = 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_VALIDITY__LINE = 3;

	/**
	 * The feature id for the '<em><b>Polygone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_VALIDITY__POLYGONE = 4;

	/**
	 * The number of structural features of the '<em>Regional Validity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_VALIDITY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Regional Validity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_VALIDITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.ServiceLevelDefinitionsImpl <em>Service Level Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ServiceLevelDefinitionsImpl
	 * @see Gtm.impl.GtmPackageImpl#getServiceLevelDefinitions()
	 * @generated
	 */
	int SERVICE_LEVEL_DEFINITIONS = 71;

	/**
	 * The feature id for the '<em><b>Service Level Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_DEFINITIONS__SERVICE_LEVEL_DEFINITION = 0;

	/**
	 * The number of structural features of the '<em>Service Level Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_DEFINITIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Level Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_DEFINITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.TextsImpl <em>Texts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.TextsImpl
	 * @see Gtm.impl.GtmPackageImpl#getTexts()
	 * @generated
	 */
	int TEXTS = 72;

	/**
	 * The feature id for the '<em><b>Texts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTS__TEXTS = 0;

	/**
	 * The number of structural features of the '<em>Texts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Texts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.TextImpl
	 * @see Gtm.impl.GtmPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 73;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ID = 0;

	/**
	 * The feature id for the '<em><b>Text UTF8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT_UTF8 = 1;

	/**
	 * The feature id for the '<em><b>Text ICAO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT_ICAO = 2;

	/**
	 * The feature id for the '<em><b>Short Text UTF8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__SHORT_TEXT_UTF8 = 3;

	/**
	 * The feature id for the '<em><b>Short Text ICAO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__SHORT_TEXT_ICAO = 4;

	/**
	 * The feature id for the '<em><b>Translations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TRANSLATIONS = 5;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.TranslationImpl <em>Translation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.TranslationImpl
	 * @see Gtm.impl.GtmPackageImpl#getTranslation()
	 * @generated
	 */
	int TRANSLATION = 74;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Text UTF8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__TEXT_UTF8 = 1;

	/**
	 * The feature id for the '<em><b>Text ICAO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__TEXT_ICAO = 2;

	/**
	 * The feature id for the '<em><b>Short Text UTF8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__SHORT_TEXT_UTF8 = 3;

	/**
	 * The feature id for the '<em><b>Short Text ICAO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__SHORT_TEXT_ICAO = 4;

	/**
	 * The number of structural features of the '<em>Translation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Translation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.PricesImpl <em>Prices</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.PricesImpl
	 * @see Gtm.impl.GtmPackageImpl#getPrices()
	 * @generated
	 */
	int PRICES = 75;

	/**
	 * The feature id for the '<em><b>Prices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICES__PRICES = 0;

	/**
	 * The number of structural features of the '<em>Prices</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Prices</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.PriceImpl <em>Price</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.PriceImpl
	 * @see Gtm.impl.GtmPackageImpl#getPrice()
	 * @generated
	 */
	int PRICE = 76;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE__ID = 0;

	/**
	 * The feature id for the '<em><b>Currencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE__CURRENCIES = 1;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE__DATA_SOURCE = 2;

	/**
	 * The number of structural features of the '<em>Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.VATDetailImpl <em>VAT Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.VATDetailImpl
	 * @see Gtm.impl.GtmPackageImpl#getVATDetail()
	 * @generated
	 */
	int VAT_DETAIL = 77;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAT_DETAIL__AMOUNT = 0;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAT_DETAIL__PERCENTAGE = 1;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAT_DETAIL__COUNTRY = 2;

	/**
	 * The feature id for the '<em><b>Tax Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAT_DETAIL__TAX_ID = 3;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAT_DETAIL__SCOPE = 4;

	/**
	 * The number of structural features of the '<em>VAT Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAT_DETAIL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>VAT Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAT_DETAIL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.CurrencyPriceImpl <em>Currency Price</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CurrencyPriceImpl
	 * @see Gtm.impl.GtmPackageImpl#getCurrencyPrice()
	 * @generated
	 */
	int CURRENCY_PRICE = 78;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_PRICE__CURRENCY = 0;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_PRICE__AMOUNT = 1;

	/**
	 * The feature id for the '<em><b>VA Tdetails</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_PRICE__VA_TDETAILS = 2;

	/**
	 * The number of structural features of the '<em>Currency Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_PRICE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Currency Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_PRICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.ServiceClassDefinitionsImpl <em>Service Class Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ServiceClassDefinitionsImpl
	 * @see Gtm.impl.GtmPackageImpl#getServiceClassDefinitions()
	 * @generated
	 */
	int SERVICE_CLASS_DEFINITIONS = 79;

	/**
	 * The feature id for the '<em><b>Service Class Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLASS_DEFINITIONS__SERVICE_CLASS_DEFINITIONS = 0;

	/**
	 * The number of structural features of the '<em>Service Class Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLASS_DEFINITIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Class Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLASS_DEFINITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.CalendarsImpl <em>Calendars</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CalendarsImpl
	 * @see Gtm.impl.GtmPackageImpl#getCalendars()
	 * @generated
	 */
	int CALENDARS = 80;

	/**
	 * The feature id for the '<em><b>Calendars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDARS__CALENDARS = 0;

	/**
	 * The number of structural features of the '<em>Calendars</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDARS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Calendars</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDARS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.CalendarImpl <em>Calendar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CalendarImpl
	 * @see Gtm.impl.GtmPackageImpl#getCalendar()
	 * @generated
	 */
	int CALENDAR = 81;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__ID = 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__FROM_DATE = 2;

	/**
	 * The feature id for the '<em><b>Until Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__UNTIL_DATE = 3;

	/**
	 * The feature id for the '<em><b>Utc Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__UTC_OFFSET = 4;

	/**
	 * The feature id for the '<em><b>Dates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__DATES = 5;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__DATA_SOURCE = 6;

	/**
	 * The number of structural features of the '<em>Calendar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Calendar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.ReservationParametersImpl <em>Reservation Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ReservationParametersImpl
	 * @see Gtm.impl.GtmPackageImpl#getReservationParameters()
	 * @generated
	 */
	int RESERVATION_PARAMETERS = 82;

	/**
	 * The feature id for the '<em><b>Reservation Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMETERS__RESERVATION_PARAMETERS = 0;

	/**
	 * The number of structural features of the '<em>Reservation Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMETERS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Reservation Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMETERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.ReservationParameterImpl <em>Reservation Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ReservationParameterImpl
	 * @see Gtm.impl.GtmPackageImpl#getReservationParameter()
	 * @generated
	 */
	int RESERVATION_PARAMETER = 83;

	/**
	 * The feature id for the '<em><b>Optional Reservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMETER__OPTIONAL_RESERVATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMETER__ID = 1;

	/**
	 * The feature id for the '<em><b>Params9181</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMETER__PARAMS9181 = 2;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMETER__OPTIONS = 3;

	/**
	 * The number of structural features of the '<em>Reservation Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMETER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Reservation Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.ReservationParams9181Impl <em>Reservation Params9181</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ReservationParams9181Impl
	 * @see Gtm.impl.GtmPackageImpl#getReservationParams9181()
	 * @generated
	 */
	int RESERVATION_PARAMS9181 = 84;

	/**
	 * The feature id for the '<em><b>Travel Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMS9181__TRAVEL_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Service Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMS9181__SERVICE_LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMS9181__SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Berth Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMS9181__BERTH_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Coach Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMS9181__COACH_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Compartment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMS9181__COMPARTMENT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Tariff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMS9181__TARIFF = 6;

	/**
	 * The number of structural features of the '<em>Reservation Params9181</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMS9181_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Reservation Params9181</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMS9181_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.ReservationOptionsImpl <em>Reservation Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ReservationOptionsImpl
	 * @see Gtm.impl.GtmPackageImpl#getReservationOptions()
	 * @generated
	 */
	int RESERVATION_OPTIONS = 85;

	/**
	 * The feature id for the '<em><b>Preferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_OPTIONS__PREFERENCES = 0;

	/**
	 * The feature id for the '<em><b>Service Brands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_OPTIONS__SERVICE_BRANDS = 1;

	/**
	 * The feature id for the '<em><b>Graphical Reservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_OPTIONS__GRAPHICAL_RESERVATION = 2;

	/**
	 * The number of structural features of the '<em>Reservation Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_OPTIONS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Reservation Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_OPTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.ReservationPreferenceGroupImpl <em>Reservation Preference Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ReservationPreferenceGroupImpl
	 * @see Gtm.impl.GtmPackageImpl#getReservationPreferenceGroup()
	 * @generated
	 */
	int RESERVATION_PREFERENCE_GROUP = 86;

	/**
	 * The feature id for the '<em><b>Preference</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PREFERENCE_GROUP__PREFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PREFERENCE_GROUP__GROUP = 1;

	/**
	 * The number of structural features of the '<em>Reservation Preference Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PREFERENCE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Reservation Preference Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PREFERENCE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.ServiceClassImpl <em>Service Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ServiceClassImpl
	 * @see Gtm.impl.GtmPackageImpl#getServiceClass()
	 * @generated
	 */
	int SERVICE_CLASS = 87;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLASS__ID = 0;

	/**
	 * The feature id for the '<em><b>Classic Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLASS__CLASSIC_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLASS__TEXT = 2;

	/**
	 * The number of structural features of the '<em>Service Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLASS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.ServiceLevelImpl <em>Service Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ServiceLevelImpl
	 * @see Gtm.impl.GtmPackageImpl#getServiceLevel()
	 * @generated
	 */
	int SERVICE_LEVEL = 88;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL__ID = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Combining Service Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL__COMBINING_SERVICE_CLASSES = 2;

	/**
	 * The feature id for the '<em><b>Reservation Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL__RESERVATION_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Includes Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL__INCLUDES_CLASS_NAME = 4;

	/**
	 * The number of structural features of the '<em>Service Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Service Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.TimeRangeImpl <em>Time Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.TimeRangeImpl
	 * @see Gtm.impl.GtmPackageImpl#getTimeRange()
	 * @generated
	 */
	int TIME_RANGE = 89;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RANGE__SCOPE = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RANGE__FROM = 1;

	/**
	 * The feature id for the '<em><b>Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RANGE__UNTIL = 2;

	/**
	 * The number of structural features of the '<em>Time Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RANGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Time Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.ExcludedTimeRangeImpl <em>Excluded Time Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ExcludedTimeRangeImpl
	 * @see Gtm.impl.GtmPackageImpl#getExcludedTimeRange()
	 * @generated
	 */
	int EXCLUDED_TIME_RANGE = 90;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDED_TIME_RANGE__SCOPE = TIME_RANGE__SCOPE;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDED_TIME_RANGE__FROM = TIME_RANGE__FROM;

	/**
	 * The feature id for the '<em><b>Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDED_TIME_RANGE__UNTIL = TIME_RANGE__UNTIL;

	/**
	 * The number of structural features of the '<em>Excluded Time Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDED_TIME_RANGE_FEATURE_COUNT = TIME_RANGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Excluded Time Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDED_TIME_RANGE_OPERATION_COUNT = TIME_RANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.ValidityRangeImpl <em>Validity Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ValidityRangeImpl
	 * @see Gtm.impl.GtmPackageImpl#getValidityRange()
	 * @generated
	 */
	int VALIDITY_RANGE = 91;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDITY_RANGE__UNIT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDITY_RANGE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Hours After Midnight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDITY_RANGE__HOURS_AFTER_MIDNIGHT = 2;

	/**
	 * The number of structural features of the '<em>Validity Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDITY_RANGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Validity Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDITY_RANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.ReturnValidityConstraintImpl <em>Return Validity Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ReturnValidityConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getReturnValidityConstraint()
	 * @generated
	 */
	int RETURN_VALIDITY_CONSTRAINT = 93;

	/**
	 * The feature id for the '<em><b>Excluded Weekdays</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALIDITY_CONSTRAINT__EXCLUDED_WEEKDAYS = 0;

	/**
	 * The feature id for the '<em><b>Latest Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALIDITY_CONSTRAINT__LATEST_RETURN = 1;

	/**
	 * The feature id for the '<em><b>Earliest Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALIDITY_CONSTRAINT__EARLIEST_RETURN = 2;

	/**
	 * The number of structural features of the '<em>Return Validity Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALIDITY_CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Return Validity Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALIDITY_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.ViaStationImpl <em>Via Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ViaStationImpl
	 * @see Gtm.impl.GtmPackageImpl#getViaStation()
	 * @generated
	 */
	int VIA_STATION = 94;

	/**
	 * The feature id for the '<em><b>Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION__STATION = 0;

	/**
	 * The feature id for the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION__CARRIER = 1;

	/**
	 * The feature id for the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION__ROUTE = 2;

	/**
	 * The feature id for the '<em><b>Alternative Routes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION__ALTERNATIVE_ROUTES = 3;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION__DATA_DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Fare Station Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION__FARE_STATION_SET = 5;

	/**
	 * The number of structural features of the '<em>Via Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION___GET_DESCRIPTION = 0;

	/**
	 * The number of operations of the '<em>Via Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Gtm.impl.AlternativeRouteImpl <em>Alternative Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.AlternativeRouteImpl
	 * @see Gtm.impl.GtmPackageImpl#getAlternativeRoute()
	 * @generated
	 */
	int ALTERNATIVE_ROUTE = 95;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_ROUTE__STATIONS = 0;

	/**
	 * The number of structural features of the '<em>Alternative Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_ROUTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Alternative Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_ROUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.RouteImpl
	 * @see Gtm.impl.GtmPackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 96;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__STATIONS = 0;

	/**
	 * The number of structural features of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.ZoneImpl <em>Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ZoneImpl
	 * @see Gtm.impl.GtmPackageImpl#getZone()
	 * @generated
	 */
	int ZONE = 97;

	/**
	 * The feature id for the '<em><b>Binary Zone Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__BINARY_ZONE_ID = 0;

	/**
	 * The feature id for the '<em><b>Zone Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__ZONE_ID = 1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__CITY = 2;

	/**
	 * The feature id for the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__CARRIER = 3;

	/**
	 * The feature id for the '<em><b>Entry Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__ENTRY_STATION = 4;

	/**
	 * The feature id for the '<em><b>Terminal Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__TERMINAL_STATION = 5;

	/**
	 * The feature id for the '<em><b>Nuts Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__NUTS_CODE = 6;

	/**
	 * The number of structural features of the '<em>Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LineImpl
	 * @see Gtm.impl.GtmPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 98;

	/**
	 * The feature id for the '<em><b>Binary Zone Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__BINARY_ZONE_ID = 0;

	/**
	 * The feature id for the '<em><b>Line Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__LINE_ID = 1;

	/**
	 * The feature id for the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__CARRIER = 2;

	/**
	 * The feature id for the '<em><b>Entry Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__ENTRY_STATION = 3;

	/**
	 * The feature id for the '<em><b>Terminal Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__TERMINAL_STATION = 4;

	/**
	 * The feature id for the '<em><b>Nuts Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__NUTS_CODE = 5;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__CITY = 6;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.PolygoneImpl <em>Polygone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.PolygoneImpl
	 * @see Gtm.impl.GtmPackageImpl#getPolygone()
	 * @generated
	 */
	int POLYGONE = 99;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGONE__EDGE = 0;

	/**
	 * The number of structural features of the '<em>Polygone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGONE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Polygone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGONE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.EdgeImpl
	 * @see Gtm.impl.GtmPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 100;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>East West</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__EAST_WEST = 1;

	/**
	 * The feature id for the '<em><b>North South</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__NORTH_SOUTH = 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__UNIT = 3;

	/**
	 * The feature id for the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ACCURACY = 4;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__LONGITUDE = 5;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__LATITUDE = 6;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.CarrierResourceLocationImpl <em>Carrier Resource Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CarrierResourceLocationImpl
	 * @see Gtm.impl.GtmPackageImpl#getCarrierResourceLocation()
	 * @generated
	 */
	int CARRIER_RESOURCE_LOCATION = 101;

	/**
	 * The feature id for the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_RESOURCE_LOCATION__CARRIER = 0;

	/**
	 * The feature id for the '<em><b>Service Brand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_RESOURCE_LOCATION__SERVICE_BRAND = 1;

	/**
	 * The feature id for the '<em><b>Online Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_RESOURCE_LOCATION__ONLINE_RESOURCES = 2;

	/**
	 * The number of structural features of the '<em>Carrier Resource Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_RESOURCE_LOCATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Carrier Resource Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_RESOURCE_LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.CrossBorderConditionImpl <em>Cross Border Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CrossBorderConditionImpl
	 * @see Gtm.impl.GtmPackageImpl#getCrossBorderCondition()
	 * @generated
	 */
	int CROSS_BORDER_CONDITION = 102;

	/**
	 * The feature id for the '<em><b>From Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_BORDER_CONDITION__FROM_COUNTRY = 0;

	/**
	 * The feature id for the '<em><b>To Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_BORDER_CONDITION__TO_COUNTRY = 1;

	/**
	 * The feature id for the '<em><b>Affected Service Brands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_BORDER_CONDITION__AFFECTED_SERVICE_BRANDS = 2;

	/**
	 * The number of structural features of the '<em>Cross Border Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_BORDER_CONDITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cross Border Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_BORDER_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.FareCombinationModelImpl <em>Fare Combination Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.FareCombinationModelImpl
	 * @see Gtm.impl.GtmPackageImpl#getFareCombinationModel()
	 * @generated
	 */
	int FARE_COMBINATION_MODEL = 103;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_COMBINATION_MODEL__MODEL = 0;

	/**
	 * The feature id for the '<em><b>Combinable Carriers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_COMBINATION_MODEL__COMBINABLE_CARRIERS = 1;

	/**
	 * The feature id for the '<em><b>Only When Combined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_COMBINATION_MODEL__ONLY_WHEN_COMBINED = 2;

	/**
	 * The feature id for the '<em><b>Allowed Allocators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_COMBINATION_MODEL__ALLOWED_ALLOCATORS = 3;

	/**
	 * The feature id for the '<em><b>Reference Cluster</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_COMBINATION_MODEL__REFERENCE_CLUSTER = 4;

	/**
	 * The feature id for the '<em><b>Allowed Clusters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_COMBINATION_MODEL__ALLOWED_CLUSTERS = 5;

	/**
	 * The feature id for the '<em><b>Allowed Common Contracts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_COMBINATION_MODEL__ALLOWED_COMMON_CONTRACTS = 6;

	/**
	 * The number of structural features of the '<em>Fare Combination Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_COMBINATION_MODEL_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Fare Combination Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_COMBINATION_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.ReductionConstraintImpl <em>Reduction Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ReductionConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getReductionConstraint()
	 * @generated
	 */
	int REDUCTION_CONSTRAINT = 104;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Required Reduction Cards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CONSTRAINT__REQUIRED_REDUCTION_CARDS = 1;

	/**
	 * The number of structural features of the '<em>Reduction Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Reduction Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.RequiredReductionCardImpl <em>Required Reduction Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.RequiredReductionCardImpl
	 * @see Gtm.impl.GtmPackageImpl#getRequiredReductionCard()
	 * @generated
	 */
	int REQUIRED_REDUCTION_CARD = 105;

	/**
	 * The feature id for the '<em><b>Card Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_REDUCTION_CARD__CARD_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_REDUCTION_CARD__CARD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_REDUCTION_CARD__NAME = 2;

	/**
	 * The number of structural features of the '<em>Required Reduction Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_REDUCTION_CARD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Required Reduction Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_REDUCTION_CARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.ConversionFromLegacyImpl <em>Conversion From Legacy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ConversionFromLegacyImpl
	 * @see Gtm.impl.GtmPackageImpl#getConversionFromLegacy()
	 * @generated
	 */
	int CONVERSION_FROM_LEGACY = 106;

	/**
	 * The feature id for the '<em><b>Legacy108</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_FROM_LEGACY__LEGACY108 = 0;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_FROM_LEGACY__PARAMS = 1;

	/**
	 * The number of structural features of the '<em>Conversion From Legacy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_FROM_LEGACY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Conversion From Legacy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_FROM_LEGACY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.ConversionParamsImpl <em>Conversion Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ConversionParamsImpl
	 * @see Gtm.impl.GtmPackageImpl#getConversionParams()
	 * @generated
	 */
	int CONVERSION_PARAMS = 107;

	/**
	 * The feature id for the '<em><b>Tax Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PARAMS__TAX_ID = 0;

	/**
	 * The feature id for the '<em><b>VA Tpercentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PARAMS__VA_TPERCENTAGE = 1;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PARAMS__COUNTRY = 2;

	/**
	 * The feature id for the '<em><b>Legacy Border Point Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PARAMS__LEGACY_BORDER_POINT_MAPPINGS = 3;

	/**
	 * The feature id for the '<em><b>Legacy Station Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PARAMS__LEGACY_STATION_MAPPINGS = 4;

	/**
	 * The feature id for the '<em><b>Legacy Target Fares</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PARAMS__LEGACY_TARGET_FARES = 5;

	/**
	 * The feature id for the '<em><b>Legacy Fare Station Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PARAMS__LEGACY_FARE_STATION_MAPPINGS = 6;

	/**
	 * The feature id for the '<em><b>Legacy Station To Service Brand Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PARAMS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS = 7;

	/**
	 * The feature id for the '<em><b>End Of Sale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PARAMS__END_OF_SALE = 8;

	/**
	 * The feature id for the '<em><b>Start Of Sale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PARAMS__START_OF_SALE = 9;

	/**
	 * The number of structural features of the '<em>Conversion Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PARAMS_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Conversion Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PARAMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.TargetFareTemplateImpl <em>Target Fare Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.TargetFareTemplateImpl
	 * @see Gtm.impl.GtmPackageImpl#getTargetFareTemplate()
	 * @generated
	 */
	int TARGET_FARE_TEMPLATE = 108;

	/**
	 * The feature id for the '<em><b>Price Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FARE_TEMPLATE__PRICE_FACTOR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FARE_TEMPLATE__ID = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FARE_TEMPLATE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FARE_TEMPLATE__DATA_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FARE_TEMPLATE__TEXT = 4;

	/**
	 * The feature id for the '<em><b>Price</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FARE_TEMPLATE__PRICE = 5;

	/**
	 * The feature id for the '<em><b>Regional Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FARE_TEMPLATE__REGIONAL_CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Service Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FARE_TEMPLATE__SERVICE_CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Carrier Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FARE_TEMPLATE__CARRIER_CONSTRAINT = 8;

	/**
	 * The feature id for the '<em><b>Service Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FARE_TEMPLATE__SERVICE_CLASS = 9;

	/**
	 * The feature id for the '<em><b>Service Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FARE_TEMPLATE__SERVICE_LEVEL = 10;

	/**
	 * The feature id for the '<em><b>Sales Availability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FARE_TEMPLATE__SALES_AVAILABILITY = 11;

	/**
	 * The feature id for the '<em><b>Travel Validity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FARE_TEMPLATE__TRAVEL_VALIDITY = 12;

	/**
	 * The feature id for the '<em><b>Combination Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FARE_TEMPLATE__COMBINATION_CONSTRAINT = 13;

	/**
	 * The feature id for the '<em><b>Separate Contract Combination Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FARE_TEMPLATE__SEPARATE_CONTRACT_COMBINATION_CONSTRAINT = 14;

	/**
	 * The feature id for the '<em><b>Fare Detail Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FARE_TEMPLATE__FARE_DETAIL_DESCRIPTION = 15;

	/**
	 * The feature id for the '<em><b>Legacy Accounting Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FARE_TEMPLATE__LEGACY_ACCOUNTING_IDENTIFIER = 16;

	/**
	 * The feature id for the '<em><b>Personal Data Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FARE_TEMPLATE__PERSONAL_DATA_CONSTRAINT = 17;

	/**
	 * The feature id for the '<em><b>Reservation Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FARE_TEMPLATE__RESERVATION_PARAMETER = 18;

	/**
	 * The feature id for the '<em><b>Reduction Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FARE_TEMPLATE__REDUCTION_CONSTRAINT = 19;

	/**
	 * The feature id for the '<em><b>Fulfillment Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FARE_TEMPLATE__FULFILLMENT_CONSTRAINT = 20;

	/**
	 * The feature id for the '<em><b>Passenger Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FARE_TEMPLATE__PASSENGER_CONSTRAINT = 21;

	/**
	 * The feature id for the '<em><b>After Sales Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FARE_TEMPLATE__AFTER_SALES_RULE = 22;

	/**
	 * The number of structural features of the '<em>Target Fare Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FARE_TEMPLATE_FEATURE_COUNT = 23;

	/**
	 * The number of operations of the '<em>Target Fare Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FARE_TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyStationToServiceConstraintMappingsImpl <em>Legacy Station To Service Constraint Mappings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyStationToServiceConstraintMappingsImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyStationToServiceConstraintMappings()
	 * @generated
	 */
	int LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPINGS = 109;

	/**
	 * The feature id for the '<em><b>Legacy Station To Service Brand Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPINGS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS = 0;

	/**
	 * The number of structural features of the '<em>Legacy Station To Service Constraint Mappings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPINGS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Find Service Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPINGS___FIND_SERVICE_CONSTRAINT__INT = 0;

	/**
	 * The number of operations of the '<em>Legacy Station To Service Constraint Mappings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPINGS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyStationToServiceConstraintMappingImpl <em>Legacy Station To Service Constraint Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyStationToServiceConstraintMappingImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyStationToServiceConstraintMapping()
	 * @generated
	 */
	int LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING = 110;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING__CODE = 0;

	/**
	 * The feature id for the '<em><b>Service Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING__SERVICE_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Legacy Station To Service Constraint Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Legacy Station To Service Constraint Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyStationMappingsImpl <em>Legacy Station Mappings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyStationMappingsImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyStationMappings()
	 * @generated
	 */
	int LEGACY_STATION_MAPPINGS = 111;

	/**
	 * The feature id for the '<em><b>Station Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_MAPPINGS__STATION_MAPPINGS = 0;

	/**
	 * The number of structural features of the '<em>Legacy Station Mappings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_MAPPINGS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Find Mapped Station</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_MAPPINGS___FIND_MAPPED_STATION__INT = 0;

	/**
	 * The number of operations of the '<em>Legacy Station Mappings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_MAPPINGS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyStationMapImpl <em>Legacy Station Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyStationMapImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyStationMap()
	 * @generated
	 */
	int LEGACY_STATION_MAP = 112;

	/**
	 * The feature id for the '<em><b>Legacy Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_MAP__LEGACY_CODE = 0;

	/**
	 * The feature id for the '<em><b>Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_MAP__STATION = 1;

	/**
	 * The number of structural features of the '<em>Legacy Station Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Legacy Station Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyStationImpl <em>Legacy Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyStationImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyStation()
	 * @generated
	 */
	int LEGACY_STATION = 113;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Legacy Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Legacy Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyBoderPointMappingsImpl <em>Legacy Boder Point Mappings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyBoderPointMappingsImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyBoderPointMappings()
	 * @generated
	 */
	int LEGACY_BODER_POINT_MAPPINGS = 114;

	/**
	 * The feature id for the '<em><b>Border Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BODER_POINT_MAPPINGS__BORDER_POINTS = 0;

	/**
	 * The number of structural features of the '<em>Legacy Boder Point Mappings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BODER_POINT_MAPPINGS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Mapping By Border Point Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BODER_POINT_MAPPINGS___GET_MAPPING_BY_BORDER_POINT_CODE__INT = 0;

	/**
	 * The number of operations of the '<em>Legacy Boder Point Mappings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BODER_POINT_MAPPINGS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyBorderPointMappingImpl <em>Legacy Border Point Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyBorderPointMappingImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyBorderPointMapping()
	 * @generated
	 */
	int LEGACY_BORDER_POINT_MAPPING = 115;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BORDER_POINT_MAPPING__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BORDER_POINT_MAPPING__NAME = 1;

	/**
	 * The feature id for the '<em><b>Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BORDER_POINT_MAPPING__STATION = 2;

	/**
	 * The feature id for the '<em><b>Connection Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BORDER_POINT_MAPPING__CONNECTION_POINT = 3;

	/**
	 * The number of structural features of the '<em>Legacy Border Point Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BORDER_POINT_MAPPING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Legacy Border Point Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BORDER_POINT_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyFareStationSetMappingsImpl <em>Legacy Fare Station Set Mappings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyFareStationSetMappingsImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyFareStationSetMappings()
	 * @generated
	 */
	int LEGACY_FARE_STATION_SET_MAPPINGS = 116;

	/**
	 * The feature id for the '<em><b>Legacy Fare Station Set Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_FARE_STATION_SET_MAPPINGS__LEGACY_FARE_STATION_SET_MAP = 0;

	/**
	 * The number of structural features of the '<em>Legacy Fare Station Set Mappings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_FARE_STATION_SET_MAPPINGS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Legacy Fare Station Set Mappings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_FARE_STATION_SET_MAPPINGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyFareStationSetMapImpl <em>Legacy Fare Station Set Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyFareStationSetMapImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyFareStationSetMap()
	 * @generated
	 */
	int LEGACY_FARE_STATION_SET_MAP = 117;

	/**
	 * The feature id for the '<em><b>Legacy Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_FARE_STATION_SET_MAP__LEGACY_CODE = 0;

	/**
	 * The feature id for the '<em><b>Station Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_FARE_STATION_SET_MAP__STATION_SET = 1;

	/**
	 * The number of structural features of the '<em>Legacy Fare Station Set Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_FARE_STATION_SET_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Legacy Fare Station Set Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_FARE_STATION_SET_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.Legacy108Impl <em>Legacy108</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.Legacy108Impl
	 * @see Gtm.impl.GtmPackageImpl#getLegacy108()
	 * @generated
	 */
	int LEGACY108 = 118;

	/**
	 * The feature id for the '<em><b>Character Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108__CHARACTER_SET = 0;

	/**
	 * The feature id for the '<em><b>Legacy Series List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108__LEGACY_SERIES_LIST = 1;

	/**
	 * The feature id for the '<em><b>Legacy Separate Contract Series</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108__LEGACY_SEPARATE_CONTRACT_SERIES = 2;

	/**
	 * The feature id for the '<em><b>Legacy Distance Fares</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108__LEGACY_DISTANCE_FARES = 3;

	/**
	 * The feature id for the '<em><b>Legacy Route Fares</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108__LEGACY_ROUTE_FARES = 4;

	/**
	 * The feature id for the '<em><b>Legacy Stations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108__LEGACY_STATIONS = 5;

	/**
	 * The feature id for the '<em><b>Time Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108__TIME_ZONE = 6;

	/**
	 * The feature id for the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108__CARRIER = 7;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108__START_DATE = 8;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108__END_DATE = 9;

	/**
	 * The number of structural features of the '<em>Legacy108</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Legacy108</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.Legacy108StationsImpl <em>Legacy108 Stations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.Legacy108StationsImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacy108Stations()
	 * @generated
	 */
	int LEGACY108_STATIONS = 119;

	/**
	 * The feature id for the '<em><b>Legacy Stations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_STATIONS__LEGACY_STATIONS = 0;

	/**
	 * The number of structural features of the '<em>Legacy108 Stations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_STATIONS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Find Station</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_STATIONS___FIND_STATION__INT = 0;

	/**
	 * The operation id for the '<em>Find By Border Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_STATIONS___FIND_BY_BORDER_POINT__INT = 1;

	/**
	 * The number of operations of the '<em>Legacy108 Stations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_STATIONS_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link Gtm.impl.Legacy108StationImpl <em>Legacy108 Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.Legacy108StationImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacy108Station()
	 * @generated
	 */
	int LEGACY108_STATION = 120;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_STATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Border Point Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_STATION__BORDER_POINT_CODE = 1;

	/**
	 * The feature id for the '<em><b>Name UTF8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_STATION__NAME_UTF8 = 2;

	/**
	 * The feature id for the '<em><b>Station Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_STATION__STATION_CODE = 3;

	/**
	 * The feature id for the '<em><b>Fare Reference Station Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_STATION__FARE_REFERENCE_STATION_CODE = 4;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_STATION__SHORT_NAME = 5;

	/**
	 * The number of structural features of the '<em>Legacy108 Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_STATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Legacy108 Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_STATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyRouteFaresImpl <em>Legacy Route Fares</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyRouteFaresImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyRouteFares()
	 * @generated
	 */
	int LEGACY_ROUTE_FARES = 121;

	/**
	 * The feature id for the '<em><b>Route Fare</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ROUTE_FARES__ROUTE_FARE = 0;

	/**
	 * The number of structural features of the '<em>Legacy Route Fares</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ROUTE_FARES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Legacy Route Fares</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ROUTE_FARES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyRouteFareImpl <em>Legacy Route Fare</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyRouteFareImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyRouteFare()
	 * @generated
	 */
	int LEGACY_ROUTE_FARE = 122;

	/**
	 * The feature id for the '<em><b>Fare Table Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ROUTE_FARE__FARE_TABLE_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Series Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ROUTE_FARE__SERIES_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Fare2nd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ROUTE_FARE__FARE2ND = 2;

	/**
	 * The feature id for the '<em><b>Fare1st</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ROUTE_FARE__FARE1ST = 3;

	/**
	 * The feature id for the '<em><b>Return Fare1st</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ROUTE_FARE__RETURN_FARE1ST = 4;

	/**
	 * The feature id for the '<em><b>Return Fare2nd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ROUTE_FARE__RETURN_FARE2ND = 5;

	/**
	 * The feature id for the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ROUTE_FARE__VALID_FROM = 6;

	/**
	 * The feature id for the '<em><b>Valid Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ROUTE_FARE__VALID_UNTIL = 7;

	/**
	 * The feature id for the '<em><b>Series</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ROUTE_FARE__SERIES = 8;

	/**
	 * The number of structural features of the '<em>Legacy Route Fare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ROUTE_FARE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Legacy Route Fare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ROUTE_FARE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacySeriesListImpl <em>Legacy Series List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacySeriesListImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacySeriesList()
	 * @generated
	 */
	int LEGACY_SERIES_LIST = 123;

	/**
	 * The feature id for the '<em><b>Series</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES_LIST__SERIES = 0;

	/**
	 * The number of structural features of the '<em>Legacy Series List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Legacy Series List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacySeriesImpl <em>Legacy Series</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacySeriesImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacySeries()
	 * @generated
	 */
	int LEGACY_SERIES = 124;

	/**
	 * The feature id for the '<em><b>Supplying Carrier Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__SUPPLYING_CARRIER_CODE = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__TYPE = 2;

	/**
	 * The feature id for the '<em><b>From Station</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__FROM_STATION = 3;

	/**
	 * The feature id for the '<em><b>From Station Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__FROM_STATION_NAME = 4;

	/**
	 * The feature id for the '<em><b>To Station</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__TO_STATION = 5;

	/**
	 * The feature id for the '<em><b>To Station Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__TO_STATION_NAME = 6;

	/**
	 * The feature id for the '<em><b>Route Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__ROUTE_NUMBER = 7;

	/**
	 * The feature id for the '<em><b>Carrier Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__CARRIER_CODE = 8;

	/**
	 * The feature id for the '<em><b>Route Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__ROUTE_DESCRIPTION = 9;

	/**
	 * The feature id for the '<em><b>Pricetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__PRICETYPE = 10;

	/**
	 * The feature id for the '<em><b>Distance1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__DISTANCE1 = 11;

	/**
	 * The feature id for the '<em><b>Distance2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__DISTANCE2 = 12;

	/**
	 * The feature id for the '<em><b>Viastations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__VIASTATIONS = 13;

	/**
	 * The feature id for the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__VALID_FROM = 14;

	/**
	 * The feature id for the '<em><b>Valid Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__VALID_UNTIL = 15;

	/**
	 * The number of structural features of the '<em>Legacy Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>Legacy Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacySeparateContractSeriesListImpl <em>Legacy Separate Contract Series List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacySeparateContractSeriesListImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacySeparateContractSeriesList()
	 * @generated
	 */
	int LEGACY_SEPARATE_CONTRACT_SERIES_LIST = 125;

	/**
	 * The feature id for the '<em><b>Separate Contract Series</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SEPARATE_CONTRACT_SERIES_LIST__SEPARATE_CONTRACT_SERIES = 0;

	/**
	 * The number of structural features of the '<em>Legacy Separate Contract Series List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SEPARATE_CONTRACT_SERIES_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Legacy Separate Contract Series List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SEPARATE_CONTRACT_SERIES_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacySeparateContractSeriesImpl <em>Legacy Separate Contract Series</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacySeparateContractSeriesImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacySeparateContractSeries()
	 * @generated
	 */
	int LEGACY_SEPARATE_CONTRACT_SERIES = 126;

	/**
	 * The feature id for the '<em><b>Series Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SEPARATE_CONTRACT_SERIES__SERIES_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SEPARATE_CONTRACT_SERIES__VALID_FROM = 1;

	/**
	 * The feature id for the '<em><b>Valid Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SEPARATE_CONTRACT_SERIES__VALID_UNTIL = 2;

	/**
	 * The number of structural features of the '<em>Legacy Separate Contract Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SEPARATE_CONTRACT_SERIES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Legacy Separate Contract Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SEPARATE_CONTRACT_SERIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyDistanceFaresImpl <em>Legacy Distance Fares</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyDistanceFaresImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyDistanceFares()
	 * @generated
	 */
	int LEGACY_DISTANCE_FARES = 127;

	/**
	 * The feature id for the '<em><b>Distance Fare</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DISTANCE_FARES__DISTANCE_FARE = 0;

	/**
	 * The number of structural features of the '<em>Legacy Distance Fares</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DISTANCE_FARES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Legacy Distance Fares</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DISTANCE_FARES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyDistanceFareImpl <em>Legacy Distance Fare</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyDistanceFareImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyDistanceFare()
	 * @generated
	 */
	int LEGACY_DISTANCE_FARE = 128;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DISTANCE_FARE__DISTANCE = 0;

	/**
	 * The feature id for the '<em><b>Fare2nd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DISTANCE_FARE__FARE2ND = 1;

	/**
	 * The feature id for the '<em><b>Fare1st</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DISTANCE_FARE__FARE1ST = 2;

	/**
	 * The feature id for the '<em><b>Fare Table Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DISTANCE_FARE__FARE_TABLE_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Return Fare1st</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DISTANCE_FARE__RETURN_FARE1ST = 4;

	/**
	 * The feature id for the '<em><b>Return Fare2nd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DISTANCE_FARE__RETURN_FARE2ND = 5;

	/**
	 * The feature id for the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DISTANCE_FARE__VALID_FROM = 6;

	/**
	 * The feature id for the '<em><b>Valid Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DISTANCE_FARE__VALID_UNTIL = 7;

	/**
	 * The number of structural features of the '<em>Legacy Distance Fare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DISTANCE_FARE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Legacy Distance Fare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DISTANCE_FARE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyViastationImpl <em>Legacy Viastation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyViastationImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyViastation()
	 * @generated
	 */
	int LEGACY_VIASTATION = 129;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_VIASTATION__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_VIASTATION__CODE = 1;

	/**
	 * The number of structural features of the '<em>Legacy Viastation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_VIASTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Legacy Viastation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_VIASTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyTargetFaresImpl <em>Legacy Target Fares</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyTargetFaresImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyTargetFares()
	 * @generated
	 */
	int LEGACY_TARGET_FARES = 130;

	/**
	 * The feature id for the '<em><b>Target Fares</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_TARGET_FARES__TARGET_FARES = 0;

	/**
	 * The number of structural features of the '<em>Legacy Target Fares</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_TARGET_FARES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Legacy Target Fares</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_TARGET_FARES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.AfterSalesTransactionType <em>After Sales Transaction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.AfterSalesTransactionType
	 * @see Gtm.impl.GtmPackageImpl#getAfterSalesTransactionType()
	 * @generated
	 */
	int AFTER_SALES_TRANSACTION_TYPE = 131;

	/**
	 * The meta object id for the '{@link Gtm.BarcodeTypes <em>Barcode Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.BarcodeTypes
	 * @see Gtm.impl.GtmPackageImpl#getBarcodeTypes()
	 * @generated
	 */
	int BARCODE_TYPES = 132;

	/**
	 * The meta object id for the '{@link Gtm.ClassicClassType <em>Classic Class Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.ClassicClassType
	 * @see Gtm.impl.GtmPackageImpl#getClassicClassType()
	 * @generated
	 */
	int CLASSIC_CLASS_TYPE = 133;

	/**
	 * The meta object id for the '{@link Gtm.CharacterSet <em>Character Set</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.CharacterSet
	 * @see Gtm.impl.GtmPackageImpl#getCharacterSet()
	 * @generated
	 */
	int CHARACTER_SET = 134;

	/**
	 * The meta object id for the '{@link Gtm.Clusters <em>Clusters</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.Clusters
	 * @see Gtm.impl.GtmPackageImpl#getClusters()
	 * @generated
	 */
	int CLUSTERS = 135;

	/**
	 * The meta object id for the '{@link Gtm.CombinationModel <em>Combination Model</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.CombinationModel
	 * @see Gtm.impl.GtmPackageImpl#getCombinationModel()
	 * @generated
	 */
	int COMBINATION_MODEL = 136;

	/**
	 * The meta object id for the '{@link Gtm.ControlDataExchangeTypes <em>Control Data Exchange Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.ControlDataExchangeTypes
	 * @see Gtm.impl.GtmPackageImpl#getControlDataExchangeTypes()
	 * @generated
	 */
	int CONTROL_DATA_EXCHANGE_TYPES = 137;

	/**
	 * The meta object id for the '{@link Gtm.FareType <em>Fare Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.FareType
	 * @see Gtm.impl.GtmPackageImpl#getFareType()
	 * @generated
	 */
	int FARE_TYPE = 138;

	/**
	 * The meta object id for the '{@link Gtm.FulfillmentType <em>Fulfillment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.FulfillmentType
	 * @see Gtm.impl.GtmPackageImpl#getFulfillmentType()
	 * @generated
	 */
	int FULFILLMENT_TYPE = 139;

	/**
	 * The meta object id for the '{@link Gtm.GeoSystem <em>Geo System</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.GeoSystem
	 * @see Gtm.impl.GtmPackageImpl#getGeoSystem()
	 * @generated
	 */
	int GEO_SYSTEM = 140;

	/**
	 * The meta object id for the '{@link Gtm.GeoUnit <em>Geo Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.GeoUnit
	 * @see Gtm.impl.GtmPackageImpl#getGeoUnit()
	 * @generated
	 */
	int GEO_UNIT = 141;

	/**
	 * The meta object id for the '{@link Gtm.GraphicalReservationType <em>Graphical Reservation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.GraphicalReservationType
	 * @see Gtm.impl.GtmPackageImpl#getGraphicalReservationType()
	 * @generated
	 */
	int GRAPHICAL_RESERVATION_TYPE = 142;

	/**
	 * The meta object id for the '{@link Gtm.HemisphereEW <em>Hemisphere EW</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.HemisphereEW
	 * @see Gtm.impl.GtmPackageImpl#getHemisphereEW()
	 * @generated
	 */
	int HEMISPHERE_EW = 143;

	/**
	 * The meta object id for the '{@link Gtm.HemisphereNS <em>Hemisphere NS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.HemisphereNS
	 * @see Gtm.impl.GtmPackageImpl#getHemisphereNS()
	 * @generated
	 */
	int HEMISPHERE_NS = 144;

	/**
	 * The meta object id for the '{@link Gtm.InterfaceType <em>Interface Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.InterfaceType
	 * @see Gtm.impl.GtmPackageImpl#getInterfaceType()
	 * @generated
	 */
	int INTERFACE_TYPE = 145;

	/**
	 * The meta object id for the '{@link Gtm.LegacyCalculationType <em>Legacy Calculation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.LegacyCalculationType
	 * @see Gtm.impl.GtmPackageImpl#getLegacyCalculationType()
	 * @generated
	 */
	int LEGACY_CALCULATION_TYPE = 146;

	/**
	 * The meta object id for the '{@link Gtm.LegacyPassengerType <em>Legacy Passenger Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.LegacyPassengerType
	 * @see Gtm.impl.GtmPackageImpl#getLegacyPassengerType()
	 * @generated
	 */
	int LEGACY_PASSENGER_TYPE = 147;

	/**
	 * The meta object id for the '{@link Gtm.LegacySeriesType <em>Legacy Series Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.LegacySeriesType
	 * @see Gtm.impl.GtmPackageImpl#getLegacySeriesType()
	 * @generated
	 */
	int LEGACY_SERIES_TYPE = 148;

	/**
	 * The meta object id for the '{@link Gtm.OfferRequestType <em>Offer Request Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.OfferRequestType
	 * @see Gtm.impl.GtmPackageImpl#getOfferRequestType()
	 * @generated
	 */
	int OFFER_REQUEST_TYPE = 149;

	/**
	 * The meta object id for the '{@link Gtm.OnlineServiceType <em>Online Service Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.OnlineServiceType
	 * @see Gtm.impl.GtmPackageImpl#getOnlineServiceType()
	 * @generated
	 */
	int ONLINE_SERVICE_TYPE = 150;

	/**
	 * The meta object id for the '{@link Gtm.PersonalDataItemsType <em>Personal Data Items Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.PersonalDataItemsType
	 * @see Gtm.impl.GtmPackageImpl#getPersonalDataItemsType()
	 * @generated
	 */
	int PERSONAL_DATA_ITEMS_TYPE = 151;

	/**
	 * The meta object id for the '{@link Gtm.PersonalDataTransferType <em>Personal Data Transfer Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.PersonalDataTransferType
	 * @see Gtm.impl.GtmPackageImpl#getPersonalDataTransferType()
	 * @generated
	 */
	int PERSONAL_DATA_TRANSFER_TYPE = 152;

	/**
	 * The meta object id for the '{@link Gtm.PersonalDataChangeReason <em>Personal Data Change Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.PersonalDataChangeReason
	 * @see Gtm.impl.GtmPackageImpl#getPersonalDataChangeReason()
	 * @generated
	 */
	int PERSONAL_DATA_CHANGE_REASON = 153;

	/**
	 * The meta object id for the '{@link Gtm.ReservationTravelClass <em>Reservation Travel Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.ReservationTravelClass
	 * @see Gtm.impl.GtmPackageImpl#getReservationTravelClass()
	 * @generated
	 */
	int RESERVATION_TRAVEL_CLASS = 154;

	/**
	 * The meta object id for the '{@link Gtm.ReservationServiceLevel <em>Reservation Service Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.ReservationServiceLevel
	 * @see Gtm.impl.GtmPackageImpl#getReservationServiceLevel()
	 * @generated
	 */
	int RESERVATION_SERVICE_LEVEL = 155;

	/**
	 * The meta object id for the '{@link Gtm.ReservationService <em>Reservation Service</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.ReservationService
	 * @see Gtm.impl.GtmPackageImpl#getReservationService()
	 * @generated
	 */
	int RESERVATION_SERVICE = 156;

	/**
	 * The meta object id for the '{@link Gtm.ReservationBerthType <em>Reservation Berth Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.ReservationBerthType
	 * @see Gtm.impl.GtmPackageImpl#getReservationBerthType()
	 * @generated
	 */
	int RESERVATION_BERTH_TYPE = 157;

	/**
	 * The meta object id for the '{@link Gtm.SchemaVersion <em>Schema Version</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.SchemaVersion
	 * @see Gtm.impl.GtmPackageImpl#getSchemaVersion()
	 * @generated
	 */
	int SCHEMA_VERSION = 158;

	/**
	 * The meta object id for the '{@link Gtm.TimeZone <em>Time Zone</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.TimeZone
	 * @see Gtm.impl.GtmPackageImpl#getTimeZone()
	 * @generated
	 */
	int TIME_ZONE = 159;

	/**
	 * The meta object id for the '{@link Gtm.TaxScope <em>Tax Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.TaxScope
	 * @see Gtm.impl.GtmPackageImpl#getTaxScope()
	 * @generated
	 */
	int TAX_SCOPE = 160;

	/**
	 * The meta object id for the '{@link Gtm.TimeReferenceType <em>Time Reference Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.TimeReferenceType
	 * @see Gtm.impl.GtmPackageImpl#getTimeReferenceType()
	 * @generated
	 */
	int TIME_REFERENCE_TYPE = 161;

	/**
	 * The meta object id for the '{@link Gtm.TimeRangeScope <em>Time Range Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.TimeRangeScope
	 * @see Gtm.impl.GtmPackageImpl#getTimeRangeScope()
	 * @generated
	 */
	int TIME_RANGE_SCOPE = 162;

	/**
	 * The meta object id for the '{@link Gtm.TimeUnit <em>Time Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.TimeUnit
	 * @see Gtm.impl.GtmPackageImpl#getTimeUnit()
	 * @generated
	 */
	int TIME_UNIT = 163;

	/**
	 * The meta object id for the '{@link Gtm.TravelerType <em>Traveler Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.TravelerType
	 * @see Gtm.impl.GtmPackageImpl#getTravelerType()
	 * @generated
	 */
	int TRAVELER_TYPE = 164;

	/**
	 * The meta object id for the '{@link Gtm.WeekDay <em>Week Day</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.WeekDay
	 * @see Gtm.impl.GtmPackageImpl#getWeekDay()
	 * @generated
	 */
	int WEEK_DAY = 165;

	/**
	 * The meta object id for the '{@link Gtm.DataSource <em>Data Source</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.DataSource
	 * @see Gtm.impl.GtmPackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 166;

	/**
	 * The meta object id for the '{@link Gtm.ClassId <em>Class Id</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.ClassId
	 * @see Gtm.impl.GtmPackageImpl#getClassId()
	 * @generated
	 */
	int CLASS_ID = 167;


	/**
	 * Returns the meta object for class '{@link Gtm.GTMTool <em>GTM Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GTM Tool</em>'.
	 * @see Gtm.GTMTool
	 * @generated
	 */
	EClass getGTMTool();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.GTMTool#getConversionFromLegacy <em>Conversion From Legacy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conversion From Legacy</em>'.
	 * @see Gtm.GTMTool#getConversionFromLegacy()
	 * @see #getGTMTool()
	 * @generated
	 */
	EReference getGTMTool_ConversionFromLegacy();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.GTMTool#getCodeLists <em>Code Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code Lists</em>'.
	 * @see Gtm.GTMTool#getCodeLists()
	 * @see #getGTMTool()
	 * @generated
	 */
	EReference getGTMTool_CodeLists();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.GTMTool#getGeneralTariffModel <em>General Tariff Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>General Tariff Model</em>'.
	 * @see Gtm.GTMTool#getGeneralTariffModel()
	 * @see #getGTMTool()
	 * @generated
	 */
	EReference getGTMTool_GeneralTariffModel();

	/**
	 * Returns the meta object for class '{@link Gtm.CodeLists <em>Code Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Lists</em>'.
	 * @see Gtm.CodeLists
	 * @generated
	 */
	EClass getCodeLists();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.CodeLists#getCarriers <em>Carriers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Carriers</em>'.
	 * @see Gtm.CodeLists#getCarriers()
	 * @see #getCodeLists()
	 * @generated
	 */
	EReference getCodeLists_Carriers();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.CodeLists#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stations</em>'.
	 * @see Gtm.CodeLists#getStations()
	 * @see #getCodeLists()
	 * @generated
	 */
	EReference getCodeLists_Stations();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.CodeLists#getCountries <em>Countries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Countries</em>'.
	 * @see Gtm.CodeLists#getCountries()
	 * @see #getCodeLists()
	 * @generated
	 */
	EReference getCodeLists_Countries();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.CodeLists#getLanguages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Languages</em>'.
	 * @see Gtm.CodeLists#getLanguages()
	 * @see #getCodeLists()
	 * @generated
	 */
	EReference getCodeLists_Languages();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.CodeLists#getCurrencies <em>Currencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Currencies</em>'.
	 * @see Gtm.CodeLists#getCurrencies()
	 * @see #getCodeLists()
	 * @generated
	 */
	EReference getCodeLists_Currencies();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.CodeLists#getServiceBrands <em>Service Brands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Brands</em>'.
	 * @see Gtm.CodeLists#getServiceBrands()
	 * @see #getCodeLists()
	 * @generated
	 */
	EReference getCodeLists_ServiceBrands();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.CodeLists#getNutsCodes <em>Nuts Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nuts Codes</em>'.
	 * @see Gtm.CodeLists#getNutsCodes()
	 * @see #getCodeLists()
	 * @generated
	 */
	EReference getCodeLists_NutsCodes();

	/**
	 * Returns the meta object for class '{@link Gtm.NUTSCodes <em>NUTS Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NUTS Codes</em>'.
	 * @see Gtm.NUTSCodes
	 * @generated
	 */
	EClass getNUTSCodes();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.NUTSCodes#getNutsCodes <em>Nuts Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nuts Codes</em>'.
	 * @see Gtm.NUTSCodes#getNutsCodes()
	 * @see #getNUTSCodes()
	 * @generated
	 */
	EReference getNUTSCodes_NutsCodes();

	/**
	 * Returns the meta object for class '{@link Gtm.NutsCode <em>Nuts Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nuts Code</em>'.
	 * @see Gtm.NutsCode
	 * @generated
	 */
	EClass getNutsCode();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.NutsCode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gtm.NutsCode#getName()
	 * @see #getNutsCode()
	 * @generated
	 */
	EAttribute getNutsCode_Name();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.NutsCode#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Gtm.NutsCode#getCode()
	 * @see #getNutsCode()
	 * @generated
	 */
	EAttribute getNutsCode_Code();

	/**
	 * Returns the meta object for class '{@link Gtm.ServiceBrands <em>Service Brands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Brands</em>'.
	 * @see Gtm.ServiceBrands
	 * @generated
	 */
	EClass getServiceBrands();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.ServiceBrands#getServiceBrands <em>Service Brands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Brands</em>'.
	 * @see Gtm.ServiceBrands#getServiceBrands()
	 * @see #getServiceBrands()
	 * @generated
	 */
	EReference getServiceBrands_ServiceBrands();

	/**
	 * Returns the meta object for the '{@link Gtm.ServiceBrands#findServiceBRand(int) <em>Find Service BRand</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Service BRand</em>' operation.
	 * @see Gtm.ServiceBrands#findServiceBRand(int)
	 * @generated
	 */
	EOperation getServiceBrands__FindServiceBRand__int();

	/**
	 * Returns the meta object for class '{@link Gtm.ServiceBrand <em>Service Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Brand</em>'.
	 * @see Gtm.ServiceBrand
	 * @generated
	 */
	EClass getServiceBrand();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ServiceBrand#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Gtm.ServiceBrand#getCode()
	 * @see #getServiceBrand()
	 * @generated
	 */
	EAttribute getServiceBrand_Code();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ServiceBrand#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gtm.ServiceBrand#getName()
	 * @see #getServiceBrand()
	 * @generated
	 */
	EAttribute getServiceBrand_Name();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ServiceBrand#getAbbreviation <em>Abbreviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abbreviation</em>'.
	 * @see Gtm.ServiceBrand#getAbbreviation()
	 * @see #getServiceBrand()
	 * @generated
	 */
	EAttribute getServiceBrand_Abbreviation();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ServiceBrand#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Gtm.ServiceBrand#getDescription()
	 * @see #getServiceBrand()
	 * @generated
	 */
	EAttribute getServiceBrand_Description();

	/**
	 * Returns the meta object for class '{@link Gtm.Countries <em>Countries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Countries</em>'.
	 * @see Gtm.Countries
	 * @generated
	 */
	EClass getCountries();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.Countries#getCountries <em>Countries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Countries</em>'.
	 * @see Gtm.Countries#getCountries()
	 * @see #getCountries()
	 * @generated
	 */
	EReference getCountries_Countries();

	/**
	 * Returns the meta object for the '{@link Gtm.Countries#findCountry(int) <em>Find Country</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Country</em>' operation.
	 * @see Gtm.Countries#findCountry(int)
	 * @generated
	 */
	EOperation getCountries__FindCountry__int();

	/**
	 * Returns the meta object for class '{@link Gtm.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country</em>'.
	 * @see Gtm.Country
	 * @generated
	 */
	EClass getCountry();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Country#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Gtm.Country#getCode()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_Code();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Country#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gtm.Country#getName()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_Name();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Country#getISOcode <em>IS Ocode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IS Ocode</em>'.
	 * @see Gtm.Country#getISOcode()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_ISOcode();

	/**
	 * Returns the meta object for class '{@link Gtm.Languages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Languages</em>'.
	 * @see Gtm.Languages
	 * @generated
	 */
	EClass getLanguages();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.Languages#getLanguages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Languages</em>'.
	 * @see Gtm.Languages#getLanguages()
	 * @see #getLanguages()
	 * @generated
	 */
	EReference getLanguages_Languages();

	/**
	 * Returns the meta object for class '{@link Gtm.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language</em>'.
	 * @see Gtm.Language
	 * @generated
	 */
	EClass getLanguage();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Language#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gtm.Language#getName()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Name();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Language#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Gtm.Language#getCode()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Code();

	/**
	 * Returns the meta object for class '{@link Gtm.Currencies <em>Currencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Currencies</em>'.
	 * @see Gtm.Currencies
	 * @generated
	 */
	EClass getCurrencies();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.Currencies#getCurrencies <em>Currencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Currencies</em>'.
	 * @see Gtm.Currencies#getCurrencies()
	 * @see #getCurrencies()
	 * @generated
	 */
	EReference getCurrencies_Currencies();

	/**
	 * Returns the meta object for the '{@link Gtm.Currencies#findCurrency(java.lang.String) <em>Find Currency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Currency</em>' operation.
	 * @see Gtm.Currencies#findCurrency(java.lang.String)
	 * @generated
	 */
	EOperation getCurrencies__FindCurrency__String();

	/**
	 * Returns the meta object for class '{@link Gtm.Currency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Currency</em>'.
	 * @see Gtm.Currency
	 * @generated
	 */
	EClass getCurrency();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Currency#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gtm.Currency#getName()
	 * @see #getCurrency()
	 * @generated
	 */
	EAttribute getCurrency_Name();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Currency#getIsoCode <em>Iso Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iso Code</em>'.
	 * @see Gtm.Currency#getIsoCode()
	 * @see #getCurrency()
	 * @generated
	 */
	EAttribute getCurrency_IsoCode();

	/**
	 * Returns the meta object for class '{@link Gtm.Stations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stations</em>'.
	 * @see Gtm.Stations
	 * @generated
	 */
	EClass getStations();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.Stations#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stations</em>'.
	 * @see Gtm.Stations#getStations()
	 * @see #getStations()
	 * @generated
	 */
	EReference getStations_Stations();

	/**
	 * Returns the meta object for the '{@link Gtm.Stations#findStation(int, int) <em>Find Station</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Station</em>' operation.
	 * @see Gtm.Stations#findStation(int, int)
	 * @generated
	 */
	EOperation getStations__FindStation__int_int();

	/**
	 * Returns the meta object for the '{@link Gtm.Stations#findStation(int, java.lang.String) <em>Find Station</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Station</em>' operation.
	 * @see Gtm.Stations#findStation(int, java.lang.String)
	 * @generated
	 */
	EOperation getStations__FindStation__int_String();

	/**
	 * Returns the meta object for class '{@link Gtm.Station <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station</em>'.
	 * @see Gtm.Station
	 * @generated
	 */
	EClass getStation();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Station#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gtm.Station#getName()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_Name();

	/**
	 * Returns the meta object for the reference '{@link Gtm.Station#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Country</em>'.
	 * @see Gtm.Station#getCountry()
	 * @see #getStation()
	 * @generated
	 */
	EReference getStation_Country();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Station#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Gtm.Station#getCode()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_Code();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Station#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see Gtm.Station#getLongitude()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Station#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see Gtm.Station#getLatitude()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Station#getTimetableName <em>Timetable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timetable Name</em>'.
	 * @see Gtm.Station#getTimetableName()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_TimetableName();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Station#isBorderStation <em>Border Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Station</em>'.
	 * @see Gtm.Station#isBorderStation()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_BorderStation();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Station#getNameCaseUTF8 <em>Name Case UTF8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Case UTF8</em>'.
	 * @see Gtm.Station#getNameCaseUTF8()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_NameCaseUTF8();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Station#getNameCaseASCII <em>Name Case ASCII</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Case ASCII</em>'.
	 * @see Gtm.Station#getNameCaseASCII()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_NameCaseASCII();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Station#getShortNameCaseASCII <em>Short Name Case ASCII</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name Case ASCII</em>'.
	 * @see Gtm.Station#getShortNameCaseASCII()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_ShortNameCaseASCII();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Station#getShortNameCaseUTF8 <em>Short Name Case UTF8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name Case UTF8</em>'.
	 * @see Gtm.Station#getShortNameCaseUTF8()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_ShortNameCaseUTF8();

	/**
	 * Returns the meta object for class '{@link Gtm.Carrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier</em>'.
	 * @see Gtm.Carrier
	 * @generated
	 */
	EClass getCarrier();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Carrier#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Gtm.Carrier#getCode()
	 * @see #getCarrier()
	 * @generated
	 */
	EAttribute getCarrier_Code();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Carrier#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gtm.Carrier#getName()
	 * @see #getCarrier()
	 * @generated
	 */
	EAttribute getCarrier_Name();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Carrier#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see Gtm.Carrier#getShortName()
	 * @see #getCarrier()
	 * @generated
	 */
	EAttribute getCarrier_ShortName();

	/**
	 * Returns the meta object for class '{@link Gtm.Carriers <em>Carriers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carriers</em>'.
	 * @see Gtm.Carriers
	 * @generated
	 */
	EClass getCarriers();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.Carriers#getCarriers <em>Carriers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Carriers</em>'.
	 * @see Gtm.Carriers#getCarriers()
	 * @see #getCarriers()
	 * @generated
	 */
	EReference getCarriers_Carriers();

	/**
	 * Returns the meta object for the '{@link Gtm.Carriers#findCarrier(java.lang.String) <em>Find Carrier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Carrier</em>' operation.
	 * @see Gtm.Carriers#findCarrier(java.lang.String)
	 * @generated
	 */
	EOperation getCarriers__FindCarrier__String();

	/**
	 * Returns the meta object for class '{@link Gtm.StationSet <em>Station Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station Set</em>'.
	 * @see Gtm.StationSet
	 * @generated
	 */
	EClass getStationSet();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.StationSet#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stations</em>'.
	 * @see Gtm.StationSet#getStations()
	 * @see #getStationSet()
	 * @generated
	 */
	EReference getStationSet_Stations();

	/**
	 * Returns the meta object for class '{@link Gtm.GeneralTariffModel <em>General Tariff Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Tariff Model</em>'.
	 * @see Gtm.GeneralTariffModel
	 * @generated
	 */
	EClass getGeneralTariffModel();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.GeneralTariffModel#getDelivery <em>Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delivery</em>'.
	 * @see Gtm.GeneralTariffModel#getDelivery()
	 * @see #getGeneralTariffModel()
	 * @generated
	 */
	EReference getGeneralTariffModel_Delivery();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.GeneralTariffModel#getFareStructure <em>Fare Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fare Structure</em>'.
	 * @see Gtm.GeneralTariffModel#getFareStructure()
	 * @see #getGeneralTariffModel()
	 * @generated
	 */
	EReference getGeneralTariffModel_FareStructure();

	/**
	 * Returns the meta object for class '{@link Gtm.Delivery <em>Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delivery</em>'.
	 * @see Gtm.Delivery
	 * @generated
	 */
	EClass getDelivery();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Delivery#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.Delivery#getId()
	 * @see #getDelivery()
	 * @generated
	 */
	EAttribute getDelivery_Id();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Delivery#getPreviousDeliveryId <em>Previous Delivery Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous Delivery Id</em>'.
	 * @see Gtm.Delivery#getPreviousDeliveryId()
	 * @see #getDelivery()
	 * @generated
	 */
	EAttribute getDelivery_PreviousDeliveryId();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Delivery#getReplacedDeliveryId <em>Replaced Delivery Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replaced Delivery Id</em>'.
	 * @see Gtm.Delivery#getReplacedDeliveryId()
	 * @see #getDelivery()
	 * @generated
	 */
	EAttribute getDelivery_ReplacedDeliveryId();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Delivery#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see Gtm.Delivery#isOptional()
	 * @see #getDelivery()
	 * @generated
	 */
	EAttribute getDelivery_Optional();

	/**
	 * Returns the meta object for the reference '{@link Gtm.Delivery#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provider</em>'.
	 * @see Gtm.Delivery#getProvider()
	 * @see #getDelivery()
	 * @generated
	 */
	EReference getDelivery_Provider();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Delivery#getSchemaVersion <em>Schema Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Version</em>'.
	 * @see Gtm.Delivery#getSchemaVersion()
	 * @see #getDelivery()
	 * @generated
	 */
	EAttribute getDelivery_SchemaVersion();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Delivery#getAcceptedSchemaVersion <em>Accepted Schema Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accepted Schema Version</em>'.
	 * @see Gtm.Delivery#getAcceptedSchemaVersion()
	 * @see #getDelivery()
	 * @generated
	 */
	EAttribute getDelivery_AcceptedSchemaVersion();

	/**
	 * Returns the meta object for class '{@link Gtm.AfterSalesRules <em>After Sales Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>After Sales Rules</em>'.
	 * @see Gtm.AfterSalesRules
	 * @generated
	 */
	EClass getAfterSalesRules();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.AfterSalesRules#getAfterSalesRules <em>After Sales Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>After Sales Rules</em>'.
	 * @see Gtm.AfterSalesRules#getAfterSalesRules()
	 * @see #getAfterSalesRules()
	 * @generated
	 */
	EReference getAfterSalesRules_AfterSalesRules();

	/**
	 * Returns the meta object for class '{@link Gtm.AfterSalesRule <em>After Sales Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>After Sales Rule</em>'.
	 * @see Gtm.AfterSalesRule
	 * @generated
	 */
	EClass getAfterSalesRule();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.AfterSalesRule#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.AfterSalesRule#getId()
	 * @see #getAfterSalesRule()
	 * @generated
	 */
	EAttribute getAfterSalesRule_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.AfterSalesRule#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see Gtm.AfterSalesRule#getConditions()
	 * @see #getAfterSalesRule()
	 * @generated
	 */
	EReference getAfterSalesRule_Conditions();

	/**
	 * Returns the meta object for class '{@link Gtm.AfterSalesCondition <em>After Sales Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>After Sales Condition</em>'.
	 * @see Gtm.AfterSalesCondition
	 * @generated
	 */
	EClass getAfterSalesCondition();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.AfterSalesCondition#getTransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Type</em>'.
	 * @see Gtm.AfterSalesCondition#getTransactionType()
	 * @see #getAfterSalesCondition()
	 * @generated
	 */
	EAttribute getAfterSalesCondition_TransactionType();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.AfterSalesCondition#isIndividualContracts <em>Individual Contracts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Individual Contracts</em>'.
	 * @see Gtm.AfterSalesCondition#isIndividualContracts()
	 * @see #getAfterSalesCondition()
	 * @generated
	 */
	EAttribute getAfterSalesCondition_IndividualContracts();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.AfterSalesCondition#isCarrierFee <em>Carrier Fee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Carrier Fee</em>'.
	 * @see Gtm.AfterSalesCondition#isCarrierFee()
	 * @see #getAfterSalesCondition()
	 * @generated
	 */
	EAttribute getAfterSalesCondition_CarrierFee();

	/**
	 * Returns the meta object for the reference '{@link Gtm.AfterSalesCondition#getFee <em>Fee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fee</em>'.
	 * @see Gtm.AfterSalesCondition#getFee()
	 * @see #getAfterSalesCondition()
	 * @generated
	 */
	EReference getAfterSalesCondition_Fee();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.AfterSalesCondition#getApplicationTime <em>Application Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Time</em>'.
	 * @see Gtm.AfterSalesCondition#getApplicationTime()
	 * @see #getAfterSalesCondition()
	 * @generated
	 */
	EReference getAfterSalesCondition_ApplicationTime();

	/**
	 * Returns the meta object for class '{@link Gtm.ApplicationTime <em>Application Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Time</em>'.
	 * @see Gtm.ApplicationTime
	 * @generated
	 */
	EClass getApplicationTime();

	/**
	 * Returns the meta object for class '{@link Gtm.FareStructure <em>Fare Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fare Structure</em>'.
	 * @see Gtm.FareStructure
	 * @generated
	 */
	EClass getFareStructure();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getServiceClassDefinitions <em>Service Class Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Class Definitions</em>'.
	 * @see Gtm.FareStructure#getServiceClassDefinitions()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_ServiceClassDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getServiceLevelDefinitions <em>Service Level Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Level Definitions</em>'.
	 * @see Gtm.FareStructure#getServiceLevelDefinitions()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_ServiceLevelDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getStationNames <em>Station Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Station Names</em>'.
	 * @see Gtm.FareStructure#getStationNames()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_StationNames();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getFareStationSetDefinitions <em>Fare Station Set Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fare Station Set Definitions</em>'.
	 * @see Gtm.FareStructure#getFareStationSetDefinitions()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_FareStationSetDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getCalendars <em>Calendars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calendars</em>'.
	 * @see Gtm.FareStructure#getCalendars()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_Calendars();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getTexts <em>Texts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Texts</em>'.
	 * @see Gtm.FareStructure#getTexts()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_Texts();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getReductionCards <em>Reduction Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reduction Cards</em>'.
	 * @see Gtm.FareStructure#getReductionCards()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_ReductionCards();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getFareElements <em>Fare Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fare Elements</em>'.
	 * @see Gtm.FareStructure#getFareElements()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_FareElements();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getCombinationConstraints <em>Combination Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Combination Constraints</em>'.
	 * @see Gtm.FareStructure#getCombinationConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_CombinationConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getSalesAvailabilityConstraints <em>Sales Availability Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sales Availability Constraints</em>'.
	 * @see Gtm.FareStructure#getSalesAvailabilityConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_SalesAvailabilityConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getTravelValidityConstraints <em>Travel Validity Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Travel Validity Constraints</em>'.
	 * @see Gtm.FareStructure#getTravelValidityConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_TravelValidityConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getRegionalConstraints <em>Regional Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Regional Constraints</em>'.
	 * @see Gtm.FareStructure#getRegionalConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_RegionalConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getConnectionPoints <em>Connection Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Points</em>'.
	 * @see Gtm.FareStructure#getConnectionPoints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_ConnectionPoints();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getCarrierConstraints <em>Carrier Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Carrier Constraints</em>'.
	 * @see Gtm.FareStructure#getCarrierConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_CarrierConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getServiceConstraints <em>Service Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Constraints</em>'.
	 * @see Gtm.FareStructure#getServiceConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_ServiceConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getPassengerConstraints <em>Passenger Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Passenger Constraints</em>'.
	 * @see Gtm.FareStructure#getPassengerConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_PassengerConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getReductionConstraints <em>Reduction Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reduction Constraints</em>'.
	 * @see Gtm.FareStructure#getReductionConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_ReductionConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getPersonalDataConstraints <em>Personal Data Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Personal Data Constraints</em>'.
	 * @see Gtm.FareStructure#getPersonalDataConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_PersonalDataConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getAfterSalesRules <em>After Sales Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>After Sales Rules</em>'.
	 * @see Gtm.FareStructure#getAfterSalesRules()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_AfterSalesRules();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getPrices <em>Prices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prices</em>'.
	 * @see Gtm.FareStructure#getPrices()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_Prices();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getFulfillmentConstraints <em>Fulfillment Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fulfillment Constraints</em>'.
	 * @see Gtm.FareStructure#getFulfillmentConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_FulfillmentConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getReservationParameters <em>Reservation Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reservation Parameters</em>'.
	 * @see Gtm.FareStructure#getReservationParameters()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_ReservationParameters();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getSupportedOnlineServices <em>Supported Online Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supported Online Services</em>'.
	 * @see Gtm.FareStructure#getSupportedOnlineServices()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_SupportedOnlineServices();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getFareResourceLocations <em>Fare Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fare Resource Locations</em>'.
	 * @see Gtm.FareStructure#getFareResourceLocations()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_FareResourceLocations();

	/**
	 * Returns the meta object for class '{@link Gtm.ConnectionPoints <em>Connection Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Points</em>'.
	 * @see Gtm.ConnectionPoints
	 * @generated
	 */
	EClass getConnectionPoints();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.ConnectionPoints#getConnectionPoints <em>Connection Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection Points</em>'.
	 * @see Gtm.ConnectionPoints#getConnectionPoints()
	 * @see #getConnectionPoints()
	 * @generated
	 */
	EReference getConnectionPoints_ConnectionPoints();

	/**
	 * Returns the meta object for the '{@link Gtm.ConnectionPoints#findSimpleConnectionPoint(Gtm.Station) <em>Find Simple Connection Point</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Simple Connection Point</em>' operation.
	 * @see Gtm.ConnectionPoints#findSimpleConnectionPoint(Gtm.Station)
	 * @generated
	 */
	EOperation getConnectionPoints__FindSimpleConnectionPoint__Station();

	/**
	 * Returns the meta object for class '{@link Gtm.ConnectionPoint <em>Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Point</em>'.
	 * @see Gtm.ConnectionPoint
	 * @generated
	 */
	EClass getConnectionPoint();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ConnectionPoint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.ConnectionPoint#getId()
	 * @see #getConnectionPoint()
	 * @generated
	 */
	EAttribute getConnectionPoint_Id();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ConnectionPoint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gtm.ConnectionPoint#getName()
	 * @see #getConnectionPoint()
	 * @generated
	 */
	EAttribute getConnectionPoint_Name();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ConnectionPoint#getLegacyBorderPointCode <em>Legacy Border Point Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legacy Border Point Code</em>'.
	 * @see Gtm.ConnectionPoint#getLegacyBorderPointCode()
	 * @see #getConnectionPoint()
	 * @generated
	 */
	EAttribute getConnectionPoint_LegacyBorderPointCode();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ConnectionPoint#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Gtm.ConnectionPoint#getDescription()
	 * @see #getConnectionPoint()
	 * @generated
	 */
	EAttribute getConnectionPoint_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.ConnectionPoint#getConnectedStationSets <em>Connected Station Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connected Station Sets</em>'.
	 * @see Gtm.ConnectionPoint#getConnectedStationSets()
	 * @see #getConnectionPoint()
	 * @generated
	 */
	EReference getConnectionPoint_ConnectedStationSets();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ConnectionPoint#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see Gtm.ConnectionPoint#getDataSource()
	 * @see #getConnectionPoint()
	 * @generated
	 */
	EAttribute getConnectionPoint_DataSource();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ConnectionPoint#getNameUtf8 <em>Name Utf8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Utf8</em>'.
	 * @see Gtm.ConnectionPoint#getNameUtf8()
	 * @see #getConnectionPoint()
	 * @generated
	 */
	EAttribute getConnectionPoint_NameUtf8();

	/**
	 * Returns the meta object for class '{@link Gtm.FareResourceLocations <em>Fare Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fare Resource Locations</em>'.
	 * @see Gtm.FareResourceLocations
	 * @generated
	 */
	EClass getFareResourceLocations();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareResourceLocations#getTrainResourceLocations <em>Train Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Train Resource Locations</em>'.
	 * @see Gtm.FareResourceLocations#getTrainResourceLocations()
	 * @see #getFareResourceLocations()
	 * @generated
	 */
	EReference getFareResourceLocations_TrainResourceLocations();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareResourceLocations#getStationResourceLocations <em>Station Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Station Resource Locations</em>'.
	 * @see Gtm.FareResourceLocations#getStationResourceLocations()
	 * @see #getFareResourceLocations()
	 * @generated
	 */
	EReference getFareResourceLocations_StationResourceLocations();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareResourceLocations#getCarrierResourceLocations <em>Carrier Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Carrier Resource Locations</em>'.
	 * @see Gtm.FareResourceLocations#getCarrierResourceLocations()
	 * @see #getFareResourceLocations()
	 * @generated
	 */
	EReference getFareResourceLocations_CarrierResourceLocations();

	/**
	 * Returns the meta object for class '{@link Gtm.TrainResourceLocations <em>Train Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train Resource Locations</em>'.
	 * @see Gtm.TrainResourceLocations
	 * @generated
	 */
	EClass getTrainResourceLocations();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.TrainResourceLocations#getTrainResourceLocations <em>Train Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Train Resource Locations</em>'.
	 * @see Gtm.TrainResourceLocations#getTrainResourceLocations()
	 * @see #getTrainResourceLocations()
	 * @generated
	 */
	EReference getTrainResourceLocations_TrainResourceLocations();

	/**
	 * Returns the meta object for class '{@link Gtm.StationResourceLocations <em>Station Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station Resource Locations</em>'.
	 * @see Gtm.StationResourceLocations
	 * @generated
	 */
	EClass getStationResourceLocations();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.StationResourceLocations#getStationResourceLocations <em>Station Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Station Resource Locations</em>'.
	 * @see Gtm.StationResourceLocations#getStationResourceLocations()
	 * @see #getStationResourceLocations()
	 * @generated
	 */
	EReference getStationResourceLocations_StationResourceLocations();

	/**
	 * Returns the meta object for class '{@link Gtm.CarrierResourceLocations <em>Carrier Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Resource Locations</em>'.
	 * @see Gtm.CarrierResourceLocations
	 * @generated
	 */
	EClass getCarrierResourceLocations();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.CarrierResourceLocations#getCarrierResourceLocations <em>Carrier Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Carrier Resource Locations</em>'.
	 * @see Gtm.CarrierResourceLocations#getCarrierResourceLocations()
	 * @see #getCarrierResourceLocations()
	 * @generated
	 */
	EReference getCarrierResourceLocations_CarrierResourceLocations();

	/**
	 * Returns the meta object for class '{@link Gtm.TrainResourceLocation <em>Train Resource Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train Resource Location</em>'.
	 * @see Gtm.TrainResourceLocation
	 * @generated
	 */
	EClass getTrainResourceLocation();

	/**
	 * Returns the meta object for the reference '{@link Gtm.TrainResourceLocation#getCarrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier</em>'.
	 * @see Gtm.TrainResourceLocation#getCarrier()
	 * @see #getTrainResourceLocation()
	 * @generated
	 */
	EReference getTrainResourceLocation_Carrier();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.TrainResourceLocation#getOnlineResources <em>Online Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Online Resources</em>'.
	 * @see Gtm.TrainResourceLocation#getOnlineResources()
	 * @see #getTrainResourceLocation()
	 * @generated
	 */
	EReference getTrainResourceLocation_OnlineResources();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.TrainResourceLocation#getTrainId <em>Train Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Train Id</em>'.
	 * @see Gtm.TrainResourceLocation#getTrainId()
	 * @see #getTrainResourceLocation()
	 * @generated
	 */
	EAttribute getTrainResourceLocation_TrainId();

	/**
	 * Returns the meta object for class '{@link Gtm.StationResourceLocation <em>Station Resource Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station Resource Location</em>'.
	 * @see Gtm.StationResourceLocation
	 * @generated
	 */
	EClass getStationResourceLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.StationResourceLocation#getOnlineResources <em>Online Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Online Resources</em>'.
	 * @see Gtm.StationResourceLocation#getOnlineResources()
	 * @see #getStationResourceLocation()
	 * @generated
	 */
	EReference getStationResourceLocation_OnlineResources();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.StationResourceLocation#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stations</em>'.
	 * @see Gtm.StationResourceLocation#getStations()
	 * @see #getStationResourceLocation()
	 * @generated
	 */
	EReference getStationResourceLocation_Stations();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.StationResourceLocation#getConnectionPoints <em>Connection Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connection Points</em>'.
	 * @see Gtm.StationResourceLocation#getConnectionPoints()
	 * @see #getStationResourceLocation()
	 * @generated
	 */
	EReference getStationResourceLocation_ConnectionPoints();

	/**
	 * Returns the meta object for class '{@link Gtm.OnlineResource <em>Online Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Online Resource</em>'.
	 * @see Gtm.OnlineResource
	 * @generated
	 */
	EClass getOnlineResource();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.OnlineResource#getOfferRequestType <em>Offer Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offer Request Type</em>'.
	 * @see Gtm.OnlineResource#getOfferRequestType()
	 * @see #getOnlineResource()
	 * @generated
	 */
	EAttribute getOnlineResource_OfferRequestType();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.OnlineResource#getInterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Type</em>'.
	 * @see Gtm.OnlineResource#getInterfaceType()
	 * @see #getOnlineResource()
	 * @generated
	 */
	EAttribute getOnlineResource_InterfaceType();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.OnlineResource#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see Gtm.OnlineResource#getVersion()
	 * @see #getOnlineResource()
	 * @generated
	 */
	EAttribute getOnlineResource_Version();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.OnlineResource#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see Gtm.OnlineResource#getSystem()
	 * @see #getOnlineResource()
	 * @generated
	 */
	EAttribute getOnlineResource_System();

	/**
	 * Returns the meta object for class '{@link Gtm.FulfillmentConstraints <em>Fulfillment Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fulfillment Constraints</em>'.
	 * @see Gtm.FulfillmentConstraints
	 * @generated
	 */
	EClass getFulfillmentConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.FulfillmentConstraints#getFulfillmentConstraints <em>Fulfillment Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fulfillment Constraints</em>'.
	 * @see Gtm.FulfillmentConstraints#getFulfillmentConstraints()
	 * @see #getFulfillmentConstraints()
	 * @generated
	 */
	EReference getFulfillmentConstraints_FulfillmentConstraints();

	/**
	 * Returns the meta object for class '{@link Gtm.FulfillmentConstraint <em>Fulfillment Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fulfillment Constraint</em>'.
	 * @see Gtm.FulfillmentConstraint
	 * @generated
	 */
	EClass getFulfillmentConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FulfillmentConstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.FulfillmentConstraint#getId()
	 * @see #getFulfillmentConstraint()
	 * @generated
	 */
	EAttribute getFulfillmentConstraint_Id();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.FulfillmentConstraint#getAcceptedFulfilmentTypes <em>Accepted Fulfilment Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Accepted Fulfilment Types</em>'.
	 * @see Gtm.FulfillmentConstraint#getAcceptedFulfilmentTypes()
	 * @see #getFulfillmentConstraint()
	 * @generated
	 */
	EAttribute getFulfillmentConstraint_AcceptedFulfilmentTypes();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.FulfillmentConstraint#getRequiredControlDataExchange <em>Required Control Data Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Required Control Data Exchange</em>'.
	 * @see Gtm.FulfillmentConstraint#getRequiredControlDataExchange()
	 * @see #getFulfillmentConstraint()
	 * @generated
	 */
	EAttribute getFulfillmentConstraint_RequiredControlDataExchange();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FulfillmentConstraint#isIndividualTicketingPermitted <em>Individual Ticketing Permitted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Individual Ticketing Permitted</em>'.
	 * @see Gtm.FulfillmentConstraint#isIndividualTicketingPermitted()
	 * @see #getFulfillmentConstraint()
	 * @generated
	 */
	EAttribute getFulfillmentConstraint_IndividualTicketingPermitted();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FulfillmentConstraint#getAcceptedBarcodes <em>Accepted Barcodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Accepted Barcodes</em>'.
	 * @see Gtm.FulfillmentConstraint#getAcceptedBarcodes()
	 * @see #getFulfillmentConstraint()
	 * @generated
	 */
	EReference getFulfillmentConstraint_AcceptedBarcodes();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FulfillmentConstraint#getRequiredBarcodes <em>Required Barcodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Barcodes</em>'.
	 * @see Gtm.FulfillmentConstraint#getRequiredBarcodes()
	 * @see #getFulfillmentConstraint()
	 * @generated
	 */
	EReference getFulfillmentConstraint_RequiredBarcodes();

	/**
	 * Returns the meta object for class '{@link Gtm.RequiredBarcodes <em>Required Barcodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Barcodes</em>'.
	 * @see Gtm.RequiredBarcodes
	 * @generated
	 */
	EClass getRequiredBarcodes();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.RequiredBarcodes#getRequiredBarcodes <em>Required Barcodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Required Barcodes</em>'.
	 * @see Gtm.RequiredBarcodes#getRequiredBarcodes()
	 * @see #getRequiredBarcodes()
	 * @generated
	 */
	EAttribute getRequiredBarcodes_RequiredBarcodes();

	/**
	 * Returns the meta object for class '{@link Gtm.AcceptedBarcodes <em>Accepted Barcodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accepted Barcodes</em>'.
	 * @see Gtm.AcceptedBarcodes
	 * @generated
	 */
	EClass getAcceptedBarcodes();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.AcceptedBarcodes#getAcceptedBarcodes <em>Accepted Barcodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Accepted Barcodes</em>'.
	 * @see Gtm.AcceptedBarcodes#getAcceptedBarcodes()
	 * @see #getAcceptedBarcodes()
	 * @generated
	 */
	EAttribute getAcceptedBarcodes_AcceptedBarcodes();

	/**
	 * Returns the meta object for class '{@link Gtm.SupportedOnlineServices <em>Supported Online Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supported Online Services</em>'.
	 * @see Gtm.SupportedOnlineServices
	 * @generated
	 */
	EClass getSupportedOnlineServices();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.SupportedOnlineServices#getSupportedOnlineServices <em>Supported Online Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Supported Online Services</em>'.
	 * @see Gtm.SupportedOnlineServices#getSupportedOnlineServices()
	 * @see #getSupportedOnlineServices()
	 * @generated
	 */
	EAttribute getSupportedOnlineServices_SupportedOnlineServices();

	/**
	 * Returns the meta object for class '{@link Gtm.StationNames <em>Station Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station Names</em>'.
	 * @see Gtm.StationNames
	 * @generated
	 */
	EClass getStationNames();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.StationNames#getStationName <em>Station Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Station Name</em>'.
	 * @see Gtm.StationNames#getStationName()
	 * @see #getStationNames()
	 * @generated
	 */
	EReference getStationNames_StationName();

	/**
	 * Returns the meta object for class '{@link Gtm.FareElement <em>Fare Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fare Element</em>'.
	 * @see Gtm.FareElement
	 * @generated
	 */
	EClass getFareElement();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.FareElement#getId()
	 * @see #getFareElement()
	 * @generated
	 */
	EAttribute getFareElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Gtm.FareElement#getType()
	 * @see #getFareElement()
	 * @generated
	 */
	EAttribute getFareElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareElement#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Gtm.FareElement#getDataDescription()
	 * @see #getFareElement()
	 * @generated
	 */
	EAttribute getFareElement_DataDescription();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Text</em>'.
	 * @see Gtm.FareElement#getText()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_Text();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Price</em>'.
	 * @see Gtm.FareElement#getPrice()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_Price();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getRegionalConstraint <em>Regional Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Regional Constraint</em>'.
	 * @see Gtm.FareElement#getRegionalConstraint()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_RegionalConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getServiceConstraint <em>Service Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Constraint</em>'.
	 * @see Gtm.FareElement#getServiceConstraint()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_ServiceConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getCarrierConstraint <em>Carrier Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier Constraint</em>'.
	 * @see Gtm.FareElement#getCarrierConstraint()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_CarrierConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getServiceClass <em>Service Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Class</em>'.
	 * @see Gtm.FareElement#getServiceClass()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_ServiceClass();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getServiceLevel <em>Service Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Level</em>'.
	 * @see Gtm.FareElement#getServiceLevel()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_ServiceLevel();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getSalesAvailability <em>Sales Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sales Availability</em>'.
	 * @see Gtm.FareElement#getSalesAvailability()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_SalesAvailability();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getTravelValidity <em>Travel Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Travel Validity</em>'.
	 * @see Gtm.FareElement#getTravelValidity()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_TravelValidity();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getCombinationConstraint <em>Combination Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Combination Constraint</em>'.
	 * @see Gtm.FareElement#getCombinationConstraint()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_CombinationConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getFareDetailDescription <em>Fare Detail Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fare Detail Description</em>'.
	 * @see Gtm.FareElement#getFareDetailDescription()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_FareDetailDescription();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getPersonalDataConstraint <em>Personal Data Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Personal Data Constraint</em>'.
	 * @see Gtm.FareElement#getPersonalDataConstraint()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_PersonalDataConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getReservationParameter <em>Reservation Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reservation Parameter</em>'.
	 * @see Gtm.FareElement#getReservationParameter()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_ReservationParameter();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getReductionConstraint <em>Reduction Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reduction Constraint</em>'.
	 * @see Gtm.FareElement#getReductionConstraint()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_ReductionConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getFulfillmentConstraint <em>Fulfillment Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fulfillment Constraint</em>'.
	 * @see Gtm.FareElement#getFulfillmentConstraint()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_FulfillmentConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getPassengerConstraint <em>Passenger Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Passenger Constraint</em>'.
	 * @see Gtm.FareElement#getPassengerConstraint()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_PassengerConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getAfterSalesRule <em>After Sales Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>After Sales Rule</em>'.
	 * @see Gtm.FareElement#getAfterSalesRule()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_AfterSalesRule();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareElement#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see Gtm.FareElement#getDataSource()
	 * @see #getFareElement()
	 * @generated
	 */
	EAttribute getFareElement_DataSource();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareElement#getLegacyAccountingIdentifier <em>Legacy Accounting Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legacy Accounting Identifier</em>'.
	 * @see Gtm.FareElement#getLegacyAccountingIdentifier()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_LegacyAccountingIdentifier();

	/**
	 * Returns the meta object for class '{@link Gtm.FareStationSetDefinitions <em>Fare Station Set Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fare Station Set Definitions</em>'.
	 * @see Gtm.FareStationSetDefinitions
	 * @generated
	 */
	EClass getFareStationSetDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.FareStationSetDefinitions#getFareStationSetDefinitions <em>Fare Station Set Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fare Station Set Definitions</em>'.
	 * @see Gtm.FareStationSetDefinitions#getFareStationSetDefinitions()
	 * @see #getFareStationSetDefinitions()
	 * @generated
	 */
	EReference getFareStationSetDefinitions_FareStationSetDefinitions();

	/**
	 * Returns the meta object for the '{@link Gtm.FareStationSetDefinitions#findFareSet(Gtm.Carrier, int) <em>Find Fare Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Fare Set</em>' operation.
	 * @see Gtm.FareStationSetDefinitions#findFareSet(Gtm.Carrier, int)
	 * @generated
	 */
	EOperation getFareStationSetDefinitions__FindFareSet__Carrier_int();

	/**
	 * Returns the meta object for class '{@link Gtm.FareStationSetDefinition <em>Fare Station Set Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fare Station Set Definition</em>'.
	 * @see Gtm.FareStationSetDefinition
	 * @generated
	 */
	EClass getFareStationSetDefinition();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareStationSetDefinition#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see Gtm.FareStationSetDefinition#getDataSource()
	 * @see #getFareStationSetDefinition()
	 * @generated
	 */
	EAttribute getFareStationSetDefinition_DataSource();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareStationSetDefinition#getCarrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier</em>'.
	 * @see Gtm.FareStationSetDefinition#getCarrier()
	 * @see #getFareStationSetDefinition()
	 * @generated
	 */
	EReference getFareStationSetDefinition_Carrier();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareStationSetDefinition#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Gtm.FareStationSetDefinition#getCode()
	 * @see #getFareStationSetDefinition()
	 * @generated
	 */
	EAttribute getFareStationSetDefinition_Code();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareStationSetDefinition#getLegacyCode <em>Legacy Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legacy Code</em>'.
	 * @see Gtm.FareStationSetDefinition#getLegacyCode()
	 * @see #getFareStationSetDefinition()
	 * @generated
	 */
	EAttribute getFareStationSetDefinition_LegacyCode();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareStationSetDefinition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.FareStationSetDefinition#getId()
	 * @see #getFareStationSetDefinition()
	 * @generated
	 */
	EAttribute getFareStationSetDefinition_Id();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareStationSetDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gtm.FareStationSetDefinition#getName()
	 * @see #getFareStationSetDefinition()
	 * @generated
	 */
	EAttribute getFareStationSetDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareStationSetDefinition#getNameUtf8 <em>Name Utf8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Utf8</em>'.
	 * @see Gtm.FareStationSetDefinition#getNameUtf8()
	 * @see #getFareStationSetDefinition()
	 * @generated
	 */
	EAttribute getFareStationSetDefinition_NameUtf8();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.FareStationSetDefinition#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stations</em>'.
	 * @see Gtm.FareStationSetDefinition#getStations()
	 * @see #getFareStationSetDefinition()
	 * @generated
	 */
	EReference getFareStationSetDefinition_Stations();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyAccountingIdentifier <em>Legacy Accounting Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Accounting Identifier</em>'.
	 * @see Gtm.LegacyAccountingIdentifier
	 * @generated
	 */
	EClass getLegacyAccountingIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyAccountingIdentifier#getSeriesId <em>Series Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Series Id</em>'.
	 * @see Gtm.LegacyAccountingIdentifier#getSeriesId()
	 * @see #getLegacyAccountingIdentifier()
	 * @generated
	 */
	EAttribute getLegacyAccountingIdentifier_SeriesId();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyAccountingIdentifier#getTariffId <em>Tariff Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tariff Id</em>'.
	 * @see Gtm.LegacyAccountingIdentifier#getTariffId()
	 * @see #getLegacyAccountingIdentifier()
	 * @generated
	 */
	EAttribute getLegacyAccountingIdentifier_TariffId();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyAccountingIdentifier#getAddSeriesId <em>Add Series Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Add Series Id</em>'.
	 * @see Gtm.LegacyAccountingIdentifier#getAddSeriesId()
	 * @see #getLegacyAccountingIdentifier()
	 * @generated
	 */
	EAttribute getLegacyAccountingIdentifier_AddSeriesId();

	/**
	 * Returns the meta object for class '{@link Gtm.ReductionConstraints <em>Reduction Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reduction Constraints</em>'.
	 * @see Gtm.ReductionConstraints
	 * @generated
	 */
	EClass getReductionConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.ReductionConstraints#getReductionConstraints <em>Reduction Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reduction Constraints</em>'.
	 * @see Gtm.ReductionConstraints#getReductionConstraints()
	 * @see #getReductionConstraints()
	 * @generated
	 */
	EReference getReductionConstraints_ReductionConstraints();

	/**
	 * Returns the meta object for class '{@link Gtm.FareElements <em>Fare Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fare Elements</em>'.
	 * @see Gtm.FareElements
	 * @generated
	 */
	EClass getFareElements();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.FareElements#getFareElements <em>Fare Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fare Elements</em>'.
	 * @see Gtm.FareElements#getFareElements()
	 * @see #getFareElements()
	 * @generated
	 */
	EReference getFareElements_FareElements();

	/**
	 * Returns the meta object for class '{@link Gtm.PersonalDataConstraints <em>Personal Data Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personal Data Constraints</em>'.
	 * @see Gtm.PersonalDataConstraints
	 * @generated
	 */
	EClass getPersonalDataConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.PersonalDataConstraints#getPersonalDataConstraints <em>Personal Data Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Personal Data Constraints</em>'.
	 * @see Gtm.PersonalDataConstraints#getPersonalDataConstraints()
	 * @see #getPersonalDataConstraints()
	 * @generated
	 */
	EReference getPersonalDataConstraints_PersonalDataConstraints();

	/**
	 * Returns the meta object for class '{@link Gtm.PersonalDataConstraint <em>Personal Data Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personal Data Constraint</em>'.
	 * @see Gtm.PersonalDataConstraint
	 * @generated
	 */
	EClass getPersonalDataConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.PersonalDataConstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.PersonalDataConstraint#getId()
	 * @see #getPersonalDataConstraint()
	 * @generated
	 */
	EAttribute getPersonalDataConstraint_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.PersonalDataConstraint#getRequiredPersonalData <em>Required Personal Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Personal Data</em>'.
	 * @see Gtm.PersonalDataConstraint#getRequiredPersonalData()
	 * @see #getPersonalDataConstraint()
	 * @generated
	 */
	EReference getPersonalDataConstraint_RequiredPersonalData();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.PersonalDataConstraint#getAllowedChanges <em>Allowed Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Allowed Changes</em>'.
	 * @see Gtm.PersonalDataConstraint#getAllowedChanges()
	 * @see #getPersonalDataConstraint()
	 * @generated
	 */
	EReference getPersonalDataConstraint_AllowedChanges();

	/**
	 * Returns the meta object for class '{@link Gtm.RequiredPersonalData <em>Required Personal Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Personal Data</em>'.
	 * @see Gtm.RequiredPersonalData
	 * @generated
	 */
	EClass getRequiredPersonalData();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.RequiredPersonalData#isTicketHolderOnly <em>Ticket Holder Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ticket Holder Only</em>'.
	 * @see Gtm.RequiredPersonalData#isTicketHolderOnly()
	 * @see #getRequiredPersonalData()
	 * @generated
	 */
	EAttribute getRequiredPersonalData_TicketHolderOnly();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.RequiredPersonalData#getDataItem <em>Data Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Item</em>'.
	 * @see Gtm.RequiredPersonalData#getDataItem()
	 * @see #getRequiredPersonalData()
	 * @generated
	 */
	EAttribute getRequiredPersonalData_DataItem();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.RequiredPersonalData#getTransfer <em>Transfer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Transfer</em>'.
	 * @see Gtm.RequiredPersonalData#getTransfer()
	 * @see #getRequiredPersonalData()
	 * @generated
	 */
	EAttribute getRequiredPersonalData_Transfer();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.RequiredPersonalData#getFulfillmentType <em>Fulfillment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Fulfillment Type</em>'.
	 * @see Gtm.RequiredPersonalData#getFulfillmentType()
	 * @see #getRequiredPersonalData()
	 * @generated
	 */
	EAttribute getRequiredPersonalData_FulfillmentType();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.RequiredPersonalData#getCrossBorder <em>Cross Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cross Border</em>'.
	 * @see Gtm.RequiredPersonalData#getCrossBorder()
	 * @see #getRequiredPersonalData()
	 * @generated
	 */
	EReference getRequiredPersonalData_CrossBorder();

	/**
	 * Returns the meta object for class '{@link Gtm.AllowedPersonalDataChanges <em>Allowed Personal Data Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allowed Personal Data Changes</em>'.
	 * @see Gtm.AllowedPersonalDataChanges
	 * @generated
	 */
	EClass getAllowedPersonalDataChanges();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.AllowedPersonalDataChanges#getTimeLimit <em>Time Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Limit</em>'.
	 * @see Gtm.AllowedPersonalDataChanges#getTimeLimit()
	 * @see #getAllowedPersonalDataChanges()
	 * @generated
	 */
	EAttribute getAllowedPersonalDataChanges_TimeLimit();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.AllowedPersonalDataChanges#getAcceptedReason <em>Accepted Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accepted Reason</em>'.
	 * @see Gtm.AllowedPersonalDataChanges#getAcceptedReason()
	 * @see #getAllowedPersonalDataChanges()
	 * @generated
	 */
	EAttribute getAllowedPersonalDataChanges_AcceptedReason();

	/**
	 * Returns the meta object for class '{@link Gtm.PassengerConstraints <em>Passenger Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passenger Constraints</em>'.
	 * @see Gtm.PassengerConstraints
	 * @generated
	 */
	EClass getPassengerConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.PassengerConstraints#getPassengerConstraints <em>Passenger Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Passenger Constraints</em>'.
	 * @see Gtm.PassengerConstraints#getPassengerConstraints()
	 * @see #getPassengerConstraints()
	 * @generated
	 */
	EReference getPassengerConstraints_PassengerConstraints();

	/**
	 * Returns the meta object for class '{@link Gtm.PassengerConstraint <em>Passenger Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passenger Constraint</em>'.
	 * @see Gtm.PassengerConstraint
	 * @generated
	 */
	EClass getPassengerConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.PassengerConstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.PassengerConstraint#getId()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EAttribute getPassengerConstraint_Id();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.PassengerConstraint#getTravelerType <em>Traveler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Traveler Type</em>'.
	 * @see Gtm.PassengerConstraint#getTravelerType()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EAttribute getPassengerConstraint_TravelerType();

	/**
	 * Returns the meta object for the reference '{@link Gtm.PassengerConstraint#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Text</em>'.
	 * @see Gtm.PassengerConstraint#getText()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EReference getPassengerConstraint_Text();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.PassengerConstraint#getUpperAgeLimit <em>Upper Age Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Age Limit</em>'.
	 * @see Gtm.PassengerConstraint#getUpperAgeLimit()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EAttribute getPassengerConstraint_UpperAgeLimit();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.PassengerConstraint#getLowerAgeLimit <em>Lower Age Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Age Limit</em>'.
	 * @see Gtm.PassengerConstraint#getLowerAgeLimit()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EAttribute getPassengerConstraint_LowerAgeLimit();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.PassengerConstraint#getTravelAloneAgeLimit <em>Travel Alone Age Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Travel Alone Age Limit</em>'.
	 * @see Gtm.PassengerConstraint#getTravelAloneAgeLimit()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EAttribute getPassengerConstraint_TravelAloneAgeLimit();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.PassengerConstraint#getReservationAgeLimit <em>Reservation Age Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reservation Age Limit</em>'.
	 * @see Gtm.PassengerConstraint#getReservationAgeLimit()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EAttribute getPassengerConstraint_ReservationAgeLimit();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.PassengerConstraint#isIsAncilliary <em>Is Ancilliary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ancilliary</em>'.
	 * @see Gtm.PassengerConstraint#isIsAncilliary()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EAttribute getPassengerConstraint_IsAncilliary();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.PassengerConstraint#getPassengerWeight <em>Passenger Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Weight</em>'.
	 * @see Gtm.PassengerConstraint#getPassengerWeight()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EAttribute getPassengerConstraint_PassengerWeight();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.PassengerConstraint#getMaxTotalPassengerWeight <em>Max Total Passenger Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Total Passenger Weight</em>'.
	 * @see Gtm.PassengerConstraint#getMaxTotalPassengerWeight()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EAttribute getPassengerConstraint_MaxTotalPassengerWeight();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.PassengerConstraint#getMinTotalPassengerWeight <em>Min Total Passenger Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Total Passenger Weight</em>'.
	 * @see Gtm.PassengerConstraint#getMinTotalPassengerWeight()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EAttribute getPassengerConstraint_MinTotalPassengerWeight();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.PassengerConstraint#getIncludedFreePassengers <em>Included Free Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Included Free Passengers</em>'.
	 * @see Gtm.PassengerConstraint#getIncludedFreePassengers()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EReference getPassengerConstraint_IncludedFreePassengers();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.PassengerConstraint#getExcludedPassengerCombinations <em>Excluded Passenger Combinations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Excluded Passenger Combinations</em>'.
	 * @see Gtm.PassengerConstraint#getExcludedPassengerCombinations()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EReference getPassengerConstraint_ExcludedPassengerCombinations();

	/**
	 * Returns the meta object for class '{@link Gtm.PassengerCombinationConstraint <em>Passenger Combination Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passenger Combination Constraint</em>'.
	 * @see Gtm.PassengerCombinationConstraint
	 * @generated
	 */
	EClass getPassengerCombinationConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.PassengerCombinationConstraint#getMaxNumber <em>Max Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Number</em>'.
	 * @see Gtm.PassengerCombinationConstraint#getMaxNumber()
	 * @see #getPassengerCombinationConstraint()
	 * @generated
	 */
	EAttribute getPassengerCombinationConstraint_MaxNumber();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.PassengerCombinationConstraint#getPassengerType <em>Passenger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Type</em>'.
	 * @see Gtm.PassengerCombinationConstraint#getPassengerType()
	 * @see #getPassengerCombinationConstraint()
	 * @generated
	 */
	EAttribute getPassengerCombinationConstraint_PassengerType();

	/**
	 * Returns the meta object for class '{@link Gtm.IncludedFreePassengerLimit <em>Included Free Passenger Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Included Free Passenger Limit</em>'.
	 * @see Gtm.IncludedFreePassengerLimit
	 * @generated
	 */
	EClass getIncludedFreePassengerLimit();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.IncludedFreePassengerLimit#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see Gtm.IncludedFreePassengerLimit#getNumber()
	 * @see #getIncludedFreePassengerLimit()
	 * @generated
	 */
	EAttribute getIncludedFreePassengerLimit_Number();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.IncludedFreePassengerLimit#getPassengerType <em>Passenger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Type</em>'.
	 * @see Gtm.IncludedFreePassengerLimit#getPassengerType()
	 * @see #getIncludedFreePassengerLimit()
	 * @generated
	 */
	EAttribute getIncludedFreePassengerLimit_PassengerType();

	/**
	 * Returns the meta object for class '{@link Gtm.CombinationConstraints <em>Combination Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combination Constraints</em>'.
	 * @see Gtm.CombinationConstraints
	 * @generated
	 */
	EClass getCombinationConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.CombinationConstraints#getCombinationConstraints <em>Combination Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Combination Constraints</em>'.
	 * @see Gtm.CombinationConstraints#getCombinationConstraints()
	 * @see #getCombinationConstraints()
	 * @generated
	 */
	EReference getCombinationConstraints_CombinationConstraints();

	/**
	 * Returns the meta object for class '{@link Gtm.CombinationConstraint <em>Combination Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combination Constraint</em>'.
	 * @see Gtm.CombinationConstraint
	 * @generated
	 */
	EClass getCombinationConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.CombinationConstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.CombinationConstraint#getId()
	 * @see #getCombinationConstraint()
	 * @generated
	 */
	EAttribute getCombinationConstraint_Id();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.CombinationConstraint#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Gtm.CombinationConstraint#getDataDescription()
	 * @see #getCombinationConstraint()
	 * @generated
	 */
	EAttribute getCombinationConstraint_DataDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.CombinationConstraint#getCombinationModels <em>Combination Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Combination Models</em>'.
	 * @see Gtm.CombinationConstraint#getCombinationModels()
	 * @see #getCombinationConstraint()
	 * @generated
	 */
	EReference getCombinationConstraint_CombinationModels();

	/**
	 * Returns the meta object for class '{@link Gtm.TravelValidityConstraints <em>Travel Validity Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Travel Validity Constraints</em>'.
	 * @see Gtm.TravelValidityConstraints
	 * @generated
	 */
	EClass getTravelValidityConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.TravelValidityConstraints#getTravelValidityConstraints <em>Travel Validity Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Travel Validity Constraints</em>'.
	 * @see Gtm.TravelValidityConstraints#getTravelValidityConstraints()
	 * @see #getTravelValidityConstraints()
	 * @generated
	 */
	EReference getTravelValidityConstraints_TravelValidityConstraints();

	/**
	 * Returns the meta object for class '{@link Gtm.TravelValidityConstraint <em>Travel Validity Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Travel Validity Constraint</em>'.
	 * @see Gtm.TravelValidityConstraint
	 * @generated
	 */
	EClass getTravelValidityConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.TravelValidityConstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.TravelValidityConstraint#getId()
	 * @see #getTravelValidityConstraint()
	 * @generated
	 */
	EAttribute getTravelValidityConstraint_Id();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.TravelValidityConstraint#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Gtm.TravelValidityConstraint#getDataDescription()
	 * @see #getTravelValidityConstraint()
	 * @generated
	 */
	EAttribute getTravelValidityConstraint_DataDescription();

	/**
	 * Returns the meta object for the reference '{@link Gtm.TravelValidityConstraint#getValidDays <em>Valid Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Valid Days</em>'.
	 * @see Gtm.TravelValidityConstraint#getValidDays()
	 * @see #getTravelValidityConstraint()
	 * @generated
	 */
	EReference getTravelValidityConstraint_ValidDays();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.TravelValidityConstraint#getTravelDays <em>Travel Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Travel Days</em>'.
	 * @see Gtm.TravelValidityConstraint#getTravelDays()
	 * @see #getTravelValidityConstraint()
	 * @generated
	 */
	EAttribute getTravelValidityConstraint_TravelDays();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.TravelValidityConstraint#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see Gtm.TravelValidityConstraint#getRange()
	 * @see #getTravelValidityConstraint()
	 * @generated
	 */
	EReference getTravelValidityConstraint_Range();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.TravelValidityConstraint#getReturnConstraint <em>Return Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Constraint</em>'.
	 * @see Gtm.TravelValidityConstraint#getReturnConstraint()
	 * @see #getTravelValidityConstraint()
	 * @generated
	 */
	EReference getTravelValidityConstraint_ReturnConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.TravelValidityConstraint#getExcludedTimeRange <em>Excluded Time Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Excluded Time Range</em>'.
	 * @see Gtm.TravelValidityConstraint#getExcludedTimeRange()
	 * @see #getTravelValidityConstraint()
	 * @generated
	 */
	EReference getTravelValidityConstraint_ExcludedTimeRange();

	/**
	 * Returns the meta object for class '{@link Gtm.SalesAvailabilityConstraints <em>Sales Availability Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sales Availability Constraints</em>'.
	 * @see Gtm.SalesAvailabilityConstraints
	 * @generated
	 */
	EClass getSalesAvailabilityConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.SalesAvailabilityConstraints#getSalesAvailabilityConstraints <em>Sales Availability Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sales Availability Constraints</em>'.
	 * @see Gtm.SalesAvailabilityConstraints#getSalesAvailabilityConstraints()
	 * @see #getSalesAvailabilityConstraints()
	 * @generated
	 */
	EReference getSalesAvailabilityConstraints_SalesAvailabilityConstraints();

	/**
	 * Returns the meta object for class '{@link Gtm.SalesAvailabilityConstraint <em>Sales Availability Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sales Availability Constraint</em>'.
	 * @see Gtm.SalesAvailabilityConstraint
	 * @generated
	 */
	EClass getSalesAvailabilityConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.SalesAvailabilityConstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.SalesAvailabilityConstraint#getId()
	 * @see #getSalesAvailabilityConstraint()
	 * @generated
	 */
	EAttribute getSalesAvailabilityConstraint_Id();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.SalesAvailabilityConstraint#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Gtm.SalesAvailabilityConstraint#getDataDescription()
	 * @see #getSalesAvailabilityConstraint()
	 * @generated
	 */
	EAttribute getSalesAvailabilityConstraint_DataDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.SalesAvailabilityConstraint#getRestrictions <em>Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Restrictions</em>'.
	 * @see Gtm.SalesAvailabilityConstraint#getRestrictions()
	 * @see #getSalesAvailabilityConstraint()
	 * @generated
	 */
	EReference getSalesAvailabilityConstraint_Restrictions();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.SalesAvailabilityConstraint#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see Gtm.SalesAvailabilityConstraint#getDataSource()
	 * @see #getSalesAvailabilityConstraint()
	 * @generated
	 */
	EAttribute getSalesAvailabilityConstraint_DataSource();

	/**
	 * Returns the meta object for class '{@link Gtm.SalesRestriction <em>Sales Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sales Restriction</em>'.
	 * @see Gtm.SalesRestriction
	 * @generated
	 */
	EClass getSalesRestriction();

	/**
	 * Returns the meta object for the reference '{@link Gtm.SalesRestriction#getSalesDates <em>Sales Dates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sales Dates</em>'.
	 * @see Gtm.SalesRestriction#getSalesDates()
	 * @see #getSalesRestriction()
	 * @generated
	 */
	EReference getSalesRestriction_SalesDates();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.SalesRestriction#getStartOfSale <em>Start Of Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Of Sale</em>'.
	 * @see Gtm.SalesRestriction#getStartOfSale()
	 * @see #getSalesRestriction()
	 * @generated
	 */
	EReference getSalesRestriction_StartOfSale();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.SalesRestriction#getEndOfSale <em>End Of Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End Of Sale</em>'.
	 * @see Gtm.SalesRestriction#getEndOfSale()
	 * @see #getSalesRestriction()
	 * @generated
	 */
	EReference getSalesRestriction_EndOfSale();

	/**
	 * Returns the meta object for class '{@link Gtm.EndOfSale <em>End Of Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Of Sale</em>'.
	 * @see Gtm.EndOfSale
	 * @generated
	 */
	EClass getEndOfSale();

	/**
	 * Returns the meta object for class '{@link Gtm.StartOfSale <em>Start Of Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Of Sale</em>'.
	 * @see Gtm.StartOfSale
	 * @generated
	 */
	EClass getStartOfSale();

	/**
	 * Returns the meta object for class '{@link Gtm.ReductionCards <em>Reduction Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reduction Cards</em>'.
	 * @see Gtm.ReductionCards
	 * @generated
	 */
	EClass getReductionCards();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.ReductionCards#getReductionCards <em>Reduction Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reduction Cards</em>'.
	 * @see Gtm.ReductionCards#getReductionCards()
	 * @see #getReductionCards()
	 * @generated
	 */
	EReference getReductionCards_ReductionCards();

	/**
	 * Returns the meta object for class '{@link Gtm.ReductionCard <em>Reduction Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reduction Card</em>'.
	 * @see Gtm.ReductionCard
	 * @generated
	 */
	EClass getReductionCard();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReductionCard#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.ReductionCard#getId()
	 * @see #getReductionCard()
	 * @generated
	 */
	EAttribute getReductionCard_Id();

	/**
	 * Returns the meta object for the reference '{@link Gtm.ReductionCard#getCardIssuer <em>Card Issuer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Card Issuer</em>'.
	 * @see Gtm.ReductionCard#getCardIssuer()
	 * @see #getReductionCard()
	 * @generated
	 */
	EReference getReductionCard_CardIssuer();

	/**
	 * Returns the meta object for the reference '{@link Gtm.ReductionCard#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name</em>'.
	 * @see Gtm.ReductionCard#getName()
	 * @see #getReductionCard()
	 * @generated
	 */
	EReference getReductionCard_Name();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.ReductionCard#getServiceClasses <em>Service Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Classes</em>'.
	 * @see Gtm.ReductionCard#getServiceClasses()
	 * @see #getReductionCard()
	 * @generated
	 */
	EReference getReductionCard_ServiceClasses();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReductionCard#isIdRequiredForBooking <em>Id Required For Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Required For Booking</em>'.
	 * @see Gtm.ReductionCard#isIdRequiredForBooking()
	 * @see #getReductionCard()
	 * @generated
	 */
	EAttribute getReductionCard_IdRequiredForBooking();

	/**
	 * Returns the meta object for class '{@link Gtm.CarrierConstraints <em>Carrier Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Constraints</em>'.
	 * @see Gtm.CarrierConstraints
	 * @generated
	 */
	EClass getCarrierConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.CarrierConstraints#getCarrierConstraints <em>Carrier Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Carrier Constraints</em>'.
	 * @see Gtm.CarrierConstraints#getCarrierConstraints()
	 * @see #getCarrierConstraints()
	 * @generated
	 */
	EReference getCarrierConstraints_CarrierConstraints();

	/**
	 * Returns the meta object for class '{@link Gtm.CarrierConstraint <em>Carrier Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Constraint</em>'.
	 * @see Gtm.CarrierConstraint
	 * @generated
	 */
	EClass getCarrierConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.CarrierConstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.CarrierConstraint#getId()
	 * @see #getCarrierConstraint()
	 * @generated
	 */
	EAttribute getCarrierConstraint_Id();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.CarrierConstraint#getIncludedCarriers <em>Included Carriers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Included Carriers</em>'.
	 * @see Gtm.CarrierConstraint#getIncludedCarriers()
	 * @see #getCarrierConstraint()
	 * @generated
	 */
	EReference getCarrierConstraint_IncludedCarriers();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.CarrierConstraint#getExcludedCarriers <em>Excluded Carriers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Excluded Carriers</em>'.
	 * @see Gtm.CarrierConstraint#getExcludedCarriers()
	 * @see #getCarrierConstraint()
	 * @generated
	 */
	EReference getCarrierConstraint_ExcludedCarriers();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.CarrierConstraint#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Gtm.CarrierConstraint#getDataDescription()
	 * @see #getCarrierConstraint()
	 * @generated
	 */
	EAttribute getCarrierConstraint_DataDescription();

	/**
	 * Returns the meta object for class '{@link Gtm.ServiceConstraints <em>Service Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Constraints</em>'.
	 * @see Gtm.ServiceConstraints
	 * @generated
	 */
	EClass getServiceConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.ServiceConstraints#getServiceConstraints <em>Service Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Constraints</em>'.
	 * @see Gtm.ServiceConstraints#getServiceConstraints()
	 * @see #getServiceConstraints()
	 * @generated
	 */
	EReference getServiceConstraints_ServiceConstraints();

	/**
	 * Returns the meta object for class '{@link Gtm.ServiceConstraint <em>Service Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Constraint</em>'.
	 * @see Gtm.ServiceConstraint
	 * @generated
	 */
	EClass getServiceConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ServiceConstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.ServiceConstraint#getId()
	 * @see #getServiceConstraint()
	 * @generated
	 */
	EAttribute getServiceConstraint_Id();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.ServiceConstraint#getIncludedServiceBrands <em>Included Service Brands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Included Service Brands</em>'.
	 * @see Gtm.ServiceConstraint#getIncludedServiceBrands()
	 * @see #getServiceConstraint()
	 * @generated
	 */
	EReference getServiceConstraint_IncludedServiceBrands();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.ServiceConstraint#getExcludedServiceBrands <em>Excluded Service Brands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Excluded Service Brands</em>'.
	 * @see Gtm.ServiceConstraint#getExcludedServiceBrands()
	 * @see #getServiceConstraint()
	 * @generated
	 */
	EReference getServiceConstraint_ExcludedServiceBrands();

	/**
	 * Returns the meta object for class '{@link Gtm.RegionalConstraints <em>Regional Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regional Constraints</em>'.
	 * @see Gtm.RegionalConstraints
	 * @generated
	 */
	EClass getRegionalConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.RegionalConstraints#getRegionalConstraints <em>Regional Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regional Constraints</em>'.
	 * @see Gtm.RegionalConstraints#getRegionalConstraints()
	 * @see #getRegionalConstraints()
	 * @generated
	 */
	EReference getRegionalConstraints_RegionalConstraints();

	/**
	 * Returns the meta object for class '{@link Gtm.RegionalConstraint <em>Regional Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regional Constraint</em>'.
	 * @see Gtm.RegionalConstraint
	 * @generated
	 */
	EClass getRegionalConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.RegionalConstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.RegionalConstraint#getId()
	 * @see #getRegionalConstraint()
	 * @generated
	 */
	EAttribute getRegionalConstraint_Id();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.RegionalConstraint#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see Gtm.RegionalConstraint#getDistance()
	 * @see #getRegionalConstraint()
	 * @generated
	 */
	EAttribute getRegionalConstraint_Distance();

	/**
	 * Returns the meta object for the reference '{@link Gtm.RegionalConstraint#getEntryConnectionPoint <em>Entry Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entry Connection Point</em>'.
	 * @see Gtm.RegionalConstraint#getEntryConnectionPoint()
	 * @see #getRegionalConstraint()
	 * @generated
	 */
	EReference getRegionalConstraint_EntryConnectionPoint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.RegionalConstraint#getExitConnectionPoint <em>Exit Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exit Connection Point</em>'.
	 * @see Gtm.RegionalConstraint#getExitConnectionPoint()
	 * @see #getRegionalConstraint()
	 * @generated
	 */
	EReference getRegionalConstraint_ExitConnectionPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.RegionalConstraint#getRegionalValidity <em>Regional Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regional Validity</em>'.
	 * @see Gtm.RegionalConstraint#getRegionalValidity()
	 * @see #getRegionalConstraint()
	 * @generated
	 */
	EReference getRegionalConstraint_RegionalValidity();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.RegionalConstraint#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see Gtm.RegionalConstraint#getDataSource()
	 * @see #getRegionalConstraint()
	 * @generated
	 */
	EAttribute getRegionalConstraint_DataSource();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.RegionalConstraint#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Gtm.RegionalConstraint#getDataDescription()
	 * @see #getRegionalConstraint()
	 * @generated
	 */
	EAttribute getRegionalConstraint_DataDescription();

	/**
	 * Returns the meta object for class '{@link Gtm.RegionalValidity <em>Regional Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regional Validity</em>'.
	 * @see Gtm.RegionalValidity
	 * @generated
	 */
	EClass getRegionalValidity();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.RegionalValidity#getSeqNb <em>Seq Nb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seq Nb</em>'.
	 * @see Gtm.RegionalValidity#getSeqNb()
	 * @see #getRegionalValidity()
	 * @generated
	 */
	EAttribute getRegionalValidity_SeqNb();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.RegionalValidity#getViaStation <em>Via Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Via Station</em>'.
	 * @see Gtm.RegionalValidity#getViaStation()
	 * @see #getRegionalValidity()
	 * @generated
	 */
	EReference getRegionalValidity_ViaStation();

	/**
	 * Returns the meta object for the reference '{@link Gtm.RegionalValidity#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Zone</em>'.
	 * @see Gtm.RegionalValidity#getZone()
	 * @see #getRegionalValidity()
	 * @generated
	 */
	EReference getRegionalValidity_Zone();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.RegionalValidity#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line</em>'.
	 * @see Gtm.RegionalValidity#getLine()
	 * @see #getRegionalValidity()
	 * @generated
	 */
	EReference getRegionalValidity_Line();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.RegionalValidity#getPolygone <em>Polygone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Polygone</em>'.
	 * @see Gtm.RegionalValidity#getPolygone()
	 * @see #getRegionalValidity()
	 * @generated
	 */
	EReference getRegionalValidity_Polygone();

	/**
	 * Returns the meta object for class '{@link Gtm.ServiceLevelDefinitions <em>Service Level Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Level Definitions</em>'.
	 * @see Gtm.ServiceLevelDefinitions
	 * @generated
	 */
	EClass getServiceLevelDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.ServiceLevelDefinitions#getServiceLevelDefinition <em>Service Level Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Level Definition</em>'.
	 * @see Gtm.ServiceLevelDefinitions#getServiceLevelDefinition()
	 * @see #getServiceLevelDefinitions()
	 * @generated
	 */
	EReference getServiceLevelDefinitions_ServiceLevelDefinition();

	/**
	 * Returns the meta object for class '{@link Gtm.Texts <em>Texts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Texts</em>'.
	 * @see Gtm.Texts
	 * @generated
	 */
	EClass getTexts();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.Texts#getTexts <em>Texts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Texts</em>'.
	 * @see Gtm.Texts#getTexts()
	 * @see #getTexts()
	 * @generated
	 */
	EReference getTexts_Texts();

	/**
	 * Returns the meta object for class '{@link Gtm.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see Gtm.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Text#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.Text#getId()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Id();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Text#getTextUTF8 <em>Text UTF8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text UTF8</em>'.
	 * @see Gtm.Text#getTextUTF8()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_TextUTF8();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Text#getTextICAO <em>Text ICAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text ICAO</em>'.
	 * @see Gtm.Text#getTextICAO()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_TextICAO();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Text#getShortTextUTF8 <em>Short Text UTF8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Text UTF8</em>'.
	 * @see Gtm.Text#getShortTextUTF8()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_ShortTextUTF8();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Text#getShortTextICAO <em>Short Text ICAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Text ICAO</em>'.
	 * @see Gtm.Text#getShortTextICAO()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_ShortTextICAO();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.Text#getTranslations <em>Translations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Translations</em>'.
	 * @see Gtm.Text#getTranslations()
	 * @see #getText()
	 * @generated
	 */
	EReference getText_Translations();

	/**
	 * Returns the meta object for class '{@link Gtm.Translation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Translation</em>'.
	 * @see Gtm.Translation
	 * @generated
	 */
	EClass getTranslation();

	/**
	 * Returns the meta object for the reference '{@link Gtm.Translation#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Language</em>'.
	 * @see Gtm.Translation#getLanguage()
	 * @see #getTranslation()
	 * @generated
	 */
	EReference getTranslation_Language();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Translation#getTextUTF8 <em>Text UTF8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text UTF8</em>'.
	 * @see Gtm.Translation#getTextUTF8()
	 * @see #getTranslation()
	 * @generated
	 */
	EAttribute getTranslation_TextUTF8();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Translation#getTextICAO <em>Text ICAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text ICAO</em>'.
	 * @see Gtm.Translation#getTextICAO()
	 * @see #getTranslation()
	 * @generated
	 */
	EAttribute getTranslation_TextICAO();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Translation#getShortTextUTF8 <em>Short Text UTF8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Text UTF8</em>'.
	 * @see Gtm.Translation#getShortTextUTF8()
	 * @see #getTranslation()
	 * @generated
	 */
	EAttribute getTranslation_ShortTextUTF8();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Translation#getShortTextICAO <em>Short Text ICAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Text ICAO</em>'.
	 * @see Gtm.Translation#getShortTextICAO()
	 * @see #getTranslation()
	 * @generated
	 */
	EAttribute getTranslation_ShortTextICAO();

	/**
	 * Returns the meta object for class '{@link Gtm.Prices <em>Prices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prices</em>'.
	 * @see Gtm.Prices
	 * @generated
	 */
	EClass getPrices();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.Prices#getPrices <em>Prices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prices</em>'.
	 * @see Gtm.Prices#getPrices()
	 * @see #getPrices()
	 * @generated
	 */
	EReference getPrices_Prices();

	/**
	 * Returns the meta object for class '{@link Gtm.Price <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Price</em>'.
	 * @see Gtm.Price
	 * @generated
	 */
	EClass getPrice();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Price#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.Price#getId()
	 * @see #getPrice()
	 * @generated
	 */
	EAttribute getPrice_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.Price#getCurrencies <em>Currencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Currencies</em>'.
	 * @see Gtm.Price#getCurrencies()
	 * @see #getPrice()
	 * @generated
	 */
	EReference getPrice_Currencies();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Price#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see Gtm.Price#getDataSource()
	 * @see #getPrice()
	 * @generated
	 */
	EAttribute getPrice_DataSource();

	/**
	 * Returns the meta object for class '{@link Gtm.VATDetail <em>VAT Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VAT Detail</em>'.
	 * @see Gtm.VATDetail
	 * @generated
	 */
	EClass getVATDetail();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.VATDetail#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see Gtm.VATDetail#getAmount()
	 * @see #getVATDetail()
	 * @generated
	 */
	EAttribute getVATDetail_Amount();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.VATDetail#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see Gtm.VATDetail#getPercentage()
	 * @see #getVATDetail()
	 * @generated
	 */
	EAttribute getVATDetail_Percentage();

	/**
	 * Returns the meta object for the reference '{@link Gtm.VATDetail#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Country</em>'.
	 * @see Gtm.VATDetail#getCountry()
	 * @see #getVATDetail()
	 * @generated
	 */
	EReference getVATDetail_Country();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.VATDetail#getTaxId <em>Tax Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Id</em>'.
	 * @see Gtm.VATDetail#getTaxId()
	 * @see #getVATDetail()
	 * @generated
	 */
	EAttribute getVATDetail_TaxId();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.VATDetail#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see Gtm.VATDetail#getScope()
	 * @see #getVATDetail()
	 * @generated
	 */
	EAttribute getVATDetail_Scope();

	/**
	 * Returns the meta object for class '{@link Gtm.CurrencyPrice <em>Currency Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Currency Price</em>'.
	 * @see Gtm.CurrencyPrice
	 * @generated
	 */
	EClass getCurrencyPrice();

	/**
	 * Returns the meta object for the reference '{@link Gtm.CurrencyPrice#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency</em>'.
	 * @see Gtm.CurrencyPrice#getCurrency()
	 * @see #getCurrencyPrice()
	 * @generated
	 */
	EReference getCurrencyPrice_Currency();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.CurrencyPrice#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see Gtm.CurrencyPrice#getAmount()
	 * @see #getCurrencyPrice()
	 * @generated
	 */
	EAttribute getCurrencyPrice_Amount();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.CurrencyPrice#getVATdetails <em>VA Tdetails</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>VA Tdetails</em>'.
	 * @see Gtm.CurrencyPrice#getVATdetails()
	 * @see #getCurrencyPrice()
	 * @generated
	 */
	EReference getCurrencyPrice_VATdetails();

	/**
	 * Returns the meta object for class '{@link Gtm.ServiceClassDefinitions <em>Service Class Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Class Definitions</em>'.
	 * @see Gtm.ServiceClassDefinitions
	 * @generated
	 */
	EClass getServiceClassDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.ServiceClassDefinitions#getServiceClassDefinitions <em>Service Class Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Class Definitions</em>'.
	 * @see Gtm.ServiceClassDefinitions#getServiceClassDefinitions()
	 * @see #getServiceClassDefinitions()
	 * @generated
	 */
	EReference getServiceClassDefinitions_ServiceClassDefinitions();

	/**
	 * Returns the meta object for class '{@link Gtm.Calendars <em>Calendars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calendars</em>'.
	 * @see Gtm.Calendars
	 * @generated
	 */
	EClass getCalendars();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.Calendars#getCalendars <em>Calendars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calendars</em>'.
	 * @see Gtm.Calendars#getCalendars()
	 * @see #getCalendars()
	 * @generated
	 */
	EReference getCalendars_Calendars();

	/**
	 * Returns the meta object for class '{@link Gtm.Calendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calendar</em>'.
	 * @see Gtm.Calendar
	 * @generated
	 */
	EClass getCalendar();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Calendar#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gtm.Calendar#getName()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_Name();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Calendar#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.Calendar#getId()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_Id();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Calendar#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see Gtm.Calendar#getFromDate()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Calendar#getUntilDate <em>Until Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Until Date</em>'.
	 * @see Gtm.Calendar#getUntilDate()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_UntilDate();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Calendar#getUtcOffset <em>Utc Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utc Offset</em>'.
	 * @see Gtm.Calendar#getUtcOffset()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_UtcOffset();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.Calendar#getDates <em>Dates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dates</em>'.
	 * @see Gtm.Calendar#getDates()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_Dates();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Calendar#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see Gtm.Calendar#getDataSource()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_DataSource();

	/**
	 * Returns the meta object for class '{@link Gtm.ReservationParameters <em>Reservation Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation Parameters</em>'.
	 * @see Gtm.ReservationParameters
	 * @generated
	 */
	EClass getReservationParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.ReservationParameters#getReservationParameters <em>Reservation Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reservation Parameters</em>'.
	 * @see Gtm.ReservationParameters#getReservationParameters()
	 * @see #getReservationParameters()
	 * @generated
	 */
	EReference getReservationParameters_ReservationParameters();

	/**
	 * Returns the meta object for class '{@link Gtm.ReservationParameter <em>Reservation Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation Parameter</em>'.
	 * @see Gtm.ReservationParameter
	 * @generated
	 */
	EClass getReservationParameter();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReservationParameter#isOptionalReservation <em>Optional Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional Reservation</em>'.
	 * @see Gtm.ReservationParameter#isOptionalReservation()
	 * @see #getReservationParameter()
	 * @generated
	 */
	EAttribute getReservationParameter_OptionalReservation();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReservationParameter#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.ReservationParameter#getId()
	 * @see #getReservationParameter()
	 * @generated
	 */
	EAttribute getReservationParameter_Id();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.ReservationParameter#getParams9181 <em>Params9181</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Params9181</em>'.
	 * @see Gtm.ReservationParameter#getParams9181()
	 * @see #getReservationParameter()
	 * @generated
	 */
	EReference getReservationParameter_Params9181();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.ReservationParameter#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Options</em>'.
	 * @see Gtm.ReservationParameter#getOptions()
	 * @see #getReservationParameter()
	 * @generated
	 */
	EReference getReservationParameter_Options();

	/**
	 * Returns the meta object for class '{@link Gtm.ReservationParams9181 <em>Reservation Params9181</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation Params9181</em>'.
	 * @see Gtm.ReservationParams9181
	 * @generated
	 */
	EClass getReservationParams9181();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReservationParams9181#getTravelClass <em>Travel Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Travel Class</em>'.
	 * @see Gtm.ReservationParams9181#getTravelClass()
	 * @see #getReservationParams9181()
	 * @generated
	 */
	EAttribute getReservationParams9181_TravelClass();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReservationParams9181#getServiceLevel <em>Service Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Level</em>'.
	 * @see Gtm.ReservationParams9181#getServiceLevel()
	 * @see #getReservationParams9181()
	 * @generated
	 */
	EAttribute getReservationParams9181_ServiceLevel();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReservationParams9181#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see Gtm.ReservationParams9181#getService()
	 * @see #getReservationParams9181()
	 * @generated
	 */
	EAttribute getReservationParams9181_Service();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReservationParams9181#getBerthType <em>Berth Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Berth Type</em>'.
	 * @see Gtm.ReservationParams9181#getBerthType()
	 * @see #getReservationParams9181()
	 * @generated
	 */
	EAttribute getReservationParams9181_BerthType();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReservationParams9181#getCoachType <em>Coach Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coach Type</em>'.
	 * @see Gtm.ReservationParams9181#getCoachType()
	 * @see #getReservationParams9181()
	 * @generated
	 */
	EAttribute getReservationParams9181_CoachType();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReservationParams9181#getCompartmentType <em>Compartment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compartment Type</em>'.
	 * @see Gtm.ReservationParams9181#getCompartmentType()
	 * @see #getReservationParams9181()
	 * @generated
	 */
	EAttribute getReservationParams9181_CompartmentType();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReservationParams9181#getTariff <em>Tariff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tariff</em>'.
	 * @see Gtm.ReservationParams9181#getTariff()
	 * @see #getReservationParams9181()
	 * @generated
	 */
	EAttribute getReservationParams9181_Tariff();

	/**
	 * Returns the meta object for class '{@link Gtm.ReservationOptions <em>Reservation Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation Options</em>'.
	 * @see Gtm.ReservationOptions
	 * @generated
	 */
	EClass getReservationOptions();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.ReservationOptions#getPreferences <em>Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preferences</em>'.
	 * @see Gtm.ReservationOptions#getPreferences()
	 * @see #getReservationOptions()
	 * @generated
	 */
	EReference getReservationOptions_Preferences();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.ReservationOptions#getServiceBrands <em>Service Brands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Brands</em>'.
	 * @see Gtm.ReservationOptions#getServiceBrands()
	 * @see #getReservationOptions()
	 * @generated
	 */
	EReference getReservationOptions_ServiceBrands();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReservationOptions#getGraphicalReservation <em>Graphical Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graphical Reservation</em>'.
	 * @see Gtm.ReservationOptions#getGraphicalReservation()
	 * @see #getReservationOptions()
	 * @generated
	 */
	EAttribute getReservationOptions_GraphicalReservation();

	/**
	 * Returns the meta object for class '{@link Gtm.ReservationPreferenceGroup <em>Reservation Preference Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation Preference Group</em>'.
	 * @see Gtm.ReservationPreferenceGroup
	 * @generated
	 */
	EClass getReservationPreferenceGroup();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.ReservationPreferenceGroup#getPreference <em>Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Preference</em>'.
	 * @see Gtm.ReservationPreferenceGroup#getPreference()
	 * @see #getReservationPreferenceGroup()
	 * @generated
	 */
	EAttribute getReservationPreferenceGroup_Preference();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReservationPreferenceGroup#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see Gtm.ReservationPreferenceGroup#getGroup()
	 * @see #getReservationPreferenceGroup()
	 * @generated
	 */
	EAttribute getReservationPreferenceGroup_Group();

	/**
	 * Returns the meta object for class '{@link Gtm.ServiceClass <em>Service Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Class</em>'.
	 * @see Gtm.ServiceClass
	 * @generated
	 */
	EClass getServiceClass();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ServiceClass#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.ServiceClass#getId()
	 * @see #getServiceClass()
	 * @generated
	 */
	EAttribute getServiceClass_Id();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ServiceClass#getClassicClass <em>Classic Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classic Class</em>'.
	 * @see Gtm.ServiceClass#getClassicClass()
	 * @see #getServiceClass()
	 * @generated
	 */
	EAttribute getServiceClass_ClassicClass();

	/**
	 * Returns the meta object for the reference '{@link Gtm.ServiceClass#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Text</em>'.
	 * @see Gtm.ServiceClass#getText()
	 * @see #getServiceClass()
	 * @generated
	 */
	EReference getServiceClass_Text();

	/**
	 * Returns the meta object for class '{@link Gtm.ServiceLevel <em>Service Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Level</em>'.
	 * @see Gtm.ServiceLevel
	 * @generated
	 */
	EClass getServiceLevel();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ServiceLevel#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.ServiceLevel#getId()
	 * @see #getServiceLevel()
	 * @generated
	 */
	EAttribute getServiceLevel_Id();

	/**
	 * Returns the meta object for the reference '{@link Gtm.ServiceLevel#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Text</em>'.
	 * @see Gtm.ServiceLevel#getText()
	 * @see #getServiceLevel()
	 * @generated
	 */
	EReference getServiceLevel_Text();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.ServiceLevel#getCombiningServiceClasses <em>Combining Service Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Combining Service Classes</em>'.
	 * @see Gtm.ServiceLevel#getCombiningServiceClasses()
	 * @see #getServiceLevel()
	 * @generated
	 */
	EReference getServiceLevel_CombiningServiceClasses();

	/**
	 * Returns the meta object for the reference '{@link Gtm.ServiceLevel#getReservationParameter <em>Reservation Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reservation Parameter</em>'.
	 * @see Gtm.ServiceLevel#getReservationParameter()
	 * @see #getServiceLevel()
	 * @generated
	 */
	EReference getServiceLevel_ReservationParameter();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ServiceLevel#isIncludesClassName <em>Includes Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Includes Class Name</em>'.
	 * @see Gtm.ServiceLevel#isIncludesClassName()
	 * @see #getServiceLevel()
	 * @generated
	 */
	EAttribute getServiceLevel_IncludesClassName();

	/**
	 * Returns the meta object for class '{@link Gtm.TimeRange <em>Time Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Range</em>'.
	 * @see Gtm.TimeRange
	 * @generated
	 */
	EClass getTimeRange();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.TimeRange#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see Gtm.TimeRange#getScope()
	 * @see #getTimeRange()
	 * @generated
	 */
	EAttribute getTimeRange_Scope();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.TimeRange#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see Gtm.TimeRange#getFrom()
	 * @see #getTimeRange()
	 * @generated
	 */
	EAttribute getTimeRange_From();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.TimeRange#getUntil <em>Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Until</em>'.
	 * @see Gtm.TimeRange#getUntil()
	 * @see #getTimeRange()
	 * @generated
	 */
	EAttribute getTimeRange_Until();

	/**
	 * Returns the meta object for class '{@link Gtm.ExcludedTimeRange <em>Excluded Time Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Excluded Time Range</em>'.
	 * @see Gtm.ExcludedTimeRange
	 * @generated
	 */
	EClass getExcludedTimeRange();

	/**
	 * Returns the meta object for class '{@link Gtm.ValidityRange <em>Validity Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validity Range</em>'.
	 * @see Gtm.ValidityRange
	 * @generated
	 */
	EClass getValidityRange();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ValidityRange#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see Gtm.ValidityRange#getUnit()
	 * @see #getValidityRange()
	 * @generated
	 */
	EAttribute getValidityRange_Unit();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ValidityRange#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Gtm.ValidityRange#getValue()
	 * @see #getValidityRange()
	 * @generated
	 */
	EAttribute getValidityRange_Value();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ValidityRange#getHoursAfterMidnight <em>Hours After Midnight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours After Midnight</em>'.
	 * @see Gtm.ValidityRange#getHoursAfterMidnight()
	 * @see #getValidityRange()
	 * @generated
	 */
	EAttribute getValidityRange_HoursAfterMidnight();

	/**
	 * Returns the meta object for class '{@link Gtm.RelativeTime <em>Relative Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Time</em>'.
	 * @see Gtm.RelativeTime
	 * @generated
	 */
	EClass getRelativeTime();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.RelativeTime#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see Gtm.RelativeTime#getUnit()
	 * @see #getRelativeTime()
	 * @generated
	 */
	EAttribute getRelativeTime_Unit();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.RelativeTime#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see Gtm.RelativeTime#getReference()
	 * @see #getRelativeTime()
	 * @generated
	 */
	EAttribute getRelativeTime_Reference();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.RelativeTime#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Gtm.RelativeTime#getValue()
	 * @see #getRelativeTime()
	 * @generated
	 */
	EAttribute getRelativeTime_Value();

	/**
	 * Returns the meta object for class '{@link Gtm.ReturnValidityConstraint <em>Return Validity Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Validity Constraint</em>'.
	 * @see Gtm.ReturnValidityConstraint
	 * @generated
	 */
	EClass getReturnValidityConstraint();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.ReturnValidityConstraint#getExcludedWeekdays <em>Excluded Weekdays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Excluded Weekdays</em>'.
	 * @see Gtm.ReturnValidityConstraint#getExcludedWeekdays()
	 * @see #getReturnValidityConstraint()
	 * @generated
	 */
	EAttribute getReturnValidityConstraint_ExcludedWeekdays();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReturnValidityConstraint#getLatestReturn <em>Latest Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latest Return</em>'.
	 * @see Gtm.ReturnValidityConstraint#getLatestReturn()
	 * @see #getReturnValidityConstraint()
	 * @generated
	 */
	EAttribute getReturnValidityConstraint_LatestReturn();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReturnValidityConstraint#getEarliestReturn <em>Earliest Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Earliest Return</em>'.
	 * @see Gtm.ReturnValidityConstraint#getEarliestReturn()
	 * @see #getReturnValidityConstraint()
	 * @generated
	 */
	EAttribute getReturnValidityConstraint_EarliestReturn();

	/**
	 * Returns the meta object for class '{@link Gtm.ViaStation <em>Via Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Via Station</em>'.
	 * @see Gtm.ViaStation
	 * @generated
	 */
	EClass getViaStation();

	/**
	 * Returns the meta object for the reference '{@link Gtm.ViaStation#getStation <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Station</em>'.
	 * @see Gtm.ViaStation#getStation()
	 * @see #getViaStation()
	 * @generated
	 */
	EReference getViaStation_Station();

	/**
	 * Returns the meta object for the reference '{@link Gtm.ViaStation#getCarrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier</em>'.
	 * @see Gtm.ViaStation#getCarrier()
	 * @see #getViaStation()
	 * @generated
	 */
	EReference getViaStation_Carrier();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.ViaStation#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Route</em>'.
	 * @see Gtm.ViaStation#getRoute()
	 * @see #getViaStation()
	 * @generated
	 */
	EReference getViaStation_Route();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.ViaStation#getAlternativeRoutes <em>Alternative Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alternative Routes</em>'.
	 * @see Gtm.ViaStation#getAlternativeRoutes()
	 * @see #getViaStation()
	 * @generated
	 */
	EReference getViaStation_AlternativeRoutes();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ViaStation#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Gtm.ViaStation#getDataDescription()
	 * @see #getViaStation()
	 * @generated
	 */
	EAttribute getViaStation_DataDescription();

	/**
	 * Returns the meta object for the reference '{@link Gtm.ViaStation#getFareStationSet <em>Fare Station Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fare Station Set</em>'.
	 * @see Gtm.ViaStation#getFareStationSet()
	 * @see #getViaStation()
	 * @generated
	 */
	EReference getViaStation_FareStationSet();

	/**
	 * Returns the meta object for the '{@link Gtm.ViaStation#getDescription() <em>Get Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Description</em>' operation.
	 * @see Gtm.ViaStation#getDescription()
	 * @generated
	 */
	EOperation getViaStation__GetDescription();

	/**
	 * Returns the meta object for class '{@link Gtm.AlternativeRoute <em>Alternative Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative Route</em>'.
	 * @see Gtm.AlternativeRoute
	 * @generated
	 */
	EClass getAlternativeRoute();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.AlternativeRoute#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stations</em>'.
	 * @see Gtm.AlternativeRoute#getStations()
	 * @see #getAlternativeRoute()
	 * @generated
	 */
	EReference getAlternativeRoute_Stations();

	/**
	 * Returns the meta object for class '{@link Gtm.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see Gtm.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.Route#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stations</em>'.
	 * @see Gtm.Route#getStations()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Stations();

	/**
	 * Returns the meta object for class '{@link Gtm.Zone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zone</em>'.
	 * @see Gtm.Zone
	 * @generated
	 */
	EClass getZone();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Zone#getBinaryZoneId <em>Binary Zone Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binary Zone Id</em>'.
	 * @see Gtm.Zone#getBinaryZoneId()
	 * @see #getZone()
	 * @generated
	 */
	EAttribute getZone_BinaryZoneId();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.Zone#getZoneId <em>Zone Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Zone Id</em>'.
	 * @see Gtm.Zone#getZoneId()
	 * @see #getZone()
	 * @generated
	 */
	EAttribute getZone_ZoneId();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Zone#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see Gtm.Zone#getCity()
	 * @see #getZone()
	 * @generated
	 */
	EAttribute getZone_City();

	/**
	 * Returns the meta object for the reference '{@link Gtm.Zone#getCarrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier</em>'.
	 * @see Gtm.Zone#getCarrier()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_Carrier();

	/**
	 * Returns the meta object for the reference '{@link Gtm.Zone#getEntryStation <em>Entry Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entry Station</em>'.
	 * @see Gtm.Zone#getEntryStation()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_EntryStation();

	/**
	 * Returns the meta object for the reference '{@link Gtm.Zone#getTerminalStation <em>Terminal Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal Station</em>'.
	 * @see Gtm.Zone#getTerminalStation()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_TerminalStation();

	/**
	 * Returns the meta object for the reference '{@link Gtm.Zone#getNutsCode <em>Nuts Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nuts Code</em>'.
	 * @see Gtm.Zone#getNutsCode()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_NutsCode();

	/**
	 * Returns the meta object for class '{@link Gtm.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see Gtm.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Line#getBinaryZoneId <em>Binary Zone Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binary Zone Id</em>'.
	 * @see Gtm.Line#getBinaryZoneId()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_BinaryZoneId();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.Line#getLineId <em>Line Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Line Id</em>'.
	 * @see Gtm.Line#getLineId()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_LineId();

	/**
	 * Returns the meta object for the reference '{@link Gtm.Line#getCarrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier</em>'.
	 * @see Gtm.Line#getCarrier()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Carrier();

	/**
	 * Returns the meta object for the reference '{@link Gtm.Line#getEntryStation <em>Entry Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entry Station</em>'.
	 * @see Gtm.Line#getEntryStation()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_EntryStation();

	/**
	 * Returns the meta object for the reference '{@link Gtm.Line#getTerminalStation <em>Terminal Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal Station</em>'.
	 * @see Gtm.Line#getTerminalStation()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_TerminalStation();

	/**
	 * Returns the meta object for the reference '{@link Gtm.Line#getNutsCode <em>Nuts Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nuts Code</em>'.
	 * @see Gtm.Line#getNutsCode()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_NutsCode();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Line#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see Gtm.Line#getCity()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_City();

	/**
	 * Returns the meta object for class '{@link Gtm.Polygone <em>Polygone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygone</em>'.
	 * @see Gtm.Polygone
	 * @generated
	 */
	EClass getPolygone();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.Polygone#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edge</em>'.
	 * @see Gtm.Polygone#getEdge()
	 * @see #getPolygone()
	 * @generated
	 */
	EReference getPolygone_Edge();

	/**
	 * Returns the meta object for class '{@link Gtm.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see Gtm.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Edge#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see Gtm.Edge#getSystem()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_System();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Edge#getEastWest <em>East West</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>East West</em>'.
	 * @see Gtm.Edge#getEastWest()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_EastWest();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Edge#getNorthSouth <em>North South</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>North South</em>'.
	 * @see Gtm.Edge#getNorthSouth()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_NorthSouth();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Edge#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see Gtm.Edge#getUnit()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Unit();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Edge#getAccuracy <em>Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accuracy</em>'.
	 * @see Gtm.Edge#getAccuracy()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Accuracy();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Edge#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see Gtm.Edge#getLongitude()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Edge#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see Gtm.Edge#getLatitude()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Latitude();

	/**
	 * Returns the meta object for class '{@link Gtm.CarrierResourceLocation <em>Carrier Resource Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Resource Location</em>'.
	 * @see Gtm.CarrierResourceLocation
	 * @generated
	 */
	EClass getCarrierResourceLocation();

	/**
	 * Returns the meta object for the reference '{@link Gtm.CarrierResourceLocation#getCarrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier</em>'.
	 * @see Gtm.CarrierResourceLocation#getCarrier()
	 * @see #getCarrierResourceLocation()
	 * @generated
	 */
	EReference getCarrierResourceLocation_Carrier();

	/**
	 * Returns the meta object for the reference '{@link Gtm.CarrierResourceLocation#getServiceBrand <em>Service Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Brand</em>'.
	 * @see Gtm.CarrierResourceLocation#getServiceBrand()
	 * @see #getCarrierResourceLocation()
	 * @generated
	 */
	EReference getCarrierResourceLocation_ServiceBrand();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.CarrierResourceLocation#getOnlineResources <em>Online Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Online Resources</em>'.
	 * @see Gtm.CarrierResourceLocation#getOnlineResources()
	 * @see #getCarrierResourceLocation()
	 * @generated
	 */
	EReference getCarrierResourceLocation_OnlineResources();

	/**
	 * Returns the meta object for class '{@link Gtm.CrossBorderCondition <em>Cross Border Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cross Border Condition</em>'.
	 * @see Gtm.CrossBorderCondition
	 * @generated
	 */
	EClass getCrossBorderCondition();

	/**
	 * Returns the meta object for the reference '{@link Gtm.CrossBorderCondition#getFromCountry <em>From Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Country</em>'.
	 * @see Gtm.CrossBorderCondition#getFromCountry()
	 * @see #getCrossBorderCondition()
	 * @generated
	 */
	EReference getCrossBorderCondition_FromCountry();

	/**
	 * Returns the meta object for the reference '{@link Gtm.CrossBorderCondition#getToCountry <em>To Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Country</em>'.
	 * @see Gtm.CrossBorderCondition#getToCountry()
	 * @see #getCrossBorderCondition()
	 * @generated
	 */
	EReference getCrossBorderCondition_ToCountry();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.CrossBorderCondition#getAffectedServiceBrands <em>Affected Service Brands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Affected Service Brands</em>'.
	 * @see Gtm.CrossBorderCondition#getAffectedServiceBrands()
	 * @see #getCrossBorderCondition()
	 * @generated
	 */
	EReference getCrossBorderCondition_AffectedServiceBrands();

	/**
	 * Returns the meta object for class '{@link Gtm.FareCombinationModel <em>Fare Combination Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fare Combination Model</em>'.
	 * @see Gtm.FareCombinationModel
	 * @generated
	 */
	EClass getFareCombinationModel();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareCombinationModel#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see Gtm.FareCombinationModel#getModel()
	 * @see #getFareCombinationModel()
	 * @generated
	 */
	EAttribute getFareCombinationModel_Model();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.FareCombinationModel#getCombinableCarriers <em>Combinable Carriers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Combinable Carriers</em>'.
	 * @see Gtm.FareCombinationModel#getCombinableCarriers()
	 * @see #getFareCombinationModel()
	 * @generated
	 */
	EReference getFareCombinationModel_CombinableCarriers();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareCombinationModel#isOnlyWhenCombined <em>Only When Combined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Only When Combined</em>'.
	 * @see Gtm.FareCombinationModel#isOnlyWhenCombined()
	 * @see #getFareCombinationModel()
	 * @generated
	 */
	EAttribute getFareCombinationModel_OnlyWhenCombined();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.FareCombinationModel#getAllowedAllocators <em>Allowed Allocators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allowed Allocators</em>'.
	 * @see Gtm.FareCombinationModel#getAllowedAllocators()
	 * @see #getFareCombinationModel()
	 * @generated
	 */
	EReference getFareCombinationModel_AllowedAllocators();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareCombinationModel#getReferenceCluster <em>Reference Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Cluster</em>'.
	 * @see Gtm.FareCombinationModel#getReferenceCluster()
	 * @see #getFareCombinationModel()
	 * @generated
	 */
	EAttribute getFareCombinationModel_ReferenceCluster();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.FareCombinationModel#getAllowedClusters <em>Allowed Clusters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Allowed Clusters</em>'.
	 * @see Gtm.FareCombinationModel#getAllowedClusters()
	 * @see #getFareCombinationModel()
	 * @generated
	 */
	EAttribute getFareCombinationModel_AllowedClusters();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.FareCombinationModel#getAllowedCommonContracts <em>Allowed Common Contracts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allowed Common Contracts</em>'.
	 * @see Gtm.FareCombinationModel#getAllowedCommonContracts()
	 * @see #getFareCombinationModel()
	 * @generated
	 */
	EReference getFareCombinationModel_AllowedCommonContracts();

	/**
	 * Returns the meta object for class '{@link Gtm.ReductionConstraint <em>Reduction Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reduction Constraint</em>'.
	 * @see Gtm.ReductionConstraint
	 * @generated
	 */
	EClass getReductionConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReductionConstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.ReductionConstraint#getId()
	 * @see #getReductionConstraint()
	 * @generated
	 */
	EAttribute getReductionConstraint_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.ReductionConstraint#getRequiredReductionCards <em>Required Reduction Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Reduction Cards</em>'.
	 * @see Gtm.ReductionConstraint#getRequiredReductionCards()
	 * @see #getReductionConstraint()
	 * @generated
	 */
	EReference getReductionConstraint_RequiredReductionCards();

	/**
	 * Returns the meta object for class '{@link Gtm.RequiredReductionCard <em>Required Reduction Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Reduction Card</em>'.
	 * @see Gtm.RequiredReductionCard
	 * @generated
	 */
	EClass getRequiredReductionCard();

	/**
	 * Returns the meta object for the reference '{@link Gtm.RequiredReductionCard#getCardClass <em>Card Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Card Class</em>'.
	 * @see Gtm.RequiredReductionCard#getCardClass()
	 * @see #getRequiredReductionCard()
	 * @generated
	 */
	EReference getRequiredReductionCard_CardClass();

	/**
	 * Returns the meta object for the reference '{@link Gtm.RequiredReductionCard#getCard <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Card</em>'.
	 * @see Gtm.RequiredReductionCard#getCard()
	 * @see #getRequiredReductionCard()
	 * @generated
	 */
	EReference getRequiredReductionCard_Card();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.RequiredReductionCard#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gtm.RequiredReductionCard#getName()
	 * @see #getRequiredReductionCard()
	 * @generated
	 */
	EAttribute getRequiredReductionCard_Name();

	/**
	 * Returns the meta object for class '{@link Gtm.ConversionFromLegacy <em>Conversion From Legacy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversion From Legacy</em>'.
	 * @see Gtm.ConversionFromLegacy
	 * @generated
	 */
	EClass getConversionFromLegacy();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.ConversionFromLegacy#getLegacy108 <em>Legacy108</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legacy108</em>'.
	 * @see Gtm.ConversionFromLegacy#getLegacy108()
	 * @see #getConversionFromLegacy()
	 * @generated
	 */
	EReference getConversionFromLegacy_Legacy108();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.ConversionFromLegacy#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Params</em>'.
	 * @see Gtm.ConversionFromLegacy#getParams()
	 * @see #getConversionFromLegacy()
	 * @generated
	 */
	EReference getConversionFromLegacy_Params();

	/**
	 * Returns the meta object for class '{@link Gtm.ConversionParams <em>Conversion Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversion Params</em>'.
	 * @see Gtm.ConversionParams
	 * @generated
	 */
	EClass getConversionParams();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ConversionParams#getTaxId <em>Tax Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Id</em>'.
	 * @see Gtm.ConversionParams#getTaxId()
	 * @see #getConversionParams()
	 * @generated
	 */
	EAttribute getConversionParams_TaxId();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ConversionParams#getVATpercentage <em>VA Tpercentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VA Tpercentage</em>'.
	 * @see Gtm.ConversionParams#getVATpercentage()
	 * @see #getConversionParams()
	 * @generated
	 */
	EAttribute getConversionParams_VATpercentage();

	/**
	 * Returns the meta object for the reference '{@link Gtm.ConversionParams#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Country</em>'.
	 * @see Gtm.ConversionParams#getCountry()
	 * @see #getConversionParams()
	 * @generated
	 */
	EReference getConversionParams_Country();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.ConversionParams#getLegacyBorderPointMappings <em>Legacy Border Point Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legacy Border Point Mappings</em>'.
	 * @see Gtm.ConversionParams#getLegacyBorderPointMappings()
	 * @see #getConversionParams()
	 * @generated
	 */
	EReference getConversionParams_LegacyBorderPointMappings();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.ConversionParams#getLegacyStationMappings <em>Legacy Station Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legacy Station Mappings</em>'.
	 * @see Gtm.ConversionParams#getLegacyStationMappings()
	 * @see #getConversionParams()
	 * @generated
	 */
	EReference getConversionParams_LegacyStationMappings();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.ConversionParams#getLegacyTargetFares <em>Legacy Target Fares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legacy Target Fares</em>'.
	 * @see Gtm.ConversionParams#getLegacyTargetFares()
	 * @see #getConversionParams()
	 * @generated
	 */
	EReference getConversionParams_LegacyTargetFares();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.ConversionParams#getLegacyFareStationMappings <em>Legacy Fare Station Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legacy Fare Station Mappings</em>'.
	 * @see Gtm.ConversionParams#getLegacyFareStationMappings()
	 * @see #getConversionParams()
	 * @generated
	 */
	EReference getConversionParams_LegacyFareStationMappings();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.ConversionParams#getLegacyStationToServiceBrandMappings <em>Legacy Station To Service Brand Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legacy Station To Service Brand Mappings</em>'.
	 * @see Gtm.ConversionParams#getLegacyStationToServiceBrandMappings()
	 * @see #getConversionParams()
	 * @generated
	 */
	EReference getConversionParams_LegacyStationToServiceBrandMappings();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.ConversionParams#getEndOfSale <em>End Of Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End Of Sale</em>'.
	 * @see Gtm.ConversionParams#getEndOfSale()
	 * @see #getConversionParams()
	 * @generated
	 */
	EReference getConversionParams_EndOfSale();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.ConversionParams#getStartOfSale <em>Start Of Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Of Sale</em>'.
	 * @see Gtm.ConversionParams#getStartOfSale()
	 * @see #getConversionParams()
	 * @generated
	 */
	EReference getConversionParams_StartOfSale();

	/**
	 * Returns the meta object for class '{@link Gtm.TargetFareTemplate <em>Target Fare Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Fare Template</em>'.
	 * @see Gtm.TargetFareTemplate
	 * @generated
	 */
	EClass getTargetFareTemplate();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.TargetFareTemplate#getPriceFactor <em>Price Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price Factor</em>'.
	 * @see Gtm.TargetFareTemplate#getPriceFactor()
	 * @see #getTargetFareTemplate()
	 * @generated
	 */
	EAttribute getTargetFareTemplate_PriceFactor();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.TargetFareTemplate#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.TargetFareTemplate#getId()
	 * @see #getTargetFareTemplate()
	 * @generated
	 */
	EAttribute getTargetFareTemplate_Id();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.TargetFareTemplate#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Gtm.TargetFareTemplate#getType()
	 * @see #getTargetFareTemplate()
	 * @generated
	 */
	EAttribute getTargetFareTemplate_Type();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.TargetFareTemplate#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Gtm.TargetFareTemplate#getDataDescription()
	 * @see #getTargetFareTemplate()
	 * @generated
	 */
	EAttribute getTargetFareTemplate_DataDescription();

	/**
	 * Returns the meta object for the reference '{@link Gtm.TargetFareTemplate#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Text</em>'.
	 * @see Gtm.TargetFareTemplate#getText()
	 * @see #getTargetFareTemplate()
	 * @generated
	 */
	EReference getTargetFareTemplate_Text();

	/**
	 * Returns the meta object for the reference '{@link Gtm.TargetFareTemplate#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Price</em>'.
	 * @see Gtm.TargetFareTemplate#getPrice()
	 * @see #getTargetFareTemplate()
	 * @generated
	 */
	EReference getTargetFareTemplate_Price();

	/**
	 * Returns the meta object for the reference '{@link Gtm.TargetFareTemplate#getRegionalConstraint <em>Regional Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Regional Constraint</em>'.
	 * @see Gtm.TargetFareTemplate#getRegionalConstraint()
	 * @see #getTargetFareTemplate()
	 * @generated
	 */
	EReference getTargetFareTemplate_RegionalConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.TargetFareTemplate#getServiceConstraint <em>Service Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Constraint</em>'.
	 * @see Gtm.TargetFareTemplate#getServiceConstraint()
	 * @see #getTargetFareTemplate()
	 * @generated
	 */
	EReference getTargetFareTemplate_ServiceConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.TargetFareTemplate#getCarrierConstraint <em>Carrier Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier Constraint</em>'.
	 * @see Gtm.TargetFareTemplate#getCarrierConstraint()
	 * @see #getTargetFareTemplate()
	 * @generated
	 */
	EReference getTargetFareTemplate_CarrierConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.TargetFareTemplate#getServiceClass <em>Service Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Class</em>'.
	 * @see Gtm.TargetFareTemplate#getServiceClass()
	 * @see #getTargetFareTemplate()
	 * @generated
	 */
	EReference getTargetFareTemplate_ServiceClass();

	/**
	 * Returns the meta object for the reference '{@link Gtm.TargetFareTemplate#getServiceLevel <em>Service Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Level</em>'.
	 * @see Gtm.TargetFareTemplate#getServiceLevel()
	 * @see #getTargetFareTemplate()
	 * @generated
	 */
	EReference getTargetFareTemplate_ServiceLevel();

	/**
	 * Returns the meta object for the reference '{@link Gtm.TargetFareTemplate#getSalesAvailability <em>Sales Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sales Availability</em>'.
	 * @see Gtm.TargetFareTemplate#getSalesAvailability()
	 * @see #getTargetFareTemplate()
	 * @generated
	 */
	EReference getTargetFareTemplate_SalesAvailability();

	/**
	 * Returns the meta object for the reference '{@link Gtm.TargetFareTemplate#getTravelValidity <em>Travel Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Travel Validity</em>'.
	 * @see Gtm.TargetFareTemplate#getTravelValidity()
	 * @see #getTargetFareTemplate()
	 * @generated
	 */
	EReference getTargetFareTemplate_TravelValidity();

	/**
	 * Returns the meta object for the reference '{@link Gtm.TargetFareTemplate#getCombinationConstraint <em>Combination Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Combination Constraint</em>'.
	 * @see Gtm.TargetFareTemplate#getCombinationConstraint()
	 * @see #getTargetFareTemplate()
	 * @generated
	 */
	EReference getTargetFareTemplate_CombinationConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.TargetFareTemplate#getSeparateContractCombinationConstraint <em>Separate Contract Combination Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Separate Contract Combination Constraint</em>'.
	 * @see Gtm.TargetFareTemplate#getSeparateContractCombinationConstraint()
	 * @see #getTargetFareTemplate()
	 * @generated
	 */
	EReference getTargetFareTemplate_SeparateContractCombinationConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.TargetFareTemplate#getFareDetailDescription <em>Fare Detail Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fare Detail Description</em>'.
	 * @see Gtm.TargetFareTemplate#getFareDetailDescription()
	 * @see #getTargetFareTemplate()
	 * @generated
	 */
	EReference getTargetFareTemplate_FareDetailDescription();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.TargetFareTemplate#getLegacyAccountingIdentifier <em>Legacy Accounting Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legacy Accounting Identifier</em>'.
	 * @see Gtm.TargetFareTemplate#getLegacyAccountingIdentifier()
	 * @see #getTargetFareTemplate()
	 * @generated
	 */
	EReference getTargetFareTemplate_LegacyAccountingIdentifier();

	/**
	 * Returns the meta object for the reference '{@link Gtm.TargetFareTemplate#getPersonalDataConstraint <em>Personal Data Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Personal Data Constraint</em>'.
	 * @see Gtm.TargetFareTemplate#getPersonalDataConstraint()
	 * @see #getTargetFareTemplate()
	 * @generated
	 */
	EReference getTargetFareTemplate_PersonalDataConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.TargetFareTemplate#getReservationParameter <em>Reservation Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reservation Parameter</em>'.
	 * @see Gtm.TargetFareTemplate#getReservationParameter()
	 * @see #getTargetFareTemplate()
	 * @generated
	 */
	EReference getTargetFareTemplate_ReservationParameter();

	/**
	 * Returns the meta object for the reference '{@link Gtm.TargetFareTemplate#getReductionConstraint <em>Reduction Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reduction Constraint</em>'.
	 * @see Gtm.TargetFareTemplate#getReductionConstraint()
	 * @see #getTargetFareTemplate()
	 * @generated
	 */
	EReference getTargetFareTemplate_ReductionConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.TargetFareTemplate#getFulfillmentConstraint <em>Fulfillment Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fulfillment Constraint</em>'.
	 * @see Gtm.TargetFareTemplate#getFulfillmentConstraint()
	 * @see #getTargetFareTemplate()
	 * @generated
	 */
	EReference getTargetFareTemplate_FulfillmentConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.TargetFareTemplate#getPassengerConstraint <em>Passenger Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Passenger Constraint</em>'.
	 * @see Gtm.TargetFareTemplate#getPassengerConstraint()
	 * @see #getTargetFareTemplate()
	 * @generated
	 */
	EReference getTargetFareTemplate_PassengerConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.TargetFareTemplate#getAfterSalesRule <em>After Sales Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>After Sales Rule</em>'.
	 * @see Gtm.TargetFareTemplate#getAfterSalesRule()
	 * @see #getTargetFareTemplate()
	 * @generated
	 */
	EReference getTargetFareTemplate_AfterSalesRule();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyStationToServiceConstraintMappings <em>Legacy Station To Service Constraint Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Station To Service Constraint Mappings</em>'.
	 * @see Gtm.LegacyStationToServiceConstraintMappings
	 * @generated
	 */
	EClass getLegacyStationToServiceConstraintMappings();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.LegacyStationToServiceConstraintMappings#getLegacyStationToServiceBrandMappings <em>Legacy Station To Service Brand Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Legacy Station To Service Brand Mappings</em>'.
	 * @see Gtm.LegacyStationToServiceConstraintMappings#getLegacyStationToServiceBrandMappings()
	 * @see #getLegacyStationToServiceConstraintMappings()
	 * @generated
	 */
	EReference getLegacyStationToServiceConstraintMappings_LegacyStationToServiceBrandMappings();

	/**
	 * Returns the meta object for the '{@link Gtm.LegacyStationToServiceConstraintMappings#findServiceConstraint(int) <em>Find Service Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Service Constraint</em>' operation.
	 * @see Gtm.LegacyStationToServiceConstraintMappings#findServiceConstraint(int)
	 * @generated
	 */
	EOperation getLegacyStationToServiceConstraintMappings__FindServiceConstraint__int();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyStationToServiceConstraintMapping <em>Legacy Station To Service Constraint Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Station To Service Constraint Mapping</em>'.
	 * @see Gtm.LegacyStationToServiceConstraintMapping
	 * @generated
	 */
	EClass getLegacyStationToServiceConstraintMapping();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyStationToServiceConstraintMapping#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Gtm.LegacyStationToServiceConstraintMapping#getCode()
	 * @see #getLegacyStationToServiceConstraintMapping()
	 * @generated
	 */
	EAttribute getLegacyStationToServiceConstraintMapping_Code();

	/**
	 * Returns the meta object for the reference '{@link Gtm.LegacyStationToServiceConstraintMapping#getServiceConstraint <em>Service Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Constraint</em>'.
	 * @see Gtm.LegacyStationToServiceConstraintMapping#getServiceConstraint()
	 * @see #getLegacyStationToServiceConstraintMapping()
	 * @generated
	 */
	EReference getLegacyStationToServiceConstraintMapping_ServiceConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyStationToServiceConstraintMapping#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Gtm.LegacyStationToServiceConstraintMapping#getDescription()
	 * @see #getLegacyStationToServiceConstraintMapping()
	 * @generated
	 */
	EAttribute getLegacyStationToServiceConstraintMapping_Description();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyStationMappings <em>Legacy Station Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Station Mappings</em>'.
	 * @see Gtm.LegacyStationMappings
	 * @generated
	 */
	EClass getLegacyStationMappings();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.LegacyStationMappings#getStationMappings <em>Station Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Station Mappings</em>'.
	 * @see Gtm.LegacyStationMappings#getStationMappings()
	 * @see #getLegacyStationMappings()
	 * @generated
	 */
	EReference getLegacyStationMappings_StationMappings();

	/**
	 * Returns the meta object for the '{@link Gtm.LegacyStationMappings#findMappedStation(int) <em>Find Mapped Station</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Mapped Station</em>' operation.
	 * @see Gtm.LegacyStationMappings#findMappedStation(int)
	 * @generated
	 */
	EOperation getLegacyStationMappings__FindMappedStation__int();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyStationMap <em>Legacy Station Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Station Map</em>'.
	 * @see Gtm.LegacyStationMap
	 * @generated
	 */
	EClass getLegacyStationMap();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyStationMap#getLegacyCode <em>Legacy Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legacy Code</em>'.
	 * @see Gtm.LegacyStationMap#getLegacyCode()
	 * @see #getLegacyStationMap()
	 * @generated
	 */
	EAttribute getLegacyStationMap_LegacyCode();

	/**
	 * Returns the meta object for the reference '{@link Gtm.LegacyStationMap#getStation <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Station</em>'.
	 * @see Gtm.LegacyStationMap#getStation()
	 * @see #getLegacyStationMap()
	 * @generated
	 */
	EReference getLegacyStationMap_Station();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyStation <em>Legacy Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Station</em>'.
	 * @see Gtm.LegacyStation
	 * @generated
	 */
	EClass getLegacyStation();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyStation#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Gtm.LegacyStation#getCode()
	 * @see #getLegacyStation()
	 * @generated
	 */
	EAttribute getLegacyStation_Code();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyStation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gtm.LegacyStation#getName()
	 * @see #getLegacyStation()
	 * @generated
	 */
	EAttribute getLegacyStation_Name();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyBoderPointMappings <em>Legacy Boder Point Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Boder Point Mappings</em>'.
	 * @see Gtm.LegacyBoderPointMappings
	 * @generated
	 */
	EClass getLegacyBoderPointMappings();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.LegacyBoderPointMappings#getBorderPoints <em>Border Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Border Points</em>'.
	 * @see Gtm.LegacyBoderPointMappings#getBorderPoints()
	 * @see #getLegacyBoderPointMappings()
	 * @generated
	 */
	EReference getLegacyBoderPointMappings_BorderPoints();

	/**
	 * Returns the meta object for the '{@link Gtm.LegacyBoderPointMappings#getMappingByBorderPointCode(int) <em>Get Mapping By Border Point Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Mapping By Border Point Code</em>' operation.
	 * @see Gtm.LegacyBoderPointMappings#getMappingByBorderPointCode(int)
	 * @generated
	 */
	EOperation getLegacyBoderPointMappings__GetMappingByBorderPointCode__int();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyBorderPointMapping <em>Legacy Border Point Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Border Point Mapping</em>'.
	 * @see Gtm.LegacyBorderPointMapping
	 * @generated
	 */
	EClass getLegacyBorderPointMapping();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyBorderPointMapping#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Gtm.LegacyBorderPointMapping#getCode()
	 * @see #getLegacyBorderPointMapping()
	 * @generated
	 */
	EAttribute getLegacyBorderPointMapping_Code();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyBorderPointMapping#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gtm.LegacyBorderPointMapping#getName()
	 * @see #getLegacyBorderPointMapping()
	 * @generated
	 */
	EAttribute getLegacyBorderPointMapping_Name();

	/**
	 * Returns the meta object for the reference '{@link Gtm.LegacyBorderPointMapping#getStation <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Station</em>'.
	 * @see Gtm.LegacyBorderPointMapping#getStation()
	 * @see #getLegacyBorderPointMapping()
	 * @generated
	 */
	EReference getLegacyBorderPointMapping_Station();

	/**
	 * Returns the meta object for the reference '{@link Gtm.LegacyBorderPointMapping#getConnectionPoint <em>Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection Point</em>'.
	 * @see Gtm.LegacyBorderPointMapping#getConnectionPoint()
	 * @see #getLegacyBorderPointMapping()
	 * @generated
	 */
	EReference getLegacyBorderPointMapping_ConnectionPoint();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyFareStationSetMappings <em>Legacy Fare Station Set Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Fare Station Set Mappings</em>'.
	 * @see Gtm.LegacyFareStationSetMappings
	 * @generated
	 */
	EClass getLegacyFareStationSetMappings();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.LegacyFareStationSetMappings#getLegacyFareStationSetMap <em>Legacy Fare Station Set Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Legacy Fare Station Set Map</em>'.
	 * @see Gtm.LegacyFareStationSetMappings#getLegacyFareStationSetMap()
	 * @see #getLegacyFareStationSetMappings()
	 * @generated
	 */
	EReference getLegacyFareStationSetMappings_LegacyFareStationSetMap();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyFareStationSetMap <em>Legacy Fare Station Set Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Fare Station Set Map</em>'.
	 * @see Gtm.LegacyFareStationSetMap
	 * @generated
	 */
	EClass getLegacyFareStationSetMap();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyFareStationSetMap#getLegacyCode <em>Legacy Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legacy Code</em>'.
	 * @see Gtm.LegacyFareStationSetMap#getLegacyCode()
	 * @see #getLegacyFareStationSetMap()
	 * @generated
	 */
	EAttribute getLegacyFareStationSetMap_LegacyCode();

	/**
	 * Returns the meta object for the reference '{@link Gtm.LegacyFareStationSetMap#getStationSet <em>Station Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Station Set</em>'.
	 * @see Gtm.LegacyFareStationSetMap#getStationSet()
	 * @see #getLegacyFareStationSetMap()
	 * @generated
	 */
	EReference getLegacyFareStationSetMap_StationSet();

	/**
	 * Returns the meta object for class '{@link Gtm.Legacy108 <em>Legacy108</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy108</em>'.
	 * @see Gtm.Legacy108
	 * @generated
	 */
	EClass getLegacy108();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Legacy108#getCharacterSet <em>Character Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Character Set</em>'.
	 * @see Gtm.Legacy108#getCharacterSet()
	 * @see #getLegacy108()
	 * @generated
	 */
	EAttribute getLegacy108_CharacterSet();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.Legacy108#getLegacySeriesList <em>Legacy Series List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legacy Series List</em>'.
	 * @see Gtm.Legacy108#getLegacySeriesList()
	 * @see #getLegacy108()
	 * @generated
	 */
	EReference getLegacy108_LegacySeriesList();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.Legacy108#getLegacySeparateContractSeries <em>Legacy Separate Contract Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legacy Separate Contract Series</em>'.
	 * @see Gtm.Legacy108#getLegacySeparateContractSeries()
	 * @see #getLegacy108()
	 * @generated
	 */
	EReference getLegacy108_LegacySeparateContractSeries();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.Legacy108#getLegacyDistanceFares <em>Legacy Distance Fares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legacy Distance Fares</em>'.
	 * @see Gtm.Legacy108#getLegacyDistanceFares()
	 * @see #getLegacy108()
	 * @generated
	 */
	EReference getLegacy108_LegacyDistanceFares();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.Legacy108#getLegacyRouteFares <em>Legacy Route Fares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legacy Route Fares</em>'.
	 * @see Gtm.Legacy108#getLegacyRouteFares()
	 * @see #getLegacy108()
	 * @generated
	 */
	EReference getLegacy108_LegacyRouteFares();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.Legacy108#getLegacyStations <em>Legacy Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legacy Stations</em>'.
	 * @see Gtm.Legacy108#getLegacyStations()
	 * @see #getLegacy108()
	 * @generated
	 */
	EReference getLegacy108_LegacyStations();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Legacy108#getTimeZone <em>Time Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Zone</em>'.
	 * @see Gtm.Legacy108#getTimeZone()
	 * @see #getLegacy108()
	 * @generated
	 */
	EAttribute getLegacy108_TimeZone();

	/**
	 * Returns the meta object for the reference '{@link Gtm.Legacy108#getCarrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier</em>'.
	 * @see Gtm.Legacy108#getCarrier()
	 * @see #getLegacy108()
	 * @generated
	 */
	EReference getLegacy108_Carrier();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Legacy108#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see Gtm.Legacy108#getStartDate()
	 * @see #getLegacy108()
	 * @generated
	 */
	EAttribute getLegacy108_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Legacy108#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see Gtm.Legacy108#getEndDate()
	 * @see #getLegacy108()
	 * @generated
	 */
	EAttribute getLegacy108_EndDate();

	/**
	 * Returns the meta object for class '{@link Gtm.Legacy108Stations <em>Legacy108 Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy108 Stations</em>'.
	 * @see Gtm.Legacy108Stations
	 * @generated
	 */
	EClass getLegacy108Stations();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.Legacy108Stations#getLegacyStations <em>Legacy Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Legacy Stations</em>'.
	 * @see Gtm.Legacy108Stations#getLegacyStations()
	 * @see #getLegacy108Stations()
	 * @generated
	 */
	EReference getLegacy108Stations_LegacyStations();

	/**
	 * Returns the meta object for the '{@link Gtm.Legacy108Stations#findStation(int) <em>Find Station</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Station</em>' operation.
	 * @see Gtm.Legacy108Stations#findStation(int)
	 * @generated
	 */
	EOperation getLegacy108Stations__FindStation__int();

	/**
	 * Returns the meta object for the '{@link Gtm.Legacy108Stations#findByBorderPoint(int) <em>Find By Border Point</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find By Border Point</em>' operation.
	 * @see Gtm.Legacy108Stations#findByBorderPoint(int)
	 * @generated
	 */
	EOperation getLegacy108Stations__FindByBorderPoint__int();

	/**
	 * Returns the meta object for class '{@link Gtm.Legacy108Station <em>Legacy108 Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy108 Station</em>'.
	 * @see Gtm.Legacy108Station
	 * @generated
	 */
	EClass getLegacy108Station();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Legacy108Station#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gtm.Legacy108Station#getName()
	 * @see #getLegacy108Station()
	 * @generated
	 */
	EAttribute getLegacy108Station_Name();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Legacy108Station#getBorderPointCode <em>Border Point Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Point Code</em>'.
	 * @see Gtm.Legacy108Station#getBorderPointCode()
	 * @see #getLegacy108Station()
	 * @generated
	 */
	EAttribute getLegacy108Station_BorderPointCode();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Legacy108Station#getNameUTF8 <em>Name UTF8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name UTF8</em>'.
	 * @see Gtm.Legacy108Station#getNameUTF8()
	 * @see #getLegacy108Station()
	 * @generated
	 */
	EAttribute getLegacy108Station_NameUTF8();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Legacy108Station#getStationCode <em>Station Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Station Code</em>'.
	 * @see Gtm.Legacy108Station#getStationCode()
	 * @see #getLegacy108Station()
	 * @generated
	 */
	EAttribute getLegacy108Station_StationCode();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Legacy108Station#getFareReferenceStationCode <em>Fare Reference Station Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fare Reference Station Code</em>'.
	 * @see Gtm.Legacy108Station#getFareReferenceStationCode()
	 * @see #getLegacy108Station()
	 * @generated
	 */
	EAttribute getLegacy108Station_FareReferenceStationCode();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Legacy108Station#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see Gtm.Legacy108Station#getShortName()
	 * @see #getLegacy108Station()
	 * @generated
	 */
	EAttribute getLegacy108Station_ShortName();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyRouteFares <em>Legacy Route Fares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Route Fares</em>'.
	 * @see Gtm.LegacyRouteFares
	 * @generated
	 */
	EClass getLegacyRouteFares();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.LegacyRouteFares#getRouteFare <em>Route Fare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Route Fare</em>'.
	 * @see Gtm.LegacyRouteFares#getRouteFare()
	 * @see #getLegacyRouteFares()
	 * @generated
	 */
	EReference getLegacyRouteFares_RouteFare();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyRouteFare <em>Legacy Route Fare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Route Fare</em>'.
	 * @see Gtm.LegacyRouteFare
	 * @generated
	 */
	EClass getLegacyRouteFare();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyRouteFare#getFareTableNumber <em>Fare Table Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fare Table Number</em>'.
	 * @see Gtm.LegacyRouteFare#getFareTableNumber()
	 * @see #getLegacyRouteFare()
	 * @generated
	 */
	EAttribute getLegacyRouteFare_FareTableNumber();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyRouteFare#getSeriesNumber <em>Series Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Series Number</em>'.
	 * @see Gtm.LegacyRouteFare#getSeriesNumber()
	 * @see #getLegacyRouteFare()
	 * @generated
	 */
	EAttribute getLegacyRouteFare_SeriesNumber();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyRouteFare#getFare2nd <em>Fare2nd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fare2nd</em>'.
	 * @see Gtm.LegacyRouteFare#getFare2nd()
	 * @see #getLegacyRouteFare()
	 * @generated
	 */
	EAttribute getLegacyRouteFare_Fare2nd();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyRouteFare#getFare1st <em>Fare1st</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fare1st</em>'.
	 * @see Gtm.LegacyRouteFare#getFare1st()
	 * @see #getLegacyRouteFare()
	 * @generated
	 */
	EAttribute getLegacyRouteFare_Fare1st();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyRouteFare#getReturnFare1st <em>Return Fare1st</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Fare1st</em>'.
	 * @see Gtm.LegacyRouteFare#getReturnFare1st()
	 * @see #getLegacyRouteFare()
	 * @generated
	 */
	EAttribute getLegacyRouteFare_ReturnFare1st();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyRouteFare#getReturnFare2nd <em>Return Fare2nd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Fare2nd</em>'.
	 * @see Gtm.LegacyRouteFare#getReturnFare2nd()
	 * @see #getLegacyRouteFare()
	 * @generated
	 */
	EAttribute getLegacyRouteFare_ReturnFare2nd();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyRouteFare#getValidFrom <em>Valid From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid From</em>'.
	 * @see Gtm.LegacyRouteFare#getValidFrom()
	 * @see #getLegacyRouteFare()
	 * @generated
	 */
	EAttribute getLegacyRouteFare_ValidFrom();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyRouteFare#getValidUntil <em>Valid Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Until</em>'.
	 * @see Gtm.LegacyRouteFare#getValidUntil()
	 * @see #getLegacyRouteFare()
	 * @generated
	 */
	EAttribute getLegacyRouteFare_ValidUntil();

	/**
	 * Returns the meta object for the reference '{@link Gtm.LegacyRouteFare#getSeries <em>Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Series</em>'.
	 * @see Gtm.LegacyRouteFare#getSeries()
	 * @see #getLegacyRouteFare()
	 * @generated
	 */
	EReference getLegacyRouteFare_Series();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacySeriesList <em>Legacy Series List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Series List</em>'.
	 * @see Gtm.LegacySeriesList
	 * @generated
	 */
	EClass getLegacySeriesList();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.LegacySeriesList#getSeries <em>Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Series</em>'.
	 * @see Gtm.LegacySeriesList#getSeries()
	 * @see #getLegacySeriesList()
	 * @generated
	 */
	EReference getLegacySeriesList_Series();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacySeries <em>Legacy Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Series</em>'.
	 * @see Gtm.LegacySeries
	 * @generated
	 */
	EClass getLegacySeries();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeries#getSupplyingCarrierCode <em>Supplying Carrier Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplying Carrier Code</em>'.
	 * @see Gtm.LegacySeries#getSupplyingCarrierCode()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EAttribute getLegacySeries_SupplyingCarrierCode();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeries#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see Gtm.LegacySeries#getNumber()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EAttribute getLegacySeries_Number();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeries#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Gtm.LegacySeries#getType()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EAttribute getLegacySeries_Type();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeries#getFromStation <em>From Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Station</em>'.
	 * @see Gtm.LegacySeries#getFromStation()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EAttribute getLegacySeries_FromStation();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeries#getFromStationName <em>From Station Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Station Name</em>'.
	 * @see Gtm.LegacySeries#getFromStationName()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EAttribute getLegacySeries_FromStationName();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeries#getToStation <em>To Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Station</em>'.
	 * @see Gtm.LegacySeries#getToStation()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EAttribute getLegacySeries_ToStation();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeries#getToStationName <em>To Station Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Station Name</em>'.
	 * @see Gtm.LegacySeries#getToStationName()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EAttribute getLegacySeries_ToStationName();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeries#getRouteNumber <em>Route Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route Number</em>'.
	 * @see Gtm.LegacySeries#getRouteNumber()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EAttribute getLegacySeries_RouteNumber();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeries#getCarrierCode <em>Carrier Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Carrier Code</em>'.
	 * @see Gtm.LegacySeries#getCarrierCode()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EAttribute getLegacySeries_CarrierCode();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeries#getRouteDescription <em>Route Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route Description</em>'.
	 * @see Gtm.LegacySeries#getRouteDescription()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EAttribute getLegacySeries_RouteDescription();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeries#getPricetype <em>Pricetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pricetype</em>'.
	 * @see Gtm.LegacySeries#getPricetype()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EAttribute getLegacySeries_Pricetype();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeries#getDistance1 <em>Distance1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance1</em>'.
	 * @see Gtm.LegacySeries#getDistance1()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EAttribute getLegacySeries_Distance1();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeries#getDistance2 <em>Distance2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance2</em>'.
	 * @see Gtm.LegacySeries#getDistance2()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EAttribute getLegacySeries_Distance2();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.LegacySeries#getViastations <em>Viastations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Viastations</em>'.
	 * @see Gtm.LegacySeries#getViastations()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EReference getLegacySeries_Viastations();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeries#getValidFrom <em>Valid From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid From</em>'.
	 * @see Gtm.LegacySeries#getValidFrom()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EAttribute getLegacySeries_ValidFrom();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeries#getValidUntil <em>Valid Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Until</em>'.
	 * @see Gtm.LegacySeries#getValidUntil()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EAttribute getLegacySeries_ValidUntil();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacySeparateContractSeriesList <em>Legacy Separate Contract Series List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Separate Contract Series List</em>'.
	 * @see Gtm.LegacySeparateContractSeriesList
	 * @generated
	 */
	EClass getLegacySeparateContractSeriesList();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.LegacySeparateContractSeriesList#getSeparateContractSeries <em>Separate Contract Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Separate Contract Series</em>'.
	 * @see Gtm.LegacySeparateContractSeriesList#getSeparateContractSeries()
	 * @see #getLegacySeparateContractSeriesList()
	 * @generated
	 */
	EReference getLegacySeparateContractSeriesList_SeparateContractSeries();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacySeparateContractSeries <em>Legacy Separate Contract Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Separate Contract Series</em>'.
	 * @see Gtm.LegacySeparateContractSeries
	 * @generated
	 */
	EClass getLegacySeparateContractSeries();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeparateContractSeries#getSeriesNumber <em>Series Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Series Number</em>'.
	 * @see Gtm.LegacySeparateContractSeries#getSeriesNumber()
	 * @see #getLegacySeparateContractSeries()
	 * @generated
	 */
	EAttribute getLegacySeparateContractSeries_SeriesNumber();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeparateContractSeries#getValidFrom <em>Valid From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid From</em>'.
	 * @see Gtm.LegacySeparateContractSeries#getValidFrom()
	 * @see #getLegacySeparateContractSeries()
	 * @generated
	 */
	EAttribute getLegacySeparateContractSeries_ValidFrom();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeparateContractSeries#getValidUntil <em>Valid Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Until</em>'.
	 * @see Gtm.LegacySeparateContractSeries#getValidUntil()
	 * @see #getLegacySeparateContractSeries()
	 * @generated
	 */
	EAttribute getLegacySeparateContractSeries_ValidUntil();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyDistanceFares <em>Legacy Distance Fares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Distance Fares</em>'.
	 * @see Gtm.LegacyDistanceFares
	 * @generated
	 */
	EClass getLegacyDistanceFares();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.LegacyDistanceFares#getDistanceFare <em>Distance Fare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Distance Fare</em>'.
	 * @see Gtm.LegacyDistanceFares#getDistanceFare()
	 * @see #getLegacyDistanceFares()
	 * @generated
	 */
	EReference getLegacyDistanceFares_DistanceFare();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyDistanceFare <em>Legacy Distance Fare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Distance Fare</em>'.
	 * @see Gtm.LegacyDistanceFare
	 * @generated
	 */
	EClass getLegacyDistanceFare();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyDistanceFare#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see Gtm.LegacyDistanceFare#getDistance()
	 * @see #getLegacyDistanceFare()
	 * @generated
	 */
	EAttribute getLegacyDistanceFare_Distance();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyDistanceFare#getFare2nd <em>Fare2nd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fare2nd</em>'.
	 * @see Gtm.LegacyDistanceFare#getFare2nd()
	 * @see #getLegacyDistanceFare()
	 * @generated
	 */
	EAttribute getLegacyDistanceFare_Fare2nd();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyDistanceFare#getFare1st <em>Fare1st</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fare1st</em>'.
	 * @see Gtm.LegacyDistanceFare#getFare1st()
	 * @see #getLegacyDistanceFare()
	 * @generated
	 */
	EAttribute getLegacyDistanceFare_Fare1st();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyDistanceFare#getFareTableNumber <em>Fare Table Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fare Table Number</em>'.
	 * @see Gtm.LegacyDistanceFare#getFareTableNumber()
	 * @see #getLegacyDistanceFare()
	 * @generated
	 */
	EAttribute getLegacyDistanceFare_FareTableNumber();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyDistanceFare#getReturnFare1st <em>Return Fare1st</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Fare1st</em>'.
	 * @see Gtm.LegacyDistanceFare#getReturnFare1st()
	 * @see #getLegacyDistanceFare()
	 * @generated
	 */
	EAttribute getLegacyDistanceFare_ReturnFare1st();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyDistanceFare#getReturnFare2nd <em>Return Fare2nd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Fare2nd</em>'.
	 * @see Gtm.LegacyDistanceFare#getReturnFare2nd()
	 * @see #getLegacyDistanceFare()
	 * @generated
	 */
	EAttribute getLegacyDistanceFare_ReturnFare2nd();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyDistanceFare#getValidFrom <em>Valid From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid From</em>'.
	 * @see Gtm.LegacyDistanceFare#getValidFrom()
	 * @see #getLegacyDistanceFare()
	 * @generated
	 */
	EAttribute getLegacyDistanceFare_ValidFrom();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyDistanceFare#getValidUntil <em>Valid Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Until</em>'.
	 * @see Gtm.LegacyDistanceFare#getValidUntil()
	 * @see #getLegacyDistanceFare()
	 * @generated
	 */
	EAttribute getLegacyDistanceFare_ValidUntil();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyViastation <em>Legacy Viastation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Viastation</em>'.
	 * @see Gtm.LegacyViastation
	 * @generated
	 */
	EClass getLegacyViastation();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyViastation#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see Gtm.LegacyViastation#getPosition()
	 * @see #getLegacyViastation()
	 * @generated
	 */
	EAttribute getLegacyViastation_Position();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyViastation#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Gtm.LegacyViastation#getCode()
	 * @see #getLegacyViastation()
	 * @generated
	 */
	EAttribute getLegacyViastation_Code();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyTargetFares <em>Legacy Target Fares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Target Fares</em>'.
	 * @see Gtm.LegacyTargetFares
	 * @generated
	 */
	EClass getLegacyTargetFares();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.LegacyTargetFares#getTargetFares <em>Target Fares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Fares</em>'.
	 * @see Gtm.LegacyTargetFares#getTargetFares()
	 * @see #getLegacyTargetFares()
	 * @generated
	 */
	EReference getLegacyTargetFares_TargetFares();

	/**
	 * Returns the meta object for enum '{@link Gtm.AfterSalesTransactionType <em>After Sales Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>After Sales Transaction Type</em>'.
	 * @see Gtm.AfterSalesTransactionType
	 * @generated
	 */
	EEnum getAfterSalesTransactionType();

	/**
	 * Returns the meta object for enum '{@link Gtm.BarcodeTypes <em>Barcode Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Barcode Types</em>'.
	 * @see Gtm.BarcodeTypes
	 * @generated
	 */
	EEnum getBarcodeTypes();

	/**
	 * Returns the meta object for enum '{@link Gtm.ClassicClassType <em>Classic Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Classic Class Type</em>'.
	 * @see Gtm.ClassicClassType
	 * @generated
	 */
	EEnum getClassicClassType();

	/**
	 * Returns the meta object for enum '{@link Gtm.CharacterSet <em>Character Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Character Set</em>'.
	 * @see Gtm.CharacterSet
	 * @generated
	 */
	EEnum getCharacterSet();

	/**
	 * Returns the meta object for enum '{@link Gtm.Clusters <em>Clusters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Clusters</em>'.
	 * @see Gtm.Clusters
	 * @generated
	 */
	EEnum getClusters();

	/**
	 * Returns the meta object for enum '{@link Gtm.CombinationModel <em>Combination Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Combination Model</em>'.
	 * @see Gtm.CombinationModel
	 * @generated
	 */
	EEnum getCombinationModel();

	/**
	 * Returns the meta object for enum '{@link Gtm.ControlDataExchangeTypes <em>Control Data Exchange Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Control Data Exchange Types</em>'.
	 * @see Gtm.ControlDataExchangeTypes
	 * @generated
	 */
	EEnum getControlDataExchangeTypes();

	/**
	 * Returns the meta object for enum '{@link Gtm.FareType <em>Fare Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fare Type</em>'.
	 * @see Gtm.FareType
	 * @generated
	 */
	EEnum getFareType();

	/**
	 * Returns the meta object for enum '{@link Gtm.FulfillmentType <em>Fulfillment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fulfillment Type</em>'.
	 * @see Gtm.FulfillmentType
	 * @generated
	 */
	EEnum getFulfillmentType();

	/**
	 * Returns the meta object for enum '{@link Gtm.GeoSystem <em>Geo System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Geo System</em>'.
	 * @see Gtm.GeoSystem
	 * @generated
	 */
	EEnum getGeoSystem();

	/**
	 * Returns the meta object for enum '{@link Gtm.GeoUnit <em>Geo Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Geo Unit</em>'.
	 * @see Gtm.GeoUnit
	 * @generated
	 */
	EEnum getGeoUnit();

	/**
	 * Returns the meta object for enum '{@link Gtm.GraphicalReservationType <em>Graphical Reservation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Graphical Reservation Type</em>'.
	 * @see Gtm.GraphicalReservationType
	 * @generated
	 */
	EEnum getGraphicalReservationType();

	/**
	 * Returns the meta object for enum '{@link Gtm.HemisphereEW <em>Hemisphere EW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hemisphere EW</em>'.
	 * @see Gtm.HemisphereEW
	 * @generated
	 */
	EEnum getHemisphereEW();

	/**
	 * Returns the meta object for enum '{@link Gtm.HemisphereNS <em>Hemisphere NS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hemisphere NS</em>'.
	 * @see Gtm.HemisphereNS
	 * @generated
	 */
	EEnum getHemisphereNS();

	/**
	 * Returns the meta object for enum '{@link Gtm.InterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Interface Type</em>'.
	 * @see Gtm.InterfaceType
	 * @generated
	 */
	EEnum getInterfaceType();

	/**
	 * Returns the meta object for enum '{@link Gtm.LegacyCalculationType <em>Legacy Calculation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Legacy Calculation Type</em>'.
	 * @see Gtm.LegacyCalculationType
	 * @generated
	 */
	EEnum getLegacyCalculationType();

	/**
	 * Returns the meta object for enum '{@link Gtm.LegacyPassengerType <em>Legacy Passenger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Legacy Passenger Type</em>'.
	 * @see Gtm.LegacyPassengerType
	 * @generated
	 */
	EEnum getLegacyPassengerType();

	/**
	 * Returns the meta object for enum '{@link Gtm.LegacySeriesType <em>Legacy Series Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Legacy Series Type</em>'.
	 * @see Gtm.LegacySeriesType
	 * @generated
	 */
	EEnum getLegacySeriesType();

	/**
	 * Returns the meta object for enum '{@link Gtm.OfferRequestType <em>Offer Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Offer Request Type</em>'.
	 * @see Gtm.OfferRequestType
	 * @generated
	 */
	EEnum getOfferRequestType();

	/**
	 * Returns the meta object for enum '{@link Gtm.OnlineServiceType <em>Online Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Online Service Type</em>'.
	 * @see Gtm.OnlineServiceType
	 * @generated
	 */
	EEnum getOnlineServiceType();

	/**
	 * Returns the meta object for enum '{@link Gtm.PersonalDataItemsType <em>Personal Data Items Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Personal Data Items Type</em>'.
	 * @see Gtm.PersonalDataItemsType
	 * @generated
	 */
	EEnum getPersonalDataItemsType();

	/**
	 * Returns the meta object for enum '{@link Gtm.PersonalDataTransferType <em>Personal Data Transfer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Personal Data Transfer Type</em>'.
	 * @see Gtm.PersonalDataTransferType
	 * @generated
	 */
	EEnum getPersonalDataTransferType();

	/**
	 * Returns the meta object for enum '{@link Gtm.PersonalDataChangeReason <em>Personal Data Change Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Personal Data Change Reason</em>'.
	 * @see Gtm.PersonalDataChangeReason
	 * @generated
	 */
	EEnum getPersonalDataChangeReason();

	/**
	 * Returns the meta object for enum '{@link Gtm.ReservationTravelClass <em>Reservation Travel Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reservation Travel Class</em>'.
	 * @see Gtm.ReservationTravelClass
	 * @generated
	 */
	EEnum getReservationTravelClass();

	/**
	 * Returns the meta object for enum '{@link Gtm.ReservationServiceLevel <em>Reservation Service Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reservation Service Level</em>'.
	 * @see Gtm.ReservationServiceLevel
	 * @generated
	 */
	EEnum getReservationServiceLevel();

	/**
	 * Returns the meta object for enum '{@link Gtm.ReservationService <em>Reservation Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reservation Service</em>'.
	 * @see Gtm.ReservationService
	 * @generated
	 */
	EEnum getReservationService();

	/**
	 * Returns the meta object for enum '{@link Gtm.ReservationBerthType <em>Reservation Berth Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reservation Berth Type</em>'.
	 * @see Gtm.ReservationBerthType
	 * @generated
	 */
	EEnum getReservationBerthType();

	/**
	 * Returns the meta object for enum '{@link Gtm.SchemaVersion <em>Schema Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Schema Version</em>'.
	 * @see Gtm.SchemaVersion
	 * @generated
	 */
	EEnum getSchemaVersion();

	/**
	 * Returns the meta object for enum '{@link Gtm.TimeZone <em>Time Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Zone</em>'.
	 * @see Gtm.TimeZone
	 * @generated
	 */
	EEnum getTimeZone();

	/**
	 * Returns the meta object for enum '{@link Gtm.TaxScope <em>Tax Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tax Scope</em>'.
	 * @see Gtm.TaxScope
	 * @generated
	 */
	EEnum getTaxScope();

	/**
	 * Returns the meta object for enum '{@link Gtm.TimeReferenceType <em>Time Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Reference Type</em>'.
	 * @see Gtm.TimeReferenceType
	 * @generated
	 */
	EEnum getTimeReferenceType();

	/**
	 * Returns the meta object for enum '{@link Gtm.TimeRangeScope <em>Time Range Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Range Scope</em>'.
	 * @see Gtm.TimeRangeScope
	 * @generated
	 */
	EEnum getTimeRangeScope();

	/**
	 * Returns the meta object for enum '{@link Gtm.TimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Unit</em>'.
	 * @see Gtm.TimeUnit
	 * @generated
	 */
	EEnum getTimeUnit();

	/**
	 * Returns the meta object for enum '{@link Gtm.TravelerType <em>Traveler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Traveler Type</em>'.
	 * @see Gtm.TravelerType
	 * @generated
	 */
	EEnum getTravelerType();

	/**
	 * Returns the meta object for enum '{@link Gtm.WeekDay <em>Week Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Week Day</em>'.
	 * @see Gtm.WeekDay
	 * @generated
	 */
	EEnum getWeekDay();

	/**
	 * Returns the meta object for enum '{@link Gtm.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Source</em>'.
	 * @see Gtm.DataSource
	 * @generated
	 */
	EEnum getDataSource();

	/**
	 * Returns the meta object for enum '{@link Gtm.ClassId <em>Class Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Class Id</em>'.
	 * @see Gtm.ClassId
	 * @generated
	 */
	EEnum getClassId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GtmFactory getGtmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Gtm.impl.GTMToolImpl <em>GTM Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.GTMToolImpl
		 * @see Gtm.impl.GtmPackageImpl#getGTMTool()
		 * @generated
		 */
		EClass GTM_TOOL = eINSTANCE.getGTMTool();

		/**
		 * The meta object literal for the '<em><b>Conversion From Legacy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GTM_TOOL__CONVERSION_FROM_LEGACY = eINSTANCE.getGTMTool_ConversionFromLegacy();

		/**
		 * The meta object literal for the '<em><b>Code Lists</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GTM_TOOL__CODE_LISTS = eINSTANCE.getGTMTool_CodeLists();

		/**
		 * The meta object literal for the '<em><b>General Tariff Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GTM_TOOL__GENERAL_TARIFF_MODEL = eINSTANCE.getGTMTool_GeneralTariffModel();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CodeListsImpl <em>Code Lists</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CodeListsImpl
		 * @see Gtm.impl.GtmPackageImpl#getCodeLists()
		 * @generated
		 */
		EClass CODE_LISTS = eINSTANCE.getCodeLists();

		/**
		 * The meta object literal for the '<em><b>Carriers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_LISTS__CARRIERS = eINSTANCE.getCodeLists_Carriers();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_LISTS__STATIONS = eINSTANCE.getCodeLists_Stations();

		/**
		 * The meta object literal for the '<em><b>Countries</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_LISTS__COUNTRIES = eINSTANCE.getCodeLists_Countries();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_LISTS__LANGUAGES = eINSTANCE.getCodeLists_Languages();

		/**
		 * The meta object literal for the '<em><b>Currencies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_LISTS__CURRENCIES = eINSTANCE.getCodeLists_Currencies();

		/**
		 * The meta object literal for the '<em><b>Service Brands</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_LISTS__SERVICE_BRANDS = eINSTANCE.getCodeLists_ServiceBrands();

		/**
		 * The meta object literal for the '<em><b>Nuts Codes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_LISTS__NUTS_CODES = eINSTANCE.getCodeLists_NutsCodes();

		/**
		 * The meta object literal for the '{@link Gtm.impl.NUTSCodesImpl <em>NUTS Codes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.NUTSCodesImpl
		 * @see Gtm.impl.GtmPackageImpl#getNUTSCodes()
		 * @generated
		 */
		EClass NUTS_CODES = eINSTANCE.getNUTSCodes();

		/**
		 * The meta object literal for the '<em><b>Nuts Codes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUTS_CODES__NUTS_CODES = eINSTANCE.getNUTSCodes_NutsCodes();

		/**
		 * The meta object literal for the '{@link Gtm.impl.NutsCodeImpl <em>Nuts Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.NutsCodeImpl
		 * @see Gtm.impl.GtmPackageImpl#getNutsCode()
		 * @generated
		 */
		EClass NUTS_CODE = eINSTANCE.getNutsCode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUTS_CODE__NAME = eINSTANCE.getNutsCode_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUTS_CODE__CODE = eINSTANCE.getNutsCode_Code();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ServiceBrandsImpl <em>Service Brands</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ServiceBrandsImpl
		 * @see Gtm.impl.GtmPackageImpl#getServiceBrands()
		 * @generated
		 */
		EClass SERVICE_BRANDS = eINSTANCE.getServiceBrands();

		/**
		 * The meta object literal for the '<em><b>Service Brands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_BRANDS__SERVICE_BRANDS = eINSTANCE.getServiceBrands_ServiceBrands();

		/**
		 * The meta object literal for the '<em><b>Find Service BRand</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_BRANDS___FIND_SERVICE_BRAND__INT = eINSTANCE.getServiceBrands__FindServiceBRand__int();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ServiceBrandImpl <em>Service Brand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ServiceBrandImpl
		 * @see Gtm.impl.GtmPackageImpl#getServiceBrand()
		 * @generated
		 */
		EClass SERVICE_BRAND = eINSTANCE.getServiceBrand();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_BRAND__CODE = eINSTANCE.getServiceBrand_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_BRAND__NAME = eINSTANCE.getServiceBrand_Name();

		/**
		 * The meta object literal for the '<em><b>Abbreviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_BRAND__ABBREVIATION = eINSTANCE.getServiceBrand_Abbreviation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_BRAND__DESCRIPTION = eINSTANCE.getServiceBrand_Description();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CountriesImpl <em>Countries</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CountriesImpl
		 * @see Gtm.impl.GtmPackageImpl#getCountries()
		 * @generated
		 */
		EClass COUNTRIES = eINSTANCE.getCountries();

		/**
		 * The meta object literal for the '<em><b>Countries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRIES__COUNTRIES = eINSTANCE.getCountries_Countries();

		/**
		 * The meta object literal for the '<em><b>Find Country</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COUNTRIES___FIND_COUNTRY__INT = eINSTANCE.getCountries__FindCountry__int();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CountryImpl <em>Country</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CountryImpl
		 * @see Gtm.impl.GtmPackageImpl#getCountry()
		 * @generated
		 */
		EClass COUNTRY = eINSTANCE.getCountry();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY__CODE = eINSTANCE.getCountry_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY__NAME = eINSTANCE.getCountry_Name();

		/**
		 * The meta object literal for the '<em><b>IS Ocode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY__IS_OCODE = eINSTANCE.getCountry_ISOcode();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LanguagesImpl <em>Languages</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LanguagesImpl
		 * @see Gtm.impl.GtmPackageImpl#getLanguages()
		 * @generated
		 */
		EClass LANGUAGES = eINSTANCE.getLanguages();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGES__LANGUAGES = eINSTANCE.getLanguages_Languages();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LanguageImpl <em>Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LanguageImpl
		 * @see Gtm.impl.GtmPackageImpl#getLanguage()
		 * @generated
		 */
		EClass LANGUAGE = eINSTANCE.getLanguage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__NAME = eINSTANCE.getLanguage_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__CODE = eINSTANCE.getLanguage_Code();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CurrenciesImpl <em>Currencies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CurrenciesImpl
		 * @see Gtm.impl.GtmPackageImpl#getCurrencies()
		 * @generated
		 */
		EClass CURRENCIES = eINSTANCE.getCurrencies();

		/**
		 * The meta object literal for the '<em><b>Currencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENCIES__CURRENCIES = eINSTANCE.getCurrencies_Currencies();

		/**
		 * The meta object literal for the '<em><b>Find Currency</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CURRENCIES___FIND_CURRENCY__STRING = eINSTANCE.getCurrencies__FindCurrency__String();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CurrencyImpl <em>Currency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CurrencyImpl
		 * @see Gtm.impl.GtmPackageImpl#getCurrency()
		 * @generated
		 */
		EClass CURRENCY = eINSTANCE.getCurrency();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY__NAME = eINSTANCE.getCurrency_Name();

		/**
		 * The meta object literal for the '<em><b>Iso Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY__ISO_CODE = eINSTANCE.getCurrency_IsoCode();

		/**
		 * The meta object literal for the '{@link Gtm.impl.StationsImpl <em>Stations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.StationsImpl
		 * @see Gtm.impl.GtmPackageImpl#getStations()
		 * @generated
		 */
		EClass STATIONS = eINSTANCE.getStations();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIONS__STATIONS = eINSTANCE.getStations_Stations();

		/**
		 * The meta object literal for the '<em><b>Find Station</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATIONS___FIND_STATION__INT_INT = eINSTANCE.getStations__FindStation__int_int();

		/**
		 * The meta object literal for the '<em><b>Find Station</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATIONS___FIND_STATION__INT_STRING = eINSTANCE.getStations__FindStation__int_String();

		/**
		 * The meta object literal for the '{@link Gtm.impl.StationImpl <em>Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.StationImpl
		 * @see Gtm.impl.GtmPackageImpl#getStation()
		 * @generated
		 */
		EClass STATION = eINSTANCE.getStation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__NAME = eINSTANCE.getStation_Name();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION__COUNTRY = eINSTANCE.getStation_Country();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__CODE = eINSTANCE.getStation_Code();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__LONGITUDE = eINSTANCE.getStation_Longitude();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__LATITUDE = eINSTANCE.getStation_Latitude();

		/**
		 * The meta object literal for the '<em><b>Timetable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__TIMETABLE_NAME = eINSTANCE.getStation_TimetableName();

		/**
		 * The meta object literal for the '<em><b>Border Station</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__BORDER_STATION = eINSTANCE.getStation_BorderStation();

		/**
		 * The meta object literal for the '<em><b>Name Case UTF8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__NAME_CASE_UTF8 = eINSTANCE.getStation_NameCaseUTF8();

		/**
		 * The meta object literal for the '<em><b>Name Case ASCII</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__NAME_CASE_ASCII = eINSTANCE.getStation_NameCaseASCII();

		/**
		 * The meta object literal for the '<em><b>Short Name Case ASCII</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__SHORT_NAME_CASE_ASCII = eINSTANCE.getStation_ShortNameCaseASCII();

		/**
		 * The meta object literal for the '<em><b>Short Name Case UTF8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__SHORT_NAME_CASE_UTF8 = eINSTANCE.getStation_ShortNameCaseUTF8();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CarrierImpl <em>Carrier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CarrierImpl
		 * @see Gtm.impl.GtmPackageImpl#getCarrier()
		 * @generated
		 */
		EClass CARRIER = eINSTANCE.getCarrier();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER__CODE = eINSTANCE.getCarrier_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER__NAME = eINSTANCE.getCarrier_Name();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER__SHORT_NAME = eINSTANCE.getCarrier_ShortName();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CarriersImpl <em>Carriers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CarriersImpl
		 * @see Gtm.impl.GtmPackageImpl#getCarriers()
		 * @generated
		 */
		EClass CARRIERS = eINSTANCE.getCarriers();

		/**
		 * The meta object literal for the '<em><b>Carriers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIERS__CARRIERS = eINSTANCE.getCarriers_Carriers();

		/**
		 * The meta object literal for the '<em><b>Find Carrier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARRIERS___FIND_CARRIER__STRING = eINSTANCE.getCarriers__FindCarrier__String();

		/**
		 * The meta object literal for the '{@link Gtm.impl.StationSetImpl <em>Station Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.StationSetImpl
		 * @see Gtm.impl.GtmPackageImpl#getStationSet()
		 * @generated
		 */
		EClass STATION_SET = eINSTANCE.getStationSet();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION_SET__STATIONS = eINSTANCE.getStationSet_Stations();

		/**
		 * The meta object literal for the '{@link Gtm.impl.GeneralTariffModelImpl <em>General Tariff Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.GeneralTariffModelImpl
		 * @see Gtm.impl.GtmPackageImpl#getGeneralTariffModel()
		 * @generated
		 */
		EClass GENERAL_TARIFF_MODEL = eINSTANCE.getGeneralTariffModel();

		/**
		 * The meta object literal for the '<em><b>Delivery</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERAL_TARIFF_MODEL__DELIVERY = eINSTANCE.getGeneralTariffModel_Delivery();

		/**
		 * The meta object literal for the '<em><b>Fare Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERAL_TARIFF_MODEL__FARE_STRUCTURE = eINSTANCE.getGeneralTariffModel_FareStructure();

		/**
		 * The meta object literal for the '{@link Gtm.impl.DeliveryImpl <em>Delivery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.DeliveryImpl
		 * @see Gtm.impl.GtmPackageImpl#getDelivery()
		 * @generated
		 */
		EClass DELIVERY = eINSTANCE.getDelivery();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY__ID = eINSTANCE.getDelivery_Id();

		/**
		 * The meta object literal for the '<em><b>Previous Delivery Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY__PREVIOUS_DELIVERY_ID = eINSTANCE.getDelivery_PreviousDeliveryId();

		/**
		 * The meta object literal for the '<em><b>Replaced Delivery Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY__REPLACED_DELIVERY_ID = eINSTANCE.getDelivery_ReplacedDeliveryId();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY__OPTIONAL = eINSTANCE.getDelivery_Optional();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELIVERY__PROVIDER = eINSTANCE.getDelivery_Provider();

		/**
		 * The meta object literal for the '<em><b>Schema Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY__SCHEMA_VERSION = eINSTANCE.getDelivery_SchemaVersion();

		/**
		 * The meta object literal for the '<em><b>Accepted Schema Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY__ACCEPTED_SCHEMA_VERSION = eINSTANCE.getDelivery_AcceptedSchemaVersion();

		/**
		 * The meta object literal for the '{@link Gtm.impl.AfterSalesRulesImpl <em>After Sales Rules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.AfterSalesRulesImpl
		 * @see Gtm.impl.GtmPackageImpl#getAfterSalesRules()
		 * @generated
		 */
		EClass AFTER_SALES_RULES = eINSTANCE.getAfterSalesRules();

		/**
		 * The meta object literal for the '<em><b>After Sales Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFTER_SALES_RULES__AFTER_SALES_RULES = eINSTANCE.getAfterSalesRules_AfterSalesRules();

		/**
		 * The meta object literal for the '{@link Gtm.impl.AfterSalesRuleImpl <em>After Sales Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.AfterSalesRuleImpl
		 * @see Gtm.impl.GtmPackageImpl#getAfterSalesRule()
		 * @generated
		 */
		EClass AFTER_SALES_RULE = eINSTANCE.getAfterSalesRule();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFTER_SALES_RULE__ID = eINSTANCE.getAfterSalesRule_Id();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFTER_SALES_RULE__CONDITIONS = eINSTANCE.getAfterSalesRule_Conditions();

		/**
		 * The meta object literal for the '{@link Gtm.impl.AfterSalesConditionImpl <em>After Sales Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.AfterSalesConditionImpl
		 * @see Gtm.impl.GtmPackageImpl#getAfterSalesCondition()
		 * @generated
		 */
		EClass AFTER_SALES_CONDITION = eINSTANCE.getAfterSalesCondition();

		/**
		 * The meta object literal for the '<em><b>Transaction Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFTER_SALES_CONDITION__TRANSACTION_TYPE = eINSTANCE.getAfterSalesCondition_TransactionType();

		/**
		 * The meta object literal for the '<em><b>Individual Contracts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFTER_SALES_CONDITION__INDIVIDUAL_CONTRACTS = eINSTANCE.getAfterSalesCondition_IndividualContracts();

		/**
		 * The meta object literal for the '<em><b>Carrier Fee</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFTER_SALES_CONDITION__CARRIER_FEE = eINSTANCE.getAfterSalesCondition_CarrierFee();

		/**
		 * The meta object literal for the '<em><b>Fee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFTER_SALES_CONDITION__FEE = eINSTANCE.getAfterSalesCondition_Fee();

		/**
		 * The meta object literal for the '<em><b>Application Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFTER_SALES_CONDITION__APPLICATION_TIME = eINSTANCE.getAfterSalesCondition_ApplicationTime();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ApplicationTimeImpl <em>Application Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ApplicationTimeImpl
		 * @see Gtm.impl.GtmPackageImpl#getApplicationTime()
		 * @generated
		 */
		EClass APPLICATION_TIME = eINSTANCE.getApplicationTime();

		/**
		 * The meta object literal for the '{@link Gtm.impl.FareStructureImpl <em>Fare Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.FareStructureImpl
		 * @see Gtm.impl.GtmPackageImpl#getFareStructure()
		 * @generated
		 */
		EClass FARE_STRUCTURE = eINSTANCE.getFareStructure();

		/**
		 * The meta object literal for the '<em><b>Service Class Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__SERVICE_CLASS_DEFINITIONS = eINSTANCE.getFareStructure_ServiceClassDefinitions();

		/**
		 * The meta object literal for the '<em><b>Service Level Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__SERVICE_LEVEL_DEFINITIONS = eINSTANCE.getFareStructure_ServiceLevelDefinitions();

		/**
		 * The meta object literal for the '<em><b>Station Names</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__STATION_NAMES = eINSTANCE.getFareStructure_StationNames();

		/**
		 * The meta object literal for the '<em><b>Fare Station Set Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__FARE_STATION_SET_DEFINITIONS = eINSTANCE.getFareStructure_FareStationSetDefinitions();

		/**
		 * The meta object literal for the '<em><b>Calendars</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__CALENDARS = eINSTANCE.getFareStructure_Calendars();

		/**
		 * The meta object literal for the '<em><b>Texts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__TEXTS = eINSTANCE.getFareStructure_Texts();

		/**
		 * The meta object literal for the '<em><b>Reduction Cards</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__REDUCTION_CARDS = eINSTANCE.getFareStructure_ReductionCards();

		/**
		 * The meta object literal for the '<em><b>Fare Elements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__FARE_ELEMENTS = eINSTANCE.getFareStructure_FareElements();

		/**
		 * The meta object literal for the '<em><b>Combination Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__COMBINATION_CONSTRAINTS = eINSTANCE.getFareStructure_CombinationConstraints();

		/**
		 * The meta object literal for the '<em><b>Sales Availability Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__SALES_AVAILABILITY_CONSTRAINTS = eINSTANCE.getFareStructure_SalesAvailabilityConstraints();

		/**
		 * The meta object literal for the '<em><b>Travel Validity Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__TRAVEL_VALIDITY_CONSTRAINTS = eINSTANCE.getFareStructure_TravelValidityConstraints();

		/**
		 * The meta object literal for the '<em><b>Regional Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__REGIONAL_CONSTRAINTS = eINSTANCE.getFareStructure_RegionalConstraints();

		/**
		 * The meta object literal for the '<em><b>Connection Points</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__CONNECTION_POINTS = eINSTANCE.getFareStructure_ConnectionPoints();

		/**
		 * The meta object literal for the '<em><b>Carrier Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__CARRIER_CONSTRAINTS = eINSTANCE.getFareStructure_CarrierConstraints();

		/**
		 * The meta object literal for the '<em><b>Service Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__SERVICE_CONSTRAINTS = eINSTANCE.getFareStructure_ServiceConstraints();

		/**
		 * The meta object literal for the '<em><b>Passenger Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__PASSENGER_CONSTRAINTS = eINSTANCE.getFareStructure_PassengerConstraints();

		/**
		 * The meta object literal for the '<em><b>Reduction Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__REDUCTION_CONSTRAINTS = eINSTANCE.getFareStructure_ReductionConstraints();

		/**
		 * The meta object literal for the '<em><b>Personal Data Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__PERSONAL_DATA_CONSTRAINTS = eINSTANCE.getFareStructure_PersonalDataConstraints();

		/**
		 * The meta object literal for the '<em><b>After Sales Rules</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__AFTER_SALES_RULES = eINSTANCE.getFareStructure_AfterSalesRules();

		/**
		 * The meta object literal for the '<em><b>Prices</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__PRICES = eINSTANCE.getFareStructure_Prices();

		/**
		 * The meta object literal for the '<em><b>Fulfillment Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__FULFILLMENT_CONSTRAINTS = eINSTANCE.getFareStructure_FulfillmentConstraints();

		/**
		 * The meta object literal for the '<em><b>Reservation Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__RESERVATION_PARAMETERS = eINSTANCE.getFareStructure_ReservationParameters();

		/**
		 * The meta object literal for the '<em><b>Supported Online Services</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__SUPPORTED_ONLINE_SERVICES = eINSTANCE.getFareStructure_SupportedOnlineServices();

		/**
		 * The meta object literal for the '<em><b>Fare Resource Locations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__FARE_RESOURCE_LOCATIONS = eINSTANCE.getFareStructure_FareResourceLocations();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ConnectionPointsImpl <em>Connection Points</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ConnectionPointsImpl
		 * @see Gtm.impl.GtmPackageImpl#getConnectionPoints()
		 * @generated
		 */
		EClass CONNECTION_POINTS = eINSTANCE.getConnectionPoints();

		/**
		 * The meta object literal for the '<em><b>Connection Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_POINTS__CONNECTION_POINTS = eINSTANCE.getConnectionPoints_ConnectionPoints();

		/**
		 * The meta object literal for the '<em><b>Find Simple Connection Point</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONNECTION_POINTS___FIND_SIMPLE_CONNECTION_POINT__STATION = eINSTANCE.getConnectionPoints__FindSimpleConnectionPoint__Station();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ConnectionPointImpl <em>Connection Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ConnectionPointImpl
		 * @see Gtm.impl.GtmPackageImpl#getConnectionPoint()
		 * @generated
		 */
		EClass CONNECTION_POINT = eINSTANCE.getConnectionPoint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POINT__ID = eINSTANCE.getConnectionPoint_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POINT__NAME = eINSTANCE.getConnectionPoint_Name();

		/**
		 * The meta object literal for the '<em><b>Legacy Border Point Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POINT__LEGACY_BORDER_POINT_CODE = eINSTANCE.getConnectionPoint_LegacyBorderPointCode();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POINT__DESCRIPTION = eINSTANCE.getConnectionPoint_Description();

		/**
		 * The meta object literal for the '<em><b>Connected Station Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_POINT__CONNECTED_STATION_SETS = eINSTANCE.getConnectionPoint_ConnectedStationSets();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POINT__DATA_SOURCE = eINSTANCE.getConnectionPoint_DataSource();

		/**
		 * The meta object literal for the '<em><b>Name Utf8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POINT__NAME_UTF8 = eINSTANCE.getConnectionPoint_NameUtf8();

		/**
		 * The meta object literal for the '{@link Gtm.impl.FareResourceLocationsImpl <em>Fare Resource Locations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.FareResourceLocationsImpl
		 * @see Gtm.impl.GtmPackageImpl#getFareResourceLocations()
		 * @generated
		 */
		EClass FARE_RESOURCE_LOCATIONS = eINSTANCE.getFareResourceLocations();

		/**
		 * The meta object literal for the '<em><b>Train Resource Locations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_RESOURCE_LOCATIONS__TRAIN_RESOURCE_LOCATIONS = eINSTANCE.getFareResourceLocations_TrainResourceLocations();

		/**
		 * The meta object literal for the '<em><b>Station Resource Locations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_RESOURCE_LOCATIONS__STATION_RESOURCE_LOCATIONS = eINSTANCE.getFareResourceLocations_StationResourceLocations();

		/**
		 * The meta object literal for the '<em><b>Carrier Resource Locations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_RESOURCE_LOCATIONS__CARRIER_RESOURCE_LOCATIONS = eINSTANCE.getFareResourceLocations_CarrierResourceLocations();

		/**
		 * The meta object literal for the '{@link Gtm.impl.TrainResourceLocationsImpl <em>Train Resource Locations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.TrainResourceLocationsImpl
		 * @see Gtm.impl.GtmPackageImpl#getTrainResourceLocations()
		 * @generated
		 */
		EClass TRAIN_RESOURCE_LOCATIONS = eINSTANCE.getTrainResourceLocations();

		/**
		 * The meta object literal for the '<em><b>Train Resource Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_RESOURCE_LOCATIONS__TRAIN_RESOURCE_LOCATIONS = eINSTANCE.getTrainResourceLocations_TrainResourceLocations();

		/**
		 * The meta object literal for the '{@link Gtm.impl.StationResourceLocationsImpl <em>Station Resource Locations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.StationResourceLocationsImpl
		 * @see Gtm.impl.GtmPackageImpl#getStationResourceLocations()
		 * @generated
		 */
		EClass STATION_RESOURCE_LOCATIONS = eINSTANCE.getStationResourceLocations();

		/**
		 * The meta object literal for the '<em><b>Station Resource Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION_RESOURCE_LOCATIONS__STATION_RESOURCE_LOCATIONS = eINSTANCE.getStationResourceLocations_StationResourceLocations();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CarrierResourceLocationsImpl <em>Carrier Resource Locations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CarrierResourceLocationsImpl
		 * @see Gtm.impl.GtmPackageImpl#getCarrierResourceLocations()
		 * @generated
		 */
		EClass CARRIER_RESOURCE_LOCATIONS = eINSTANCE.getCarrierResourceLocations();

		/**
		 * The meta object literal for the '<em><b>Carrier Resource Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_RESOURCE_LOCATIONS__CARRIER_RESOURCE_LOCATIONS = eINSTANCE.getCarrierResourceLocations_CarrierResourceLocations();

		/**
		 * The meta object literal for the '{@link Gtm.impl.TrainResourceLocationImpl <em>Train Resource Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.TrainResourceLocationImpl
		 * @see Gtm.impl.GtmPackageImpl#getTrainResourceLocation()
		 * @generated
		 */
		EClass TRAIN_RESOURCE_LOCATION = eINSTANCE.getTrainResourceLocation();

		/**
		 * The meta object literal for the '<em><b>Carrier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_RESOURCE_LOCATION__CARRIER = eINSTANCE.getTrainResourceLocation_Carrier();

		/**
		 * The meta object literal for the '<em><b>Online Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_RESOURCE_LOCATION__ONLINE_RESOURCES = eINSTANCE.getTrainResourceLocation_OnlineResources();

		/**
		 * The meta object literal for the '<em><b>Train Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_RESOURCE_LOCATION__TRAIN_ID = eINSTANCE.getTrainResourceLocation_TrainId();

		/**
		 * The meta object literal for the '{@link Gtm.impl.StationResourceLocationImpl <em>Station Resource Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.StationResourceLocationImpl
		 * @see Gtm.impl.GtmPackageImpl#getStationResourceLocation()
		 * @generated
		 */
		EClass STATION_RESOURCE_LOCATION = eINSTANCE.getStationResourceLocation();

		/**
		 * The meta object literal for the '<em><b>Online Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION_RESOURCE_LOCATION__ONLINE_RESOURCES = eINSTANCE.getStationResourceLocation_OnlineResources();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION_RESOURCE_LOCATION__STATIONS = eINSTANCE.getStationResourceLocation_Stations();

		/**
		 * The meta object literal for the '<em><b>Connection Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION_RESOURCE_LOCATION__CONNECTION_POINTS = eINSTANCE.getStationResourceLocation_ConnectionPoints();

		/**
		 * The meta object literal for the '{@link Gtm.impl.OnlineResourceImpl <em>Online Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.OnlineResourceImpl
		 * @see Gtm.impl.GtmPackageImpl#getOnlineResource()
		 * @generated
		 */
		EClass ONLINE_RESOURCE = eINSTANCE.getOnlineResource();

		/**
		 * The meta object literal for the '<em><b>Offer Request Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONLINE_RESOURCE__OFFER_REQUEST_TYPE = eINSTANCE.getOnlineResource_OfferRequestType();

		/**
		 * The meta object literal for the '<em><b>Interface Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONLINE_RESOURCE__INTERFACE_TYPE = eINSTANCE.getOnlineResource_InterfaceType();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONLINE_RESOURCE__VERSION = eINSTANCE.getOnlineResource_Version();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONLINE_RESOURCE__SYSTEM = eINSTANCE.getOnlineResource_System();

		/**
		 * The meta object literal for the '{@link Gtm.impl.FulfillmentConstraintsImpl <em>Fulfillment Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.FulfillmentConstraintsImpl
		 * @see Gtm.impl.GtmPackageImpl#getFulfillmentConstraints()
		 * @generated
		 */
		EClass FULFILLMENT_CONSTRAINTS = eINSTANCE.getFulfillmentConstraints();

		/**
		 * The meta object literal for the '<em><b>Fulfillment Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FULFILLMENT_CONSTRAINTS__FULFILLMENT_CONSTRAINTS = eINSTANCE.getFulfillmentConstraints_FulfillmentConstraints();

		/**
		 * The meta object literal for the '{@link Gtm.impl.FulfillmentConstraintImpl <em>Fulfillment Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.FulfillmentConstraintImpl
		 * @see Gtm.impl.GtmPackageImpl#getFulfillmentConstraint()
		 * @generated
		 */
		EClass FULFILLMENT_CONSTRAINT = eINSTANCE.getFulfillmentConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FULFILLMENT_CONSTRAINT__ID = eINSTANCE.getFulfillmentConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Accepted Fulfilment Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FULFILLMENT_CONSTRAINT__ACCEPTED_FULFILMENT_TYPES = eINSTANCE.getFulfillmentConstraint_AcceptedFulfilmentTypes();

		/**
		 * The meta object literal for the '<em><b>Required Control Data Exchange</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FULFILLMENT_CONSTRAINT__REQUIRED_CONTROL_DATA_EXCHANGE = eINSTANCE.getFulfillmentConstraint_RequiredControlDataExchange();

		/**
		 * The meta object literal for the '<em><b>Individual Ticketing Permitted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FULFILLMENT_CONSTRAINT__INDIVIDUAL_TICKETING_PERMITTED = eINSTANCE.getFulfillmentConstraint_IndividualTicketingPermitted();

		/**
		 * The meta object literal for the '<em><b>Accepted Barcodes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODES = eINSTANCE.getFulfillmentConstraint_AcceptedBarcodes();

		/**
		 * The meta object literal for the '<em><b>Required Barcodes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FULFILLMENT_CONSTRAINT__REQUIRED_BARCODES = eINSTANCE.getFulfillmentConstraint_RequiredBarcodes();

		/**
		 * The meta object literal for the '{@link Gtm.impl.RequiredBarcodesImpl <em>Required Barcodes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.RequiredBarcodesImpl
		 * @see Gtm.impl.GtmPackageImpl#getRequiredBarcodes()
		 * @generated
		 */
		EClass REQUIRED_BARCODES = eINSTANCE.getRequiredBarcodes();

		/**
		 * The meta object literal for the '<em><b>Required Barcodes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_BARCODES__REQUIRED_BARCODES = eINSTANCE.getRequiredBarcodes_RequiredBarcodes();

		/**
		 * The meta object literal for the '{@link Gtm.impl.AcceptedBarcodesImpl <em>Accepted Barcodes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.AcceptedBarcodesImpl
		 * @see Gtm.impl.GtmPackageImpl#getAcceptedBarcodes()
		 * @generated
		 */
		EClass ACCEPTED_BARCODES = eINSTANCE.getAcceptedBarcodes();

		/**
		 * The meta object literal for the '<em><b>Accepted Barcodes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCEPTED_BARCODES__ACCEPTED_BARCODES = eINSTANCE.getAcceptedBarcodes_AcceptedBarcodes();

		/**
		 * The meta object literal for the '{@link Gtm.impl.SupportedOnlineServicesImpl <em>Supported Online Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.SupportedOnlineServicesImpl
		 * @see Gtm.impl.GtmPackageImpl#getSupportedOnlineServices()
		 * @generated
		 */
		EClass SUPPORTED_ONLINE_SERVICES = eINSTANCE.getSupportedOnlineServices();

		/**
		 * The meta object literal for the '<em><b>Supported Online Services</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPORTED_ONLINE_SERVICES__SUPPORTED_ONLINE_SERVICES = eINSTANCE.getSupportedOnlineServices_SupportedOnlineServices();

		/**
		 * The meta object literal for the '{@link Gtm.impl.StationNamesImpl <em>Station Names</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.StationNamesImpl
		 * @see Gtm.impl.GtmPackageImpl#getStationNames()
		 * @generated
		 */
		EClass STATION_NAMES = eINSTANCE.getStationNames();

		/**
		 * The meta object literal for the '<em><b>Station Name</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION_NAMES__STATION_NAME = eINSTANCE.getStationNames_StationName();

		/**
		 * The meta object literal for the '{@link Gtm.impl.FareElementImpl <em>Fare Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.FareElementImpl
		 * @see Gtm.impl.GtmPackageImpl#getFareElement()
		 * @generated
		 */
		EClass FARE_ELEMENT = eINSTANCE.getFareElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_ELEMENT__ID = eINSTANCE.getFareElement_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_ELEMENT__TYPE = eINSTANCE.getFareElement_Type();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_ELEMENT__DATA_DESCRIPTION = eINSTANCE.getFareElement_DataDescription();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__TEXT = eINSTANCE.getFareElement_Text();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__PRICE = eINSTANCE.getFareElement_Price();

		/**
		 * The meta object literal for the '<em><b>Regional Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__REGIONAL_CONSTRAINT = eINSTANCE.getFareElement_RegionalConstraint();

		/**
		 * The meta object literal for the '<em><b>Service Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__SERVICE_CONSTRAINT = eINSTANCE.getFareElement_ServiceConstraint();

		/**
		 * The meta object literal for the '<em><b>Carrier Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__CARRIER_CONSTRAINT = eINSTANCE.getFareElement_CarrierConstraint();

		/**
		 * The meta object literal for the '<em><b>Service Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__SERVICE_CLASS = eINSTANCE.getFareElement_ServiceClass();

		/**
		 * The meta object literal for the '<em><b>Service Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__SERVICE_LEVEL = eINSTANCE.getFareElement_ServiceLevel();

		/**
		 * The meta object literal for the '<em><b>Sales Availability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__SALES_AVAILABILITY = eINSTANCE.getFareElement_SalesAvailability();

		/**
		 * The meta object literal for the '<em><b>Travel Validity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__TRAVEL_VALIDITY = eINSTANCE.getFareElement_TravelValidity();

		/**
		 * The meta object literal for the '<em><b>Combination Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__COMBINATION_CONSTRAINT = eINSTANCE.getFareElement_CombinationConstraint();

		/**
		 * The meta object literal for the '<em><b>Fare Detail Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__FARE_DETAIL_DESCRIPTION = eINSTANCE.getFareElement_FareDetailDescription();

		/**
		 * The meta object literal for the '<em><b>Personal Data Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__PERSONAL_DATA_CONSTRAINT = eINSTANCE.getFareElement_PersonalDataConstraint();

		/**
		 * The meta object literal for the '<em><b>Reservation Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__RESERVATION_PARAMETER = eINSTANCE.getFareElement_ReservationParameter();

		/**
		 * The meta object literal for the '<em><b>Reduction Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__REDUCTION_CONSTRAINT = eINSTANCE.getFareElement_ReductionConstraint();

		/**
		 * The meta object literal for the '<em><b>Fulfillment Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__FULFILLMENT_CONSTRAINT = eINSTANCE.getFareElement_FulfillmentConstraint();

		/**
		 * The meta object literal for the '<em><b>Passenger Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__PASSENGER_CONSTRAINT = eINSTANCE.getFareElement_PassengerConstraint();

		/**
		 * The meta object literal for the '<em><b>After Sales Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__AFTER_SALES_RULE = eINSTANCE.getFareElement_AfterSalesRule();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_ELEMENT__DATA_SOURCE = eINSTANCE.getFareElement_DataSource();

		/**
		 * The meta object literal for the '<em><b>Legacy Accounting Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__LEGACY_ACCOUNTING_IDENTIFIER = eINSTANCE.getFareElement_LegacyAccountingIdentifier();

		/**
		 * The meta object literal for the '{@link Gtm.impl.FareStationSetDefinitionsImpl <em>Fare Station Set Definitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.FareStationSetDefinitionsImpl
		 * @see Gtm.impl.GtmPackageImpl#getFareStationSetDefinitions()
		 * @generated
		 */
		EClass FARE_STATION_SET_DEFINITIONS = eINSTANCE.getFareStationSetDefinitions();

		/**
		 * The meta object literal for the '<em><b>Fare Station Set Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STATION_SET_DEFINITIONS__FARE_STATION_SET_DEFINITIONS = eINSTANCE.getFareStationSetDefinitions_FareStationSetDefinitions();

		/**
		 * The meta object literal for the '<em><b>Find Fare Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FARE_STATION_SET_DEFINITIONS___FIND_FARE_SET__CARRIER_INT = eINSTANCE.getFareStationSetDefinitions__FindFareSet__Carrier_int();

		/**
		 * The meta object literal for the '{@link Gtm.impl.FareStationSetDefinitionImpl <em>Fare Station Set Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.FareStationSetDefinitionImpl
		 * @see Gtm.impl.GtmPackageImpl#getFareStationSetDefinition()
		 * @generated
		 */
		EClass FARE_STATION_SET_DEFINITION = eINSTANCE.getFareStationSetDefinition();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_STATION_SET_DEFINITION__DATA_SOURCE = eINSTANCE.getFareStationSetDefinition_DataSource();

		/**
		 * The meta object literal for the '<em><b>Carrier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STATION_SET_DEFINITION__CARRIER = eINSTANCE.getFareStationSetDefinition_Carrier();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_STATION_SET_DEFINITION__CODE = eINSTANCE.getFareStationSetDefinition_Code();

		/**
		 * The meta object literal for the '<em><b>Legacy Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_STATION_SET_DEFINITION__LEGACY_CODE = eINSTANCE.getFareStationSetDefinition_LegacyCode();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_STATION_SET_DEFINITION__ID = eINSTANCE.getFareStationSetDefinition_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_STATION_SET_DEFINITION__NAME = eINSTANCE.getFareStationSetDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Name Utf8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_STATION_SET_DEFINITION__NAME_UTF8 = eINSTANCE.getFareStationSetDefinition_NameUtf8();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STATION_SET_DEFINITION__STATIONS = eINSTANCE.getFareStationSetDefinition_Stations();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyAccountingIdentifierImpl <em>Legacy Accounting Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyAccountingIdentifierImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyAccountingIdentifier()
		 * @generated
		 */
		EClass LEGACY_ACCOUNTING_IDENTIFIER = eINSTANCE.getLegacyAccountingIdentifier();

		/**
		 * The meta object literal for the '<em><b>Series Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_ACCOUNTING_IDENTIFIER__SERIES_ID = eINSTANCE.getLegacyAccountingIdentifier_SeriesId();

		/**
		 * The meta object literal for the '<em><b>Tariff Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_ACCOUNTING_IDENTIFIER__TARIFF_ID = eINSTANCE.getLegacyAccountingIdentifier_TariffId();

		/**
		 * The meta object literal for the '<em><b>Add Series Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_ACCOUNTING_IDENTIFIER__ADD_SERIES_ID = eINSTANCE.getLegacyAccountingIdentifier_AddSeriesId();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ReductionConstraintsImpl <em>Reduction Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ReductionConstraintsImpl
		 * @see Gtm.impl.GtmPackageImpl#getReductionConstraints()
		 * @generated
		 */
		EClass REDUCTION_CONSTRAINTS = eINSTANCE.getReductionConstraints();

		/**
		 * The meta object literal for the '<em><b>Reduction Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCTION_CONSTRAINTS__REDUCTION_CONSTRAINTS = eINSTANCE.getReductionConstraints_ReductionConstraints();

		/**
		 * The meta object literal for the '{@link Gtm.impl.FareElementsImpl <em>Fare Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.FareElementsImpl
		 * @see Gtm.impl.GtmPackageImpl#getFareElements()
		 * @generated
		 */
		EClass FARE_ELEMENTS = eINSTANCE.getFareElements();

		/**
		 * The meta object literal for the '<em><b>Fare Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENTS__FARE_ELEMENTS = eINSTANCE.getFareElements_FareElements();

		/**
		 * The meta object literal for the '{@link Gtm.impl.PersonalDataConstraintsImpl <em>Personal Data Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.PersonalDataConstraintsImpl
		 * @see Gtm.impl.GtmPackageImpl#getPersonalDataConstraints()
		 * @generated
		 */
		EClass PERSONAL_DATA_CONSTRAINTS = eINSTANCE.getPersonalDataConstraints();

		/**
		 * The meta object literal for the '<em><b>Personal Data Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONAL_DATA_CONSTRAINTS__PERSONAL_DATA_CONSTRAINTS = eINSTANCE.getPersonalDataConstraints_PersonalDataConstraints();

		/**
		 * The meta object literal for the '{@link Gtm.impl.PersonalDataConstraintImpl <em>Personal Data Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.PersonalDataConstraintImpl
		 * @see Gtm.impl.GtmPackageImpl#getPersonalDataConstraint()
		 * @generated
		 */
		EClass PERSONAL_DATA_CONSTRAINT = eINSTANCE.getPersonalDataConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_DATA_CONSTRAINT__ID = eINSTANCE.getPersonalDataConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Required Personal Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONAL_DATA_CONSTRAINT__REQUIRED_PERSONAL_DATA = eINSTANCE.getPersonalDataConstraint_RequiredPersonalData();

		/**
		 * The meta object literal for the '<em><b>Allowed Changes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONAL_DATA_CONSTRAINT__ALLOWED_CHANGES = eINSTANCE.getPersonalDataConstraint_AllowedChanges();

		/**
		 * The meta object literal for the '{@link Gtm.impl.RequiredPersonalDataImpl <em>Required Personal Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.RequiredPersonalDataImpl
		 * @see Gtm.impl.GtmPackageImpl#getRequiredPersonalData()
		 * @generated
		 */
		EClass REQUIRED_PERSONAL_DATA = eINSTANCE.getRequiredPersonalData();

		/**
		 * The meta object literal for the '<em><b>Ticket Holder Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_PERSONAL_DATA__TICKET_HOLDER_ONLY = eINSTANCE.getRequiredPersonalData_TicketHolderOnly();

		/**
		 * The meta object literal for the '<em><b>Data Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_PERSONAL_DATA__DATA_ITEM = eINSTANCE.getRequiredPersonalData_DataItem();

		/**
		 * The meta object literal for the '<em><b>Transfer</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_PERSONAL_DATA__TRANSFER = eINSTANCE.getRequiredPersonalData_Transfer();

		/**
		 * The meta object literal for the '<em><b>Fulfillment Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_PERSONAL_DATA__FULFILLMENT_TYPE = eINSTANCE.getRequiredPersonalData_FulfillmentType();

		/**
		 * The meta object literal for the '<em><b>Cross Border</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_PERSONAL_DATA__CROSS_BORDER = eINSTANCE.getRequiredPersonalData_CrossBorder();

		/**
		 * The meta object literal for the '{@link Gtm.impl.AllowedPersonalDataChangesImpl <em>Allowed Personal Data Changes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.AllowedPersonalDataChangesImpl
		 * @see Gtm.impl.GtmPackageImpl#getAllowedPersonalDataChanges()
		 * @generated
		 */
		EClass ALLOWED_PERSONAL_DATA_CHANGES = eINSTANCE.getAllowedPersonalDataChanges();

		/**
		 * The meta object literal for the '<em><b>Time Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLOWED_PERSONAL_DATA_CHANGES__TIME_LIMIT = eINSTANCE.getAllowedPersonalDataChanges_TimeLimit();

		/**
		 * The meta object literal for the '<em><b>Accepted Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLOWED_PERSONAL_DATA_CHANGES__ACCEPTED_REASON = eINSTANCE.getAllowedPersonalDataChanges_AcceptedReason();

		/**
		 * The meta object literal for the '{@link Gtm.impl.PassengerConstraintsImpl <em>Passenger Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.PassengerConstraintsImpl
		 * @see Gtm.impl.GtmPackageImpl#getPassengerConstraints()
		 * @generated
		 */
		EClass PASSENGER_CONSTRAINTS = eINSTANCE.getPassengerConstraints();

		/**
		 * The meta object literal for the '<em><b>Passenger Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER_CONSTRAINTS__PASSENGER_CONSTRAINTS = eINSTANCE.getPassengerConstraints_PassengerConstraints();

		/**
		 * The meta object literal for the '{@link Gtm.impl.PassengerConstraintImpl <em>Passenger Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.PassengerConstraintImpl
		 * @see Gtm.impl.GtmPackageImpl#getPassengerConstraint()
		 * @generated
		 */
		EClass PASSENGER_CONSTRAINT = eINSTANCE.getPassengerConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CONSTRAINT__ID = eINSTANCE.getPassengerConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Traveler Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CONSTRAINT__TRAVELER_TYPE = eINSTANCE.getPassengerConstraint_TravelerType();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER_CONSTRAINT__TEXT = eINSTANCE.getPassengerConstraint_Text();

		/**
		 * The meta object literal for the '<em><b>Upper Age Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CONSTRAINT__UPPER_AGE_LIMIT = eINSTANCE.getPassengerConstraint_UpperAgeLimit();

		/**
		 * The meta object literal for the '<em><b>Lower Age Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CONSTRAINT__LOWER_AGE_LIMIT = eINSTANCE.getPassengerConstraint_LowerAgeLimit();

		/**
		 * The meta object literal for the '<em><b>Travel Alone Age Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CONSTRAINT__TRAVEL_ALONE_AGE_LIMIT = eINSTANCE.getPassengerConstraint_TravelAloneAgeLimit();

		/**
		 * The meta object literal for the '<em><b>Reservation Age Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CONSTRAINT__RESERVATION_AGE_LIMIT = eINSTANCE.getPassengerConstraint_ReservationAgeLimit();

		/**
		 * The meta object literal for the '<em><b>Is Ancilliary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CONSTRAINT__IS_ANCILLIARY = eINSTANCE.getPassengerConstraint_IsAncilliary();

		/**
		 * The meta object literal for the '<em><b>Passenger Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CONSTRAINT__PASSENGER_WEIGHT = eINSTANCE.getPassengerConstraint_PassengerWeight();

		/**
		 * The meta object literal for the '<em><b>Max Total Passenger Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CONSTRAINT__MAX_TOTAL_PASSENGER_WEIGHT = eINSTANCE.getPassengerConstraint_MaxTotalPassengerWeight();

		/**
		 * The meta object literal for the '<em><b>Min Total Passenger Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CONSTRAINT__MIN_TOTAL_PASSENGER_WEIGHT = eINSTANCE.getPassengerConstraint_MinTotalPassengerWeight();

		/**
		 * The meta object literal for the '<em><b>Included Free Passengers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER_CONSTRAINT__INCLUDED_FREE_PASSENGERS = eINSTANCE.getPassengerConstraint_IncludedFreePassengers();

		/**
		 * The meta object literal for the '<em><b>Excluded Passenger Combinations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER_CONSTRAINT__EXCLUDED_PASSENGER_COMBINATIONS = eINSTANCE.getPassengerConstraint_ExcludedPassengerCombinations();

		/**
		 * The meta object literal for the '{@link Gtm.impl.PassengerCombinationConstraintImpl <em>Passenger Combination Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.PassengerCombinationConstraintImpl
		 * @see Gtm.impl.GtmPackageImpl#getPassengerCombinationConstraint()
		 * @generated
		 */
		EClass PASSENGER_COMBINATION_CONSTRAINT = eINSTANCE.getPassengerCombinationConstraint();

		/**
		 * The meta object literal for the '<em><b>Max Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_COMBINATION_CONSTRAINT__MAX_NUMBER = eINSTANCE.getPassengerCombinationConstraint_MaxNumber();

		/**
		 * The meta object literal for the '<em><b>Passenger Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_COMBINATION_CONSTRAINT__PASSENGER_TYPE = eINSTANCE.getPassengerCombinationConstraint_PassengerType();

		/**
		 * The meta object literal for the '{@link Gtm.impl.IncludedFreePassengerLimitImpl <em>Included Free Passenger Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.IncludedFreePassengerLimitImpl
		 * @see Gtm.impl.GtmPackageImpl#getIncludedFreePassengerLimit()
		 * @generated
		 */
		EClass INCLUDED_FREE_PASSENGER_LIMIT = eINSTANCE.getIncludedFreePassengerLimit();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDED_FREE_PASSENGER_LIMIT__NUMBER = eINSTANCE.getIncludedFreePassengerLimit_Number();

		/**
		 * The meta object literal for the '<em><b>Passenger Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDED_FREE_PASSENGER_LIMIT__PASSENGER_TYPE = eINSTANCE.getIncludedFreePassengerLimit_PassengerType();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CombinationConstraintsImpl <em>Combination Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CombinationConstraintsImpl
		 * @see Gtm.impl.GtmPackageImpl#getCombinationConstraints()
		 * @generated
		 */
		EClass COMBINATION_CONSTRAINTS = eINSTANCE.getCombinationConstraints();

		/**
		 * The meta object literal for the '<em><b>Combination Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION_CONSTRAINTS__COMBINATION_CONSTRAINTS = eINSTANCE.getCombinationConstraints_CombinationConstraints();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CombinationConstraintImpl <em>Combination Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CombinationConstraintImpl
		 * @see Gtm.impl.GtmPackageImpl#getCombinationConstraint()
		 * @generated
		 */
		EClass COMBINATION_CONSTRAINT = eINSTANCE.getCombinationConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBINATION_CONSTRAINT__ID = eINSTANCE.getCombinationConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBINATION_CONSTRAINT__DATA_DESCRIPTION = eINSTANCE.getCombinationConstraint_DataDescription();

		/**
		 * The meta object literal for the '<em><b>Combination Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION_CONSTRAINT__COMBINATION_MODELS = eINSTANCE.getCombinationConstraint_CombinationModels();

		/**
		 * The meta object literal for the '{@link Gtm.impl.TravelValidityConstraintsImpl <em>Travel Validity Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.TravelValidityConstraintsImpl
		 * @see Gtm.impl.GtmPackageImpl#getTravelValidityConstraints()
		 * @generated
		 */
		EClass TRAVEL_VALIDITY_CONSTRAINTS = eINSTANCE.getTravelValidityConstraints();

		/**
		 * The meta object literal for the '<em><b>Travel Validity Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVEL_VALIDITY_CONSTRAINTS__TRAVEL_VALIDITY_CONSTRAINTS = eINSTANCE.getTravelValidityConstraints_TravelValidityConstraints();

		/**
		 * The meta object literal for the '{@link Gtm.impl.TravelValidityConstraintImpl <em>Travel Validity Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.TravelValidityConstraintImpl
		 * @see Gtm.impl.GtmPackageImpl#getTravelValidityConstraint()
		 * @generated
		 */
		EClass TRAVEL_VALIDITY_CONSTRAINT = eINSTANCE.getTravelValidityConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVEL_VALIDITY_CONSTRAINT__ID = eINSTANCE.getTravelValidityConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVEL_VALIDITY_CONSTRAINT__DATA_DESCRIPTION = eINSTANCE.getTravelValidityConstraint_DataDescription();

		/**
		 * The meta object literal for the '<em><b>Valid Days</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVEL_VALIDITY_CONSTRAINT__VALID_DAYS = eINSTANCE.getTravelValidityConstraint_ValidDays();

		/**
		 * The meta object literal for the '<em><b>Travel Days</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVEL_VALIDITY_CONSTRAINT__TRAVEL_DAYS = eINSTANCE.getTravelValidityConstraint_TravelDays();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVEL_VALIDITY_CONSTRAINT__RANGE = eINSTANCE.getTravelValidityConstraint_Range();

		/**
		 * The meta object literal for the '<em><b>Return Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVEL_VALIDITY_CONSTRAINT__RETURN_CONSTRAINT = eINSTANCE.getTravelValidityConstraint_ReturnConstraint();

		/**
		 * The meta object literal for the '<em><b>Excluded Time Range</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVEL_VALIDITY_CONSTRAINT__EXCLUDED_TIME_RANGE = eINSTANCE.getTravelValidityConstraint_ExcludedTimeRange();

		/**
		 * The meta object literal for the '{@link Gtm.impl.SalesAvailabilityConstraintsImpl <em>Sales Availability Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.SalesAvailabilityConstraintsImpl
		 * @see Gtm.impl.GtmPackageImpl#getSalesAvailabilityConstraints()
		 * @generated
		 */
		EClass SALES_AVAILABILITY_CONSTRAINTS = eINSTANCE.getSalesAvailabilityConstraints();

		/**
		 * The meta object literal for the '<em><b>Sales Availability Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_AVAILABILITY_CONSTRAINTS__SALES_AVAILABILITY_CONSTRAINTS = eINSTANCE.getSalesAvailabilityConstraints_SalesAvailabilityConstraints();

		/**
		 * The meta object literal for the '{@link Gtm.impl.SalesAvailabilityConstraintImpl <em>Sales Availability Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.SalesAvailabilityConstraintImpl
		 * @see Gtm.impl.GtmPackageImpl#getSalesAvailabilityConstraint()
		 * @generated
		 */
		EClass SALES_AVAILABILITY_CONSTRAINT = eINSTANCE.getSalesAvailabilityConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_AVAILABILITY_CONSTRAINT__ID = eINSTANCE.getSalesAvailabilityConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_AVAILABILITY_CONSTRAINT__DATA_DESCRIPTION = eINSTANCE.getSalesAvailabilityConstraint_DataDescription();

		/**
		 * The meta object literal for the '<em><b>Restrictions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_AVAILABILITY_CONSTRAINT__RESTRICTIONS = eINSTANCE.getSalesAvailabilityConstraint_Restrictions();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_AVAILABILITY_CONSTRAINT__DATA_SOURCE = eINSTANCE.getSalesAvailabilityConstraint_DataSource();

		/**
		 * The meta object literal for the '{@link Gtm.impl.SalesRestrictionImpl <em>Sales Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.SalesRestrictionImpl
		 * @see Gtm.impl.GtmPackageImpl#getSalesRestriction()
		 * @generated
		 */
		EClass SALES_RESTRICTION = eINSTANCE.getSalesRestriction();

		/**
		 * The meta object literal for the '<em><b>Sales Dates</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_RESTRICTION__SALES_DATES = eINSTANCE.getSalesRestriction_SalesDates();

		/**
		 * The meta object literal for the '<em><b>Start Of Sale</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_RESTRICTION__START_OF_SALE = eINSTANCE.getSalesRestriction_StartOfSale();

		/**
		 * The meta object literal for the '<em><b>End Of Sale</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_RESTRICTION__END_OF_SALE = eINSTANCE.getSalesRestriction_EndOfSale();

		/**
		 * The meta object literal for the '{@link Gtm.impl.EndOfSaleImpl <em>End Of Sale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.EndOfSaleImpl
		 * @see Gtm.impl.GtmPackageImpl#getEndOfSale()
		 * @generated
		 */
		EClass END_OF_SALE = eINSTANCE.getEndOfSale();

		/**
		 * The meta object literal for the '{@link Gtm.impl.StartOfSaleImpl <em>Start Of Sale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.StartOfSaleImpl
		 * @see Gtm.impl.GtmPackageImpl#getStartOfSale()
		 * @generated
		 */
		EClass START_OF_SALE = eINSTANCE.getStartOfSale();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ReductionCardsImpl <em>Reduction Cards</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ReductionCardsImpl
		 * @see Gtm.impl.GtmPackageImpl#getReductionCards()
		 * @generated
		 */
		EClass REDUCTION_CARDS = eINSTANCE.getReductionCards();

		/**
		 * The meta object literal for the '<em><b>Reduction Cards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCTION_CARDS__REDUCTION_CARDS = eINSTANCE.getReductionCards_ReductionCards();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ReductionCardImpl <em>Reduction Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ReductionCardImpl
		 * @see Gtm.impl.GtmPackageImpl#getReductionCard()
		 * @generated
		 */
		EClass REDUCTION_CARD = eINSTANCE.getReductionCard();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDUCTION_CARD__ID = eINSTANCE.getReductionCard_Id();

		/**
		 * The meta object literal for the '<em><b>Card Issuer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCTION_CARD__CARD_ISSUER = eINSTANCE.getReductionCard_CardIssuer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCTION_CARD__NAME = eINSTANCE.getReductionCard_Name();

		/**
		 * The meta object literal for the '<em><b>Service Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCTION_CARD__SERVICE_CLASSES = eINSTANCE.getReductionCard_ServiceClasses();

		/**
		 * The meta object literal for the '<em><b>Id Required For Booking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDUCTION_CARD__ID_REQUIRED_FOR_BOOKING = eINSTANCE.getReductionCard_IdRequiredForBooking();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CarrierConstraintsImpl <em>Carrier Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CarrierConstraintsImpl
		 * @see Gtm.impl.GtmPackageImpl#getCarrierConstraints()
		 * @generated
		 */
		EClass CARRIER_CONSTRAINTS = eINSTANCE.getCarrierConstraints();

		/**
		 * The meta object literal for the '<em><b>Carrier Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_CONSTRAINTS__CARRIER_CONSTRAINTS = eINSTANCE.getCarrierConstraints_CarrierConstraints();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CarrierConstraintImpl <em>Carrier Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CarrierConstraintImpl
		 * @see Gtm.impl.GtmPackageImpl#getCarrierConstraint()
		 * @generated
		 */
		EClass CARRIER_CONSTRAINT = eINSTANCE.getCarrierConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_CONSTRAINT__ID = eINSTANCE.getCarrierConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Included Carriers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_CONSTRAINT__INCLUDED_CARRIERS = eINSTANCE.getCarrierConstraint_IncludedCarriers();

		/**
		 * The meta object literal for the '<em><b>Excluded Carriers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_CONSTRAINT__EXCLUDED_CARRIERS = eINSTANCE.getCarrierConstraint_ExcludedCarriers();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_CONSTRAINT__DATA_DESCRIPTION = eINSTANCE.getCarrierConstraint_DataDescription();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ServiceConstraintsImpl <em>Service Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ServiceConstraintsImpl
		 * @see Gtm.impl.GtmPackageImpl#getServiceConstraints()
		 * @generated
		 */
		EClass SERVICE_CONSTRAINTS = eINSTANCE.getServiceConstraints();

		/**
		 * The meta object literal for the '<em><b>Service Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONSTRAINTS__SERVICE_CONSTRAINTS = eINSTANCE.getServiceConstraints_ServiceConstraints();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ServiceConstraintImpl <em>Service Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ServiceConstraintImpl
		 * @see Gtm.impl.GtmPackageImpl#getServiceConstraint()
		 * @generated
		 */
		EClass SERVICE_CONSTRAINT = eINSTANCE.getServiceConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CONSTRAINT__ID = eINSTANCE.getServiceConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Included Service Brands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONSTRAINT__INCLUDED_SERVICE_BRANDS = eINSTANCE.getServiceConstraint_IncludedServiceBrands();

		/**
		 * The meta object literal for the '<em><b>Excluded Service Brands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONSTRAINT__EXCLUDED_SERVICE_BRANDS = eINSTANCE.getServiceConstraint_ExcludedServiceBrands();

		/**
		 * The meta object literal for the '{@link Gtm.impl.RegionalConstraintsImpl <em>Regional Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.RegionalConstraintsImpl
		 * @see Gtm.impl.GtmPackageImpl#getRegionalConstraints()
		 * @generated
		 */
		EClass REGIONAL_CONSTRAINTS = eINSTANCE.getRegionalConstraints();

		/**
		 * The meta object literal for the '<em><b>Regional Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_CONSTRAINTS__REGIONAL_CONSTRAINTS = eINSTANCE.getRegionalConstraints_RegionalConstraints();

		/**
		 * The meta object literal for the '{@link Gtm.impl.RegionalConstraintImpl <em>Regional Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.RegionalConstraintImpl
		 * @see Gtm.impl.GtmPackageImpl#getRegionalConstraint()
		 * @generated
		 */
		EClass REGIONAL_CONSTRAINT = eINSTANCE.getRegionalConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGIONAL_CONSTRAINT__ID = eINSTANCE.getRegionalConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGIONAL_CONSTRAINT__DISTANCE = eINSTANCE.getRegionalConstraint_Distance();

		/**
		 * The meta object literal for the '<em><b>Entry Connection Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_CONSTRAINT__ENTRY_CONNECTION_POINT = eINSTANCE.getRegionalConstraint_EntryConnectionPoint();

		/**
		 * The meta object literal for the '<em><b>Exit Connection Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_CONSTRAINT__EXIT_CONNECTION_POINT = eINSTANCE.getRegionalConstraint_ExitConnectionPoint();

		/**
		 * The meta object literal for the '<em><b>Regional Validity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_CONSTRAINT__REGIONAL_VALIDITY = eINSTANCE.getRegionalConstraint_RegionalValidity();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGIONAL_CONSTRAINT__DATA_SOURCE = eINSTANCE.getRegionalConstraint_DataSource();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGIONAL_CONSTRAINT__DATA_DESCRIPTION = eINSTANCE.getRegionalConstraint_DataDescription();

		/**
		 * The meta object literal for the '{@link Gtm.impl.RegionalValidityImpl <em>Regional Validity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.RegionalValidityImpl
		 * @see Gtm.impl.GtmPackageImpl#getRegionalValidity()
		 * @generated
		 */
		EClass REGIONAL_VALIDITY = eINSTANCE.getRegionalValidity();

		/**
		 * The meta object literal for the '<em><b>Seq Nb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGIONAL_VALIDITY__SEQ_NB = eINSTANCE.getRegionalValidity_SeqNb();

		/**
		 * The meta object literal for the '<em><b>Via Station</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_VALIDITY__VIA_STATION = eINSTANCE.getRegionalValidity_ViaStation();

		/**
		 * The meta object literal for the '<em><b>Zone</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_VALIDITY__ZONE = eINSTANCE.getRegionalValidity_Zone();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_VALIDITY__LINE = eINSTANCE.getRegionalValidity_Line();

		/**
		 * The meta object literal for the '<em><b>Polygone</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_VALIDITY__POLYGONE = eINSTANCE.getRegionalValidity_Polygone();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ServiceLevelDefinitionsImpl <em>Service Level Definitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ServiceLevelDefinitionsImpl
		 * @see Gtm.impl.GtmPackageImpl#getServiceLevelDefinitions()
		 * @generated
		 */
		EClass SERVICE_LEVEL_DEFINITIONS = eINSTANCE.getServiceLevelDefinitions();

		/**
		 * The meta object literal for the '<em><b>Service Level Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL_DEFINITIONS__SERVICE_LEVEL_DEFINITION = eINSTANCE.getServiceLevelDefinitions_ServiceLevelDefinition();

		/**
		 * The meta object literal for the '{@link Gtm.impl.TextsImpl <em>Texts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.TextsImpl
		 * @see Gtm.impl.GtmPackageImpl#getTexts()
		 * @generated
		 */
		EClass TEXTS = eINSTANCE.getTexts();

		/**
		 * The meta object literal for the '<em><b>Texts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTS__TEXTS = eINSTANCE.getTexts_Texts();

		/**
		 * The meta object literal for the '{@link Gtm.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.TextImpl
		 * @see Gtm.impl.GtmPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__ID = eINSTANCE.getText_Id();

		/**
		 * The meta object literal for the '<em><b>Text UTF8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TEXT_UTF8 = eINSTANCE.getText_TextUTF8();

		/**
		 * The meta object literal for the '<em><b>Text ICAO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TEXT_ICAO = eINSTANCE.getText_TextICAO();

		/**
		 * The meta object literal for the '<em><b>Short Text UTF8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__SHORT_TEXT_UTF8 = eINSTANCE.getText_ShortTextUTF8();

		/**
		 * The meta object literal for the '<em><b>Short Text ICAO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__SHORT_TEXT_ICAO = eINSTANCE.getText_ShortTextICAO();

		/**
		 * The meta object literal for the '<em><b>Translations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT__TRANSLATIONS = eINSTANCE.getText_Translations();

		/**
		 * The meta object literal for the '{@link Gtm.impl.TranslationImpl <em>Translation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.TranslationImpl
		 * @see Gtm.impl.GtmPackageImpl#getTranslation()
		 * @generated
		 */
		EClass TRANSLATION = eINSTANCE.getTranslation();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSLATION__LANGUAGE = eINSTANCE.getTranslation_Language();

		/**
		 * The meta object literal for the '<em><b>Text UTF8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATION__TEXT_UTF8 = eINSTANCE.getTranslation_TextUTF8();

		/**
		 * The meta object literal for the '<em><b>Text ICAO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATION__TEXT_ICAO = eINSTANCE.getTranslation_TextICAO();

		/**
		 * The meta object literal for the '<em><b>Short Text UTF8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATION__SHORT_TEXT_UTF8 = eINSTANCE.getTranslation_ShortTextUTF8();

		/**
		 * The meta object literal for the '<em><b>Short Text ICAO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATION__SHORT_TEXT_ICAO = eINSTANCE.getTranslation_ShortTextICAO();

		/**
		 * The meta object literal for the '{@link Gtm.impl.PricesImpl <em>Prices</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.PricesImpl
		 * @see Gtm.impl.GtmPackageImpl#getPrices()
		 * @generated
		 */
		EClass PRICES = eINSTANCE.getPrices();

		/**
		 * The meta object literal for the '<em><b>Prices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICES__PRICES = eINSTANCE.getPrices_Prices();

		/**
		 * The meta object literal for the '{@link Gtm.impl.PriceImpl <em>Price</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.PriceImpl
		 * @see Gtm.impl.GtmPackageImpl#getPrice()
		 * @generated
		 */
		EClass PRICE = eINSTANCE.getPrice();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICE__ID = eINSTANCE.getPrice_Id();

		/**
		 * The meta object literal for the '<em><b>Currencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICE__CURRENCIES = eINSTANCE.getPrice_Currencies();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICE__DATA_SOURCE = eINSTANCE.getPrice_DataSource();

		/**
		 * The meta object literal for the '{@link Gtm.impl.VATDetailImpl <em>VAT Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.VATDetailImpl
		 * @see Gtm.impl.GtmPackageImpl#getVATDetail()
		 * @generated
		 */
		EClass VAT_DETAIL = eINSTANCE.getVATDetail();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAT_DETAIL__AMOUNT = eINSTANCE.getVATDetail_Amount();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAT_DETAIL__PERCENTAGE = eINSTANCE.getVATDetail_Percentage();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAT_DETAIL__COUNTRY = eINSTANCE.getVATDetail_Country();

		/**
		 * The meta object literal for the '<em><b>Tax Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAT_DETAIL__TAX_ID = eINSTANCE.getVATDetail_TaxId();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAT_DETAIL__SCOPE = eINSTANCE.getVATDetail_Scope();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CurrencyPriceImpl <em>Currency Price</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CurrencyPriceImpl
		 * @see Gtm.impl.GtmPackageImpl#getCurrencyPrice()
		 * @generated
		 */
		EClass CURRENCY_PRICE = eINSTANCE.getCurrencyPrice();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENCY_PRICE__CURRENCY = eINSTANCE.getCurrencyPrice_Currency();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_PRICE__AMOUNT = eINSTANCE.getCurrencyPrice_Amount();

		/**
		 * The meta object literal for the '<em><b>VA Tdetails</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENCY_PRICE__VA_TDETAILS = eINSTANCE.getCurrencyPrice_VATdetails();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ServiceClassDefinitionsImpl <em>Service Class Definitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ServiceClassDefinitionsImpl
		 * @see Gtm.impl.GtmPackageImpl#getServiceClassDefinitions()
		 * @generated
		 */
		EClass SERVICE_CLASS_DEFINITIONS = eINSTANCE.getServiceClassDefinitions();

		/**
		 * The meta object literal for the '<em><b>Service Class Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CLASS_DEFINITIONS__SERVICE_CLASS_DEFINITIONS = eINSTANCE.getServiceClassDefinitions_ServiceClassDefinitions();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CalendarsImpl <em>Calendars</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CalendarsImpl
		 * @see Gtm.impl.GtmPackageImpl#getCalendars()
		 * @generated
		 */
		EClass CALENDARS = eINSTANCE.getCalendars();

		/**
		 * The meta object literal for the '<em><b>Calendars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALENDARS__CALENDARS = eINSTANCE.getCalendars_Calendars();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CalendarImpl <em>Calendar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CalendarImpl
		 * @see Gtm.impl.GtmPackageImpl#getCalendar()
		 * @generated
		 */
		EClass CALENDAR = eINSTANCE.getCalendar();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__NAME = eINSTANCE.getCalendar_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__ID = eINSTANCE.getCalendar_Id();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__FROM_DATE = eINSTANCE.getCalendar_FromDate();

		/**
		 * The meta object literal for the '<em><b>Until Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__UNTIL_DATE = eINSTANCE.getCalendar_UntilDate();

		/**
		 * The meta object literal for the '<em><b>Utc Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__UTC_OFFSET = eINSTANCE.getCalendar_UtcOffset();

		/**
		 * The meta object literal for the '<em><b>Dates</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__DATES = eINSTANCE.getCalendar_Dates();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__DATA_SOURCE = eINSTANCE.getCalendar_DataSource();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ReservationParametersImpl <em>Reservation Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ReservationParametersImpl
		 * @see Gtm.impl.GtmPackageImpl#getReservationParameters()
		 * @generated
		 */
		EClass RESERVATION_PARAMETERS = eINSTANCE.getReservationParameters();

		/**
		 * The meta object literal for the '<em><b>Reservation Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION_PARAMETERS__RESERVATION_PARAMETERS = eINSTANCE.getReservationParameters_ReservationParameters();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ReservationParameterImpl <em>Reservation Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ReservationParameterImpl
		 * @see Gtm.impl.GtmPackageImpl#getReservationParameter()
		 * @generated
		 */
		EClass RESERVATION_PARAMETER = eINSTANCE.getReservationParameter();

		/**
		 * The meta object literal for the '<em><b>Optional Reservation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PARAMETER__OPTIONAL_RESERVATION = eINSTANCE.getReservationParameter_OptionalReservation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PARAMETER__ID = eINSTANCE.getReservationParameter_Id();

		/**
		 * The meta object literal for the '<em><b>Params9181</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION_PARAMETER__PARAMS9181 = eINSTANCE.getReservationParameter_Params9181();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION_PARAMETER__OPTIONS = eINSTANCE.getReservationParameter_Options();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ReservationParams9181Impl <em>Reservation Params9181</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ReservationParams9181Impl
		 * @see Gtm.impl.GtmPackageImpl#getReservationParams9181()
		 * @generated
		 */
		EClass RESERVATION_PARAMS9181 = eINSTANCE.getReservationParams9181();

		/**
		 * The meta object literal for the '<em><b>Travel Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PARAMS9181__TRAVEL_CLASS = eINSTANCE.getReservationParams9181_TravelClass();

		/**
		 * The meta object literal for the '<em><b>Service Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PARAMS9181__SERVICE_LEVEL = eINSTANCE.getReservationParams9181_ServiceLevel();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PARAMS9181__SERVICE = eINSTANCE.getReservationParams9181_Service();

		/**
		 * The meta object literal for the '<em><b>Berth Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PARAMS9181__BERTH_TYPE = eINSTANCE.getReservationParams9181_BerthType();

		/**
		 * The meta object literal for the '<em><b>Coach Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PARAMS9181__COACH_TYPE = eINSTANCE.getReservationParams9181_CoachType();

		/**
		 * The meta object literal for the '<em><b>Compartment Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PARAMS9181__COMPARTMENT_TYPE = eINSTANCE.getReservationParams9181_CompartmentType();

		/**
		 * The meta object literal for the '<em><b>Tariff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PARAMS9181__TARIFF = eINSTANCE.getReservationParams9181_Tariff();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ReservationOptionsImpl <em>Reservation Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ReservationOptionsImpl
		 * @see Gtm.impl.GtmPackageImpl#getReservationOptions()
		 * @generated
		 */
		EClass RESERVATION_OPTIONS = eINSTANCE.getReservationOptions();

		/**
		 * The meta object literal for the '<em><b>Preferences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION_OPTIONS__PREFERENCES = eINSTANCE.getReservationOptions_Preferences();

		/**
		 * The meta object literal for the '<em><b>Service Brands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION_OPTIONS__SERVICE_BRANDS = eINSTANCE.getReservationOptions_ServiceBrands();

		/**
		 * The meta object literal for the '<em><b>Graphical Reservation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_OPTIONS__GRAPHICAL_RESERVATION = eINSTANCE.getReservationOptions_GraphicalReservation();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ReservationPreferenceGroupImpl <em>Reservation Preference Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ReservationPreferenceGroupImpl
		 * @see Gtm.impl.GtmPackageImpl#getReservationPreferenceGroup()
		 * @generated
		 */
		EClass RESERVATION_PREFERENCE_GROUP = eINSTANCE.getReservationPreferenceGroup();

		/**
		 * The meta object literal for the '<em><b>Preference</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PREFERENCE_GROUP__PREFERENCE = eINSTANCE.getReservationPreferenceGroup_Preference();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PREFERENCE_GROUP__GROUP = eINSTANCE.getReservationPreferenceGroup_Group();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ServiceClassImpl <em>Service Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ServiceClassImpl
		 * @see Gtm.impl.GtmPackageImpl#getServiceClass()
		 * @generated
		 */
		EClass SERVICE_CLASS = eINSTANCE.getServiceClass();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CLASS__ID = eINSTANCE.getServiceClass_Id();

		/**
		 * The meta object literal for the '<em><b>Classic Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CLASS__CLASSIC_CLASS = eINSTANCE.getServiceClass_ClassicClass();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CLASS__TEXT = eINSTANCE.getServiceClass_Text();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ServiceLevelImpl <em>Service Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ServiceLevelImpl
		 * @see Gtm.impl.GtmPackageImpl#getServiceLevel()
		 * @generated
		 */
		EClass SERVICE_LEVEL = eINSTANCE.getServiceLevel();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LEVEL__ID = eINSTANCE.getServiceLevel_Id();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL__TEXT = eINSTANCE.getServiceLevel_Text();

		/**
		 * The meta object literal for the '<em><b>Combining Service Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL__COMBINING_SERVICE_CLASSES = eINSTANCE.getServiceLevel_CombiningServiceClasses();

		/**
		 * The meta object literal for the '<em><b>Reservation Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL__RESERVATION_PARAMETER = eINSTANCE.getServiceLevel_ReservationParameter();

		/**
		 * The meta object literal for the '<em><b>Includes Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LEVEL__INCLUDES_CLASS_NAME = eINSTANCE.getServiceLevel_IncludesClassName();

		/**
		 * The meta object literal for the '{@link Gtm.impl.TimeRangeImpl <em>Time Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.TimeRangeImpl
		 * @see Gtm.impl.GtmPackageImpl#getTimeRange()
		 * @generated
		 */
		EClass TIME_RANGE = eINSTANCE.getTimeRange();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_RANGE__SCOPE = eINSTANCE.getTimeRange_Scope();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_RANGE__FROM = eINSTANCE.getTimeRange_From();

		/**
		 * The meta object literal for the '<em><b>Until</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_RANGE__UNTIL = eINSTANCE.getTimeRange_Until();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ExcludedTimeRangeImpl <em>Excluded Time Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ExcludedTimeRangeImpl
		 * @see Gtm.impl.GtmPackageImpl#getExcludedTimeRange()
		 * @generated
		 */
		EClass EXCLUDED_TIME_RANGE = eINSTANCE.getExcludedTimeRange();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ValidityRangeImpl <em>Validity Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ValidityRangeImpl
		 * @see Gtm.impl.GtmPackageImpl#getValidityRange()
		 * @generated
		 */
		EClass VALIDITY_RANGE = eINSTANCE.getValidityRange();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDITY_RANGE__UNIT = eINSTANCE.getValidityRange_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDITY_RANGE__VALUE = eINSTANCE.getValidityRange_Value();

		/**
		 * The meta object literal for the '<em><b>Hours After Midnight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDITY_RANGE__HOURS_AFTER_MIDNIGHT = eINSTANCE.getValidityRange_HoursAfterMidnight();

		/**
		 * The meta object literal for the '{@link Gtm.impl.RelativeTimeImpl <em>Relative Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.RelativeTimeImpl
		 * @see Gtm.impl.GtmPackageImpl#getRelativeTime()
		 * @generated
		 */
		EClass RELATIVE_TIME = eINSTANCE.getRelativeTime();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_TIME__UNIT = eINSTANCE.getRelativeTime_Unit();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_TIME__REFERENCE = eINSTANCE.getRelativeTime_Reference();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_TIME__VALUE = eINSTANCE.getRelativeTime_Value();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ReturnValidityConstraintImpl <em>Return Validity Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ReturnValidityConstraintImpl
		 * @see Gtm.impl.GtmPackageImpl#getReturnValidityConstraint()
		 * @generated
		 */
		EClass RETURN_VALIDITY_CONSTRAINT = eINSTANCE.getReturnValidityConstraint();

		/**
		 * The meta object literal for the '<em><b>Excluded Weekdays</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_VALIDITY_CONSTRAINT__EXCLUDED_WEEKDAYS = eINSTANCE.getReturnValidityConstraint_ExcludedWeekdays();

		/**
		 * The meta object literal for the '<em><b>Latest Return</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_VALIDITY_CONSTRAINT__LATEST_RETURN = eINSTANCE.getReturnValidityConstraint_LatestReturn();

		/**
		 * The meta object literal for the '<em><b>Earliest Return</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_VALIDITY_CONSTRAINT__EARLIEST_RETURN = eINSTANCE.getReturnValidityConstraint_EarliestReturn();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ViaStationImpl <em>Via Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ViaStationImpl
		 * @see Gtm.impl.GtmPackageImpl#getViaStation()
		 * @generated
		 */
		EClass VIA_STATION = eINSTANCE.getViaStation();

		/**
		 * The meta object literal for the '<em><b>Station</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIA_STATION__STATION = eINSTANCE.getViaStation_Station();

		/**
		 * The meta object literal for the '<em><b>Carrier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIA_STATION__CARRIER = eINSTANCE.getViaStation_Carrier();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIA_STATION__ROUTE = eINSTANCE.getViaStation_Route();

		/**
		 * The meta object literal for the '<em><b>Alternative Routes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIA_STATION__ALTERNATIVE_ROUTES = eINSTANCE.getViaStation_AlternativeRoutes();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIA_STATION__DATA_DESCRIPTION = eINSTANCE.getViaStation_DataDescription();

		/**
		 * The meta object literal for the '<em><b>Fare Station Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIA_STATION__FARE_STATION_SET = eINSTANCE.getViaStation_FareStationSet();

		/**
		 * The meta object literal for the '<em><b>Get Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIA_STATION___GET_DESCRIPTION = eINSTANCE.getViaStation__GetDescription();

		/**
		 * The meta object literal for the '{@link Gtm.impl.AlternativeRouteImpl <em>Alternative Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.AlternativeRouteImpl
		 * @see Gtm.impl.GtmPackageImpl#getAlternativeRoute()
		 * @generated
		 */
		EClass ALTERNATIVE_ROUTE = eINSTANCE.getAlternativeRoute();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVE_ROUTE__STATIONS = eINSTANCE.getAlternativeRoute_Stations();

		/**
		 * The meta object literal for the '{@link Gtm.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.RouteImpl
		 * @see Gtm.impl.GtmPackageImpl#getRoute()
		 * @generated
		 */
		EClass ROUTE = eINSTANCE.getRoute();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__STATIONS = eINSTANCE.getRoute_Stations();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ZoneImpl <em>Zone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ZoneImpl
		 * @see Gtm.impl.GtmPackageImpl#getZone()
		 * @generated
		 */
		EClass ZONE = eINSTANCE.getZone();

		/**
		 * The meta object literal for the '<em><b>Binary Zone Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONE__BINARY_ZONE_ID = eINSTANCE.getZone_BinaryZoneId();

		/**
		 * The meta object literal for the '<em><b>Zone Id</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONE__ZONE_ID = eINSTANCE.getZone_ZoneId();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONE__CITY = eINSTANCE.getZone_City();

		/**
		 * The meta object literal for the '<em><b>Carrier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__CARRIER = eINSTANCE.getZone_Carrier();

		/**
		 * The meta object literal for the '<em><b>Entry Station</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__ENTRY_STATION = eINSTANCE.getZone_EntryStation();

		/**
		 * The meta object literal for the '<em><b>Terminal Station</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__TERMINAL_STATION = eINSTANCE.getZone_TerminalStation();

		/**
		 * The meta object literal for the '<em><b>Nuts Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__NUTS_CODE = eINSTANCE.getZone_NutsCode();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LineImpl
		 * @see Gtm.impl.GtmPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Binary Zone Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__BINARY_ZONE_ID = eINSTANCE.getLine_BinaryZoneId();

		/**
		 * The meta object literal for the '<em><b>Line Id</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__LINE_ID = eINSTANCE.getLine_LineId();

		/**
		 * The meta object literal for the '<em><b>Carrier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__CARRIER = eINSTANCE.getLine_Carrier();

		/**
		 * The meta object literal for the '<em><b>Entry Station</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__ENTRY_STATION = eINSTANCE.getLine_EntryStation();

		/**
		 * The meta object literal for the '<em><b>Terminal Station</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__TERMINAL_STATION = eINSTANCE.getLine_TerminalStation();

		/**
		 * The meta object literal for the '<em><b>Nuts Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__NUTS_CODE = eINSTANCE.getLine_NutsCode();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__CITY = eINSTANCE.getLine_City();

		/**
		 * The meta object literal for the '{@link Gtm.impl.PolygoneImpl <em>Polygone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.PolygoneImpl
		 * @see Gtm.impl.GtmPackageImpl#getPolygone()
		 * @generated
		 */
		EClass POLYGONE = eINSTANCE.getPolygone();

		/**
		 * The meta object literal for the '<em><b>Edge</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLYGONE__EDGE = eINSTANCE.getPolygone_Edge();

		/**
		 * The meta object literal for the '{@link Gtm.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.EdgeImpl
		 * @see Gtm.impl.GtmPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__SYSTEM = eINSTANCE.getEdge_System();

		/**
		 * The meta object literal for the '<em><b>East West</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__EAST_WEST = eINSTANCE.getEdge_EastWest();

		/**
		 * The meta object literal for the '<em><b>North South</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__NORTH_SOUTH = eINSTANCE.getEdge_NorthSouth();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__UNIT = eINSTANCE.getEdge_Unit();

		/**
		 * The meta object literal for the '<em><b>Accuracy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__ACCURACY = eINSTANCE.getEdge_Accuracy();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__LONGITUDE = eINSTANCE.getEdge_Longitude();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__LATITUDE = eINSTANCE.getEdge_Latitude();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CarrierResourceLocationImpl <em>Carrier Resource Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CarrierResourceLocationImpl
		 * @see Gtm.impl.GtmPackageImpl#getCarrierResourceLocation()
		 * @generated
		 */
		EClass CARRIER_RESOURCE_LOCATION = eINSTANCE.getCarrierResourceLocation();

		/**
		 * The meta object literal for the '<em><b>Carrier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_RESOURCE_LOCATION__CARRIER = eINSTANCE.getCarrierResourceLocation_Carrier();

		/**
		 * The meta object literal for the '<em><b>Service Brand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_RESOURCE_LOCATION__SERVICE_BRAND = eINSTANCE.getCarrierResourceLocation_ServiceBrand();

		/**
		 * The meta object literal for the '<em><b>Online Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_RESOURCE_LOCATION__ONLINE_RESOURCES = eINSTANCE.getCarrierResourceLocation_OnlineResources();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CrossBorderConditionImpl <em>Cross Border Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CrossBorderConditionImpl
		 * @see Gtm.impl.GtmPackageImpl#getCrossBorderCondition()
		 * @generated
		 */
		EClass CROSS_BORDER_CONDITION = eINSTANCE.getCrossBorderCondition();

		/**
		 * The meta object literal for the '<em><b>From Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_BORDER_CONDITION__FROM_COUNTRY = eINSTANCE.getCrossBorderCondition_FromCountry();

		/**
		 * The meta object literal for the '<em><b>To Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_BORDER_CONDITION__TO_COUNTRY = eINSTANCE.getCrossBorderCondition_ToCountry();

		/**
		 * The meta object literal for the '<em><b>Affected Service Brands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_BORDER_CONDITION__AFFECTED_SERVICE_BRANDS = eINSTANCE.getCrossBorderCondition_AffectedServiceBrands();

		/**
		 * The meta object literal for the '{@link Gtm.impl.FareCombinationModelImpl <em>Fare Combination Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.FareCombinationModelImpl
		 * @see Gtm.impl.GtmPackageImpl#getFareCombinationModel()
		 * @generated
		 */
		EClass FARE_COMBINATION_MODEL = eINSTANCE.getFareCombinationModel();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_COMBINATION_MODEL__MODEL = eINSTANCE.getFareCombinationModel_Model();

		/**
		 * The meta object literal for the '<em><b>Combinable Carriers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_COMBINATION_MODEL__COMBINABLE_CARRIERS = eINSTANCE.getFareCombinationModel_CombinableCarriers();

		/**
		 * The meta object literal for the '<em><b>Only When Combined</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_COMBINATION_MODEL__ONLY_WHEN_COMBINED = eINSTANCE.getFareCombinationModel_OnlyWhenCombined();

		/**
		 * The meta object literal for the '<em><b>Allowed Allocators</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_COMBINATION_MODEL__ALLOWED_ALLOCATORS = eINSTANCE.getFareCombinationModel_AllowedAllocators();

		/**
		 * The meta object literal for the '<em><b>Reference Cluster</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_COMBINATION_MODEL__REFERENCE_CLUSTER = eINSTANCE.getFareCombinationModel_ReferenceCluster();

		/**
		 * The meta object literal for the '<em><b>Allowed Clusters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_COMBINATION_MODEL__ALLOWED_CLUSTERS = eINSTANCE.getFareCombinationModel_AllowedClusters();

		/**
		 * The meta object literal for the '<em><b>Allowed Common Contracts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_COMBINATION_MODEL__ALLOWED_COMMON_CONTRACTS = eINSTANCE.getFareCombinationModel_AllowedCommonContracts();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ReductionConstraintImpl <em>Reduction Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ReductionConstraintImpl
		 * @see Gtm.impl.GtmPackageImpl#getReductionConstraint()
		 * @generated
		 */
		EClass REDUCTION_CONSTRAINT = eINSTANCE.getReductionConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDUCTION_CONSTRAINT__ID = eINSTANCE.getReductionConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Required Reduction Cards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCTION_CONSTRAINT__REQUIRED_REDUCTION_CARDS = eINSTANCE.getReductionConstraint_RequiredReductionCards();

		/**
		 * The meta object literal for the '{@link Gtm.impl.RequiredReductionCardImpl <em>Required Reduction Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.RequiredReductionCardImpl
		 * @see Gtm.impl.GtmPackageImpl#getRequiredReductionCard()
		 * @generated
		 */
		EClass REQUIRED_REDUCTION_CARD = eINSTANCE.getRequiredReductionCard();

		/**
		 * The meta object literal for the '<em><b>Card Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_REDUCTION_CARD__CARD_CLASS = eINSTANCE.getRequiredReductionCard_CardClass();

		/**
		 * The meta object literal for the '<em><b>Card</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_REDUCTION_CARD__CARD = eINSTANCE.getRequiredReductionCard_Card();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_REDUCTION_CARD__NAME = eINSTANCE.getRequiredReductionCard_Name();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ConversionFromLegacyImpl <em>Conversion From Legacy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ConversionFromLegacyImpl
		 * @see Gtm.impl.GtmPackageImpl#getConversionFromLegacy()
		 * @generated
		 */
		EClass CONVERSION_FROM_LEGACY = eINSTANCE.getConversionFromLegacy();

		/**
		 * The meta object literal for the '<em><b>Legacy108</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_FROM_LEGACY__LEGACY108 = eINSTANCE.getConversionFromLegacy_Legacy108();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_FROM_LEGACY__PARAMS = eINSTANCE.getConversionFromLegacy_Params();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ConversionParamsImpl <em>Conversion Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ConversionParamsImpl
		 * @see Gtm.impl.GtmPackageImpl#getConversionParams()
		 * @generated
		 */
		EClass CONVERSION_PARAMS = eINSTANCE.getConversionParams();

		/**
		 * The meta object literal for the '<em><b>Tax Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_PARAMS__TAX_ID = eINSTANCE.getConversionParams_TaxId();

		/**
		 * The meta object literal for the '<em><b>VA Tpercentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_PARAMS__VA_TPERCENTAGE = eINSTANCE.getConversionParams_VATpercentage();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_PARAMS__COUNTRY = eINSTANCE.getConversionParams_Country();

		/**
		 * The meta object literal for the '<em><b>Legacy Border Point Mappings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_PARAMS__LEGACY_BORDER_POINT_MAPPINGS = eINSTANCE.getConversionParams_LegacyBorderPointMappings();

		/**
		 * The meta object literal for the '<em><b>Legacy Station Mappings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_PARAMS__LEGACY_STATION_MAPPINGS = eINSTANCE.getConversionParams_LegacyStationMappings();

		/**
		 * The meta object literal for the '<em><b>Legacy Target Fares</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_PARAMS__LEGACY_TARGET_FARES = eINSTANCE.getConversionParams_LegacyTargetFares();

		/**
		 * The meta object literal for the '<em><b>Legacy Fare Station Mappings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_PARAMS__LEGACY_FARE_STATION_MAPPINGS = eINSTANCE.getConversionParams_LegacyFareStationMappings();

		/**
		 * The meta object literal for the '<em><b>Legacy Station To Service Brand Mappings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_PARAMS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS = eINSTANCE.getConversionParams_LegacyStationToServiceBrandMappings();

		/**
		 * The meta object literal for the '<em><b>End Of Sale</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_PARAMS__END_OF_SALE = eINSTANCE.getConversionParams_EndOfSale();

		/**
		 * The meta object literal for the '<em><b>Start Of Sale</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_PARAMS__START_OF_SALE = eINSTANCE.getConversionParams_StartOfSale();

		/**
		 * The meta object literal for the '{@link Gtm.impl.TargetFareTemplateImpl <em>Target Fare Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.TargetFareTemplateImpl
		 * @see Gtm.impl.GtmPackageImpl#getTargetFareTemplate()
		 * @generated
		 */
		EClass TARGET_FARE_TEMPLATE = eINSTANCE.getTargetFareTemplate();

		/**
		 * The meta object literal for the '<em><b>Price Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_FARE_TEMPLATE__PRICE_FACTOR = eINSTANCE.getTargetFareTemplate_PriceFactor();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_FARE_TEMPLATE__ID = eINSTANCE.getTargetFareTemplate_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_FARE_TEMPLATE__TYPE = eINSTANCE.getTargetFareTemplate_Type();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_FARE_TEMPLATE__DATA_DESCRIPTION = eINSTANCE.getTargetFareTemplate_DataDescription();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_FARE_TEMPLATE__TEXT = eINSTANCE.getTargetFareTemplate_Text();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_FARE_TEMPLATE__PRICE = eINSTANCE.getTargetFareTemplate_Price();

		/**
		 * The meta object literal for the '<em><b>Regional Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_FARE_TEMPLATE__REGIONAL_CONSTRAINT = eINSTANCE.getTargetFareTemplate_RegionalConstraint();

		/**
		 * The meta object literal for the '<em><b>Service Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_FARE_TEMPLATE__SERVICE_CONSTRAINT = eINSTANCE.getTargetFareTemplate_ServiceConstraint();

		/**
		 * The meta object literal for the '<em><b>Carrier Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_FARE_TEMPLATE__CARRIER_CONSTRAINT = eINSTANCE.getTargetFareTemplate_CarrierConstraint();

		/**
		 * The meta object literal for the '<em><b>Service Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_FARE_TEMPLATE__SERVICE_CLASS = eINSTANCE.getTargetFareTemplate_ServiceClass();

		/**
		 * The meta object literal for the '<em><b>Service Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_FARE_TEMPLATE__SERVICE_LEVEL = eINSTANCE.getTargetFareTemplate_ServiceLevel();

		/**
		 * The meta object literal for the '<em><b>Sales Availability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_FARE_TEMPLATE__SALES_AVAILABILITY = eINSTANCE.getTargetFareTemplate_SalesAvailability();

		/**
		 * The meta object literal for the '<em><b>Travel Validity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_FARE_TEMPLATE__TRAVEL_VALIDITY = eINSTANCE.getTargetFareTemplate_TravelValidity();

		/**
		 * The meta object literal for the '<em><b>Combination Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_FARE_TEMPLATE__COMBINATION_CONSTRAINT = eINSTANCE.getTargetFareTemplate_CombinationConstraint();

		/**
		 * The meta object literal for the '<em><b>Separate Contract Combination Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_FARE_TEMPLATE__SEPARATE_CONTRACT_COMBINATION_CONSTRAINT = eINSTANCE.getTargetFareTemplate_SeparateContractCombinationConstraint();

		/**
		 * The meta object literal for the '<em><b>Fare Detail Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_FARE_TEMPLATE__FARE_DETAIL_DESCRIPTION = eINSTANCE.getTargetFareTemplate_FareDetailDescription();

		/**
		 * The meta object literal for the '<em><b>Legacy Accounting Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_FARE_TEMPLATE__LEGACY_ACCOUNTING_IDENTIFIER = eINSTANCE.getTargetFareTemplate_LegacyAccountingIdentifier();

		/**
		 * The meta object literal for the '<em><b>Personal Data Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_FARE_TEMPLATE__PERSONAL_DATA_CONSTRAINT = eINSTANCE.getTargetFareTemplate_PersonalDataConstraint();

		/**
		 * The meta object literal for the '<em><b>Reservation Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_FARE_TEMPLATE__RESERVATION_PARAMETER = eINSTANCE.getTargetFareTemplate_ReservationParameter();

		/**
		 * The meta object literal for the '<em><b>Reduction Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_FARE_TEMPLATE__REDUCTION_CONSTRAINT = eINSTANCE.getTargetFareTemplate_ReductionConstraint();

		/**
		 * The meta object literal for the '<em><b>Fulfillment Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_FARE_TEMPLATE__FULFILLMENT_CONSTRAINT = eINSTANCE.getTargetFareTemplate_FulfillmentConstraint();

		/**
		 * The meta object literal for the '<em><b>Passenger Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_FARE_TEMPLATE__PASSENGER_CONSTRAINT = eINSTANCE.getTargetFareTemplate_PassengerConstraint();

		/**
		 * The meta object literal for the '<em><b>After Sales Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_FARE_TEMPLATE__AFTER_SALES_RULE = eINSTANCE.getTargetFareTemplate_AfterSalesRule();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyStationToServiceConstraintMappingsImpl <em>Legacy Station To Service Constraint Mappings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyStationToServiceConstraintMappingsImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyStationToServiceConstraintMappings()
		 * @generated
		 */
		EClass LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPINGS = eINSTANCE.getLegacyStationToServiceConstraintMappings();

		/**
		 * The meta object literal for the '<em><b>Legacy Station To Service Brand Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPINGS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS = eINSTANCE.getLegacyStationToServiceConstraintMappings_LegacyStationToServiceBrandMappings();

		/**
		 * The meta object literal for the '<em><b>Find Service Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPINGS___FIND_SERVICE_CONSTRAINT__INT = eINSTANCE.getLegacyStationToServiceConstraintMappings__FindServiceConstraint__int();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyStationToServiceConstraintMappingImpl <em>Legacy Station To Service Constraint Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyStationToServiceConstraintMappingImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyStationToServiceConstraintMapping()
		 * @generated
		 */
		EClass LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING = eINSTANCE.getLegacyStationToServiceConstraintMapping();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING__CODE = eINSTANCE.getLegacyStationToServiceConstraintMapping_Code();

		/**
		 * The meta object literal for the '<em><b>Service Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING__SERVICE_CONSTRAINT = eINSTANCE.getLegacyStationToServiceConstraintMapping_ServiceConstraint();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING__DESCRIPTION = eINSTANCE.getLegacyStationToServiceConstraintMapping_Description();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyStationMappingsImpl <em>Legacy Station Mappings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyStationMappingsImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyStationMappings()
		 * @generated
		 */
		EClass LEGACY_STATION_MAPPINGS = eINSTANCE.getLegacyStationMappings();

		/**
		 * The meta object literal for the '<em><b>Station Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_STATION_MAPPINGS__STATION_MAPPINGS = eINSTANCE.getLegacyStationMappings_StationMappings();

		/**
		 * The meta object literal for the '<em><b>Find Mapped Station</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGACY_STATION_MAPPINGS___FIND_MAPPED_STATION__INT = eINSTANCE.getLegacyStationMappings__FindMappedStation__int();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyStationMapImpl <em>Legacy Station Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyStationMapImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyStationMap()
		 * @generated
		 */
		EClass LEGACY_STATION_MAP = eINSTANCE.getLegacyStationMap();

		/**
		 * The meta object literal for the '<em><b>Legacy Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_STATION_MAP__LEGACY_CODE = eINSTANCE.getLegacyStationMap_LegacyCode();

		/**
		 * The meta object literal for the '<em><b>Station</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_STATION_MAP__STATION = eINSTANCE.getLegacyStationMap_Station();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyStationImpl <em>Legacy Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyStationImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyStation()
		 * @generated
		 */
		EClass LEGACY_STATION = eINSTANCE.getLegacyStation();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_STATION__CODE = eINSTANCE.getLegacyStation_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_STATION__NAME = eINSTANCE.getLegacyStation_Name();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyBoderPointMappingsImpl <em>Legacy Boder Point Mappings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyBoderPointMappingsImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyBoderPointMappings()
		 * @generated
		 */
		EClass LEGACY_BODER_POINT_MAPPINGS = eINSTANCE.getLegacyBoderPointMappings();

		/**
		 * The meta object literal for the '<em><b>Border Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_BODER_POINT_MAPPINGS__BORDER_POINTS = eINSTANCE.getLegacyBoderPointMappings_BorderPoints();

		/**
		 * The meta object literal for the '<em><b>Get Mapping By Border Point Code</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGACY_BODER_POINT_MAPPINGS___GET_MAPPING_BY_BORDER_POINT_CODE__INT = eINSTANCE.getLegacyBoderPointMappings__GetMappingByBorderPointCode__int();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyBorderPointMappingImpl <em>Legacy Border Point Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyBorderPointMappingImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyBorderPointMapping()
		 * @generated
		 */
		EClass LEGACY_BORDER_POINT_MAPPING = eINSTANCE.getLegacyBorderPointMapping();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_BORDER_POINT_MAPPING__CODE = eINSTANCE.getLegacyBorderPointMapping_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_BORDER_POINT_MAPPING__NAME = eINSTANCE.getLegacyBorderPointMapping_Name();

		/**
		 * The meta object literal for the '<em><b>Station</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_BORDER_POINT_MAPPING__STATION = eINSTANCE.getLegacyBorderPointMapping_Station();

		/**
		 * The meta object literal for the '<em><b>Connection Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_BORDER_POINT_MAPPING__CONNECTION_POINT = eINSTANCE.getLegacyBorderPointMapping_ConnectionPoint();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyFareStationSetMappingsImpl <em>Legacy Fare Station Set Mappings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyFareStationSetMappingsImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyFareStationSetMappings()
		 * @generated
		 */
		EClass LEGACY_FARE_STATION_SET_MAPPINGS = eINSTANCE.getLegacyFareStationSetMappings();

		/**
		 * The meta object literal for the '<em><b>Legacy Fare Station Set Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_FARE_STATION_SET_MAPPINGS__LEGACY_FARE_STATION_SET_MAP = eINSTANCE.getLegacyFareStationSetMappings_LegacyFareStationSetMap();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyFareStationSetMapImpl <em>Legacy Fare Station Set Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyFareStationSetMapImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyFareStationSetMap()
		 * @generated
		 */
		EClass LEGACY_FARE_STATION_SET_MAP = eINSTANCE.getLegacyFareStationSetMap();

		/**
		 * The meta object literal for the '<em><b>Legacy Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_FARE_STATION_SET_MAP__LEGACY_CODE = eINSTANCE.getLegacyFareStationSetMap_LegacyCode();

		/**
		 * The meta object literal for the '<em><b>Station Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_FARE_STATION_SET_MAP__STATION_SET = eINSTANCE.getLegacyFareStationSetMap_StationSet();

		/**
		 * The meta object literal for the '{@link Gtm.impl.Legacy108Impl <em>Legacy108</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.Legacy108Impl
		 * @see Gtm.impl.GtmPackageImpl#getLegacy108()
		 * @generated
		 */
		EClass LEGACY108 = eINSTANCE.getLegacy108();

		/**
		 * The meta object literal for the '<em><b>Character Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY108__CHARACTER_SET = eINSTANCE.getLegacy108_CharacterSet();

		/**
		 * The meta object literal for the '<em><b>Legacy Series List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY108__LEGACY_SERIES_LIST = eINSTANCE.getLegacy108_LegacySeriesList();

		/**
		 * The meta object literal for the '<em><b>Legacy Separate Contract Series</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY108__LEGACY_SEPARATE_CONTRACT_SERIES = eINSTANCE.getLegacy108_LegacySeparateContractSeries();

		/**
		 * The meta object literal for the '<em><b>Legacy Distance Fares</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY108__LEGACY_DISTANCE_FARES = eINSTANCE.getLegacy108_LegacyDistanceFares();

		/**
		 * The meta object literal for the '<em><b>Legacy Route Fares</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY108__LEGACY_ROUTE_FARES = eINSTANCE.getLegacy108_LegacyRouteFares();

		/**
		 * The meta object literal for the '<em><b>Legacy Stations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY108__LEGACY_STATIONS = eINSTANCE.getLegacy108_LegacyStations();

		/**
		 * The meta object literal for the '<em><b>Time Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY108__TIME_ZONE = eINSTANCE.getLegacy108_TimeZone();

		/**
		 * The meta object literal for the '<em><b>Carrier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY108__CARRIER = eINSTANCE.getLegacy108_Carrier();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY108__START_DATE = eINSTANCE.getLegacy108_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY108__END_DATE = eINSTANCE.getLegacy108_EndDate();

		/**
		 * The meta object literal for the '{@link Gtm.impl.Legacy108StationsImpl <em>Legacy108 Stations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.Legacy108StationsImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacy108Stations()
		 * @generated
		 */
		EClass LEGACY108_STATIONS = eINSTANCE.getLegacy108Stations();

		/**
		 * The meta object literal for the '<em><b>Legacy Stations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY108_STATIONS__LEGACY_STATIONS = eINSTANCE.getLegacy108Stations_LegacyStations();

		/**
		 * The meta object literal for the '<em><b>Find Station</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGACY108_STATIONS___FIND_STATION__INT = eINSTANCE.getLegacy108Stations__FindStation__int();

		/**
		 * The meta object literal for the '<em><b>Find By Border Point</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGACY108_STATIONS___FIND_BY_BORDER_POINT__INT = eINSTANCE.getLegacy108Stations__FindByBorderPoint__int();

		/**
		 * The meta object literal for the '{@link Gtm.impl.Legacy108StationImpl <em>Legacy108 Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.Legacy108StationImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacy108Station()
		 * @generated
		 */
		EClass LEGACY108_STATION = eINSTANCE.getLegacy108Station();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY108_STATION__NAME = eINSTANCE.getLegacy108Station_Name();

		/**
		 * The meta object literal for the '<em><b>Border Point Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY108_STATION__BORDER_POINT_CODE = eINSTANCE.getLegacy108Station_BorderPointCode();

		/**
		 * The meta object literal for the '<em><b>Name UTF8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY108_STATION__NAME_UTF8 = eINSTANCE.getLegacy108Station_NameUTF8();

		/**
		 * The meta object literal for the '<em><b>Station Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY108_STATION__STATION_CODE = eINSTANCE.getLegacy108Station_StationCode();

		/**
		 * The meta object literal for the '<em><b>Fare Reference Station Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY108_STATION__FARE_REFERENCE_STATION_CODE = eINSTANCE.getLegacy108Station_FareReferenceStationCode();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY108_STATION__SHORT_NAME = eINSTANCE.getLegacy108Station_ShortName();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyRouteFaresImpl <em>Legacy Route Fares</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyRouteFaresImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyRouteFares()
		 * @generated
		 */
		EClass LEGACY_ROUTE_FARES = eINSTANCE.getLegacyRouteFares();

		/**
		 * The meta object literal for the '<em><b>Route Fare</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_ROUTE_FARES__ROUTE_FARE = eINSTANCE.getLegacyRouteFares_RouteFare();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyRouteFareImpl <em>Legacy Route Fare</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyRouteFareImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyRouteFare()
		 * @generated
		 */
		EClass LEGACY_ROUTE_FARE = eINSTANCE.getLegacyRouteFare();

		/**
		 * The meta object literal for the '<em><b>Fare Table Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_ROUTE_FARE__FARE_TABLE_NUMBER = eINSTANCE.getLegacyRouteFare_FareTableNumber();

		/**
		 * The meta object literal for the '<em><b>Series Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_ROUTE_FARE__SERIES_NUMBER = eINSTANCE.getLegacyRouteFare_SeriesNumber();

		/**
		 * The meta object literal for the '<em><b>Fare2nd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_ROUTE_FARE__FARE2ND = eINSTANCE.getLegacyRouteFare_Fare2nd();

		/**
		 * The meta object literal for the '<em><b>Fare1st</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_ROUTE_FARE__FARE1ST = eINSTANCE.getLegacyRouteFare_Fare1st();

		/**
		 * The meta object literal for the '<em><b>Return Fare1st</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_ROUTE_FARE__RETURN_FARE1ST = eINSTANCE.getLegacyRouteFare_ReturnFare1st();

		/**
		 * The meta object literal for the '<em><b>Return Fare2nd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_ROUTE_FARE__RETURN_FARE2ND = eINSTANCE.getLegacyRouteFare_ReturnFare2nd();

		/**
		 * The meta object literal for the '<em><b>Valid From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_ROUTE_FARE__VALID_FROM = eINSTANCE.getLegacyRouteFare_ValidFrom();

		/**
		 * The meta object literal for the '<em><b>Valid Until</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_ROUTE_FARE__VALID_UNTIL = eINSTANCE.getLegacyRouteFare_ValidUntil();

		/**
		 * The meta object literal for the '<em><b>Series</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_ROUTE_FARE__SERIES = eINSTANCE.getLegacyRouteFare_Series();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacySeriesListImpl <em>Legacy Series List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacySeriesListImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacySeriesList()
		 * @generated
		 */
		EClass LEGACY_SERIES_LIST = eINSTANCE.getLegacySeriesList();

		/**
		 * The meta object literal for the '<em><b>Series</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_SERIES_LIST__SERIES = eINSTANCE.getLegacySeriesList_Series();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacySeriesImpl <em>Legacy Series</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacySeriesImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacySeries()
		 * @generated
		 */
		EClass LEGACY_SERIES = eINSTANCE.getLegacySeries();

		/**
		 * The meta object literal for the '<em><b>Supplying Carrier Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__SUPPLYING_CARRIER_CODE = eINSTANCE.getLegacySeries_SupplyingCarrierCode();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__NUMBER = eINSTANCE.getLegacySeries_Number();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__TYPE = eINSTANCE.getLegacySeries_Type();

		/**
		 * The meta object literal for the '<em><b>From Station</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__FROM_STATION = eINSTANCE.getLegacySeries_FromStation();

		/**
		 * The meta object literal for the '<em><b>From Station Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__FROM_STATION_NAME = eINSTANCE.getLegacySeries_FromStationName();

		/**
		 * The meta object literal for the '<em><b>To Station</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__TO_STATION = eINSTANCE.getLegacySeries_ToStation();

		/**
		 * The meta object literal for the '<em><b>To Station Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__TO_STATION_NAME = eINSTANCE.getLegacySeries_ToStationName();

		/**
		 * The meta object literal for the '<em><b>Route Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__ROUTE_NUMBER = eINSTANCE.getLegacySeries_RouteNumber();

		/**
		 * The meta object literal for the '<em><b>Carrier Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__CARRIER_CODE = eINSTANCE.getLegacySeries_CarrierCode();

		/**
		 * The meta object literal for the '<em><b>Route Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__ROUTE_DESCRIPTION = eINSTANCE.getLegacySeries_RouteDescription();

		/**
		 * The meta object literal for the '<em><b>Pricetype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__PRICETYPE = eINSTANCE.getLegacySeries_Pricetype();

		/**
		 * The meta object literal for the '<em><b>Distance1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__DISTANCE1 = eINSTANCE.getLegacySeries_Distance1();

		/**
		 * The meta object literal for the '<em><b>Distance2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__DISTANCE2 = eINSTANCE.getLegacySeries_Distance2();

		/**
		 * The meta object literal for the '<em><b>Viastations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_SERIES__VIASTATIONS = eINSTANCE.getLegacySeries_Viastations();

		/**
		 * The meta object literal for the '<em><b>Valid From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__VALID_FROM = eINSTANCE.getLegacySeries_ValidFrom();

		/**
		 * The meta object literal for the '<em><b>Valid Until</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__VALID_UNTIL = eINSTANCE.getLegacySeries_ValidUntil();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacySeparateContractSeriesListImpl <em>Legacy Separate Contract Series List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacySeparateContractSeriesListImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacySeparateContractSeriesList()
		 * @generated
		 */
		EClass LEGACY_SEPARATE_CONTRACT_SERIES_LIST = eINSTANCE.getLegacySeparateContractSeriesList();

		/**
		 * The meta object literal for the '<em><b>Separate Contract Series</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_SEPARATE_CONTRACT_SERIES_LIST__SEPARATE_CONTRACT_SERIES = eINSTANCE.getLegacySeparateContractSeriesList_SeparateContractSeries();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacySeparateContractSeriesImpl <em>Legacy Separate Contract Series</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacySeparateContractSeriesImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacySeparateContractSeries()
		 * @generated
		 */
		EClass LEGACY_SEPARATE_CONTRACT_SERIES = eINSTANCE.getLegacySeparateContractSeries();

		/**
		 * The meta object literal for the '<em><b>Series Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SEPARATE_CONTRACT_SERIES__SERIES_NUMBER = eINSTANCE.getLegacySeparateContractSeries_SeriesNumber();

		/**
		 * The meta object literal for the '<em><b>Valid From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SEPARATE_CONTRACT_SERIES__VALID_FROM = eINSTANCE.getLegacySeparateContractSeries_ValidFrom();

		/**
		 * The meta object literal for the '<em><b>Valid Until</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SEPARATE_CONTRACT_SERIES__VALID_UNTIL = eINSTANCE.getLegacySeparateContractSeries_ValidUntil();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyDistanceFaresImpl <em>Legacy Distance Fares</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyDistanceFaresImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyDistanceFares()
		 * @generated
		 */
		EClass LEGACY_DISTANCE_FARES = eINSTANCE.getLegacyDistanceFares();

		/**
		 * The meta object literal for the '<em><b>Distance Fare</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_DISTANCE_FARES__DISTANCE_FARE = eINSTANCE.getLegacyDistanceFares_DistanceFare();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyDistanceFareImpl <em>Legacy Distance Fare</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyDistanceFareImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyDistanceFare()
		 * @generated
		 */
		EClass LEGACY_DISTANCE_FARE = eINSTANCE.getLegacyDistanceFare();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_DISTANCE_FARE__DISTANCE = eINSTANCE.getLegacyDistanceFare_Distance();

		/**
		 * The meta object literal for the '<em><b>Fare2nd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_DISTANCE_FARE__FARE2ND = eINSTANCE.getLegacyDistanceFare_Fare2nd();

		/**
		 * The meta object literal for the '<em><b>Fare1st</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_DISTANCE_FARE__FARE1ST = eINSTANCE.getLegacyDistanceFare_Fare1st();

		/**
		 * The meta object literal for the '<em><b>Fare Table Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_DISTANCE_FARE__FARE_TABLE_NUMBER = eINSTANCE.getLegacyDistanceFare_FareTableNumber();

		/**
		 * The meta object literal for the '<em><b>Return Fare1st</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_DISTANCE_FARE__RETURN_FARE1ST = eINSTANCE.getLegacyDistanceFare_ReturnFare1st();

		/**
		 * The meta object literal for the '<em><b>Return Fare2nd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_DISTANCE_FARE__RETURN_FARE2ND = eINSTANCE.getLegacyDistanceFare_ReturnFare2nd();

		/**
		 * The meta object literal for the '<em><b>Valid From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_DISTANCE_FARE__VALID_FROM = eINSTANCE.getLegacyDistanceFare_ValidFrom();

		/**
		 * The meta object literal for the '<em><b>Valid Until</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_DISTANCE_FARE__VALID_UNTIL = eINSTANCE.getLegacyDistanceFare_ValidUntil();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyViastationImpl <em>Legacy Viastation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyViastationImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyViastation()
		 * @generated
		 */
		EClass LEGACY_VIASTATION = eINSTANCE.getLegacyViastation();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_VIASTATION__POSITION = eINSTANCE.getLegacyViastation_Position();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_VIASTATION__CODE = eINSTANCE.getLegacyViastation_Code();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyTargetFaresImpl <em>Legacy Target Fares</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyTargetFaresImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyTargetFares()
		 * @generated
		 */
		EClass LEGACY_TARGET_FARES = eINSTANCE.getLegacyTargetFares();

		/**
		 * The meta object literal for the '<em><b>Target Fares</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_TARGET_FARES__TARGET_FARES = eINSTANCE.getLegacyTargetFares_TargetFares();

		/**
		 * The meta object literal for the '{@link Gtm.AfterSalesTransactionType <em>After Sales Transaction Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.AfterSalesTransactionType
		 * @see Gtm.impl.GtmPackageImpl#getAfterSalesTransactionType()
		 * @generated
		 */
		EEnum AFTER_SALES_TRANSACTION_TYPE = eINSTANCE.getAfterSalesTransactionType();

		/**
		 * The meta object literal for the '{@link Gtm.BarcodeTypes <em>Barcode Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.BarcodeTypes
		 * @see Gtm.impl.GtmPackageImpl#getBarcodeTypes()
		 * @generated
		 */
		EEnum BARCODE_TYPES = eINSTANCE.getBarcodeTypes();

		/**
		 * The meta object literal for the '{@link Gtm.ClassicClassType <em>Classic Class Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.ClassicClassType
		 * @see Gtm.impl.GtmPackageImpl#getClassicClassType()
		 * @generated
		 */
		EEnum CLASSIC_CLASS_TYPE = eINSTANCE.getClassicClassType();

		/**
		 * The meta object literal for the '{@link Gtm.CharacterSet <em>Character Set</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.CharacterSet
		 * @see Gtm.impl.GtmPackageImpl#getCharacterSet()
		 * @generated
		 */
		EEnum CHARACTER_SET = eINSTANCE.getCharacterSet();

		/**
		 * The meta object literal for the '{@link Gtm.Clusters <em>Clusters</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.Clusters
		 * @see Gtm.impl.GtmPackageImpl#getClusters()
		 * @generated
		 */
		EEnum CLUSTERS = eINSTANCE.getClusters();

		/**
		 * The meta object literal for the '{@link Gtm.CombinationModel <em>Combination Model</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.CombinationModel
		 * @see Gtm.impl.GtmPackageImpl#getCombinationModel()
		 * @generated
		 */
		EEnum COMBINATION_MODEL = eINSTANCE.getCombinationModel();

		/**
		 * The meta object literal for the '{@link Gtm.ControlDataExchangeTypes <em>Control Data Exchange Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.ControlDataExchangeTypes
		 * @see Gtm.impl.GtmPackageImpl#getControlDataExchangeTypes()
		 * @generated
		 */
		EEnum CONTROL_DATA_EXCHANGE_TYPES = eINSTANCE.getControlDataExchangeTypes();

		/**
		 * The meta object literal for the '{@link Gtm.FareType <em>Fare Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.FareType
		 * @see Gtm.impl.GtmPackageImpl#getFareType()
		 * @generated
		 */
		EEnum FARE_TYPE = eINSTANCE.getFareType();

		/**
		 * The meta object literal for the '{@link Gtm.FulfillmentType <em>Fulfillment Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.FulfillmentType
		 * @see Gtm.impl.GtmPackageImpl#getFulfillmentType()
		 * @generated
		 */
		EEnum FULFILLMENT_TYPE = eINSTANCE.getFulfillmentType();

		/**
		 * The meta object literal for the '{@link Gtm.GeoSystem <em>Geo System</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.GeoSystem
		 * @see Gtm.impl.GtmPackageImpl#getGeoSystem()
		 * @generated
		 */
		EEnum GEO_SYSTEM = eINSTANCE.getGeoSystem();

		/**
		 * The meta object literal for the '{@link Gtm.GeoUnit <em>Geo Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.GeoUnit
		 * @see Gtm.impl.GtmPackageImpl#getGeoUnit()
		 * @generated
		 */
		EEnum GEO_UNIT = eINSTANCE.getGeoUnit();

		/**
		 * The meta object literal for the '{@link Gtm.GraphicalReservationType <em>Graphical Reservation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.GraphicalReservationType
		 * @see Gtm.impl.GtmPackageImpl#getGraphicalReservationType()
		 * @generated
		 */
		EEnum GRAPHICAL_RESERVATION_TYPE = eINSTANCE.getGraphicalReservationType();

		/**
		 * The meta object literal for the '{@link Gtm.HemisphereEW <em>Hemisphere EW</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.HemisphereEW
		 * @see Gtm.impl.GtmPackageImpl#getHemisphereEW()
		 * @generated
		 */
		EEnum HEMISPHERE_EW = eINSTANCE.getHemisphereEW();

		/**
		 * The meta object literal for the '{@link Gtm.HemisphereNS <em>Hemisphere NS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.HemisphereNS
		 * @see Gtm.impl.GtmPackageImpl#getHemisphereNS()
		 * @generated
		 */
		EEnum HEMISPHERE_NS = eINSTANCE.getHemisphereNS();

		/**
		 * The meta object literal for the '{@link Gtm.InterfaceType <em>Interface Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.InterfaceType
		 * @see Gtm.impl.GtmPackageImpl#getInterfaceType()
		 * @generated
		 */
		EEnum INTERFACE_TYPE = eINSTANCE.getInterfaceType();

		/**
		 * The meta object literal for the '{@link Gtm.LegacyCalculationType <em>Legacy Calculation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.LegacyCalculationType
		 * @see Gtm.impl.GtmPackageImpl#getLegacyCalculationType()
		 * @generated
		 */
		EEnum LEGACY_CALCULATION_TYPE = eINSTANCE.getLegacyCalculationType();

		/**
		 * The meta object literal for the '{@link Gtm.LegacyPassengerType <em>Legacy Passenger Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.LegacyPassengerType
		 * @see Gtm.impl.GtmPackageImpl#getLegacyPassengerType()
		 * @generated
		 */
		EEnum LEGACY_PASSENGER_TYPE = eINSTANCE.getLegacyPassengerType();

		/**
		 * The meta object literal for the '{@link Gtm.LegacySeriesType <em>Legacy Series Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.LegacySeriesType
		 * @see Gtm.impl.GtmPackageImpl#getLegacySeriesType()
		 * @generated
		 */
		EEnum LEGACY_SERIES_TYPE = eINSTANCE.getLegacySeriesType();

		/**
		 * The meta object literal for the '{@link Gtm.OfferRequestType <em>Offer Request Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.OfferRequestType
		 * @see Gtm.impl.GtmPackageImpl#getOfferRequestType()
		 * @generated
		 */
		EEnum OFFER_REQUEST_TYPE = eINSTANCE.getOfferRequestType();

		/**
		 * The meta object literal for the '{@link Gtm.OnlineServiceType <em>Online Service Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.OnlineServiceType
		 * @see Gtm.impl.GtmPackageImpl#getOnlineServiceType()
		 * @generated
		 */
		EEnum ONLINE_SERVICE_TYPE = eINSTANCE.getOnlineServiceType();

		/**
		 * The meta object literal for the '{@link Gtm.PersonalDataItemsType <em>Personal Data Items Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.PersonalDataItemsType
		 * @see Gtm.impl.GtmPackageImpl#getPersonalDataItemsType()
		 * @generated
		 */
		EEnum PERSONAL_DATA_ITEMS_TYPE = eINSTANCE.getPersonalDataItemsType();

		/**
		 * The meta object literal for the '{@link Gtm.PersonalDataTransferType <em>Personal Data Transfer Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.PersonalDataTransferType
		 * @see Gtm.impl.GtmPackageImpl#getPersonalDataTransferType()
		 * @generated
		 */
		EEnum PERSONAL_DATA_TRANSFER_TYPE = eINSTANCE.getPersonalDataTransferType();

		/**
		 * The meta object literal for the '{@link Gtm.PersonalDataChangeReason <em>Personal Data Change Reason</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.PersonalDataChangeReason
		 * @see Gtm.impl.GtmPackageImpl#getPersonalDataChangeReason()
		 * @generated
		 */
		EEnum PERSONAL_DATA_CHANGE_REASON = eINSTANCE.getPersonalDataChangeReason();

		/**
		 * The meta object literal for the '{@link Gtm.ReservationTravelClass <em>Reservation Travel Class</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.ReservationTravelClass
		 * @see Gtm.impl.GtmPackageImpl#getReservationTravelClass()
		 * @generated
		 */
		EEnum RESERVATION_TRAVEL_CLASS = eINSTANCE.getReservationTravelClass();

		/**
		 * The meta object literal for the '{@link Gtm.ReservationServiceLevel <em>Reservation Service Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.ReservationServiceLevel
		 * @see Gtm.impl.GtmPackageImpl#getReservationServiceLevel()
		 * @generated
		 */
		EEnum RESERVATION_SERVICE_LEVEL = eINSTANCE.getReservationServiceLevel();

		/**
		 * The meta object literal for the '{@link Gtm.ReservationService <em>Reservation Service</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.ReservationService
		 * @see Gtm.impl.GtmPackageImpl#getReservationService()
		 * @generated
		 */
		EEnum RESERVATION_SERVICE = eINSTANCE.getReservationService();

		/**
		 * The meta object literal for the '{@link Gtm.ReservationBerthType <em>Reservation Berth Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.ReservationBerthType
		 * @see Gtm.impl.GtmPackageImpl#getReservationBerthType()
		 * @generated
		 */
		EEnum RESERVATION_BERTH_TYPE = eINSTANCE.getReservationBerthType();

		/**
		 * The meta object literal for the '{@link Gtm.SchemaVersion <em>Schema Version</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.SchemaVersion
		 * @see Gtm.impl.GtmPackageImpl#getSchemaVersion()
		 * @generated
		 */
		EEnum SCHEMA_VERSION = eINSTANCE.getSchemaVersion();

		/**
		 * The meta object literal for the '{@link Gtm.TimeZone <em>Time Zone</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.TimeZone
		 * @see Gtm.impl.GtmPackageImpl#getTimeZone()
		 * @generated
		 */
		EEnum TIME_ZONE = eINSTANCE.getTimeZone();

		/**
		 * The meta object literal for the '{@link Gtm.TaxScope <em>Tax Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.TaxScope
		 * @see Gtm.impl.GtmPackageImpl#getTaxScope()
		 * @generated
		 */
		EEnum TAX_SCOPE = eINSTANCE.getTaxScope();

		/**
		 * The meta object literal for the '{@link Gtm.TimeReferenceType <em>Time Reference Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.TimeReferenceType
		 * @see Gtm.impl.GtmPackageImpl#getTimeReferenceType()
		 * @generated
		 */
		EEnum TIME_REFERENCE_TYPE = eINSTANCE.getTimeReferenceType();

		/**
		 * The meta object literal for the '{@link Gtm.TimeRangeScope <em>Time Range Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.TimeRangeScope
		 * @see Gtm.impl.GtmPackageImpl#getTimeRangeScope()
		 * @generated
		 */
		EEnum TIME_RANGE_SCOPE = eINSTANCE.getTimeRangeScope();

		/**
		 * The meta object literal for the '{@link Gtm.TimeUnit <em>Time Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.TimeUnit
		 * @see Gtm.impl.GtmPackageImpl#getTimeUnit()
		 * @generated
		 */
		EEnum TIME_UNIT = eINSTANCE.getTimeUnit();

		/**
		 * The meta object literal for the '{@link Gtm.TravelerType <em>Traveler Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.TravelerType
		 * @see Gtm.impl.GtmPackageImpl#getTravelerType()
		 * @generated
		 */
		EEnum TRAVELER_TYPE = eINSTANCE.getTravelerType();

		/**
		 * The meta object literal for the '{@link Gtm.WeekDay <em>Week Day</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.WeekDay
		 * @see Gtm.impl.GtmPackageImpl#getWeekDay()
		 * @generated
		 */
		EEnum WEEK_DAY = eINSTANCE.getWeekDay();

		/**
		 * The meta object literal for the '{@link Gtm.DataSource <em>Data Source</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.DataSource
		 * @see Gtm.impl.GtmPackageImpl#getDataSource()
		 * @generated
		 */
		EEnum DATA_SOURCE = eINSTANCE.getDataSource();

		/**
		 * The meta object literal for the '{@link Gtm.ClassId <em>Class Id</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.ClassId
		 * @see Gtm.impl.GtmPackageImpl#getClassId()
		 * @generated
		 */
		EEnum CLASS_ID = eINSTANCE.getClassId();

	}

} //GtmPackage
