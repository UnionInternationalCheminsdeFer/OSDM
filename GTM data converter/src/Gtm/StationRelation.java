/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Station Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.StationRelation#getRelationType <em>Relation Type</em>}</li>
 *   <li>{@link Gtm.StationRelation#getStation <em>Station</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getStationRelation()
 * @model
 * @generated
 */
public interface StationRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Relation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.StationRelationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Type</em>' attribute.
	 * @see Gtm.StationRelationType
	 * @see #setRelationType(StationRelationType)
	 * @see Gtm.GtmPackage#getStationRelation_RelationType()
	 * @model
	 * @generated
	 */
	StationRelationType getRelationType();

	/**
	 * Sets the value of the '{@link Gtm.StationRelation#getRelationType <em>Relation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation Type</em>' attribute.
	 * @see Gtm.StationRelationType
	 * @see #getRelationType()
	 * @generated
	 */
	void setRelationType(StationRelationType value);

	/**
	 * Returns the value of the '<em><b>Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station</em>' reference.
	 * @see #setStation(Station)
	 * @see Gtm.GtmPackage#getStationRelation_Station()
	 * @model
	 * @generated
	 */
	Station getStation();

	/**
	 * Sets the value of the '{@link Gtm.StationRelation#getStation <em>Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Station</em>' reference.
	 * @see #getStation()
	 * @generated
	 */
	void setStation(Station value);

} // StationRelation
