/**
 */
package whisky;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see whisky.WhiskyPackage
 * @generated
 */
public interface WhiskyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WhiskyFactory eINSTANCE = whisky.impl.WhiskyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Whisky</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Whisky</em>'.
	 * @generated
	 */
	Whisky createWhisky();

	/**
	 * Returns a new object of class '<em>Herkunft</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Herkunft</em>'.
	 * @generated
	 */
	Herkunft createHerkunft();

	/**
	 * Returns a new object of class '<em>Distillerie</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distillerie</em>'.
	 * @generated
	 */
	Distillerie createDistillerie();

	/**
	 * Returns a new object of class '<em>Lagerung</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lagerung</em>'.
	 * @generated
	 */
	Lagerung createLagerung();

	/**
	 * Returns a new object of class '<em>Herstellung</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Herstellung</em>'.
	 * @generated
	 */
	Herstellung createHerstellung();

	/**
	 * Returns a new object of class '<em>Blend</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blend</em>'.
	 * @generated
	 */
	Blend createBlend();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WhiskyPackage getWhiskyPackage();

} //WhiskyFactory
