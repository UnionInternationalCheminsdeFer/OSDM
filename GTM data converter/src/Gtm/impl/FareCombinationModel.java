/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fare Combination Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.FareCombinationModel#getModel <em>Model</em>}</li>
 *   <li>{@link Gtm.FareCombinationModel#getCombinableCarriers <em>Combinable Carriers</em>}</li>
 *   <li>{@link Gtm.FareCombinationModel#isOnlyWhenCombined <em>Only When Combined</em>}</li>
 *   <li>{@link Gtm.FareCombinationModel#getAllowedAllocators <em>Allowed Allocators</em>}</li>
 *   <li>{@link Gtm.FareCombinationModel#getReferenceCluster <em>Reference Cluster</em>}</li>
 *   <li>{@link Gtm.FareCombinationModel#getAllowedClusters <em>Allowed Clusters</em>}</li>
 *   <li>{@link Gtm.FareCombinationModel#getAllowedCommonContracts <em>Allowed Common Contracts</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getFareCombinationModel()
 * @model
 * @generated
 */
public interface FareCombinationModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.CombinationModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see Gtm.CombinationModel
	 * @see #setModel(CombinationModel)
	 * @see Gtm.GtmPackage#getFareCombinationModel_Model()
	 * @model
	 * @generated
	 */
	CombinationModel getModel();

	/**
	 * Sets the value of the '{@link Gtm.FareCombinationModel#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see Gtm.CombinationModel
	 * @see #getModel()
	 * @generated
	 */
	void setModel(CombinationModel value);

	/**
	 * Returns the value of the '<em><b>Combinable Carriers</b></em>' reference list.
	 * The list contents are of type {@link Gtm.Carrier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combinable Carriers</em>' reference list.
	 * @see Gtm.GtmPackage#getFareCombinationModel_CombinableCarriers()
	 * @model
	 * @generated
	 */
	EList<Carrier> getCombinableCarriers();

	/**
	 * Returns the value of the '<em><b>Only When Combined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Only When Combined</em>' attribute.
	 * @see #setOnlyWhenCombined(boolean)
	 * @see Gtm.GtmPackage#getFareCombinationModel_OnlyWhenCombined()
	 * @model
	 * @generated
	 */
	boolean isOnlyWhenCombined();

	/**
	 * Sets the value of the '{@link Gtm.FareCombinationModel#isOnlyWhenCombined <em>Only When Combined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Only When Combined</em>' attribute.
	 * @see #isOnlyWhenCombined()
	 * @generated
	 */
	void setOnlyWhenCombined(boolean value);

	/**
	 * Returns the value of the '<em><b>Allowed Allocators</b></em>' reference list.
	 * The list contents are of type {@link Gtm.Carrier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Allocators</em>' reference list.
	 * @see Gtm.GtmPackage#getFareCombinationModel_AllowedAllocators()
	 * @model
	 * @generated
	 */
	EList<Carrier> getAllowedAllocators();

	/**
	 * Returns the value of the '<em><b>Reference Cluster</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.Clusters}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Cluster</em>' attribute.
	 * @see Gtm.Clusters
	 * @see #setReferenceCluster(Clusters)
	 * @see Gtm.GtmPackage#getFareCombinationModel_ReferenceCluster()
	 * @model
	 * @generated
	 */
	Clusters getReferenceCluster();

	/**
	 * Sets the value of the '{@link Gtm.FareCombinationModel#getReferenceCluster <em>Reference Cluster</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Cluster</em>' attribute.
	 * @see Gtm.Clusters
	 * @see #getReferenceCluster()
	 * @generated
	 */
	void setReferenceCluster(Clusters value);

	/**
	 * Returns the value of the '<em><b>Allowed Clusters</b></em>' attribute list.
	 * The list contents are of type {@link Gtm.Clusters}.
	 * The literals are from the enumeration {@link Gtm.Clusters}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Clusters</em>' attribute list.
	 * @see Gtm.Clusters
	 * @see Gtm.GtmPackage#getFareCombinationModel_AllowedClusters()
	 * @model
	 * @generated
	 */
	EList<Clusters> getAllowedClusters();

	/**
	 * Returns the value of the '<em><b>Allowed Common Contracts</b></em>' reference list.
	 * The list contents are of type {@link Gtm.Carrier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Common Contracts</em>' reference list.
	 * @see Gtm.GtmPackage#getFareCombinationModel_AllowedCommonContracts()
	 * @model
	 * @generated
	 */
	EList<Carrier> getAllowedCommonContracts();

} // FareCombinationModel
