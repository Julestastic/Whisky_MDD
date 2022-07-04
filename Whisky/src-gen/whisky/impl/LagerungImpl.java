/**
 */
package whisky.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import whisky.Lagerung;
import whisky.WhiskyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lagerung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link whisky.impl.LagerungImpl#getFass <em>Fass</em>}</li>
 *   <li>{@link whisky.impl.LagerungImpl#getDauer <em>Dauer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LagerungImpl extends MinimalEObjectImpl.Container implements Lagerung {
	/**
	 * The default value of the '{@link #getFass() <em>Fass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFass()
	 * @generated
	 * @ordered
	 */
	protected static final String FASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFass() <em>Fass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFass()
	 * @generated
	 * @ordered
	 */
	protected String fass = FASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDauer() <em>Dauer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDauer()
	 * @generated
	 * @ordered
	 */
	protected static final int DAUER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDauer() <em>Dauer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDauer()
	 * @generated
	 * @ordered
	 */
	protected int dauer = DAUER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LagerungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WhiskyPackage.Literals.LAGERUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFass() {
		return fass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFass(String newFass) {
		String oldFass = fass;
		fass = newFass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WhiskyPackage.LAGERUNG__FASS, oldFass, fass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDauer() {
		return dauer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDauer(int newDauer) {
		int oldDauer = dauer;
		dauer = newDauer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WhiskyPackage.LAGERUNG__DAUER, oldDauer, dauer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WhiskyPackage.LAGERUNG__FASS:
			return getFass();
		case WhiskyPackage.LAGERUNG__DAUER:
			return getDauer();
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
		case WhiskyPackage.LAGERUNG__FASS:
			setFass((String) newValue);
			return;
		case WhiskyPackage.LAGERUNG__DAUER:
			setDauer((Integer) newValue);
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
		case WhiskyPackage.LAGERUNG__FASS:
			setFass(FASS_EDEFAULT);
			return;
		case WhiskyPackage.LAGERUNG__DAUER:
			setDauer(DAUER_EDEFAULT);
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
		case WhiskyPackage.LAGERUNG__FASS:
			return FASS_EDEFAULT == null ? fass != null : !FASS_EDEFAULT.equals(fass);
		case WhiskyPackage.LAGERUNG__DAUER:
			return dauer != DAUER_EDEFAULT;
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
		result.append(" (fass: ");
		result.append(fass);
		result.append(", dauer: ");
		result.append(dauer);
		result.append(')');
		return result.toString();
	}

} //LagerungImpl
