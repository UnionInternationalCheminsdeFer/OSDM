/**
 */
package Gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Time Zone</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage#getTimeZone()
 * @model
 * @generated
 */
public enum TimeZone implements Enumerator {
	/**
	 * The '<em><b>CET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CET_VALUE
	 * @generated
	 * @ordered
	 */
	CET(1, "CET", "Central European Time"),

	/**
	 * The '<em><b>GMT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GMT_VALUE
	 * @generated
	 * @ordered
	 */
	GMT(2, "GMT", "Greenwich Mean Time"),

	/**
	 * The '<em><b>EET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EET_VALUE
	 * @generated
	 * @ordered
	 */
	EET(3, "EET", "Eastern European Time"),

	/**
	 * The '<em><b>MST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MST_VALUE
	 * @generated
	 * @ordered
	 */
	MST(4, "MST", "Moskow Standard Time"),

	/**
	 * The '<em><b>WET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WET_VALUE
	 * @generated
	 * @ordered
	 */
	WET(5, "WET", "Western European Time");

	/**
	 * The '<em><b>CET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CET
	 * @model literal="Central European Time"
	 * @generated
	 * @ordered
	 */
	public static final int CET_VALUE = 1;

	/**
	 * The '<em><b>GMT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GMT
	 * @model literal="Greenwich Mean Time"
	 * @generated
	 * @ordered
	 */
	public static final int GMT_VALUE = 2;

	/**
	 * The '<em><b>EET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EET
	 * @model literal="Eastern European Time"
	 * @generated
	 * @ordered
	 */
	public static final int EET_VALUE = 3;

	/**
	 * The '<em><b>MST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MST
	 * @model literal="Moskow Standard Time"
	 * @generated
	 * @ordered
	 */
	public static final int MST_VALUE = 4;

	/**
	 * The '<em><b>WET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WET
	 * @model literal="Western European Time"
	 * @generated
	 * @ordered
	 */
	public static final int WET_VALUE = 5;

	/**
	 * An array of all the '<em><b>Time Zone</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TimeZone[] VALUES_ARRAY =
		new TimeZone[] {
			CET,
			GMT,
			EET,
			MST,
			WET,
		};

	/**
	 * A public read-only list of all the '<em><b>Time Zone</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TimeZone> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Time Zone</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeZone get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeZone result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Zone</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeZone getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeZone result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Zone</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeZone get(int value) {
		switch (value) {
			case CET_VALUE: return CET;
			case GMT_VALUE: return GMT;
			case EET_VALUE: return EET;
			case MST_VALUE: return MST;
			case WET_VALUE: return WET;
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
	private TimeZone(int value, String name, String literal) {
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
	
} //TimeZone
