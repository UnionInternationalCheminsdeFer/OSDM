/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Passenger Combination Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.PassengerCombinationConstraint#getMaxNumber <em>Max Number</em>}</li>
 *   <li>{@link Gtm.PassengerCombinationConstraint#getPassengerType <em>Passenger Type</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getPassengerCombinationConstraint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NUMBER_AT_LEAST_ONE TRAVELLER_TYPE_MUST'"
 * @generated
 */
public interface PassengerCombinationConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Max Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Number</em>' attribute.
	 * @see #setMaxNumber(int)
	 * @see Gtm.GtmPackage#getPassengerCombinationConstraint_MaxNumber()
	 * @model
	 * @generated
	 */
	int getMaxNumber();

	/**
	 * Sets the value of the '{@link Gtm.PassengerCombinationConstraint#getMaxNumber <em>Max Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Number</em>' attribute.
	 * @see #getMaxNumber()
	 * @generated
	 */
	void setMaxNumber(int value);

	/**
	 * Returns the value of the '<em><b>Passenger Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.TravelerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Type</em>' attribute.
	 * @see Gtm.TravelerType
	 * @see #setPassengerType(TravelerType)
	 * @see Gtm.GtmPackage#getPassengerCombinationConstraint_PassengerType()
	 * @model
	 * @generated
	 */
	TravelerType getPassengerType();

	/**
	 * Sets the value of the '{@link Gtm.PassengerCombinationConstraint#getPassengerType <em>Passenger Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Type</em>' attribute.
	 * @see Gtm.TravelerType
	 * @see #getPassengerType()
	 * @generated
	 */
	void setPassengerType(TravelerType value);

} // PassengerCombinationConstraint
