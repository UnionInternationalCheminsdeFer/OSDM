/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Countries</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.Countries#getCountries <em>Countries</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getCountries()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AT_LEAST_ONE'"
 * @generated
 */
public interface Countries extends EObject {
	/**
	 * Returns the value of the '<em><b>Countries</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.Country}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Countries</em>' containment reference list.
	 * @see Gtm.GtmPackage#getCountries_Countries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Country> getCountries();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model codeUicDataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	Country findCountry(int codeUic);

} // Countries
