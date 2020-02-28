/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reduction Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.ReductionConstraint#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.ReductionConstraint#getRequiredReductionCards <em>Required Reduction Cards</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getReductionConstraint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AT_LEAST_ONE'"
 * @generated
 */
public interface ReductionConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Gtm.GtmPackage#getReductionConstraint_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Gtm.ReductionConstraint#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Required Reduction Cards</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.RequiredReductionCard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Reduction Cards</em>' containment reference list.
	 * @see Gtm.GtmPackage#getReductionConstraint_RequiredReductionCards()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequiredReductionCard> getRequiredReductionCards();

} // ReductionConstraint
