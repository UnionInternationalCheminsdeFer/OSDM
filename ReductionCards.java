/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reduction Cards</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.ReductionCards#getReductionCards <em>Reduction Cards</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getReductionCards()
 * @model
 * @generated
 */
public interface ReductionCards extends EObject {
	/**
	 * Returns the value of the '<em><b>Reduction Cards</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.ReductionCard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reduction Cards</em>' containment reference list.
	 * @see Gtm.GtmPackage#getReductionCards_ReductionCards()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReductionCard> getReductionCards();

} // ReductionCards
