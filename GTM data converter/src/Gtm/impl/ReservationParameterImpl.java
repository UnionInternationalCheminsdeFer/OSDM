/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.ReservationOptions;
import Gtm.ReservationParameter;

import Gtm.ReservationParams9181;
import Gtm.ServiceBrand;
import Gtm.ServiceMode;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reservation Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.ReservationParameterImpl#isMandatoryReservation <em>Mandatory Reservation</em>}</li>
 *   <li>{@link Gtm.impl.ReservationParameterImpl#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.impl.ReservationParameterImpl#getParams9181 <em>Params9181</em>}</li>
 *   <li>{@link Gtm.impl.ReservationParameterImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link Gtm.impl.ReservationParameterImpl#getMandatoryReservationForBrands <em>Mandatory Reservation For Brands</em>}</li>
 *   <li>{@link Gtm.impl.ReservationParameterImpl#getMandatoryReservationsForMode <em>Mandatory Reservations For Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReservationParameterImpl extends MinimalEObjectImpl.Container implements ReservationParameter {
	/**
	 * The default value of the '{@link #isMandatoryReservation() <em>Mandatory Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatoryReservation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANDATORY_RESERVATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMandatoryReservation() <em>Mandatory Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatoryReservation()
	 * @generated
	 * @ordered
	 */
	protected boolean mandatoryReservation = MANDATORY_RESERVATION_EDEFAULT;

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
	 * The cached value of the '{@link #getMandatoryReservationForBrands() <em>Mandatory Reservation For Brands</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryReservationForBrands()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceBrand> mandatoryReservationForBrands;

	/**
	 * The cached value of the '{@link #getMandatoryReservationsForMode() <em>Mandatory Reservations For Mode</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryReservationsForMode()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceMode> mandatoryReservationsForMode;

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
	public boolean isMandatoryReservation() {
		return mandatoryReservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMandatoryReservation(boolean newMandatoryReservation) {
		boolean oldMandatoryReservation = mandatoryReservation;
		mandatoryReservation = newMandatoryReservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.RESERVATION_PARAMETER__MANDATORY_RESERVATION, oldMandatoryReservation, mandatoryReservation));
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
	public EList<ServiceBrand> getMandatoryReservationForBrands() {
		if (mandatoryReservationForBrands == null) {
			mandatoryReservationForBrands = new EObjectResolvingEList<ServiceBrand>(ServiceBrand.class, this, GtmPackage.RESERVATION_PARAMETER__MANDATORY_RESERVATION_FOR_BRANDS);
		}
		return mandatoryReservationForBrands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceMode> getMandatoryReservationsForMode() {
		if (mandatoryReservationsForMode == null) {
			mandatoryReservationsForMode = new EDataTypeUniqueEList<ServiceMode>(ServiceMode.class, this, GtmPackage.RESERVATION_PARAMETER__MANDATORY_RESERVATIONS_FOR_MODE);
		}
		return mandatoryReservationsForMode;
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
			case GtmPackage.RESERVATION_PARAMETER__MANDATORY_RESERVATION:
				return isMandatoryReservation();
			case GtmPackage.RESERVATION_PARAMETER__ID:
				return getId();
			case GtmPackage.RESERVATION_PARAMETER__PARAMS9181:
				return getParams9181();
			case GtmPackage.RESERVATION_PARAMETER__OPTIONS:
				return getOptions();
			case GtmPackage.RESERVATION_PARAMETER__MANDATORY_RESERVATION_FOR_BRANDS:
				return getMandatoryReservationForBrands();
			case GtmPackage.RESERVATION_PARAMETER__MANDATORY_RESERVATIONS_FOR_MODE:
				return getMandatoryReservationsForMode();
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
			case GtmPackage.RESERVATION_PARAMETER__MANDATORY_RESERVATION:
				setMandatoryReservation((Boolean)newValue);
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
			case GtmPackage.RESERVATION_PARAMETER__MANDATORY_RESERVATION_FOR_BRANDS:
				getMandatoryReservationForBrands().clear();
				getMandatoryReservationForBrands().addAll((Collection<? extends ServiceBrand>)newValue);
				return;
			case GtmPackage.RESERVATION_PARAMETER__MANDATORY_RESERVATIONS_FOR_MODE:
				getMandatoryReservationsForMode().clear();
				getMandatoryReservationsForMode().addAll((Collection<? extends ServiceMode>)newValue);
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
			case GtmPackage.RESERVATION_PARAMETER__MANDATORY_RESERVATION:
				setMandatoryReservation(MANDATORY_RESERVATION_EDEFAULT);
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
			case GtmPackage.RESERVATION_PARAMETER__MANDATORY_RESERVATION_FOR_BRANDS:
				getMandatoryReservationForBrands().clear();
				return;
			case GtmPackage.RESERVATION_PARAMETER__MANDATORY_RESERVATIONS_FOR_MODE:
				getMandatoryReservationsForMode().clear();
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
			case GtmPackage.RESERVATION_PARAMETER__MANDATORY_RESERVATION:
				return mandatoryReservation != MANDATORY_RESERVATION_EDEFAULT;
			case GtmPackage.RESERVATION_PARAMETER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GtmPackage.RESERVATION_PARAMETER__PARAMS9181:
				return params9181 != null;
			case GtmPackage.RESERVATION_PARAMETER__OPTIONS:
				return options != null;
			case GtmPackage.RESERVATION_PARAMETER__MANDATORY_RESERVATION_FOR_BRANDS:
				return mandatoryReservationForBrands != null && !mandatoryReservationForBrands.isEmpty();
			case GtmPackage.RESERVATION_PARAMETER__MANDATORY_RESERVATIONS_FOR_MODE:
				return mandatoryReservationsForMode != null && !mandatoryReservationsForMode.isEmpty();
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
		result.append(" (mandatoryReservation: ");
		result.append(mandatoryReservation);
		result.append(", id: ");
		result.append(id);
		result.append(", mandatoryReservationsForMode: ");
		result.append(mandatoryReservationsForMode);
		result.append(')');
		return result.toString();
	}

} //ReservationParameterImpl
