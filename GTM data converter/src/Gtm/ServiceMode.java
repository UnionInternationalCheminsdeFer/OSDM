/**
 */
package Gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Service Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage#getServiceMode()
 * @model
 * @generated
 */
public enum ServiceMode implements Enumerator {
	/**
	 * The '<em><b>HIGH SPEED TRAIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_SPEED_TRAIN_VALUE
	 * @generated
	 * @ordered
	 */
	HIGH_SPEED_TRAIN(8, "HIGH_SPEED_TRAIN", "HIGH_SPEED_TRAIN"),

	/**
	 * The '<em><b>HISTORIC TRAIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HISTORIC_TRAIN_VALUE
	 * @generated
	 * @ordered
	 */
	HISTORIC_TRAIN(16, "HISTORIC_TRAIN", "HISTORIC_TRAIN"),

	/**
	 * The '<em><b>INTERCITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERCITY_VALUE
	 * @generated
	 * @ordered
	 */
	INTERCITY(9, "INTERCITY", "INTERCITY"),

	/**
	 * The '<em><b>REGIONAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	REGIONAL(11, "REGIONAL", "REGIONAL"),

	/**
	 * The '<em><b>INTERREGIONAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERREGIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	INTERREGIONAL(10, "INTERREGIONAL", "INTERREGIONAL"),

	/**
	 * The '<em><b>TRAIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAIN_VALUE
	 * @generated
	 * @ordered
	 */
	TRAIN(37, "TRAIN", "TRAIN"),

	/**
	 * The '<em><b>URBAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URBAN_VALUE
	 * @generated
	 * @ordered
	 */
	URBAN(12, "URBAN", "URBAN"),

	/**
	 * The '<em><b>TRAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAM_VALUE
	 * @generated
	 * @ordered
	 */
	TRAM(35, "TRAM", "TRAM"),

	/**
	 * The '<em><b>UNDERGROUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDERGROUND_VALUE
	 * @generated
	 * @ordered
	 */
	UNDERGROUND(36, "UNDERGROUND", "UNDERGROUND"),

	/**
	 * The '<em><b>NIGHT TRAIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NIGHT_TRAIN_VALUE
	 * @generated
	 * @ordered
	 */
	NIGHT_TRAIN(13, "NIGHT_TRAIN", "NIGHT_TRAIN"),

	/**
	 * The '<em><b>SHARED TAXI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHARED_TAXI_VALUE
	 * @generated
	 * @ordered
	 */
	SHARED_TAXI(34, "SHARED_TAXI", "SHARED_TAXI"),

	/**
	 * The '<em><b>MOTOR RAIL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTOR_RAIL_VALUE
	 * @generated
	 * @ordered
	 */
	MOTOR_RAIL(14, "MOTOR_RAIL", "MOTOR_RAIL"),

	/**
	 * The '<em><b>MOUNTAIN TRAIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOUNTAIN_TRAIN_VALUE
	 * @generated
	 * @ordered
	 */
	MOUNTAIN_TRAIN(0, "MOUNTAIN_TRAIN", "MOUNTAIN_TRAIN"),

	/**
	 * The '<em><b>PLANE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLANE_VALUE
	 * @generated
	 * @ordered
	 */
	PLANE(3, "PLANE", "PLANE"),

	/**
	 * The '<em><b>COACH GROUP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COACH_GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	COACH_GROUP(31, "COACH_GROUP", "COACH_GROUP"),

	/**
	 * The '<em><b>SHIP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHIP_VALUE
	 * @generated
	 * @ordered
	 */
	SHIP(32, "SHIP", "SHIP"),

	/**
	 * The '<em><b>BUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUS_VALUE
	 * @generated
	 * @ordered
	 */
	BUS(33, "BUS", "BUS");

	/**
	 * The '<em><b>HIGH SPEED TRAIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_SPEED_TRAIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HIGH_SPEED_TRAIN_VALUE = 8;

	/**
	 * The '<em><b>HISTORIC TRAIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HISTORIC_TRAIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HISTORIC_TRAIN_VALUE = 16;

	/**
	 * The '<em><b>INTERCITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERCITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTERCITY_VALUE = 9;

	/**
	 * The '<em><b>REGIONAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGIONAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REGIONAL_VALUE = 11;

	/**
	 * The '<em><b>INTERREGIONAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERREGIONAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTERREGIONAL_VALUE = 10;

	/**
	 * The '<em><b>TRAIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRAIN_VALUE = 37;

	/**
	 * The '<em><b>URBAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URBAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int URBAN_VALUE = 12;

	/**
	 * The '<em><b>TRAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRAM_VALUE = 35;

	/**
	 * The '<em><b>UNDERGROUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDERGROUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_VALUE = 36;

	/**
	 * The '<em><b>NIGHT TRAIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NIGHT_TRAIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NIGHT_TRAIN_VALUE = 13;

	/**
	 * The '<em><b>SHARED TAXI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHARED_TAXI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHARED_TAXI_VALUE = 34;

	/**
	 * The '<em><b>MOTOR RAIL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTOR_RAIL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOTOR_RAIL_VALUE = 14;

	/**
	 * The '<em><b>MOUNTAIN TRAIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOUNTAIN_TRAIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOUNTAIN_TRAIN_VALUE = 0;

	/**
	 * The '<em><b>PLANE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLANE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PLANE_VALUE = 3;

	/**
	 * The '<em><b>COACH GROUP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COACH_GROUP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COACH_GROUP_VALUE = 31;

	/**
	 * The '<em><b>SHIP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHIP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHIP_VALUE = 32;

	/**
	 * The '<em><b>BUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUS_VALUE = 33;

	/**
	 * An array of all the '<em><b>Service Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ServiceMode[] VALUES_ARRAY =
		new ServiceMode[] {
			HIGH_SPEED_TRAIN,
			HISTORIC_TRAIN,
			INTERCITY,
			REGIONAL,
			INTERREGIONAL,
			TRAIN,
			URBAN,
			TRAM,
			UNDERGROUND,
			NIGHT_TRAIN,
			SHARED_TAXI,
			MOTOR_RAIL,
			MOUNTAIN_TRAIN,
			PLANE,
			COACH_GROUP,
			SHIP,
			BUS,
		};

	/**
	 * A public read-only list of all the '<em><b>Service Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ServiceMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Service Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServiceMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ServiceMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Service Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServiceMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ServiceMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Service Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServiceMode get(int value) {
		switch (value) {
			case HIGH_SPEED_TRAIN_VALUE: return HIGH_SPEED_TRAIN;
			case HISTORIC_TRAIN_VALUE: return HISTORIC_TRAIN;
			case INTERCITY_VALUE: return INTERCITY;
			case REGIONAL_VALUE: return REGIONAL;
			case INTERREGIONAL_VALUE: return INTERREGIONAL;
			case TRAIN_VALUE: return TRAIN;
			case URBAN_VALUE: return URBAN;
			case TRAM_VALUE: return TRAM;
			case UNDERGROUND_VALUE: return UNDERGROUND;
			case NIGHT_TRAIN_VALUE: return NIGHT_TRAIN;
			case SHARED_TAXI_VALUE: return SHARED_TAXI;
			case MOTOR_RAIL_VALUE: return MOTOR_RAIL;
			case MOUNTAIN_TRAIN_VALUE: return MOUNTAIN_TRAIN;
			case PLANE_VALUE: return PLANE;
			case COACH_GROUP_VALUE: return COACH_GROUP;
			case SHIP_VALUE: return SHIP;
			case BUS_VALUE: return BUS;
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
	private ServiceMode(int value, String name, String literal) {
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
	
} //ServiceMode
