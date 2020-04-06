/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>After Sales Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.AfterSalesTemplate#getTransactionType <em>Transaction Type</em>}</li>
 *   <li>{@link Gtm.AfterSalesTemplate#isCarrierFee <em>Carrier Fee</em>}</li>
 *   <li>{@link Gtm.AfterSalesTemplate#getApplicationTime <em>Application Time</em>}</li>
 *   <li>{@link Gtm.AfterSalesTemplate#getFeeFactor <em>Fee Factor</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getAfterSalesTemplate()
 * @model
 * @generated
 */
public interface AfterSalesTemplate extends EObject {
	/**
	 * Returns the value of the '<em><b>Transaction Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.AfterSalesTransactionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Type</em>' attribute.
	 * @see Gtm.AfterSalesTransactionType
	 * @see #setTransactionType(AfterSalesTransactionType)
	 * @see Gtm.GtmPackage#getAfterSalesTemplate_TransactionType()
	 * @model
	 * @generated
	 */
	AfterSalesTransactionType getTransactionType();

	/**
	 * Sets the value of the '{@link Gtm.AfterSalesTemplate#getTransactionType <em>Transaction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Type</em>' attribute.
	 * @see Gtm.AfterSalesTransactionType
	 * @see #getTransactionType()
	 * @generated
	 */
	void setTransactionType(AfterSalesTransactionType value);

	/**
	 * Returns the value of the '<em><b>Carrier Fee</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Fee</em>' attribute.
	 * @see #setCarrierFee(boolean)
	 * @see Gtm.GtmPackage#getAfterSalesTemplate_CarrierFee()
	 * @model default="false"
	 * @generated
	 */
	boolean isCarrierFee();

	/**
	 * Sets the value of the '{@link Gtm.AfterSalesTemplate#isCarrierFee <em>Carrier Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Fee</em>' attribute.
	 * @see #isCarrierFee()
	 * @generated
	 */
	void setCarrierFee(boolean value);

	/**
	 * Returns the value of the '<em><b>Application Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Time</em>' containment reference.
	 * @see #setApplicationTime(ApplicationTime)
	 * @see Gtm.GtmPackage#getAfterSalesTemplate_ApplicationTime()
	 * @model containment="true"
	 * @generated
	 */
	ApplicationTime getApplicationTime();

	/**
	 * Sets the value of the '{@link Gtm.AfterSalesTemplate#getApplicationTime <em>Application Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Time</em>' containment reference.
	 * @see #getApplicationTime()
	 * @generated
	 */
	void setApplicationTime(ApplicationTime value);

	/**
	 * Returns the value of the '<em><b>Fee Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fee Factor</em>' attribute.
	 * @see #setFeeFactor(float)
	 * @see Gtm.GtmPackage#getAfterSalesTemplate_FeeFactor()
	 * @model
	 * @generated
	 */
	float getFeeFactor();

	/**
	 * Sets the value of the '{@link Gtm.AfterSalesTemplate#getFeeFactor <em>Fee Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fee Factor</em>' attribute.
	 * @see #getFeeFactor()
	 * @generated
	 */
	void setFeeFactor(float value);

} // AfterSalesTemplate
