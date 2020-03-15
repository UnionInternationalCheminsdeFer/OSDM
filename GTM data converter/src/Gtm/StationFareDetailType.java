/**
 */
package Gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Station Fare Detail Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage#getStationFareDetailType()
 * @model
 * @generated
 */
public enum StationFareDetailType implements Enumerator {
	/**
	 * The '<em><b>NO DESCRIPTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_DESCRIPTION_VALUE
	 * @generated
	 * @ordered
	 */
	NO_DESCRIPTION(0, "NO_DESCRIPTION", "NO_DESCRIPTION"),

	/**
	 * The '<em><b>ON ARRIVAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_ARRIVAL_VALUE
	 * @generated
	 * @ordered
	 */
	ON_ARRIVAL(0, "ON_ARRIVAL", "ON_ARRIVAL"),

	/**
	 * The '<em><b>ON DEPARTURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_DEPARTURE_VALUE
	 * @generated
	 * @ordered
	 */
	ON_DEPARTURE(0, "ON_DEPARTURE", "ON_DEPARTURE"),

	/**
	 * The '<em><b>ON ARRIVAL ON DEPARTURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_ARRIVAL_ON_DEPARTURE_VALUE
	 * @generated
	 * @ordered
	 */
	ON_ARRIVAL_ON_DEPARTURE(0, "ON_ARRIVAL_ON__DEPARTURE", "ON_ARRIVAL_ON__DEPARTURE");

	/**
	 * The '<em><b>NO DESCRIPTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_DESCRIPTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_DESCRIPTION_VALUE = 0;

	/**
	 * The '<em><b>ON ARRIVAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_ARRIVAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ON_ARRIVAL_VALUE = 0;

	/**
	 * The '<em><b>ON DEPARTURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_DEPARTURE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ON_DEPARTURE_VALUE = 0;

	/**
	 * The '<em><b>ON ARRIVAL ON DEPARTURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_ARRIVAL_ON_DEPARTURE
	 * @model name="ON_ARRIVAL_ON__DEPARTURE"
	 * @generated
	 * @ordered
	 */
	public static final int ON_ARRIVAL_ON_DEPARTURE_VALUE = 0;

	/**
	 * An array of all the '<em><b>Station Fare Detail Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StationFareDetailType[] VALUES_ARRAY =
		new StationFareDetailType[] {
			NO_DESCRIPTION,
			ON_ARRIVAL,
			ON_DEPARTURE,
			ON_ARRIVAL_ON_DEPARTURE,
		};

	/**
	 * A public read-only list of all the '<em><b>Station Fare Detail Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StationFareDetailType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Station Fare Detail Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StationFareDetailType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StationFareDetailType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Station Fare Detail Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StationFareDetailType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StationFareDetailType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Station Fare Detail Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StationFareDetailType get(int value) {
		switch (value) {
			case NO_DESCRIPTION_VALUE: return NO_DESCRIPTION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StationFareDetailType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //StationFareDetailType
