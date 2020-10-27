/**
 */
package Gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Regulatory Condition</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage#getRegulatoryCondition()
 * @model
 * @generated
 */
public enum RegulatoryCondition implements Enumerator {
	/**
	 * The '<em><b>CIV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIV_VALUE
	 * @generated
	 * @ordered
	 */
	CIV(0, "CIV", "CIV"),

	/**
	 * The '<em><b>MC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MC_VALUE
	 * @generated
	 * @ordered
	 */
	MC(1, "MC", "MC"),

	/**
	 * The '<em><b>EU PRR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EU_PRR_VALUE
	 * @generated
	 * @ordered
	 */
	EU_PRR(2, "EU_PRR", "EU_PRR");

	/**
	 * The '<em><b>CIV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CIV_VALUE = 0;

	/**
	 * The '<em><b>MC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MC_VALUE = 1;

	/**
	 * The '<em><b>EU PRR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EU_PRR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EU_PRR_VALUE = 2;

	/**
	 * An array of all the '<em><b>Regulatory Condition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RegulatoryCondition[] VALUES_ARRAY =
		new RegulatoryCondition[] {
			CIV,
			MC,
			EU_PRR,
		};

	/**
	 * A public read-only list of all the '<em><b>Regulatory Condition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RegulatoryCondition> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Regulatory Condition</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RegulatoryCondition get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RegulatoryCondition result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Regulatory Condition</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RegulatoryCondition getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RegulatoryCondition result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Regulatory Condition</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RegulatoryCondition get(int value) {
		switch (value) {
			case CIV_VALUE: return CIV;
			case MC_VALUE: return MC;
			case EU_PRR_VALUE: return EU_PRR;
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
	private RegulatoryCondition(int value, String name, String literal) {
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
	
} //RegulatoryCondition
