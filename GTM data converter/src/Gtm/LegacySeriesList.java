/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Series List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.LegacySeriesList#getSeries <em>Series</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacySeriesList()
 * @model
 * @generated
 */
public interface LegacySeriesList extends EObject {
	/**
	 * Returns the value of the '<em><b>Series</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.LegacySeries}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series</em>' containment reference list.
	 * @see Gtm.GtmPackage#getLegacySeriesList_Series()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<LegacySeries> getSeries();

} // LegacySeriesList
