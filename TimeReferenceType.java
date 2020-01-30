/**
 */
package Gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Time Reference Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage#getTimeReferenceType()
 * @model
 * @generated
 */
public enum TimeReferenceType implements Enumerator {
	/**
	 * The '<em><b>BEFORE DEPARTURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE_DEPARTURE_VALUE
	 * @generated
	 * @ordered
	 */
	BEFORE_DEPARTURE(1, "BEFORE_DEPARTURE", "BEFORE_DEPARTURE"),

	/**
	 * The '<em><b>AFTER DEPARTURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFTER_DEPARTURE_VALUE
	 * @generated
	 * @ordered
	 */
	AFTER_DEPARTURE(2, "AFTER_DEPARTURE", "AFTER_DEPARTURE"),

	/**
	 * The '<em><b>BEFORE VALIDITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE_VALIDITY_VALUE
	 * @generated
	 * @ordered
	 */
	BEFORE_VALIDITY(3, "BEFORE_VALIDITY", "BEFORE_VALIDITY"), /**
	 * The '<em><b>BEFORE START VALIDITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE_START_VALIDITY_VALUE
	 * @generated
	 * @ordered
	 */
	BEFORE_START_VALIDITY(4, "BEFORE_START_VALIDITY", "BEFORE_START_VALIDITY"), /**
	 * The '<em><b>AFTER END VALIDITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFTER_END_VALIDITY_VALUE
	 * @generated
	 * @ordered
	 */
	AFTER_END_VALIDITY(5, "AFTER_END_VALIDITY", "AFTER_END_VALIDITY");

	/**
	 * The '<em><b>BEFORE DEPARTURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE_DEPARTURE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BEFORE_DEPARTURE_VALUE = 1;

	/**
	 * The '<em><b>AFTER DEPARTURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFTER_DEPARTURE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AFTER_DEPARTURE_VALUE = 2;

	/**
	 * The '<em><b>BEFORE VALIDITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE_VALIDITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BEFORE_VALIDITY_VALUE = 3;

	/**
	 * The '<em><b>BEFORE START VALIDITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE_START_VALIDITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BEFORE_START_VALIDITY_VALUE = 4;

	/**
	 * The '<em><b>AFTER END VALIDITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFTER_END_VALIDITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AFTER_END_VALIDITY_VALUE = 5;

	/**
	 * An array of all the '<em><b>Time Reference Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TimeReferenceType[] VALUES_ARRAY =
		new TimeReferenceType[] {
			BEFORE_DEPARTURE,
			AFTER_DEPARTURE,
			BEFORE_VALIDITY,
			BEFORE_START_VALIDITY,
			AFTER_END_VALIDITY,
		};

	/**
	 * A public read-only list of all the '<em><b>Time Reference Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TimeReferenceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Time Reference Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeReferenceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeReferenceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Reference Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeReferenceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeReferenceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Reference Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeReferenceType get(int value) {
		switch (value) {
			case BEFORE_DEPARTURE_VALUE: return BEFORE_DEPARTURE;
			case AFTER_DEPARTURE_VALUE: return AFTER_DEPARTURE;
			case BEFORE_VALIDITY_VALUE: return BEFORE_VALIDITY;
			case BEFORE_START_VALIDITY_VALUE: return BEFORE_START_VALIDITY;
			case AFTER_END_VALIDITY_VALUE: return AFTER_END_VALIDITY;
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
	private TimeReferenceType(int value, String name, String literal) {
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
	
} //TimeReferenceType
