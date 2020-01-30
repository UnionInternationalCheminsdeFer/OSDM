/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Personal Data Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.PersonalDataConstraints#getPersonalDataConstraints <em>Personal Data Constraints</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getPersonalDataConstraints()
 * @model
 * @generated
 */
public interface PersonalDataConstraints extends EObject {
	/**
	 * Returns the value of the '<em><b>Personal Data Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.PersonalDataConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personal Data Constraints</em>' containment reference list.
	 * @see Gtm.GtmPackage#getPersonalDataConstraints_PersonalDataConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<PersonalDataConstraint> getPersonalDataConstraints();

} // PersonalDataConstraints
