/**
 */
package Gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tax Scope</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage#getTaxScope()
 * @model
 * @generated
 */
public enum TaxScope implements Enumerator {
	/**
	 * The '<em><b>INTERNALTIONAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNALTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	INTERNALTIONAL(1, "INTERNALTIONAL", "INTERNALTIONAL"),

	/**
	 * The '<em><b>NATIONAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	NATIONAL(2, "NATIONAL", "NATIONAL"),

	/**
	 * The '<em><b>SHORT DISTANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHORT_DISTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	SHORT_DISTANCE(3, "SHORT_DISTANCE", "SHORT_DISTANCE"),

	/**
	 * The '<em><b>LONG DISTANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG_DISTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	LONG_DISTANCE(4, "LONG_DISTANCE", "LONG_DISTANCE"),

	/**
	 * The '<em><b>ANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_VALUE
	 * @generated
	 * @ordered
	 */
	ANY(0, "ANY", "ANY");

	/**
	 * The '<em><b>INTERNALTIONAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNALTIONAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTERNALTIONAL_VALUE = 1;

	/**
	 * The '<em><b>NATIONAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATIONAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NATIONAL_VALUE = 2;

	/**
	 * The '<em><b>SHORT DISTANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHORT_DISTANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHORT_DISTANCE_VALUE = 3;

	/**
	 * The '<em><b>LONG DISTANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG_DISTANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LONG_DISTANCE_VALUE = 4;

	/**
	 * The '<em><b>ANY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANY_VALUE = 0;

	/**
	 * An array of all the '<em><b>Tax Scope</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TaxScope[] VALUES_ARRAY =
		new TaxScope[] {
			INTERNALTIONAL,
			NATIONAL,
			SHORT_DISTANCE,
			LONG_DISTANCE,
			ANY,
		};

	/**
	 * A public read-only list of all the '<em><b>Tax Scope</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TaxScope> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tax Scope</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TaxScope get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TaxScope result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tax Scope</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TaxScope getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TaxScope result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tax Scope</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TaxScope get(int value) {
		switch (value) {
			case INTERNALTIONAL_VALUE: return INTERNALTIONAL;
			case NATIONAL_VALUE: return NATIONAL;
			case SHORT_DISTANCE_VALUE: return SHORT_DISTANCE;
			case LONG_DISTANCE_VALUE: return LONG_DISTANCE;
			case ANY_VALUE: return ANY;
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
	private TaxScope(int value, String name, String literal) {
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
	
} //TaxScope
