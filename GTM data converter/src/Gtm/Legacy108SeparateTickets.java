/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy108 Separate Tickets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.Legacy108SeparateTickets#getLegacySeparateTickets <em>Legacy Separate Tickets</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacy108SeparateTickets()
 * @model
 * @generated
 */
public interface Legacy108SeparateTickets extends EObject {
	/**
	 * Returns the value of the '<em><b>Legacy Separate Tickets</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.Legacy108SeparateTicket}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Separate Tickets</em>' containment reference list.
	 * @see Gtm.GtmPackage#getLegacy108SeparateTickets_LegacySeparateTickets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Legacy108SeparateTicket> getLegacySeparateTickets();

} // Legacy108SeparateTickets
