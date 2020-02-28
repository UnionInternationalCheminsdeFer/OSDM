/**
 */
package Gtm;

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
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AT_LEAST_ONE_OF_VIA_ZONE_LINE_POLYGON'"
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
	 * Returns the value of the '<em><b>Via Station</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Via Station</em>' containment reference.
	 * @see #setViaStation(ViaStation)
	 * @see Gtm.GtmPackage#getRegionalValidity_ViaStation()
	 * @model containment="true"
	 * @generated
	 */
	ViaStation getViaStation();

	/**
	 * Sets the value of the '{@link Gtm.RegionalValidity#getViaStation <em>Via Station</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Via Station</em>' containment reference.
	 * @see #getViaStation()
	 * @generated
	 */
	void setViaStation(ViaStation value);

	/**
	 * Returns the value of the '<em><b>Zone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone</em>' reference.
	 * @see #setZone(Zone)
	 * @see Gtm.GtmPackage#getRegionalValidity_Zone()
	 * @model
	 * @generated
	 */
	Zone getZone();

	/**
	 * Sets the value of the '{@link Gtm.RegionalValidity#getZone <em>Zone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone</em>' reference.
	 * @see #getZone()
	 * @generated
	 */
	void setZone(Zone value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' containment reference.
	 * @see #setLine(Line)
	 * @see Gtm.GtmPackage#getRegionalValidity_Line()
	 * @model containment="true"
	 * @generated
	 */
	Line getLine();

	/**
	 * Sets the value of the '{@link Gtm.RegionalValidity#getLine <em>Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' containment reference.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(Line value);

	/**
	 * Returns the value of the '<em><b>Polygone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygone</em>' containment reference.
	 * @see #setPolygone(Polygone)
	 * @see Gtm.GtmPackage#getRegionalValidity_Polygone()
	 * @model containment="true"
	 * @generated
	 */
	Polygone getPolygone();

	/**
	 * Sets the value of the '{@link Gtm.RegionalValidity#getPolygone <em>Polygone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polygone</em>' containment reference.
	 * @see #getPolygone()
	 * @generated
	 */
	void setPolygone(Polygone value);

} // RegionalValidity
