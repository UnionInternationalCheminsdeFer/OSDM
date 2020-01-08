/**
 */
package Gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Personal Data Items Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage#getPersonalDataItemsType()
 * @model
 * @generated
 */
public enum PersonalDataItemsType implements Enumerator {
	/**
	 * The '<em><b>DATE OF BIRTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_OF_BIRTH_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_OF_BIRTH(1, "DATE_OF_BIRTH", "DATE_OF_BIRTH"),

	/**
	 * The '<em><b>EMAIL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMAIL_VALUE
	 * @generated
	 * @ordered
	 */
	EMAIL(2, "E_MAIL", "E_MAIL"),

	/**
	 * The '<em><b>PHONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHONE_VALUE
	 * @generated
	 * @ordered
	 */
	PHONE(3, "PHONE", "PHONE"),

	/**
	 * The '<em><b>FULL NAME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULL_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	FULL_NAME(4, "FULL_NAME", "FULL_NAME"),

	/**
	 * The '<em><b>LAST NAME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAST_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	LAST_NAME(5, "LAST_NAME", "LAST_NAME"),

	/**
	 * The '<em><b>LANGUAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LANGUAGE_VALUE
	 * @generated
	 * @ordered
	 */
	LANGUAGE(6, "LANGUAGE", "LANGUAGE"),

	/**
	 * The '<em><b>TITLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TITLE_VALUE
	 * @generated
	 * @ordered
	 */
	TITLE(7, "TITLE", "TITLE"),

	/**
	 * The '<em><b>GENDER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENDER_VALUE
	 * @generated
	 * @ordered
	 */
	GENDER(8, "GENDER", "GENDER"),

	/**
	 * The '<em><b>DOC TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOC_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	DOC_TYPE(9, "DOC_TYPE", "DOC_TYPE"),

	/**
	 * The '<em><b>DOC ID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOC_ID_VALUE
	 * @generated
	 * @ordered
	 */
	DOC_ID(10, "DOC_ID", "DOC_ID"),

	/**
	 * The '<em><b>DOC NAME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOC_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	DOC_NAME(11, "DOC_NAME", "DOC_NAME"),

	/**
	 * The '<em><b>DOC CITY OF RESIDENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOC_CITY_OF_RESIDENCE_VALUE
	 * @generated
	 * @ordered
	 */
	DOC_CITY_OF_RESIDENCE(12, "DOC_CITY_OF_RESIDENCE", "DOC_CITY_OF_RESIDENCE"),

	/**
	 * The '<em><b>DOC COUNTRY OF BIRTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOC_COUNTRY_OF_BIRTH_VALUE
	 * @generated
	 * @ordered
	 */
	DOC_COUNTRY_OF_BIRTH(13, "DOC_COUNTRY_OF_BIRTH", "DOC_COUNTRY_OF_BIRTH"),

	/**
	 * The '<em><b>DOC COUNTRY OF ISSUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOC_COUNTRY_OF_ISSUE_VALUE
	 * @generated
	 * @ordered
	 */
	DOC_COUNTRY_OF_ISSUE(14, "DOC_COUNTRY_OF_ISSUE", "DOC_COUNTRY_OF_ISSUE"),

	/**
	 * The '<em><b>DOC COUNTRY OF RESDENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOC_COUNTRY_OF_RESDENCE_VALUE
	 * @generated
	 * @ordered
	 */
	DOC_COUNTRY_OF_RESDENCE(15, "DOC_COUNTRY_OF_RESDENCE", "DOC_COUNTRY_OF_RESDENCE"),

	/**
	 * The '<em><b>DOC DATE OF ISSUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOC_DATE_OF_ISSUE_VALUE
	 * @generated
	 * @ordered
	 */
	DOC_DATE_OF_ISSUE(16, "DOC_DATE_OF_ISSUE", "DOC_DATE_OF_ISSUE"),

	/**
	 * The '<em><b>DOC GENDER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOC_GENDER_VALUE
	 * @generated
	 * @ordered
	 */
	DOC_GENDER(17, "DOC_GENDER", "DOC_GENDER"),

	/**
	 * The '<em><b>DOC NATIONALITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOC_NATIONALITY_VALUE
	 * @generated
	 * @ordered
	 */
	DOC_NATIONALITY(18, "DOC_NATIONALITY", "DOC_NATIONALITY"),

