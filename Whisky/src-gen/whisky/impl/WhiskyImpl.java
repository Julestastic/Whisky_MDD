/**
 */
package whisky.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import whisky.Distillerie;
import whisky.Herstellung;
import whisky.Lagerung;
import whisky.Whisky;
import whisky.WhiskyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Whisky</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link whisky.impl.WhiskyImpl#getDistillerie <em>Distillerie</em>}</li>
 *   <li>{@link whisky.impl.WhiskyImpl#getLagerung <em>Lagerung</em>}</li>
 *   <li>{@link whisky.impl.WhiskyImpl#getHerstellung <em>Herstellung</em>}</li>
 *   <li>{@link whisky.impl.WhiskyImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link whisky.impl.WhiskyImpl#getAlkoholgehalt <em>Alkoholgehalt</em>}</li>
 *   <li>{@link whisky.impl.WhiskyImpl#getSorte <em>Sorte</em>}</li>
 *   <li>{@link whisky.impl.WhiskyImpl#getPreis <em>Preis</em>}</li>
 *   <li>{@link whisky.impl.WhiskyImpl#getFüllmenge <em>Füllmenge</em>}</li>
 *   <li>{@link whisky.impl.WhiskyImpl#getGeschmack <em>Geschmack</em>}</li>
 *   <li>{@link whisky.impl.WhiskyImpl#getKategorie <em>Kategorie</em>}</li>
 *   <li>{@link whisky.impl.WhiskyImpl#getAlter <em>Alter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhiskyImpl extends MinimalEObjectImpl.Container implements Whisky {
	/**
	 * The cached value of the '{@link #getDistillerie() <em>Distillerie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistillerie()
	 * @generated
	 * @ordered
	 */
	protected Distillerie distillerie;

	/**
	 * The cached value of the '{@link #getLagerung() <em>Lagerung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLagerung()
	 * @generated
	 * @ordered
	 */
	protected Lagerung lagerung;

	/**
	 * The cached value of the '{@link #getHerstellung() <em>Herstellung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHerstellung()
	 * @generated
	 * @ordered
	 */
	protected Herstellung herstellung;

	/**
	 * The default value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected static final String BEZEICHNUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected String bezeichnung = BEZEICHNUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlkoholgehalt() <em>Alkoholgehalt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlkoholgehalt()
	 * @generated
	 * @ordered
	 */
	protected static final double ALKOHOLGEHALT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAlkoholgehalt() <em>Alkoholgehalt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlkoholgehalt()
	 * @generated
	 * @ordered
	 */
	protected double alkoholgehalt = ALKOHOLGEHALT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSorte() <em>Sorte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSorte()
	 * @generated
	 * @ordered
	 */
	protected static final String SORTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSorte() <em>Sorte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSorte()
	 * @generated
	 * @ordered
	 */
	protected String sorte = SORTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreis() <em>Preis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreis()
	 * @generated
	 * @ordered
	 */
	protected static final double PREIS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPreis() <em>Preis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreis()
	 * @generated
	 * @ordered
	 */
	protected double preis = PREIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFüllmenge() <em>Füllmenge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFüllmenge()
	 * @generated
	 * @ordered
	 */
	protected static final double FÜLLMENGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFüllmenge() <em>Füllmenge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFüllmenge()
	 * @generated
	 * @ordered
	 */
	protected double füllmenge = FÜLLMENGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeschmack() <em>Geschmack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeschmack()
	 * @generated
	 * @ordered
	 */
	protected static final String GESCHMACK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeschmack() <em>Geschmack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeschmack()
	 * @generated
	 * @ordered
	 */
	protected String geschmack = GESCHMACK_EDEFAULT;

	/**
	 * The default value of the '{@link #getKategorie() <em>Kategorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKategorie()
	 * @generated
	 * @ordered
	 */
	protected static final String KATEGORIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKategorie() <em>Kategorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKategorie()
	 * @generated
	 * @ordered
	 */
	protected String kategorie = KATEGORIE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlter() <em>Alter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlter()
	 * @generated
	 * @ordered
	 */
	protected static final int ALTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAlter() <em>Alter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlter()
	 * @generated
	 * @ordered
	 */
	protected int alter = ALTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhiskyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WhiskyPackage.Literals.WHISKY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distillerie getDistillerie() {
		return distillerie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistillerie(Distillerie newDistillerie, NotificationChain msgs) {
		Distillerie oldDistillerie = distillerie;
		distillerie = newDistillerie;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WhiskyPackage.WHISKY__DISTILLERIE, oldDistillerie, newDistillerie);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistillerie(Distillerie newDistillerie) {
		if (newDistillerie != distillerie) {
			NotificationChain msgs = null;
			if (distillerie != null)
				msgs = ((InternalEObject) distillerie).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WhiskyPackage.WHISKY__DISTILLERIE, null, msgs);
			if (newDistillerie != null)
				msgs = ((InternalEObject) newDistillerie).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WhiskyPackage.WHISKY__DISTILLERIE, null, msgs);
			msgs = basicSetDistillerie(newDistillerie, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WhiskyPackage.WHISKY__DISTILLERIE, newDistillerie,
					newDistillerie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lagerung getLagerung() {
		if (lagerung != null && lagerung.eIsProxy()) {
			InternalEObject oldLagerung = (InternalEObject) lagerung;
			lagerung = (Lagerung) eResolveProxy(oldLagerung);
			if (lagerung != oldLagerung) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WhiskyPackage.WHISKY__LAGERUNG,
							oldLagerung, lagerung));
			}
		}
		return lagerung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lagerung basicGetLagerung() {
		return lagerung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLagerung(Lagerung newLagerung) {
		Lagerung oldLagerung = lagerung;
		lagerung = newLagerung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WhiskyPackage.WHISKY__LAGERUNG, oldLagerung,
					lagerung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Herstellung getHerstellung() {
		if (herstellung != null && herstellung.eIsProxy()) {
			InternalEObject oldHerstellung = (InternalEObject) herstellung;
			herstellung = (Herstellung) eResolveProxy(oldHerstellung);
			if (herstellung != oldHerstellung) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WhiskyPackage.WHISKY__HERSTELLUNG,
							oldHerstellung, herstellung));
			}
		}
		return herstellung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Herstellung basicGetHerstellung() {
		return herstellung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHerstellung(Herstellung newHerstellung) {
		Herstellung oldHerstellung = herstellung;
		herstellung = newHerstellung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WhiskyPackage.WHISKY__HERSTELLUNG, oldHerstellung,
					herstellung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBezeichnung(String newBezeichnung) {
		String oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WhiskyPackage.WHISKY__BEZEICHNUNG, oldBezeichnung,
					bezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAlkoholgehalt() {
		return alkoholgehalt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlkoholgehalt(double newAlkoholgehalt) {
		double oldAlkoholgehalt = alkoholgehalt;
		alkoholgehalt = newAlkoholgehalt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WhiskyPackage.WHISKY__ALKOHOLGEHALT, oldAlkoholgehalt,
					alkoholgehalt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSorte() {
		return sorte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSorte(String newSorte) {
		String oldSorte = sorte;
		sorte = newSorte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WhiskyPackage.WHISKY__SORTE, oldSorte, sorte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPreis() {
		return preis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreis(double newPreis) {
		double oldPreis = preis;
		preis = newPreis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WhiskyPackage.WHISKY__PREIS, oldPreis, preis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFüllmenge() {
		return füllmenge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFüllmenge(double newFüllmenge) {
		double oldFüllmenge = füllmenge;
		füllmenge = newFüllmenge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WhiskyPackage.WHISKY__FÜLLMENGE, oldFüllmenge,
					füllmenge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeschmack() {
		return geschmack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeschmack(String newGeschmack) {
		String oldGeschmack = geschmack;
		geschmack = newGeschmack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WhiskyPackage.WHISKY__GESCHMACK, oldGeschmack,
					geschmack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKategorie() {
		return kategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKategorie(String newKategorie) {
		String oldKategorie = kategorie;
		kategorie = newKategorie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WhiskyPackage.WHISKY__KATEGORIE, oldKategorie,
					kategorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAlter() {
		return alter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlter(int newAlter) {
		int oldAlter = alter;
		alter = newAlter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WhiskyPackage.WHISKY__ALTER, oldAlter, alter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WhiskyPackage.WHISKY__DISTILLERIE:
			return basicSetDistillerie(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WhiskyPackage.WHISKY__DISTILLERIE:
			return getDistillerie();
		case WhiskyPackage.WHISKY__LAGERUNG:
			if (resolve)
				return getLagerung();
			return basicGetLagerung();
		case WhiskyPackage.WHISKY__HERSTELLUNG:
			if (resolve)
				return getHerstellung();
			return basicGetHerstellung();
		case WhiskyPackage.WHISKY__BEZEICHNUNG:
			return getBezeichnung();
		case WhiskyPackage.WHISKY__ALKOHOLGEHALT:
			return getAlkoholgehalt();
		case WhiskyPackage.WHISKY__SORTE:
			return getSorte();
		case WhiskyPackage.WHISKY__PREIS:
			return getPreis();
		case WhiskyPackage.WHISKY__FÜLLMENGE:
			return getFüllmenge();
		case WhiskyPackage.WHISKY__GESCHMACK:
			return getGeschmack();
		case WhiskyPackage.WHISKY__KATEGORIE:
			return getKategorie();
		case WhiskyPackage.WHISKY__ALTER:
			return getAlter();
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
		case WhiskyPackage.WHISKY__DISTILLERIE:
			setDistillerie((Distillerie) newValue);
			return;
		case WhiskyPackage.WHISKY__LAGERUNG:
			setLagerung((Lagerung) newValue);
			return;
		case WhiskyPackage.WHISKY__HERSTELLUNG:
			setHerstellung((Herstellung) newValue);
			return;
		case WhiskyPackage.WHISKY__BEZEICHNUNG:
			setBezeichnung((String) newValue);
			return;
		case WhiskyPackage.WHISKY__ALKOHOLGEHALT:
			setAlkoholgehalt((Double) newValue);
			return;
		case WhiskyPackage.WHISKY__SORTE:
			setSorte((String) newValue);
			return;
		case WhiskyPackage.WHISKY__PREIS:
			setPreis((Double) newValue);
			return;
		case WhiskyPackage.WHISKY__FÜLLMENGE:
			setFüllmenge((Double) newValue);
			return;
		case WhiskyPackage.WHISKY__GESCHMACK:
			setGeschmack((String) newValue);
			return;
		case WhiskyPackage.WHISKY__KATEGORIE:
			setKategorie((String) newValue);
			return;
		case WhiskyPackage.WHISKY__ALTER:
			setAlter((Integer) newValue);
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
		case WhiskyPackage.WHISKY__DISTILLERIE:
			setDistillerie((Distillerie) null);
			return;
		case WhiskyPackage.WHISKY__LAGERUNG:
			setLagerung((Lagerung) null);
			return;
		case WhiskyPackage.WHISKY__HERSTELLUNG:
			setHerstellung((Herstellung) null);
			return;
		case WhiskyPackage.WHISKY__BEZEICHNUNG:
			setBezeichnung(BEZEICHNUNG_EDEFAULT);
			return;
		case WhiskyPackage.WHISKY__ALKOHOLGEHALT:
			setAlkoholgehalt(ALKOHOLGEHALT_EDEFAULT);
			return;
		case WhiskyPackage.WHISKY__SORTE:
			setSorte(SORTE_EDEFAULT);
			return;
		case WhiskyPackage.WHISKY__PREIS:
			setPreis(PREIS_EDEFAULT);
			return;
		case WhiskyPackage.WHISKY__FÜLLMENGE:
			setFüllmenge(FÜLLMENGE_EDEFAULT);
			return;
		case WhiskyPackage.WHISKY__GESCHMACK:
			setGeschmack(GESCHMACK_EDEFAULT);
			return;
		case WhiskyPackage.WHISKY__KATEGORIE:
			setKategorie(KATEGORIE_EDEFAULT);
			return;
		case WhiskyPackage.WHISKY__ALTER:
			setAlter(ALTER_EDEFAULT);
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
		case WhiskyPackage.WHISKY__DISTILLERIE:
			return distillerie != null;
		case WhiskyPackage.WHISKY__LAGERUNG:
			return lagerung != null;
		case WhiskyPackage.WHISKY__HERSTELLUNG:
			return herstellung != null;
		case WhiskyPackage.WHISKY__BEZEICHNUNG:
			return BEZEICHNUNG_EDEFAULT == null ? bezeichnung != null : !BEZEICHNUNG_EDEFAULT.equals(bezeichnung);
		case WhiskyPackage.WHISKY__ALKOHOLGEHALT:
			return alkoholgehalt != ALKOHOLGEHALT_EDEFAULT;
		case WhiskyPackage.WHISKY__SORTE:
			return SORTE_EDEFAULT == null ? sorte != null : !SORTE_EDEFAULT.equals(sorte);
		case WhiskyPackage.WHISKY__PREIS:
			return preis != PREIS_EDEFAULT;
		case WhiskyPackage.WHISKY__FÜLLMENGE:
			return füllmenge != FÜLLMENGE_EDEFAULT;
		case WhiskyPackage.WHISKY__GESCHMACK:
			return GESCHMACK_EDEFAULT == null ? geschmack != null : !GESCHMACK_EDEFAULT.equals(geschmack);
		case WhiskyPackage.WHISKY__KATEGORIE:
			return KATEGORIE_EDEFAULT == null ? kategorie != null : !KATEGORIE_EDEFAULT.equals(kategorie);
		case WhiskyPackage.WHISKY__ALTER:
			return alter != ALTER_EDEFAULT;
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
		result.append(" (bezeichnung: ");
		result.append(bezeichnung);
		result.append(", alkoholgehalt: ");
		result.append(alkoholgehalt);
		result.append(", sorte: ");
		result.append(sorte);
		result.append(", preis: ");
		result.append(preis);
		result.append(", füllmenge: ");
		result.append(füllmenge);
		result.append(", geschmack: ");
		result.append(geschmack);
		result.append(", kategorie: ");
		result.append(kategorie);
		result.append(", alter: ");
		result.append(alter);
		result.append(')');
		return result.toString();
	}

} //WhiskyImpl
