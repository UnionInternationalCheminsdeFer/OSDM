/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.VatTemplate;
import Gtm.VatTemplates;

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
 * An implementation of the model object '<em><b>Vat Templates</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.VatTemplatesImpl#getVatTemplates <em>Vat Templates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VatTemplatesImpl extends MinimalEObjectImpl.Container implements VatTemplates {
	/**
	 * The cached value of the '{@link #getVatTemplates() <em>Vat Templates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVatTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<VatTemplate> vatTemplates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VatTemplatesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.VAT_TEMPLATES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VatTemplate> getVatTemplates() {
		if (vatTemplates == null) {
			vatTemplates = new EObjectContainmentEList<VatTemplate>(VatTemplate.class, this, GtmPackage.VAT_TEMPLATES__VAT_TEMPLATES);
		}
		return vatTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.VAT_TEMPLATES__VAT_TEMPLATES:
				return ((InternalEList<?>)getVatTemplates()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.VAT_TEMPLATES__VAT_TEMPLATES:
				return getVatTemplates();
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
			case GtmPackage.VAT_TEMPLATES__VAT_TEMPLATES:
				getVatTemplates().clear();
				getVatTemplates().addAll((Collection<? extends VatTemplate>)newValue);
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
			case GtmPackage.VAT_TEMPLATES__VAT_TEMPLATES:
				getVatTemplates().clear();
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
			case GtmPackage.VAT_TEMPLATES__VAT_TEMPLATES:
				return vatTemplates != null && !vatTemplates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VatTemplatesImpl
