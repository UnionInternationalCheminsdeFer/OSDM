/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.LegacySeparateContractSeries;
import Gtm.LegacySeparateContractSeriesList;

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
 * An implementation of the model object '<em><b>Legacy Separate Contract Series List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.LegacySeparateContractSeriesListImpl#getSeparateContractSeries <em>Separate Contract Series</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegacySeparateContractSeriesListImpl extends MinimalEObjectImpl.Container implements LegacySeparateContractSeriesList {
	/**
	 * The cached value of the '{@link #getSeparateContractSeries() <em>Separate Contract Series</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparateContractSeries()
	 * @generated
	 * @ordered
	 */
	protected EList<LegacySeparateContractSeries> separateContractSeries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacySeparateContractSeriesListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LEGACY_SEPARATE_CONTRACT_SERIES_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LegacySeparateContractSeries> getSeparateContractSeries() {
		if (separateContractSeries == null) {
			separateContractSeries = new EObjectContainmentEList<LegacySeparateContractSeries>(LegacySeparateContractSeries.class, this, GtmPackage.LEGACY_SEPARATE_CONTRACT_SERIES_LIST__SEPARATE_CONTRACT_SERIES);
		}
		return separateContractSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.LEGACY_SEPARATE_CONTRACT_SERIES_LIST__SEPARATE_CONTRACT_SERIES:
				return ((InternalEList<?>)getSeparateContractSeries()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.LEGACY_SEPARATE_CONTRACT_SERIES_LIST__SEPARATE_CONTRACT_SERIES:
				return getSeparateContractSeries();
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
			case GtmPackage.LEGACY_SEPARATE_CONTRACT_SERIES_LIST__SEPARATE_CONTRACT_SERIES:
				getSeparateContractSeries().clear();
				getSeparateContractSeries().addAll((Collection<? extends LegacySeparateContractSeries>)newValue);
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
			case GtmPackage.LEGACY_SEPARATE_CONTRACT_SERIES_LIST__SEPARATE_CONTRACT_SERIES:
				getSeparateContractSeries().clear();
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
			case GtmPackage.LEGACY_SEPARATE_CONTRACT_SERIES_LIST__SEPARATE_CONTRACT_SERIES:
				return separateContractSeries != null && !separateContractSeries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LegacySeparateContractSeriesListImpl
