/**
 */
package Gtm.impl;

import Gtm.ConversionParams;
import Gtm.Country;
import Gtm.EndOfSale;
import Gtm.GtmPackage;
import Gtm.LegacyBoderPointMappings;
import Gtm.LegacyFareStationSetMappings;
import Gtm.LegacyFareTemplates;
import Gtm.LegacyStationMappings;
import Gtm.LegacyStationToServiceConstraintMappings;

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
 *   <li>{@link Gtm.impl.ConversionParamsImpl#getEndOfSale <em>End Of Sale</em>}</li>
 *   <li>{@link Gtm.impl.ConversionParamsImpl#getStartOfSale <em>Start Of Sale</em>}</li>
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
			case GtmPackage.CONVERSION_PARAMS__END_OF_SALE:
				return basicSetEndOfSale(null, msgs);
			case GtmPackage.CONVERSION_PARAMS__START_OF_SALE:
				return basicSetStartOfSale(null, msgs);
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
			case GtmPackage.CONVERSION_PARAMS__END_OF_SALE:
				return getEndOfSale();
			case GtmPackage.CONVERSION_PARAMS__START_OF_SALE:
				return getStartOfSale();
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
			case GtmPackage.CONVERSION_PARAMS__END_OF_SALE:
				setEndOfSale((EndOfSale)newValue);
				return;
			case GtmPackage.CONVERSION_PARAMS__START_OF_SALE:
				setStartOfSale((EndOfSale)newValue);
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
			case GtmPackage.CONVERSION_PARAMS__END_OF_SALE:
				setEndOfSale((EndOfSale)null);
				return;
			case GtmPackage.CONVERSION_PARAMS__START_OF_SALE:
				setStartOfSale((EndOfSale)null);
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
			case GtmPackage.CONVERSION_PARAMS__END_OF_SALE:
				return endOfSale != null;
			case GtmPackage.CONVERSION_PARAMS__START_OF_SALE:
				return startOfSale != null;
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
		result.append(')');
		return result.toString();
	}

} //ConversionParamsImpl
