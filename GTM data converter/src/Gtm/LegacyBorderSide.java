/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Border Side</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.LegacyBorderSide#getCarrier <em>Carrier</em>}</li>
 *   <li>{@link Gtm.LegacyBorderSide#getStations <em>Stations</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacyBorderSide()
 * @model
 * @generated
 */
public interface LegacyBorderSide extends EObject {
	/**
	 * Returns the value of the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier</em>' reference.
	 * @see #setCarrier(Carrier)
	 * @see Gtm.GtmPackage#getLegacyBorderSide_Carrier()
	 * @model
	 * @generated
	 */
	Carrier getCarrier();

	/**
	 * Sets the value of the '{@link Gtm.LegacyBorderSide#getCarrier <em>Carrier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier</em>' reference.
	 * @see #getCarrier()
	 * @generated
	 */
	void setCarrier(Carrier value);

	/**
	 * Returns the value of the '<em><b>Stations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stations</em>' containment reference.
	 * @see #setStations(StationSet)
	 * @see Gtm.GtmPackage#getLegacyBorderSide_Stations()
	 * @model containment="true"
	 * @generated
	 */
	StationSet getStations();

	/**
	 * Sets the value of the '{@link Gtm.LegacyBorderSide#getStations <em>Stations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stations</em>' containment reference.
	 * @see #getStations()
	 * @generated
	 */
	void setStations(StationSet value);

} // LegacyBorderSide
