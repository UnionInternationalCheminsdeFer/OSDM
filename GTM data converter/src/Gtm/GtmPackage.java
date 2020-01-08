/**
 */
package Gtm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The feature id for the '<em><b>Carriers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTS__CARRIERS = 0;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTS__STATIONS = 1;

	/**
	 * The feature id for the '<em><b>Countries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTS__COUNTRIES = 2;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTS__LANGUAGES = 3;

	/**
	 * The feature id for the '<em><b>Currencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTS__CURRENCIES = 4;

	/**
	 * The feature id for the '<em><b>Service Brands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTS__SERVICE_BRANDS = 5;

	/**
	 * The feature id for the '<em><b>Nuts Codes</b></em>' containment reference list.
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
	 * The meta object id for the '{@link Gtm.impl.GeneralTariffModelImpl <em>General Tariff Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.GeneralTariffModelImpl
	 * @see Gtm.impl.GtmPackageImpl#getGeneralTariffModel()
	 * @generated
	 */
	int GENERAL_TARIFF_MODEL = 2;

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
	 * The meta object id for the '{@link Gtm.impl.ConversionFromLegacyImpl <em>Conversion From Legacy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ConversionFromLegacyImpl
	 * @see Gtm.impl.GtmPackageImpl#getConversionFromLegacy()
	 * @generated
	 */
	int CONVERSION_FROM_LEGACY = 3;

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
	 * The meta object id for the '{@link Gtm.impl.FareStructureImpl <em>Fare Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.FareStructureImpl
	 * @see Gtm.impl.GtmPackageImpl#getFareStructure()
	 * @generated
	 */
	int FARE_STRUCTURE = 4;

	/**
	 * The feature id for the '<em><b>Fare Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__FARE_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>After Sales Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__AFTER_SALES_RULES = 1;

	/**
	 * The feature id for the '<em><b>Calendars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__CALENDARS = 2;

	/**
	 * The feature id for the '<em><b>Service Class Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__SERVICE_CLASS_DEFINITIONS = 3;

	/**
	 * The feature id for the '<em><b>Prices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__PRICES = 4;

	/**
	 * The feature id for the '<em><b>Regional Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__REGIONAL_CONSTRAINTS = 5;

	/**
	 * The feature id for the '<em><b>Texts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__TEXTS = 6;

	/**
	 * The feature id for the '<em><b>Service Level Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__SERVICE_LEVEL_DEFINITIONS = 7;

	/**
	 * The feature id for the '<em><b>Reservation Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__RESERVATION_PARAMETERS = 8;

	/**
	 * The feature id for the '<em><b>Service Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__SERVICE_CONSTRAINTS = 9;

	/**
	 * The feature id for the '<em><b>Carrier Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__CARRIER_CONSTRAINTS = 10;

	/**
	 * The feature id for the '<em><b>Reduction Cards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__REDUCTION_CARDS = 11;

	/**
	 * The feature id for the '<em><b>Sales Availability Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__SALES_AVAILABILITY_CONSTRAINTS = 12;

	/**
	 * The feature id for the '<em><b>Travel Validity Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__TRAVEL_VALIDITY_CONSTRAINTS = 13;

	/**
	 * The feature id for the '<em><b>Combination Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__COMBINATION_CONSTRAINTS = 14;

	/**
	 * The feature id for the '<em><b>Passenger Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__PASSENGER_CONSTRAINTS = 15;

	/**
	 * The feature id for the '<em><b>Personal Data Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__PERSONAL_DATA_CONSTRAINTS = 16;

	/**
	 * The feature id for the '<em><b>Reduction Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__REDUCTION_CONSTRAINTS = 17;

	/**
	 * The feature id for the '<em><b>Zone Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__ZONE_DEFINITIONS = 18;

	/**
	 * The feature id for the '<em><b>Supported Online Services</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__SUPPORTED_ONLINE_SERVICES = 19;

	/**
	 * The feature id for the '<em><b>Fulfillment Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__FULFILLMENT_CONSTRAINT = 20;

	/**
	 * The feature id for the '<em><b>Fare Resource Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__FARE_RESOURCE_LOCATIONS = 21;

	/**
	 * The feature id for the '<em><b>Connection Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__CONNECTION_POINTS = 22;

	/**
	 * The number of structural features of the '<em>Fare Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE_FEATURE_COUNT = 23;

	/**
	 * The number of operations of the '<em>Fare Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.DeliveryImpl <em>Delivery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.DeliveryImpl
	 * @see Gtm.impl.GtmPackageImpl#getDelivery()
	 * @generated
	 */
	int DELIVERY = 5;

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
	 * The feature id for the '<em><b>Fare Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__FARE_PROVIDER = 3;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__OPTIONAL = 4;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__PROVIDER = 5;

	/**
	 * The number of structural features of the '<em>Delivery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Delivery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.BorderPointsImpl <em>Border Points</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.BorderPointsImpl
	 * @see Gtm.impl.GtmPackageImpl#getBorderPoints()
	 * @generated
	 */
	int BORDER_POINTS = 6;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_POINTS__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_POINTS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Station1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_POINTS__STATION1 = 2;

	/**
	 * The feature id for the '<em><b>Station2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_POINTS__STATION2 = 3;

	/**
	 * The number of structural features of the '<em>Border Points</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_POINTS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Border Points</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_POINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.CalendarImpl <em>Calendar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CalendarImpl
	 * @see Gtm.impl.GtmPackageImpl#getCalendar()
	 * @generated
	 */
	int CALENDAR = 7;

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
	 * The number of structural features of the '<em>Calendar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Calendar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.CarrierImpl <em>Carrier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CarrierImpl
	 * @see Gtm.impl.GtmPackageImpl#getCarrier()
	 * @generated
	 */
	int CARRIER = 8;

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
	 * The number of structural features of the '<em>Carrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Carrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.CoversionParamsImpl <em>Coversion Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CoversionParamsImpl
	 * @see Gtm.impl.GtmPackageImpl#getCoversionParams()
	 * @generated
	 */
	int COVERSION_PARAMS = 9;

	/**
	 * The feature id for the '<em><b>Border Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERSION_PARAMS__BORDER_POINTS = 0;

	/**
	 * The feature id for the '<em><b>Target Fares</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERSION_PARAMS__TARGET_FARES = 1;

	/**
	 * The feature id for the '<em><b>Station Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERSION_PARAMS__STATION_MAPPINGS = 2;

	/**
	 * The feature id for the '<em><b>Tax Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERSION_PARAMS__TAX_ID = 3;

	/**
	 * The feature id for the '<em><b>VA Tpercentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERSION_PARAMS__VA_TPERCENTAGE = 4;

	/**
	 * The feature id for the '<em><b>Tax Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERSION_PARAMS__TAX_COUNTRY = 5;

	/**
	 * The number of structural features of the '<em>Coversion Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERSION_PARAMS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Coversion Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERSION_PARAMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyDescriptionImpl <em>Legacy Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyDescriptionImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyDescription()
	 * @generated
	 */
	int LEGACY_DESCRIPTION = 10;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DESCRIPTION__LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DESCRIPTION__TEXT = 1;

	/**
	 * The number of structural features of the '<em>Legacy Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DESCRIPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Legacy Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyDistanceFareImpl <em>Legacy Distance Fare</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyDistanceFareImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyDistanceFare()
	 * @generated
	 */
	int LEGACY_DISTANCE_FARE = 11;

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
	 * The number of structural features of the '<em>Legacy Distance Fare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DISTANCE_FARE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Legacy Distance Fare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DISTANCE_FARE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyFaresImpl <em>Legacy Fares</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyFaresImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyFares()
	 * @generated
	 */
	int LEGACY_FARES = 12;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_FARES__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Legacy Fares</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_FARES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Legacy Fares</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_FARES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.Legacy108Impl <em>Legacy108</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.Legacy108Impl
	 * @see Gtm.impl.GtmPackageImpl#getLegacy108()
	 * @generated
	 */
	int LEGACY108 = 13;

	/**
	 * The feature id for the '<em><b>Carrier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108__CARRIER = 0;

	/**
	 * The feature id for the '<em><b>Series</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108__SERIES = 1;

	/**
	 * The feature id for the '<em><b>Fares</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108__FARES = 2;

	/**
	 * The feature id for the '<em><b>Distance Fare</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108__DISTANCE_FARE = 3;

	/**
	 * The feature id for the '<em><b>Route Fare</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108__ROUTE_FARE = 4;

	/**
	 * The number of structural features of the '<em>Legacy108</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Legacy108</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyRouteFareImpl <em>Legacy Route Fare</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyRouteFareImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyRouteFare()
	 * @generated
	 */
	int LEGACY_ROUTE_FARE = 14;

	/**
	 * The feature id for the '<em><b>Series Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ROUTE_FARE__SERIES_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Fare2nd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ROUTE_FARE__FARE2ND = 1;

	/**
	 * The feature id for the '<em><b>Fare1st</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ROUTE_FARE__FARE1ST = 2;

	/**
	 * The feature id for the '<em><b>Fare Table Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ROUTE_FARE__FARE_TABLE_NUMBER = 3;

	/**
	 * The number of structural features of the '<em>Legacy Route Fare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ROUTE_FARE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Legacy Route Fare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ROUTE_FARE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacySeriesImpl <em>Legacy Series</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacySeriesImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacySeries()
	 * @generated
	 */
	int LEGACY_SERIES = 15;

	/**
	 * The feature id for the '<em><b>Viastations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__VIASTATIONS = 0;

	/**
	 * The feature id for the '<em><b>Distance1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__DISTANCE1 = 1;

	/**
	 * The feature id for the '<em><b>Pricetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__PRICETYPE = 2;

	/**
	 * The feature id for the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__VALID_FROM = 3;

	/**
	 * The feature id for the '<em><b>Valid Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__VALID_UNTIL = 4;

	/**
	 * The feature id for the '<em><b>Pricing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__PRICING = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__TYPE = 6;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__NUMBER = 7;

	/**
	 * The feature id for the '<em><b>From Station</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__FROM_STATION = 8;

	/**
	 * The feature id for the '<em><b>To Station</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__TO_STATION = 9;

	/**
	 * The feature id for the '<em><b>Distance2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__DISTANCE2 = 10;

	/**
	 * The number of structural features of the '<em>Legacy Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Legacy Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyViastationImpl <em>Legacy Viastation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyViastationImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyViastation()
	 * @generated
	 */
	int LEGACY_VIASTATION = 16;

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
	 * The meta object id for the '{@link Gtm.impl.LegacyStationMapImpl <em>Legacy Station Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyStationMapImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyStationMap()
	 * @generated
	 */
	int LEGACY_STATION_MAP = 17;

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
	 * The meta object id for the '{@link Gtm.impl.StationsTypeImpl <em>Stations Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.StationsTypeImpl
	 * @see Gtm.impl.GtmPackageImpl#getStationsType()
	 * @generated
	 */
	int STATIONS_TYPE = 35;

	/**
	 * The meta object id for the '{@link Gtm.impl.TargetFareTemplateImpl <em>Target Fare Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.TargetFareTemplateImpl
	 * @see Gtm.impl.GtmPackageImpl#getTargetFareTemplate()
	 * @generated
	 */
	int TARGET_FARE_TEMPLATE = 36;

	/**
	 * The meta object id for the '{@link Gtm.impl.StationImpl <em>Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.StationImpl
	 * @see Gtm.impl.GtmPackageImpl#getStation()
	 * @generated
	 */
	int STATION = 34;

	/**
	 * The meta object id for the '{@link Gtm.impl.CountryImpl <em>Country</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CountryImpl
	 * @see Gtm.impl.GtmPackageImpl#getCountry()
	 * @generated
	 */
	int COUNTRY = 19;

	/**
	 * The meta object id for the '{@link Gtm.impl.LanguageImpl <em>Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LanguageImpl
	 * @see Gtm.impl.GtmPackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 23;

	/**
	 * The meta object id for the '{@link Gtm.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.TextImpl
	 * @see Gtm.impl.GtmPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 38;

	/**
	 * The meta object id for the '{@link Gtm.impl.TranslationImpl <em>Translation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.TranslationImpl
	 * @see Gtm.impl.GtmPackageImpl#getTranslation()
	 * @generated
	 */
	int TRANSLATION = 39;

	/**
	 * The meta object id for the '{@link Gtm.impl.ServiceClassImpl <em>Service Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ServiceClassImpl
	 * @see Gtm.impl.GtmPackageImpl#getServiceClass()
	 * @generated
	 */
	int SERVICE_CLASS = 31;

	/**
	 * The meta object id for the '{@link Gtm.impl.ServiceLevelImpl <em>Service Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ServiceLevelImpl
	 * @see Gtm.impl.GtmPackageImpl#getServiceLevel()
	 * @generated
	 */
	int SERVICE_LEVEL = 32;

	/**
	 * The meta object id for the '{@link Gtm.impl.PriceImpl <em>Price</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.PriceImpl
	 * @see Gtm.impl.GtmPackageImpl#getPrice()
	 * @generated
	 */
	int PRICE = 24;

	/**
	 * The meta object id for the '{@link Gtm.impl.ReservationParameterImpl <em>Reservation Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ReservationParameterImpl
	 * @see Gtm.impl.GtmPackageImpl#getReservationParameter()
	 * @generated
	 */
	int RESERVATION_PARAMETER = 27;

	/**
	 * The meta object id for the '{@link Gtm.impl.CurrencyPriceImpl <em>Currency Price</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CurrencyPriceImpl
	 * @see Gtm.impl.GtmPackageImpl#getCurrencyPrice()
	 * @generated
	 */
	int CURRENCY_PRICE = 22;

	/**
	 * The meta object id for the '{@link Gtm.impl.CurrencyImpl <em>Currency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CurrencyImpl
	 * @see Gtm.impl.GtmPackageImpl#getCurrency()
	 * @generated
	 */
	int CURRENCY = 21;

	/**
	 * The meta object id for the '{@link Gtm.impl.VATDetailImpl <em>VAT Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.VATDetailImpl
	 * @see Gtm.impl.GtmPackageImpl#getVATDetail()
	 * @generated
	 */
	int VAT_DETAIL = 40;

	/**
	 * The meta object id for the '{@link Gtm.impl.RegionalConstraintImpl <em>Regional Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.RegionalConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getRegionalConstraint()
	 * @generated
	 */
	int REGIONAL_CONSTRAINT = 26;

	/**
	 * The meta object id for the '{@link Gtm.impl.ConnectionPointImpl <em>Connection Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ConnectionPointImpl
	 * @see Gtm.impl.GtmPackageImpl#getConnectionPoint()
	 * @generated
	 */
	int CONNECTION_POINT = 20;

	/**
	 * The meta object id for the '{@link Gtm.impl.ServiceConstraintImpl <em>Service Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ServiceConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getServiceConstraint()
	 * @generated
	 */
	int SERVICE_CONSTRAINT = 33;

	/**
	 * The meta object id for the '{@link Gtm.impl.CarrierConstraintImpl <em>Carrier Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CarrierConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getCarrierConstraint()
	 * @generated
	 */
	int CARRIER_CONSTRAINT = 18;

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
	 * The number of structural features of the '<em>Carrier Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Carrier Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CONSTRAINT_OPERATION_COUNT = 0;

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
	 * The number of structural features of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__STATIONS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__ID = 1;

	/**
	 * The number of structural features of the '<em>Connection Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Connection Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OPERATION_COUNT = 0;

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
	 * The meta object id for the '{@link Gtm.impl.FareElementImpl <em>Fare Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.FareElementImpl
	 * @see Gtm.impl.GtmPackageImpl#getFareElement()
	 * @generated
	 */
	int FARE_ELEMENT = 41;

	/**
	 * The meta object id for the '{@link Gtm.impl.ReductionCardImpl <em>Reduction Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ReductionCardImpl
	 * @see Gtm.impl.GtmPackageImpl#getReductionCard()
	 * @generated
	 */
	int REDUCTION_CARD = 25;

	/**
	 * The meta object id for the '{@link Gtm.impl.ServiceBrandImpl <em>Service Brand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ServiceBrandImpl
	 * @see Gtm.impl.GtmPackageImpl#getServiceBrand()
	 * @generated
	 */
	int SERVICE_BRAND = 42;

	/**
	 * The meta object id for the '{@link Gtm.impl.SalesAvailabilityConstraintImpl <em>Sales Availability Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.SalesAvailabilityConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getSalesAvailabilityConstraint()
	 * @generated
	 */
	int SALES_AVAILABILITY_CONSTRAINT = 43;

	/**
	 * The meta object id for the '{@link Gtm.impl.TravelValidityConstraintImpl <em>Travel Validity Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.TravelValidityConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getTravelValidityConstraint()
	 * @generated
	 */
	int TRAVEL_VALIDITY_CONSTRAINT = 37;

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
	 * The number of structural features of the '<em>Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_OPERATION_COUNT = 0;

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
	 * The number of structural features of the '<em>Reduction Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARD_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Reduction Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARD_OPERATION_COUNT = 0;

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
	 * The number of structural features of the '<em>Regional Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Regional Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINT_OPERATION_COUNT = 0;

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
	int RESERVATION_PARAMS9181 = 28;

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
	int RESERVATION_OPTIONS = 29;

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
	 * The meta object id for the '{@link Gtm.impl.ReservationPreferenceImpl <em>Reservation Preference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ReservationPreferenceImpl
	 * @see Gtm.impl.GtmPackageImpl#getReservationPreference()
	 * @generated
	 */
	int RESERVATION_PREFERENCE = 30;

	/**
	 * The feature id for the '<em><b>Preference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PREFERENCE__PREFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PREFERENCE__GROUP = 1;

	/**
	 * The number of structural features of the '<em>Reservation Preference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PREFERENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Reservation Preference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PREFERENCE_OPERATION_COUNT = 0;

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
	 * The number of structural features of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONS_TYPE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONS_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Stations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Stations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONS_TYPE_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Service Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FARE_TEMPLATE__SERVICE_CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Carrier Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FARE_TEMPLATE__CARRIER_CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Service Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FARE_TEMPLATE__SERVICE_CLASS = 7;

	/**
	 * The feature id for the '<em><b>Service Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FARE_TEMPLATE__SERVICE_LEVEL = 8;

	/**
	 * The feature id for the '<em><b>Sales Availability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FARE_TEMPLATE__SALES_AVAILABILITY = 9;

	/**
	 * The feature id for the '<em><b>Travel Validity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FARE_TEMPLATE__TRAVEL_VALIDITY = 10;

	/**
	 * The feature id for the '<em><b>Combination Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FARE_TEMPLATE__COMBINATION_CONSTRAINT = 11;

	/**
	 * The number of structural features of the '<em>Target Fare Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FARE_TEMPLATE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Target Fare Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FARE_TEMPLATE_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Excluded Time Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT__EXCLUDED_TIME_RANGE = 3;

	/**
	 * The feature id for the '<em><b>Travel Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT__TRAVEL_DAYS = 4;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT__RANGE = 5;

	/**
	 * The feature id for the '<em><b>Return Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT__RETURN_CONSTRAINT = 6;

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
	 * The number of structural features of the '<em>Fare Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Fare Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT_OPERATION_COUNT = 0;

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
	 * The number of structural features of the '<em>Service Brand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BRAND_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service Brand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BRAND_OPERATION_COUNT = 0;

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
	 * The number of structural features of the '<em>Sales Availability Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_AVAILABILITY_CONSTRAINT_FEATURE_COUNT = 3;

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
	int SALES_RESTRICTION = 44;

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
	 * The meta object id for the '{@link Gtm.impl.TimeReferenceImpl <em>Time Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.TimeReferenceImpl
	 * @see Gtm.impl.GtmPackageImpl#getTimeReference()
	 * @generated
	 */
	int TIME_REFERENCE = 45;

	/**
	 * The feature id for the '<em><b>Referece Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_REFERENCE__REFERECE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_REFERENCE__UNIT = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_REFERENCE__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Time Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_REFERENCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Time Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.CombinationConstraintImpl <em>Combination Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CombinationConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getCombinationConstraint()
	 * @generated
	 */
	int COMBINATION_CONSTRAINT = 46;

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
	 * The meta object id for the '{@link Gtm.impl.ValidityRangeImpl <em>Validity Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ValidityRangeImpl
	 * @see Gtm.impl.GtmPackageImpl#getValidityRange()
	 * @generated
	 */
	int VALIDITY_RANGE = 47;

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
	 * The meta object id for the '{@link Gtm.impl.TimeRangeImpl <em>Time Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.TimeRangeImpl
	 * @see Gtm.impl.GtmPackageImpl#getTimeRange()
	 * @generated
	 */
	int TIME_RANGE = 48;

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
	 * The meta object id for the '{@link Gtm.impl.ReturnValidityConstraintImpl <em>Return Validity Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ReturnValidityConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getReturnValidityConstraint()
	 * @generated
	 */
	int RETURN_VALIDITY_CONSTRAINT = 49;

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
	 * The meta object id for the '{@link Gtm.impl.FareCombinationModelImpl <em>Fare Combination Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.FareCombinationModelImpl
	 * @see Gtm.impl.GtmPackageImpl#getFareCombinationModel()
	 * @generated
	 */
	int FARE_COMBINATION_MODEL = 50;

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
	 * The meta object id for the '{@link Gtm.impl.RegionalValidityImpl <em>Regional Validity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.RegionalValidityImpl
	 * @see Gtm.impl.GtmPackageImpl#getRegionalValidity()
	 * @generated
	 */
	int REGIONAL_VALIDITY = 51;

	/**
	 * The feature id for the '<em><b>Seq Nb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_VALIDITY__SEQ_NB = 0;

	/**
	 * The feature id for the '<em><b>Via Station</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_VALIDITY__VIA_STATION = 1;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_VALIDITY__ZONE = 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_VALIDITY__LINE = 3;

	/**
	 * The feature id for the '<em><b>Polygone</b></em>' containment reference list.
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
	 * The meta object id for the '{@link Gtm.impl.ViaStationImpl <em>Via Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ViaStationImpl
	 * @see Gtm.impl.GtmPackageImpl#getViaStation()
	 * @generated
	 */
	int VIA_STATION = 52;

	/**
	 * The feature id for the '<em><b>Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION__STATION = 0;

	/**
	 * The feature id for the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION__ROUTE = 1;

	/**
	 * The feature id for the '<em><b>Alternative Routes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION__ALTERNATIVE_ROUTES = 2;

	/**
	 * The feature id for the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION__CARRIER = 3;

	/**
	 * The number of structural features of the '<em>Via Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Via Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.ZoneImpl <em>Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ZoneImpl
	 * @see Gtm.impl.GtmPackageImpl#getZone()
	 * @generated
	 */
	int ZONE = 53;

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
	 * The feature id for the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__CARRIER = 2;

	/**
	 * The feature id for the '<em><b>Entry Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__ENTRY_STATION = 3;

	/**
	 * The feature id for the '<em><b>Terminal Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__TERMINAL_STATION = 4;

	/**
	 * The feature id for the '<em><b>Nuts Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__NUTS_CODE = 5;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__CITY = 6;

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
	 * The meta object id for the '{@link Gtm.impl.NutsCodeImpl <em>Nuts Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.NutsCodeImpl
	 * @see Gtm.impl.GtmPackageImpl#getNutsCode()
	 * @generated
	 */
	int NUTS_CODE = 54;

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
	 * The meta object id for the '{@link Gtm.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LineImpl
	 * @see Gtm.impl.GtmPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 55;

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
	int POLYGONE = 56;

	/**
	 * The feature id for the '<em><b>Egde</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGONE__EGDE = 0;

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
	int EDGE = 57;

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
	 * The meta object id for the '{@link Gtm.impl.PassengerConstraintImpl <em>Passenger Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.PassengerConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getPassengerConstraint()
	 * @generated
	 */
	int PASSENGER_CONSTRAINT = 58;

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
	int PASSENGER_COMBINATION_CONSTRAINT = 59;

	/**
	 * The feature id for the '<em><b>Max Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_COMBINATION_CONSTRAINT__MAX_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Passenger Type</b></em>' reference.
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
	 * The meta object id for the '{@link Gtm.impl.RelativeTimeImpl <em>Relative Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.RelativeTimeImpl
	 * @see Gtm.impl.GtmPackageImpl#getRelativeTime()
	 * @generated
	 */
	int RELATIVE_TIME = 60;

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
	 * The meta object id for the '{@link Gtm.impl.ZoneDefinitionImpl <em>Zone Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ZoneDefinitionImpl
	 * @see Gtm.impl.GtmPackageImpl#getZoneDefinition()
	 * @generated
	 */
	int ZONE_DEFINITION = 61;

	/**
	 * The feature id for the '<em><b>Zone Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DEFINITION__ZONE_ID = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DEFINITION__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DEFINITION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DEFINITION__STATIONS = 3;

	/**
	 * The number of structural features of the '<em>Zone Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DEFINITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Zone Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.AfterSalesConditionImpl <em>After Sales Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.AfterSalesConditionImpl
	 * @see Gtm.impl.GtmPackageImpl#getAfterSalesCondition()
	 * @generated
	 */
	int AFTER_SALES_CONDITION = 62;

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
	 * The meta object id for the '{@link Gtm.impl.AfterSalesRuleImpl <em>After Sales Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.AfterSalesRuleImpl
	 * @see Gtm.impl.GtmPackageImpl#getAfterSalesRule()
	 * @generated
	 */
	int AFTER_SALES_RULE = 63;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_RULE__ID = 0;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' reference list.
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
	 * The meta object id for the '{@link Gtm.impl.PersonalDataConstraintImpl <em>Personal Data Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.PersonalDataConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getPersonalDataConstraint()
	 * @generated
	 */
	int PERSONAL_DATA_CONSTRAINT = 64;

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
	int REQUIRED_PERSONAL_DATA = 65;

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
	 * The feature id for the '<em><b>Transfer</b></em>' attribute.
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
	 * The meta object id for the '{@link Gtm.impl.CrossBorderConditionImpl <em>Cross Border Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CrossBorderConditionImpl
	 * @see Gtm.impl.GtmPackageImpl#getCrossBorderCondition()
	 * @generated
	 */
	int CROSS_BORDER_CONDITION = 66;

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
	 * The feature id for the '<em><b>Affected Service Brands</b></em>' reference.
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
	 * The meta object id for the '{@link Gtm.impl.AllowedPersonalDataChangesImpl <em>Allowed Personal Data Changes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.AllowedPersonalDataChangesImpl
	 * @see Gtm.impl.GtmPackageImpl#getAllowedPersonalDataChanges()
	 * @generated
	 */
	int ALLOWED_PERSONAL_DATA_CHANGES = 67;

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
	 * The meta object id for the '{@link Gtm.impl.ReductionConstraintImpl <em>Reduction Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ReductionConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getReductionConstraint()
	 * @generated
	 */
	int REDUCTION_CONSTRAINT = 68;

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
	int REQUIRED_REDUCTION_CARD = 69;

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
	 * The meta object id for the '{@link Gtm.impl.FulfillmentConstraintImpl <em>Fulfillment Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.FulfillmentConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getFulfillmentConstraint()
	 * @generated
	 */
	int FULFILLMENT_CONSTRAINT = 70;

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
	 * The feature id for the '<em><b>Accepted Barcodes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODES = 2;

	/**
	 * The feature id for the '<em><b>Required Control Data Exchange</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT__REQUIRED_CONTROL_DATA_EXCHANGE = 3;

	/**
	 * The feature id for the '<em><b>Individual Ticketing Permitted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT__INDIVIDUAL_TICKETING_PERMITTED = 4;

	/**
	 * The number of structural features of the '<em>Fulfillment Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Fulfillment Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.FareResourceLocationImpl <em>Fare Resource Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.FareResourceLocationImpl
	 * @see Gtm.impl.GtmPackageImpl#getFareResourceLocation()
	 * @generated
	 */
	int FARE_RESOURCE_LOCATION = 71;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_RESOURCE_LOCATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Carrier Resource Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_RESOURCE_LOCATION__CARRIER_RESOURCE_LOCATIONS = 1;

	/**
	 * The feature id for the '<em><b>Station Resource Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_RESOURCE_LOCATION__STATION_RESOURCE_LOCATIONS = 2;

	/**
	 * The feature id for the '<em><b>Train Resource Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_RESOURCE_LOCATION__TRAIN_RESOURCE_LOCATIONS = 3;

	/**
	 * The number of structural features of the '<em>Fare Resource Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_RESOURCE_LOCATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Fare Resource Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_RESOURCE_LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.TrainResourceLocationImpl <em>Train Resource Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.TrainResourceLocationImpl
	 * @see Gtm.impl.GtmPackageImpl#getTrainResourceLocation()
	 * @generated
	 */
	int TRAIN_RESOURCE_LOCATION = 72;

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
	 * The meta object id for the '{@link Gtm.impl.CarrierResourceLocationImpl <em>Carrier Resource Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CarrierResourceLocationImpl
	 * @see Gtm.impl.GtmPackageImpl#getCarrierResourceLocation()
	 * @generated
	 */
	int CARRIER_RESOURCE_LOCATION = 73;

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
	 * The meta object id for the '{@link Gtm.impl.StationResourceLocationImpl <em>Station Resource Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.StationResourceLocationImpl
	 * @see Gtm.impl.GtmPackageImpl#getStationResourceLocation()
	 * @generated
	 */
	int STATION_RESOURCE_LOCATION = 74;

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
	int ONLINE_RESOURCE = 75;

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
	 * The meta object id for the '{@link Gtm.ReservationService <em>Reservation Service</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.ReservationService
	 * @see Gtm.impl.GtmPackageImpl#getReservationService()
	 * @generated
	 */
	int RESERVATION_SERVICE = 76;

	/**
	 * The meta object id for the '{@link Gtm.ReservationBerthType <em>Reservation Berth Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.ReservationBerthType
	 * @see Gtm.impl.GtmPackageImpl#getReservationBerthType()
	 * @generated
	 */
	int RESERVATION_BERTH_TYPE = 77;

	/**
	 * The meta object id for the '{@link Gtm.GraphicalReservationType <em>Graphical Reservation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.GraphicalReservationType
	 * @see Gtm.impl.GtmPackageImpl#getGraphicalReservationType()
	 * @generated
	 */
	int GRAPHICAL_RESERVATION_TYPE = 78;

	/**
	 * The meta object id for the '{@link Gtm.LegacyCalculationType <em>Legacy Calculation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.LegacyCalculationType
	 * @see Gtm.impl.GtmPackageImpl#getLegacyCalculationType()
	 * @generated
	 */
	int LEGACY_CALCULATION_TYPE = 79;

	/**
	 * The meta object id for the '{@link Gtm.LegacySeriesType <em>Legacy Series Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.LegacySeriesType
	 * @see Gtm.impl.GtmPackageImpl#getLegacySeriesType()
	 * @generated
	 */
	int LEGACY_SERIES_TYPE = 80;

	/**
	 * The meta object id for the '{@link Gtm.ClassicClassType <em>Classic Class Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.ClassicClassType
	 * @see Gtm.impl.GtmPackageImpl#getClassicClassType()
	 * @generated
	 */
	int CLASSIC_CLASS_TYPE = 81;

	/**
	 * The meta object id for the '{@link Gtm.TaxScope <em>Tax Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.TaxScope
	 * @see Gtm.impl.GtmPackageImpl#getTaxScope()
	 * @generated
	 */
	int TAX_SCOPE = 82;

	/**
	 * The meta object id for the '{@link Gtm.FareType <em>Fare Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.FareType
	 * @see Gtm.impl.GtmPackageImpl#getFareType()
	 * @generated
	 */
	int FARE_TYPE = 83;

	/**
	 * The meta object id for the '{@link Gtm.ReservationTravelClass <em>Reservation Travel Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.ReservationTravelClass
	 * @see Gtm.impl.GtmPackageImpl#getReservationTravelClass()
	 * @generated
	 */
	int RESERVATION_TRAVEL_CLASS = 84;

	/**
	 * The meta object id for the '{@link Gtm.ReservationServiceLevel <em>Reservation Service Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.ReservationServiceLevel
	 * @see Gtm.impl.GtmPackageImpl#getReservationServiceLevel()
	 * @generated
	 */
	int RESERVATION_SERVICE_LEVEL = 85;

	/**
	 * The meta object id for the '{@link Gtm.TimeReferenceType <em>Time Reference Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.TimeReferenceType
	 * @see Gtm.impl.GtmPackageImpl#getTimeReferenceType()
	 * @generated
	 */
	int TIME_REFERENCE_TYPE = 86;

	/**
	 * The meta object id for the '{@link Gtm.TimeRangeScope <em>Time Range Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.TimeRangeScope
	 * @see Gtm.impl.GtmPackageImpl#getTimeRangeScope()
	 * @generated
	 */
	int TIME_RANGE_SCOPE = 87;

	/**
	 * The meta object id for the '{@link Gtm.TimeUnit <em>Time Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.TimeUnit
	 * @see Gtm.impl.GtmPackageImpl#getTimeUnit()
	 * @generated
	 */
	int TIME_UNIT = 88;

	/**
	 * The meta object id for the '{@link Gtm.WeekDay <em>Week Day</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.WeekDay
	 * @see Gtm.impl.GtmPackageImpl#getWeekDay()
	 * @generated
	 */
	int WEEK_DAY = 89;

	/**
	 * The meta object id for the '{@link Gtm.CombinationModel <em>Combination Model</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.CombinationModel
	 * @see Gtm.impl.GtmPackageImpl#getCombinationModel()
	 * @generated
	 */
	int COMBINATION_MODEL = 90;

	/**
	 * The meta object id for the '{@link Gtm.Clusters <em>Clusters</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.Clusters
	 * @see Gtm.impl.GtmPackageImpl#getClusters()
	 * @generated
	 */
	int CLUSTERS = 91;

	/**
	 * The meta object id for the '{@link Gtm.GeoSystem <em>Geo System</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.GeoSystem
	 * @see Gtm.impl.GtmPackageImpl#getGeoSystem()
	 * @generated
	 */
	int GEO_SYSTEM = 92;

	/**
	 * The meta object id for the '{@link Gtm.GeoUnit <em>Geo Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.GeoUnit
	 * @see Gtm.impl.GtmPackageImpl#getGeoUnit()
	 * @generated
	 */
	int GEO_UNIT = 93;

	/**
	 * The meta object id for the '{@link Gtm.HemisphereEW <em>Hemisphere EW</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.HemisphereEW
	 * @see Gtm.impl.GtmPackageImpl#getHemisphereEW()
	 * @generated
	 */
	int HEMISPHERE_EW = 94;

	/**
	 * The meta object id for the '{@link Gtm.HemisphereNS <em>Hemisphere NS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.HemisphereNS
	 * @see Gtm.impl.GtmPackageImpl#getHemisphereNS()
	 * @generated
	 */
	int HEMISPHERE_NS = 95;


	/**
	 * The meta object id for the '{@link Gtm.LegacyPassengerType <em>Legacy Passenger Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.LegacyPassengerType
	 * @see Gtm.impl.GtmPackageImpl#getLegacyPassengerType()
	 * @generated
	 */
	int LEGACY_PASSENGER_TYPE = 96;

	/**
	 * The meta object id for the '{@link Gtm.TravelerType <em>Traveler Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.TravelerType
	 * @see Gtm.impl.GtmPackageImpl#getTravelerType()
	 * @generated
	 */
	int TRAVELER_TYPE = 97;


	/**
	 * The meta object id for the '{@link Gtm.AfterSalesTransactionType <em>After Sales Transaction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.AfterSalesTransactionType
	 * @see Gtm.impl.GtmPackageImpl#getAfterSalesTransactionType()
	 * @generated
	 */
	int AFTER_SALES_TRANSACTION_TYPE = 98;

	/**
	 * The meta object id for the '{@link Gtm.PersonalDataItemsType <em>Personal Data Items Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.PersonalDataItemsType
	 * @see Gtm.impl.GtmPackageImpl#getPersonalDataItemsType()
	 * @generated
	 */
	int PERSONAL_DATA_ITEMS_TYPE = 99;

	/**
	 * The meta object id for the '{@link Gtm.PersonalDataTransferType <em>Personal Data Transfer Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.PersonalDataTransferType
	 * @see Gtm.impl.GtmPackageImpl#getPersonalDataTransferType()
	 * @generated
	 */
	int PERSONAL_DATA_TRANSFER_TYPE = 100;

	/**
	 * The meta object id for the '{@link Gtm.PersonalDataChangeReason <em>Personal Data Change Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.PersonalDataChangeReason
	 * @see Gtm.impl.GtmPackageImpl#getPersonalDataChangeReason()
	 * @generated
	 */
	int PERSONAL_DATA_CHANGE_REASON = 101;

	/**
	 * The meta object id for the '{@link Gtm.OnlineServiceType <em>Online Service Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.OnlineServiceType
	 * @see Gtm.impl.GtmPackageImpl#getOnlineServiceType()
	 * @generated
	 */
	int ONLINE_SERVICE_TYPE = 102;

	/**
	 * The meta object id for the '{@link Gtm.FulfillmentType <em>Fulfillment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.FulfillmentType
	 * @see Gtm.impl.GtmPackageImpl#getFulfillmentType()
	 * @generated
	 */
	int FULFILLMENT_TYPE = 103;

	/**
	 * The meta object id for the '{@link Gtm.BarcodeTypes <em>Barcode Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.BarcodeTypes
	 * @see Gtm.impl.GtmPackageImpl#getBarcodeTypes()
	 * @generated
	 */
	int BARCODE_TYPES = 104;

	/**
	 * The meta object id for the '{@link Gtm.ControlDataExchangeTypes <em>Control Data Exchange Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.ControlDataExchangeTypes
	 * @see Gtm.impl.GtmPackageImpl#getControlDataExchangeTypes()
	 * @generated
	 */
	int CONTROL_DATA_EXCHANGE_TYPES = 105;

	/**
	 * The meta object id for the '{@link Gtm.OfferRequestType <em>Offer Request Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.OfferRequestType
	 * @see Gtm.impl.GtmPackageImpl#getOfferRequestType()
	 * @generated
	 */
	int OFFER_REQUEST_TYPE = 106;

	/**
	 * The meta object id for the '{@link Gtm.InterfaceType <em>Interface Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.InterfaceType
	 * @see Gtm.impl.GtmPackageImpl#getInterfaceType()
	 * @generated
	 */
	int INTERFACE_TYPE = 107;


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
	 * Returns the meta object for the containment reference list '{@link Gtm.CodeLists#getCarriers <em>Carriers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Carriers</em>'.
	 * @see Gtm.CodeLists#getCarriers()
	 * @see #getCodeLists()
	 * @generated
	 */
	EReference getCodeLists_Carriers();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.CodeLists#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stations</em>'.
	 * @see Gtm.CodeLists#getStations()
	 * @see #getCodeLists()
	 * @generated
	 */
	EReference getCodeLists_Stations();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.CodeLists#getCountries <em>Countries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Countries</em>'.
	 * @see Gtm.CodeLists#getCountries()
	 * @see #getCodeLists()
	 * @generated
	 */
	EReference getCodeLists_Countries();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.CodeLists#getLanguages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Languages</em>'.
	 * @see Gtm.CodeLists#getLanguages()
	 * @see #getCodeLists()
	 * @generated
	 */
	EReference getCodeLists_Languages();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.CodeLists#getCurrencies <em>Currencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Currencies</em>'.
	 * @see Gtm.CodeLists#getCurrencies()
	 * @see #getCodeLists()
	 * @generated
	 */
	EReference getCodeLists_Currencies();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.CodeLists#getServiceBrands <em>Service Brands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Brands</em>'.
	 * @see Gtm.CodeLists#getServiceBrands()
	 * @see #getCodeLists()
	 * @generated
	 */
	EReference getCodeLists_ServiceBrands();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.CodeLists#getNutsCodes <em>Nuts Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nuts Codes</em>'.
	 * @see Gtm.CodeLists#getNutsCodes()
	 * @see #getCodeLists()
	 * @generated
	 */
	EReference getCodeLists_NutsCodes();

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
	 * Returns the meta object for class '{@link Gtm.FareStructure <em>Fare Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fare Structure</em>'.
	 * @see Gtm.FareStructure
	 * @generated
	 */
	EClass getFareStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.FareStructure#getFareElements <em>Fare Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fare Elements</em>'.
	 * @see Gtm.FareStructure#getFareElements()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_FareElements();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.FareStructure#getAfterSalesRules <em>After Sales Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>After Sales Rules</em>'.
	 * @see Gtm.FareStructure#getAfterSalesRules()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_AfterSalesRules();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.FareStructure#getCalendars <em>Calendars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calendars</em>'.
	 * @see Gtm.FareStructure#getCalendars()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_Calendars();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.FareStructure#getServiceClassDefinitions <em>Service Class Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Class Definitions</em>'.
	 * @see Gtm.FareStructure#getServiceClassDefinitions()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_ServiceClassDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.FareStructure#getPrices <em>Prices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prices</em>'.
	 * @see Gtm.FareStructure#getPrices()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_Prices();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.FareStructure#getRegionalConstraints <em>Regional Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regional Constraints</em>'.
	 * @see Gtm.FareStructure#getRegionalConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_RegionalConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.FareStructure#getTexts <em>Texts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Texts</em>'.
	 * @see Gtm.FareStructure#getTexts()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_Texts();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.FareStructure#getServiceLevelDefinitions <em>Service Level Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Level Definitions</em>'.
	 * @see Gtm.FareStructure#getServiceLevelDefinitions()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_ServiceLevelDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.FareStructure#getReservationParameters <em>Reservation Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reservation Parameters</em>'.
	 * @see Gtm.FareStructure#getReservationParameters()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_ReservationParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.FareStructure#getServiceConstraints <em>Service Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Constraints</em>'.
	 * @see Gtm.FareStructure#getServiceConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_ServiceConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.FareStructure#getCarrierConstraints <em>Carrier Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Carrier Constraints</em>'.
	 * @see Gtm.FareStructure#getCarrierConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_CarrierConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.FareStructure#getReductionCards <em>Reduction Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reduction Cards</em>'.
	 * @see Gtm.FareStructure#getReductionCards()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_ReductionCards();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.FareStructure#getSalesAvailabilityConstraints <em>Sales Availability Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sales Availability Constraints</em>'.
	 * @see Gtm.FareStructure#getSalesAvailabilityConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_SalesAvailabilityConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.FareStructure#getTravelValidityConstraints <em>Travel Validity Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Travel Validity Constraints</em>'.
	 * @see Gtm.FareStructure#getTravelValidityConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_TravelValidityConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.FareStructure#getCombinationConstraints <em>Combination Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Combination Constraints</em>'.
	 * @see Gtm.FareStructure#getCombinationConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_CombinationConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.FareStructure#getPassengerConstraints <em>Passenger Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Passenger Constraints</em>'.
	 * @see Gtm.FareStructure#getPassengerConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_PassengerConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.FareStructure#getPersonalDataConstraints <em>Personal Data Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Personal Data Constraints</em>'.
	 * @see Gtm.FareStructure#getPersonalDataConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_PersonalDataConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.FareStructure#getReductionConstraints <em>Reduction Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reduction Constraints</em>'.
	 * @see Gtm.FareStructure#getReductionConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_ReductionConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.FareStructure#getZoneDefinitions <em>Zone Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Zone Definitions</em>'.
	 * @see Gtm.FareStructure#getZoneDefinitions()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_ZoneDefinitions();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.FareStructure#getSupportedOnlineServices <em>Supported Online Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Supported Online Services</em>'.
	 * @see Gtm.FareStructure#getSupportedOnlineServices()
	 * @see #getFareStructure()
	 * @generated
	 */
	EAttribute getFareStructure_SupportedOnlineServices();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.FareStructure#getFulfillmentConstraint <em>Fulfillment Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fulfillment Constraint</em>'.
	 * @see Gtm.FareStructure#getFulfillmentConstraint()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_FulfillmentConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.FareStructure#getFareResourceLocations <em>Fare Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fare Resource Locations</em>'.
	 * @see Gtm.FareStructure#getFareResourceLocations()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_FareResourceLocations();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.FareStructure#getConnectionPoints <em>Connection Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection Points</em>'.
	 * @see Gtm.FareStructure#getConnectionPoints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_ConnectionPoints();

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
	 * Returns the meta object for the attribute '{@link Gtm.Delivery#getFareProvider <em>Fare Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fare Provider</em>'.
	 * @see Gtm.Delivery#getFareProvider()
	 * @see #getDelivery()
	 * @generated
	 */
	EAttribute getDelivery_FareProvider();

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
	 * Returns the meta object for class '{@link Gtm.BorderPoints <em>Border Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Border Points</em>'.
	 * @see Gtm.BorderPoints
	 * @generated
	 */
	EClass getBorderPoints();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.BorderPoints#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Gtm.BorderPoints#getCode()
	 * @see #getBorderPoints()
	 * @generated
	 */
	EAttribute getBorderPoints_Code();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.BorderPoints#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gtm.BorderPoints#getName()
	 * @see #getBorderPoints()
	 * @generated
	 */
	EAttribute getBorderPoints_Name();

	/**
	 * Returns the meta object for the reference '{@link Gtm.BorderPoints#getStation1 <em>Station1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Station1</em>'.
	 * @see Gtm.BorderPoints#getStation1()
	 * @see #getBorderPoints()
	 * @generated
	 */
	EReference getBorderPoints_Station1();

	/**
	 * Returns the meta object for the reference '{@link Gtm.BorderPoints#getStation2 <em>Station2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Station2</em>'.
	 * @see Gtm.BorderPoints#getStation2()
	 * @see #getBorderPoints()
	 * @generated
	 */
	EReference getBorderPoints_Station2();

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
	 * Returns the meta object for class '{@link Gtm.CoversionParams <em>Coversion Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coversion Params</em>'.
	 * @see Gtm.CoversionParams
	 * @generated
	 */
	EClass getCoversionParams();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.CoversionParams#getBorderPoints <em>Border Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Border Points</em>'.
	 * @see Gtm.CoversionParams#getBorderPoints()
	 * @see #getCoversionParams()
	 * @generated
	 */
	EReference getCoversionParams_BorderPoints();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.CoversionParams#getTargetFares <em>Target Fares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Fares</em>'.
	 * @see Gtm.CoversionParams#getTargetFares()
	 * @see #getCoversionParams()
	 * @generated
	 */
	EReference getCoversionParams_TargetFares();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.CoversionParams#getStationMappings <em>Station Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Station Mappings</em>'.
	 * @see Gtm.CoversionParams#getStationMappings()
	 * @see #getCoversionParams()
	 * @generated
	 */
	EReference getCoversionParams_StationMappings();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.CoversionParams#getTaxId <em>Tax Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Id</em>'.
	 * @see Gtm.CoversionParams#getTaxId()
	 * @see #getCoversionParams()
	 * @generated
	 */
	EAttribute getCoversionParams_TaxId();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.CoversionParams#getVATpercentage <em>VA Tpercentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VA Tpercentage</em>'.
	 * @see Gtm.CoversionParams#getVATpercentage()
	 * @see #getCoversionParams()
	 * @generated
	 */
	EAttribute getCoversionParams_VATpercentage();

	/**
	 * Returns the meta object for the reference '{@link Gtm.CoversionParams#getTaxCountry <em>Tax Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tax Country</em>'.
	 * @see Gtm.CoversionParams#getTaxCountry()
	 * @see #getCoversionParams()
	 * @generated
	 */
	EReference getCoversionParams_TaxCountry();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyDescription <em>Legacy Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Description</em>'.
	 * @see Gtm.LegacyDescription
	 * @generated
	 */
	EClass getLegacyDescription();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyDescription#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see Gtm.LegacyDescription#getLanguage()
	 * @see #getLegacyDescription()
	 * @generated
	 */
	EAttribute getLegacyDescription_Language();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyDescription#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see Gtm.LegacyDescription#getText()
	 * @see #getLegacyDescription()
	 * @generated
	 */
	EAttribute getLegacyDescription_Text();

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
	 * Returns the meta object for class '{@link Gtm.LegacyFares <em>Legacy Fares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Fares</em>'.
	 * @see Gtm.LegacyFares
	 * @generated
	 */
	EClass getLegacyFares();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.LegacyFares#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see Gtm.LegacyFares#getDescription()
	 * @see #getLegacyFares()
	 * @generated
	 */
	EReference getLegacyFares_Description();

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
	 * Returns the meta object for the attribute '{@link Gtm.Legacy108#getCarrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Carrier</em>'.
	 * @see Gtm.Legacy108#getCarrier()
	 * @see #getLegacy108()
	 * @generated
	 */
	EAttribute getLegacy108_Carrier();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.Legacy108#getSeries <em>Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Series</em>'.
	 * @see Gtm.Legacy108#getSeries()
	 * @see #getLegacy108()
	 * @generated
	 */
	EReference getLegacy108_Series();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.Legacy108#getFares <em>Fares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fares</em>'.
	 * @see Gtm.Legacy108#getFares()
	 * @see #getLegacy108()
	 * @generated
	 */
	EReference getLegacy108_Fares();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.Legacy108#getDistanceFare <em>Distance Fare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Distance Fare</em>'.
	 * @see Gtm.Legacy108#getDistanceFare()
	 * @see #getLegacy108()
	 * @generated
	 */
	EReference getLegacy108_DistanceFare();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.Legacy108#getRouteFare <em>Route Fare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Route Fare</em>'.
	 * @see Gtm.Legacy108#getRouteFare()
	 * @see #getLegacy108()
	 * @generated
	 */
	EReference getLegacy108_RouteFare();

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
	 * Returns the meta object for class '{@link Gtm.LegacySeries <em>Legacy Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Series</em>'.
	 * @see Gtm.LegacySeries
	 * @generated
	 */
	EClass getLegacySeries();

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
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeries#getPricing <em>Pricing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pricing</em>'.
	 * @see Gtm.LegacySeries#getPricing()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EAttribute getLegacySeries_Pricing();

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
	 * Returns the meta object for class '{@link Gtm.StationsType <em>Stations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stations Type</em>'.
	 * @see Gtm.StationsType
	 * @generated
	 */
	EClass getStationsType();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.StationsType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Gtm.StationsType#getCode()
	 * @see #getStationsType()
	 * @generated
	 */
	EAttribute getStationsType_Code();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.StationsType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gtm.StationsType#getName()
	 * @see #getStationsType()
	 * @generated
	 */
	EAttribute getStationsType_Name();

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
	 * Returns the meta object for class '{@link Gtm.ReservationPreference <em>Reservation Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation Preference</em>'.
	 * @see Gtm.ReservationPreference
	 * @generated
	 */
	EClass getReservationPreference();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReservationPreference#getPreference <em>Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preference</em>'.
	 * @see Gtm.ReservationPreference#getPreference()
	 * @see #getReservationPreference()
	 * @generated
	 */
	EAttribute getReservationPreference_Preference();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReservationPreference#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see Gtm.ReservationPreference#getGroup()
	 * @see #getReservationPreference()
	 * @generated
	 */
	EAttribute getReservationPreference_Group();

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
	 * Returns the meta object for class '{@link Gtm.ConnectionPoint <em>Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Point</em>'.
	 * @see Gtm.ConnectionPoint
	 * @generated
	 */
	EClass getConnectionPoint();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.ConnectionPoint#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stations</em>'.
	 * @see Gtm.ConnectionPoint#getStations()
	 * @see #getConnectionPoint()
	 * @generated
	 */
	EReference getConnectionPoint_Stations();

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
	 * Returns the meta object for the attribute '{@link Gtm.TravelValidityConstraint#getExcludedTimeRange <em>Excluded Time Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Excluded Time Range</em>'.
	 * @see Gtm.TravelValidityConstraint#getExcludedTimeRange()
	 * @see #getTravelValidityConstraint()
	 * @generated
	 */
	EAttribute getTravelValidityConstraint_ExcludedTimeRange();

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
	 * Returns the meta object for class '{@link Gtm.TimeReference <em>Time Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Reference</em>'.
	 * @see Gtm.TimeReference
	 * @generated
	 */
	EClass getTimeReference();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.TimeReference#getRefereceType <em>Referece Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referece Type</em>'.
	 * @see Gtm.TimeReference#getRefereceType()
	 * @see #getTimeReference()
	 * @generated
	 */
	EAttribute getTimeReference_RefereceType();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.TimeReference#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see Gtm.TimeReference#getUnit()
	 * @see #getTimeReference()
	 * @generated
	 */
	EAttribute getTimeReference_Unit();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.TimeReference#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Gtm.TimeReference#getValue()
	 * @see #getTimeReference()
	 * @generated
	 */
	EAttribute getTimeReference_Value();

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
	 * Returns the meta object for the reference list '{@link Gtm.RegionalValidity#getViaStation <em>Via Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Via Station</em>'.
	 * @see Gtm.RegionalValidity#getViaStation()
	 * @see #getRegionalValidity()
	 * @generated
	 */
	EReference getRegionalValidity_ViaStation();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.RegionalValidity#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Zone</em>'.
	 * @see Gtm.RegionalValidity#getZone()
	 * @see #getRegionalValidity()
	 * @generated
	 */
	EReference getRegionalValidity_Zone();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.RegionalValidity#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Line</em>'.
	 * @see Gtm.RegionalValidity#getLine()
	 * @see #getRegionalValidity()
	 * @generated
	 */
	EReference getRegionalValidity_Line();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.RegionalValidity#getPolygone <em>Polygone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Polygone</em>'.
	 * @see Gtm.RegionalValidity#getPolygone()
	 * @see #getRegionalValidity()
	 * @generated
	 */
	EReference getRegionalValidity_Polygone();

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
	 * Returns the meta object for the containment reference list '{@link Gtm.Polygone#getEgde <em>Egde</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Egde</em>'.
	 * @see Gtm.Polygone#getEgde()
	 * @see #getPolygone()
	 * @generated
	 */
	EReference getPolygone_Egde();

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
	 * Returns the meta object for the reference '{@link Gtm.PassengerCombinationConstraint#getPassengerType <em>Passenger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Passenger Type</em>'.
	 * @see Gtm.PassengerCombinationConstraint#getPassengerType()
	 * @see #getPassengerCombinationConstraint()
	 * @generated
	 */
	EReference getPassengerCombinationConstraint_PassengerType();

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
	 * Returns the meta object for class '{@link Gtm.ZoneDefinition <em>Zone Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zone Definition</em>'.
	 * @see Gtm.ZoneDefinition
	 * @generated
	 */
	EClass getZoneDefinition();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ZoneDefinition#getZoneId <em>Zone Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zone Id</em>'.
	 * @see Gtm.ZoneDefinition#getZoneId()
	 * @see #getZoneDefinition()
	 * @generated
	 */
	EAttribute getZoneDefinition_ZoneId();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ZoneDefinition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.ZoneDefinition#getId()
	 * @see #getZoneDefinition()
	 * @generated
	 */
	EAttribute getZoneDefinition_Id();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ZoneDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gtm.ZoneDefinition#getName()
	 * @see #getZoneDefinition()
	 * @generated
	 */
	EAttribute getZoneDefinition_Name();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.ZoneDefinition#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stations</em>'.
	 * @see Gtm.ZoneDefinition#getStations()
	 * @see #getZoneDefinition()
	 * @generated
	 */
	EReference getZoneDefinition_Stations();

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
	 * Returns the meta object for the reference list '{@link Gtm.AfterSalesRule#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conditions</em>'.
	 * @see Gtm.AfterSalesRule#getConditions()
	 * @see #getAfterSalesRule()
	 * @generated
	 */
	EReference getAfterSalesRule_Conditions();

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
	 * Returns the meta object for the attribute '{@link Gtm.RequiredPersonalData#getTransfer <em>Transfer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transfer</em>'.
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
	 * Returns the meta object for the reference '{@link Gtm.CrossBorderCondition#getAffectedServiceBrands <em>Affected Service Brands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Affected Service Brands</em>'.
	 * @see Gtm.CrossBorderCondition#getAffectedServiceBrands()
	 * @see #getCrossBorderCondition()
	 * @generated
	 */
	EReference getCrossBorderCondition_AffectedServiceBrands();

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
	 * Returns the meta object for the attribute list '{@link Gtm.FulfillmentConstraint#getAcceptedBarcodes <em>Accepted Barcodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Accepted Barcodes</em>'.
	 * @see Gtm.FulfillmentConstraint#getAcceptedBarcodes()
	 * @see #getFulfillmentConstraint()
	 * @generated
	 */
	EAttribute getFulfillmentConstraint_AcceptedBarcodes();

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
	 * Returns the meta object for class '{@link Gtm.FareResourceLocation <em>Fare Resource Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fare Resource Location</em>'.
	 * @see Gtm.FareResourceLocation
	 * @generated
	 */
	EClass getFareResourceLocation();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareResourceLocation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.FareResourceLocation#getId()
	 * @see #getFareResourceLocation()
	 * @generated
	 */
	EAttribute getFareResourceLocation_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.FareResourceLocation#getCarrierResourceLocations <em>Carrier Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Carrier Resource Locations</em>'.
	 * @see Gtm.FareResourceLocation#getCarrierResourceLocations()
	 * @see #getFareResourceLocation()
	 * @generated
	 */
	EReference getFareResourceLocation_CarrierResourceLocations();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.FareResourceLocation#getStationResourceLocations <em>Station Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Station Resource Locations</em>'.
	 * @see Gtm.FareResourceLocation#getStationResourceLocations()
	 * @see #getFareResourceLocation()
	 * @generated
	 */
	EReference getFareResourceLocation_StationResourceLocations();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.FareResourceLocation#getTrainResourceLocations <em>Train Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Train Resource Locations</em>'.
	 * @see Gtm.FareResourceLocation#getTrainResourceLocations()
	 * @see #getFareResourceLocation()
	 * @generated
	 */
	EReference getFareResourceLocation_TrainResourceLocations();

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
	 * Returns the meta object for enum '{@link Gtm.GraphicalReservationType <em>Graphical Reservation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Graphical Reservation Type</em>'.
	 * @see Gtm.GraphicalReservationType
	 * @generated
	 */
	EEnum getGraphicalReservationType();

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
	 * Returns the meta object for enum '{@link Gtm.LegacySeriesType <em>Legacy Series Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Legacy Series Type</em>'.
	 * @see Gtm.LegacySeriesType
	 * @generated
	 */
	EEnum getLegacySeriesType();

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
	 * Returns the meta object for enum '{@link Gtm.TaxScope <em>Tax Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tax Scope</em>'.
	 * @see Gtm.TaxScope
	 * @generated
	 */
	EEnum getTaxScope();

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
	 * Returns the meta object for enum '{@link Gtm.WeekDay <em>Week Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Week Day</em>'.
	 * @see Gtm.WeekDay
	 * @generated
	 */
	EEnum getWeekDay();

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
	 * Returns the meta object for enum '{@link Gtm.Clusters <em>Clusters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Clusters</em>'.
	 * @see Gtm.Clusters
	 * @generated
	 */
	EEnum getClusters();

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
	 * Returns the meta object for enum '{@link Gtm.LegacyPassengerType <em>Legacy Passenger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Legacy Passenger Type</em>'.
	 * @see Gtm.LegacyPassengerType
	 * @generated
	 */
	EEnum getLegacyPassengerType();

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
	 * Returns the meta object for enum '{@link Gtm.AfterSalesTransactionType <em>After Sales Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>After Sales Transaction Type</em>'.
	 * @see Gtm.AfterSalesTransactionType
	 * @generated
	 */
	EEnum getAfterSalesTransactionType();

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
	 * Returns the meta object for enum '{@link Gtm.OnlineServiceType <em>Online Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Online Service Type</em>'.
	 * @see Gtm.OnlineServiceType
	 * @generated
	 */
	EEnum getOnlineServiceType();

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
	 * Returns the meta object for enum '{@link Gtm.BarcodeTypes <em>Barcode Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Barcode Types</em>'.
	 * @see Gtm.BarcodeTypes
	 * @generated
	 */
	EEnum getBarcodeTypes();

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
	 * Returns the meta object for enum '{@link Gtm.OfferRequestType <em>Offer Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Offer Request Type</em>'.
	 * @see Gtm.OfferRequestType
	 * @generated
	 */
	EEnum getOfferRequestType();

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
		 * The meta object literal for the '<em><b>Carriers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_LISTS__CARRIERS = eINSTANCE.getCodeLists_Carriers();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_LISTS__STATIONS = eINSTANCE.getCodeLists_Stations();

		/**
		 * The meta object literal for the '<em><b>Countries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_LISTS__COUNTRIES = eINSTANCE.getCodeLists_Countries();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_LISTS__LANGUAGES = eINSTANCE.getCodeLists_Languages();

		/**
		 * The meta object literal for the '<em><b>Currencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_LISTS__CURRENCIES = eINSTANCE.getCodeLists_Currencies();

		/**
		 * The meta object literal for the '<em><b>Service Brands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_LISTS__SERVICE_BRANDS = eINSTANCE.getCodeLists_ServiceBrands();

		/**
		 * The meta object literal for the '<em><b>Nuts Codes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_LISTS__NUTS_CODES = eINSTANCE.getCodeLists_NutsCodes();

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
		 * The meta object literal for the '{@link Gtm.impl.FareStructureImpl <em>Fare Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.FareStructureImpl
		 * @see Gtm.impl.GtmPackageImpl#getFareStructure()
		 * @generated
		 */
		EClass FARE_STRUCTURE = eINSTANCE.getFareStructure();

		/**
		 * The meta object literal for the '<em><b>Fare Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__FARE_ELEMENTS = eINSTANCE.getFareStructure_FareElements();

		/**
		 * The meta object literal for the '<em><b>After Sales Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__AFTER_SALES_RULES = eINSTANCE.getFareStructure_AfterSalesRules();

		/**
		 * The meta object literal for the '<em><b>Calendars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__CALENDARS = eINSTANCE.getFareStructure_Calendars();

		/**
		 * The meta object literal for the '<em><b>Service Class Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__SERVICE_CLASS_DEFINITIONS = eINSTANCE.getFareStructure_ServiceClassDefinitions();

		/**
		 * The meta object literal for the '<em><b>Prices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__PRICES = eINSTANCE.getFareStructure_Prices();

		/**
		 * The meta object literal for the '<em><b>Regional Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__REGIONAL_CONSTRAINTS = eINSTANCE.getFareStructure_RegionalConstraints();

		/**
		 * The meta object literal for the '<em><b>Texts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__TEXTS = eINSTANCE.getFareStructure_Texts();

		/**
		 * The meta object literal for the '<em><b>Service Level Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__SERVICE_LEVEL_DEFINITIONS = eINSTANCE.getFareStructure_ServiceLevelDefinitions();

		/**
		 * The meta object literal for the '<em><b>Reservation Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__RESERVATION_PARAMETERS = eINSTANCE.getFareStructure_ReservationParameters();

		/**
		 * The meta object literal for the '<em><b>Service Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__SERVICE_CONSTRAINTS = eINSTANCE.getFareStructure_ServiceConstraints();

		/**
		 * The meta object literal for the '<em><b>Carrier Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__CARRIER_CONSTRAINTS = eINSTANCE.getFareStructure_CarrierConstraints();

		/**
		 * The meta object literal for the '<em><b>Reduction Cards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__REDUCTION_CARDS = eINSTANCE.getFareStructure_ReductionCards();

		/**
		 * The meta object literal for the '<em><b>Sales Availability Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__SALES_AVAILABILITY_CONSTRAINTS = eINSTANCE.getFareStructure_SalesAvailabilityConstraints();

		/**
		 * The meta object literal for the '<em><b>Travel Validity Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__TRAVEL_VALIDITY_CONSTRAINTS = eINSTANCE.getFareStructure_TravelValidityConstraints();

		/**
		 * The meta object literal for the '<em><b>Combination Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__COMBINATION_CONSTRAINTS = eINSTANCE.getFareStructure_CombinationConstraints();

		/**
		 * The meta object literal for the '<em><b>Passenger Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__PASSENGER_CONSTRAINTS = eINSTANCE.getFareStructure_PassengerConstraints();

		/**
		 * The meta object literal for the '<em><b>Personal Data Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__PERSONAL_DATA_CONSTRAINTS = eINSTANCE.getFareStructure_PersonalDataConstraints();

		/**
		 * The meta object literal for the '<em><b>Reduction Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__REDUCTION_CONSTRAINTS = eINSTANCE.getFareStructure_ReductionConstraints();

		/**
		 * The meta object literal for the '<em><b>Zone Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__ZONE_DEFINITIONS = eINSTANCE.getFareStructure_ZoneDefinitions();

		/**
		 * The meta object literal for the '<em><b>Supported Online Services</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_STRUCTURE__SUPPORTED_ONLINE_SERVICES = eINSTANCE.getFareStructure_SupportedOnlineServices();

		/**
		 * The meta object literal for the '<em><b>Fulfillment Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__FULFILLMENT_CONSTRAINT = eINSTANCE.getFareStructure_FulfillmentConstraint();

		/**
		 * The meta object literal for the '<em><b>Fare Resource Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__FARE_RESOURCE_LOCATIONS = eINSTANCE.getFareStructure_FareResourceLocations();

		/**
		 * The meta object literal for the '<em><b>Connection Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__CONNECTION_POINTS = eINSTANCE.getFareStructure_ConnectionPoints();

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
		 * The meta object literal for the '<em><b>Fare Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY__FARE_PROVIDER = eINSTANCE.getDelivery_FareProvider();

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
		 * The meta object literal for the '{@link Gtm.impl.BorderPointsImpl <em>Border Points</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.BorderPointsImpl
		 * @see Gtm.impl.GtmPackageImpl#getBorderPoints()
		 * @generated
		 */
		EClass BORDER_POINTS = eINSTANCE.getBorderPoints();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BORDER_POINTS__CODE = eINSTANCE.getBorderPoints_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BORDER_POINTS__NAME = eINSTANCE.getBorderPoints_Name();

		/**
		 * The meta object literal for the '<em><b>Station1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BORDER_POINTS__STATION1 = eINSTANCE.getBorderPoints_Station1();

		/**
		 * The meta object literal for the '<em><b>Station2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BORDER_POINTS__STATION2 = eINSTANCE.getBorderPoints_Station2();

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
		 * The meta object literal for the '{@link Gtm.impl.CoversionParamsImpl <em>Coversion Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CoversionParamsImpl
		 * @see Gtm.impl.GtmPackageImpl#getCoversionParams()
		 * @generated
		 */
		EClass COVERSION_PARAMS = eINSTANCE.getCoversionParams();

		/**
		 * The meta object literal for the '<em><b>Border Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COVERSION_PARAMS__BORDER_POINTS = eINSTANCE.getCoversionParams_BorderPoints();

		/**
		 * The meta object literal for the '<em><b>Target Fares</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COVERSION_PARAMS__TARGET_FARES = eINSTANCE.getCoversionParams_TargetFares();

		/**
		 * The meta object literal for the '<em><b>Station Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COVERSION_PARAMS__STATION_MAPPINGS = eINSTANCE.getCoversionParams_StationMappings();

		/**
		 * The meta object literal for the '<em><b>Tax Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COVERSION_PARAMS__TAX_ID = eINSTANCE.getCoversionParams_TaxId();

		/**
		 * The meta object literal for the '<em><b>VA Tpercentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COVERSION_PARAMS__VA_TPERCENTAGE = eINSTANCE.getCoversionParams_VATpercentage();

		/**
		 * The meta object literal for the '<em><b>Tax Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COVERSION_PARAMS__TAX_COUNTRY = eINSTANCE.getCoversionParams_TaxCountry();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyDescriptionImpl <em>Legacy Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyDescriptionImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyDescription()
		 * @generated
		 */
		EClass LEGACY_DESCRIPTION = eINSTANCE.getLegacyDescription();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_DESCRIPTION__LANGUAGE = eINSTANCE.getLegacyDescription_Language();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_DESCRIPTION__TEXT = eINSTANCE.getLegacyDescription_Text();

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
		 * The meta object literal for the '{@link Gtm.impl.LegacyFaresImpl <em>Legacy Fares</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyFaresImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyFares()
		 * @generated
		 */
		EClass LEGACY_FARES = eINSTANCE.getLegacyFares();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_FARES__DESCRIPTION = eINSTANCE.getLegacyFares_Description();

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
		 * The meta object literal for the '<em><b>Carrier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY108__CARRIER = eINSTANCE.getLegacy108_Carrier();

		/**
		 * The meta object literal for the '<em><b>Series</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY108__SERIES = eINSTANCE.getLegacy108_Series();

		/**
		 * The meta object literal for the '<em><b>Fares</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY108__FARES = eINSTANCE.getLegacy108_Fares();

		/**
		 * The meta object literal for the '<em><b>Distance Fare</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY108__DISTANCE_FARE = eINSTANCE.getLegacy108_DistanceFare();

		/**
		 * The meta object literal for the '<em><b>Route Fare</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY108__ROUTE_FARE = eINSTANCE.getLegacy108_RouteFare();

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
		 * The meta object literal for the '<em><b>Fare Table Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_ROUTE_FARE__FARE_TABLE_NUMBER = eINSTANCE.getLegacyRouteFare_FareTableNumber();

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
		 * The meta object literal for the '<em><b>Viastations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_SERIES__VIASTATIONS = eINSTANCE.getLegacySeries_Viastations();

		/**
		 * The meta object literal for the '<em><b>Distance1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__DISTANCE1 = eINSTANCE.getLegacySeries_Distance1();

		/**
		 * The meta object literal for the '<em><b>Pricetype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__PRICETYPE = eINSTANCE.getLegacySeries_Pricetype();

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
		 * The meta object literal for the '<em><b>Pricing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__PRICING = eINSTANCE.getLegacySeries_Pricing();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__TYPE = eINSTANCE.getLegacySeries_Type();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__NUMBER = eINSTANCE.getLegacySeries_Number();

		/**
		 * The meta object literal for the '<em><b>From Station</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__FROM_STATION = eINSTANCE.getLegacySeries_FromStation();

		/**
		 * The meta object literal for the '<em><b>To Station</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__TO_STATION = eINSTANCE.getLegacySeries_ToStation();

		/**
		 * The meta object literal for the '<em><b>Distance2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__DISTANCE2 = eINSTANCE.getLegacySeries_Distance2();

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
		 * The meta object literal for the '{@link Gtm.impl.StationsTypeImpl <em>Stations Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.StationsTypeImpl
		 * @see Gtm.impl.GtmPackageImpl#getStationsType()
		 * @generated
		 */
		EClass STATIONS_TYPE = eINSTANCE.getStationsType();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIONS_TYPE__CODE = eINSTANCE.getStationsType_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIONS_TYPE__NAME = eINSTANCE.getStationsType_Name();

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
		 * The meta object literal for the '{@link Gtm.impl.ReservationPreferenceImpl <em>Reservation Preference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ReservationPreferenceImpl
		 * @see Gtm.impl.GtmPackageImpl#getReservationPreference()
		 * @generated
		 */
		EClass RESERVATION_PREFERENCE = eINSTANCE.getReservationPreference();

		/**
		 * The meta object literal for the '<em><b>Preference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PREFERENCE__PREFERENCE = eINSTANCE.getReservationPreference_Preference();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PREFERENCE__GROUP = eINSTANCE.getReservationPreference_Group();

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
		 * The meta object literal for the '{@link Gtm.impl.ConnectionPointImpl <em>Connection Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ConnectionPointImpl
		 * @see Gtm.impl.GtmPackageImpl#getConnectionPoint()
		 * @generated
		 */
		EClass CONNECTION_POINT = eINSTANCE.getConnectionPoint();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_POINT__STATIONS = eINSTANCE.getConnectionPoint_Stations();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POINT__ID = eINSTANCE.getConnectionPoint_Id();

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
		 * The meta object literal for the '<em><b>Excluded Time Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVEL_VALIDITY_CONSTRAINT__EXCLUDED_TIME_RANGE = eINSTANCE.getTravelValidityConstraint_ExcludedTimeRange();

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
		 * The meta object literal for the '{@link Gtm.impl.TimeReferenceImpl <em>Time Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.TimeReferenceImpl
		 * @see Gtm.impl.GtmPackageImpl#getTimeReference()
		 * @generated
		 */
		EClass TIME_REFERENCE = eINSTANCE.getTimeReference();

		/**
		 * The meta object literal for the '<em><b>Referece Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_REFERENCE__REFERECE_TYPE = eINSTANCE.getTimeReference_RefereceType();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_REFERENCE__UNIT = eINSTANCE.getTimeReference_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_REFERENCE__VALUE = eINSTANCE.getTimeReference_Value();

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
		 * The meta object literal for the '<em><b>Via Station</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_VALIDITY__VIA_STATION = eINSTANCE.getRegionalValidity_ViaStation();

		/**
		 * The meta object literal for the '<em><b>Zone</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_VALIDITY__ZONE = eINSTANCE.getRegionalValidity_Zone();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_VALIDITY__LINE = eINSTANCE.getRegionalValidity_Line();

		/**
		 * The meta object literal for the '<em><b>Polygone</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_VALIDITY__POLYGONE = eINSTANCE.getRegionalValidity_Polygone();

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
		 * The meta object literal for the '<em><b>Carrier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIA_STATION__CARRIER = eINSTANCE.getViaStation_Carrier();

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
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONE__CITY = eINSTANCE.getZone_City();

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
		 * The meta object literal for the '<em><b>Egde</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLYGONE__EGDE = eINSTANCE.getPolygone_Egde();

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
		 * The meta object literal for the '<em><b>Passenger Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER_COMBINATION_CONSTRAINT__PASSENGER_TYPE = eINSTANCE.getPassengerCombinationConstraint_PassengerType();

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
		 * The meta object literal for the '{@link Gtm.impl.ZoneDefinitionImpl <em>Zone Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ZoneDefinitionImpl
		 * @see Gtm.impl.GtmPackageImpl#getZoneDefinition()
		 * @generated
		 */
		EClass ZONE_DEFINITION = eINSTANCE.getZoneDefinition();

		/**
		 * The meta object literal for the '<em><b>Zone Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONE_DEFINITION__ZONE_ID = eINSTANCE.getZoneDefinition_ZoneId();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONE_DEFINITION__ID = eINSTANCE.getZoneDefinition_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONE_DEFINITION__NAME = eINSTANCE.getZoneDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE_DEFINITION__STATIONS = eINSTANCE.getZoneDefinition_Stations();

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
		 * The meta object literal for the '<em><b>Conditions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFTER_SALES_RULE__CONDITIONS = eINSTANCE.getAfterSalesRule_Conditions();

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
		 * The meta object literal for the '<em><b>Transfer</b></em>' attribute feature.
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
		 * The meta object literal for the '<em><b>Affected Service Brands</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_BORDER_CONDITION__AFFECTED_SERVICE_BRANDS = eINSTANCE.getCrossBorderCondition_AffectedServiceBrands();

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
		 * The meta object literal for the '<em><b>Accepted Barcodes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODES = eINSTANCE.getFulfillmentConstraint_AcceptedBarcodes();

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
		 * The meta object literal for the '{@link Gtm.impl.FareResourceLocationImpl <em>Fare Resource Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.FareResourceLocationImpl
		 * @see Gtm.impl.GtmPackageImpl#getFareResourceLocation()
		 * @generated
		 */
		EClass FARE_RESOURCE_LOCATION = eINSTANCE.getFareResourceLocation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_RESOURCE_LOCATION__ID = eINSTANCE.getFareResourceLocation_Id();

		/**
		 * The meta object literal for the '<em><b>Carrier Resource Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_RESOURCE_LOCATION__CARRIER_RESOURCE_LOCATIONS = eINSTANCE.getFareResourceLocation_CarrierResourceLocations();

		/**
		 * The meta object literal for the '<em><b>Station Resource Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_RESOURCE_LOCATION__STATION_RESOURCE_LOCATIONS = eINSTANCE.getFareResourceLocation_StationResourceLocations();

		/**
		 * The meta object literal for the '<em><b>Train Resource Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_RESOURCE_LOCATION__TRAIN_RESOURCE_LOCATIONS = eINSTANCE.getFareResourceLocation_TrainResourceLocations();

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
		 * The meta object literal for the '{@link Gtm.GraphicalReservationType <em>Graphical Reservation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.GraphicalReservationType
		 * @see Gtm.impl.GtmPackageImpl#getGraphicalReservationType()
		 * @generated
		 */
		EEnum GRAPHICAL_RESERVATION_TYPE = eINSTANCE.getGraphicalReservationType();

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
		 * The meta object literal for the '{@link Gtm.LegacySeriesType <em>Legacy Series Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.LegacySeriesType
		 * @see Gtm.impl.GtmPackageImpl#getLegacySeriesType()
		 * @generated
		 */
		EEnum LEGACY_SERIES_TYPE = eINSTANCE.getLegacySeriesType();

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
		 * The meta object literal for the '{@link Gtm.TaxScope <em>Tax Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.TaxScope
		 * @see Gtm.impl.GtmPackageImpl#getTaxScope()
		 * @generated
		 */
		EEnum TAX_SCOPE = eINSTANCE.getTaxScope();

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
		 * The meta object literal for the '{@link Gtm.WeekDay <em>Week Day</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.WeekDay
		 * @see Gtm.impl.GtmPackageImpl#getWeekDay()
		 * @generated
		 */
		EEnum WEEK_DAY = eINSTANCE.getWeekDay();

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
		 * The meta object literal for the '{@link Gtm.Clusters <em>Clusters</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.Clusters
		 * @see Gtm.impl.GtmPackageImpl#getClusters()
		 * @generated
		 */
		EEnum CLUSTERS = eINSTANCE.getClusters();

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
		 * The meta object literal for the '{@link Gtm.LegacyPassengerType <em>Legacy Passenger Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.LegacyPassengerType
		 * @see Gtm.impl.GtmPackageImpl#getLegacyPassengerType()
		 * @generated
		 */
		EEnum LEGACY_PASSENGER_TYPE = eINSTANCE.getLegacyPassengerType();

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
		 * The meta object literal for the '{@link Gtm.AfterSalesTransactionType <em>After Sales Transaction Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.AfterSalesTransactionType
		 * @see Gtm.impl.GtmPackageImpl#getAfterSalesTransactionType()
		 * @generated
		 */
		EEnum AFTER_SALES_TRANSACTION_TYPE = eINSTANCE.getAfterSalesTransactionType();

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
		 * The meta object literal for the '{@link Gtm.OnlineServiceType <em>Online Service Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.OnlineServiceType
		 * @see Gtm.impl.GtmPackageImpl#getOnlineServiceType()
		 * @generated
		 */
		EEnum ONLINE_SERVICE_TYPE = eINSTANCE.getOnlineServiceType();

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
		 * The meta object literal for the '{@link Gtm.BarcodeTypes <em>Barcode Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.BarcodeTypes
		 * @see Gtm.impl.GtmPackageImpl#getBarcodeTypes()
		 * @generated
		 */
		EEnum BARCODE_TYPES = eINSTANCE.getBarcodeTypes();

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
		 * The meta object literal for the '{@link Gtm.OfferRequestType <em>Offer Request Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.OfferRequestType
		 * @see Gtm.impl.GtmPackageImpl#getOfferRequestType()
		 * @generated
		 */
		EEnum OFFER_REQUEST_TYPE = eINSTANCE.getOfferRequestType();

		/**
		 * The meta object literal for the '{@link Gtm.InterfaceType <em>Interface Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.InterfaceType
		 * @see Gtm.impl.GtmPackageImpl#getInterfaceType()
		 * @generated
		 */
		EEnum INTERFACE_TYPE = eINSTANCE.getInterfaceType();

	}

} //GtmPackage
