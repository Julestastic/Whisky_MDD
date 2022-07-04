/**
 */
package whisky;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blend</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link whisky.Blend#getSource <em>Source</em>}</li>
 *   <li>{@link whisky.Blend#getTarget <em>Target</em>}</li>
 *   <li>{@link whisky.Blend#getMengeSource <em>Menge Source</em>}</li>
 *   <li>{@link whisky.Blend#getTypHerstellung <em>Typ Herstellung</em>}</li>
 *   <li>{@link whisky.Blend#getTypLagerung <em>Typ Lagerung</em>}</li>
 * </ul>
 *
 * @see whisky.WhiskyPackage#getBlend()
 * @model
 * @generated
 */
public interface Blend extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Whisky)
	 * @see whisky.WhiskyPackage#getBlend_Source()
	 * @model
	 * @generated
	 */
	Whisky getSource();

	/**
	 * Sets the value of the '{@link whisky.Blend#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Whisky value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Whisky)
	 * @see whisky.WhiskyPackage#getBlend_Target()
	 * @model
	 * @generated
	 */
	Whisky getTarget();

	/**
	 * Sets the value of the '{@link whisky.Blend#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Whisky value);

	/**
	 * Returns the value of the '<em><b>Menge Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menge Source</em>' attribute.
	 * @see #setMengeSource(double)
	 * @see whisky.WhiskyPackage#getBlend_MengeSource()
	 * @model
	 * @generated
	 */
	double getMengeSource();

	/**
	 * Sets the value of the '{@link whisky.Blend#getMengeSource <em>Menge Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menge Source</em>' attribute.
	 * @see #getMengeSource()
	 * @generated
	 */
	void setMengeSource(double value);

	/**
	 * Returns the value of the '<em><b>Typ Herstellung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typ Herstellung</em>' reference.
	 * @see #setTypHerstellung(Herstellung)
	 * @see whisky.WhiskyPackage#getBlend_TypHerstellung()
	 * @model
	 * @generated
	 */
	Herstellung getTypHerstellung();

	/**
	 * Sets the value of the '{@link whisky.Blend#getTypHerstellung <em>Typ Herstellung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typ Herstellung</em>' reference.
	 * @see #getTypHerstellung()
	 * @generated
	 */
	void setTypHerstellung(Herstellung value);

	/**
	 * Returns the value of the '<em><b>Typ Lagerung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typ Lagerung</em>' reference.
	 * @see #setTypLagerung(Lagerung)
	 * @see whisky.WhiskyPackage#getBlend_TypLagerung()
	 * @model
	 * @generated
	 */
	Lagerung getTypLagerung();

	/**
	 * Sets the value of the '{@link whisky.Blend#getTypLagerung <em>Typ Lagerung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typ Lagerung</em>' reference.
	 * @see #getTypLagerung()
	 * @generated
	 */
	void setTypLagerung(Lagerung value);

} // Blend
