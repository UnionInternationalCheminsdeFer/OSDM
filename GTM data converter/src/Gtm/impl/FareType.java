/**
 */
package Gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Fare Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage#getFareType()
 * @model
 * @generated
 */
public enum FareType implements Enumerator {
	/**
	 * The '<em><b>NRT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NRT_VALUE
	 * @generated
	 * @ordered
	 */
	NRT(0, "NRT", "NRT"),

	/**
	 * The '<em><b>IRT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IRT_VALUE
	 * @generated
	 * @ordered
	 */
	IRT(1, "IRT", "IRT"),

	/**
	 * The '<em><b>RES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RES_VALUE
	 * @generated
	 * @ordered
	 */
	RES(2, "RES", "RES"),

	/**
	 * The '<em><b>RPT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RPT_VALUE
	 * @generated
	 * @ordered
	 */
	RPT(3, "RPT", "RPT");

	/**
	 * The '<em><b>NRT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NRT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NRT_VALUE = 0;

	/**
	 * The '<em><b>IRT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IRT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IRT_VALUE = 1;

	/**
	 * The '<em><b>RES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RES_VALUE = 2;

	/**
	 * The '<em><b>RPT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RPT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RPT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Fare Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FareType[] VALUES_ARRAY =
		new FareType[] {
			NRT,
			IRT,
			RES,
			RPT,
		};

	/**
	 * A public read-only list of all the '<em><b>Fare Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FareType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Fare Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FareType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FareType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fare Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FareType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FareType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fare Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FareType get(int value) {
		switch (value) {
			case NRT_VALUE: return NRT;
			case IRT_VALUE: return IRT;
			case RES_VALUE: return RES;
			case RPT_VALUE: return RPT;
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
	private FareType(int value, String name, String literal) {
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
	
} //FareType
