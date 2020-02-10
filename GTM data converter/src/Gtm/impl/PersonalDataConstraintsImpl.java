/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.PersonalDataConstraint;
import Gtm.PersonalDataConstraints;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Personal Data Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.PersonalDataConstraintsImpl#getPersonalDataConstraints <em>Personal Data Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonalDataConstraintsImpl extends MinimalEObjectImpl.Container implements PersonalDataConstraints {
	/**
	 * The cached value of the '{@link #getPersonalDataConstraints() <em>Personal Data Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonalDataConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonalDataConstraint> personalDataConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonalDataConstraintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.PERSONAL_DATA_CONSTRAINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonalDataConstraint> getPersonalDataConstraints() {
		if (personalDataConstraints == null) {
			personalDataConstraints = new EObjectContainmentEList<PersonalDataConstraint>(PersonalDataConstraint.class, this, GtmPackage.PERSONAL_DATA_CONSTRAINTS__PERSONAL_DATA_CONSTRAINTS);
		}
		return personalDataConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.PERSONAL_DATA_CONSTRAINTS__PERSONAL_DATA_CONSTRAINTS:
				return ((InternalEList<?>)getPersonalDataConstraints()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.PERSONAL_DATA_CONSTRAINTS__PERSONAL_DATA_CONSTRAINTS:
				return getPersonalDataConstraints();
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
			case GtmPackage.PERSONAL_DATA_CONSTRAINTS__PERSONAL_DATA_CONSTRAINTS:
				getPersonalDataConstraints().clear();
				getPersonalDataConstraints().addAll((Collection<? extends PersonalDataConstraint>)newValue);
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
			case GtmPackage.PERSONAL_DATA_CONSTRAINTS__PERSONAL_DATA_CONSTRAINTS:
				getPersonalDataConstraints().clear();
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
			case GtmPackage.PERSONAL_DATA_CONSTRAINTS__PERSONAL_DATA_CONSTRAINTS:
				return personalDataConstraints != null && !personalDataConstraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PersonalDataConstraintsImpl
