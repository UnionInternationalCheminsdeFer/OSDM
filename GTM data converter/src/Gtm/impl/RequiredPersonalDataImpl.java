/**
 */
package Gtm.impl;

import Gtm.CrossBorderCondition;
import Gtm.FulfillmentType;
import Gtm.GtmPackage;
import Gtm.PersonalDataItemsType;
import Gtm.PersonalDataTransferType;
import Gtm.RequiredPersonalData;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Personal Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.RequiredPersonalDataImpl#isTicketHolderOnly <em>Ticket Holder Only</em>}</li>
 *   <li>{@link Gtm.impl.RequiredPersonalDataImpl#getDataItem <em>Data Item</em>}</li>
 *   <li>{@link Gtm.impl.RequiredPersonalDataImpl#getTransfer <em>Transfer</em>}</li>
 *   <li>{@link Gtm.impl.RequiredPersonalDataImpl#getFulfillmentType <em>Fulfillment Type</em>}</li>
 *   <li>{@link Gtm.impl.RequiredPersonalDataImpl#getCrossBorder <em>Cross Border</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequiredPersonalDataImpl extends MinimalEObjectImpl.Container implements RequiredPersonalData {
	/**
	 * The default value of the '{@link #isTicketHolderOnly() <em>Ticket Holder Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTicketHolderOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TICKET_HOLDER_ONLY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isTicketHolderOnly() <em>Ticket Holder Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTicketHolderOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean ticketHolderOnly = TICKET_HOLDER_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataItem() <em>Data Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataItem()
	 * @generated
	 * @ordered
	 */
	protected static final PersonalDataItemsType DATA_ITEM_EDEFAULT = PersonalDataItemsType.DATE_OF_BIRTH;

	/**
	 * The cached value of the '{@link #getDataItem() <em>Data Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataItem()
	 * @generated
	 * @ordered
	 */
	protected PersonalDataItemsType dataItem = DATA_ITEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransfer() <em>Transfer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransfer()
	 * @generated
	 * @ordered
	 */
	protected static final PersonalDataTransferType TRANSFER_EDEFAULT = PersonalDataTransferType.SID;

	/**
	 * The cached value of the '{@link #getTransfer() <em>Transfer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransfer()
	 * @generated
	 * @ordered
	 */
	protected PersonalDataTransferType transfer = TRANSFER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFulfillmentType() <em>Fulfillment Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFulfillmentType()
	 * @generated
	 * @ordered
	 */
	protected EList<FulfillmentType> fulfillmentType;

	/**
	 * The cached value of the '{@link #getCrossBorder() <em>Cross Border</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossBorder()
	 * @generated
	 * @ordered
	 */
	protected EList<CrossBorderCondition> crossBorder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredPersonalDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.REQUIRED_PERSONAL_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTicketHolderOnly() {
		return ticketHolderOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTicketHolderOnly(boolean newTicketHolderOnly) {
		boolean oldTicketHolderOnly = ticketHolderOnly;
		ticketHolderOnly = newTicketHolderOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.REQUIRED_PERSONAL_DATA__TICKET_HOLDER_ONLY, oldTicketHolderOnly, ticketHolderOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonalDataItemsType getDataItem() {
		return dataItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataItem(PersonalDataItemsType newDataItem) {
		PersonalDataItemsType oldDataItem = dataItem;
		dataItem = newDataItem == null ? DATA_ITEM_EDEFAULT : newDataItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.REQUIRED_PERSONAL_DATA__DATA_ITEM, oldDataItem, dataItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonalDataTransferType getTransfer() {
		return transfer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransfer(PersonalDataTransferType newTransfer) {
		PersonalDataTransferType oldTransfer = transfer;
		transfer = newTransfer == null ? TRANSFER_EDEFAULT : newTransfer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.REQUIRED_PERSONAL_DATA__TRANSFER, oldTransfer, transfer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FulfillmentType> getFulfillmentType() {
		if (fulfillmentType == null) {
			fulfillmentType = new EDataTypeUniqueEList<FulfillmentType>(FulfillmentType.class, this, GtmPackage.REQUIRED_PERSONAL_DATA__FULFILLMENT_TYPE);
		}
		return fulfillmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CrossBorderCondition> getCrossBorder() {
		if (crossBorder == null) {
			crossBorder = new EObjectContainmentEList<CrossBorderCondition>(CrossBorderCondition.class, this, GtmPackage.REQUIRED_PERSONAL_DATA__CROSS_BORDER);
		}
		return crossBorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.REQUIRED_PERSONAL_DATA__CROSS_BORDER:
				return ((InternalEList<?>)getCrossBorder()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.REQUIRED_PERSONAL_DATA__TICKET_HOLDER_ONLY:
				return isTicketHolderOnly();
			case GtmPackage.REQUIRED_PERSONAL_DATA__DATA_ITEM:
				return getDataItem();
			case GtmPackage.REQUIRED_PERSONAL_DATA__TRANSFER:
				return getTransfer();
			case GtmPackage.REQUIRED_PERSONAL_DATA__FULFILLMENT_TYPE:
				return getFulfillmentType();
			case GtmPackage.REQUIRED_PERSONAL_DATA__CROSS_BORDER:
				return getCrossBorder();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GtmPackage.REQUIRED_PERSONAL_DATA__TICKET_HOLDER_ONLY:
				setTicketHolderOnly((Boolean)newValue);
				return;
			case GtmPackage.REQUIRED_PERSONAL_DATA__DATA_ITEM:
				setDataItem((PersonalDataItemsType)newValue);
				return;
			case GtmPackage.REQUIRED_PERSONAL_DATA__TRANSFER:
				setTransfer((PersonalDataTransferType)newValue);
				return;
			case GtmPackage.REQUIRED_PERSONAL_DATA__FULFILLMENT_TYPE:
				getFulfillmentType().clear();
				getFulfillmentType().addAll((Collection<? extends FulfillmentType>)newValue);
				return;
			case GtmPackage.REQUIRED_PERSONAL_DATA__CROSS_BORDER:
				getCrossBorder().clear();
				getCrossBorder().addAll((Collection<? extends CrossBorderCondition>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GtmPackage.REQUIRED_PERSONAL_DATA__TICKET_HOLDER_ONLY:
				setTicketHolderOnly(TICKET_HOLDER_ONLY_EDEFAULT);
				return;
			case GtmPackage.REQUIRED_PERSONAL_DATA__DATA_ITEM:
				setDataItem(DATA_ITEM_EDEFAULT);
				return;
			case GtmPackage.REQUIRED_PERSONAL_DATA__TRANSFER:
				setTransfer(TRANSFER_EDEFAULT);
				return;
			case GtmPackage.REQUIRED_PERSONAL_DATA__FULFILLMENT_TYPE:
				getFulfillmentType().clear();
				return;
			case GtmPackage.REQUIRED_PERSONAL_DATA__CROSS_BORDER:
				getCrossBorder().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GtmPackage.REQUIRED_PERSONAL_DATA__TICKET_HOLDER_ONLY:
				return ticketHolderOnly != TICKET_HOLDER_ONLY_EDEFAULT;
			case GtmPackage.REQUIRED_PERSONAL_DATA__DATA_ITEM:
				return dataItem != DATA_ITEM_EDEFAULT;
			case GtmPackage.REQUIRED_PERSONAL_DATA__TRANSFER:
				return transfer != TRANSFER_EDEFAULT;
			case GtmPackage.REQUIRED_PERSONAL_DATA__FULFILLMENT_TYPE:
				return fulfillmentType != null && !fulfillmentType.isEmpty();
			case GtmPackage.REQUIRED_PERSONAL_DATA__CROSS_BORDER:
				return crossBorder != null && !crossBorder.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ticketHolderOnly: ");
		result.append(ticketHolderOnly);
		result.append(", dataItem: ");
		result.append(dataItem);
		result.append(", transfer: ");
		result.append(transfer);
		result.append(", fulfillmentType: ");
		result.append(fulfillmentType);
		result.append(')');
		return result.toString();
	}

} //RequiredPersonalDataImpl
