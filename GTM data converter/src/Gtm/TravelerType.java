/**
 */
package Gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Traveler Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage#getTravelerType()
 * @model
 * @generated
 */
public enum TravelerType implements Enumerator {
	/**
	 * The '<em><b>ADULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADULT_VALUE
	 * @generated
	 * @ordered
	 */
	ADULT(1, "ADULT", "ADULT"),

	/**
	 * The '<em><b>CHILD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHILD_VALUE
	 * @generated
	 * @ordered
	 */
	CHILD(3, "CHILD", "CHILD"),

	/**
	 * The '<em><b>YOUTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YOUTH_VALUE
	 * @generated
	 * @ordered
	 */
	YOUTH(2, "YOUTH", "YOUTH"),

	/**
	 * The '<em><b>SENIOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENIOR_VALUE
	 * @generated
	 * @ordered
	 */
	SENIOR(4, "SENIOR", "SENIOR"),

	/**
	 * The '<em><b>ACCOMP PRM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCOMP_PRM_VALUE
	 * @generated
	 * @ordered
	 */
	ACCOMP_PRM(5, "ACCOMP_PRM", "ACCOMP_PRM"),

	/**
	 * The '<em><b>DOG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOG_VALUE
	 * @generated
	 * @ordered
	 */
	DOG(20, "DOG", "DOG"),

	/**
	 * The '<em><b>LUGGAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LUGGAGE_VALUE
	 * @generated
	 * @ordered
	 */
	LUGGAGE(21, "LUGGAGE", "LUGGAGE"),

	/**
	 * The '<em><b>ACCOMP DOG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCOMP_DOG_VALUE
	 * @generated
	 * @ordered
	 */
	ACCOMP_DOG(22, "ACCOMP_DOG", "ACCOMP_DOG"),

	/**
	 * The '<em><b>CAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAR_VALUE
	 * @generated
	 * @ordered
	 */
	CAR(30, "CAR", "CAR"),

	/**
	 * The '<em><b>BICYCLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BICYCLE_VALUE
	 * @generated
	 * @ordered
	 */
	BICYCLE(31, "BICYCLE", "BICYCLE"),

	/**
	 * The '<em><b>MOTOCYCLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTOCYCLE_VALUE
	 * @generated
	 * @ordered
	 */
	MOTOCYCLE(32, "MOTOCYCLE", "MOTOCYCLE"),

	/**
	 * The '<em><b>TRAILER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAILER_VALUE
	 * @generated
	 * @ordered
	 */
	TRAILER(33, "TRAILER", "TRAILER"), /**
	 * The '<em><b>GRAPHICAL RES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAPHICAL_RES_VALUE
	 * @generated
	 * @ordered
	 */
	GRAPHICAL_RES(40, "GRAPHICAL_RES", "GRAPHICAL_RES"), /**
	 * The '<em><b>OPT RESERVATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPT_RESERVATION_VALUE
	 * @generated
	 * @ordered
	 */
	OPT_RESERVATION(41, "OPT_RESERVATION", "OPT_RESERVATION");

	/**
	 * The '<em><b>ADULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADULT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADULT_VALUE = 1;

	/**
	 * The '<em><b>CHILD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHILD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHILD_VALUE = 3;

	/**
	 * The '<em><b>YOUTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YOUTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int YOUTH_VALUE = 2;

	/**
	 * The '<em><b>SENIOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENIOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SENIOR_VALUE = 4;

	/**
	 * The '<em><b>ACCOMP PRM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCOMP_PRM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACCOMP_PRM_VALUE = 5;

	/**
	 * The '<em><b>DOG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOG_VALUE = 20;

	/**
	 * The '<em><b>LUGGAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LUGGAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LUGGAGE_VALUE = 21;

	/**
	 * The '<em><b>ACCOMP DOG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCOMP_DOG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACCOMP_DOG_VALUE = 22;

	/**
	 * The '<em><b>CAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CAR_VALUE = 30;

	/**
	 * The '<em><b>BICYCLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BICYCLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BICYCLE_VALUE = 31;

	/**
	 * The '<em><b>MOTOCYCLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTOCYCLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOTOCYCLE_VALUE = 32;

	/**
	 * The '<em><b>TRAILER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAILER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRAILER_VALUE = 33;

	/**
	 * The '<em><b>GRAPHICAL RES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAPHICAL_RES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GRAPHICAL_RES_VALUE = 40;

	/**
	 * The '<em><b>OPT RESERVATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPT_RESERVATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPT_RESERVATION_VALUE = 41;

	/**
	 * An array of all the '<em><b>Traveler Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TravelerType[] VALUES_ARRAY =
		new TravelerType[] {
			ADULT,
			CHILD,
			YOUTH,
			SENIOR,
			ACCOMP_PRM,
			DOG,
			LUGGAGE,
			ACCOMP_DOG,
			CAR,
			BICYCLE,
			MOTOCYCLE,
			TRAILER,
			GRAPHICAL_RES,
			OPT_RESERVATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Traveler Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TravelerType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Traveler Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TravelerType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TravelerType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Traveler Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TravelerType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TravelerType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Traveler Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TravelerType get(int value) {
		switch (value) {
			case ADULT_VALUE: return ADULT;
			case CHILD_VALUE: return CHILD;
			case YOUTH_VALUE: return YOUTH;
			case SENIOR_VALUE: return SENIOR;
			case ACCOMP_PRM_VALUE: return ACCOMP_PRM;
			case DOG_VALUE: return DOG;
			case LUGGAGE_VALUE: return LUGGAGE;
			case ACCOMP_DOG_VALUE: return ACCOMP_DOG;
			case CAR_VALUE: return CAR;
			case BICYCLE_VALUE: return BICYCLE;
			case MOTOCYCLE_VALUE: return MOTOCYCLE;
			case TRAILER_VALUE: return TRAILER;
			case GRAPHICAL_RES_VALUE: return GRAPHICAL_RES;
			case OPT_RESERVATION_VALUE: return OPT_RESERVATION;
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
	private TravelerType(int value, String name, String literal) {
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
	
} //TravelerType
