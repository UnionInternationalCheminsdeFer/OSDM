/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calendars</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.Calendars#getCalendars <em>Calendars</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getCalendars()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AT_LEAST_ONE'"
 * @generated
 */
public interface Calendars extends EObject {
	/**
	 * Returns the value of the '<em><b>Calendars</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.Calendar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calendars</em>' containment reference list.
	 * @see Gtm.GtmPackage#getCalendars_Calendars()
	 * @model containment="true"
	 * @generated
	 */
	EList<Calendar> getCalendars();

} // Calendars
