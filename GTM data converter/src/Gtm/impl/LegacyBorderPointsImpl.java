/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.LegacyBorderPoint;
import Gtm.LegacyBorderPoints;

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
 * An implementation of the model object '<em><b>Legacy Border Points</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.LegacyBorderPointsImpl#getLegacyBorderPoints <em>Legacy Border Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegacyBorderPointsImpl extends MinimalEObjectImpl.Container implements LegacyBorderPoints {
	/**
	 * The cached value of the '{@link #getLegacyBorderPoints() <em>Legacy Border Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyBorderPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<LegacyBorderPoint> legacyBorderPoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyBorderPointsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LEGACY_BORDER_POINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LegacyBorderPoint> getLegacyBorderPoints() {
		if (legacyBorderPoints == null) {
			legacyBorderPoints = new EObjectContainmentEList<LegacyBorderPoint>(LegacyBorderPoint.class, this, GtmPackage.LEGACY_BORDER_POINTS__LEGACY_BORDER_POINTS);
		}
		return legacyBorderPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.LEGACY_BORDER_POINTS__LEGACY_BORDER_POINTS:
				return ((InternalEList<?>)getLegacyBorderPoints()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.LEGACY_BORDER_POINTS__LEGACY_BORDER_POINTS:
				return getLegacyBorderPoints();
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
			case GtmPackage.LEGACY_BORDER_POINTS__LEGACY_BORDER_POINTS:
				getLegacyBorderPoints().clear();
				getLegacyBorderPoints().addAll((Collection<? extends LegacyBorderPoint>)newValue);
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
			case GtmPackage.LEGACY_BORDER_POINTS__LEGACY_BORDER_POINTS:
				getLegacyBorderPoints().clear();
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
			case GtmPackage.LEGACY_BORDER_POINTS__LEGACY_BORDER_POINTS:
				return legacyBorderPoints != null && !legacyBorderPoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LegacyBorderPointsImpl