	/**
	 * The '<em><b>DOC LIMIT OF VALIDITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOC_LIMIT_OF_VALIDITY_VALUE
	 * @generated
	 * @ordered
	 */
	DOC_LIMIT_OF_VALIDITY(19, "DOC_LIMIT_OF_VALIDITY", "DOC_LIMIT_OF_VALIDITY"),

	/**
	 * The '<em><b>DOC CITY OF ISSUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOC_CITY_OF_ISSUE_VALUE
	 * @generated
	 * @ordered
	 */
	DOC_CITY_OF_ISSUE(20, "DOC_CITY_OF_ISSUE", "DOC_CITY_OF_ISSUE"),

	/**
	 * The '<em><b>DOC CITY OF BIRTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOC_CITY_OF_BIRTH_VALUE
	 * @generated
	 * @ordered
	 */
	DOC_CITY_OF_BIRTH(21, "DOC_CITY_OF_BIRTH", "DOC_CITY_OF_BIRTH"),

	/**
	 * The '<em><b>DOC TYPE PASSPORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOC_TYPE_PASSPORT_VALUE
	 * @generated
	 * @ordered
	 */
	DOC_TYPE_PASSPORT(22, "DOC_TYPE_PASSPORT", "DOC_TYPE_PASSPORT"),

	/**
	 * The '<em><b>CARD ISSUER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARD_ISSUER_VALUE
	 * @generated
	 * @ordered
	 */
	CARD_ISSUER(23, "CARD_ISSUER", "CARD_ISSUER"),

	/**
	 * The '<em><b>CARD NUMBER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARD_NUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	CARD_NUMBER(24, "CARD_NUMBER", "CARD_NUMBER");

	/**
	 * The '<em><b>DATE OF BIRTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_OF_BIRTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATE_OF_BIRTH_VALUE = 1;

	/**
	 * The '<em><b>EMAIL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMAIL
	 * @model name="E_MAIL"
	 * @generated
	 * @ordered
	 */
	public static final int EMAIL_VALUE = 2;

