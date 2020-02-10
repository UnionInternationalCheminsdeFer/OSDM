/**
 */
package Gtm.impl;

import Gtm.GraphicalReservationType;
import Gtm.GtmPackage;
import Gtm.ReservationOptions;
import Gtm.ReservationPreferenceGroup;
import Gtm.ServiceBrand;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reservation Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.ReservationOptionsImpl#getPreferences <em>Preferences</em>}</li>
 *   <li>{@link Gtm.impl.ReservationOptionsImpl#getServiceBrands <em>Service Brands</em>}</li>
 *   <li>{@link Gtm.impl.ReservationOptionsImpl#getGraphicalReservation <em>Graphical Reservation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReservationOptionsImpl extends MinimalEObjectImpl.Container implements ReservationOptions {
	/**
	 * The cached value of the '{@link #getPreferences() <em>Preferences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferences()
	 * @generated
	 * @ordered
	 */
	protected EList<ReservationPreferenceGroup> preferences;

	/**
	 * The cached value of the '{@link #getServiceBrands() <em>Service Brands</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceBrands()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceBrand> serviceBrands;

	/**
	 * The default value of the '{@link #getGraphicalReservation() <em>Graphical Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphicalReservation()
	 * @generated
	 * @ordered
	 */
	protected static final GraphicalReservationType GRAPHICAL_RESERVATION_EDEFAULT = GraphicalReservationType.IRS90918_1;

	/**
	 * The cached value of the '{@link #getGraphicalReservation() <em>Graphical Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphicalReservation()
	 * @generated
	 * @ordered
	 */
	protected GraphicalReservationType graphicalReservation = GRAPHICAL_RESERVATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReservationOptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.RESERVATION_OPTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReservationPreferenceGroup> getPreferences() {
		if (preferences == null) {
			preferences = new EObjectContainmentEList<ReservationPreferenceGroup>(ReservationPreferenceGroup.class, this, GtmPackage.RESERVATION_OPTIONS__PREFERENCES);
		}
		return preferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceBrand> getServiceBrands() {
		if (serviceBrands == null) {
			serviceBrands = new EObjectResolvingEList<ServiceBrand>(ServiceBrand.class, this, GtmPackage.RESERVATION_OPTIONS__SERVICE_BRANDS);
		}
		return serviceBrands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalReservationType getGraphicalReservation() {
		return graphicalReservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphicalReservation(GraphicalReservationType newGraphicalReservation) {
		GraphicalReservationType oldGraphicalReservation = graphicalReservation;
		graphicalReservation = newGraphicalReservation == null ? GRAPHICAL_RESERVATION_EDEFAULT : newGraphicalReservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.RESERVATION_OPTIONS__GRAPHICAL_RESERVATION, oldGraphicalReservation, graphicalReservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.RESERVATION_OPTIONS__PREFERENCES:
				return ((InternalEList<?>)getPreferences()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.RESERVATION_OPTIONS__PREFERENCES:
				return getPreferences();
			case GtmPackage.RESERVATION_OPTIONS__SERVICE_BRANDS:
				return getServiceBrands();
			case GtmPackage.RESERVATION_OPTIONS__GRAPHICAL_RESERVATION:
				return getGraphicalReservation();
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
			case GtmPackage.RESERVATION_OPTIONS__PREFERENCES:
				getPreferences().clear();
				getPreferences().addAll((Collection<? extends ReservationPreferenceGroup>)newValue);
				return;
			case GtmPackage.RESERVATION_OPTIONS__SERVICE_BRANDS:
				getServiceBrands().clear();
				getServiceBrands().addAll((Collection<? extends ServiceBrand>)newValue);
				return;
			case GtmPackage.RESERVATION_OPTIONS__GRAPHICAL_RESERVATION:
				setGraphicalReservation((GraphicalReservationType)newValue);
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
			case GtmPackage.RESERVATION_OPTIONS__PREFERENCES:
				getPreferences().clear();
				return;
			case GtmPackage.RESERVATION_OPTIONS__SERVICE_BRANDS:
				getServiceBrands().clear();
				return;
			case GtmPackage.RESERVATION_OPTIONS__GRAPHICAL_RESERVATION:
				setGraphicalReservation(GRAPHICAL_RESERVATION_EDEFAULT);
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
			case GtmPackage.RESERVATION_OPTIONS__PREFERENCES:
				return preferences != null && !preferences.isEmpty();
			case GtmPackage.RESERVATION_OPTIONS__SERVICE_BRANDS:
				return serviceBrands != null && !serviceBrands.isEmpty();
			case GtmPackage.RESERVATION_OPTIONS__GRAPHICAL_RESERVATION:
				return graphicalReservation != GRAPHICAL_RESERVATION_EDEFAULT;
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
		result.append(" (graphicalReservation: ");
		result.append(graphicalReservation);
		result.append(')');
		return result.toString();
	}

} //ReservationOptionsImpl
