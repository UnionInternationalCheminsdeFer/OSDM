/**
 */
package Gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Reservation Service</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage#getReservationService()
 * @model
 * @generated
 */
public enum ReservationService implements Enumerator {
	/**
	 * The '<em><b>SEAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEAT_VALUE
	 * @generated
	 * @ordered
	 */
	SEAT(1, "SEAT", "SEAT"),

	/**
	 * The '<em><b>COUCHETTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUCHETTE_VALUE
	 * @generated
	 * @ordered
	 */
	COUCHETTE(2, "COUCHETTE", "COUCHETTE"),

	/**
	 * The '<em><b>BERTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BERTH_VALUE
	 * @generated
	 * @ordered
	 */
	BERTH(3, "BERTH", "BERTH"),

	/**
	 * The '<em><b>CAR CARRIAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAR_CARRIAGE_VALUE
	 * @generated
	 * @ordered
	 */
	CAR_CARRIAGE(6, "CAR_CARRIAGE", "CAR_CARRIAGE");

	/**
	 * The '<em><b>SEAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEAT_VALUE = 1;

	/**
	 * The '<em><b>COUCHETTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUCHETTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COUCHETTE_VALUE = 2;

	/**
	 * The '<em><b>BERTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BERTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BERTH_VALUE = 3;

	/**
	 * The '<em><b>CAR CARRIAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAR_CARRIAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CAR_CARRIAGE_VALUE = 6;

	/**
	 * An array of all the '<em><b>Reservation Service</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReservationService[] VALUES_ARRAY =
		new ReservationService[] {
			SEAT,
			COUCHETTE,
			BERTH,
			CAR_CARRIAGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Reservation Service</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReservationService> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Reservation Service</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReservationService get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReservationService result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reservation Service</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReservationService getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReservationService result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reservation Service</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReservationService get(int value) {
		switch (value) {
			case SEAT_VALUE: return SEAT;
			case COUCHETTE_VALUE: return COUCHETTE;
			case BERTH_VALUE: return BERTH;
			case CAR_CARRIAGE_VALUE: return CAR_CARRIAGE;
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
	private ReservationService(int value, String name, String literal) {
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
	
} //ReservationService
