/**
 */
package Gtm.impl;

import Gtm.Carrier;
import Gtm.GtmPackage;
import Gtm.ReductionCard;
import Gtm.ServiceClass;
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
 * An implementation of the model object '<em><b>Reduction Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.ReductionCardImpl#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.impl.ReductionCardImpl#getCardIssuer <em>Card Issuer</em>}</li>
 *   <li>{@link Gtm.impl.ReductionCardImpl#getName <em>Name</em>}</li>
 *   <li>{@link Gtm.impl.ReductionCardImpl#getServiceClasses <em>Service Classes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReductionCardImpl extends MinimalEObjectImpl.Container implements ReductionCard {
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
	 * The cached value of the '{@link #getCardIssuer() <em>Card Issuer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardIssuer()
	 * @generated
	 * @ordered
	 */
	protected Carrier cardIssuer;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Text name;

	/**
	 * The cached value of the '{@link #getServiceClasses() <em>Service Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceClass> serviceClasses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReductionCardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.REDUCTION_CARD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.REDUCTION_CARD__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carrier getCardIssuer() {
		if (cardIssuer != null && cardIssuer.eIsProxy()) {
			InternalEObject oldCardIssuer = (InternalEObject)cardIssuer;
			cardIssuer = (Carrier)eResolveProxy(oldCardIssuer);
			if (cardIssuer != oldCardIssuer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.REDUCTION_CARD__CARD_ISSUER, oldCardIssuer, cardIssuer));
			}
		}
		return cardIssuer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carrier basicGetCardIssuer() {
		return cardIssuer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardIssuer(Carrier newCardIssuer) {
		Carrier oldCardIssuer = cardIssuer;
		cardIssuer = newCardIssuer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.REDUCTION_CARD__CARD_ISSUER, oldCardIssuer, cardIssuer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text getName() {
		if (name != null && name.eIsProxy()) {
			InternalEObject oldName = (InternalEObject)name;
			name = (Text)eResolveProxy(oldName);
			if (name != oldName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.REDUCTION_CARD__NAME, oldName, name));
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text basicGetName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Text newName) {
		Text oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.REDUCTION_CARD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceClass> getServiceClasses() {
		if (serviceClasses == null) {
			serviceClasses = new EObjectResolvingEList<ServiceClass>(ServiceClass.class, this, GtmPackage.REDUCTION_CARD__SERVICE_CLASSES);
		}
		return serviceClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.REDUCTION_CARD__ID:
				return getId();
			case GtmPackage.REDUCTION_CARD__CARD_ISSUER:
				if (resolve) return getCardIssuer();
				return basicGetCardIssuer();
			case GtmPackage.REDUCTION_CARD__NAME:
				if (resolve) return getName();
				return basicGetName();
			case GtmPackage.REDUCTION_CARD__SERVICE_CLASSES:
				return getServiceClasses();
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
			case GtmPackage.REDUCTION_CARD__ID:
				setId((String)newValue);
				return;
			case GtmPackage.REDUCTION_CARD__CARD_ISSUER:
				setCardIssuer((Carrier)newValue);
				return;
			case GtmPackage.REDUCTION_CARD__NAME:
				setName((Text)newValue);
				return;
			case GtmPackage.REDUCTION_CARD__SERVICE_CLASSES:
				getServiceClasses().clear();
				getServiceClasses().addAll((Collection<? extends ServiceClass>)newValue);
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
			case GtmPackage.REDUCTION_CARD__ID:
				setId(ID_EDEFAULT);
				return;
			case GtmPackage.REDUCTION_CARD__CARD_ISSUER:
				setCardIssuer((Carrier)null);
				return;
			case GtmPackage.REDUCTION_CARD__NAME:
				setName((Text)null);
				return;
			case GtmPackage.REDUCTION_CARD__SERVICE_CLASSES:
				getServiceClasses().clear();
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
			case GtmPackage.REDUCTION_CARD__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GtmPackage.REDUCTION_CARD__CARD_ISSUER:
				return cardIssuer != null;
			case GtmPackage.REDUCTION_CARD__NAME:
				return name != null;
			case GtmPackage.REDUCTION_CARD__SERVICE_CLASSES:
				return serviceClasses != null && !serviceClasses.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ReductionCardImpl
