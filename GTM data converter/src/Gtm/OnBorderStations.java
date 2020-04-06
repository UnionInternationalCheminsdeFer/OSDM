/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>On Border Stations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.OnBorderStations#getStations <em>Stations</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getOnBorderStations()
 * @model
 * @generated
 */
public interface OnBorderStations extends EObject {
	/**
	 * Returns the value of the '<em><b>Stations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stations</em>' containment reference.
	 * @see #setStations(StationSet)
	 * @see Gtm.GtmPackage#getOnBorderStations_Stations()
	 * @model containment="true"
	 * @generated
	 */
	StationSet getStations();

	/**
	 * Sets the value of the '{@link Gtm.OnBorderStations#getStations <em>Stations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stations</em>' containment reference.
	 * @see #getStations()
	 * @generated
	 */
	void setStations(StationSet value);

} // OnBorderStations
