/**
 */
package whisky;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Whisky</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link whisky.Whisky#getDistillerie <em>Distillerie</em>}</li>
 *   <li>{@link whisky.Whisky#getLagerung <em>Lagerung</em>}</li>
 *   <li>{@link whisky.Whisky#getHerstellung <em>Herstellung</em>}</li>
 *   <li>{@link whisky.Whisky#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link whisky.Whisky#getAlkoholgehalt <em>Alkoholgehalt</em>}</li>
 *   <li>{@link whisky.Whisky#getSorte <em>Sorte</em>}</li>
 *   <li>{@link whisky.Whisky#getPreis <em>Preis</em>}</li>
 *   <li>{@link whisky.Whisky#getFüllmenge <em>Füllmenge</em>}</li>
 *   <li>{@link whisky.Whisky#getGeschmack <em>Geschmack</em>}</li>
 *   <li>{@link whisky.Whisky#getKategorie <em>Kategorie</em>}</li>
 *   <li>{@link whisky.Whisky#getAlter <em>Alter</em>}</li>
 * </ul>
 *
 * @see whisky.WhiskyPackage#getWhisky()
 * @model
 * @generated
 */
public interface Whisky extends EObject {
	/**
	 * Returns the value of the '<em><b>Distillerie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distillerie</em>' containment reference.
	 * @see #setDistillerie(Distillerie)
	 * @see whisky.WhiskyPackage#getWhisky_Distillerie()
	 * @model containment="true"
	 * @generated
	 */
	Distillerie getDistillerie();

	/**
	 * Sets the value of the '{@link whisky.Whisky#getDistillerie <em>Distillerie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distillerie</em>' containment reference.
	 * @see #getDistillerie()
	 * @generated
	 */
	void setDistillerie(Distillerie value);

	/**
	 * Returns the value of the '<em><b>Lagerung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lagerung</em>' reference.
	 * @see #setLagerung(Lagerung)
	 * @see whisky.WhiskyPackage#getWhisky_Lagerung()
	 * @model
	 * @generated
	 */
	Lagerung getLagerung();

	/**
	 * Sets the value of the '{@link whisky.Whisky#getLagerung <em>Lagerung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lagerung</em>' reference.
	 * @see #getLagerung()
	 * @generated
	 */
	void setLagerung(Lagerung value);

	/**
	 * Returns the value of the '<em><b>Herstellung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Herstellung</em>' reference.
	 * @see #setHerstellung(Herstellung)
	 * @see whisky.WhiskyPackage#getWhisky_Herstellung()
	 * @model
	 * @generated
	 */
	Herstellung getHerstellung();

	/**
	 * Sets the value of the '{@link whisky.Whisky#getHerstellung <em>Herstellung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Herstellung</em>' reference.
	 * @see #getHerstellung()
	 * @generated
	 */
	void setHerstellung(Herstellung value);

	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' attribute.
	 * @see #setBezeichnung(String)
	 * @see whisky.WhiskyPackage#getWhisky_Bezeichnung()
	 * @model
	 * @generated
	 */
	String getBezeichnung();

	/**
	 * Sets the value of the '{@link whisky.Whisky#getBezeichnung <em>Bezeichnung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' attribute.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(String value);

	/**
	 * Returns the value of the '<em><b>Alkoholgehalt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alkoholgehalt</em>' attribute.
	 * @see #setAlkoholgehalt(double)
	 * @see whisky.WhiskyPackage#getWhisky_Alkoholgehalt()
	 * @model
	 * @generated
	 */
	double getAlkoholgehalt();

	/**
	 * Sets the value of the '{@link whisky.Whisky#getAlkoholgehalt <em>Alkoholgehalt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alkoholgehalt</em>' attribute.
	 * @see #getAlkoholgehalt()
	 * @generated
	 */
	void setAlkoholgehalt(double value);

	/**
	 * Returns the value of the '<em><b>Sorte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorte</em>' attribute.
	 * @see #setSorte(String)
	 * @see whisky.WhiskyPackage#getWhisky_Sorte()
	 * @model
	 * @generated
	 */
	String getSorte();

	/**
	 * Sets the value of the '{@link whisky.Whisky#getSorte <em>Sorte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorte</em>' attribute.
	 * @see #getSorte()
	 * @generated
	 */
	void setSorte(String value);

	/**
	 * Returns the value of the '<em><b>Preis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preis</em>' attribute.
	 * @see #setPreis(double)
	 * @see whisky.WhiskyPackage#getWhisky_Preis()
	 * @model
	 * @generated
	 */
	double getPreis();

	/**
	 * Sets the value of the '{@link whisky.Whisky#getPreis <em>Preis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preis</em>' attribute.
	 * @see #getPreis()
	 * @generated
	 */
	void setPreis(double value);

	/**
	 * Returns the value of the '<em><b>Füllmenge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Füllmenge</em>' attribute.
	 * @see #setFüllmenge(double)
	 * @see whisky.WhiskyPackage#getWhisky_Füllmenge()
	 * @model
	 * @generated
	 */
	double getFüllmenge();

	/**
	 * Sets the value of the '{@link whisky.Whisky#getFüllmenge <em>Füllmenge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Füllmenge</em>' attribute.
	 * @see #getFüllmenge()
	 * @generated
	 */
	void setFüllmenge(double value);

	/**
	 * Returns the value of the '<em><b>Geschmack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geschmack</em>' attribute.
	 * @see #setGeschmack(String)
	 * @see whisky.WhiskyPackage#getWhisky_Geschmack()
	 * @model
	 * @generated
	 */
	String getGeschmack();

	/**
	 * Sets the value of the '{@link whisky.Whisky#getGeschmack <em>Geschmack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geschmack</em>' attribute.
	 * @see #getGeschmack()
	 * @generated
	 */
	void setGeschmack(String value);

	/**
	 * Returns the value of the '<em><b>Kategorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kategorie</em>' attribute.
	 * @see #setKategorie(String)
	 * @see whisky.WhiskyPackage#getWhisky_Kategorie()
	 * @model
	 * @generated
	 */
	String getKategorie();

	/**
	 * Sets the value of the '{@link whisky.Whisky#getKategorie <em>Kategorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kategorie</em>' attribute.
	 * @see #getKategorie()
	 * @generated
	 */
	void setKategorie(String value);

	/**
	 * Returns the value of the '<em><b>Alter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alter</em>' attribute.
	 * @see #setAlter(int)
	 * @see whisky.WhiskyPackage#getWhisky_Alter()
	 * @model
	 * @generated
	 */
	int getAlter();

	/**
	 * Sets the value of the '{@link whisky.Whisky#getAlter <em>Alter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alter</em>' attribute.
	 * @see #getAlter()
	 * @generated
	 */
	void setAlter(int value);

} // Whisky
