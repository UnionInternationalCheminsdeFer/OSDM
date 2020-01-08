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
	 * Returns a new object of class '<em>General Tariff Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Tariff Model</em>'.
	 * @generated
	 */
	GeneralTariffModel createGeneralTariffModel();

	/**
	 * Returns a new object of class '<em>Conversion From Legacy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conversion From Legacy</em>'.
	 * @generated
	 */
	ConversionFromLegacy createConversionFromLegacy();

	/**
	 * Returns a new object of class '<em>Fare Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fare Structure</em>'.
	 * @generated
	 */
	FareStructure createFareStructure();

	/**
	 * Returns a new object of class '<em>Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delivery</em>'.
	 * @generated
	 */
	Delivery createDelivery();

	/**
	 * Returns a new object of class '<em>Border Points</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Border Points</em>'.
	 * @generated
	 */
	BorderPoints createBorderPoints();

	/**
	 * Returns a new object of class '<em>Calendar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calendar</em>'.
	 * @generated
	 */
	Calendar createCalendar();

	/**
	 * Returns a new object of class '<em>Carrier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carrier</em>'.
	 * @generated
	 */
	Carrier createCarrier();

	/**
	 * Returns a new object of class '<em>Coversion Params</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coversion Params</em>'.
	 * @generated
	 */
	CoversionParams createCoversionParams();

	/**
	 * Returns a new object of class '<em>Legacy Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legacy Description</em>'.
	 * @generated
	 */
	LegacyDescription createLegacyDescription();

	/**
	 * Returns a new object of class '<em>Legacy Distance Fare</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legacy Distance Fare</em>'.
	 * @generated
	 */
	LegacyDistanceFare createLegacyDistanceFare();

	/**
	 * Returns a new object of class '<em>Legacy Fares</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legacy Fares</em>'.
	 * @generated
	 */
	LegacyFares createLegacyFares();

	/**
	 * Returns a new object of class '<em>Legacy108</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legacy108</em>'.
	 * @generated
	 */
	Legacy108 createLegacy108();

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
	 * Returns a new object of class '<em>Legacy Viastation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legacy Viastation</em>'.
	 * @generated
	 */
	LegacyViastation createLegacyViastation();

	/**
	 * Returns a new object of class '<em>Legacy Station Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legacy Station Map</em>'.
	 * @generated
	 */
	LegacyStationMap createLegacyStationMap();

	/**
	 * Returns a new object of class '<em>Stations Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stations Type</em>'.
	 * @generated
	 */
	StationsType createStationsType();

	/**
	 * Returns a new object of class '<em>Target Fare Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Fare Template</em>'.
	 * @generated
	 */
	TargetFareTemplate createTargetFareTemplate();

	/**
	 * Returns a new object of class '<em>Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Station</em>'.
	 * @generated
	 */
	Station createStation();

	/**
	 * Returns a new object of class '<em>Country</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Country</em>'.
	 * @generated
	 */
	Country createCountry();

	/**
	 * Returns a new object of class '<em>Language</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language</em>'.
	 * @generated
	 */
	Language createLanguage();

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
	 * Returns a new object of class '<em>Price</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Price</em>'.
	 * @generated
	 */
	Price createPrice();

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
	 * Returns a new object of class '<em>Reservation Preference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reservation Preference</em>'.
	 * @generated
	 */
	ReservationPreference createReservationPreference();

	/**
	 * Returns a new object of class '<em>Currency Price</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Currency Price</em>'.
	 * @generated
	 */
	CurrencyPrice createCurrencyPrice();

	/**
	 * Returns a new object of class '<em>Currency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Currency</em>'.
	 * @generated
	 */
	Currency createCurrency();

	/**
	 * Returns a new object of class '<em>VAT Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VAT Detail</em>'.
	 * @generated
	 */
	VATDetail createVATDetail();

	/**
	 * Returns a new object of class '<em>Regional Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regional Constraint</em>'.
	 * @generated
	 */
	RegionalConstraint createRegionalConstraint();

	/**
	 * Returns a new object of class '<em>Connection Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Point</em>'.
	 * @generated
	 */
	ConnectionPoint createConnectionPoint();

	/**
	 * Returns a new object of class '<em>Service Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Constraint</em>'.
	 * @generated
	 */
	ServiceConstraint createServiceConstraint();

	/**
	 * Returns a new object of class '<em>Carrier Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carrier Constraint</em>'.
	 * @generated
	 */
	CarrierConstraint createCarrierConstraint();

	/**
	 * Returns a new object of class '<em>Fare Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fare Element</em>'.
	 * @generated
	 */
	FareElement createFareElement();

	/**
	 * Returns a new object of class '<em>Reduction Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reduction Card</em>'.
	 * @generated
	 */
	ReductionCard createReductionCard();

	/**
	 * Returns a new object of class '<em>Service Brand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Brand</em>'.
	 * @generated
	 */
	ServiceBrand createServiceBrand();

	/**
	 * Returns a new object of class '<em>Sales Availability Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sales Availability Constraint</em>'.
	 * @generated
	 */
	SalesAvailabilityConstraint createSalesAvailabilityConstraint();

	/**
	 * Returns a new object of class '<em>Travel Validity Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Travel Validity Constraint</em>'.
	 * @generated
	 */
	TravelValidityConstraint createTravelValidityConstraint();

	/**
	 * Returns a new object of class '<em>Sales Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sales Restriction</em>'.
	 * @generated
	 */
	SalesRestriction createSalesRestriction();

	/**
	 * Returns a new object of class '<em>Time Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Reference</em>'.
	 * @generated
	 */
	TimeReference createTimeReference();

	/**
	 * Returns a new object of class '<em>Combination Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Combination Constraint</em>'.
	 * @generated
	 */
	CombinationConstraint createCombinationConstraint();

	/**
	 * Returns a new object of class '<em>Validity Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Validity Range</em>'.
	 * @generated
	 */
	ValidityRange createValidityRange();

	/**
	 * Returns a new object of class '<em>Time Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Range</em>'.
	 * @generated
	 */
	TimeRange createTimeRange();

	/**
	 * Returns a new object of class '<em>Return Validity Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Validity Constraint</em>'.
	 * @generated
	 */
	ReturnValidityConstraint createReturnValidityConstraint();

	/**
	 * Returns a new object of class '<em>Fare Combination Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fare Combination Model</em>'.
	 * @generated
	 */
	FareCombinationModel createFareCombinationModel();

	/**
	 * Returns a new object of class '<em>Regional Validity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regional Validity</em>'.
	 * @generated
	 */
	RegionalValidity createRegionalValidity();

	/**
	 * Returns a new object of class '<em>Via Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Via Station</em>'.
	 * @generated
	 */
	ViaStation createViaStation();

	/**
	 * Returns a new object of class '<em>Zone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zone</em>'.
	 * @generated
	 */
	Zone createZone();

	/**
	 * Returns a new object of class '<em>Nuts Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nuts Code</em>'.
	 * @generated
	 */
	NutsCode createNutsCode();

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
	 * Returns a new object of class '<em>Passenger Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Passenger Constraint</em>'.
	 * @generated
	 */
	PassengerConstraint createPassengerConstraint();

	/**
	 * Returns a new object of class '<em>Passenger Combination Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Passenger Combination Constraint</em>'.
	 * @generated
	 */
	PassengerCombinationConstraint createPassengerCombinationConstraint();

	/**
	 * Returns a new object of class '<em>Relative Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relative Time</em>'.
	 * @generated
	 */
	RelativeTime createRelativeTime();

	/**
	 * Returns a new object of class '<em>Zone Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zone Definition</em>'.
	 * @generated
	 */
	ZoneDefinition createZoneDefinition();

	/**
	 * Returns a new object of class '<em>After Sales Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>After Sales Condition</em>'.
	 * @generated
	 */
	AfterSalesCondition createAfterSalesCondition();

	/**
	 * Returns a new object of class '<em>After Sales Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>After Sales Rule</em>'.
	 * @generated
	 */
	AfterSalesRule createAfterSalesRule();

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
	 * Returns a new object of class '<em>Cross Border Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cross Border Condition</em>'.
	 * @generated
	 */
	CrossBorderCondition createCrossBorderCondition();

	/**
	 * Returns a new object of class '<em>Allowed Personal Data Changes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allowed Personal Data Changes</em>'.
	 * @generated
	 */
	AllowedPersonalDataChanges createAllowedPersonalDataChanges();

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
	 * Returns a new object of class '<em>Fulfillment Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fulfillment Constraint</em>'.
	 * @generated
	 */
	FulfillmentConstraint createFulfillmentConstraint();

	/**
	 * Returns a new object of class '<em>Fare Resource Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fare Resource Location</em>'.
	 * @generated
	 */
	FareResourceLocation createFareResourceLocation();

	/**
	 * Returns a new object of class '<em>Train Resource Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Train Resource Location</em>'.
	 * @generated
	 */
	TrainResourceLocation createTrainResourceLocation();

	/**
	 * Returns a new object of class '<em>Carrier Resource Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carrier Resource Location</em>'.
	 * @generated
	 */
	CarrierResourceLocation createCarrierResourceLocation();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GtmPackage getGtmPackage();

} //GtmFactory
