/**
 */
package Gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Personal Data Transfer Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage#getPersonalDataTransferType()
 * @model
 * @generated
 */
public enum PersonalDataTransferType implements Enumerator {
	/**
	 * The '<em><b>SID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SID_VALUE
	 * @generated
	 * @ordered
	 */
	SID(1, "SID", "SID"),

	/**
	 * The '<em><b>SIS CONTROL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIS_CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	SIS_CONTROL(2, "SIS_CONTROL", "SIS_CONTROL"),

	/**
	 * The '<em><b>BOOKING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOKING_VALUE
	 * @generated
	 * @ordered
	 */
	BOOKING(3, "BOOKING", "BOOKING");

	/**
	 * The '<em><b>SID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SID_VALUE = 1;

	/**
	 * The '<em><b>SIS CONTROL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIS_CONTROL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIS_CONTROL_VALUE = 2;

	/**
	 * The '<em><b>BOOKING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOKING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOOKING_VALUE = 3;

	/**
	 * An array of all the '<em><b>Personal Data Transfer Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PersonalDataTransferType[] VALUES_ARRAY =
		new PersonalDataTransferType[] {
			SID,
			SIS_CONTROL,
			BOOKING,
		};

	/**
	 * A public read-only list of all the '<em><b>Personal Data Transfer Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PersonalDataTransferType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Personal Data Transfer Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PersonalDataTransferType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PersonalDataTransferType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Personal Data Transfer Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PersonalDataTransferType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PersonalDataTransferType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Personal Data Transfer Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PersonalDataTransferType get(int value) {
		switch (value) {
			case SID_VALUE: return SID;
			case SIS_CONTROL_VALUE: return SIS_CONTROL;
			case BOOKING_VALUE: return BOOKING;
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
	private PersonalDataTransferType(int value, String name, String literal) {
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
	
} //PersonalDataTransferType
