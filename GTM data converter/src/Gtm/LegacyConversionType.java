/**
 */
package Gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Legacy Conversion Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage#getLegacyConversionType()
 * @model
 * @generated
 */
public enum LegacyConversionType implements Enumerator {
	/**
	 * The '<em><b>NO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_VALUE
	 * @generated
	 * @ordered
	 */
	NO(1, "NO", "NO"),

	/**
	 * The '<em><b>YES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YES_VALUE
	 * @generated
	 * @ordered
	 */
	YES(2, "YES", "YES"),

	/**
	 * The '<em><b>ONLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	ONLY(3, "ONLY", "ONLY");

	/**
	 * The '<em><b>NO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_VALUE = 1;

	/**
	 * The '<em><b>YES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int YES_VALUE = 2;

	/**
	 * The '<em><b>ONLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONLY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Legacy Conversion Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LegacyConversionType[] VALUES_ARRAY =
		new LegacyConversionType[] {
			NO,
			YES,
			ONLY,
		};

	/**
	 * A public read-only list of all the '<em><b>Legacy Conversion Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LegacyConversionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Legacy Conversion Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LegacyConversionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LegacyConversionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Legacy Conversion Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LegacyConversionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LegacyConversionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Legacy Conversion Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LegacyConversionType get(int value) {
		switch (value) {
			case NO_VALUE: return NO;
			case YES_VALUE: return YES;
			case ONLY_VALUE: return ONLY;
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
	private LegacyConversionType(int value, String name, String literal) {
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
	
} //LegacyConversionType
