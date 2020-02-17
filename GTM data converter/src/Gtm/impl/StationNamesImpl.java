/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.Station;
import Gtm.StationNames;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Station Names</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.StationNamesImpl#getStationName <em>Station Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StationNamesImpl extends MinimalEObjectImpl.Container implements StationNames {
	/**
	 * The cached value of the '{@link #getStationName() <em>Station Name</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStationName()
	 * @generated
	 * @ordered
	 */
	protected EList<Station> stationName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StationNamesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.STATION_NAMES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Station> getStationName() {
		if (stationName == null) {
			stationName = new EObjectResolvingEList<Station>(Station.class, this, GtmPackage.STATION_NAMES__STATION_NAME);
		}
		return stationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.STATION_NAMES__STATION_NAME:
				return getStationName();
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
			case GtmPackage.STATION_NAMES__STATION_NAME:
				getStationName().clear();
				getStationName().addAll((Collection<? extends Station>)newValue);
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
			case GtmPackage.STATION_NAMES__STATION_NAME:
				getStationName().clear();
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
			case GtmPackage.STATION_NAMES__STATION_NAME:
				return stationName != null && !stationName.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StationNamesImpl
