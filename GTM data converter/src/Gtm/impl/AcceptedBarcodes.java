/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accepted Barcodes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.AcceptedBarcodes#getAcceptedBarcodes <em>Accepted Barcodes</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getAcceptedBarcodes()
 * @model
 * @generated
 */
public interface AcceptedBarcodes extends EObject {
	/**
	 * Returns the value of the '<em><b>Accepted Barcodes</b></em>' attribute list.
	 * The list contents are of type {@link Gtm.BarcodeTypes}.
	 * The literals are from the enumeration {@link Gtm.BarcodeTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepted Barcodes</em>' attribute list.
	 * @see Gtm.BarcodeTypes
	 * @see Gtm.GtmPackage#getAcceptedBarcodes_AcceptedBarcodes()
	 * @model
	 * @generated
	 */
	EList<BarcodeTypes> getAcceptedBarcodes();

} // AcceptedBarcodes
