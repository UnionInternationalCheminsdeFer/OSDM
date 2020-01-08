/**
 */
package Gtm.impl;

import Gtm.AfterSalesCondition;
import Gtm.AfterSalesRule;
import Gtm.AfterSalesTransactionType;
import Gtm.AllowedPersonalDataChanges;
import Gtm.BarcodeTypes;
import Gtm.BorderPoints;
import Gtm.Calendar;
import Gtm.Carrier;
import Gtm.CarrierConstraint;
import Gtm.CarrierResourceLocation;
import Gtm.ClassicClassType;
import Gtm.Clusters;
import Gtm.CodeLists;
import Gtm.CombinationConstraint;
import Gtm.CombinationModel;
import Gtm.ConnectionPoint;
import Gtm.ControlDataExchangeTypes;
import Gtm.ConversionFromLegacy;
import Gtm.Country;
import Gtm.CoversionParams;
import Gtm.CrossBorderCondition;
import Gtm.Currency;
import Gtm.CurrencyPrice;
import Gtm.Delivery;
import Gtm.Edge;
import Gtm.FareCombinationModel;
import Gtm.FareElement;
import Gtm.FareResourceLocation;
import Gtm.FareStructure;
import Gtm.FareType;
import Gtm.FulfillmentConstraint;
import Gtm.FulfillmentType;
import Gtm.GTMTool;
import Gtm.GeneralTariffModel;
import Gtm.GeoSystem;
import Gtm.GeoUnit;
import Gtm.GraphicalReservationType;
import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.HemisphereEW;
import Gtm.HemisphereNS;
import Gtm.InterfaceType;
import Gtm.Language;
import Gtm.Legacy108;
import Gtm.LegacyCalculationType;
import Gtm.LegacyDescription;
import Gtm.LegacyDistanceFare;
import Gtm.LegacyFares;
import Gtm.LegacyPassengerType;
import Gtm.LegacyRouteFare;
import Gtm.LegacySeries;
import Gtm.LegacySeriesType;
import Gtm.LegacyStationMap;
import Gtm.LegacyViastation;
import Gtm.Line;
import Gtm.NutsCode;
import Gtm.OfferRequestType;
import Gtm.OnlineResource;
import Gtm.OnlineServiceType;
import Gtm.PassengerCombinationConstraint;
import Gtm.PassengerConstraint;
import Gtm.PersonalDataChangeReason;
import Gtm.PersonalDataConstraint;
import Gtm.PersonalDataItemsType;
import Gtm.PersonalDataTransferType;
import Gtm.Polygone;
import Gtm.Price;
import Gtm.ReductionCard;
import Gtm.ReductionConstraint;
import Gtm.RegionalConstraint;
import Gtm.RegionalValidity;
import Gtm.RelativeTime;
import Gtm.RequiredPersonalData;
import Gtm.RequiredReductionCard;
import Gtm.ReservationBerthType;
import Gtm.ReservationOptions;
import Gtm.ReservationParameter;
import Gtm.ReservationParams9181;
import Gtm.ReservationPreference;
import Gtm.ReservationService;
import Gtm.ReservationServiceLevel;
import Gtm.ReservationTravelClass;
import Gtm.ReturnValidityConstraint;
import Gtm.SalesAvailabilityConstraint;
import Gtm.SalesRestriction;
import Gtm.ServiceBrand;
import Gtm.ServiceClass;
import Gtm.ServiceConstraint;
import Gtm.ServiceLevel;
import Gtm.Station;
import Gtm.StationResourceLocation;
import Gtm.StationsType;
import Gtm.TargetFareTemplate;
import Gtm.TaxScope;
import Gtm.Text;
import Gtm.TimeRange;
import Gtm.TimeRangeScope;
import Gtm.TimeReference;
import Gtm.TimeReferenceType;
import Gtm.TimeUnit;
import Gtm.TrainResourceLocation;
import Gtm.Translation;
import Gtm.TravelValidityConstraint;
import Gtm.TravelerType;
import Gtm.VATDetail;
import Gtm.ValidityRange;
import Gtm.ViaStation;
import Gtm.WeekDay;
import Gtm.Zone;
import Gtm.ZoneDefinition;
import Gtm.*;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
	private EClass generalTariffModelEClass = null;

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
	private EClass fareStructureEClass = null;

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
	private EClass borderPointsEClass = null;

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
	private EClass carrierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coversionParamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacyDescriptionEClass = null;

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
	private EClass legacyFaresEClass = null;

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
	private EClass legacyRouteFareEClass = null;

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
	private EClass legacyViastationEClass = null;

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
	private EClass stationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetFareTemplateEClass = null;

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
	private EClass countryEClass = null;

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
	private EClass priceEClass = null;

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
	private EClass reservationPreferenceEClass = null;

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
	private EClass currencyEClass = null;

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
	private EClass regionalConstraintEClass = null;

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
	private EClass serviceConstraintEClass = null;

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
	private EClass fareElementEClass = null;

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
	private EClass serviceBrandEClass = null;

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
	private EClass travelValidityConstraintEClass = null;

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
	private EClass timeReferenceEClass = null;

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
	private EClass validityRangeEClass = null;

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
	private EClass returnValidityConstraintEClass = null;

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
	private EClass regionalValidityEClass = null;

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
	private EClass zoneEClass = null;

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
	private EClass relativeTimeEClass = null;

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
	private EClass afterSalesConditionEClass = null;

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
	private EClass crossBorderConditionEClass = null;

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
	private EClass fulfillmentConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fareResourceLocationEClass = null;

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
	private EClass carrierResourceLocationEClass = null;

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
	private EEnum graphicalReservationTypeEEnum = null;

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
	private EEnum legacySeriesTypeEEnum = null;

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
	private EEnum taxScopeEEnum = null;

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
	private EEnum weekDayEEnum = null;

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
	private EEnum clustersEEnum = null;

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
	private EEnum legacyPassengerTypeEEnum = null;

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
	private EEnum afterSalesTransactionTypeEEnum = null;

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
	private EEnum onlineServiceTypeEEnum = null;

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
	private EEnum barcodeTypesEEnum = null;

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
	private EEnum offerRequestTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interfaceTypeEEnum = null;

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
	public EClass getFareStructure() {
		return fareStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_FareElements() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_AfterSalesRules() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_Calendars() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_ServiceClassDefinitions() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_Prices() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_RegionalConstraints() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_Texts() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_ServiceLevelDefinitions() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_ReservationParameters() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_ServiceConstraints() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_CarrierConstraints() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_ReductionCards() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_SalesAvailabilityConstraints() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_TravelValidityConstraints() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_CombinationConstraints() {
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
	public EReference getFareStructure_PersonalDataConstraints() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_ReductionConstraints() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_ZoneDefinitions() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareStructure_SupportedOnlineServices() {
		return (EAttribute)fareStructureEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_FulfillmentConstraint() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_FareResourceLocations() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_ConnectionPoints() {
		return (EReference)fareStructureEClass.getEStructuralFeatures().get(22);
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
	public EAttribute getDelivery_FareProvider() {
		return (EAttribute)deliveryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelivery_Optional() {
		return (EAttribute)deliveryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelivery_Provider() {
		return (EReference)deliveryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBorderPoints() {
		return borderPointsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBorderPoints_Code() {
		return (EAttribute)borderPointsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBorderPoints_Name() {
		return (EAttribute)borderPointsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBorderPoints_Station1() {
		return (EReference)borderPointsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBorderPoints_Station2() {
		return (EReference)borderPointsEClass.getEStructuralFeatures().get(3);
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
	public EClass getCoversionParams() {
		return coversionParamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoversionParams_BorderPoints() {
		return (EReference)coversionParamsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoversionParams_TargetFares() {
		return (EReference)coversionParamsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoversionParams_StationMappings() {
		return (EReference)coversionParamsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoversionParams_TaxId() {
		return (EAttribute)coversionParamsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoversionParams_VATpercentage() {
		return (EAttribute)coversionParamsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoversionParams_TaxCountry() {
		return (EReference)coversionParamsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacyDescription() {
		return legacyDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyDescription_Language() {
		return (EAttribute)legacyDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyDescription_Text() {
		return (EAttribute)legacyDescriptionEClass.getEStructuralFeatures().get(1);
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
	public EClass getLegacyFares() {
		return legacyFaresEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacyFares_Description() {
		return (EReference)legacyFaresEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getLegacy108_Carrier() {
		return (EAttribute)legacy108EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacy108_Series() {
		return (EReference)legacy108EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacy108_Fares() {
		return (EReference)legacy108EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacy108_DistanceFare() {
		return (EReference)legacy108EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacy108_RouteFare() {
		return (EReference)legacy108EClass.getEStructuralFeatures().get(4);
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
	public EAttribute getLegacyRouteFare_SeriesNumber() {
		return (EAttribute)legacyRouteFareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyRouteFare_Fare2nd() {
		return (EAttribute)legacyRouteFareEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyRouteFare_Fare1st() {
		return (EAttribute)legacyRouteFareEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyRouteFare_FareTableNumber() {
		return (EAttribute)legacyRouteFareEClass.getEStructuralFeatures().get(3);
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
	public EReference getLegacySeries_Viastations() {
		return (EReference)legacySeriesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacySeries_Distance1() {
		return (EAttribute)legacySeriesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacySeries_Pricetype() {
		return (EAttribute)legacySeriesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacySeries_ValidFrom() {
		return (EAttribute)legacySeriesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacySeries_ValidUntil() {
		return (EAttribute)legacySeriesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacySeries_Pricing() {
		return (EAttribute)legacySeriesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacySeries_Type() {
		return (EAttribute)legacySeriesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacySeries_Number() {
		return (EAttribute)legacySeriesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacySeries_FromStation() {
		return (EAttribute)legacySeriesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacySeries_ToStation() {
		return (EAttribute)legacySeriesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacySeries_Distance2() {
		return (EAttribute)legacySeriesEClass.getEStructuralFeatures().get(10);
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
	public EClass getStationsType() {
		return stationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStationsType_Code() {
		return (EAttribute)stationsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStationsType_Name() {
		return (EAttribute)stationsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetFareTemplate() {
		return targetFareTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetFareTemplate_PriceFactor() {
		return (EAttribute)targetFareTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetFareTemplate_Id() {
		return (EAttribute)targetFareTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetFareTemplate_Type() {
		return (EAttribute)targetFareTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetFareTemplate_DataDescription() {
		return (EAttribute)targetFareTemplateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetFareTemplate_Text() {
		return (EReference)targetFareTemplateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetFareTemplate_ServiceConstraint() {
		return (EReference)targetFareTemplateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetFareTemplate_CarrierConstraint() {
		return (EReference)targetFareTemplateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetFareTemplate_ServiceClass() {
		return (EReference)targetFareTemplateEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetFareTemplate_ServiceLevel() {
		return (EReference)targetFareTemplateEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetFareTemplate_SalesAvailability() {
		return (EReference)targetFareTemplateEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetFareTemplate_TravelValidity() {
		return (EReference)targetFareTemplateEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetFareTemplate_CombinationConstraint() {
		return (EReference)targetFareTemplateEClass.getEStructuralFeatures().get(11);
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
	public EClass getReservationParameter() {
		return reservationParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationParameter_OptionalReservation() {
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
	public EClass getReservationPreference() {
		return reservationPreferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationPreference_Preference() {
		return (EAttribute)reservationPreferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationPreference_Group() {
		return (EAttribute)reservationPreferenceEClass.getEStructuralFeatures().get(1);
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
	public EClass getConnectionPoint() {
		return connectionPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionPoint_Stations() {
		return (EReference)connectionPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionPoint_Id() {
		return (EAttribute)connectionPointEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getTravelValidityConstraint_ExcludedTimeRange() {
		return (EAttribute)travelValidityConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTravelValidityConstraint_TravelDays() {
		return (EAttribute)travelValidityConstraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTravelValidityConstraint_Range() {
		return (EReference)travelValidityConstraintEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTravelValidityConstraint_ReturnConstraint() {
		return (EReference)travelValidityConstraintEClass.getEStructuralFeatures().get(6);
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
	public EClass getTimeReference() {
		return timeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeReference_RefereceType() {
		return (EAttribute)timeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeReference_Unit() {
		return (EAttribute)timeReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeReference_Value() {
		return (EAttribute)timeReferenceEClass.getEStructuralFeatures().get(2);
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
	public EReference getViaStation_Route() {
		return (EReference)viaStationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViaStation_AlternativeRoutes() {
		return (EReference)viaStationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViaStation_Carrier() {
		return (EReference)viaStationEClass.getEStructuralFeatures().get(3);
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
	public EReference getZone_Carrier() {
		return (EReference)zoneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZone_EntryStation() {
		return (EReference)zoneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZone_TerminalStation() {
		return (EReference)zoneEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZone_NutsCode() {
		return (EReference)zoneEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZone_City() {
		return (EAttribute)zoneEClass.getEStructuralFeatures().get(6);
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
	public EReference getPolygone_Egde() {
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
	public EAttribute getEdge_EastWest() {
		return (EAttribute)edgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdge_NorthSouth() {
		return (EAttribute)edgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdge_Unit() {
		return (EAttribute)edgeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdge_Accuracy() {
		return (EAttribute)edgeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdge_Longitude() {
		return (EAttribute)edgeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdge_Latitude() {
		return (EAttribute)edgeEClass.getEStructuralFeatures().get(6);
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
	public EReference getPassengerCombinationConstraint_PassengerType() {
		return (EReference)passengerCombinationConstraintEClass.getEStructuralFeatures().get(1);
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
	public EClass getZoneDefinition() {
		return zoneDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZoneDefinition_ZoneId() {
		return (EAttribute)zoneDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZoneDefinition_Id() {
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
	public EReference getZoneDefinition_Stations() {
		return (EReference)zoneDefinitionEClass.getEStructuralFeatures().get(3);
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
	public EReference getAfterSalesRule_Conditions() {
		return (EReference)afterSalesRuleEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getFulfillmentConstraint_AcceptedBarcodes() {
		return (EAttribute)fulfillmentConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFulfillmentConstraint_RequiredControlDataExchange() {
		return (EAttribute)fulfillmentConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFulfillmentConstraint_IndividualTicketingPermitted() {
		return (EAttribute)fulfillmentConstraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFareResourceLocation() {
		return fareResourceLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareResourceLocation_Id() {
		return (EAttribute)fareResourceLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareResourceLocation_CarrierResourceLocations() {
		return (EReference)fareResourceLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareResourceLocation_StationResourceLocations() {
		return (EReference)fareResourceLocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareResourceLocation_TrainResourceLocations() {
		return (EReference)fareResourceLocationEClass.getEStructuralFeatures().get(3);
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
	public EEnum getGraphicalReservationType() {
		return graphicalReservationTypeEEnum;
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
	public EEnum getLegacySeriesType() {
		return legacySeriesTypeEEnum;
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
	public EEnum getTaxScope() {
		return taxScopeEEnum;
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
	public EEnum getWeekDay() {
		return weekDayEEnum;
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
	public EEnum getClusters() {
		return clustersEEnum;
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
	public EEnum getLegacyPassengerType() {
		return legacyPassengerTypeEEnum;
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
	public EEnum getAfterSalesTransactionType() {
		return afterSalesTransactionTypeEEnum;
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
	public EEnum getOnlineServiceType() {
		return onlineServiceTypeEEnum;
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
	public EEnum getBarcodeTypes() {
		return barcodeTypesEEnum;
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
	public EEnum getOfferRequestType() {
		return offerRequestTypeEEnum;
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

		generalTariffModelEClass = createEClass(GENERAL_TARIFF_MODEL);
		createEReference(generalTariffModelEClass, GENERAL_TARIFF_MODEL__DELIVERY);
		createEReference(generalTariffModelEClass, GENERAL_TARIFF_MODEL__FARE_STRUCTURE);

		conversionFromLegacyEClass = createEClass(CONVERSION_FROM_LEGACY);
		createEReference(conversionFromLegacyEClass, CONVERSION_FROM_LEGACY__LEGACY108);
		createEReference(conversionFromLegacyEClass, CONVERSION_FROM_LEGACY__PARAMS);

		fareStructureEClass = createEClass(FARE_STRUCTURE);
		createEReference(fareStructureEClass, FARE_STRUCTURE__FARE_ELEMENTS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__AFTER_SALES_RULES);
		createEReference(fareStructureEClass, FARE_STRUCTURE__CALENDARS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__SERVICE_CLASS_DEFINITIONS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__PRICES);
		createEReference(fareStructureEClass, FARE_STRUCTURE__REGIONAL_CONSTRAINTS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__TEXTS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__SERVICE_LEVEL_DEFINITIONS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__RESERVATION_PARAMETERS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__SERVICE_CONSTRAINTS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__CARRIER_CONSTRAINTS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__REDUCTION_CARDS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__SALES_AVAILABILITY_CONSTRAINTS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__TRAVEL_VALIDITY_CONSTRAINTS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__COMBINATION_CONSTRAINTS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__PASSENGER_CONSTRAINTS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__PERSONAL_DATA_CONSTRAINTS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__REDUCTION_CONSTRAINTS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__ZONE_DEFINITIONS);
		createEAttribute(fareStructureEClass, FARE_STRUCTURE__SUPPORTED_ONLINE_SERVICES);
		createEReference(fareStructureEClass, FARE_STRUCTURE__FULFILLMENT_CONSTRAINT);
		createEReference(fareStructureEClass, FARE_STRUCTURE__FARE_RESOURCE_LOCATIONS);
		createEReference(fareStructureEClass, FARE_STRUCTURE__CONNECTION_POINTS);

		deliveryEClass = createEClass(DELIVERY);
		createEAttribute(deliveryEClass, DELIVERY__ID);
		createEAttribute(deliveryEClass, DELIVERY__PREVIOUS_DELIVERY_ID);
		createEAttribute(deliveryEClass, DELIVERY__REPLACED_DELIVERY_ID);
		createEAttribute(deliveryEClass, DELIVERY__FARE_PROVIDER);
		createEAttribute(deliveryEClass, DELIVERY__OPTIONAL);
		createEReference(deliveryEClass, DELIVERY__PROVIDER);

		borderPointsEClass = createEClass(BORDER_POINTS);
		createEAttribute(borderPointsEClass, BORDER_POINTS__CODE);
		createEAttribute(borderPointsEClass, BORDER_POINTS__NAME);
		createEReference(borderPointsEClass, BORDER_POINTS__STATION1);
		createEReference(borderPointsEClass, BORDER_POINTS__STATION2);

		calendarEClass = createEClass(CALENDAR);
		createEAttribute(calendarEClass, CALENDAR__NAME);
		createEAttribute(calendarEClass, CALENDAR__ID);
		createEAttribute(calendarEClass, CALENDAR__FROM_DATE);
		createEAttribute(calendarEClass, CALENDAR__UNTIL_DATE);
		createEAttribute(calendarEClass, CALENDAR__UTC_OFFSET);
		createEAttribute(calendarEClass, CALENDAR__DATES);

		carrierEClass = createEClass(CARRIER);
		createEAttribute(carrierEClass, CARRIER__CODE);
		createEAttribute(carrierEClass, CARRIER__NAME);

		coversionParamsEClass = createEClass(COVERSION_PARAMS);
		createEReference(coversionParamsEClass, COVERSION_PARAMS__BORDER_POINTS);
		createEReference(coversionParamsEClass, COVERSION_PARAMS__TARGET_FARES);
		createEReference(coversionParamsEClass, COVERSION_PARAMS__STATION_MAPPINGS);
		createEAttribute(coversionParamsEClass, COVERSION_PARAMS__TAX_ID);
		createEAttribute(coversionParamsEClass, COVERSION_PARAMS__VA_TPERCENTAGE);
		createEReference(coversionParamsEClass, COVERSION_PARAMS__TAX_COUNTRY);

		legacyDescriptionEClass = createEClass(LEGACY_DESCRIPTION);
		createEAttribute(legacyDescriptionEClass, LEGACY_DESCRIPTION__LANGUAGE);
		createEAttribute(legacyDescriptionEClass, LEGACY_DESCRIPTION__TEXT);

		legacyDistanceFareEClass = createEClass(LEGACY_DISTANCE_FARE);
		createEAttribute(legacyDistanceFareEClass, LEGACY_DISTANCE_FARE__DISTANCE);
		createEAttribute(legacyDistanceFareEClass, LEGACY_DISTANCE_FARE__FARE2ND);
		createEAttribute(legacyDistanceFareEClass, LEGACY_DISTANCE_FARE__FARE1ST);
		createEAttribute(legacyDistanceFareEClass, LEGACY_DISTANCE_FARE__FARE_TABLE_NUMBER);

		legacyFaresEClass = createEClass(LEGACY_FARES);
		createEReference(legacyFaresEClass, LEGACY_FARES__DESCRIPTION);

		legacy108EClass = createEClass(LEGACY108);
		createEAttribute(legacy108EClass, LEGACY108__CARRIER);
		createEReference(legacy108EClass, LEGACY108__SERIES);
		createEReference(legacy108EClass, LEGACY108__FARES);
		createEReference(legacy108EClass, LEGACY108__DISTANCE_FARE);
		createEReference(legacy108EClass, LEGACY108__ROUTE_FARE);

		legacyRouteFareEClass = createEClass(LEGACY_ROUTE_FARE);
		createEAttribute(legacyRouteFareEClass, LEGACY_ROUTE_FARE__SERIES_NUMBER);
		createEAttribute(legacyRouteFareEClass, LEGACY_ROUTE_FARE__FARE2ND);
		createEAttribute(legacyRouteFareEClass, LEGACY_ROUTE_FARE__FARE1ST);
		createEAttribute(legacyRouteFareEClass, LEGACY_ROUTE_FARE__FARE_TABLE_NUMBER);

		legacySeriesEClass = createEClass(LEGACY_SERIES);
		createEReference(legacySeriesEClass, LEGACY_SERIES__VIASTATIONS);
		createEAttribute(legacySeriesEClass, LEGACY_SERIES__DISTANCE1);
		createEAttribute(legacySeriesEClass, LEGACY_SERIES__PRICETYPE);
		createEAttribute(legacySeriesEClass, LEGACY_SERIES__VALID_FROM);
		createEAttribute(legacySeriesEClass, LEGACY_SERIES__VALID_UNTIL);
		createEAttribute(legacySeriesEClass, LEGACY_SERIES__PRICING);
		createEAttribute(legacySeriesEClass, LEGACY_SERIES__TYPE);
		createEAttribute(legacySeriesEClass, LEGACY_SERIES__NUMBER);
		createEAttribute(legacySeriesEClass, LEGACY_SERIES__FROM_STATION);
		createEAttribute(legacySeriesEClass, LEGACY_SERIES__TO_STATION);
		createEAttribute(legacySeriesEClass, LEGACY_SERIES__DISTANCE2);

		legacyViastationEClass = createEClass(LEGACY_VIASTATION);
		createEAttribute(legacyViastationEClass, LEGACY_VIASTATION__POSITION);
		createEAttribute(legacyViastationEClass, LEGACY_VIASTATION__CODE);

		legacyStationMapEClass = createEClass(LEGACY_STATION_MAP);
		createEAttribute(legacyStationMapEClass, LEGACY_STATION_MAP__LEGACY_CODE);
		createEReference(legacyStationMapEClass, LEGACY_STATION_MAP__STATION);

		carrierConstraintEClass = createEClass(CARRIER_CONSTRAINT);
		createEAttribute(carrierConstraintEClass, CARRIER_CONSTRAINT__ID);
		createEReference(carrierConstraintEClass, CARRIER_CONSTRAINT__INCLUDED_CARRIERS);
		createEReference(carrierConstraintEClass, CARRIER_CONSTRAINT__EXCLUDED_CARRIERS);

		countryEClass = createEClass(COUNTRY);
		createEAttribute(countryEClass, COUNTRY__CODE);
		createEAttribute(countryEClass, COUNTRY__NAME);

		connectionPointEClass = createEClass(CONNECTION_POINT);
		createEReference(connectionPointEClass, CONNECTION_POINT__STATIONS);
		createEAttribute(connectionPointEClass, CONNECTION_POINT__ID);

		currencyEClass = createEClass(CURRENCY);
		createEAttribute(currencyEClass, CURRENCY__NAME);
		createEAttribute(currencyEClass, CURRENCY__ISO_CODE);

		currencyPriceEClass = createEClass(CURRENCY_PRICE);
		createEReference(currencyPriceEClass, CURRENCY_PRICE__CURRENCY);
		createEAttribute(currencyPriceEClass, CURRENCY_PRICE__AMOUNT);
		createEReference(currencyPriceEClass, CURRENCY_PRICE__VA_TDETAILS);

		languageEClass = createEClass(LANGUAGE);
		createEAttribute(languageEClass, LANGUAGE__NAME);
		createEAttribute(languageEClass, LANGUAGE__CODE);

		priceEClass = createEClass(PRICE);
		createEAttribute(priceEClass, PRICE__ID);
		createEReference(priceEClass, PRICE__CURRENCIES);

		reductionCardEClass = createEClass(REDUCTION_CARD);
		createEAttribute(reductionCardEClass, REDUCTION_CARD__ID);
		createEReference(reductionCardEClass, REDUCTION_CARD__CARD_ISSUER);
		createEReference(reductionCardEClass, REDUCTION_CARD__NAME);
		createEReference(reductionCardEClass, REDUCTION_CARD__SERVICE_CLASSES);

		regionalConstraintEClass = createEClass(REGIONAL_CONSTRAINT);
		createEAttribute(regionalConstraintEClass, REGIONAL_CONSTRAINT__ID);
		createEAttribute(regionalConstraintEClass, REGIONAL_CONSTRAINT__DISTANCE);
		createEReference(regionalConstraintEClass, REGIONAL_CONSTRAINT__ENTRY_CONNECTION_POINT);
		createEReference(regionalConstraintEClass, REGIONAL_CONSTRAINT__EXIT_CONNECTION_POINT);
		createEReference(regionalConstraintEClass, REGIONAL_CONSTRAINT__REGIONAL_VALIDITY);

		reservationParameterEClass = createEClass(RESERVATION_PARAMETER);
		createEAttribute(reservationParameterEClass, RESERVATION_PARAMETER__OPTIONAL_RESERVATION);
		createEAttribute(reservationParameterEClass, RESERVATION_PARAMETER__ID);
		createEReference(reservationParameterEClass, RESERVATION_PARAMETER__PARAMS9181);
		createEReference(reservationParameterEClass, RESERVATION_PARAMETER__OPTIONS);

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

		reservationPreferenceEClass = createEClass(RESERVATION_PREFERENCE);
		createEAttribute(reservationPreferenceEClass, RESERVATION_PREFERENCE__PREFERENCE);
		createEAttribute(reservationPreferenceEClass, RESERVATION_PREFERENCE__GROUP);

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

		serviceConstraintEClass = createEClass(SERVICE_CONSTRAINT);
		createEAttribute(serviceConstraintEClass, SERVICE_CONSTRAINT__ID);
		createEReference(serviceConstraintEClass, SERVICE_CONSTRAINT__INCLUDED_SERVICE_BRANDS);
		createEReference(serviceConstraintEClass, SERVICE_CONSTRAINT__EXCLUDED_SERVICE_BRANDS);

		stationEClass = createEClass(STATION);
		createEAttribute(stationEClass, STATION__NAME);
		createEReference(stationEClass, STATION__COUNTRY);

		stationsTypeEClass = createEClass(STATIONS_TYPE);
		createEAttribute(stationsTypeEClass, STATIONS_TYPE__CODE);
		createEAttribute(stationsTypeEClass, STATIONS_TYPE__NAME);

		targetFareTemplateEClass = createEClass(TARGET_FARE_TEMPLATE);
		createEAttribute(targetFareTemplateEClass, TARGET_FARE_TEMPLATE__PRICE_FACTOR);
		createEAttribute(targetFareTemplateEClass, TARGET_FARE_TEMPLATE__ID);
		createEAttribute(targetFareTemplateEClass, TARGET_FARE_TEMPLATE__TYPE);
		createEAttribute(targetFareTemplateEClass, TARGET_FARE_TEMPLATE__DATA_DESCRIPTION);
		createEReference(targetFareTemplateEClass, TARGET_FARE_TEMPLATE__TEXT);
		createEReference(targetFareTemplateEClass, TARGET_FARE_TEMPLATE__SERVICE_CONSTRAINT);
		createEReference(targetFareTemplateEClass, TARGET_FARE_TEMPLATE__CARRIER_CONSTRAINT);
		createEReference(targetFareTemplateEClass, TARGET_FARE_TEMPLATE__SERVICE_CLASS);
		createEReference(targetFareTemplateEClass, TARGET_FARE_TEMPLATE__SERVICE_LEVEL);
		createEReference(targetFareTemplateEClass, TARGET_FARE_TEMPLATE__SALES_AVAILABILITY);
		createEReference(targetFareTemplateEClass, TARGET_FARE_TEMPLATE__TRAVEL_VALIDITY);
		createEReference(targetFareTemplateEClass, TARGET_FARE_TEMPLATE__COMBINATION_CONSTRAINT);

		travelValidityConstraintEClass = createEClass(TRAVEL_VALIDITY_CONSTRAINT);
		createEAttribute(travelValidityConstraintEClass, TRAVEL_VALIDITY_CONSTRAINT__ID);
		createEAttribute(travelValidityConstraintEClass, TRAVEL_VALIDITY_CONSTRAINT__DATA_DESCRIPTION);
		createEReference(travelValidityConstraintEClass, TRAVEL_VALIDITY_CONSTRAINT__VALID_DAYS);
		createEAttribute(travelValidityConstraintEClass, TRAVEL_VALIDITY_CONSTRAINT__EXCLUDED_TIME_RANGE);
		createEAttribute(travelValidityConstraintEClass, TRAVEL_VALIDITY_CONSTRAINT__TRAVEL_DAYS);
		createEReference(travelValidityConstraintEClass, TRAVEL_VALIDITY_CONSTRAINT__RANGE);
		createEReference(travelValidityConstraintEClass, TRAVEL_VALIDITY_CONSTRAINT__RETURN_CONSTRAINT);

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

		vatDetailEClass = createEClass(VAT_DETAIL);
		createEAttribute(vatDetailEClass, VAT_DETAIL__AMOUNT);
		createEAttribute(vatDetailEClass, VAT_DETAIL__PERCENTAGE);
		createEReference(vatDetailEClass, VAT_DETAIL__COUNTRY);
		createEAttribute(vatDetailEClass, VAT_DETAIL__TAX_ID);
		createEAttribute(vatDetailEClass, VAT_DETAIL__SCOPE);

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

		serviceBrandEClass = createEClass(SERVICE_BRAND);
		createEAttribute(serviceBrandEClass, SERVICE_BRAND__CODE);
		createEAttribute(serviceBrandEClass, SERVICE_BRAND__NAME);
		createEAttribute(serviceBrandEClass, SERVICE_BRAND__ABBREVIATION);

		salesAvailabilityConstraintEClass = createEClass(SALES_AVAILABILITY_CONSTRAINT);
		createEAttribute(salesAvailabilityConstraintEClass, SALES_AVAILABILITY_CONSTRAINT__ID);
		createEAttribute(salesAvailabilityConstraintEClass, SALES_AVAILABILITY_CONSTRAINT__DATA_DESCRIPTION);
		createEReference(salesAvailabilityConstraintEClass, SALES_AVAILABILITY_CONSTRAINT__RESTRICTIONS);

		salesRestrictionEClass = createEClass(SALES_RESTRICTION);
		createEReference(salesRestrictionEClass, SALES_RESTRICTION__SALES_DATES);
		createEReference(salesRestrictionEClass, SALES_RESTRICTION__START_OF_SALE);
		createEReference(salesRestrictionEClass, SALES_RESTRICTION__END_OF_SALE);

		timeReferenceEClass = createEClass(TIME_REFERENCE);
		createEAttribute(timeReferenceEClass, TIME_REFERENCE__REFERECE_TYPE);
		createEAttribute(timeReferenceEClass, TIME_REFERENCE__UNIT);
		createEAttribute(timeReferenceEClass, TIME_REFERENCE__VALUE);

		combinationConstraintEClass = createEClass(COMBINATION_CONSTRAINT);
		createEAttribute(combinationConstraintEClass, COMBINATION_CONSTRAINT__ID);
		createEAttribute(combinationConstraintEClass, COMBINATION_CONSTRAINT__DATA_DESCRIPTION);
		createEReference(combinationConstraintEClass, COMBINATION_CONSTRAINT__COMBINATION_MODELS);

		validityRangeEClass = createEClass(VALIDITY_RANGE);
		createEAttribute(validityRangeEClass, VALIDITY_RANGE__UNIT);
		createEAttribute(validityRangeEClass, VALIDITY_RANGE__VALUE);
		createEAttribute(validityRangeEClass, VALIDITY_RANGE__HOURS_AFTER_MIDNIGHT);

		timeRangeEClass = createEClass(TIME_RANGE);
		createEAttribute(timeRangeEClass, TIME_RANGE__SCOPE);
		createEAttribute(timeRangeEClass, TIME_RANGE__FROM);
		createEAttribute(timeRangeEClass, TIME_RANGE__UNTIL);

		returnValidityConstraintEClass = createEClass(RETURN_VALIDITY_CONSTRAINT);
		createEAttribute(returnValidityConstraintEClass, RETURN_VALIDITY_CONSTRAINT__EXCLUDED_WEEKDAYS);
		createEAttribute(returnValidityConstraintEClass, RETURN_VALIDITY_CONSTRAINT__LATEST_RETURN);
		createEAttribute(returnValidityConstraintEClass, RETURN_VALIDITY_CONSTRAINT__EARLIEST_RETURN);

		fareCombinationModelEClass = createEClass(FARE_COMBINATION_MODEL);
		createEAttribute(fareCombinationModelEClass, FARE_COMBINATION_MODEL__MODEL);
		createEReference(fareCombinationModelEClass, FARE_COMBINATION_MODEL__COMBINABLE_CARRIERS);
		createEAttribute(fareCombinationModelEClass, FARE_COMBINATION_MODEL__ONLY_WHEN_COMBINED);
		createEReference(fareCombinationModelEClass, FARE_COMBINATION_MODEL__ALLOWED_ALLOCATORS);
		createEAttribute(fareCombinationModelEClass, FARE_COMBINATION_MODEL__REFERENCE_CLUSTER);
		createEAttribute(fareCombinationModelEClass, FARE_COMBINATION_MODEL__ALLOWED_CLUSTERS);
		createEReference(fareCombinationModelEClass, FARE_COMBINATION_MODEL__ALLOWED_COMMON_CONTRACTS);

		regionalValidityEClass = createEClass(REGIONAL_VALIDITY);
		createEAttribute(regionalValidityEClass, REGIONAL_VALIDITY__SEQ_NB);
		createEReference(regionalValidityEClass, REGIONAL_VALIDITY__VIA_STATION);
		createEReference(regionalValidityEClass, REGIONAL_VALIDITY__ZONE);
		createEReference(regionalValidityEClass, REGIONAL_VALIDITY__LINE);
		createEReference(regionalValidityEClass, REGIONAL_VALIDITY__POLYGONE);

		viaStationEClass = createEClass(VIA_STATION);
		createEReference(viaStationEClass, VIA_STATION__STATION);
		createEReference(viaStationEClass, VIA_STATION__ROUTE);
		createEReference(viaStationEClass, VIA_STATION__ALTERNATIVE_ROUTES);
		createEReference(viaStationEClass, VIA_STATION__CARRIER);

		zoneEClass = createEClass(ZONE);
		createEAttribute(zoneEClass, ZONE__BINARY_ZONE_ID);
		createEAttribute(zoneEClass, ZONE__ZONE_ID);
		createEReference(zoneEClass, ZONE__CARRIER);
		createEReference(zoneEClass, ZONE__ENTRY_STATION);
		createEReference(zoneEClass, ZONE__TERMINAL_STATION);
		createEReference(zoneEClass, ZONE__NUTS_CODE);
		createEAttribute(zoneEClass, ZONE__CITY);

		nutsCodeEClass = createEClass(NUTS_CODE);
		createEAttribute(nutsCodeEClass, NUTS_CODE__NAME);
		createEAttribute(nutsCodeEClass, NUTS_CODE__CODE);

		lineEClass = createEClass(LINE);
		createEAttribute(lineEClass, LINE__BINARY_ZONE_ID);
		createEAttribute(lineEClass, LINE__LINE_ID);
		createEReference(lineEClass, LINE__CARRIER);
		createEReference(lineEClass, LINE__ENTRY_STATION);
		createEReference(lineEClass, LINE__TERMINAL_STATION);
		createEReference(lineEClass, LINE__NUTS_CODE);
		createEAttribute(lineEClass, LINE__CITY);

		polygoneEClass = createEClass(POLYGONE);
		createEReference(polygoneEClass, POLYGONE__EGDE);

		edgeEClass = createEClass(EDGE);
		createEAttribute(edgeEClass, EDGE__SYSTEM);
		createEAttribute(edgeEClass, EDGE__EAST_WEST);
		createEAttribute(edgeEClass, EDGE__NORTH_SOUTH);
		createEAttribute(edgeEClass, EDGE__UNIT);
		createEAttribute(edgeEClass, EDGE__ACCURACY);
		createEAttribute(edgeEClass, EDGE__LONGITUDE);
		createEAttribute(edgeEClass, EDGE__LATITUDE);

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

		passengerCombinationConstraintEClass = createEClass(PASSENGER_COMBINATION_CONSTRAINT);
		createEAttribute(passengerCombinationConstraintEClass, PASSENGER_COMBINATION_CONSTRAINT__MAX_NUMBER);
		createEReference(passengerCombinationConstraintEClass, PASSENGER_COMBINATION_CONSTRAINT__PASSENGER_TYPE);

		relativeTimeEClass = createEClass(RELATIVE_TIME);
		createEAttribute(relativeTimeEClass, RELATIVE_TIME__UNIT);
		createEAttribute(relativeTimeEClass, RELATIVE_TIME__REFERENCE);
		createEAttribute(relativeTimeEClass, RELATIVE_TIME__VALUE);

		zoneDefinitionEClass = createEClass(ZONE_DEFINITION);
		createEAttribute(zoneDefinitionEClass, ZONE_DEFINITION__ZONE_ID);
		createEAttribute(zoneDefinitionEClass, ZONE_DEFINITION__ID);
		createEAttribute(zoneDefinitionEClass, ZONE_DEFINITION__NAME);
		createEReference(zoneDefinitionEClass, ZONE_DEFINITION__STATIONS);

		afterSalesConditionEClass = createEClass(AFTER_SALES_CONDITION);
		createEAttribute(afterSalesConditionEClass, AFTER_SALES_CONDITION__TRANSACTION_TYPE);
		createEAttribute(afterSalesConditionEClass, AFTER_SALES_CONDITION__INDIVIDUAL_CONTRACTS);
		createEAttribute(afterSalesConditionEClass, AFTER_SALES_CONDITION__CARRIER_FEE);
		createEReference(afterSalesConditionEClass, AFTER_SALES_CONDITION__FEE);
		createEReference(afterSalesConditionEClass, AFTER_SALES_CONDITION__APPLICATION_TIME);

		afterSalesRuleEClass = createEClass(AFTER_SALES_RULE);
		createEAttribute(afterSalesRuleEClass, AFTER_SALES_RULE__ID);
		createEReference(afterSalesRuleEClass, AFTER_SALES_RULE__CONDITIONS);

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

		crossBorderConditionEClass = createEClass(CROSS_BORDER_CONDITION);
		createEReference(crossBorderConditionEClass, CROSS_BORDER_CONDITION__FROM_COUNTRY);
		createEReference(crossBorderConditionEClass, CROSS_BORDER_CONDITION__TO_COUNTRY);
		createEReference(crossBorderConditionEClass, CROSS_BORDER_CONDITION__AFFECTED_SERVICE_BRANDS);

		allowedPersonalDataChangesEClass = createEClass(ALLOWED_PERSONAL_DATA_CHANGES);
		createEAttribute(allowedPersonalDataChangesEClass, ALLOWED_PERSONAL_DATA_CHANGES__TIME_LIMIT);
		createEAttribute(allowedPersonalDataChangesEClass, ALLOWED_PERSONAL_DATA_CHANGES__ACCEPTED_REASON);

		reductionConstraintEClass = createEClass(REDUCTION_CONSTRAINT);
		createEAttribute(reductionConstraintEClass, REDUCTION_CONSTRAINT__ID);
		createEReference(reductionConstraintEClass, REDUCTION_CONSTRAINT__REQUIRED_REDUCTION_CARDS);

		requiredReductionCardEClass = createEClass(REQUIRED_REDUCTION_CARD);
		createEReference(requiredReductionCardEClass, REQUIRED_REDUCTION_CARD__CARD_CLASS);
		createEReference(requiredReductionCardEClass, REQUIRED_REDUCTION_CARD__CARD);
		createEAttribute(requiredReductionCardEClass, REQUIRED_REDUCTION_CARD__NAME);

		fulfillmentConstraintEClass = createEClass(FULFILLMENT_CONSTRAINT);
		createEAttribute(fulfillmentConstraintEClass, FULFILLMENT_CONSTRAINT__ID);
		createEAttribute(fulfillmentConstraintEClass, FULFILLMENT_CONSTRAINT__ACCEPTED_FULFILMENT_TYPES);
		createEAttribute(fulfillmentConstraintEClass, FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODES);
		createEAttribute(fulfillmentConstraintEClass, FULFILLMENT_CONSTRAINT__REQUIRED_CONTROL_DATA_EXCHANGE);
		createEAttribute(fulfillmentConstraintEClass, FULFILLMENT_CONSTRAINT__INDIVIDUAL_TICKETING_PERMITTED);

		fareResourceLocationEClass = createEClass(FARE_RESOURCE_LOCATION);
		createEAttribute(fareResourceLocationEClass, FARE_RESOURCE_LOCATION__ID);
		createEReference(fareResourceLocationEClass, FARE_RESOURCE_LOCATION__CARRIER_RESOURCE_LOCATIONS);
		createEReference(fareResourceLocationEClass, FARE_RESOURCE_LOCATION__STATION_RESOURCE_LOCATIONS);
		createEReference(fareResourceLocationEClass, FARE_RESOURCE_LOCATION__TRAIN_RESOURCE_LOCATIONS);

		trainResourceLocationEClass = createEClass(TRAIN_RESOURCE_LOCATION);
		createEReference(trainResourceLocationEClass, TRAIN_RESOURCE_LOCATION__CARRIER);
		createEReference(trainResourceLocationEClass, TRAIN_RESOURCE_LOCATION__ONLINE_RESOURCES);
		createEAttribute(trainResourceLocationEClass, TRAIN_RESOURCE_LOCATION__TRAIN_ID);

		carrierResourceLocationEClass = createEClass(CARRIER_RESOURCE_LOCATION);
		createEReference(carrierResourceLocationEClass, CARRIER_RESOURCE_LOCATION__CARRIER);
		createEReference(carrierResourceLocationEClass, CARRIER_RESOURCE_LOCATION__SERVICE_BRAND);
		createEReference(carrierResourceLocationEClass, CARRIER_RESOURCE_LOCATION__ONLINE_RESOURCES);

		stationResourceLocationEClass = createEClass(STATION_RESOURCE_LOCATION);
		createEReference(stationResourceLocationEClass, STATION_RESOURCE_LOCATION__ONLINE_RESOURCES);
		createEReference(stationResourceLocationEClass, STATION_RESOURCE_LOCATION__STATIONS);
		createEReference(stationResourceLocationEClass, STATION_RESOURCE_LOCATION__CONNECTION_POINTS);

		onlineResourceEClass = createEClass(ONLINE_RESOURCE);
		createEAttribute(onlineResourceEClass, ONLINE_RESOURCE__OFFER_REQUEST_TYPE);
		createEAttribute(onlineResourceEClass, ONLINE_RESOURCE__INTERFACE_TYPE);
		createEAttribute(onlineResourceEClass, ONLINE_RESOURCE__VERSION);
		createEAttribute(onlineResourceEClass, ONLINE_RESOURCE__SYSTEM);

		// Create enums
		reservationServiceEEnum = createEEnum(RESERVATION_SERVICE);
		reservationBerthTypeEEnum = createEEnum(RESERVATION_BERTH_TYPE);
		graphicalReservationTypeEEnum = createEEnum(GRAPHICAL_RESERVATION_TYPE);
		legacyCalculationTypeEEnum = createEEnum(LEGACY_CALCULATION_TYPE);
		legacySeriesTypeEEnum = createEEnum(LEGACY_SERIES_TYPE);
		classicClassTypeEEnum = createEEnum(CLASSIC_CLASS_TYPE);
		taxScopeEEnum = createEEnum(TAX_SCOPE);
		fareTypeEEnum = createEEnum(FARE_TYPE);
		reservationTravelClassEEnum = createEEnum(RESERVATION_TRAVEL_CLASS);
		reservationServiceLevelEEnum = createEEnum(RESERVATION_SERVICE_LEVEL);
		timeReferenceTypeEEnum = createEEnum(TIME_REFERENCE_TYPE);
		timeRangeScopeEEnum = createEEnum(TIME_RANGE_SCOPE);
		timeUnitEEnum = createEEnum(TIME_UNIT);
		weekDayEEnum = createEEnum(WEEK_DAY);
		combinationModelEEnum = createEEnum(COMBINATION_MODEL);
		clustersEEnum = createEEnum(CLUSTERS);
		geoSystemEEnum = createEEnum(GEO_SYSTEM);
		geoUnitEEnum = createEEnum(GEO_UNIT);
		hemisphereEWEEnum = createEEnum(HEMISPHERE_EW);
		hemisphereNSEEnum = createEEnum(HEMISPHERE_NS);
		legacyPassengerTypeEEnum = createEEnum(LEGACY_PASSENGER_TYPE);
		travelerTypeEEnum = createEEnum(TRAVELER_TYPE);
		afterSalesTransactionTypeEEnum = createEEnum(AFTER_SALES_TRANSACTION_TYPE);
		personalDataItemsTypeEEnum = createEEnum(PERSONAL_DATA_ITEMS_TYPE);
		personalDataTransferTypeEEnum = createEEnum(PERSONAL_DATA_TRANSFER_TYPE);
		personalDataChangeReasonEEnum = createEEnum(PERSONAL_DATA_CHANGE_REASON);
		onlineServiceTypeEEnum = createEEnum(ONLINE_SERVICE_TYPE);
		fulfillmentTypeEEnum = createEEnum(FULFILLMENT_TYPE);
		barcodeTypesEEnum = createEEnum(BARCODE_TYPES);
		controlDataExchangeTypesEEnum = createEEnum(CONTROL_DATA_EXCHANGE_TYPES);
		offerRequestTypeEEnum = createEEnum(OFFER_REQUEST_TYPE);
		interfaceTypeEEnum = createEEnum(INTERFACE_TYPE);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(gtmToolEClass, GTMTool.class, "GTMTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGTMTool_ConversionFromLegacy(), this.getConversionFromLegacy(), null, "conversionFromLegacy", null, 1, 1, GTMTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGTMTool_CodeLists(), this.getCodeLists(), null, "codeLists", null, 1, 1, GTMTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGTMTool_GeneralTariffModel(), this.getGeneralTariffModel(), null, "generalTariffModel", null, 1, 1, GTMTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeListsEClass, CodeLists.class, "CodeLists", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCodeLists_Carriers(), this.getCarrier(), null, "carriers", null, 0, -1, CodeLists.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodeLists_Stations(), this.getStation(), null, "stations", null, 0, -1, CodeLists.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodeLists_Countries(), this.getCountry(), null, "countries", null, 0, -1, CodeLists.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodeLists_Languages(), this.getLanguage(), null, "languages", null, 0, -1, CodeLists.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodeLists_Currencies(), this.getCurrency(), null, "currencies", null, 0, -1, CodeLists.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodeLists_ServiceBrands(), this.getServiceBrand(), null, "serviceBrands", null, 0, -1, CodeLists.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodeLists_NutsCodes(), this.getNutsCode(), null, "nutsCodes", null, 0, -1, CodeLists.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generalTariffModelEClass, GeneralTariffModel.class, "GeneralTariffModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneralTariffModel_Delivery(), this.getDelivery(), null, "delivery", null, 1, 1, GeneralTariffModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralTariffModel_FareStructure(), this.getFareStructure(), null, "fareStructure", null, 1, 1, GeneralTariffModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conversionFromLegacyEClass, ConversionFromLegacy.class, "ConversionFromLegacy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConversionFromLegacy_Legacy108(), this.getLegacy108(), null, "legacy108", null, 1, 1, ConversionFromLegacy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConversionFromLegacy_Params(), this.getCoversionParams(), null, "params", null, 1, 1, ConversionFromLegacy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fareStructureEClass, FareStructure.class, "FareStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFareStructure_FareElements(), this.getFareElement(), null, "fareElements", null, 0, -1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_AfterSalesRules(), this.getAfterSalesRule(), null, "afterSalesRules", null, 0, -1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_Calendars(), this.getCalendar(), null, "calendars", null, 1, -1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_ServiceClassDefinitions(), this.getServiceClass(), null, "serviceClassDefinitions", null, 1, -1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_Prices(), this.getPrice(), null, "prices", null, 0, -1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_RegionalConstraints(), this.getRegionalConstraint(), null, "regionalConstraints", null, 0, -1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_Texts(), this.getText(), null, "texts", null, 0, -1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_ServiceLevelDefinitions(), this.getServiceLevel(), null, "serviceLevelDefinitions", null, 0, -1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_ReservationParameters(), this.getReservationParameter(), null, "reservationParameters", null, 0, -1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_ServiceConstraints(), this.getServiceConstraint(), null, "serviceConstraints", null, 0, -1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_CarrierConstraints(), this.getCarrierConstraint(), null, "carrierConstraints", null, 0, -1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_ReductionCards(), this.getReductionCard(), null, "reductionCards", null, 0, -1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_SalesAvailabilityConstraints(), this.getSalesAvailabilityConstraint(), null, "salesAvailabilityConstraints", null, 0, -1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_TravelValidityConstraints(), this.getTravelValidityConstraint(), null, "travelValidityConstraints", null, 0, -1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_CombinationConstraints(), this.getCombinationConstraint(), null, "combinationConstraints", null, 0, -1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_PassengerConstraints(), this.getPassengerConstraint(), null, "passengerConstraints", null, 0, -1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_PersonalDataConstraints(), this.getPersonalDataConstraint(), null, "personalDataConstraints", null, 0, -1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_ReductionConstraints(), this.getReductionConstraint(), null, "reductionConstraints", null, 0, -1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_ZoneDefinitions(), this.getZoneDefinition(), null, "zoneDefinitions", null, 0, -1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFareStructure_SupportedOnlineServices(), this.getOnlineServiceType(), "supportedOnlineServices", null, 0, -1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_FulfillmentConstraint(), this.getFulfillmentConstraint(), null, "fulfillmentConstraint", null, 0, -1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_FareResourceLocations(), this.getFareResourceLocation(), null, "fareResourceLocations", null, 0, -1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareStructure_ConnectionPoints(), this.getConnectionPoint(), null, "connectionPoints", null, 0, -1, FareStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deliveryEClass, Delivery.class, "Delivery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelivery_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, Delivery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelivery_PreviousDeliveryId(), theXMLTypePackage.getString(), "previousDeliveryId", null, 1, 1, Delivery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelivery_ReplacedDeliveryId(), theXMLTypePackage.getInt(), "replacedDeliveryId", null, 1, 1, Delivery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelivery_FareProvider(), theXMLTypePackage.getString(), "fareProvider", null, 1, 1, Delivery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelivery_Optional(), ecorePackage.getEBoolean(), "optional", "false", 1, 1, Delivery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelivery_Provider(), this.getCarrier(), null, "provider", null, 0, 1, Delivery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(borderPointsEClass, BorderPoints.class, "BorderPoints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBorderPoints_Code(), theXMLTypePackage.getInt(), "code", null, 1, 1, BorderPoints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBorderPoints_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, BorderPoints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBorderPoints_Station1(), this.getStation(), null, "station1", null, 0, 1, BorderPoints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBorderPoints_Station2(), this.getStation(), null, "station2", null, 0, 1, BorderPoints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calendarEClass, Calendar.class, "Calendar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCalendar_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Calendar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalendar_Id(), ecorePackage.getEString(), "id", null, 0, 1, Calendar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalendar_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, Calendar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalendar_UntilDate(), ecorePackage.getEDate(), "untilDate", null, 0, 1, Calendar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalendar_UtcOffset(), ecorePackage.getEInt(), "utcOffset", null, 0, 1, Calendar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalendar_Dates(), ecorePackage.getEDate(), "dates", null, 0, -1, Calendar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carrierEClass, Carrier.class, "Carrier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCarrier_Code(), theXMLTypePackage.getString(), "code", null, 1, 1, Carrier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarrier_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Carrier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coversionParamsEClass, CoversionParams.class, "CoversionParams", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoversionParams_BorderPoints(), this.getBorderPoints(), null, "borderPoints", null, 0, -1, CoversionParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoversionParams_TargetFares(), this.getTargetFareTemplate(), null, "targetFares", null, 1, -1, CoversionParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoversionParams_StationMappings(), this.getLegacyStationMap(), null, "stationMappings", null, 0, -1, CoversionParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoversionParams_TaxId(), ecorePackage.getEString(), "TaxId", null, 0, 1, CoversionParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoversionParams_VATpercentage(), ecorePackage.getEFloat(), "VATpercentage", null, 0, 1, CoversionParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoversionParams_TaxCountry(), this.getCountry(), null, "taxCountry", null, 0, 1, CoversionParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacyDescriptionEClass, LegacyDescription.class, "LegacyDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegacyDescription_Language(), theXMLTypePackage.getString(), "language", null, 1, 1, LegacyDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacyDescription_Text(), theXMLTypePackage.getString(), "text", null, 1, 1, LegacyDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacyDistanceFareEClass, LegacyDistanceFare.class, "LegacyDistanceFare", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegacyDistanceFare_Distance(), theXMLTypePackage.getInt(), "distance", null, 1, 1, LegacyDistanceFare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacyDistanceFare_Fare2nd(), theXMLTypePackage.getInt(), "fare2nd", null, 1, 1, LegacyDistanceFare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacyDistanceFare_Fare1st(), theXMLTypePackage.getInt(), "fare1st", null, 1, 1, LegacyDistanceFare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacyDistanceFare_FareTableNumber(), ecorePackage.getEInt(), "fareTableNumber", null, 0, 1, LegacyDistanceFare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacyFaresEClass, LegacyFares.class, "LegacyFares", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLegacyFares_Description(), this.getLegacyDescription(), null, "description", null, 1, 5, LegacyFares.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacy108EClass, Legacy108.class, "Legacy108", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegacy108_Carrier(), theXMLTypePackage.getString(), "carrier", null, 1, 1, Legacy108.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegacy108_Series(), this.getLegacySeries(), null, "series", null, 1, -1, Legacy108.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegacy108_Fares(), this.getLegacyFares(), null, "fares", null, 1, -1, Legacy108.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegacy108_DistanceFare(), this.getLegacyDistanceFare(), null, "distanceFare", null, 1, -1, Legacy108.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegacy108_RouteFare(), this.getLegacyRouteFare(), null, "routeFare", null, 1, -1, Legacy108.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacyRouteFareEClass, LegacyRouteFare.class, "LegacyRouteFare", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegacyRouteFare_SeriesNumber(), theXMLTypePackage.getInt(), "seriesNumber", null, 1, 1, LegacyRouteFare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacyRouteFare_Fare2nd(), theXMLTypePackage.getInt(), "fare2nd", null, 1, 1, LegacyRouteFare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacyRouteFare_Fare1st(), theXMLTypePackage.getInt(), "fare1st", null, 1, 1, LegacyRouteFare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacyRouteFare_FareTableNumber(), ecorePackage.getEInt(), "fareTableNumber", null, 0, 1, LegacyRouteFare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacySeriesEClass, LegacySeries.class, "LegacySeries", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLegacySeries_Viastations(), this.getLegacyViastation(), null, "viastations", null, 0, -1, LegacySeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacySeries_Distance1(), theXMLTypePackage.getInt(), "distance1", null, 1, 1, LegacySeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacySeries_Pricetype(), this.getLegacyCalculationType(), "pricetype", null, 1, 1, LegacySeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacySeries_ValidFrom(), theXMLTypePackage.getDate(), "validFrom", null, 1, 1, LegacySeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacySeries_ValidUntil(), theXMLTypePackage.getDate(), "validUntil", null, 1, 1, LegacySeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacySeries_Pricing(), theXMLTypePackage.getString(), "pricing", null, 0, 1, LegacySeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacySeries_Type(), this.getLegacySeriesType(), "type", null, 0, 1, LegacySeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacySeries_Number(), ecorePackage.getEInt(), "number", null, 0, 1, LegacySeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacySeries_FromStation(), ecorePackage.getEInt(), "fromStation", null, 0, 1, LegacySeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacySeries_ToStation(), ecorePackage.getEInt(), "toStation", null, 0, 1, LegacySeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacySeries_Distance2(), ecorePackage.getEInt(), "distance2", null, 0, 1, LegacySeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacyViastationEClass, LegacyViastation.class, "LegacyViastation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegacyViastation_Position(), theXMLTypePackage.getInt(), "position", null, 1, 1, LegacyViastation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacyViastation_Code(), theXMLTypePackage.getInt(), "code", null, 1, 1, LegacyViastation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacyStationMapEClass, LegacyStationMap.class, "LegacyStationMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegacyStationMap_LegacyCode(), ecorePackage.getEInt(), "legacyCode", null, 0, 1, LegacyStationMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegacyStationMap_Station(), this.getStation(), null, "station", null, 0, 1, LegacyStationMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carrierConstraintEClass, CarrierConstraint.class, "CarrierConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCarrierConstraint_Id(), ecorePackage.getEString(), "id", null, 0, 1, CarrierConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCarrierConstraint_IncludedCarriers(), this.getCarrier(), null, "includedCarriers", null, 0, -1, CarrierConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCarrierConstraint_ExcludedCarriers(), this.getCarrier(), null, "excludedCarriers", null, 0, -1, CarrierConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(countryEClass, Country.class, "Country", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCountry_Code(), ecorePackage.getEInt(), "code", null, 0, 1, Country.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCountry_Name(), ecorePackage.getEString(), "name", null, 0, 1, Country.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionPointEClass, ConnectionPoint.class, "ConnectionPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionPoint_Stations(), this.getStation(), null, "stations", null, 0, -1, ConnectionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionPoint_Id(), ecorePackage.getEString(), "id", null, 0, 1, ConnectionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(currencyEClass, Currency.class, "Currency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCurrency_Name(), ecorePackage.getEString(), "name", null, 0, 1, Currency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrency_IsoCode(), ecorePackage.getEString(), "isoCode", null, 0, 1, Currency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(currencyPriceEClass, CurrencyPrice.class, "CurrencyPrice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCurrencyPrice_Currency(), this.getCurrency(), null, "currency", null, 0, 1, CurrencyPrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrencyPrice_Amount(), ecorePackage.getEFloat(), "amount", null, 0, 1, CurrencyPrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurrencyPrice_VATdetails(), this.getVATDetail(), null, "VATdetails", null, 0, -1, CurrencyPrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageEClass, Language.class, "Language", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLanguage_Name(), ecorePackage.getEString(), "name", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguage_Code(), ecorePackage.getEString(), "code", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(priceEClass, Price.class, "Price", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrice_Id(), ecorePackage.getEString(), "id", null, 0, 1, Price.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrice_Currencies(), this.getCurrencyPrice(), null, "currencies", null, 0, -1, Price.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reductionCardEClass, ReductionCard.class, "ReductionCard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReductionCard_Id(), ecorePackage.getEString(), "id", null, 0, 1, ReductionCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReductionCard_CardIssuer(), this.getCarrier(), null, "cardIssuer", null, 1, 1, ReductionCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReductionCard_Name(), this.getText(), null, "name", null, 0, 1, ReductionCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReductionCard_ServiceClasses(), this.getServiceClass(), null, "serviceClasses", null, 0, -1, ReductionCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regionalConstraintEClass, RegionalConstraint.class, "RegionalConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegionalConstraint_Id(), ecorePackage.getEString(), "id", null, 0, 1, RegionalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegionalConstraint_Distance(), ecorePackage.getEInt(), "distance", null, 0, 1, RegionalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegionalConstraint_EntryConnectionPoint(), this.getConnectionPoint(), null, "entryConnectionPoint", null, 0, 1, RegionalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegionalConstraint_ExitConnectionPoint(), this.getConnectionPoint(), null, "exitConnectionPoint", null, 0, 1, RegionalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegionalConstraint_RegionalValidity(), this.getRegionalValidity(), null, "regionalValidity", null, 0, -1, RegionalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reservationParameterEClass, ReservationParameter.class, "ReservationParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReservationParameter_OptionalReservation(), ecorePackage.getEBoolean(), "optionalReservation", null, 0, 1, ReservationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservationParameter_Id(), ecorePackage.getEString(), "id", null, 0, 1, ReservationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReservationParameter_Params9181(), this.getReservationParams9181(), null, "params9181", null, 0, 1, ReservationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReservationParameter_Options(), this.getReservationOptions(), null, "options", null, 0, 1, ReservationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reservationParams9181EClass, ReservationParams9181.class, "ReservationParams9181", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReservationParams9181_TravelClass(), this.getReservationTravelClass(), "travelClass", null, 0, 1, ReservationParams9181.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservationParams9181_ServiceLevel(), this.getReservationServiceLevel(), "serviceLevel", null, 0, 1, ReservationParams9181.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservationParams9181_Service(), this.getReservationService(), "service", null, 0, 1, ReservationParams9181.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservationParams9181_BerthType(), this.getReservationBerthType(), "berthType", null, 0, 1, ReservationParams9181.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservationParams9181_CoachType(), ecorePackage.getEInt(), "coachType", null, 0, 1, ReservationParams9181.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservationParams9181_CompartmentType(), ecorePackage.getEInt(), "compartmentType", null, 0, 1, ReservationParams9181.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservationParams9181_Tariff(), ecorePackage.getEInt(), "tariff", null, 0, 1, ReservationParams9181.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reservationOptionsEClass, ReservationOptions.class, "ReservationOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReservationOptions_Preferences(), this.getReservationPreference(), null, "preferences", null, 0, -1, ReservationOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReservationOptions_ServiceBrands(), this.getServiceBrand(), null, "serviceBrands", null, 0, -1, ReservationOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservationOptions_GraphicalReservation(), this.getGraphicalReservationType(), "graphicalReservation", null, 0, 1, ReservationOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reservationPreferenceEClass, ReservationPreference.class, "ReservationPreference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReservationPreference_Preference(), ecorePackage.getEString(), "preference", null, 1, 1, ReservationPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservationPreference_Group(), ecorePackage.getEString(), "group", null, 0, 1, ReservationPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceClassEClass, ServiceClass.class, "ServiceClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceClass_Id(), ecorePackage.getEString(), "id", null, 0, 1, ServiceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceClass_ClassicClass(), this.getClassicClassType(), "classicClass", null, 0, 1, ServiceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceClass_Text(), this.getText(), null, "text", null, 0, 1, ServiceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceLevelEClass, ServiceLevel.class, "ServiceLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceLevel_Id(), ecorePackage.getEString(), "id", null, 0, 1, ServiceLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceLevel_Text(), this.getText(), null, "text", null, 1, 1, ServiceLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceLevel_CombiningServiceClasses(), this.getServiceClass(), null, "combiningServiceClasses", null, 0, -1, ServiceLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceLevel_ReservationParameter(), this.getReservationParameter(), null, "reservationParameter", null, 0, 1, ServiceLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceLevel_IncludesClassName(), ecorePackage.getEBoolean(), "includesClassName", null, 0, 1, ServiceLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceConstraintEClass, ServiceConstraint.class, "ServiceConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceConstraint_Id(), ecorePackage.getEString(), "id", null, 0, 1, ServiceConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceConstraint_IncludedServiceBrands(), this.getServiceBrand(), null, "includedServiceBrands", null, 0, -1, ServiceConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceConstraint_ExcludedServiceBrands(), this.getServiceBrand(), null, "excludedServiceBrands", null, 0, -1, ServiceConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stationEClass, Station.class, "Station", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Station.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStation_Country(), this.getCountry(), null, "country", null, 0, 1, Station.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stationsTypeEClass, StationsType.class, "StationsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStationsType_Code(), theXMLTypePackage.getInt(), "code", null, 1, 1, StationsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStationsType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, StationsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetFareTemplateEClass, TargetFareTemplate.class, "TargetFareTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTargetFareTemplate_PriceFactor(), theXMLTypePackage.getFloat(), "priceFactor", null, 1, 1, TargetFareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTargetFareTemplate_Id(), ecorePackage.getEString(), "id", null, 0, 1, TargetFareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTargetFareTemplate_Type(), this.getFareType(), "type", null, 0, 1, TargetFareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTargetFareTemplate_DataDescription(), ecorePackage.getEString(), "dataDescription", null, 0, 1, TargetFareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetFareTemplate_Text(), this.getText(), null, "text", null, 0, 1, TargetFareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetFareTemplate_ServiceConstraint(), this.getServiceConstraint(), null, "serviceConstraint", null, 0, 1, TargetFareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetFareTemplate_CarrierConstraint(), this.getCarrierConstraint(), null, "carrierConstraint", null, 0, 1, TargetFareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetFareTemplate_ServiceClass(), this.getServiceClass(), null, "serviceClass", null, 0, 1, TargetFareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetFareTemplate_ServiceLevel(), this.getServiceLevel(), null, "serviceLevel", null, 0, 1, TargetFareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetFareTemplate_SalesAvailability(), this.getSalesAvailabilityConstraint(), null, "salesAvailability", null, 0, 1, TargetFareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetFareTemplate_TravelValidity(), this.getTravelValidityConstraint(), null, "travelValidity", null, 0, 1, TargetFareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetFareTemplate_CombinationConstraint(), this.getCombinationConstraint(), null, "combinationConstraint", null, 0, 1, TargetFareTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(travelValidityConstraintEClass, TravelValidityConstraint.class, "TravelValidityConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTravelValidityConstraint_Id(), ecorePackage.getEString(), "id", null, 0, 1, TravelValidityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTravelValidityConstraint_DataDescription(), ecorePackage.getEString(), "dataDescription", null, 0, 1, TravelValidityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTravelValidityConstraint_ValidDays(), this.getCalendar(), null, "validDays", null, 0, 1, TravelValidityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTravelValidityConstraint_ExcludedTimeRange(), this.getTimeRangeScope(), "excludedTimeRange", null, 0, 1, TravelValidityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTravelValidityConstraint_TravelDays(), ecorePackage.getEInt(), "travelDays", null, 0, 1, TravelValidityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTravelValidityConstraint_Range(), this.getValidityRange(), null, "range", null, 0, 1, TravelValidityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTravelValidityConstraint_ReturnConstraint(), this.getReturnValidityConstraint(), null, "returnConstraint", null, 0, 1, TravelValidityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(vatDetailEClass, VATDetail.class, "VATDetail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVATDetail_Amount(), ecorePackage.getEFloat(), "amount", null, 0, 1, VATDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVATDetail_Percentage(), ecorePackage.getEFloat(), "percentage", null, 0, 1, VATDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVATDetail_Country(), this.getCountry(), null, "country", null, 1, 1, VATDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVATDetail_TaxId(), ecorePackage.getEString(), "taxId", null, 0, 1, VATDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVATDetail_Scope(), this.getTaxScope(), "scope", null, 0, 1, VATDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(serviceBrandEClass, ServiceBrand.class, "ServiceBrand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceBrand_Code(), ecorePackage.getEInt(), "code", null, 0, 1, ServiceBrand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceBrand_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServiceBrand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceBrand_Abbreviation(), ecorePackage.getEString(), "abbreviation", null, 0, 1, ServiceBrand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(salesAvailabilityConstraintEClass, SalesAvailabilityConstraint.class, "SalesAvailabilityConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSalesAvailabilityConstraint_Id(), ecorePackage.getEString(), "id", null, 0, 1, SalesAvailabilityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesAvailabilityConstraint_DataDescription(), ecorePackage.getEString(), "dataDescription", null, 0, 1, SalesAvailabilityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSalesAvailabilityConstraint_Restrictions(), this.getSalesRestriction(), null, "restrictions", null, 0, -1, SalesAvailabilityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(salesRestrictionEClass, SalesRestriction.class, "SalesRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSalesRestriction_SalesDates(), this.getCalendar(), null, "salesDates", null, 0, 1, SalesRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSalesRestriction_StartOfSale(), this.getTimeReference(), null, "startOfSale", null, 0, 1, SalesRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSalesRestriction_EndOfSale(), this.getTimeReference(), null, "endOfSale", null, 0, 1, SalesRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeReferenceEClass, TimeReference.class, "TimeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeReference_RefereceType(), this.getTimeReferenceType(), "refereceType", null, 0, 1, TimeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeReference_Unit(), this.getTimeUnit(), "unit", null, 0, 1, TimeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeReference_Value(), ecorePackage.getEInt(), "value", null, 0, 1, TimeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(combinationConstraintEClass, CombinationConstraint.class, "CombinationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCombinationConstraint_Id(), ecorePackage.getEString(), "id", null, 0, 1, CombinationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCombinationConstraint_DataDescription(), ecorePackage.getEString(), "dataDescription", null, 0, 1, CombinationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCombinationConstraint_CombinationModels(), this.getFareCombinationModel(), null, "combinationModels", null, 0, -1, CombinationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(validityRangeEClass, ValidityRange.class, "ValidityRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValidityRange_Unit(), this.getTimeUnit(), "unit", null, 0, 1, ValidityRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValidityRange_Value(), ecorePackage.getEInt(), "value", null, 0, 1, ValidityRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValidityRange_HoursAfterMidnight(), ecorePackage.getEInt(), "hoursAfterMidnight", null, 0, 1, ValidityRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeRangeEClass, TimeRange.class, "TimeRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeRange_Scope(), this.getTimeRangeScope(), "scope", null, 0, 1, TimeRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeRange_From(), ecorePackage.getEInt(), "from", null, 0, 1, TimeRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeRange_Until(), ecorePackage.getEInt(), "until", null, 0, 1, TimeRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnValidityConstraintEClass, ReturnValidityConstraint.class, "ReturnValidityConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReturnValidityConstraint_ExcludedWeekdays(), this.getWeekDay(), "excludedWeekdays", null, 0, -1, ReturnValidityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnValidityConstraint_LatestReturn(), ecorePackage.getEInt(), "latestReturn", null, 0, 1, ReturnValidityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnValidityConstraint_EarliestReturn(), ecorePackage.getEInt(), "earliestReturn", null, 0, 1, ReturnValidityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fareCombinationModelEClass, FareCombinationModel.class, "FareCombinationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFareCombinationModel_Model(), this.getCombinationModel(), "model", null, 0, 1, FareCombinationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareCombinationModel_CombinableCarriers(), this.getCarrier(), null, "combinableCarriers", null, 0, -1, FareCombinationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFareCombinationModel_OnlyWhenCombined(), ecorePackage.getEBoolean(), "onlyWhenCombined", null, 0, 1, FareCombinationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareCombinationModel_AllowedAllocators(), this.getCarrier(), null, "allowedAllocators", null, 0, -1, FareCombinationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFareCombinationModel_ReferenceCluster(), this.getClusters(), "referenceCluster", null, 0, 1, FareCombinationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFareCombinationModel_AllowedClusters(), this.getClusters(), "allowedClusters", null, 0, -1, FareCombinationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareCombinationModel_AllowedCommonContracts(), this.getCarrier(), null, "allowedCommonContracts", null, 0, -1, FareCombinationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regionalValidityEClass, RegionalValidity.class, "RegionalValidity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegionalValidity_SeqNb(), ecorePackage.getEInt(), "seqNb", null, 0, 1, RegionalValidity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegionalValidity_ViaStation(), this.getViaStation(), null, "viaStation", null, 0, -1, RegionalValidity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegionalValidity_Zone(), this.getZone(), null, "zone", null, 0, -1, RegionalValidity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegionalValidity_Line(), this.getLine(), null, "line", null, 0, -1, RegionalValidity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegionalValidity_Polygone(), this.getPolygone(), null, "polygone", null, 0, -1, RegionalValidity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viaStationEClass, ViaStation.class, "ViaStation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViaStation_Station(), this.getStation(), null, "station", null, 0, 1, ViaStation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViaStation_Route(), this.getViaStation(), null, "route", null, 0, 1, ViaStation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViaStation_AlternativeRoutes(), this.getViaStation(), null, "alternativeRoutes", null, 0, -1, ViaStation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViaStation_Carrier(), this.getCarrier(), null, "carrier", null, 0, 1, ViaStation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zoneEClass, Zone.class, "Zone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZone_BinaryZoneId(), theXMLTypePackage.getBase64Binary(), "binaryZoneId", null, 0, 1, Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZone_ZoneId(), ecorePackage.getEString(), "zoneId", null, 0, -1, Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZone_Carrier(), this.getCarrier(), null, "carrier", null, 0, 1, Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZone_EntryStation(), this.getStation(), null, "entryStation", null, 0, 1, Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZone_TerminalStation(), this.getStation(), null, "terminalStation", null, 0, 1, Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZone_NutsCode(), this.getNutsCode(), null, "nutsCode", null, 0, 1, Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZone_City(), ecorePackage.getEInt(), "city", null, 0, 1, Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nutsCodeEClass, NutsCode.class, "NutsCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNutsCode_Name(), ecorePackage.getEString(), "name", null, 0, 1, NutsCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNutsCode_Code(), ecorePackage.getEString(), "code", null, 0, 1, NutsCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineEClass, Line.class, "Line", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLine_BinaryZoneId(), theXMLTypePackage.getBase64Binary(), "binaryZoneId", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLine_LineId(), ecorePackage.getEString(), "lineId", null, 0, -1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLine_Carrier(), this.getCarrier(), null, "carrier", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLine_EntryStation(), this.getStation(), null, "entryStation", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLine_TerminalStation(), this.getStation(), null, "terminalStation", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLine_NutsCode(), this.getNutsCode(), null, "nutsCode", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLine_City(), ecorePackage.getEInt(), "city", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(polygoneEClass, Polygone.class, "Polygone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolygone_Egde(), this.getEdge(), null, "egde", null, 0, -1, Polygone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeEClass, Edge.class, "Edge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEdge_System(), this.getGeoSystem(), "system", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdge_EastWest(), this.getHemisphereEW(), "eastWest", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdge_NorthSouth(), this.getHemisphereNS(), "northSouth", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdge_Unit(), this.getGeoUnit(), "unit", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdge_Accuracy(), this.getGeoUnit(), "accuracy", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdge_Longitude(), ecorePackage.getELong(), "longitude", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdge_Latitude(), ecorePackage.getELong(), "latitude", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(passengerConstraintEClass, PassengerConstraint.class, "PassengerConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPassengerConstraint_Id(), ecorePackage.getEString(), "id", null, 0, 1, PassengerConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerConstraint_TravelerType(), this.getTravelerType(), "travelerType", null, 0, 1, PassengerConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPassengerConstraint_Text(), this.getText(), null, "text", null, 0, 1, PassengerConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerConstraint_UpperAgeLimit(), ecorePackage.getEInt(), "upperAgeLimit", null, 0, 1, PassengerConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerConstraint_LowerAgeLimit(), ecorePackage.getEInt(), "lowerAgeLimit", null, 0, 1, PassengerConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerConstraint_TravelAloneAgeLimit(), ecorePackage.getEInt(), "travelAloneAgeLimit", null, 0, 1, PassengerConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerConstraint_ReservationAgeLimit(), ecorePackage.getEInt(), "reservationAgeLimit", null, 0, 1, PassengerConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerConstraint_IsAncilliary(), ecorePackage.getEBoolean(), "isAncilliary", "false", 0, 1, PassengerConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerConstraint_PassengerWeight(), ecorePackage.getEInt(), "passengerWeight", null, 0, 1, PassengerConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerConstraint_MaxTotalPassengerWeight(), ecorePackage.getEInt(), "maxTotalPassengerWeight", null, 0, 1, PassengerConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerConstraint_MinTotalPassengerWeight(), ecorePackage.getEInt(), "minTotalPassengerWeight", null, 0, 1, PassengerConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPassengerConstraint_IncludedFreePassengers(), this.getPassengerCombinationConstraint(), null, "includedFreePassengers", null, 0, -1, PassengerConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPassengerConstraint_ExcludedPassengerCombinations(), this.getPassengerCombinationConstraint(), null, "excludedPassengerCombinations", null, 0, -1, PassengerConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(passengerCombinationConstraintEClass, PassengerCombinationConstraint.class, "PassengerCombinationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPassengerCombinationConstraint_MaxNumber(), ecorePackage.getEInt(), "maxNumber", null, 0, 1, PassengerCombinationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPassengerCombinationConstraint_PassengerType(), this.getPassengerConstraint(), null, "passengerType", null, 0, 1, PassengerCombinationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relativeTimeEClass, RelativeTime.class, "RelativeTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelativeTime_Unit(), this.getTimeUnit(), "unit", null, 0, 1, RelativeTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelativeTime_Reference(), this.getTimeReferenceType(), "reference", null, 0, 1, RelativeTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelativeTime_Value(), ecorePackage.getEInt(), "value", null, 0, 1, RelativeTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zoneDefinitionEClass, ZoneDefinition.class, "ZoneDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZoneDefinition_ZoneId(), ecorePackage.getEString(), "zoneId", null, 0, 1, ZoneDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZoneDefinition_Id(), ecorePackage.getEString(), "id", null, 0, 1, ZoneDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZoneDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, ZoneDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZoneDefinition_Stations(), this.getStation(), null, "stations", null, 0, -1, ZoneDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(afterSalesConditionEClass, AfterSalesCondition.class, "AfterSalesCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAfterSalesCondition_TransactionType(), this.getAfterSalesTransactionType(), "transactionType", null, 0, 1, AfterSalesCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAfterSalesCondition_IndividualContracts(), ecorePackage.getEBoolean(), "individualContracts", "false", 0, 1, AfterSalesCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAfterSalesCondition_CarrierFee(), ecorePackage.getEBoolean(), "carrierFee", "false", 0, 1, AfterSalesCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAfterSalesCondition_Fee(), this.getPrice(), null, "fee", null, 0, 1, AfterSalesCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAfterSalesCondition_ApplicationTime(), this.getRelativeTime(), null, "applicationTime", null, 0, 1, AfterSalesCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(afterSalesRuleEClass, AfterSalesRule.class, "AfterSalesRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAfterSalesRule_Id(), ecorePackage.getEString(), "id", null, 0, 1, AfterSalesRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAfterSalesRule_Conditions(), this.getAfterSalesCondition(), null, "conditions", null, 0, -1, AfterSalesRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personalDataConstraintEClass, PersonalDataConstraint.class, "PersonalDataConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonalDataConstraint_Id(), ecorePackage.getEString(), "id", null, 0, 1, PersonalDataConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonalDataConstraint_RequiredPersonalData(), this.getRequiredPersonalData(), null, "requiredPersonalData", null, 0, -1, PersonalDataConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonalDataConstraint_AllowedChanges(), this.getAllowedPersonalDataChanges(), null, "allowedChanges", null, 0, -1, PersonalDataConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredPersonalDataEClass, RequiredPersonalData.class, "RequiredPersonalData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequiredPersonalData_TicketHolderOnly(), ecorePackage.getEBoolean(), "ticketHolderOnly", "true", 0, 1, RequiredPersonalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequiredPersonalData_DataItem(), this.getPersonalDataItemsType(), "dataItem", null, 0, 1, RequiredPersonalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequiredPersonalData_Transfer(), this.getPersonalDataTransferType(), "transfer", null, 0, 1, RequiredPersonalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequiredPersonalData_FulfillmentType(), this.getFulfillmentType(), "fulfillmentType", null, 0, -1, RequiredPersonalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequiredPersonalData_CrossBorder(), this.getCrossBorderCondition(), null, "crossBorder", null, 0, -1, RequiredPersonalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(crossBorderConditionEClass, CrossBorderCondition.class, "CrossBorderCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCrossBorderCondition_FromCountry(), this.getCountry(), null, "fromCountry", null, 0, 1, CrossBorderCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrossBorderCondition_ToCountry(), this.getCountry(), null, "toCountry", null, 0, 1, CrossBorderCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrossBorderCondition_AffectedServiceBrands(), this.getServiceBrand(), null, "affectedServiceBrands", null, 0, 1, CrossBorderCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allowedPersonalDataChangesEClass, AllowedPersonalDataChanges.class, "AllowedPersonalDataChanges", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAllowedPersonalDataChanges_TimeLimit(), ecorePackage.getEInt(), "timeLimit", null, 0, 1, AllowedPersonalDataChanges.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllowedPersonalDataChanges_AcceptedReason(), this.getPersonalDataChangeReason(), "acceptedReason", null, 0, 1, AllowedPersonalDataChanges.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reductionConstraintEClass, ReductionConstraint.class, "ReductionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReductionConstraint_Id(), ecorePackage.getEString(), "id", null, 0, 1, ReductionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReductionConstraint_RequiredReductionCards(), this.getRequiredReductionCard(), null, "requiredReductionCards", null, 0, -1, ReductionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredReductionCardEClass, RequiredReductionCard.class, "RequiredReductionCard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredReductionCard_CardClass(), this.getServiceClass(), null, "cardClass", null, 0, 1, RequiredReductionCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequiredReductionCard_Card(), this.getReductionCard(), null, "card", null, 1, 1, RequiredReductionCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequiredReductionCard_Name(), ecorePackage.getEString(), "name", null, 0, 1, RequiredReductionCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fulfillmentConstraintEClass, FulfillmentConstraint.class, "FulfillmentConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFulfillmentConstraint_Id(), ecorePackage.getEString(), "id", null, 0, 1, FulfillmentConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFulfillmentConstraint_AcceptedFulfilmentTypes(), this.getFulfillmentType(), "acceptedFulfilmentTypes", null, 0, -1, FulfillmentConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFulfillmentConstraint_AcceptedBarcodes(), this.getBarcodeTypes(), "acceptedBarcodes", null, 0, -1, FulfillmentConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFulfillmentConstraint_RequiredControlDataExchange(), this.getControlDataExchangeTypes(), "requiredControlDataExchange", null, 0, -1, FulfillmentConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFulfillmentConstraint_IndividualTicketingPermitted(), ecorePackage.getEBoolean(), "individualTicketingPermitted", "false", 0, 1, FulfillmentConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fareResourceLocationEClass, FareResourceLocation.class, "FareResourceLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFareResourceLocation_Id(), ecorePackage.getEString(), "id", null, 0, 1, FareResourceLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareResourceLocation_CarrierResourceLocations(), this.getCarrierResourceLocation(), null, "carrierResourceLocations", null, 0, -1, FareResourceLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareResourceLocation_StationResourceLocations(), this.getStationResourceLocation(), null, "stationResourceLocations", null, 0, -1, FareResourceLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareResourceLocation_TrainResourceLocations(), this.getTrainResourceLocation(), null, "trainResourceLocations", null, 0, -1, FareResourceLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trainResourceLocationEClass, TrainResourceLocation.class, "TrainResourceLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrainResourceLocation_Carrier(), this.getCarrier(), null, "carrier", null, 1, 1, TrainResourceLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrainResourceLocation_OnlineResources(), this.getOnlineResource(), null, "onlineResources", null, 0, -1, TrainResourceLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrainResourceLocation_TrainId(), ecorePackage.getEString(), "trainId", null, 0, 1, TrainResourceLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carrierResourceLocationEClass, CarrierResourceLocation.class, "CarrierResourceLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCarrierResourceLocation_Carrier(), this.getCarrier(), null, "carrier", null, 1, 1, CarrierResourceLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCarrierResourceLocation_ServiceBrand(), this.getServiceBrand(), null, "serviceBrand", null, 0, 1, CarrierResourceLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCarrierResourceLocation_OnlineResources(), this.getOnlineResource(), null, "onlineResources", null, 0, -1, CarrierResourceLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stationResourceLocationEClass, StationResourceLocation.class, "StationResourceLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStationResourceLocation_OnlineResources(), this.getOnlineResource(), null, "onlineResources", null, 0, -1, StationResourceLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStationResourceLocation_Stations(), this.getStation(), null, "stations", null, 0, -1, StationResourceLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStationResourceLocation_ConnectionPoints(), this.getConnectionPoint(), null, "connectionPoints", null, 0, -1, StationResourceLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onlineResourceEClass, OnlineResource.class, "OnlineResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOnlineResource_OfferRequestType(), this.getOfferRequestType(), "offerRequestType", null, 0, 1, OnlineResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOnlineResource_InterfaceType(), this.getInterfaceType(), "interfaceType", null, 0, 1, OnlineResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOnlineResource_Version(), ecorePackage.getEString(), "version", null, 0, 1, OnlineResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOnlineResource_System(), ecorePackage.getEString(), "system", null, 0, 1, OnlineResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
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

		initEEnum(graphicalReservationTypeEEnum, GraphicalReservationType.class, "GraphicalReservationType");
		addEEnumLiteral(graphicalReservationTypeEEnum, GraphicalReservationType.IRS90918_1);
		addEEnumLiteral(graphicalReservationTypeEEnum, GraphicalReservationType.GTM);
		addEEnumLiteral(graphicalReservationTypeEEnum, GraphicalReservationType.NONE);

		initEEnum(legacyCalculationTypeEEnum, LegacyCalculationType.class, "LegacyCalculationType");
		addEEnumLiteral(legacyCalculationTypeEEnum, LegacyCalculationType.DISTANCE_BASED);
		addEEnumLiteral(legacyCalculationTypeEEnum, LegacyCalculationType.ROUTE_BASED);

		initEEnum(legacySeriesTypeEEnum, LegacySeriesType.class, "LegacySeriesType");
		addEEnumLiteral(legacySeriesTypeEEnum, LegacySeriesType.BORDER_DESTINATION);
		addEEnumLiteral(legacySeriesTypeEEnum, LegacySeriesType.TRANSIT);
		addEEnumLiteral(legacySeriesTypeEEnum, LegacySeriesType.STATION_STATION);

		initEEnum(classicClassTypeEEnum, ClassicClassType.class, "ClassicClassType");
		addEEnumLiteral(classicClassTypeEEnum, ClassicClassType.FIRST);
		addEEnumLiteral(classicClassTypeEEnum, ClassicClassType.SECOND);

		initEEnum(taxScopeEEnum, TaxScope.class, "TaxScope");
		addEEnumLiteral(taxScopeEEnum, TaxScope.INTERNALTIONAL);
		addEEnumLiteral(taxScopeEEnum, TaxScope.NATIONAL);
		addEEnumLiteral(taxScopeEEnum, TaxScope.SHORT_DISTANCE);
		addEEnumLiteral(taxScopeEEnum, TaxScope.LONG_DISTANCE);
		addEEnumLiteral(taxScopeEEnum, TaxScope.ANY);

		initEEnum(fareTypeEEnum, FareType.class, "FareType");
		addEEnumLiteral(fareTypeEEnum, FareType.NRT);
		addEEnumLiteral(fareTypeEEnum, FareType.IRT);
		addEEnumLiteral(fareTypeEEnum, FareType.RES);
		addEEnumLiteral(fareTypeEEnum, FareType.RPT);

		initEEnum(reservationTravelClassEEnum, ReservationTravelClass.class, "ReservationTravelClass");
		addEEnumLiteral(reservationTravelClassEEnum, ReservationTravelClass.FIRST);
		addEEnumLiteral(reservationTravelClassEEnum, ReservationTravelClass.SECOND);
		addEEnumLiteral(reservationTravelClassEEnum, ReservationTravelClass.C);
		addEEnumLiteral(reservationTravelClassEEnum, ReservationTravelClass.P);
		addEEnumLiteral(reservationTravelClassEEnum, ReservationTravelClass.T);

		initEEnum(reservationServiceLevelEEnum, ReservationServiceLevel.class, "ReservationServiceLevel");
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.A);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.B);
		addEEnumLiteral(reservationServiceLevelEEnum, ReservationServiceLevel.RO);

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

		initEEnum(weekDayEEnum, WeekDay.class, "WeekDay");
		addEEnumLiteral(weekDayEEnum, WeekDay.MONDAY);
		addEEnumLiteral(weekDayEEnum, WeekDay.TUESDAY);
		addEEnumLiteral(weekDayEEnum, WeekDay.WEDNESDAY);
		addEEnumLiteral(weekDayEEnum, WeekDay.THURSDAY);
		addEEnumLiteral(weekDayEEnum, WeekDay.FRIDAY);
		addEEnumLiteral(weekDayEEnum, WeekDay.SATURDAY);
		addEEnumLiteral(weekDayEEnum, WeekDay.SUNDAY);

		initEEnum(combinationModelEEnum, CombinationModel.class, "CombinationModel");
		addEEnumLiteral(combinationModelEEnum, CombinationModel.SEPARATE_TICKET);
		addEEnumLiteral(combinationModelEEnum, CombinationModel.SEPARATE_CONTRACT);
		addEEnumLiteral(combinationModelEEnum, CombinationModel.CLUSTERING);
		addEEnumLiteral(combinationModelEEnum, CombinationModel.COMBINING);

		initEEnum(clustersEEnum, Clusters.class, "Clusters");
		addEEnumLiteral(clustersEEnum, Clusters.BUSINESS);
		addEEnumLiteral(clustersEEnum, Clusters.FULLFLEX);
		addEEnumLiteral(clustersEEnum, Clusters.SEMIFLEX);
		addEEnumLiteral(clustersEEnum, Clusters.NONFLEX);
		addEEnumLiteral(clustersEEnum, Clusters.PROMO);

		initEEnum(geoSystemEEnum, GeoSystem.class, "GeoSystem");
		addEEnumLiteral(geoSystemEEnum, GeoSystem.WGS84);
		addEEnumLiteral(geoSystemEEnum, GeoSystem.GRS80);

		initEEnum(geoUnitEEnum, GeoUnit.class, "GeoUnit");
		addEEnumLiteral(geoUnitEEnum, GeoUnit.MICRO_DEGREE);
		addEEnumLiteral(geoUnitEEnum, GeoUnit.TENTHMILLI_DEGREE);
		addEEnumLiteral(geoUnitEEnum, GeoUnit.MILLI_DEGREE);
		addEEnumLiteral(geoUnitEEnum, GeoUnit.CENTI_DEGREE);
		addEEnumLiteral(geoUnitEEnum, GeoUnit.DECI_DEGREE);

		initEEnum(hemisphereEWEEnum, HemisphereEW.class, "HemisphereEW");
		addEEnumLiteral(hemisphereEWEEnum, HemisphereEW.EAST);
		addEEnumLiteral(hemisphereEWEEnum, HemisphereEW.WEST);

		initEEnum(hemisphereNSEEnum, HemisphereNS.class, "HemisphereNS");
		addEEnumLiteral(hemisphereNSEEnum, HemisphereNS.NORTH);
		addEEnumLiteral(hemisphereNSEEnum, HemisphereNS.SOUTH);

		initEEnum(legacyPassengerTypeEEnum, LegacyPassengerType.class, "LegacyPassengerType");
		addEEnumLiteral(legacyPassengerTypeEEnum, LegacyPassengerType.ADULT);
		addEEnumLiteral(legacyPassengerTypeEEnum, LegacyPassengerType.CHILD);

		initEEnum(travelerTypeEEnum, TravelerType.class, "TravelerType");
		addEEnumLiteral(travelerTypeEEnum, TravelerType.ADULT);
		addEEnumLiteral(travelerTypeEEnum, TravelerType.CHILD);
		addEEnumLiteral(travelerTypeEEnum, TravelerType.YOUTH);
		addEEnumLiteral(travelerTypeEEnum, TravelerType.SENIOR);
		addEEnumLiteral(travelerTypeEEnum, TravelerType.ACCOMP_PRM);
		addEEnumLiteral(travelerTypeEEnum, TravelerType.DOG);
		addEEnumLiteral(travelerTypeEEnum, TravelerType.LUGGAGE);
		addEEnumLiteral(travelerTypeEEnum, TravelerType.ACCOMP_DOG);
		addEEnumLiteral(travelerTypeEEnum, TravelerType.CAR);
		addEEnumLiteral(travelerTypeEEnum, TravelerType.BICYCLE);
		addEEnumLiteral(travelerTypeEEnum, TravelerType.MOTOCYCLE);
		addEEnumLiteral(travelerTypeEEnum, TravelerType.TRAILER);
		addEEnumLiteral(travelerTypeEEnum, TravelerType.GRAPHICAL_RES);
		addEEnumLiteral(travelerTypeEEnum, TravelerType.OPT_RESERVATION);

		initEEnum(afterSalesTransactionTypeEEnum, AfterSalesTransactionType.class, "AfterSalesTransactionType");
		addEEnumLiteral(afterSalesTransactionTypeEEnum, AfterSalesTransactionType.REFUND);
		addEEnumLiteral(afterSalesTransactionTypeEEnum, AfterSalesTransactionType.EXCHANGE);
		addEEnumLiteral(afterSalesTransactionTypeEEnum, AfterSalesTransactionType.EXCHANGE_KEEP_CARRIER);
		addEEnumLiteral(afterSalesTransactionTypeEEnum, AfterSalesTransactionType.EXCHANGE_CHANGE_CARRIER);

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

		initEEnum(personalDataChangeReasonEEnum, PersonalDataChangeReason.class, "PersonalDataChangeReason");
		addEEnumLiteral(personalDataChangeReasonEEnum, PersonalDataChangeReason.IN_GENERAL);
		addEEnumLiteral(personalDataChangeReasonEEnum, PersonalDataChangeReason.MARRIAGE);
		addEEnumLiteral(personalDataChangeReasonEEnum, PersonalDataChangeReason.DOCUMENT_EXCHANGE);
		addEEnumLiteral(personalDataChangeReasonEEnum, PersonalDataChangeReason.AGENT_ERROR);

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

		initEEnum(fulfillmentTypeEEnum, FulfillmentType.class, "FulfillmentType");
		addEEnumLiteral(fulfillmentTypeEEnum, FulfillmentType.SID);
		addEEnumLiteral(fulfillmentTypeEEnum, FulfillmentType.SIP);
		addEEnumLiteral(fulfillmentTypeEEnum, FulfillmentType.SIS);

		initEEnum(barcodeTypesEEnum, BarcodeTypes.class, "BarcodeTypes");
		addEEnumLiteral(barcodeTypesEEnum, BarcodeTypes.FCB);
		addEEnumLiteral(barcodeTypesEEnum, BarcodeTypes.TLB);
		addEEnumLiteral(barcodeTypesEEnum, BarcodeTypes.SSB);

		initEEnum(controlDataExchangeTypesEEnum, ControlDataExchangeTypes.class, "ControlDataExchangeTypes");
		addEEnumLiteral(controlDataExchangeTypesEEnum, ControlDataExchangeTypes.IRS90918_4PEER2PEER);
		addEEnumLiteral(controlDataExchangeTypesEEnum, ControlDataExchangeTypes.IRS90918_4REGISTRY);
		addEEnumLiteral(controlDataExchangeTypesEEnum, ControlDataExchangeTypes.PROPRIETARY);

		initEEnum(offerRequestTypeEEnum, OfferRequestType.class, "OfferRequestType");
		addEEnumLiteral(offerRequestTypeEEnum, OfferRequestType.POINT2POINT);
		addEEnumLiteral(offerRequestTypeEEnum, OfferRequestType.AREA);

		initEEnum(interfaceTypeEEnum, InterfaceType.class, "InterfaceType");
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.IRS90918_1RESERVATION_BINARY);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.GTM);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.IRS90918_1RESERVATION_XML);

		// Create resource
		createResource(eNS_URI);
	}

} //GtmPackageImpl
