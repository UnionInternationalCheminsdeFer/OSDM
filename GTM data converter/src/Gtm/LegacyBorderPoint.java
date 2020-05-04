/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Border Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.LegacyBorderPoint#getBorderPointCode <em>Border Point Code</em>}</li>
 *   <li>{@link Gtm.LegacyBorderPoint#getFakeBorderStations <em>Fake Border Stations</em>}</li>
 *   <li>{@link Gtm.LegacyBorderPoint#getOnBorderStations <em>On Border Stations</em>}</li>
 *   <li>{@link Gtm.LegacyBorderPoint#getBorderSides <em>Border Sides</em>}</li>
 *   <li>{@link Gtm.LegacyBorderPoint#getCarrier1 <em>Carrier1</em>}</li>
 *   <li>{@link Gtm.LegacyBorderPoint#getLegacyStationCode1 <em>Legacy Station Code1</em>}</li>
 *   <li>{@link Gtm.LegacyBorderPoint#getCarrier2 <em>Carrier2</em>}</li>
 *   <li>{@link Gtm.LegacyBorderPoint#getLegacyStationCode2 <em>Legacy Station Code2</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacyBorderPoint()
 * @model
 * @generated
 */
public interface LegacyBorderPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Border Point Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Point Code</em>' attribute.
	 * @see #setBorderPointCode(int)
	 * @see Gtm.GtmPackage#getLegacyBorderPoint_BorderPointCode()
	 * @model
	 * @generated
	 */
	int getBorderPointCode();

	/**
	 * Sets the value of the '{@link Gtm.LegacyBorderPoint#getBorderPointCode <em>Border Point Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Point Code</em>' attribute.
	 * @see #getBorderPointCode()
	 * @generated
	 */
	void setBorderPointCode(int value);

	/**
	 * Returns the value of the '<em><b>Fake Border Stations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fake Border Stations</em>' containment reference.
	 * @see #setFakeBorderStations(LegacyFakeBorderStations)
	 * @see Gtm.GtmPackage#getLegacyBorderPoint_FakeBorderStations()
	 * @model containment="true"
	 * @generated
	 */
	LegacyFakeBorderStations getFakeBorderStations();

	/**
	 * Sets the value of the '{@link Gtm.LegacyBorderPoint#getFakeBorderStations <em>Fake Border Stations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fake Border Stations</em>' containment reference.
	 * @see #getFakeBorderStations()
	 * @generated
	 */
	void setFakeBorderStations(LegacyFakeBorderStations value);

	/**
	 * Returns the value of the '<em><b>On Border Stations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Border Stations</em>' containment reference.
	 * @see #setOnBorderStations(OnBorderStations)
	 * @see Gtm.GtmPackage#getLegacyBorderPoint_OnBorderStations()
	 * @model containment="true"
	 * @generated
	 */
	OnBorderStations getOnBorderStations();

	/**
	 * Sets the value of the '{@link Gtm.LegacyBorderPoint#getOnBorderStations <em>On Border Stations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Border Stations</em>' containment reference.
	 * @see #getOnBorderStations()
	 * @generated
	 */
	void setOnBorderStations(OnBorderStations value);

	/**
	 * Returns the value of the '<em><b>Border Sides</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.LegacyBorderSide}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Sides</em>' containment reference list.
	 * @see Gtm.GtmPackage#getLegacyBorderPoint_BorderSides()
	 * @model containment="true"
	 * @generated
	 */
	EList<LegacyBorderSide> getBorderSides();

	/**
	 * Returns the value of the '<em><b>Carrier1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier1</em>' reference.
	 * @see #setCarrier1(Carrier)
	 * @see Gtm.GtmPackage#getLegacyBorderPoint_Carrier1()
	 * @model
	 * @generated
	 */
	Carrier getCarrier1();

	/**
	 * Sets the value of the '{@link Gtm.LegacyBorderPoint#getCarrier1 <em>Carrier1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier1</em>' reference.
	 * @see #getCarrier1()
	 * @generated
	 */
	void setCarrier1(Carrier value);

	/**
	 * Returns the value of the '<em><b>Legacy Station Code1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Station Code1</em>' attribute.
	 * @see #setLegacyStationCode1(int)
	 * @see Gtm.GtmPackage#getLegacyBorderPoint_LegacyStationCode1()
	 * @model
	 * @generated
	 */
	int getLegacyStationCode1();

	/**
	 * Sets the value of the '{@link Gtm.LegacyBorderPoint#getLegacyStationCode1 <em>Legacy Station Code1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legacy Station Code1</em>' attribute.
	 * @see #getLegacyStationCode1()
	 * @generated
	 */
	void setLegacyStationCode1(int value);

	/**
	 * Returns the value of the '<em><b>Carrier2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier2</em>' reference.
	 * @see #setCarrier2(Carrier)
	 * @see Gtm.GtmPackage#getLegacyBorderPoint_Carrier2()
	 * @model
	 * @generated
	 */
	Carrier getCarrier2();

	/**
	 * Sets the value of the '{@link Gtm.LegacyBorderPoint#getCarrier2 <em>Carrier2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier2</em>' reference.
	 * @see #getCarrier2()
	 * @generated
	 */
	void setCarrier2(Carrier value);

	/**
	 * Returns the value of the '<em><b>Legacy Station Code2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Station Code2</em>' attribute.
	 * @see #setLegacyStationCode2(int)
	 * @see Gtm.GtmPackage#getLegacyBorderPoint_LegacyStationCode2()
	 * @model
	 * @generated
	 */
	int getLegacyStationCode2();

	/**
	 * Sets the value of the '{@link Gtm.LegacyBorderPoint#getLegacyStationCode2 <em>Legacy Station Code2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legacy Station Code2</em>' attribute.
	 * @see #getLegacyStationCode2()
	 * @generated
	 */
	void setLegacyStationCode2(int value);

} // LegacyBorderPoint
