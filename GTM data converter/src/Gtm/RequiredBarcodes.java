/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Barcodes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.RequiredBarcodes#getRequiredBarcodes <em>Required Barcodes</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getRequiredBarcodes()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AT_LEAST_ONE'"
 * @generated
 */
public interface RequiredBarcodes extends EObject {
	/**
	 * Returns the value of the '<em><b>Required Barcodes</b></em>' attribute list.
	 * The list contents are of type {@link Gtm.BarcodeTypes}.
	 * The literals are from the enumeration {@link Gtm.BarcodeTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Barcodes</em>' attribute list.
	 * @see Gtm.BarcodeTypes
	 * @see Gtm.GtmPackage#getRequiredBarcodes_RequiredBarcodes()
	 * @model
	 * @generated
	 */
	EList<BarcodeTypes> getRequiredBarcodes();

} // RequiredBarcodes
