/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coversion Params</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.CoversionParams#getTaxId <em>Tax Id</em>}</li>
 *   <li>{@link Gtm.CoversionParams#getVATpercentage <em>VA Tpercentage</em>}</li>
 *   <li>{@link Gtm.CoversionParams#getTaxCountry <em>Tax Country</em>}</li>
 *   <li>{@link Gtm.CoversionParams#getLegacyBorderPointMappings <em>Legacy Border Point Mappings</em>}</li>
 *   <li>{@link Gtm.CoversionParams#getLegacyStationMappings <em>Legacy Station Mappings</em>}</li>
 *   <li>{@link Gtm.CoversionParams#getLegacyTargetFares <em>Legacy Target Fares</em>}</li>
 *   <li>{@link Gtm.CoversionParams#getLegacyZoneMappings <em>Legacy Zone Mappings</em>}</li>
 *   <li>{@link Gtm.CoversionParams#getLegacyStationToServiceBrandMappings <em>Legacy Station To Service Brand Mappings</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getCoversionParams()
 * @model
 * @generated
 */
public interface CoversionParams extends EObject {
	/**
	 * Returns the value of the '<em><b>Tax Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Id</em>' attribute.
	 * @see #setTaxId(String)
	 * @see Gtm.GtmPackage#getCoversionParams_TaxId()
	 * @model
	 * @generated
	 */
	String getTaxId();

	/**
	 * Sets the value of the '{@link Gtm.CoversionParams#getTaxId <em>Tax Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Id</em>' attribute.
	 * @see #getTaxId()
	 * @generated
	 */
	void setTaxId(String value);

	/**
	 * Returns the value of the '<em><b>VA Tpercentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VA Tpercentage</em>' attribute.
	 * @see #setVATpercentage(float)
	 * @see Gtm.GtmPackage#getCoversionParams_VATpercentage()
	 * @model
	 * @generated
	 */
	float getVATpercentage();

	/**
	 * Sets the value of the '{@link Gtm.CoversionParams#getVATpercentage <em>VA Tpercentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VA Tpercentage</em>' attribute.
	 * @see #getVATpercentage()
	 * @generated
	 */
	void setVATpercentage(float value);

	/**
	 * Returns the value of the '<em><b>Tax Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Country</em>' reference.
	 * @see #setTaxCountry(Country)
	 * @see Gtm.GtmPackage#getCoversionParams_TaxCountry()
	 * @model
	 * @generated
	 */
	Country getTaxCountry();

	/**
	 * Sets the value of the '{@link Gtm.CoversionParams#getTaxCountry <em>Tax Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Country</em>' reference.
	 * @see #getTaxCountry()
	 * @generated
	 */
	void setTaxCountry(Country value);

	/**
	 * Returns the value of the '<em><b>Legacy Border Point Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Border Point Mappings</em>' containment reference.
	 * @see #setLegacyBorderPointMappings(LegacyBoderPointMappings)
	 * @see Gtm.GtmPackage#getCoversionParams_LegacyBorderPointMappings()
	 * @model containment="true"
	 * @generated
	 */
	LegacyBoderPointMappings getLegacyBorderPointMappings();

	/**
	 * Sets the value of the '{@link Gtm.CoversionParams#getLegacyBorderPointMappings <em>Legacy Border Point Mappings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legacy Border Point Mappings</em>' containment reference.
	 * @see #getLegacyBorderPointMappings()
	 * @generated
	 */
	void setLegacyBorderPointMappings(LegacyBoderPointMappings value);

	/**
	 * Returns the value of the '<em><b>Legacy Station Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Station Mappings</em>' containment reference.
	 * @see #setLegacyStationMappings(LegacyStationMappings)
	 * @see Gtm.GtmPackage#getCoversionParams_LegacyStationMappings()
	 * @model containment="true"
	 * @generated
	 */
	LegacyStationMappings getLegacyStationMappings();

	/**
	 * Sets the value of the '{@link Gtm.CoversionParams#getLegacyStationMappings <em>Legacy Station Mappings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legacy Station Mappings</em>' containment reference.
	 * @see #getLegacyStationMappings()
	 * @generated
	 */
	void setLegacyStationMappings(LegacyStationMappings value);

	/**
	 * Returns the value of the '<em><b>Legacy Target Fares</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Target Fares</em>' containment reference.
	 * @see #setLegacyTargetFares(LegacyTargetFares)
	 * @see Gtm.GtmPackage#getCoversionParams_LegacyTargetFares()
	 * @model containment="true"
	 * @generated
	 */
	LegacyTargetFares getLegacyTargetFares();

	/**
	 * Sets the value of the '{@link Gtm.CoversionParams#getLegacyTargetFares <em>Legacy Target Fares</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legacy Target Fares</em>' containment reference.
	 * @see #getLegacyTargetFares()
	 * @generated
	 */
	void setLegacyTargetFares(LegacyTargetFares value);

	/**
	 * Returns the value of the '<em><b>Legacy Zone Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Zone Mappings</em>' containment reference.
	 * @see #setLegacyZoneMappings(LegacyZoneMappings)
	 * @see Gtm.GtmPackage#getCoversionParams_LegacyZoneMappings()
	 * @model containment="true"
	 * @generated
	 */
	LegacyZoneMappings getLegacyZoneMappings();

	/**
	 * Sets the value of the '{@link Gtm.CoversionParams#getLegacyZoneMappings <em>Legacy Zone Mappings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legacy Zone Mappings</em>' containment reference.
	 * @see #getLegacyZoneMappings()
	 * @generated
	 */
	void setLegacyZoneMappings(LegacyZoneMappings value);

	/**
	 * Returns the value of the '<em><b>Legacy Station To Service Brand Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Station To Service Brand Mappings</em>' containment reference.
	 * @see #setLegacyStationToServiceBrandMappings(LegacyStationToServiceConstraintMappings)
	 * @see Gtm.GtmPackage#getCoversionParams_LegacyStationToServiceBrandMappings()
	 * @model containment="true"
	 * @generated
	 */
	LegacyStationToServiceConstraintMappings getLegacyStationToServiceBrandMappings();

	/**
	 * Sets the value of the '{@link Gtm.CoversionParams#getLegacyStationToServiceBrandMappings <em>Legacy Station To Service Brand Mappings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legacy Station To Service Brand Mappings</em>' containment reference.
	 * @see #getLegacyStationToServiceBrandMappings()
	 * @generated
	 */
	void setLegacyStationToServiceBrandMappings(LegacyStationToServiceConstraintMappings value);

} // CoversionParams
