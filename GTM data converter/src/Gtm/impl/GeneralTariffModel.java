/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Tariff Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.GeneralTariffModel#getDelivery <em>Delivery</em>}</li>
 *   <li>{@link Gtm.GeneralTariffModel#getFareStructure <em>Fare Structure</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getGeneralTariffModel()
 * @model
 * @generated
 */
public interface GeneralTariffModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Delivery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery</em>' containment reference.
	 * @see #setDelivery(Delivery)
	 * @see Gtm.GtmPackage#getGeneralTariffModel_Delivery()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Delivery getDelivery();

	/**
	 * Sets the value of the '{@link Gtm.GeneralTariffModel#getDelivery <em>Delivery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery</em>' containment reference.
	 * @see #getDelivery()
	 * @generated
	 */
	void setDelivery(Delivery value);

	/**
	 * Returns the value of the '<em><b>Fare Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fare Structure</em>' containment reference.
	 * @see #setFareStructure(FareStructure)
	 * @see Gtm.GtmPackage#getGeneralTariffModel_FareStructure()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FareStructure getFareStructure();

	/**
	 * Sets the value of the '{@link Gtm.GeneralTariffModel#getFareStructure <em>Fare Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fare Structure</em>' containment reference.
	 * @see #getFareStructure()
	 * @generated
	 */
	void setFareStructure(FareStructure value);

} // GeneralTariffModel
