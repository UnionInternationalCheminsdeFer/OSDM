/**
 */
package Gtm.impl;

import Gtm.AcceptedBarcodes;
import Gtm.ControlDataExchangeTypes;
import Gtm.FulfillmentConstraint;
import Gtm.FulfillmentType;
import Gtm.GtmPackage;

import Gtm.RequiredBarcodes;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fulfillment Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.FulfillmentConstraintImpl#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.impl.FulfillmentConstraintImpl#getAcceptedFulfilmentTypes <em>Accepted Fulfilment Types</em>}</li>
 *   <li>{@link Gtm.impl.FulfillmentConstraintImpl#getRequiredControlDataExchange <em>Required Control Data Exchange</em>}</li>
 *   <li>{@link Gtm.impl.FulfillmentConstraintImpl#isIndividualTicketingPermitted <em>Individual Ticketing Permitted</em>}</li>
 *   <li>{@link Gtm.impl.FulfillmentConstraintImpl#getAcceptedBarcodes <em>Accepted Barcodes</em>}</li>
 *   <li>{@link Gtm.impl.FulfillmentConstraintImpl#getRequiredBarcodes <em>Required Barcodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FulfillmentConstraintImpl extends MinimalEObjectImpl.Container implements FulfillmentConstraint {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAcceptedFulfilmentTypes() <em>Accepted Fulfilment Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptedFulfilmentTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<FulfillmentType> acceptedFulfilmentTypes;

	/**
	 * The cached value of the '{@link #getRequiredControlDataExchange() <em>Required Control Data Exchange</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredControlDataExchange()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlDataExchangeTypes> requiredControlDataExchange;

	/**
	 * The default value of the '{@link #isIndividualTicketingPermitted() <em>Individual Ticketing Permitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIndividualTicketingPermitted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INDIVIDUAL_TICKETING_PERMITTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIndividualTicketingPermitted() <em>Individual Ticketing Permitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIndividualTicketingPermitted()
	 * @generated
	 * @ordered
	 */
	protected boolean individualTicketingPermitted = INDIVIDUAL_TICKETING_PERMITTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAcceptedBarcodes() <em>Accepted Barcodes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptedBarcodes()
	 * @generated
	 * @ordered
	 */
	protected AcceptedBarcodes acceptedBarcodes;

	/**
	 * The cached value of the '{@link #getRequiredBarcodes() <em>Required Barcodes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredBarcodes()
	 * @generated
	 * @ordered
	 */
	protected RequiredBarcodes requiredBarcodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FulfillmentConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.FULFILLMENT_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FULFILLMENT_CONSTRAINT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FulfillmentType> getAcceptedFulfilmentTypes() {
		if (acceptedFulfilmentTypes == null) {
			acceptedFulfilmentTypes = new EDataTypeUniqueEList<FulfillmentType>(FulfillmentType.class, this, GtmPackage.FULFILLMENT_CONSTRAINT__ACCEPTED_FULFILMENT_TYPES);
		}
		return acceptedFulfilmentTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptedBarcodes getAcceptedBarcodes() {
		return acceptedBarcodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAcceptedBarcodes(AcceptedBarcodes newAcceptedBarcodes, NotificationChain msgs) {
		AcceptedBarcodes oldAcceptedBarcodes = acceptedBarcodes;
		acceptedBarcodes = newAcceptedBarcodes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODES, oldAcceptedBarcodes, newAcceptedBarcodes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcceptedBarcodes(AcceptedBarcodes newAcceptedBarcodes) {
		if (newAcceptedBarcodes != acceptedBarcodes) {
			NotificationChain msgs = null;
			if (acceptedBarcodes != null)
				msgs = ((InternalEObject)acceptedBarcodes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODES, null, msgs);
			if (newAcceptedBarcodes != null)
				msgs = ((InternalEObject)newAcceptedBarcodes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODES, null, msgs);
			msgs = basicSetAcceptedBarcodes(newAcceptedBarcodes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODES, newAcceptedBarcodes, newAcceptedBarcodes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredBarcodes getRequiredBarcodes() {
		if (requiredBarcodes != null && requiredBarcodes.eIsProxy()) {
			InternalEObject oldRequiredBarcodes = (InternalEObject)requiredBarcodes;
			requiredBarcodes = (RequiredBarcodes)eResolveProxy(oldRequiredBarcodes);
			if (requiredBarcodes != oldRequiredBarcodes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.FULFILLMENT_CONSTRAINT__REQUIRED_BARCODES, oldRequiredBarcodes, requiredBarcodes));
			}
		}
		return requiredBarcodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredBarcodes basicGetRequiredBarcodes() {
		return requiredBarcodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredBarcodes(RequiredBarcodes newRequiredBarcodes) {
		RequiredBarcodes oldRequiredBarcodes = requiredBarcodes;
		requiredBarcodes = newRequiredBarcodes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FULFILLMENT_CONSTRAINT__REQUIRED_BARCODES, oldRequiredBarcodes, requiredBarcodes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODES:
				return basicSetAcceptedBarcodes(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlDataExchangeTypes> getRequiredControlDataExchange() {
		if (requiredControlDataExchange == null) {
			requiredControlDataExchange = new EDataTypeUniqueEList<ControlDataExchangeTypes>(ControlDataExchangeTypes.class, this, GtmPackage.FULFILLMENT_CONSTRAINT__REQUIRED_CONTROL_DATA_EXCHANGE);
		}
		return requiredControlDataExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIndividualTicketingPermitted() {
		return individualTicketingPermitted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndividualTicketingPermitted(boolean newIndividualTicketingPermitted) {
		boolean oldIndividualTicketingPermitted = individualTicketingPermitted;
		individualTicketingPermitted = newIndividualTicketingPermitted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.FULFILLMENT_CONSTRAINT__INDIVIDUAL_TICKETING_PERMITTED, oldIndividualTicketingPermitted, individualTicketingPermitted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.FULFILLMENT_CONSTRAINT__ID:
				return getId();
			case GtmPackage.FULFILLMENT_CONSTRAINT__ACCEPTED_FULFILMENT_TYPES:
				return getAcceptedFulfilmentTypes();
			case GtmPackage.FULFILLMENT_CONSTRAINT__REQUIRED_CONTROL_DATA_EXCHANGE:
				return getRequiredControlDataExchange();
			case GtmPackage.FULFILLMENT_CONSTRAINT__INDIVIDUAL_TICKETING_PERMITTED:
				return isIndividualTicketingPermitted();
			case GtmPackage.FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODES:
				return getAcceptedBarcodes();
			case GtmPackage.FULFILLMENT_CONSTRAINT__REQUIRED_BARCODES:
				if (resolve) return getRequiredBarcodes();
				return basicGetRequiredBarcodes();
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
			case GtmPackage.FULFILLMENT_CONSTRAINT__ID:
				setId((String)newValue);
				return;
			case GtmPackage.FULFILLMENT_CONSTRAINT__ACCEPTED_FULFILMENT_TYPES:
				getAcceptedFulfilmentTypes().clear();
				getAcceptedFulfilmentTypes().addAll((Collection<? extends FulfillmentType>)newValue);
				return;
			case GtmPackage.FULFILLMENT_CONSTRAINT__REQUIRED_CONTROL_DATA_EXCHANGE:
				getRequiredControlDataExchange().clear();
				getRequiredControlDataExchange().addAll((Collection<? extends ControlDataExchangeTypes>)newValue);
				return;
			case GtmPackage.FULFILLMENT_CONSTRAINT__INDIVIDUAL_TICKETING_PERMITTED:
				setIndividualTicketingPermitted((Boolean)newValue);
				return;
			case GtmPackage.FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODES:
				setAcceptedBarcodes((AcceptedBarcodes)newValue);
				return;
			case GtmPackage.FULFILLMENT_CONSTRAINT__REQUIRED_BARCODES:
				setRequiredBarcodes((RequiredBarcodes)newValue);
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
			case GtmPackage.FULFILLMENT_CONSTRAINT__ID:
				setId(ID_EDEFAULT);
				return;
			case GtmPackage.FULFILLMENT_CONSTRAINT__ACCEPTED_FULFILMENT_TYPES:
				getAcceptedFulfilmentTypes().clear();
				return;
			case GtmPackage.FULFILLMENT_CONSTRAINT__REQUIRED_CONTROL_DATA_EXCHANGE:
				getRequiredControlDataExchange().clear();
				return;
			case GtmPackage.FULFILLMENT_CONSTRAINT__INDIVIDUAL_TICKETING_PERMITTED:
				setIndividualTicketingPermitted(INDIVIDUAL_TICKETING_PERMITTED_EDEFAULT);
				return;
			case GtmPackage.FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODES:
				setAcceptedBarcodes((AcceptedBarcodes)null);
				return;
			case GtmPackage.FULFILLMENT_CONSTRAINT__REQUIRED_BARCODES:
				setRequiredBarcodes((RequiredBarcodes)null);
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
			case GtmPackage.FULFILLMENT_CONSTRAINT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GtmPackage.FULFILLMENT_CONSTRAINT__ACCEPTED_FULFILMENT_TYPES:
				return acceptedFulfilmentTypes != null && !acceptedFulfilmentTypes.isEmpty();
			case GtmPackage.FULFILLMENT_CONSTRAINT__REQUIRED_CONTROL_DATA_EXCHANGE:
				return requiredControlDataExchange != null && !requiredControlDataExchange.isEmpty();
			case GtmPackage.FULFILLMENT_CONSTRAINT__INDIVIDUAL_TICKETING_PERMITTED:
				return individualTicketingPermitted != INDIVIDUAL_TICKETING_PERMITTED_EDEFAULT;
			case GtmPackage.FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODES:
				return acceptedBarcodes != null;
			case GtmPackage.FULFILLMENT_CONSTRAINT__REQUIRED_BARCODES:
				return requiredBarcodes != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", acceptedFulfilmentTypes: ");
		result.append(acceptedFulfilmentTypes);
		result.append(", requiredControlDataExchange: ");
		result.append(requiredControlDataExchange);
		result.append(", individualTicketingPermitted: ");
		result.append(individualTicketingPermitted);
		result.append(')');
		return result.toString();
	}

} //FulfillmentConstraintImpl
