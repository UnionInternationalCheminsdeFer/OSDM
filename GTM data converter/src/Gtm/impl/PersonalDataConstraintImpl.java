/**
 */
package Gtm.impl;

import Gtm.AllowedPersonalDataChanges;
import Gtm.GtmPackage;
import Gtm.PersonalDataConstraint;
import Gtm.RequiredPersonalData;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Personal Data Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.PersonalDataConstraintImpl#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.impl.PersonalDataConstraintImpl#getRequiredPersonalData <em>Required Personal Data</em>}</li>
 *   <li>{@link Gtm.impl.PersonalDataConstraintImpl#getAllowedChanges <em>Allowed Changes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonalDataConstraintImpl extends MinimalEObjectImpl.Container implements PersonalDataConstraint {
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
	 * The cached value of the '{@link #getRequiredPersonalData() <em>Required Personal Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredPersonalData()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredPersonalData> requiredPersonalData;

	/**
	 * The cached value of the '{@link #getAllowedChanges() <em>Allowed Changes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedChanges()
	 * @generated
	 * @ordered
	 */
	protected EList<AllowedPersonalDataChanges> allowedChanges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonalDataConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.PERSONAL_DATA_CONSTRAINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.PERSONAL_DATA_CONSTRAINT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredPersonalData> getRequiredPersonalData() {
		if (requiredPersonalData == null) {
			requiredPersonalData = new EObjectContainmentEList<RequiredPersonalData>(RequiredPersonalData.class, this, GtmPackage.PERSONAL_DATA_CONSTRAINT__REQUIRED_PERSONAL_DATA);
		}
		return requiredPersonalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllowedPersonalDataChanges> getAllowedChanges() {
		if (allowedChanges == null) {
			allowedChanges = new EObjectContainmentEList<AllowedPersonalDataChanges>(AllowedPersonalDataChanges.class, this, GtmPackage.PERSONAL_DATA_CONSTRAINT__ALLOWED_CHANGES);
		}
		return allowedChanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.PERSONAL_DATA_CONSTRAINT__REQUIRED_PERSONAL_DATA:
				return ((InternalEList<?>)getRequiredPersonalData()).basicRemove(otherEnd, msgs);
			case GtmPackage.PERSONAL_DATA_CONSTRAINT__ALLOWED_CHANGES:
				return ((InternalEList<?>)getAllowedChanges()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.PERSONAL_DATA_CONSTRAINT__ID:
				return getId();
			case GtmPackage.PERSONAL_DATA_CONSTRAINT__REQUIRED_PERSONAL_DATA:
				return getRequiredPersonalData();
			case GtmPackage.PERSONAL_DATA_CONSTRAINT__ALLOWED_CHANGES:
				return getAllowedChanges();
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
			case GtmPackage.PERSONAL_DATA_CONSTRAINT__ID:
				setId((String)newValue);
				return;
			case GtmPackage.PERSONAL_DATA_CONSTRAINT__REQUIRED_PERSONAL_DATA:
				getRequiredPersonalData().clear();
				getRequiredPersonalData().addAll((Collection<? extends RequiredPersonalData>)newValue);
				return;
			case GtmPackage.PERSONAL_DATA_CONSTRAINT__ALLOWED_CHANGES:
				getAllowedChanges().clear();
				getAllowedChanges().addAll((Collection<? extends AllowedPersonalDataChanges>)newValue);
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
			case GtmPackage.PERSONAL_DATA_CONSTRAINT__ID:
				setId(ID_EDEFAULT);
				return;
			case GtmPackage.PERSONAL_DATA_CONSTRAINT__REQUIRED_PERSONAL_DATA:
				getRequiredPersonalData().clear();
				return;
			case GtmPackage.PERSONAL_DATA_CONSTRAINT__ALLOWED_CHANGES:
				getAllowedChanges().clear();
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
			case GtmPackage.PERSONAL_DATA_CONSTRAINT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GtmPackage.PERSONAL_DATA_CONSTRAINT__REQUIRED_PERSONAL_DATA:
				return requiredPersonalData != null && !requiredPersonalData.isEmpty();
			case GtmPackage.PERSONAL_DATA_CONSTRAINT__ALLOWED_CHANGES:
				return allowedChanges != null && !allowedChanges.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //PersonalDataConstraintImpl
