/**
 */
package whisky.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import whisky.Blend;
import whisky.Herstellung;
import whisky.Lagerung;
import whisky.Whisky;
import whisky.WhiskyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Blend</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link whisky.impl.BlendImpl#getSource <em>Source</em>}</li>
 *   <li>{@link whisky.impl.BlendImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link whisky.impl.BlendImpl#getMengeSource <em>Menge Source</em>}</li>
 *   <li>{@link whisky.impl.BlendImpl#getTypHerstellung <em>Typ Herstellung</em>}</li>
 *   <li>{@link whisky.impl.BlendImpl#getTypLagerung <em>Typ Lagerung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlendImpl extends MinimalEObjectImpl.Container implements Blend {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Whisky source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Whisky target;

	/**
	 * The default value of the '{@link #getMengeSource() <em>Menge Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMengeSource()
	 * @generated
	 * @ordered
	 */
	protected static final double MENGE_SOURCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMengeSource() <em>Menge Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMengeSource()
	 * @generated
	 * @ordered
	 */
	protected double mengeSource = MENGE_SOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypHerstellung() <em>Typ Herstellung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypHerstellung()
	 * @generated
	 * @ordered
	 */
	protected Herstellung typHerstellung;

	/**
	 * The cached value of the '{@link #getTypLagerung() <em>Typ Lagerung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypLagerung()
	 * @generated
	 * @ordered
	 */
	protected Lagerung typLagerung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlendImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WhiskyPackage.Literals.BLEND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Whisky getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (Whisky) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WhiskyPackage.BLEND__SOURCE, oldSource,
							source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Whisky basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Whisky newSource) {
		Whisky oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WhiskyPackage.BLEND__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Whisky getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (Whisky) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WhiskyPackage.BLEND__TARGET, oldTarget,
							target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Whisky basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Whisky newTarget) {
		Whisky oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WhiskyPackage.BLEND__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMengeSource() {
		return mengeSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMengeSource(double newMengeSource) {
		double oldMengeSource = mengeSource;
		mengeSource = newMengeSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WhiskyPackage.BLEND__MENGE_SOURCE, oldMengeSource,
					mengeSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Herstellung getTypHerstellung() {
		if (typHerstellung != null && typHerstellung.eIsProxy()) {
			InternalEObject oldTypHerstellung = (InternalEObject) typHerstellung;
			typHerstellung = (Herstellung) eResolveProxy(oldTypHerstellung);
			if (typHerstellung != oldTypHerstellung) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WhiskyPackage.BLEND__TYP_HERSTELLUNG,
							oldTypHerstellung, typHerstellung));
			}
		}
		return typHerstellung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Herstellung basicGetTypHerstellung() {
		return typHerstellung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypHerstellung(Herstellung newTypHerstellung) {
		Herstellung oldTypHerstellung = typHerstellung;
		typHerstellung = newTypHerstellung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WhiskyPackage.BLEND__TYP_HERSTELLUNG,
					oldTypHerstellung, typHerstellung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lagerung getTypLagerung() {
		if (typLagerung != null && typLagerung.eIsProxy()) {
			InternalEObject oldTypLagerung = (InternalEObject) typLagerung;
			typLagerung = (Lagerung) eResolveProxy(oldTypLagerung);
			if (typLagerung != oldTypLagerung) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WhiskyPackage.BLEND__TYP_LAGERUNG,
							oldTypLagerung, typLagerung));
			}
		}
		return typLagerung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lagerung basicGetTypLagerung() {
		return typLagerung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypLagerung(Lagerung newTypLagerung) {
		Lagerung oldTypLagerung = typLagerung;
		typLagerung = newTypLagerung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WhiskyPackage.BLEND__TYP_LAGERUNG, oldTypLagerung,
					typLagerung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WhiskyPackage.BLEND__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case WhiskyPackage.BLEND__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case WhiskyPackage.BLEND__MENGE_SOURCE:
			return getMengeSource();
		case WhiskyPackage.BLEND__TYP_HERSTELLUNG:
			if (resolve)
				return getTypHerstellung();
			return basicGetTypHerstellung();
		case WhiskyPackage.BLEND__TYP_LAGERUNG:
			if (resolve)
				return getTypLagerung();
			return basicGetTypLagerung();
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
		case WhiskyPackage.BLEND__SOURCE:
			setSource((Whisky) newValue);
			return;
		case WhiskyPackage.BLEND__TARGET:
			setTarget((Whisky) newValue);
			return;
		case WhiskyPackage.BLEND__MENGE_SOURCE:
			setMengeSource((Double) newValue);
			return;
		case WhiskyPackage.BLEND__TYP_HERSTELLUNG:
			setTypHerstellung((Herstellung) newValue);
			return;
		case WhiskyPackage.BLEND__TYP_LAGERUNG:
			setTypLagerung((Lagerung) newValue);
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
		case WhiskyPackage.BLEND__SOURCE:
			setSource((Whisky) null);
			return;
		case WhiskyPackage.BLEND__TARGET:
			setTarget((Whisky) null);
			return;
		case WhiskyPackage.BLEND__MENGE_SOURCE:
			setMengeSource(MENGE_SOURCE_EDEFAULT);
			return;
		case WhiskyPackage.BLEND__TYP_HERSTELLUNG:
			setTypHerstellung((Herstellung) null);
			return;
		case WhiskyPackage.BLEND__TYP_LAGERUNG:
			setTypLagerung((Lagerung) null);
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
		case WhiskyPackage.BLEND__SOURCE:
			return source != null;
		case WhiskyPackage.BLEND__TARGET:
			return target != null;
		case WhiskyPackage.BLEND__MENGE_SOURCE:
			return mengeSource != MENGE_SOURCE_EDEFAULT;
		case WhiskyPackage.BLEND__TYP_HERSTELLUNG:
			return typHerstellung != null;
		case WhiskyPackage.BLEND__TYP_LAGERUNG:
			return typLagerung != null;
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
		result.append(" (mengeSource: ");
		result.append(mengeSource);
		result.append(')');
		return result.toString();
	}

} //BlendImpl
