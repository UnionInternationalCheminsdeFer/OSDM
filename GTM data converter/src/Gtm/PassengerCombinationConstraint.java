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
 * @model
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
	 * Returns the value of the '<em><b>Passenger Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Type</em>' reference.
	 * @see #setPassengerType(PassengerConstraint)
	 * @see Gtm.GtmPackage#getPassengerCombinationConstraint_PassengerType()
	 * @model
	 * @generated
	 */
	PassengerConstraint getPassengerType();

	/**
	 * Sets the value of the '{@link Gtm.PassengerCombinationConstraint#getPassengerType <em>Passenger Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Type</em>' reference.
	 * @see #getPassengerType()
	 * @generated
	 */
	void setPassengerType(PassengerConstraint value);

} // PassengerCombinationConstraint
