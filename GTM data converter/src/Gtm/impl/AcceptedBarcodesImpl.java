/**
 */
package Gtm.impl;

import Gtm.AcceptedBarcodes;
import Gtm.BarcodeTypes;
import Gtm.GtmPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accepted Barcodes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.AcceptedBarcodesImpl#getAcceptedBarcodes <em>Accepted Barcodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AcceptedBarcodesImpl extends MinimalEObjectImpl.Container implements AcceptedBarcodes {
	/**
	 * The cached value of the '{@link #getAcceptedBarcodes() <em>Accepted Barcodes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptedBarcodes()
	 * @generated
	 * @ordered
	 */
	protected EList<BarcodeTypes> acceptedBarcodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcceptedBarcodesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.ACCEPTED_BARCODES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BarcodeTypes> getAcceptedBarcodes() {
		if (acceptedBarcodes == null) {
			acceptedBarcodes = new EDataTypeUniqueEList<BarcodeTypes>(BarcodeTypes.class, this, GtmPackage.ACCEPTED_BARCODES__ACCEPTED_BARCODES);
		}
		return acceptedBarcodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.ACCEPTED_BARCODES__ACCEPTED_BARCODES:
				return getAcceptedBarcodes();
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
			case GtmPackage.ACCEPTED_BARCODES__ACCEPTED_BARCODES:
				getAcceptedBarcodes().clear();
				getAcceptedBarcodes().addAll((Collection<? extends BarcodeTypes>)newValue);
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
			case GtmPackage.ACCEPTED_BARCODES__ACCEPTED_BARCODES:
				getAcceptedBarcodes().clear();
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
			case GtmPackage.ACCEPTED_BARCODES__ACCEPTED_BARCODES:
				return acceptedBarcodes != null && !acceptedBarcodes.isEmpty();
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
		result.append(" (acceptedBarcodes: ");
		result.append(acceptedBarcodes);
		result.append(')');
		return result.toString();
	}

} //AcceptedBarcodesImpl
