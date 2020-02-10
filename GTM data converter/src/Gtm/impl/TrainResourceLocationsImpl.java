/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.TrainResourceLocation;
import Gtm.TrainResourceLocations;

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
 * An implementation of the model object '<em><b>Train Resource Locations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.TrainResourceLocationsImpl#getTrainResourceLocations <em>Train Resource Locations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrainResourceLocationsImpl extends MinimalEObjectImpl.Container implements TrainResourceLocations {
	/**
	 * The cached value of the '{@link #getTrainResourceLocations() <em>Train Resource Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainResourceLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<TrainResourceLocation> trainResourceLocations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrainResourceLocationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.TRAIN_RESOURCE_LOCATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrainResourceLocation> getTrainResourceLocations() {
		if (trainResourceLocations == null) {
			trainResourceLocations = new EObjectContainmentEList<TrainResourceLocation>(TrainResourceLocation.class, this, GtmPackage.TRAIN_RESOURCE_LOCATIONS__TRAIN_RESOURCE_LOCATIONS);
		}
		return trainResourceLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.TRAIN_RESOURCE_LOCATIONS__TRAIN_RESOURCE_LOCATIONS:
				return ((InternalEList<?>)getTrainResourceLocations()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.TRAIN_RESOURCE_LOCATIONS__TRAIN_RESOURCE_LOCATIONS:
				return getTrainResourceLocations();
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
			case GtmPackage.TRAIN_RESOURCE_LOCATIONS__TRAIN_RESOURCE_LOCATIONS:
				getTrainResourceLocations().clear();
				getTrainResourceLocations().addAll((Collection<? extends TrainResourceLocation>)newValue);
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
			case GtmPackage.TRAIN_RESOURCE_LOCATIONS__TRAIN_RESOURCE_LOCATIONS:
				getTrainResourceLocations().clear();
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
			case GtmPackage.TRAIN_RESOURCE_LOCATIONS__TRAIN_RESOURCE_LOCATIONS:
				return trainResourceLocations != null && !trainResourceLocations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrainResourceLocationsImpl
