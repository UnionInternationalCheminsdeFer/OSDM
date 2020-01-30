/**
 */
package Gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Personal Data Change Reason</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage#getPersonalDataChangeReason()
 * @model
 * @generated
 */
public enum PersonalDataChangeReason implements Enumerator {
	/**
	 * The '<em><b>IN GENERAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_GENERAL_VALUE
	 * @generated
	 * @ordered
	 */
	IN_GENERAL(1, "IN_GENERAL", "IN_GENERAL"),

	/**
	 * The '<em><b>MARRIAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARRIAGE_VALUE
	 * @generated
	 * @ordered
	 */
	MARRIAGE(2, "MARRIAGE", "MARRIAGE"),

	/**
	 * The '<em><b>DOCUMENT EXCHANGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCUMENT_EXCHANGE_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENT_EXCHANGE(3, "DOCUMENT_EXCHANGE", "DOCUMENT_EXCHANGE"),

	/**
	 * The '<em><b>AGENT ERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGENT_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	AGENT_ERROR(4, "AGENT_ERROR", "AGENT_ERROR");

	/**
	 * The '<em><b>IN GENERAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_GENERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IN_GENERAL_VALUE = 1;

	/**
	 * The '<em><b>MARRIAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARRIAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MARRIAGE_VALUE = 2;

	/**
	 * The '<em><b>DOCUMENT EXCHANGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCUMENT_EXCHANGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT_EXCHANGE_VALUE = 3;

	/**
	 * The '<em><b>AGENT ERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGENT_ERROR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AGENT_ERROR_VALUE = 4;

	/**
	 * An array of all the '<em><b>Personal Data Change Reason</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PersonalDataChangeReason[] VALUES_ARRAY =
		new PersonalDataChangeReason[] {
			IN_GENERAL,
			MARRIAGE,
			DOCUMENT_EXCHANGE,
			AGENT_ERROR,
		};

	/**
	 * A public read-only list of all the '<em><b>Personal Data Change Reason</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PersonalDataChangeReason> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Personal Data Change Reason</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PersonalDataChangeReason get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PersonalDataChangeReason result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Personal Data Change Reason</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PersonalDataChangeReason getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PersonalDataChangeReason result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Personal Data Change Reason</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PersonalDataChangeReason get(int value) {
		switch (value) {
			case IN_GENERAL_VALUE: return IN_GENERAL;
			case MARRIAGE_VALUE: return MARRIAGE;
			case DOCUMENT_EXCHANGE_VALUE: return DOCUMENT_EXCHANGE;
			case AGENT_ERROR_VALUE: return AGENT_ERROR;
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
	private PersonalDataChangeReason(int value, String name, String literal) {
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
	
} //PersonalDataChangeReason
