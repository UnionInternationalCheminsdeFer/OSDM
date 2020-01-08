/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.Line;
import Gtm.Polygone;
import Gtm.RegionalValidity;
import Gtm.ViaStation;
import Gtm.Zone;

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
 * An implementation of the model object '<em><b>Regional Validity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.RegionalValidityImpl#getSeqNb <em>Seq Nb</em>}</li>
 *   <li>{@link Gtm.impl.RegionalValidityImpl#getViaStation <em>Via Station</em>}</li>
 *   <li>{@link Gtm.impl.RegionalValidityImpl#getZone <em>Zone</em>}</li>
 *   <li>{@link Gtm.impl.RegionalValidityImpl#getLine <em>Line</em>}</li>
 *   <li>{@link Gtm.impl.RegionalValidityImpl#getPolygone <em>Polygone</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegionalValidityImpl extends MinimalEObjectImpl.Container implements RegionalValidity {
	/**
	 * The default value of the '{@link #getSeqNb() <em>Seq Nb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeqNb()
	 * @generated
	 * @ordered
	 */
	protected static final int SEQ_NB_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeqNb() <em>Seq Nb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeqNb()
	 * @generated
	 * @ordered
	 */
	protected int seqNb = SEQ_NB_EDEFAULT;

	/**
	 * The cached value of the '{@link #getViaStation() <em>Via Station</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViaStation()
	 * @generated
	 * @ordered
	 */
	protected EList<ViaStation> viaStation;

	/**
	 * The cached value of the '{@link #getZone() <em>Zone</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZone()
	 * @generated
	 * @ordered
	 */
	protected EList<Zone> zone;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected EList<Line> line;

	/**
	 * The cached value of the '{@link #getPolygone() <em>Polygone</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolygone()
	 * @generated
	 * @ordered
	 */
	protected EList<Polygone> polygone;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionalValidityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.REGIONAL_VALIDITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeqNb() {
		return seqNb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeqNb(int newSeqNb) {
		int oldSeqNb = seqNb;
		seqNb = newSeqNb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.REGIONAL_VALIDITY__SEQ_NB, oldSeqNb, seqNb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViaStation> getViaStation() {
		if (viaStation == null) {
			viaStation = new EObjectResolvingEList<ViaStation>(ViaStation.class, this, GtmPackage.REGIONAL_VALIDITY__VIA_STATION);
		}
		return viaStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Zone> getZone() {
		if (zone == null) {
			zone = new EObjectResolvingEList<Zone>(Zone.class, this, GtmPackage.REGIONAL_VALIDITY__ZONE);
		}
		return zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Line> getLine() {
		if (line == null) {
			line = new EObjectContainmentEList<Line>(Line.class, this, GtmPackage.REGIONAL_VALIDITY__LINE);
		}
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Polygone> getPolygone() {
		if (polygone == null) {
			polygone = new EObjectContainmentEList<Polygone>(Polygone.class, this, GtmPackage.REGIONAL_VALIDITY__POLYGONE);
		}
		return polygone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.REGIONAL_VALIDITY__LINE:
				return ((InternalEList<?>)getLine()).basicRemove(otherEnd, msgs);
			case GtmPackage.REGIONAL_VALIDITY__POLYGONE:
				return ((InternalEList<?>)getPolygone()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.REGIONAL_VALIDITY__SEQ_NB:
				return getSeqNb();
			case GtmPackage.REGIONAL_VALIDITY__VIA_STATION:
				return getViaStation();
			case GtmPackage.REGIONAL_VALIDITY__ZONE:
				return getZone();
			case GtmPackage.REGIONAL_VALIDITY__LINE:
				return getLine();
			case GtmPackage.REGIONAL_VALIDITY__POLYGONE:
				return getPolygone();
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
			case GtmPackage.REGIONAL_VALIDITY__SEQ_NB:
				setSeqNb((Integer)newValue);
				return;
			case GtmPackage.REGIONAL_VALIDITY__VIA_STATION:
				getViaStation().clear();
				getViaStation().addAll((Collection<? extends ViaStation>)newValue);
				return;
			case GtmPackage.REGIONAL_VALIDITY__ZONE:
				getZone().clear();
				getZone().addAll((Collection<? extends Zone>)newValue);
				return;
			case GtmPackage.REGIONAL_VALIDITY__LINE:
				getLine().clear();
				getLine().addAll((Collection<? extends Line>)newValue);
				return;
			case GtmPackage.REGIONAL_VALIDITY__POLYGONE:
				getPolygone().clear();
				getPolygone().addAll((Collection<? extends Polygone>)newValue);
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
			case GtmPackage.REGIONAL_VALIDITY__SEQ_NB:
				setSeqNb(SEQ_NB_EDEFAULT);
				return;
			case GtmPackage.REGIONAL_VALIDITY__VIA_STATION:
				getViaStation().clear();
				return;
			case GtmPackage.REGIONAL_VALIDITY__ZONE:
				getZone().clear();
				return;
			case GtmPackage.REGIONAL_VALIDITY__LINE:
				getLine().clear();
				return;
			case GtmPackage.REGIONAL_VALIDITY__POLYGONE:
				getPolygone().clear();
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
			case GtmPackage.REGIONAL_VALIDITY__SEQ_NB:
				return seqNb != SEQ_NB_EDEFAULT;
			case GtmPackage.REGIONAL_VALIDITY__VIA_STATION:
				return viaStation != null && !viaStation.isEmpty();
			case GtmPackage.REGIONAL_VALIDITY__ZONE:
				return zone != null && !zone.isEmpty();
			case GtmPackage.REGIONAL_VALIDITY__LINE:
				return line != null && !line.isEmpty();
			case GtmPackage.REGIONAL_VALIDITY__POLYGONE:
				return polygone != null && !polygone.isEmpty();
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
		result.append(" (seqNb: ");
		result.append(seqNb);
		result.append(')');
		return result.toString();
	}

} //RegionalValidityImpl
