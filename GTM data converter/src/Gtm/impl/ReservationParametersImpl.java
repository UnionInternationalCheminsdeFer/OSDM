/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.ReservationParameter;
import Gtm.ReservationParameters;

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
 * An implementation of the model object '<em><b>Reservation Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.ReservationParametersImpl#getReservationParameters <em>Reservation Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReservationParametersImpl extends MinimalEObjectImpl.Container implements ReservationParameters {
	/**
	 * The cached value of the '{@link #getReservationParameters() <em>Reservation Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservationParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ReservationParameter> reservationParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReservationParametersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.RESERVATION_PARAMETERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReservationParameter> getReservationParameters() {
		if (reservationParameters == null) {
			reservationParameters = new EObjectContainmentEList<ReservationParameter>(ReservationParameter.class, this, GtmPackage.RESERVATION_PARAMETERS__RESERVATION_PARAMETERS);
		}
		return reservationParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.RESERVATION_PARAMETERS__RESERVATION_PARAMETERS:
				return ((InternalEList<?>)getReservationParameters()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.RESERVATION_PARAMETERS__RESERVATION_PARAMETERS:
				return getReservationParameters();
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
			case GtmPackage.RESERVATION_PARAMETERS__RESERVATION_PARAMETERS:
				getReservationParameters().clear();
				getReservationParameters().addAll((Collection<? extends ReservationParameter>)newValue);
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
			case GtmPackage.RESERVATION_PARAMETERS__RESERVATION_PARAMETERS:
				getReservationParameters().clear();
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
			case GtmPackage.RESERVATION_PARAMETERS__RESERVATION_PARAMETERS:
				return reservationParameters != null && !reservationParameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReservationParametersImpl
