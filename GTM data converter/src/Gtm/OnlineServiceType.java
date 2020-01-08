/**
 */
package Gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Online Service Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage#getOnlineServiceType()
 * @model
 * @generated
 */
public enum OnlineServiceType implements Enumerator {
	/**
	 * The '<em><b>OFFER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFFER_VALUE
	 * @generated
	 * @ordered
	 */
	OFFER(1, "OFFER", "OFFER"),

	/**
	 * The '<em><b>BOOKING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOKING_VALUE
	 * @generated
	 * @ordered
	 */
	BOOKING(2, "BOOKING", "BOOKING"),

	/**
	 * The '<em><b>RESERVATION LEGACY 918 1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESERVATION_LEGACY_918_1_VALUE
	 * @generated
	 * @ordered
	 */
	RESERVATION_LEGACY_918_1(3, "RESERVATION_LEGACY_918_1", "RESERVATION_LEGACY_918_1"),

	/**
	 * The '<em><b>RESERVATION PREF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESERVATION_PREF_VALUE
	 * @generated
	 * @ordered
	 */
	RESERVATION_PREF(4, "RESERVATION_PREF", "RESERVATION_PREF"),

	/**
	 * The '<em><b>RESERVATION GRAPH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESERVATION_GRAPH_VALUE
	 * @generated
	 * @ordered
	 */
	RESERVATION_GRAPH(6, "RESERVATION_GRAPH", "RESERVATION_GRAPH"),

	/**
	 * The '<em><b>INCREASE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCREASE_VALUE
	 * @generated
	 * @ordered
	 */
	INCREASE(7, "INCREASE", "INCREASE"),

	/**
	 * The '<em><b>DECREASE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECREASE_VALUE
	 * @generated
	 * @ordered
	 */
	DECREASE(8, "DECREASE", "DECREASE"),

	/**
	 * The '<em><b>EXCHANGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCHANGE_VALUE
	 * @generated
	 * @ordered
	 */
	EXCHANGE(9, "EXCHANGE", "EXCHANGE"),

	/**
	 * The '<em><b>FULFILLMENT ITEMS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULFILLMENT_ITEMS_VALUE
	 * @generated
	 * @ordered
	 */
	FULFILLMENT_ITEMS(10, "FULFILLMENT_ITEMS", "FULFILLMENT_ITEMS"),

	/**
	 * The '<em><b>FULFILLMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULFILLMENT_VALUE
	 * @generated
	 * @ordered
	 */
	FULFILLMENT(12, "FULFILLMENT", "FULFILLMENT");

	/**
	 * The '<em><b>OFFER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFFER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OFFER_VALUE = 1;

	/**
	 * The '<em><b>BOOKING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOKING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOOKING_VALUE = 2;

	/**
	 * The '<em><b>RESERVATION LEGACY 918 1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESERVATION_LEGACY_918_1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESERVATION_LEGACY_918_1_VALUE = 3;

	/**
	 * The '<em><b>RESERVATION PREF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESERVATION_PREF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESERVATION_PREF_VALUE = 4;

	/**
	 * The '<em><b>RESERVATION GRAPH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESERVATION_GRAPH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESERVATION_GRAPH_VALUE = 6;

	/**
	 * The '<em><b>INCREASE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCREASE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INCREASE_VALUE = 7;

	/**
	 * The '<em><b>DECREASE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECREASE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DECREASE_VALUE = 8;

	/**
	 * The '<em><b>EXCHANGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCHANGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXCHANGE_VALUE = 9;

	/**
	 * The '<em><b>FULFILLMENT ITEMS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULFILLMENT_ITEMS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FULFILLMENT_ITEMS_VALUE = 10;

	/**
	 * The '<em><b>FULFILLMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULFILLMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FULFILLMENT_VALUE = 12;

	/**
	 * An array of all the '<em><b>Online Service Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OnlineServiceType[] VALUES_ARRAY =
		new OnlineServiceType[] {
			OFFER,
			BOOKING,
			RESERVATION_LEGACY_918_1,
			RESERVATION_PREF,
			RESERVATION_GRAPH,
			INCREASE,
			DECREASE,
			EXCHANGE,
			FULFILLMENT_ITEMS,
			FULFILLMENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Online Service Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OnlineServiceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Online Service Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OnlineServiceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OnlineServiceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Online Service Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OnlineServiceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OnlineServiceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Online Service Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OnlineServiceType get(int value) {
		switch (value) {
			case OFFER_VALUE: return OFFER;
			case BOOKING_VALUE: return BOOKING;
			case RESERVATION_LEGACY_918_1_VALUE: return RESERVATION_LEGACY_918_1;
			case RESERVATION_PREF_VALUE: return RESERVATION_PREF;
			case RESERVATION_GRAPH_VALUE: return RESERVATION_GRAPH;
			case INCREASE_VALUE: return INCREASE;
			case DECREASE_VALUE: return DECREASE;
			case EXCHANGE_VALUE: return EXCHANGE;
			case FULFILLMENT_ITEMS_VALUE: return FULFILLMENT_ITEMS;
			case FULFILLMENT_VALUE: return FULFILLMENT;
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
	private OnlineServiceType(int value, String name, String literal) {
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
	
} //OnlineServiceType
