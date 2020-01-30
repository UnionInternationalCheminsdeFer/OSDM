/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.ServiceClass#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.ServiceClass#getClassicClass <em>Classic Class</em>}</li>
 *   <li>{@link Gtm.ServiceClass#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getServiceClass()
 * @model
 * @generated
 */
public interface ServiceClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.ClassId}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see Gtm.ClassId
	 * @see #setId(ClassId)
	 * @see Gtm.GtmPackage#getServiceClass_Id()
	 * @model
	 * @generated
	 */
	ClassId getId();

	/**
	 * Sets the value of the '{@link Gtm.ServiceClass#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see Gtm.ClassId
	 * @see #getId()
	 * @generated
	 */
	void setId(ClassId value);

	/**
	 * Returns the value of the '<em><b>Classic Class</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.ClassicClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classic Class</em>' attribute.
	 * @see Gtm.ClassicClassType
	 * @see #setClassicClass(ClassicClassType)
	 * @see Gtm.GtmPackage#getServiceClass_ClassicClass()
	 * @model
	 * @generated
	 */
	ClassicClassType getClassicClass();

	/**
	 * Sets the value of the '{@link Gtm.ServiceClass#getClassicClass <em>Classic Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classic Class</em>' attribute.
	 * @see Gtm.ClassicClassType
	 * @see #getClassicClass()
	 * @generated
	 */
	void setClassicClass(ClassicClassType value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' reference.
	 * @see #setText(Text)
	 * @see Gtm.GtmPackage#getServiceClass_Text()
	 * @model
	 * @generated
	 */
	Text getText();

	/**
	 * Sets the value of the '{@link Gtm.ServiceClass#getText <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(Text value);

} // ServiceClass
