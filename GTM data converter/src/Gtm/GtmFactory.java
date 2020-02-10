/**
 */
package Gtm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage
 * @generated
 */
public interface GtmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GtmFactory eINSTANCE = Gtm.impl.GtmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>GTM Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GTM Tool</em>'.
	 * @generated
	 */
	GTMTool createGTMTool();

	/**
	 * Returns a new object of class '<em>Code Lists</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Lists</em>'.
	 * @generated
	 */
	CodeLists createCodeLists();

	/**
	 * Returns a new object of class '<em>NUTS Codes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NUTS Codes</em>'.
	 * @generated
	 */
	NUTSCodes createNUTSCodes();

	/**
	 * Returns a new object of class '<em>Nuts Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nuts Code</em>'.
	 * @generated
	 */
	NutsCode createNutsCode();

	/**
	 * Returns a new object of class '<em>Service Brands</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Brands</em>'.
	 * @generated
	 */
	ServiceBrands createServiceBrands();

	/**
	 * Returns a new object of class '<em>Service Brand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Brand</em>'.
	 * @generated
	 */
	ServiceBrand createServiceBrand();

	/**
	 * Returns a new object of class '<em>Countries</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Countries</em>'.
	 * @generated
	 */
	Countries createCountries();

	/**
	 * Returns a new object of class '<em>Country</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Country</em>'.
	 * @generated
	 */
	Country createCountry();

	/**
	 * Returns a new object of class '<em>Languages</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Languages</em>'.
	 * @generated
	 */
	Languages createLanguages();

	/**
	 * Returns a new object of class '<em>Language</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language</em>'.
	 * @generated
	 */
	Language createLanguage();

	/**
	 * Returns a new object of class '<em>Currencies</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Currencies</em>'.
	 * @generated
	 */
	Currencies createCurrencies();

	/**
	 * Returns a new object of class '<em>Currency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Currency</em>'.
	 * @generated
	 */
	Currency createCurrency();

	/**
	 * Returns a new object of class '<em>Stations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stations</em>'.
	 * @generated
	 */
	Stations createStations();

	/**
	 * Returns a new object of class '<em>Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Station</em>'.
	 * @generated
	 */
	Station createStation();

	/**
	 * Returns a new object of class '<em>Carrier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carrier</em>'.
	 * @generated
	 */
	Carrier createCarrier();

	/**
	 * Returns a new object of class '<em>Carriers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carriers</em>'.
	 * @generated
	 */
	Carriers createCarriers();

	/**
	 * Returns a new object of class '<em>General Tariff Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Tariff Model</em>'.
	 * @generated
	 */
	GeneralTariffModel createGeneralTariffModel();

	/**
	 * Returns a new object of class '<em>Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delivery</em>'.
	 * @generated
	 */
	Delivery createDelivery();

	/**
	 * Returns a new object of class '<em>After Sales Rules</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>After Sales Rules</em>'.
	 * @generated
	 */
	AfterSalesRules createAfterSalesRules();

	/**
	 * Returns a new object of class '<em>After Sales Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>After Sales Rule</em>'.
	 * @generated
	 */
	AfterSalesRule createAfterSalesRule();

	/**
	 * Returns a new object of class '<em>After Sales Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>After Sales Condition</em>'.
	 * @generated
	 */
	AfterSalesCondition createAfterSalesCondition();

	/**
	 * Returns a new object of class '<em>Application Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Time</em>'.
	 * @generated
	 */
	ApplicationTime createApplicationTime();

	/**
	 * Returns a new object of class '<em>Fare Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fare Structure</em>'.
	 * @generated
	 */
	FareStructure createFareStructure();

	/**
	 * Returns a new object of class '<em>Connection Points</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Points</em>'.
	 * @generated
	 */
	ConnectionPoints createConnectionPoints();

	/**
	 * Returns a new object of class '<em>Connection Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Point</em>'.
	 * @generated
	 */
	ConnectionPoint createConnectionPoint();

	/**
	 * Returns a new object of class '<em>Station Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Station Set</em>'.
	 * @generated
	 */
	StationSet createStationSet();

	/**
	 * Returns a new object of class '<em>Fare Resource Locations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fare Resource Locations</em>'.
	 * @generated
	 */
	FareResourceLocations createFareResourceLocations();

	/**
	 * Returns a new object of class '<em>Train Resource Locations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Train Resource Locations</em>'.
	 * @generated
	 */
	TrainResourceLocations createTrainResourceLocations();

	/**
	 * Returns a new object of class '<em>Station Resource Locations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Station Resource Locations</em>'.
	 * @generated
	 */
	StationResourceLocations createStationResourceLocations();

	/**
	 * Returns a new object of class '<em>Carrier Resource Locations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carrier Resource Locations</em>'.
	 * @generated
	 */
	CarrierResourceLocations createCarrierResourceLocations();

	/**
	 * Returns a new object of class '<em>Train Resource Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Train Resource Location</em>'.
	 * @generated
	 */
	TrainResourceLocation createTrainResourceLocation();

	/**
	 * Returns a new object of class '<em>Station Resource Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Station Resource Location</em>'.
	 * @generated
	 */
	StationResourceLocation createStationResourceLocation();

	/**
	 * Returns a new object of class '<em>Online Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Online Resource</em>'.
	 * @generated
	 */
	OnlineResource createOnlineResource();

	/**
	 * Returns a new object of class '<em>Fulfillment Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fulfillment Constraints</em>'.
	 * @generated
	 */
	FulfillmentConstraints createFulfillmentConstraints();

	/**
	 * Returns a new object of class '<em>Supported Online Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supported Online Services</em>'.
	 * @generated
	 */
	SupportedOnlineServices createSupportedOnlineServices();

	/**
	 * Returns a new object of class '<em>Zone Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zone Definitions</em>'.
	 * @generated
	 */
	ZoneDefinitions createZoneDefinitions();

	/**
	 * Returns a new object of class '<em>Fare Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fare Element</em>'.
	 * @generated
	 */
	FareElement createFareElement();

	/**
	 * Returns a new object of class '<em>Legacy Accounting Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legacy Accounting Identifier</em>'.
	 * @generated
	 */
	LegacyAccountingIdentifier createLegacyAccountingIdentifier();

	/**
	 * Returns a new object of class '<em>Reduction Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reduction Constraints</em>'.
	 * @generated
	 */
	ReductionConstraints createReductionConstraints();

	/**
	 * Returns a new object of class '<em>Fare Elements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fare Elements</em>'.
	 * @generated
	 */
	FareElements createFareElements();

	/**
	 * Returns a new object of class '<em>Personal Data Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Personal Data Constraints</em>'.
	 * @generated
	 */
	PersonalDataConstraints createPersonalDataConstraints();

	/**
	 * Returns a new object of class '<em>Personal Data Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Personal Data Constraint</em>'.
	 * @generated
	 */
	PersonalDataConstraint createPersonalDataConstraint();

	/**
	 * Returns a new object of class '<em>Required Personal Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Personal Data</em>'.
	 * @generated
	 */
	RequiredPersonalData createRequiredPersonalData();

	/**
	 * Returns a new object of class '<em>Allowed Personal Data Changes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allowed Personal Data Changes</em>'.
	 * @generated
	 */
	AllowedPersonalDataChanges createAllowedPersonalDataChanges();

	/**
	 * Returns a new object of class '<em>Passenger Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Passenger Constraints</em>'.
	 * @generated
	 */
	PassengerConstraints createPassengerConstraints();

	/**
	 * Returns a new object of class '<em>Passenger Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Passenger Constraint</em>'.
	 * @generated
	 */
	PassengerConstraint createPassengerConstraint();

	/**
	 * Returns a new object of class '<em>Included Free Passengers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Included Free Passengers</em>'.
	 * @generated
	 */
	IncludedFreePassengers createIncludedFreePassengers();

	/**
	 * Returns a new object of class '<em>Passenger Combination Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Passenger Combination Constraint</em>'.
	 * @generated
	 */
	PassengerCombinationConstraint createPassengerCombinationConstraint();

	/**
	 * Returns a new object of class '<em>Combination Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Combination Constraints</em>'.
	 * @generated
	 */
	CombinationConstraints createCombinationConstraints();

	/**
	 * Returns a new object of class '<em>Combination Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Combination Constraint</em>'.
	 * @generated
	 */
	CombinationConstraint createCombinationConstraint();

	/**
	 * Returns a new object of class '<em>Travel Validity Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Travel Validity Constraints</em>'.
	 * @generated
	 */
	TravelValidityConstraints createTravelValidityConstraints();

	/**
	 * Returns a new object of class '<em>Travel Validity Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Travel Validity Constraint</em>'.
	 * @generated
	 */
	TravelValidityConstraint createTravelValidityConstraint();

	/**
	 * Returns a new object of class '<em>Sales Availability Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sales Availability Constraints</em>'.
	 * @generated
	 */
	SalesAvailabilityConstraints createSalesAvailabilityConstraints();

	/**
	 * Returns a new object of class '<em>Sales Availability Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sales Availability Constraint</em>'.
	 * @generated
	 */
	SalesAvailabilityConstraint createSalesAvailabilityConstraint();

	/**
	 * Returns a new object of class '<em>Sales Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sales Restriction</em>'.
	 * @generated
	 */
	SalesRestriction createSalesRestriction();

	/**
	 * Returns a new object of class '<em>End Of Sale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Of Sale</em>'.
	 * @generated
	 */
	EndOfSale createEndOfSale();

	/**
	 * Returns a new object of class '<em>Start Of Sale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Of Sale</em>'.
	 * @generated
	 */
	StartOfSale createStartOfSale();

	/**
	 * Returns a new object of class '<em>Reduction Cards</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reduction Cards</em>'.
	 * @generated
	 */
	ReductionCards createReductionCards();

	/**
	 * Returns a new object of class '<em>Reduction Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reduction Card</em>'.
	 * @generated
	 */
	ReductionCard createReductionCard();

	/**
	 * Returns a new object of class '<em>Carrier Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carrier Constraints</em>'.
	 * @generated
	 */
	CarrierConstraints createCarrierConstraints();

	/**
	 * Returns a new object of class '<em>Carrier Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carrier Constraint</em>'.
	 * @generated
	 */
	CarrierConstraint createCarrierConstraint();

	/**
	 * Returns a new object of class '<em>Service Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Constraints</em>'.
	 * @generated
	 */
	ServiceConstraints createServiceConstraints();

	/**
	 * Returns a new object of class '<em>Service Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Constraint</em>'.
	 * @generated
	 */
	ServiceConstraint createServiceConstraint();

	/**
	 * Returns a new object of class '<em>Regional Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regional Constraints</em>'.
	 * @generated
	 */
	RegionalConstraints createRegionalConstraints();

	/**
	 * Returns a new object of class '<em>Regional Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regional Constraint</em>'.
	 * @generated
	 */
	RegionalConstraint createRegionalConstraint();

	/**
	 * Returns a new object of class '<em>Regional Validity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regional Validity</em>'.
	 * @generated
	 */
	RegionalValidity createRegionalValidity();

	/**
	 * Returns a new object of class '<em>Service Level Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Level Definitions</em>'.
	 * @generated
	 */
	ServiceLevelDefinitions createServiceLevelDefinitions();

	/**
	 * Returns a new object of class '<em>Texts</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Texts</em>'.
	 * @generated
	 */
	Texts createTexts();

	/**
	 * Returns a new object of class '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text</em>'.
	 * @generated
	 */
	Text createText();

	/**
	 * Returns a new object of class '<em>Translation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Translation</em>'.
	 * @generated
	 */
	Translation createTranslation();

	/**
	 * Returns a new object of class '<em>Prices</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prices</em>'.
	 * @generated
	 */
	Prices createPrices();

	/**
	 * Returns a new object of class '<em>Price</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Price</em>'.
	 * @generated
	 */
	Price createPrice();

	/**
	 * Returns a new object of class '<em>VAT Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VAT Detail</em>'.
	 * @generated
	 */
	VATDetail createVATDetail();

	/**
	 * Returns a new object of class '<em>Currency Price</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Currency Price</em>'.
	 * @generated
	 */
	CurrencyPrice createCurrencyPrice();

	/**
	 * Returns a new object of class '<em>Service Class Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Class Definitions</em>'.
	 * @generated
	 */
	ServiceClassDefinitions createServiceClassDefinitions();

	/**
	 * Returns a new object of class '<em>Calendars</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calendars</em>'.
	 * @generated
	 */
	Calendars createCalendars();

	/**
	 * Returns a new object of class '<em>Calendar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calendar</em>'.
	 * @generated
	 */
	Calendar createCalendar();

	/**
	 * Returns a new object of class '<em>Reservation Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reservation Parameters</em>'.
	 * @generated
	 */
	ReservationParameters createReservationParameters();

	/**
	 * Returns a new object of class '<em>Reservation Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reservation Parameter</em>'.
	 * @generated
	 */
	ReservationParameter createReservationParameter();

	/**
	 * Returns a new object of class '<em>Reservation Params9181</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reservation Params9181</em>'.
	 * @generated
	 */
	ReservationParams9181 createReservationParams9181();

	/**
	 * Returns a new object of class '<em>Reservation Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reservation Options</em>'.
	 * @generated
	 */
	ReservationOptions createReservationOptions();

	/**
	 * Returns a new object of class '<em>Reservation Preference Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reservation Preference Group</em>'.
	 * @generated
	 */
	ReservationPreferenceGroup createReservationPreferenceGroup();

	/**
	 * Returns a new object of class '<em>Service Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Class</em>'.
	 * @generated
	 */
	ServiceClass createServiceClass();

	/**
	 * Returns a new object of class '<em>Service Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Level</em>'.
	 * @generated
	 */
	ServiceLevel createServiceLevel();

	/**
	 * Returns a new object of class '<em>Time Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Range</em>'.
	 * @generated
	 */
	TimeRange createTimeRange();

	/**
	 * Returns a new object of class '<em>Excluded Time Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Excluded Time Range</em>'.
	 * @generated
	 */
	ExcludedTimeRange createExcludedTimeRange();

	/**
	 * Returns a new object of class '<em>Validity Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Validity Range</em>'.
	 * @generated
	 */
	ValidityRange createValidityRange();

	/**
	 * Returns a new object of class '<em>Relative Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relative Time</em>'.
	 * @generated
	 */
	RelativeTime createRelativeTime();

	/**
	 * Returns a new object of class '<em>Return Validity Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Validity Constraint</em>'.
	 * @generated
	 */
	ReturnValidityConstraint createReturnValidityConstraint();

	/**
	 * Returns a new object of class '<em>Via Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Via Station</em>'.
	 * @generated
	 */
	ViaStation createViaStation();

	/**
	 * Returns a new object of class '<em>Alternative Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alternative Route</em>'.
	 * @generated
	 */
	AlternativeRoute createAlternativeRoute();

	/**
	 * Returns a new object of class '<em>Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route</em>'.
	 * @generated
	 */
	Route createRoute();

	/**
	 * Returns a new object of class '<em>Zone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zone</em>'.
	 * @generated
	 */
	Zone createZone();

	/**
	 * Returns a new object of class '<em>Zone Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zone Definition</em>'.
	 * @generated
	 */
	ZoneDefinition createZoneDefinition();

	/**
	 * Returns a new object of class '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line</em>'.
	 * @generated
	 */
	Line createLine();

	/**
	 * Returns a new object of class '<em>Polygone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polygone</em>'.
	 * @generated
	 */
	Polygone createPolygone();

	/**
	 * Returns a new object of class '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge</em>'.
	 * @generated
	 */
	Edge createEdge();

	/**
	 * Returns a new object of class '<em>Carrier Resource Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carrier Resource Location</em>'.
	 * @generated
	 */
	CarrierResourceLocation createCarrierResourceLocation();

	/**
	 * Returns a new object of class '<em>Cross Border Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cross Border Condition</em>'.
	 * @generated
	 */
	CrossBorderCondition createCrossBorderCondition();

	/**
	 * Returns a new object of class '<em>Fare Combination Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fare Combination Model</em>'.
	 * @generated
	 */
	FareCombinationModel createFareCombinationModel();

	/**
	 * Returns a new object of class '<em>Fulfillment Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fulfillment Constraint</em>'.
	 * @generated
	 */
	FulfillmentConstraint createFulfillmentConstraint();

	/**
	 * Returns a new object of class '<em>Required Barcodes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Barcodes</em>'.
	 * @generated
	 */
	RequiredBarcodes createRequiredBarcodes();

	/**
	 * Returns a new object of class '<em>Accepted Barcodes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accepted Barcodes</em>'.
	 * @generated
	 */
	AcceptedBarcodes createAcceptedBarcodes();

	/**
	 * Returns a new object of class '<em>Reduction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reduction Constraint</em>'.
	 * @generated
	 */
	ReductionConstraint createReductionConstraint();

	/**
	 * Returns a new object of class '<em>Required Reduction Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Reduction Card</em>'.
	 * @generated
	 */
	RequiredReductionCard createRequiredReductionCard();

	/**
	 * Returns a new object of class '<em>Conversion From Legacy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conversion From Legacy</em>'.
	 * @generated
	 */
	ConversionFromLegacy createConversionFromLegacy();

	/**
	 * Returns a new object of class '<em>Conversion Params</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conversion Params</em>'.
	 * @generated
	 */
	ConversionParams createConversionParams();

	/**
	 * Returns a new object of class '<em>Target Fare Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Fare Template</em>'.
	 * @generated
	 */
	TargetFareTemplate createTargetFareTemplate();

	/**
	 * Returns a new object of class '<em>Legacy Station To Service Constraint Mappings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legacy Station To Service Constraint Mappings</em>'.
	 * @generated
	 */
	LegacyStationToServiceConstraintMappings createLegacyStationToServiceConstraintMappings();

	/**
	 * Returns a new object of class '<em>Legacy Station To Service Constraint Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legacy Station To Service Constraint Mapping</em>'.
	 * @generated
	 */
	LegacyStationToServiceConstraintMapping createLegacyStationToServiceConstraintMapping();

	/**
	 * Returns a new object of class '<em>Legacy Station Mappings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legacy Station Mappings</em>'.
	 * @generated
	 */
	LegacyStationMappings createLegacyStationMappings();

	/**
	 * Returns a new object of class '<em>Legacy Station Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legacy Station Map</em>'.
	 * @generated
	 */
	LegacyStationMap createLegacyStationMap();

	/**
	 * Returns a new object of class '<em>Legacy Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legacy Station</em>'.
	 * @generated
	 */
	LegacyStation createLegacyStation();

	/**
	 * Returns a new object of class '<em>Legacy Boder Point Mappings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legacy Boder Point Mappings</em>'.
	 * @generated
	 */
	LegacyBoderPointMappings createLegacyBoderPointMappings();

	/**
	 * Returns a new object of class '<em>Legacy Border Point Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legacy Border Point Mapping</em>'.
	 * @generated
	 */
	LegacyBorderPointMapping createLegacyBorderPointMapping();

	/**
	 * Returns a new object of class '<em>Legacy Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legacy Description</em>'.
	 * @generated
	 */
	LegacyDescription createLegacyDescription();

	/**
	 * Returns a new object of class '<em>Legacy Zone Mappings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legacy Zone Mappings</em>'.
	 * @generated
	 */
	LegacyZoneMappings createLegacyZoneMappings();

	/**
	 * Returns a new object of class '<em>Legacy Zone Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legacy Zone Map</em>'.
	 * @generated
	 */
	LegacyZoneMap createLegacyZoneMap();

	/**
	 * Returns a new object of class '<em>Legacy Fares</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legacy Fares</em>'.
	 * @generated
	 */
	LegacyFares createLegacyFares();

	/**
	 * Returns a new object of class '<em>Legacy Fare</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legacy Fare</em>'.
	 * @generated
	 */
	LegacyFare createLegacyFare();

	/**
	 * Returns a new object of class '<em>Legacy108</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legacy108</em>'.
	 * @generated
	 */
	Legacy108 createLegacy108();

	/**
	 * Returns a new object of class '<em>Legacy108 Stations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legacy108 Stations</em>'.
	 * @generated
	 */
	Legacy108Stations createLegacy108Stations();

	/**
	 * Returns a new object of class '<em>Legacy108 Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legacy108 Station</em>'.
	 * @generated
	 */
	Legacy108Station createLegacy108Station();

	/**
	 * Returns a new object of class '<em>Legacy Route Fares</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legacy Route Fares</em>'.
	 * @generated
	 */
	LegacyRouteFares createLegacyRouteFares();

	/**
	 * Returns a new object of class '<em>Legacy Route Fare</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legacy Route Fare</em>'.
	 * @generated
	 */
	LegacyRouteFare createLegacyRouteFare();

	/**
	 * Returns a new object of class '<em>Legacy Series</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legacy Series</em>'.
	 * @generated
	 */
	LegacySeries createLegacySeries();

	/**
	 * Returns a new object of class '<em>Legacy Series List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legacy Series List</em>'.
	 * @generated
	 */
	LegacySeriesList createLegacySeriesList();

	/**
	 * Returns a new object of class '<em>Legacy Distance Fares</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legacy Distance Fares</em>'.
	 * @generated
	 */
	LegacyDistanceFares createLegacyDistanceFares();

	/**
	 * Returns a new object of class '<em>Legacy Distance Fare</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legacy Distance Fare</em>'.
	 * @generated
	 */
	LegacyDistanceFare createLegacyDistanceFare();

	/**
	 * Returns a new object of class '<em>Legacy Viastation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legacy Viastation</em>'.
	 * @generated
	 */
	LegacyViastation createLegacyViastation();

	/**
	 * Returns a new object of class '<em>Legacy Target Fares</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legacy Target Fares</em>'.
	 * @generated
	 */
	LegacyTargetFares createLegacyTargetFares();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GtmPackage getGtmPackage();

} //GtmFactory
