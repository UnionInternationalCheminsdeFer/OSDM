/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.LegacyCalculationType;
import Gtm.LegacySeries;
import Gtm.LegacySeriesType;
import Gtm.LegacyViastation;

import java.util.Collection;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legacy Series</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.LegacySeriesImpl#getSupplyingCarrierCode <em>Supplying Carrier Code</em>}</li>
 *   <li>{@link Gtm.impl.LegacySeriesImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link Gtm.impl.LegacySeriesImpl#getFareTableNumber <em>Fare Table Number</em>}</li>
 *   <li>{@link Gtm.impl.LegacySeriesImpl#getType <em>Type</em>}</li>
 *   <li>{@link Gtm.impl.LegacySeriesImpl#getFromStation <em>From Station</em>}</li>
 *   <li>{@link Gtm.impl.LegacySeriesImpl#getFromStationName <em>From Station Name</em>}</li>
 *   <li>{@link Gtm.impl.LegacySeriesImpl#getToStation <em>To Station</em>}</li>
 *   <li>{@link Gtm.impl.LegacySeriesImpl#getToStationName <em>To Station Name</em>}</li>
 *   <li>{@link Gtm.impl.LegacySeriesImpl#getRouteNumber <em>Route Number</em>}</li>
 *   <li>{@link Gtm.impl.LegacySeriesImpl#getCarrierCode <em>Carrier Code</em>}</li>
 *   <li>{@link Gtm.impl.LegacySeriesImpl#getRouteDescription <em>Route Description</em>}</li>
 *   <li>{@link Gtm.impl.LegacySeriesImpl#getPricetype <em>Pricetype</em>}</li>
 *   <li>{@link Gtm.impl.LegacySeriesImpl#getDistance1 <em>Distance1</em>}</li>
 *   <li>{@link Gtm.impl.LegacySeriesImpl#getDistance2 <em>Distance2</em>}</li>
 *   <li>{@link Gtm.impl.LegacySeriesImpl#getViastations <em>Viastations</em>}</li>
 *   <li>{@link Gtm.impl.LegacySeriesImpl#getValidFrom <em>Valid From</em>}</li>
 *   <li>{@link Gtm.impl.LegacySeriesImpl#getValidUntil <em>Valid Until</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegacySeriesImpl extends MinimalEObjectImpl.Container implements LegacySeries {
	/**
	 * The default value of the '{@link #getSupplyingCarrierCode() <em>Supplying Carrier Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplyingCarrierCode()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPLYING_CARRIER_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupplyingCarrierCode() <em>Supplying Carrier Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplyingCarrierCode()
	 * @generated
	 * @ordered
	 */
	protected String supplyingCarrierCode = SUPPLYING_CARRIER_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFareTableNumber() <em>Fare Table Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFareTableNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int FARE_TABLE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFareTableNumber() <em>Fare Table Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFareTableNumber()
	 * @generated
	 * @ordered
	 */
	protected int fareTableNumber = FARE_TABLE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final LegacySeriesType TYPE_EDEFAULT = LegacySeriesType.BORDER_DESTINATION;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected LegacySeriesType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromStation() <em>From Station</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromStation()
	 * @generated
	 * @ordered
	 */
	protected static final int FROM_STATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFromStation() <em>From Station</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromStation()
	 * @generated
	 * @ordered
	 */
	protected int fromStation = FROM_STATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromStationName() <em>From Station Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromStationName()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_STATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromStationName() <em>From Station Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromStationName()
	 * @generated
	 * @ordered
	 */
	protected String fromStationName = FROM_STATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getToStation() <em>To Station</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToStation()
	 * @generated
	 * @ordered
	 */
	protected static final int TO_STATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getToStation() <em>To Station</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToStation()
	 * @generated
	 * @ordered
	 */
	protected int toStation = TO_STATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getToStationName() <em>To Station Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToStationName()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_STATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToStationName() <em>To Station Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToStationName()
	 * @generated
	 * @ordered
	 */
	protected String toStationName = TO_STATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRouteNumber() <em>Route Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int ROUTE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRouteNumber() <em>Route Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteNumber()
	 * @generated
	 * @ordered
	 */
	protected int routeNumber = ROUTE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCarrierCode() <em>Carrier Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CARRIER_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCarrierCode() <em>Carrier Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierCode()
	 * @generated
	 * @ordered
	 */
	protected String carrierCode = CARRIER_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRouteDescription() <em>Route Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUTE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRouteDescription() <em>Route Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteDescription()
	 * @generated
	 * @ordered
	 */
	protected String routeDescription = ROUTE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPricetype() <em>Pricetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricetype()
	 * @generated
	 * @ordered
	 */
	protected static final LegacyCalculationType PRICETYPE_EDEFAULT = LegacyCalculationType.DISTANCE_BASED;

	/**
	 * The cached value of the '{@link #getPricetype() <em>Pricetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricetype()
	 * @generated
	 * @ordered
	 */
	protected LegacyCalculationType pricetype = PRICETYPE_EDEFAULT;

	/**
	 * This is true if the Pricetype attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pricetypeESet;

	/**
	 * The default value of the '{@link #getDistance1() <em>Distance1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance1()
	 * @generated
	 * @ordered
	 */
	protected static final int DISTANCE1_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDistance1() <em>Distance1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance1()
	 * @generated
	 * @ordered
	 */
	protected int distance1 = DISTANCE1_EDEFAULT;

	/**
	 * This is true if the Distance1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean distance1ESet;

	/**
	 * The default value of the '{@link #getDistance2() <em>Distance2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance2()
	 * @generated
	 * @ordered
	 */
	protected static final int DISTANCE2_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDistance2() <em>Distance2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance2()
	 * @generated
	 * @ordered
	 */
	protected int distance2 = DISTANCE2_EDEFAULT;

	/**
	 * The cached value of the '{@link #getViastations() <em>Viastations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViastations()
	 * @generated
	 * @ordered
	 */
	protected EList<LegacyViastation> viastations;

	/**
	 * The default value of the '{@link #getValidFrom() <em>Valid From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFrom()
	 * @generated
	 * @ordered
	 */
	protected static final Date VALID_FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidFrom() <em>Valid From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFrom()
	 * @generated
	 * @ordered
	 */
	protected Date validFrom = VALID_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidUntil() <em>Valid Until</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidUntil()
	 * @generated
	 * @ordered
	 */
	protected static final Date VALID_UNTIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidUntil() <em>Valid Until</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidUntil()
	 * @generated
	 * @ordered
	 */
	protected Date validUntil = VALID_UNTIL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacySeriesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LEGACY_SERIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSupplyingCarrierCode() {
		return supplyingCarrierCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplyingCarrierCode(String newSupplyingCarrierCode) {
		String oldSupplyingCarrierCode = supplyingCarrierCode;
		supplyingCarrierCode = newSupplyingCarrierCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_SERIES__SUPPLYING_CARRIER_CODE, oldSupplyingCarrierCode, supplyingCarrierCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LegacyViastation> getViastations() {
		if (viastations == null) {
			viastations = new EObjectContainmentEList<LegacyViastation>(LegacyViastation.class, this, GtmPackage.LEGACY_SERIES__VIASTATIONS);
		}
		return viastations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDistance1() {
		return distance1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance1(int newDistance1) {
		int oldDistance1 = distance1;
		distance1 = newDistance1;
		boolean oldDistance1ESet = distance1ESet;
		distance1ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_SERIES__DISTANCE1, oldDistance1, distance1, !oldDistance1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDistance1() {
		int oldDistance1 = distance1;
		boolean oldDistance1ESet = distance1ESet;
		distance1 = DISTANCE1_EDEFAULT;
		distance1ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GtmPackage.LEGACY_SERIES__DISTANCE1, oldDistance1, DISTANCE1_EDEFAULT, oldDistance1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDistance1() {
		return distance1ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyCalculationType getPricetype() {
		return pricetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPricetype(LegacyCalculationType newPricetype) {
		LegacyCalculationType oldPricetype = pricetype;
		pricetype = newPricetype == null ? PRICETYPE_EDEFAULT : newPricetype;
		boolean oldPricetypeESet = pricetypeESet;
		pricetypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_SERIES__PRICETYPE, oldPricetype, pricetype, !oldPricetypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPricetype() {
		LegacyCalculationType oldPricetype = pricetype;
		boolean oldPricetypeESet = pricetypeESet;
		pricetype = PRICETYPE_EDEFAULT;
		pricetypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GtmPackage.LEGACY_SERIES__PRICETYPE, oldPricetype, PRICETYPE_EDEFAULT, oldPricetypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPricetype() {
		return pricetypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getValidFrom() {
		return validFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidFrom(Date newValidFrom) {
		Date oldValidFrom = validFrom;
		validFrom = newValidFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_SERIES__VALID_FROM, oldValidFrom, validFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getValidUntil() {
		return validUntil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidUntil(Date newValidUntil) {
		Date oldValidUntil = validUntil;
		validUntil = newValidUntil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_SERIES__VALID_UNTIL, oldValidUntil, validUntil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacySeriesType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(LegacySeriesType newType) {
		LegacySeriesType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_SERIES__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_SERIES__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFareTableNumber() {
		return fareTableNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFareTableNumber(int newFareTableNumber) {
		int oldFareTableNumber = fareTableNumber;
		fareTableNumber = newFareTableNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_SERIES__FARE_TABLE_NUMBER, oldFareTableNumber, fareTableNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFromStation() {
		return fromStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromStation(int newFromStation) {
		int oldFromStation = fromStation;
		fromStation = newFromStation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_SERIES__FROM_STATION, oldFromStation, fromStation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFromStationName() {
		return fromStationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromStationName(String newFromStationName) {
		String oldFromStationName = fromStationName;
		fromStationName = newFromStationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_SERIES__FROM_STATION_NAME, oldFromStationName, fromStationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getToStation() {
		return toStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToStation(int newToStation) {
		int oldToStation = toStation;
		toStation = newToStation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_SERIES__TO_STATION, oldToStation, toStation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToStationName() {
		return toStationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToStationName(String newToStationName) {
		String oldToStationName = toStationName;
		toStationName = newToStationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_SERIES__TO_STATION_NAME, oldToStationName, toStationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRouteNumber() {
		return routeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouteNumber(int newRouteNumber) {
		int oldRouteNumber = routeNumber;
		routeNumber = newRouteNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_SERIES__ROUTE_NUMBER, oldRouteNumber, routeNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCarrierCode() {
		return carrierCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarrierCode(String newCarrierCode) {
		String oldCarrierCode = carrierCode;
		carrierCode = newCarrierCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_SERIES__CARRIER_CODE, oldCarrierCode, carrierCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRouteDescription() {
		return routeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouteDescription(String newRouteDescription) {
		String oldRouteDescription = routeDescription;
		routeDescription = newRouteDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_SERIES__ROUTE_DESCRIPTION, oldRouteDescription, routeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDistance2() {
		return distance2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance2(int newDistance2) {
		int oldDistance2 = distance2;
		distance2 = newDistance2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_SERIES__DISTANCE2, oldDistance2, distance2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.LEGACY_SERIES__VIASTATIONS:
				return ((InternalEList<?>)getViastations()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.LEGACY_SERIES__SUPPLYING_CARRIER_CODE:
				return getSupplyingCarrierCode();
			case GtmPackage.LEGACY_SERIES__NUMBER:
				return getNumber();
			case GtmPackage.LEGACY_SERIES__FARE_TABLE_NUMBER:
				return getFareTableNumber();
			case GtmPackage.LEGACY_SERIES__TYPE:
				return getType();
			case GtmPackage.LEGACY_SERIES__FROM_STATION:
				return getFromStation();
			case GtmPackage.LEGACY_SERIES__FROM_STATION_NAME:
				return getFromStationName();
			case GtmPackage.LEGACY_SERIES__TO_STATION:
				return getToStation();
			case GtmPackage.LEGACY_SERIES__TO_STATION_NAME:
				return getToStationName();
			case GtmPackage.LEGACY_SERIES__ROUTE_NUMBER:
				return getRouteNumber();
			case GtmPackage.LEGACY_SERIES__CARRIER_CODE:
				return getCarrierCode();
			case GtmPackage.LEGACY_SERIES__ROUTE_DESCRIPTION:
				return getRouteDescription();
			case GtmPackage.LEGACY_SERIES__PRICETYPE:
				return getPricetype();
			case GtmPackage.LEGACY_SERIES__DISTANCE1:
				return getDistance1();
			case GtmPackage.LEGACY_SERIES__DISTANCE2:
				return getDistance2();
			case GtmPackage.LEGACY_SERIES__VIASTATIONS:
				return getViastations();
			case GtmPackage.LEGACY_SERIES__VALID_FROM:
				return getValidFrom();
			case GtmPackage.LEGACY_SERIES__VALID_UNTIL:
				return getValidUntil();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GtmPackage.LEGACY_SERIES__SUPPLYING_CARRIER_CODE:
				setSupplyingCarrierCode((String)newValue);
				return;
			case GtmPackage.LEGACY_SERIES__NUMBER:
				setNumber((Integer)newValue);
				return;
			case GtmPackage.LEGACY_SERIES__FARE_TABLE_NUMBER:
				setFareTableNumber((Integer)newValue);
				return;
			case GtmPackage.LEGACY_SERIES__TYPE:
				setType((LegacySeriesType)newValue);
				return;
			case GtmPackage.LEGACY_SERIES__FROM_STATION:
				setFromStation((Integer)newValue);
				return;
			case GtmPackage.LEGACY_SERIES__FROM_STATION_NAME:
				setFromStationName((String)newValue);
				return;
			case GtmPackage.LEGACY_SERIES__TO_STATION:
				setToStation((Integer)newValue);
				return;
			case GtmPackage.LEGACY_SERIES__TO_STATION_NAME:
				setToStationName((String)newValue);
				return;
			case GtmPackage.LEGACY_SERIES__ROUTE_NUMBER:
				setRouteNumber((Integer)newValue);
				return;
			case GtmPackage.LEGACY_SERIES__CARRIER_CODE:
				setCarrierCode((String)newValue);
				return;
			case GtmPackage.LEGACY_SERIES__ROUTE_DESCRIPTION:
				setRouteDescription((String)newValue);
				return;
			case GtmPackage.LEGACY_SERIES__PRICETYPE:
				setPricetype((LegacyCalculationType)newValue);
				return;
			case GtmPackage.LEGACY_SERIES__DISTANCE1:
				setDistance1((Integer)newValue);
				return;
			case GtmPackage.LEGACY_SERIES__DISTANCE2:
				setDistance2((Integer)newValue);
				return;
			case GtmPackage.LEGACY_SERIES__VIASTATIONS:
				getViastations().clear();
				getViastations().addAll((Collection<? extends LegacyViastation>)newValue);
				return;
			case GtmPackage.LEGACY_SERIES__VALID_FROM:
				setValidFrom((Date)newValue);
				return;
			case GtmPackage.LEGACY_SERIES__VALID_UNTIL:
				setValidUntil((Date)newValue);
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
			case GtmPackage.LEGACY_SERIES__SUPPLYING_CARRIER_CODE:
				setSupplyingCarrierCode(SUPPLYING_CARRIER_CODE_EDEFAULT);
				return;
			case GtmPackage.LEGACY_SERIES__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case GtmPackage.LEGACY_SERIES__FARE_TABLE_NUMBER:
				setFareTableNumber(FARE_TABLE_NUMBER_EDEFAULT);
				return;
			case GtmPackage.LEGACY_SERIES__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GtmPackage.LEGACY_SERIES__FROM_STATION:
				setFromStation(FROM_STATION_EDEFAULT);
				return;
			case GtmPackage.LEGACY_SERIES__FROM_STATION_NAME:
				setFromStationName(FROM_STATION_NAME_EDEFAULT);
				return;
			case GtmPackage.LEGACY_SERIES__TO_STATION:
				setToStation(TO_STATION_EDEFAULT);
				return;
			case GtmPackage.LEGACY_SERIES__TO_STATION_NAME:
				setToStationName(TO_STATION_NAME_EDEFAULT);
				return;
			case GtmPackage.LEGACY_SERIES__ROUTE_NUMBER:
				setRouteNumber(ROUTE_NUMBER_EDEFAULT);
				return;
			case GtmPackage.LEGACY_SERIES__CARRIER_CODE:
				setCarrierCode(CARRIER_CODE_EDEFAULT);
				return;
			case GtmPackage.LEGACY_SERIES__ROUTE_DESCRIPTION:
				setRouteDescription(ROUTE_DESCRIPTION_EDEFAULT);
				return;
			case GtmPackage.LEGACY_SERIES__PRICETYPE:
				unsetPricetype();
				return;
			case GtmPackage.LEGACY_SERIES__DISTANCE1:
				unsetDistance1();
				return;
			case GtmPackage.LEGACY_SERIES__DISTANCE2:
				setDistance2(DISTANCE2_EDEFAULT);
				return;
			case GtmPackage.LEGACY_SERIES__VIASTATIONS:
				getViastations().clear();
				return;
			case GtmPackage.LEGACY_SERIES__VALID_FROM:
				setValidFrom(VALID_FROM_EDEFAULT);
				return;
			case GtmPackage.LEGACY_SERIES__VALID_UNTIL:
				setValidUntil(VALID_UNTIL_EDEFAULT);
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
			case GtmPackage.LEGACY_SERIES__SUPPLYING_CARRIER_CODE:
				return SUPPLYING_CARRIER_CODE_EDEFAULT == null ? supplyingCarrierCode != null : !SUPPLYING_CARRIER_CODE_EDEFAULT.equals(supplyingCarrierCode);
			case GtmPackage.LEGACY_SERIES__NUMBER:
				return number != NUMBER_EDEFAULT;
			case GtmPackage.LEGACY_SERIES__FARE_TABLE_NUMBER:
				return fareTableNumber != FARE_TABLE_NUMBER_EDEFAULT;
			case GtmPackage.LEGACY_SERIES__TYPE:
				return type != TYPE_EDEFAULT;
			case GtmPackage.LEGACY_SERIES__FROM_STATION:
				return fromStation != FROM_STATION_EDEFAULT;
			case GtmPackage.LEGACY_SERIES__FROM_STATION_NAME:
				return FROM_STATION_NAME_EDEFAULT == null ? fromStationName != null : !FROM_STATION_NAME_EDEFAULT.equals(fromStationName);
			case GtmPackage.LEGACY_SERIES__TO_STATION:
				return toStation != TO_STATION_EDEFAULT;
			case GtmPackage.LEGACY_SERIES__TO_STATION_NAME:
				return TO_STATION_NAME_EDEFAULT == null ? toStationName != null : !TO_STATION_NAME_EDEFAULT.equals(toStationName);
			case GtmPackage.LEGACY_SERIES__ROUTE_NUMBER:
				return routeNumber != ROUTE_NUMBER_EDEFAULT;
			case GtmPackage.LEGACY_SERIES__CARRIER_CODE:
				return CARRIER_CODE_EDEFAULT == null ? carrierCode != null : !CARRIER_CODE_EDEFAULT.equals(carrierCode);
			case GtmPackage.LEGACY_SERIES__ROUTE_DESCRIPTION:
				return ROUTE_DESCRIPTION_EDEFAULT == null ? routeDescription != null : !ROUTE_DESCRIPTION_EDEFAULT.equals(routeDescription);
			case GtmPackage.LEGACY_SERIES__PRICETYPE:
				return isSetPricetype();
			case GtmPackage.LEGACY_SERIES__DISTANCE1:
				return isSetDistance1();
			case GtmPackage.LEGACY_SERIES__DISTANCE2:
				return distance2 != DISTANCE2_EDEFAULT;
			case GtmPackage.LEGACY_SERIES__VIASTATIONS:
				return viastations != null && !viastations.isEmpty();
			case GtmPackage.LEGACY_SERIES__VALID_FROM:
				return VALID_FROM_EDEFAULT == null ? validFrom != null : !VALID_FROM_EDEFAULT.equals(validFrom);
			case GtmPackage.LEGACY_SERIES__VALID_UNTIL:
				return VALID_UNTIL_EDEFAULT == null ? validUntil != null : !VALID_UNTIL_EDEFAULT.equals(validUntil);
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
		result.append(" (supplyingCarrierCode: ");
		result.append(supplyingCarrierCode);
		result.append(", number: ");
		result.append(number);
		result.append(", fareTableNumber: ");
		result.append(fareTableNumber);
		result.append(", type: ");
		result.append(type);
		result.append(", fromStation: ");
		result.append(fromStation);
		result.append(", fromStationName: ");
		result.append(fromStationName);
		result.append(", toStation: ");
		result.append(toStation);
		result.append(", toStationName: ");
		result.append(toStationName);
		result.append(", routeNumber: ");
		result.append(routeNumber);
		result.append(", carrierCode: ");
		result.append(carrierCode);
		result.append(", routeDescription: ");
		result.append(routeDescription);
		result.append(", pricetype: ");
		if (pricetypeESet) result.append(pricetype); else result.append("<unset>");
		result.append(", distance1: ");
		if (distance1ESet) result.append(distance1); else result.append("<unset>");
		result.append(", distance2: ");
		result.append(distance2);
		result.append(", validFrom: ");
		result.append(validFrom);
		result.append(", validUntil: ");
		result.append(validUntil);
		result.append(')');
		return result.toString();
	}

} //LegacySeriesImpl
