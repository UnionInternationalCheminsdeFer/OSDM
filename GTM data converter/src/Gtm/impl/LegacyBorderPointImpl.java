/**
 */
package Gtm.impl;

import Gtm.Carrier;
import Gtm.GtmPackage;
import Gtm.LegacyBorderPoint;
import Gtm.LegacyBorderSide;
import Gtm.LegacyFakeBorderStations;
import Gtm.OnBorderStations;
import java.util.Collection;

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
 * An implementation of the model object '<em><b>Legacy Border Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.LegacyBorderPointImpl#getBorderPointCode <em>Border Point Code</em>}</li>
 *   <li>{@link Gtm.impl.LegacyBorderPointImpl#getFakeBorderStations <em>Fake Border Stations</em>}</li>
 *   <li>{@link Gtm.impl.LegacyBorderPointImpl#getOnBorderStations <em>On Border Stations</em>}</li>
 *   <li>{@link Gtm.impl.LegacyBorderPointImpl#getBorderSides <em>Border Sides</em>}</li>
 *   <li>{@link Gtm.impl.LegacyBorderPointImpl#getCarrier1 <em>Carrier1</em>}</li>
 *   <li>{@link Gtm.impl.LegacyBorderPointImpl#getLegacyStationCode1 <em>Legacy Station Code1</em>}</li>
 *   <li>{@link Gtm.impl.LegacyBorderPointImpl#getCarrier2 <em>Carrier2</em>}</li>
 *   <li>{@link Gtm.impl.LegacyBorderPointImpl#getLegacyStationCode2 <em>Legacy Station Code2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegacyBorderPointImpl extends MinimalEObjectImpl.Container implements LegacyBorderPoint {
	/**
	 * The default value of the '{@link #getBorderPointCode() <em>Border Point Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderPointCode()
	 * @generated
	 * @ordered
	 */
	protected static final int BORDER_POINT_CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBorderPointCode() <em>Border Point Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderPointCode()
	 * @generated
	 * @ordered
	 */
	protected int borderPointCode = BORDER_POINT_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFakeBorderStations() <em>Fake Border Stations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFakeBorderStations()
	 * @generated
	 * @ordered
	 */
	protected LegacyFakeBorderStations fakeBorderStations;

	/**
	 * The cached value of the '{@link #getOnBorderStations() <em>On Border Stations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnBorderStations()
	 * @generated
	 * @ordered
	 */
	protected OnBorderStations onBorderStations;

	/**
	 * The cached value of the '{@link #getBorderSides() <em>Border Sides</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderSides()
	 * @generated
	 * @ordered
	 */
	protected EList<LegacyBorderSide> borderSides;

	/**
	 * The cached value of the '{@link #getCarrier1() <em>Carrier1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrier1()
	 * @generated
	 * @ordered
	 */
	protected Carrier carrier1;

	/**
	 * The default value of the '{@link #getLegacyStationCode1() <em>Legacy Station Code1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyStationCode1()
	 * @generated
	 * @ordered
	 */
	protected static final int LEGACY_STATION_CODE1_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLegacyStationCode1() <em>Legacy Station Code1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyStationCode1()
	 * @generated
	 * @ordered
	 */
	protected int legacyStationCode1 = LEGACY_STATION_CODE1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCarrier2() <em>Carrier2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrier2()
	 * @generated
	 * @ordered
	 */
	protected Carrier carrier2;

	/**
	 * The default value of the '{@link #getLegacyStationCode2() <em>Legacy Station Code2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyStationCode2()
	 * @generated
	 * @ordered
	 */
	protected static final int LEGACY_STATION_CODE2_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLegacyStationCode2() <em>Legacy Station Code2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyStationCode2()
	 * @generated
	 * @ordered
	 */
	protected int legacyStationCode2 = LEGACY_STATION_CODE2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyBorderPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LEGACY_BORDER_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBorderPointCode() {
		return borderPointCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderPointCode(int newBorderPointCode) {
		int oldBorderPointCode = borderPointCode;
		borderPointCode = newBorderPointCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_BORDER_POINT__BORDER_POINT_CODE, oldBorderPointCode, borderPointCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyFakeBorderStations getFakeBorderStations() {
		return fakeBorderStations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFakeBorderStations(LegacyFakeBorderStations newFakeBorderStations, NotificationChain msgs) {
		LegacyFakeBorderStations oldFakeBorderStations = fakeBorderStations;
		fakeBorderStations = newFakeBorderStations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_BORDER_POINT__FAKE_BORDER_STATIONS, oldFakeBorderStations, newFakeBorderStations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFakeBorderStations(LegacyFakeBorderStations newFakeBorderStations) {
		if (newFakeBorderStations != fakeBorderStations) {
			NotificationChain msgs = null;
			if (fakeBorderStations != null)
				msgs = ((InternalEObject)fakeBorderStations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.LEGACY_BORDER_POINT__FAKE_BORDER_STATIONS, null, msgs);
			if (newFakeBorderStations != null)
				msgs = ((InternalEObject)newFakeBorderStations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.LEGACY_BORDER_POINT__FAKE_BORDER_STATIONS, null, msgs);
			msgs = basicSetFakeBorderStations(newFakeBorderStations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_BORDER_POINT__FAKE_BORDER_STATIONS, newFakeBorderStations, newFakeBorderStations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnBorderStations getOnBorderStations() {
		return onBorderStations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnBorderStations(OnBorderStations newOnBorderStations, NotificationChain msgs) {
		OnBorderStations oldOnBorderStations = onBorderStations;
		onBorderStations = newOnBorderStations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_BORDER_POINT__ON_BORDER_STATIONS, oldOnBorderStations, newOnBorderStations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnBorderStations(OnBorderStations newOnBorderStations) {
		if (newOnBorderStations != onBorderStations) {
			NotificationChain msgs = null;
			if (onBorderStations != null)
				msgs = ((InternalEObject)onBorderStations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.LEGACY_BORDER_POINT__ON_BORDER_STATIONS, null, msgs);
			if (newOnBorderStations != null)
				msgs = ((InternalEObject)newOnBorderStations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.LEGACY_BORDER_POINT__ON_BORDER_STATIONS, null, msgs);
			msgs = basicSetOnBorderStations(newOnBorderStations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_BORDER_POINT__ON_BORDER_STATIONS, newOnBorderStations, newOnBorderStations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LegacyBorderSide> getBorderSides() {
		if (borderSides == null) {
			borderSides = new EObjectContainmentEList<LegacyBorderSide>(LegacyBorderSide.class, this, GtmPackage.LEGACY_BORDER_POINT__BORDER_SIDES);
		}
		return borderSides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carrier getCarrier1() {
		if (carrier1 != null && carrier1.eIsProxy()) {
			InternalEObject oldCarrier1 = (InternalEObject)carrier1;
			carrier1 = (Carrier)eResolveProxy(oldCarrier1);
			if (carrier1 != oldCarrier1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.LEGACY_BORDER_POINT__CARRIER1, oldCarrier1, carrier1));
			}
		}
		return carrier1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carrier basicGetCarrier1() {
		return carrier1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarrier1(Carrier newCarrier1) {
		Carrier oldCarrier1 = carrier1;
		carrier1 = newCarrier1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_BORDER_POINT__CARRIER1, oldCarrier1, carrier1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLegacyStationCode1() {
		return legacyStationCode1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegacyStationCode1(int newLegacyStationCode1) {
		int oldLegacyStationCode1 = legacyStationCode1;
		legacyStationCode1 = newLegacyStationCode1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_BORDER_POINT__LEGACY_STATION_CODE1, oldLegacyStationCode1, legacyStationCode1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carrier getCarrier2() {
		if (carrier2 != null && carrier2.eIsProxy()) {
			InternalEObject oldCarrier2 = (InternalEObject)carrier2;
			carrier2 = (Carrier)eResolveProxy(oldCarrier2);
			if (carrier2 != oldCarrier2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.LEGACY_BORDER_POINT__CARRIER2, oldCarrier2, carrier2));
			}
		}
		return carrier2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carrier basicGetCarrier2() {
		return carrier2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarrier2(Carrier newCarrier2) {
		Carrier oldCarrier2 = carrier2;
		carrier2 = newCarrier2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_BORDER_POINT__CARRIER2, oldCarrier2, carrier2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLegacyStationCode2() {
		return legacyStationCode2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegacyStationCode2(int newLegacyStationCode2) {
		int oldLegacyStationCode2 = legacyStationCode2;
		legacyStationCode2 = newLegacyStationCode2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_BORDER_POINT__LEGACY_STATION_CODE2, oldLegacyStationCode2, legacyStationCode2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.LEGACY_BORDER_POINT__FAKE_BORDER_STATIONS:
				return basicSetFakeBorderStations(null, msgs);
			case GtmPackage.LEGACY_BORDER_POINT__ON_BORDER_STATIONS:
				return basicSetOnBorderStations(null, msgs);
			case GtmPackage.LEGACY_BORDER_POINT__BORDER_SIDES:
				return ((InternalEList<?>)getBorderSides()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.LEGACY_BORDER_POINT__BORDER_POINT_CODE:
				return getBorderPointCode();
			case GtmPackage.LEGACY_BORDER_POINT__FAKE_BORDER_STATIONS:
				return getFakeBorderStations();
			case GtmPackage.LEGACY_BORDER_POINT__ON_BORDER_STATIONS:
				return getOnBorderStations();
			case GtmPackage.LEGACY_BORDER_POINT__BORDER_SIDES:
				return getBorderSides();
			case GtmPackage.LEGACY_BORDER_POINT__CARRIER1:
				if (resolve) return getCarrier1();
				return basicGetCarrier1();
			case GtmPackage.LEGACY_BORDER_POINT__LEGACY_STATION_CODE1:
				return getLegacyStationCode1();
			case GtmPackage.LEGACY_BORDER_POINT__CARRIER2:
				if (resolve) return getCarrier2();
				return basicGetCarrier2();
			case GtmPackage.LEGACY_BORDER_POINT__LEGACY_STATION_CODE2:
				return getLegacyStationCode2();
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
			case GtmPackage.LEGACY_BORDER_POINT__BORDER_POINT_CODE:
				setBorderPointCode((Integer)newValue);
				return;
			case GtmPackage.LEGACY_BORDER_POINT__FAKE_BORDER_STATIONS:
				setFakeBorderStations((LegacyFakeBorderStations)newValue);
				return;
			case GtmPackage.LEGACY_BORDER_POINT__ON_BORDER_STATIONS:
				setOnBorderStations((OnBorderStations)newValue);
				return;
			case GtmPackage.LEGACY_BORDER_POINT__BORDER_SIDES:
				getBorderSides().clear();
				getBorderSides().addAll((Collection<? extends LegacyBorderSide>)newValue);
				return;
			case GtmPackage.LEGACY_BORDER_POINT__CARRIER1:
				setCarrier1((Carrier)newValue);
				return;
			case GtmPackage.LEGACY_BORDER_POINT__LEGACY_STATION_CODE1:
				setLegacyStationCode1((Integer)newValue);
				return;
			case GtmPackage.LEGACY_BORDER_POINT__CARRIER2:
				setCarrier2((Carrier)newValue);
				return;
			case GtmPackage.LEGACY_BORDER_POINT__LEGACY_STATION_CODE2:
				setLegacyStationCode2((Integer)newValue);
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
			case GtmPackage.LEGACY_BORDER_POINT__BORDER_POINT_CODE:
				setBorderPointCode(BORDER_POINT_CODE_EDEFAULT);
				return;
			case GtmPackage.LEGACY_BORDER_POINT__FAKE_BORDER_STATIONS:
				setFakeBorderStations((LegacyFakeBorderStations)null);
				return;
			case GtmPackage.LEGACY_BORDER_POINT__ON_BORDER_STATIONS:
				setOnBorderStations((OnBorderStations)null);
				return;
			case GtmPackage.LEGACY_BORDER_POINT__BORDER_SIDES:
				getBorderSides().clear();
				return;
			case GtmPackage.LEGACY_BORDER_POINT__CARRIER1:
				setCarrier1((Carrier)null);
				return;
			case GtmPackage.LEGACY_BORDER_POINT__LEGACY_STATION_CODE1:
				setLegacyStationCode1(LEGACY_STATION_CODE1_EDEFAULT);
				return;
			case GtmPackage.LEGACY_BORDER_POINT__CARRIER2:
				setCarrier2((Carrier)null);
				return;
			case GtmPackage.LEGACY_BORDER_POINT__LEGACY_STATION_CODE2:
				setLegacyStationCode2(LEGACY_STATION_CODE2_EDEFAULT);
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
			case GtmPackage.LEGACY_BORDER_POINT__BORDER_POINT_CODE:
				return borderPointCode != BORDER_POINT_CODE_EDEFAULT;
			case GtmPackage.LEGACY_BORDER_POINT__FAKE_BORDER_STATIONS:
				return fakeBorderStations != null;
			case GtmPackage.LEGACY_BORDER_POINT__ON_BORDER_STATIONS:
				return onBorderStations != null;
			case GtmPackage.LEGACY_BORDER_POINT__BORDER_SIDES:
				return borderSides != null && !borderSides.isEmpty();
			case GtmPackage.LEGACY_BORDER_POINT__CARRIER1:
				return carrier1 != null;
			case GtmPackage.LEGACY_BORDER_POINT__LEGACY_STATION_CODE1:
				return legacyStationCode1 != LEGACY_STATION_CODE1_EDEFAULT;
			case GtmPackage.LEGACY_BORDER_POINT__CARRIER2:
				return carrier2 != null;
			case GtmPackage.LEGACY_BORDER_POINT__LEGACY_STATION_CODE2:
				return legacyStationCode2 != LEGACY_STATION_CODE2_EDEFAULT;
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
		result.append(" (borderPointCode: ");
		result.append(borderPointCode);
		result.append(", legacyStationCode1: ");
		result.append(legacyStationCode1);
		result.append(", legacyStationCode2: ");
		result.append(legacyStationCode2);
		result.append(')');
		return result.toString();
	}

} //LegacyBorderPointImpl
