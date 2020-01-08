/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delivery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.Delivery#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.Delivery#getPreviousDeliveryId <em>Previous Delivery Id</em>}</li>
 *   <li>{@link Gtm.Delivery#getReplacedDeliveryId <em>Replaced Delivery Id</em>}</li>
 *   <li>{@link Gtm.Delivery#getFareProvider <em>Fare Provider</em>}</li>
 *   <li>{@link Gtm.Delivery#isOptional <em>Optional</em>}</li>
 *   <li>{@link Gtm.Delivery#getProvider <em>Provider</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getDelivery()
 * @model
 * @generated
 */
public interface Delivery extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Gtm.GtmPackage#getDelivery_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Gtm.Delivery#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Previous Delivery Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Delivery Id</em>' attribute.
	 * @see #setPreviousDeliveryId(String)
	 * @see Gtm.GtmPackage#getDelivery_PreviousDeliveryId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getPreviousDeliveryId();

	/**
	 * Sets the value of the '{@link Gtm.Delivery#getPreviousDeliveryId <em>Previous Delivery Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Delivery Id</em>' attribute.
	 * @see #getPreviousDeliveryId()
	 * @generated
	 */
	void setPreviousDeliveryId(String value);

	/**
	 * Returns the value of the '<em><b>Replaced Delivery Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replaced Delivery Id</em>' attribute.
	 * @see #isSetReplacedDeliveryId()
	 * @see #unsetReplacedDeliveryId()
	 * @see #setReplacedDeliveryId(int)
	 * @see Gtm.GtmPackage#getDelivery_ReplacedDeliveryId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getReplacedDeliveryId();

	/**
	 * Sets the value of the '{@link Gtm.Delivery#getReplacedDeliveryId <em>Replaced Delivery Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replaced Delivery Id</em>' attribute.
	 * @see #isSetReplacedDeliveryId()
	 * @see #unsetReplacedDeliveryId()
	 * @see #getReplacedDeliveryId()
	 * @generated
	 */
	void setReplacedDeliveryId(int value);

	/**
	 * Unsets the value of the '{@link Gtm.Delivery#getReplacedDeliveryId <em>Replaced Delivery Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReplacedDeliveryId()
	 * @see #getReplacedDeliveryId()
	 * @see #setReplacedDeliveryId(int)
	 * @generated
	 */
	void unsetReplacedDeliveryId();

	/**
	 * Returns whether the value of the '{@link Gtm.Delivery#getReplacedDeliveryId <em>Replaced Delivery Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Replaced Delivery Id</em>' attribute is set.
	 * @see #unsetReplacedDeliveryId()
	 * @see #getReplacedDeliveryId()
	 * @see #setReplacedDeliveryId(int)
	 * @generated
	 */
	boolean isSetReplacedDeliveryId();

	/**
	 * Returns the value of the '<em><b>Fare Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fare Provider</em>' attribute.
	 * @see #setFareProvider(String)
	 * @see Gtm.GtmPackage#getDelivery_FareProvider()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getFareProvider();

	/**
	 * Sets the value of the '{@link Gtm.Delivery#getFareProvider <em>Fare Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fare Provider</em>' attribute.
	 * @see #getFareProvider()
	 * @generated
	 */
	void setFareProvider(String value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #isSetOptional()
	 * @see #unsetOptional()
	 * @see #setOptional(boolean)
	 * @see Gtm.GtmPackage#getDelivery_Optional()
	 * @model default="false" unsettable="true" required="true"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link Gtm.Delivery#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isSetOptional()
	 * @see #unsetOptional()
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

	/**
	 * Unsets the value of the '{@link Gtm.Delivery#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOptional()
	 * @see #isOptional()
	 * @see #setOptional(boolean)
	 * @generated
	 */
	void unsetOptional();

	/**
	 * Returns whether the value of the '{@link Gtm.Delivery#isOptional <em>Optional</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Optional</em>' attribute is set.
	 * @see #unsetOptional()
	 * @see #isOptional()
	 * @see #setOptional(boolean)
	 * @generated
	 */
	boolean isSetOptional();

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' reference.
	 * @see #setProvider(Carrier)
	 * @see Gtm.GtmPackage#getDelivery_Provider()
	 * @model
	 * @generated
	 */
	Carrier getProvider();

	/**
	 * Sets the value of the '{@link Gtm.Delivery#getProvider <em>Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(Carrier value);

} // Delivery
