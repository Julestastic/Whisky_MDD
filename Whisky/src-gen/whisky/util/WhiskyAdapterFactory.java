/**
 */
package whisky.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import whisky.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see whisky.WhiskyPackage
 * @generated
 */
public class WhiskyAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WhiskyPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhiskyAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WhiskyPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhiskySwitch<Adapter> modelSwitch = new WhiskySwitch<Adapter>() {
		@Override
		public Adapter caseWhisky(Whisky object) {
			return createWhiskyAdapter();
		}

		@Override
		public Adapter caseHerkunft(Herkunft object) {
			return createHerkunftAdapter();
		}

		@Override
		public Adapter caseDistillerie(Distillerie object) {
			return createDistillerieAdapter();
		}

		@Override
		public Adapter caseLagerung(Lagerung object) {
			return createLagerungAdapter();
		}

		@Override
		public Adapter caseHerstellung(Herstellung object) {
			return createHerstellungAdapter();
		}

		@Override
		public Adapter caseBlend(Blend object) {
			return createBlendAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link whisky.Whisky <em>Whisky</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see whisky.Whisky
	 * @generated
	 */
	public Adapter createWhiskyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link whisky.Herkunft <em>Herkunft</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see whisky.Herkunft
	 * @generated
	 */
	public Adapter createHerkunftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link whisky.Distillerie <em>Distillerie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see whisky.Distillerie
	 * @generated
	 */
	public Adapter createDistillerieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link whisky.Lagerung <em>Lagerung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see whisky.Lagerung
	 * @generated
	 */
	public Adapter createLagerungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link whisky.Herstellung <em>Herstellung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see whisky.Herstellung
	 * @generated
	 */
	public Adapter createHerstellungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link whisky.Blend <em>Blend</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see whisky.Blend
	 * @generated
	 */
	public Adapter createBlendAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WhiskyAdapterFactory
