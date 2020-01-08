/**
 */
package Gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Time Range Scope</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage#getTimeRangeScope()
 * @model
 * @generated
 */
public enum TimeRangeScope implements Enumerator {
	/**
	 * The '<em><b>START OF TRAVEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START_OF_TRAVEL_VALUE
	 * @generated
	 * @ordered
	 */
	START_OF_TRAVEL(1, "START_OF_TRAVEL", "START_OF_TRAVEL"),

	/**
	 * The '<em><b>COMPLETE RANGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETE_RANGE_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETE_RANGE(2, "COMPLETE_RANGE", "COMPLETE_RANGE");

	/**
	 * The '<em><b>START OF TRAVEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START_OF_TRAVEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int START_OF_TRAVEL_VALUE = 1;

	/**
	 * The '<em><b>COMPLETE RANGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETE_RANGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETE_RANGE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Time Range Scope</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TimeRangeScope[] VALUES_ARRAY =
		new TimeRangeScope[] {
			START_OF_TRAVEL,
			COMPLETE_RANGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Time Range Scope</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TimeRangeScope> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Time Range Scope</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeRangeScope get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeRangeScope result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Range Scope</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeRangeScope getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeRangeScope result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Range Scope</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeRangeScope get(int value) {
		switch (value) {
			case START_OF_TRAVEL_VALUE: return START_OF_TRAVEL;
			case COMPLETE_RANGE_VALUE: return COMPLETE_RANGE;
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
	private TimeRangeScope(int value, String name, String literal) {
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
	
} //TimeRangeScope
