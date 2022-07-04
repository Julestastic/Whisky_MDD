/**
 */
package whisky;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Herstellung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link whisky.Herstellung#getFiltrierung <em>Filtrierung</em>}</li>
 *   <li>{@link whisky.Herstellung#isFarbstoffe <em>Farbstoffe</em>}</li>
 *   <li>{@link whisky.Herstellung#isSingleMalt <em>Single Malt</em>}</li>
 * </ul>
 *
 * @see whisky.WhiskyPackage#getHerstellung()
 * @model
 * @generated
 */
public interface Herstellung extends EObject {
	/**
	 * Returns the value of the '<em><b>Filtrierung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filtrierung</em>' attribute.
	 * @see #setFiltrierung(String)
	 * @see whisky.WhiskyPackage#getHerstellung_Filtrierung()
	 * @model
	 * @generated
	 */
	String getFiltrierung();

	/**
	 * Sets the value of the '{@link whisky.Herstellung#getFiltrierung <em>Filtrierung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filtrierung</em>' attribute.
	 * @see #getFiltrierung()
	 * @generated
	 */
	void setFiltrierung(String value);

	/**
	 * Returns the value of the '<em><b>Farbstoffe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Farbstoffe</em>' attribute.
	 * @see #setFarbstoffe(boolean)
	 * @see whisky.WhiskyPackage#getHerstellung_Farbstoffe()
	 * @model
	 * @generated
	 */
	boolean isFarbstoffe();

	/**
	 * Sets the value of the '{@link whisky.Herstellung#isFarbstoffe <em>Farbstoffe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Farbstoffe</em>' attribute.
	 * @see #isFarbstoffe()
	 * @generated
	 */
	void setFarbstoffe(boolean value);

	/**
	 * Returns the value of the '<em><b>Single Malt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Malt</em>' attribute.
	 * @see #setSingleMalt(boolean)
	 * @see whisky.WhiskyPackage#getHerstellung_SingleMalt()
	 * @model
	 * @generated
	 */
	boolean isSingleMalt();

	/**
	 * Sets the value of the '{@link whisky.Herstellung#isSingleMalt <em>Single Malt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Malt</em>' attribute.
	 * @see #isSingleMalt()
	 * @generated
	 */
	void setSingleMalt(boolean value);

} // Herstellung
