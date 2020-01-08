/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.ReservationParameter;
import Gtm.ServiceClass;
import Gtm.ServiceLevel;
import Gtm.Text;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.ServiceLevelImpl#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.impl.ServiceLevelImpl#getText <em>Text</em>}</li>
 *   <li>{@link Gtm.impl.ServiceLevelImpl#getCombiningServiceClasses <em>Combining Service Classes</em>}</li>
 *   <li>{@link Gtm.impl.ServiceLevelImpl#getReservationParameter <em>Reservation Parameter</em>}</li>
 *   <li>{@link Gtm.impl.ServiceLevelImpl#isIncludesClassName <em>Includes Class Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceLevelImpl extends MinimalEObjectImpl.Container implements ServiceLevel {
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
	 * The cached value of the '{@link #getText() <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected Text text;

	/**
	 * The cached value of the '{@link #getCombiningServiceClasses() <em>Combining Service Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombiningServiceClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceClass> combiningServiceClasses;

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
	 * The default value of the '{@link #isIncludesClassName() <em>Includes Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludesClassName()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDES_CLASS_NAME_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIncludesClassName() <em>Includes Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludesClassName()
	 * @generated
	 * @ordered
	 */
	protected boolean includesClassName = INCLUDES_CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceLevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.SERVICE_LEVEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.SERVICE_LEVEL__ID, oldId, id));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.SERVICE_LEVEL__TEXT, oldText, text));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.SERVICE_LEVEL__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceClass> getCombiningServiceClasses() {
		if (combiningServiceClasses == null) {
			combiningServiceClasses = new EObjectResolvingEList<ServiceClass>(ServiceClass.class, this, GtmPackage.SERVICE_LEVEL__COMBINING_SERVICE_CLASSES);
		}
		return combiningServiceClasses;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.SERVICE_LEVEL__RESERVATION_PARAMETER, oldReservationParameter, reservationParameter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.SERVICE_LEVEL__RESERVATION_PARAMETER, oldReservationParameter, reservationParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIncludesClassName() {
		return includesClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludesClassName(boolean newIncludesClassName) {
		boolean oldIncludesClassName = includesClassName;
		includesClassName = newIncludesClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.SERVICE_LEVEL__INCLUDES_CLASS_NAME, oldIncludesClassName, includesClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.SERVICE_LEVEL__ID:
				return getId();
			case GtmPackage.SERVICE_LEVEL__TEXT:
				if (resolve) return getText();
				return basicGetText();
			case GtmPackage.SERVICE_LEVEL__COMBINING_SERVICE_CLASSES:
				return getCombiningServiceClasses();
			case GtmPackage.SERVICE_LEVEL__RESERVATION_PARAMETER:
				if (resolve) return getReservationParameter();
				return basicGetReservationParameter();
			case GtmPackage.SERVICE_LEVEL__INCLUDES_CLASS_NAME:
				return isIncludesClassName();
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
			case GtmPackage.SERVICE_LEVEL__ID:
				setId((String)newValue);
				return;
			case GtmPackage.SERVICE_LEVEL__TEXT:
				setText((Text)newValue);
				return;
			case GtmPackage.SERVICE_LEVEL__COMBINING_SERVICE_CLASSES:
				getCombiningServiceClasses().clear();
				getCombiningServiceClasses().addAll((Collection<? extends ServiceClass>)newValue);
				return;
			case GtmPackage.SERVICE_LEVEL__RESERVATION_PARAMETER:
				setReservationParameter((ReservationParameter)newValue);
				return;
			case GtmPackage.SERVICE_LEVEL__INCLUDES_CLASS_NAME:
				setIncludesClassName((Boolean)newValue);
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
			case GtmPackage.SERVICE_LEVEL__ID:
				setId(ID_EDEFAULT);
				return;
			case GtmPackage.SERVICE_LEVEL__TEXT:
				setText((Text)null);
				return;
			case GtmPackage.SERVICE_LEVEL__COMBINING_SERVICE_CLASSES:
				getCombiningServiceClasses().clear();
				return;
			case GtmPackage.SERVICE_LEVEL__RESERVATION_PARAMETER:
				setReservationParameter((ReservationParameter)null);
				return;
			case GtmPackage.SERVICE_LEVEL__INCLUDES_CLASS_NAME:
				setIncludesClassName(INCLUDES_CLASS_NAME_EDEFAULT);
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
			case GtmPackage.SERVICE_LEVEL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GtmPackage.SERVICE_LEVEL__TEXT:
				return text != null;
			case GtmPackage.SERVICE_LEVEL__COMBINING_SERVICE_CLASSES:
				return combiningServiceClasses != null && !combiningServiceClasses.isEmpty();
			case GtmPackage.SERVICE_LEVEL__RESERVATION_PARAMETER:
				return reservationParameter != null;
			case GtmPackage.SERVICE_LEVEL__INCLUDES_CLASS_NAME:
				return includesClassName != INCLUDES_CLASS_NAME_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", includesClassName: ");
		result.append(includesClassName);
		result.append(')');
		return result.toString();
	}

} //ServiceLevelImpl
