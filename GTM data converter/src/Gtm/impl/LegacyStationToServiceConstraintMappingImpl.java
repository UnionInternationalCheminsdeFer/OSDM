/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.LegacyStationToServiceConstraintMapping;
import Gtm.ServiceConstraint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legacy Station To Service Constraint Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.LegacyStationToServiceConstraintMappingImpl#getCode <em>Code</em>}</li>
 *   <li>{@link Gtm.impl.LegacyStationToServiceConstraintMappingImpl#getServiceConstraint <em>Service Constraint</em>}</li>
 *   <li>{@link Gtm.impl.LegacyStationToServiceConstraintMappingImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegacyStationToServiceConstraintMappingImpl extends MinimalEObjectImpl.Container implements LegacyStationToServiceConstraintMapping {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final int CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected int code = CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServiceConstraint() <em>Service Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceConstraint()
	 * @generated
	 * @ordered
	 */
	protected ServiceConstraint serviceConstraint;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyStationToServiceConstraintMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(int newCode) {
		int oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConstraint getServiceConstraint() {
		if (serviceConstraint != null && serviceConstraint.eIsProxy()) {
			InternalEObject oldServiceConstraint = (InternalEObject)serviceConstraint;
			serviceConstraint = (ServiceConstraint)eResolveProxy(oldServiceConstraint);
			if (serviceConstraint != oldServiceConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING__SERVICE_CONSTRAINT, oldServiceConstraint, serviceConstraint));
			}
		}
		return serviceConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConstraint basicGetServiceConstraint() {
		return serviceConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceConstraint(ServiceConstraint newServiceConstraint) {
		ServiceConstraint oldServiceConstraint = serviceConstraint;
		serviceConstraint = newServiceConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING__SERVICE_CONSTRAINT, oldServiceConstraint, serviceConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING__CODE:
				return getCode();
			case GtmPackage.LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING__SERVICE_CONSTRAINT:
				if (resolve) return getServiceConstraint();
				return basicGetServiceConstraint();
			case GtmPackage.LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING__DESCRIPTION:
				return getDescription();
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
			case GtmPackage.LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING__CODE:
				setCode((Integer)newValue);
				return;
			case GtmPackage.LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING__SERVICE_CONSTRAINT:
				setServiceConstraint((ServiceConstraint)newValue);
				return;
			case GtmPackage.LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING__DESCRIPTION:
				setDescription((String)newValue);
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
			case GtmPackage.LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case GtmPackage.LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING__SERVICE_CONSTRAINT:
				setServiceConstraint((ServiceConstraint)null);
				return;
			case GtmPackage.LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case GtmPackage.LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING__CODE:
				return code != CODE_EDEFAULT;
			case GtmPackage.LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING__SERVICE_CONSTRAINT:
				return serviceConstraint != null;
			case GtmPackage.LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (code: ");
		result.append(code);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //LegacyStationToServiceConstraintMappingImpl
