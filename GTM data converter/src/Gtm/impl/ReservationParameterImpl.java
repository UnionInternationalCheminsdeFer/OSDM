/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.ReservationOptions;
import Gtm.ReservationParameter;

import Gtm.ReservationParams9181;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reservation Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.ReservationParameterImpl#isOptionalReservation <em>Optional Reservation</em>}</li>
 *   <li>{@link Gtm.impl.ReservationParameterImpl#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.impl.ReservationParameterImpl#getParams9181 <em>Params9181</em>}</li>
 *   <li>{@link Gtm.impl.ReservationParameterImpl#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReservationParameterImpl extends MinimalEObjectImpl.Container implements ReservationParameter {
	/**
	 * The default value of the '{@link #isOptionalReservation() <em>Optional Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptionalReservation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_RESERVATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptionalReservation() <em>Optional Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptionalReservation()
	 * @generated
	 * @ordered
	 */
	protected boolean optionalReservation = OPTIONAL_RESERVATION_EDEFAULT;

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
	 * The cached value of the '{@link #getParams9181() <em>Params9181</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams9181()
	 * @generated
	 * @ordered
	 */
	protected ReservationParams9181 params9181;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected ReservationOptions options;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReservationParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.RESERVATION_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptionalReservation() {
		return optionalReservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionalReservation(boolean newOptionalReservation) {
		boolean oldOptionalReservation = optionalReservation;
		optionalReservation = newOptionalReservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.RESERVATION_PARAMETER__OPTIONAL_RESERVATION, oldOptionalReservation, optionalReservation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.RESERVATION_PARAMETER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationParams9181 getParams9181() {
		return params9181;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParams9181(ReservationParams9181 newParams9181, NotificationChain msgs) {
		ReservationParams9181 oldParams9181 = params9181;
		params9181 = newParams9181;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.RESERVATION_PARAMETER__PARAMS9181, oldParams9181, newParams9181);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParams9181(ReservationParams9181 newParams9181) {
		if (newParams9181 != params9181) {
			NotificationChain msgs = null;
			if (params9181 != null)
				msgs = ((InternalEObject)params9181).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.RESERVATION_PARAMETER__PARAMS9181, null, msgs);
			if (newParams9181 != null)
				msgs = ((InternalEObject)newParams9181).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.RESERVATION_PARAMETER__PARAMS9181, null, msgs);
			msgs = basicSetParams9181(newParams9181, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.RESERVATION_PARAMETER__PARAMS9181, newParams9181, newParams9181));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationOptions getOptions() {
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptions(ReservationOptions newOptions, NotificationChain msgs) {
		ReservationOptions oldOptions = options;
		options = newOptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.RESERVATION_PARAMETER__OPTIONS, oldOptions, newOptions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptions(ReservationOptions newOptions) {
		if (newOptions != options) {
			NotificationChain msgs = null;
			if (options != null)
				msgs = ((InternalEObject)options).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.RESERVATION_PARAMETER__OPTIONS, null, msgs);
			if (newOptions != null)
				msgs = ((InternalEObject)newOptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.RESERVATION_PARAMETER__OPTIONS, null, msgs);
			msgs = basicSetOptions(newOptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.RESERVATION_PARAMETER__OPTIONS, newOptions, newOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.RESERVATION_PARAMETER__PARAMS9181:
				return basicSetParams9181(null, msgs);
			case GtmPackage.RESERVATION_PARAMETER__OPTIONS:
				return basicSetOptions(null, msgs);
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
			case GtmPackage.RESERVATION_PARAMETER__OPTIONAL_RESERVATION:
				return isOptionalReservation();
			case GtmPackage.RESERVATION_PARAMETER__ID:
				return getId();
			case GtmPackage.RESERVATION_PARAMETER__PARAMS9181:
				return getParams9181();
			case GtmPackage.RESERVATION_PARAMETER__OPTIONS:
				return getOptions();
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
			case GtmPackage.RESERVATION_PARAMETER__OPTIONAL_RESERVATION:
				setOptionalReservation((Boolean)newValue);
				return;
			case GtmPackage.RESERVATION_PARAMETER__ID:
				setId((String)newValue);
				return;
			case GtmPackage.RESERVATION_PARAMETER__PARAMS9181:
				setParams9181((ReservationParams9181)newValue);
				return;
			case GtmPackage.RESERVATION_PARAMETER__OPTIONS:
				setOptions((ReservationOptions)newValue);
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
			case GtmPackage.RESERVATION_PARAMETER__OPTIONAL_RESERVATION:
				setOptionalReservation(OPTIONAL_RESERVATION_EDEFAULT);
				return;
			case GtmPackage.RESERVATION_PARAMETER__ID:
				setId(ID_EDEFAULT);
				return;
			case GtmPackage.RESERVATION_PARAMETER__PARAMS9181:
				setParams9181((ReservationParams9181)null);
				return;
			case GtmPackage.RESERVATION_PARAMETER__OPTIONS:
				setOptions((ReservationOptions)null);
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
			case GtmPackage.RESERVATION_PARAMETER__OPTIONAL_RESERVATION:
				return optionalReservation != OPTIONAL_RESERVATION_EDEFAULT;
			case GtmPackage.RESERVATION_PARAMETER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GtmPackage.RESERVATION_PARAMETER__PARAMS9181:
				return params9181 != null;
			case GtmPackage.RESERVATION_PARAMETER__OPTIONS:
				return options != null;
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
		result.append(" (optionalReservation: ");
		result.append(optionalReservation);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ReservationParameterImpl
