/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allowed Personal Data Changes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.AllowedPersonalDataChanges#getTimeLimit <em>Time Limit</em>}</li>
 *   <li>{@link Gtm.AllowedPersonalDataChanges#getAcceptedReason <em>Accepted Reason</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getAllowedPersonalDataChanges()
 * @model
 * @generated
 */
public interface AllowedPersonalDataChanges extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Limit</em>' attribute.
	 * @see #setTimeLimit(float)
	 * @see Gtm.GtmPackage#getAllowedPersonalDataChanges_TimeLimit()
	 * @model
	 * @generated
	 */
	float getTimeLimit();

	/**
	 * Sets the value of the '{@link Gtm.AllowedPersonalDataChanges#getTimeLimit <em>Time Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Limit</em>' attribute.
	 * @see #getTimeLimit()
	 * @generated
	 */
	void setTimeLimit(float value);

	/**
	 * Returns the value of the '<em><b>Accepted Reason</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.PersonalDataChangeReason}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepted Reason</em>' attribute.
	 * @see Gtm.PersonalDataChangeReason
	 * @see #setAcceptedReason(PersonalDataChangeReason)
	 * @see Gtm.GtmPackage#getAllowedPersonalDataChanges_AcceptedReason()
	 * @model
	 * @generated
	 */
	PersonalDataChangeReason getAcceptedReason();

	/**
	 * Sets the value of the '{@link Gtm.AllowedPersonalDataChanges#getAcceptedReason <em>Accepted Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accepted Reason</em>' attribute.
	 * @see Gtm.PersonalDataChangeReason
	 * @see #getAcceptedReason()
	 * @generated
	 */
	void setAcceptedReason(PersonalDataChangeReason value);

} // AllowedPersonalDataChanges
