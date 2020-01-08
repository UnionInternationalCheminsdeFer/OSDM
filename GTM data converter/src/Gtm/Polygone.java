/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polygone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.Polygone#getEgde <em>Egde</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getPolygone()
 * @model
 * @generated
 */
public interface Polygone extends EObject {
	/**
	 * Returns the value of the '<em><b>Egde</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.Edge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Egde</em>' containment reference list.
	 * @see Gtm.GtmPackage#getPolygone_Egde()
	 * @model containment="true"
	 * @generated
	 */
	EList<Edge> getEgde();

} // Polygone
