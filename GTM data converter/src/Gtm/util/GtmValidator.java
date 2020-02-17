/**
 */
package Gtm.util;

import Gtm.*;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;
import Gtm.nls.NationalLanguageSupport;


/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage
 * @generated
 */
public class GtmValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GtmValidator INSTANCE = new GtmValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "Gtm";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GtmValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return GtmPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case GtmPackage.GTM_TOOL:
				return validateGTMTool((GTMTool)value, diagnostics, context);
			case GtmPackage.CODE_LISTS:
				return validateCodeLists((CodeLists)value, diagnostics, context);
			case GtmPackage.NUTS_CODES:
				return validateNUTSCodes((NUTSCodes)value, diagnostics, context);
			case GtmPackage.NUTS_CODE:
				return validateNutsCode((NutsCode)value, diagnostics, context);
			case GtmPackage.SERVICE_BRANDS:
				return validateServiceBrands((ServiceBrands)value, diagnostics, context);
			case GtmPackage.SERVICE_BRAND:
				return validateServiceBrand((ServiceBrand)value, diagnostics, context);
			case GtmPackage.COUNTRIES:
				return validateCountries((Countries)value, diagnostics, context);
			case GtmPackage.COUNTRY:
				return validateCountry((Country)value, diagnostics, context);
			case GtmPackage.LANGUAGES:
				return validateLanguages((Languages)value, diagnostics, context);
			case GtmPackage.LANGUAGE:
				return validateLanguage((Language)value, diagnostics, context);
			case GtmPackage.CURRENCIES:
				return validateCurrencies((Currencies)value, diagnostics, context);
			case GtmPackage.CURRENCY:
				return validateCurrency((Currency)value, diagnostics, context);
			case GtmPackage.STATIONS:
				return validateStations((Stations)value, diagnostics, context);
			case GtmPackage.STATION:
				return validateStation((Station)value, diagnostics, context);
			case GtmPackage.CARRIER:
				return validateCarrier((Carrier)value, diagnostics, context);
			case GtmPackage.CARRIERS:
				return validateCarriers((Carriers)value, diagnostics, context);
			case GtmPackage.STATION_SET:
				return validateStationSet((StationSet)value, diagnostics, context);
			case GtmPackage.GENERAL_TARIFF_MODEL:
				return validateGeneralTariffModel((GeneralTariffModel)value, diagnostics, context);
			case GtmPackage.DELIVERY:
				return validateDelivery((Delivery)value, diagnostics, context);
			case GtmPackage.AFTER_SALES_RULES:
				return validateAfterSalesRules((AfterSalesRules)value, diagnostics, context);
			case GtmPackage.AFTER_SALES_RULE:
				return validateAfterSalesRule((AfterSalesRule)value, diagnostics, context);
			case GtmPackage.AFTER_SALES_CONDITION:
				return validateAfterSalesCondition((AfterSalesCondition)value, diagnostics, context);
			case GtmPackage.APPLICATION_TIME:
				return validateApplicationTime((ApplicationTime)value, diagnostics, context);
			case GtmPackage.FARE_STRUCTURE:
				return validateFareStructure((FareStructure)value, diagnostics, context);
			case GtmPackage.CONNECTION_POINTS:
				return validateConnectionPoints((ConnectionPoints)value, diagnostics, context);
			case GtmPackage.CONNECTION_POINT:
				return validateConnectionPoint((ConnectionPoint)value, diagnostics, context);
			case GtmPackage.FARE_RESOURCE_LOCATIONS:
				return validateFareResourceLocations((FareResourceLocations)value, diagnostics, context);
			case GtmPackage.TRAIN_RESOURCE_LOCATIONS:
				return validateTrainResourceLocations((TrainResourceLocations)value, diagnostics, context);
			case GtmPackage.STATION_RESOURCE_LOCATIONS:
				return validateStationResourceLocations((StationResourceLocations)value, diagnostics, context);
			case GtmPackage.CARRIER_RESOURCE_LOCATIONS:
				return validateCarrierResourceLocations((CarrierResourceLocations)value, diagnostics, context);
			case GtmPackage.TRAIN_RESOURCE_LOCATION:
				return validateTrainResourceLocation((TrainResourceLocation)value, diagnostics, context);
			case GtmPackage.STATION_RESOURCE_LOCATION:
				return validateStationResourceLocation((StationResourceLocation)value, diagnostics, context);
			case GtmPackage.ONLINE_RESOURCE:
				return validateOnlineResource((OnlineResource)value, diagnostics, context);
			case GtmPackage.FULFILLMENT_CONSTRAINTS:
				return validateFulfillmentConstraints((FulfillmentConstraints)value, diagnostics, context);
			case GtmPackage.FULFILLMENT_CONSTRAINT:
				return validateFulfillmentConstraint((FulfillmentConstraint)value, diagnostics, context);
			case GtmPackage.REQUIRED_BARCODES:
				return validateRequiredBarcodes((RequiredBarcodes)value, diagnostics, context);
			case GtmPackage.ACCEPTED_BARCODES:
				return validateAcceptedBarcodes((AcceptedBarcodes)value, diagnostics, context);
			case GtmPackage.SUPPORTED_ONLINE_SERVICES:
				return validateSupportedOnlineServices((SupportedOnlineServices)value, diagnostics, context);
			case GtmPackage.STATION_NAMES:
				return validateStationNames((StationNames)value, diagnostics, context);
			case GtmPackage.FARE_ELEMENT:
				return validateFareElement((FareElement)value, diagnostics, context);
			case GtmPackage.FARE_STATION_SET_DEFINITIONS:
				return validateFareStationSetDefinitions((FareStationSetDefinitions)value, diagnostics, context);
			case GtmPackage.FARE_STATION_SET_DEFINITION:
				return validateFareStationSetDefinition((FareStationSetDefinition)value, diagnostics, context);
			case GtmPackage.LEGACY_ACCOUNTING_IDENTIFIER:
				return validateLegacyAccountingIdentifier((LegacyAccountingIdentifier)value, diagnostics, context);
			case GtmPackage.REDUCTION_CONSTRAINTS:
				return validateReductionConstraints((ReductionConstraints)value, diagnostics, context);
			case GtmPackage.FARE_ELEMENTS:
				return validateFareElements((FareElements)value, diagnostics, context);
			case GtmPackage.PERSONAL_DATA_CONSTRAINTS:
				return validatePersonalDataConstraints((PersonalDataConstraints)value, diagnostics, context);
			case GtmPackage.PERSONAL_DATA_CONSTRAINT:
				return validatePersonalDataConstraint((PersonalDataConstraint)value, diagnostics, context);
			case GtmPackage.REQUIRED_PERSONAL_DATA:
				return validateRequiredPersonalData((RequiredPersonalData)value, diagnostics, context);
			case GtmPackage.ALLOWED_PERSONAL_DATA_CHANGES:
				return validateAllowedPersonalDataChanges((AllowedPersonalDataChanges)value, diagnostics, context);
			case GtmPackage.PASSENGER_CONSTRAINTS:
				return validatePassengerConstraints((PassengerConstraints)value, diagnostics, context);
			case GtmPackage.PASSENGER_CONSTRAINT:
				return validatePassengerConstraint((PassengerConstraint)value, diagnostics, context);
			case GtmPackage.PASSENGER_COMBINATION_CONSTRAINT:
				return validatePassengerCombinationConstraint((PassengerCombinationConstraint)value, diagnostics, context);
			case GtmPackage.INCLUDED_FREE_PASSENGER_LIMIT:
				return validateIncludedFreePassengerLimit((IncludedFreePassengerLimit)value, diagnostics, context);
			case GtmPackage.COMBINATION_CONSTRAINTS:
				return validateCombinationConstraints((CombinationConstraints)value, diagnostics, context);
			case GtmPackage.COMBINATION_CONSTRAINT:
				return validateCombinationConstraint((CombinationConstraint)value, diagnostics, context);
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINTS:
				return validateTravelValidityConstraints((TravelValidityConstraints)value, diagnostics, context);
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT:
				return validateTravelValidityConstraint((TravelValidityConstraint)value, diagnostics, context);
			case GtmPackage.SALES_AVAILABILITY_CONSTRAINTS:
				return validateSalesAvailabilityConstraints((SalesAvailabilityConstraints)value, diagnostics, context);
			case GtmPackage.SALES_AVAILABILITY_CONSTRAINT:
				return validateSalesAvailabilityConstraint((SalesAvailabilityConstraint)value, diagnostics, context);
			case GtmPackage.SALES_RESTRICTION:
				return validateSalesRestriction((SalesRestriction)value, diagnostics, context);
			case GtmPackage.END_OF_SALE:
				return validateEndOfSale((EndOfSale)value, diagnostics, context);
			case GtmPackage.START_OF_SALE:
				return validateStartOfSale((StartOfSale)value, diagnostics, context);
			case GtmPackage.REDUCTION_CARDS:
				return validateReductionCards((ReductionCards)value, diagnostics, context);
			case GtmPackage.REDUCTION_CARD:
				return validateReductionCard((ReductionCard)value, diagnostics, context);
			case GtmPackage.CARRIER_CONSTRAINTS:
				return validateCarrierConstraints((CarrierConstraints)value, diagnostics, context);
			case GtmPackage.CARRIER_CONSTRAINT:
				return validateCarrierConstraint((CarrierConstraint)value, diagnostics, context);
			case GtmPackage.SERVICE_CONSTRAINTS:
				return validateServiceConstraints((ServiceConstraints)value, diagnostics, context);
			case GtmPackage.SERVICE_CONSTRAINT:
				return validateServiceConstraint((ServiceConstraint)value, diagnostics, context);
			case GtmPackage.REGIONAL_CONSTRAINTS:
				return validateRegionalConstraints((RegionalConstraints)value, diagnostics, context);
			case GtmPackage.REGIONAL_CONSTRAINT:
				return validateRegionalConstraint((RegionalConstraint)value, diagnostics, context);
			case GtmPackage.REGIONAL_VALIDITY:
				return validateRegionalValidity((RegionalValidity)value, diagnostics, context);
			case GtmPackage.SERVICE_LEVEL_DEFINITIONS:
				return validateServiceLevelDefinitions((ServiceLevelDefinitions)value, diagnostics, context);
			case GtmPackage.TEXTS:
				return validateTexts((Texts)value, diagnostics, context);
			case GtmPackage.TEXT:
				return validateText((Text)value, diagnostics, context);
			case GtmPackage.TRANSLATION:
				return validateTranslation((Translation)value, diagnostics, context);
			case GtmPackage.PRICES:
				return validatePrices((Prices)value, diagnostics, context);
			case GtmPackage.PRICE:
				return validatePrice((Price)value, diagnostics, context);
			case GtmPackage.VAT_DETAIL:
				return validateVATDetail((VATDetail)value, diagnostics, context);
			case GtmPackage.CURRENCY_PRICE:
				return validateCurrencyPrice((CurrencyPrice)value, diagnostics, context);
			case GtmPackage.SERVICE_CLASS_DEFINITIONS:
				return validateServiceClassDefinitions((ServiceClassDefinitions)value, diagnostics, context);
			case GtmPackage.CALENDARS:
				return validateCalendars((Calendars)value, diagnostics, context);
			case GtmPackage.CALENDAR:
				return validateCalendar((Calendar)value, diagnostics, context);
			case GtmPackage.RESERVATION_PARAMETERS:
				return validateReservationParameters((ReservationParameters)value, diagnostics, context);
			case GtmPackage.RESERVATION_PARAMETER:
				return validateReservationParameter((ReservationParameter)value, diagnostics, context);
			case GtmPackage.RESERVATION_PARAMS9181:
				return validateReservationParams9181((ReservationParams9181)value, diagnostics, context);
			case GtmPackage.RESERVATION_OPTIONS:
				return validateReservationOptions((ReservationOptions)value, diagnostics, context);
			case GtmPackage.RESERVATION_PREFERENCE_GROUP:
				return validateReservationPreferenceGroup((ReservationPreferenceGroup)value, diagnostics, context);
			case GtmPackage.SERVICE_CLASS:
				return validateServiceClass((ServiceClass)value, diagnostics, context);
			case GtmPackage.SERVICE_LEVEL:
				return validateServiceLevel((ServiceLevel)value, diagnostics, context);
			case GtmPackage.TIME_RANGE:
				return validateTimeRange((TimeRange)value, diagnostics, context);
			case GtmPackage.EXCLUDED_TIME_RANGE:
				return validateExcludedTimeRange((ExcludedTimeRange)value, diagnostics, context);
			case GtmPackage.VALIDITY_RANGE:
				return validateValidityRange((ValidityRange)value, diagnostics, context);
			case GtmPackage.RELATIVE_TIME:
				return validateRelativeTime((RelativeTime)value, diagnostics, context);
			case GtmPackage.RETURN_VALIDITY_CONSTRAINT:
				return validateReturnValidityConstraint((ReturnValidityConstraint)value, diagnostics, context);
			case GtmPackage.VIA_STATION:
				return validateViaStation((ViaStation)value, diagnostics, context);
			case GtmPackage.ALTERNATIVE_ROUTE:
				return validateAlternativeRoute((AlternativeRoute)value, diagnostics, context);
			case GtmPackage.ROUTE:
				return validateRoute((Route)value, diagnostics, context);
			case GtmPackage.ZONE:
				return validateZone((Zone)value, diagnostics, context);
			case GtmPackage.LINE:
				return validateLine((Line)value, diagnostics, context);
			case GtmPackage.POLYGONE:
				return validatePolygone((Polygone)value, diagnostics, context);
			case GtmPackage.EDGE:
				return validateEdge((Edge)value, diagnostics, context);
			case GtmPackage.CARRIER_RESOURCE_LOCATION:
				return validateCarrierResourceLocation((CarrierResourceLocation)value, diagnostics, context);
			case GtmPackage.CROSS_BORDER_CONDITION:
				return validateCrossBorderCondition((CrossBorderCondition)value, diagnostics, context);
			case GtmPackage.FARE_COMBINATION_MODEL:
				return validateFareCombinationModel((FareCombinationModel)value, diagnostics, context);
			case GtmPackage.REDUCTION_CONSTRAINT:
				return validateReductionConstraint((ReductionConstraint)value, diagnostics, context);
			case GtmPackage.REQUIRED_REDUCTION_CARD:
				return validateRequiredReductionCard((RequiredReductionCard)value, diagnostics, context);
			case GtmPackage.CONVERSION_FROM_LEGACY:
				return validateConversionFromLegacy((ConversionFromLegacy)value, diagnostics, context);
			case GtmPackage.CONVERSION_PARAMS:
				return validateConversionParams((ConversionParams)value, diagnostics, context);
			case GtmPackage.TARGET_FARE_TEMPLATE:
				return validateTargetFareTemplate((TargetFareTemplate)value, diagnostics, context);
			case GtmPackage.LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPINGS:
				return validateLegacyStationToServiceConstraintMappings((LegacyStationToServiceConstraintMappings)value, diagnostics, context);
			case GtmPackage.LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING:
				return validateLegacyStationToServiceConstraintMapping((LegacyStationToServiceConstraintMapping)value, diagnostics, context);
			case GtmPackage.LEGACY_STATION_MAPPINGS:
				return validateLegacyStationMappings((LegacyStationMappings)value, diagnostics, context);
			case GtmPackage.LEGACY_STATION_MAP:
				return validateLegacyStationMap((LegacyStationMap)value, diagnostics, context);
			case GtmPackage.LEGACY_STATION:
				return validateLegacyStation((LegacyStation)value, diagnostics, context);
			case GtmPackage.LEGACY_BODER_POINT_MAPPINGS:
				return validateLegacyBoderPointMappings((LegacyBoderPointMappings)value, diagnostics, context);
			case GtmPackage.LEGACY_BORDER_POINT_MAPPING:
				return validateLegacyBorderPointMapping((LegacyBorderPointMapping)value, diagnostics, context);
			case GtmPackage.LEGACY_DESCRIPTION:
				return validateLegacyDescription((LegacyDescription)value, diagnostics, context);
			case GtmPackage.LEGACY_FARE_STATION_SET_MAPPINGS:
				return validateLegacyFareStationSetMappings((LegacyFareStationSetMappings)value, diagnostics, context);
			case GtmPackage.LEGACY_FARE_STATION_SET_MAP:
				return validateLegacyFareStationSetMap((LegacyFareStationSetMap)value, diagnostics, context);
			case GtmPackage.LEGACY_FARES:
				return validateLegacyFares((LegacyFares)value, diagnostics, context);
			case GtmPackage.LEGACY_FARE:
				return validateLegacyFare((LegacyFare)value, diagnostics, context);
			case GtmPackage.LEGACY108:
				return validateLegacy108((Legacy108)value, diagnostics, context);
			case GtmPackage.LEGACY108_STATIONS:
				return validateLegacy108Stations((Legacy108Stations)value, diagnostics, context);
			case GtmPackage.LEGACY108_STATION:
				return validateLegacy108Station((Legacy108Station)value, diagnostics, context);
			case GtmPackage.LEGACY_ROUTE_FARES:
				return validateLegacyRouteFares((LegacyRouteFares)value, diagnostics, context);
			case GtmPackage.LEGACY_ROUTE_FARE:
				return validateLegacyRouteFare((LegacyRouteFare)value, diagnostics, context);
			case GtmPackage.LEGACY_SERIES:
				return validateLegacySeries((LegacySeries)value, diagnostics, context);
			case GtmPackage.LEGACY_SERIES_LIST:
				return validateLegacySeriesList((LegacySeriesList)value, diagnostics, context);
			case GtmPackage.LEGACY_DISTANCE_FARES:
				return validateLegacyDistanceFares((LegacyDistanceFares)value, diagnostics, context);
			case GtmPackage.LEGACY_DISTANCE_FARE:
				return validateLegacyDistanceFare((LegacyDistanceFare)value, diagnostics, context);
			case GtmPackage.LEGACY_VIASTATION:
				return validateLegacyViastation((LegacyViastation)value, diagnostics, context);
			case GtmPackage.LEGACY_TARGET_FARES:
				return validateLegacyTargetFares((LegacyTargetFares)value, diagnostics, context);
			case GtmPackage.AFTER_SALES_TRANSACTION_TYPE:
				return validateAfterSalesTransactionType((AfterSalesTransactionType)value, diagnostics, context);
			case GtmPackage.BARCODE_TYPES:
				return validateBarcodeTypes((BarcodeTypes)value, diagnostics, context);
			case GtmPackage.CLASSIC_CLASS_TYPE:
				return validateClassicClassType((ClassicClassType)value, diagnostics, context);
			case GtmPackage.CHARACTER_SET:
				return validateCharacterSet((CharacterSet)value, diagnostics, context);
			case GtmPackage.CLUSTERS:
				return validateClusters((Clusters)value, diagnostics, context);
			case GtmPackage.COMBINATION_MODEL:
				return validateCombinationModel((CombinationModel)value, diagnostics, context);
			case GtmPackage.CONTROL_DATA_EXCHANGE_TYPES:
				return validateControlDataExchangeTypes((ControlDataExchangeTypes)value, diagnostics, context);
			case GtmPackage.FARE_TYPE:
				return validateFareType((FareType)value, diagnostics, context);
			case GtmPackage.FULFILLMENT_TYPE:
				return validateFulfillmentType((FulfillmentType)value, diagnostics, context);
			case GtmPackage.GEO_SYSTEM:
				return validateGeoSystem((GeoSystem)value, diagnostics, context);
			case GtmPackage.GEO_UNIT:
				return validateGeoUnit((GeoUnit)value, diagnostics, context);
			case GtmPackage.GRAPHICAL_RESERVATION_TYPE:
				return validateGraphicalReservationType((GraphicalReservationType)value, diagnostics, context);
			case GtmPackage.HEMISPHERE_EW:
				return validateHemisphereEW((HemisphereEW)value, diagnostics, context);
			case GtmPackage.HEMISPHERE_NS:
				return validateHemisphereNS((HemisphereNS)value, diagnostics, context);
			case GtmPackage.INTERFACE_TYPE:
				return validateInterfaceType((InterfaceType)value, diagnostics, context);
			case GtmPackage.LEGACY_CALCULATION_TYPE:
				return validateLegacyCalculationType((LegacyCalculationType)value, diagnostics, context);
			case GtmPackage.LEGACY_PASSENGER_TYPE:
				return validateLegacyPassengerType((LegacyPassengerType)value, diagnostics, context);
			case GtmPackage.LEGACY_SERIES_TYPE:
				return validateLegacySeriesType((LegacySeriesType)value, diagnostics, context);
			case GtmPackage.OFFER_REQUEST_TYPE:
				return validateOfferRequestType((OfferRequestType)value, diagnostics, context);
			case GtmPackage.ONLINE_SERVICE_TYPE:
				return validateOnlineServiceType((OnlineServiceType)value, diagnostics, context);
			case GtmPackage.PERSONAL_DATA_ITEMS_TYPE:
				return validatePersonalDataItemsType((PersonalDataItemsType)value, diagnostics, context);
			case GtmPackage.PERSONAL_DATA_TRANSFER_TYPE:
				return validatePersonalDataTransferType((PersonalDataTransferType)value, diagnostics, context);
			case GtmPackage.PERSONAL_DATA_CHANGE_REASON:
				return validatePersonalDataChangeReason((PersonalDataChangeReason)value, diagnostics, context);
			case GtmPackage.RESERVATION_TRAVEL_CLASS:
				return validateReservationTravelClass((ReservationTravelClass)value, diagnostics, context);
			case GtmPackage.RESERVATION_SERVICE_LEVEL:
				return validateReservationServiceLevel((ReservationServiceLevel)value, diagnostics, context);
			case GtmPackage.RESERVATION_SERVICE:
				return validateReservationService((ReservationService)value, diagnostics, context);
			case GtmPackage.RESERVATION_BERTH_TYPE:
				return validateReservationBerthType((ReservationBerthType)value, diagnostics, context);
			case GtmPackage.SCHEMA_VERSION:
				return validateSchemaVersion((SchemaVersion)value, diagnostics, context);
			case GtmPackage.TIME_ZONE:
				return validateTimeZone((TimeZone)value, diagnostics, context);
			case GtmPackage.TAX_SCOPE:
				return validateTaxScope((TaxScope)value, diagnostics, context);
			case GtmPackage.TIME_REFERENCE_TYPE:
				return validateTimeReferenceType((TimeReferenceType)value, diagnostics, context);
			case GtmPackage.TIME_RANGE_SCOPE:
				return validateTimeRangeScope((TimeRangeScope)value, diagnostics, context);
			case GtmPackage.TIME_UNIT:
				return validateTimeUnit((TimeUnit)value, diagnostics, context);
			case GtmPackage.TRAVELER_TYPE:
				return validateTravelerType((TravelerType)value, diagnostics, context);
			case GtmPackage.WEEK_DAY:
				return validateWeekDay((WeekDay)value, diagnostics, context);
			case GtmPackage.DATA_SOURCE:
				return validateDataSource((DataSource)value, diagnostics, context);
			case GtmPackage.CLASS_ID:
				return validateClassId((ClassId)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGTMTool(GTMTool gtmTool, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gtmTool, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeLists(CodeLists codeLists, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeLists, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUTSCodes(NUTSCodes nutsCodes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutsCodes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceBrands(ServiceBrands serviceBrands, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceBrands, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguages(Languages languages, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(languages, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrencies(Currencies currencies, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(currencies, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountries(Countries countries, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(countries, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStations(Stations stations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarriers(Carriers carriers, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carriers, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralTariffModel(GeneralTariffModel generalTariffModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(generalTariffModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConversionFromLegacy(ConversionFromLegacy conversionFromLegacy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conversionFromLegacy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConversionParams(ConversionParams conversionParams, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conversionParams, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareStructure(FareStructure fareStructure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fareStructure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionPoints(ConnectionPoints connectionPoints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectionPoints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareResourceLocations(FareResourceLocations fareResourceLocations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fareResourceLocations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrainResourceLocations(TrainResourceLocations trainResourceLocations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trainResourceLocations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStationResourceLocations(StationResourceLocations stationResourceLocations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stationResourceLocations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarrierResourceLocations(CarrierResourceLocations carrierResourceLocations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carrierResourceLocations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFulfillmentConstraints(FulfillmentConstraints fulfillmentConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fulfillmentConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportedOnlineServices(SupportedOnlineServices supportedOnlineServices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supportedOnlineServices, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStationNames(StationNames stationNames, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stationNames, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReductionConstraints(ReductionConstraints reductionConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reductionConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonalDataConstraints(PersonalDataConstraints personalDataConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personalDataConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePassengerConstraints(PassengerConstraints passengerConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(passengerConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCombinationConstraints(CombinationConstraints combinationConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(combinationConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTravelValidityConstraints(TravelValidityConstraints travelValidityConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(travelValidityConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSalesAvailabilityConstraints(SalesAvailabilityConstraints salesAvailabilityConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(salesAvailabilityConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReductionCards(ReductionCards reductionCards, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reductionCards, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarrierConstraints(CarrierConstraints carrierConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carrierConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceConstraints(ServiceConstraints serviceConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservationParameters(ReservationParameters reservationParameters, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reservationParameters, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionalConstraints(RegionalConstraints regionalConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(regionalConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceLevelDefinitions(ServiceLevelDefinitions serviceLevelDefinitions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceLevelDefinitions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTexts(Texts texts, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(texts, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrices(Prices prices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(prices, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceClassDefinitions(ServiceClassDefinitions serviceClassDefinitions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceClassDefinitions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendars(Calendars calendars, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calendars, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAfterSalesRules(AfterSalesRules afterSalesRules, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(afterSalesRules, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareElements(FareElements fareElements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fareElements, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelivery(Delivery delivery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(delivery, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendar(Calendar calendar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calendar, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarrier(Carrier carrier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carrier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyStationToServiceConstraintMappings(LegacyStationToServiceConstraintMappings legacyStationToServiceConstraintMappings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyStationToServiceConstraintMappings, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyStationToServiceConstraintMapping(LegacyStationToServiceConstraintMapping legacyStationToServiceConstraintMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyStationToServiceConstraintMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyDescription(LegacyDescription legacyDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyDescription, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyFareStationSetMappings(LegacyFareStationSetMappings legacyFareStationSetMappings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyFareStationSetMappings, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyFareStationSetMap(LegacyFareStationSetMap legacyFareStationSetMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyFareStationSetMap, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyDistanceFare(LegacyDistanceFare legacyDistanceFare, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyDistanceFare, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyFares(LegacyFares legacyFares, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyFares, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyFare(LegacyFare legacyFare, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyFare, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacy108(Legacy108 legacy108, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacy108, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacy108Stations(Legacy108Stations legacy108Stations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacy108Stations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacy108Station(Legacy108Station legacy108Station, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacy108Station, diagnostics, context);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyRouteFares(LegacyRouteFares legacyRouteFares, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyRouteFares, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyRouteFare(LegacyRouteFare legacyRouteFare, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyRouteFare, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacySeries(LegacySeries legacySeries, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacySeries, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacySeriesList(LegacySeriesList legacySeriesList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacySeriesList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyDistanceFares(LegacyDistanceFares legacyDistanceFares, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyDistanceFares, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyViastation(LegacyViastation legacyViastation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyViastation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyStationMappings(LegacyStationMappings legacyStationMappings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyStationMappings, diagnostics, context);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyStationMap(LegacyStationMap legacyStationMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyStationMap, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyBoderPointMappings(LegacyBoderPointMappings legacyBoderPointMappings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyBoderPointMappings, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyBorderPointMapping(LegacyBorderPointMapping legacyBorderPointMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyBorderPointMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyTargetFares(LegacyTargetFares legacyTargetFares, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyTargetFares, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchemaVersion(SchemaVersion schemaVersion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarrierConstraint(CarrierConstraint carrierConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(carrierConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(carrierConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(carrierConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(carrierConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(carrierConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(carrierConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(carrierConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(carrierConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(carrierConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateCarrierConstraint_INCLUDE_OR_EXCLUDE(carrierConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the INCLUDE_OR_EXCLUDE constraint of '<em>Carrier Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCarrierConstraint_INCLUDE_OR_EXCLUDE(CarrierConstraint carrierConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (carrierConstraint.getIncludedCarriers() != null && carrierConstraint.getExcludedCarriers() != null && !carrierConstraint.getExcludedCarriers().isEmpty() && !carrierConstraint.getIncludedCarriers().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createGtmDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.Validation_CarrierConstraint_diagnostic,
						 new Object[] { getObjectLabel(carrierConstraint, context) },
						 new Object[] { carrierConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountry(Country country, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(country, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionPoint(ConnectionPoint connectionPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectionPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStationSet(StationSet stationSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stationSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrency(Currency currency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(currency, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrencyPrice(CurrencyPrice currencyPrice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(currencyPrice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguage(Language language, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(language, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrice(Price price, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(price, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReductionCard(ReductionCard reductionCard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reductionCard, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionalConstraint(RegionalConstraint regionalConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(regionalConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservationParameter(ReservationParameter reservationParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reservationParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservationParams9181(ReservationParams9181 reservationParams9181, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reservationParams9181, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservationOptions(ReservationOptions reservationOptions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reservationOptions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservationPreferenceGroup(ReservationPreferenceGroup reservationPreferenceGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reservationPreferenceGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceClass(ServiceClass serviceClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceLevel(ServiceLevel serviceLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceLevel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceConstraint(ServiceConstraint serviceConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceConstraint_INCLUDE_OR_EXCLUDE(serviceConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the INCLUDE_OR_EXCLUDE constraint of '<em>Service Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateServiceConstraint_INCLUDE_OR_EXCLUDE(ServiceConstraint serviceConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (serviceConstraint.getExcludedServiceBrands() != null && serviceConstraint.getIncludedServiceBrands()!= null && !serviceConstraint.getExcludedServiceBrands().isEmpty() && !serviceConstraint.getIncludedServiceBrands().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createGtmDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 NationalLanguageSupport.Validation_ServiceConstraint_diagnostic, 
						 new Object[] { getObjectLabel(serviceConstraint, context) },
						 new Object[] { serviceConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStation(Station station, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(station, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetFareTemplate(TargetFareTemplate targetFareTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(targetFareTemplate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTravelValidityConstraint(TravelValidityConstraint travelValidityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(travelValidityConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateText(Text text, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(text, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTranslation(Translation translation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(translation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVATDetail(VATDetail vatDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vatDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareElement(FareElement fareElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fareElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareStationSetDefinitions(FareStationSetDefinitions fareStationSetDefinitions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fareStationSetDefinitions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareStationSetDefinition(FareStationSetDefinition fareStationSetDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fareStationSetDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyAccountingIdentifier(LegacyAccountingIdentifier legacyAccountingIdentifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyAccountingIdentifier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceBrand(ServiceBrand serviceBrand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceBrand, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSalesAvailabilityConstraint(SalesAvailabilityConstraint salesAvailabilityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(salesAvailabilityConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSalesRestriction(SalesRestriction salesRestriction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(salesRestriction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndOfSale(EndOfSale endOfSale, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(endOfSale, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartOfSale(StartOfSale startOfSale, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(startOfSale, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCombinationConstraint(CombinationConstraint combinationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(combinationConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValidityRange(ValidityRange validityRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(validityRange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeRange(TimeRange timeRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeRange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExcludedTimeRange(ExcludedTimeRange excludedTimeRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(excludedTimeRange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnValidityConstraint(ReturnValidityConstraint returnValidityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(returnValidityConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareCombinationModel(FareCombinationModel fareCombinationModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fareCombinationModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredBarcodes(RequiredBarcodes requiredBarcodes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requiredBarcodes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcceptedBarcodes(AcceptedBarcodes acceptedBarcodes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(acceptedBarcodes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionalValidity(RegionalValidity regionalValidity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(regionalValidity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViaStation(ViaStation viaStation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(viaStation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlternativeRoute(AlternativeRoute alternativeRoute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alternativeRoute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoute(Route route, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(route, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZone(Zone zone, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zone, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutsCode(NutsCode nutsCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutsCode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLine(Line line, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(line, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolygone(Polygone polygone, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(polygone, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyStation(LegacyStation legacyStation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyStation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdge(Edge edge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(edge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePassengerConstraint(PassengerConstraint passengerConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(passengerConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncludedFreePassengerLimit(IncludedFreePassengerLimit includedFreePassengerLimit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(includedFreePassengerLimit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePassengerCombinationConstraint(PassengerCombinationConstraint passengerCombinationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(passengerCombinationConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativeTime(RelativeTime relativeTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relativeTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAfterSalesCondition(AfterSalesCondition afterSalesCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(afterSalesCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplicationTime(ApplicationTime applicationTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(applicationTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAfterSalesRule(AfterSalesRule afterSalesRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(afterSalesRule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonalDataConstraint(PersonalDataConstraint personalDataConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personalDataConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredPersonalData(RequiredPersonalData requiredPersonalData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requiredPersonalData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrossBorderCondition(CrossBorderCondition crossBorderCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(crossBorderCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllowedPersonalDataChanges(AllowedPersonalDataChanges allowedPersonalDataChanges, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allowedPersonalDataChanges, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReductionConstraint(ReductionConstraint reductionConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reductionConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredReductionCard(RequiredReductionCard requiredReductionCard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requiredReductionCard, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFulfillmentConstraint(FulfillmentConstraint fulfillmentConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fulfillmentConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrainResourceLocation(TrainResourceLocation trainResourceLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trainResourceLocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeZone(TimeZone timeZone, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacterSet(CharacterSet characterSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarrierResourceLocation(CarrierResourceLocation carrierResourceLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carrierResourceLocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStationResourceLocation(StationResourceLocation stationResourceLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stationResourceLocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnlineResource(OnlineResource onlineResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(onlineResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAfterSalesTransactionType(AfterSalesTransactionType afterSalesTransactionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBarcodeTypes(BarcodeTypes barcodeTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassicClassType(ClassicClassType classicClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClusters(Clusters clusters, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCombinationModel(CombinationModel combinationModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlDataExchangeTypes(ControlDataExchangeTypes controlDataExchangeTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareType(FareType fareType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFulfillmentType(FulfillmentType fulfillmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeoSystem(GeoSystem geoSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeoUnit(GeoUnit geoUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphicalReservationType(GraphicalReservationType graphicalReservationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHemisphereEW(HemisphereEW hemisphereEW, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHemisphereNS(HemisphereNS hemisphereNS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceType(InterfaceType interfaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservationTravelClass(ReservationTravelClass reservationTravelClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservationServiceLevel(ReservationServiceLevel reservationServiceLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservationService(ReservationService reservationService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservationBerthType(ReservationBerthType reservationBerthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyCalculationType(LegacyCalculationType legacyCalculationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyPassengerType(LegacyPassengerType legacyPassengerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacySeriesType(LegacySeriesType legacySeriesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOfferRequestType(OfferRequestType offerRequestType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnlineServiceType(OnlineServiceType onlineServiceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonalDataItemsType(PersonalDataItemsType personalDataItemsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonalDataTransferType(PersonalDataTransferType personalDataTransferType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonalDataChangeReason(PersonalDataChangeReason personalDataChangeReason, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaxScope(TaxScope taxScope, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeReferenceType(TimeReferenceType timeReferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeRangeScope(TimeRangeScope timeRangeScope, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeUnit(TimeUnit timeUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTravelerType(TravelerType travelerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeekDay(WeekDay weekDay, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataSource(DataSource dataSource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassId(ClassId classId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}
	
	  protected BasicDiagnostic createGtmDiagnostic
	    (int severity, String source, int code, String messageKey, Object[] messageSubstitutions, Object[] data, Map<Object, Object> context)
	  {
	    String message = NationalLanguageSupport.bind(messageKey, messageSubstitutions);
	    return new BasicDiagnostic(severity, source, code, message, data);
	  }

} //GtmValidator
