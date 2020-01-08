/**
 */
package Gtm.impl;

import Gtm.CarrierConstraint;
import Gtm.CombinationConstraint;
import Gtm.FareType;
import Gtm.GtmPackage;
import Gtm.SalesAvailabilityConstraint;
import Gtm.ServiceClass;
import Gtm.ServiceConstraint;
import Gtm.ServiceLevel;
import Gtm.TargetFareTemplate;
import Gtm.Text;
import Gtm.TravelValidityConstraint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Fare Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.TargetFareTemplateImpl#getPriceFactor <em>Price Factor</em>}</li>
 *   <li>{@link Gtm.impl.TargetFareTemplateImpl#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.impl.TargetFareTemplateImpl#getType <em>Type</em>}</li>
 *   <li>{@link Gtm.impl.TargetFareTemplateImpl#getDataDescription <em>Data Description</em>}</li>
 *   <li>{@link Gtm.impl.TargetFareTemplateImpl#getText <em>Text</em>}</li>
 *   <li>{@link Gtm.impl.TargetFareTemplateImpl#getServiceConstraint <em>Service Constraint</em>}</li>
 *   <li>{@link Gtm.impl.TargetFareTemplateImpl#getCarrierConstraint <em>Carrier Constraint</em>}</li>
 *   <li>{@link Gtm.impl.TargetFareTemplateImpl#getServiceClass <em>Service Class</em>}</li>
 *   <li>{@link Gtm.impl.TargetFareTemplateImpl#getServiceLevel <em>Service Level</em>}</li>
 *   <li>{@link Gtm.impl.TargetFareTemplateImpl#getSalesAvailability <em>Sales Availability</em>}</li>
 *   <li>{@link Gtm.impl.TargetFareTemplateImpl#getTravelValidity <em>Travel Validity</em>}</li>
 *   <li>{@link Gtm.impl.TargetFareTemplateImpl#getCombinationConstraint <em>Combination Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetFareTemplateImpl extends MinimalEObjectImpl.Container implements TargetFareTemplate {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetFareTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.TARGET_FARE_TEMPLATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TARGET_FARE_TEMPLATE__PRICE_FACTOR, oldPriceFactor, priceFactor, !oldPriceFactorESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, GtmPackage.TARGET_FARE_TEMPLATE__PRICE_FACTOR, oldPriceFactor, PRICE_FACTOR_EDEFAULT, oldPriceFactorESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TARGET_FARE_TEMPLATE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TARGET_FARE_TEMPLATE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TARGET_FARE_TEMPLATE__DATA_DESCRIPTION, oldDataDescription, dataDescription));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.TARGET_FARE_TEMPLATE__TEXT, oldText, text));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TARGET_FARE_TEMPLATE__TEXT, oldText, text));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.TARGET_FARE_TEMPLATE__SERVICE_CONSTRAINT, oldServiceConstraint, serviceConstraint));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TARGET_FARE_TEMPLATE__SERVICE_CONSTRAINT, oldServiceConstraint, serviceConstraint));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.TARGET_FARE_TEMPLATE__CARRIER_CONSTRAINT, oldCarrierConstraint, carrierConstraint));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TARGET_FARE_TEMPLATE__CARRIER_CONSTRAINT, oldCarrierConstraint, carrierConstraint));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.TARGET_FARE_TEMPLATE__SERVICE_CLASS, oldServiceClass, serviceClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TARGET_FARE_TEMPLATE__SERVICE_CLASS, oldServiceClass, serviceClass));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.TARGET_FARE_TEMPLATE__SERVICE_LEVEL, oldServiceLevel, serviceLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TARGET_FARE_TEMPLATE__SERVICE_LEVEL, oldServiceLevel, serviceLevel));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.TARGET_FARE_TEMPLATE__SALES_AVAILABILITY, oldSalesAvailability, salesAvailability));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TARGET_FARE_TEMPLATE__SALES_AVAILABILITY, oldSalesAvailability, salesAvailability));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.TARGET_FARE_TEMPLATE__TRAVEL_VALIDITY, oldTravelValidity, travelValidity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TARGET_FARE_TEMPLATE__TRAVEL_VALIDITY, oldTravelValidity, travelValidity));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.TARGET_FARE_TEMPLATE__COMBINATION_CONSTRAINT, oldCombinationConstraint, combinationConstraint));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TARGET_FARE_TEMPLATE__COMBINATION_CONSTRAINT, oldCombinationConstraint, combinationConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.TARGET_FARE_TEMPLATE__PRICE_FACTOR:
				return getPriceFactor();
			case GtmPackage.TARGET_FARE_TEMPLATE__ID:
				return getId();
			case GtmPackage.TARGET_FARE_TEMPLATE__TYPE:
				return getType();
			case GtmPackage.TARGET_FARE_TEMPLATE__DATA_DESCRIPTION:
				return getDataDescription();
			case GtmPackage.TARGET_FARE_TEMPLATE__TEXT:
				if (resolve) return getText();
				return basicGetText();
			case GtmPackage.TARGET_FARE_TEMPLATE__SERVICE_CONSTRAINT:
				if (resolve) return getServiceConstraint();
				return basicGetServiceConstraint();
			case GtmPackage.TARGET_FARE_TEMPLATE__CARRIER_CONSTRAINT:
				if (resolve) return getCarrierConstraint();
				return basicGetCarrierConstraint();
			case GtmPackage.TARGET_FARE_TEMPLATE__SERVICE_CLASS:
				if (resolve) return getServiceClass();
				return basicGetServiceClass();
			case GtmPackage.TARGET_FARE_TEMPLATE__SERVICE_LEVEL:
				if (resolve) return getServiceLevel();
				return basicGetServiceLevel();
			case GtmPackage.TARGET_FARE_TEMPLATE__SALES_AVAILABILITY:
				if (resolve) return getSalesAvailability();
				return basicGetSalesAvailability();
			case GtmPackage.TARGET_FARE_TEMPLATE__TRAVEL_VALIDITY:
				if (resolve) return getTravelValidity();
				return basicGetTravelValidity();
			case GtmPackage.TARGET_FARE_TEMPLATE__COMBINATION_CONSTRAINT:
				if (resolve) return getCombinationConstraint();
				return basicGetCombinationConstraint();
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
			case GtmPackage.TARGET_FARE_TEMPLATE__PRICE_FACTOR:
				setPriceFactor((Float)newValue);
				return;
			case GtmPackage.TARGET_FARE_TEMPLATE__ID:
				setId((String)newValue);
				return;
			case GtmPackage.TARGET_FARE_TEMPLATE__TYPE:
				setType((FareType)newValue);
				return;
			case GtmPackage.TARGET_FARE_TEMPLATE__DATA_DESCRIPTION:
				setDataDescription((String)newValue);
				return;
			case GtmPackage.TARGET_FARE_TEMPLATE__TEXT:
				setText((Text)newValue);
				return;
			case GtmPackage.TARGET_FARE_TEMPLATE__SERVICE_CONSTRAINT:
				setServiceConstraint((ServiceConstraint)newValue);
				return;
			case GtmPackage.TARGET_FARE_TEMPLATE__CARRIER_CONSTRAINT:
				setCarrierConstraint((CarrierConstraint)newValue);
				return;
			case GtmPackage.TARGET_FARE_TEMPLATE__SERVICE_CLASS:
				setServiceClass((ServiceClass)newValue);
				return;
			case GtmPackage.TARGET_FARE_TEMPLATE__SERVICE_LEVEL:
				setServiceLevel((ServiceLevel)newValue);
				return;
			case GtmPackage.TARGET_FARE_TEMPLATE__SALES_AVAILABILITY:
				setSalesAvailability((SalesAvailabilityConstraint)newValue);
				return;
			case GtmPackage.TARGET_FARE_TEMPLATE__TRAVEL_VALIDITY:
				setTravelValidity((TravelValidityConstraint)newValue);
				return;
			case GtmPackage.TARGET_FARE_TEMPLATE__COMBINATION_CONSTRAINT:
				setCombinationConstraint((CombinationConstraint)newValue);
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
			case GtmPackage.TARGET_FARE_TEMPLATE__PRICE_FACTOR:
				unsetPriceFactor();
				return;
			case GtmPackage.TARGET_FARE_TEMPLATE__ID:
				setId(ID_EDEFAULT);
				return;
			case GtmPackage.TARGET_FARE_TEMPLATE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GtmPackage.TARGET_FARE_TEMPLATE__DATA_DESCRIPTION:
				setDataDescription(DATA_DESCRIPTION_EDEFAULT);
				return;
			case GtmPackage.TARGET_FARE_TEMPLATE__TEXT:
				setText((Text)null);
				return;
			case GtmPackage.TARGET_FARE_TEMPLATE__SERVICE_CONSTRAINT:
				setServiceConstraint((ServiceConstraint)null);
				return;
			case GtmPackage.TARGET_FARE_TEMPLATE__CARRIER_CONSTRAINT:
				setCarrierConstraint((CarrierConstraint)null);
				return;
			case GtmPackage.TARGET_FARE_TEMPLATE__SERVICE_CLASS:
				setServiceClass((ServiceClass)null);
				return;
			case GtmPackage.TARGET_FARE_TEMPLATE__SERVICE_LEVEL:
				setServiceLevel((ServiceLevel)null);
				return;
			case GtmPackage.TARGET_FARE_TEMPLATE__SALES_AVAILABILITY:
				setSalesAvailability((SalesAvailabilityConstraint)null);
				return;
			case GtmPackage.TARGET_FARE_TEMPLATE__TRAVEL_VALIDITY:
				setTravelValidity((TravelValidityConstraint)null);
				return;
			case GtmPackage.TARGET_FARE_TEMPLATE__COMBINATION_CONSTRAINT:
				setCombinationConstraint((CombinationConstraint)null);
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
			case GtmPackage.TARGET_FARE_TEMPLATE__PRICE_FACTOR:
				return isSetPriceFactor();
			case GtmPackage.TARGET_FARE_TEMPLATE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GtmPackage.TARGET_FARE_TEMPLATE__TYPE:
				return type != TYPE_EDEFAULT;
			case GtmPackage.TARGET_FARE_TEMPLATE__DATA_DESCRIPTION:
				return DATA_DESCRIPTION_EDEFAULT == null ? dataDescription != null : !DATA_DESCRIPTION_EDEFAULT.equals(dataDescription);
			case GtmPackage.TARGET_FARE_TEMPLATE__TEXT:
				return text != null;
			case GtmPackage.TARGET_FARE_TEMPLATE__SERVICE_CONSTRAINT:
				return serviceConstraint != null;
			case GtmPackage.TARGET_FARE_TEMPLATE__CARRIER_CONSTRAINT:
				return carrierConstraint != null;
			case GtmPackage.TARGET_FARE_TEMPLATE__SERVICE_CLASS:
				return serviceClass != null;
			case GtmPackage.TARGET_FARE_TEMPLATE__SERVICE_LEVEL:
				return serviceLevel != null;
			case GtmPackage.TARGET_FARE_TEMPLATE__SALES_AVAILABILITY:
				return salesAvailability != null;
			case GtmPackage.TARGET_FARE_TEMPLATE__TRAVEL_VALIDITY:
				return travelValidity != null;
			case GtmPackage.TARGET_FARE_TEMPLATE__COMBINATION_CONSTRAINT:
				return combinationConstraint != null;
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
		result.append(')');
		return result.toString();
	}

} //TargetFareTemplateImpl
