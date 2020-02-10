/**
 */
package Gtm.impl;

import Gtm.FareElement;
import Gtm.FareElements;
import Gtm.GtmPackage;

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
 * An implementation of the model object '<em><b>Fare Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.FareElementsImpl#getFareElements <em>Fare Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FareElementsImpl extends MinimalEObjectImpl.Container implements FareElements {
	/**
	 * The cached value of the '{@link #getFareElements() <em>Fare Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFareElements()
	 * @generated
	 * @ordered
	 */
	protected EList<FareElement> fareElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FareElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.FARE_ELEMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FareElement> getFareElements() {
		if (fareElements == null) {
			fareElements = new EObjectContainmentEList<FareElement>(FareElement.class, this, GtmPackage.FARE_ELEMENTS__FARE_ELEMENTS);
		}
		return fareElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.FARE_ELEMENTS__FARE_ELEMENTS:
				return ((InternalEList<?>)getFareElements()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.FARE_ELEMENTS__FARE_ELEMENTS:
				return getFareElements();
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
			case GtmPackage.FARE_ELEMENTS__FARE_ELEMENTS:
				getFareElements().clear();
				getFareElements().addAll((Collection<? extends FareElement>)newValue);
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
			case GtmPackage.FARE_ELEMENTS__FARE_ELEMENTS:
				getFareElements().clear();
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
			case GtmPackage.FARE_ELEMENTS__FARE_ELEMENTS:
				return fareElements != null && !fareElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FareElementsImpl
