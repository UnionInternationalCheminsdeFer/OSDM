/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy108 Fare Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.Legacy108FareDescription#getTableId <em>Table Id</em>}</li>
 *   <li>{@link Gtm.Legacy108FareDescription#getDescriptionFr <em>Description Fr</em>}</li>
 *   <li>{@link Gtm.Legacy108FareDescription#getDescriptionGe <em>Description Ge</em>}</li>
 *   <li>{@link Gtm.Legacy108FareDescription#getDescriptionEn <em>Description En</em>}</li>
 *   <li>{@link Gtm.Legacy108FareDescription#getDescriptionLocal <em>Description Local</em>}</li>
 *   <li>{@link Gtm.Legacy108FareDescription#getCalculationType <em>Calculation Type</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacy108FareDescription()
 * @model
 * @generated
 */
public interface Legacy108FareDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Table Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Id</em>' attribute.
	 * @see #setTableId(int)
	 * @see Gtm.GtmPackage#getLegacy108FareDescription_TableId()
	 * @model
	 * @generated
	 */
	int getTableId();

	/**
	 * Sets the value of the '{@link Gtm.Legacy108FareDescription#getTableId <em>Table Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Id</em>' attribute.
	 * @see #getTableId()
	 * @generated
	 */
	void setTableId(int value);

	/**
	 * Returns the value of the '<em><b>Description Fr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Fr</em>' attribute.
	 * @see #setDescriptionFr(String)
	 * @see Gtm.GtmPackage#getLegacy108FareDescription_DescriptionFr()
	 * @model
	 * @generated
	 */
	String getDescriptionFr();

	/**
	 * Sets the value of the '{@link Gtm.Legacy108FareDescription#getDescriptionFr <em>Description Fr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Fr</em>' attribute.
	 * @see #getDescriptionFr()
	 * @generated
	 */
	void setDescriptionFr(String value);

	/**
	 * Returns the value of the '<em><b>Description Ge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Ge</em>' attribute.
	 * @see #setDescriptionGe(String)
	 * @see Gtm.GtmPackage#getLegacy108FareDescription_DescriptionGe()
	 * @model
	 * @generated
	 */
	String getDescriptionGe();

	/**
	 * Sets the value of the '{@link Gtm.Legacy108FareDescription#getDescriptionGe <em>Description Ge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Ge</em>' attribute.
	 * @see #getDescriptionGe()
	 * @generated
	 */
	void setDescriptionGe(String value);

	/**
	 * Returns the value of the '<em><b>Description En</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description En</em>' attribute.
	 * @see #setDescriptionEn(String)
	 * @see Gtm.GtmPackage#getLegacy108FareDescription_DescriptionEn()
	 * @model
	 * @generated
	 */
	String getDescriptionEn();

	/**
	 * Sets the value of the '{@link Gtm.Legacy108FareDescription#getDescriptionEn <em>Description En</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description En</em>' attribute.
	 * @see #getDescriptionEn()
	 * @generated
	 */
	void setDescriptionEn(String value);

	/**
	 * Returns the value of the '<em><b>Description Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Local</em>' attribute.
	 * @see #setDescriptionLocal(String)
	 * @see Gtm.GtmPackage#getLegacy108FareDescription_DescriptionLocal()
	 * @model
	 * @generated
	 */
	String getDescriptionLocal();

	/**
	 * Sets the value of the '{@link Gtm.Legacy108FareDescription#getDescriptionLocal <em>Description Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Local</em>' attribute.
	 * @see #getDescriptionLocal()
	 * @generated
	 */
	void setDescriptionLocal(String value);

	/**
	 * Returns the value of the '<em><b>Calculation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.LegacyCalculationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculation Type</em>' attribute.
	 * @see Gtm.LegacyCalculationType
	 * @see #setCalculationType(LegacyCalculationType)
	 * @see Gtm.GtmPackage#getLegacy108FareDescription_CalculationType()
	 * @model
	 * @generated
	 */
	LegacyCalculationType getCalculationType();

	/**
	 * Sets the value of the '{@link Gtm.Legacy108FareDescription#getCalculationType <em>Calculation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculation Type</em>' attribute.
	 * @see Gtm.LegacyCalculationType
	 * @see #getCalculationType()
	 * @generated
	 */
	void setCalculationType(LegacyCalculationType value);

} // Legacy108FareDescription
