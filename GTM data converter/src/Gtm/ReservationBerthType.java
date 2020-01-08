/**
 */
package Gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Reservation Berth Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage#getReservationBerthType()
 * @model
 * @generated
 */
public enum ReservationBerthType implements Enumerator {
	/**
	 * The '<em><b>SINGLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLE(1, "SINGLE", "SINGLE"),

	/**
	 * The '<em><b>SPECIAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIAL_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIAL(2, "SPECIAL", "SPECIAL"),

	/**
	 * The '<em><b>DOUBLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE(3, "DOUBLE", "DOUBLE"),

	/**
	 * The '<em><b>T2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #T2_VALUE
	 * @generated
	 * @ordered
	 */
	T2(4, "T2", "T2"),

	/**
	 * The '<em><b>T3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #T3_VALUE
	 * @generated
	 * @ordered
	 */
	T3(5, "T3", "T3"),

	/**
	 * The '<em><b>T4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #T4_VALUE
	 * @generated
	 * @ordered
	 */
	T4(6, "T4", "T4");

	/**
	 * The '<em><b>SINGLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE_VALUE = 1;

	/**
	 * The '<em><b>SPECIAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPECIAL_VALUE = 2;

	/**
	 * The '<em><b>DOUBLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_VALUE = 3;

	/**
	 * The '<em><b>T2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #T2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int T2_VALUE = 4;

	/**
	 * The '<em><b>T3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #T3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int T3_VALUE = 5;

	/**
	 * The '<em><b>T4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #T4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int T4_VALUE = 6;

	/**
	 * An array of all the '<em><b>Reservation Berth Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReservationBerthType[] VALUES_ARRAY =
		new ReservationBerthType[] {
			SINGLE,
			SPECIAL,
			DOUBLE,
			T2,
			T3,
			T4,
		};

	/**
	 * A public read-only list of all the '<em><b>Reservation Berth Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReservationBerthType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Reservation Berth Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReservationBerthType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReservationBerthType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reservation Berth Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReservationBerthType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReservationBerthType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reservation Berth Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReservationBerthType get(int value) {
		switch (value) {
			case SINGLE_VALUE: return SINGLE;
			case SPECIAL_VALUE: return SPECIAL;
			case DOUBLE_VALUE: return DOUBLE;
			case T2_VALUE: return T2;
			case T3_VALUE: return T3;
			case T4_VALUE: return T4;
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
	private ReservationBerthType(int value, String name, String literal) {
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
	
} //ReservationBerthType
