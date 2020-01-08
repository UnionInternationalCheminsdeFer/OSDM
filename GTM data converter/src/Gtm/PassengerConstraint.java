/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Passenger Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.PassengerConstraint#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.PassengerConstraint#getTravelerType <em>Traveler Type</em>}</li>
 *   <li>{@link Gtm.PassengerConstraint#getText <em>Text</em>}</li>
 *   <li>{@link Gtm.PassengerConstraint#getUpperAgeLimit <em>Upper Age Limit</em>}</li>
 *   <li>{@link Gtm.PassengerConstraint#getLowerAgeLimit <em>Lower Age Limit</em>}</li>
 *   <li>{@link Gtm.PassengerConstraint#getTravelAloneAgeLimit <em>Travel Alone Age Limit</em>}</li>
 *   <li>{@link Gtm.PassengerConstraint#getReservationAgeLimit <em>Reservation Age Limit</em>}</li>
 *   <li>{@link Gtm.PassengerConstraint#isIsAncilliary <em>Is Ancilliary</em>}</li>
 *   <li>{@link Gtm.PassengerConstraint#getPassengerWeight <em>Passenger Weight</em>}</li>
 *   <li>{@link Gtm.PassengerConstraint#getMaxTotalPassengerWeight <em>Max Total Passenger Weight</em>}</li>
 *   <li>{@link Gtm.PassengerConstraint#getMinTotalPassengerWeight <em>Min Total Passenger Weight</em>}</li>
 *   <li>{@link Gtm.PassengerConstraint#getIncludedFreePassengers <em>Included Free Passengers</em>}</li>
 *   <li>{@link Gtm.PassengerConstraint#getExcludedPassengerCombinations <em>Excluded Passenger Combinations</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getPassengerConstraint()
 * @model
 * @generated
 */
public interface PassengerConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Gtm.GtmPackage#getPassengerConstraint_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Gtm.PassengerConstraint#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Traveler Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.TravelerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traveler Type</em>' attribute.
	 * @see Gtm.TravelerType
	 * @see #setTravelerType(TravelerType)
	 * @see Gtm.GtmPackage#getPassengerConstraint_TravelerType()
	 * @model
	 * @generated
	 */
	TravelerType getTravelerType();

	/**
	 * Sets the value of the '{@link Gtm.PassengerConstraint#getTravelerType <em>Traveler Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traveler Type</em>' attribute.
	 * @see Gtm.TravelerType
	 * @see #getTravelerType()
	 * @generated
	 */
	void setTravelerType(TravelerType value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' reference.
	 * @see #setText(Text)
	 * @see Gtm.GtmPackage#getPassengerConstraint_Text()
	 * @model
	 * @generated
	 */
	Text getText();

	/**
	 * Sets the value of the '{@link Gtm.PassengerConstraint#getText <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(Text value);

	/**
	 * Returns the value of the '<em><b>Upper Age Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Age Limit</em>' attribute.
	 * @see #setUpperAgeLimit(int)
	 * @see Gtm.GtmPackage#getPassengerConstraint_UpperAgeLimit()
	 * @model
	 * @generated
	 */
	int getUpperAgeLimit();

	/**
	 * Sets the value of the '{@link Gtm.PassengerConstraint#getUpperAgeLimit <em>Upper Age Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Age Limit</em>' attribute.
	 * @see #getUpperAgeLimit()
	 * @generated
	 */
	void setUpperAgeLimit(int value);

	/**
	 * Returns the value of the '<em><b>Lower Age Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Age Limit</em>' attribute.
	 * @see #setLowerAgeLimit(int)
	 * @see Gtm.GtmPackage#getPassengerConstraint_LowerAgeLimit()
	 * @model
	 * @generated
	 */
	int getLowerAgeLimit();

	/**
	 * Sets the value of the '{@link Gtm.PassengerConstraint#getLowerAgeLimit <em>Lower Age Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Age Limit</em>' attribute.
	 * @see #getLowerAgeLimit()
	 * @generated
	 */
	void setLowerAgeLimit(int value);

	/**
	 * Returns the value of the '<em><b>Travel Alone Age Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Travel Alone Age Limit</em>' attribute.
	 * @see #setTravelAloneAgeLimit(int)
	 * @see Gtm.GtmPackage#getPassengerConstraint_TravelAloneAgeLimit()
	 * @model
	 * @generated
	 */
	int getTravelAloneAgeLimit();

	/**
	 * Sets the value of the '{@link Gtm.PassengerConstraint#getTravelAloneAgeLimit <em>Travel Alone Age Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Travel Alone Age Limit</em>' attribute.
	 * @see #getTravelAloneAgeLimit()
	 * @generated
	 */
	void setTravelAloneAgeLimit(int value);

	/**
	 * Returns the value of the '<em><b>Reservation Age Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation Age Limit</em>' attribute.
	 * @see #setReservationAgeLimit(int)
	 * @see Gtm.GtmPackage#getPassengerConstraint_ReservationAgeLimit()
	 * @model
	 * @generated
	 */
	int getReservationAgeLimit();

	/**
	 * Sets the value of the '{@link Gtm.PassengerConstraint#getReservationAgeLimit <em>Reservation Age Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservation Age Limit</em>' attribute.
	 * @see #getReservationAgeLimit()
	 * @generated
	 */
	void setReservationAgeLimit(int value);

	/**
	 * Returns the value of the '<em><b>Is Ancilliary</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Ancilliary</em>' attribute.
	 * @see #setIsAncilliary(boolean)
	 * @see Gtm.GtmPackage#getPassengerConstraint_IsAncilliary()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsAncilliary();

	/**
	 * Sets the value of the '{@link Gtm.PassengerConstraint#isIsAncilliary <em>Is Ancilliary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ancilliary</em>' attribute.
	 * @see #isIsAncilliary()
	 * @generated
	 */
	void setIsAncilliary(boolean value);

	/**
	 * Returns the value of the '<em><b>Passenger Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Weight</em>' attribute.
	 * @see #setPassengerWeight(int)
	 * @see Gtm.GtmPackage#getPassengerConstraint_PassengerWeight()
	 * @model
	 * @generated
	 */
	int getPassengerWeight();

	/**
	 * Sets the value of the '{@link Gtm.PassengerConstraint#getPassengerWeight <em>Passenger Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Weight</em>' attribute.
	 * @see #getPassengerWeight()
	 * @generated
	 */
	void setPassengerWeight(int value);

	/**
	 * Returns the value of the '<em><b>Max Total Passenger Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Total Passenger Weight</em>' attribute.
	 * @see #setMaxTotalPassengerWeight(int)
	 * @see Gtm.GtmPackage#getPassengerConstraint_MaxTotalPassengerWeight()
	 * @model
	 * @generated
	 */
	int getMaxTotalPassengerWeight();

	/**
	 * Sets the value of the '{@link Gtm.PassengerConstraint#getMaxTotalPassengerWeight <em>Max Total Passenger Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Total Passenger Weight</em>' attribute.
	 * @see #getMaxTotalPassengerWeight()
	 * @generated
	 */
	void setMaxTotalPassengerWeight(int value);

	/**
	 * Returns the value of the '<em><b>Min Total Passenger Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Total Passenger Weight</em>' attribute.
	 * @see #setMinTotalPassengerWeight(int)
	 * @see Gtm.GtmPackage#getPassengerConstraint_MinTotalPassengerWeight()
	 * @model
	 * @generated
	 */
	int getMinTotalPassengerWeight();

	/**
	 * Sets the value of the '{@link Gtm.PassengerConstraint#getMinTotalPassengerWeight <em>Min Total Passenger Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Total Passenger Weight</em>' attribute.
	 * @see #getMinTotalPassengerWeight()
	 * @generated
	 */
	void setMinTotalPassengerWeight(int value);

	/**
	 * Returns the value of the '<em><b>Included Free Passengers</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.PassengerCombinationConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included Free Passengers</em>' containment reference list.
	 * @see Gtm.GtmPackage#getPassengerConstraint_IncludedFreePassengers()
	 * @model containment="true"
	 * @generated
	 */
	EList<PassengerCombinationConstraint> getIncludedFreePassengers();

	/**
	 * Returns the value of the '<em><b>Excluded Passenger Combinations</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.PassengerCombinationConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excluded Passenger Combinations</em>' containment reference list.
	 * @see Gtm.GtmPackage#getPassengerConstraint_ExcludedPassengerCombinations()
	 * @model containment="true"
	 * @generated
	 */
	EList<PassengerCombinationConstraint> getExcludedPassengerCombinations();

} // PassengerConstraint
