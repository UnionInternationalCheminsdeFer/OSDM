/**
 */
package Gtm.impl;

import Gtm.AcceptedBarcodes;
import Gtm.AfterSalesCondition;
import Gtm.AfterSalesRule;
import Gtm.AfterSalesRules;
import Gtm.AfterSalesTemplate;
import Gtm.AfterSalesTransactionType;
import Gtm.AllowedPersonalDataChanges;
import Gtm.AlternativeRoute;
import Gtm.ApplicationTime;
import Gtm.BarcodeTypes;
import Gtm.Calendar;
import Gtm.Calendars;
import Gtm.Carrier;
import Gtm.CarrierConstraint;
import Gtm.CarrierConstraints;
import Gtm.CarrierResourceLocation;
import Gtm.CarrierResourceLocations;
import Gtm.Carriers;
import Gtm.CharacterSet;
import Gtm.ClassId;
import Gtm.ClassicClassType;
import Gtm.Clusters;
import Gtm.CodeLists;
import Gtm.CombinationConstraint;
import Gtm.CombinationConstraints;
import Gtm.CombinationModel;
import Gtm.ConnectionPoint;
import Gtm.ConnectionPoints;
import Gtm.ControlDataExchangeTypes;
import Gtm.ConversionFromLegacy;
import Gtm.ConversionParams;
import Gtm.Countries;
import Gtm.Country;
import Gtm.CrossBorderCondition;
import Gtm.Currencies;
import Gtm.Currency;
import Gtm.CurrencyPrice;
import Gtm.DataSource;
import Gtm.Delivery;
import Gtm.Edge;
import Gtm.EndOfSale;
import Gtm.ExcludedTimeRange;
import Gtm.FareCombinationModel;
import Gtm.FareElement;
import Gtm.FareElements;
import Gtm.FareResourceLocations;
import Gtm.FareStationSetDefinition;
import Gtm.FareStationSetDefinitions;
import Gtm.FareStructure;
import Gtm.FareTemplate;
import Gtm.FareType;
import Gtm.FulfillmentConstraint;
import Gtm.FulfillmentConstraints;
import Gtm.FulfillmentType;
import Gtm.GTMTool;
import Gtm.GeneralTariffModel;
import Gtm.GenericReductionCards;
import Gtm.GeoSystem;
import Gtm.GeoUnit;
import Gtm.GraphicalReservationType;
import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.HemisphereEW;
import Gtm.HemisphereNS;
import Gtm.IncludedFreePassengerLimit;
import Gtm.InterfaceType;
import Gtm.Language;
import Gtm.Languages;
import Gtm.Legacy108;
import Gtm.Legacy108FareDescription;
import Gtm.Legacy108FaresDescriptions;
import Gtm.Legacy108Station;
import Gtm.Legacy108Stations;
import Gtm.LegacyAccountingIdentifier;
import Gtm.LegacyBoderPointMappings;
import Gtm.LegacyBorderPoint;
import Gtm.LegacyBorderPointMapping;
import Gtm.LegacyBorderPoints;
import Gtm.LegacyBorderSide;
import Gtm.LegacyCalculationType;
import Gtm.LegacyConversionType;
import Gtm.LegacyDistanceFare;
import Gtm.LegacyDistanceFares;
import Gtm.LegacyFakeBorderStations;
import Gtm.LegacyFareDetailMap;
import Gtm.LegacyFareDetailMaps;
import Gtm.LegacyFareStationSetMap;
import Gtm.LegacyFareStationSetMappings;
import Gtm.LegacyFareTemplates;
import Gtm.LegacyPassengerType;
import Gtm.LegacyRouteFare;
import Gtm.LegacyRouteFares;
import Gtm.LegacySeparateContractSeries;
import Gtm.LegacySeparateContractSeriesList;
import Gtm.LegacySeries;
import Gtm.LegacySeriesList;
import Gtm.LegacySeriesType;
import Gtm.LegacyStation;
import Gtm.LegacyStationMap;
import Gtm.LegacyStationMappings;
import Gtm.LegacyStationToServiceConstraintMapping;
import Gtm.LegacyStationToServiceConstraintMappings;
import Gtm.LegacyViastation;
import Gtm.Line;
import Gtm.NUTSCodes;
import Gtm.NutsCode;
import Gtm.OfferRequestType;
import Gtm.OnBorderStations;
import Gtm.OnlineResource;
import Gtm.OnlineServiceType;
import Gtm.PassengerCombinationConstraint;
import Gtm.PassengerConstraint;
import Gtm.PassengerConstraints;
import Gtm.PersonalDataChangeReason;
import Gtm.PersonalDataConstraint;
import Gtm.PersonalDataConstraints;
import Gtm.PersonalDataItemsType;
import Gtm.PersonalDataTransferType;
import Gtm.Polygone;
import Gtm.Price;
import Gtm.Prices;
import Gtm.ReductionCard;
import Gtm.ReductionCards;
import Gtm.ReductionConstraint;
import Gtm.ReductionConstraints;
import Gtm.RegionalConstraint;
import Gtm.RegionalConstraints;
import Gtm.RegionalValidity;
import Gtm.RegulatoryCondition;
import Gtm.RelativeTime;
import Gtm.RequiredBarcodes;
import Gtm.RequiredPersonalData;
import Gtm.RequiredReductionCard;
import Gtm.ReservationBerthType;
import Gtm.ReservationOptions;
import Gtm.ReservationParameter;
import Gtm.ReservationParameters;
import Gtm.ReservationParams9181;
import Gtm.ReservationPreferenceGroup;
import Gtm.ReservationService;
import Gtm.ReservationServiceLevel;
import Gtm.ReservationTravelClass;
import Gtm.ReturnValidityConstraint;
import Gtm.Route;
import Gtm.SalesAvailabilityConstraint;
import Gtm.SalesAvailabilityConstraints;
import Gtm.SalesRestriction;
import Gtm.SchemaVersion;
import Gtm.ServiceBrand;
import Gtm.ServiceBrands;
import Gtm.ServiceClass;
import Gtm.ServiceClassDefinitions;
import Gtm.ServiceConstraint;
import Gtm.ServiceConstraints;
import Gtm.ServiceLevel;
import Gtm.ServiceLevelDefinitions;
import Gtm.ServiceMode;
import Gtm.StartOfSale;
import Gtm.Station;
import Gtm.StationFareDetailType;
import Gtm.StationNames;
import Gtm.StationRelation;
import Gtm.StationRelationType;
import Gtm.StationResourceLocation;
import Gtm.StationResourceLocations;
import Gtm.StationSet;
import Gtm.Stations;
import Gtm.SupportedOnlineServices;
import Gtm.TaxScope;
import Gtm.Text;
import Gtm.Texts;
import Gtm.TimeRange;
import Gtm.TimeRangeScope;
import Gtm.TimeReferenceType;
import Gtm.TimeUnit;
import Gtm.TimeZone;
import Gtm.TrainResourceLocation;
import Gtm.TrainResourceLocations;
import Gtm.Translation;
import Gtm.TravelValidityConstraint;
import Gtm.TravelValidityConstraints;
import Gtm.TravelerType;
import Gtm.VATDetail;
import Gtm.ValidityRange;
import Gtm.ViaStation;
import Gtm.WeekDay;
import Gtm.Zone;
import Gtm.ZoneDefinition;
import Gtm.ZoneDefinitions;

