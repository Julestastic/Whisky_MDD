/**
 */
package whisky;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Herkunft</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link whisky.Herkunft#getRegion <em>Region</em>}</li>
 *   <li>{@link whisky.Herkunft#getLand <em>Land</em>}</li>
 * </ul>
 *
 * @see whisky.WhiskyPackage#getHerkunft()
 * @model
 * @generated
 */
public interface Herkunft extends EObject {
	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #setRegion(String)
	 * @see whisky.WhiskyPackage#getHerkunft_Region()
	 * @model
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link whisky.Herkunft#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

	/**
	 * Returns the value of the '<em><b>Land</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Land</em>' attribute.
	 * @see #setLand(String)
	 * @see whisky.WhiskyPackage#getHerkunft_Land()
	 * @model
	 * @generated
	 */
	String getLand();

	/**
	 * Sets the value of the '{@link whisky.Herkunft#getLand <em>Land</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Land</em>' attribute.
	 * @see #getLand()
	 * @generated
	 */
	void setLand(String value);

} // Herkunft
