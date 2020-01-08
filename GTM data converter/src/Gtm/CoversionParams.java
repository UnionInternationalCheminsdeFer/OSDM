/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link Gtm.CoversionParams#getBorderPoints <em>Border Points</em>}</li>
 *   <li>{@link Gtm.CoversionParams#getTargetFares <em>Target Fares</em>}</li>
 *   <li>{@link Gtm.CoversionParams#getStationMappings <em>Station Mappings</em>}</li>
 *   <li>{@link Gtm.CoversionParams#getTaxId <em>Tax Id</em>}</li>
 *   <li>{@link Gtm.CoversionParams#getVATpercentage <em>VA Tpercentage</em>}</li>
 *   <li>{@link Gtm.CoversionParams#getTaxCountry <em>Tax Country</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getCoversionParams()
 * @model
 * @generated
 */
public interface CoversionParams extends EObject {
	/**
	 * Returns the value of the '<em><b>Border Points</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.BorderPoints}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Points</em>' containment reference list.
	 * @see Gtm.GtmPackage#getCoversionParams_BorderPoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<BorderPoints> getBorderPoints();

	/**
	 * Returns the value of the '<em><b>Target Fares</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.TargetFareTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Fares</em>' containment reference list.
	 * @see Gtm.GtmPackage#getCoversionParams_TargetFares()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TargetFareTemplate> getTargetFares();

	/**
	 * Returns the value of the '<em><b>Station Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.LegacyStationMap}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station Mappings</em>' containment reference list.
	 * @see Gtm.GtmPackage#getCoversionParams_StationMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<LegacyStationMap> getStationMappings();

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

} // CoversionParams
