/**
 */
package Gtm.util;

import Gtm.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage
 * @generated
 */
public class GtmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GtmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GtmSwitch() {
		if (modelPackage == null) {
			modelPackage = GtmPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GtmPackage.GTM_TOOL: {
				GTMTool gtmTool = (GTMTool)theEObject;
				T result = caseGTMTool(gtmTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.CODE_LISTS: {
				CodeLists codeLists = (CodeLists)theEObject;
				T result = caseCodeLists(codeLists);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.NUTS_CODES: {
				NUTSCodes nutsCodes = (NUTSCodes)theEObject;
				T result = caseNUTSCodes(nutsCodes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.NUTS_CODE: {
				NutsCode nutsCode = (NutsCode)theEObject;
				T result = caseNutsCode(nutsCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.SERVICE_BRANDS: {
				ServiceBrands serviceBrands = (ServiceBrands)theEObject;
				T result = caseServiceBrands(serviceBrands);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.SERVICE_BRAND: {
				ServiceBrand serviceBrand = (ServiceBrand)theEObject;
				T result = caseServiceBrand(serviceBrand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.COUNTRIES: {
				Countries countries = (Countries)theEObject;
				T result = caseCountries(countries);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.COUNTRY: {
				Country country = (Country)theEObject;
				T result = caseCountry(country);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LANGUAGES: {
				Languages languages = (Languages)theEObject;
				T result = caseLanguages(languages);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LANGUAGE: {
				Language language = (Language)theEObject;
				T result = caseLanguage(language);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.CURRENCIES: {
				Currencies currencies = (Currencies)theEObject;
				T result = caseCurrencies(currencies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.CURRENCY: {
				Currency currency = (Currency)theEObject;
				T result = caseCurrency(currency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.STATIONS: {
				Stations stations = (Stations)theEObject;
				T result = caseStations(stations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.STATION: {
				Station station = (Station)theEObject;
				T result = caseStation(station);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.STATION_RELATION: {
				StationRelation stationRelation = (StationRelation)theEObject;
				T result = caseStationRelation(stationRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.CARRIER: {
				Carrier carrier = (Carrier)theEObject;
				T result = caseCarrier(carrier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.CARRIERS: {
				Carriers carriers = (Carriers)theEObject;
				T result = caseCarriers(carriers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.STATION_SET: {
				StationSet stationSet = (StationSet)theEObject;
				T result = caseStationSet(stationSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.GENERAL_TARIFF_MODEL: {
				GeneralTariffModel generalTariffModel = (GeneralTariffModel)theEObject;
				T result = caseGeneralTariffModel(generalTariffModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.DELIVERY: {
				Delivery delivery = (Delivery)theEObject;
				T result = caseDelivery(delivery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.AFTER_SALES_RULES: {
				AfterSalesRules afterSalesRules = (AfterSalesRules)theEObject;
				T result = caseAfterSalesRules(afterSalesRules);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.AFTER_SALES_RULE: {
				AfterSalesRule afterSalesRule = (AfterSalesRule)theEObject;
				T result = caseAfterSalesRule(afterSalesRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.AFTER_SALES_CONDITION: {
				AfterSalesCondition afterSalesCondition = (AfterSalesCondition)theEObject;
				T result = caseAfterSalesCondition(afterSalesCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.APPLICATION_TIME: {
				ApplicationTime applicationTime = (ApplicationTime)theEObject;
				T result = caseApplicationTime(applicationTime);
				if (result == null) result = caseRelativeTime(applicationTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.FARE_STRUCTURE: {
				FareStructure fareStructure = (FareStructure)theEObject;
				T result = caseFareStructure(fareStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.CONNECTION_POINTS: {
				ConnectionPoints connectionPoints = (ConnectionPoints)theEObject;
				T result = caseConnectionPoints(connectionPoints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.CONNECTION_POINT: {
				ConnectionPoint connectionPoint = (ConnectionPoint)theEObject;
				T result = caseConnectionPoint(connectionPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.FARE_RESOURCE_LOCATIONS: {
				FareResourceLocations fareResourceLocations = (FareResourceLocations)theEObject;
				T result = caseFareResourceLocations(fareResourceLocations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.TRAIN_RESOURCE_LOCATIONS: {
				TrainResourceLocations trainResourceLocations = (TrainResourceLocations)theEObject;
				T result = caseTrainResourceLocations(trainResourceLocations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.STATION_RESOURCE_LOCATIONS: {
				StationResourceLocations stationResourceLocations = (StationResourceLocations)theEObject;
				T result = caseStationResourceLocations(stationResourceLocations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.CARRIER_RESOURCE_LOCATIONS: {
				CarrierResourceLocations carrierResourceLocations = (CarrierResourceLocations)theEObject;
				T result = caseCarrierResourceLocations(carrierResourceLocations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.TRAIN_RESOURCE_LOCATION: {
				TrainResourceLocation trainResourceLocation = (TrainResourceLocation)theEObject;
				T result = caseTrainResourceLocation(trainResourceLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.STATION_RESOURCE_LOCATION: {
				StationResourceLocation stationResourceLocation = (StationResourceLocation)theEObject;
				T result = caseStationResourceLocation(stationResourceLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.ONLINE_RESOURCE: {
				OnlineResource onlineResource = (OnlineResource)theEObject;
				T result = caseOnlineResource(onlineResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.FULFILLMENT_CONSTRAINTS: {
				FulfillmentConstraints fulfillmentConstraints = (FulfillmentConstraints)theEObject;
				T result = caseFulfillmentConstraints(fulfillmentConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.FULFILLMENT_CONSTRAINT: {
				FulfillmentConstraint fulfillmentConstraint = (FulfillmentConstraint)theEObject;
				T result = caseFulfillmentConstraint(fulfillmentConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.REQUIRED_BARCODES: {
				RequiredBarcodes requiredBarcodes = (RequiredBarcodes)theEObject;
				T result = caseRequiredBarcodes(requiredBarcodes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.ACCEPTED_BARCODES: {
				AcceptedBarcodes acceptedBarcodes = (AcceptedBarcodes)theEObject;
				T result = caseAcceptedBarcodes(acceptedBarcodes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.SUPPORTED_ONLINE_SERVICES: {
				SupportedOnlineServices supportedOnlineServices = (SupportedOnlineServices)theEObject;
				T result = caseSupportedOnlineServices(supportedOnlineServices);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.STATION_NAMES: {
				StationNames stationNames = (StationNames)theEObject;
				T result = caseStationNames(stationNames);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.FARE_ELEMENTS: {
				FareElements fareElements = (FareElements)theEObject;
				T result = caseFareElements(fareElements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.FARE_ELEMENT: {
				FareElement fareElement = (FareElement)theEObject;
				T result = caseFareElement(fareElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.FARE_STATION_SET_DEFINITIONS: {
				FareStationSetDefinitions fareStationSetDefinitions = (FareStationSetDefinitions)theEObject;
				T result = caseFareStationSetDefinitions(fareStationSetDefinitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.FARE_STATION_SET_DEFINITION: {
				FareStationSetDefinition fareStationSetDefinition = (FareStationSetDefinition)theEObject;
				T result = caseFareStationSetDefinition(fareStationSetDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY_ACCOUNTING_IDENTIFIER: {
				LegacyAccountingIdentifier legacyAccountingIdentifier = (LegacyAccountingIdentifier)theEObject;
				T result = caseLegacyAccountingIdentifier(legacyAccountingIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.REDUCTION_CONSTRAINTS: {
				ReductionConstraints reductionConstraints = (ReductionConstraints)theEObject;
				T result = caseReductionConstraints(reductionConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.PERSONAL_DATA_CONSTRAINTS: {
				PersonalDataConstraints personalDataConstraints = (PersonalDataConstraints)theEObject;
				T result = casePersonalDataConstraints(personalDataConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.PERSONAL_DATA_CONSTRAINT: {
				PersonalDataConstraint personalDataConstraint = (PersonalDataConstraint)theEObject;
				T result = casePersonalDataConstraint(personalDataConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.REQUIRED_PERSONAL_DATA: {
				RequiredPersonalData requiredPersonalData = (RequiredPersonalData)theEObject;
				T result = caseRequiredPersonalData(requiredPersonalData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.ALLOWED_PERSONAL_DATA_CHANGES: {
				AllowedPersonalDataChanges allowedPersonalDataChanges = (AllowedPersonalDataChanges)theEObject;
				T result = caseAllowedPersonalDataChanges(allowedPersonalDataChanges);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.PASSENGER_CONSTRAINTS: {
				PassengerConstraints passengerConstraints = (PassengerConstraints)theEObject;
				T result = casePassengerConstraints(passengerConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.PASSENGER_CONSTRAINT: {
				PassengerConstraint passengerConstraint = (PassengerConstraint)theEObject;
				T result = casePassengerConstraint(passengerConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.PASSENGER_COMBINATION_CONSTRAINT: {
				PassengerCombinationConstraint passengerCombinationConstraint = (PassengerCombinationConstraint)theEObject;
				T result = casePassengerCombinationConstraint(passengerCombinationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.INCLUDED_FREE_PASSENGER_LIMIT: {
				IncludedFreePassengerLimit includedFreePassengerLimit = (IncludedFreePassengerLimit)theEObject;
				T result = caseIncludedFreePassengerLimit(includedFreePassengerLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.COMBINATION_CONSTRAINTS: {
				CombinationConstraints combinationConstraints = (CombinationConstraints)theEObject;
				T result = caseCombinationConstraints(combinationConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.COMBINATION_CONSTRAINT: {
				CombinationConstraint combinationConstraint = (CombinationConstraint)theEObject;
				T result = caseCombinationConstraint(combinationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINTS: {
				TravelValidityConstraints travelValidityConstraints = (TravelValidityConstraints)theEObject;
				T result = caseTravelValidityConstraints(travelValidityConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT: {
				TravelValidityConstraint travelValidityConstraint = (TravelValidityConstraint)theEObject;
				T result = caseTravelValidityConstraint(travelValidityConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.SALES_AVAILABILITY_CONSTRAINTS: {
				SalesAvailabilityConstraints salesAvailabilityConstraints = (SalesAvailabilityConstraints)theEObject;
				T result = caseSalesAvailabilityConstraints(salesAvailabilityConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.SALES_AVAILABILITY_CONSTRAINT: {
				SalesAvailabilityConstraint salesAvailabilityConstraint = (SalesAvailabilityConstraint)theEObject;
				T result = caseSalesAvailabilityConstraint(salesAvailabilityConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.SALES_RESTRICTION: {
				SalesRestriction salesRestriction = (SalesRestriction)theEObject;
				T result = caseSalesRestriction(salesRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.END_OF_SALE: {
				EndOfSale endOfSale = (EndOfSale)theEObject;
				T result = caseEndOfSale(endOfSale);
				if (result == null) result = caseRelativeTime(endOfSale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.START_OF_SALE: {
				StartOfSale startOfSale = (StartOfSale)theEObject;
				T result = caseStartOfSale(startOfSale);
				if (result == null) result = caseRelativeTime(startOfSale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.REDUCTION_CARDS: {
				ReductionCards reductionCards = (ReductionCards)theEObject;
				T result = caseReductionCards(reductionCards);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.REDUCTION_CARD: {
				ReductionCard reductionCard = (ReductionCard)theEObject;
				T result = caseReductionCard(reductionCard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.CARRIER_CONSTRAINTS: {
				CarrierConstraints carrierConstraints = (CarrierConstraints)theEObject;
				T result = caseCarrierConstraints(carrierConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.CARRIER_CONSTRAINT: {
				CarrierConstraint carrierConstraint = (CarrierConstraint)theEObject;
				T result = caseCarrierConstraint(carrierConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.SERVICE_CONSTRAINTS: {
				ServiceConstraints serviceConstraints = (ServiceConstraints)theEObject;
				T result = caseServiceConstraints(serviceConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.SERVICE_CONSTRAINT: {
				ServiceConstraint serviceConstraint = (ServiceConstraint)theEObject;
				T result = caseServiceConstraint(serviceConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.REGIONAL_CONSTRAINTS: {
				RegionalConstraints regionalConstraints = (RegionalConstraints)theEObject;
				T result = caseRegionalConstraints(regionalConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.REGIONAL_CONSTRAINT: {
				RegionalConstraint regionalConstraint = (RegionalConstraint)theEObject;
				T result = caseRegionalConstraint(regionalConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.REGIONAL_VALIDITY: {
				RegionalValidity regionalValidity = (RegionalValidity)theEObject;
				T result = caseRegionalValidity(regionalValidity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.SERVICE_LEVEL_DEFINITIONS: {
				ServiceLevelDefinitions serviceLevelDefinitions = (ServiceLevelDefinitions)theEObject;
				T result = caseServiceLevelDefinitions(serviceLevelDefinitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.TEXTS: {
				Texts texts = (Texts)theEObject;
				T result = caseTexts(texts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.TEXT: {
				Text text = (Text)theEObject;
				T result = caseText(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.TRANSLATION: {
				Translation translation = (Translation)theEObject;
				T result = caseTranslation(translation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.PRICES: {
				Prices prices = (Prices)theEObject;
				T result = casePrices(prices);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.PRICE: {
				Price price = (Price)theEObject;
				T result = casePrice(price);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.VAT_DETAIL: {
				VATDetail vatDetail = (VATDetail)theEObject;
				T result = caseVATDetail(vatDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.CURRENCY_PRICE: {
				CurrencyPrice currencyPrice = (CurrencyPrice)theEObject;
				T result = caseCurrencyPrice(currencyPrice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.SERVICE_CLASS_DEFINITIONS: {
				ServiceClassDefinitions serviceClassDefinitions = (ServiceClassDefinitions)theEObject;
				T result = caseServiceClassDefinitions(serviceClassDefinitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.CALENDARS: {
				Calendars calendars = (Calendars)theEObject;
				T result = caseCalendars(calendars);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.CALENDAR: {
				Calendar calendar = (Calendar)theEObject;
				T result = caseCalendar(calendar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.RESERVATION_PARAMETERS: {
				ReservationParameters reservationParameters = (ReservationParameters)theEObject;
				T result = caseReservationParameters(reservationParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.RESERVATION_PARAMETER: {
				ReservationParameter reservationParameter = (ReservationParameter)theEObject;
				T result = caseReservationParameter(reservationParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.RESERVATION_PARAMS9181: {
				ReservationParams9181 reservationParams9181 = (ReservationParams9181)theEObject;
				T result = caseReservationParams9181(reservationParams9181);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.RESERVATION_OPTIONS: {
				ReservationOptions reservationOptions = (ReservationOptions)theEObject;
				T result = caseReservationOptions(reservationOptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.RESERVATION_PREFERENCE_GROUP: {
				ReservationPreferenceGroup reservationPreferenceGroup = (ReservationPreferenceGroup)theEObject;
				T result = caseReservationPreferenceGroup(reservationPreferenceGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.SERVICE_CLASS: {
				ServiceClass serviceClass = (ServiceClass)theEObject;
				T result = caseServiceClass(serviceClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.SERVICE_LEVEL: {
				ServiceLevel serviceLevel = (ServiceLevel)theEObject;
				T result = caseServiceLevel(serviceLevel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.TIME_RANGE: {
				TimeRange timeRange = (TimeRange)theEObject;
				T result = caseTimeRange(timeRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.EXCLUDED_TIME_RANGE: {
				ExcludedTimeRange excludedTimeRange = (ExcludedTimeRange)theEObject;
				T result = caseExcludedTimeRange(excludedTimeRange);
				if (result == null) result = caseTimeRange(excludedTimeRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.VALIDITY_RANGE: {
				ValidityRange validityRange = (ValidityRange)theEObject;
				T result = caseValidityRange(validityRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.RELATIVE_TIME: {
				RelativeTime relativeTime = (RelativeTime)theEObject;
				T result = caseRelativeTime(relativeTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.RETURN_VALIDITY_CONSTRAINT: {
				ReturnValidityConstraint returnValidityConstraint = (ReturnValidityConstraint)theEObject;
				T result = caseReturnValidityConstraint(returnValidityConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.VIA_STATION: {
				ViaStation viaStation = (ViaStation)theEObject;
				T result = caseViaStation(viaStation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.ALTERNATIVE_ROUTE: {
				AlternativeRoute alternativeRoute = (AlternativeRoute)theEObject;
				T result = caseAlternativeRoute(alternativeRoute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.ROUTE: {
				Route route = (Route)theEObject;
				T result = caseRoute(route);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.ZONE: {
				Zone zone = (Zone)theEObject;
				T result = caseZone(zone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LINE: {
				Line line = (Line)theEObject;
				T result = caseLine(line);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.POLYGONE: {
				Polygone polygone = (Polygone)theEObject;
				T result = casePolygone(polygone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.EDGE: {
				Edge edge = (Edge)theEObject;
				T result = caseEdge(edge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.ZONE_DEFINITIONS: {
				ZoneDefinitions zoneDefinitions = (ZoneDefinitions)theEObject;
				T result = caseZoneDefinitions(zoneDefinitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.ZONE_DEFINITION: {
				ZoneDefinition zoneDefinition = (ZoneDefinition)theEObject;
				T result = caseZoneDefinition(zoneDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.CARRIER_RESOURCE_LOCATION: {
				CarrierResourceLocation carrierResourceLocation = (CarrierResourceLocation)theEObject;
				T result = caseCarrierResourceLocation(carrierResourceLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.CROSS_BORDER_CONDITION: {
				CrossBorderCondition crossBorderCondition = (CrossBorderCondition)theEObject;
				T result = caseCrossBorderCondition(crossBorderCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.FARE_COMBINATION_MODEL: {
				FareCombinationModel fareCombinationModel = (FareCombinationModel)theEObject;
				T result = caseFareCombinationModel(fareCombinationModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.REDUCTION_CONSTRAINT: {
				ReductionConstraint reductionConstraint = (ReductionConstraint)theEObject;
				T result = caseReductionConstraint(reductionConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.REQUIRED_REDUCTION_CARD: {
				RequiredReductionCard requiredReductionCard = (RequiredReductionCard)theEObject;
				T result = caseRequiredReductionCard(requiredReductionCard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.CONVERSION_FROM_LEGACY: {
				ConversionFromLegacy conversionFromLegacy = (ConversionFromLegacy)theEObject;
				T result = caseConversionFromLegacy(conversionFromLegacy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.CONVERSION_PARAMS: {
				ConversionParams conversionParams = (ConversionParams)theEObject;
				T result = caseConversionParams(conversionParams);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.VAT_TEMPLATES: {
				VatTemplates vatTemplates = (VatTemplates)theEObject;
				T result = caseVatTemplates(vatTemplates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.VAT_TEMPLATE: {
				VatTemplate vatTemplate = (VatTemplate)theEObject;
				T result = caseVatTemplate(vatTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY_FARE_TEMPLATES: {
				LegacyFareTemplates legacyFareTemplates = (LegacyFareTemplates)theEObject;
				T result = caseLegacyFareTemplates(legacyFareTemplates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.FARE_TEMPLATE: {
				FareTemplate fareTemplate = (FareTemplate)theEObject;
				T result = caseFareTemplate(fareTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.AFTER_SALES_TEMPLATE: {
				AfterSalesTemplate afterSalesTemplate = (AfterSalesTemplate)theEObject;
				T result = caseAfterSalesTemplate(afterSalesTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.ON_BORDER_STATIONS: {
				OnBorderStations onBorderStations = (OnBorderStations)theEObject;
				T result = caseOnBorderStations(onBorderStations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPINGS: {
				LegacyStationToServiceConstraintMappings legacyStationToServiceConstraintMappings = (LegacyStationToServiceConstraintMappings)theEObject;
				T result = caseLegacyStationToServiceConstraintMappings(legacyStationToServiceConstraintMappings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY_BORDER_POINT: {
				LegacyBorderPoint legacyBorderPoint = (LegacyBorderPoint)theEObject;
				T result = caseLegacyBorderPoint(legacyBorderPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY_FAKE_BORDER_STATIONS: {
				LegacyFakeBorderStations legacyFakeBorderStations = (LegacyFakeBorderStations)theEObject;
				T result = caseLegacyFakeBorderStations(legacyFakeBorderStations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY_BORDER_SIDE: {
				LegacyBorderSide legacyBorderSide = (LegacyBorderSide)theEObject;
				T result = caseLegacyBorderSide(legacyBorderSide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY_BORDER_POINTS: {
				LegacyBorderPoints legacyBorderPoints = (LegacyBorderPoints)theEObject;
				T result = caseLegacyBorderPoints(legacyBorderPoints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING: {
				LegacyStationToServiceConstraintMapping legacyStationToServiceConstraintMapping = (LegacyStationToServiceConstraintMapping)theEObject;
				T result = caseLegacyStationToServiceConstraintMapping(legacyStationToServiceConstraintMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY_STATION_MAPPINGS: {
				LegacyStationMappings legacyStationMappings = (LegacyStationMappings)theEObject;
				T result = caseLegacyStationMappings(legacyStationMappings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY_STATION_MAP: {
				LegacyStationMap legacyStationMap = (LegacyStationMap)theEObject;
				T result = caseLegacyStationMap(legacyStationMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY_FARE_DETAIL_MAPS: {
				LegacyFareDetailMaps legacyFareDetailMaps = (LegacyFareDetailMaps)theEObject;
				T result = caseLegacyFareDetailMaps(legacyFareDetailMaps);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY_FARE_DETAIL_MAP: {
				LegacyFareDetailMap legacyFareDetailMap = (LegacyFareDetailMap)theEObject;
				T result = caseLegacyFareDetailMap(legacyFareDetailMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY_STATION: {
				LegacyStation legacyStation = (LegacyStation)theEObject;
				T result = caseLegacyStation(legacyStation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY_BODER_POINT_MAPPINGS: {
				LegacyBoderPointMappings legacyBoderPointMappings = (LegacyBoderPointMappings)theEObject;
				T result = caseLegacyBoderPointMappings(legacyBoderPointMappings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY_BORDER_POINT_MAPPING: {
				LegacyBorderPointMapping legacyBorderPointMapping = (LegacyBorderPointMapping)theEObject;
				T result = caseLegacyBorderPointMapping(legacyBorderPointMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY_FARE_STATION_SET_MAPPINGS: {
				LegacyFareStationSetMappings legacyFareStationSetMappings = (LegacyFareStationSetMappings)theEObject;
				T result = caseLegacyFareStationSetMappings(legacyFareStationSetMappings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY_FARE_STATION_SET_MAP: {
				LegacyFareStationSetMap legacyFareStationSetMap = (LegacyFareStationSetMap)theEObject;
				T result = caseLegacyFareStationSetMap(legacyFareStationSetMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY108: {
				Legacy108 legacy108 = (Legacy108)theEObject;
				T result = caseLegacy108(legacy108);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY108_FARE_DESCRIPTION: {
				Legacy108FareDescription legacy108FareDescription = (Legacy108FareDescription)theEObject;
				T result = caseLegacy108FareDescription(legacy108FareDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY108_FARES_DESCRIPTIONS: {
				Legacy108FaresDescriptions legacy108FaresDescriptions = (Legacy108FaresDescriptions)theEObject;
				T result = caseLegacy108FaresDescriptions(legacy108FaresDescriptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY108_STATIONS: {
				Legacy108Stations legacy108Stations = (Legacy108Stations)theEObject;
				T result = caseLegacy108Stations(legacy108Stations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY108_STATION: {
				Legacy108Station legacy108Station = (Legacy108Station)theEObject;
				T result = caseLegacy108Station(legacy108Station);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY_ROUTE_FARES: {
				LegacyRouteFares legacyRouteFares = (LegacyRouteFares)theEObject;
				T result = caseLegacyRouteFares(legacyRouteFares);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY_ROUTE_FARE: {
				LegacyRouteFare legacyRouteFare = (LegacyRouteFare)theEObject;
				T result = caseLegacyRouteFare(legacyRouteFare);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY_SERIES_LIST: {
				LegacySeriesList legacySeriesList = (LegacySeriesList)theEObject;
				T result = caseLegacySeriesList(legacySeriesList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY_SERIES: {
				LegacySeries legacySeries = (LegacySeries)theEObject;
				T result = caseLegacySeries(legacySeries);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY_SEPARATE_CONTRACT_SERIES_LIST: {
				LegacySeparateContractSeriesList legacySeparateContractSeriesList = (LegacySeparateContractSeriesList)theEObject;
				T result = caseLegacySeparateContractSeriesList(legacySeparateContractSeriesList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY_SEPARATE_CONTRACT_SERIES: {
				LegacySeparateContractSeries legacySeparateContractSeries = (LegacySeparateContractSeries)theEObject;
				T result = caseLegacySeparateContractSeries(legacySeparateContractSeries);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY_DISTANCE_FARES: {
				LegacyDistanceFares legacyDistanceFares = (LegacyDistanceFares)theEObject;
				T result = caseLegacyDistanceFares(legacyDistanceFares);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY_DISTANCE_FARE: {
				LegacyDistanceFare legacyDistanceFare = (LegacyDistanceFare)theEObject;
				T result = caseLegacyDistanceFare(legacyDistanceFare);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY_VIASTATION: {
				LegacyViastation legacyViastation = (LegacyViastation)theEObject;
				T result = caseLegacyViastation(legacyViastation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GTM Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GTM Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGTMTool(GTMTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Lists</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Lists</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeLists(CodeLists object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NUTS Codes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NUTS Codes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNUTSCodes(NUTSCodes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nuts Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nuts Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutsCode(NutsCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Brands</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Brands</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceBrands(ServiceBrands object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Brand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Brand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceBrand(ServiceBrand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Countries</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Countries</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountries(Countries object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Country</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Country</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountry(Country object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Languages</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Languages</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguages(Languages object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguage(Language object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Currencies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Currencies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrencies(Currencies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Currency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Currency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrency(Currency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStations(Stations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Station</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Station</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStation(Station object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Station Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Station Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStationRelation(StationRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carrier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carrier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarrier(Carrier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carriers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carriers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarriers(Carriers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Station Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Station Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStationSet(StationSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Tariff Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Tariff Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralTariffModel(GeneralTariffModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delivery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelivery(Delivery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>After Sales Rules</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>After Sales Rules</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAfterSalesRules(AfterSalesRules object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>After Sales Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>After Sales Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAfterSalesRule(AfterSalesRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>After Sales Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>After Sales Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAfterSalesCondition(AfterSalesCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationTime(ApplicationTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fare Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fare Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFareStructure(FareStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Points</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Points</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionPoints(ConnectionPoints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionPoint(ConnectionPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fare Resource Locations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fare Resource Locations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFareResourceLocations(FareResourceLocations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Train Resource Locations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Train Resource Locations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrainResourceLocations(TrainResourceLocations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Station Resource Locations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Station Resource Locations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStationResourceLocations(StationResourceLocations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carrier Resource Locations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carrier Resource Locations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarrierResourceLocations(CarrierResourceLocations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Train Resource Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Train Resource Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrainResourceLocation(TrainResourceLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Station Resource Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Station Resource Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStationResourceLocation(StationResourceLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Online Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Online Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnlineResource(OnlineResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fulfillment Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fulfillment Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFulfillmentConstraints(FulfillmentConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fulfillment Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fulfillment Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFulfillmentConstraint(FulfillmentConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Barcodes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Barcodes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredBarcodes(RequiredBarcodes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accepted Barcodes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accepted Barcodes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptedBarcodes(AcceptedBarcodes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supported Online Services</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supported Online Services</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportedOnlineServices(SupportedOnlineServices object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Station Names</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Station Names</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStationNames(StationNames object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fare Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fare Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFareElement(FareElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fare Station Set Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fare Station Set Definitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFareStationSetDefinitions(FareStationSetDefinitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fare Station Set Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fare Station Set Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFareStationSetDefinition(FareStationSetDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Accounting Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Accounting Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyAccountingIdentifier(LegacyAccountingIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reduction Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reduction Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReductionConstraints(ReductionConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fare Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fare Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFareElements(FareElements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Personal Data Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Personal Data Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonalDataConstraints(PersonalDataConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Personal Data Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Personal Data Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonalDataConstraint(PersonalDataConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Personal Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Personal Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredPersonalData(RequiredPersonalData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allowed Personal Data Changes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allowed Personal Data Changes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllowedPersonalDataChanges(AllowedPersonalDataChanges object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Passenger Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Passenger Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassengerConstraints(PassengerConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Passenger Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Passenger Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassengerConstraint(PassengerConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Passenger Combination Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Passenger Combination Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassengerCombinationConstraint(PassengerCombinationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Included Free Passenger Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Included Free Passenger Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncludedFreePassengerLimit(IncludedFreePassengerLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combination Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combination Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombinationConstraints(CombinationConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combination Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combination Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombinationConstraint(CombinationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Travel Validity Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Travel Validity Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTravelValidityConstraints(TravelValidityConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Travel Validity Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Travel Validity Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTravelValidityConstraint(TravelValidityConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sales Availability Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sales Availability Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSalesAvailabilityConstraints(SalesAvailabilityConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sales Availability Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sales Availability Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSalesAvailabilityConstraint(SalesAvailabilityConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sales Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sales Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSalesRestriction(SalesRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Of Sale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Of Sale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndOfSale(EndOfSale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Of Sale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Of Sale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartOfSale(StartOfSale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reduction Cards</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reduction Cards</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReductionCards(ReductionCards object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reduction Card</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reduction Card</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReductionCard(ReductionCard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carrier Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carrier Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarrierConstraints(CarrierConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carrier Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carrier Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarrierConstraint(CarrierConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceConstraints(ServiceConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceConstraint(ServiceConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regional Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regional Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegionalConstraints(RegionalConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regional Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regional Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegionalConstraint(RegionalConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regional Validity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regional Validity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegionalValidity(RegionalValidity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Level Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Level Definitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceLevelDefinitions(ServiceLevelDefinitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Texts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Texts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTexts(Texts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Translation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Translation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTranslation(Translation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prices</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prices</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrices(Prices object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Price</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Price</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrice(Price object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VAT Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VAT Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVATDetail(VATDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Currency Price</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Currency Price</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrencyPrice(CurrencyPrice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Class Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Class Definitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceClassDefinitions(ServiceClassDefinitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calendars</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calendars</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalendars(Calendars object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calendar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calendar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalendar(Calendar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reservation Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reservation Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReservationParameters(ReservationParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reservation Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reservation Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReservationParameter(ReservationParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reservation Params9181</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reservation Params9181</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReservationParams9181(ReservationParams9181 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reservation Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reservation Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReservationOptions(ReservationOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reservation Preference Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reservation Preference Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReservationPreferenceGroup(ReservationPreferenceGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceClass(ServiceClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceLevel(ServiceLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeRange(TimeRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Excluded Time Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Excluded Time Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExcludedTimeRange(ExcludedTimeRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validity Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validity Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidityRange(ValidityRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativeTime(RelativeTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Validity Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Validity Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnValidityConstraint(ReturnValidityConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Via Station</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Via Station</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViaStation(ViaStation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternative Route</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternative Route</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlternativeRoute(AlternativeRoute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoute(Route object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZone(Zone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLine(Line object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolygone(Polygone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdge(Edge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zone Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zone Definitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZoneDefinitions(ZoneDefinitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zone Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zone Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZoneDefinition(ZoneDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carrier Resource Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carrier Resource Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarrierResourceLocation(CarrierResourceLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cross Border Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cross Border Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrossBorderCondition(CrossBorderCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fare Combination Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fare Combination Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFareCombinationModel(FareCombinationModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reduction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reduction Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReductionConstraint(ReductionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Reduction Card</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Reduction Card</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredReductionCard(RequiredReductionCard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conversion From Legacy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conversion From Legacy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConversionFromLegacy(ConversionFromLegacy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conversion Params</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conversion Params</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConversionParams(ConversionParams object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vat Templates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vat Templates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVatTemplates(VatTemplates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vat Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vat Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVatTemplate(VatTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fare Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fare Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFareTemplate(FareTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>After Sales Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>After Sales Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAfterSalesTemplate(AfterSalesTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Station To Service Constraint Mappings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Station To Service Constraint Mappings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyStationToServiceConstraintMappings(LegacyStationToServiceConstraintMappings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Border Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Border Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyBorderPoint(LegacyBorderPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Border Stations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Border Stations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnBorderStations(OnBorderStations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Fake Border Stations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Fake Border Stations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyFakeBorderStations(LegacyFakeBorderStations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Border Side</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Border Side</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyBorderSide(LegacyBorderSide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Border Points</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Border Points</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyBorderPoints(LegacyBorderPoints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Station To Service Constraint Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Station To Service Constraint Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyStationToServiceConstraintMapping(LegacyStationToServiceConstraintMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Station Mappings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Station Mappings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyStationMappings(LegacyStationMappings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Station Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Station Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyStationMap(LegacyStationMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Fare Detail Maps</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Fare Detail Maps</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyFareDetailMaps(LegacyFareDetailMaps object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Fare Detail Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Fare Detail Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyFareDetailMap(LegacyFareDetailMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Station</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Station</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyStation(LegacyStation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Boder Point Mappings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Boder Point Mappings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyBoderPointMappings(LegacyBoderPointMappings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Border Point Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Border Point Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyBorderPointMapping(LegacyBorderPointMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Fare Station Set Mappings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Fare Station Set Mappings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyFareStationSetMappings(LegacyFareStationSetMappings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Fare Station Set Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Fare Station Set Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyFareStationSetMap(LegacyFareStationSetMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy108</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy108</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacy108(Legacy108 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy108 Fare Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy108 Fare Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacy108FareDescription(Legacy108FareDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy108 Fares Descriptions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy108 Fares Descriptions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacy108FaresDescriptions(Legacy108FaresDescriptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy108 Stations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy108 Stations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacy108Stations(Legacy108Stations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy108 Station</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy108 Station</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacy108Station(Legacy108Station object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Route Fares</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Route Fares</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyRouteFares(LegacyRouteFares object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Route Fare</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Route Fare</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyRouteFare(LegacyRouteFare object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Series List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Series List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacySeriesList(LegacySeriesList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Series</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Series</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacySeries(LegacySeries object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Separate Contract Series List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Separate Contract Series List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacySeparateContractSeriesList(LegacySeparateContractSeriesList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Separate Contract Series</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Separate Contract Series</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacySeparateContractSeries(LegacySeparateContractSeries object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Distance Fares</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Distance Fares</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyDistanceFares(LegacyDistanceFares object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Distance Fare</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Distance Fare</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyDistanceFare(LegacyDistanceFare object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Viastation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Viastation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyViastation(LegacyViastation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Fare Templates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Fare Templates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyFareTemplates(LegacyFareTemplates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GtmSwitch
