/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.ReductionCard;
import Gtm.RequiredReductionCard;
import Gtm.ServiceClass;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Reduction Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.RequiredReductionCardImpl#getCardClass <em>Card Class</em>}</li>
 *   <li>{@link Gtm.impl.RequiredReductionCardImpl#getCard <em>Card</em>}</li>
 *   <li>{@link Gtm.impl.RequiredReductionCardImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequiredReductionCardImpl extends MinimalEObjectImpl.Container implements RequiredReductionCard {
	/**
	 * The cached value of the '{@link #getCardClass() <em>Card Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardClass()
	 * @generated
	 * @ordered
	 */
	protected ServiceClass cardClass;

	/**
	 * The cached value of the '{@link #getCard() <em>Card</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCard()
	 * @generated
	 * @ordered
	 */
	protected ReductionCard card;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredReductionCardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.REQUIRED_REDUCTION_CARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceClass getCardClass() {
		if (cardClass != null && cardClass.eIsProxy()) {
			InternalEObject oldCardClass = (InternalEObject)cardClass;
			cardClass = (ServiceClass)eResolveProxy(oldCardClass);
			if (cardClass != oldCardClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.REQUIRED_REDUCTION_CARD__CARD_CLASS, oldCardClass, cardClass));
			}
		}
		return cardClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceClass basicGetCardClass() {
		return cardClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardClass(ServiceClass newCardClass) {
		ServiceClass oldCardClass = cardClass;
		cardClass = newCardClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.REQUIRED_REDUCTION_CARD__CARD_CLASS, oldCardClass, cardClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReductionCard getCard() {
		if (card != null && card.eIsProxy()) {
			InternalEObject oldCard = (InternalEObject)card;
			card = (ReductionCard)eResolveProxy(oldCard);
			if (card != oldCard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.REQUIRED_REDUCTION_CARD__CARD, oldCard, card));
			}
		}
		return card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReductionCard basicGetCard() {
		return card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCard(ReductionCard newCard) {
		ReductionCard oldCard = card;
		card = newCard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.REQUIRED_REDUCTION_CARD__CARD, oldCard, card));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.REQUIRED_REDUCTION_CARD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.REQUIRED_REDUCTION_CARD__CARD_CLASS:
				if (resolve) return getCardClass();
				return basicGetCardClass();
			case GtmPackage.REQUIRED_REDUCTION_CARD__CARD:
				if (resolve) return getCard();
				return basicGetCard();
			case GtmPackage.REQUIRED_REDUCTION_CARD__NAME:
				return getName();
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
			case GtmPackage.REQUIRED_REDUCTION_CARD__CARD_CLASS:
				setCardClass((ServiceClass)newValue);
				return;
			case GtmPackage.REQUIRED_REDUCTION_CARD__CARD:
				setCard((ReductionCard)newValue);
				return;
			case GtmPackage.REQUIRED_REDUCTION_CARD__NAME:
				setName((String)newValue);
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
			case GtmPackage.REQUIRED_REDUCTION_CARD__CARD_CLASS:
				setCardClass((ServiceClass)null);
				return;
			case GtmPackage.REQUIRED_REDUCTION_CARD__CARD:
				setCard((ReductionCard)null);
				return;
			case GtmPackage.REQUIRED_REDUCTION_CARD__NAME:
				setName(NAME_EDEFAULT);
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
			case GtmPackage.REQUIRED_REDUCTION_CARD__CARD_CLASS:
				return cardClass != null;
			case GtmPackage.REQUIRED_REDUCTION_CARD__CARD:
				return card != null;
			case GtmPackage.REQUIRED_REDUCTION_CARD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RequiredReductionCardImpl
