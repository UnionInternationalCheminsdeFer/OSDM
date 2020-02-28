/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Price</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.Price#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.Price#getCurrencies <em>Currencies</em>}</li>
 *   <li>{@link Gtm.Price#getDataSource <em>Data Source</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getPrice()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AT_LEAST_ONE_PRICE'"
 * @generated
 */
public interface Price extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Gtm.GtmPackage#getPrice_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Gtm.Price#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Currencies</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.CurrencyPrice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currencies</em>' containment reference list.
	 * @see Gtm.GtmPackage#getPrice_Currencies()
	 * @model containment="true"
	 * @generated
	 */
	EList<CurrencyPrice> getCurrencies();

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.DataSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' attribute.
	 * @see Gtm.DataSource
	 * @see #setDataSource(DataSource)
	 * @see Gtm.GtmPackage#getPrice_DataSource()
	 * @model
	 * @generated
	 */
	DataSource getDataSource();

	/**
	 * Sets the value of the '{@link Gtm.Price#getDataSource <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' attribute.
	 * @see Gtm.DataSource
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(DataSource value);

} // Price
