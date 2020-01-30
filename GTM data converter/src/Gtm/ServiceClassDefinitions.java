/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Class Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.ServiceClassDefinitions#getServiceClassDefinitions <em>Service Class Definitions</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getServiceClassDefinitions()
 * @model
 * @generated
 */
public interface ServiceClassDefinitions extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Class Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.ServiceClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Class Definitions</em>' containment reference list.
	 * @see Gtm.GtmPackage#getServiceClassDefinitions_ServiceClassDefinitions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ServiceClass> getServiceClassDefinitions();

} // ServiceClassDefinitions
