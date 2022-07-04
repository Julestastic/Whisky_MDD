/**
 */
package whisky;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lagerung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link whisky.Lagerung#getFass <em>Fass</em>}</li>
 *   <li>{@link whisky.Lagerung#getDauer <em>Dauer</em>}</li>
 * </ul>
 *
 * @see whisky.WhiskyPackage#getLagerung()
 * @model
 * @generated
 */
public interface Lagerung extends EObject {
	/**
	 * Returns the value of the '<em><b>Fass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fass</em>' attribute.
	 * @see #setFass(String)
	 * @see whisky.WhiskyPackage#getLagerung_Fass()
	 * @model
	 * @generated
	 */
	String getFass();

	/**
	 * Sets the value of the '{@link whisky.Lagerung#getFass <em>Fass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fass</em>' attribute.
	 * @see #getFass()
	 * @generated
	 */
	void setFass(String value);

	/**
	 * Returns the value of the '<em><b>Dauer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dauer</em>' attribute.
	 * @see #setDauer(int)
	 * @see whisky.WhiskyPackage#getLagerung_Dauer()
	 * @model
	 * @generated
	 */
	int getDauer();

	/**
	 * Sets the value of the '{@link whisky.Lagerung#getDauer <em>Dauer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dauer</em>' attribute.
	 * @see #getDauer()
	 * @generated
	 */
	void setDauer(int value);

} // Lagerung
