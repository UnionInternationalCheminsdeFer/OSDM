/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Reduction Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.RequiredReductionCard#getCardClass <em>Card Class</em>}</li>
 *   <li>{@link Gtm.RequiredReductionCard#getCard <em>Card</em>}</li>
 *   <li>{@link Gtm.RequiredReductionCard#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getRequiredReductionCard()
 * @model
 * @generated
 */
public interface RequiredReductionCard extends EObject {
	/**
	 * Returns the value of the '<em><b>Card Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Class</em>' reference.
	 * @see #setCardClass(ServiceClass)
	 * @see Gtm.GtmPackage#getRequiredReductionCard_CardClass()
	 * @model
	 * @generated
	 */
	ServiceClass getCardClass();

	/**
	 * Sets the value of the '{@link Gtm.RequiredReductionCard#getCardClass <em>Card Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Class</em>' reference.
	 * @see #getCardClass()
	 * @generated
	 */
	void setCardClass(ServiceClass value);

	/**
	 * Returns the value of the '<em><b>Card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card</em>' reference.
	 * @see #setCard(ReductionCard)
	 * @see Gtm.GtmPackage#getRequiredReductionCard_Card()
	 * @model required="true"
	 * @generated
	 */
	ReductionCard getCard();

	/**
	 * Sets the value of the '{@link Gtm.RequiredReductionCard#getCard <em>Card</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card</em>' reference.
	 * @see #getCard()
	 * @generated
	 */
	void setCard(ReductionCard value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Gtm.GtmPackage#getRequiredReductionCard_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Gtm.RequiredReductionCard#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // RequiredReductionCard
