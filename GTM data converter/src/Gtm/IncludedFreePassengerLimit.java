/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Included Free Passenger Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.IncludedFreePassengerLimit#getNumber <em>Number</em>}</li>
 *   <li>{@link Gtm.IncludedFreePassengerLimit#getPassengerType <em>Passenger Type</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getIncludedFreePassengerLimit()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NUMBER_AT_LEAST_ONE TRAVELLER_TYPE_MUST'"
 * @generated
 */
public interface IncludedFreePassengerLimit extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see Gtm.GtmPackage#getIncludedFreePassengerLimit_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link Gtm.IncludedFreePassengerLimit#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Passenger Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.TravelerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Type</em>' attribute.
	 * @see Gtm.TravelerType
	 * @see #setPassengerType(TravelerType)
	 * @see Gtm.GtmPackage#getIncludedFreePassengerLimit_PassengerType()
	 * @model
	 * @generated
	 */
	TravelerType getPassengerType();

	/**
	 * Sets the value of the '{@link Gtm.IncludedFreePassengerLimit#getPassengerType <em>Passenger Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Type</em>' attribute.
	 * @see Gtm.TravelerType
	 * @see #getPassengerType()
	 * @generated
	 */
	void setPassengerType(TravelerType value);

} // IncludedFreePassengerLimit
