/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy108</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.Legacy108#getCarrier <em>Carrier</em>}</li>
 *   <li>{@link Gtm.Legacy108#getSeries <em>Series</em>}</li>
 *   <li>{@link Gtm.Legacy108#getFares <em>Fares</em>}</li>
 *   <li>{@link Gtm.Legacy108#getDistanceFare <em>Distance Fare</em>}</li>
 *   <li>{@link Gtm.Legacy108#getRouteFare <em>Route Fare</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacy108()
 * @model
 * @generated
 */
public interface Legacy108 extends EObject {
	/**
	 * Returns the value of the '<em><b>Carrier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier</em>' attribute.
	 * @see #setCarrier(String)
	 * @see Gtm.GtmPackage#getLegacy108_Carrier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getCarrier();

	/**
	 * Sets the value of the '{@link Gtm.Legacy108#getCarrier <em>Carrier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier</em>' attribute.
	 * @see #getCarrier()
	 * @generated
	 */
	void setCarrier(String value);

	/**
	 * Returns the value of the '<em><b>Series</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.LegacySeries}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series</em>' containment reference list.
	 * @see Gtm.GtmPackage#getLegacy108_Series()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<LegacySeries> getSeries();

	/**
	 * Returns the value of the '<em><b>Fares</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.LegacyFares}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fares</em>' containment reference list.
	 * @see Gtm.GtmPackage#getLegacy108_Fares()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<LegacyFares> getFares();

	/**
	 * Returns the value of the '<em><b>Distance Fare</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.LegacyDistanceFare}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Fare</em>' containment reference list.
	 * @see Gtm.GtmPackage#getLegacy108_DistanceFare()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<LegacyDistanceFare> getDistanceFare();

	/**
	 * Returns the value of the '<em><b>Route Fare</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.LegacyRouteFare}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Fare</em>' containment reference list.
	 * @see Gtm.GtmPackage#getLegacy108_RouteFare()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<LegacyRouteFare> getRouteFare();

} // Legacy108
