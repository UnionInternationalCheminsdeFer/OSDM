/**
 */
package Gtm.impl;

import Gtm.Calendar;
import Gtm.GtmPackage;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calendar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.CalendarImpl#getName <em>Name</em>}</li>
 *   <li>{@link Gtm.impl.CalendarImpl#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.impl.CalendarImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link Gtm.impl.CalendarImpl#getUntilDate <em>Until Date</em>}</li>
 *   <li>{@link Gtm.impl.CalendarImpl#getUtcOffset <em>Utc Offset</em>}</li>
 *   <li>{@link Gtm.impl.CalendarImpl#getDates <em>Dates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalendarImpl extends MinimalEObjectImpl.Container implements Calendar {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUntilDate() <em>Until Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntilDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date UNTIL_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUntilDate() <em>Until Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntilDate()
	 * @generated
	 * @ordered
	 */
	protected Date untilDate = UNTIL_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUtcOffset() <em>Utc Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtcOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int UTC_OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUtcOffset() <em>Utc Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtcOffset()
	 * @generated
	 * @ordered
	 */
	protected int utcOffset = UTC_OFFSET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDates() <em>Dates</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDates()
	 * @generated
	 * @ordered
	 */
	protected EList<Date> dates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalendarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.CALENDAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CALENDAR__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CALENDAR__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromDate(Date newFromDate) {
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CALENDAR__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getUntilDate() {
		return untilDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUntilDate(Date newUntilDate) {
		Date oldUntilDate = untilDate;
		untilDate = newUntilDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CALENDAR__UNTIL_DATE, oldUntilDate, untilDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUtcOffset() {
		return utcOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtcOffset(int newUtcOffset) {
		int oldUtcOffset = utcOffset;
		utcOffset = newUtcOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CALENDAR__UTC_OFFSET, oldUtcOffset, utcOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Date> getDates() {
		if (dates == null) {
			dates = new EDataTypeUniqueEList<Date>(Date.class, this, GtmPackage.CALENDAR__DATES);
		}
		return dates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.CALENDAR__NAME:
				return getName();
			case GtmPackage.CALENDAR__ID:
				return getId();
			case GtmPackage.CALENDAR__FROM_DATE:
				return getFromDate();
			case GtmPackage.CALENDAR__UNTIL_DATE:
				return getUntilDate();
			case GtmPackage.CALENDAR__UTC_OFFSET:
				return getUtcOffset();
			case GtmPackage.CALENDAR__DATES:
				return getDates();
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
			case GtmPackage.CALENDAR__NAME:
				setName((String)newValue);
				return;
			case GtmPackage.CALENDAR__ID:
				setId((String)newValue);
				return;
			case GtmPackage.CALENDAR__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case GtmPackage.CALENDAR__UNTIL_DATE:
				setUntilDate((Date)newValue);
				return;
			case GtmPackage.CALENDAR__UTC_OFFSET:
				setUtcOffset((Integer)newValue);
				return;
			case GtmPackage.CALENDAR__DATES:
				getDates().clear();
				getDates().addAll((Collection<? extends Date>)newValue);
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
			case GtmPackage.CALENDAR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GtmPackage.CALENDAR__ID:
				setId(ID_EDEFAULT);
				return;
			case GtmPackage.CALENDAR__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case GtmPackage.CALENDAR__UNTIL_DATE:
				setUntilDate(UNTIL_DATE_EDEFAULT);
				return;
			case GtmPackage.CALENDAR__UTC_OFFSET:
				setUtcOffset(UTC_OFFSET_EDEFAULT);
				return;
			case GtmPackage.CALENDAR__DATES:
				getDates().clear();
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
			case GtmPackage.CALENDAR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GtmPackage.CALENDAR__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GtmPackage.CALENDAR__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case GtmPackage.CALENDAR__UNTIL_DATE:
				return UNTIL_DATE_EDEFAULT == null ? untilDate != null : !UNTIL_DATE_EDEFAULT.equals(untilDate);
			case GtmPackage.CALENDAR__UTC_OFFSET:
				return utcOffset != UTC_OFFSET_EDEFAULT;
			case GtmPackage.CALENDAR__DATES:
				return dates != null && !dates.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", untilDate: ");
		result.append(untilDate);
		result.append(", utcOffset: ");
		result.append(utcOffset);
		result.append(", dates: ");
		result.append(dates);
		result.append(')');
		return result.toString();
	}

} //CalendarImpl
