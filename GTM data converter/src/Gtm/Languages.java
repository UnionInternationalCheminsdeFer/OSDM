/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Languages</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.Languages#getLanguages <em>Languages</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLanguages()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AT_LEAST_ONE'"
 * @generated
 */
public interface Languages extends EObject {
	/**
	 * Returns the value of the '<em><b>Languages</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.Language}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Languages</em>' containment reference list.
	 * @see Gtm.GtmPackage#getLanguages_Languages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Language> getLanguages();

} // Languages
