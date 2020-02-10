/**
 */
package Gtm.impl;

import Gtm.ClassId;
import Gtm.ClassicClassType;
import Gtm.GtmPackage;
import Gtm.ServiceClass;
import Gtm.Text;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.ServiceClassImpl#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.impl.ServiceClassImpl#getClassicClass <em>Classic Class</em>}</li>
 *   <li>{@link Gtm.impl.ServiceClassImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceClassImpl extends MinimalEObjectImpl.Container implements ServiceClass {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final ClassId ID_EDEFAULT = ClassId.A;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected ClassId id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassicClass() <em>Classic Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassicClass()
	 * @generated
	 * @ordered
	 */
	protected static final ClassicClassType CLASSIC_CLASS_EDEFAULT = ClassicClassType.FIRST;

	/**
	 * The cached value of the '{@link #getClassicClass() <em>Classic Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassicClass()
	 * @generated
	 * @ordered
	 */
	protected ClassicClassType classicClass = CLASSIC_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected Text text;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.SERVICE_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassId getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(ClassId newId) {
		ClassId oldId = id;
		id = newId == null ? ID_EDEFAULT : newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.SERVICE_CLASS__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassicClassType getClassicClass() {
		return classicClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassicClass(ClassicClassType newClassicClass) {
		ClassicClassType oldClassicClass = classicClass;
		classicClass = newClassicClass == null ? CLASSIC_CLASS_EDEFAULT : newClassicClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.SERVICE_CLASS__CLASSIC_CLASS, oldClassicClass, classicClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text getText() {
		if (text != null && text.eIsProxy()) {
			InternalEObject oldText = (InternalEObject)text;
			text = (Text)eResolveProxy(oldText);
			if (text != oldText) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.SERVICE_CLASS__TEXT, oldText, text));
			}
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text basicGetText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(Text newText) {
		Text oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.SERVICE_CLASS__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.SERVICE_CLASS__ID:
				return getId();
			case GtmPackage.SERVICE_CLASS__CLASSIC_CLASS:
				return getClassicClass();
			case GtmPackage.SERVICE_CLASS__TEXT:
				if (resolve) return getText();
				return basicGetText();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GtmPackage.SERVICE_CLASS__ID:
				setId((ClassId)newValue);
				return;
			case GtmPackage.SERVICE_CLASS__CLASSIC_CLASS:
				setClassicClass((ClassicClassType)newValue);
				return;
			case GtmPackage.SERVICE_CLASS__TEXT:
				setText((Text)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GtmPackage.SERVICE_CLASS__ID:
				setId(ID_EDEFAULT);
				return;
			case GtmPackage.SERVICE_CLASS__CLASSIC_CLASS:
				setClassicClass(CLASSIC_CLASS_EDEFAULT);
				return;
			case GtmPackage.SERVICE_CLASS__TEXT:
				setText((Text)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GtmPackage.SERVICE_CLASS__ID:
				return id != ID_EDEFAULT;
			case GtmPackage.SERVICE_CLASS__CLASSIC_CLASS:
				return classicClass != CLASSIC_CLASS_EDEFAULT;
			case GtmPackage.SERVICE_CLASS__TEXT:
				return text != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", classicClass: ");
		result.append(classicClass);
		result.append(')');
		return result.toString();
	}

} //ServiceClassImpl
