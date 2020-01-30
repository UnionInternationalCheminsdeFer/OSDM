/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.Text#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.Text#getTextUTF8 <em>Text UTF8</em>}</li>
 *   <li>{@link Gtm.Text#getTextICAO <em>Text ICAO</em>}</li>
 *   <li>{@link Gtm.Text#getShortTextUTF8 <em>Short Text UTF8</em>}</li>
 *   <li>{@link Gtm.Text#getShortTextICAO <em>Short Text ICAO</em>}</li>
 *   <li>{@link Gtm.Text#getTranslations <em>Translations</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getText()
 * @model
 * @generated
 */
public interface Text extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Gtm.GtmPackage#getText_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Gtm.Text#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Text UTF8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text UTF8</em>' attribute.
	 * @see #setTextUTF8(String)
	 * @see Gtm.GtmPackage#getText_TextUTF8()
	 * @model
	 * @generated
	 */
	String getTextUTF8();

	/**
	 * Sets the value of the '{@link Gtm.Text#getTextUTF8 <em>Text UTF8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text UTF8</em>' attribute.
	 * @see #getTextUTF8()
	 * @generated
	 */
	void setTextUTF8(String value);

	/**
	 * Returns the value of the '<em><b>Text ICAO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text ICAO</em>' attribute.
	 * @see #setTextICAO(String)
	 * @see Gtm.GtmPackage#getText_TextICAO()
	 * @model
	 * @generated
	 */
	String getTextICAO();

	/**
	 * Sets the value of the '{@link Gtm.Text#getTextICAO <em>Text ICAO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text ICAO</em>' attribute.
	 * @see #getTextICAO()
	 * @generated
	 */
	void setTextICAO(String value);

	/**
	 * Returns the value of the '<em><b>Short Text UTF8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Text UTF8</em>' attribute.
	 * @see #setShortTextUTF8(String)
	 * @see Gtm.GtmPackage#getText_ShortTextUTF8()
	 * @model
	 * @generated
	 */
	String getShortTextUTF8();

	/**
	 * Sets the value of the '{@link Gtm.Text#getShortTextUTF8 <em>Short Text UTF8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Text UTF8</em>' attribute.
	 * @see #getShortTextUTF8()
	 * @generated
	 */
	void setShortTextUTF8(String value);

	/**
	 * Returns the value of the '<em><b>Short Text ICAO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Text ICAO</em>' attribute.
	 * @see #setShortTextICAO(String)
	 * @see Gtm.GtmPackage#getText_ShortTextICAO()
	 * @model
	 * @generated
	 */
	String getShortTextICAO();

	/**
	 * Sets the value of the '{@link Gtm.Text#getShortTextICAO <em>Short Text ICAO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Text ICAO</em>' attribute.
	 * @see #getShortTextICAO()
	 * @generated
	 */
	void setShortTextICAO(String value);

	/**
	 * Returns the value of the '<em><b>Translations</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.Translation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translations</em>' containment reference list.
	 * @see Gtm.GtmPackage#getText_Translations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Translation> getTranslations();

} // Text
