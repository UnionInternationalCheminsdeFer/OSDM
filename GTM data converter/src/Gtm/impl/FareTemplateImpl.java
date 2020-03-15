/**
 */
package Gtm.impl;

import Gtm.AfterSalesRule;
import Gtm.CarrierConstraint;
import Gtm.CombinationConstraint;
import Gtm.FareTemplate;
import Gtm.FareType;
import Gtm.FulfillmentConstraint;
import Gtm.GtmPackage;
import Gtm.LegacyAccountingIdentifier;
import Gtm.LegacyConversionType;
import Gtm.PassengerConstraint;
import Gtm.PersonalDataConstraint;
import Gtm.Price;
import Gtm.ReductionConstraint;
import Gtm.RegionalConstraint;
import Gtm.ReservationParameter;
import Gtm.SalesAvailabilityConstraint;
import Gtm.ServiceClass;
import Gtm.ServiceConstraint;
import Gtm.ServiceLevel;
import Gtm.Text;
import Gtm.TravelValidityConstraint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fare Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getPriceFactor <em>Price Factor</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getType <em>Type</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getDataDescription <em>Data Description</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getText <em>Text</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getRegionalConstraint <em>Regional Constraint</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getServiceConstraint <em>Service Constraint</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getCarrierConstraint <em>Carrier Constraint</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getServiceClass <em>Service Class</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getServiceLevel <em>Service Level</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getSalesAvailability <em>Sales Availability</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getTravelValidity <em>Travel Validity</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getCombinationConstraint <em>Combination Constraint</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getSeparateContractCombinationConstraint <em>Separate Contract Combination Constraint</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getFareDetailDescription <em>Fare Detail Description</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getLegacyAccountingIdentifier <em>Legacy Accounting Identifier</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getPersonalDataConstraint <em>Personal Data Constraint</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getReservationParameter <em>Reservation Parameter</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getReductionConstraint <em>Reduction Constraint</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getFulfillmentConstraint <em>Fulfillment Constraint</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getPassengerConstraint <em>Passenger Constraint</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getAfterSalesRule <em>After Sales Rule</em>}</li>
 *   <li>{@link Gtm.impl.FareTemplateImpl#getLegacyConversion <em>Legacy Conversion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FareTemplateImpl extends MinimalEObjectImpl.Container implements FareTemplate {
	/**
	 * The default value of the '{@link #getPriceFactor() <em>Price Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceFactor()
	 * @generated
	 * @ordered
	 */
	protected static final float PRICE_FACTOR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPriceFactor() <em>Price Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceFactor()
	 * @generated
	 * @ordered
	 */
	protected float priceFactor = PRICE_FACTOR_EDEFAULT;

	/**
	 * This is true if the Price Factor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean priceFactorESet;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected Price price;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final FareType TYPE_EDEFAULT = FareType.NRT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected FareType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataDescription() <em>Data Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataDescription() <em>Data Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataDescription()
	 * @generated
	 * @ordered
	 */
	protected String dataDescription = DATA_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected Text text;

	/**
	 * The cached value of the '{@link #getRegionalConstraint() <em>Regional Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionalConstraint()
	 * @generated
	 * @ordered
	 */
	protected RegionalConstraint regionalConstraint;

	/**
	 * The cached value of the '{@link #getServiceConstraint() <em>Service Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceConstraint()
	 * @generated
	 * @ordered
	 */
	protected ServiceConstraint serviceConstraint;

	/**
	 * The cached value of the '{@link #getCarrierConstraint() <em>Carrier Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierConstraint()
	 * @generated
	 * @ordered
	 */
	protected CarrierConstraint carrierConstraint;

	/**
	 * The cached value of the '{@link #getServiceClass() <em>Service Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceClass()
	 * @generated
	 * @ordered
	 */
	protected ServiceClass serviceClass;

	/**
	 * The cached value of the '{@link #getServiceLevel() <em>Service Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLevel()
	 * @generated
	 * @ordered
	 */
	protected ServiceLevel serviceLevel;

	/**
	 * The cached value of the '{@link #getSalesAvailability() <em>Sales Availability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesAvailability()
	 * @generated
	 * @ordered
	 */
	protected SalesAvailabilityConstraint salesAvailability;

	/**
	 * The cached value of the '{@link #getTravelValidity() <em>Travel Validity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelValidity()
	 * @generated
	 * @ordered
	 */
	protected TravelValidityConstraint travelValidity;

	/**
	 * The cached value of the '{@link #getCombinationConstraint() <em>Combination Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombinationConstraint()
	 * @generated
	 * @ordered
	 */
	protected CombinationConstraint combinationConstraint;

	/**
	 * The cached value of the '{@link #getSeparateContractCombinationConstraint() <em>Separate Contract Combination Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparateContractCombinationConstraint()
	 * @generated
	 * @ordered
	 */
	protected CombinationConstraint separateContractCombinationConstraint;

	/**
	 * The cached value of the '{@link #getFareDetailDescription() <em>Fare Detail Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFareDetailDescription()
	 * @generated
	 * @ordered
	 */
	protected Text fareDetailDescription;

	/**
	 * The cached value of the '{@link #getLegacyAccountingIdentifier() <em>Legacy Accounting Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyAccountingIdentifier()
	 * @generated
	 * @ordered
	 */
	protected LegacyAccountingIdentifier legacyAccountingIdentifier;

	/**
	 * The cached value of the '{@link #getPersonalDataConstraint() <em>Personal Data Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonalDataConstraint()
	 * @generated
	 * @ordered
	 */
	protected PersonalDataConstraint personalDataConstraint;

	/**
	 * The cached value of the '{@link #getReservationParameter() <em>Reservation Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservationParameter()
	 * @generated
	 * @ordered
	 */
	protected ReservationParameter reservationParameter;

	/**
	 * The cached value of the '{@link #getReductionConstraint() <em>Reduction Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReductionConstraint()
	 * @generated
	 * @ordered
	 */
	protected ReductionConstraint reductionConstraint;

	/**
	 * The cached value of the '{@link #getFulfillmentConstraint() <em>Fulfillment Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFulfillmentConstraint()
	 * @generated
	 * @ordered
	 */
	protected FulfillmentConstraint fulfillmentConstraint;

	/**
	 * The cached value of the '{@link #getPassengerConstraint() <em>Passenger Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerConstraint()
	 * @generated
	 * @ordered
	 */
	protected PassengerConstraint passengerConstraint;

	/**
	 * The cached value of the '{@link #getAfterSalesRule() <em>After Sales Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterSalesRule()
	 * @generated
	 * @ordered
	 */
	protected AfterSalesRule afterSalesRule;

	/**
	 * The default value of the '{@link #getLegacyConversion() <em>Legacy Conversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyConversion()
	 * @generated
	 * @ordered
	 */
	protected static final LegacyConversionType LEGACY_CONVERSION_EDEFAULT = LegacyConversionType.NO;

	/**
	 * The cached value of the '{@link #getLegacyConversion() <em>Legacy Conversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyConversion()
	 * @generated
	 * @ordered
	 */
	protected LegacyConversionType legacyConversion = LEGACY_CONVERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FareTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.FARE_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPriceFactor() {
		return priceFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriceFactor(float newPriceFactor) {
		float oldPriceFactor = priceFactor;
		priceFactor = newPriceFactor;
		boolean oldPriceFactorESet = priceFactorESet;
		priceFactorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__PRICE_FACTOR, oldPriceFactor, priceFactor, !oldPriceFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPriceFactor() {
		float oldPriceFactor = priceFactor;
		boolean oldPriceFactorESet = priceFactorESet;
		priceFactor = PRICE_FACTOR_EDEFAULT;
		priceFactorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GtmPackage.FARE_TEMPLATE__PRICE_FACTOR, oldPriceFactor, PRICE_FACTOR_EDEFAULT, oldPriceFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPriceFactor() {
		return priceFactorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Price getPrice() {
		if (price != null && price.eIsProxy()) {
			InternalEObject oldPrice = (InternalEObject)price;
			price = (Price)eResolveProxy(oldPrice);
			if (price != oldPrice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__PRICE, oldPrice, price));
			}
		}
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Price basicGetPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(Price newPrice) {
		Price oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FareType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(FareType newType) {
		FareType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataDescription() {
		return dataDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataDescription(String newDataDescription) {
		String oldDataDescription = dataDescription;
		dataDescription = newDataDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__DATA_DESCRIPTION, oldDataDescription, dataDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text getText() {
		if (text != null && text.eIsProxy()) {
			InternalEObject oldText = (InternalEObject)text;
			text = (Text)eResolveProxy(oldText);
			if (text != oldText) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__TEXT, oldText, text));
			}
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text basicGetText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(Text newText) {
		Text oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionalConstraint getRegionalConstraint() {
		if (regionalConstraint != null && regionalConstraint.eIsProxy()) {
			InternalEObject oldRegionalConstraint = (InternalEObject)regionalConstraint;
			regionalConstraint = (RegionalConstraint)eResolveProxy(oldRegionalConstraint);
			if (regionalConstraint != oldRegionalConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__REGIONAL_CONSTRAINT, oldRegionalConstraint, regionalConstraint));
			}
		}
		return regionalConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionalConstraint basicGetRegionalConstraint() {
		return regionalConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegionalConstraint(RegionalConstraint newRegionalConstraint) {
		RegionalConstraint oldRegionalConstraint = regionalConstraint;
		regionalConstraint = newRegionalConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__REGIONAL_CONSTRAINT, oldRegionalConstraint, regionalConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConstraint getServiceConstraint() {
		if (serviceConstraint != null && serviceConstraint.eIsProxy()) {
			InternalEObject oldServiceConstraint = (InternalEObject)serviceConstraint;
			serviceConstraint = (ServiceConstraint)eResolveProxy(oldServiceConstraint);
			if (serviceConstraint != oldServiceConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__SERVICE_CONSTRAINT, oldServiceConstraint, serviceConstraint));
			}
		}
		return serviceConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConstraint basicGetServiceConstraint() {
		return serviceConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceConstraint(ServiceConstraint newServiceConstraint) {
		ServiceConstraint oldServiceConstraint = serviceConstraint;
		serviceConstraint = newServiceConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__SERVICE_CONSTRAINT, oldServiceConstraint, serviceConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarrierConstraint getCarrierConstraint() {
		if (carrierConstraint != null && carrierConstraint.eIsProxy()) {
			InternalEObject oldCarrierConstraint = (InternalEObject)carrierConstraint;
			carrierConstraint = (CarrierConstraint)eResolveProxy(oldCarrierConstraint);
			if (carrierConstraint != oldCarrierConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__CARRIER_CONSTRAINT, oldCarrierConstraint, carrierConstraint));
			}
		}
		return carrierConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarrierConstraint basicGetCarrierConstraint() {
		return carrierConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarrierConstraint(CarrierConstraint newCarrierConstraint) {
		CarrierConstraint oldCarrierConstraint = carrierConstraint;
		carrierConstraint = newCarrierConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__CARRIER_CONSTRAINT, oldCarrierConstraint, carrierConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceClass getServiceClass() {
		if (serviceClass != null && serviceClass.eIsProxy()) {
			InternalEObject oldServiceClass = (InternalEObject)serviceClass;
			serviceClass = (ServiceClass)eResolveProxy(oldServiceClass);
			if (serviceClass != oldServiceClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__SERVICE_CLASS, oldServiceClass, serviceClass));
			}
		}
		return serviceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceClass basicGetServiceClass() {
		return serviceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceClass(ServiceClass newServiceClass) {
		ServiceClass oldServiceClass = serviceClass;
		serviceClass = newServiceClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__SERVICE_CLASS, oldServiceClass, serviceClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevel getServiceLevel() {
		if (serviceLevel != null && serviceLevel.eIsProxy()) {
			InternalEObject oldServiceLevel = (InternalEObject)serviceLevel;
			serviceLevel = (ServiceLevel)eResolveProxy(oldServiceLevel);
			if (serviceLevel != oldServiceLevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__SERVICE_LEVEL, oldServiceLevel, serviceLevel));
			}
		}
		return serviceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevel basicGetServiceLevel() {
		return serviceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceLevel(ServiceLevel newServiceLevel) {
		ServiceLevel oldServiceLevel = serviceLevel;
		serviceLevel = newServiceLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__SERVICE_LEVEL, oldServiceLevel, serviceLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalesAvailabilityConstraint getSalesAvailability() {
		if (salesAvailability != null && salesAvailability.eIsProxy()) {
			InternalEObject oldSalesAvailability = (InternalEObject)salesAvailability;
			salesAvailability = (SalesAvailabilityConstraint)eResolveProxy(oldSalesAvailability);
			if (salesAvailability != oldSalesAvailability) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__SALES_AVAILABILITY, oldSalesAvailability, salesAvailability));
			}
		}
		return salesAvailability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalesAvailabilityConstraint basicGetSalesAvailability() {
		return salesAvailability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalesAvailability(SalesAvailabilityConstraint newSalesAvailability) {
		SalesAvailabilityConstraint oldSalesAvailability = salesAvailability;
		salesAvailability = newSalesAvailability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__SALES_AVAILABILITY, oldSalesAvailability, salesAvailability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelValidityConstraint getTravelValidity() {
		if (travelValidity != null && travelValidity.eIsProxy()) {
			InternalEObject oldTravelValidity = (InternalEObject)travelValidity;
			travelValidity = (TravelValidityConstraint)eResolveProxy(oldTravelValidity);
			if (travelValidity != oldTravelValidity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__TRAVEL_VALIDITY, oldTravelValidity, travelValidity));
			}
		}
		return travelValidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelValidityConstraint basicGetTravelValidity() {
		return travelValidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTravelValidity(TravelValidityConstraint newTravelValidity) {
		TravelValidityConstraint oldTravelValidity = travelValidity;
		travelValidity = newTravelValidity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__TRAVEL_VALIDITY, oldTravelValidity, travelValidity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinationConstraint getCombinationConstraint() {
		if (combinationConstraint != null && combinationConstraint.eIsProxy()) {
			InternalEObject oldCombinationConstraint = (InternalEObject)combinationConstraint;
			combinationConstraint = (CombinationConstraint)eResolveProxy(oldCombinationConstraint);
			if (combinationConstraint != oldCombinationConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__COMBINATION_CONSTRAINT, oldCombinationConstraint, combinationConstraint));
			}
		}
		return combinationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinationConstraint basicGetCombinationConstraint() {
		return combinationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCombinationConstraint(CombinationConstraint newCombinationConstraint) {
		CombinationConstraint oldCombinationConstraint = combinationConstraint;
		combinationConstraint = newCombinationConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__COMBINATION_CONSTRAINT, oldCombinationConstraint, combinationConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinationConstraint getSeparateContractCombinationConstraint() {
		if (separateContractCombinationConstraint != null && separateContractCombinationConstraint.eIsProxy()) {
			InternalEObject oldSeparateContractCombinationConstraint = (InternalEObject)separateContractCombinationConstraint;
			separateContractCombinationConstraint = (CombinationConstraint)eResolveProxy(oldSeparateContractCombinationConstraint);
			if (separateContractCombinationConstraint != oldSeparateContractCombinationConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__SEPARATE_CONTRACT_COMBINATION_CONSTRAINT, oldSeparateContractCombinationConstraint, separateContractCombinationConstraint));
			}
		}
		return separateContractCombinationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinationConstraint basicGetSeparateContractCombinationConstraint() {
		return separateContractCombinationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeparateContractCombinationConstraint(CombinationConstraint newSeparateContractCombinationConstraint) {
		CombinationConstraint oldSeparateContractCombinationConstraint = separateContractCombinationConstraint;
		separateContractCombinationConstraint = newSeparateContractCombinationConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__SEPARATE_CONTRACT_COMBINATION_CONSTRAINT, oldSeparateContractCombinationConstraint, separateContractCombinationConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text getFareDetailDescription() {
		if (fareDetailDescription != null && fareDetailDescription.eIsProxy()) {
			InternalEObject oldFareDetailDescription = (InternalEObject)fareDetailDescription;
			fareDetailDescription = (Text)eResolveProxy(oldFareDetailDescription);
			if (fareDetailDescription != oldFareDetailDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__FARE_DETAIL_DESCRIPTION, oldFareDetailDescription, fareDetailDescription));
			}
		}
		return fareDetailDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text basicGetFareDetailDescription() {
		return fareDetailDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFareDetailDescription(Text newFareDetailDescription) {
		Text oldFareDetailDescription = fareDetailDescription;
		fareDetailDescription = newFareDetailDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__FARE_DETAIL_DESCRIPTION, oldFareDetailDescription, fareDetailDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyAccountingIdentifier getLegacyAccountingIdentifier() {
		return legacyAccountingIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegacyAccountingIdentifier(LegacyAccountingIdentifier newLegacyAccountingIdentifier, NotificationChain msgs) {
		LegacyAccountingIdentifier oldLegacyAccountingIdentifier = legacyAccountingIdentifier;
		legacyAccountingIdentifier = newLegacyAccountingIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__LEGACY_ACCOUNTING_IDENTIFIER, oldLegacyAccountingIdentifier, newLegacyAccountingIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegacyAccountingIdentifier(LegacyAccountingIdentifier newLegacyAccountingIdentifier) {
		if (newLegacyAccountingIdentifier != legacyAccountingIdentifier) {
			NotificationChain msgs = null;
			if (legacyAccountingIdentifier != null)
				msgs = ((InternalEObject)legacyAccountingIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_TEMPLATE__LEGACY_ACCOUNTING_IDENTIFIER, null, msgs);
			if (newLegacyAccountingIdentifier != null)
				msgs = ((InternalEObject)newLegacyAccountingIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FARE_TEMPLATE__LEGACY_ACCOUNTING_IDENTIFIER, null, msgs);
			msgs = basicSetLegacyAccountingIdentifier(newLegacyAccountingIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__LEGACY_ACCOUNTING_IDENTIFIER, newLegacyAccountingIdentifier, newLegacyAccountingIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonalDataConstraint getPersonalDataConstraint() {
		if (personalDataConstraint != null && personalDataConstraint.eIsProxy()) {
			InternalEObject oldPersonalDataConstraint = (InternalEObject)personalDataConstraint;
			personalDataConstraint = (PersonalDataConstraint)eResolveProxy(oldPersonalDataConstraint);
			if (personalDataConstraint != oldPersonalDataConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__PERSONAL_DATA_CONSTRAINT, oldPersonalDataConstraint, personalDataConstraint));
			}
		}
		return personalDataConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonalDataConstraint basicGetPersonalDataConstraint() {
		return personalDataConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonalDataConstraint(PersonalDataConstraint newPersonalDataConstraint) {
		PersonalDataConstraint oldPersonalDataConstraint = personalDataConstraint;
		personalDataConstraint = newPersonalDataConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__PERSONAL_DATA_CONSTRAINT, oldPersonalDataConstraint, personalDataConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationParameter getReservationParameter() {
		if (reservationParameter != null && reservationParameter.eIsProxy()) {
			InternalEObject oldReservationParameter = (InternalEObject)reservationParameter;
			reservationParameter = (ReservationParameter)eResolveProxy(oldReservationParameter);
			if (reservationParameter != oldReservationParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__RESERVATION_PARAMETER, oldReservationParameter, reservationParameter));
			}
		}
		return reservationParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationParameter basicGetReservationParameter() {
		return reservationParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservationParameter(ReservationParameter newReservationParameter) {
		ReservationParameter oldReservationParameter = reservationParameter;
		reservationParameter = newReservationParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__RESERVATION_PARAMETER, oldReservationParameter, reservationParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReductionConstraint getReductionConstraint() {
		if (reductionConstraint != null && reductionConstraint.eIsProxy()) {
			InternalEObject oldReductionConstraint = (InternalEObject)reductionConstraint;
			reductionConstraint = (ReductionConstraint)eResolveProxy(oldReductionConstraint);
			if (reductionConstraint != oldReductionConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__REDUCTION_CONSTRAINT, oldReductionConstraint, reductionConstraint));
			}
		}
		return reductionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReductionConstraint basicGetReductionConstraint() {
		return reductionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReductionConstraint(ReductionConstraint newReductionConstraint) {
		ReductionConstraint oldReductionConstraint = reductionConstraint;
		reductionConstraint = newReductionConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__REDUCTION_CONSTRAINT, oldReductionConstraint, reductionConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FulfillmentConstraint getFulfillmentConstraint() {
		if (fulfillmentConstraint != null && fulfillmentConstraint.eIsProxy()) {
			InternalEObject oldFulfillmentConstraint = (InternalEObject)fulfillmentConstraint;
			fulfillmentConstraint = (FulfillmentConstraint)eResolveProxy(oldFulfillmentConstraint);
			if (fulfillmentConstraint != oldFulfillmentConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__FULFILLMENT_CONSTRAINT, oldFulfillmentConstraint, fulfillmentConstraint));
			}
		}
		return fulfillmentConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FulfillmentConstraint basicGetFulfillmentConstraint() {
		return fulfillmentConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFulfillmentConstraint(FulfillmentConstraint newFulfillmentConstraint) {
		FulfillmentConstraint oldFulfillmentConstraint = fulfillmentConstraint;
		fulfillmentConstraint = newFulfillmentConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__FULFILLMENT_CONSTRAINT, oldFulfillmentConstraint, fulfillmentConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassengerConstraint getPassengerConstraint() {
		if (passengerConstraint != null && passengerConstraint.eIsProxy()) {
			InternalEObject oldPassengerConstraint = (InternalEObject)passengerConstraint;
			passengerConstraint = (PassengerConstraint)eResolveProxy(oldPassengerConstraint);
			if (passengerConstraint != oldPassengerConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__PASSENGER_CONSTRAINT, oldPassengerConstraint, passengerConstraint));
			}
		}
		return passengerConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassengerConstraint basicGetPassengerConstraint() {
		return passengerConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerConstraint(PassengerConstraint newPassengerConstraint) {
		PassengerConstraint oldPassengerConstraint = passengerConstraint;
		passengerConstraint = newPassengerConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__PASSENGER_CONSTRAINT, oldPassengerConstraint, passengerConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AfterSalesRule getAfterSalesRule() {
		if (afterSalesRule != null && afterSalesRule.eIsProxy()) {
			InternalEObject oldAfterSalesRule = (InternalEObject)afterSalesRule;
			afterSalesRule = (AfterSalesRule)eResolveProxy(oldAfterSalesRule);
			if (afterSalesRule != oldAfterSalesRule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FARE_TEMPLATE__AFTER_SALES_RULE, oldAfterSalesRule, afterSalesRule));
			}
		}
		return afterSalesRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AfterSalesRule basicGetAfterSalesRule() {
		return afterSalesRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfterSalesRule(AfterSalesRule newAfterSalesRule) {
		AfterSalesRule oldAfterSalesRule = afterSalesRule;
		afterSalesRule = newAfterSalesRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__AFTER_SALES_RULE, oldAfterSalesRule, afterSalesRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyConversionType getLegacyConversion() {
		return legacyConversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegacyConversion(LegacyConversionType newLegacyConversion) {
		LegacyConversionType oldLegacyConversion = legacyConversion;
		legacyConversion = newLegacyConversion == null ? LEGACY_CONVERSION_EDEFAULT : newLegacyConversion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_TEMPLATE__LEGACY_CONVERSION, oldLegacyConversion, legacyConversion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.FARE_TEMPLATE__LEGACY_ACCOUNTING_IDENTIFIER:
				return basicSetLegacyAccountingIdentifier(null, msgs);
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
			case GtmPackage.FARE_TEMPLATE__PRICE_FACTOR:
				return getPriceFactor();
			case GtmPackage.FARE_TEMPLATE__PRICE:
				if (resolve) return getPrice();
				return basicGetPrice();
			case GtmPackage.FARE_TEMPLATE__ID:
				return getId();
			case GtmPackage.FARE_TEMPLATE__TYPE:
				return getType();
			case GtmPackage.FARE_TEMPLATE__DATA_DESCRIPTION:
				return getDataDescription();
			case GtmPackage.FARE_TEMPLATE__TEXT:
				if (resolve) return getText();
				return basicGetText();
			case GtmPackage.FARE_TEMPLATE__REGIONAL_CONSTRAINT:
				if (resolve) return getRegionalConstraint();
				return basicGetRegionalConstraint();
			case GtmPackage.FARE_TEMPLATE__SERVICE_CONSTRAINT:
				if (resolve) return getServiceConstraint();
				return basicGetServiceConstraint();
			case GtmPackage.FARE_TEMPLATE__CARRIER_CONSTRAINT:
				if (resolve) return getCarrierConstraint();
				return basicGetCarrierConstraint();
			case GtmPackage.FARE_TEMPLATE__SERVICE_CLASS:
				if (resolve) return getServiceClass();
				return basicGetServiceClass();
			case GtmPackage.FARE_TEMPLATE__SERVICE_LEVEL:
				if (resolve) return getServiceLevel();
				return basicGetServiceLevel();
			case GtmPackage.FARE_TEMPLATE__SALES_AVAILABILITY:
				if (resolve) return getSalesAvailability();
				return basicGetSalesAvailability();
			case GtmPackage.FARE_TEMPLATE__TRAVEL_VALIDITY:
				if (resolve) return getTravelValidity();
				return basicGetTravelValidity();
			case GtmPackage.FARE_TEMPLATE__COMBINATION_CONSTRAINT:
				if (resolve) return getCombinationConstraint();
				return basicGetCombinationConstraint();
			case GtmPackage.FARE_TEMPLATE__SEPARATE_CONTRACT_COMBINATION_CONSTRAINT:
				if (resolve) return getSeparateContractCombinationConstraint();
				return basicGetSeparateContractCombinationConstraint();
			case GtmPackage.FARE_TEMPLATE__FARE_DETAIL_DESCRIPTION:
				if (resolve) return getFareDetailDescription();
				return basicGetFareDetailDescription();
			case GtmPackage.FARE_TEMPLATE__LEGACY_ACCOUNTING_IDENTIFIER:
				return getLegacyAccountingIdentifier();
			case GtmPackage.FARE_TEMPLATE__PERSONAL_DATA_CONSTRAINT:
				if (resolve) return getPersonalDataConstraint();
				return basicGetPersonalDataConstraint();
			case GtmPackage.FARE_TEMPLATE__RESERVATION_PARAMETER:
				if (resolve) return getReservationParameter();
				return basicGetReservationParameter();
			case GtmPackage.FARE_TEMPLATE__REDUCTION_CONSTRAINT:
				if (resolve) return getReductionConstraint();
				return basicGetReductionConstraint();
			case GtmPackage.FARE_TEMPLATE__FULFILLMENT_CONSTRAINT:
				if (resolve) return getFulfillmentConstraint();
				return basicGetFulfillmentConstraint();
			case GtmPackage.FARE_TEMPLATE__PASSENGER_CONSTRAINT:
				if (resolve) return getPassengerConstraint();
				return basicGetPassengerConstraint();
			case GtmPackage.FARE_TEMPLATE__AFTER_SALES_RULE:
				if (resolve) return getAfterSalesRule();
				return basicGetAfterSalesRule();
			case GtmPackage.FARE_TEMPLATE__LEGACY_CONVERSION:
				return getLegacyConversion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GtmPackage.FARE_TEMPLATE__PRICE_FACTOR:
				setPriceFactor((Float)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__PRICE:
				setPrice((Price)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__ID:
				setId((String)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__TYPE:
				setType((FareType)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__DATA_DESCRIPTION:
				setDataDescription((String)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__TEXT:
				setText((Text)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__REGIONAL_CONSTRAINT:
				setRegionalConstraint((RegionalConstraint)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__SERVICE_CONSTRAINT:
				setServiceConstraint((ServiceConstraint)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__CARRIER_CONSTRAINT:
				setCarrierConstraint((CarrierConstraint)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__SERVICE_CLASS:
				setServiceClass((ServiceClass)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__SERVICE_LEVEL:
				setServiceLevel((ServiceLevel)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__SALES_AVAILABILITY:
				setSalesAvailability((SalesAvailabilityConstraint)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__TRAVEL_VALIDITY:
				setTravelValidity((TravelValidityConstraint)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__COMBINATION_CONSTRAINT:
				setCombinationConstraint((CombinationConstraint)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__SEPARATE_CONTRACT_COMBINATION_CONSTRAINT:
				setSeparateContractCombinationConstraint((CombinationConstraint)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__FARE_DETAIL_DESCRIPTION:
				setFareDetailDescription((Text)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__LEGACY_ACCOUNTING_IDENTIFIER:
				setLegacyAccountingIdentifier((LegacyAccountingIdentifier)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__PERSONAL_DATA_CONSTRAINT:
				setPersonalDataConstraint((PersonalDataConstraint)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__RESERVATION_PARAMETER:
				setReservationParameter((ReservationParameter)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__REDUCTION_CONSTRAINT:
				setReductionConstraint((ReductionConstraint)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__FULFILLMENT_CONSTRAINT:
				setFulfillmentConstraint((FulfillmentConstraint)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__PASSENGER_CONSTRAINT:
				setPassengerConstraint((PassengerConstraint)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__AFTER_SALES_RULE:
				setAfterSalesRule((AfterSalesRule)newValue);
				return;
			case GtmPackage.FARE_TEMPLATE__LEGACY_CONVERSION:
				setLegacyConversion((LegacyConversionType)newValue);
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
			case GtmPackage.FARE_TEMPLATE__PRICE_FACTOR:
				unsetPriceFactor();
				return;
			case GtmPackage.FARE_TEMPLATE__PRICE:
				setPrice((Price)null);
				return;
			case GtmPackage.FARE_TEMPLATE__ID:
				setId(ID_EDEFAULT);
				return;
			case GtmPackage.FARE_TEMPLATE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GtmPackage.FARE_TEMPLATE__DATA_DESCRIPTION:
				setDataDescription(DATA_DESCRIPTION_EDEFAULT);
				return;
			case GtmPackage.FARE_TEMPLATE__TEXT:
				setText((Text)null);
				return;
			case GtmPackage.FARE_TEMPLATE__REGIONAL_CONSTRAINT:
				setRegionalConstraint((RegionalConstraint)null);
				return;
			case GtmPackage.FARE_TEMPLATE__SERVICE_CONSTRAINT:
				setServiceConstraint((ServiceConstraint)null);
				return;
			case GtmPackage.FARE_TEMPLATE__CARRIER_CONSTRAINT:
				setCarrierConstraint((CarrierConstraint)null);
				return;
			case GtmPackage.FARE_TEMPLATE__SERVICE_CLASS:
				setServiceClass((ServiceClass)null);
				return;
			case GtmPackage.FARE_TEMPLATE__SERVICE_LEVEL:
				setServiceLevel((ServiceLevel)null);
				return;
			case GtmPackage.FARE_TEMPLATE__SALES_AVAILABILITY:
				setSalesAvailability((SalesAvailabilityConstraint)null);
				return;
			case GtmPackage.FARE_TEMPLATE__TRAVEL_VALIDITY:
				setTravelValidity((TravelValidityConstraint)null);
				return;
			case GtmPackage.FARE_TEMPLATE__COMBINATION_CONSTRAINT:
				setCombinationConstraint((CombinationConstraint)null);
				return;
			case GtmPackage.FARE_TEMPLATE__SEPARATE_CONTRACT_COMBINATION_CONSTRAINT:
				setSeparateContractCombinationConstraint((CombinationConstraint)null);
				return;
			case GtmPackage.FARE_TEMPLATE__FARE_DETAIL_DESCRIPTION:
				setFareDetailDescription((Text)null);
				return;
			case GtmPackage.FARE_TEMPLATE__LEGACY_ACCOUNTING_IDENTIFIER:
				setLegacyAccountingIdentifier((LegacyAccountingIdentifier)null);
				return;
			case GtmPackage.FARE_TEMPLATE__PERSONAL_DATA_CONSTRAINT:
				setPersonalDataConstraint((PersonalDataConstraint)null);
				return;
			case GtmPackage.FARE_TEMPLATE__RESERVATION_PARAMETER:
				setReservationParameter((ReservationParameter)null);
				return;
			case GtmPackage.FARE_TEMPLATE__REDUCTION_CONSTRAINT:
				setReductionConstraint((ReductionConstraint)null);
				return;
			case GtmPackage.FARE_TEMPLATE__FULFILLMENT_CONSTRAINT:
				setFulfillmentConstraint((FulfillmentConstraint)null);
				return;
			case GtmPackage.FARE_TEMPLATE__PASSENGER_CONSTRAINT:
				setPassengerConstraint((PassengerConstraint)null);
				return;
			case GtmPackage.FARE_TEMPLATE__AFTER_SALES_RULE:
				setAfterSalesRule((AfterSalesRule)null);
				return;
			case GtmPackage.FARE_TEMPLATE__LEGACY_CONVERSION:
				setLegacyConversion(LEGACY_CONVERSION_EDEFAULT);
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
			case GtmPackage.FARE_TEMPLATE__PRICE_FACTOR:
				return isSetPriceFactor();
			case GtmPackage.FARE_TEMPLATE__PRICE:
				return price != null;
			case GtmPackage.FARE_TEMPLATE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GtmPackage.FARE_TEMPLATE__TYPE:
				return type != TYPE_EDEFAULT;
			case GtmPackage.FARE_TEMPLATE__DATA_DESCRIPTION:
				return DATA_DESCRIPTION_EDEFAULT == null ? dataDescription != null : !DATA_DESCRIPTION_EDEFAULT.equals(dataDescription);
			case GtmPackage.FARE_TEMPLATE__TEXT:
				return text != null;
			case GtmPackage.FARE_TEMPLATE__REGIONAL_CONSTRAINT:
				return regionalConstraint != null;
			case GtmPackage.FARE_TEMPLATE__SERVICE_CONSTRAINT:
				return serviceConstraint != null;
			case GtmPackage.FARE_TEMPLATE__CARRIER_CONSTRAINT:
				return carrierConstraint != null;
			case GtmPackage.FARE_TEMPLATE__SERVICE_CLASS:
				return serviceClass != null;
			case GtmPackage.FARE_TEMPLATE__SERVICE_LEVEL:
				return serviceLevel != null;
			case GtmPackage.FARE_TEMPLATE__SALES_AVAILABILITY:
				return salesAvailability != null;
			case GtmPackage.FARE_TEMPLATE__TRAVEL_VALIDITY:
				return travelValidity != null;
			case GtmPackage.FARE_TEMPLATE__COMBINATION_CONSTRAINT:
				return combinationConstraint != null;
			case GtmPackage.FARE_TEMPLATE__SEPARATE_CONTRACT_COMBINATION_CONSTRAINT:
				return separateContractCombinationConstraint != null;
			case GtmPackage.FARE_TEMPLATE__FARE_DETAIL_DESCRIPTION:
				return fareDetailDescription != null;
			case GtmPackage.FARE_TEMPLATE__LEGACY_ACCOUNTING_IDENTIFIER:
				return legacyAccountingIdentifier != null;
			case GtmPackage.FARE_TEMPLATE__PERSONAL_DATA_CONSTRAINT:
				return personalDataConstraint != null;
			case GtmPackage.FARE_TEMPLATE__RESERVATION_PARAMETER:
				return reservationParameter != null;
			case GtmPackage.FARE_TEMPLATE__REDUCTION_CONSTRAINT:
				return reductionConstraint != null;
			case GtmPackage.FARE_TEMPLATE__FULFILLMENT_CONSTRAINT:
				return fulfillmentConstraint != null;
			case GtmPackage.FARE_TEMPLATE__PASSENGER_CONSTRAINT:
				return passengerConstraint != null;
			case GtmPackage.FARE_TEMPLATE__AFTER_SALES_RULE:
				return afterSalesRule != null;
			case GtmPackage.FARE_TEMPLATE__LEGACY_CONVERSION:
				return legacyConversion != LEGACY_CONVERSION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (priceFactor: ");
		if (priceFactorESet) result.append(priceFactor); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", type: ");
		result.append(type);
		result.append(", dataDescription: ");
		result.append(dataDescription);
		result.append(", legacyConversion: ");
		result.append(legacyConversion);
		result.append(')');
		return result.toString();
	}

} //FareTemplateImpl
