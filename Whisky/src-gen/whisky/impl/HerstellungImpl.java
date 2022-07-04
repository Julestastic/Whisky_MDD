/**
 */
package whisky.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import whisky.Herstellung;
import whisky.WhiskyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Herstellung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link whisky.impl.HerstellungImpl#getFiltrierung <em>Filtrierung</em>}</li>
 *   <li>{@link whisky.impl.HerstellungImpl#isFarbstoffe <em>Farbstoffe</em>}</li>
 *   <li>{@link whisky.impl.HerstellungImpl#isSingleMalt <em>Single Malt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HerstellungImpl extends MinimalEObjectImpl.Container implements Herstellung {
	/**
	 * The default value of the '{@link #getFiltrierung() <em>Filtrierung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiltrierung()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTRIERUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFiltrierung() <em>Filtrierung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiltrierung()
	 * @generated
	 * @ordered
	 */
	protected String filtrierung = FILTRIERUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #isFarbstoffe() <em>Farbstoffe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFarbstoffe()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FARBSTOFFE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFarbstoffe() <em>Farbstoffe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFarbstoffe()
	 * @generated
	 * @ordered
	 */
	protected boolean farbstoffe = FARBSTOFFE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSingleMalt() <em>Single Malt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSingleMalt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SINGLE_MALT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSingleMalt() <em>Single Malt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSingleMalt()
	 * @generated
	 * @ordered
	 */
	protected boolean singleMalt = SINGLE_MALT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HerstellungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WhiskyPackage.Literals.HERSTELLUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFiltrierung() {
		return filtrierung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiltrierung(String newFiltrierung) {
		String oldFiltrierung = filtrierung;
		filtrierung = newFiltrierung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WhiskyPackage.HERSTELLUNG__FILTRIERUNG,
					oldFiltrierung, filtrierung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFarbstoffe() {
		return farbstoffe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFarbstoffe(boolean newFarbstoffe) {
		boolean oldFarbstoffe = farbstoffe;
		farbstoffe = newFarbstoffe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WhiskyPackage.HERSTELLUNG__FARBSTOFFE, oldFarbstoffe,
					farbstoffe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSingleMalt() {
		return singleMalt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleMalt(boolean newSingleMalt) {
		boolean oldSingleMalt = singleMalt;
		singleMalt = newSingleMalt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WhiskyPackage.HERSTELLUNG__SINGLE_MALT, oldSingleMalt,
					singleMalt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WhiskyPackage.HERSTELLUNG__FILTRIERUNG:
			return getFiltrierung();
		case WhiskyPackage.HERSTELLUNG__FARBSTOFFE:
			return isFarbstoffe();
		case WhiskyPackage.HERSTELLUNG__SINGLE_MALT:
			return isSingleMalt();
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
		case WhiskyPackage.HERSTELLUNG__FILTRIERUNG:
			setFiltrierung((String) newValue);
			return;
		case WhiskyPackage.HERSTELLUNG__FARBSTOFFE:
			setFarbstoffe((Boolean) newValue);
			return;
		case WhiskyPackage.HERSTELLUNG__SINGLE_MALT:
			setSingleMalt((Boolean) newValue);
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
		case WhiskyPackage.HERSTELLUNG__FILTRIERUNG:
			setFiltrierung(FILTRIERUNG_EDEFAULT);
			return;
		case WhiskyPackage.HERSTELLUNG__FARBSTOFFE:
			setFarbstoffe(FARBSTOFFE_EDEFAULT);
			return;
		case WhiskyPackage.HERSTELLUNG__SINGLE_MALT:
			setSingleMalt(SINGLE_MALT_EDEFAULT);
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
		case WhiskyPackage.HERSTELLUNG__FILTRIERUNG:
			return FILTRIERUNG_EDEFAULT == null ? filtrierung != null : !FILTRIERUNG_EDEFAULT.equals(filtrierung);
		case WhiskyPackage.HERSTELLUNG__FARBSTOFFE:
			return farbstoffe != FARBSTOFFE_EDEFAULT;
		case WhiskyPackage.HERSTELLUNG__SINGLE_MALT:
			return singleMalt != SINGLE_MALT_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (filtrierung: ");
		result.append(filtrierung);
		result.append(", farbstoffe: ");
		result.append(farbstoffe);
		result.append(", singleMalt: ");
		result.append(singleMalt);
		result.append(')');
		return result.toString();
	}

} //HerstellungImpl
