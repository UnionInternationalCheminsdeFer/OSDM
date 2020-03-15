/**
 */
package Gtm;

import java.util.Date;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Separate Contract Series</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.LegacySeparateContractSeries#getSeriesNumber <em>Series Number</em>}</li>
 *   <li>{@link Gtm.LegacySeparateContractSeries#getValidFrom <em>Valid From</em>}</li>
 *   <li>{@link Gtm.LegacySeparateContractSeries#getValidUntil <em>Valid Until</em>}</li>
 *   <li>{@link Gtm.LegacySeparateContractSeries#getSeries <em>Series</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacySeparateContractSeries()
 * @model
 * @generated
 */
public interface LegacySeparateContractSeries extends EObject {
	/**
	 * Returns the value of the '<em><b>Series Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series Number</em>' attribute.
	 * @see #setSeriesNumber(int)
	 * @see Gtm.GtmPackage#getLegacySeparateContractSeries_SeriesNumber()
	 * @model
	 * @generated
	 */
	int getSeriesNumber();

	/**
	 * Sets the value of the '{@link Gtm.LegacySeparateContractSeries#getSeriesNumber <em>Series Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series Number</em>' attribute.
	 * @see #getSeriesNumber()
	 * @generated
	 */
	void setSeriesNumber(int value);

	/**
	 * Returns the value of the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid From</em>' attribute.
	 * @see #setValidFrom(Date)
	 * @see Gtm.GtmPackage#getLegacySeparateContractSeries_ValidFrom()
	 * @model required="true"
	 * @generated
	 */
	Date getValidFrom();

	/**
	 * Sets the value of the '{@link Gtm.LegacySeparateContractSeries#getValidFrom <em>Valid From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid From</em>' attribute.
	 * @see #getValidFrom()
	 * @generated
	 */
	void setValidFrom(Date value);

	/**
	 * Returns the value of the '<em><b>Valid Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Until</em>' attribute.
	 * @see #setValidUntil(Date)
	 * @see Gtm.GtmPackage#getLegacySeparateContractSeries_ValidUntil()
	 * @model required="true"
	 * @generated
	 */
	Date getValidUntil();

	/**
	 * Sets the value of the '{@link Gtm.LegacySeparateContractSeries#getValidUntil <em>Valid Until</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Until</em>' attribute.
	 * @see #getValidUntil()
	 * @generated
	 */
	void setValidUntil(Date value);

	/**
	 * Returns the value of the '<em><b>Series</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series</em>' reference.
	 * @see #setSeries(LegacySeries)
	 * @see Gtm.GtmPackage#getLegacySeparateContractSeries_Series()
	 * @model
	 * @generated
	 */
	LegacySeries getSeries();

	/**
	 * Sets the value of the '{@link Gtm.LegacySeparateContractSeries#getSeries <em>Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series</em>' reference.
	 * @see #getSeries()
	 * @generated
	 */
	void setSeries(LegacySeries value);

} // LegacySeparateContractSeries
