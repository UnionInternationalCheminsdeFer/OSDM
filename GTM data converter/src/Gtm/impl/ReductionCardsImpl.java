/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.ReductionCard;
import Gtm.ReductionCards;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reduction Cards</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.ReductionCardsImpl#getReductionCards <em>Reduction Cards</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReductionCardsImpl extends MinimalEObjectImpl.Container implements ReductionCards {
	/**
	 * The cached value of the '{@link #getReductionCards() <em>Reduction Cards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReductionCards()
	 * @generated
	 * @ordered
	 */
	protected EList<ReductionCard> reductionCards;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReductionCardsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.REDUCTION_CARDS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReductionCard> getReductionCards() {
		if (reductionCards == null) {
			reductionCards = new EObjectContainmentEList<ReductionCard>(ReductionCard.class, this, GtmPackage.REDUCTION_CARDS__REDUCTION_CARDS);
		}
		return reductionCards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.REDUCTION_CARDS__REDUCTION_CARDS:
				return ((InternalEList<?>)getReductionCards()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.REDUCTION_CARDS__REDUCTION_CARDS:
				return getReductionCards();
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
			case GtmPackage.REDUCTION_CARDS__REDUCTION_CARDS:
				getReductionCards().clear();
				getReductionCards().addAll((Collection<? extends ReductionCard>)newValue);
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
			case GtmPackage.REDUCTION_CARDS__REDUCTION_CARDS:
				getReductionCards().clear();
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
			case GtmPackage.REDUCTION_CARDS__REDUCTION_CARDS:
				return reductionCards != null && !reductionCards.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReductionCardsImpl
