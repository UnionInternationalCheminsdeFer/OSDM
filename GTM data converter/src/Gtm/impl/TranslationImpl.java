/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.Language;
import Gtm.Translation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Translation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.TranslationImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link Gtm.impl.TranslationImpl#getTextUTF8 <em>Text UTF8</em>}</li>
 *   <li>{@link Gtm.impl.TranslationImpl#getTextICAO <em>Text ICAO</em>}</li>
 *   <li>{@link Gtm.impl.TranslationImpl#getShortTextUTF8 <em>Short Text UTF8</em>}</li>
 *   <li>{@link Gtm.impl.TranslationImpl#getShortTextICAO <em>Short Text ICAO</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TranslationImpl extends MinimalEObjectImpl.Container implements Translation {
	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected Language language;

	/**
	 * The default value of the '{@link #getTextUTF8() <em>Text UTF8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextUTF8()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_UTF8_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextUTF8() <em>Text UTF8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextUTF8()
	 * @generated
	 * @ordered
	 */
	protected String textUTF8 = TEXT_UTF8_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextICAO() <em>Text ICAO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextICAO()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_ICAO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextICAO() <em>Text ICAO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextICAO()
	 * @generated
	 * @ordered
	 */
	protected String textICAO = TEXT_ICAO_EDEFAULT;

	/**
	 * The default value of the '{@link #getShortTextUTF8() <em>Short Text UTF8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortTextUTF8()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_TEXT_UTF8_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortTextUTF8() <em>Short Text UTF8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortTextUTF8()
	 * @generated
	 * @ordered
	 */
	protected String shortTextUTF8 = SHORT_TEXT_UTF8_EDEFAULT;

	/**
	 * The default value of the '{@link #getShortTextICAO() <em>Short Text ICAO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortTextICAO()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_TEXT_ICAO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortTextICAO() <em>Short Text ICAO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortTextICAO()
	 * @generated
	 * @ordered
	 */
	protected String shortTextICAO = SHORT_TEXT_ICAO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TranslationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.TRANSLATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language getLanguage() {
		if (language != null && language.eIsProxy()) {
			InternalEObject oldLanguage = (InternalEObject)language;
			language = (Language)eResolveProxy(oldLanguage);
			if (language != oldLanguage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.TRANSLATION__LANGUAGE, oldLanguage, language));
			}
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language basicGetLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(Language newLanguage) {
		Language oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TRANSLATION__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextUTF8() {
		return textUTF8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextUTF8(String newTextUTF8) {
		String oldTextUTF8 = textUTF8;
		textUTF8 = newTextUTF8;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TRANSLATION__TEXT_UTF8, oldTextUTF8, textUTF8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextICAO() {
		return textICAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextICAO(String newTextICAO) {
		String oldTextICAO = textICAO;
		textICAO = newTextICAO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TRANSLATION__TEXT_ICAO, oldTextICAO, textICAO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortTextUTF8() {
		return shortTextUTF8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortTextUTF8(String newShortTextUTF8) {
		String oldShortTextUTF8 = shortTextUTF8;
		shortTextUTF8 = newShortTextUTF8;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TRANSLATION__SHORT_TEXT_UTF8, oldShortTextUTF8, shortTextUTF8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortTextICAO() {
		return shortTextICAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortTextICAO(String newShortTextICAO) {
		String oldShortTextICAO = shortTextICAO;
		shortTextICAO = newShortTextICAO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.TRANSLATION__SHORT_TEXT_ICAO, oldShortTextICAO, shortTextICAO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.TRANSLATION__LANGUAGE:
				if (resolve) return getLanguage();
				return basicGetLanguage();
			case GtmPackage.TRANSLATION__TEXT_UTF8:
				return getTextUTF8();
			case GtmPackage.TRANSLATION__TEXT_ICAO:
				return getTextICAO();
			case GtmPackage.TRANSLATION__SHORT_TEXT_UTF8:
				return getShortTextUTF8();
			case GtmPackage.TRANSLATION__SHORT_TEXT_ICAO:
				return getShortTextICAO();
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
			case GtmPackage.TRANSLATION__LANGUAGE:
				setLanguage((Language)newValue);
				return;
			case GtmPackage.TRANSLATION__TEXT_UTF8:
				setTextUTF8((String)newValue);
				return;
			case GtmPackage.TRANSLATION__TEXT_ICAO:
				setTextICAO((String)newValue);
				return;
			case GtmPackage.TRANSLATION__SHORT_TEXT_UTF8:
				setShortTextUTF8((String)newValue);
				return;
			case GtmPackage.TRANSLATION__SHORT_TEXT_ICAO:
				setShortTextICAO((String)newValue);
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
			case GtmPackage.TRANSLATION__LANGUAGE:
				setLanguage((Language)null);
				return;
			case GtmPackage.TRANSLATION__TEXT_UTF8:
				setTextUTF8(TEXT_UTF8_EDEFAULT);
				return;
			case GtmPackage.TRANSLATION__TEXT_ICAO:
				setTextICAO(TEXT_ICAO_EDEFAULT);
				return;
			case GtmPackage.TRANSLATION__SHORT_TEXT_UTF8:
				setShortTextUTF8(SHORT_TEXT_UTF8_EDEFAULT);
				return;
			case GtmPackage.TRANSLATION__SHORT_TEXT_ICAO:
				setShortTextICAO(SHORT_TEXT_ICAO_EDEFAULT);
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
			case GtmPackage.TRANSLATION__LANGUAGE:
				return language != null;
			case GtmPackage.TRANSLATION__TEXT_UTF8:
				return TEXT_UTF8_EDEFAULT == null ? textUTF8 != null : !TEXT_UTF8_EDEFAULT.equals(textUTF8);
			case GtmPackage.TRANSLATION__TEXT_ICAO:
				return TEXT_ICAO_EDEFAULT == null ? textICAO != null : !TEXT_ICAO_EDEFAULT.equals(textICAO);
			case GtmPackage.TRANSLATION__SHORT_TEXT_UTF8:
				return SHORT_TEXT_UTF8_EDEFAULT == null ? shortTextUTF8 != null : !SHORT_TEXT_UTF8_EDEFAULT.equals(shortTextUTF8);
			case GtmPackage.TRANSLATION__SHORT_TEXT_ICAO:
				return SHORT_TEXT_ICAO_EDEFAULT == null ? shortTextICAO != null : !SHORT_TEXT_ICAO_EDEFAULT.equals(shortTextICAO);
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
		result.append(" (textUTF8: ");
		result.append(textUTF8);
		result.append(", textICAO: ");
		result.append(textICAO);
		result.append(", shortTextUTF8: ");
		result.append(shortTextUTF8);
		result.append(", shortTextICAO: ");
		result.append(shortTextICAO);
		result.append(')');
		return result.toString();
	}

} //TranslationImpl
