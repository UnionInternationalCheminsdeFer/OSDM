/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Lists</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.CodeLists#getCarriers <em>Carriers</em>}</li>
 *   <li>{@link Gtm.CodeLists#getStations <em>Stations</em>}</li>
 *   <li>{@link Gtm.CodeLists#getCountries <em>Countries</em>}</li>
 *   <li>{@link Gtm.CodeLists#getLanguages <em>Languages</em>}</li>
 *   <li>{@link Gtm.CodeLists#getCurrencies <em>Currencies</em>}</li>
 *   <li>{@link Gtm.CodeLists#getServiceBrands <em>Service Brands</em>}</li>
 *   <li>{@link Gtm.CodeLists#getNutsCodes <em>Nuts Codes</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getCodeLists()
 * @model
 * @generated
 */
public interface CodeLists extends EObject {
	/**
	 * Returns the value of the '<em><b>Carriers</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.Carrier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carriers</em>' containment reference list.
	 * @see Gtm.GtmPackage#getCodeLists_Carriers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Carrier> getCarriers();

	/**
	 * Returns the value of the '<em><b>Stations</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.Station}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stations</em>' containment reference list.
	 * @see Gtm.GtmPackage#getCodeLists_Stations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Station> getStations();

	/**
	 * Returns the value of the '<em><b>Countries</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.Country}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Countries</em>' containment reference list.
	 * @see Gtm.GtmPackage#getCodeLists_Countries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Country> getCountries();

	/**
	 * Returns the value of the '<em><b>Languages</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.Language}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Languages</em>' containment reference list.
	 * @see Gtm.GtmPackage#getCodeLists_Languages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Language> getLanguages();

	/**
	 * Returns the value of the '<em><b>Currencies</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.Currency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currencies</em>' containment reference list.
	 * @see Gtm.GtmPackage#getCodeLists_Currencies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Currency> getCurrencies();

	/**
	 * Returns the value of the '<em><b>Service Brands</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.ServiceBrand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Brands</em>' containment reference list.
	 * @see Gtm.GtmPackage#getCodeLists_ServiceBrands()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceBrand> getServiceBrands();

	/**
	 * Returns the value of the '<em><b>Nuts Codes</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.NutsCode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nuts Codes</em>' containment reference list.
	 * @see Gtm.GtmPackage#getCodeLists_NutsCodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<NutsCode> getNutsCodes();

} // CodeLists
