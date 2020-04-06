/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Fake Border Stations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.LegacyFakeBorderStations#getStations <em>Stations</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacyFakeBorderStations()
 * @model
 * @generated
 */
public interface LegacyFakeBorderStations extends EObject {
	/**
	 * Returns the value of the '<em><b>Stations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stations</em>' containment reference.
	 * @see #setStations(StationSet)
	 * @see Gtm.GtmPackage#getLegacyFakeBorderStations_Stations()
	 * @model containment="true"
	 * @generated
	 */
	StationSet getStations();

	/**
	 * Sets the value of the '{@link Gtm.LegacyFakeBorderStations#getStations <em>Stations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stations</em>' containment reference.
	 * @see #getStations()
	 * @generated
	 */
	void setStations(StationSet value);

} // LegacyFakeBorderStations
