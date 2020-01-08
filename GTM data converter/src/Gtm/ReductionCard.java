/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reduction Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.ReductionCard#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.ReductionCard#getCardIssuer <em>Card Issuer</em>}</li>
 *   <li>{@link Gtm.ReductionCard#getName <em>Name</em>}</li>
 *   <li>{@link Gtm.ReductionCard#getServiceClasses <em>Service Classes</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getReductionCard()
 * @model
 * @generated
 */
public interface ReductionCard extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Gtm.GtmPackage#getReductionCard_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Gtm.ReductionCard#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Card Issuer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Issuer</em>' reference.
	 * @see #setCardIssuer(Carrier)
	 * @see Gtm.GtmPackage#getReductionCard_CardIssuer()
	 * @model required="true"
	 * @generated
	 */
	Carrier getCardIssuer();

	/**
	 * Sets the value of the '{@link Gtm.ReductionCard#getCardIssuer <em>Card Issuer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Issuer</em>' reference.
	 * @see #getCardIssuer()
	 * @generated
	 */
	void setCardIssuer(Carrier value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference.
	 * @see #setName(Text)
	 * @see Gtm.GtmPackage#getReductionCard_Name()
	 * @model
	 * @generated
	 */
	Text getName();

	/**
	 * Sets the value of the '{@link Gtm.ReductionCard#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Text value);

	/**
	 * Returns the value of the '<em><b>Service Classes</b></em>' reference list.
	 * The list contents are of type {@link Gtm.ServiceClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Classes</em>' reference list.
	 * @see Gtm.GtmPackage#getReductionCard_ServiceClasses()
	 * @model
	 * @generated
	 */
	EList<ServiceClass> getServiceClasses();

} // ReductionCard
