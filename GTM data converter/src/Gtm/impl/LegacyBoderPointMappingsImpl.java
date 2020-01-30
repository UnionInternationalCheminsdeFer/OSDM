/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.LegacyBoderPointMappings;
import Gtm.LegacyBorderPointMapping;

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
 * An implementation of the model object '<em><b>Legacy Boder Point Mappings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.LegacyBoderPointMappingsImpl#getBorderPoints <em>Border Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegacyBoderPointMappingsImpl extends MinimalEObjectImpl.Container implements LegacyBoderPointMappings {
	/**
	 * The cached value of the '{@link #getBorderPoints() <em>Border Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<LegacyBorderPointMapping> borderPoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyBoderPointMappingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LEGACY_BODER_POINT_MAPPINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LegacyBorderPointMapping> getBorderPoints() {
		if (borderPoints == null) {
			borderPoints = new EObjectContainmentEList<LegacyBorderPointMapping>(LegacyBorderPointMapping.class, this, GtmPackage.LEGACY_BODER_POINT_MAPPINGS__BORDER_POINTS);
		}
		return borderPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyBorderPointMapping getMappingByBorderPointCode(int borderPointCode) {
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
			case GtmPackage.LEGACY_BODER_POINT_MAPPINGS__BORDER_POINTS:
				return ((InternalEList<?>)getBorderPoints()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.LEGACY_BODER_POINT_MAPPINGS__BORDER_POINTS:
				return getBorderPoints();
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
			case GtmPackage.LEGACY_BODER_POINT_MAPPINGS__BORDER_POINTS:
				getBorderPoints().clear();
				getBorderPoints().addAll((Collection<? extends LegacyBorderPointMapping>)newValue);
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
			case GtmPackage.LEGACY_BODER_POINT_MAPPINGS__BORDER_POINTS:
				getBorderPoints().clear();
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
			case GtmPackage.LEGACY_BODER_POINT_MAPPINGS__BORDER_POINTS:
				return borderPoints != null && !borderPoints.isEmpty();
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
			case GtmPackage.LEGACY_BODER_POINT_MAPPINGS___GET_MAPPING_BY_BORDER_POINT_CODE__INT:
				return getMappingByBorderPointCode((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //LegacyBoderPointMappingsImpl
