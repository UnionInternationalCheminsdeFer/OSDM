/**
 */
package Gtm;

import java.util.Date;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy108</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.Legacy108#getCharacterSet <em>Character Set</em>}</li>
 *   <li>{@link Gtm.Legacy108#getLegacySeriesList <em>Legacy Series List</em>}</li>
 *   <li>{@link Gtm.Legacy108#getLegacySeparateContractSeries <em>Legacy Separate Contract Series</em>}</li>
 *   <li>{@link Gtm.Legacy108#getLegacyDistanceFares <em>Legacy Distance Fares</em>}</li>
 *   <li>{@link Gtm.Legacy108#getLegacyRouteFares <em>Legacy Route Fares</em>}</li>
 *   <li>{@link Gtm.Legacy108#getLegacyStations <em>Legacy Stations</em>}</li>
 *   <li>{@link Gtm.Legacy108#getLegacyFareDescriptions <em>Legacy Fare Descriptions</em>}</li>
 *   <li>{@link Gtm.Legacy108#getTimeZone <em>Time Zone</em>}</li>
 *   <li>{@link Gtm.Legacy108#getCarrier <em>Carrier</em>}</li>
 *   <li>{@link Gtm.Legacy108#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link Gtm.Legacy108#getEndDate <em>End Date</em>}</li>
 *   <li>{@link Gtm.Legacy108#getLegacyBorderPoints <em>Legacy Border Points</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacy108()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CHARACTER_SET_MUST TIME_ZONE_MUST CARRIER_MUST'"
 * @generated
 */
public interface Legacy108 extends EObject {
	/**
	 * Returns the value of the '<em><b>Character Set</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.CharacterSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character Set</em>' attribute.
	 * @see Gtm.CharacterSet
	 * @see #setCharacterSet(CharacterSet)
	 * @see Gtm.GtmPackage#getLegacy108_CharacterSet()
	 * @model
	 * @generated
	 */
	CharacterSet getCharacterSet();

	/**
	 * Sets the value of the '{@link Gtm.Legacy108#getCharacterSet <em>Character Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Character Set</em>' attribute.
	 * @see Gtm.CharacterSet
	 * @see #getCharacterSet()
	 * @generated
	 */
	void setCharacterSet(CharacterSet value);

	/**
	 * Returns the value of the '<em><b>Legacy Series List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Series List</em>' containment reference.
	 * @see #setLegacySeriesList(LegacySeriesList)
	 * @see Gtm.GtmPackage#getLegacy108_LegacySeriesList()
	 * @model containment="true"
	 * @generated
	 */
	LegacySeriesList getLegacySeriesList();

	/**
	 * Sets the value of the '{@link Gtm.Legacy108#getLegacySeriesList <em>Legacy Series List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legacy Series List</em>' containment reference.
	 * @see #getLegacySeriesList()
	 * @generated
	 */
	void setLegacySeriesList(LegacySeriesList value);

	/**
	 * Returns the value of the '<em><b>Legacy Separate Contract Series</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Separate Contract Series</em>' containment reference.
	 * @see #setLegacySeparateContractSeries(LegacySeparateContractSeriesList)
	 * @see Gtm.GtmPackage#getLegacy108_LegacySeparateContractSeries()
	 * @model containment="true"
	 * @generated
	 */
	LegacySeparateContractSeriesList getLegacySeparateContractSeries();

	/**
	 * Sets the value of the '{@link Gtm.Legacy108#getLegacySeparateContractSeries <em>Legacy Separate Contract Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legacy Separate Contract Series</em>' containment reference.
	 * @see #getLegacySeparateContractSeries()
	 * @generated
	 */
	void setLegacySeparateContractSeries(LegacySeparateContractSeriesList value);

	/**
	 * Returns the value of the '<em><b>Legacy Distance Fares</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Distance Fares</em>' containment reference.
	 * @see #setLegacyDistanceFares(LegacyDistanceFares)
	 * @see Gtm.GtmPackage#getLegacy108_LegacyDistanceFares()
	 * @model containment="true"
	 * @generated
	 */
	LegacyDistanceFares getLegacyDistanceFares();

	/**
	 * Sets the value of the '{@link Gtm.Legacy108#getLegacyDistanceFares <em>Legacy Distance Fares</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legacy Distance Fares</em>' containment reference.
	 * @see #getLegacyDistanceFares()
	 * @generated
	 */
	void setLegacyDistanceFares(LegacyDistanceFares value);

	/**
	 * Returns the value of the '<em><b>Legacy Route Fares</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Route Fares</em>' containment reference.
	 * @see #setLegacyRouteFares(LegacyRouteFares)
	 * @see Gtm.GtmPackage#getLegacy108_LegacyRouteFares()
	 * @model containment="true"
	 * @generated
	 */
	LegacyRouteFares getLegacyRouteFares();

	/**
	 * Sets the value of the '{@link Gtm.Legacy108#getLegacyRouteFares <em>Legacy Route Fares</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legacy Route Fares</em>' containment reference.
	 * @see #getLegacyRouteFares()
	 * @generated
	 */
	void setLegacyRouteFares(LegacyRouteFares value);

	/**
	 * Returns the value of the '<em><b>Legacy Stations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Stations</em>' containment reference.
	 * @see #setLegacyStations(Legacy108Stations)
	 * @see Gtm.GtmPackage#getLegacy108_LegacyStations()
	 * @model containment="true"
	 * @generated
	 */
	Legacy108Stations getLegacyStations();

	/**
	 * Sets the value of the '{@link Gtm.Legacy108#getLegacyStations <em>Legacy Stations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legacy Stations</em>' containment reference.
	 * @see #getLegacyStations()
	 * @generated
	 */
	void setLegacyStations(Legacy108Stations value);

	/**
	 * Returns the value of the '<em><b>Legacy Fare Descriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Fare Descriptions</em>' containment reference.
	 * @see #setLegacyFareDescriptions(Legacy108FaresDescriptions)
	 * @see Gtm.GtmPackage#getLegacy108_LegacyFareDescriptions()
	 * @model containment="true"
	 * @generated
	 */
	Legacy108FaresDescriptions getLegacyFareDescriptions();

	/**
	 * Sets the value of the '{@link Gtm.Legacy108#getLegacyFareDescriptions <em>Legacy Fare Descriptions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legacy Fare Descriptions</em>' containment reference.
	 * @see #getLegacyFareDescriptions()
	 * @generated
	 */
	void setLegacyFareDescriptions(Legacy108FaresDescriptions value);

	/**
	 * Returns the value of the '<em><b>Time Zone</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.TimeZone}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Zone</em>' attribute.
	 * @see Gtm.TimeZone
	 * @see #setTimeZone(TimeZone)
	 * @see Gtm.GtmPackage#getLegacy108_TimeZone()
	 * @model
	 * @generated
	 */
	TimeZone getTimeZone();

	/**
	 * Sets the value of the '{@link Gtm.Legacy108#getTimeZone <em>Time Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Zone</em>' attribute.
	 * @see Gtm.TimeZone
	 * @see #getTimeZone()
	 * @generated
	 */
	void setTimeZone(TimeZone value);

	/**
	 * Returns the value of the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier</em>' reference.
	 * @see #setCarrier(Carrier)
	 * @see Gtm.GtmPackage#getLegacy108_Carrier()
	 * @model
	 * @generated
	 */
	Carrier getCarrier();

	/**
	 * Sets the value of the '{@link Gtm.Legacy108#getCarrier <em>Carrier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier</em>' reference.
	 * @see #getCarrier()
	 * @generated
	 */
	void setCarrier(Carrier value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see Gtm.GtmPackage#getLegacy108_StartDate()
	 * @model
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link Gtm.Legacy108#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see Gtm.GtmPackage#getLegacy108_EndDate()
	 * @model
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link Gtm.Legacy108#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Legacy Border Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Border Points</em>' containment reference.
	 * @see #setLegacyBorderPoints(LegacyBorderPoints)
	 * @see Gtm.GtmPackage#getLegacy108_LegacyBorderPoints()
	 * @model containment="true"
	 * @generated
	 */
	LegacyBorderPoints getLegacyBorderPoints();

	/**
	 * Sets the value of the '{@link Gtm.Legacy108#getLegacyBorderPoints <em>Legacy Border Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legacy Border Points</em>' containment reference.
	 * @see #getLegacyBorderPoints()
	 * @generated
	 */
	void setLegacyBorderPoints(LegacyBorderPoints value);

} // Legacy108
