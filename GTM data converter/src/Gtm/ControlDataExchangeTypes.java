/**
 */
package Gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Control Data Exchange Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage#getControlDataExchangeTypes()
 * @model
 * @generated
 */
public enum ControlDataExchangeTypes implements Enumerator {
	/**
	 * The '<em><b>IRS90918 4PEER2PEER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IRS90918_4PEER2PEER_VALUE
	 * @generated
	 * @ordered
	 */
	IRS90918_4PEER2PEER(2, "IRS90918_4_PEER2PEER", "IRS90918_4_PEER2PEER"),

	/**
	 * The '<em><b>IRS90918 4REGISTRY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IRS90918_4REGISTRY_VALUE
	 * @generated
	 * @ordered
	 */
	IRS90918_4REGISTRY(1, "IRS90918_4_REGISTRY", "IRS90918_4_REGISTRY");

	/**
	 * The '<em><b>IRS90918 4PEER2PEER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IRS90918_4PEER2PEER
	 * @model name="IRS90918_4_PEER2PEER"
	 * @generated
	 * @ordered
	 */
	public static final int IRS90918_4PEER2PEER_VALUE = 2;

	/**
	 * The '<em><b>IRS90918 4REGISTRY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IRS90918_4REGISTRY
	 * @model name="IRS90918_4_REGISTRY"
	 * @generated
	 * @ordered
	 */
	public static final int IRS90918_4REGISTRY_VALUE = 1;

	/**
	 * An array of all the '<em><b>Control Data Exchange Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ControlDataExchangeTypes[] VALUES_ARRAY =
		new ControlDataExchangeTypes[] {
			IRS90918_4PEER2PEER,
			IRS90918_4REGISTRY,
		};

	/**
	 * A public read-only list of all the '<em><b>Control Data Exchange Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ControlDataExchangeTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Control Data Exchange Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlDataExchangeTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ControlDataExchangeTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Control Data Exchange Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlDataExchangeTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ControlDataExchangeTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Control Data Exchange Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlDataExchangeTypes get(int value) {
		switch (value) {
			case IRS90918_4PEER2PEER_VALUE: return IRS90918_4PEER2PEER;
			case IRS90918_4REGISTRY_VALUE: return IRS90918_4REGISTRY;
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
	private ControlDataExchangeTypes(int value, String name, String literal) {
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
	
} //ControlDataExchangeTypes
