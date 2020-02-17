/**
 */
package Gtm.impl;

import Gtm.Carrier;
import Gtm.FareStationSetDefinition;
import Gtm.FareStationSetDefinitions;
import Gtm.GtmPackage;

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
 * An implementation of the model object '<em><b>Fare Station Set Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.FareStationSetDefinitionsImpl#getFareStationSetDefinitions <em>Fare Station Set Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FareStationSetDefinitionsImpl extends MinimalEObjectImpl.Container implements FareStationSetDefinitions {
	/**
	 * The cached value of the '{@link #getFareStationSetDefinitions() <em>Fare Station Set Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFareStationSetDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<FareStationSetDefinition> fareStationSetDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FareStationSetDefinitionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.FARE_STATION_SET_DEFINITIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FareStationSetDefinition> getFareStationSetDefinitions() {
		if (fareStationSetDefinitions == null) {
			fareStationSetDefinitions = new EObjectContainmentEList<FareStationSetDefinition>(FareStationSetDefinition.class, this, GtmPackage.FARE_STATION_SET_DEFINITIONS__FARE_STATION_SET_DEFINITIONS);
		}
		return fareStationSetDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FareStationSetDefinition findFareSet(Carrier carrier, int legacyCode) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.FARE_STATION_SET_DEFINITIONS__FARE_STATION_SET_DEFINITIONS:
				return ((InternalEList<?>)getFareStationSetDefinitions()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.FARE_STATION_SET_DEFINITIONS__FARE_STATION_SET_DEFINITIONS:
				return getFareStationSetDefinitions();
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
			case GtmPackage.FARE_STATION_SET_DEFINITIONS__FARE_STATION_SET_DEFINITIONS:
				getFareStationSetDefinitions().clear();
				getFareStationSetDefinitions().addAll((Collection<? extends FareStationSetDefinition>)newValue);
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
			case GtmPackage.FARE_STATION_SET_DEFINITIONS__FARE_STATION_SET_DEFINITIONS:
				getFareStationSetDefinitions().clear();
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
			case GtmPackage.FARE_STATION_SET_DEFINITIONS__FARE_STATION_SET_DEFINITIONS:
				return fareStationSetDefinitions != null && !fareStationSetDefinitions.isEmpty();
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
			case GtmPackage.FARE_STATION_SET_DEFINITIONS___FIND_FARE_SET__CARRIER_INT:
				return findFareSet((Carrier)arguments.get(0), (Integer)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //FareStationSetDefinitionsImpl
