/**
 */
package Gtm.impl;

import Gtm.Delivery;
import Gtm.FareStructure;
import Gtm.GeneralTariffModel;
import Gtm.GtmPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Tariff Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.GeneralTariffModelImpl#getDelivery <em>Delivery</em>}</li>
 *   <li>{@link Gtm.impl.GeneralTariffModelImpl#getFareStructure <em>Fare Structure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralTariffModelImpl extends MinimalEObjectImpl.Container implements GeneralTariffModel {
	/**
	 * The cached value of the '{@link #getDelivery() <em>Delivery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelivery()
	 * @generated
	 * @ordered
	 */
	protected Delivery delivery;

	/**
	 * The cached value of the '{@link #getFareStructure() <em>Fare Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFareStructure()
	 * @generated
	 * @ordered
	 */
	protected FareStructure fareStructure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralTariffModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.GENERAL_TARIFF_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delivery getDelivery() {
		return delivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelivery(Delivery newDelivery, NotificationChain msgs) {
		Delivery oldDelivery = delivery;
		delivery = newDelivery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.GENERAL_TARIFF_MODEL__DELIVERY, oldDelivery, newDelivery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelivery(Delivery newDelivery) {
		if (newDelivery != delivery) {
			NotificationChain msgs = null;
			if (delivery != null)
				msgs = ((InternalEObject)delivery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.GENERAL_TARIFF_MODEL__DELIVERY, null, msgs);
			if (newDelivery != null)
				msgs = ((InternalEObject)newDelivery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.GENERAL_TARIFF_MODEL__DELIVERY, null, msgs);
			msgs = basicSetDelivery(newDelivery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.GENERAL_TARIFF_MODEL__DELIVERY, newDelivery, newDelivery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FareStructure getFareStructure() {
		return fareStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFareStructure(FareStructure newFareStructure, NotificationChain msgs) {
		FareStructure oldFareStructure = fareStructure;
		fareStructure = newFareStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.GENERAL_TARIFF_MODEL__FARE_STRUCTURE, oldFareStructure, newFareStructure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFareStructure(FareStructure newFareStructure) {
		if (newFareStructure != fareStructure) {
			NotificationChain msgs = null;
			if (fareStructure != null)
				msgs = ((InternalEObject)fareStructure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.GENERAL_TARIFF_MODEL__FARE_STRUCTURE, null, msgs);
			if (newFareStructure != null)
				msgs = ((InternalEObject)newFareStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.GENERAL_TARIFF_MODEL__FARE_STRUCTURE, null, msgs);
			msgs = basicSetFareStructure(newFareStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.GENERAL_TARIFF_MODEL__FARE_STRUCTURE, newFareStructure, newFareStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.GENERAL_TARIFF_MODEL__DELIVERY:
				return basicSetDelivery(null, msgs);
			case GtmPackage.GENERAL_TARIFF_MODEL__FARE_STRUCTURE:
				return basicSetFareStructure(null, msgs);
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
			case GtmPackage.GENERAL_TARIFF_MODEL__DELIVERY:
				return getDelivery();
			case GtmPackage.GENERAL_TARIFF_MODEL__FARE_STRUCTURE:
				return getFareStructure();
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
			case GtmPackage.GENERAL_TARIFF_MODEL__DELIVERY:
				setDelivery((Delivery)newValue);
				return;
			case GtmPackage.GENERAL_TARIFF_MODEL__FARE_STRUCTURE:
				setFareStructure((FareStructure)newValue);
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
			case GtmPackage.GENERAL_TARIFF_MODEL__DELIVERY:
				setDelivery((Delivery)null);
				return;
			case GtmPackage.GENERAL_TARIFF_MODEL__FARE_STRUCTURE:
				setFareStructure((FareStructure)null);
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
			case GtmPackage.GENERAL_TARIFF_MODEL__DELIVERY:
				return delivery != null;
			case GtmPackage.GENERAL_TARIFF_MODEL__FARE_STRUCTURE:
				return fareStructure != null;
		}
		return super.eIsSet(featureID);
	}

} //GeneralTariffModelImpl
