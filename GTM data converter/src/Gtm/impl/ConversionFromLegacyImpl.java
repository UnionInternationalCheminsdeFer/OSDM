/**
 */
package Gtm.impl;

import Gtm.ConversionFromLegacy;
import Gtm.ConversionParams;
import Gtm.GtmPackage;
import Gtm.Legacy108;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conversion From Legacy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.ConversionFromLegacyImpl#getLegacy108 <em>Legacy108</em>}</li>
 *   <li>{@link Gtm.impl.ConversionFromLegacyImpl#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConversionFromLegacyImpl extends MinimalEObjectImpl.Container implements ConversionFromLegacy {
	/**
	 * The cached value of the '{@link #getLegacy108() <em>Legacy108</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacy108()
	 * @generated
	 * @ordered
	 */
	protected Legacy108 legacy108;

	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected ConversionParams params;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConversionFromLegacyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.CONVERSION_FROM_LEGACY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Legacy108 getLegacy108() {
		return legacy108;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegacy108(Legacy108 newLegacy108, NotificationChain msgs) {
		Legacy108 oldLegacy108 = legacy108;
		legacy108 = newLegacy108;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_FROM_LEGACY__LEGACY108, oldLegacy108, newLegacy108);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegacy108(Legacy108 newLegacy108) {
		if (newLegacy108 != legacy108) {
			NotificationChain msgs = null;
			if (legacy108 != null)
				msgs = ((InternalEObject)legacy108).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CONVERSION_FROM_LEGACY__LEGACY108, null, msgs);
			if (newLegacy108 != null)
				msgs = ((InternalEObject)newLegacy108).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CONVERSION_FROM_LEGACY__LEGACY108, null, msgs);
			msgs = basicSetLegacy108(newLegacy108, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_FROM_LEGACY__LEGACY108, newLegacy108, newLegacy108));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversionParams getParams() {
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParams(ConversionParams newParams, NotificationChain msgs) {
		ConversionParams oldParams = params;
		params = newParams;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_FROM_LEGACY__PARAMS, oldParams, newParams);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParams(ConversionParams newParams) {
		if (newParams != params) {
			NotificationChain msgs = null;
			if (params != null)
				msgs = ((InternalEObject)params).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CONVERSION_FROM_LEGACY__PARAMS, null, msgs);
			if (newParams != null)
				msgs = ((InternalEObject)newParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CONVERSION_FROM_LEGACY__PARAMS, null, msgs);
			msgs = basicSetParams(newParams, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_FROM_LEGACY__PARAMS, newParams, newParams));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.CONVERSION_FROM_LEGACY__LEGACY108:
				return basicSetLegacy108(null, msgs);
			case GtmPackage.CONVERSION_FROM_LEGACY__PARAMS:
				return basicSetParams(null, msgs);
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
			case GtmPackage.CONVERSION_FROM_LEGACY__LEGACY108:
				return getLegacy108();
			case GtmPackage.CONVERSION_FROM_LEGACY__PARAMS:
				return getParams();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GtmPackage.CONVERSION_FROM_LEGACY__LEGACY108:
				setLegacy108((Legacy108)newValue);
				return;
			case GtmPackage.CONVERSION_FROM_LEGACY__PARAMS:
				setParams((ConversionParams)newValue);
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
			case GtmPackage.CONVERSION_FROM_LEGACY__LEGACY108:
				setLegacy108((Legacy108)null);
				return;
			case GtmPackage.CONVERSION_FROM_LEGACY__PARAMS:
				setParams((ConversionParams)null);
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
			case GtmPackage.CONVERSION_FROM_LEGACY__LEGACY108:
				return legacy108 != null;
			case GtmPackage.CONVERSION_FROM_LEGACY__PARAMS:
				return params != null;
		}
		return super.eIsSet(featureID);
	}

} //ConversionFromLegacyImpl
