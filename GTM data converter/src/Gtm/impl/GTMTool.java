/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GTM Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.GTMTool#getConversionFromLegacy <em>Conversion From Legacy</em>}</li>
 *   <li>{@link Gtm.GTMTool#getCodeLists <em>Code Lists</em>}</li>
 *   <li>{@link Gtm.GTMTool#getGeneralTariffModel <em>General Tariff Model</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getGTMTool()
 * @model
 * @generated
 */
public interface GTMTool extends EObject {
	/**
	 * Returns the value of the '<em><b>Conversion From Legacy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversion From Legacy</em>' containment reference.
	 * @see #setConversionFromLegacy(ConversionFromLegacy)
	 * @see Gtm.GtmPackage#getGTMTool_ConversionFromLegacy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConversionFromLegacy getConversionFromLegacy();

	/**
	 * Sets the value of the '{@link Gtm.GTMTool#getConversionFromLegacy <em>Conversion From Legacy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversion From Legacy</em>' containment reference.
	 * @see #getConversionFromLegacy()
	 * @generated
	 */
	void setConversionFromLegacy(ConversionFromLegacy value);

	/**
	 * Returns the value of the '<em><b>Code Lists</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Lists</em>' containment reference.
	 * @see #setCodeLists(CodeLists)
	 * @see Gtm.GtmPackage#getGTMTool_CodeLists()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeLists getCodeLists();

	/**
	 * Sets the value of the '{@link Gtm.GTMTool#getCodeLists <em>Code Lists</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Lists</em>' containment reference.
	 * @see #getCodeLists()
	 * @generated
	 */
	void setCodeLists(CodeLists value);

	/**
	 * Returns the value of the '<em><b>General Tariff Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Tariff Model</em>' containment reference.
	 * @see #setGeneralTariffModel(GeneralTariffModel)
	 * @see Gtm.GtmPackage#getGTMTool_GeneralTariffModel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GeneralTariffModel getGeneralTariffModel();

	/**
	 * Sets the value of the '{@link Gtm.GTMTool#getGeneralTariffModel <em>General Tariff Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Tariff Model</em>' containment reference.
	 * @see #getGeneralTariffModel()
	 * @generated
	 */
	void setGeneralTariffModel(GeneralTariffModel value);

} // GTMTool
