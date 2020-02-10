/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.IncludedFreePassengers;
import Gtm.PassengerCombinationConstraint;
import Gtm.PassengerConstraint;
import Gtm.Text;

import Gtm.TravelerType;
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
 * An implementation of the model object '<em><b>Passenger Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.PassengerConstraintImpl#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.impl.PassengerConstraintImpl#getTravelerType <em>Traveler Type</em>}</li>
 *   <li>{@link Gtm.impl.PassengerConstraintImpl#getText <em>Text</em>}</li>
 *   <li>{@link Gtm.impl.PassengerConstraintImpl#getUpperAgeLimit <em>Upper Age Limit</em>}</li>
 *   <li>{@link Gtm.impl.PassengerConstraintImpl#getLowerAgeLimit <em>Lower Age Limit</em>}</li>
 *   <li>{@link Gtm.impl.PassengerConstraintImpl#getTravelAloneAgeLimit <em>Travel Alone Age Limit</em>}</li>
 *   <li>{@link Gtm.impl.PassengerConstraintImpl#getReservationAgeLimit <em>Reservation Age Limit</em>}</li>
 *   <li>{@link Gtm.impl.PassengerConstraintImpl#isIsAncilliary <em>Is Ancilliary</em>}</li>
 *   <li>{@link Gtm.impl.PassengerConstraintImpl#getPassengerWeight <em>Passenger Weight</em>}</li>
 *   <li>{@link Gtm.impl.PassengerConstraintImpl#getMaxTotalPassengerWeight <em>Max Total Passenger Weight</em>}</li>
 *   <li>{@link Gtm.impl.PassengerConstraintImpl#getMinTotalPassengerWeight <em>Min Total Passenger Weight</em>}</li>
 *   <li>{@link Gtm.impl.PassengerConstraintImpl#getIncludedFreePassengers <em>Included Free Passengers</em>}</li>
 *   <li>{@link Gtm.impl.PassengerConstraintImpl#getExcludedPassengerCombinations <em>Excluded Passenger Combinations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PassengerConstraintImpl extends MinimalEObjectImpl.Container implements PassengerConstraint {
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
	 * The default value of the '{@link #getTravelerType() <em>Traveler Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelerType()
	 * @generated
	 * @ordered
	 */
	protected static final TravelerType TRAVELER_TYPE_EDEFAULT = TravelerType.ADULT;

	/**
	 * The cached value of the '{@link #getTravelerType() <em>Traveler Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelerType()
	 * @generated
	 * @ordered
	 */
	protected TravelerType travelerType = TRAVELER_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected Text text;

	/**
	 * The default value of the '{@link #getUpperAgeLimit() <em>Upper Age Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperAgeLimit()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_AGE_LIMIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUpperAgeLimit() <em>Upper Age Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperAgeLimit()
	 * @generated
	 * @ordered
	 */
	protected int upperAgeLimit = UPPER_AGE_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerAgeLimit() <em>Lower Age Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerAgeLimit()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_AGE_LIMIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLowerAgeLimit() <em>Lower Age Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerAgeLimit()
	 * @generated
	 * @ordered
	 */
	protected int lowerAgeLimit = LOWER_AGE_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTravelAloneAgeLimit() <em>Travel Alone Age Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelAloneAgeLimit()
	 * @generated
	 * @ordered
	 */
	protected static final int TRAVEL_ALONE_AGE_LIMIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTravelAloneAgeLimit() <em>Travel Alone Age Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelAloneAgeLimit()
	 * @generated
	 * @ordered
	 */
	protected int travelAloneAgeLimit = TRAVEL_ALONE_AGE_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getReservationAgeLimit() <em>Reservation Age Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservationAgeLimit()
	 * @generated
	 * @ordered
	 */
	protected static final int RESERVATION_AGE_LIMIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReservationAgeLimit() <em>Reservation Age Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservationAgeLimit()
	 * @generated
	 * @ordered
	 */
	protected int reservationAgeLimit = RESERVATION_AGE_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAncilliary() <em>Is Ancilliary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAncilliary()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ANCILLIARY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAncilliary() <em>Is Ancilliary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAncilliary()
	 * @generated
	 * @ordered
	 */
	protected boolean isAncilliary = IS_ANCILLIARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerWeight() <em>Passenger Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerWeight()
	 * @generated
	 * @ordered
	 */
	protected static final float PASSENGER_WEIGHT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPassengerWeight() <em>Passenger Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerWeight()
	 * @generated
	 * @ordered
	 */
	protected float passengerWeight = PASSENGER_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxTotalPassengerWeight() <em>Max Total Passenger Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTotalPassengerWeight()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_TOTAL_PASSENGER_WEIGHT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxTotalPassengerWeight() <em>Max Total Passenger Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTotalPassengerWeight()
	 * @generated
	 * @ordered
	 */
	protected float maxTotalPassengerWeight = MAX_TOTAL_PASSENGER_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinTotalPassengerWeight() <em>Min Total Passenger Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTotalPassengerWeight()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_TOTAL_PASSENGER_WEIGHT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinTotalPassengerWeight() <em>Min Total Passenger Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTotalPassengerWeight()
	 * @generated
	 * @ordered
	 */
	protected float minTotalPassengerWeight = MIN_TOTAL_PASSENGER_WEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncludedFreePassengers() <em>Included Free Passengers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludedFreePassengers()
	 * @generated
	 * @ordered
	 */
	protected IncludedFreePassengers includedFreePassengers;

	/**
	 * The cached value of the '{@link #getExcludedPassengerCombinations() <em>Excluded Passenger Combinations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludedPassengerCombinations()
	 * @generated
	 * @ordered
	 */
	protected EList<PassengerCombinationConstraint> excludedPassengerCombinations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassengerConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.PASSENGER_CONSTRAINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.PASSENGER_CONSTRAINT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelerType getTravelerType() {
		return travelerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTravelerType(TravelerType newTravelerType) {
		TravelerType oldTravelerType = travelerType;
		travelerType = newTravelerType == null ? TRAVELER_TYPE_EDEFAULT : newTravelerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.PASSENGER_CONSTRAINT__TRAVELER_TYPE, oldTravelerType, travelerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text getText() {
		if (text != null && text.eIsProxy()) {
			InternalEObject oldText = (InternalEObject)text;
			text = (Text)eResolveProxy(oldText);
			if (text != oldText) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.PASSENGER_CONSTRAINT__TEXT, oldText, text));
			}
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text basicGetText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(Text newText) {
		Text oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.PASSENGER_CONSTRAINT__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpperAgeLimit() {
		return upperAgeLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperAgeLimit(int newUpperAgeLimit) {
		int oldUpperAgeLimit = upperAgeLimit;
		upperAgeLimit = newUpperAgeLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.PASSENGER_CONSTRAINT__UPPER_AGE_LIMIT, oldUpperAgeLimit, upperAgeLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLowerAgeLimit() {
		return lowerAgeLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerAgeLimit(int newLowerAgeLimit) {
		int oldLowerAgeLimit = lowerAgeLimit;
		lowerAgeLimit = newLowerAgeLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.PASSENGER_CONSTRAINT__LOWER_AGE_LIMIT, oldLowerAgeLimit, lowerAgeLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTravelAloneAgeLimit() {
		return travelAloneAgeLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTravelAloneAgeLimit(int newTravelAloneAgeLimit) {
		int oldTravelAloneAgeLimit = travelAloneAgeLimit;
		travelAloneAgeLimit = newTravelAloneAgeLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.PASSENGER_CONSTRAINT__TRAVEL_ALONE_AGE_LIMIT, oldTravelAloneAgeLimit, travelAloneAgeLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReservationAgeLimit() {
		return reservationAgeLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservationAgeLimit(int newReservationAgeLimit) {
		int oldReservationAgeLimit = reservationAgeLimit;
		reservationAgeLimit = newReservationAgeLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.PASSENGER_CONSTRAINT__RESERVATION_AGE_LIMIT, oldReservationAgeLimit, reservationAgeLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAncilliary() {
		return isAncilliary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAncilliary(boolean newIsAncilliary) {
		boolean oldIsAncilliary = isAncilliary;
		isAncilliary = newIsAncilliary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.PASSENGER_CONSTRAINT__IS_ANCILLIARY, oldIsAncilliary, isAncilliary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPassengerWeight() {
		return passengerWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerWeight(float newPassengerWeight) {
		float oldPassengerWeight = passengerWeight;
		passengerWeight = newPassengerWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.PASSENGER_CONSTRAINT__PASSENGER_WEIGHT, oldPassengerWeight, passengerWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxTotalPassengerWeight() {
		return maxTotalPassengerWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxTotalPassengerWeight(float newMaxTotalPassengerWeight) {
		float oldMaxTotalPassengerWeight = maxTotalPassengerWeight;
		maxTotalPassengerWeight = newMaxTotalPassengerWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.PASSENGER_CONSTRAINT__MAX_TOTAL_PASSENGER_WEIGHT, oldMaxTotalPassengerWeight, maxTotalPassengerWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinTotalPassengerWeight() {
		return minTotalPassengerWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinTotalPassengerWeight(float newMinTotalPassengerWeight) {
		float oldMinTotalPassengerWeight = minTotalPassengerWeight;
		minTotalPassengerWeight = newMinTotalPassengerWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.PASSENGER_CONSTRAINT__MIN_TOTAL_PASSENGER_WEIGHT, oldMinTotalPassengerWeight, minTotalPassengerWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludedFreePassengers getIncludedFreePassengers() {
		return includedFreePassengers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncludedFreePassengers(IncludedFreePassengers newIncludedFreePassengers, NotificationChain msgs) {
		IncludedFreePassengers oldIncludedFreePassengers = includedFreePassengers;
		includedFreePassengers = newIncludedFreePassengers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.PASSENGER_CONSTRAINT__INCLUDED_FREE_PASSENGERS, oldIncludedFreePassengers, newIncludedFreePassengers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludedFreePassengers(IncludedFreePassengers newIncludedFreePassengers) {
		if (newIncludedFreePassengers != includedFreePassengers) {
			NotificationChain msgs = null;
			if (includedFreePassengers != null)
				msgs = ((InternalEObject)includedFreePassengers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.PASSENGER_CONSTRAINT__INCLUDED_FREE_PASSENGERS, null, msgs);
			if (newIncludedFreePassengers != null)
				msgs = ((InternalEObject)newIncludedFreePassengers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.PASSENGER_CONSTRAINT__INCLUDED_FREE_PASSENGERS, null, msgs);
			msgs = basicSetIncludedFreePassengers(newIncludedFreePassengers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.PASSENGER_CONSTRAINT__INCLUDED_FREE_PASSENGERS, newIncludedFreePassengers, newIncludedFreePassengers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PassengerCombinationConstraint> getExcludedPassengerCombinations() {
		if (excludedPassengerCombinations == null) {
			excludedPassengerCombinations = new EObjectContainmentEList<PassengerCombinationConstraint>(PassengerCombinationConstraint.class, this, GtmPackage.PASSENGER_CONSTRAINT__EXCLUDED_PASSENGER_COMBINATIONS);
		}
		return excludedPassengerCombinations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.PASSENGER_CONSTRAINT__INCLUDED_FREE_PASSENGERS:
				return basicSetIncludedFreePassengers(null, msgs);
			case GtmPackage.PASSENGER_CONSTRAINT__EXCLUDED_PASSENGER_COMBINATIONS:
				return ((InternalEList<?>)getExcludedPassengerCombinations()).basicRemove(otherEnd, msgs);
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
			case GtmPackage.PASSENGER_CONSTRAINT__ID:
				return getId();
			case GtmPackage.PASSENGER_CONSTRAINT__TRAVELER_TYPE:
				return getTravelerType();
			case GtmPackage.PASSENGER_CONSTRAINT__TEXT:
				if (resolve) return getText();
				return basicGetText();
			case GtmPackage.PASSENGER_CONSTRAINT__UPPER_AGE_LIMIT:
				return getUpperAgeLimit();
			case GtmPackage.PASSENGER_CONSTRAINT__LOWER_AGE_LIMIT:
				return getLowerAgeLimit();
			case GtmPackage.PASSENGER_CONSTRAINT__TRAVEL_ALONE_AGE_LIMIT:
				return getTravelAloneAgeLimit();
			case GtmPackage.PASSENGER_CONSTRAINT__RESERVATION_AGE_LIMIT:
				return getReservationAgeLimit();
			case GtmPackage.PASSENGER_CONSTRAINT__IS_ANCILLIARY:
				return isIsAncilliary();
			case GtmPackage.PASSENGER_CONSTRAINT__PASSENGER_WEIGHT:
				return getPassengerWeight();
			case GtmPackage.PASSENGER_CONSTRAINT__MAX_TOTAL_PASSENGER_WEIGHT:
				return getMaxTotalPassengerWeight();
			case GtmPackage.PASSENGER_CONSTRAINT__MIN_TOTAL_PASSENGER_WEIGHT:
				return getMinTotalPassengerWeight();
			case GtmPackage.PASSENGER_CONSTRAINT__INCLUDED_FREE_PASSENGERS:
				return getIncludedFreePassengers();
			case GtmPackage.PASSENGER_CONSTRAINT__EXCLUDED_PASSENGER_COMBINATIONS:
				return getExcludedPassengerCombinations();
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
			case GtmPackage.PASSENGER_CONSTRAINT__ID:
				setId((String)newValue);
				return;
			case GtmPackage.PASSENGER_CONSTRAINT__TRAVELER_TYPE:
				setTravelerType((TravelerType)newValue);
				return;
			case GtmPackage.PASSENGER_CONSTRAINT__TEXT:
				setText((Text)newValue);
				return;
			case GtmPackage.PASSENGER_CONSTRAINT__UPPER_AGE_LIMIT:
				setUpperAgeLimit((Integer)newValue);
				return;
			case GtmPackage.PASSENGER_CONSTRAINT__LOWER_AGE_LIMIT:
				setLowerAgeLimit((Integer)newValue);
				return;
			case GtmPackage.PASSENGER_CONSTRAINT__TRAVEL_ALONE_AGE_LIMIT:
				setTravelAloneAgeLimit((Integer)newValue);
				return;
			case GtmPackage.PASSENGER_CONSTRAINT__RESERVATION_AGE_LIMIT:
				setReservationAgeLimit((Integer)newValue);
				return;
			case GtmPackage.PASSENGER_CONSTRAINT__IS_ANCILLIARY:
				setIsAncilliary((Boolean)newValue);
				return;
			case GtmPackage.PASSENGER_CONSTRAINT__PASSENGER_WEIGHT:
				setPassengerWeight((Float)newValue);
				return;
			case GtmPackage.PASSENGER_CONSTRAINT__MAX_TOTAL_PASSENGER_WEIGHT:
				setMaxTotalPassengerWeight((Float)newValue);
				return;
			case GtmPackage.PASSENGER_CONSTRAINT__MIN_TOTAL_PASSENGER_WEIGHT:
				setMinTotalPassengerWeight((Float)newValue);
				return;
			case GtmPackage.PASSENGER_CONSTRAINT__INCLUDED_FREE_PASSENGERS:
				setIncludedFreePassengers((IncludedFreePassengers)newValue);
				return;
			case GtmPackage.PASSENGER_CONSTRAINT__EXCLUDED_PASSENGER_COMBINATIONS:
				getExcludedPassengerCombinations().clear();
				getExcludedPassengerCombinations().addAll((Collection<? extends PassengerCombinationConstraint>)newValue);
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
			case GtmPackage.PASSENGER_CONSTRAINT__ID:
				setId(ID_EDEFAULT);
				return;
			case GtmPackage.PASSENGER_CONSTRAINT__TRAVELER_TYPE:
				setTravelerType(TRAVELER_TYPE_EDEFAULT);
				return;
			case GtmPackage.PASSENGER_CONSTRAINT__TEXT:
				setText((Text)null);
				return;
			case GtmPackage.PASSENGER_CONSTRAINT__UPPER_AGE_LIMIT:
				setUpperAgeLimit(UPPER_AGE_LIMIT_EDEFAULT);
				return;
			case GtmPackage.PASSENGER_CONSTRAINT__LOWER_AGE_LIMIT:
				setLowerAgeLimit(LOWER_AGE_LIMIT_EDEFAULT);
				return;
			case GtmPackage.PASSENGER_CONSTRAINT__TRAVEL_ALONE_AGE_LIMIT:
				setTravelAloneAgeLimit(TRAVEL_ALONE_AGE_LIMIT_EDEFAULT);
				return;
			case GtmPackage.PASSENGER_CONSTRAINT__RESERVATION_AGE_LIMIT:
				setReservationAgeLimit(RESERVATION_AGE_LIMIT_EDEFAULT);
				return;
			case GtmPackage.PASSENGER_CONSTRAINT__IS_ANCILLIARY:
				setIsAncilliary(IS_ANCILLIARY_EDEFAULT);
				return;
			case GtmPackage.PASSENGER_CONSTRAINT__PASSENGER_WEIGHT:
				setPassengerWeight(PASSENGER_WEIGHT_EDEFAULT);
				return;
			case GtmPackage.PASSENGER_CONSTRAINT__MAX_TOTAL_PASSENGER_WEIGHT:
				setMaxTotalPassengerWeight(MAX_TOTAL_PASSENGER_WEIGHT_EDEFAULT);
				return;
			case GtmPackage.PASSENGER_CONSTRAINT__MIN_TOTAL_PASSENGER_WEIGHT:
				setMinTotalPassengerWeight(MIN_TOTAL_PASSENGER_WEIGHT_EDEFAULT);
				return;
			case GtmPackage.PASSENGER_CONSTRAINT__INCLUDED_FREE_PASSENGERS:
				setIncludedFreePassengers((IncludedFreePassengers)null);
				return;
			case GtmPackage.PASSENGER_CONSTRAINT__EXCLUDED_PASSENGER_COMBINATIONS:
				getExcludedPassengerCombinations().clear();
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
			case GtmPackage.PASSENGER_CONSTRAINT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GtmPackage.PASSENGER_CONSTRAINT__TRAVELER_TYPE:
				return travelerType != TRAVELER_TYPE_EDEFAULT;
			case GtmPackage.PASSENGER_CONSTRAINT__TEXT:
				return text != null;
			case GtmPackage.PASSENGER_CONSTRAINT__UPPER_AGE_LIMIT:
				return upperAgeLimit != UPPER_AGE_LIMIT_EDEFAULT;
			case GtmPackage.PASSENGER_CONSTRAINT__LOWER_AGE_LIMIT:
				return lowerAgeLimit != LOWER_AGE_LIMIT_EDEFAULT;
			case GtmPackage.PASSENGER_CONSTRAINT__TRAVEL_ALONE_AGE_LIMIT:
				return travelAloneAgeLimit != TRAVEL_ALONE_AGE_LIMIT_EDEFAULT;
			case GtmPackage.PASSENGER_CONSTRAINT__RESERVATION_AGE_LIMIT:
				return reservationAgeLimit != RESERVATION_AGE_LIMIT_EDEFAULT;
			case GtmPackage.PASSENGER_CONSTRAINT__IS_ANCILLIARY:
				return isAncilliary != IS_ANCILLIARY_EDEFAULT;
			case GtmPackage.PASSENGER_CONSTRAINT__PASSENGER_WEIGHT:
				return passengerWeight != PASSENGER_WEIGHT_EDEFAULT;
			case GtmPackage.PASSENGER_CONSTRAINT__MAX_TOTAL_PASSENGER_WEIGHT:
				return maxTotalPassengerWeight != MAX_TOTAL_PASSENGER_WEIGHT_EDEFAULT;
			case GtmPackage.PASSENGER_CONSTRAINT__MIN_TOTAL_PASSENGER_WEIGHT:
				return minTotalPassengerWeight != MIN_TOTAL_PASSENGER_WEIGHT_EDEFAULT;
			case GtmPackage.PASSENGER_CONSTRAINT__INCLUDED_FREE_PASSENGERS:
				return includedFreePassengers != null;
			case GtmPackage.PASSENGER_CONSTRAINT__EXCLUDED_PASSENGER_COMBINATIONS:
				return excludedPassengerCombinations != null && !excludedPassengerCombinations.isEmpty();
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
		result.append(", travelerType: ");
		result.append(travelerType);
		result.append(", upperAgeLimit: ");
		result.append(upperAgeLimit);
		result.append(", lowerAgeLimit: ");
		result.append(lowerAgeLimit);
		result.append(", travelAloneAgeLimit: ");
		result.append(travelAloneAgeLimit);
		result.append(", reservationAgeLimit: ");
		result.append(reservationAgeLimit);
		result.append(", isAncilliary: ");
		result.append(isAncilliary);
		result.append(", passengerWeight: ");
		result.append(passengerWeight);
		result.append(", maxTotalPassengerWeight: ");
		result.append(maxTotalPassengerWeight);
		result.append(", minTotalPassengerWeight: ");
		result.append(minTotalPassengerWeight);
		result.append(')');
		return result.toString();
	}

} //PassengerConstraintImpl