	/**
	 * The '<em><b>PHONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PHONE_VALUE = 3;

	/**
	 * The '<em><b>FULL NAME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULL_NAME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FULL_NAME_VALUE = 4;

	/**
	 * The '<em><b>LAST NAME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAST_NAME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LAST_NAME_VALUE = 5;

	/**
	 * The '<em><b>LANGUAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LANGUAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LANGUAGE_VALUE = 6;

	/**
	 * The '<em><b>TITLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TITLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TITLE_VALUE = 7;

	/**
	 * The '<em><b>GENDER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENDER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GENDER_VALUE = 8;

	/**
	 * The '<em><b>DOC TYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOC_TYPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOC_TYPE_VALUE = 9;

	/**
	 * The '<em><b>DOC ID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOC_ID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ID_VALUE = 10;

	/**
	 * The '<em><b>DOC NAME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOC_NAME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOC_NAME_VALUE = 11;

	/**
	 * The '<em><b>DOC CITY OF RESIDENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOC_CITY_OF_RESIDENCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOC_CITY_OF_RESIDENCE_VALUE = 12;

	/**
	 * The '<em><b>DOC COUNTRY OF BIRTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOC_COUNTRY_OF_BIRTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOC_COUNTRY_OF_BIRTH_VALUE = 13;

	/**
	 * The '<em><b>DOC COUNTRY OF ISSUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOC_COUNTRY_OF_ISSUE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOC_COUNTRY_OF_ISSUE_VALUE = 14;

	/**
	 * The '<em><b>DOC COUNTRY OF RESDENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOC_COUNTRY_OF_RESDENCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOC_COUNTRY_OF_RESDENCE_VALUE = 15;

	/**
	 * The '<em><b>DOC DATE OF ISSUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOC_DATE_OF_ISSUE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOC_DATE_OF_ISSUE_VALUE = 16;

	/**
	 * The '<em><b>DOC GENDER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOC_GENDER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOC_GENDER_VALUE = 17;

	/**
	 * The '<em><b>DOC NATIONALITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOC_NATIONALITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOC_NATIONALITY_VALUE = 18;

	/**
	 * The '<em><b>DOC LIMIT OF VALIDITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOC_LIMIT_OF_VALIDITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOC_LIMIT_OF_VALIDITY_VALUE = 19;

	/**
	 * The '<em><b>DOC CITY OF ISSUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOC_CITY_OF_ISSUE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOC_CITY_OF_ISSUE_VALUE = 20;

	/**
	 * The '<em><b>DOC CITY OF BIRTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOC_CITY_OF_BIRTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOC_CITY_OF_BIRTH_VALUE = 21;

	/**
	 * The '<em><b>DOC TYPE PASSPORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOC_TYPE_PASSPORT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOC_TYPE_PASSPORT_VALUE = 22;

	/**
	 * The '<em><b>CARD ISSUER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARD_ISSUER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CARD_ISSUER_VALUE = 23;

	/**
	 * The '<em><b>CARD NUMBER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARD_NUMBER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CARD_NUMBER_VALUE = 24;

	/**
	 * An array of all the '<em><b>Personal Data Items Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PersonalDataItemsType[] VALUES_ARRAY =
		new PersonalDataItemsType[] {
			DATE_OF_BIRTH,
			EMAIL,
			PHONE,
			FULL_NAME,
			LAST_NAME,
			LANGUAGE,
			TITLE,
			GENDER,
			DOC_TYPE,
			DOC_ID,
			DOC_NAME,
			DOC_CITY_OF_RESIDENCE,
			DOC_COUNTRY_OF_BIRTH,
			DOC_COUNTRY_OF_ISSUE,
			DOC_COUNTRY_OF_RESDENCE,
			DOC_DATE_OF_ISSUE,
			DOC_GENDER,
			DOC_NATIONALITY,
			DOC_LIMIT_OF_VALIDITY,
			DOC_CITY_OF_ISSUE,
			DOC_CITY_OF_BIRTH,
			DOC_TYPE_PASSPORT,
			CARD_ISSUER,
			CARD_NUMBER,
		};

	/**
	 * A public read-only list of all the '<em><b>Personal Data Items Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PersonalDataItemsType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Personal Data Items Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PersonalDataItemsType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PersonalDataItemsType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Personal Data Items Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PersonalDataItemsType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PersonalDataItemsType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Personal Data Items Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PersonalDataItemsType get(int value) {
		switch (value) {
			case DATE_OF_BIRTH_VALUE: return DATE_OF_BIRTH;
			case EMAIL_VALUE: return EMAIL;
			case PHONE_VALUE: return PHONE;
			case FULL_NAME_VALUE: return FULL_NAME;
			case LAST_NAME_VALUE: return LAST_NAME;
			case LANGUAGE_VALUE: return LANGUAGE;
			case TITLE_VALUE: return TITLE;
			case GENDER_VALUE: return GENDER;
			case DOC_TYPE_VALUE: return DOC_TYPE;
			case DOC_ID_VALUE: return DOC_ID;
			case DOC_NAME_VALUE: return DOC_NAME;
			case DOC_CITY_OF_RESIDENCE_VALUE: return DOC_CITY_OF_RESIDENCE;
			case DOC_COUNTRY_OF_BIRTH_VALUE: return DOC_COUNTRY_OF_BIRTH;
			case DOC_COUNTRY_OF_ISSUE_VALUE: return DOC_COUNTRY_OF_ISSUE;
			case DOC_COUNTRY_OF_RESDENCE_VALUE: return DOC_COUNTRY_OF_RESDENCE;
			case DOC_DATE_OF_ISSUE_VALUE: return DOC_DATE_OF_ISSUE;
			case DOC_GENDER_VALUE: return DOC_GENDER;
			case DOC_NATIONALITY_VALUE: return DOC_NATIONALITY;
			case DOC_LIMIT_OF_VALIDITY_VALUE: return DOC_LIMIT_OF_VALIDITY;
			case DOC_CITY_OF_ISSUE_VALUE: return DOC_CITY_OF_ISSUE;
			case DOC_CITY_OF_BIRTH_VALUE: return DOC_CITY_OF_BIRTH;
			case DOC_TYPE_PASSPORT_VALUE: return DOC_TYPE_PASSPORT;
			case CARD_ISSUER_VALUE: return CARD_ISSUER;
			case CARD_NUMBER_VALUE: return CARD_NUMBER;
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
	private PersonalDataItemsType(int value, String name, String literal) {
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
	
} //PersonalDataItemsType
