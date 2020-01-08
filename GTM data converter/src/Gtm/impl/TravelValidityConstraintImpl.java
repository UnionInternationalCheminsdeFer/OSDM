/**
 */
package Gtm.impl;

import Gtm.Calendar;
import Gtm.GtmPackage;
import Gtm.ReturnValidityConstraint;
import Gtm.TimeRangeScope;
import Gtm.TravelValidityConstraint;
import Gtm.ValidityRange;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Travel Validity Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.TravelValidityConstraintImpl#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.impl.TravelValidityConstraintImpl#getDataDescription <em>Data Description</em>}</li>
 *   <li>{@link Gtm.impl.TravelValidityConstraintImpl#getValidDays <em>Valid Days</em>}</li>
 *   <li>{@link Gtm.impl.TravelValidityConstraintImpl#getExcludedTimeRange <em>Excluded Time Range</em>}</li>
 *   <li>{@link Gtm.impl.TravelValidityConstraintImpl#getTravelDays <em>Travel Days</em>}</li>
 *   <li>{@link Gtm.impl.TravelValidityConstraintImpl#getRange <em>Range</em>}</li>
 *   <li>{@link Gtm.impl.TravelValidityConstraintImpl#getReturnConstraint <em>Return Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TravelValidityConstraintImpl extends MinimalEObjectImpl.Container implements TravelValidityConstraint {
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
	 * The default value of the '{@link #getDataDescription() <em>Data Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataDescription() <em>Data Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataDescription()
	 * @generated
	 * @ordered
	 */
	protected String dataDescription = DATA_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValidDays() <em>Valid Days</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidDays()
	 * @generated
	 * @ordered
	 */
	protected Calendar validDays;

	/**
	 * The default value of the '{@link #getExcludedTimeRange() <em>Excluded Time Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludedTimeRange()
	 * @generated
	 * @ordered
	 */
	protected static final TimeRangeScope EXCLUDED_TIME_RANGE_EDEFAULT = TimeRangeScope.START_OF_TRAVEL;

	/**
	 * The cached value of the '{@link #getExcludedTimeRange() <em>Excluded Time Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludedTimeRange()
	 * @generated
	 * @ordered
	 */
	protected TimeRangeScope excludedTimeRange = EXCLUDED_TIME_RANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTravelDays() <em>Travel Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelDays()
	 * @generated
	 * @ordered
	 */
	protected static final int TRAVEL_DAYS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTravelDays() <em>Travel Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelDays()
	 * @generated
	 * @ordered
	 */
	protected int travelDays = TRAVEL_DAYS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected ValidityRange range;

	/**
	 * The cached value of the '{@link #getReturnConstraint() <em>Return Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnConstraint()
	 * @generated
	 * @ordered
	 */
	protected ReturnValidityConstraint returnConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TravelValidityConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataDescription() {
		return dataDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataDescription(String newDataDescription) {
		String oldDataDescription = dataDescription;
		dataDescription = newDataDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__DATA_DESCRIPTION, oldDataDescription, dataDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendar getValidDays() {
		if (validDays != null && validDays.eIsProxy()) {
			InternalEObject oldValidDays = (InternalEObject)validDays;
			validDays = (Calendar)eResolveProxy(oldValidDays);
			if (validDays != oldValidDays) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__VALID_DAYS, oldValidDays, validDays));
			}
		}
		return validDays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendar basicGetValidDays() {
		return validDays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidDays(Calendar newValidDays) {
		Calendar oldValidDays = validDays;
		validDays = newValidDays;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__VALID_DAYS, oldValidDays, validDays));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeRangeScope getExcludedTimeRange() {
		return excludedTimeRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludedTimeRange(TimeRangeScope newExcludedTimeRange) {
		TimeRangeScope oldExcludedTimeRange = excludedTimeRange;
		excludedTimeRange = newExcludedTimeRange == null ? EXCLUDED_TIME_RANGE_EDEFAULT : newExcludedTimeRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__EXCLUDED_TIME_RANGE, oldExcludedTimeRange, excludedTimeRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTravelDays() {
		return travelDays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTravelDays(int newTravelDays) {
		int oldTravelDays = travelDays;
		travelDays = newTravelDays;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRAVEL_DAYS, oldTravelDays, travelDays));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidityRange getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(ValidityRange newRange, NotificationChain msgs) {
		ValidityRange oldRange = range;
		range = newRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RANGE, oldRange, newRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(ValidityRange newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RANGE, newRange, newRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnValidityConstraint getReturnConstraint() {
		return returnConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnConstraint(ReturnValidityConstraint newReturnConstraint, NotificationChain msgs) {
		ReturnValidityConstraint oldReturnConstraint = returnConstraint;
		returnConstraint = newReturnConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RETURN_CONSTRAINT, oldReturnConstraint, newReturnConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnConstraint(ReturnValidityConstraint newReturnConstraint) {
		if (newReturnConstraint != returnConstraint) {
			NotificationChain msgs = null;
			if (returnConstraint != null)
				msgs = ((InternalEObject)returnConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RETURN_CONSTRAINT, null, msgs);
			if (newReturnConstraint != null)
				msgs = ((InternalEObject)newReturnConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RETURN_CONSTRAINT, null, msgs);
			msgs = basicSetReturnConstraint(newReturnConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RETURN_CONSTRAINT, newReturnConstraint, newReturnConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RANGE:
				return basicSetRange(null, msgs);
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RETURN_CONSTRAINT:
				return basicSetReturnConstraint(null, msgs);
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
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__ID:
				return getId();
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__DATA_DESCRIPTION:
				return getDataDescription();
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__VALID_DAYS:
				if (resolve) return getValidDays();
				return basicGetValidDays();
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__EXCLUDED_TIME_RANGE:
				return getExcludedTimeRange();
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRAVEL_DAYS:
				return getTravelDays();
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RANGE:
				return getRange();
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RETURN_CONSTRAINT:
				return getReturnConstraint();
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
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__ID:
				setId((String)newValue);
				return;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__DATA_DESCRIPTION:
				setDataDescription((String)newValue);
				return;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__VALID_DAYS:
				setValidDays((Calendar)newValue);
				return;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__EXCLUDED_TIME_RANGE:
				setExcludedTimeRange((TimeRangeScope)newValue);
				return;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRAVEL_DAYS:
				setTravelDays((Integer)newValue);
				return;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RANGE:
				setRange((ValidityRange)newValue);
				return;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RETURN_CONSTRAINT:
				setReturnConstraint((ReturnValidityConstraint)newValue);
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
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__ID:
				setId(ID_EDEFAULT);
				return;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__DATA_DESCRIPTION:
				setDataDescription(DATA_DESCRIPTION_EDEFAULT);
				return;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__VALID_DAYS:
				setValidDays((Calendar)null);
				return;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__EXCLUDED_TIME_RANGE:
				setExcludedTimeRange(EXCLUDED_TIME_RANGE_EDEFAULT);
				return;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRAVEL_DAYS:
				setTravelDays(TRAVEL_DAYS_EDEFAULT);
				return;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RANGE:
				setRange((ValidityRange)null);
				return;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RETURN_CONSTRAINT:
				setReturnConstraint((ReturnValidityConstraint)null);
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
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__DATA_DESCRIPTION:
				return DATA_DESCRIPTION_EDEFAULT == null ? dataDescription != null : !DATA_DESCRIPTION_EDEFAULT.equals(dataDescription);
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__VALID_DAYS:
				return validDays != null;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__EXCLUDED_TIME_RANGE:
				return excludedTimeRange != EXCLUDED_TIME_RANGE_EDEFAULT;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__TRAVEL_DAYS:
				return travelDays != TRAVEL_DAYS_EDEFAULT;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RANGE:
				return range != null;
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT__RETURN_CONSTRAINT:
				return returnConstraint != null;
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
		result.append(", dataDescription: ");
		result.append(dataDescription);
		result.append(", excludedTimeRange: ");
		result.append(excludedTimeRange);
		result.append(", travelDays: ");
		result.append(travelDays);
		result.append(')');
		return result.toString();
	}

} //TravelValidityConstraintImpl
