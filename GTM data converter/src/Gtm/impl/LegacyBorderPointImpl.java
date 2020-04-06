/**
 */
package Gtm.impl;

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
		result.append(')');
		return result.toString();
	}

} //LegacyBorderPointImpl
