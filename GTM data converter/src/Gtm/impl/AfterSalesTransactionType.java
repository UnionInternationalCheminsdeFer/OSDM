/**
 */
package Gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>After Sales Transaction Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage#getAfterSalesTransactionType()
 * @model
 * @generated
 */
public enum AfterSalesTransactionType implements Enumerator {
	/**
	 * The '<em><b>REFUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFUND_VALUE
	 * @generated
	 * @ordered
	 */
	REFUND(1, "REFUND", "REFUND"),

	/**
	 * The '<em><b>EXCHANGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCHANGE_VALUE
	 * @generated
	 * @ordered
	 */
	EXCHANGE(2, "EXCHANGE", "EXCHANGE"),

	/**
	 * The '<em><b>EXCHANGE KEEP CARRIER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCHANGE_KEEP_CARRIER_VALUE
	 * @generated
	 * @ordered
	 */
	EXCHANGE_KEEP_CARRIER(3, "EXCHANGE_KEEP_CARRIER", "EXCHANGE_KEEP_CARRIER"),

	/**
	 * The '<em><b>EXCHANGE CHANGE CARRIER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCHANGE_CHANGE_CARRIER_VALUE
	 * @generated
	 * @ordered
	 */
	EXCHANGE_CHANGE_CARRIER(0, "EXCHANGE_CHANGE_CARRIER", "EXCHANGE_CHANGE_CARRIER");

	/**
	 * The '<em><b>REFUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REFUND_VALUE = 1;

	/**
	 * The '<em><b>EXCHANGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCHANGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXCHANGE_VALUE = 2;

	/**
	 * The '<em><b>EXCHANGE KEEP CARRIER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCHANGE_KEEP_CARRIER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXCHANGE_KEEP_CARRIER_VALUE = 3;

	/**
	 * The '<em><b>EXCHANGE CHANGE CARRIER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCHANGE_CHANGE_CARRIER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXCHANGE_CHANGE_CARRIER_VALUE = 0;

	/**
	 * An array of all the '<em><b>After Sales Transaction Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AfterSalesTransactionType[] VALUES_ARRAY =
		new AfterSalesTransactionType[] {
			REFUND,
			EXCHANGE,
			EXCHANGE_KEEP_CARRIER,
			EXCHANGE_CHANGE_CARRIER,
		};

	/**
	 * A public read-only list of all the '<em><b>After Sales Transaction Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AfterSalesTransactionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>After Sales Transaction Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AfterSalesTransactionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AfterSalesTransactionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>After Sales Transaction Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AfterSalesTransactionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AfterSalesTransactionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>After Sales Transaction Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AfterSalesTransactionType get(int value) {
		switch (value) {
			case REFUND_VALUE: return REFUND;
			case EXCHANGE_VALUE: return EXCHANGE;
			case EXCHANGE_KEEP_CARRIER_VALUE: return EXCHANGE_KEEP_CARRIER;
			case EXCHANGE_CHANGE_CARRIER_VALUE: return EXCHANGE_CHANGE_CARRIER;
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
	private AfterSalesTransactionType(int value, String name, String literal) {
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
	
} //AfterSalesTransactionType
