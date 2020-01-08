/**
 */
package Gtm.impl;

import Gtm.Carrier;
import Gtm.Clusters;
import Gtm.CombinationModel;
import Gtm.FareCombinationModel;
import Gtm.GtmPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fare Combination Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.FareCombinationModelImpl#getModel <em>Model</em>}</li>
 *   <li>{@link Gtm.impl.FareCombinationModelImpl#getCombinableCarriers <em>Combinable Carriers</em>}</li>
 *   <li>{@link Gtm.impl.FareCombinationModelImpl#isOnlyWhenCombined <em>Only When Combined</em>}</li>
 *   <li>{@link Gtm.impl.FareCombinationModelImpl#getAllowedAllocators <em>Allowed Allocators</em>}</li>
 *   <li>{@link Gtm.impl.FareCombinationModelImpl#getReferenceCluster <em>Reference Cluster</em>}</li>
 *   <li>{@link Gtm.impl.FareCombinationModelImpl#getAllowedClusters <em>Allowed Clusters</em>}</li>
 *   <li>{@link Gtm.impl.FareCombinationModelImpl#getAllowedCommonContracts <em>Allowed Common Contracts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FareCombinationModelImpl extends MinimalEObjectImpl.Container implements FareCombinationModel {
	/**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final CombinationModel MODEL_EDEFAULT = CombinationModel.SEPARATE_TICKET;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected CombinationModel model = MODEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCombinableCarriers() <em>Combinable Carriers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombinableCarriers()
	 * @generated
	 * @ordered
	 */
	protected EList<Carrier> combinableCarriers;

	/**
	 * The default value of the '{@link #isOnlyWhenCombined() <em>Only When Combined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnlyWhenCombined()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ONLY_WHEN_COMBINED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOnlyWhenCombined() <em>Only When Combined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnlyWhenCombined()
	 * @generated
	 * @ordered
	 */
	protected boolean onlyWhenCombined = ONLY_WHEN_COMBINED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllowedAllocators() <em>Allowed Allocators</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedAllocators()
	 * @generated
	 * @ordered
	 */
	protected EList<Carrier> allowedAllocators;

	/**
	 * The default value of the '{@link #getReferenceCluster() <em>Reference Cluster</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceCluster()
	 * @generated
	 * @ordered
	 */
	protected static final Clusters REFERENCE_CLUSTER_EDEFAULT = Clusters.BUSINESS;

	/**
	 * The cached value of the '{@link #getReferenceCluster() <em>Reference Cluster</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceCluster()
	 * @generated
	 * @ordered
	 */
	protected Clusters referenceCluster = REFERENCE_CLUSTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllowedClusters() <em>Allowed Clusters</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedClusters()
	 * @generated
	 * @ordered
	 */
	protected EList<Clusters> allowedClusters;

	/**
	 * The cached value of the '{@link #getAllowedCommonContracts() <em>Allowed Common Contracts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedCommonContracts()
	 * @generated
	 * @ordered
	 */
	protected EList<Carrier> allowedCommonContracts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FareCombinationModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.FARE_COMBINATION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinationModel getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(CombinationModel newModel) {
		CombinationModel oldModel = model;
		model = newModel == null ? MODEL_EDEFAULT : newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_COMBINATION_MODEL__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Carrier> getCombinableCarriers() {
		if (combinableCarriers == null) {
			combinableCarriers = new EObjectResolvingEList<Carrier>(Carrier.class, this, GtmPackage.FARE_COMBINATION_MODEL__COMBINABLE_CARRIERS);
		}
		return combinableCarriers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOnlyWhenCombined() {
		return onlyWhenCombined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnlyWhenCombined(boolean newOnlyWhenCombined) {
		boolean oldOnlyWhenCombined = onlyWhenCombined;
		onlyWhenCombined = newOnlyWhenCombined;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_COMBINATION_MODEL__ONLY_WHEN_COMBINED, oldOnlyWhenCombined, onlyWhenCombined));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Carrier> getAllowedAllocators() {
		if (allowedAllocators == null) {
			allowedAllocators = new EObjectResolvingEList<Carrier>(Carrier.class, this, GtmPackage.FARE_COMBINATION_MODEL__ALLOWED_ALLOCATORS);
		}
		return allowedAllocators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clusters getReferenceCluster() {
		return referenceCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceCluster(Clusters newReferenceCluster) {
		Clusters oldReferenceCluster = referenceCluster;
		referenceCluster = newReferenceCluster == null ? REFERENCE_CLUSTER_EDEFAULT : newReferenceCluster;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FARE_COMBINATION_MODEL__REFERENCE_CLUSTER, oldReferenceCluster, referenceCluster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clusters> getAllowedClusters() {
		if (allowedClusters == null) {
			allowedClusters = new EDataTypeUniqueEList<Clusters>(Clusters.class, this, GtmPackage.FARE_COMBINATION_MODEL__ALLOWED_CLUSTERS);
		}
		return allowedClusters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Carrier> getAllowedCommonContracts() {
		if (allowedCommonContracts == null) {
			allowedCommonContracts = new EObjectResolvingEList<Carrier>(Carrier.class, this, GtmPackage.FARE_COMBINATION_MODEL__ALLOWED_COMMON_CONTRACTS);
		}
		return allowedCommonContracts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.FARE_COMBINATION_MODEL__MODEL:
				return getModel();
			case GtmPackage.FARE_COMBINATION_MODEL__COMBINABLE_CARRIERS:
				return getCombinableCarriers();
			case GtmPackage.FARE_COMBINATION_MODEL__ONLY_WHEN_COMBINED:
				return isOnlyWhenCombined();
			case GtmPackage.FARE_COMBINATION_MODEL__ALLOWED_ALLOCATORS:
				return getAllowedAllocators();
			case GtmPackage.FARE_COMBINATION_MODEL__REFERENCE_CLUSTER:
				return getReferenceCluster();
			case GtmPackage.FARE_COMBINATION_MODEL__ALLOWED_CLUSTERS:
				return getAllowedClusters();
			case GtmPackage.FARE_COMBINATION_MODEL__ALLOWED_COMMON_CONTRACTS:
				return getAllowedCommonContracts();
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
			case GtmPackage.FARE_COMBINATION_MODEL__MODEL:
				setModel((CombinationModel)newValue);
				return;
			case GtmPackage.FARE_COMBINATION_MODEL__COMBINABLE_CARRIERS:
				getCombinableCarriers().clear();
				getCombinableCarriers().addAll((Collection<? extends Carrier>)newValue);
				return;
			case GtmPackage.FARE_COMBINATION_MODEL__ONLY_WHEN_COMBINED:
				setOnlyWhenCombined((Boolean)newValue);
				return;
			case GtmPackage.FARE_COMBINATION_MODEL__ALLOWED_ALLOCATORS:
				getAllowedAllocators().clear();
				getAllowedAllocators().addAll((Collection<? extends Carrier>)newValue);
				return;
			case GtmPackage.FARE_COMBINATION_MODEL__REFERENCE_CLUSTER:
				setReferenceCluster((Clusters)newValue);
				return;
			case GtmPackage.FARE_COMBINATION_MODEL__ALLOWED_CLUSTERS:
				getAllowedClusters().clear();
				getAllowedClusters().addAll((Collection<? extends Clusters>)newValue);
				return;
			case GtmPackage.FARE_COMBINATION_MODEL__ALLOWED_COMMON_CONTRACTS:
				getAllowedCommonContracts().clear();
				getAllowedCommonContracts().addAll((Collection<? extends Carrier>)newValue);
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
			case GtmPackage.FARE_COMBINATION_MODEL__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
			case GtmPackage.FARE_COMBINATION_MODEL__COMBINABLE_CARRIERS:
				getCombinableCarriers().clear();
				return;
			case GtmPackage.FARE_COMBINATION_MODEL__ONLY_WHEN_COMBINED:
				setOnlyWhenCombined(ONLY_WHEN_COMBINED_EDEFAULT);
				return;
			case GtmPackage.FARE_COMBINATION_MODEL__ALLOWED_ALLOCATORS:
				getAllowedAllocators().clear();
				return;
			case GtmPackage.FARE_COMBINATION_MODEL__REFERENCE_CLUSTER:
				setReferenceCluster(REFERENCE_CLUSTER_EDEFAULT);
				return;
			case GtmPackage.FARE_COMBINATION_MODEL__ALLOWED_CLUSTERS:
				getAllowedClusters().clear();
				return;
			case GtmPackage.FARE_COMBINATION_MODEL__ALLOWED_COMMON_CONTRACTS:
				getAllowedCommonContracts().clear();
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
			case GtmPackage.FARE_COMBINATION_MODEL__MODEL:
				return model != MODEL_EDEFAULT;
			case GtmPackage.FARE_COMBINATION_MODEL__COMBINABLE_CARRIERS:
				return combinableCarriers != null && !combinableCarriers.isEmpty();
			case GtmPackage.FARE_COMBINATION_MODEL__ONLY_WHEN_COMBINED:
				return onlyWhenCombined != ONLY_WHEN_COMBINED_EDEFAULT;
			case GtmPackage.FARE_COMBINATION_MODEL__ALLOWED_ALLOCATORS:
				return allowedAllocators != null && !allowedAllocators.isEmpty();
			case GtmPackage.FARE_COMBINATION_MODEL__REFERENCE_CLUSTER:
				return referenceCluster != REFERENCE_CLUSTER_EDEFAULT;
			case GtmPackage.FARE_COMBINATION_MODEL__ALLOWED_CLUSTERS:
				return allowedClusters != null && !allowedClusters.isEmpty();
			case GtmPackage.FARE_COMBINATION_MODEL__ALLOWED_COMMON_CONTRACTS:
				return allowedCommonContracts != null && !allowedCommonContracts.isEmpty();
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
		result.append(" (model: ");
		result.append(model);
		result.append(", onlyWhenCombined: ");
		result.append(onlyWhenCombined);
		result.append(", referenceCluster: ");
		result.append(referenceCluster);
		result.append(", allowedClusters: ");
		result.append(allowedClusters);
		result.append(')');
		return result.toString();
	}

} //FareCombinationModelImpl
