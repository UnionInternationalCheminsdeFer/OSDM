/**
 */
package Gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Geo Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage#getGeoUnit()
 * @model
 * @generated
 */
public enum GeoUnit implements Enumerator {
	/**
	 * The '<em><b>Micro Degree</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICRO_DEGREE_VALUE
	 * @generated
	 * @ordered
	 */
	MICRO_DEGREE(0, "microDegree", "microDegree"),

	/**
	 * The '<em><b>Tenthmilli Degree</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TENTHMILLI_DEGREE_VALUE
	 * @generated
	 * @ordered
	 */
	TENTHMILLI_DEGREE(1, "tenthmilliDegree", "tenthmilliDegree"),

	/**
	 * The '<em><b>Milli Degree</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILLI_DEGREE_VALUE
	 * @generated
	 * @ordered
	 */
	MILLI_DEGREE(2, "milliDegree", "milliDegree"),

	/**
	 * The '<em><b>Centi Degree</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTI_DEGREE_VALUE
	 * @generated
	 * @ordered
	 */
	CENTI_DEGREE(3, "centiDegree", "centiDegree"),

	/**
	 * The '<em><b>Deci Degree</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECI_DEGREE_VALUE
	 * @generated
	 * @ordered
	 */
	DECI_DEGREE(4, "deciDegree", "deciDegree");

	/**
	 * The '<em><b>Micro Degree</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICRO_DEGREE
	 * @model name="microDegree"
	 * @generated
	 * @ordered
	 */
	public static final int MICRO_DEGREE_VALUE = 0;

	/**
	 * The '<em><b>Tenthmilli Degree</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TENTHMILLI_DEGREE
	 * @model name="tenthmilliDegree"
	 * @generated
	 * @ordered
	 */
	public static final int TENTHMILLI_DEGREE_VALUE = 1;

	/**
	 * The '<em><b>Milli Degree</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILLI_DEGREE
	 * @model name="milliDegree"
	 * @generated
	 * @ordered
	 */
	public static final int MILLI_DEGREE_VALUE = 2;

	/**
	 * The '<em><b>Centi Degree</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTI_DEGREE
	 * @model name="centiDegree"
	 * @generated
	 * @ordered
	 */
	public static final int CENTI_DEGREE_VALUE = 3;

	/**
	 * The '<em><b>Deci Degree</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECI_DEGREE
	 * @model name="deciDegree"
	 * @generated
	 * @ordered
	 */
	public static final int DECI_DEGREE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Geo Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GeoUnit[] VALUES_ARRAY =
		new GeoUnit[] {
			MICRO_DEGREE,
			TENTHMILLI_DEGREE,
			MILLI_DEGREE,
			CENTI_DEGREE,
			DECI_DEGREE,
		};

	/**
	 * A public read-only list of all the '<em><b>Geo Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GeoUnit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Geo Unit</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GeoUnit get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GeoUnit result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Geo Unit</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GeoUnit getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GeoUnit result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Geo Unit</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GeoUnit get(int value) {
		switch (value) {
			case MICRO_DEGREE_VALUE: return MICRO_DEGREE;
			case TENTHMILLI_DEGREE_VALUE: return TENTHMILLI_DEGREE;
			case MILLI_DEGREE_VALUE: return MILLI_DEGREE;
			case CENTI_DEGREE_VALUE: return CENTI_DEGREE;
			case DECI_DEGREE_VALUE: return DECI_DEGREE;
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
	private GeoUnit(int value, String name, String literal) {
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
	
} //GeoUnit
