/**
 */
package Gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Interface Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage#getInterfaceType()
 * @model
 * @generated
 */
public enum InterfaceType implements Enumerator {
	/**
	 * The '<em><b>IRS90918 1RESERVATION BINARY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IRS90918_1RESERVATION_BINARY_VALUE
	 * @generated
	 * @ordered
	 */
	IRS90918_1RESERVATION_BINARY(1, "IRS90918_1_RESERVATION_BINARY", "IRS90918_1_RESERVATION_BINARY"),

	/**
	 * The '<em><b>OSDM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OSDM_VALUE
	 * @generated
	 * @ordered
	 */
	OSDM(2, "OSDM", "OSDM"), /**
	 * The '<em><b>IRS90918 1RESERVATION XML</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IRS90918_1RESERVATION_XML_VALUE
	 * @generated
	 * @ordered
	 */
	IRS90918_1RESERVATION_XML(3, "IRS90918_1_RESERVATION_XML", "IRS90918_1_RESERVATION_XML");

	/**
	 * The '<em><b>IRS90918 1RESERVATION BINARY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IRS90918_1RESERVATION_BINARY
	 * @model name="IRS90918_1_RESERVATION_BINARY"
	 * @generated
	 * @ordered
	 */
	public static final int IRS90918_1RESERVATION_BINARY_VALUE = 1;

	/**
	 * The '<em><b>OSDM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OSDM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OSDM_VALUE = 2;

	/**
	 * The '<em><b>IRS90918 1RESERVATION XML</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IRS90918_1RESERVATION_XML
	 * @model name="IRS90918_1_RESERVATION_XML"
	 * @generated
	 * @ordered
	 */
	public static final int IRS90918_1RESERVATION_XML_VALUE = 3;

	/**
	 * An array of all the '<em><b>Interface Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InterfaceType[] VALUES_ARRAY =
		new InterfaceType[] {
			IRS90918_1RESERVATION_BINARY,
			OSDM,
			IRS90918_1RESERVATION_XML,
		};

	/**
	 * A public read-only list of all the '<em><b>Interface Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InterfaceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Interface Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InterfaceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InterfaceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interface Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InterfaceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InterfaceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interface Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InterfaceType get(int value) {
		switch (value) {
			case IRS90918_1RESERVATION_BINARY_VALUE: return IRS90918_1RESERVATION_BINARY;
			case OSDM_VALUE: return OSDM;
			case IRS90918_1RESERVATION_XML_VALUE: return IRS90918_1RESERVATION_XML;
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
	private InterfaceType(int value, String name, String literal) {
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
	
} //InterfaceType
