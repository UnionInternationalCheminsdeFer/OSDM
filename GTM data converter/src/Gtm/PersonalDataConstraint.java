/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Personal Data Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.PersonalDataConstraint#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.PersonalDataConstraint#getRequiredPersonalData <em>Required Personal Data</em>}</li>
 *   <li>{@link Gtm.PersonalDataConstraint#getAllowedChanges <em>Allowed Changes</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getPersonalDataConstraint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AT_LEAST_ONE_REQUIRED_ITEM'"
 * @generated
 */
public interface PersonalDataConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Gtm.GtmPackage#getPersonalDataConstraint_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Gtm.PersonalDataConstraint#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Required Personal Data</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.RequiredPersonalData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Personal Data</em>' containment reference list.
	 * @see Gtm.GtmPackage#getPersonalDataConstraint_RequiredPersonalData()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequiredPersonalData> getRequiredPersonalData();

	/**
	 * Returns the value of the '<em><b>Allowed Changes</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.AllowedPersonalDataChanges}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Changes</em>' containment reference list.
	 * @see Gtm.GtmPackage#getPersonalDataConstraint_AllowedChanges()
	 * @model containment="true"
	 * @generated
	 */
	EList<AllowedPersonalDataChanges> getAllowedChanges();

} // PersonalDataConstraint
