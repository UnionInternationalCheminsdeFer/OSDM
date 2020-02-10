/**
 */
package Gtm.impl;

import Gtm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GtmFactoryImpl extends EFactoryImpl implements GtmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GtmFactory init() {
		try {
			GtmFactory theGtmFactory = (GtmFactory)EPackage.Registry.INSTANCE.getEFactory(GtmPackage.eNS_URI);
			if (theGtmFactory != null) {
				return theGtmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GtmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GtmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GtmPackage.GTM_TOOL: return createGTMTool();
			case GtmPackage.CODE_LISTS: return createCodeLists();
			case GtmPackage.NUTS_CODES: return createNUTSCodes();
			case GtmPackage.NUTS_CODE: return createNutsCode();
			case GtmPackage.SERVICE_BRANDS: return createServiceBrands();
			case GtmPackage.SERVICE_BRAND: return createServiceBrand();
			case GtmPackage.COUNTRIES: return createCountries();
			case GtmPackage.COUNTRY: return createCountry();
			case GtmPackage.LANGUAGES: return createLanguages();
			case GtmPackage.LANGUAGE: return createLanguage();
			case GtmPackage.CURRENCIES: return createCurrencies();
			case GtmPackage.CURRENCY: return createCurrency();
			case GtmPackage.STATIONS: return createStations();
			case GtmPackage.STATION: return createStation();
			case GtmPackage.CARRIER: return createCarrier();
			case GtmPackage.CARRIERS: return createCarriers();
			case GtmPackage.GENERAL_TARIFF_MODEL: return createGeneralTariffModel();
			case GtmPackage.DELIVERY: return createDelivery();
			case GtmPackage.AFTER_SALES_RULES: return createAfterSalesRules();
			case GtmPackage.AFTER_SALES_RULE: return createAfterSalesRule();
			case GtmPackage.AFTER_SALES_CONDITION: return createAfterSalesCondition();
			case GtmPackage.APPLICATION_TIME: return createApplicationTime();
			case GtmPackage.FARE_STRUCTURE: return createFareStructure();
			case GtmPackage.CONNECTION_POINTS: return createConnectionPoints();
			case GtmPackage.CONNECTION_POINT: return createConnectionPoint();
			case GtmPackage.STATION_SET: return createStationSet();
			case GtmPackage.FARE_RESOURCE_LOCATIONS: return createFareResourceLocations();
			case GtmPackage.TRAIN_RESOURCE_LOCATIONS: return createTrainResourceLocations();
			case GtmPackage.STATION_RESOURCE_LOCATIONS: return createStationResourceLocations();
			case GtmPackage.CARRIER_RESOURCE_LOCATIONS: return createCarrierResourceLocations();
			case GtmPackage.TRAIN_RESOURCE_LOCATION: return createTrainResourceLocation();
			case GtmPackage.STATION_RESOURCE_LOCATION: return createStationResourceLocation();
			case GtmPackage.ONLINE_RESOURCE: return createOnlineResource();
			case GtmPackage.FULFILLMENT_CONSTRAINTS: return createFulfillmentConstraints();
			case GtmPackage.SUPPORTED_ONLINE_SERVICES: return createSupportedOnlineServices();
			case GtmPackage.ZONE_DEFINITIONS: return createZoneDefinitions();
			case GtmPackage.FARE_ELEMENT: return createFareElement();
			case GtmPackage.LEGACY_ACCOUNTING_IDENTIFIER: return createLegacyAccountingIdentifier();
			case GtmPackage.REDUCTION_CONSTRAINTS: return createReductionConstraints();
			case GtmPackage.FARE_ELEMENTS: return createFareElements();
			case GtmPackage.PERSONAL_DATA_CONSTRAINTS: return createPersonalDataConstraints();
			case GtmPackage.PERSONAL_DATA_CONSTRAINT: return createPersonalDataConstraint();
			case GtmPackage.REQUIRED_PERSONAL_DATA: return createRequiredPersonalData();
			case GtmPackage.ALLOWED_PERSONAL_DATA_CHANGES: return createAllowedPersonalDataChanges();
			case GtmPackage.PASSENGER_CONSTRAINTS: return createPassengerConstraints();
			case GtmPackage.PASSENGER_CONSTRAINT: return createPassengerConstraint();
			case GtmPackage.INCLUDED_FREE_PASSENGERS: return createIncludedFreePassengers();
			case GtmPackage.PASSENGER_COMBINATION_CONSTRAINT: return createPassengerCombinationConstraint();
			case GtmPackage.COMBINATION_CONSTRAINTS: return createCombinationConstraints();
			case GtmPackage.COMBINATION_CONSTRAINT: return createCombinationConstraint();
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINTS: return createTravelValidityConstraints();
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT: return createTravelValidityConstraint();
			case GtmPackage.SALES_AVAILABILITY_CONSTRAINTS: return createSalesAvailabilityConstraints();
			case GtmPackage.SALES_AVAILABILITY_CONSTRAINT: return createSalesAvailabilityConstraint();
			case GtmPackage.SALES_RESTRICTION: return createSalesRestriction();
			case GtmPackage.END_OF_SALE: return createEndOfSale();
			case GtmPackage.START_OF_SALE: return createStartOfSale();
			case GtmPackage.REDUCTION_CARDS: return createReductionCards();
			case GtmPackage.REDUCTION_CARD: return createReductionCard();
			case GtmPackage.CARRIER_CONSTRAINTS: return createCarrierConstraints();
			case GtmPackage.CARRIER_CONSTRAINT: return createCarrierConstraint();
			case GtmPackage.SERVICE_CONSTRAINTS: return createServiceConstraints();
			case GtmPackage.SERVICE_CONSTRAINT: return createServiceConstraint();
			case GtmPackage.REGIONAL_CONSTRAINTS: return createRegionalConstraints();
			case GtmPackage.REGIONAL_CONSTRAINT: return createRegionalConstraint();
			case GtmPackage.REGIONAL_VALIDITY: return createRegionalValidity();
			case GtmPackage.SERVICE_LEVEL_DEFINITIONS: return createServiceLevelDefinitions();
			case GtmPackage.TEXTS: return createTexts();
			case GtmPackage.TEXT: return createText();
			case GtmPackage.TRANSLATION: return createTranslation();
			case GtmPackage.PRICES: return createPrices();
			case GtmPackage.PRICE: return createPrice();
			case GtmPackage.VAT_DETAIL: return createVATDetail();
			case GtmPackage.CURRENCY_PRICE: return createCurrencyPrice();
			case GtmPackage.SERVICE_CLASS_DEFINITIONS: return createServiceClassDefinitions();
			case GtmPackage.CALENDARS: return createCalendars();
			case GtmPackage.CALENDAR: return createCalendar();
			case GtmPackage.RESERVATION_PARAMETERS: return createReservationParameters();
			case GtmPackage.RESERVATION_PARAMETER: return createReservationParameter();
			case GtmPackage.RESERVATION_PARAMS9181: return createReservationParams9181();
			case GtmPackage.RESERVATION_OPTIONS: return createReservationOptions();
			case GtmPackage.RESERVATION_PREFERENCE_GROUP: return createReservationPreferenceGroup();
			case GtmPackage.SERVICE_CLASS: return createServiceClass();
			case GtmPackage.SERVICE_LEVEL: return createServiceLevel();
			case GtmPackage.TIME_RANGE: return createTimeRange();
			case GtmPackage.EXCLUDED_TIME_RANGE: return createExcludedTimeRange();
			case GtmPackage.VALIDITY_RANGE: return createValidityRange();
			case GtmPackage.RELATIVE_TIME: return createRelativeTime();
			case GtmPackage.RETURN_VALIDITY_CONSTRAINT: return createReturnValidityConstraint();
			case GtmPackage.VIA_STATION: return createViaStation();
			case GtmPackage.ALTERNATIVE_ROUTE: return createAlternativeRoute();
			case GtmPackage.ROUTE: return createRoute();
			case GtmPackage.ZONE: return createZone();
			case GtmPackage.ZONE_DEFINITION: return createZoneDefinition();
			case GtmPackage.LINE: return createLine();
			case GtmPackage.POLYGONE: return createPolygone();
			case GtmPackage.EDGE: return createEdge();
			case GtmPackage.CARRIER_RESOURCE_LOCATION: return createCarrierResourceLocation();
			case GtmPackage.CROSS_BORDER_CONDITION: return createCrossBorderCondition();
			case GtmPackage.FARE_COMBINATION_MODEL: return createFareCombinationModel();
			case GtmPackage.FULFILLMENT_CONSTRAINT: return createFulfillmentConstraint();
			case GtmPackage.REQUIRED_BARCODES: return createRequiredBarcodes();
			case GtmPackage.ACCEPTED_BARCODES: return createAcceptedBarcodes();
			case GtmPackage.REDUCTION_CONSTRAINT: return createReductionConstraint();
			case GtmPackage.REQUIRED_REDUCTION_CARD: return createRequiredReductionCard();
			case GtmPackage.CONVERSION_FROM_LEGACY: return createConversionFromLegacy();
			case GtmPackage.CONVERSION_PARAMS: return createConversionParams();
			case GtmPackage.TARGET_FARE_TEMPLATE: return createTargetFareTemplate();
			case GtmPackage.LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPINGS: return createLegacyStationToServiceConstraintMappings();
			case GtmPackage.LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING: return createLegacyStationToServiceConstraintMapping();
			case GtmPackage.LEGACY_STATION_MAPPINGS: return createLegacyStationMappings();
			case GtmPackage.LEGACY_STATION_MAP: return createLegacyStationMap();
			case GtmPackage.LEGACY_STATION: return createLegacyStation();
			case GtmPackage.LEGACY_BODER_POINT_MAPPINGS: return createLegacyBoderPointMappings();
			case GtmPackage.LEGACY_BORDER_POINT_MAPPING: return createLegacyBorderPointMapping();
			case GtmPackage.LEGACY_DESCRIPTION: return createLegacyDescription();
			case GtmPackage.LEGACY_ZONE_MAPPINGS: return createLegacyZoneMappings();
			case GtmPackage.LEGACY_ZONE_MAP: return createLegacyZoneMap();
			case GtmPackage.LEGACY_FARES: return createLegacyFares();
			case GtmPackage.LEGACY_FARE: return createLegacyFare();
			case GtmPackage.LEGACY108: return createLegacy108();
			case GtmPackage.LEGACY108_STATIONS: return createLegacy108Stations();
			case GtmPackage.LEGACY108_STATION: return createLegacy108Station();
			case GtmPackage.LEGACY_ROUTE_FARES: return createLegacyRouteFares();
			case GtmPackage.LEGACY_ROUTE_FARE: return createLegacyRouteFare();
			case GtmPackage.LEGACY_SERIES: return createLegacySeries();
			case GtmPackage.LEGACY_SERIES_LIST: return createLegacySeriesList();
			case GtmPackage.LEGACY_DISTANCE_FARES: return createLegacyDistanceFares();
			case GtmPackage.LEGACY_DISTANCE_FARE: return createLegacyDistanceFare();
			case GtmPackage.LEGACY_VIASTATION: return createLegacyViastation();
			case GtmPackage.LEGACY_TARGET_FARES: return createLegacyTargetFares();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GtmPackage.AFTER_SALES_TRANSACTION_TYPE:
				return createAfterSalesTransactionTypeFromString(eDataType, initialValue);
			case GtmPackage.BARCODE_TYPES:
				return createBarcodeTypesFromString(eDataType, initialValue);
			case GtmPackage.CLASSIC_CLASS_TYPE:
				return createClassicClassTypeFromString(eDataType, initialValue);
			case GtmPackage.CHARACTER_SET:
				return createCharacterSetFromString(eDataType, initialValue);
			case GtmPackage.CLUSTERS:
				return createClustersFromString(eDataType, initialValue);
			case GtmPackage.COMBINATION_MODEL:
				return createCombinationModelFromString(eDataType, initialValue);
			case GtmPackage.CONTROL_DATA_EXCHANGE_TYPES:
				return createControlDataExchangeTypesFromString(eDataType, initialValue);
			case GtmPackage.FARE_TYPE:
				return createFareTypeFromString(eDataType, initialValue);
			case GtmPackage.FULFILLMENT_TYPE:
				return createFulfillmentTypeFromString(eDataType, initialValue);
			case GtmPackage.GEO_SYSTEM:
				return createGeoSystemFromString(eDataType, initialValue);
			case GtmPackage.GEO_UNIT:
				return createGeoUnitFromString(eDataType, initialValue);
			case GtmPackage.GRAPHICAL_RESERVATION_TYPE:
				return createGraphicalReservationTypeFromString(eDataType, initialValue);
			case GtmPackage.HEMISPHERE_EW:
				return createHemisphereEWFromString(eDataType, initialValue);
			case GtmPackage.HEMISPHERE_NS:
				return createHemisphereNSFromString(eDataType, initialValue);
			case GtmPackage.INTERFACE_TYPE:
				return createInterfaceTypeFromString(eDataType, initialValue);
			case GtmPackage.LEGACY_CALCULATION_TYPE:
				return createLegacyCalculationTypeFromString(eDataType, initialValue);
			case GtmPackage.LEGACY_PASSENGER_TYPE:
				return createLegacyPassengerTypeFromString(eDataType, initialValue);
			case GtmPackage.LEGACY_SERIES_TYPE:
				return createLegacySeriesTypeFromString(eDataType, initialValue);
			case GtmPackage.OFFER_REQUEST_TYPE:
				return createOfferRequestTypeFromString(eDataType, initialValue);
			case GtmPackage.ONLINE_SERVICE_TYPE:
				return createOnlineServiceTypeFromString(eDataType, initialValue);
			case GtmPackage.PERSONAL_DATA_ITEMS_TYPE:
				return createPersonalDataItemsTypeFromString(eDataType, initialValue);
			case GtmPackage.PERSONAL_DATA_TRANSFER_TYPE:
				return createPersonalDataTransferTypeFromString(eDataType, initialValue);
			case GtmPackage.PERSONAL_DATA_CHANGE_REASON:
				return createPersonalDataChangeReasonFromString(eDataType, initialValue);
			case GtmPackage.RESERVATION_TRAVEL_CLASS:
				return createReservationTravelClassFromString(eDataType, initialValue);
			case GtmPackage.RESERVATION_SERVICE_LEVEL:
				return createReservationServiceLevelFromString(eDataType, initialValue);
			case GtmPackage.RESERVATION_SERVICE:
				return createReservationServiceFromString(eDataType, initialValue);
			case GtmPackage.RESERVATION_BERTH_TYPE:
				return createReservationBerthTypeFromString(eDataType, initialValue);
			case GtmPackage.SCHEMA_VERSION:
				return createSchemaVersionFromString(eDataType, initialValue);
			case GtmPackage.TIME_ZONE:
				return createTimeZoneFromString(eDataType, initialValue);
			case GtmPackage.TAX_SCOPE:
				return createTaxScopeFromString(eDataType, initialValue);
			case GtmPackage.TIME_REFERENCE_TYPE:
				return createTimeReferenceTypeFromString(eDataType, initialValue);
			case GtmPackage.TIME_RANGE_SCOPE:
				return createTimeRangeScopeFromString(eDataType, initialValue);
			case GtmPackage.TIME_UNIT:
				return createTimeUnitFromString(eDataType, initialValue);
			case GtmPackage.TRAVELER_TYPE:
				return createTravelerTypeFromString(eDataType, initialValue);
			case GtmPackage.WEEK_DAY:
				return createWeekDayFromString(eDataType, initialValue);
			case GtmPackage.DATA_SOURCE:
				return createDataSourceFromString(eDataType, initialValue);
			case GtmPackage.CLASS_ID:
				return createClassIdFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GtmPackage.AFTER_SALES_TRANSACTION_TYPE:
				return convertAfterSalesTransactionTypeToString(eDataType, instanceValue);
			case GtmPackage.BARCODE_TYPES:
				return convertBarcodeTypesToString(eDataType, instanceValue);
			case GtmPackage.CLASSIC_CLASS_TYPE:
				return convertClassicClassTypeToString(eDataType, instanceValue);
			case GtmPackage.CHARACTER_SET:
				return convertCharacterSetToString(eDataType, instanceValue);
			case GtmPackage.CLUSTERS:
				return convertClustersToString(eDataType, instanceValue);
			case GtmPackage.COMBINATION_MODEL:
				return convertCombinationModelToString(eDataType, instanceValue);
			case GtmPackage.CONTROL_DATA_EXCHANGE_TYPES:
				return convertControlDataExchangeTypesToString(eDataType, instanceValue);
			case GtmPackage.FARE_TYPE:
				return convertFareTypeToString(eDataType, instanceValue);
			case GtmPackage.FULFILLMENT_TYPE:
				return convertFulfillmentTypeToString(eDataType, instanceValue);
			case GtmPackage.GEO_SYSTEM:
				return convertGeoSystemToString(eDataType, instanceValue);
			case GtmPackage.GEO_UNIT:
				return convertGeoUnitToString(eDataType, instanceValue);
			case GtmPackage.GRAPHICAL_RESERVATION_TYPE:
				return convertGraphicalReservationTypeToString(eDataType, instanceValue);
			case GtmPackage.HEMISPHERE_EW:
				return convertHemisphereEWToString(eDataType, instanceValue);
			case GtmPackage.HEMISPHERE_NS:
				return convertHemisphereNSToString(eDataType, instanceValue);
			case GtmPackage.INTERFACE_TYPE:
				return convertInterfaceTypeToString(eDataType, instanceValue);
			case GtmPackage.LEGACY_CALCULATION_TYPE:
				return convertLegacyCalculationTypeToString(eDataType, instanceValue);
			case GtmPackage.LEGACY_PASSENGER_TYPE:
				return convertLegacyPassengerTypeToString(eDataType, instanceValue);
			case GtmPackage.LEGACY_SERIES_TYPE:
				return convertLegacySeriesTypeToString(eDataType, instanceValue);
			case GtmPackage.OFFER_REQUEST_TYPE:
				return convertOfferRequestTypeToString(eDataType, instanceValue);
			case GtmPackage.ONLINE_SERVICE_TYPE:
				return convertOnlineServiceTypeToString(eDataType, instanceValue);
			case GtmPackage.PERSONAL_DATA_ITEMS_TYPE:
				return convertPersonalDataItemsTypeToString(eDataType, instanceValue);
			case GtmPackage.PERSONAL_DATA_TRANSFER_TYPE:
				return convertPersonalDataTransferTypeToString(eDataType, instanceValue);
			case GtmPackage.PERSONAL_DATA_CHANGE_REASON:
				return convertPersonalDataChangeReasonToString(eDataType, instanceValue);
			case GtmPackage.RESERVATION_TRAVEL_CLASS:
				return convertReservationTravelClassToString(eDataType, instanceValue);
			case GtmPackage.RESERVATION_SERVICE_LEVEL:
				return convertReservationServiceLevelToString(eDataType, instanceValue);
			case GtmPackage.RESERVATION_SERVICE:
				return convertReservationServiceToString(eDataType, instanceValue);
			case GtmPackage.RESERVATION_BERTH_TYPE:
				return convertReservationBerthTypeToString(eDataType, instanceValue);
			case GtmPackage.SCHEMA_VERSION:
				return convertSchemaVersionToString(eDataType, instanceValue);
			case GtmPackage.TIME_ZONE:
				return convertTimeZoneToString(eDataType, instanceValue);
			case GtmPackage.TAX_SCOPE:
				return convertTaxScopeToString(eDataType, instanceValue);
			case GtmPackage.TIME_REFERENCE_TYPE:
				return convertTimeReferenceTypeToString(eDataType, instanceValue);
			case GtmPackage.TIME_RANGE_SCOPE:
				return convertTimeRangeScopeToString(eDataType, instanceValue);
			case GtmPackage.TIME_UNIT:
				return convertTimeUnitToString(eDataType, instanceValue);
			case GtmPackage.TRAVELER_TYPE:
				return convertTravelerTypeToString(eDataType, instanceValue);
			case GtmPackage.WEEK_DAY:
				return convertWeekDayToString(eDataType, instanceValue);
			case GtmPackage.DATA_SOURCE:
				return convertDataSourceToString(eDataType, instanceValue);
			case GtmPackage.CLASS_ID:
				return convertClassIdToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GTMTool createGTMTool() {
		GTMToolImpl gtmTool = new GTMToolImpl();
		return gtmTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeLists createCodeLists() {
		CodeListsImpl codeLists = new CodeListsImpl();
		return codeLists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUTSCodes createNUTSCodes() {
		NUTSCodesImpl nutsCodes = new NUTSCodesImpl();
		return nutsCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutsCode createNutsCode() {
		NutsCodeImpl nutsCode = new NutsCodeImpl();
		return nutsCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBrands createServiceBrands() {
		ServiceBrandsImpl serviceBrands = new ServiceBrandsImpl();
		return serviceBrands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBrand createServiceBrand() {
		ServiceBrandImpl serviceBrand = new ServiceBrandImpl();
		return serviceBrand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Countries createCountries() {
		CountriesImpl countries = new CountriesImpl();
		return countries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country createCountry() {
		CountryImpl country = new CountryImpl();
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Languages createLanguages() {
		LanguagesImpl languages = new LanguagesImpl();
		return languages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language createLanguage() {
		LanguageImpl language = new LanguageImpl();
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Currencies createCurrencies() {
		CurrenciesImpl currencies = new CurrenciesImpl();
		return currencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Currency createCurrency() {
		CurrencyImpl currency = new CurrencyImpl();
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stations createStations() {
		StationsImpl stations = new StationsImpl();
		return stations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station createStation() {
		StationImpl station = new StationImpl();
		return station;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carrier createCarrier() {
		CarrierImpl carrier = new CarrierImpl();
		return carrier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carriers createCarriers() {
		CarriersImpl carriers = new CarriersImpl();
		return carriers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralTariffModel createGeneralTariffModel() {
		GeneralTariffModelImpl generalTariffModel = new GeneralTariffModelImpl();
		return generalTariffModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delivery createDelivery() {
		DeliveryImpl delivery = new DeliveryImpl();
		return delivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AfterSalesRules createAfterSalesRules() {
		AfterSalesRulesImpl afterSalesRules = new AfterSalesRulesImpl();
		return afterSalesRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AfterSalesRule createAfterSalesRule() {
		AfterSalesRuleImpl afterSalesRule = new AfterSalesRuleImpl();
		return afterSalesRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AfterSalesCondition createAfterSalesCondition() {
		AfterSalesConditionImpl afterSalesCondition = new AfterSalesConditionImpl();
		return afterSalesCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationTime createApplicationTime() {
		ApplicationTimeImpl applicationTime = new ApplicationTimeImpl();
		return applicationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FareStructure createFareStructure() {
		FareStructureImpl fareStructure = new FareStructureImpl();
		return fareStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPoints createConnectionPoints() {
		ConnectionPointsImpl connectionPoints = new ConnectionPointsImpl();
		return connectionPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPoint createConnectionPoint() {
		ConnectionPointImpl connectionPoint = new ConnectionPointImpl();
		return connectionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationSet createStationSet() {
		StationSetImpl stationSet = new StationSetImpl();
		return stationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FareResourceLocations createFareResourceLocations() {
		FareResourceLocationsImpl fareResourceLocations = new FareResourceLocationsImpl();
		return fareResourceLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainResourceLocations createTrainResourceLocations() {
		TrainResourceLocationsImpl trainResourceLocations = new TrainResourceLocationsImpl();
		return trainResourceLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationResourceLocations createStationResourceLocations() {
		StationResourceLocationsImpl stationResourceLocations = new StationResourceLocationsImpl();
		return stationResourceLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarrierResourceLocations createCarrierResourceLocations() {
		CarrierResourceLocationsImpl carrierResourceLocations = new CarrierResourceLocationsImpl();
		return carrierResourceLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainResourceLocation createTrainResourceLocation() {
		TrainResourceLocationImpl trainResourceLocation = new TrainResourceLocationImpl();
		return trainResourceLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationResourceLocation createStationResourceLocation() {
		StationResourceLocationImpl stationResourceLocation = new StationResourceLocationImpl();
		return stationResourceLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnlineResource createOnlineResource() {
		OnlineResourceImpl onlineResource = new OnlineResourceImpl();
		return onlineResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FulfillmentConstraints createFulfillmentConstraints() {
		FulfillmentConstraintsImpl fulfillmentConstraints = new FulfillmentConstraintsImpl();
		return fulfillmentConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportedOnlineServices createSupportedOnlineServices() {
		SupportedOnlineServicesImpl supportedOnlineServices = new SupportedOnlineServicesImpl();
		return supportedOnlineServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZoneDefinitions createZoneDefinitions() {
		ZoneDefinitionsImpl zoneDefinitions = new ZoneDefinitionsImpl();
		return zoneDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FareElement createFareElement() {
		FareElementImpl fareElement = new FareElementImpl();
		return fareElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyAccountingIdentifier createLegacyAccountingIdentifier() {
		LegacyAccountingIdentifierImpl legacyAccountingIdentifier = new LegacyAccountingIdentifierImpl();
		return legacyAccountingIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReductionConstraints createReductionConstraints() {
		ReductionConstraintsImpl reductionConstraints = new ReductionConstraintsImpl();
		return reductionConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FareElements createFareElements() {
		FareElementsImpl fareElements = new FareElementsImpl();
		return fareElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonalDataConstraints createPersonalDataConstraints() {
		PersonalDataConstraintsImpl personalDataConstraints = new PersonalDataConstraintsImpl();
		return personalDataConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonalDataConstraint createPersonalDataConstraint() {
		PersonalDataConstraintImpl personalDataConstraint = new PersonalDataConstraintImpl();
		return personalDataConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredPersonalData createRequiredPersonalData() {
		RequiredPersonalDataImpl requiredPersonalData = new RequiredPersonalDataImpl();
		return requiredPersonalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowedPersonalDataChanges createAllowedPersonalDataChanges() {
		AllowedPersonalDataChangesImpl allowedPersonalDataChanges = new AllowedPersonalDataChangesImpl();
		return allowedPersonalDataChanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassengerConstraints createPassengerConstraints() {
		PassengerConstraintsImpl passengerConstraints = new PassengerConstraintsImpl();
		return passengerConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassengerConstraint createPassengerConstraint() {
		PassengerConstraintImpl passengerConstraint = new PassengerConstraintImpl();
		return passengerConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludedFreePassengers createIncludedFreePassengers() {
		IncludedFreePassengersImpl includedFreePassengers = new IncludedFreePassengersImpl();
		return includedFreePassengers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassengerCombinationConstraint createPassengerCombinationConstraint() {
		PassengerCombinationConstraintImpl passengerCombinationConstraint = new PassengerCombinationConstraintImpl();
		return passengerCombinationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinationConstraints createCombinationConstraints() {
		CombinationConstraintsImpl combinationConstraints = new CombinationConstraintsImpl();
		return combinationConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinationConstraint createCombinationConstraint() {
		CombinationConstraintImpl combinationConstraint = new CombinationConstraintImpl();
		return combinationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelValidityConstraints createTravelValidityConstraints() {
		TravelValidityConstraintsImpl travelValidityConstraints = new TravelValidityConstraintsImpl();
		return travelValidityConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelValidityConstraint createTravelValidityConstraint() {
		TravelValidityConstraintImpl travelValidityConstraint = new TravelValidityConstraintImpl();
		return travelValidityConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalesAvailabilityConstraints createSalesAvailabilityConstraints() {
		SalesAvailabilityConstraintsImpl salesAvailabilityConstraints = new SalesAvailabilityConstraintsImpl();
		return salesAvailabilityConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalesAvailabilityConstraint createSalesAvailabilityConstraint() {
		SalesAvailabilityConstraintImpl salesAvailabilityConstraint = new SalesAvailabilityConstraintImpl();
		return salesAvailabilityConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalesRestriction createSalesRestriction() {
		SalesRestrictionImpl salesRestriction = new SalesRestrictionImpl();
		return salesRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndOfSale createEndOfSale() {
		EndOfSaleImpl endOfSale = new EndOfSaleImpl();
		return endOfSale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartOfSale createStartOfSale() {
		StartOfSaleImpl startOfSale = new StartOfSaleImpl();
		return startOfSale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReductionCards createReductionCards() {
		ReductionCardsImpl reductionCards = new ReductionCardsImpl();
		return reductionCards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReductionCard createReductionCard() {
		ReductionCardImpl reductionCard = new ReductionCardImpl();
		return reductionCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarrierConstraints createCarrierConstraints() {
		CarrierConstraintsImpl carrierConstraints = new CarrierConstraintsImpl();
		return carrierConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarrierConstraint createCarrierConstraint() {
		CarrierConstraintImpl carrierConstraint = new CarrierConstraintImpl();
		return carrierConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConstraints createServiceConstraints() {
		ServiceConstraintsImpl serviceConstraints = new ServiceConstraintsImpl();
		return serviceConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConstraint createServiceConstraint() {
		ServiceConstraintImpl serviceConstraint = new ServiceConstraintImpl();
		return serviceConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionalConstraints createRegionalConstraints() {
		RegionalConstraintsImpl regionalConstraints = new RegionalConstraintsImpl();
		return regionalConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionalConstraint createRegionalConstraint() {
		RegionalConstraintImpl regionalConstraint = new RegionalConstraintImpl();
		return regionalConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionalValidity createRegionalValidity() {
		RegionalValidityImpl regionalValidity = new RegionalValidityImpl();
		return regionalValidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevelDefinitions createServiceLevelDefinitions() {
		ServiceLevelDefinitionsImpl serviceLevelDefinitions = new ServiceLevelDefinitionsImpl();
		return serviceLevelDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Texts createTexts() {
		TextsImpl texts = new TextsImpl();
		return texts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Translation createTranslation() {
		TranslationImpl translation = new TranslationImpl();
		return translation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prices createPrices() {
		PricesImpl prices = new PricesImpl();
		return prices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Price createPrice() {
		PriceImpl price = new PriceImpl();
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VATDetail createVATDetail() {
		VATDetailImpl vatDetail = new VATDetailImpl();
		return vatDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrencyPrice createCurrencyPrice() {
		CurrencyPriceImpl currencyPrice = new CurrencyPriceImpl();
		return currencyPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceClassDefinitions createServiceClassDefinitions() {
		ServiceClassDefinitionsImpl serviceClassDefinitions = new ServiceClassDefinitionsImpl();
		return serviceClassDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendars createCalendars() {
		CalendarsImpl calendars = new CalendarsImpl();
		return calendars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendar createCalendar() {
		CalendarImpl calendar = new CalendarImpl();
		return calendar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationParameters createReservationParameters() {
		ReservationParametersImpl reservationParameters = new ReservationParametersImpl();
		return reservationParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationParameter createReservationParameter() {
		ReservationParameterImpl reservationParameter = new ReservationParameterImpl();
		return reservationParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationParams9181 createReservationParams9181() {
		ReservationParams9181Impl reservationParams9181 = new ReservationParams9181Impl();
		return reservationParams9181;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationOptions createReservationOptions() {
		ReservationOptionsImpl reservationOptions = new ReservationOptionsImpl();
		return reservationOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationPreferenceGroup createReservationPreferenceGroup() {
		ReservationPreferenceGroupImpl reservationPreferenceGroup = new ReservationPreferenceGroupImpl();
		return reservationPreferenceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceClass createServiceClass() {
		ServiceClassImpl serviceClass = new ServiceClassImpl();
		return serviceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevel createServiceLevel() {
		ServiceLevelImpl serviceLevel = new ServiceLevelImpl();
		return serviceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeRange createTimeRange() {
		TimeRangeImpl timeRange = new TimeRangeImpl();
		return timeRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcludedTimeRange createExcludedTimeRange() {
		ExcludedTimeRangeImpl excludedTimeRange = new ExcludedTimeRangeImpl();
		return excludedTimeRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidityRange createValidityRange() {
		ValidityRangeImpl validityRange = new ValidityRangeImpl();
		return validityRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeTime createRelativeTime() {
		RelativeTimeImpl relativeTime = new RelativeTimeImpl();
		return relativeTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnValidityConstraint createReturnValidityConstraint() {
		ReturnValidityConstraintImpl returnValidityConstraint = new ReturnValidityConstraintImpl();
		return returnValidityConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViaStation createViaStation() {
		ViaStationImpl viaStation = new ViaStationImpl();
		return viaStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlternativeRoute createAlternativeRoute() {
		AlternativeRouteImpl alternativeRoute = new AlternativeRouteImpl();
		return alternativeRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route createRoute() {
		RouteImpl route = new RouteImpl();
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zone createZone() {
		ZoneImpl zone = new ZoneImpl();
		return zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZoneDefinition createZoneDefinition() {
		ZoneDefinitionImpl zoneDefinition = new ZoneDefinitionImpl();
		return zoneDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line createLine() {
		LineImpl line = new LineImpl();
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Polygone createPolygone() {
		PolygoneImpl polygone = new PolygoneImpl();
		return polygone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge createEdge() {
		EdgeImpl edge = new EdgeImpl();
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarrierResourceLocation createCarrierResourceLocation() {
		CarrierResourceLocationImpl carrierResourceLocation = new CarrierResourceLocationImpl();
		return carrierResourceLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrossBorderCondition createCrossBorderCondition() {
		CrossBorderConditionImpl crossBorderCondition = new CrossBorderConditionImpl();
		return crossBorderCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FareCombinationModel createFareCombinationModel() {
		FareCombinationModelImpl fareCombinationModel = new FareCombinationModelImpl();
		return fareCombinationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FulfillmentConstraint createFulfillmentConstraint() {
		FulfillmentConstraintImpl fulfillmentConstraint = new FulfillmentConstraintImpl();
		return fulfillmentConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredBarcodes createRequiredBarcodes() {
		RequiredBarcodesImpl requiredBarcodes = new RequiredBarcodesImpl();
		return requiredBarcodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptedBarcodes createAcceptedBarcodes() {
		AcceptedBarcodesImpl acceptedBarcodes = new AcceptedBarcodesImpl();
		return acceptedBarcodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReductionConstraint createReductionConstraint() {
		ReductionConstraintImpl reductionConstraint = new ReductionConstraintImpl();
		return reductionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredReductionCard createRequiredReductionCard() {
		RequiredReductionCardImpl requiredReductionCard = new RequiredReductionCardImpl();
		return requiredReductionCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversionFromLegacy createConversionFromLegacy() {
		ConversionFromLegacyImpl conversionFromLegacy = new ConversionFromLegacyImpl();
		return conversionFromLegacy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversionParams createConversionParams() {
		ConversionParamsImpl conversionParams = new ConversionParamsImpl();
		return conversionParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetFareTemplate createTargetFareTemplate() {
		TargetFareTemplateImpl targetFareTemplate = new TargetFareTemplateImpl();
		return targetFareTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyStationToServiceConstraintMappings createLegacyStationToServiceConstraintMappings() {
		LegacyStationToServiceConstraintMappingsImpl legacyStationToServiceConstraintMappings = new LegacyStationToServiceConstraintMappingsImpl();
		return legacyStationToServiceConstraintMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyStationToServiceConstraintMapping createLegacyStationToServiceConstraintMapping() {
		LegacyStationToServiceConstraintMappingImpl legacyStationToServiceConstraintMapping = new LegacyStationToServiceConstraintMappingImpl();
		return legacyStationToServiceConstraintMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyStationMappings createLegacyStationMappings() {
		LegacyStationMappingsImpl legacyStationMappings = new LegacyStationMappingsImpl();
		return legacyStationMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyStationMap createLegacyStationMap() {
		LegacyStationMapImpl legacyStationMap = new LegacyStationMapImpl();
		return legacyStationMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyStation createLegacyStation() {
		LegacyStationImpl legacyStation = new LegacyStationImpl();
		return legacyStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyBoderPointMappings createLegacyBoderPointMappings() {
		LegacyBoderPointMappingsImpl legacyBoderPointMappings = new LegacyBoderPointMappingsImpl();
		return legacyBoderPointMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyBorderPointMapping createLegacyBorderPointMapping() {
		LegacyBorderPointMappingImpl legacyBorderPointMapping = new LegacyBorderPointMappingImpl();
		return legacyBorderPointMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyDescription createLegacyDescription() {
		LegacyDescriptionImpl legacyDescription = new LegacyDescriptionImpl();
		return legacyDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyZoneMappings createLegacyZoneMappings() {
		LegacyZoneMappingsImpl legacyZoneMappings = new LegacyZoneMappingsImpl();
		return legacyZoneMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyZoneMap createLegacyZoneMap() {
		LegacyZoneMapImpl legacyZoneMap = new LegacyZoneMapImpl();
		return legacyZoneMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyFares createLegacyFares() {
		LegacyFaresImpl legacyFares = new LegacyFaresImpl();
		return legacyFares;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyFare createLegacyFare() {
		LegacyFareImpl legacyFare = new LegacyFareImpl();
		return legacyFare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Legacy108 createLegacy108() {
		Legacy108Impl legacy108 = new Legacy108Impl();
		return legacy108;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Legacy108Stations createLegacy108Stations() {
		Legacy108StationsImpl legacy108Stations = new Legacy108StationsImpl();
		return legacy108Stations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Legacy108Station createLegacy108Station() {
		Legacy108StationImpl legacy108Station = new Legacy108StationImpl();
		return legacy108Station;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyRouteFares createLegacyRouteFares() {
		LegacyRouteFaresImpl legacyRouteFares = new LegacyRouteFaresImpl();
		return legacyRouteFares;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyRouteFare createLegacyRouteFare() {
		LegacyRouteFareImpl legacyRouteFare = new LegacyRouteFareImpl();
		return legacyRouteFare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacySeries createLegacySeries() {
		LegacySeriesImpl legacySeries = new LegacySeriesImpl();
		return legacySeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacySeriesList createLegacySeriesList() {
		LegacySeriesListImpl legacySeriesList = new LegacySeriesListImpl();
		return legacySeriesList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyDistanceFares createLegacyDistanceFares() {
		LegacyDistanceFaresImpl legacyDistanceFares = new LegacyDistanceFaresImpl();
		return legacyDistanceFares;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyDistanceFare createLegacyDistanceFare() {
		LegacyDistanceFareImpl legacyDistanceFare = new LegacyDistanceFareImpl();
		return legacyDistanceFare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyViastation createLegacyViastation() {
		LegacyViastationImpl legacyViastation = new LegacyViastationImpl();
		return legacyViastation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyTargetFares createLegacyTargetFares() {
		LegacyTargetFaresImpl legacyTargetFares = new LegacyTargetFaresImpl();
		return legacyTargetFares;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AfterSalesTransactionType createAfterSalesTransactionTypeFromString(EDataType eDataType, String initialValue) {
		AfterSalesTransactionType result = AfterSalesTransactionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAfterSalesTransactionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BarcodeTypes createBarcodeTypesFromString(EDataType eDataType, String initialValue) {
		BarcodeTypes result = BarcodeTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBarcodeTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassicClassType createClassicClassTypeFromString(EDataType eDataType, String initialValue) {
		ClassicClassType result = ClassicClassType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassicClassTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterSet createCharacterSetFromString(EDataType eDataType, String initialValue) {
		CharacterSet result = CharacterSet.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharacterSetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clusters createClustersFromString(EDataType eDataType, String initialValue) {
		Clusters result = Clusters.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClustersToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinationModel createCombinationModelFromString(EDataType eDataType, String initialValue) {
		CombinationModel result = CombinationModel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCombinationModelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlDataExchangeTypes createControlDataExchangeTypesFromString(EDataType eDataType, String initialValue) {
		ControlDataExchangeTypes result = ControlDataExchangeTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertControlDataExchangeTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FareType createFareTypeFromString(EDataType eDataType, String initialValue) {
		FareType result = FareType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFareTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FulfillmentType createFulfillmentTypeFromString(EDataType eDataType, String initialValue) {
		FulfillmentType result = FulfillmentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFulfillmentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoSystem createGeoSystemFromString(EDataType eDataType, String initialValue) {
		GeoSystem result = GeoSystem.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeoSystemToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoUnit createGeoUnitFromString(EDataType eDataType, String initialValue) {
		GeoUnit result = GeoUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeoUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalReservationType createGraphicalReservationTypeFromString(EDataType eDataType, String initialValue) {
		GraphicalReservationType result = GraphicalReservationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGraphicalReservationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HemisphereEW createHemisphereEWFromString(EDataType eDataType, String initialValue) {
		HemisphereEW result = HemisphereEW.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHemisphereEWToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HemisphereNS createHemisphereNSFromString(EDataType eDataType, String initialValue) {
		HemisphereNS result = HemisphereNS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHemisphereNSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceType createInterfaceTypeFromString(EDataType eDataType, String initialValue) {
		InterfaceType result = InterfaceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterfaceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyCalculationType createLegacyCalculationTypeFromString(EDataType eDataType, String initialValue) {
		LegacyCalculationType result = LegacyCalculationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLegacyCalculationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyPassengerType createLegacyPassengerTypeFromString(EDataType eDataType, String initialValue) {
		LegacyPassengerType result = LegacyPassengerType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLegacyPassengerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacySeriesType createLegacySeriesTypeFromString(EDataType eDataType, String initialValue) {
		LegacySeriesType result = LegacySeriesType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLegacySeriesTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OfferRequestType createOfferRequestTypeFromString(EDataType eDataType, String initialValue) {
		OfferRequestType result = OfferRequestType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOfferRequestTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnlineServiceType createOnlineServiceTypeFromString(EDataType eDataType, String initialValue) {
		OnlineServiceType result = OnlineServiceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOnlineServiceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonalDataItemsType createPersonalDataItemsTypeFromString(EDataType eDataType, String initialValue) {
		PersonalDataItemsType result = PersonalDataItemsType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersonalDataItemsTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonalDataTransferType createPersonalDataTransferTypeFromString(EDataType eDataType, String initialValue) {
		PersonalDataTransferType result = PersonalDataTransferType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersonalDataTransferTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonalDataChangeReason createPersonalDataChangeReasonFromString(EDataType eDataType, String initialValue) {
		PersonalDataChangeReason result = PersonalDataChangeReason.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersonalDataChangeReasonToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationTravelClass createReservationTravelClassFromString(EDataType eDataType, String initialValue) {
		ReservationTravelClass result = ReservationTravelClass.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReservationTravelClassToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationServiceLevel createReservationServiceLevelFromString(EDataType eDataType, String initialValue) {
		ReservationServiceLevel result = ReservationServiceLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReservationServiceLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationService createReservationServiceFromString(EDataType eDataType, String initialValue) {
		ReservationService result = ReservationService.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReservationServiceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationBerthType createReservationBerthTypeFromString(EDataType eDataType, String initialValue) {
		ReservationBerthType result = ReservationBerthType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReservationBerthTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaVersion createSchemaVersionFromString(EDataType eDataType, String initialValue) {
		SchemaVersion result = SchemaVersion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchemaVersionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeZone createTimeZoneFromString(EDataType eDataType, String initialValue) {
		TimeZone result = TimeZone.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeZoneToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxScope createTaxScopeFromString(EDataType eDataType, String initialValue) {
		TaxScope result = TaxScope.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaxScopeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeReferenceType createTimeReferenceTypeFromString(EDataType eDataType, String initialValue) {
		TimeReferenceType result = TimeReferenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeReferenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeRangeScope createTimeRangeScopeFromString(EDataType eDataType, String initialValue) {
		TimeRangeScope result = TimeRangeScope.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeRangeScopeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit createTimeUnitFromString(EDataType eDataType, String initialValue) {
		TimeUnit result = TimeUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelerType createTravelerTypeFromString(EDataType eDataType, String initialValue) {
		TravelerType result = TravelerType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTravelerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeekDay createWeekDayFromString(EDataType eDataType, String initialValue) {
		WeekDay result = WeekDay.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWeekDayToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSource createDataSourceFromString(EDataType eDataType, String initialValue) {
		DataSource result = DataSource.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataSourceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassId createClassIdFromString(EDataType eDataType, String initialValue) {
		ClassId result = ClassId.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassIdToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GtmPackage getGtmPackage() {
		return (GtmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GtmPackage getPackage() {
		return GtmPackage.eINSTANCE;
	}

} //GtmFactoryImpl
