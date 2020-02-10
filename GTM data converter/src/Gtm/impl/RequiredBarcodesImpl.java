/**
 */
package Gtm.impl;

import Gtm.BarcodeTypes;
import Gtm.GtmPackage;
import Gtm.RequiredBarcodes;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Barcodes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.RequiredBarcodesImpl#getRequiredBarcodes <em>Required Barcodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequiredBarcodesImpl extends MinimalEObjectImpl.Container implements RequiredBarcodes {
	/**
	 * The cached value of the '{@link #getRequiredBarcodes() <em>Required Barcodes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredBarcodes()
	 * @generated
	 * @ordered
	 */
	protected EList<BarcodeTypes> requiredBarcodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredBarcodesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.REQUIRED_BARCODES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BarcodeTypes> getRequiredBarcodes() {
		if (requiredBarcodes == null) {
			requiredBarcodes = new EDataTypeUniqueEList<BarcodeTypes>(BarcodeTypes.class, this, GtmPackage.REQUIRED_BARCODES__REQUIRED_BARCODES);
		}
		return requiredBarcodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.REQUIRED_BARCODES__REQUIRED_BARCODES:
				return getRequiredBarcodes();
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
			case GtmPackage.REQUIRED_BARCODES__REQUIRED_BARCODES:
				getRequiredBarcodes().clear();
				getRequiredBarcodes().addAll((Collection<? extends BarcodeTypes>)newValue);
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
			case GtmPackage.REQUIRED_BARCODES__REQUIRED_BARCODES:
				getRequiredBarcodes().clear();
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
			case GtmPackage.REQUIRED_BARCODES__REQUIRED_BARCODES:
				return requiredBarcodes != null && !requiredBarcodes.isEmpty();
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
		result.append(" (requiredBarcodes: ");
		result.append(requiredBarcodes);
		result.append(')');
		return result.toString();
	}

} //RequiredBarcodesImpl
