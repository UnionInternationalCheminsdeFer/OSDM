/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.NUTSCodes;
import Gtm.NutsCode;

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
 * An implementation of the model object '<em><b>NUTS Codes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.NUTSCodesImpl#getNutsCodes <em>Nuts Codes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NUTSCodesImpl extends MinimalEObjectImpl.Container implements NUTSCodes {
	/**
	 * The cached value of the '{@link #getNutsCodes() <em>Nuts Codes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutsCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<NutsCode> nutsCodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NUTSCodesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.NUTS_CODES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NutsCode> getNutsCodes() {
		if (nutsCodes == null) {
			nutsCodes = new EObjectContainmentEList<NutsCode>(NutsCode.class, this, GtmPackage.NUTS_CODES__NUTS_CODES);
		}
		return nutsCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.NUTS_CODES__NUTS_CODES:
				return ((InternalEList<?>)getNutsCodes()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.NUTS_CODES__NUTS_CODES:
				return getNutsCodes();
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
			case GtmPackage.NUTS_CODES__NUTS_CODES:
				getNutsCodes().clear();
				getNutsCodes().addAll((Collection<? extends NutsCode>)newValue);
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
			case GtmPackage.NUTS_CODES__NUTS_CODES:
				getNutsCodes().clear();
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
			case GtmPackage.NUTS_CODES__NUTS_CODES:
				return nutsCodes != null && !nutsCodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NUTSCodesImpl
