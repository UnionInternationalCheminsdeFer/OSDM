/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sales Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.SalesRestriction#getSalesDates <em>Sales Dates</em>}</li>
 *   <li>{@link Gtm.SalesRestriction#getStartOfSale <em>Start Of Sale</em>}</li>
 *   <li>{@link Gtm.SalesRestriction#getEndOfSale <em>End Of Sale</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getSalesRestriction()
 * @model
 * @generated
 */
public interface SalesRestriction extends EObject {
	/**
	 * Returns the value of the '<em><b>Sales Dates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Dates</em>' reference.
	 * @see #setSalesDates(Calendar)
	 * @see Gtm.GtmPackage#getSalesRestriction_SalesDates()
	 * @model
	 * @generated
	 */
	Calendar getSalesDates();

	/**
	 * Sets the value of the '{@link Gtm.SalesRestriction#getSalesDates <em>Sales Dates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Dates</em>' reference.
	 * @see #getSalesDates()
	 * @generated
	 */
	void setSalesDates(Calendar value);

	/**
	 * Returns the value of the '<em><b>Start Of Sale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Of Sale</em>' containment reference.
	 * @see #setStartOfSale(TimeReference)
	 * @see Gtm.GtmPackage#getSalesRestriction_StartOfSale()
	 * @model containment="true"
	 * @generated
	 */
	TimeReference getStartOfSale();

	/**
	 * Sets the value of the '{@link Gtm.SalesRestriction#getStartOfSale <em>Start Of Sale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Of Sale</em>' containment reference.
	 * @see #getStartOfSale()
	 * @generated
	 */
	void setStartOfSale(TimeReference value);

	/**
	 * Returns the value of the '<em><b>End Of Sale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Of Sale</em>' containment reference.
	 * @see #setEndOfSale(TimeReference)
	 * @see Gtm.GtmPackage#getSalesRestriction_EndOfSale()
	 * @model containment="true"
	 * @generated
	 */
	TimeReference getEndOfSale();

	/**
	 * Sets the value of the '{@link Gtm.SalesRestriction#getEndOfSale <em>End Of Sale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Of Sale</em>' containment reference.
	 * @see #getEndOfSale()
	 * @generated
	 */
	void setEndOfSale(TimeReference value);

} // SalesRestriction
