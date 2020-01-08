/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regional Validity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.RegionalValidity#getSeqNb <em>Seq Nb</em>}</li>
 *   <li>{@link Gtm.RegionalValidity#getViaStation <em>Via Station</em>}</li>
 *   <li>{@link Gtm.RegionalValidity#getZone <em>Zone</em>}</li>
 *   <li>{@link Gtm.RegionalValidity#getLine <em>Line</em>}</li>
 *   <li>{@link Gtm.RegionalValidity#getPolygone <em>Polygone</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getRegionalValidity()
 * @model
 * @generated
 */
public interface RegionalValidity extends EObject {
	/**
	 * Returns the value of the '<em><b>Seq Nb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seq Nb</em>' attribute.
	 * @see #setSeqNb(int)
	 * @see Gtm.GtmPackage#getRegionalValidity_SeqNb()
	 * @model
	 * @generated
	 */
	int getSeqNb();

	/**
	 * Sets the value of the '{@link Gtm.RegionalValidity#getSeqNb <em>Seq Nb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seq Nb</em>' attribute.
	 * @see #getSeqNb()
	 * @generated
	 */
	void setSeqNb(int value);

	/**
	 * Returns the value of the '<em><b>Via Station</b></em>' reference list.
	 * The list contents are of type {@link Gtm.ViaStation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Via Station</em>' reference list.
	 * @see Gtm.GtmPackage#getRegionalValidity_ViaStation()
	 * @model
	 * @generated
	 */
	EList<ViaStation> getViaStation();

	/**
	 * Returns the value of the '<em><b>Zone</b></em>' reference list.
	 * The list contents are of type {@link Gtm.Zone}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone</em>' reference list.
	 * @see Gtm.GtmPackage#getRegionalValidity_Zone()
	 * @model
	 * @generated
	 */
	EList<Zone> getZone();

	/**
	 * Returns the value of the '<em><b>Line</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.Line}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' containment reference list.
	 * @see Gtm.GtmPackage#getRegionalValidity_Line()
	 * @model containment="true"
	 * @generated
	 */
	EList<Line> getLine();

	/**
	 * Returns the value of the '<em><b>Polygone</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.Polygone}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygone</em>' containment reference list.
	 * @see Gtm.GtmPackage#getRegionalValidity_Polygone()
	 * @model containment="true"
	 * @generated
	 */
	EList<Polygone> getPolygone();

} // RegionalValidity
