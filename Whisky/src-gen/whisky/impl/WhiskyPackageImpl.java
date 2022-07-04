/**
 */
package whisky.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import whisky.Blend;
import whisky.Distillerie;
import whisky.Herkunft;
import whisky.Herstellung;
import whisky.Lagerung;
import whisky.Whisky;
import whisky.WhiskyFactory;
import whisky.WhiskyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WhiskyPackageImpl extends EPackageImpl implements WhiskyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whiskyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass herkunftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distillerieEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lagerungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass herstellungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blendEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see whisky.WhiskyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WhiskyPackageImpl() {
		super(eNS_URI, WhiskyFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link WhiskyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WhiskyPackage init() {
		if (isInited)
			return (WhiskyPackage) EPackage.Registry.INSTANCE.getEPackage(WhiskyPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredWhiskyPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		WhiskyPackageImpl theWhiskyPackage = registeredWhiskyPackage instanceof WhiskyPackageImpl
				? (WhiskyPackageImpl) registeredWhiskyPackage
				: new WhiskyPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theWhiskyPackage.createPackageContents();

		// Initialize created meta-data
		theWhiskyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWhiskyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WhiskyPackage.eNS_URI, theWhiskyPackage);
		return theWhiskyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhisky() {
		return whiskyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhisky_Distillerie() {
		return (EReference) whiskyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhisky_Lagerung() {
		return (EReference) whiskyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhisky_Herstellung() {
		return (EReference) whiskyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhisky_Bezeichnung() {
		return (EAttribute) whiskyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhisky_Alkoholgehalt() {
		return (EAttribute) whiskyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhisky_Sorte() {
		return (EAttribute) whiskyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhisky_Preis() {
		return (EAttribute) whiskyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhisky_Füllmenge() {
		return (EAttribute) whiskyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhisky_Geschmack() {
		return (EAttribute) whiskyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhisky_Kategorie() {
		return (EAttribute) whiskyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhisky_Alter() {
		return (EAttribute) whiskyEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHerkunft() {
		return herkunftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHerkunft_Region() {
		return (EAttribute) herkunftEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHerkunft_Land() {
		return (EAttribute) herkunftEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistillerie() {
		return distillerieEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistillerie_Hersteller() {
		return (EAttribute) distillerieEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistillerie_Umsatz() {
		return (EAttribute) distillerieEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistillerie_Herkunft() {
		return (EReference) distillerieEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLagerung() {
		return lagerungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLagerung_Fass() {
		return (EAttribute) lagerungEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLagerung_Dauer() {
		return (EAttribute) lagerungEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHerstellung() {
		return herstellungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHerstellung_Filtrierung() {
		return (EAttribute) herstellungEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHerstellung_Farbstoffe() {
		return (EAttribute) herstellungEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHerstellung_SingleMalt() {
		return (EAttribute) herstellungEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlend() {
		return blendEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlend_Source() {
		return (EReference) blendEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlend_Target() {
		return (EReference) blendEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlend_MengeSource() {
		return (EAttribute) blendEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlend_TypHerstellung() {
		return (EReference) blendEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlend_TypLagerung() {
		return (EReference) blendEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhiskyFactory getWhiskyFactory() {
		return (WhiskyFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		whiskyEClass = createEClass(WHISKY);
		createEReference(whiskyEClass, WHISKY__DISTILLERIE);
		createEReference(whiskyEClass, WHISKY__LAGERUNG);
		createEReference(whiskyEClass, WHISKY__HERSTELLUNG);
		createEAttribute(whiskyEClass, WHISKY__BEZEICHNUNG);
		createEAttribute(whiskyEClass, WHISKY__ALKOHOLGEHALT);
		createEAttribute(whiskyEClass, WHISKY__SORTE);
		createEAttribute(whiskyEClass, WHISKY__PREIS);
		createEAttribute(whiskyEClass, WHISKY__FÜLLMENGE);
		createEAttribute(whiskyEClass, WHISKY__GESCHMACK);
		createEAttribute(whiskyEClass, WHISKY__KATEGORIE);
		createEAttribute(whiskyEClass, WHISKY__ALTER);

		herkunftEClass = createEClass(HERKUNFT);
		createEAttribute(herkunftEClass, HERKUNFT__REGION);
		createEAttribute(herkunftEClass, HERKUNFT__LAND);

		distillerieEClass = createEClass(DISTILLERIE);
		createEAttribute(distillerieEClass, DISTILLERIE__HERSTELLER);
		createEAttribute(distillerieEClass, DISTILLERIE__UMSATZ);
		createEReference(distillerieEClass, DISTILLERIE__HERKUNFT);

		lagerungEClass = createEClass(LAGERUNG);
		createEAttribute(lagerungEClass, LAGERUNG__FASS);
		createEAttribute(lagerungEClass, LAGERUNG__DAUER);

		herstellungEClass = createEClass(HERSTELLUNG);
		createEAttribute(herstellungEClass, HERSTELLUNG__FILTRIERUNG);
		createEAttribute(herstellungEClass, HERSTELLUNG__FARBSTOFFE);
		createEAttribute(herstellungEClass, HERSTELLUNG__SINGLE_MALT);

		blendEClass = createEClass(BLEND);
		createEReference(blendEClass, BLEND__SOURCE);
		createEReference(blendEClass, BLEND__TARGET);
		createEAttribute(blendEClass, BLEND__MENGE_SOURCE);
		createEReference(blendEClass, BLEND__TYP_HERSTELLUNG);
		createEReference(blendEClass, BLEND__TYP_LAGERUNG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(whiskyEClass, Whisky.class, "Whisky", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhisky_Distillerie(), this.getDistillerie(), null, "distillerie", null, 0, 1, Whisky.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWhisky_Lagerung(), this.getLagerung(), null, "lagerung", null, 0, 1, Whisky.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWhisky_Herstellung(), this.getHerstellung(), null, "herstellung", null, 0, 1, Whisky.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWhisky_Bezeichnung(), ecorePackage.getEString(), "bezeichnung", null, 0, 1, Whisky.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWhisky_Alkoholgehalt(), ecorePackage.getEDouble(), "alkoholgehalt", null, 0, 1, Whisky.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWhisky_Sorte(), ecorePackage.getEString(), "sorte", null, 0, 1, Whisky.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWhisky_Preis(), ecorePackage.getEDouble(), "preis", null, 0, 1, Whisky.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWhisky_Füllmenge(), ecorePackage.getEDouble(), "füllmenge", null, 0, 1, Whisky.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWhisky_Geschmack(), ecorePackage.getEString(), "geschmack", null, 0, 1, Whisky.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWhisky_Kategorie(), ecorePackage.getEString(), "kategorie", null, 0, 1, Whisky.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWhisky_Alter(), ecorePackage.getEInt(), "alter", null, 0, 1, Whisky.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(herkunftEClass, Herkunft.class, "Herkunft", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHerkunft_Region(), ecorePackage.getEString(), "region", null, 0, 1, Herkunft.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHerkunft_Land(), ecorePackage.getEString(), "land", null, 0, 1, Herkunft.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(distillerieEClass, Distillerie.class, "Distillerie", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDistillerie_Hersteller(), ecorePackage.getEString(), "hersteller", null, 0, 1,
				Distillerie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistillerie_Umsatz(), ecorePackage.getEDouble(), "umsatz", null, 0, 1, Distillerie.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistillerie_Herkunft(), this.getHerkunft(), null, "herkunft", null, 0, 1, Distillerie.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lagerungEClass, Lagerung.class, "Lagerung", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLagerung_Fass(), ecorePackage.getEString(), "fass", null, 0, 1, Lagerung.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLagerung_Dauer(), ecorePackage.getEInt(), "dauer", null, 0, 1, Lagerung.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(herstellungEClass, Herstellung.class, "Herstellung", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHerstellung_Filtrierung(), ecorePackage.getEString(), "filtrierung", null, 0, 1,
				Herstellung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHerstellung_Farbstoffe(), ecorePackage.getEBoolean(), "farbstoffe", null, 0, 1,
				Herstellung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHerstellung_SingleMalt(), ecorePackage.getEBoolean(), "singleMalt", null, 0, 1,
				Herstellung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(blendEClass, Blend.class, "Blend", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlend_Source(), this.getWhisky(), null, "source", null, 0, 1, Blend.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getBlend_Target(), this.getWhisky(), null, "target", null, 0, 1, Blend.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getBlend_MengeSource(), ecorePackage.getEDouble(), "mengeSource", null, 0, 1, Blend.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlend_TypHerstellung(), this.getHerstellung(), null, "typHerstellung", null, 0, 1,
				Blend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlend_TypLagerung(), this.getLagerung(), null, "typLagerung", null, 0, 1, Blend.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //WhiskyPackageImpl
