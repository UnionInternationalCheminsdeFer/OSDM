/**
 */
package Gtm.impl;

import Gtm.ConversionParams;
import Gtm.Country;
import Gtm.EndOfSale;
import Gtm.GtmPackage;
import Gtm.LegacyBoderPointMappings;
import Gtm.LegacyFareDetailMaps;
import Gtm.LegacyFareStationSetMappings;
import Gtm.LegacyFareTemplates;
import Gtm.LegacyStationMappings;
import Gtm.LegacyStationToServiceConstraintMappings;
import Gtm.VatTemplates;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conversion Params</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.ConversionParamsImpl#getTaxId <em>Tax Id</em>}</li>
 *   <li>{@link Gtm.impl.ConversionParamsImpl#getVATpercentage <em>VA Tpercentage</em>}</li>
 *   <li>{@link Gtm.impl.ConversionParamsImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link Gtm.impl.ConversionParamsImpl#getLegacyBorderPointMappings <em>Legacy Border Point Mappings</em>}</li>
 *   <li>{@link Gtm.impl.ConversionParamsImpl#getLegacyStationMappings <em>Legacy Station Mappings</em>}</li>
 *   <li>{@link Gtm.impl.ConversionParamsImpl#getLegacyFareTemplates <em>Legacy Fare Templates</em>}</li>
 *   <li>{@link Gtm.impl.ConversionParamsImpl#getLegacyFareStationMappings <em>Legacy Fare Station Mappings</em>}</li>
 *   <li>{@link Gtm.impl.ConversionParamsImpl#getLegacyStationToServiceBrandMappings <em>Legacy Station To Service Brand Mappings</em>}</li>
 *   <li>{@link Gtm.impl.ConversionParamsImpl#getLegacyStationToFareDetailMappings <em>Legacy Station To Fare Detail Mappings</em>}</li>
 *   <li>{@link Gtm.impl.ConversionParamsImpl#getEndOfSale <em>End Of Sale</em>}</li>
 *   <li>{@link Gtm.impl.ConversionParamsImpl#getStartOfSale <em>Start Of Sale</em>}</li>
 *   <li>{@link Gtm.impl.ConversionParamsImpl#getStationImportFilter <em>Station Import Filter</em>}</li>
 *   <li>{@link Gtm.impl.ConversionParamsImpl#isConvertFareDescriptions <em>Convert Fare Descriptions</em>}</li>
 *   <li>{@link Gtm.impl.ConversionParamsImpl#isConvertServiceConstraints <em>Convert Service Constraints</em>}</li>
 *   <li>{@link Gtm.impl.ConversionParamsImpl#getVatTemplates <em>Vat Templates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConversionParamsImpl extends MinimalEObjectImpl.Container implements ConversionParams {
	/**
	 * The default value of the '{@link #getTaxId() <em>Tax Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxId()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxId() <em>Tax Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxId()
	 * @generated
	 * @ordered
	 */
	protected String taxId = TAX_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVATpercentage() <em>VA Tpercentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVATpercentage()
	 * @generated
	 * @ordered
	 */
	protected static final float VA_TPERCENTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVATpercentage() <em>VA Tpercentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVATpercentage()
	 * @generated
	 * @ordered
	 */
	protected float vaTpercentage = VA_TPERCENTAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected Country country;

	/**
	 * The cached value of the '{@link #getLegacyBorderPointMappings() <em>Legacy Border Point Mappings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyBorderPointMappings()
	 * @generated
	 * @ordered
	 */
	protected LegacyBoderPointMappings legacyBorderPointMappings;

	/**
	 * The cached value of the '{@link #getLegacyStationMappings() <em>Legacy Station Mappings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyStationMappings()
	 * @generated
	 * @ordered
	 */
	protected LegacyStationMappings legacyStationMappings;

	/**
	 * The cached value of the '{@link #getLegacyFareTemplates() <em>Legacy Fare Templates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyFareTemplates()
	 * @generated
	 * @ordered
	 */
	protected LegacyFareTemplates legacyFareTemplates;

	/**
	 * The cached value of the '{@link #getLegacyFareStationMappings() <em>Legacy Fare Station Mappings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyFareStationMappings()
	 * @generated
	 * @ordered
	 */
	protected LegacyFareStationSetMappings legacyFareStationMappings;

	/**
	 * The cached value of the '{@link #getLegacyStationToServiceBrandMappings() <em>Legacy Station To Service Brand Mappings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyStationToServiceBrandMappings()
	 * @generated
	 * @ordered
	 */
	protected LegacyStationToServiceConstraintMappings legacyStationToServiceBrandMappings;

	/**
	 * The cached value of the '{@link #getLegacyStationToFareDetailMappings() <em>Legacy Station To Fare Detail Mappings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyStationToFareDetailMappings()
	 * @generated
	 * @ordered
	 */
	protected LegacyFareDetailMaps legacyStationToFareDetailMappings;

	/**
	 * The cached value of the '{@link #getEndOfSale() <em>End Of Sale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndOfSale()
	 * @generated
	 * @ordered
	 */
	protected EndOfSale endOfSale;

	/**
	 * The cached value of the '{@link #getStartOfSale() <em>Start Of Sale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartOfSale()
	 * @generated
	 * @ordered
	 */
	protected EndOfSale startOfSale;

	/**
	 * The default value of the '{@link #getStationImportFilter() <em>Station Import Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStationImportFilter()
	 * @generated
	 * @ordered
	 */
	protected static final String STATION_IMPORT_FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStationImportFilter() <em>Station Import Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStationImportFilter()
	 * @generated
	 * @ordered
	 */
	protected String stationImportFilter = STATION_IMPORT_FILTER_EDEFAULT;

	/**
	 * The default value of the '{@link #isConvertFareDescriptions() <em>Convert Fare Descriptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConvertFareDescriptions()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONVERT_FARE_DESCRIPTIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConvertFareDescriptions() <em>Convert Fare Descriptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConvertFareDescriptions()
	 * @generated
	 * @ordered
	 */
	protected boolean convertFareDescriptions = CONVERT_FARE_DESCRIPTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #isConvertServiceConstraints() <em>Convert Service Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConvertServiceConstraints()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONVERT_SERVICE_CONSTRAINTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConvertServiceConstraints() <em>Convert Service Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConvertServiceConstraints()
	 * @generated
	 * @ordered
	 */
	protected boolean convertServiceConstraints = CONVERT_SERVICE_CONSTRAINTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVatTemplates() <em>Vat Templates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVatTemplates()
	 * @generated
	 * @ordered
	 */
	protected VatTemplates vatTemplates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConversionParamsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.CONVERSION_PARAMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaxId() {
		return taxId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxId(String newTaxId) {
		String oldTaxId = taxId;
		taxId = newTaxId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__TAX_ID, oldTaxId, taxId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVATpercentage() {
		return vaTpercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVATpercentage(float newVATpercentage) {
		float oldVATpercentage = vaTpercentage;
		vaTpercentage = newVATpercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__VA_TPERCENTAGE, oldVATpercentage, vaTpercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country getCountry() {
		if (country != null && country.eIsProxy()) {
			InternalEObject oldCountry = (InternalEObject)country;
			country = (Country)eResolveProxy(oldCountry);
			if (country != oldCountry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.CONVERSION_PARAMS__COUNTRY, oldCountry, country));
			}
		}
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country basicGetCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(Country newCountry) {
		Country oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyBoderPointMappings getLegacyBorderPointMappings() {
		return legacyBorderPointMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegacyBorderPointMappings(LegacyBoderPointMappings newLegacyBorderPointMappings, NotificationChain msgs) {
		LegacyBoderPointMappings oldLegacyBorderPointMappings = legacyBorderPointMappings;
		legacyBorderPointMappings = newLegacyBorderPointMappings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__LEGACY_BORDER_POINT_MAPPINGS, oldLegacyBorderPointMappings, newLegacyBorderPointMappings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegacyBorderPointMappings(LegacyBoderPointMappings newLegacyBorderPointMappings) {
		if (newLegacyBorderPointMappings != legacyBorderPointMappings) {
			NotificationChain msgs = null;
			if (legacyBorderPointMappings != null)
				msgs = ((InternalEObject)legacyBorderPointMappings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CONVERSION_PARAMS__LEGACY_BORDER_POINT_MAPPINGS, null, msgs);
			if (newLegacyBorderPointMappings != null)
				msgs = ((InternalEObject)newLegacyBorderPointMappings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CONVERSION_PARAMS__LEGACY_BORDER_POINT_MAPPINGS, null, msgs);
			msgs = basicSetLegacyBorderPointMappings(newLegacyBorderPointMappings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__LEGACY_BORDER_POINT_MAPPINGS, newLegacyBorderPointMappings, newLegacyBorderPointMappings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyStationMappings getLegacyStationMappings() {
		return legacyStationMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegacyStationMappings(LegacyStationMappings newLegacyStationMappings, NotificationChain msgs) {
		LegacyStationMappings oldLegacyStationMappings = legacyStationMappings;
		legacyStationMappings = newLegacyStationMappings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_MAPPINGS, oldLegacyStationMappings, newLegacyStationMappings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegacyStationMappings(LegacyStationMappings newLegacyStationMappings) {
		if (newLegacyStationMappings != legacyStationMappings) {
			NotificationChain msgs = null;
			if (legacyStationMappings != null)
				msgs = ((InternalEObject)legacyStationMappings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_MAPPINGS, null, msgs);
			if (newLegacyStationMappings != null)
				msgs = ((InternalEObject)newLegacyStationMappings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_MAPPINGS, null, msgs);
			msgs = basicSetLegacyStationMappings(newLegacyStationMappings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_MAPPINGS, newLegacyStationMappings, newLegacyStationMappings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyFareTemplates getLegacyFareTemplates() {
		return legacyFareTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegacyFareTemplates(LegacyFareTemplates newLegacyFareTemplates, NotificationChain msgs) {
		LegacyFareTemplates oldLegacyFareTemplates = legacyFareTemplates;
		legacyFareTemplates = newLegacyFareTemplates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__LEGACY_FARE_TEMPLATES, oldLegacyFareTemplates, newLegacyFareTemplates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegacyFareTemplates(LegacyFareTemplates newLegacyFareTemplates) {
		if (newLegacyFareTemplates != legacyFareTemplates) {
			NotificationChain msgs = null;
			if (legacyFareTemplates != null)
				msgs = ((InternalEObject)legacyFareTemplates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CONVERSION_PARAMS__LEGACY_FARE_TEMPLATES, null, msgs);
			if (newLegacyFareTemplates != null)
				msgs = ((InternalEObject)newLegacyFareTemplates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CONVERSION_PARAMS__LEGACY_FARE_TEMPLATES, null, msgs);
			msgs = basicSetLegacyFareTemplates(newLegacyFareTemplates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__LEGACY_FARE_TEMPLATES, newLegacyFareTemplates, newLegacyFareTemplates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyFareStationSetMappings getLegacyFareStationMappings() {
		return legacyFareStationMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegacyFareStationMappings(LegacyFareStationSetMappings newLegacyFareStationMappings, NotificationChain msgs) {
		LegacyFareStationSetMappings oldLegacyFareStationMappings = legacyFareStationMappings;
		legacyFareStationMappings = newLegacyFareStationMappings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__LEGACY_FARE_STATION_MAPPINGS, oldLegacyFareStationMappings, newLegacyFareStationMappings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegacyFareStationMappings(LegacyFareStationSetMappings newLegacyFareStationMappings) {
		if (newLegacyFareStationMappings != legacyFareStationMappings) {
			NotificationChain msgs = null;
			if (legacyFareStationMappings != null)
				msgs = ((InternalEObject)legacyFareStationMappings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CONVERSION_PARAMS__LEGACY_FARE_STATION_MAPPINGS, null, msgs);
			if (newLegacyFareStationMappings != null)
				msgs = ((InternalEObject)newLegacyFareStationMappings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CONVERSION_PARAMS__LEGACY_FARE_STATION_MAPPINGS, null, msgs);
			msgs = basicSetLegacyFareStationMappings(newLegacyFareStationMappings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__LEGACY_FARE_STATION_MAPPINGS, newLegacyFareStationMappings, newLegacyFareStationMappings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyStationToServiceConstraintMappings getLegacyStationToServiceBrandMappings() {
		return legacyStationToServiceBrandMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegacyStationToServiceBrandMappings(LegacyStationToServiceConstraintMappings newLegacyStationToServiceBrandMappings, NotificationChain msgs) {
		LegacyStationToServiceConstraintMappings oldLegacyStationToServiceBrandMappings = legacyStationToServiceBrandMappings;
		legacyStationToServiceBrandMappings = newLegacyStationToServiceBrandMappings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS, oldLegacyStationToServiceBrandMappings, newLegacyStationToServiceBrandMappings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegacyStationToServiceBrandMappings(LegacyStationToServiceConstraintMappings newLegacyStationToServiceBrandMappings) {
		if (newLegacyStationToServiceBrandMappings != legacyStationToServiceBrandMappings) {
			NotificationChain msgs = null;
			if (legacyStationToServiceBrandMappings != null)
				msgs = ((InternalEObject)legacyStationToServiceBrandMappings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS, null, msgs);
			if (newLegacyStationToServiceBrandMappings != null)
				msgs = ((InternalEObject)newLegacyStationToServiceBrandMappings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS, null, msgs);
			msgs = basicSetLegacyStationToServiceBrandMappings(newLegacyStationToServiceBrandMappings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS, newLegacyStationToServiceBrandMappings, newLegacyStationToServiceBrandMappings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyFareDetailMaps getLegacyStationToFareDetailMappings() {
		return legacyStationToFareDetailMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegacyStationToFareDetailMappings(LegacyFareDetailMaps newLegacyStationToFareDetailMappings, NotificationChain msgs) {
		LegacyFareDetailMaps oldLegacyStationToFareDetailMappings = legacyStationToFareDetailMappings;
		legacyStationToFareDetailMappings = newLegacyStationToFareDetailMappings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_TO_FARE_DETAIL_MAPPINGS, oldLegacyStationToFareDetailMappings, newLegacyStationToFareDetailMappings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegacyStationToFareDetailMappings(LegacyFareDetailMaps newLegacyStationToFareDetailMappings) {
		if (newLegacyStationToFareDetailMappings != legacyStationToFareDetailMappings) {
			NotificationChain msgs = null;
			if (legacyStationToFareDetailMappings != null)
				msgs = ((InternalEObject)legacyStationToFareDetailMappings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_TO_FARE_DETAIL_MAPPINGS, null, msgs);
			if (newLegacyStationToFareDetailMappings != null)
				msgs = ((InternalEObject)newLegacyStationToFareDetailMappings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_TO_FARE_DETAIL_MAPPINGS, null, msgs);
			msgs = basicSetLegacyStationToFareDetailMappings(newLegacyStationToFareDetailMappings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_TO_FARE_DETAIL_MAPPINGS, newLegacyStationToFareDetailMappings, newLegacyStationToFareDetailMappings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndOfSale getEndOfSale() {
		return endOfSale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndOfSale(EndOfSale newEndOfSale, NotificationChain msgs) {
		EndOfSale oldEndOfSale = endOfSale;
		endOfSale = newEndOfSale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__END_OF_SALE, oldEndOfSale, newEndOfSale);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndOfSale(EndOfSale newEndOfSale) {
		if (newEndOfSale != endOfSale) {
			NotificationChain msgs = null;
			if (endOfSale != null)
				msgs = ((InternalEObject)endOfSale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CONVERSION_PARAMS__END_OF_SALE, null, msgs);
			if (newEndOfSale != null)
				msgs = ((InternalEObject)newEndOfSale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CONVERSION_PARAMS__END_OF_SALE, null, msgs);
			msgs = basicSetEndOfSale(newEndOfSale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__END_OF_SALE, newEndOfSale, newEndOfSale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndOfSale getStartOfSale() {
		return startOfSale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartOfSale(EndOfSale newStartOfSale, NotificationChain msgs) {
		EndOfSale oldStartOfSale = startOfSale;
		startOfSale = newStartOfSale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__START_OF_SALE, oldStartOfSale, newStartOfSale);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartOfSale(EndOfSale newStartOfSale) {
		if (newStartOfSale != startOfSale) {
			NotificationChain msgs = null;
			if (startOfSale != null)
				msgs = ((InternalEObject)startOfSale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CONVERSION_PARAMS__START_OF_SALE, null, msgs);
			if (newStartOfSale != null)
				msgs = ((InternalEObject)newStartOfSale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CONVERSION_PARAMS__START_OF_SALE, null, msgs);
			msgs = basicSetStartOfSale(newStartOfSale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__START_OF_SALE, newStartOfSale, newStartOfSale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStationImportFilter() {
		return stationImportFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStationImportFilter(String newStationImportFilter) {
		String oldStationImportFilter = stationImportFilter;
		stationImportFilter = newStationImportFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__STATION_IMPORT_FILTER, oldStationImportFilter, stationImportFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConvertFareDescriptions() {
		return convertFareDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConvertFareDescriptions(boolean newConvertFareDescriptions) {
		boolean oldConvertFareDescriptions = convertFareDescriptions;
		convertFareDescriptions = newConvertFareDescriptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__CONVERT_FARE_DESCRIPTIONS, oldConvertFareDescriptions, convertFareDescriptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConvertServiceConstraints() {
		return convertServiceConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConvertServiceConstraints(boolean newConvertServiceConstraints) {
		boolean oldConvertServiceConstraints = convertServiceConstraints;
		convertServiceConstraints = newConvertServiceConstraints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__CONVERT_SERVICE_CONSTRAINTS, oldConvertServiceConstraints, convertServiceConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VatTemplates getVatTemplates() {
		return vatTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVatTemplates(VatTemplates newVatTemplates, NotificationChain msgs) {
		VatTemplates oldVatTemplates = vatTemplates;
		vatTemplates = newVatTemplates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__VAT_TEMPLATES, oldVatTemplates, newVatTemplates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVatTemplates(VatTemplates newVatTemplates) {
		if (newVatTemplates != vatTemplates) {
			NotificationChain msgs = null;
			if (vatTemplates != null)
				msgs = ((InternalEObject)vatTemplates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CONVERSION_PARAMS__VAT_TEMPLATES, null, msgs);
			if (newVatTemplates != null)
				msgs = ((InternalEObject)newVatTemplates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CONVERSION_PARAMS__VAT_TEMPLATES, null, msgs);
			msgs = basicSetVatTemplates(newVatTemplates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__VAT_TEMPLATES, newVatTemplates, newVatTemplates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.CONVERSION_PARAMS__LEGACY_BORDER_POINT_MAPPINGS:
				return basicSetLegacyBorderPointMappings(null, msgs);
			case GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_MAPPINGS:
				return basicSetLegacyStationMappings(null, msgs);
			case GtmPackage.CONVERSION_PARAMS__LEGACY_FARE_TEMPLATES:
				return basicSetLegacyFareTemplates(null, msgs);
			case GtmPackage.CONVERSION_PARAMS__LEGACY_FARE_STATION_MAPPINGS:
				return basicSetLegacyFareStationMappings(null, msgs);
			case GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS:
				return basicSetLegacyStationToServiceBrandMappings(null, msgs);
			case GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_TO_FARE_DETAIL_MAPPINGS:
				return basicSetLegacyStationToFareDetailMappings(null, msgs);
			case GtmPackage.CONVERSION_PARAMS__END_OF_SALE:
				return basicSetEndOfSale(null, msgs);
			case GtmPackage.CONVERSION_PARAMS__START_OF_SALE:
				return basicSetStartOfSale(null, msgs);
			case GtmPackage.CONVERSION_PARAMS__VAT_TEMPLATES:
				return basicSetVatTemplates(null, msgs);
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
			case GtmPackage.CONVERSION_PARAMS__TAX_ID:
				return getTaxId();
			case GtmPackage.CONVERSION_PARAMS__VA_TPERCENTAGE:
				return getVATpercentage();
			case GtmPackage.CONVERSION_PARAMS__COUNTRY:
				if (resolve) return getCountry();
				return basicGetCountry();
			case GtmPackage.CONVERSION_PARAMS__LEGACY_BORDER_POINT_MAPPINGS:
				return getLegacyBorderPointMappings();
			case GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_MAPPINGS:
				return getLegacyStationMappings();
			case GtmPackage.CONVERSION_PARAMS__LEGACY_FARE_TEMPLATES:
				return getLegacyFareTemplates();
			case GtmPackage.CONVERSION_PARAMS__LEGACY_FARE_STATION_MAPPINGS:
				return getLegacyFareStationMappings();
			case GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS:
				return getLegacyStationToServiceBrandMappings();
			case GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_TO_FARE_DETAIL_MAPPINGS:
				return getLegacyStationToFareDetailMappings();
			case GtmPackage.CONVERSION_PARAMS__END_OF_SALE:
				return getEndOfSale();
			case GtmPackage.CONVERSION_PARAMS__START_OF_SALE:
				return getStartOfSale();
			case GtmPackage.CONVERSION_PARAMS__STATION_IMPORT_FILTER:
				return getStationImportFilter();
			case GtmPackage.CONVERSION_PARAMS__CONVERT_FARE_DESCRIPTIONS:
				return isConvertFareDescriptions();
			case GtmPackage.CONVERSION_PARAMS__CONVERT_SERVICE_CONSTRAINTS:
				return isConvertServiceConstraints();
			case GtmPackage.CONVERSION_PARAMS__VAT_TEMPLATES:
				return getVatTemplates();
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
			case GtmPackage.CONVERSION_PARAMS__TAX_ID:
				setTaxId((String)newValue);
				return;
			case GtmPackage.CONVERSION_PARAMS__VA_TPERCENTAGE:
				setVATpercentage((Float)newValue);
				return;
			case GtmPackage.CONVERSION_PARAMS__COUNTRY:
				setCountry((Country)newValue);
				return;
			case GtmPackage.CONVERSION_PARAMS__LEGACY_BORDER_POINT_MAPPINGS:
				setLegacyBorderPointMappings((LegacyBoderPointMappings)newValue);
				return;
			case GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_MAPPINGS:
				setLegacyStationMappings((LegacyStationMappings)newValue);
				return;
			case GtmPackage.CONVERSION_PARAMS__LEGACY_FARE_TEMPLATES:
				setLegacyFareTemplates((LegacyFareTemplates)newValue);
				return;
			case GtmPackage.CONVERSION_PARAMS__LEGACY_FARE_STATION_MAPPINGS:
				setLegacyFareStationMappings((LegacyFareStationSetMappings)newValue);
				return;
			case GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS:
				setLegacyStationToServiceBrandMappings((LegacyStationToServiceConstraintMappings)newValue);
				return;
			case GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_TO_FARE_DETAIL_MAPPINGS:
				setLegacyStationToFareDetailMappings((LegacyFareDetailMaps)newValue);
				return;
			case GtmPackage.CONVERSION_PARAMS__END_OF_SALE:
				setEndOfSale((EndOfSale)newValue);
				return;
			case GtmPackage.CONVERSION_PARAMS__START_OF_SALE:
				setStartOfSale((EndOfSale)newValue);
				return;
			case GtmPackage.CONVERSION_PARAMS__STATION_IMPORT_FILTER:
				setStationImportFilter((String)newValue);
				return;
			case GtmPackage.CONVERSION_PARAMS__CONVERT_FARE_DESCRIPTIONS:
				setConvertFareDescriptions((Boolean)newValue);
				return;
			case GtmPackage.CONVERSION_PARAMS__CONVERT_SERVICE_CONSTRAINTS:
				setConvertServiceConstraints((Boolean)newValue);
				return;
			case GtmPackage.CONVERSION_PARAMS__VAT_TEMPLATES:
				setVatTemplates((VatTemplates)newValue);
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
			case GtmPackage.CONVERSION_PARAMS__TAX_ID:
				setTaxId(TAX_ID_EDEFAULT);
				return;
			case GtmPackage.CONVERSION_PARAMS__VA_TPERCENTAGE:
				setVATpercentage(VA_TPERCENTAGE_EDEFAULT);
				return;
			case GtmPackage.CONVERSION_PARAMS__COUNTRY:
				setCountry((Country)null);
				return;
			case GtmPackage.CONVERSION_PARAMS__LEGACY_BORDER_POINT_MAPPINGS:
				setLegacyBorderPointMappings((LegacyBoderPointMappings)null);
				return;
			case GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_MAPPINGS:
				setLegacyStationMappings((LegacyStationMappings)null);
				return;
			case GtmPackage.CONVERSION_PARAMS__LEGACY_FARE_TEMPLATES:
				setLegacyFareTemplates((LegacyFareTemplates)null);
				return;
			case GtmPackage.CONVERSION_PARAMS__LEGACY_FARE_STATION_MAPPINGS:
				setLegacyFareStationMappings((LegacyFareStationSetMappings)null);
				return;
			case GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS:
				setLegacyStationToServiceBrandMappings((LegacyStationToServiceConstraintMappings)null);
				return;
			case GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_TO_FARE_DETAIL_MAPPINGS:
				setLegacyStationToFareDetailMappings((LegacyFareDetailMaps)null);
				return;
			case GtmPackage.CONVERSION_PARAMS__END_OF_SALE:
				setEndOfSale((EndOfSale)null);
				return;
			case GtmPackage.CONVERSION_PARAMS__START_OF_SALE:
				setStartOfSale((EndOfSale)null);
				return;
			case GtmPackage.CONVERSION_PARAMS__STATION_IMPORT_FILTER:
				setStationImportFilter(STATION_IMPORT_FILTER_EDEFAULT);
				return;
			case GtmPackage.CONVERSION_PARAMS__CONVERT_FARE_DESCRIPTIONS:
				setConvertFareDescriptions(CONVERT_FARE_DESCRIPTIONS_EDEFAULT);
				return;
			case GtmPackage.CONVERSION_PARAMS__CONVERT_SERVICE_CONSTRAINTS:
				setConvertServiceConstraints(CONVERT_SERVICE_CONSTRAINTS_EDEFAULT);
				return;
			case GtmPackage.CONVERSION_PARAMS__VAT_TEMPLATES:
				setVatTemplates((VatTemplates)null);
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
			case GtmPackage.CONVERSION_PARAMS__TAX_ID:
				return TAX_ID_EDEFAULT == null ? taxId != null : !TAX_ID_EDEFAULT.equals(taxId);
			case GtmPackage.CONVERSION_PARAMS__VA_TPERCENTAGE:
				return vaTpercentage != VA_TPERCENTAGE_EDEFAULT;
			case GtmPackage.CONVERSION_PARAMS__COUNTRY:
				return country != null;
			case GtmPackage.CONVERSION_PARAMS__LEGACY_BORDER_POINT_MAPPINGS:
				return legacyBorderPointMappings != null;
			case GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_MAPPINGS:
				return legacyStationMappings != null;
			case GtmPackage.CONVERSION_PARAMS__LEGACY_FARE_TEMPLATES:
				return legacyFareTemplates != null;
			case GtmPackage.CONVERSION_PARAMS__LEGACY_FARE_STATION_MAPPINGS:
				return legacyFareStationMappings != null;
			case GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS:
				return legacyStationToServiceBrandMappings != null;
			case GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_TO_FARE_DETAIL_MAPPINGS:
				return legacyStationToFareDetailMappings != null;
			case GtmPackage.CONVERSION_PARAMS__END_OF_SALE:
				return endOfSale != null;
			case GtmPackage.CONVERSION_PARAMS__START_OF_SALE:
				return startOfSale != null;
			case GtmPackage.CONVERSION_PARAMS__STATION_IMPORT_FILTER:
				return STATION_IMPORT_FILTER_EDEFAULT == null ? stationImportFilter != null : !STATION_IMPORT_FILTER_EDEFAULT.equals(stationImportFilter);
			case GtmPackage.CONVERSION_PARAMS__CONVERT_FARE_DESCRIPTIONS:
				return convertFareDescriptions != CONVERT_FARE_DESCRIPTIONS_EDEFAULT;
			case GtmPackage.CONVERSION_PARAMS__CONVERT_SERVICE_CONSTRAINTS:
				return convertServiceConstraints != CONVERT_SERVICE_CONSTRAINTS_EDEFAULT;
			case GtmPackage.CONVERSION_PARAMS__VAT_TEMPLATES:
				return vatTemplates != null;
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
		result.append(" (TaxId: ");
		result.append(taxId);
		result.append(", VATpercentage: ");
		result.append(vaTpercentage);
		result.append(", stationImportFilter: ");
		result.append(stationImportFilter);
		result.append(", convertFareDescriptions: ");
		result.append(convertFareDescriptions);
		result.append(", convertServiceConstraints: ");
		result.append(convertServiceConstraints);
		result.append(')');
		return result.toString();
	}

} //ConversionParamsImpl
