/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Separate Contract Series List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.LegacySeparateContractSeriesList#getSeparateContractSeries <em>Separate Contract Series</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacySeparateContractSeriesList()
 * @model
 * @generated
 */
public interface LegacySeparateContractSeriesList extends EObject {
	/**
	 * Returns the value of the '<em><b>Separate Contract Series</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.LegacySeparateContractSeries}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Separate Contract Series</em>' containment reference list.
	 * @see Gtm.GtmPackage#getLegacySeparateContractSeriesList_SeparateContractSeries()
	 * @model containment="true"
	 * @generated
	 */
	EList<LegacySeparateContractSeries> getSeparateContractSeries();

} // LegacySeparateContractSeriesList
