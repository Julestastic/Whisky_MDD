/**
 */
package whisky.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import whisky.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WhiskyFactoryImpl extends EFactoryImpl implements WhiskyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WhiskyFactory init() {
		try {
			WhiskyFactory theWhiskyFactory = (WhiskyFactory) EPackage.Registry.INSTANCE
					.getEFactory(WhiskyPackage.eNS_URI);
			if (theWhiskyFactory != null) {
				return theWhiskyFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WhiskyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhiskyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case WhiskyPackage.WHISKY:
			return createWhisky();
		case WhiskyPackage.HERKUNFT:
			return createHerkunft();
		case WhiskyPackage.DISTILLERIE:
			return createDistillerie();
		case WhiskyPackage.LAGERUNG:
			return createLagerung();
		case WhiskyPackage.HERSTELLUNG:
			return createHerstellung();
		case WhiskyPackage.BLEND:
			return createBlend();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Whisky createWhisky() {
		WhiskyImpl whisky = new WhiskyImpl();
		return whisky;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Herkunft createHerkunft() {
		HerkunftImpl herkunft = new HerkunftImpl();
		return herkunft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distillerie createDistillerie() {
		DistillerieImpl distillerie = new DistillerieImpl();
		return distillerie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lagerung createLagerung() {
		LagerungImpl lagerung = new LagerungImpl();
		return lagerung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Herstellung createHerstellung() {
		HerstellungImpl herstellung = new HerstellungImpl();
		return herstellung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Blend createBlend() {
		BlendImpl blend = new BlendImpl();
		return blend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhiskyPackage getWhiskyPackage() {
		return (WhiskyPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WhiskyPackage getPackage() {
		return WhiskyPackage.eINSTANCE;
	}

} //WhiskyFactoryImpl
