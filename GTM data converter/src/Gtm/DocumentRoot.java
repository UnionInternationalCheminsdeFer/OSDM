/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.DocumentRoot#getDataset <em>Dataset</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getDocumentRoot()
 * @model
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Dataset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comment describing your root element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dataset</em>' containment reference.
	 * @see #setDataset(GTMTool)
	 * @see Gtm.GtmPackage#getDocumentRoot_Dataset()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	GTMTool getDataset();

	/**
	 * Sets the value of the '{@link Gtm.DocumentRoot#getDataset <em>Dataset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataset</em>' containment reference.
	 * @see #getDataset()
	 * @generated
	 */
	void setDataset(GTMTool value);

} // DocumentRoot
