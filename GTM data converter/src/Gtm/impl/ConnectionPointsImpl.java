/**
 */
package Gtm.impl;

import Gtm.ConnectionPoint;
import Gtm.ConnectionPoints;
import Gtm.GtmPackage;

import Gtm.Station;
import java.lang.reflect.InvocationTargetException;
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
 * An implementation of the model object '<em><b>Connection Points</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.ConnectionPointsImpl#getConnectionPoints <em>Connection Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionPointsImpl extends MinimalEObjectImpl.Container implements ConnectionPoints {
	/**
	 * The cached value of the '{@link #getConnectionPoints() <em>Connection Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionPoint> connectionPoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionPointsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.CONNECTION_POINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionPoint> getConnectionPoints() {
		if (connectionPoints == null) {
			connectionPoints = new EObjectContainmentEList<ConnectionPoint>(ConnectionPoint.class, this, GtmPackage.CONNECTION_POINTS__CONNECTION_POINTS);
		}
		return connectionPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * finds a conection point with only one station included
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ConnectionPoint findSimpleConnectionPoint(Station station) {
		if (connectionPoints == null) return null;
		
		for (ConnectionPoint connectionPoint : connectionPoints) {
			if (connectionPoint.getConnectedStationSets().isEmpty()) return null;
			if(connectionPoint.getConnectedStationSets().size() > 1) return null;
			if (connectionPoint.getConnectedStationSets().get(0).getStations() == null) return null;
			if (connectionPoint.getConnectedStationSets().get(0).getStations().isEmpty()) return null;		
			if (connectionPoint.getConnectedStationSets().get(0).getStations().size() > 1) return null;
			if (connectionPoint.getConnectedStationSets().get(0).getStations().get(0) == station) {
				return connectionPoint;
			};
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.CONNECTION_POINTS__CONNECTION_POINTS:
				return ((InternalEList<?>)getConnectionPoints()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.CONNECTION_POINTS__CONNECTION_POINTS:
				return getConnectionPoints();
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
			case GtmPackage.CONNECTION_POINTS__CONNECTION_POINTS:
				getConnectionPoints().clear();
				getConnectionPoints().addAll((Collection<? extends ConnectionPoint>)newValue);
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
			case GtmPackage.CONNECTION_POINTS__CONNECTION_POINTS:
				getConnectionPoints().clear();
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
			case GtmPackage.CONNECTION_POINTS__CONNECTION_POINTS:
				return connectionPoints != null && !connectionPoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GtmPackage.CONNECTION_POINTS___FIND_SIMPLE_CONNECTION_POINT__STATION:
				return findSimpleConnectionPoint((Station)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConnectionPointsImpl
