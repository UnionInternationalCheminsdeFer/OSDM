/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy108 Fares Descriptions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.Legacy108FaresDescriptions#getLegacyFares <em>Legacy Fares</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacy108FaresDescriptions()
 * @model
 * @generated
 */
public interface Legacy108FaresDescriptions extends EObject {
	/**
	 * Returns the value of the '<em><b>Legacy Fares</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.Legacy108FareDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Fares</em>' containment reference list.
	 * @see Gtm.GtmPackage#getLegacy108FaresDescriptions_LegacyFares()
	 * @model containment="true"
	 * @generated
	 */
	EList<Legacy108FareDescription> getLegacyFares();

} // Legacy108FaresDescriptions
