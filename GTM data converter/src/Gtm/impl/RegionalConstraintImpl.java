/**
 */
package Gtm.impl;

import Gtm.ConnectionPoint;
import Gtm.GtmPackage;
import Gtm.RegionalConstraint;
import Gtm.RegionalValidity;

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
 * An implementation of the model object '<em><b>Regional Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.RegionalConstraintImpl#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.impl.RegionalConstraintImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link Gtm.impl.RegionalConstraintImpl#getEntryConnectionPoint <em>Entry Connection Point</em>}</li>
 *   <li>{@link Gtm.impl.RegionalConstraintImpl#getExitConnectionPoint <em>Exit Connection Point</em>}</li>
 *   <li>{@link Gtm.impl.RegionalConstraintImpl#getRegionalValidity <em>Regional Validity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegionalConstraintImpl extends MinimalEObjectImpl.Container implements RegionalConstraint {
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
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final int DISTANCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected int distance = DISTANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntryConnectionPoint() <em>Entry Connection Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryConnectionPoint()
	 * @generated
	 * @ordered
	 */
	protected ConnectionPoint entryConnectionPoint;

	/**
	 * The cached value of the '{@link #getExitConnectionPoint() <em>Exit Connection Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitConnectionPoint()
	 * @generated
	 * @ordered
	 */
	protected ConnectionPoint exitConnectionPoint;

	/**
	 * The cached value of the '{@link #getRegionalValidity() <em>Regional Validity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionalValidity()
	 * @generated
	 * @ordered
	 */
	protected EList<RegionalValidity> regionalValidity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionalConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.REGIONAL_CONSTRAINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.REGIONAL_CONSTRAINT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(int newDistance) {
		int oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.REGIONAL_CONSTRAINT__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPoint getEntryConnectionPoint() {
		if (entryConnectionPoint != null && entryConnectionPoint.eIsProxy()) {
			InternalEObject oldEntryConnectionPoint = (InternalEObject)entryConnectionPoint;
			entryConnectionPoint = (ConnectionPoint)eResolveProxy(oldEntryConnectionPoint);
			if (entryConnectionPoint != oldEntryConnectionPoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.REGIONAL_CONSTRAINT__ENTRY_CONNECTION_POINT, oldEntryConnectionPoint, entryConnectionPoint));
			}
		}
		return entryConnectionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPoint basicGetEntryConnectionPoint() {
		return entryConnectionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryConnectionPoint(ConnectionPoint newEntryConnectionPoint) {
		ConnectionPoint oldEntryConnectionPoint = entryConnectionPoint;
		entryConnectionPoint = newEntryConnectionPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.REGIONAL_CONSTRAINT__ENTRY_CONNECTION_POINT, oldEntryConnectionPoint, entryConnectionPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPoint getExitConnectionPoint() {
		if (exitConnectionPoint != null && exitConnectionPoint.eIsProxy()) {
			InternalEObject oldExitConnectionPoint = (InternalEObject)exitConnectionPoint;
			exitConnectionPoint = (ConnectionPoint)eResolveProxy(oldExitConnectionPoint);
			if (exitConnectionPoint != oldExitConnectionPoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.REGIONAL_CONSTRAINT__EXIT_CONNECTION_POINT, oldExitConnectionPoint, exitConnectionPoint));
			}
		}
		return exitConnectionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPoint basicGetExitConnectionPoint() {
		return exitConnectionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExitConnectionPoint(ConnectionPoint newExitConnectionPoint) {
		ConnectionPoint oldExitConnectionPoint = exitConnectionPoint;
		exitConnectionPoint = newExitConnectionPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.REGIONAL_CONSTRAINT__EXIT_CONNECTION_POINT, oldExitConnectionPoint, exitConnectionPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegionalValidity> getRegionalValidity() {
		if (regionalValidity == null) {
			regionalValidity = new EObjectContainmentEList<RegionalValidity>(RegionalValidity.class, this, GtmPackage.REGIONAL_CONSTRAINT__REGIONAL_VALIDITY);
		}
		return regionalValidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.REGIONAL_CONSTRAINT__REGIONAL_VALIDITY:
				return ((InternalEList<?>)getRegionalValidity()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.REGIONAL_CONSTRAINT__ID:
				return getId();
			case GtmPackage.REGIONAL_CONSTRAINT__DISTANCE:
				return getDistance();
			case GtmPackage.REGIONAL_CONSTRAINT__ENTRY_CONNECTION_POINT:
				if (resolve) return getEntryConnectionPoint();
				return basicGetEntryConnectionPoint();
			case GtmPackage.REGIONAL_CONSTRAINT__EXIT_CONNECTION_POINT:
				if (resolve) return getExitConnectionPoint();
				return basicGetExitConnectionPoint();
			case GtmPackage.REGIONAL_CONSTRAINT__REGIONAL_VALIDITY:
				return getRegionalValidity();
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
			case GtmPackage.REGIONAL_CONSTRAINT__ID:
				setId((String)newValue);
				return;
			case GtmPackage.REGIONAL_CONSTRAINT__DISTANCE:
				setDistance((Integer)newValue);
				return;
			case GtmPackage.REGIONAL_CONSTRAINT__ENTRY_CONNECTION_POINT:
				setEntryConnectionPoint((ConnectionPoint)newValue);
				return;
			case GtmPackage.REGIONAL_CONSTRAINT__EXIT_CONNECTION_POINT:
				setExitConnectionPoint((ConnectionPoint)newValue);
				return;
			case GtmPackage.REGIONAL_CONSTRAINT__REGIONAL_VALIDITY:
				getRegionalValidity().clear();
				getRegionalValidity().addAll((Collection<? extends RegionalValidity>)newValue);
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
			case GtmPackage.REGIONAL_CONSTRAINT__ID:
				setId(ID_EDEFAULT);
				return;
			case GtmPackage.REGIONAL_CONSTRAINT__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
				return;
			case GtmPackage.REGIONAL_CONSTRAINT__ENTRY_CONNECTION_POINT:
				setEntryConnectionPoint((ConnectionPoint)null);
				return;
			case GtmPackage.REGIONAL_CONSTRAINT__EXIT_CONNECTION_POINT:
				setExitConnectionPoint((ConnectionPoint)null);
				return;
			case GtmPackage.REGIONAL_CONSTRAINT__REGIONAL_VALIDITY:
				getRegionalValidity().clear();
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
			case GtmPackage.REGIONAL_CONSTRAINT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GtmPackage.REGIONAL_CONSTRAINT__DISTANCE:
				return distance != DISTANCE_EDEFAULT;
			case GtmPackage.REGIONAL_CONSTRAINT__ENTRY_CONNECTION_POINT:
				return entryConnectionPoint != null;
			case GtmPackage.REGIONAL_CONSTRAINT__EXIT_CONNECTION_POINT:
				return exitConnectionPoint != null;
			case GtmPackage.REGIONAL_CONSTRAINT__REGIONAL_VALIDITY:
				return regionalValidity != null && !regionalValidity.isEmpty();
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
		result.append(", distance: ");
		result.append(distance);
		result.append(')');
		return result.toString();
	}

} //RegionalConstraintImpl
