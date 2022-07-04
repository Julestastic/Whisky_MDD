/**
 */
package whisky;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distillerie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link whisky.Distillerie#getHersteller <em>Hersteller</em>}</li>
 *   <li>{@link whisky.Distillerie#getUmsatz <em>Umsatz</em>}</li>
 *   <li>{@link whisky.Distillerie#getHerkunft <em>Herkunft</em>}</li>
 * </ul>
 *
 * @see whisky.WhiskyPackage#getDistillerie()
 * @model
 * @generated
 */
public interface Distillerie extends EObject {
	/**
	 * Returns the value of the '<em><b>Hersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hersteller</em>' attribute.
	 * @see #setHersteller(String)
	 * @see whisky.WhiskyPackage#getDistillerie_Hersteller()
	 * @model
	 * @generated
	 */
	String getHersteller();

	/**
	 * Sets the value of the '{@link whisky.Distillerie#getHersteller <em>Hersteller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hersteller</em>' attribute.
	 * @see #getHersteller()
	 * @generated
	 */
	void setHersteller(String value);

	/**
	 * Returns the value of the '<em><b>Umsatz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Umsatz</em>' attribute.
	 * @see #setUmsatz(double)
	 * @see whisky.WhiskyPackage#getDistillerie_Umsatz()
	 * @model
	 * @generated
	 */
	double getUmsatz();

	/**
	 * Sets the value of the '{@link whisky.Distillerie#getUmsatz <em>Umsatz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Umsatz</em>' attribute.
	 * @see #getUmsatz()
	 * @generated
	 */
	void setUmsatz(double value);

	/**
	 * Returns the value of the '<em><b>Herkunft</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Herkunft</em>' reference.
	 * @see #setHerkunft(Herkunft)
	 * @see whisky.WhiskyPackage#getDistillerie_Herkunft()
	 * @model
	 * @generated
	 */
	Herkunft getHerkunft();

	/**
	 * Sets the value of the '{@link whisky.Distillerie#getHerkunft <em>Herkunft</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Herkunft</em>' reference.
	 * @see #getHerkunft()
	 * @generated
	 */
	void setHerkunft(Herkunft value);

} // Distillerie
