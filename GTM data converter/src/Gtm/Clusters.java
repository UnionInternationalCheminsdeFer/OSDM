/**
 */
package Gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Clusters</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage#getClusters()
 * @model
 * @generated
 */
public enum Clusters implements Enumerator {
	/**
	 * The '<em><b>BUSINESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSINESS_VALUE
	 * @generated
	 * @ordered
	 */
	BUSINESS(0, "BUSINESS", "BUSINESS"),

	/**
	 * The '<em><b>FULLFLEX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULLFLEX_VALUE
	 * @generated
	 * @ordered
	 */
	FULLFLEX(1, "FULLFLEX", "FULLFLEX"),

	/**
	 * The '<em><b>SEMIFLEX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEMIFLEX_VALUE
	 * @generated
	 * @ordered
	 */
	SEMIFLEX(2, "SEMIFLEX", "SEMIFLEX"),

	/**
	 * The '<em><b>NONFLEX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONFLEX_VALUE
	 * @generated
	 * @ordered
	 */
	NONFLEX(3, "NONFLEX", "NONFLEX"),

	/**
	 * The '<em><b>PROMO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROMO_VALUE
	 * @generated
	 * @ordered
	 */
	PROMO(4, "PROMO", "PROMO");

	/**
	 * The '<em><b>BUSINESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSINESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_VALUE = 0;

	/**
	 * The '<em><b>FULLFLEX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULLFLEX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FULLFLEX_VALUE = 1;

	/**
	 * The '<em><b>SEMIFLEX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEMIFLEX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEMIFLEX_VALUE = 2;

	/**
	 * The '<em><b>NONFLEX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONFLEX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONFLEX_VALUE = 3;

	/**
	 * The '<em><b>PROMO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROMO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROMO_VALUE = 4;

	/**
	 * An array of all the '<em><b>Clusters</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Clusters[] VALUES_ARRAY =
		new Clusters[] {
			BUSINESS,
			FULLFLEX,
			SEMIFLEX,
			NONFLEX,
			PROMO,
		};

	/**
	 * A public read-only list of all the '<em><b>Clusters</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Clusters> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Clusters</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Clusters get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Clusters result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Clusters</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Clusters getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Clusters result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Clusters</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Clusters get(int value) {
		switch (value) {
			case BUSINESS_VALUE: return BUSINESS;
			case FULLFLEX_VALUE: return FULLFLEX;
			case SEMIFLEX_VALUE: return SEMIFLEX;
			case NONFLEX_VALUE: return NONFLEX;
			case PROMO_VALUE: return PROMO;
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
	private Clusters(int value, String name, String literal) {
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
	
} //Clusters
