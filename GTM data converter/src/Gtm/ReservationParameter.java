/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reservation Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.ReservationParameter#isOptionalReservation <em>Optional Reservation</em>}</li>
 *   <li>{@link Gtm.ReservationParameter#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.ReservationParameter#getParams9181 <em>Params9181</em>}</li>
 *   <li>{@link Gtm.ReservationParameter#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getReservationParameter()
 * @model
 * @generated
 */
public interface ReservationParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Optional Reservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Reservation</em>' attribute.
	 * @see #setOptionalReservation(boolean)
	 * @see Gtm.GtmPackage#getReservationParameter_OptionalReservation()
	 * @model
	 * @generated
	 */
	boolean isOptionalReservation();

	/**
	 * Sets the value of the '{@link Gtm.ReservationParameter#isOptionalReservation <em>Optional Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional Reservation</em>' attribute.
	 * @see #isOptionalReservation()
	 * @generated
	 */
	void setOptionalReservation(boolean value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Gtm.GtmPackage#getReservationParameter_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Gtm.ReservationParameter#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Params9181</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params9181</em>' containment reference.
	 * @see #setParams9181(ReservationParams9181)
	 * @see Gtm.GtmPackage#getReservationParameter_Params9181()
	 * @model containment="true"
	 * @generated
	 */
	ReservationParams9181 getParams9181();

	/**
	 * Sets the value of the '{@link Gtm.ReservationParameter#getParams9181 <em>Params9181</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Params9181</em>' containment reference.
	 * @see #getParams9181()
	 * @generated
	 */
	void setParams9181(ReservationParams9181 value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference.
	 * @see #setOptions(ReservationOptions)
	 * @see Gtm.GtmPackage#getReservationParameter_Options()
	 * @model containment="true"
	 * @generated
	 */
	ReservationOptions getOptions();

	/**
	 * Sets the value of the '{@link Gtm.ReservationParameter#getOptions <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' containment reference.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(ReservationOptions value);

} // ReservationParameter