import Gtm.util.GtmValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GtmPackageImpl extends EPackageImpl implements GtmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gtmToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeListsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutsCodesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutsCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceBrandsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceBrandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languagesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currenciesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stationRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carrierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carriersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stationSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalTariffModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deliveryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass afterSalesRulesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass afterSalesRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass afterSalesConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fareStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionPointsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fareResourceLocationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainResourceLocationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stationResourceLocationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carrierResourceLocationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainResourceLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stationResourceLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onlineResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fulfillmentConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fulfillmentConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredBarcodesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptedBarcodesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportedOnlineServicesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stationNamesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fareElementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fareElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fareStationSetDefinitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fareStationSetDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacyAccountingIdentifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reductionConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personalDataConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personalDataConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredPersonalDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allowedPersonalDataChangesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passengerConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passengerConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passengerCombinationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includedFreePassengerLimitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combinationConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combinationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass travelValidityConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass travelValidityConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salesAvailabilityConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salesAvailabilityConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salesRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endOfSaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startOfSaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reductionCardsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reductionCardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carrierConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carrierConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionalConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionalConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionalValidityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceLevelDefinitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass translationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pricesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass priceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vatDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currencyPriceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceClassDefinitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calendarsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calendarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reservationParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reservationParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reservationParams9181EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reservationOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reservationPreferenceGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excludedTimeRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validityRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativeTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnValidityConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viaStationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeRouteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zoneDefinitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zoneDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carrierResourceLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crossBorderConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fareCombinationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reductionConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredReductionCardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conversionFromLegacyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conversionParamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fareTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass afterSalesTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacyStationToServiceConstraintMappingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacyBorderPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onBorderStationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacyFakeBorderStationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacyBorderSideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacyBorderPointsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacyStationToServiceConstraintMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacyStationMappingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacyStationMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacyFareDetailMapsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacyFareDetailMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacyStationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacyBoderPointMappingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacyBorderPointMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacyFareStationSetMappingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacyFareStationSetMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacy108EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacy108FareDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacy108FaresDescriptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacy108StationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacy108StationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacyRouteFaresEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacyRouteFareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacySeriesListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacySeriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacySeparateContractSeriesListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacySeparateContractSeriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacyDistanceFaresEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacyDistanceFareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacyViastationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacyFareTemplatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stationRelationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stationFareDetailTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum regulatoryConditionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum afterSalesTransactionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum barcodeTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum classicClassTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum characterSetEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clustersEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum combinationModelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum controlDataExchangeTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fareTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fulfillmentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum geoSystemEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum geoUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum graphicalReservationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hemisphereEWEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hemisphereNSEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interfaceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum legacyCalculationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum legacyPassengerTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum legacySeriesTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum legacyConversionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum offerRequestTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum onlineServiceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum personalDataItemsTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum personalDataTransferTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum personalDataChangeReasonEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reservationTravelClassEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reservationServiceLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reservationServiceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reservationBerthTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum schemaVersionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeZoneEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum taxScopeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeReferenceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeRangeScopeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum travelerTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum weekDayEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataSourceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum classIdEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genericReductionCardsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceModeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Gtm.GtmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GtmPackageImpl() {
		super(eNS_URI, GtmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link GtmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GtmPackage init() {
		if (isInited) return (GtmPackage)EPackage.Registry.INSTANCE.getEPackage(GtmPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGtmPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GtmPackageImpl theGtmPackage = registeredGtmPackage instanceof GtmPackageImpl ? (GtmPackageImpl)registeredGtmPackage : new GtmPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGtmPackage.createPackageContents();

		// Initialize created meta-data
		theGtmPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theGtmPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return GtmValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theGtmPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GtmPackage.eNS_URI, theGtmPackage);
		return theGtmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGTMTool() {
		return gtmToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGTMTool_ConversionFromLegacy() {
		return (EReference)gtmToolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGTMTool_CodeLists() {
		return (EReference)gtmToolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGTMTool_GeneralTariffModel() {
		return (EReference)gtmToolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeLists() {
		return codeListsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeLists_Carriers() {
		return (EReference)codeListsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeLists_Stations() {
		return (EReference)codeListsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeLists_Countries() {
		return (EReference)codeListsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeLists_Languages() {
		return (EReference)codeListsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeLists_Currencies() {
		return (EReference)codeListsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeLists_ServiceBrands() {
		return (EReference)codeListsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeLists_NutsCodes() {
		return (EReference)codeListsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUTSCodes() {
		return nutsCodesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUTSCodes_NutsCodes() {
		return (EReference)nutsCodesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNutsCode() {
		return nutsCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNutsCode_Name() {
		return (EAttribute)nutsCodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNutsCode_Code() {
		return (EAttribute)nutsCodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceBrands() {
		return serviceBrandsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceBrands_ServiceBrands() {
		return (EReference)serviceBrandsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceBrands__FindServiceBRand__int() {
		return serviceBrandsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceBrand() {
		return serviceBrandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceBrand_Code() {
		return (EAttribute)serviceBrandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceBrand_Name() {
		return (EAttribute)serviceBrandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceBrand_Abbreviation() {
		return (EAttribute)serviceBrandEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceBrand_Description() {
		return (EAttribute)serviceBrandEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCountries() {
		return countriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCountries_Countries() {
		return (EReference)countriesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCountries__FindCountry__int() {
		return countriesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCountry() {
		return countryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountry_Code() {
		return (EAttribute)countryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountry_Name() {
		return (EAttribute)countryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountry_ISOcode() {
		return (EAttribute)countryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguages() {
		return languagesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguages_Languages() {
		return (EReference)languagesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguage() {
		return languageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_Name() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_Code() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrencies() {
		return currenciesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrencies_Currencies() {
		return (EReference)currenciesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCurrencies__FindCurrency__String() {
		return currenciesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrency() {
		return currencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrency_Name() {
		return (EAttribute)currencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrency_IsoCode() {
		return (EAttribute)currencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStations() {
		return stationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStations_Stations() {
		return (EReference)stationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStations__FindStation__int_int() {
		return stationsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStations__FindStation__int_String() {
		return stationsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStation() {
		return stationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStation_Name() {
		return (EAttribute)stationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStation_Country() {
		return (EReference)stationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStation_Code() {
		return (EAttribute)stationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStation_Longitude() {
		return (EAttribute)stationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStation_Latitude() {
		return (EAttribute)stationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStation_TimetableName() {
		return (EAttribute)stationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStation_BorderStation() {
		return (EAttribute)stationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStation_NameCaseUTF8() {
		return (EAttribute)stationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStation_NameCaseASCII() {
		return (EAttribute)stationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStation_ShortNameCaseASCII() {
		return (EAttribute)stationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStation_ShortNameCaseUTF8() {
		return (EAttribute)stationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStation_LegacyBorderPointCode() {
		return (EAttribute)stationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStation_Relations() {
		return (EReference)stationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStationRelation() {
		return stationRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStationRelation_RelationType() {
		return (EAttribute)stationRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationRelation_Station() {
		return (EReference)stationRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarrier() {
		return carrierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCarrier_Code() {
		return (EAttribute)carrierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCarrier_Name() {
		return (EAttribute)carrierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCarrier_ShortName() {
		return (EAttribute)carrierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarriers() {
		return carriersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarriers_Carriers() {
		return (EReference)carriersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCarriers__FindCarrier__String() {
		return carriersEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStationSet() {
		return stationSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationSet_Stations() {
		return (EReference)stationSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralTariffModel() {
		return generalTariffModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralTariffModel_Delivery() {
		return (EReference)generalTariffModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralTariffModel_FareStructure() {
		return (EReference)generalTariffModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelivery() {
		return deliveryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelivery_Id() {
		return (EAttribute)deliveryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelivery_PreviousDeliveryId() {
		return (EAttribute)deliveryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelivery_ReplacedDeliveryId() {
		return (EAttribute)deliveryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelivery_Optional() {
		return (EAttribute)deliveryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelivery_Provider() {
		return (EReference)deliveryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelivery_SchemaVersion() {
		return (EAttribute)deliveryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelivery_AcceptedSchemaVersion() {
		return (EAttribute)deliveryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAfterSalesRules() {
		return afterSalesRulesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAfterSalesRules_AfterSalesRules() {
		return (EReference)afterSalesRulesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAfterSalesRule() {
		return afterSalesRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAfterSalesRule_Id() {
		return (EAttribute)afterSalesRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAfterSalesRule_DataSource() {
		return (EAttribute)afterSalesRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAfterSalesRule_Conditions() {
		return (EReference)afterSalesRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAfterSalesCondition() {
		return afterSalesConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAfterSalesCondition_TransactionType() {
		return (EAttribute)afterSalesConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAfterSalesCondition_IndividualContracts() {
		return (EAttribute)afterSalesConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAfterSalesCondition_CarrierFee() {
		return (EAttribute)afterSalesConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAfterSalesCondition_Fee() {
		return (EReference)afterSalesConditionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAfterSalesCondition_ApplicationTime() {
		return (EReference)afterSalesConditionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationTime() {
		return applicationTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFareStructure() {
		return fareStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_ServiceClassDefinitions() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_ServiceLevelDefinitions() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_StationNames() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_FareStationSetDefinitions() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_Calendars() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_Texts() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_ReductionCards() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_FareElements() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_CombinationConstraints() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_SalesAvailabilityConstraints() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_TravelValidityConstraints() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_RegionalConstraints() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_ConnectionPoints() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_CarrierConstraints() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_ServiceConstraints() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_PassengerConstraints() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_ReductionConstraints() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_PersonalDataConstraints() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_AfterSalesRules() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_Prices() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_FulfillmentConstraints() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_ReservationParameters() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_SupportedOnlineServices() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_FareResourceLocations() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_ZoneDefinitions() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionPoints() {
		return connectionPointsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionPoints_ConnectionPoints() {
		return (EReference)connectionPointsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnectionPoints__FindSimpleConnectionPoint__Station() {
		return connectionPointsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionPoint() {
		return connectionPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionPoint_Id() {
		return (EAttribute)connectionPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionPoint_Name() {
		return (EAttribute)connectionPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionPoint_LegacyBorderPointCode() {
		return (EAttribute)connectionPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionPoint_Description() {
		return (EAttribute)connectionPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionPoint_ConnectedStationSets() {
		return (EReference)connectionPointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionPoint_DataSource() {
		return (EAttribute)connectionPointEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionPoint_NameUtf8() {
		return (EAttribute)connectionPointEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFareResourceLocations() {
		return fareResourceLocationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareResourceLocations_TrainResourceLocations() {
		return (EReference)fareResourceLocationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareResourceLocations_StationResourceLocations() {
		return (EReference)fareResourceLocationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareResourceLocations_CarrierResourceLocations() {
		return (EReference)fareResourceLocationsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrainResourceLocations() {
		return trainResourceLocationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainResourceLocations_TrainResourceLocations() {
		return (EReference)trainResourceLocationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStationResourceLocations() {
		return stationResourceLocationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationResourceLocations_StationResourceLocations() {
		return (EReference)stationResourceLocationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarrierResourceLocations() {
		return carrierResourceLocationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarrierResourceLocations_CarrierResourceLocations() {
		return (EReference)carrierResourceLocationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrainResourceLocation() {
		return trainResourceLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainResourceLocation_Carrier() {
		return (EReference)trainResourceLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainResourceLocation_OnlineResources() {
		return (EReference)trainResourceLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainResourceLocation_TrainId() {
		return (EAttribute)trainResourceLocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStationResourceLocation() {
		return stationResourceLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationResourceLocation_OnlineResources() {
		return (EReference)stationResourceLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationResourceLocation_Stations() {
		return (EReference)stationResourceLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationResourceLocation_ConnectionPoints() {
		return (EReference)stationResourceLocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnlineResource() {
		return onlineResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnlineResource_OfferRequestType() {
		return (EAttribute)onlineResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnlineResource_InterfaceType() {
		return (EAttribute)onlineResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnlineResource_Version() {
		return (EAttribute)onlineResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnlineResource_System() {
		return (EAttribute)onlineResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFulfillmentConstraints() {
		return fulfillmentConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFulfillmentConstraints_FulfillmentConstraints() {
		return (EReference)fulfillmentConstraintsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFulfillmentConstraint() {
		return fulfillmentConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFulfillmentConstraint_Id() {
		return (EAttribute)fulfillmentConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFulfillmentConstraint_AcceptedFulfilmentTypes() {
		return (EAttribute)fulfillmentConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFulfillmentConstraint_RequiredControlDataExchange() {
		return (EAttribute)fulfillmentConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFulfillmentConstraint_IndividualTicketingPermitted() {
		return (EAttribute)fulfillmentConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFulfillmentConstraint_AcceptedBarcodes() {
		return (EReference)fulfillmentConstraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFulfillmentConstraint_RequiredBarcodes() {
		return (EReference)fulfillmentConstraintEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFulfillmentConstraint_DataDescription() {
		return (EAttribute)fulfillmentConstraintEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredBarcodes() {
		return requiredBarcodesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredBarcodes_RequiredBarcodes() {
		return (EAttribute)requiredBarcodesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptedBarcodes() {
		return acceptedBarcodesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcceptedBarcodes_AcceptedBarcodes() {
		return (EAttribute)acceptedBarcodesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportedOnlineServices() {
		return supportedOnlineServicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupportedOnlineServices_SupportedOnlineServices() {
		return (EAttribute)supportedOnlineServicesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStationNames() {
		return stationNamesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationNames_StationName() {
		return (EReference)stationNamesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFareElements() {
		return fareElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElements_FareElements() {
		return (EReference)fareElementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFareElement() {
		return fareElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareElement_Id() {
		return (EAttribute)fareElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareElement_Type() {
		return (EAttribute)fareElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareElement_DataDescription() {
		return (EAttribute)fareElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_Text() {
		return (EReference)fareElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_Price() {
		return (EReference)fareElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_RegionalConstraint() {
		return (EReference)fareElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_ServiceConstraint() {
		return (EReference)fareElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_CarrierConstraint() {
		return (EReference)fareElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_ServiceClass() {
		return (EReference)fareElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_ServiceLevel() {
		return (EReference)fareElementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_SalesAvailability() {
		return (EReference)fareElementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_TravelValidity() {
		return (EReference)fareElementEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_CombinationConstraint() {
		return (EReference)fareElementEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_FareDetailDescription() {
		return (EReference)fareElementEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_PersonalDataConstraint() {
		return (EReference)fareElementEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_ReservationParameter() {
		return (EReference)fareElementEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_ReductionConstraint() {
		return (EReference)fareElementEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_FulfillmentConstraint() {
		return (EReference)fareElementEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_PassengerConstraint() {
		return (EReference)fareElementEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareElement_RegulatoryConditions() {
		return (EAttribute)fareElementEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_AfterSalesRule() {
		return (EReference)fareElementEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareElement_DataSource() {
		return (EAttribute)fareElementEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_LegacyAccountingIdentifier() {
		return (EReference)fareElementEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareElement_LegacyConversion() {
		return (EAttribute)fareElementEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareElement_IndividualContracts() {
		return (EAttribute)fareElementEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFareStationSetDefinitions() {
		return fareStationSetDefinitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStationSetDefinitions_FareStationSetDefinitions() {
		return (EReference)fareStationSetDefinitionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFareStationSetDefinitions__FindFareSet__Carrier_int() {
		return fareStationSetDefinitionsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFareStationSetDefinition() {
		return fareStationSetDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareStationSetDefinition_DataSource() {
		return (EAttribute)fareStationSetDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStationSetDefinition_Carrier() {
		return (EReference)fareStationSetDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareStationSetDefinition_Code() {
		return (EAttribute)fareStationSetDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareStationSetDefinition_LegacyCode() {
		return (EAttribute)fareStationSetDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareStationSetDefinition_Id() {
		return (EAttribute)fareStationSetDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareStationSetDefinition_Name() {
		return (EAttribute)fareStationSetDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareStationSetDefinition_NameUtf8() {
		return (EAttribute)fareStationSetDefinitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStationSetDefinition_Stations() {
		return (EReference)fareStationSetDefinitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacyAccountingIdentifier() {
		return legacyAccountingIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyAccountingIdentifier_SeriesId() {
		return (EAttribute)legacyAccountingIdentifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyAccountingIdentifier_TariffId() {
		return (EAttribute)legacyAccountingIdentifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyAccountingIdentifier_AddSeriesId() {
		return (EAttribute)legacyAccountingIdentifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReductionConstraints() {
		return reductionConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReductionConstraints_ReductionConstraints() {
		return (EReference)reductionConstraintsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonalDataConstraints() {
		return personalDataConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonalDataConstraints_PersonalDataConstraints() {
		return (EReference)personalDataConstraintsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonalDataConstraint() {
		return personalDataConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonalDataConstraint_Id() {
		return (EAttribute)personalDataConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonalDataConstraint_RequiredPersonalData() {
		return (EReference)personalDataConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonalDataConstraint_AllowedChanges() {
		return (EReference)personalDataConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredPersonalData() {
		return requiredPersonalDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredPersonalData_TicketHolderOnly() {
		return (EAttribute)requiredPersonalDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredPersonalData_DataItem() {
		return (EAttribute)requiredPersonalDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredPersonalData_Transfer() {
		return (EAttribute)requiredPersonalDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredPersonalData_FulfillmentType() {
		return (EAttribute)requiredPersonalDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredPersonalData_CrossBorder() {
		return (EReference)requiredPersonalDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllowedPersonalDataChanges() {
		return allowedPersonalDataChangesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllowedPersonalDataChanges_TimeLimit() {
		return (EAttribute)allowedPersonalDataChangesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllowedPersonalDataChanges_AcceptedReason() {
		return (EAttribute)allowedPersonalDataChangesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassengerConstraints() {
		return passengerConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassengerConstraints_PassengerConstraints() {
		return (EReference)passengerConstraintsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassengerConstraint() {
		return passengerConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerConstraint_Id() {
		return (EAttribute)passengerConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerConstraint_TravelerType() {
		return (EAttribute)passengerConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassengerConstraint_Text() {
		return (EReference)passengerConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerConstraint_UpperAgeLimit() {
		return (EAttribute)passengerConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerConstraint_LowerAgeLimit() {
		return (EAttribute)passengerConstraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerConstraint_TravelAloneAgeLimit() {
		return (EAttribute)passengerConstraintEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerConstraint_ReservationAgeLimit() {
		return (EAttribute)passengerConstraintEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerConstraint_IsAncilliary() {
		return (EAttribute)passengerConstraintEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerConstraint_PassengerWeight() {
		return (EAttribute)passengerConstraintEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerConstraint_MaxTotalPassengerWeight() {
		return (EAttribute)passengerConstraintEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerConstraint_MinTotalPassengerWeight() {
		return (EAttribute)passengerConstraintEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassengerConstraint_IncludedFreePassengers() {
		return (EReference)passengerConstraintEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassengerConstraint_ExcludedPassengerCombinations() {
		return (EReference)passengerConstraintEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerConstraint_DataDescription() {
		return (EAttribute)passengerConstraintEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassengerCombinationConstraint() {
		return passengerCombinationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerCombinationConstraint_MaxNumber() {
		return (EAttribute)passengerCombinationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerCombinationConstraint_PassengerType() {
		return (EAttribute)passengerCombinationConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncludedFreePassengerLimit() {
		return includedFreePassengerLimitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncludedFreePassengerLimit_Number() {
		return (EAttribute)includedFreePassengerLimitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncludedFreePassengerLimit_PassengerType() {
		return (EAttribute)includedFreePassengerLimitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCombinationConstraints() {
		return combinationConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinationConstraints_CombinationConstraints() {
		return (EReference)combinationConstraintsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCombinationConstraint() {
		return combinationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCombinationConstraint_Id() {
		return (EAttribute)combinationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCombinationConstraint_DataDescription() {
		return (EAttribute)combinationConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinationConstraint_CombinationModels() {
		return (EReference)combinationConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTravelValidityConstraints() {
		return travelValidityConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTravelValidityConstraints_TravelValidityConstraints() {
		return (EReference)travelValidityConstraintsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTravelValidityConstraint() {
		return travelValidityConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTravelValidityConstraint_Id() {
		return (EAttribute)travelValidityConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTravelValidityConstraint_DataDescription() {
		return (EAttribute)travelValidityConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTravelValidityConstraint_ValidDays() {
		return (EReference)travelValidityConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTravelValidityConstraint_TravelDays() {
		return (EAttribute)travelValidityConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTravelValidityConstraint_Range() {
		return (EReference)travelValidityConstraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTravelValidityConstraint_ReturnConstraint() {
		return (EReference)travelValidityConstraintEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTravelValidityConstraint_ExcludedTimeRange() {
		return (EReference)travelValidityConstraintEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSalesAvailabilityConstraints() {
		return salesAvailabilityConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSalesAvailabilityConstraints_SalesAvailabilityConstraints() {
		return (EReference)salesAvailabilityConstraintsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSalesAvailabilityConstraint() {
		return salesAvailabilityConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSalesAvailabilityConstraint_Id() {
		return (EAttribute)salesAvailabilityConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSalesAvailabilityConstraint_DataDescription() {
		return (EAttribute)salesAvailabilityConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSalesAvailabilityConstraint_Restrictions() {
		return (EReference)salesAvailabilityConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSalesAvailabilityConstraint_DataSource() {
		return (EAttribute)salesAvailabilityConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSalesRestriction() {
		return salesRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSalesRestriction_SalesDates() {
		return (EReference)salesRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSalesRestriction_StartOfSale() {
		return (EReference)salesRestrictionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSalesRestriction_EndOfSale() {
		return (EReference)salesRestrictionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndOfSale() {
		return endOfSaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartOfSale() {
		return startOfSaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReductionCards() {
		return reductionCardsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReductionCards_ReductionCards() {
		return (EReference)reductionCardsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReductionCard() {
		return reductionCardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReductionCard_Id() {
		return (EAttribute)reductionCardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReductionCard_CardIssuer() {
		return (EReference)reductionCardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReductionCard_Name() {
		return (EReference)reductionCardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReductionCard_ServiceClasses() {
		return (EReference)reductionCardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReductionCard_IdRequiredForBooking() {
		return (EAttribute)reductionCardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarrierConstraints() {
		return carrierConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarrierConstraints_CarrierConstraints() {
		return (EReference)carrierConstraintsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarrierConstraint() {
		return carrierConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCarrierConstraint_Id() {
		return (EAttribute)carrierConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarrierConstraint_IncludedCarriers() {
		return (EReference)carrierConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarrierConstraint_ExcludedCarriers() {
		return (EReference)carrierConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCarrierConstraint_DataDescription() {
		return (EAttribute)carrierConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceConstraints() {
		return serviceConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceConstraints_ServiceConstraints() {
		return (EReference)serviceConstraintsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceConstraint() {
		return serviceConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceConstraint_Id() {
		return (EAttribute)serviceConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceConstraint_IncludedServiceBrands() {
		return (EReference)serviceConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceConstraint_ExcludedServiceBrands() {
		return (EReference)serviceConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceConstraint_DataDescription() {
		return (EAttribute)serviceConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegionalConstraints() {
		return regionalConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegionalConstraints_RegionalConstraints() {
		return (EReference)regionalConstraintsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegionalConstraint() {
		return regionalConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegionalConstraint_Id() {
		return (EAttribute)regionalConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegionalConstraint_Distance() {
		return (EAttribute)regionalConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegionalConstraint_EntryConnectionPoint() {
		return (EReference)regionalConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegionalConstraint_ExitConnectionPoint() {
		return (EReference)regionalConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegionalConstraint_RegionalValidity() {
		return (EReference)regionalConstraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegionalConstraint_DataSource() {
		return (EAttribute)regionalConstraintEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegionalConstraint_DataDescription() {
		return (EAttribute)regionalConstraintEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegionalValidity() {
		return regionalValidityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegionalValidity_SeqNb() {
		return (EAttribute)regionalValidityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegionalValidity_ViaStation() {
		return (EReference)regionalValidityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegionalValidity_Zone() {
		return (EReference)regionalValidityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegionalValidity_Line() {
		return (EReference)regionalValidityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegionalValidity_Polygone() {
		return (EReference)regionalValidityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceLevelDefinitions() {
		return serviceLevelDefinitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceLevelDefinitions_ServiceLevelDefinition() {
		return (EReference)serviceLevelDefinitionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTexts() {
		return textsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTexts_Texts() {
		return (EReference)textsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getText() {
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_Id() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_TextUTF8() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_TextICAO() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_ShortTextUTF8() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_ShortTextICAO() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getText_Translations() {
		return (EReference)textEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTranslation() {
		return translationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTranslation_Language() {
		return (EReference)translationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTranslation_TextUTF8() {
		return (EAttribute)translationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTranslation_TextICAO() {
		return (EAttribute)translationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTranslation_ShortTextUTF8() {
		return (EAttribute)translationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTranslation_ShortTextICAO() {
		return (EAttribute)translationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrices() {
		return pricesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrices_Prices() {
		return (EReference)pricesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrice() {
		return priceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrice_Id() {
		return (EAttribute)priceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrice_Currencies() {
		return (EReference)priceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrice_DataSource() {
		return (EAttribute)priceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVATDetail() {
		return vatDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVATDetail_Amount() {
		return (EAttribute)vatDetailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVATDetail_Percentage() {
		return (EAttribute)vatDetailEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVATDetail_Country() {
		return (EReference)vatDetailEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVATDetail_TaxId() {
		return (EAttribute)vatDetailEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVATDetail_Scope() {
		return (EAttribute)vatDetailEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrencyPrice() {
		return currencyPriceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrencyPrice_Currency() {
		return (EReference)currencyPriceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyPrice_Amount() {
		return (EAttribute)currencyPriceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrencyPrice_VATdetails() {
		return (EReference)currencyPriceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceClassDefinitions() {
		return serviceClassDefinitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceClassDefinitions_ServiceClassDefinitions() {
		return (EReference)serviceClassDefinitionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalendars() {
		return calendarsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalendars_Calendars() {
		return (EReference)calendarsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalendar() {
		return calendarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalendar_Name() {
		return (EAttribute)calendarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalendar_Id() {
		return (EAttribute)calendarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalendar_FromDate() {
		return (EAttribute)calendarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalendar_UntilDate() {
		return (EAttribute)calendarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalendar_UtcOffset() {
		return (EAttribute)calendarEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalendar_Dates() {
		return (EAttribute)calendarEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalendar_DataSource() {
		return (EAttribute)calendarEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReservationParameters() {
		return reservationParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservationParameters_ReservationParameters() {
		return (EReference)reservationParametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReservationParameter() {
		return reservationParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationParameter_MandatoryReservation() {
		return (EAttribute)reservationParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationParameter_Id() {
		return (EAttribute)reservationParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservationParameter_Params9181() {
		return (EReference)reservationParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservationParameter_Options() {
		return (EReference)reservationParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservationParameter_MandatoryReservationForBrands() {
		return (EReference)reservationParameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationParameter_MandatoryReservationsForMode() {
		return (EAttribute)reservationParameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReservationParams9181() {
		return reservationParams9181EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationParams9181_TravelClass() {
		return (EAttribute)reservationParams9181EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationParams9181_ServiceLevel() {
		return (EAttribute)reservationParams9181EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationParams9181_Service() {
		return (EAttribute)reservationParams9181EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationParams9181_BerthType() {
		return (EAttribute)reservationParams9181EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationParams9181_CoachType() {
		return (EAttribute)reservationParams9181EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationParams9181_CompartmentType() {
		return (EAttribute)reservationParams9181EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationParams9181_Tariff() {
		return (EAttribute)reservationParams9181EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReservationOptions() {
		return reservationOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservationOptions_Preferences() {
		return (EReference)reservationOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservationOptions_ServiceBrands() {
		return (EReference)reservationOptionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationOptions_GraphicalReservation() {
		return (EAttribute)reservationOptionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReservationPreferenceGroup() {
		return reservationPreferenceGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationPreferenceGroup_Preference() {
		return (EAttribute)reservationPreferenceGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationPreferenceGroup_Group() {
		return (EAttribute)reservationPreferenceGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceClass() {
		return serviceClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceClass_Id() {
		return (EAttribute)serviceClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceClass_ClassicClass() {
		return (EAttribute)serviceClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceClass_Text() {
		return (EReference)serviceClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceLevel() {
		return serviceLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceLevel_Id() {
		return (EAttribute)serviceLevelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceLevel_Text() {
		return (EReference)serviceLevelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceLevel_CombiningServiceClasses() {
		return (EReference)serviceLevelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceLevel_ReservationParameter() {
		return (EReference)serviceLevelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceLevel_IncludesClassName() {
		return (EAttribute)serviceLevelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeRange() {
		return timeRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeRange_Scope() {
		return (EAttribute)timeRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeRange_From() {
		return (EAttribute)timeRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeRange_Until() {
		return (EAttribute)timeRangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExcludedTimeRange() {
		return excludedTimeRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValidityRange() {
		return validityRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValidityRange_Unit() {
		return (EAttribute)validityRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValidityRange_Value() {
		return (EAttribute)validityRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValidityRange_HoursAfterMidnight() {
		return (EAttribute)validityRangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelativeTime() {
		return relativeTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeTime_Unit() {
		return (EAttribute)relativeTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeTime_Reference() {
		return (EAttribute)relativeTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeTime_Value() {
		return (EAttribute)relativeTimeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnValidityConstraint() {
		return returnValidityConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturnValidityConstraint_ExcludedWeekdays() {
		return (EAttribute)returnValidityConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturnValidityConstraint_LatestReturn() {
		return (EAttribute)returnValidityConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturnValidityConstraint_EarliestReturn() {
		return (EAttribute)returnValidityConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViaStation() {
		return viaStationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViaStation_Station() {
		return (EReference)viaStationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViaStation_Carrier() {
		return (EReference)viaStationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViaStation_Route() {
		return (EReference)viaStationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViaStation_AlternativeRoutes() {
		return (EReference)viaStationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViaStation_DataDescription() {
		return (EAttribute)viaStationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViaStation_FareStationSet() {
		return (EReference)viaStationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getViaStation__GetDescription() {
		return viaStationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlternativeRoute() {
		return alternativeRouteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlternativeRoute_Stations() {
		return (EReference)alternativeRouteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoute() {
		return routeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoute_Stations() {
		return (EReference)routeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZone() {
		return zoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZone_BinaryZoneId() {
		return (EAttribute)zoneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZone_ZoneId() {
		return (EAttribute)zoneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZone_City() {
		return (EAttribute)zoneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZone_Carrier() {
		return (EReference)zoneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZone_EntryStation() {
		return (EReference)zoneEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZone_TerminalStation() {
		return (EReference)zoneEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZone_NutsCode() {
		return (EReference)zoneEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLine() {
		return lineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_BinaryZoneId() {
		return (EAttribute)lineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_LineId() {
		return (EAttribute)lineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_Carrier() {
		return (EReference)lineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_EntryStation() {
		return (EReference)lineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_TerminalStation() {
		return (EReference)lineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_NutsCode() {
		return (EReference)lineEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_City() {
		return (EAttribute)lineEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolygone() {
		return polygoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolygone_Edge() {
		return (EReference)polygoneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdge() {
		return edgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdge_System() {
		return (EAttribute)edgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdge_Accuracy() {
		return (EAttribute)edgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdge_Longitude() {
		return (EAttribute)edgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdge_Latitude() {
		return (EAttribute)edgeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZoneDefinitions() {
		return zoneDefinitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZoneDefinitions_ZoneDefinition() {
		return (EReference)zoneDefinitionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZoneDefinition() {
		return zoneDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZoneDefinition_Provider() {
		return (EReference)zoneDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZoneDefinition_ZoneId() {
		return (EAttribute)zoneDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZoneDefinition_Name() {
		return (EAttribute)zoneDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZoneDefinition_Polygone() {
		return (EReference)zoneDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZoneDefinition_NameUtf8() {
		return (EAttribute)zoneDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZoneDefinition_StationSet() {
		return (EReference)zoneDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZoneDefinition_NutsCodes() {
		return (EReference)zoneDefinitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarrierResourceLocation() {
		return carrierResourceLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarrierResourceLocation_Carrier() {
		return (EReference)carrierResourceLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarrierResourceLocation_ServiceBrand() {
		return (EReference)carrierResourceLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarrierResourceLocation_OnlineResources() {
		return (EReference)carrierResourceLocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCrossBorderCondition() {
		return crossBorderConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrossBorderCondition_FromCountry() {
		return (EReference)crossBorderConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrossBorderCondition_ToCountry() {
		return (EReference)crossBorderConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrossBorderCondition_AffectedServiceBrands() {
		return (EReference)crossBorderConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFareCombinationModel() {
		return fareCombinationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareCombinationModel_Model() {
		return (EAttribute)fareCombinationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareCombinationModel_CombinableCarriers() {
		return (EReference)fareCombinationModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareCombinationModel_OnlyWhenCombined() {
		return (EAttribute)fareCombinationModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareCombinationModel_AllowedAllocators() {
		return (EReference)fareCombinationModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareCombinationModel_ReferenceCluster() {
		return (EAttribute)fareCombinationModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareCombinationModel_AllowedClusters() {
		return (EAttribute)fareCombinationModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareCombinationModel_AllowedCommonContracts() {
		return (EReference)fareCombinationModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReductionConstraint() {
		return reductionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReductionConstraint_Id() {
		return (EAttribute)reductionConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReductionConstraint_RequiredReductionCards() {
		return (EReference)reductionConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredReductionCard() {
		return requiredReductionCardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredReductionCard_CardClass() {
		return (EReference)requiredReductionCardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredReductionCard_Card() {
		return (EReference)requiredReductionCardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredReductionCard_Name() {
		return (EAttribute)requiredReductionCardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConversionFromLegacy() {
		return conversionFromLegacyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversionFromLegacy_Legacy108() {
		return (EReference)conversionFromLegacyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversionFromLegacy_Params() {
		return (EReference)conversionFromLegacyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConversionParams() {
		return conversionParamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionParams_TaxId() {
		return (EAttribute)conversionParamsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionParams_VATpercentage() {
		return (EAttribute)conversionParamsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversionParams_Country() {
		return (EReference)conversionParamsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversionParams_LegacyBorderPointMappings() {
		return (EReference)conversionParamsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversionParams_LegacyStationMappings() {
		return (EReference)conversionParamsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversionParams_LegacyFareTemplates() {
		return (EReference)conversionParamsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversionParams_LegacyFareStationMappings() {
		return (EReference)conversionParamsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversionParams_LegacyStationToServiceBrandMappings() {
		return (EReference)conversionParamsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversionParams_LegacyStationToFareDetailMappings() {
		return (EReference)conversionParamsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversionParams_EndOfSale() {
		return (EReference)conversionParamsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversionParams_StartOfSale() {
		return (EReference)conversionParamsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionParams_StationImportFilter() {
		return (EAttribute)conversionParamsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionParams_ConvertFareDescriptions() {
		return (EAttribute)conversionParamsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionParams_ConvertServiceConstraints() {
		return (EAttribute)conversionParamsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFareTemplate() {
		return fareTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareTemplate_PriceFactor() {
		return (EAttribute)fareTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareTemplate_Price() {
		return (EReference)fareTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareTemplate_Id() {
		return (EAttribute)fareTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareTemplate_Type() {
		return (EAttribute)fareTemplateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareTemplate_AfterSalesTemplate() {
		return (EReference)fareTemplateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareTemplate_DataDescription() {
		return (EAttribute)fareTemplateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareTemplate_Text() {
		return (EReference)fareTemplateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareTemplate_RegionalConstraint() {
		return (EReference)fareTemplateEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareTemplate_ServiceConstraint() {
		return (EReference)fareTemplateEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareTemplate_CarrierConstraint() {
		return (EReference)fareTemplateEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareTemplate_ServiceClass() {
		return (EReference)fareTemplateEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareTemplate_ServiceLevel() {
		return (EReference)fareTemplateEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareTemplate_SalesAvailability() {
		return (EReference)fareTemplateEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareTemplate_TravelValidity() {
		return (EReference)fareTemplateEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareTemplate_CombinationConstraint() {
		return (EReference)fareTemplateEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareTemplate_SeparateContractCombinationConstraint() {
		return (EReference)fareTemplateEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareTemplate_FareDetailDescription() {
		return (EReference)fareTemplateEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareTemplate_LegacyAccountingIdentifier() {
		return (EReference)fareTemplateEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareTemplate_PersonalDataConstraint() {
		return (EReference)fareTemplateEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareTemplate_ReservationParameter() {
		return (EReference)fareTemplateEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareTemplate_ReductionConstraint() {
		return (EReference)fareTemplateEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareTemplate_FulfillmentConstraint() {
		return (EReference)fareTemplateEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareTemplate_PassengerConstraint() {
		return (EReference)fareTemplateEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareTemplate_LegacyConversion() {
		return (EAttribute)fareTemplateEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareTemplate_IndividualContracts() {
		return (EAttribute)fareTemplateEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareTemplate_RegulatoryConditions() {
		return (EAttribute)fareTemplateEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAfterSalesTemplate() {
		return afterSalesTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAfterSalesTemplate_TransactionType() {
		return (EAttribute)afterSalesTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAfterSalesTemplate_CarrierFee() {
		return (EAttribute)afterSalesTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAfterSalesTemplate_ApplicationTime() {
		return (EReference)afterSalesTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAfterSalesTemplate_FeeFactor() {
		return (EAttribute)afterSalesTemplateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacyStationToServiceConstraintMappings() {
		return legacyStationToServiceConstraintMappingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacyStationToServiceConstraintMappings_LegacyStationToServiceBrandMappings() {
		return (EReference)legacyStationToServiceConstraintMappingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLegacyStationToServiceConstraintMappings__FindServiceConstraint__int() {
		return legacyStationToServiceConstraintMappingsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacyBorderPoint() {
		return legacyBorderPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyBorderPoint_BorderPointCode() {
		return (EAttribute)legacyBorderPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacyBorderPoint_FakeBorderStations() {
		return (EReference)legacyBorderPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacyBorderPoint_OnBorderStations() {
		return (EReference)legacyBorderPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacyBorderPoint_BorderSides() {
		return (EReference)legacyBorderPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnBorderStations() {
		return onBorderStationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnBorderStations_Stations() {
		return (EReference)onBorderStationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacyFakeBorderStations() {
		return legacyFakeBorderStationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacyFakeBorderStations_Stations() {
		return (EReference)legacyFakeBorderStationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacyBorderSide() {
		return legacyBorderSideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacyBorderSide_Carrier() {
		return (EReference)legacyBorderSideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacyBorderSide_Stations() {
		return (EReference)legacyBorderSideEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyBorderSide_LegacyStationCode() {
		return (EAttribute)legacyBorderSideEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacyBorderPoints() {
		return legacyBorderPointsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacyBorderPoints_LegacyBorderPoints() {
		return (EReference)legacyBorderPointsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacyStationToServiceConstraintMapping() {
		return legacyStationToServiceConstraintMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyStationToServiceConstraintMapping_Code() {
		return (EAttribute)legacyStationToServiceConstraintMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacyStationToServiceConstraintMapping_ServiceConstraint() {
		return (EReference)legacyStationToServiceConstraintMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyStationToServiceConstraintMapping_Description() {
		return (EAttribute)legacyStationToServiceConstraintMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacyStationMappings() {
		return legacyStationMappingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacyStationMappings_StationMappings() {
		return (EReference)legacyStationMappingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLegacyStationMappings__FindMappedStation__int() {
		return legacyStationMappingsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacyStationMap() {
		return legacyStationMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyStationMap_LegacyCode() {
		return (EAttribute)legacyStationMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacyStationMap_Station() {
		return (EReference)legacyStationMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyStationMap_DataSource() {
		return (EAttribute)legacyStationMapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacyFareDetailMaps() {
		return legacyFareDetailMapsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacyFareDetailMaps_LegacyFareDetailMaps() {
		return (EReference)legacyFareDetailMapsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacyFareDetailMap() {
		return legacyFareDetailMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyFareDetailMap_LegacyCode() {
		return (EAttribute)legacyFareDetailMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacyFareDetailMap_FareDetailDescription() {
		return (EReference)legacyFareDetailMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyFareDetailMap_FareDetailMappingType() {
		return (EAttribute)legacyFareDetailMapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacyStation() {
		return legacyStationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyStation_Code() {
		return (EAttribute)legacyStationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyStation_Name() {
		return (EAttribute)legacyStationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacyBoderPointMappings() {
		return legacyBoderPointMappingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacyBoderPointMappings_BorderPoints() {
		return (EReference)legacyBoderPointMappingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLegacyBoderPointMappings__GetMappingByBorderPointCode__int() {
		return legacyBoderPointMappingsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacyBorderPointMapping() {
		return legacyBorderPointMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyBorderPointMapping_Code() {
		return (EAttribute)legacyBorderPointMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyBorderPointMapping_Name() {
		return (EAttribute)legacyBorderPointMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacyBorderPointMapping_Station() {
		return (EReference)legacyBorderPointMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacyBorderPointMapping_ConnectionPoint() {
		return (EReference)legacyBorderPointMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacyFareStationSetMappings() {
		return legacyFareStationSetMappingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacyFareStationSetMappings_LegacyFareStationSetMap() {
		return (EReference)legacyFareStationSetMappingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacyFareStationSetMap() {
		return legacyFareStationSetMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyFareStationSetMap_LegacyCode() {
		return (EAttribute)legacyFareStationSetMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacyFareStationSetMap_StationSet() {
		return (EReference)legacyFareStationSetMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacy108() {
		return legacy108EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacy108_CharacterSet() {
		return (EAttribute)legacy108EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacy108_LegacySeriesList() {
		return (EReference)legacy108EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacy108_LegacySeparateContractSeries() {
		return (EReference)legacy108EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacy108_LegacyDistanceFares() {
		return (EReference)legacy108EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacy108_LegacyRouteFares() {
		return (EReference)legacy108EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacy108_LegacyStations() {
		return (EReference)legacy108EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacy108_LegacyFareDescriptions() {
		return (EReference)legacy108EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacy108_TimeZone() {
		return (EAttribute)legacy108EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacy108_Carrier() {
		return (EReference)legacy108EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacy108_StartDate() {
		return (EAttribute)legacy108EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacy108_EndDate() {
		return (EAttribute)legacy108EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacy108_LegacyBorderPoints() {
		return (EReference)legacy108EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacy108FareDescription() {
		return legacy108FareDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacy108FareDescription_TableId() {
		return (EAttribute)legacy108FareDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacy108FareDescription_DescriptionFr() {
		return (EAttribute)legacy108FareDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacy108FareDescription_DescriptionGe() {
		return (EAttribute)legacy108FareDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacy108FareDescription_DescriptionEn() {
		return (EAttribute)legacy108FareDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacy108FareDescription_DescriptionLocal() {
		return (EAttribute)legacy108FareDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacy108FareDescription_CalculationType() {
		return (EAttribute)legacy108FareDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacy108FaresDescriptions() {
		return legacy108FaresDescriptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacy108FaresDescriptions_LegacyFares() {
		return (EReference)legacy108FaresDescriptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacy108Stations() {
		return legacy108StationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacy108Stations_LegacyStations() {
		return (EReference)legacy108StationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLegacy108Stations__FindStation__int() {
		return legacy108StationsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLegacy108Stations__FindByBorderPoint__int() {
		return legacy108StationsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacy108Station() {
		return legacy108StationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacy108Station_Name() {
		return (EAttribute)legacy108StationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacy108Station_BorderPointCode() {
		return (EAttribute)legacy108StationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacy108Station_NameUTF8() {
		return (EAttribute)legacy108StationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacy108Station_StationCode() {
		return (EAttribute)legacy108StationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacy108Station_FareReferenceStationCode() {
		return (EAttribute)legacy108StationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacy108Station_ShortName() {
		return (EAttribute)legacy108StationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacyRouteFares() {
		return legacyRouteFaresEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacyRouteFares_RouteFare() {
		return (EReference)legacyRouteFaresEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacyRouteFare() {
		return legacyRouteFareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyRouteFare_FareTableNumber() {
		return (EAttribute)legacyRouteFareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyRouteFare_SeriesNumber() {
		return (EAttribute)legacyRouteFareEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyRouteFare_Fare2nd() {
		return (EAttribute)legacyRouteFareEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyRouteFare_Fare1st() {
		return (EAttribute)legacyRouteFareEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyRouteFare_ReturnFare1st() {
		return (EAttribute)legacyRouteFareEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyRouteFare_ReturnFare2nd() {
		return (EAttribute)legacyRouteFareEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyRouteFare_ValidFrom() {
		return (EAttribute)legacyRouteFareEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyRouteFare_ValidUntil() {
		return (EAttribute)legacyRouteFareEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacyRouteFare_Series() {
		return (EReference)legacyRouteFareEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacySeriesList() {
		return legacySeriesListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacySeriesList_Series() {
		return (EReference)legacySeriesListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacySeries() {
		return legacySeriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacySeries_SupplyingCarrierCode() {
		return (EAttribute)legacySeriesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacySeries_Number() {
		return (EAttribute)legacySeriesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacySeries_FareTableNumber() {
		return (EAttribute)legacySeriesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacySeries_Type() {
		return (EAttribute)legacySeriesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacySeries_FromStation() {
		return (EAttribute)legacySeriesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacySeries_FromStationName() {
		return (EAttribute)legacySeriesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacySeries_ToStation() {
		return (EAttribute)legacySeriesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacySeries_ToStationName() {
		return (EAttribute)legacySeriesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacySeries_RouteNumber() {
		return (EAttribute)legacySeriesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacySeries_CarrierCode() {
		return (EAttribute)legacySeriesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacySeries_RouteDescription() {
		return (EAttribute)legacySeriesEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacySeries_Pricetype() {
		return (EAttribute)legacySeriesEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacySeries_Distance1() {
		return (EAttribute)legacySeriesEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacySeries_Distance2() {
		return (EAttribute)legacySeriesEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacySeries_Viastations() {
		return (EReference)legacySeriesEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacySeries_ValidFrom() {
		return (EAttribute)legacySeriesEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacySeries_ValidUntil() {
		return (EAttribute)legacySeriesEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacySeparateContractSeriesList() {
		return legacySeparateContractSeriesListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacySeparateContractSeriesList_SeparateContractSeries() {
		return (EReference)legacySeparateContractSeriesListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacySeparateContractSeries() {
		return legacySeparateContractSeriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacySeparateContractSeries_SeriesNumber() {
		return (EAttribute)legacySeparateContractSeriesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacySeparateContractSeries_ValidFrom() {
		return (EAttribute)legacySeparateContractSeriesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacySeparateContractSeries_ValidUntil() {
		return (EAttribute)legacySeparateContractSeriesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacySeparateContractSeries_Series() {
		return (EReference)legacySeparateContractSeriesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacyDistanceFares() {
		return legacyDistanceFaresEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacyDistanceFares_DistanceFare() {
		return (EReference)legacyDistanceFaresEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacyDistanceFare() {
		return legacyDistanceFareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyDistanceFare_Distance() {
		return (EAttribute)legacyDistanceFareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyDistanceFare_Fare2nd() {
		return (EAttribute)legacyDistanceFareEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyDistanceFare_Fare1st() {
		return (EAttribute)legacyDistanceFareEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyDistanceFare_FareTableNumber() {
		return (EAttribute)legacyDistanceFareEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyDistanceFare_ReturnFare1st() {
		return (EAttribute)legacyDistanceFareEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyDistanceFare_ReturnFare2nd() {
		return (EAttribute)legacyDistanceFareEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyDistanceFare_ValidFrom() {
		return (EAttribute)legacyDistanceFareEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyDistanceFare_ValidUntil() {
		return (EAttribute)legacyDistanceFareEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacyViastation() {
		return legacyViastationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyViastation_Position() {
		return (EAttribute)legacyViastationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyViastation_Code() {
		return (EAttribute)legacyViastationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyViastation_Optional() {
		return (EAttribute)legacyViastationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacyFareTemplates() {
		return legacyFareTemplatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacyFareTemplates_FareTemplates() {
		return (EReference)legacyFareTemplatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStationRelationType() {
		return stationRelationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStationFareDetailType() {
		return stationFareDetailTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRegulatoryCondition() {
		return regulatoryConditionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAfterSalesTransactionType() {
		return afterSalesTransactionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBarcodeTypes() {
		return barcodeTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClassicClassType() {
		return classicClassTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCharacterSet() {
		return characterSetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClusters() {
		return clustersEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCombinationModel() {
		return combinationModelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getControlDataExchangeTypes() {
		return controlDataExchangeTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFareType() {
		return fareTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFulfillmentType() {
		return fulfillmentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGeoSystem() {
		return geoSystemEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGeoUnit() {
		return geoUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGraphicalReservationType() {
		return graphicalReservationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHemisphereEW() {
		return hemisphereEWEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHemisphereNS() {
		return hemisphereNSEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInterfaceType() {
		return interfaceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLegacyCalculationType() {
		return legacyCalculationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLegacyPassengerType() {
		return legacyPassengerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLegacySeriesType() {
		return legacySeriesTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLegacyConversionType() {
		return legacyConversionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOfferRequestType() {
		return offerRequestTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOnlineServiceType() {
		return onlineServiceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPersonalDataItemsType() {
		return personalDataItemsTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPersonalDataTransferType() {
		return personalDataTransferTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPersonalDataChangeReason() {
		return personalDataChangeReasonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReservationTravelClass() {
		return reservationTravelClassEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReservationServiceLevel() {
		return reservationServiceLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReservationService() {
		return reservationServiceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReservationBerthType() {
		return reservationBerthTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSchemaVersion() {
		return schemaVersionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeZone() {
		return timeZoneEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTaxScope() {
		return taxScopeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeReferenceType() {
		return timeReferenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeRangeScope() {
		return timeRangeScopeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeUnit() {
		return timeUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTravelerType() {
		return travelerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWeekDay() {
		return weekDayEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataSource() {
		return dataSourceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClassId() {
		return classIdEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGenericReductionCards() {
		return genericReductionCardsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getServiceMode() {
		return serviceModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GtmFactory getGtmFactory() {
		return (GtmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		gtmToolEClass = createEClass(GTM_TOOL);
		createEReference(gtmToolEClass, GTM_TOOL__CONVERSION_FROM_LEGACY);
		createEReference(gtmToolEClass, GTM_TOOL__CODE_LISTS);
		createEReference(gtmToolEClass, GTM_TOOL__GENERAL_TARIFF_MODEL);

		codeListsEClass = createEClass(CODE_LISTS);
		createEReference(codeListsEClass, CODE_LISTS__CARRIERS);
		createEReference(codeListsEClass, CODE_LISTS__STATIONS);
		createEReference(codeListsEClass, CODE_LISTS__COUNTRIES);
		createEReference(codeListsEClass, CODE_LISTS__LANGUAGES);
		createEReference(codeListsEClass, CODE_LISTS__CURRENCIES);
		createEReference(codeListsEClass, CODE_LISTS__SERVICE_BRANDS);
		createEReference(codeListsEClass, CODE_LISTS__NUTS_CODES);

		nutsCodesEClass = createEClass(NUTS_CODES);
		createEReference(nutsCodesEClass, NUTS_CODES__NUTS_CODES);

		nutsCodeEClass = createEClass(NUTS_CODE);
		createEAttribute(nutsCodeEClass, NUTS_CODE__NAME);
		createEAttribute(nutsCodeEClass, NUTS_CODE__CODE);

		serviceBrandsEClass = createEClass(SERVICE_BRANDS);
		createEReference(serviceBrandsEClass, SERVICE_BRANDS__SERVICE_BRANDS);
		createEOperation(serviceBrandsEClass, SERVICE_BRANDS___FIND_SERVICE_BRAND__INT);

		serviceBrandEClass = createEClass(SERVICE_BRAND);
		createEAttribute(serviceBrandEClass, SERVICE_BRAND__CODE);
		createEAttribute(serviceBrandEClass, SERVICE_BRAND__NAME);
		createEAttribute(serviceBrandEClass, SERVICE_BRAND__ABBREVIATION);
		createEAttribute(serviceBrandEClass, SERVICE_BRAND__DESCRIPTION);

		countriesEClass = createEClass(COUNTRIES);
		createEReference(countriesEClass, COUNTRIES__COUNTRIES);
		createEOperation(countriesEClass, COUNTRIES___FIND_COUNTRY__INT);

		countryEClass = createEClass(COUNTRY);
		createEAttribute(countryEClass, COUNTRY__CODE);
		createEAttribute(countryEClass, COUNTRY__NAME);
		createEAttribute(countryEClass, COUNTRY__IS_OCODE);

		languagesEClass = createEClass(LANGUAGES);
		createEReference(languagesEClass, LANGUAGES__LANGUAGES);

		languageEClass = createEClass(LANGUAGE);
		createEAttribute(languageEClass, LANGUAGE__NAME);
		createEAttribute(languageEClass, LANGUAGE__CODE);

		currenciesEClass = createEClass(CURRENCIES);
		createEReference(currenciesEClass, CURRENCIES__CURRENCIES);
		createEOperation(currenciesEClass, CURRENCIES___FIND_CURRENCY__STRING);

		currencyEClass = createEClass(CURRENCY);
		createEAttribute(currencyEClass, CURRENCY__NAME);
		createEAttribute(currencyEClass, CURRENCY__ISO_CODE);

		stationsEClass = createEClass(STATIONS);
		createEReference(stationsEClass, STATIONS__STATIONS);
		createEOperation(stationsEClass, STATIONS___FIND_STATION__INT_INT);
		createEOperation(stationsEClass, STATIONS___FIND_STATION__INT_STRING);

		stationEClass = createEClass(STATION);
		createEAttribute(stationEClass, STATION__NAME);
		createEReference(stationEClass, STATION__COUNTRY);
		createEAttribute(stationEClass, STATION__CODE);
		createEAttribute(stationEClass, STATION__LONGITUDE);
		createEAttribute(stationEClass, STATION__LATITUDE);
		createEAttribute(stationEClass, STATION__TIMETABLE_NAME);
		createEAttribute(stationEClass, STATION__BORDER_STATION);
		createEAttribute(stationEClass, STATION__NAME_CASE_UTF8);
		createEAttribute(stationEClass, STATION__NAME_CASE_ASCII);
		createEAttribute(stationEClass, STATION__SHORT_NAME_CASE_ASCII);
		createEAttribute(stationEClass, STATION__SHORT_NAME_CASE_UTF8);
		createEAttribute(stationEClass, STATION__LEGACY_BORDER_POINT_CODE);
		createEReference(stationEClass, STATION__RELATIONS);

		stationRelationEClass = createEClass(STATION_RELATION);
		createEAttribute(stationRelationEClass, STATION_RELATION__RELATION_TYPE);
		createEReference(stationRelationEClass, STATION_RELATION__STATION);

		carrierEClass = createEClass(CARRIER);
		createEAttribute(carrierEClass, CARRIER__CODE);
		createEAttribute(carrierEClass, CARRIER__NAME);
		createEAttribute(carrierEClass, CARRIER__SHORT_NAME);

		carriersEClass = createEClass(CARRIERS);
		createEReference(carriersEClass, CARRIERS__CARRIERS);
		createEOperation(carriersEClass, CARRIERS___FIND_CARRIER__STRING);

		stationSetEClass = createEClass(STATION_SET);
		createEReference(stationSetEClass, STATION_SET__STATIONS);

		generalTariffModelEClass = createEClass(GENERAL_TARIFF_MODEL);
		createEReference(generalTariffModelEClass, GENERAL_TARIFF_MODEL__DELIVERY);
		createEReference(generalTariffModelEClass, GENERAL_TARIFF_MODEL__FARE_STRUCTURE);

		deliveryEClass = createEClass(DELIVERY);
		createEAttribute(deliveryEClass, DELIVERY__ID);
		createEAttribute(deliveryEClass, DELIVERY__PREVIOUS_DELIVERY_ID);
		createEAttribute(deliveryEClass, DELIVERY__REPLACED_DELIVERY_ID);
		createEAttribute(deliveryEClass, DELIVERY__OPTIONAL);
		createEReference(deliveryEClass, DELIVERY__PROVIDER);
		createEAttribute(deliveryEClass, DELIVERY__SCHEMA_VERSION);
		createEAttribute(deliveryEClass, DELIVERY__ACCEPTED_SCHEMA_VERSION);

		afterSalesRulesEClass = createEClass(AFTER_SALES_RULES);
		createEReference(afterSalesRulesEClass, AFTER_SALES_RULES__AFTER_SALES_RULES);

		afterSalesRuleEClass = createEClass(AFTER_SALES_RULE);
		createEAttribute(afterSalesRuleEClass, AFTER_SALES_RULE__ID);
		createEAttribute(afterSalesRuleEClass, AFTER_SALES_RULE__DATA_SOURCE);
		createEReference(afterSalesRuleEClass, AFTER_SALES_RULE__CONDITIONS);

		afterSalesConditionEClass = createEClass(AFTER_SALES_CONDITION);
		createEAttribute(afterSalesConditionEClass, AFTER_SALES_CONDITION__TRANSACTION_TYPE);
		createEAttribute(afterSalesConditionEClass, AFTER_SALES_CONDITION__INDIVIDUAL_CONTRACTS);
		createEAttribute(afterSalesConditionEClass, AFTER_SALES_CONDITION__CARRIER_FEE);
		createEReference(afterSalesConditionEClass, AFTER_SALES_CONDITION__FEE);
		createEReference(afterSalesConditionEClass, AFTER_SALES_CONDITION__APPLICATION_TIME);

		applicationTimeEClass = createEClass(APPLICATION_TIME);

		fareStructureEClass = createEClass(FARE_STRUCTURE);
		createEReference(fareStructureEClass, FARE_STRUCTURE__SERVICE_CLASS_DEFINITIONS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__SERVICE_LEVEL_DEFINITIONS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__STATION_NAMES);
		createEReference(fareStructureEClass, FARE_STRUCTURE__FARE_STATION_SET_DEFINITIONS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__CALENDARS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__TEXTS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__REDUCTION_CARDS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__FARE_ELEMENTS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__COMBINATION_CONSTRAINTS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__SALES_AVAILABILITY_CONSTRAINTS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__TRAVEL_VALIDITY_CONSTRAINTS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__REGIONAL_CONSTRAINTS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__CONNECTION_POINTS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__CARRIER_CONSTRAINTS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__SERVICE_CONSTRAINTS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__PASSENGER_CONSTRAINTS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__REDUCTION_CONSTRAINTS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__PERSONAL_DATA_CONSTRAINTS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__AFTER_SALES_RULES);
		createEReference(fareStructureEClass, FARE_STRUCTURE__PRICES);
		createEReference(fareStructureEClass, FARE_STRUCTURE__FULFILLMENT_CONSTRAINTS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__RESERVATION_PARAMETERS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__SUPPORTED_ONLINE_SERVICES);
		createEReference(fareStructureEClass, FARE_STRUCTURE__FARE_RESOURCE_LOCATIONS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__ZONE_DEFINITIONS);

		connectionPointsEClass = createEClass(CONNECTION_POINTS);
		createEReference(connectionPointsEClass, CONNECTION_POINTS__CONNECTION_POINTS);
		createEOperation(connectionPointsEClass, CONNECTION_POINTS___FIND_SIMPLE_CONNECTION_POINT__STATION);

		connectionPointEClass = createEClass(CONNECTION_POINT);
		createEAttribute(connectionPointEClass, CONNECTION_POINT__ID);
		createEAttribute(connectionPointEClass, CONNECTION_POINT__NAME);
		createEAttribute(connectionPointEClass, CONNECTION_POINT__LEGACY_BORDER_POINT_CODE);
		createEAttribute(connectionPointEClass, CONNECTION_POINT__DESCRIPTION);
		createEReference(connectionPointEClass, CONNECTION_POINT__CONNECTED_STATION_SETS);
		createEAttribute(connectionPointEClass, CONNECTION_POINT__DATA_SOURCE);
		createEAttribute(connectionPointEClass, CONNECTION_POINT__NAME_UTF8);

		fareResourceLocationsEClass = createEClass(FARE_RESOURCE_LOCATIONS);
		createEReference(fareResourceLocationsEClass, FARE_RESOURCE_LOCATIONS__TRAIN_RESOURCE_LOCATIONS);
		createEReference(fareResourceLocationsEClass, FARE_RESOURCE_LOCATIONS__STATION_RESOURCE_LOCATIONS);
		createEReference(fareResourceLocationsEClass, FARE_RESOURCE_LOCATIONS__CARRIER_RESOURCE_LOCATIONS);

		trainResourceLocationsEClass = createEClass(TRAIN_RESOURCE_LOCATIONS);
		createEReference(trainResourceLocationsEClass, TRAIN_RESOURCE_LOCATIONS__TRAIN_RESOURCE_LOCATIONS);

		stationResourceLocationsEClass = createEClass(STATION_RESOURCE_LOCATIONS);
		createEReference(stationResourceLocationsEClass, STATION_RESOURCE_LOCATIONS__STATION_RESOURCE_LOCATIONS);

		carrierResourceLocationsEClass = createEClass(CARRIER_RESOURCE_LOCATIONS);
		createEReference(carrierResourceLocationsEClass, CARRIER_RESOURCE_LOCATIONS__CARRIER_RESOURCE_LOCATIONS);

		trainResourceLocationEClass = createEClass(TRAIN_RESOURCE_LOCATION);
		createEReference(trainResourceLocationEClass, TRAIN_RESOURCE_LOCATION__CARRIER);
		createEReference(trainResourceLocationEClass, TRAIN_RESOURCE_LOCATION__ONLINE_RESOURCES);
		createEAttribute(trainResourceLocationEClass, TRAIN_RESOURCE_LOCATION__TRAIN_ID);

		stationResourceLocationEClass = createEClass(STATION_RESOURCE_LOCATION);
		createEReference(stationResourceLocationEClass, STATION_RESOURCE_LOCATION__ONLINE_RESOURCES);
		createEReference(stationResourceLocationEClass, STATION_RESOURCE_LOCATION__STATIONS);
		createEReference(stationResourceLocationEClass, STATION_RESOURCE_LOCATION__CONNECTION_POINTS);

		onlineResourceEClass = createEClass(ONLINE_RESOURCE);
		createEAttribute(onlineResourceEClass, ONLINE_RESOURCE__OFFER_REQUEST_TYPE);
		createEAttribute(onlineResourceEClass, ONLINE_RESOURCE__INTERFACE_TYPE);
		createEAttribute(onlineResourceEClass, ONLINE_RESOURCE__VERSION);
		createEAttribute(onlineResourceEClass, ONLINE_RESOURCE__SYSTEM);

		fulfillmentConstraintsEClass = createEClass(FULFILLMENT_CONSTRAINTS);
		createEReference(fulfillmentConstraintsEClass, FULFILLMENT_CONSTRAINTS__FULFILLMENT_CONSTRAINTS);

		fulfillmentConstraintEClass = createEClass(FULFILLMENT_CONSTRAINT);
		createEAttribute(fulfillmentConstraintEClass, FULFILLMENT_CONSTRAINT__ID);
		createEAttribute(fulfillmentConstraintEClass, FULFILLMENT_CONSTRAINT__ACCEPTED_FULFILMENT_TYPES);
		createEAttribute(fulfillmentConstraintEClass, FULFILLMENT_CONSTRAINT__REQUIRED_CONTROL_DATA_EXCHANGE);
		createEAttribute(fulfillmentConstraintEClass, FULFILLMENT_CONSTRAINT__INDIVIDUAL_TICKETING_PERMITTED);
		createEReference(fulfillmentConstraintEClass, FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODES);
		createEReference(fulfillmentConstraintEClass, FULFILLMENT_CONSTRAINT__REQUIRED_BARCODES);
		createEAttribute(fulfillmentConstraintEClass, FULFILLMENT_CONSTRAINT__DATA_DESCRIPTION);

		requiredBarcodesEClass = createEClass(REQUIRED_BARCODES);
		createEAttribute(requiredBarcodesEClass, REQUIRED_BARCODES__REQUIRED_BARCODES);

		acceptedBarcodesEClass = createEClass(ACCEPTED_BARCODES);
		createEAttribute(acceptedBarcodesEClass, ACCEPTED_BARCODES__ACCEPTED_BARCODES);

		supportedOnlineServicesEClass = createEClass(SUPPORTED_ONLINE_SERVICES);
		createEAttribute(supportedOnlineServicesEClass, SUPPORTED_ONLINE_SERVICES__SUPPORTED_ONLINE_SERVICES);

		stationNamesEClass = createEClass(STATION_NAMES);
		createEReference(stationNamesEClass, STATION_NAMES__STATION_NAME);

		fareElementsEClass = createEClass(FARE_ELEMENTS);
		createEReference(fareElementsEClass, FARE_ELEMENTS__FARE_ELEMENTS);

		fareElementEClass = createEClass(FARE_ELEMENT);
		createEAttribute(fareElementEClass, FARE_ELEMENT__ID);
		createEAttribute(fareElementEClass, FARE_ELEMENT__TYPE);
		createEAttribute(fareElementEClass, FARE_ELEMENT__DATA_DESCRIPTION);
		createEReference(fareElementEClass, FARE_ELEMENT__TEXT);
		createEReference(fareElementEClass, FARE_ELEMENT__PRICE);
		createEReference(fareElementEClass, FARE_ELEMENT__REGIONAL_CONSTRAINT);
		createEReference(fareElementEClass, FARE_ELEMENT__SERVICE_CONSTRAINT);
		createEReference(fareElementEClass, FARE_ELEMENT__CARRIER_CONSTRAINT);
		createEReference(fareElementEClass, FARE_ELEMENT__SERVICE_CLASS);
		createEReference(fareElementEClass, FARE_ELEMENT__SERVICE_LEVEL);
		createEReference(fareElementEClass, FARE_ELEMENT__SALES_AVAILABILITY);
		createEReference(fareElementEClass, FARE_ELEMENT__TRAVEL_VALIDITY);
		createEReference(fareElementEClass, FARE_ELEMENT__COMBINATION_CONSTRAINT);
		createEReference(fareElementEClass, FARE_ELEMENT__FARE_DETAIL_DESCRIPTION);
		createEReference(fareElementEClass, FARE_ELEMENT__PERSONAL_DATA_CONSTRAINT);
		createEReference(fareElementEClass, FARE_ELEMENT__RESERVATION_PARAMETER);
		createEReference(fareElementEClass, FARE_ELEMENT__REDUCTION_CONSTRAINT);
		createEReference(fareElementEClass, FARE_ELEMENT__FULFILLMENT_CONSTRAINT);
		createEReference(fareElementEClass, FARE_ELEMENT__PASSENGER_CONSTRAINT);
		createEAttribute(fareElementEClass, FARE_ELEMENT__REGULATORY_CONDITIONS);
		createEReference(fareElementEClass, FARE_ELEMENT__AFTER_SALES_RULE);
		createEAttribute(fareElementEClass, FARE_ELEMENT__DATA_SOURCE);
		createEReference(fareElementEClass, FARE_ELEMENT__LEGACY_ACCOUNTING_IDENTIFIER);
		createEAttribute(fareElementEClass, FARE_ELEMENT__LEGACY_CONVERSION);
		createEAttribute(fareElementEClass, FARE_ELEMENT__INDIVIDUAL_CONTRACTS);

		fareStationSetDefinitionsEClass = createEClass(FARE_STATION_SET_DEFINITIONS);
		createEReference(fareStationSetDefinitionsEClass, FARE_STATION_SET_DEFINITIONS__FARE_STATION_SET_DEFINITIONS);
		createEOperation(fareStationSetDefinitionsEClass, FARE_STATION_SET_DEFINITIONS___FIND_FARE_SET__CARRIER_INT);

		fareStationSetDefinitionEClass = createEClass(FARE_STATION_SET_DEFINITION);
		createEAttribute(fareStationSetDefinitionEClass, FARE_STATION_SET_DEFINITION__DATA_SOURCE);
		createEReference(fareStationSetDefinitionEClass, FARE_STATION_SET_DEFINITION__CARRIER);
		createEAttribute(fareStationSetDefinitionEClass, FARE_STATION_SET_DEFINITION__CODE);
		createEAttribute(fareStationSetDefinitionEClass, FARE_STATION_SET_DEFINITION__LEGACY_CODE);
		createEAttribute(fareStationSetDefinitionEClass, FARE_STATION_SET_DEFINITION__ID);
		createEAttribute(fareStationSetDefinitionEClass, FARE_STATION_SET_DEFINITION__NAME);
		createEAttribute(fareStationSetDefinitionEClass, FARE_STATION_SET_DEFINITION__NAME_UTF8);
		createEReference(fareStationSetDefinitionEClass, FARE_STATION_SET_DEFINITION__STATIONS);

		legacyAccountingIdentifierEClass = createEClass(LEGACY_ACCOUNTING_IDENTIFIER);
		createEAttribute(legacyAccountingIdentifierEClass, LEGACY_ACCOUNTING_IDENTIFIER__SERIES_ID);
		createEAttribute(legacyAccountingIdentifierEClass, LEGACY_ACCOUNTING_IDENTIFIER__TARIFF_ID);
		createEAttribute(legacyAccountingIdentifierEClass, LEGACY_ACCOUNTING_IDENTIFIER__ADD_SERIES_ID);

		reductionConstraintsEClass = createEClass(REDUCTION_CONSTRAINTS);
		createEReference(reductionConstraintsEClass, REDUCTION_CONSTRAINTS__REDUCTION_CONSTRAINTS);

		personalDataConstraintsEClass = createEClass(PERSONAL_DATA_CONSTRAINTS);
		createEReference(personalDataConstraintsEClass, PERSONAL_DATA_CONSTRAINTS__PERSONAL_DATA_CONSTRAINTS);

		personalDataConstraintEClass = createEClass(PERSONAL_DATA_CONSTRAINT);
		createEAttribute(personalDataConstraintEClass, PERSONAL_DATA_CONSTRAINT__ID);
		createEReference(personalDataConstraintEClass, PERSONAL_DATA_CONSTRAINT__REQUIRED_PERSONAL_DATA);
		createEReference(personalDataConstraintEClass, PERSONAL_DATA_CONSTRAINT__ALLOWED_CHANGES);

		requiredPersonalDataEClass = createEClass(REQUIRED_PERSONAL_DATA);
		createEAttribute(requiredPersonalDataEClass, REQUIRED_PERSONAL_DATA__TICKET_HOLDER_ONLY);
		createEAttribute(requiredPersonalDataEClass, REQUIRED_PERSONAL_DATA__DATA_ITEM);
		createEAttribute(requiredPersonalDataEClass, REQUIRED_PERSONAL_DATA__TRANSFER);
		createEAttribute(requiredPersonalDataEClass, REQUIRED_PERSONAL_DATA__FULFILLMENT_TYPE);
		createEReference(requiredPersonalDataEClass, REQUIRED_PERSONAL_DATA__CROSS_BORDER);

		allowedPersonalDataChangesEClass = createEClass(ALLOWED_PERSONAL_DATA_CHANGES);
		createEAttribute(allowedPersonalDataChangesEClass, ALLOWED_PERSONAL_DATA_CHANGES__TIME_LIMIT);
		createEAttribute(allowedPersonalDataChangesEClass, ALLOWED_PERSONAL_DATA_CHANGES__ACCEPTED_REASON);

		passengerConstraintsEClass = createEClass(PASSENGER_CONSTRAINTS);
		createEReference(passengerConstraintsEClass, PASSENGER_CONSTRAINTS__PASSENGER_CONSTRAINTS);

		passengerConstraintEClass = createEClass(PASSENGER_CONSTRAINT);
		createEAttribute(passengerConstraintEClass, PASSENGER_CONSTRAINT__ID);
		createEAttribute(passengerConstraintEClass, PASSENGER_CONSTRAINT__TRAVELER_TYPE);
		createEReference(passengerConstraintEClass, PASSENGER_CONSTRAINT__TEXT);
		createEAttribute(passengerConstraintEClass, PASSENGER_CONSTRAINT__UPPER_AGE_LIMIT);
		createEAttribute(passengerConstraintEClass, PASSENGER_CONSTRAINT__LOWER_AGE_LIMIT);
		createEAttribute(passengerConstraintEClass, PASSENGER_CONSTRAINT__TRAVEL_ALONE_AGE_LIMIT);
		createEAttribute(passengerConstraintEClass, PASSENGER_CONSTRAINT__RESERVATION_AGE_LIMIT);
		createEAttribute(passengerConstraintEClass, PASSENGER_CONSTRAINT__IS_ANCILLIARY);
		createEAttribute(passengerConstraintEClass, PASSENGER_CONSTRAINT__PASSENGER_WEIGHT);
		createEAttribute(passengerConstraintEClass, PASSENGER_CONSTRAINT__MAX_TOTAL_PASSENGER_WEIGHT);
		createEAttribute(passengerConstraintEClass, PASSENGER_CONSTRAINT__MIN_TOTAL_PASSENGER_WEIGHT);
		createEReference(passengerConstraintEClass, PASSENGER_CONSTRAINT__INCLUDED_FREE_PASSENGERS);
		createEReference(passengerConstraintEClass, PASSENGER_CONSTRAINT__EXCLUDED_PASSENGER_COMBINATIONS);
		createEAttribute(passengerConstraintEClass, PASSENGER_CONSTRAINT__DATA_DESCRIPTION);

		passengerCombinationConstraintEClass = createEClass(PASSENGER_COMBINATION_CONSTRAINT);
		createEAttribute(passengerCombinationConstraintEClass, PASSENGER_COMBINATION_CONSTRAINT__MAX_NUMBER);
		createEAttribute(passengerCombinationConstraintEClass, PASSENGER_COMBINATION_CONSTRAINT__PASSENGER_TYPE);

		includedFreePassengerLimitEClass = createEClass(INCLUDED_FREE_PASSENGER_LIMIT);
		createEAttribute(includedFreePassengerLimitEClass, INCLUDED_FREE_PASSENGER_LIMIT__NUMBER);
		createEAttribute(includedFreePassengerLimitEClass, INCLUDED_FREE_PASSENGER_LIMIT__PASSENGER_TYPE);

		combinationConstraintsEClass = createEClass(COMBINATION_CONSTRAINTS);
		createEReference(combinationConstraintsEClass, COMBINATION_CONSTRAINTS__COMBINATION_CONSTRAINTS);

		combinationConstraintEClass = createEClass(COMBINATION_CONSTRAINT);
		createEAttribute(combinationConstraintEClass, COMBINATION_CONSTRAINT__ID);
		createEAttribute(combinationConstraintEClass, COMBINATION_CONSTRAINT__DATA_DESCRIPTION);
		createEReference(combinationConstraintEClass, COMBINATION_CONSTRAINT__COMBINATION_MODELS);

		travelValidityConstraintsEClass = createEClass(TRAVEL_VALIDITY_CONSTRAINTS);
		createEReference(travelValidityConstraintsEClass, TRAVEL_VALIDITY_CONSTRAINTS__TRAVEL_VALIDITY_CONSTRAINTS);

		travelValidityConstraintEClass = createEClass(TRAVEL_VALIDITY_CONSTRAINT);
		createEAttribute(travelValidityConstraintEClass, TRAVEL_VALIDITY_CONSTRAINT__ID);
		createEAttribute(travelValidityConstraintEClass, TRAVEL_VALIDITY_CONSTRAINT__DATA_DESCRIPTION);
		createEReference(travelValidityConstraintEClass, TRAVEL_VALIDITY_CONSTRAINT__VALID_DAYS);
		createEAttribute(travelValidityConstraintEClass, TRAVEL_VALIDITY_CONSTRAINT__TRAVEL_DAYS);
		createEReference(travelValidityConstraintEClass, TRAVEL_VALIDITY_CONSTRAINT__RANGE);
		createEReference(travelValidityConstraintEClass, TRAVEL_VALIDITY_CONSTRAINT__RETURN_CONSTRAINT);
		createEReference(travelValidityConstraintEClass, TRAVEL_VALIDITY_CONSTRAINT__EXCLUDED_TIME_RANGE);

		salesAvailabilityConstraintsEClass = createEClass(SALES_AVAILABILITY_CONSTRAINTS);
		createEReference(salesAvailabilityConstraintsEClass, SALES_AVAILABILITY_CONSTRAINTS__SALES_AVAILABILITY_CONSTRAINTS);

		salesAvailabilityConstraintEClass = createEClass(SALES_AVAILABILITY_CONSTRAINT);
		createEAttribute(salesAvailabilityConstraintEClass, SALES_AVAILABILITY_CONSTRAINT__ID);
		createEAttribute(salesAvailabilityConstraintEClass, SALES_AVAILABILITY_CONSTRAINT__DATA_DESCRIPTION);
		createEReference(salesAvailabilityConstraintEClass, SALES_AVAILABILITY_CONSTRAINT__RESTRICTIONS);
		createEAttribute(salesAvailabilityConstraintEClass, SALES_AVAILABILITY_CONSTRAINT__DATA_SOURCE);

		salesRestrictionEClass = createEClass(SALES_RESTRICTION);
		createEReference(salesRestrictionEClass, SALES_RESTRICTION__SALES_DATES);
		createEReference(salesRestrictionEClass, SALES_RESTRICTION__START_OF_SALE);
		createEReference(salesRestrictionEClass, SALES_RESTRICTION__END_OF_SALE);

		endOfSaleEClass = createEClass(END_OF_SALE);

		startOfSaleEClass = createEClass(START_OF_SALE);

		reductionCardsEClass = createEClass(REDUCTION_CARDS);
		createEReference(reductionCardsEClass, REDUCTION_CARDS__REDUCTION_CARDS);

		reductionCardEClass = createEClass(REDUCTION_CARD);
		createEAttribute(reductionCardEClass, REDUCTION_CARD__ID);
		createEReference(reductionCardEClass, REDUCTION_CARD__CARD_ISSUER);
		createEReference(reductionCardEClass, REDUCTION_CARD__NAME);
		createEReference(reductionCardEClass, REDUCTION_CARD__SERVICE_CLASSES);
		createEAttribute(reductionCardEClass, REDUCTION_CARD__ID_REQUIRED_FOR_BOOKING);

		carrierConstraintsEClass = createEClass(CARRIER_CONSTRAINTS);
		createEReference(carrierConstraintsEClass, CARRIER_CONSTRAINTS__CARRIER_CONSTRAINTS);

		carrierConstraintEClass = createEClass(CARRIER_CONSTRAINT);
		createEAttribute(carrierConstraintEClass, CARRIER_CONSTRAINT__ID);
		createEReference(carrierConstraintEClass, CARRIER_CONSTRAINT__INCLUDED_CARRIERS);
		createEReference(carrierConstraintEClass, CARRIER_CONSTRAINT__EXCLUDED_CARRIERS);
		createEAttribute(carrierConstraintEClass, CARRIER_CONSTRAINT__DATA_DESCRIPTION);

		serviceConstraintsEClass = createEClass(SERVICE_CONSTRAINTS);
		createEReference(serviceConstraintsEClass, SERVICE_CONSTRAINTS__SERVICE_CONSTRAINTS);

		serviceConstraintEClass = createEClass(SERVICE_CONSTRAINT);
		createEAttribute(serviceConstraintEClass, SERVICE_CONSTRAINT__ID);
		createEReference(serviceConstraintEClass, SERVICE_CONSTRAINT__INCLUDED_SERVICE_BRANDS);
		createEReference(serviceConstraintEClass, SERVICE_CONSTRAINT__EXCLUDED_SERVICE_BRANDS);
		createEAttribute(serviceConstraintEClass, SERVICE_CONSTRAINT__DATA_DESCRIPTION);

		regionalConstraintsEClass = createEClass(REGIONAL_CONSTRAINTS);
		createEReference(regionalConstraintsEClass, REGIONAL_CONSTRAINTS__REGIONAL_CONSTRAINTS);

		regionalConstraintEClass = createEClass(REGIONAL_CONSTRAINT);
		createEAttribute(regionalConstraintEClass, REGIONAL_CONSTRAINT__ID);
		createEAttribute(regionalConstraintEClass, REGIONAL_CONSTRAINT__DISTANCE);
		createEReference(regionalConstraintEClass, REGIONAL_CONSTRAINT__ENTRY_CONNECTION_POINT);
		createEReference(regionalConstraintEClass, REGIONAL_CONSTRAINT__EXIT_CONNECTION_POINT);
		createEReference(regionalConstraintEClass, REGIONAL_CONSTRAINT__REGIONAL_VALIDITY);
		createEAttribute(regionalConstraintEClass, REGIONAL_CONSTRAINT__DATA_SOURCE);
		createEAttribute(regionalConstraintEClass, REGIONAL_CONSTRAINT__DATA_DESCRIPTION);

		regionalValidityEClass = createEClass(REGIONAL_VALIDITY);
		createEAttribute(regionalValidityEClass, REGIONAL_VALIDITY__SEQ_NB);
		createEReference(regionalValidityEClass, REGIONAL_VALIDITY__VIA_STATION);
		createEReference(regionalValidityEClass, REGIONAL_VALIDITY__ZONE);
		createEReference(regionalValidityEClass, REGIONAL_VALIDITY__LINE);
		createEReference(regionalValidityEClass, REGIONAL_VALIDITY__POLYGONE);

		serviceLevelDefinitionsEClass = createEClass(SERVICE_LEVEL_DEFINITIONS);
		createEReference(serviceLevelDefinitionsEClass, SERVICE_LEVEL_DEFINITIONS__SERVICE_LEVEL_DEFINITION);

		textsEClass = createEClass(TEXTS);
		createEReference(textsEClass, TEXTS__TEXTS);

		textEClass = createEClass(TEXT);
		createEAttribute(textEClass, TEXT__ID);
		createEAttribute(textEClass, TEXT__TEXT_UTF8);
		createEAttribute(textEClass, TEXT__TEXT_ICAO);
		createEAttribute(textEClass, TEXT__SHORT_TEXT_UTF8);
		createEAttribute(textEClass, TEXT__SHORT_TEXT_ICAO);
		createEReference(textEClass, TEXT__TRANSLATIONS);

		translationEClass = createEClass(TRANSLATION);
		createEReference(translationEClass, TRANSLATION__LANGUAGE);
		createEAttribute(translationEClass, TRANSLATION__TEXT_UTF8);
		createEAttribute(translationEClass, TRANSLATION__TEXT_ICAO);
		createEAttribute(translationEClass, TRANSLATION__SHORT_TEXT_UTF8);
		createEAttribute(translationEClass, TRANSLATION__SHORT_TEXT_ICAO);

		pricesEClass = createEClass(PRICES);
		createEReference(pricesEClass, PRICES__PRICES);

		priceEClass = createEClass(PRICE);
		createEAttribute(priceEClass, PRICE__ID);
		createEReference(priceEClass, PRICE__CURRENCIES);
		createEAttribute(priceEClass, PRICE__DATA_SOURCE);

		vatDetailEClass = createEClass(VAT_DETAIL);
		createEAttribute(vatDetailEClass, VAT_DETAIL__AMOUNT);
		createEAttribute(vatDetailEClass, VAT_DETAIL__PERCENTAGE);
		createEReference(vatDetailEClass, VAT_DETAIL__COUNTRY);
		createEAttribute(vatDetailEClass, VAT_DETAIL__TAX_ID);
		createEAttribute(vatDetailEClass, VAT_DETAIL__SCOPE);

		currencyPriceEClass = createEClass(CURRENCY_PRICE);
		createEReference(currencyPriceEClass, CURRENCY_PRICE__CURRENCY);
		createEAttribute(currencyPriceEClass, CURRENCY_PRICE__AMOUNT);
		createEReference(currencyPriceEClass, CURRENCY_PRICE__VA_TDETAILS);

		serviceClassDefinitionsEClass = createEClass(SERVICE_CLASS_DEFINITIONS);
		createEReference(serviceClassDefinitionsEClass, SERVICE_CLASS_DEFINITIONS__SERVICE_CLASS_DEFINITIONS);

		calendarsEClass = createEClass(CALENDARS);
		createEReference(calendarsEClass, CALENDARS__CALENDARS);

		calendarEClass = createEClass(CALENDAR);
		createEAttribute(calendarEClass, CALENDAR__NAME);
		createEAttribute(calendarEClass, CALENDAR__ID);
		createEAttribute(calendarEClass, CALENDAR__FROM_DATE);
		createEAttribute(calendarEClass, CALENDAR__UNTIL_DATE);
		createEAttribute(calendarEClass, CALENDAR__UTC_OFFSET);
		createEAttribute(calendarEClass, CALENDAR__DATES);
		createEAttribute(calendarEClass, CALENDAR__DATA_SOURCE);

		reservationParametersEClass = createEClass(RESERVATION_PARAMETERS);
		createEReference(reservationParametersEClass, RESERVATION_PARAMETERS__RESERVATION_PARAMETERS);

		reservationParameterEClass = createEClass(RESERVATION_PARAMETER);
		createEAttribute(reservationParameterEClass, RESERVATION_PARAMETER__MANDATORY_RESERVATION);
		createEAttribute(reservationParameterEClass, RESERVATION_PARAMETER__ID);
		createEReference(reservationParameterEClass, RESERVATION_PARAMETER__PARAMS9181);
		createEReference(reservationParameterEClass, RESERVATION_PARAMETER__OPTIONS);
		createEReference(reservationParameterEClass, RESERVATION_PARAMETER__MANDATORY_RESERVATION_FOR_BRANDS);
		createEAttribute(reservationParameterEClass, RESERVATION_PARAMETER__MANDATORY_RESERVATIONS_FOR_MODE);

		reservationParams9181EClass = createEClass(RESERVATION_PARAMS9181);
		createEAttribute(reservationParams9181EClass, RESERVATION_PARAMS9181__TRAVEL_CLASS);
		createEAttribute(reservationParams9181EClass, RESERVATION_PARAMS9181__SERVICE_LEVEL);
		createEAttribute(reservationParams9181EClass, RESERVATION_PARAMS9181__SERVICE);
		createEAttribute(reservationParams9181EClass, RESERVATION_PARAMS9181__BERTH_TYPE);
		createEAttribute(reservationParams9181EClass, RESERVATION_PARAMS9181__COACH_TYPE);
		createEAttribute(reservationParams9181EClass, RESERVATION_PARAMS9181__COMPARTMENT_TYPE);
		createEAttribute(reservationParams9181EClass, RESERVATION_PARAMS9181__TARIFF);

		reservationOptionsEClass = createEClass(RESERVATION_OPTIONS);
		createEReference(reservationOptionsEClass, RESERVATION_OPTIONS__PREFERENCES);
		createEReference(reservationOptionsEClass, RESERVATION_OPTIONS__SERVICE_BRANDS);
		createEAttribute(reservationOptionsEClass, RESERVATION_OPTIONS__GRAPHICAL_RESERVATION);

		reservationPreferenceGroupEClass = createEClass(RESERVATION_PREFERENCE_GROUP);
		createEAttribute(reservationPreferenceGroupEClass, RESERVATION_PREFERENCE_GROUP__PREFERENCE);
		createEAttribute(reservationPreferenceGroupEClass, RESERVATION_PREFERENCE_GROUP__GROUP);

		serviceClassEClass = createEClass(SERVICE_CLASS);
		createEAttribute(serviceClassEClass, SERVICE_CLASS__ID);
		createEAttribute(serviceClassEClass, SERVICE_CLASS__CLASSIC_CLASS);
		createEReference(serviceClassEClass, SERVICE_CLASS__TEXT);

		serviceLevelEClass = createEClass(SERVICE_LEVEL);
		createEAttribute(serviceLevelEClass, SERVICE_LEVEL__ID);
		createEReference(serviceLevelEClass, SERVICE_LEVEL__TEXT);
		createEReference(serviceLevelEClass, SERVICE_LEVEL__COMBINING_SERVICE_CLASSES);
		createEReference(serviceLevelEClass, SERVICE_LEVEL__RESERVATION_PARAMETER);
		createEAttribute(serviceLevelEClass, SERVICE_LEVEL__INCLUDES_CLASS_NAME);

		timeRangeEClass = createEClass(TIME_RANGE);
		createEAttribute(timeRangeEClass, TIME_RANGE__SCOPE);
		createEAttribute(timeRangeEClass, TIME_RANGE__FROM);
		createEAttribute(timeRangeEClass, TIME_RANGE__UNTIL);

		excludedTimeRangeEClass = createEClass(EXCLUDED_TIME_RANGE);

		validityRangeEClass = createEClass(VALIDITY_RANGE);
		createEAttribute(validityRangeEClass, VALIDITY_RANGE__UNIT);
		createEAttribute(validityRangeEClass, VALIDITY_RANGE__VALUE);
		createEAttribute(validityRangeEClass, VALIDITY_RANGE__HOURS_AFTER_MIDNIGHT);

		relativeTimeEClass = createEClass(RELATIVE_TIME);
		createEAttribute(relativeTimeEClass, RELATIVE_TIME__UNIT);
		createEAttribute(relativeTimeEClass, RELATIVE_TIME__REFERENCE);
		createEAttribute(relativeTimeEClass, RELATIVE_TIME__VALUE);

		returnValidityConstraintEClass = createEClass(RETURN_VALIDITY_CONSTRAINT);
		createEAttribute(returnValidityConstraintEClass, RETURN_VALIDITY_CONSTRAINT__EXCLUDED_WEEKDAYS);
		createEAttribute(returnValidityConstraintEClass, RETURN_VALIDITY_CONSTRAINT__LATEST_RETURN);
		createEAttribute(returnValidityConstraintEClass, RETURN_VALIDITY_CONSTRAINT__EARLIEST_RETURN);

		viaStationEClass = createEClass(VIA_STATION);
		createEReference(viaStationEClass, VIA_STATION__STATION);
		createEReference(viaStationEClass, VIA_STATION__CARRIER);
		createEReference(viaStationEClass, VIA_STATION__ROUTE);
		createEReference(viaStationEClass, VIA_STATION__ALTERNATIVE_ROUTES);
		createEAttribute(viaStationEClass, VIA_STATION__DATA_DESCRIPTION);
		createEReference(viaStationEClass, VIA_STATION__FARE_STATION_SET);
		createEOperation(viaStationEClass, VIA_STATION___GET_DESCRIPTION);

		alternativeRouteEClass = createEClass(ALTERNATIVE_ROUTE);
		createEReference(alternativeRouteEClass, ALTERNATIVE_ROUTE__STATIONS);

		routeEClass = createEClass(ROUTE);
		createEReference(routeEClass, ROUTE__STATIONS);

		zoneEClass = createEClass(ZONE);
		createEAttribute(zoneEClass, ZONE__BINARY_ZONE_ID);
		createEAttribute(zoneEClass, ZONE__ZONE_ID);
		createEAttribute(zoneEClass, ZONE__CITY);
		createEReference(zoneEClass, ZONE__CARRIER);
		createEReference(zoneEClass, ZONE__ENTRY_STATION);
		createEReference(zoneEClass, ZONE__TERMINAL_STATION);
		createEReference(zoneEClass, ZONE__NUTS_CODE);

		lineEClass = createEClass(LINE);
		createEAttribute(lineEClass, LINE__BINARY_ZONE_ID);
		createEAttribute(lineEClass, LINE__LINE_ID);
		createEReference(lineEClass, LINE__CARRIER);
		createEReference(lineEClass, LINE__ENTRY_STATION);
		createEReference(lineEClass, LINE__TERMINAL_STATION);
		createEReference(lineEClass, LINE__NUTS_CODE);
		createEAttribute(lineEClass, LINE__CITY);

		polygoneEClass = createEClass(POLYGONE);
		createEReference(polygoneEClass, POLYGONE__EDGE);

		edgeEClass = createEClass(EDGE);
		createEAttribute(edgeEClass, EDGE__SYSTEM);
		createEAttribute(edgeEClass, EDGE__ACCURACY);
		createEAttribute(edgeEClass, EDGE__LONGITUDE);
		createEAttribute(edgeEClass, EDGE__LATITUDE);

		zoneDefinitionsEClass = createEClass(ZONE_DEFINITIONS);
		createEReference(zoneDefinitionsEClass, ZONE_DEFINITIONS__ZONE_DEFINITION);

		zoneDefinitionEClass = createEClass(ZONE_DEFINITION);
		createEReference(zoneDefinitionEClass, ZONE_DEFINITION__PROVIDER);
		createEAttribute(zoneDefinitionEClass, ZONE_DEFINITION__ZONE_ID);
		createEAttribute(zoneDefinitionEClass, ZONE_DEFINITION__NAME);
		createEReference(zoneDefinitionEClass, ZONE_DEFINITION__POLYGONE);
		createEAttribute(zoneDefinitionEClass, ZONE_DEFINITION__NAME_UTF8);
		createEReference(zoneDefinitionEClass, ZONE_DEFINITION__STATION_SET);
		createEReference(zoneDefinitionEClass, ZONE_DEFINITION__NUTS_CODES);

		carrierResourceLocationEClass = createEClass(CARRIER_RESOURCE_LOCATION);
		createEReference(carrierResourceLocationEClass, CARRIER_RESOURCE_LOCATION__CARRIER);
		createEReference(carrierResourceLocationEClass, CARRIER_RESOURCE_LOCATION__SERVICE_BRAND);
		createEReference(carrierResourceLocationEClass, CARRIER_RESOURCE_LOCATION__ONLINE_RESOURCES);

		crossBorderConditionEClass = createEClass(CROSS_BORDER_CONDITION);
		createEReference(crossBorderConditionEClass, CROSS_BORDER_CONDITION__FROM_COUNTRY);
		createEReference(crossBorderConditionEClass, CROSS_BORDER_CONDITION__TO_COUNTRY);
		createEReference(crossBorderConditionEClass, CROSS_BORDER_CONDITION__AFFECTED_SERVICE_BRANDS);

		fareCombinationModelEClass = createEClass(FARE_COMBINATION_MODEL);
		createEAttribute(fareCombinationModelEClass, FARE_COMBINATION_MODEL__MODEL);
		createEReference(fareCombinationModelEClass, FARE_COMBINATION_MODEL__COMBINABLE_CARRIERS);
		createEAttribute(fareCombinationModelEClass, FARE_COMBINATION_MODEL__ONLY_WHEN_COMBINED);
		createEReference(fareCombinationModelEClass, FARE_COMBINATION_MODEL__ALLOWED_ALLOCATORS);
		createEAttribute(fareCombinationModelEClass, FARE_COMBINATION_MODEL__REFERENCE_CLUSTER);
		createEAttribute(fareCombinationModelEClass, FARE_COMBINATION_MODEL__ALLOWED_CLUSTERS);
		createEReference(fareCombinationModelEClass, FARE_COMBINATION_MODEL__ALLOWED_COMMON_CONTRACTS);

		reductionConstraintEClass = createEClass(REDUCTION_CONSTRAINT);
		createEAttribute(reductionConstraintEClass, REDUCTION_CONSTRAINT__ID);
		createEReference(reductionConstraintEClass, REDUCTION_CONSTRAINT__REQUIRED_REDUCTION_CARDS);

		requiredReductionCardEClass = createEClass(REQUIRED_REDUCTION_CARD);
		createEReference(requiredReductionCardEClass, REQUIRED_REDUCTION_CARD__CARD_CLASS);
		createEReference(requiredReductionCardEClass, REQUIRED_REDUCTION_CARD__CARD);
		createEAttribute(requiredReductionCardEClass, REQUIRED_REDUCTION_CARD__NAME);

		conversionFromLegacyEClass = createEClass(CONVERSION_FROM_LEGACY);
		createEReference(conversionFromLegacyEClass, CONVERSION_FROM_LEGACY__LEGACY108);
		createEReference(conversionFromLegacyEClass, CONVERSION_FROM_LEGACY__PARAMS);

		conversionParamsEClass = createEClass(CONVERSION_PARAMS);
		createEAttribute(conversionParamsEClass, CONVERSION_PARAMS__TAX_ID);
		createEAttribute(conversionParamsEClass, CONVERSION_PARAMS__VA_TPERCENTAGE);
		createEReference(conversionParamsEClass, CONVERSION_PARAMS__COUNTRY);
		createEReference(conversionParamsEClass, CONVERSION_PARAMS__LEGACY_BORDER_POINT_MAPPINGS);
		createEReference(conversionParamsEClass, CONVERSION_PARAMS__LEGACY_STATION_MAPPINGS);
		createEReference(conversionParamsEClass, CONVERSION_PARAMS__LEGACY_FARE_TEMPLATES);
		createEReference(conversionParamsEClass, CONVERSION_PARAMS__LEGACY_FARE_STATION_MAPPINGS);
		createEReference(conversionParamsEClass, CONVERSION_PARAMS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS);
		createEReference(conversionParamsEClass, CONVERSION_PARAMS__LEGACY_STATION_TO_FARE_DETAIL_MAPPINGS);
		createEReference(conversionParamsEClass, CONVERSION_PARAMS__END_OF_SALE);
		createEReference(conversionParamsEClass, CONVERSION_PARAMS__START_OF_SALE);
		createEAttribute(conversionParamsEClass, CONVERSION_PARAMS__STATION_IMPORT_FILTER);
		createEAttribute(conversionParamsEClass, CONVERSION_PARAMS__CONVERT_FARE_DESCRIPTIONS);
		createEAttribute(conversionParamsEClass, CONVERSION_PARAMS__CONVERT_SERVICE_CONSTRAINTS);

		fareTemplateEClass = createEClass(FARE_TEMPLATE);
		createEAttribute(fareTemplateEClass, FARE_TEMPLATE__PRICE_FACTOR);
		createEReference(fareTemplateEClass, FARE_TEMPLATE__PRICE);
		createEAttribute(fareTemplateEClass, FARE_TEMPLATE__ID);
		createEAttribute(fareTemplateEClass, FARE_TEMPLATE__TYPE);
		createEReference(fareTemplateEClass, FARE_TEMPLATE__AFTER_SALES_TEMPLATE);
		createEAttribute(fareTemplateEClass, FARE_TEMPLATE__DATA_DESCRIPTION);
		createEReference(fareTemplateEClass, FARE_TEMPLATE__TEXT);
		createEReference(fareTemplateEClass, FARE_TEMPLATE__REGIONAL_CONSTRAINT);
		createEReference(fareTemplateEClass, FARE_TEMPLATE__SERVICE_CONSTRAINT);
		createEReference(fareTemplateEClass, FARE_TEMPLATE__CARRIER_CONSTRAINT);
		createEReference(fareTemplateEClass, FARE_TEMPLATE__SERVICE_CLASS);
		createEReference(fareTemplateEClass, FARE_TEMPLATE__SERVICE_LEVEL);
		createEReference(fareTemplateEClass, FARE_TEMPLATE__SALES_AVAILABILITY);
		createEReference(fareTemplateEClass, FARE_TEMPLATE__TRAVEL_VALIDITY);
		createEReference(fareTemplateEClass, FARE_TEMPLATE__COMBINATION_CONSTRAINT);
		createEReference(fareTemplateEClass, FARE_TEMPLATE__SEPARATE_CONTRACT_COMBINATION_CONSTRAINT);
		createEReference(fareTemplateEClass, FARE_TEMPLATE__FARE_DETAIL_DESCRIPTION);
		createEReference(fareTemplateEClass, FARE_TEMPLATE__LEGACY_ACCOUNTING_IDENTIFIER);
		createEReference(fareTemplateEClass, FARE_TEMPLATE__PERSONAL_DATA_CONSTRAINT);
		createEReference(fareTemplateEClass, FARE_TEMPLATE__RESERVATION_PARAMETER);
		createEReference(fareTemplateEClass, FARE_TEMPLATE__REDUCTION_CONSTRAINT);
		createEReference(fareTemplateEClass, FARE_TEMPLATE__FULFILLMENT_CONSTRAINT);
		createEReference(fareTemplateEClass, FARE_TEMPLATE__PASSENGER_CONSTRAINT);
		createEAttribute(fareTemplateEClass, FARE_TEMPLATE__LEGACY_CONVERSION);
		createEAttribute(fareTemplateEClass, FARE_TEMPLATE__INDIVIDUAL_CONTRACTS);
		createEAttribute(fareTemplateEClass, FARE_TEMPLATE__REGULATORY_CONDITIONS);

		afterSalesTemplateEClass = createEClass(AFTER_SALES_TEMPLATE);
		createEAttribute(afterSalesTemplateEClass, AFTER_SALES_TEMPLATE__TRANSACTION_TYPE);
		createEAttribute(afterSalesTemplateEClass, AFTER_SALES_TEMPLATE__CARRIER_FEE);
		createEReference(afterSalesTemplateEClass, AFTER_SALES_TEMPLATE__APPLICATION_TIME);
		createEAttribute(afterSalesTemplateEClass, AFTER_SALES_TEMPLATE__FEE_FACTOR);

		legacyStationToServiceConstraintMappingsEClass = createEClass(LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPINGS);
		createEReference(legacyStationToServiceConstraintMappingsEClass, LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPINGS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS);
		createEOperation(legacyStationToServiceConstraintMappingsEClass, LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPINGS___FIND_SERVICE_CONSTRAINT__INT);

		legacyBorderPointEClass = createEClass(LEGACY_BORDER_POINT);
		createEAttribute(legacyBorderPointEClass, LEGACY_BORDER_POINT__BORDER_POINT_CODE);
		createEReference(legacyBorderPointEClass, LEGACY_BORDER_POINT__FAKE_BORDER_STATIONS);
		createEReference(legacyBorderPointEClass, LEGACY_BORDER_POINT__ON_BORDER_STATIONS);
		createEReference(legacyBorderPointEClass, LEGACY_BORDER_POINT__BORDER_SIDES);

		onBorderStationsEClass = createEClass(ON_BORDER_STATIONS);
		createEReference(onBorderStationsEClass, ON_BORDER_STATIONS__STATIONS);

		legacyFakeBorderStationsEClass = createEClass(LEGACY_FAKE_BORDER_STATIONS);
		createEReference(legacyFakeBorderStationsEClass, LEGACY_FAKE_BORDER_STATIONS__STATIONS);

		legacyBorderSideEClass = createEClass(LEGACY_BORDER_SIDE);
		createEReference(legacyBorderSideEClass, LEGACY_BORDER_SIDE__CARRIER);
		createEReference(legacyBorderSideEClass, LEGACY_BORDER_SIDE__STATIONS);
		createEAttribute(legacyBorderSideEClass, LEGACY_BORDER_SIDE__LEGACY_STATION_CODE);

		legacyBorderPointsEClass = createEClass(LEGACY_BORDER_POINTS);
		createEReference(legacyBorderPointsEClass, LEGACY_BORDER_POINTS__LEGACY_BORDER_POINTS);

		legacyStationToServiceConstraintMappingEClass = createEClass(LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING);
		createEAttribute(legacyStationToServiceConstraintMappingEClass, LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING__CODE);
		createEReference(legacyStationToServiceConstraintMappingEClass, LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING__SERVICE_CONSTRAINT);
		createEAttribute(legacyStationToServiceConstraintMappingEClass, LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING__DESCRIPTION);

		legacyStationMappingsEClass = createEClass(LEGACY_STATION_MAPPINGS);
		createEReference(legacyStationMappingsEClass, LEGACY_STATION_MAPPINGS__STATION_MAPPINGS);
		createEOperation(legacyStationMappingsEClass, LEGACY_STATION_MAPPINGS___FIND_MAPPED_STATION__INT);

		legacyStationMapEClass = createEClass(LEGACY_STATION_MAP);
		createEAttribute(legacyStationMapEClass, LEGACY_STATION_MAP__LEGACY_CODE);
		createEReference(legacyStationMapEClass, LEGACY_STATION_MAP__STATION);
		createEAttribute(legacyStationMapEClass, LEGACY_STATION_MAP__DATA_SOURCE);

		legacyFareDetailMapsEClass = createEClass(LEGACY_FARE_DETAIL_MAPS);
		createEReference(legacyFareDetailMapsEClass, LEGACY_FARE_DETAIL_MAPS__LEGACY_FARE_DETAIL_MAPS);

		legacyFareDetailMapEClass = createEClass(LEGACY_FARE_DETAIL_MAP);
		createEAttribute(legacyFareDetailMapEClass, LEGACY_FARE_DETAIL_MAP__LEGACY_CODE);
		createEReference(legacyFareDetailMapEClass, LEGACY_FARE_DETAIL_MAP__FARE_DETAIL_DESCRIPTION);
		createEAttribute(legacyFareDetailMapEClass, LEGACY_FARE_DETAIL_MAP__FARE_DETAIL_MAPPING_TYPE);

		legacyStationEClass = createEClass(LEGACY_STATION);
		createEAttribute(legacyStationEClass, LEGACY_STATION__CODE);
		createEAttribute(legacyStationEClass, LEGACY_STATION__NAME);

		legacyBoderPointMappingsEClass = createEClass(LEGACY_BODER_POINT_MAPPINGS);
		createEReference(legacyBoderPointMappingsEClass, LEGACY_BODER_POINT_MAPPINGS__BORDER_POINTS);
		createEOperation(legacyBoderPointMappingsEClass, LEGACY_BODER_POINT_MAPPINGS___GET_MAPPING_BY_BORDER_POINT_CODE__INT);

		legacyBorderPointMappingEClass = createEClass(LEGACY_BORDER_POINT_MAPPING);
		createEAttribute(legacyBorderPointMappingEClass, LEGACY_BORDER_POINT_MAPPING__CODE);
		createEAttribute(legacyBorderPointMappingEClass, LEGACY_BORDER_POINT_MAPPING__NAME);
		createEReference(legacyBorderPointMappingEClass, LEGACY_BORDER_POINT_MAPPING__STATION);
		createEReference(legacyBorderPointMappingEClass, LEGACY_BORDER_POINT_MAPPING__CONNECTION_POINT);

		legacyFareStationSetMappingsEClass = createEClass(LEGACY_FARE_STATION_SET_MAPPINGS);
		createEReference(legacyFareStationSetMappingsEClass, LEGACY_FARE_STATION_SET_MAPPINGS__LEGACY_FARE_STATION_SET_MAP);

		legacyFareStationSetMapEClass = createEClass(LEGACY_FARE_STATION_SET_MAP);
		createEAttribute(legacyFareStationSetMapEClass, LEGACY_FARE_STATION_SET_MAP__LEGACY_CODE);
		createEReference(legacyFareStationSetMapEClass, LEGACY_FARE_STATION_SET_MAP__STATION_SET);

		legacy108EClass = createEClass(LEGACY108);
		createEAttribute(legacy108EClass, LEGACY108__CHARACTER_SET);
		createEReference(legacy108EClass, LEGACY108__LEGACY_SERIES_LIST);
		createEReference(legacy108EClass, LEGACY108__LEGACY_SEPARATE_CONTRACT_SERIES);
		createEReference(legacy108EClass, LEGACY108__LEGACY_DISTANCE_FARES);
		createEReference(legacy108EClass, LEGACY108__LEGACY_ROUTE_FARES);
		createEReference(legacy108EClass, LEGACY108__LEGACY_STATIONS);
		createEReference(legacy108EClass, LEGACY108__LEGACY_FARE_DESCRIPTIONS);
		createEAttribute(legacy108EClass, LEGACY108__TIME_ZONE);
		createEReference(legacy108EClass, LEGACY108__CARRIER);
		createEAttribute(legacy108EClass, LEGACY108__START_DATE);
		createEAttribute(legacy108EClass, LEGACY108__END_DATE);
		createEReference(legacy108EClass, LEGACY108__LEGACY_BORDER_POINTS);

		legacy108FareDescriptionEClass = createEClass(LEGACY108_FARE_DESCRIPTION);
		createEAttribute(legacy108FareDescriptionEClass, LEGACY108_FARE_DESCRIPTION__TABLE_ID);
		createEAttribute(legacy108FareDescriptionEClass, LEGACY108_FARE_DESCRIPTION__DESCRIPTION_FR);
		createEAttribute(legacy108FareDescriptionEClass, LEGACY108_FARE_DESCRIPTION__DESCRIPTION_GE);
		createEAttribute(legacy108FareDescriptionEClass, LEGACY108_FARE_DESCRIPTION__DESCRIPTION_EN);
		createEAttribute(legacy108FareDescriptionEClass, LEGACY108_FARE_DESCRIPTION__DESCRIPTION_LOCAL);
		createEAttribute(legacy108FareDescriptionEClass, LEGACY108_FARE_DESCRIPTION__CALCULATION_TYPE);

		legacy108FaresDescriptionsEClass = createEClass(LEGACY108_FARES_DESCRIPTIONS);
		createEReference(legacy108FaresDescriptionsEClass, LEGACY108_FARES_DESCRIPTIONS__LEGACY_FARES);

		legacy108StationsEClass = createEClass(LEGACY108_STATIONS);
		createEReference(legacy108StationsEClass, LEGACY108_STATIONS__LEGACY_STATIONS);
		createEOperation(legacy108StationsEClass, LEGACY108_STATIONS___FIND_STATION__INT);
		createEOperation(legacy108StationsEClass, LEGACY108_STATIONS___FIND_BY_BORDER_POINT__INT);

		legacy108StationEClass = createEClass(LEGACY108_STATION);
		createEAttribute(legacy108StationEClass, LEGACY108_STATION__NAME);
		createEAttribute(legacy108StationEClass, LEGACY108_STATION__BORDER_POINT_CODE);
		createEAttribute(legacy108StationEClass, LEGACY108_STATION__NAME_UTF8);
		createEAttribute(legacy108StationEClass, LEGACY108_STATION__STATION_CODE);
		createEAttribute(legacy108StationEClass, LEGACY108_STATION__FARE_REFERENCE_STATION_CODE);
		createEAttribute(legacy108StationEClass, LEGACY108_STATION__SHORT_NAME);

		legacyRouteFaresEClass = createEClass(LEGACY_ROUTE_FARES);
		createEReference(legacyRouteFaresEClass, LEGACY_ROUTE_FARES__ROUTE_FARE);

		legacyRouteFareEClass = createEClass(LEGACY_ROUTE_FARE);
		createEAttribute(legacyRouteFareEClass, LEGACY_ROUTE_FARE__FARE_TABLE_NUMBER);
		createEAttribute(legacyRouteFareEClass, LEGACY_ROUTE_FARE__SERIES_NUMBER);
		createEAttribute(legacyRouteFareEClass, LEGACY_ROUTE_FARE__FARE2ND);
		createEAttribute(legacyRouteFareEClass, LEGACY_ROUTE_FARE__FARE1ST);
		createEAttribute(legacyRouteFareEClass, LEGACY_ROUTE_FARE__RETURN_FARE1ST);
		createEAttribute(legacyRouteFareEClass, LEGACY_ROUTE_FARE__RETURN_FARE2ND);
		createEAttribute(legacyRouteFareEClass, LEGACY_ROUTE_FARE__VALID_FROM);
		createEAttribute(legacyRouteFareEClass, LEGACY_ROUTE_FARE__VALID_UNTIL);
		createEReference(legacyRouteFareEClass, LEGACY_ROUTE_FARE__SERIES);

		legacySeriesListEClass = createEClass(LEGACY_SERIES_LIST);
		createEReference(legacySeriesListEClass, LEGACY_SERIES_LIST__SERIES);

		legacySeriesEClass = createEClass(LEGACY_SERIES);
		createEAttribute(legacySeriesEClass, LEGACY_SERIES__SUPPLYING_CARRIER_CODE);
		createEAttribute(legacySeriesEClass, LEGACY_SERIES__NUMBER);
		createEAttribute(legacySeriesEClass, LEGACY_SERIES__FARE_TABLE_NUMBER);
		createEAttribute(legacySeriesEClass, LEGACY_SERIES__TYPE);
		createEAttribute(legacySeriesEClass, LEGACY_SERIES__FROM_STATION);
		createEAttribute(legacySeriesEClass, LEGACY_SERIES__FROM_STATION_NAME);
		createEAttribute(legacySeriesEClass, LEGACY_SERIES__TO_STATION);
		createEAttribute(legacySeriesEClass, LEGACY_SERIES__TO_STATION_NAME);
		createEAttribute(legacySeriesEClass, LEGACY_SERIES__ROUTE_NUMBER);
		createEAttribute(legacySeriesEClass, LEGACY_SERIES__CARRIER_CODE);
		createEAttribute(legacySeriesEClass, LEGACY_SERIES__ROUTE_DESCRIPTION);
		createEAttribute(legacySeriesEClass, LEGACY_SERIES__PRICETYPE);
		createEAttribute(legacySeriesEClass, LEGACY_SERIES__DISTANCE1);
		createEAttribute(legacySeriesEClass, LEGACY_SERIES__DISTANCE2);
		createEReference(legacySeriesEClass, LEGACY_SERIES__VIASTATIONS);
		createEAttribute(legacySeriesEClass, LEGACY_SERIES__VALID_FROM);
		createEAttribute(legacySeriesEClass, LEGACY_SERIES__VALID_UNTIL);

		legacySeparateContractSeriesListEClass = createEClass(LEGACY_SEPARATE_CONTRACT_SERIES_LIST);
		createEReference(legacySeparateContractSeriesListEClass, LEGACY_SEPARATE_CONTRACT_SERIES_LIST__SEPARATE_CONTRACT_SERIES);

		legacySeparateContractSeriesEClass = createEClass(LEGACY_SEPARATE_CONTRACT_SERIES);
		createEAttribute(legacySeparateContractSeriesEClass, LEGACY_SEPARATE_CONTRACT_SERIES__SERIES_NUMBER);
		createEAttribute(legacySeparateContractSeriesEClass, LEGACY_SEPARATE_CONTRACT_SERIES__VALID_FROM);
		createEAttribute(legacySeparateContractSeriesEClass, LEGACY_SEPARATE_CONTRACT_SERIES__VALID_UNTIL);
		createEReference(legacySeparateContractSeriesEClass, LEGACY_SEPARATE_CONTRACT_SERIES__SERIES);

		legacyDistanceFaresEClass = createEClass(LEGACY_DISTANCE_FARES);
		createEReference(legacyDistanceFaresEClass, LEGACY_DISTANCE_FARES__DISTANCE_FARE);

		legacyDistanceFareEClass = createEClass(LEGACY_DISTANCE_FARE);
		createEAttribute(legacyDistanceFareEClass, LEGACY_DISTANCE_FARE__DISTANCE);
		createEAttribute(legacyDistanceFareEClass, LEGACY_DISTANCE_FARE__FARE2ND);
		createEAttribute(legacyDistanceFareEClass, LEGACY_DISTANCE_FARE__FARE1ST);
		createEAttribute(legacyDistanceFareEClass, LEGACY_DISTANCE_FARE__FARE_TABLE_NUMBER);
		createEAttribute(legacyDistanceFareEClass, LEGACY_DISTANCE_FARE__RETURN_FARE1ST);
		createEAttribute(legacyDistanceFareEClass, LEGACY_DISTANCE_FARE__RETURN_FARE2ND);
		createEAttribute(legacyDistanceFareEClass, LEGACY_DISTANCE_FARE__VALID_FROM);
		createEAttribute(legacyDistanceFareEClass, LEGACY_DISTANCE_FARE__VALID_UNTIL);

		legacyViastationEClass = createEClass(LEGACY_VIASTATION);
		createEAttribute(legacyViastationEClass, LEGACY_VIASTATION__POSITION);
		createEAttribute(legacyViastationEClass, LEGACY_VIASTATION__CODE);
		createEAttribute(legacyViastationEClass, LEGACY_VIASTATION__OPTIONAL);

		legacyFareTemplatesEClass = createEClass(LEGACY_FARE_TEMPLATES);
		createEReference(legacyFareTemplatesEClass, LEGACY_FARE_TEMPLATES__FARE_TEMPLATES);

		// Create enums
		stationRelationTypeEEnum = createEEnum(STATION_RELATION_TYPE);
		stationFareDetailTypeEEnum = createEEnum(STATION_FARE_DETAIL_TYPE);
		regulatoryConditionEEnum = createEEnum(REGULATORY_CONDITION);
		afterSalesTransactionTypeEEnum = createEEnum(AFTER_SALES_TRANSACTION_TYPE);
		barcodeTypesEEnum = createEEnum(BARCODE_TYPES);
		classicClassTypeEEnum = createEEnum(CLASSIC_CLASS_TYPE);
		characterSetEEnum = createEEnum(CHARACTER_SET);
		clustersEEnum = createEEnum(CLUSTERS);
		combinationModelEEnum = createEEnum(COMBINATION_MODEL);
		controlDataExchangeTypesEEnum = createEEnum(CONTROL_DATA_EXCHANGE_TYPES);
		fareTypeEEnum = createEEnum(FARE_TYPE);
		fulfillmentTypeEEnum = createEEnum(FULFILLMENT_TYPE);
		geoSystemEEnum = createEEnum(GEO_SYSTEM);
		geoUnitEEnum = createEEnum(GEO_UNIT);
		graphicalReservationTypeEEnum = createEEnum(GRAPHICAL_RESERVATION_TYPE);
		hemisphereEWEEnum = createEEnum(HEMISPHERE_EW);
		hemisphereNSEEnum = createEEnum(HEMISPHERE_NS);
		interfaceTypeEEnum = createEEnum(INTERFACE_TYPE);
		legacyCalculationTypeEEnum = createEEnum(LEGACY_CALCULATION_TYPE);
		legacyPassengerTypeEEnum = createEEnum(LEGACY_PASSENGER_TYPE);
		legacySeriesTypeEEnum = createEEnum(LEGACY_SERIES_TYPE);
		legacyConversionTypeEEnum = createEEnum(LEGACY_CONVERSION_TYPE);
		offerRequestTypeEEnum = createEEnum(OFFER_REQUEST_TYPE);
		onlineServiceTypeEEnum = createEEnum(ONLINE_SERVICE_TYPE);
		personalDataItemsTypeEEnum = createEEnum(PERSONAL_DATA_ITEMS_TYPE);
		personalDataTransferTypeEEnum = createEEnum(PERSONAL_DATA_TRANSFER_TYPE);
		personalDataChangeReasonEEnum = createEEnum(PERSONAL_DATA_CHANGE_REASON);
		reservationTravelClassEEnum = createEEnum(RESERVATION_TRAVEL_CLASS);
		reservationServiceLevelEEnum = createEEnum(RESERVATION_SERVICE_LEVEL);
		reservationServiceEEnum = createEEnum(RESERVATION_SERVICE);
		reservationBerthTypeEEnum = createEEnum(RESERVATION_BERTH_TYPE);
		schemaVersionEEnum = createEEnum(SCHEMA_VERSION);
		timeZoneEEnum = createEEnum(TIME_ZONE);
		taxScopeEEnum = createEEnum(TAX_SCOPE);
		timeReferenceTypeEEnum = createEEnum(TIME_REFERENCE_TYPE);
		timeRangeScopeEEnum = createEEnum(TIME_RANGE_SCOPE);
		timeUnitEEnum = createEEnum(TIME_UNIT);
		travelerTypeEEnum = createEEnum(TRAVELER_TYPE);
		weekDayEEnum = createEEnum(WEEK_DAY);
		dataSourceEEnum = createEEnum(DATA_SOURCE);
		classIdEEnum = createEEnum(CLASS_ID);
		genericReductionCardsEEnum = createEEnum(GENERIC_REDUCTION_CARDS);
		serviceModeEEnum = createEEnum(SERVICE_MODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		applicationTimeEClass.getESuperTypes().add(this.getRelativeTime());
		endOfSaleEClass.getESuperTypes().add(this.getRelativeTime());
		startOfSaleEClass.getESuperTypes().add(this.getRelativeTime());
		excludedTimeRangeEClass.getESuperTypes().add(this.getTimeRange());

		// Initialize classes, features, and operations; add parameters
		initEClass(gtmToolEClass, GTMTool.class, "GTMTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGTMTool_ConversionFromLegacy(), this.getConversionFromLegacy(), null, "conversionFromLegacy", null, 1, 1, GTMTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGTMTool_CodeLists(), this.getCodeLists(), null, "codeLists", null, 1, 1, GTMTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGTMTool_GeneralTariffModel(), this.getGeneralTariffModel(), null, "generalTariffModel", null, 1, 1, GTMTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeListsEClass, CodeLists.class, "CodeLists", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCodeLists_Carriers(), this.getCarriers(), null, "carriers", null, 0, 1, CodeLists.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodeLists_Stations(), this.getStations(), null, "stations", null, 0, 1, CodeLists.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodeLists_Countries(), this.getCountries(), null, "countries", null, 0, 1, CodeLists.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodeLists_Languages(), this.getLanguages(), null, "languages", null, 0, 1, CodeLists.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodeLists_Currencies(), this.getCurrencies(), null, "currencies", null, 0, 1, CodeLists.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodeLists_ServiceBrands(), this.getServiceBrands(), null, "serviceBrands", null, 0, 1, CodeLists.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodeLists_NutsCodes(), this.getNUTSCodes(), null, "nutsCodes", null, 0, 1, CodeLists.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nutsCodesEClass, NUTSCodes.class, "NUTSCodes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUTSCodes_NutsCodes(), this.getNutsCode(), null, "nutsCodes", null, 0, -1, NUTSCodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nutsCodeEClass, NutsCode.class, "NutsCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNutsCode_Name(), ecorePackage.getEString(), "name", null, 0, 1, NutsCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNutsCode_Code(), ecorePackage.getEString(), "code", null, 0, 1, NutsCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceBrandsEClass, ServiceBrands.class, "ServiceBrands", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceBrands_ServiceBrands(), this.getServiceBrand(), null, "serviceBrands", null, 0, -1, ServiceBrands.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getServiceBrands__FindServiceBRand__int(), this.getServiceBrand(), "findServiceBRand", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getInt(), "code", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(serviceBrandEClass, ServiceBrand.class, "ServiceBrand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceBrand_Code(), ecorePackage.getEInt(), "code", null, 0, 1, ServiceBrand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceBrand_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServiceBrand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceBrand_Abbreviation(), ecorePackage.getEString(), "abbreviation", null, 0, 1, ServiceBrand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceBrand_Description(), ecorePackage.getEString(), "description", null, 0, 1, ServiceBrand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(countriesEClass, Countries.class, "Countries", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCountries_Countries(), this.getCountry(), null, "countries", null, 0, -1, Countries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCountries__FindCountry__int(), this.getCountry(), "findCountry", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getInt(), "codeUic", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(countryEClass, Country.class, "Country", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCountry_Code(), ecorePackage.getEInt(), "code", null, 0, 1, Country.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCountry_Name(), ecorePackage.getEString(), "name", null, 0, 1, Country.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCountry_ISOcode(), ecorePackage.getEString(), "ISOcode", null, 0, 1, Country.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languagesEClass, Languages.class, "Languages", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLanguages_Languages(), this.getLanguage(), null, "languages", null, 0, -1, Languages.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageEClass, Language.class, "Language", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLanguage_Name(), ecorePackage.getEString(), "name", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguage_Code(), ecorePackage.getEString(), "code", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(currenciesEClass, Currencies.class, "Currencies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCurrencies_Currencies(), this.getCurrency(), null, "currencies", null, 0, -1, Currencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCurrencies__FindCurrency__String(), this.getCurrency(), "findCurrency", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "ISOcode", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(currencyEClass, Currency.class, "Currency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCurrency_Name(), ecorePackage.getEString(), "name", null, 0, 1, Currency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrency_IsoCode(), ecorePackage.getEString(), "isoCode", null, 0, 1, Currency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stationsEClass, Stations.class, "Stations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStations_Stations(), this.getStation(), null, "stations", null, 0, -1, Stations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getStations__FindStation__int_int(), this.getStation(), "findStation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getInt(), "countryCodeUIC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getInt(), "localCode", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStations__FindStation__int_String(), this.getStation(), "findStation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getInt(), "countryCodeUIC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "localCode", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stationEClass, Station.class, "Station", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Station.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStation_Country(), this.getCountry(), null, "country", null, 0, 1, Station.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStation_Code(), ecorePackage.getEString(), "code", null, 0, 1, Station.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStation_Longitude(), ecorePackage.getEFloat(), "longitude", null, 0, 1, Station.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStation_Latitude(), ecorePackage.getEFloat(), "latitude", null, 0, 1, Station.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStation_TimetableName(), ecorePackage.getEString(), "timetableName", null, 0, 1, Station.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStation_BorderStation(), theXMLTypePackage.getBoolean(), "borderStation", null, 0, 1, Station.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStation_NameCaseUTF8(), ecorePackage.getEString(), "nameCaseUTF8", null, 0, 1, Station.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStation_NameCaseASCII(), ecorePackage.getEString(), "nameCaseASCII", null, 0, 1, Station.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStation_ShortNameCaseASCII(), ecorePackage.getEString(), "shortNameCaseASCII", null, 0, 1, Station.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStation_ShortNameCaseUTF8(), ecorePackage.getEString(), "shortNameCaseUTF8", null, 0, 1, Station.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStation_LegacyBorderPointCode(), ecorePackage.getEInt(), "legacyBorderPointCode", null, 0, 1, Station.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStation_Relations(), this.getStationRelation(), null, "relations", null, 0, -1, Station.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stationRelationEClass, StationRelation.class, "StationRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStationRelation_RelationType(), this.getStationRelationType(), "relationType", null, 0, 1, StationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStationRelation_Station(), this.getStation(), null, "station", null, 0, 1, StationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carrierEClass, Carrier.class, "Carrier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCarrier_Code(), theXMLTypePackage.getString(), "code", null, 1, 1, Carrier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarrier_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Carrier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarrier_ShortName(), ecorePackage.getEString(), "shortName", null, 0, 1, Carrier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carriersEClass, Carriers.class, "Carriers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCarriers_Carriers(), this.getCarrier(), null, "carriers", null, 0, -1, Carriers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCarriers__FindCarrier__String(), this.getCarrier(), "findCarrier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "code", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stationSetEClass, StationSet.class, "StationSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStationSet_Stations(), this.getStation(), null, "stations", null, 0, -1, StationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generalTariffModelEClass, GeneralTariffModel.class, "GeneralTariffModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneralTariffModel_Delivery(), this.getDelivery(), null, "delivery", null, 0, 1, GeneralTariffModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralTariffModel_FareStructure(), this.getFareStructure(), null, "fareStructure", null, 0, 1, GeneralTariffModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deliveryEClass, Delivery.class, "Delivery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelivery_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, Delivery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelivery_PreviousDeliveryId(), theXMLTypePackage.getString(), "previousDeliveryId", null, 0, 1, Delivery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelivery_ReplacedDeliveryId(), theXMLTypePackage.getString(), "replacedDeliveryId", null, 0, 1, Delivery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelivery_Optional(), ecorePackage.getEBoolean(), "optional", "false", 0, 1, Delivery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelivery_Provider(), this.getCarrier(), null, "provider", null, 0, 1, Delivery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelivery_SchemaVersion(), this.getSchemaVersion(), "schemaVersion", null, 0, 1, Delivery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelivery_AcceptedSchemaVersion(), this.getSchemaVersion(), "acceptedSchemaVersion", null, 0, 1, Delivery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(afterSalesRulesEClass, AfterSalesRules.class, "AfterSalesRules", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAfterSalesRules_AfterSalesRules(), this.getAfterSalesRule(), null, "afterSalesRules", null, 0, -1, AfterSalesRules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(afterSalesRuleEClass, AfterSalesRule.class, "AfterSalesRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAfterSalesRule_Id(), ecorePackage.getEString(), "id", null, 0, 1, AfterSalesRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAfterSalesRule_DataSource(), this.getDataSource(), "dataSource", null, 0, 1, AfterSalesRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAfterSalesRule_Conditions(), this.getAfterSalesCondition(), null, "conditions", null, 0, -1, AfterSalesRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(afterSalesConditionEClass, AfterSalesCondition.class, "AfterSalesCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAfterSalesCondition_TransactionType(), this.getAfterSalesTransactionType(), "transactionType", null, 0, 1, AfterSalesCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAfterSalesCondition_IndividualContracts(), ecorePackage.getEBoolean(), "individualContracts", "false", 0, 1, AfterSalesCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAfterSalesCondition_CarrierFee(), ecorePackage.getEBoolean(), "carrierFee", "false", 0, 1, AfterSalesCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAfterSalesCondition_Fee(), this.getPrice(), null, "fee", null, 0, 1, AfterSalesCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAfterSalesCondition_ApplicationTime(), this.getApplicationTime(), null, "applicationTime", null, 0, 1, AfterSalesCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationTimeEClass, ApplicationTime.class, "ApplicationTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fareStructureEClass, FareStructure.class, "FareStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFareStructure_ServiceClassDefinitions(), this.getServiceClassDefinitions(), null, "serviceClassDefinitions", null, 0, 1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_ServiceLevelDefinitions(), this.getServiceLevelDefinitions(), null, "serviceLevelDefinitions", null, 0, 1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_StationNames(), this.getStationNames(), null, "stationNames", null, 0, 1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_FareStationSetDefinitions(), this.getFareStationSetDefinitions(), null, "fareStationSetDefinitions", null, 0, 1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_Calendars(), this.getCalendars(), null, "calendars", null, 0, 1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_Texts(), this.getTexts(), null, "texts", null, 0, 1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_ReductionCards(), this.getReductionCards(), null, "reductionCards", null, 0, 1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_FareElements(), this.getFareElements(), null, "fareElements", null, 0, 1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_CombinationConstraints(), this.getCombinationConstraints(), null, "combinationConstraints", null, 0, 1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_SalesAvailabilityConstraints(), this.getSalesAvailabilityConstraints(), null, "salesAvailabilityConstraints", null, 0, 1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_TravelValidityConstraints(), this.getTravelValidityConstraints(), null, "travelValidityConstraints", null, 0, 1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_RegionalConstraints(), this.getRegionalConstraints(), null, "regionalConstraints", null, 0, 1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_ConnectionPoints(), this.getConnectionPoints(), null, "connectionPoints", null, 0, 1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_CarrierConstraints(), this.getCarrierConstraints(), null, "carrierConstraints", null, 0, 1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_ServiceConstraints(), this.getServiceConstraints(), null, "serviceConstraints", null, 0, 1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_PassengerConstraints(), this.getPassengerConstraints(), null, "passengerConstraints", null, 0, 1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_ReductionConstraints(), this.getReductionConstraints(), null, "reductionConstraints", null, 0, 1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_PersonalDataConstraints(), this.getPersonalDataConstraints(), null, "personalDataConstraints", null, 0, 1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_AfterSalesRules(), this.getAfterSalesRules(), null, "afterSalesRules", null, 0, 1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_Prices(), this.getPrices(), null, "prices", null, 0, 1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_FulfillmentConstraints(), this.getFulfillmentConstraints(), null, "fulfillmentConstraints", null, 0, 1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_ReservationParameters(), this.getReservationParameters(), null, "reservationParameters", null, 0, 1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_SupportedOnlineServices(), this.getSupportedOnlineServices(), null, "supportedOnlineServices", null, 0, 1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_FareResourceLocations(), this.getFareResourceLocations(), null, "fareResourceLocations", null, 0, 1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_ZoneDefinitions(), this.getZoneDefinitions(), null, "zoneDefinitions", null, 0, 1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionPointsEClass, ConnectionPoints.class, "ConnectionPoints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionPoints_ConnectionPoints(), this.getConnectionPoint(), null, "connectionPoints", null, 0, -1, ConnectionPoints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getConnectionPoints__FindSimpleConnectionPoint__Station(), this.getConnectionPoint(), "findSimpleConnectionPoint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStation(), "station", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(connectionPointEClass, ConnectionPoint.class, "ConnectionPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnectionPoint_Id(), ecorePackage.getEString(), "id", null, 0, 1, ConnectionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionPoint_Name(), ecorePackage.getEString(), "name", null, 0, 1, ConnectionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionPoint_LegacyBorderPointCode(), ecorePackage.getEInt(), "LegacyBorderPointCode", null, 0, 1, ConnectionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionPoint_Description(), ecorePackage.getEString(), "description", null, 0, 1, ConnectionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionPoint_ConnectedStationSets(), this.getStationSet(), null, "connectedStationSets", null, 0, -1, ConnectionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionPoint_DataSource(), this.getDataSource(), "dataSource", null, 0, 1, ConnectionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionPoint_NameUtf8(), ecorePackage.getEString(), "nameUtf8", null, 0, 1, ConnectionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fareResourceLocationsEClass, FareResourceLocations.class, "FareResourceLocations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFareResourceLocations_TrainResourceLocations(), this.getTrainResourceLocations(), null, "trainResourceLocations", null, 0, 1, FareResourceLocations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareResourceLocations_StationResourceLocations(), this.getStationResourceLocations(), null, "stationResourceLocations", null, 0, 1, FareResourceLocations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareResourceLocations_CarrierResourceLocations(), this.getCarrierResourceLocations(), null, "carrierResourceLocations", null, 0, 1, FareResourceLocations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trainResourceLocationsEClass, TrainResourceLocations.class, "TrainResourceLocations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrainResourceLocations_TrainResourceLocations(), this.getTrainResourceLocation(), null, "trainResourceLocations", null, 0, -1, TrainResourceLocations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stationResourceLocationsEClass, StationResourceLocations.class, "StationResourceLocations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStationResourceLocations_StationResourceLocations(), this.getStationResourceLocation(), null, "stationResourceLocations", null, 0, -1, StationResourceLocations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carrierResourceLocationsEClass, CarrierResourceLocations.class, "CarrierResourceLocations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCarrierResourceLocations_CarrierResourceLocations(), this.getCarrierResourceLocation(), null, "carrierResourceLocations", null, 0, -1, CarrierResourceLocations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trainResourceLocationEClass, TrainResourceLocation.class, "TrainResourceLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrainResourceLocation_Carrier(), this.getCarrier(), null, "carrier", null, 0, 1, TrainResourceLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrainResourceLocation_OnlineResources(), this.getOnlineResource(), null, "onlineResources", null, 0, -1, TrainResourceLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrainResourceLocation_TrainId(), ecorePackage.getEString(), "trainId", null, 0, 1, TrainResourceLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stationResourceLocationEClass, StationResourceLocation.class, "StationResourceLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStationResourceLocation_OnlineResources(), this.getOnlineResource(), null, "onlineResources", null, 0, -1, StationResourceLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStationResourceLocation_Stations(), this.getStation(), null, "stations", null, 0, -1, StationResourceLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStationResourceLocation_ConnectionPoints(), this.getConnectionPoint(), null, "connectionPoints", null, 0, -1, StationResourceLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onlineResourceEClass, OnlineResource.class, "OnlineResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOnlineResource_OfferRequestType(), this.getOfferRequestType(), "offerRequestType", null, 0, 1, OnlineResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOnlineResource_InterfaceType(), this.getInterfaceType(), "interfaceType", null, 0, 1, OnlineResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOnlineResource_Version(), ecorePackage.getEString(), "version", null, 0, 1, OnlineResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOnlineResource_System(), ecorePackage.getEString(), "system", null, 0, 1, OnlineResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fulfillmentConstraintsEClass, FulfillmentConstraints.class, "FulfillmentConstraints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFulfillmentConstraints_FulfillmentConstraints(), this.getFulfillmentConstraint(), null, "fulfillmentConstraints", null, 0, -1, FulfillmentConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fulfillmentConstraintEClass, FulfillmentConstraint.class, "FulfillmentConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFulfillmentConstraint_Id(), ecorePackage.getEString(), "id", null, 0, 1, FulfillmentConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFulfillmentConstraint_AcceptedFulfilmentTypes(), this.getFulfillmentType(), "acceptedFulfilmentTypes", null, 0, -1, FulfillmentConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFulfillmentConstraint_RequiredControlDataExchange(), this.getControlDataExchangeTypes(), "requiredControlDataExchange", null, 0, -1, FulfillmentConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFulfillmentConstraint_IndividualTicketingPermitted(), ecorePackage.getEBoolean(), "individualTicketingPermitted", "false", 0, 1, FulfillmentConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFulfillmentConstraint_AcceptedBarcodes(), this.getAcceptedBarcodes(), null, "acceptedBarcodes", null, 0, 1, FulfillmentConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFulfillmentConstraint_RequiredBarcodes(), this.getRequiredBarcodes(), null, "requiredBarcodes", null, 0, 1, FulfillmentConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFulfillmentConstraint_DataDescription(), ecorePackage.getEString(), "dataDescription", null, 0, 1, FulfillmentConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredBarcodesEClass, RequiredBarcodes.class, "RequiredBarcodes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequiredBarcodes_RequiredBarcodes(), this.getBarcodeTypes(), "requiredBarcodes", null, 0, -1, RequiredBarcodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(acceptedBarcodesEClass, AcceptedBarcodes.class, "AcceptedBarcodes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAcceptedBarcodes_AcceptedBarcodes(), this.getBarcodeTypes(), "acceptedBarcodes", null, 0, -1, AcceptedBarcodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(supportedOnlineServicesEClass, SupportedOnlineServices.class, "SupportedOnlineServices", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSupportedOnlineServices_SupportedOnlineServices(), this.getOnlineServiceType(), "supportedOnlineServices", null, 0, -1, SupportedOnlineServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stationNamesEClass, StationNames.class, "StationNames", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStationNames_StationName(), this.getStation(), null, "stationName", null, 0, -1, StationNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fareElementsEClass, FareElements.class, "FareElements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFareElements_FareElements(), this.getFareElement(), null, "fareElements", null, 0, -1, FareElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fareElementEClass, FareElement.class, "FareElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFareElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, FareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFareElement_Type(), this.getFareType(), "type", null, 0, 1, FareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFareElement_DataDescription(), ecorePackage.getEString(), "dataDescription", null, 0, 1, FareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareElement_Text(), this.getText(), null, "text", null, 0, 1, FareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareElement_Price(), this.getPrice(), null, "price", null, 0, 1, FareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareElement_RegionalConstraint(), this.getRegionalConstraint(), null, "regionalConstraint", null, 0, 1, FareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareElement_ServiceConstraint(), this.getServiceConstraint(), null, "serviceConstraint", null, 0, 1, FareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareElement_CarrierConstraint(), this.getCarrierConstraint(), null, "carrierConstraint", null, 0, 1, FareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareElement_ServiceClass(), this.getServiceClass(), null, "serviceClass", null, 0, 1, FareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareElement_ServiceLevel(), this.getServiceLevel(), null, "serviceLevel", null, 0, 1, FareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareElement_SalesAvailability(), this.getSalesAvailabilityConstraint(), null, "salesAvailability", null, 0, 1, FareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareElement_TravelValidity(), this.getTravelValidityConstraint(), null, "travelValidity", null, 0, 1, FareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareElement_CombinationConstraint(), this.getCombinationConstraint(), null, "combinationConstraint", null, 0, 1, FareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareElement_FareDetailDescription(), this.getText(), null, "fareDetailDescription", null, 0, 1, FareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareElement_PersonalDataConstraint(), this.getPersonalDataConstraint(), null, "personalDataConstraint", null, 0, 1, FareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareElement_ReservationParameter(), this.getReservationParameter(), null, "reservationParameter", null, 0, 1, FareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareElement_ReductionConstraint(), this.getReductionConstraint(), null, "reductionConstraint", null, 0, 1, FareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareElement_FulfillmentConstraint(), this.getFulfillmentConstraint(), null, "fulfillmentConstraint", null, 0, 1, FareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareElement_PassengerConstraint(), this.getPassengerConstraint(), null, "passengerConstraint", null, 0, 1, FareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFareElement_RegulatoryConditions(), this.getRegulatoryCondition(), "regulatoryConditions", null, 0, -1, FareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareElement_AfterSalesRule(), this.getAfterSalesRule(), null, "afterSalesRule", null, 0, 1, FareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFareElement_DataSource(), this.getDataSource(), "dataSource", null, 0, 1, FareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareElement_LegacyAccountingIdentifier(), this.getLegacyAccountingIdentifier(), null, "legacyAccountingIdentifier", null, 0, 1, FareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFareElement_LegacyConversion(), this.getLegacyConversionType(), "legacyConversion", null, 0, 1, FareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFareElement_IndividualContracts(), ecorePackage.getEBoolean(), "individualContracts", "false", 0, 1, FareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fareStationSetDefinitionsEClass, FareStationSetDefinitions.class, "FareStationSetDefinitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFareStationSetDefinitions_FareStationSetDefinitions(), this.getFareStationSetDefinition(), null, "fareStationSetDefinitions", null, 0, -1, FareStationSetDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getFareStationSetDefinitions__FindFareSet__Carrier_int(), this.getFareStationSetDefinition(), "findFareSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCarrier(), "carrier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getInt(), "legacyCode", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fareStationSetDefinitionEClass, FareStationSetDefinition.class, "FareStationSetDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFareStationSetDefinition_DataSource(), this.getDataSource(), "dataSource", null, 0, 1, FareStationSetDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStationSetDefinition_Carrier(), this.getCarrier(), null, "carrier", null, 0, 1, FareStationSetDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFareStationSetDefinition_Code(), ecorePackage.getEString(), "code", null, 0, 1, FareStationSetDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFareStationSetDefinition_LegacyCode(), ecorePackage.getEInt(), "legacyCode", null, 0, 1, FareStationSetDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFareStationSetDefinition_Id(), ecorePackage.getEString(), "id", null, 0, 1, FareStationSetDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFareStationSetDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, FareStationSetDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFareStationSetDefinition_NameUtf8(), ecorePackage.getEString(), "nameUtf8", null, 0, 1, FareStationSetDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStationSetDefinition_Stations(), this.getStation(), null, "stations", null, 0, -1, FareStationSetDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacyAccountingIdentifierEClass, LegacyAccountingIdentifier.class, "LegacyAccountingIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegacyAccountingIdentifier_SeriesId(), ecorePackage.getEInt(), "seriesId", null, 0, 1, LegacyAccountingIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacyAccountingIdentifier_TariffId(), ecorePackage.getEInt(), "tariffId", null, 0, 1, LegacyAccountingIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacyAccountingIdentifier_AddSeriesId(), ecorePackage.getEInt(), "addSeriesId", null, 0, 1, LegacyAccountingIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reductionConstraintsEClass, ReductionConstraints.class, "ReductionConstraints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReductionConstraints_ReductionConstraints(), this.getReductionConstraint(), null, "reductionConstraints", null, 0, -1, ReductionConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personalDataConstraintsEClass, PersonalDataConstraints.class, "PersonalDataConstraints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersonalDataConstraints_PersonalDataConstraints(), this.getPersonalDataConstraint(), null, "personalDataConstraints", null, 0, -1, PersonalDataConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personalDataConstraintEClass, PersonalDataConstraint.class, "PersonalDataConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonalDataConstraint_Id(), ecorePackage.getEString(), "id", null, 0, 1, PersonalDataConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonalDataConstraint_RequiredPersonalData(), this.getRequiredPersonalData(), null, "requiredPersonalData", null, 0, -1, PersonalDataConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonalDataConstraint_AllowedChanges(), this.getAllowedPersonalDataChanges(), null, "allowedChanges", null, 0, -1, PersonalDataConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredPersonalDataEClass, RequiredPersonalData.class, "RequiredPersonalData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequiredPersonalData_TicketHolderOnly(), ecorePackage.getEBoolean(), "ticketHolderOnly", "true", 0, 1, RequiredPersonalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequiredPersonalData_DataItem(), this.getPersonalDataItemsType(), "dataItem", null, 0, 1, RequiredPersonalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequiredPersonalData_Transfer(), this.getPersonalDataTransferType(), "transfer", null, 0, -1, RequiredPersonalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequiredPersonalData_FulfillmentType(), this.getFulfillmentType(), "fulfillmentType", null, 0, -1, RequiredPersonalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequiredPersonalData_CrossBorder(), this.getCrossBorderCondition(), null, "crossBorder", null, 0, -1, RequiredPersonalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allowedPersonalDataChangesEClass, AllowedPersonalDataChanges.class, "AllowedPersonalDataChanges", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAllowedPersonalDataChanges_TimeLimit(), ecorePackage.getEFloat(), "timeLimit", null, 0, 1, AllowedPersonalDataChanges.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllowedPersonalDataChanges_AcceptedReason(), this.getPersonalDataChangeReason(), "acceptedReason", null, 0, 1, AllowedPersonalDataChanges.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(passengerConstraintsEClass, PassengerConstraints.class, "PassengerConstraints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPassengerConstraints_PassengerConstraints(), this.getPassengerConstraint(), null, "passengerConstraints", null, 0, -1, PassengerConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(passengerConstraintEClass, PassengerConstraint.class, "PassengerConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPassengerConstraint_Id(), ecorePackage.getEString(), "id", null, 0, 1, PassengerConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerConstraint_TravelerType(), this.getTravelerType(), "travelerType", null, 0, 1, PassengerConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPassengerConstraint_Text(), this.getText(), null, "text", null, 0, 1, PassengerConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerConstraint_UpperAgeLimit(), ecorePackage.getEInt(), "upperAgeLimit", null, 0, 1, PassengerConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerConstraint_LowerAgeLimit(), ecorePackage.getEInt(), "lowerAgeLimit", null, 0, 1, PassengerConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerConstraint_TravelAloneAgeLimit(), ecorePackage.getEInt(), "travelAloneAgeLimit", null, 0, 1, PassengerConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerConstraint_ReservationAgeLimit(), ecorePackage.getEInt(), "reservationAgeLimit", null, 0, 1, PassengerConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerConstraint_IsAncilliary(), ecorePackage.getEBoolean(), "isAncilliary", "false", 0, 1, PassengerConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerConstraint_PassengerWeight(), ecorePackage.getEFloat(), "passengerWeight", null, 0, 1, PassengerConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerConstraint_MaxTotalPassengerWeight(), ecorePackage.getEFloat(), "maxTotalPassengerWeight", null, 0, 1, PassengerConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerConstraint_MinTotalPassengerWeight(), ecorePackage.getEFloat(), "minTotalPassengerWeight", null, 0, 1, PassengerConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPassengerConstraint_IncludedFreePassengers(), this.getIncludedFreePassengerLimit(), null, "includedFreePassengers", null, 0, -1, PassengerConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPassengerConstraint_ExcludedPassengerCombinations(), this.getPassengerCombinationConstraint(), null, "excludedPassengerCombinations", null, 0, -1, PassengerConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerConstraint_DataDescription(), ecorePackage.getEString(), "dataDescription", null, 0, 1, PassengerConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(passengerCombinationConstraintEClass, PassengerCombinationConstraint.class, "PassengerCombinationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPassengerCombinationConstraint_MaxNumber(), ecorePackage.getEInt(), "maxNumber", null, 0, 1, PassengerCombinationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerCombinationConstraint_PassengerType(), this.getTravelerType(), "passengerType", null, 0, 1, PassengerCombinationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(includedFreePassengerLimitEClass, IncludedFreePassengerLimit.class, "IncludedFreePassengerLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIncludedFreePassengerLimit_Number(), ecorePackage.getEInt(), "number", null, 0, 1, IncludedFreePassengerLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncludedFreePassengerLimit_PassengerType(), this.getTravelerType(), "passengerType", null, 0, 1, IncludedFreePassengerLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(combinationConstraintsEClass, CombinationConstraints.class, "CombinationConstraints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCombinationConstraints_CombinationConstraints(), this.getCombinationConstraint(), null, "combinationConstraints", null, 0, -1, CombinationConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(combinationConstraintEClass, CombinationConstraint.class, "CombinationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCombinationConstraint_Id(), ecorePackage.getEString(), "id", null, 0, 1, CombinationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCombinationConstraint_DataDescription(), ecorePackage.getEString(), "dataDescription", null, 0, 1, CombinationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCombinationConstraint_CombinationModels(), this.getFareCombinationModel(), null, "combinationModels", null, 0, -1, CombinationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(travelValidityConstraintsEClass, TravelValidityConstraints.class, "TravelValidityConstraints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTravelValidityConstraints_TravelValidityConstraints(), this.getTravelValidityConstraint(), null, "travelValidityConstraints", null, 0, -1, TravelValidityConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(travelValidityConstraintEClass, TravelValidityConstraint.class, "TravelValidityConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTravelValidityConstraint_Id(), ecorePackage.getEString(), "id", null, 0, 1, TravelValidityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTravelValidityConstraint_DataDescription(), ecorePackage.getEString(), "dataDescription", null, 0, 1, TravelValidityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTravelValidityConstraint_ValidDays(), this.getCalendar(), null, "validDays", null, 0, 1, TravelValidityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTravelValidityConstraint_TravelDays(), ecorePackage.getEInt(), "travelDays", null, 0, 1, TravelValidityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTravelValidityConstraint_Range(), this.getValidityRange(), null, "range", null, 0, 1, TravelValidityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTravelValidityConstraint_ReturnConstraint(), this.getReturnValidityConstraint(), null, "returnConstraint", null, 0, 1, TravelValidityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTravelValidityConstraint_ExcludedTimeRange(), this.getExcludedTimeRange(), null, "excludedTimeRange", null, 0, -1, TravelValidityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(salesAvailabilityConstraintsEClass, SalesAvailabilityConstraints.class, "SalesAvailabilityConstraints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSalesAvailabilityConstraints_SalesAvailabilityConstraints(), this.getSalesAvailabilityConstraint(), null, "salesAvailabilityConstraints", null, 0, -1, SalesAvailabilityConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(salesAvailabilityConstraintEClass, SalesAvailabilityConstraint.class, "SalesAvailabilityConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSalesAvailabilityConstraint_Id(), ecorePackage.getEString(), "id", null, 0, 1, SalesAvailabilityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesAvailabilityConstraint_DataDescription(), ecorePackage.getEString(), "dataDescription", null, 0, 1, SalesAvailabilityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSalesAvailabilityConstraint_Restrictions(), this.getSalesRestriction(), null, "restrictions", null, 0, -1, SalesAvailabilityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesAvailabilityConstraint_DataSource(), this.getDataSource(), "dataSource", null, 0, 1, SalesAvailabilityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(salesRestrictionEClass, SalesRestriction.class, "SalesRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSalesRestriction_SalesDates(), this.getCalendar(), null, "salesDates", null, 0, 1, SalesRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSalesRestriction_StartOfSale(), this.getStartOfSale(), null, "startOfSale", null, 0, 1, SalesRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSalesRestriction_EndOfSale(), this.getEndOfSale(), null, "endOfSale", null, 0, 1, SalesRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endOfSaleEClass, EndOfSale.class, "EndOfSale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(startOfSaleEClass, StartOfSale.class, "StartOfSale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reductionCardsEClass, ReductionCards.class, "ReductionCards", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReductionCards_ReductionCards(), this.getReductionCard(), null, "reductionCards", null, 0, -1, ReductionCards.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reductionCardEClass, ReductionCard.class, "ReductionCard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReductionCard_Id(), ecorePackage.getEString(), "id", null, 0, 1, ReductionCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReductionCard_CardIssuer(), this.getCarrier(), null, "cardIssuer", null, 0, 1, ReductionCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReductionCard_Name(), this.getText(), null, "name", null, 0, 1, ReductionCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReductionCard_ServiceClasses(), this.getServiceClass(), null, "serviceClasses", null, 0, -1, ReductionCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReductionCard_IdRequiredForBooking(), ecorePackage.getEBoolean(), "idRequiredForBooking", "false", 0, 1, ReductionCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carrierConstraintsEClass, CarrierConstraints.class, "CarrierConstraints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCarrierConstraints_CarrierConstraints(), this.getCarrierConstraint(), null, "carrierConstraints", null, 0, -1, CarrierConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carrierConstraintEClass, CarrierConstraint.class, "CarrierConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCarrierConstraint_Id(), ecorePackage.getEString(), "id", null, 0, 1, CarrierConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCarrierConstraint_IncludedCarriers(), this.getCarrier(), null, "includedCarriers", null, 0, -1, CarrierConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCarrierConstraint_ExcludedCarriers(), this.getCarrier(), null, "excludedCarriers", null, 0, -1, CarrierConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarrierConstraint_DataDescription(), ecorePackage.getEString(), "dataDescription", null, 0, 1, CarrierConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceConstraintsEClass, ServiceConstraints.class, "ServiceConstraints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceConstraints_ServiceConstraints(), this.getServiceConstraint(), null, "serviceConstraints", null, 0, -1, ServiceConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceConstraintEClass, ServiceConstraint.class, "ServiceConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceConstraint_Id(), ecorePackage.getEString(), "id", null, 0, 1, ServiceConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceConstraint_IncludedServiceBrands(), this.getServiceBrand(), null, "includedServiceBrands", null, 0, -1, ServiceConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceConstraint_ExcludedServiceBrands(), this.getServiceBrand(), null, "excludedServiceBrands", null, 0, -1, ServiceConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceConstraint_DataDescription(), ecorePackage.getEString(), "dataDescription", null, 0, 1, ServiceConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regionalConstraintsEClass, RegionalConstraints.class, "RegionalConstraints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegionalConstraints_RegionalConstraints(), this.getRegionalConstraint(), null, "regionalConstraints", null, 0, -1, RegionalConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regionalConstraintEClass, RegionalConstraint.class, "RegionalConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegionalConstraint_Id(), ecorePackage.getEString(), "id", null, 0, 1, RegionalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegionalConstraint_Distance(), ecorePackage.getEFloat(), "distance", null, 0, 1, RegionalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegionalConstraint_EntryConnectionPoint(), this.getConnectionPoint(), null, "entryConnectionPoint", null, 0, 1, RegionalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegionalConstraint_ExitConnectionPoint(), this.getConnectionPoint(), null, "exitConnectionPoint", null, 0, 1, RegionalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegionalConstraint_RegionalValidity(), this.getRegionalValidity(), null, "regionalValidity", null, 0, -1, RegionalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegionalConstraint_DataSource(), this.getDataSource(), "dataSource", null, 0, 1, RegionalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegionalConstraint_DataDescription(), ecorePackage.getEString(), "dataDescription", null, 0, 1, RegionalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regionalValidityEClass, RegionalValidity.class, "RegionalValidity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegionalValidity_SeqNb(), ecorePackage.getEInt(), "seqNb", null, 0, 1, RegionalValidity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegionalValidity_ViaStation(), this.getViaStation(), null, "viaStation", null, 0, 1, RegionalValidity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegionalValidity_Zone(), this.getZone(), null, "zone", null, 0, 1, RegionalValidity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegionalValidity_Line(), this.getLine(), null, "line", null, 0, 1, RegionalValidity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegionalValidity_Polygone(), this.getPolygone(), null, "polygone", null, 0, 1, RegionalValidity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceLevelDefinitionsEClass, ServiceLevelDefinitions.class, "ServiceLevelDefinitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceLevelDefinitions_ServiceLevelDefinition(), this.getServiceLevel(), null, "serviceLevelDefinition", null, 0, -1, ServiceLevelDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textsEClass, Texts.class, "Texts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTexts_Texts(), this.getText(), null, "texts", null, 0, -1, Texts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getText_Id(), ecorePackage.getEString(), "id", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getText_TextUTF8(), ecorePackage.getEString(), "textUTF8", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getText_TextICAO(), ecorePackage.getEString(), "textICAO", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getText_ShortTextUTF8(), ecorePackage.getEString(), "shortTextUTF8", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getText_ShortTextICAO(), ecorePackage.getEString(), "shortTextICAO", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getText_Translations(), this.getTranslation(), null, "translations", null, 0, -1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(translationEClass, Translation.class, "Translation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTranslation_Language(), this.getLanguage(), null, "language", null, 0, 1, Translation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTranslation_TextUTF8(), ecorePackage.getEString(), "textUTF8", null, 0, 1, Translation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTranslation_TextICAO(), ecorePackage.getEString(), "textICAO", null, 0, 1, Translation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTranslation_ShortTextUTF8(), ecorePackage.getEString(), "shortTextUTF8", null, 0, 1, Translation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTranslation_ShortTextICAO(), ecorePackage.getEString(), "shortTextICAO", null, 0, 1, Translation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pricesEClass, Prices.class, "Prices", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrices_Prices(), this.getPrice(), null, "prices", null, 0, -1, Prices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(priceEClass, Price.class, "Price", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrice_Id(), ecorePackage.getEString(), "id", null, 0, 1, Price.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrice_Currencies(), this.getCurrencyPrice(), null, "currencies", null, 0, -1, Price.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrice_DataSource(), this.getDataSource(), "dataSource", null, 0, 1, Price.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vatDetailEClass, VATDetail.class, "VATDetail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVATDetail_Amount(), ecorePackage.getEFloat(), "amount", null, 0, 1, VATDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVATDetail_Percentage(), ecorePackage.getEFloat(), "percentage", null, 0, 1, VATDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVATDetail_Country(), this.getCountry(), null, "country", null, 1, 1, VATDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVATDetail_TaxId(), ecorePackage.getEString(), "taxId", null, 0, 1, VATDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVATDetail_Scope(), this.getTaxScope(), "scope", null, 0, 1, VATDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(currencyPriceEClass, CurrencyPrice.class, "CurrencyPrice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCurrencyPrice_Currency(), this.getCurrency(), null, "currency", null, 0, 1, CurrencyPrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrencyPrice_Amount(), ecorePackage.getEFloat(), "amount", null, 0, 1, CurrencyPrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurrencyPrice_VATdetails(), this.getVATDetail(), null, "VATdetails", null, 0, -1, CurrencyPrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceClassDefinitionsEClass, ServiceClassDefinitions.class, "ServiceClassDefinitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceClassDefinitions_ServiceClassDefinitions(), this.getServiceClass(), null, "serviceClassDefinitions", null, 0, -1, ServiceClassDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calendarsEClass, Calendars.class, "Calendars", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalendars_Calendars(), this.getCalendar(), null, "calendars", null, 0, -1, Calendars.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calendarEClass, Calendar.class, "Calendar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCalendar_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Calendar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalendar_Id(), ecorePackage.getEString(), "id", null, 0, 1, Calendar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalendar_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, Calendar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalendar_UntilDate(), ecorePackage.getEDate(), "untilDate", null, 0, 1, Calendar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalendar_UtcOffset(), ecorePackage.getEInt(), "utcOffset", null, 0, 1, Calendar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalendar_Dates(), ecorePackage.getEDate(), "dates", null, 0, -1, Calendar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalendar_DataSource(), this.getDataSource(), "dataSource", null, 0, 1, Calendar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reservationParametersEClass, ReservationParameters.class, "ReservationParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReservationParameters_ReservationParameters(), this.getReservationParameter(), null, "reservationParameters", null, 0, -1, ReservationParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reservationParameterEClass, ReservationParameter.class, "ReservationParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReservationParameter_MandatoryReservation(), ecorePackage.getEBoolean(), "mandatoryReservation", null, 0, 1, ReservationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservationParameter_Id(), ecorePackage.getEString(), "id", null, 0, 1, ReservationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReservationParameter_Params9181(), this.getReservationParams9181(), null, "params9181", null, 0, 1, ReservationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReservationParameter_Options(), this.getReservationOptions(), null, "options", null, 0, 1, ReservationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReservationParameter_MandatoryReservationForBrands(), this.getServiceBrand(), null, "mandatoryReservationForBrands", null, 0, -1, ReservationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservationParameter_MandatoryReservationsForMode(), this.getServiceMode(), "mandatoryReservationsForMode", null, 0, -1, ReservationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reservationParams9181EClass, ReservationParams9181.class, "ReservationParams9181", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReservationParams9181_TravelClass(), this.getReservationTravelClass(), "travelClass", null, 0, 1, ReservationParams9181.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservationParams9181_ServiceLevel(), this.getReservationServiceLevel(), "serviceLevel", null, 0, 1, ReservationParams9181.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservationParams9181_Service(), this.getReservationService(), "service", null, 0, 1, ReservationParams9181.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservationParams9181_BerthType(), this.getReservationBerthType(), "berthType", null, 0, 1, ReservationParams9181.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservationParams9181_CoachType(), ecorePackage.getEInt(), "coachType", null, 0, 1, ReservationParams9181.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservationParams9181_CompartmentType(), ecorePackage.getEInt(), "compartmentType", null, 0, 1, ReservationParams9181.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservationParams9181_Tariff(), ecorePackage.getEInt(), "tariff", null, 0, 1, ReservationParams9181.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reservationOptionsEClass, ReservationOptions.class, "ReservationOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReservationOptions_Preferences(), this.getReservationPreferenceGroup(), null, "preferences", null, 0, -1, ReservationOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReservationOptions_ServiceBrands(), this.getServiceBrand(), null, "serviceBrands", null, 0, -1, ReservationOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservationOptions_GraphicalReservation(), this.getGraphicalReservationType(), "graphicalReservation", null, 0, 1, ReservationOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reservationPreferenceGroupEClass, ReservationPreferenceGroup.class, "ReservationPreferenceGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReservationPreferenceGroup_Preference(), ecorePackage.getEString(), "preference", null, 0, -1, ReservationPreferenceGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservationPreferenceGroup_Group(), ecorePackage.getEString(), "group", null, 0, 1, ReservationPreferenceGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceClassEClass, ServiceClass.class, "ServiceClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceClass_Id(), this.getClassId(), "id", null, 0, 1, ServiceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceClass_ClassicClass(), this.getClassicClassType(), "classicClass", null, 0, 1, ServiceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceClass_Text(), this.getText(), null, "text", null, 0, 1, ServiceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceLevelEClass, ServiceLevel.class, "ServiceLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceLevel_Id(), ecorePackage.getEString(), "id", null, 0, 1, ServiceLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceLevel_Text(), this.getText(), null, "text", null, 0, 1, ServiceLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceLevel_CombiningServiceClasses(), this.getServiceClass(), null, "combiningServiceClasses", null, 0, -1, ServiceLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceLevel_ReservationParameter(), this.getReservationParameter(), null, "reservationParameter", null, 0, 1, ServiceLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceLevel_IncludesClassName(), ecorePackage.getEBoolean(), "includesClassName", null, 0, 1, ServiceLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeRangeEClass, TimeRange.class, "TimeRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeRange_Scope(), this.getTimeRangeScope(), "scope", null, 0, 1, TimeRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeRange_From(), ecorePackage.getEInt(), "from", null, 0, 1, TimeRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeRange_Until(), ecorePackage.getEInt(), "until", null, 0, 1, TimeRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(excludedTimeRangeEClass, ExcludedTimeRange.class, "ExcludedTimeRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(validityRangeEClass, ValidityRange.class, "ValidityRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValidityRange_Unit(), this.getTimeUnit(), "unit", null, 0, 1, ValidityRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValidityRange_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, ValidityRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValidityRange_HoursAfterMidnight(), ecorePackage.getEFloat(), "hoursAfterMidnight", null, 0, 1, ValidityRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relativeTimeEClass, RelativeTime.class, "RelativeTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelativeTime_Unit(), this.getTimeUnit(), "unit", null, 0, 1, RelativeTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelativeTime_Reference(), this.getTimeReferenceType(), "reference", null, 0, 1, RelativeTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelativeTime_Value(), ecorePackage.getEInt(), "value", null, 0, 1, RelativeTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnValidityConstraintEClass, ReturnValidityConstraint.class, "ReturnValidityConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReturnValidityConstraint_ExcludedWeekdays(), this.getWeekDay(), "excludedWeekdays", null, 0, -1, ReturnValidityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnValidityConstraint_LatestReturn(), ecorePackage.getEInt(), "latestReturn", null, 0, 1, ReturnValidityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnValidityConstraint_EarliestReturn(), ecorePackage.getEInt(), "earliestReturn", null, 0, 1, ReturnValidityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viaStationEClass, ViaStation.class, "ViaStation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViaStation_Station(), this.getStation(), null, "station", null, 0, 1, ViaStation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViaStation_Carrier(), this.getCarrier(), null, "carrier", null, 0, 1, ViaStation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViaStation_Route(), this.getRoute(), null, "route", null, 0, 1, ViaStation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViaStation_AlternativeRoutes(), this.getAlternativeRoute(), null, "alternativeRoutes", null, 0, -1, ViaStation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViaStation_DataDescription(), ecorePackage.getEString(), "dataDescription", null, 0, 1, ViaStation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViaStation_FareStationSet(), this.getFareStationSetDefinition(), null, "fareStationSet", null, 0, 1, ViaStation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getViaStation__GetDescription(), theXMLTypePackage.getString(), "getDescription", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(alternativeRouteEClass, AlternativeRoute.class, "AlternativeRoute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlternativeRoute_Stations(), this.getViaStation(), null, "stations", null, 0, -1, AlternativeRoute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routeEClass, Route.class, "Route", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoute_Stations(), this.getViaStation(), null, "stations", null, 0, -1, Route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zoneEClass, Zone.class, "Zone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZone_BinaryZoneId(), theXMLTypePackage.getBase64Binary(), "binaryZoneId", null, 0, 1, Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZone_ZoneId(), ecorePackage.getEString(), "zoneId", null, 0, -1, Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZone_City(), ecorePackage.getEInt(), "city", null, 0, 1, Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZone_Carrier(), this.getCarrier(), null, "carrier", null, 0, 1, Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZone_EntryStation(), this.getStation(), null, "entryStation", null, 0, 1, Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZone_TerminalStation(), this.getStation(), null, "terminalStation", null, 0, 1, Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZone_NutsCode(), this.getNutsCode(), null, "nutsCode", null, 0, 1, Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineEClass, Line.class, "Line", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLine_BinaryZoneId(), theXMLTypePackage.getBase64Binary(), "binaryZoneId", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLine_LineId(), ecorePackage.getEString(), "lineId", null, 0, -1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLine_Carrier(), this.getCarrier(), null, "carrier", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLine_EntryStation(), this.getStation(), null, "entryStation", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLine_TerminalStation(), this.getStation(), null, "terminalStation", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLine_NutsCode(), this.getNutsCode(), null, "nutsCode", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLine_City(), ecorePackage.getEInt(), "city", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(polygoneEClass, Polygone.class, "Polygone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolygone_Edge(), this.getEdge(), null, "edge", null, 0, -1, Polygone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeEClass, Edge.class, "Edge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEdge_System(), this.getGeoSystem(), "system", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdge_Accuracy(), ecorePackage.getEFloat(), "accuracy", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdge_Longitude(), ecorePackage.getEFloat(), "longitude", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdge_Latitude(), ecorePackage.getEFloat(), "latitude", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zoneDefinitionsEClass, ZoneDefinitions.class, "ZoneDefinitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZoneDefinitions_ZoneDefinition(), this.getZoneDefinition(), null, "zoneDefinition", null, 0, -1, ZoneDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zoneDefinitionEClass, ZoneDefinition.class, "ZoneDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZoneDefinition_Provider(), this.getCarrier(), null, "provider", null, 0, 1, ZoneDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZoneDefinition_ZoneId(), ecorePackage.getEString(), "zoneId", null, 0, 1, ZoneDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZoneDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, ZoneDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZoneDefinition_Polygone(), this.getPolygone(), null, "polygone", null, 0, 1, ZoneDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZoneDefinition_NameUtf8(), ecorePackage.getEString(), "nameUtf8", null, 0, 1, ZoneDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZoneDefinition_StationSet(), this.getStationSet(), null, "stationSet", null, 0, 1, ZoneDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZoneDefinition_NutsCodes(), this.getNutsCode(), null, "nutsCodes", null, 0, -1, ZoneDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carrierResourceLocationEClass, CarrierResourceLocation.class, "CarrierResourceLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCarrierResourceLocation_Carrier(), this.getCarrier(), null, "carrier", null, 1, 1, CarrierResourceLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCarrierResourceLocation_ServiceBrand(), this.getServiceBrand(), null, "serviceBrand", null, 0, 1, CarrierResourceLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCarrierResourceLocation_OnlineResources(), this.getOnlineResource(), null, "onlineResources", null, 0, -1, CarrierResourceLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(crossBorderConditionEClass, CrossBorderCondition.class, "CrossBorderCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCrossBorderCondition_FromCountry(), this.getCountry(), null, "fromCountry", null, 0, 1, CrossBorderCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrossBorderCondition_ToCountry(), this.getCountry(), null, "toCountry", null, 0, 1, CrossBorderCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrossBorderCondition_AffectedServiceBrands(), this.getServiceBrand(), null, "affectedServiceBrands", null, 0, -1, CrossBorderCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fareCombinationModelEClass, FareCombinationModel.class, "FareCombinationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFareCombinationModel_Model(), this.getCombinationModel(), "model", null, 0, 1, FareCombinationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareCombinationModel_CombinableCarriers(), this.getCarrier(), null, "combinableCarriers", null, 0, -1, FareCombinationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFareCombinationModel_OnlyWhenCombined(), ecorePackage.getEBoolean(), "onlyWhenCombined", null, 0, 1, FareCombinationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareCombinationModel_AllowedAllocators(), this.getCarrier(), null, "allowedAllocators", null, 0, -1, FareCombinationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFareCombinationModel_ReferenceCluster(), this.getClusters(), "referenceCluster", null, 0, 1, FareCombinationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFareCombinationModel_AllowedClusters(), this.getClusters(), "allowedClusters", null, 0, -1, FareCombinationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareCombinationModel_AllowedCommonContracts(), this.getCarrier(), null, "allowedCommonContracts", null, 0, -1, FareCombinationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reductionConstraintEClass, ReductionConstraint.class, "ReductionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReductionConstraint_Id(), ecorePackage.getEString(), "id", null, 0, 1, ReductionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReductionConstraint_RequiredReductionCards(), this.getRequiredReductionCard(), null, "requiredReductionCards", null, 0, -1, ReductionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredReductionCardEClass, RequiredReductionCard.class, "RequiredReductionCard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredReductionCard_CardClass(), this.getServiceClass(), null, "cardClass", null, 0, 1, RequiredReductionCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequiredReductionCard_Card(), this.getReductionCard(), null, "card", null, 0, 1, RequiredReductionCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequiredReductionCard_Name(), ecorePackage.getEString(), "name", null, 0, 1, RequiredReductionCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conversionFromLegacyEClass, ConversionFromLegacy.class, "ConversionFromLegacy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConversionFromLegacy_Legacy108(), this.getLegacy108(), null, "legacy108", null, 1, 1, ConversionFromLegacy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConversionFromLegacy_Params(), this.getConversionParams(), null, "params", null, 1, 1, ConversionFromLegacy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conversionParamsEClass, ConversionParams.class, "ConversionParams", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConversionParams_TaxId(), ecorePackage.getEString(), "TaxId", null, 0, 1, ConversionParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConversionParams_VATpercentage(), ecorePackage.getEFloat(), "VATpercentage", null, 0, 1, ConversionParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConversionParams_Country(), this.getCountry(), null, "country", null, 0, 1, ConversionParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConversionParams_LegacyBorderPointMappings(), this.getLegacyBoderPointMappings(), null, "legacyBorderPointMappings", null, 0, 1, ConversionParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConversionParams_LegacyStationMappings(), this.getLegacyStationMappings(), null, "legacyStationMappings", null, 0, 1, ConversionParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConversionParams_LegacyFareTemplates(), this.getLegacyFareTemplates(), null, "legacyFareTemplates", null, 0, 1, ConversionParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConversionParams_LegacyFareStationMappings(), this.getLegacyFareStationSetMappings(), null, "legacyFareStationMappings", null, 0, 1, ConversionParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConversionParams_LegacyStationToServiceBrandMappings(), this.getLegacyStationToServiceConstraintMappings(), null, "legacyStationToServiceBrandMappings", null, 0, 1, ConversionParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConversionParams_LegacyStationToFareDetailMappings(), this.getLegacyFareDetailMaps(), null, "legacyStationToFareDetailMappings", null, 0, 1, ConversionParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConversionParams_EndOfSale(), this.getEndOfSale(), null, "endOfSale", null, 0, 1, ConversionParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConversionParams_StartOfSale(), this.getEndOfSale(), null, "StartOfSale", null, 0, 1, ConversionParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConversionParams_StationImportFilter(), ecorePackage.getEString(), "stationImportFilter", null, 0, 1, ConversionParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConversionParams_ConvertFareDescriptions(), ecorePackage.getEBoolean(), "convertFareDescriptions", null, 0, 1, ConversionParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConversionParams_ConvertServiceConstraints(), ecorePackage.getEBoolean(), "convertServiceConstraints", null, 0, 1, ConversionParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fareTemplateEClass, FareTemplate.class, "FareTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFareTemplate_PriceFactor(), theXMLTypePackage.getFloat(), "priceFactor", null, 0, 1, FareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareTemplate_Price(), this.getPrice(), null, "price", null, 0, 1, FareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFareTemplate_Id(), ecorePackage.getEString(), "id", null, 0, 1, FareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFareTemplate_Type(), this.getFareType(), "type", null, 0, 1, FareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareTemplate_AfterSalesTemplate(), this.getAfterSalesTemplate(), null, "afterSalesTemplate", null, 0, -1, FareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFareTemplate_DataDescription(), ecorePackage.getEString(), "dataDescription", null, 0, 1, FareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareTemplate_Text(), this.getText(), null, "text", null, 0, 1, FareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareTemplate_RegionalConstraint(), this.getRegionalConstraint(), null, "regionalConstraint", null, 0, 1, FareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareTemplate_ServiceConstraint(), this.getServiceConstraint(), null, "serviceConstraint", null, 0, 1, FareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareTemplate_CarrierConstraint(), this.getCarrierConstraint(), null, "carrierConstraint", null, 0, 1, FareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareTemplate_ServiceClass(), this.getServiceClass(), null, "serviceClass", null, 0, 1, FareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareTemplate_ServiceLevel(), this.getServiceLevel(), null, "serviceLevel", null, 0, 1, FareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareTemplate_SalesAvailability(), this.getSalesAvailabilityConstraint(), null, "salesAvailability", null, 0, 1, FareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareTemplate_TravelValidity(), this.getTravelValidityConstraint(), null, "travelValidity", null, 0, 1, FareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareTemplate_CombinationConstraint(), this.getCombinationConstraint(), null, "combinationConstraint", null, 0, 1, FareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareTemplate_SeparateContractCombinationConstraint(), this.getCombinationConstraint(), null, "separateContractCombinationConstraint", null, 0, 1, FareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareTemplate_FareDetailDescription(), this.getText(), null, "fareDetailDescription", null, 0, 1, FareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareTemplate_LegacyAccountingIdentifier(), this.getLegacyAccountingIdentifier(), null, "legacyAccountingIdentifier", null, 0, 1, FareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareTemplate_PersonalDataConstraint(), this.getPersonalDataConstraint(), null, "personalDataConstraint", null, 0, 1, FareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareTemplate_ReservationParameter(), this.getReservationParameter(), null, "reservationParameter", null, 0, 1, FareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareTemplate_ReductionConstraint(), this.getReductionConstraint(), null, "reductionConstraint", null, 0, 1, FareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareTemplate_FulfillmentConstraint(), this.getFulfillmentConstraint(), null, "fulfillmentConstraint", null, 0, 1, FareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareTemplate_PassengerConstraint(), this.getPassengerConstraint(), null, "passengerConstraint", null, 0, 1, FareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFareTemplate_LegacyConversion(), this.getLegacyConversionType(), "legacyConversion", null, 0, 1, FareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFareTemplate_IndividualContracts(), ecorePackage.getEBoolean(), "individualContracts", "false", 0, 1, FareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFareTemplate_RegulatoryConditions(), this.getRegulatoryCondition(), "regulatoryConditions", null, 0, -1, FareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(afterSalesTemplateEClass, AfterSalesTemplate.class, "AfterSalesTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAfterSalesTemplate_TransactionType(), this.getAfterSalesTransactionType(), "transactionType", null, 0, 1, AfterSalesTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAfterSalesTemplate_CarrierFee(), ecorePackage.getEBoolean(), "carrierFee", "false", 0, 1, AfterSalesTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAfterSalesTemplate_ApplicationTime(), this.getApplicationTime(), null, "applicationTime", null, 0, 1, AfterSalesTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAfterSalesTemplate_FeeFactor(), ecorePackage.getEFloat(), "feeFactor", null, 0, 1, AfterSalesTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacyStationToServiceConstraintMappingsEClass, LegacyStationToServiceConstraintMappings.class, "LegacyStationToServiceConstraintMappings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLegacyStationToServiceConstraintMappings_LegacyStationToServiceBrandMappings(), this.getLegacyStationToServiceConstraintMapping(), null, "legacyStationToServiceBrandMappings", null, 0, -1, LegacyStationToServiceConstraintMappings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getLegacyStationToServiceConstraintMappings__FindServiceConstraint__int(), this.getServiceConstraint(), "findServiceConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "stationCode", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(legacyBorderPointEClass, LegacyBorderPoint.class, "LegacyBorderPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegacyBorderPoint_BorderPointCode(), ecorePackage.getEInt(), "borderPointCode", null, 0, 1, LegacyBorderPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegacyBorderPoint_FakeBorderStations(), this.getLegacyFakeBorderStations(), null, "fakeBorderStations", null, 0, 1, LegacyBorderPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegacyBorderPoint_OnBorderStations(), this.getOnBorderStations(), null, "onBorderStations", null, 0, 1, LegacyBorderPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegacyBorderPoint_BorderSides(), this.getLegacyBorderSide(), null, "borderSides", null, 0, -1, LegacyBorderPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onBorderStationsEClass, OnBorderStations.class, "OnBorderStations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOnBorderStations_Stations(), this.getStationSet(), null, "stations", null, 0, 1, OnBorderStations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacyFakeBorderStationsEClass, LegacyFakeBorderStations.class, "LegacyFakeBorderStations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLegacyFakeBorderStations_Stations(), this.getStationSet(), null, "stations", null, 0, 1, LegacyFakeBorderStations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacyBorderSideEClass, LegacyBorderSide.class, "LegacyBorderSide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLegacyBorderSide_Carrier(), this.getCarrier(), null, "carrier", null, 0, 1, LegacyBorderSide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegacyBorderSide_Stations(), this.getStationSet(), null, "stations", null, 0, 1, LegacyBorderSide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacyBorderSide_LegacyStationCode(), ecorePackage.getEInt(), "legacyStationCode", null, 0, 1, LegacyBorderSide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacyBorderPointsEClass, LegacyBorderPoints.class, "LegacyBorderPoints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLegacyBorderPoints_LegacyBorderPoints(), this.getLegacyBorderPoint(), null, "legacyBorderPoints", null, 0, -1, LegacyBorderPoints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacyStationToServiceConstraintMappingEClass, LegacyStationToServiceConstraintMapping.class, "LegacyStationToServiceConstraintMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegacyStationToServiceConstraintMapping_Code(), ecorePackage.getEInt(), "code", null, 0, 1, LegacyStationToServiceConstraintMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegacyStationToServiceConstraintMapping_ServiceConstraint(), this.getServiceConstraint(), null, "serviceConstraint", null, 0, 1, LegacyStationToServiceConstraintMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacyStationToServiceConstraintMapping_Description(), ecorePackage.getEString(), "description", null, 0, 1, LegacyStationToServiceConstraintMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacyStationMappingsEClass, LegacyStationMappings.class, "LegacyStationMappings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLegacyStationMappings_StationMappings(), this.getLegacyStationMap(), null, "stationMappings", null, 0, -1, LegacyStationMappings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getLegacyStationMappings__FindMappedStation__int(), this.getStation(), "findMappedStation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getInt(), "stationcode", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(legacyStationMapEClass, LegacyStationMap.class, "LegacyStationMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegacyStationMap_LegacyCode(), ecorePackage.getEInt(), "legacyCode", null, 0, 1, LegacyStationMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegacyStationMap_Station(), this.getStation(), null, "station", null, 0, 1, LegacyStationMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacyStationMap_DataSource(), this.getDataSource(), "dataSource", null, 0, 1, LegacyStationMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacyFareDetailMapsEClass, LegacyFareDetailMaps.class, "LegacyFareDetailMaps", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLegacyFareDetailMaps_LegacyFareDetailMaps(), this.getLegacyFareDetailMap(), null, "legacyFareDetailMaps", null, 0, -1, LegacyFareDetailMaps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacyFareDetailMapEClass, LegacyFareDetailMap.class, "LegacyFareDetailMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegacyFareDetailMap_LegacyCode(), ecorePackage.getEInt(), "legacyCode", null, 0, 1, LegacyFareDetailMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegacyFareDetailMap_FareDetailDescription(), this.getText(), null, "fareDetailDescription", null, 0, 1, LegacyFareDetailMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacyFareDetailMap_FareDetailMappingType(), this.getStationFareDetailType(), "fareDetailMappingType", null, 0, 1, LegacyFareDetailMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacyStationEClass, LegacyStation.class, "LegacyStation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegacyStation_Code(), theXMLTypePackage.getInt(), "code", null, 1, 1, LegacyStation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacyStation_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, LegacyStation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacyBoderPointMappingsEClass, LegacyBoderPointMappings.class, "LegacyBoderPointMappings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLegacyBoderPointMappings_BorderPoints(), this.getLegacyBorderPointMapping(), null, "borderPoints", null, 0, -1, LegacyBoderPointMappings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getLegacyBoderPointMappings__GetMappingByBorderPointCode__int(), this.getLegacyBorderPointMapping(), "getMappingByBorderPointCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getInt(), "borderPointCode", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(legacyBorderPointMappingEClass, LegacyBorderPointMapping.class, "LegacyBorderPointMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegacyBorderPointMapping_Code(), theXMLTypePackage.getInt(), "code", null, 1, 1, LegacyBorderPointMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacyBorderPointMapping_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, LegacyBorderPointMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegacyBorderPointMapping_Station(), this.getStation(), null, "station", null, 0, 1, LegacyBorderPointMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegacyBorderPointMapping_ConnectionPoint(), this.getConnectionPoint(), null, "connectionPoint", null, 0, 1, LegacyBorderPointMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacyFareStationSetMappingsEClass, LegacyFareStationSetMappings.class, "LegacyFareStationSetMappings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLegacyFareStationSetMappings_LegacyFareStationSetMap(), this.getLegacyFareStationSetMap(), null, "legacyFareStationSetMap", null, 0, -1, LegacyFareStationSetMappings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacyFareStationSetMapEClass, LegacyFareStationSetMap.class, "LegacyFareStationSetMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegacyFareStationSetMap_LegacyCode(), ecorePackage.getEInt(), "legacyCode", null, 0, 1, LegacyFareStationSetMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegacyFareStationSetMap_StationSet(), this.getFareStationSetDefinition(), null, "stationSet", null, 0, 1, LegacyFareStationSetMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacy108EClass, Legacy108.class, "Legacy108", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegacy108_CharacterSet(), this.getCharacterSet(), "characterSet", null, 0, 1, Legacy108.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegacy108_LegacySeriesList(), this.getLegacySeriesList(), null, "legacySeriesList", null, 0, 1, Legacy108.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegacy108_LegacySeparateContractSeries(), this.getLegacySeparateContractSeriesList(), null, "legacySeparateContractSeries", null, 0, 1, Legacy108.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegacy108_LegacyDistanceFares(), this.getLegacyDistanceFares(), null, "legacyDistanceFares", null, 0, 1, Legacy108.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegacy108_LegacyRouteFares(), this.getLegacyRouteFares(), null, "legacyRouteFares", null, 0, 1, Legacy108.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegacy108_LegacyStations(), this.getLegacy108Stations(), null, "legacyStations", null, 0, 1, Legacy108.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegacy108_LegacyFareDescriptions(), this.getLegacy108FaresDescriptions(), null, "legacyFareDescriptions", null, 0, 1, Legacy108.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacy108_TimeZone(), this.getTimeZone(), "timeZone", null, 0, 1, Legacy108.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegacy108_Carrier(), this.getCarrier(), null, "carrier", null, 0, 1, Legacy108.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacy108_StartDate(), ecorePackage.getEDate(), "startDate", null, 0, 1, Legacy108.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacy108_EndDate(), ecorePackage.getEDate(), "endDate", null, 0, 1, Legacy108.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegacy108_LegacyBorderPoints(), this.getLegacyBorderPoints(), null, "legacyBorderPoints", null, 0, 1, Legacy108.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacy108FareDescriptionEClass, Legacy108FareDescription.class, "Legacy108FareDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegacy108FareDescription_TableId(), ecorePackage.getEInt(), "tableId", null, 0, 1, Legacy108FareDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacy108FareDescription_DescriptionFr(), ecorePackage.getEString(), "descriptionFr", null, 0, 1, Legacy108FareDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacy108FareDescription_DescriptionGe(), ecorePackage.getEString(), "descriptionGe", null, 0, 1, Legacy108FareDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacy108FareDescription_DescriptionEn(), ecorePackage.getEString(), "descriptionEn", null, 0, 1, Legacy108FareDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacy108FareDescription_DescriptionLocal(), ecorePackage.getEString(), "descriptionLocal", null, 0, 1, Legacy108FareDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacy108FareDescription_CalculationType(), this.getLegacyCalculationType(), "calculationType", null, 0, 1, Legacy108FareDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacy108FaresDescriptionsEClass, Legacy108FaresDescriptions.class, "Legacy108FaresDescriptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLegacy108FaresDescriptions_LegacyFares(), this.getLegacy108FareDescription(), null, "legacyFares", null, 0, -1, Legacy108FaresDescriptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacy108StationsEClass, Legacy108Stations.class, "Legacy108Stations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLegacy108Stations_LegacyStations(), this.getLegacy108Station(), null, "legacyStations", null, 0, -1, Legacy108Stations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getLegacy108Stations__FindStation__int(), this.getLegacy108Station(), "findStation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getInt(), "code", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLegacy108Stations__FindByBorderPoint__int(), this.getLegacy108Station(), "findByBorderPoint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getInt(), "code", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(legacy108StationEClass, Legacy108Station.class, "Legacy108Station", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegacy108Station_Name(), ecorePackage.getEString(), "name", null, 0, 1, Legacy108Station.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacy108Station_BorderPointCode(), ecorePackage.getEInt(), "borderPointCode", null, 0, 1, Legacy108Station.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacy108Station_NameUTF8(), ecorePackage.getEString(), "nameUTF8", null, 0, 1, Legacy108Station.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacy108Station_StationCode(), ecorePackage.getEInt(), "stationCode", null, 0, 1, Legacy108Station.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacy108Station_FareReferenceStationCode(), ecorePackage.getEInt(), "fareReferenceStationCode", null, 0, 1, Legacy108Station.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacy108Station_ShortName(), ecorePackage.getEString(), "shortName", null, 0, 1, Legacy108Station.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacyRouteFaresEClass, LegacyRouteFares.class, "LegacyRouteFares", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLegacyRouteFares_RouteFare(), this.getLegacyRouteFare(), null, "routeFare", null, 0, -1, LegacyRouteFares.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacyRouteFareEClass, LegacyRouteFare.class, "LegacyRouteFare", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegacyRouteFare_FareTableNumber(), ecorePackage.getEInt(), "fareTableNumber", null, 0, 1, LegacyRouteFare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacyRouteFare_SeriesNumber(), theXMLTypePackage.getInt(), "seriesNumber", null, 1, 1, LegacyRouteFare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacyRouteFare_Fare2nd(), theXMLTypePackage.getInt(), "fare2nd", null, 1, 1, LegacyRouteFare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacyRouteFare_Fare1st(), theXMLTypePackage.getInt(), "fare1st", null, 1, 1, LegacyRouteFare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacyRouteFare_ReturnFare1st(), ecorePackage.getEInt(), "returnFare1st", null, 0, 1, LegacyRouteFare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacyRouteFare_ReturnFare2nd(), ecorePackage.getEInt(), "returnFare2nd", null, 0, 1, LegacyRouteFare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacyRouteFare_ValidFrom(), ecorePackage.getEDate(), "validFrom", null, 0, 1, LegacyRouteFare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacyRouteFare_ValidUntil(), ecorePackage.getEDate(), "validUntil", null, 0, 1, LegacyRouteFare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegacyRouteFare_Series(), this.getLegacySeries(), null, "series", null, 0, 1, LegacyRouteFare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacySeriesListEClass, LegacySeriesList.class, "LegacySeriesList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLegacySeriesList_Series(), this.getLegacySeries(), null, "series", null, 0, -1, LegacySeriesList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacySeriesEClass, LegacySeries.class, "LegacySeries", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegacySeries_SupplyingCarrierCode(), ecorePackage.getEString(), "supplyingCarrierCode", null, 0, 1, LegacySeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacySeries_Number(), ecorePackage.getEInt(), "number", null, 0, 1, LegacySeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacySeries_FareTableNumber(), ecorePackage.getEInt(), "fareTableNumber", null, 0, 1, LegacySeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacySeries_Type(), this.getLegacySeriesType(), "type", null, 0, 1, LegacySeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacySeries_FromStation(), ecorePackage.getEInt(), "fromStation", null, 0, 1, LegacySeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacySeries_FromStationName(), ecorePackage.getEString(), "fromStationName", null, 0, 1, LegacySeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacySeries_ToStation(), ecorePackage.getEInt(), "toStation", null, 0, 1, LegacySeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacySeries_ToStationName(), ecorePackage.getEString(), "toStationName", null, 0, 1, LegacySeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacySeries_RouteNumber(), ecorePackage.getEInt(), "routeNumber", null, 0, 1, LegacySeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacySeries_CarrierCode(), ecorePackage.getEString(), "carrierCode", null, 0, 1, LegacySeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacySeries_RouteDescription(), ecorePackage.getEString(), "routeDescription", null, 0, 1, LegacySeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacySeries_Pricetype(), this.getLegacyCalculationType(), "pricetype", null, 1, 1, LegacySeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacySeries_Distance1(), ecorePackage.getEInt(), "distance1", null, 1, 1, LegacySeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacySeries_Distance2(), ecorePackage.getEInt(), "distance2", null, 0, 1, LegacySeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegacySeries_Viastations(), this.getLegacyViastation(), null, "viastations", null, 0, -1, LegacySeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacySeries_ValidFrom(), ecorePackage.getEDate(), "validFrom", null, 1, 1, LegacySeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacySeries_ValidUntil(), ecorePackage.getEDate(), "validUntil", null, 1, 1, LegacySeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacySeparateContractSeriesListEClass, LegacySeparateContractSeriesList.class, "LegacySeparateContractSeriesList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLegacySeparateContractSeriesList_SeparateContractSeries(), this.getLegacySeparateContractSeries(), null, "separateContractSeries", null, 0, -1, LegacySeparateContractSeriesList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacySeparateContractSeriesEClass, LegacySeparateContractSeries.class, "LegacySeparateContractSeries", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegacySeparateContractSeries_SeriesNumber(), ecorePackage.getEInt(), "seriesNumber", null, 0, 1, LegacySeparateContractSeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacySeparateContractSeries_ValidFrom(), ecorePackage.getEDate(), "validFrom", null, 1, 1, LegacySeparateContractSeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacySeparateContractSeries_ValidUntil(), ecorePackage.getEDate(), "validUntil", null, 1, 1, LegacySeparateContractSeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegacySeparateContractSeries_Series(), this.getLegacySeries(), null, "series", null, 0, 1, LegacySeparateContractSeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacyDistanceFaresEClass, LegacyDistanceFares.class, "LegacyDistanceFares", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLegacyDistanceFares_DistanceFare(), this.getLegacyDistanceFare(), null, "distanceFare", null, 0, -1, LegacyDistanceFares.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacyDistanceFareEClass, LegacyDistanceFare.class, "LegacyDistanceFare", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegacyDistanceFare_Distance(), theXMLTypePackage.getInt(), "distance", null, 1, 1, LegacyDistanceFare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacyDistanceFare_Fare2nd(), theXMLTypePackage.getInt(), "fare2nd", null, 1, 1, LegacyDistanceFare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacyDistanceFare_Fare1st(), theXMLTypePackage.getInt(), "fare1st", null, 1, 1, LegacyDistanceFare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacyDistanceFare_FareTableNumber(), ecorePackage.getEInt(), "fareTableNumber", null, 0, 1, LegacyDistanceFare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacyDistanceFare_ReturnFare1st(), ecorePackage.getEInt(), "returnFare1st", null, 0, 1, LegacyDistanceFare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacyDistanceFare_ReturnFare2nd(), ecorePackage.getEInt(), "returnFare2nd", null, 0, 1, LegacyDistanceFare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacyDistanceFare_ValidFrom(), ecorePackage.getEDate(), "validFrom", null, 0, 1, LegacyDistanceFare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacyDistanceFare_ValidUntil(), ecorePackage.getEDate(), "validUntil", null, 0, 1, LegacyDistanceFare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacyViastationEClass, LegacyViastation.class, "LegacyViastation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegacyViastation_Position(), theXMLTypePackage.getInt(), "position", null, 1, 1, LegacyViastation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacyViastation_Code(), theXMLTypePackage.getInt(), "code", null, 1, 1, LegacyViastation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacyViastation_Optional(), ecorePackage.getEBoolean(), "optional", "false", 0, 1, LegacyViastation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacyFareTemplatesEClass, LegacyFareTemplates.class, "LegacyFareTemplates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLegacyFareTemplates_FareTemplates(), this.getFareTemplate(), null, "fareTemplates", null, 0, -1, LegacyFareTemplates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(stationRelationTypeEEnum, StationRelationType.class, "StationRelationType");
		addEEnumLiteral(stationRelationTypeEEnum, StationRelationType.SAME_STATION);
		addEEnumLiteral(stationRelationTypeEEnum, StationRelationType.PATH_CONNECTED_STATION);

		initEEnum(stationFareDetailTypeEEnum, StationFareDetailType.class, "StationFareDetailType");
		addEEnumLiteral(stationFareDetailTypeEEnum, StationFareDetailType.NO_DESCRIPTION);
		addEEnumLiteral(stationFareDetailTypeEEnum, StationFareDetailType.ON_ARRIVAL);
		addEEnumLiteral(stationFareDetailTypeEEnum, StationFareDetailType.ON_DEPARTURE);
		addEEnumLiteral(stationFareDetailTypeEEnum, StationFareDetailType.ON_ARRIVAL_ON_DEPARTURE);

		initEEnum(regulatoryConditionEEnum, RegulatoryCondition.class, "RegulatoryCondition");
		addEEnumLiteral(regulatoryConditionEEnum, RegulatoryCondition.CIV);
		addEEnumLiteral(regulatoryConditionEEnum, RegulatoryCondition.MC);
		addEEnumLiteral(regulatoryConditionEEnum, RegulatoryCondition.EU_PRR);

		initEEnum(afterSalesTransactionTypeEEnum, AfterSalesTransactionType.class, "AfterSalesTransactionType");
		addEEnumLiteral(afterSalesTransactionTypeEEnum, AfterSalesTransactionType.REFUND);
		addEEnumLiteral(afterSalesTransactionTypeEEnum, AfterSalesTransactionType.EXCHANGE);
		addEEnumLiteral(afterSalesTransactionTypeEEnum, AfterSalesTransactionType.EXCHANGE_KEEP_CARRIER);
		addEEnumLiteral(afterSalesTransactionTypeEEnum, AfterSalesTransactionType.EXCHANGE_CHANGE_CARRIER);

		initEEnum(barcodeTypesEEnum, BarcodeTypes.class, "BarcodeTypes");
		addEEnumLiteral(barcodeTypesEEnum, BarcodeTypes.FCB);
		addEEnumLiteral(barcodeTypesEEnum, BarcodeTypes.TLB);
		addEEnumLiteral(barcodeTypesEEnum, BarcodeTypes.SSB);

		initEEnum(classicClassTypeEEnum, ClassicClassType.class, "ClassicClassType");
		addEEnumLiteral(classicClassTypeEEnum, ClassicClassType.FIRST);
		addEEnumLiteral(classicClassTypeEEnum, ClassicClassType.SECOND);

		initEEnum(characterSetEEnum, CharacterSet.class, "CharacterSet");
		addEEnumLiteral(characterSetEEnum, CharacterSet.LATIN1_ISO88591);
		addEEnumLiteral(characterSetEEnum, CharacterSet.LATIN2_ISO88592);
		addEEnumLiteral(characterSetEEnum, CharacterSet.LATINGREEK_ISO88595);
		addEEnumLiteral(characterSetEEnum, CharacterSet.RUSSIAN_KOI8R);
		addEEnumLiteral(characterSetEEnum, CharacterSet.USASCII);
		addEEnumLiteral(characterSetEEnum, CharacterSet.UKRAINIAN_KOI8U);
		addEEnumLiteral(characterSetEEnum, CharacterSet.LATIN4_ISO88594);
		addEEnumLiteral(characterSetEEnum, CharacterSet.LATINKYRILLIC_ISO88595);
		addEEnumLiteral(characterSetEEnum, CharacterSet.LATIN5_ISO88599);
		addEEnumLiteral(characterSetEEnum, CharacterSet.LATIN7_ISO885913);
		addEEnumLiteral(characterSetEEnum, CharacterSet.LATIN9_ISO885915);

		initEEnum(clustersEEnum, Clusters.class, "Clusters");
		addEEnumLiteral(clustersEEnum, Clusters.BUSINESS);
		addEEnumLiteral(clustersEEnum, Clusters.FULLFLEX);
		addEEnumLiteral(clustersEEnum, Clusters.SEMIFLEX);
		addEEnumLiteral(clustersEEnum, Clusters.NONFLEX);
		addEEnumLiteral(clustersEEnum, Clusters.PROMO);

		initEEnum(combinationModelEEnum, CombinationModel.class, "CombinationModel");
		addEEnumLiteral(combinationModelEEnum, CombinationModel.SEPARATE_TICKET);
		addEEnumLiteral(combinationModelEEnum, CombinationModel.SEPARATE_CONTRACT);
		addEEnumLiteral(combinationModelEEnum, CombinationModel.CLUSTERING);
		addEEnumLiteral(combinationModelEEnum, CombinationModel.COMBINING);

		initEEnum(controlDataExchangeTypesEEnum, ControlDataExchangeTypes.class, "ControlDataExchangeTypes");
		addEEnumLiteral(controlDataExchangeTypesEEnum, ControlDataExchangeTypes.IRS90918_4PEER2PEER);
		addEEnumLiteral(controlDataExchangeTypesEEnum, ControlDataExchangeTypes.IRS90918_4REGISTRY);
		addEEnumLiteral(controlDataExchangeTypesEEnum, ControlDataExchangeTypes.PROPRIETARY);

		initEEnum(fareTypeEEnum, FareType.class, "FareType");
		addEEnumLiteral(fareTypeEEnum, FareType.NRT);
		addEEnumLiteral(fareTypeEEnum, FareType.IRT);
		addEEnumLiteral(fareTypeEEnum, FareType.RES);
		addEEnumLiteral(fareTypeEEnum, FareType.RPT);

		initEEnum(fulfillmentTypeEEnum, FulfillmentType.class, "FulfillmentType");
		addEEnumLiteral(fulfillmentTypeEEnum, FulfillmentType.SID);
		addEEnumLiteral(fulfillmentTypeEEnum, FulfillmentType.SIP);
		addEEnumLiteral(fulfillmentTypeEEnum, FulfillmentType.SIS);

		initEEnum(geoSystemEEnum, GeoSystem.class, "GeoSystem");
		addEEnumLiteral(geoSystemEEnum, GeoSystem.WGS84);
		addEEnumLiteral(geoSystemEEnum, GeoSystem.GRS80);

		initEEnum(geoUnitEEnum, GeoUnit.class, "GeoUnit");
		addEEnumLiteral(geoUnitEEnum, GeoUnit.MICRO_DEGREE);
		addEEnumLiteral(geoUnitEEnum, GeoUnit.TENTHMILLI_DEGREE);
		addEEnumLiteral(geoUnitEEnum, GeoUnit.MILLI_DEGREE);
		addEEnumLiteral(geoUnitEEnum, GeoUnit.CENTI_DEGREE);
		addEEnumLiteral(geoUnitEEnum, GeoUnit.DECI_DEGREE);

		initEEnum(graphicalReservationTypeEEnum, GraphicalReservationType.class, "GraphicalReservationType");
		addEEnumLiteral(graphicalReservationTypeEEnum, GraphicalReservationType.IRS90918_1);
		addEEnumLiteral(graphicalReservationTypeEEnum, GraphicalReservationType.GTM);
		addEEnumLiteral(graphicalReservationTypeEEnum, GraphicalReservationType.NONE);

		initEEnum(hemisphereEWEEnum, HemisphereEW.class, "HemisphereEW");
		addEEnumLiteral(hemisphereEWEEnum, HemisphereEW.EAST);
		addEEnumLiteral(hemisphereEWEEnum, HemisphereEW.WEST);

		initEEnum(hemisphereNSEEnum, HemisphereNS.class, "HemisphereNS");
		addEEnumLiteral(hemisphereNSEEnum, HemisphereNS.NORTH);
		addEEnumLiteral(hemisphereNSEEnum, HemisphereNS.SOUTH);

		initEEnum(interfaceTypeEEnum, InterfaceType.class, "InterfaceType");
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.IRS90918_1RESERVATION_BINARY);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.GTM);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.IRS90918_1RESERVATION_XML);

		initEEnum(legacyCalculationTypeEEnum, LegacyCalculationType.class, "LegacyCalculationType");
		addEEnumLiteral(legacyCalculationTypeEEnum, LegacyCalculationType.DISTANCE_BASED);
		addEEnumLiteral(legacyCalculationTypeEEnum, LegacyCalculationType.ROUTE_BASED);

		initEEnum(legacyPassengerTypeEEnum, LegacyPassengerType.class, "LegacyPassengerType");
		addEEnumLiteral(legacyPassengerTypeEEnum, LegacyPassengerType.ADULT);
		addEEnumLiteral(legacyPassengerTypeEEnum, LegacyPassengerType.CHILD);

		initEEnum(legacySeriesTypeEEnum, LegacySeriesType.class, "LegacySeriesType");
		addEEnumLiteral(legacySeriesTypeEEnum, LegacySeriesType.BORDER_DESTINATION);
		addEEnumLiteral(legacySeriesTypeEEnum, LegacySeriesType.TRANSIT);
		addEEnumLiteral(legacySeriesTypeEEnum, LegacySeriesType.STATION_STATION);

		initEEnum(legacyConversionTypeEEnum, LegacyConversionType.class, "LegacyConversionType");
		addEEnumLiteral(legacyConversionTypeEEnum, LegacyConversionType.NO);
		addEEnumLiteral(legacyConversionTypeEEnum, LegacyConversionType.YES);
		addEEnumLiteral(legacyConversionTypeEEnum, LegacyConversionType.ONLY);

		initEEnum(offerRequestTypeEEnum, OfferRequestType.class, "OfferRequestType");
		addEEnumLiteral(offerRequestTypeEEnum, OfferRequestType.POINT2POINT);
		addEEnumLiteral(offerRequestTypeEEnum, OfferRequestType.AREA);

		initEEnum(onlineServiceTypeEEnum, OnlineServiceType.class, "OnlineServiceType");
		addEEnumLiteral(onlineServiceTypeEEnum, OnlineServiceType.OFFER);
		addEEnumLiteral(onlineServiceTypeEEnum, OnlineServiceType.BOOKING);
		addEEnumLiteral(onlineServiceTypeEEnum, OnlineServiceType.RESERVATION_LEGACY_918_1);
		addEEnumLiteral(onlineServiceTypeEEnum, OnlineServiceType.RESERVATION_PREF);
		addEEnumLiteral(onlineServiceTypeEEnum, OnlineServiceType.RESERVATION_GRAPH);
		addEEnumLiteral(onlineServiceTypeEEnum, OnlineServiceType.INCREASE);
		addEEnumLiteral(onlineServiceTypeEEnum, OnlineServiceType.DECREASE);
		addEEnumLiteral(onlineServiceTypeEEnum, OnlineServiceType.EXCHANGE);
		addEEnumLiteral(onlineServiceTypeEEnum, OnlineServiceType.FULFILLMENT_ITEMS);
		addEEnumLiteral(onlineServiceTypeEEnum, OnlineServiceType.FULFILLMENT);

		initEEnum(personalDataItemsTypeEEnum, PersonalDataItemsType.class, "PersonalDataItemsType");
		addEEnumLiteral(personalDataItemsTypeEEnum, PersonalDataItemsType.DATE_OF_BIRTH);
		addEEnumLiteral(personalDataItemsTypeEEnum, PersonalDataItemsType.EMAIL);
		addEEnumLiteral(personalDataItemsTypeEEnum, PersonalDataItemsType.PHONE);
		addEEnumLiteral(personalDataItemsTypeEEnum, PersonalDataItemsType.FULL_NAME);
		addEEnumLiteral(personalDataItemsTypeEEnum, PersonalDataItemsType.LAST_NAME);
		addEEnumLiteral(personalDataItemsTypeEEnum, PersonalDataItemsType.LANGUAGE);
		addEEnumLiteral(personalDataItemsTypeEEnum, PersonalDataItemsType.TITLE);
		addEEnumLiteral(personalDataItemsTypeEEnum, PersonalDataItemsType.GENDER);
		addEEnumLiteral(personalDataItemsTypeEEnum, PersonalDataItemsType.DOC_TYPE);
		addEEnumLiteral(personalDataItemsTypeEEnum, PersonalDataItemsType.DOC_ID);
		addEEnumLiteral(personalDataItemsTypeEEnum, PersonalDataItemsType.DOC_NAME);
		addEEnumLiteral(personalDataItemsTypeEEnum, PersonalDataItemsType.DOC_CITY_OF_RESIDENCE);
		addEEnumLiteral(personalDataItemsTypeEEnum, PersonalDataItemsType.DOC_COUNTRY_OF_BIRTH);
		addEEnumLiteral(personalDataItemsTypeEEnum, PersonalDataItemsType.DOC_COUNTRY_OF_ISSUE);
		addEEnumLiteral(personalDataItemsTypeEEnum, PersonalDataItemsType.DOC_COUNTRY_OF_RESDENCE);
		addEEnumLiteral(personalDataItemsTypeEEnum, PersonalDataItemsType.DOC_DATE_OF_ISSUE);
		addEEnumLiteral(personalDataItemsTypeEEnum, PersonalDataItemsType.DOC_GENDER);
		addEEnumLiteral(personalDataItemsTypeEEnum, PersonalDataItemsType.DOC_NATIONALITY);
		addEEnumLiteral(personalDataItemsTypeEEnum, PersonalDataItemsType.DOC_LIMIT_OF_VALIDITY);
		addEEnumLiteral(personalDataItemsTypeEEnum, PersonalDataItemsType.DOC_CITY_OF_ISSUE);
		addEEnumLiteral(personalDataItemsTypeEEnum, PersonalDataItemsType.DOC_CITY_OF_BIRTH);
		addEEnumLiteral(personalDataItemsTypeEEnum, PersonalDataItemsType.DOC_TYPE_PASSPORT);
		addEEnumLiteral(personalDataItemsTypeEEnum, PersonalDataItemsType.CARD_ISSUER);
		addEEnumLiteral(personalDataItemsTypeEEnum, PersonalDataItemsType.CARD_NUMBER);

		initEEnum(personalDataTransferTypeEEnum, PersonalDataTransferType.class, "PersonalDataTransferType");
		addEEnumLiteral(personalDataTransferTypeEEnum, PersonalDataTransferType.SID);
		addEEnumLiteral(personalDataTransferTypeEEnum, PersonalDataTransferType.SIS_CONTROL);
		addEEnumLiteral(personalDataTransferTypeEEnum, PersonalDataTransferType.BOOKING);
		addEEnumLiteral(personalDataTransferTypeEEnum, PersonalDataTransferType.PRE_BOOKING);

		initEEnum(personalDataChangeReasonEEnum, PersonalDataChangeReason.class, "PersonalDataChangeReason");
		addEEnumLiteral(personalDataChangeReasonEEnum, PersonalDataChangeReason.IN_GENERAL);
		addEEnumLiteral(personalDataChangeReasonEEnum, PersonalDataChangeReason.MARRIAGE);
		addEEnumLiteral(personalDataChangeReasonEEnum, PersonalDataChangeReason.DOCUMENT_EXCHANGE);
		addEEnumLiteral(personalDataChangeReasonEEnum, PersonalDataChangeReason.AGENT_ERROR);

		initEEnum(reservationTravelClassEEnum, ReservationTravelClass.class, "ReservationTravelClass");
		addEEnumLiteral(reservationTravelClassEEnum, ReservationTravelClass.FIRST);
		addEEnumLiteral(reservationTravelClassEEnum, ReservationTravelClass.SECOND);
		addEEnumLiteral(reservationTravelClassEEnum, ReservationTravelClass.C);
		addEEnumLiteral(reservationTravelClassEEnum, ReservationTravelClass.P);
		addEEnumLiteral(reservationTravelClassEEnum, ReservationTravelClass.T);

		initEEnum(reservationServiceLevelEEnum, ReservationServiceLevel.class, "ReservationServiceLevel");
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.A);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.B);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.AH);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.AM);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.AR);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.AS);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.AV);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.AW);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.BC);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.BD);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.BE);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.BH);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.BN);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.BR);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.BS);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.C);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.D);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.DR);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.D2);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.D4);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.D5);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.D6);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.E);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.EX);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.F);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.G);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.G2);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.H);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.K);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.L);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.M);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.N);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.O);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.O3);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.O4);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.O5);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.O8);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.OB);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.OL);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.OS);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.OT);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.P);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.Q);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.R);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.S);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.SL);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.T);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.TL);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.U);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.W);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.X);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.Y);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.Z);

		initEEnum(reservationServiceEEnum, ReservationService.class, "ReservationService");
		addEEnumLiteral(reservationServiceEEnum, ReservationService.SEAT);
		addEEnumLiteral(reservationServiceEEnum, ReservationService.COUCHETTE);
		addEEnumLiteral(reservationServiceEEnum, ReservationService.BERTH);
		addEEnumLiteral(reservationServiceEEnum, ReservationService.CAR_CARRIAGE);

		initEEnum(reservationBerthTypeEEnum, ReservationBerthType.class, "ReservationBerthType");
		addEEnumLiteral(reservationBerthTypeEEnum, ReservationBerthType.SINGLE);
		addEEnumLiteral(reservationBerthTypeEEnum, ReservationBerthType.SPECIAL);
		addEEnumLiteral(reservationBerthTypeEEnum, ReservationBerthType.DOUBLE);
		addEEnumLiteral(reservationBerthTypeEEnum, ReservationBerthType.T2);
		addEEnumLiteral(reservationBerthTypeEEnum, ReservationBerthType.T3);
		addEEnumLiteral(reservationBerthTypeEEnum, ReservationBerthType.T4);

		initEEnum(schemaVersionEEnum, SchemaVersion.class, "SchemaVersion");
		addEEnumLiteral(schemaVersionEEnum, SchemaVersion.V10);
		addEEnumLiteral(schemaVersionEEnum, SchemaVersion.V00);

		initEEnum(timeZoneEEnum, TimeZone.class, "TimeZone");
		addEEnumLiteral(timeZoneEEnum, TimeZone.CET);
		addEEnumLiteral(timeZoneEEnum, TimeZone.GMT);
		addEEnumLiteral(timeZoneEEnum, TimeZone.EET);
		addEEnumLiteral(timeZoneEEnum, TimeZone.MST);
		addEEnumLiteral(timeZoneEEnum, TimeZone.WET);

		initEEnum(taxScopeEEnum, TaxScope.class, "TaxScope");
		addEEnumLiteral(taxScopeEEnum, TaxScope.INTERNALTIONAL);
		addEEnumLiteral(taxScopeEEnum, TaxScope.NATIONAL);
		addEEnumLiteral(taxScopeEEnum, TaxScope.SHORT_DISTANCE);
		addEEnumLiteral(taxScopeEEnum, TaxScope.LONG_DISTANCE);
		addEEnumLiteral(taxScopeEEnum, TaxScope.ANY);

		initEEnum(timeReferenceTypeEEnum, TimeReferenceType.class, "TimeReferenceType");
		addEEnumLiteral(timeReferenceTypeEEnum, TimeReferenceType.BEFORE_DEPARTURE);
		addEEnumLiteral(timeReferenceTypeEEnum, TimeReferenceType.AFTER_DEPARTURE);
		addEEnumLiteral(timeReferenceTypeEEnum, TimeReferenceType.BEFORE_VALIDITY);
		addEEnumLiteral(timeReferenceTypeEEnum, TimeReferenceType.BEFORE_START_VALIDITY);
		addEEnumLiteral(timeReferenceTypeEEnum, TimeReferenceType.AFTER_END_VALIDITY);

		initEEnum(timeRangeScopeEEnum, TimeRangeScope.class, "TimeRangeScope");
		addEEnumLiteral(timeRangeScopeEEnum, TimeRangeScope.START_OF_TRAVEL);
		addEEnumLiteral(timeRangeScopeEEnum, TimeRangeScope.COMPLETE_RANGE);

		initEEnum(timeUnitEEnum, TimeUnit.class, "TimeUnit");
		addEEnumLiteral(timeUnitEEnum, TimeUnit.DAY);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.HOUR);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.MINUTE);

		initEEnum(travelerTypeEEnum, TravelerType.class, "TravelerType");
		addEEnumLiteral(travelerTypeEEnum, TravelerType.ADULT);
		addEEnumLiteral(travelerTypeEEnum, TravelerType.CHILD);
		addEEnumLiteral(travelerTypeEEnum, TravelerType.YOUTH);
		addEEnumLiteral(travelerTypeEEnum, TravelerType.SENIOR);
		addEEnumLiteral(travelerTypeEEnum, TravelerType.FAMILY_CHILD);
		addEEnumLiteral(travelerTypeEEnum, TravelerType.YOUNG_CHILD);
		addEEnumLiteral(travelerTypeEEnum, TravelerType.DOG);
		addEEnumLiteral(travelerTypeEEnum, TravelerType.LUGGAGE);
		addEEnumLiteral(travelerTypeEEnum, TravelerType.ACCOMP_DOG);
		addEEnumLiteral(travelerTypeEEnum, TravelerType.PRM_CHILD);
		addEEnumLiteral(travelerTypeEEnum, TravelerType.ACCOMP_PRM);
		addEEnumLiteral(travelerTypeEEnum, TravelerType.CAR);
		addEEnumLiteral(travelerTypeEEnum, TravelerType.BICYCLE);
		addEEnumLiteral(travelerTypeEEnum, TravelerType.MOTOCYCLE);
		addEEnumLiteral(travelerTypeEEnum, TravelerType.TRAILER);
		addEEnumLiteral(travelerTypeEEnum, TravelerType.GRAPHICAL_RES);

		initEEnum(weekDayEEnum, WeekDay.class, "WeekDay");
		addEEnumLiteral(weekDayEEnum, WeekDay.MONDAY);
		addEEnumLiteral(weekDayEEnum, WeekDay.TUESDAY);
		addEEnumLiteral(weekDayEEnum, WeekDay.WEDNESDAY);
		addEEnumLiteral(weekDayEEnum, WeekDay.THURSDAY);
		addEEnumLiteral(weekDayEEnum, WeekDay.FRIDAY);
		addEEnumLiteral(weekDayEEnum, WeekDay.SATURDAY);
		addEEnumLiteral(weekDayEEnum, WeekDay.SUNDAY);

		initEEnum(dataSourceEEnum, DataSource.class, "DataSource");
		addEEnumLiteral(dataSourceEEnum, DataSource.MANUAL);
		addEEnumLiteral(dataSourceEEnum, DataSource.CONVERTED);
		addEEnumLiteral(dataSourceEEnum, DataSource.IMPORTED);
		addEEnumLiteral(dataSourceEEnum, DataSource.GENERATED);

		initEEnum(classIdEEnum, ClassId.class, "ClassId");
		addEEnumLiteral(classIdEEnum, ClassId.A);
		addEEnumLiteral(classIdEEnum, ClassId.B);
		addEEnumLiteral(classIdEEnum, ClassId.C);
		addEEnumLiteral(classIdEEnum, ClassId.D);

		initEEnum(genericReductionCardsEEnum, GenericReductionCards.class, "GenericReductionCards");
		addEEnumLiteral(genericReductionCardsEEnum, GenericReductionCards.UIC_EURAIL);
		addEEnumLiteral(genericReductionCardsEEnum, GenericReductionCards.UIC_INTERRAIL);
		addEEnumLiteral(genericReductionCardsEEnum, GenericReductionCards.UIC_FIP_DUTY);
		addEEnumLiteral(genericReductionCardsEEnum, GenericReductionCards.UIC_FIP_LEISURE_FREE);
		addEEnumLiteral(genericReductionCardsEEnum, GenericReductionCards.UIC_FIP_LEISURE_REDU);
		addEEnumLiteral(genericReductionCardsEEnum, GenericReductionCards.UIC_RAILPLUS);
		addEEnumLiteral(genericReductionCardsEEnum, GenericReductionCards.UIC_RIT_1);
		addEEnumLiteral(genericReductionCardsEEnum, GenericReductionCards.UIC_RIT_2);
		addEEnumLiteral(genericReductionCardsEEnum, GenericReductionCards.UIC_RIT_3);

		initEEnum(serviceModeEEnum, ServiceMode.class, "ServiceMode");
		addEEnumLiteral(serviceModeEEnum, ServiceMode.HIGH_SPEED_TRAIN);
		addEEnumLiteral(serviceModeEEnum, ServiceMode.HISTORIC_TRAIN);
		addEEnumLiteral(serviceModeEEnum, ServiceMode.INTERCITY);
		addEEnumLiteral(serviceModeEEnum, ServiceMode.REGIONAL);
		addEEnumLiteral(serviceModeEEnum, ServiceMode.INTERREGIONAL);
		addEEnumLiteral(serviceModeEEnum, ServiceMode.TRAIN);
		addEEnumLiteral(serviceModeEEnum, ServiceMode.URBAN);
		addEEnumLiteral(serviceModeEEnum, ServiceMode.TRAM);
		addEEnumLiteral(serviceModeEEnum, ServiceMode.UNDERGROUND);
		addEEnumLiteral(serviceModeEEnum, ServiceMode.NIGHT_TRAIN);
		addEEnumLiteral(serviceModeEEnum, ServiceMode.SHARED_TAXI);
		addEEnumLiteral(serviceModeEEnum, ServiceMode.MOTOR_RAIL);
		addEEnumLiteral(serviceModeEEnum, ServiceMode.MOUNTAIN_TRAIN);
		addEEnumLiteral(serviceModeEEnum, ServiceMode.PLANE);
		addEEnumLiteral(serviceModeEEnum, ServiceMode.COACH_GROUP);
		addEEnumLiteral(serviceModeEEnum, ServiceMode.SHIP);
		addEEnumLiteral(serviceModeEEnum, ServiceMode.BUS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (codeListsEClass,
		   source,
		   new String[] {
			   "constraints", "CARRIERS_MUST SERVICE_BRANDS_MUST STATIONS_MUST COUNTRIES_MUST CURRENCIES_MUST LANGUAGES_MUST"
		   });
		addAnnotation
		  (serviceBrandsEClass,
		   source,
		   new String[] {
			   "constraints", "AT_LEAST_ONE"
		   });
		addAnnotation
		  (countriesEClass,
		   source,
		   new String[] {
			   "constraints", "AT_LEAST_ONE"
		   });
		addAnnotation
		  (languagesEClass,
		   source,
		   new String[] {
			   "constraints", "AT_LEAST_ONE"
		   });
		addAnnotation
		  (currenciesEClass,
		   source,
		   new String[] {
			   "constraints", "AT_LEAST_ONE"
		   });
		addAnnotation
		  (stationsEClass,
		   source,
		   new String[] {
			   "constraints", "AT_LEAST_ONE"
		   });
		addAnnotation
		  (stationEClass,
		   source,
		   new String[] {
			   "constraints", "NAME_FORMAT NAME_CASE_UTF8_FORMAT NAME_CASE_ASCII_FORMAT SHORT_NAME_CASE_ASCII_FORMAT SHORT_NAME_CASE_UTF8_FORMAT TT_NAME_FORMAT LATITUDE_VALUE_RANGE LONGITUDE_VALUE_RANGE COUNTRY_MUST"
		   });
		addAnnotation
		  (carriersEClass,
		   source,
		   new String[] {
			   "constraints", "AT_LEAST_ONE"
		   });
		addAnnotation
		  (stationSetEClass,
		   source,
		   new String[] {
			   "constraints", "AT_LEAST_ONE"
		   });
		addAnnotation
		  (generalTariffModelEClass,
		   source,
		   new String[] {
			   "constraints", "DELIVERY_MUST FARE_MUST"
		   });
		addAnnotation
		  (deliveryEClass,
		   source,
		   new String[] {
			   "constraints", "CARRIER_MUST DELIVERY_ID_CHARACTERS VERSION_MUST ACCEPTED_VERSIONS_MUST"
		   });
		addAnnotation
		  (afterSalesRuleEClass,
		   source,
		   new String[] {
			   "constraints", "AT_LEAST_ONE"
		   });
		addAnnotation
		  (afterSalesConditionEClass,
		   source,
		   new String[] {
			   "constraints", "FEE_MUST"
		   });
		addAnnotation
		  (connectionPointEClass,
		   source,
		   new String[] {
			   "constraints", "NAME_FORMAT LEGACY_BORDER_POINT_MISSING STATION_SET_AT_LEAST_ONE NAME_UTF8_FORMAT"
		   });
		addAnnotation
		  (trainResourceLocationEClass,
		   source,
		   new String[] {
			   "constraints", "CARRIER_MUST AT_LEAST_ONE_ONLINE_RESOURCE"
		   });
		addAnnotation
		  (stationResourceLocationEClass,
		   source,
		   new String[] {
			   "constraints", "AT_LEAST_ONE_ONLINE_RESOURCE AT_LEAST_ONE_STATION_OR_CONNECTION_POINT"
		   });
		addAnnotation
		  (onlineResourceEClass,
		   source,
		   new String[] {
			   "constraints", "REQUEST_TYPE_MUST INTERFACE_TYPE_MUST SYSTEM_MUST"
		   });
		addAnnotation
		  (fulfillmentConstraintEClass,
		   source,
		   new String[] {
			   "constraints", "AT_LEAST_ONE_ACCEPTED_TYPE"
		   });
		addAnnotation
		  (requiredBarcodesEClass,
		   source,
		   new String[] {
			   "constraints", "AT_LEAST_ONE"
		   });
		addAnnotation
		  (acceptedBarcodesEClass,
		   source,
		   new String[] {
			   "constraints", "AT_LEAST_ONE"
		   });
		addAnnotation
		  (fareElementEClass,
		   source,
		   new String[] {
			   "constraints", "TYPE_MUST PRICE_MUST TEXT_MUST SERVICE_CLASS_MUST SALES_AVAILABILITY_MUST TRAVEL_VALIDITY_MUST COMBINATION_CONSTRAINT_MUST FULFILLMENT_CONSTRAINT_MUST PASSENGER_CONSTRAINT_MUST LEGACY_ACCOUNTING_MISSING CONVERSION_MISSING"
		   });
		addAnnotation
		  (fareStationSetDefinitionEClass,
		   source,
		   new String[] {
			   "constraints", "AT_LEAST_ONE_STATION LEGACY_CODE_MISSING CARRIER_MUST CODE_MUST NAME_FORMAT NAME_UTF8_FORMAT"
		   });
		addAnnotation
		  (legacyAccountingIdentifierEClass,
		   source,
		   new String[] {
			   "constraints", "SERIES_ID_MUST TARIFF_ID_MUST"
		   });
		addAnnotation
		  (personalDataConstraintEClass,
		   source,
		   new String[] {
			   "constraints", "AT_LEAST_ONE_REQUIRED_ITEM"
		   });
		addAnnotation
		  (requiredPersonalDataEClass,
		   source,
		   new String[] {
			   "constraints", "AT_LEAST_ONE_ITEM ADD_LEAST_ONE_TRANSFER"
		   });
		addAnnotation
		  (allowedPersonalDataChangesEClass,
		   source,
		   new String[] {
			   "constraints", "TIME_LIMIT_TOO_SHORT TIME_LIMIT_TOO_LONG"
		   });
		addAnnotation
		  (passengerConstraintEClass,
		   source,
		   new String[] {
			   "constraints", "TRAVELLER_TYPE_MUST"
		   });
		addAnnotation
		  (passengerCombinationConstraintEClass,
		   source,
		   new String[] {
			   "constraints", "NUMBER_AT_LEAST_ONE TRAVELLER_TYPE_MUST"
		   });
		addAnnotation
		  (includedFreePassengerLimitEClass,
		   source,
		   new String[] {
			   "constraints", "NUMBER_AT_LEAST_ONE TRAVELLER_TYPE_MUST"
		   });
		addAnnotation
		  (combinationConstraintEClass,
		   source,
		   new String[] {
			   "constraints", "AT_LEAST_ONE"
		   });
		addAnnotation
		  (travelValidityConstraintEClass,
		   source,
		   new String[] {
			   "constraints", "TRAVEL_DAYS_NOT_NULL WARNING_TRAVEL_DAYS_TOO_LONG"
		   });
		addAnnotation
		  (salesAvailabilityConstraintsEClass,
		   source,
		   new String[] {
			   "constraints", "AT_LEAST_ONE"
		   });
		addAnnotation
		  (salesAvailabilityConstraintEClass,
		   source,
		   new String[] {
			   "constraints", "AT_LEAST_ONE"
		   });
		addAnnotation
		  (salesRestrictionEClass,
		   source,
		   new String[] {
			   "constraints", "START_END_DATE_ORDER"
		   });
		addAnnotation
		  (reductionCardEClass,
		   source,
		   new String[] {
			   "constraints", "ISUER_MUST_FOR_NON_GENERIC"
		   });
		addAnnotation
		  (carrierConstraintEClass,
		   source,
		   new String[] {
			   "constraints", "INCLUDE_OR_EXCLUDE"
		   });
		addAnnotation
		  (serviceConstraintEClass,
		   source,
		   new String[] {
			   "constraints", "INCLUDE_OR_EXCLUDE"
		   });
		addAnnotation
		  (regionalConstraintEClass,
		   source,
		   new String[] {
			   "constraints", "AT_LEAST_ONE_REGIONAL_VALIDITY WARNING_DISTANCE_TOO_SHORT WARNING_DISTANCE_TOO_LONG"
		   });
		addAnnotation
		  (regionalValidityEClass,
		   source,
		   new String[] {
			   "constraints", "AT_LEAST_ONE_OF_VIA_ZONE_LINE_POLYGON"
		   });
		addAnnotation
		  (textEClass,
		   source,
		   new String[] {
			   "constraints", "FORMAT_TEXT FORMAT_TEXT_SHORT FORMAT_TEXT_UTF8 FORMAT_TEXT_SHORT_UTF8"
		   });
		addAnnotation
		  (translationEClass,
		   source,
		   new String[] {
			   "constraints", "LANGUAGE_MUST FORMAT_TEXT FORMAT_TEXT_SHORT FORMAT_TEXT_UTF8 FORMAT_TEXT_SHORT_UTF8"
		   });
		addAnnotation
		  (priceEClass,
		   source,
		   new String[] {
			   "constraints", "AT_LEAST_ONE_PRICE"
		   });
		addAnnotation
		  (vatDetailEClass,
		   source,
		   new String[] {
			   "constraints", "VALID_AMOUNT COUNTRY_MUST PERCENTAGE_VALUES"
		   });
		addAnnotation
		  (currencyPriceEClass,
		   source,
		   new String[] {
			   "constraints", "VAT_PLAUSIBILITY_CHECK CURRENCY_MUST AMOUNT_MUST"
		   });
		addAnnotation
		  (serviceClassDefinitionsEClass,
		   source,
		   new String[] {
			   "constraints", "AT_LEAST_ONE"
		   });
		addAnnotation
		  (calendarsEClass,
		   source,
		   new String[] {
			   "constraints", "AT_LEAST_ONE"
		   });
		addAnnotation
		  (calendarEClass,
		   source,
		   new String[] {
			   "constraints", "START_END_DATE_ORDER DATES_WITHIN_RANGE"
		   });
		addAnnotation
		  (reservationPreferenceGroupEClass,
		   source,
		   new String[] {
			   "constraints", "AT_LEAST_ONE_PREFERENCE GROUP_FORMAT"
		   });
		addAnnotation
		  (serviceClassEClass,
		   source,
		   new String[] {
			   "constraints", "TEXT_MUST CLASSIC_CLASS_MUST"
		   });
		addAnnotation
		  (serviceLevelEClass,
		   source,
		   new String[] {
			   "constraints", "TEXT_MUST ID_FORMAT"
		   });
		addAnnotation
		  (timeRangeEClass,
		   source,
		   new String[] {
			   "constraints", "FROM_TO_ORDER"
		   });
		addAnnotation
		  (validityRangeEClass,
		   source,
		   new String[] {
			   "constraints", "WARNING_TOO_LONG WARNING_TOO_SHORT"
		   });
		addAnnotation
		  (relativeTimeEClass,
		   source,
		   new String[] {
			   "constraints", "WARNING_TOO_LONG WARNING_TOO_SHORT"
		   });
		addAnnotation
		  (returnValidityConstraintEClass,
		   source,
		   new String[] {
			   "constraints", "EARLIEST_LAST_RETURN_ORDER"
		   });
		addAnnotation
		  (viaStationEClass,
		   source,
		   new String[] {
			   "constraints", "AT_LEAST_ONE_OBJECT_SET IF_ALTERNATIVE_ROUTES_AT_LEAST_TWO"
		   });
		addAnnotation
		  (alternativeRouteEClass,
		   source,
		   new String[] {
			   "constraints", "AT_LEAST_ONE_VIA"
		   });
		addAnnotation
		  (routeEClass,
		   source,
		   new String[] {
			   "constraints", "AT_LEAST_ONE_VIA"
		   });
		addAnnotation
		  (zoneEClass,
		   source,
		   new String[] {
			   "constraints", "CARRIER_MUST ONE_OF_ZONE_ID_NUTS_CITY"
		   });
		addAnnotation
		  (lineEClass,
		   source,
		   new String[] {
			   "constraints", "CARRIER_MUST"
		   });
		addAnnotation
		  (polygoneEClass,
		   source,
		   new String[] {
			   "constraints", "AT_LEAST_THREE_EDGES"
		   });
		addAnnotation
		  (edgeEClass,
		   source,
		   new String[] {
			   "constraints", "COORDINATE_LIMITS"
		   });
		addAnnotation
		  (zoneDefinitionEClass,
		   source,
		   new String[] {
			   "constraints", "CARRIER_MUST_BE_SET AT_LEAST_ONE_OF_SET_NUTS_POLYGON IF_STATION_SET_AT_LEAST_TWO_STATIONS"
		   });
		addAnnotation
		  (crossBorderConditionEClass,
		   source,
		   new String[] {
			   "constraints", "FROM_TO_COUNTRY_MUST"
		   });
		addAnnotation
		  (fareCombinationModelEClass,
		   source,
		   new String[] {
			   "constraints", "MODEL_MUST REFERENCE_CLUSTER_MUST"
		   });
		addAnnotation
		  (reductionConstraintEClass,
		   source,
		   new String[] {
			   "constraints", "AT_LEAST_ONE"
		   });
		addAnnotation
		  (requiredReductionCardEClass,
		   source,
		   new String[] {
			   "constraints", "NAME_FORMAT CARD_MUST"
		   });
		addAnnotation
		  (conversionParamsEClass,
		   source,
		   new String[] {
			   "constraints", "COUNTRY_MUST AT_LEAST_ONE_LEGACY_FARE_TEMPLATE"
		   });
		addAnnotation
		  (fareTemplateEClass,
		   source,
		   new String[] {
			   "constraints", "PRICE_FACTOR_MUST TYPE_MUST TRAVEL_VALIDITY_MUST COMBINATION_CONSTRAINT_MUST PASSENGER_CONSTRAINT_MUST FULFILMENT_CONSTRAINT_MUST LEGACY_CONVERSION_MUST SERVICE_CLASS_MUST PRICE_OR_FACTOR"
		   });
		addAnnotation
		  (legacyStationToServiceConstraintMappingEClass,
		   source,
		   new String[] {
			   "constraints", "SERVICE_CONSTRAINT_MUST CODE_NOT_NULL"
		   });
		addAnnotation
		  (legacyStationMapEClass,
		   source,
		   new String[] {
			   "constraints", "CODE_NOU_NULL STATION_MUST"
		   });
		addAnnotation
		  (legacyBorderPointMappingEClass,
		   source,
		   new String[] {
			   "constraints", "CODE_NOT_NULL CONNECTION_POINT_MUST"
		   });
		addAnnotation
		  (legacyFareStationSetMapEClass,
		   source,
		   new String[] {
			   "constraints", "CODE_NOT_NULL STATION_SET_MUST"
		   });
		addAnnotation
		  (legacy108EClass,
		   source,
		   new String[] {
			   "constraints", "CHARACTER_SET_MUST TIME_ZONE_MUST CARRIER_MUST"
		   });
	}

} //GtmPackageImpl
