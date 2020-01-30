/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.ConnectionPoint#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.ConnectionPoint#getName <em>Name</em>}</li>
 *   <li>{@link Gtm.ConnectionPoint#getLegacyBorderPointCode <em>Legacy Border Point Code</em>}</li>
 *   <li>{@link Gtm.ConnectionPoint#getDescription <em>Description</em>}</li>
 *   <li>{@link Gtm.ConnectionPoint#getConnectedStationSets <em>Connected Station Sets</em>}</li>
 *   <li>{@link Gtm.ConnectionPoint#getDataSource <em>Data Source</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getConnectionPoint()
 * @model
 * @generated
 */
public interface ConnectionPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Gtm.GtmPackage#getConnectionPoint_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Gtm.ConnectionPoint#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Gtm.GtmPackage#getConnectionPoint_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Gtm.ConnectionPoint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Legacy Border Point Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Border Point Code</em>' attribute.
	 * @see #setLegacyBorderPointCode(int)
	 * @see Gtm.GtmPackage#getConnectionPoint_LegacyBorderPointCode()
	 * @model
	 * @generated
	 */
	int getLegacyBorderPointCode();

	/**
	 * Sets the value of the '{@link Gtm.ConnectionPoint#getLegacyBorderPointCode <em>Legacy Border Point Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legacy Border Point Code</em>' attribute.
	 * @see #getLegacyBorderPointCode()
	 * @generated
	 */
	void setLegacyBorderPointCode(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see Gtm.GtmPackage#getConnectionPoint_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Gtm.ConnectionPoint#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Connected Station Sets</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.StationSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Station Sets</em>' containment reference list.
	 * @see Gtm.GtmPackage#getConnectionPoint_ConnectedStationSets()
	 * @model containment="true"
	 * @generated
	 */
	EList<StationSet> getConnectedStationSets();

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.DataSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' attribute.
	 * @see Gtm.DataSource
	 * @see #setDataSource(DataSource)
	 * @see Gtm.GtmPackage#getConnectionPoint_DataSource()
	 * @model
	 * @generated
	 */
	DataSource getDataSource();

	/**
	 * Sets the value of the '{@link Gtm.ConnectionPoint#getDataSource <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' attribute.
	 * @see Gtm.DataSource
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(DataSource value);

} // ConnectionPoint
