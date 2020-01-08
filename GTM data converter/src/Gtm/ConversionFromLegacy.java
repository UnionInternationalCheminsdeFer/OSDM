/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conversion From Legacy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.ConversionFromLegacy#getLegacy108 <em>Legacy108</em>}</li>
 *   <li>{@link Gtm.ConversionFromLegacy#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getConversionFromLegacy()
 * @model
 * @generated
 */
public interface ConversionFromLegacy extends EObject {
	/**
	 * Returns the value of the '<em><b>Legacy108</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy108</em>' containment reference.
	 * @see #setLegacy108(Legacy108)
	 * @see Gtm.GtmPackage#getConversionFromLegacy_Legacy108()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Legacy108 getLegacy108();

	/**
	 * Sets the value of the '{@link Gtm.ConversionFromLegacy#getLegacy108 <em>Legacy108</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legacy108</em>' containment reference.
	 * @see #getLegacy108()
	 * @generated
	 */
	void setLegacy108(Legacy108 value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference.
	 * @see #setParams(CoversionParams)
	 * @see Gtm.GtmPackage#getConversionFromLegacy_Params()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CoversionParams getParams();

	/**
	 * Sets the value of the '{@link Gtm.ConversionFromLegacy#getParams <em>Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Params</em>' containment reference.
	 * @see #getParams()
	 * @generated
	 */
	void setParams(CoversionParams value);

} // ConversionFromLegacy
