/**
 */
package Gtm.impl;

import Gtm.Carrier;
import Gtm.CharacterSet;
import Gtm.GtmPackage;
import Gtm.Legacy108;
import Gtm.Legacy108Stations;
import Gtm.LegacyDistanceFares;
import Gtm.LegacyRouteFares;
import Gtm.LegacySeparateContractSeriesList;
import Gtm.LegacySeriesList;
import Gtm.TimeZone;
import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legacy108</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.Legacy108Impl#getCharacterSet <em>Character Set</em>}</li>
 *   <li>{@link Gtm.impl.Legacy108Impl#getLegacySeriesList <em>Legacy Series List</em>}</li>
 *   <li>{@link Gtm.impl.Legacy108Impl#getLegacySeparateContractSeries <em>Legacy Separate Contract Series</em>}</li>
 *   <li>{@link Gtm.impl.Legacy108Impl#getLegacyDistanceFares <em>Legacy Distance Fares</em>}</li>
 *   <li>{@link Gtm.impl.Legacy108Impl#getLegacyRouteFares <em>Legacy Route Fares</em>}</li>
 *   <li>{@link Gtm.impl.Legacy108Impl#getLegacyStations <em>Legacy Stations</em>}</li>
 *   <li>{@link Gtm.impl.Legacy108Impl#getTimeZone <em>Time Zone</em>}</li>
 *   <li>{@link Gtm.impl.Legacy108Impl#getCarrier <em>Carrier</em>}</li>
 *   <li>{@link Gtm.impl.Legacy108Impl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link Gtm.impl.Legacy108Impl#getEndDate <em>End Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Legacy108Impl extends MinimalEObjectImpl.Container implements Legacy108 {
	/**
	 * The default value of the '{@link #getCharacterSet() <em>Character Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterSet()
	 * @generated
	 * @ordered
	 */
	protected static final CharacterSet CHARACTER_SET_EDEFAULT = CharacterSet.LATIN1_ISO88591;

	/**
	 * The cached value of the '{@link #getCharacterSet() <em>Character Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterSet()
	 * @generated
	 * @ordered
	 */
	protected CharacterSet characterSet = CHARACTER_SET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLegacySeriesList() <em>Legacy Series List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacySeriesList()
	 * @generated
	 * @ordered
	 */
	protected LegacySeriesList legacySeriesList;

	/**
	 * The cached value of the '{@link #getLegacySeparateContractSeries() <em>Legacy Separate Contract Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacySeparateContractSeries()
	 * @generated
	 * @ordered
	 */
	protected LegacySeparateContractSeriesList legacySeparateContractSeries;

	/**
	 * The cached value of the '{@link #getLegacyDistanceFares() <em>Legacy Distance Fares</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyDistanceFares()
	 * @generated
	 * @ordered
	 */
	protected LegacyDistanceFares legacyDistanceFares;

	/**
	 * The cached value of the '{@link #getLegacyRouteFares() <em>Legacy Route Fares</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyRouteFares()
	 * @generated
	 * @ordered
	 */
	protected LegacyRouteFares legacyRouteFares;

	/**
	 * The cached value of the '{@link #getLegacyStations() <em>Legacy Stations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyStations()
	 * @generated
	 * @ordered
	 */
	protected Legacy108Stations legacyStations;

	/**
	 * The default value of the '{@link #getTimeZone() <em>Time Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeZone()
	 * @generated
	 * @ordered
	 */
	protected static final TimeZone TIME_ZONE_EDEFAULT = TimeZone.CET;

	/**
	 * The cached value of the '{@link #getTimeZone() <em>Time Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeZone()
	 * @generated
	 * @ordered
	 */
	protected TimeZone timeZone = TIME_ZONE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCarrier() <em>Carrier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrier()
	 * @generated
	 * @ordered
	 */
	protected Carrier carrier;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Legacy108Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LEGACY108;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterSet getCharacterSet() {
		return characterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacterSet(CharacterSet newCharacterSet) {
		CharacterSet oldCharacterSet = characterSet;
		characterSet = newCharacterSet == null ? CHARACTER_SET_EDEFAULT : newCharacterSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY108__CHARACTER_SET, oldCharacterSet, characterSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carrier getCarrier() {
		if (carrier != null && carrier.eIsProxy()) {
			InternalEObject oldCarrier = (InternalEObject)carrier;
			carrier = (Carrier)eResolveProxy(oldCarrier);
			if (carrier != oldCarrier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.LEGACY108__CARRIER, oldCarrier, carrier));
			}
		}
		return carrier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carrier basicGetCarrier() {
		return carrier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarrier(Carrier newCarrier) {
		Carrier oldCarrier = carrier;
		carrier = newCarrier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY108__CARRIER, oldCarrier, carrier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY108__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(Date newEndDate) {
		Date oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY108__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacySeriesList getLegacySeriesList() {
		return legacySeriesList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegacySeriesList(LegacySeriesList newLegacySeriesList, NotificationChain msgs) {
		LegacySeriesList oldLegacySeriesList = legacySeriesList;
		legacySeriesList = newLegacySeriesList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY108__LEGACY_SERIES_LIST, oldLegacySeriesList, newLegacySeriesList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegacySeriesList(LegacySeriesList newLegacySeriesList) {
		if (newLegacySeriesList != legacySeriesList) {
			NotificationChain msgs = null;
			if (legacySeriesList != null)
				msgs = ((InternalEObject)legacySeriesList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.LEGACY108__LEGACY_SERIES_LIST, null, msgs);
			if (newLegacySeriesList != null)
				msgs = ((InternalEObject)newLegacySeriesList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.LEGACY108__LEGACY_SERIES_LIST, null, msgs);
			msgs = basicSetLegacySeriesList(newLegacySeriesList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY108__LEGACY_SERIES_LIST, newLegacySeriesList, newLegacySeriesList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacySeparateContractSeriesList getLegacySeparateContractSeries() {
		return legacySeparateContractSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegacySeparateContractSeries(LegacySeparateContractSeriesList newLegacySeparateContractSeries, NotificationChain msgs) {
		LegacySeparateContractSeriesList oldLegacySeparateContractSeries = legacySeparateContractSeries;
		legacySeparateContractSeries = newLegacySeparateContractSeries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY108__LEGACY_SEPARATE_CONTRACT_SERIES, oldLegacySeparateContractSeries, newLegacySeparateContractSeries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegacySeparateContractSeries(LegacySeparateContractSeriesList newLegacySeparateContractSeries) {
		if (newLegacySeparateContractSeries != legacySeparateContractSeries) {
			NotificationChain msgs = null;
			if (legacySeparateContractSeries != null)
				msgs = ((InternalEObject)legacySeparateContractSeries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.LEGACY108__LEGACY_SEPARATE_CONTRACT_SERIES, null, msgs);
			if (newLegacySeparateContractSeries != null)
				msgs = ((InternalEObject)newLegacySeparateContractSeries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.LEGACY108__LEGACY_SEPARATE_CONTRACT_SERIES, null, msgs);
			msgs = basicSetLegacySeparateContractSeries(newLegacySeparateContractSeries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY108__LEGACY_SEPARATE_CONTRACT_SERIES, newLegacySeparateContractSeries, newLegacySeparateContractSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyDistanceFares getLegacyDistanceFares() {
		return legacyDistanceFares;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegacyDistanceFares(LegacyDistanceFares newLegacyDistanceFares, NotificationChain msgs) {
		LegacyDistanceFares oldLegacyDistanceFares = legacyDistanceFares;
		legacyDistanceFares = newLegacyDistanceFares;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY108__LEGACY_DISTANCE_FARES, oldLegacyDistanceFares, newLegacyDistanceFares);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegacyDistanceFares(LegacyDistanceFares newLegacyDistanceFares) {
		if (newLegacyDistanceFares != legacyDistanceFares) {
			NotificationChain msgs = null;
			if (legacyDistanceFares != null)
				msgs = ((InternalEObject)legacyDistanceFares).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.LEGACY108__LEGACY_DISTANCE_FARES, null, msgs);
			if (newLegacyDistanceFares != null)
				msgs = ((InternalEObject)newLegacyDistanceFares).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.LEGACY108__LEGACY_DISTANCE_FARES, null, msgs);
			msgs = basicSetLegacyDistanceFares(newLegacyDistanceFares, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY108__LEGACY_DISTANCE_FARES, newLegacyDistanceFares, newLegacyDistanceFares));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyRouteFares getLegacyRouteFares() {
		return legacyRouteFares;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegacyRouteFares(LegacyRouteFares newLegacyRouteFares, NotificationChain msgs) {
		LegacyRouteFares oldLegacyRouteFares = legacyRouteFares;
		legacyRouteFares = newLegacyRouteFares;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY108__LEGACY_ROUTE_FARES, oldLegacyRouteFares, newLegacyRouteFares);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegacyRouteFares(LegacyRouteFares newLegacyRouteFares) {
		if (newLegacyRouteFares != legacyRouteFares) {
			NotificationChain msgs = null;
			if (legacyRouteFares != null)
				msgs = ((InternalEObject)legacyRouteFares).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.LEGACY108__LEGACY_ROUTE_FARES, null, msgs);
			if (newLegacyRouteFares != null)
				msgs = ((InternalEObject)newLegacyRouteFares).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.LEGACY108__LEGACY_ROUTE_FARES, null, msgs);
			msgs = basicSetLegacyRouteFares(newLegacyRouteFares, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY108__LEGACY_ROUTE_FARES, newLegacyRouteFares, newLegacyRouteFares));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Legacy108Stations getLegacyStations() {
		return legacyStations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegacyStations(Legacy108Stations newLegacyStations, NotificationChain msgs) {
		Legacy108Stations oldLegacyStations = legacyStations;
		legacyStations = newLegacyStations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY108__LEGACY_STATIONS, oldLegacyStations, newLegacyStations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegacyStations(Legacy108Stations newLegacyStations) {
		if (newLegacyStations != legacyStations) {
			NotificationChain msgs = null;
			if (legacyStations != null)
				msgs = ((InternalEObject)legacyStations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.LEGACY108__LEGACY_STATIONS, null, msgs);
			if (newLegacyStations != null)
				msgs = ((InternalEObject)newLegacyStations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.LEGACY108__LEGACY_STATIONS, null, msgs);
			msgs = basicSetLegacyStations(newLegacyStations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY108__LEGACY_STATIONS, newLegacyStations, newLegacyStations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeZone getTimeZone() {
		return timeZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeZone(TimeZone newTimeZone) {
		TimeZone oldTimeZone = timeZone;
		timeZone = newTimeZone == null ? TIME_ZONE_EDEFAULT : newTimeZone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY108__TIME_ZONE, oldTimeZone, timeZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.LEGACY108__LEGACY_SERIES_LIST:
				return basicSetLegacySeriesList(null, msgs);
			case GtmPackage.LEGACY108__LEGACY_SEPARATE_CONTRACT_SERIES:
				return basicSetLegacySeparateContractSeries(null, msgs);
			case GtmPackage.LEGACY108__LEGACY_DISTANCE_FARES:
				return basicSetLegacyDistanceFares(null, msgs);
			case GtmPackage.LEGACY108__LEGACY_ROUTE_FARES:
				return basicSetLegacyRouteFares(null, msgs);
			case GtmPackage.LEGACY108__LEGACY_STATIONS:
				return basicSetLegacyStations(null, msgs);
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
			case GtmPackage.LEGACY108__CHARACTER_SET:
				return getCharacterSet();
			case GtmPackage.LEGACY108__LEGACY_SERIES_LIST:
				return getLegacySeriesList();
			case GtmPackage.LEGACY108__LEGACY_SEPARATE_CONTRACT_SERIES:
				return getLegacySeparateContractSeries();
			case GtmPackage.LEGACY108__LEGACY_DISTANCE_FARES:
				return getLegacyDistanceFares();
			case GtmPackage.LEGACY108__LEGACY_ROUTE_FARES:
				return getLegacyRouteFares();
			case GtmPackage.LEGACY108__LEGACY_STATIONS:
				return getLegacyStations();
			case GtmPackage.LEGACY108__TIME_ZONE:
				return getTimeZone();
			case GtmPackage.LEGACY108__CARRIER:
				if (resolve) return getCarrier();
				return basicGetCarrier();
			case GtmPackage.LEGACY108__START_DATE:
				return getStartDate();
			case GtmPackage.LEGACY108__END_DATE:
				return getEndDate();
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
			case GtmPackage.LEGACY108__CHARACTER_SET:
				setCharacterSet((CharacterSet)newValue);
				return;
			case GtmPackage.LEGACY108__LEGACY_SERIES_LIST:
				setLegacySeriesList((LegacySeriesList)newValue);
				return;
			case GtmPackage.LEGACY108__LEGACY_SEPARATE_CONTRACT_SERIES:
				setLegacySeparateContractSeries((LegacySeparateContractSeriesList)newValue);
				return;
			case GtmPackage.LEGACY108__LEGACY_DISTANCE_FARES:
				setLegacyDistanceFares((LegacyDistanceFares)newValue);
				return;
			case GtmPackage.LEGACY108__LEGACY_ROUTE_FARES:
				setLegacyRouteFares((LegacyRouteFares)newValue);
				return;
			case GtmPackage.LEGACY108__LEGACY_STATIONS:
				setLegacyStations((Legacy108Stations)newValue);
				return;
			case GtmPackage.LEGACY108__TIME_ZONE:
				setTimeZone((TimeZone)newValue);
				return;
			case GtmPackage.LEGACY108__CARRIER:
				setCarrier((Carrier)newValue);
				return;
			case GtmPackage.LEGACY108__START_DATE:
				setStartDate((Date)newValue);
				return;
			case GtmPackage.LEGACY108__END_DATE:
				setEndDate((Date)newValue);
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
			case GtmPackage.LEGACY108__CHARACTER_SET:
				setCharacterSet(CHARACTER_SET_EDEFAULT);
				return;
			case GtmPackage.LEGACY108__LEGACY_SERIES_LIST:
				setLegacySeriesList((LegacySeriesList)null);
				return;
			case GtmPackage.LEGACY108__LEGACY_SEPARATE_CONTRACT_SERIES:
				setLegacySeparateContractSeries((LegacySeparateContractSeriesList)null);
				return;
			case GtmPackage.LEGACY108__LEGACY_DISTANCE_FARES:
				setLegacyDistanceFares((LegacyDistanceFares)null);
				return;
			case GtmPackage.LEGACY108__LEGACY_ROUTE_FARES:
				setLegacyRouteFares((LegacyRouteFares)null);
				return;
			case GtmPackage.LEGACY108__LEGACY_STATIONS:
				setLegacyStations((Legacy108Stations)null);
				return;
			case GtmPackage.LEGACY108__TIME_ZONE:
				setTimeZone(TIME_ZONE_EDEFAULT);
				return;
			case GtmPackage.LEGACY108__CARRIER:
				setCarrier((Carrier)null);
				return;
			case GtmPackage.LEGACY108__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case GtmPackage.LEGACY108__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
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
			case GtmPackage.LEGACY108__CHARACTER_SET:
				return characterSet != CHARACTER_SET_EDEFAULT;
			case GtmPackage.LEGACY108__LEGACY_SERIES_LIST:
				return legacySeriesList != null;
			case GtmPackage.LEGACY108__LEGACY_SEPARATE_CONTRACT_SERIES:
				return legacySeparateContractSeries != null;
			case GtmPackage.LEGACY108__LEGACY_DISTANCE_FARES:
				return legacyDistanceFares != null;
			case GtmPackage.LEGACY108__LEGACY_ROUTE_FARES:
				return legacyRouteFares != null;
			case GtmPackage.LEGACY108__LEGACY_STATIONS:
				return legacyStations != null;
			case GtmPackage.LEGACY108__TIME_ZONE:
				return timeZone != TIME_ZONE_EDEFAULT;
			case GtmPackage.LEGACY108__CARRIER:
				return carrier != null;
			case GtmPackage.LEGACY108__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case GtmPackage.LEGACY108__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
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
		result.append(" (characterSet: ");
		result.append(characterSet);
		result.append(", timeZone: ");
		result.append(timeZone);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(')');
		return result.toString();
	}

} //Legacy108Impl
