/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carriers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.Carriers#getCarriers <em>Carriers</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getCarriers()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AT_LEAST_ONE'"
 * @generated
 */
public interface Carriers extends EObject {
	/**
	 * Returns the value of the '<em><b>Carriers</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.Carrier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carriers</em>' containment reference list.
	 * @see Gtm.GtmPackage#getCarriers_Carriers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Carrier> getCarriers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * find a carrier by its code
	 * <!-- end-model-doc -->
	 * @model codeDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	Carrier findCarrier(String code);

} // Carriers
