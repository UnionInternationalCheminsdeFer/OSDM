/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Personal Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.RequiredPersonalData#isTicketHolderOnly <em>Ticket Holder Only</em>}</li>
 *   <li>{@link Gtm.RequiredPersonalData#getDataItem <em>Data Item</em>}</li>
 *   <li>{@link Gtm.RequiredPersonalData#getTransfer <em>Transfer</em>}</li>
 *   <li>{@link Gtm.RequiredPersonalData#getFulfillmentType <em>Fulfillment Type</em>}</li>
 *   <li>{@link Gtm.RequiredPersonalData#getCrossBorder <em>Cross Border</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getRequiredPersonalData()
 * @model
 * @generated
 */
public interface RequiredPersonalData extends EObject {
	/**
	 * Returns the value of the '<em><b>Ticket Holder Only</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ticket Holder Only</em>' attribute.
	 * @see #setTicketHolderOnly(boolean)
	 * @see Gtm.GtmPackage#getRequiredPersonalData_TicketHolderOnly()
	 * @model default="true"
	 * @generated
	 */
	boolean isTicketHolderOnly();

	/**
	 * Sets the value of the '{@link Gtm.RequiredPersonalData#isTicketHolderOnly <em>Ticket Holder Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ticket Holder Only</em>' attribute.
	 * @see #isTicketHolderOnly()
	 * @generated
	 */
	void setTicketHolderOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Data Item</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.PersonalDataItemsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Item</em>' attribute.
	 * @see Gtm.PersonalDataItemsType
	 * @see #setDataItem(PersonalDataItemsType)
	 * @see Gtm.GtmPackage#getRequiredPersonalData_DataItem()
	 * @model
	 * @generated
	 */
	PersonalDataItemsType getDataItem();

	/**
	 * Sets the value of the '{@link Gtm.RequiredPersonalData#getDataItem <em>Data Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Item</em>' attribute.
	 * @see Gtm.PersonalDataItemsType
	 * @see #getDataItem()
	 * @generated
	 */
	void setDataItem(PersonalDataItemsType value);

	/**
	 * Returns the value of the '<em><b>Transfer</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.PersonalDataTransferType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfer</em>' attribute.
	 * @see Gtm.PersonalDataTransferType
	 * @see #setTransfer(PersonalDataTransferType)
	 * @see Gtm.GtmPackage#getRequiredPersonalData_Transfer()
	 * @model
	 * @generated
	 */
	PersonalDataTransferType getTransfer();

	/**
	 * Sets the value of the '{@link Gtm.RequiredPersonalData#getTransfer <em>Transfer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transfer</em>' attribute.
	 * @see Gtm.PersonalDataTransferType
	 * @see #getTransfer()
	 * @generated
	 */
	void setTransfer(PersonalDataTransferType value);

	/**
	 * Returns the value of the '<em><b>Fulfillment Type</b></em>' attribute list.
	 * The list contents are of type {@link Gtm.FulfillmentType}.
	 * The literals are from the enumeration {@link Gtm.FulfillmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fulfillment Type</em>' attribute list.
	 * @see Gtm.FulfillmentType
	 * @see Gtm.GtmPackage#getRequiredPersonalData_FulfillmentType()
	 * @model
	 * @generated
	 */
	EList<FulfillmentType> getFulfillmentType();

	/**
	 * Returns the value of the '<em><b>Cross Border</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.CrossBorderCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cross Border</em>' containment reference list.
	 * @see Gtm.GtmPackage#getRequiredPersonalData_CrossBorder()
	 * @model containment="true"
	 * @generated
	 */
	EList<CrossBorderCondition> getCrossBorder();

} // RequiredPersonalData
