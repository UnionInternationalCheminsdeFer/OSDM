/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.Legacy108FareDescription;
import Gtm.LegacyCalculationType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legacy108 Fare Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.Legacy108FareDescriptionImpl#getTableId <em>Table Id</em>}</li>
 *   <li>{@link Gtm.impl.Legacy108FareDescriptionImpl#getDescriptionFr <em>Description Fr</em>}</li>
 *   <li>{@link Gtm.impl.Legacy108FareDescriptionImpl#getDescriptionGe <em>Description Ge</em>}</li>
 *   <li>{@link Gtm.impl.Legacy108FareDescriptionImpl#getDescriptionEn <em>Description En</em>}</li>
 *   <li>{@link Gtm.impl.Legacy108FareDescriptionImpl#getDescriptionLocal <em>Description Local</em>}</li>
 *   <li>{@link Gtm.impl.Legacy108FareDescriptionImpl#getCalculationType <em>Calculation Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Legacy108FareDescriptionImpl extends MinimalEObjectImpl.Container implements Legacy108FareDescription {
	/**
	 * The default value of the '{@link #getTableId() <em>Table Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableId()
	 * @generated
	 * @ordered
	 */
	protected static final int TABLE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTableId() <em>Table Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableId()
	 * @generated
	 * @ordered
	 */
	protected int tableId = TABLE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescriptionFr() <em>Description Fr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionFr()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_FR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptionFr() <em>Description Fr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionFr()
	 * @generated
	 * @ordered
	 */
	protected String descriptionFr = DESCRIPTION_FR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescriptionGe() <em>Description Ge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionGe()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_GE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptionGe() <em>Description Ge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionGe()
	 * @generated
	 * @ordered
	 */
	protected String descriptionGe = DESCRIPTION_GE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescriptionEn() <em>Description En</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionEn()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptionEn() <em>Description En</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionEn()
	 * @generated
	 * @ordered
	 */
	protected String descriptionEn = DESCRIPTION_EN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescriptionLocal() <em>Description Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionLocal()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_LOCAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptionLocal() <em>Description Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionLocal()
	 * @generated
	 * @ordered
	 */
	protected String descriptionLocal = DESCRIPTION_LOCAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCalculationType() <em>Calculation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculationType()
	 * @generated
	 * @ordered
	 */
	protected static final LegacyCalculationType CALCULATION_TYPE_EDEFAULT = LegacyCalculationType.DISTANCE_BASED;

	/**
	 * The cached value of the '{@link #getCalculationType() <em>Calculation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculationType()
	 * @generated
	 * @ordered
	 */
	protected LegacyCalculationType calculationType = CALCULATION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Legacy108FareDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.LEGACY108_FARE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTableId() {
		return tableId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableId(int newTableId) {
		int oldTableId = tableId;
		tableId = newTableId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY108_FARE_DESCRIPTION__TABLE_ID, oldTableId, tableId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptionFr() {
		return descriptionFr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionFr(String newDescriptionFr) {
		String oldDescriptionFr = descriptionFr;
		descriptionFr = newDescriptionFr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY108_FARE_DESCRIPTION__DESCRIPTION_FR, oldDescriptionFr, descriptionFr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptionGe() {
		return descriptionGe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionGe(String newDescriptionGe) {
		String oldDescriptionGe = descriptionGe;
		descriptionGe = newDescriptionGe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY108_FARE_DESCRIPTION__DESCRIPTION_GE, oldDescriptionGe, descriptionGe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptionEn() {
		return descriptionEn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionEn(String newDescriptionEn) {
		String oldDescriptionEn = descriptionEn;
		descriptionEn = newDescriptionEn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY108_FARE_DESCRIPTION__DESCRIPTION_EN, oldDescriptionEn, descriptionEn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptionLocal() {
		return descriptionLocal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionLocal(String newDescriptionLocal) {
		String oldDescriptionLocal = descriptionLocal;
		descriptionLocal = newDescriptionLocal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY108_FARE_DESCRIPTION__DESCRIPTION_LOCAL, oldDescriptionLocal, descriptionLocal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyCalculationType getCalculationType() {
		return calculationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculationType(LegacyCalculationType newCalculationType) {
		LegacyCalculationType oldCalculationType = calculationType;
		calculationType = newCalculationType == null ? CALCULATION_TYPE_EDEFAULT : newCalculationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.LEGACY108_FARE_DESCRIPTION__CALCULATION_TYPE, oldCalculationType, calculationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.LEGACY108_FARE_DESCRIPTION__TABLE_ID:
				return getTableId();
			case GtmPackage.LEGACY108_FARE_DESCRIPTION__DESCRIPTION_FR:
				return getDescriptionFr();
			case GtmPackage.LEGACY108_FARE_DESCRIPTION__DESCRIPTION_GE:
				return getDescriptionGe();
			case GtmPackage.LEGACY108_FARE_DESCRIPTION__DESCRIPTION_EN:
				return getDescriptionEn();
			case GtmPackage.LEGACY108_FARE_DESCRIPTION__DESCRIPTION_LOCAL:
				return getDescriptionLocal();
			case GtmPackage.LEGACY108_FARE_DESCRIPTION__CALCULATION_TYPE:
				return getCalculationType();
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
			case GtmPackage.LEGACY108_FARE_DESCRIPTION__TABLE_ID:
				setTableId((Integer)newValue);
				return;
			case GtmPackage.LEGACY108_FARE_DESCRIPTION__DESCRIPTION_FR:
				setDescriptionFr((String)newValue);
				return;
			case GtmPackage.LEGACY108_FARE_DESCRIPTION__DESCRIPTION_GE:
				setDescriptionGe((String)newValue);
				return;
			case GtmPackage.LEGACY108_FARE_DESCRIPTION__DESCRIPTION_EN:
				setDescriptionEn((String)newValue);
				return;
			case GtmPackage.LEGACY108_FARE_DESCRIPTION__DESCRIPTION_LOCAL:
				setDescriptionLocal((String)newValue);
				return;
			case GtmPackage.LEGACY108_FARE_DESCRIPTION__CALCULATION_TYPE:
				setCalculationType((LegacyCalculationType)newValue);
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
			case GtmPackage.LEGACY108_FARE_DESCRIPTION__TABLE_ID:
				setTableId(TABLE_ID_EDEFAULT);
				return;
			case GtmPackage.LEGACY108_FARE_DESCRIPTION__DESCRIPTION_FR:
				setDescriptionFr(DESCRIPTION_FR_EDEFAULT);
				return;
			case GtmPackage.LEGACY108_FARE_DESCRIPTION__DESCRIPTION_GE:
				setDescriptionGe(DESCRIPTION_GE_EDEFAULT);
				return;
			case GtmPackage.LEGACY108_FARE_DESCRIPTION__DESCRIPTION_EN:
				setDescriptionEn(DESCRIPTION_EN_EDEFAULT);
				return;
			case GtmPackage.LEGACY108_FARE_DESCRIPTION__DESCRIPTION_LOCAL:
				setDescriptionLocal(DESCRIPTION_LOCAL_EDEFAULT);
				return;
			case GtmPackage.LEGACY108_FARE_DESCRIPTION__CALCULATION_TYPE:
				setCalculationType(CALCULATION_TYPE_EDEFAULT);
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
			case GtmPackage.LEGACY108_FARE_DESCRIPTION__TABLE_ID:
				return tableId != TABLE_ID_EDEFAULT;
			case GtmPackage.LEGACY108_FARE_DESCRIPTION__DESCRIPTION_FR:
				return DESCRIPTION_FR_EDEFAULT == null ? descriptionFr != null : !DESCRIPTION_FR_EDEFAULT.equals(descriptionFr);
			case GtmPackage.LEGACY108_FARE_DESCRIPTION__DESCRIPTION_GE:
				return DESCRIPTION_GE_EDEFAULT == null ? descriptionGe != null : !DESCRIPTION_GE_EDEFAULT.equals(descriptionGe);
			case GtmPackage.LEGACY108_FARE_DESCRIPTION__DESCRIPTION_EN:
				return DESCRIPTION_EN_EDEFAULT == null ? descriptionEn != null : !DESCRIPTION_EN_EDEFAULT.equals(descriptionEn);
			case GtmPackage.LEGACY108_FARE_DESCRIPTION__DESCRIPTION_LOCAL:
				return DESCRIPTION_LOCAL_EDEFAULT == null ? descriptionLocal != null : !DESCRIPTION_LOCAL_EDEFAULT.equals(descriptionLocal);
			case GtmPackage.LEGACY108_FARE_DESCRIPTION__CALCULATION_TYPE:
				return calculationType != CALCULATION_TYPE_EDEFAULT;
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
		result.append(" (tableId: ");
		result.append(tableId);
		result.append(", descriptionFr: ");
		result.append(descriptionFr);
		result.append(", descriptionGe: ");
		result.append(descriptionGe);
		result.append(", descriptionEn: ");
		result.append(descriptionEn);
		result.append(", descriptionLocal: ");
		result.append(descriptionLocal);
		result.append(", calculationType: ");
		result.append(calculationType);
		result.append(')');
		return result.toString();
	}

} //Legacy108FareDescriptionImpl
