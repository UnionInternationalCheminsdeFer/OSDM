/**
 */
package Gtm;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calendar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.Calendar#getName <em>Name</em>}</li>
 *   <li>{@link Gtm.Calendar#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.Calendar#getFromDate <em>From Date</em>}</li>
 *   <li>{@link Gtm.Calendar#getUntilDate <em>Until Date</em>}</li>
 *   <li>{@link Gtm.Calendar#getUtcOffset <em>Utc Offset</em>}</li>
 *   <li>{@link Gtm.Calendar#getDates <em>Dates</em>}</li>
 *   <li>{@link Gtm.Calendar#getDataSource <em>Data Source</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getCalendar()
 * @model
 * @generated
 */
public interface Calendar extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Gtm.GtmPackage#getCalendar_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Gtm.Calendar#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Gtm.GtmPackage#getCalendar_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Gtm.Calendar#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see Gtm.GtmPackage#getCalendar_FromDate()
	 * @model
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link Gtm.Calendar#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Until Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Until Date</em>' attribute.
	 * @see #setUntilDate(Date)
	 * @see Gtm.GtmPackage#getCalendar_UntilDate()
	 * @model
	 * @generated
	 */
	Date getUntilDate();

	/**
	 * Sets the value of the '{@link Gtm.Calendar#getUntilDate <em>Until Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Until Date</em>' attribute.
	 * @see #getUntilDate()
	 * @generated
	 */
	void setUntilDate(Date value);

	/**
	 * Returns the value of the '<em><b>Utc Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utc Offset</em>' attribute.
	 * @see #setUtcOffset(int)
	 * @see Gtm.GtmPackage#getCalendar_UtcOffset()
	 * @model
	 * @generated
	 */
	int getUtcOffset();

	/**
	 * Sets the value of the '{@link Gtm.Calendar#getUtcOffset <em>Utc Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utc Offset</em>' attribute.
	 * @see #getUtcOffset()
	 * @generated
	 */
	void setUtcOffset(int value);

	/**
	 * Returns the value of the '<em><b>Dates</b></em>' attribute list.
	 * The list contents are of type {@link java.util.Date}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dates</em>' attribute list.
	 * @see Gtm.GtmPackage#getCalendar_Dates()
	 * @model
	 * @generated
	 */
	EList<Date> getDates();

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.DataSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' attribute.
	 * @see Gtm.DataSource
	 * @see #setDataSource(DataSource)
	 * @see Gtm.GtmPackage#getCalendar_DataSource()
	 * @model
	 * @generated
	 */
	DataSource getDataSource();

	/**
	 * Sets the value of the '{@link Gtm.Calendar#getDataSource <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' attribute.
	 * @see Gtm.DataSource
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(DataSource value);

} // Calendar
