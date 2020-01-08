/**
 */
package Gtm.impl;

import Gtm.BorderPoints;
import Gtm.GtmPackage;
import Gtm.Station;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Border Points</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.BorderPointsImpl#getCode <em>Code</em>}</li>
 *   <li>{@link Gtm.impl.BorderPointsImpl#getName <em>Name</em>}</li>
 *   <li>{@link Gtm.impl.BorderPointsImpl#getStation1 <em>Station1</em>}</li>
 *   <li>{@link Gtm.impl.BorderPointsImpl#getStation2 <em>Station2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BorderPointsImpl extends MinimalEObjectImpl.Container implements BorderPoints {
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
	 * This is true if the Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean codeESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStation1() <em>Station1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStation1()
	 * @generated
	 * @ordered
	 */
	protected Station station1;

	/**
	 * The cached value of the '{@link #getStation2() <em>Station2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStation2()
	 * @generated
	 * @ordered
	 */
	protected Station station2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BorderPointsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.BORDER_POINTS;
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
		boolean oldCodeESet = codeESet;
		codeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.BORDER_POINTS__CODE, oldCode, code, !oldCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCode() {
		int oldCode = code;
		boolean oldCodeESet = codeESet;
		code = CODE_EDEFAULT;
		codeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GtmPackage.BORDER_POINTS__CODE, oldCode, CODE_EDEFAULT, oldCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCode() {
		return codeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.BORDER_POINTS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station getStation1() {
		if (station1 != null && station1.eIsProxy()) {
			InternalEObject oldStation1 = (InternalEObject)station1;
			station1 = (Station)eResolveProxy(oldStation1);
			if (station1 != oldStation1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.BORDER_POINTS__STATION1, oldStation1, station1));
			}
		}
		return station1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station basicGetStation1() {
		return station1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStation1(Station newStation1) {
		Station oldStation1 = station1;
		station1 = newStation1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.BORDER_POINTS__STATION1, oldStation1, station1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station getStation2() {
		if (station2 != null && station2.eIsProxy()) {
			InternalEObject oldStation2 = (InternalEObject)station2;
			station2 = (Station)eResolveProxy(oldStation2);
			if (station2 != oldStation2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.BORDER_POINTS__STATION2, oldStation2, station2));
			}
		}
		return station2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station basicGetStation2() {
		return station2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStation2(Station newStation2) {
		Station oldStation2 = station2;
		station2 = newStation2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.BORDER_POINTS__STATION2, oldStation2, station2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.BORDER_POINTS__CODE:
				return getCode();
			case GtmPackage.BORDER_POINTS__NAME:
				return getName();
			case GtmPackage.BORDER_POINTS__STATION1:
				if (resolve) return getStation1();
				return basicGetStation1();
			case GtmPackage.BORDER_POINTS__STATION2:
				if (resolve) return getStation2();
				return basicGetStation2();
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
			case GtmPackage.BORDER_POINTS__CODE:
				setCode((Integer)newValue);
				return;
			case GtmPackage.BORDER_POINTS__NAME:
				setName((String)newValue);
				return;
			case GtmPackage.BORDER_POINTS__STATION1:
				setStation1((Station)newValue);
				return;
			case GtmPackage.BORDER_POINTS__STATION2:
				setStation2((Station)newValue);
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
			case GtmPackage.BORDER_POINTS__CODE:
				unsetCode();
				return;
			case GtmPackage.BORDER_POINTS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GtmPackage.BORDER_POINTS__STATION1:
				setStation1((Station)null);
				return;
			case GtmPackage.BORDER_POINTS__STATION2:
				setStation2((Station)null);
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
			case GtmPackage.BORDER_POINTS__CODE:
				return isSetCode();
			case GtmPackage.BORDER_POINTS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GtmPackage.BORDER_POINTS__STATION1:
				return station1 != null;
			case GtmPackage.BORDER_POINTS__STATION2:
				return station2 != null;
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
		if (codeESet) result.append(code); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //BorderPointsImpl
