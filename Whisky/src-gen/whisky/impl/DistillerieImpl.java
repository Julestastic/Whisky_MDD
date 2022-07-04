/**
 */
package whisky.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import whisky.Distillerie;
import whisky.Herkunft;
import whisky.WhiskyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distillerie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link whisky.impl.DistillerieImpl#getHersteller <em>Hersteller</em>}</li>
 *   <li>{@link whisky.impl.DistillerieImpl#getUmsatz <em>Umsatz</em>}</li>
 *   <li>{@link whisky.impl.DistillerieImpl#getHerkunft <em>Herkunft</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DistillerieImpl extends MinimalEObjectImpl.Container implements Distillerie {
	/**
	 * The default value of the '{@link #getHersteller() <em>Hersteller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHersteller()
	 * @generated
	 * @ordered
	 */
	protected static final String HERSTELLER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHersteller() <em>Hersteller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHersteller()
	 * @generated
	 * @ordered
	 */
	protected String hersteller = HERSTELLER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUmsatz() <em>Umsatz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmsatz()
	 * @generated
	 * @ordered
	 */
	protected static final double UMSATZ_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUmsatz() <em>Umsatz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmsatz()
	 * @generated
	 * @ordered
	 */
	protected double umsatz = UMSATZ_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHerkunft() <em>Herkunft</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHerkunft()
	 * @generated
	 * @ordered
	 */
	protected Herkunft herkunft;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistillerieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WhiskyPackage.Literals.DISTILLERIE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHersteller() {
		return hersteller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHersteller(String newHersteller) {
		String oldHersteller = hersteller;
		hersteller = newHersteller;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WhiskyPackage.DISTILLERIE__HERSTELLER, oldHersteller,
					hersteller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getUmsatz() {
		return umsatz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUmsatz(double newUmsatz) {
		double oldUmsatz = umsatz;
		umsatz = newUmsatz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WhiskyPackage.DISTILLERIE__UMSATZ, oldUmsatz,
					umsatz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Herkunft getHerkunft() {
		if (herkunft != null && herkunft.eIsProxy()) {
			InternalEObject oldHerkunft = (InternalEObject) herkunft;
			herkunft = (Herkunft) eResolveProxy(oldHerkunft);
			if (herkunft != oldHerkunft) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WhiskyPackage.DISTILLERIE__HERKUNFT,
							oldHerkunft, herkunft));
			}
		}
		return herkunft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Herkunft basicGetHerkunft() {
		return herkunft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHerkunft(Herkunft newHerkunft) {
		Herkunft oldHerkunft = herkunft;
		herkunft = newHerkunft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WhiskyPackage.DISTILLERIE__HERKUNFT, oldHerkunft,
					herkunft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WhiskyPackage.DISTILLERIE__HERSTELLER:
			return getHersteller();
		case WhiskyPackage.DISTILLERIE__UMSATZ:
			return getUmsatz();
		case WhiskyPackage.DISTILLERIE__HERKUNFT:
			if (resolve)
				return getHerkunft();
			return basicGetHerkunft();
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
		case WhiskyPackage.DISTILLERIE__HERSTELLER:
			setHersteller((String) newValue);
			return;
		case WhiskyPackage.DISTILLERIE__UMSATZ:
			setUmsatz((Double) newValue);
			return;
		case WhiskyPackage.DISTILLERIE__HERKUNFT:
			setHerkunft((Herkunft) newValue);
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
		case WhiskyPackage.DISTILLERIE__HERSTELLER:
			setHersteller(HERSTELLER_EDEFAULT);
			return;
		case WhiskyPackage.DISTILLERIE__UMSATZ:
			setUmsatz(UMSATZ_EDEFAULT);
			return;
		case WhiskyPackage.DISTILLERIE__HERKUNFT:
			setHerkunft((Herkunft) null);
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
		case WhiskyPackage.DISTILLERIE__HERSTELLER:
			return HERSTELLER_EDEFAULT == null ? hersteller != null : !HERSTELLER_EDEFAULT.equals(hersteller);
		case WhiskyPackage.DISTILLERIE__UMSATZ:
			return umsatz != UMSATZ_EDEFAULT;
		case WhiskyPackage.DISTILLERIE__HERKUNFT:
			return herkunft != null;
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
		result.append(" (hersteller: ");
		result.append(hersteller);
		result.append(", umsatz: ");
		result.append(umsatz);
		result.append(')');
		return result.toString();
	}

} //DistillerieImpl
