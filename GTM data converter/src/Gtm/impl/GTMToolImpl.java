/**
 */
package Gtm.impl;

import Gtm.CodeLists;
import Gtm.ConversionFromLegacy;
import Gtm.GTMTool;
import Gtm.GeneralTariffModel;
import Gtm.GtmPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GTM Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.GTMToolImpl#getConversionFromLegacy <em>Conversion From Legacy</em>}</li>
 *   <li>{@link Gtm.impl.GTMToolImpl#getCodeLists <em>Code Lists</em>}</li>
 *   <li>{@link Gtm.impl.GTMToolImpl#getGeneralTariffModel <em>General Tariff Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GTMToolImpl extends MinimalEObjectImpl.Container implements GTMTool {
	/**
	 * The cached value of the '{@link #getConversionFromLegacy() <em>Conversion From Legacy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversionFromLegacy()
	 * @generated
	 * @ordered
	 */
	protected ConversionFromLegacy conversionFromLegacy;

	/**
	 * The cached value of the '{@link #getCodeLists() <em>Code Lists</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeLists()
	 * @generated
	 * @ordered
	 */
	protected CodeLists codeLists;

	/**
	 * The cached value of the '{@link #getGeneralTariffModel() <em>General Tariff Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralTariffModel()
	 * @generated
	 * @ordered
	 */
	protected GeneralTariffModel generalTariffModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GTMToolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.GTM_TOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversionFromLegacy getConversionFromLegacy() {
		return conversionFromLegacy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConversionFromLegacy(ConversionFromLegacy newConversionFromLegacy, NotificationChain msgs) {
		ConversionFromLegacy oldConversionFromLegacy = conversionFromLegacy;
		conversionFromLegacy = newConversionFromLegacy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.GTM_TOOL__CONVERSION_FROM_LEGACY, oldConversionFromLegacy, newConversionFromLegacy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConversionFromLegacy(ConversionFromLegacy newConversionFromLegacy) {
		if (newConversionFromLegacy != conversionFromLegacy) {
			NotificationChain msgs = null;
			if (conversionFromLegacy != null)
				msgs = ((InternalEObject)conversionFromLegacy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.GTM_TOOL__CONVERSION_FROM_LEGACY, null, msgs);
			if (newConversionFromLegacy != null)
				msgs = ((InternalEObject)newConversionFromLegacy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.GTM_TOOL__CONVERSION_FROM_LEGACY, null, msgs);
			msgs = basicSetConversionFromLegacy(newConversionFromLegacy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.GTM_TOOL__CONVERSION_FROM_LEGACY, newConversionFromLegacy, newConversionFromLegacy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeLists getCodeLists() {
		return codeLists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodeLists(CodeLists newCodeLists, NotificationChain msgs) {
		CodeLists oldCodeLists = codeLists;
		codeLists = newCodeLists;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.GTM_TOOL__CODE_LISTS, oldCodeLists, newCodeLists);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeLists(CodeLists newCodeLists) {
		if (newCodeLists != codeLists) {
			NotificationChain msgs = null;
			if (codeLists != null)
				msgs = ((InternalEObject)codeLists).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.GTM_TOOL__CODE_LISTS, null, msgs);
			if (newCodeLists != null)
				msgs = ((InternalEObject)newCodeLists).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.GTM_TOOL__CODE_LISTS, null, msgs);
			msgs = basicSetCodeLists(newCodeLists, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.GTM_TOOL__CODE_LISTS, newCodeLists, newCodeLists));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralTariffModel getGeneralTariffModel() {
		return generalTariffModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralTariffModel(GeneralTariffModel newGeneralTariffModel, NotificationChain msgs) {
		GeneralTariffModel oldGeneralTariffModel = generalTariffModel;
		generalTariffModel = newGeneralTariffModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.GTM_TOOL__GENERAL_TARIFF_MODEL, oldGeneralTariffModel, newGeneralTariffModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralTariffModel(GeneralTariffModel newGeneralTariffModel) {
		if (newGeneralTariffModel != generalTariffModel) {
			NotificationChain msgs = null;
			if (generalTariffModel != null)
				msgs = ((InternalEObject)generalTariffModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.GTM_TOOL__GENERAL_TARIFF_MODEL, null, msgs);
			if (newGeneralTariffModel != null)
				msgs = ((InternalEObject)newGeneralTariffModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.GTM_TOOL__GENERAL_TARIFF_MODEL, null, msgs);
			msgs = basicSetGeneralTariffModel(newGeneralTariffModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.GTM_TOOL__GENERAL_TARIFF_MODEL, newGeneralTariffModel, newGeneralTariffModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.GTM_TOOL__CONVERSION_FROM_LEGACY:
				return basicSetConversionFromLegacy(null, msgs);
			case GtmPackage.GTM_TOOL__CODE_LISTS:
				return basicSetCodeLists(null, msgs);
			case GtmPackage.GTM_TOOL__GENERAL_TARIFF_MODEL:
				return basicSetGeneralTariffModel(null, msgs);
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
			case GtmPackage.GTM_TOOL__CONVERSION_FROM_LEGACY:
				return getConversionFromLegacy();
			case GtmPackage.GTM_TOOL__CODE_LISTS:
				return getCodeLists();
			case GtmPackage.GTM_TOOL__GENERAL_TARIFF_MODEL:
				return getGeneralTariffModel();
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
			case GtmPackage.GTM_TOOL__CONVERSION_FROM_LEGACY:
				setConversionFromLegacy((ConversionFromLegacy)newValue);
				return;
			case GtmPackage.GTM_TOOL__CODE_LISTS:
				setCodeLists((CodeLists)newValue);
				return;
			case GtmPackage.GTM_TOOL__GENERAL_TARIFF_MODEL:
				setGeneralTariffModel((GeneralTariffModel)newValue);
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
			case GtmPackage.GTM_TOOL__CONVERSION_FROM_LEGACY:
				setConversionFromLegacy((ConversionFromLegacy)null);
				return;
			case GtmPackage.GTM_TOOL__CODE_LISTS:
				setCodeLists((CodeLists)null);
				return;
			case GtmPackage.GTM_TOOL__GENERAL_TARIFF_MODEL:
				setGeneralTariffModel((GeneralTariffModel)null);
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
			case GtmPackage.GTM_TOOL__CONVERSION_FROM_LEGACY:
				return conversionFromLegacy != null;
			case GtmPackage.GTM_TOOL__CODE_LISTS:
				return codeLists != null;
			case GtmPackage.GTM_TOOL__GENERAL_TARIFF_MODEL:
				return generalTariffModel != null;
		}
		return super.eIsSet(featureID);
	}

} //GTMToolImpl
