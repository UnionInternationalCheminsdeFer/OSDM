/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Points</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.ConnectionPoints#getConnectionPoints <em>Connection Points</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getConnectionPoints()
 * @model
 * @generated
 */
public interface ConnectionPoints extends EObject {
	/**
	 * Returns the value of the '<em><b>Connection Points</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.ConnectionPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Points</em>' containment reference list.
	 * @see Gtm.GtmPackage#getConnectionPoints_ConnectionPoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectionPoint> getConnectionPoints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ConnectionPoint findSimpleConnectionPoint(Station station);

} // ConnectionPoints
