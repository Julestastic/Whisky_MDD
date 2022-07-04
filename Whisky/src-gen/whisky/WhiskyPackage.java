/**
 */
package whisky;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see whisky.WhiskyFactory
 * @model kind="package"
 * @generated
 */
public interface WhiskyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "whisky";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/whisky";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "whisky";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WhiskyPackage eINSTANCE = whisky.impl.WhiskyPackageImpl.init();

	/**
	 * The meta object id for the '{@link whisky.impl.WhiskyImpl <em>Whisky</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see whisky.impl.WhiskyImpl
	 * @see whisky.impl.WhiskyPackageImpl#getWhisky()
	 * @generated
	 */
	int WHISKY = 0;

	/**
	 * The feature id for the '<em><b>Distillerie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHISKY__DISTILLERIE = 0;

	/**
	 * The feature id for the '<em><b>Lagerung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHISKY__LAGERUNG = 1;

	/**
	 * The feature id for the '<em><b>Herstellung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHISKY__HERSTELLUNG = 2;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHISKY__BEZEICHNUNG = 3;

	/**
	 * The feature id for the '<em><b>Alkoholgehalt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHISKY__ALKOHOLGEHALT = 4;

	/**
	 * The feature id for the '<em><b>Sorte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHISKY__SORTE = 5;

	/**
	 * The feature id for the '<em><b>Preis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHISKY__PREIS = 6;

	/**
	 * The feature id for the '<em><b>Füllmenge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHISKY__FÜLLMENGE = 7;

	/**
	 * The feature id for the '<em><b>Geschmack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHISKY__GESCHMACK = 8;

	/**
	 * The feature id for the '<em><b>Kategorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHISKY__KATEGORIE = 9;

	/**
	 * The feature id for the '<em><b>Alter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHISKY__ALTER = 10;

	/**
	 * The number of structural features of the '<em>Whisky</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHISKY_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Whisky</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHISKY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link whisky.impl.HerkunftImpl <em>Herkunft</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see whisky.impl.HerkunftImpl
	 * @see whisky.impl.WhiskyPackageImpl#getHerkunft()
	 * @generated
	 */
	int HERKUNFT = 1;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERKUNFT__REGION = 0;

	/**
	 * The feature id for the '<em><b>Land</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERKUNFT__LAND = 1;

	/**
	 * The number of structural features of the '<em>Herkunft</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERKUNFT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Herkunft</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERKUNFT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link whisky.impl.DistillerieImpl <em>Distillerie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see whisky.impl.DistillerieImpl
	 * @see whisky.impl.WhiskyPackageImpl#getDistillerie()
	 * @generated
	 */
	int DISTILLERIE = 2;

	/**
	 * The feature id for the '<em><b>Hersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTILLERIE__HERSTELLER = 0;

	/**
	 * The feature id for the '<em><b>Umsatz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTILLERIE__UMSATZ = 1;

	/**
	 * The feature id for the '<em><b>Herkunft</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTILLERIE__HERKUNFT = 2;

	/**
	 * The number of structural features of the '<em>Distillerie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTILLERIE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Distillerie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTILLERIE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link whisky.impl.LagerungImpl <em>Lagerung</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see whisky.impl.LagerungImpl
	 * @see whisky.impl.WhiskyPackageImpl#getLagerung()
	 * @generated
	 */
	int LAGERUNG = 3;

	/**
	 * The feature id for the '<em><b>Fass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGERUNG__FASS = 0;

	/**
	 * The feature id for the '<em><b>Dauer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGERUNG__DAUER = 1;

	/**
	 * The number of structural features of the '<em>Lagerung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGERUNG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Lagerung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGERUNG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link whisky.impl.HerstellungImpl <em>Herstellung</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see whisky.impl.HerstellungImpl
	 * @see whisky.impl.WhiskyPackageImpl#getHerstellung()
	 * @generated
	 */
	int HERSTELLUNG = 4;

	/**
	 * The feature id for the '<em><b>Filtrierung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERSTELLUNG__FILTRIERUNG = 0;

	/**
	 * The feature id for the '<em><b>Farbstoffe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERSTELLUNG__FARBSTOFFE = 1;

	/**
	 * The feature id for the '<em><b>Single Malt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERSTELLUNG__SINGLE_MALT = 2;

	/**
	 * The number of structural features of the '<em>Herstellung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERSTELLUNG_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Herstellung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERSTELLUNG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link whisky.impl.BlendImpl <em>Blend</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see whisky.impl.BlendImpl
	 * @see whisky.impl.WhiskyPackageImpl#getBlend()
	 * @generated
	 */
	int BLEND = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLEND__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLEND__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Menge Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLEND__MENGE_SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Typ Herstellung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLEND__TYP_HERSTELLUNG = 3;

	/**
	 * The feature id for the '<em><b>Typ Lagerung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLEND__TYP_LAGERUNG = 4;

	/**
	 * The number of structural features of the '<em>Blend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLEND_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Blend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLEND_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link whisky.Whisky <em>Whisky</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Whisky</em>'.
	 * @see whisky.Whisky
	 * @generated
	 */
	EClass getWhisky();

	/**
	 * Returns the meta object for the containment reference '{@link whisky.Whisky#getDistillerie <em>Distillerie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distillerie</em>'.
	 * @see whisky.Whisky#getDistillerie()
	 * @see #getWhisky()
	 * @generated
	 */
	EReference getWhisky_Distillerie();

	/**
	 * Returns the meta object for the reference '{@link whisky.Whisky#getLagerung <em>Lagerung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lagerung</em>'.
	 * @see whisky.Whisky#getLagerung()
	 * @see #getWhisky()
	 * @generated
	 */
	EReference getWhisky_Lagerung();

	/**
	 * Returns the meta object for the reference '{@link whisky.Whisky#getHerstellung <em>Herstellung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Herstellung</em>'.
	 * @see whisky.Whisky#getHerstellung()
	 * @see #getWhisky()
	 * @generated
	 */
	EReference getWhisky_Herstellung();

	/**
	 * Returns the meta object for the attribute '{@link whisky.Whisky#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bezeichnung</em>'.
	 * @see whisky.Whisky#getBezeichnung()
	 * @see #getWhisky()
	 * @generated
	 */
	EAttribute getWhisky_Bezeichnung();

	/**
	 * Returns the meta object for the attribute '{@link whisky.Whisky#getAlkoholgehalt <em>Alkoholgehalt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alkoholgehalt</em>'.
	 * @see whisky.Whisky#getAlkoholgehalt()
	 * @see #getWhisky()
	 * @generated
	 */
	EAttribute getWhisky_Alkoholgehalt();

	/**
	 * Returns the meta object for the attribute '{@link whisky.Whisky#getSorte <em>Sorte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sorte</em>'.
	 * @see whisky.Whisky#getSorte()
	 * @see #getWhisky()
	 * @generated
	 */
	EAttribute getWhisky_Sorte();

	/**
	 * Returns the meta object for the attribute '{@link whisky.Whisky#getPreis <em>Preis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preis</em>'.
	 * @see whisky.Whisky#getPreis()
	 * @see #getWhisky()
	 * @generated
	 */
	EAttribute getWhisky_Preis();

	/**
	 * Returns the meta object for the attribute '{@link whisky.Whisky#getFüllmenge <em>Füllmenge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Füllmenge</em>'.
	 * @see whisky.Whisky#getFüllmenge()
	 * @see #getWhisky()
	 * @generated
	 */
	EAttribute getWhisky_Füllmenge();

	/**
	 * Returns the meta object for the attribute '{@link whisky.Whisky#getGeschmack <em>Geschmack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geschmack</em>'.
	 * @see whisky.Whisky#getGeschmack()
	 * @see #getWhisky()
	 * @generated
	 */
	EAttribute getWhisky_Geschmack();

	/**
	 * Returns the meta object for the attribute '{@link whisky.Whisky#getKategorie <em>Kategorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kategorie</em>'.
	 * @see whisky.Whisky#getKategorie()
	 * @see #getWhisky()
	 * @generated
	 */
	EAttribute getWhisky_Kategorie();

	/**
	 * Returns the meta object for the attribute '{@link whisky.Whisky#getAlter <em>Alter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alter</em>'.
	 * @see whisky.Whisky#getAlter()
	 * @see #getWhisky()
	 * @generated
	 */
	EAttribute getWhisky_Alter();

	/**
	 * Returns the meta object for class '{@link whisky.Herkunft <em>Herkunft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Herkunft</em>'.
	 * @see whisky.Herkunft
	 * @generated
	 */
	EClass getHerkunft();

	/**
	 * Returns the meta object for the attribute '{@link whisky.Herkunft#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see whisky.Herkunft#getRegion()
	 * @see #getHerkunft()
	 * @generated
	 */
	EAttribute getHerkunft_Region();

	/**
	 * Returns the meta object for the attribute '{@link whisky.Herkunft#getLand <em>Land</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Land</em>'.
	 * @see whisky.Herkunft#getLand()
	 * @see #getHerkunft()
	 * @generated
	 */
	EAttribute getHerkunft_Land();

	/**
	 * Returns the meta object for class '{@link whisky.Distillerie <em>Distillerie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distillerie</em>'.
	 * @see whisky.Distillerie
	 * @generated
	 */
	EClass getDistillerie();

	/**
	 * Returns the meta object for the attribute '{@link whisky.Distillerie#getHersteller <em>Hersteller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hersteller</em>'.
	 * @see whisky.Distillerie#getHersteller()
	 * @see #getDistillerie()
	 * @generated
	 */
	EAttribute getDistillerie_Hersteller();

	/**
	 * Returns the meta object for the attribute '{@link whisky.Distillerie#getUmsatz <em>Umsatz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Umsatz</em>'.
	 * @see whisky.Distillerie#getUmsatz()
	 * @see #getDistillerie()
	 * @generated
	 */
	EAttribute getDistillerie_Umsatz();

	/**
	 * Returns the meta object for the reference '{@link whisky.Distillerie#getHerkunft <em>Herkunft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Herkunft</em>'.
	 * @see whisky.Distillerie#getHerkunft()
	 * @see #getDistillerie()
	 * @generated
	 */
	EReference getDistillerie_Herkunft();

	/**
	 * Returns the meta object for class '{@link whisky.Lagerung <em>Lagerung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lagerung</em>'.
	 * @see whisky.Lagerung
	 * @generated
	 */
	EClass getLagerung();

	/**
	 * Returns the meta object for the attribute '{@link whisky.Lagerung#getFass <em>Fass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fass</em>'.
	 * @see whisky.Lagerung#getFass()
	 * @see #getLagerung()
	 * @generated
	 */
	EAttribute getLagerung_Fass();

	/**
	 * Returns the meta object for the attribute '{@link whisky.Lagerung#getDauer <em>Dauer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dauer</em>'.
	 * @see whisky.Lagerung#getDauer()
	 * @see #getLagerung()
	 * @generated
	 */
	EAttribute getLagerung_Dauer();

	/**
	 * Returns the meta object for class '{@link whisky.Herstellung <em>Herstellung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Herstellung</em>'.
	 * @see whisky.Herstellung
	 * @generated
	 */
	EClass getHerstellung();

	/**
	 * Returns the meta object for the attribute '{@link whisky.Herstellung#getFiltrierung <em>Filtrierung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filtrierung</em>'.
	 * @see whisky.Herstellung#getFiltrierung()
	 * @see #getHerstellung()
	 * @generated
	 */
	EAttribute getHerstellung_Filtrierung();

	/**
	 * Returns the meta object for the attribute '{@link whisky.Herstellung#isFarbstoffe <em>Farbstoffe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Farbstoffe</em>'.
	 * @see whisky.Herstellung#isFarbstoffe()
	 * @see #getHerstellung()
	 * @generated
	 */
	EAttribute getHerstellung_Farbstoffe();

	/**
	 * Returns the meta object for the attribute '{@link whisky.Herstellung#isSingleMalt <em>Single Malt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Single Malt</em>'.
	 * @see whisky.Herstellung#isSingleMalt()
	 * @see #getHerstellung()
	 * @generated
	 */
	EAttribute getHerstellung_SingleMalt();

	/**
	 * Returns the meta object for class '{@link whisky.Blend <em>Blend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blend</em>'.
	 * @see whisky.Blend
	 * @generated
	 */
	EClass getBlend();

	/**
	 * Returns the meta object for the reference '{@link whisky.Blend#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see whisky.Blend#getSource()
	 * @see #getBlend()
	 * @generated
	 */
	EReference getBlend_Source();

	/**
	 * Returns the meta object for the reference '{@link whisky.Blend#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see whisky.Blend#getTarget()
	 * @see #getBlend()
	 * @generated
	 */
	EReference getBlend_Target();

	/**
	 * Returns the meta object for the attribute '{@link whisky.Blend#getMengeSource <em>Menge Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Menge Source</em>'.
	 * @see whisky.Blend#getMengeSource()
	 * @see #getBlend()
	 * @generated
	 */
	EAttribute getBlend_MengeSource();

	/**
	 * Returns the meta object for the reference '{@link whisky.Blend#getTypHerstellung <em>Typ Herstellung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Typ Herstellung</em>'.
	 * @see whisky.Blend#getTypHerstellung()
	 * @see #getBlend()
	 * @generated
	 */
	EReference getBlend_TypHerstellung();

	/**
	 * Returns the meta object for the reference '{@link whisky.Blend#getTypLagerung <em>Typ Lagerung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Typ Lagerung</em>'.
	 * @see whisky.Blend#getTypLagerung()
	 * @see #getBlend()
	 * @generated
	 */
	EReference getBlend_TypLagerung();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WhiskyFactory getWhiskyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link whisky.impl.WhiskyImpl <em>Whisky</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see whisky.impl.WhiskyImpl
		 * @see whisky.impl.WhiskyPackageImpl#getWhisky()
		 * @generated
		 */
		EClass WHISKY = eINSTANCE.getWhisky();

		/**
		 * The meta object literal for the '<em><b>Distillerie</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHISKY__DISTILLERIE = eINSTANCE.getWhisky_Distillerie();

		/**
		 * The meta object literal for the '<em><b>Lagerung</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHISKY__LAGERUNG = eINSTANCE.getWhisky_Lagerung();

		/**
		 * The meta object literal for the '<em><b>Herstellung</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHISKY__HERSTELLUNG = eINSTANCE.getWhisky_Herstellung();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHISKY__BEZEICHNUNG = eINSTANCE.getWhisky_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>Alkoholgehalt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHISKY__ALKOHOLGEHALT = eINSTANCE.getWhisky_Alkoholgehalt();

		/**
		 * The meta object literal for the '<em><b>Sorte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHISKY__SORTE = eINSTANCE.getWhisky_Sorte();

		/**
		 * The meta object literal for the '<em><b>Preis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHISKY__PREIS = eINSTANCE.getWhisky_Preis();

		/**
		 * The meta object literal for the '<em><b>Füllmenge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHISKY__FÜLLMENGE = eINSTANCE.getWhisky_Füllmenge();

		/**
		 * The meta object literal for the '<em><b>Geschmack</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHISKY__GESCHMACK = eINSTANCE.getWhisky_Geschmack();

		/**
		 * The meta object literal for the '<em><b>Kategorie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHISKY__KATEGORIE = eINSTANCE.getWhisky_Kategorie();

		/**
		 * The meta object literal for the '<em><b>Alter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHISKY__ALTER = eINSTANCE.getWhisky_Alter();

		/**
		 * The meta object literal for the '{@link whisky.impl.HerkunftImpl <em>Herkunft</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see whisky.impl.HerkunftImpl
		 * @see whisky.impl.WhiskyPackageImpl#getHerkunft()
		 * @generated
		 */
		EClass HERKUNFT = eINSTANCE.getHerkunft();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HERKUNFT__REGION = eINSTANCE.getHerkunft_Region();

		/**
		 * The meta object literal for the '<em><b>Land</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HERKUNFT__LAND = eINSTANCE.getHerkunft_Land();

		/**
		 * The meta object literal for the '{@link whisky.impl.DistillerieImpl <em>Distillerie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see whisky.impl.DistillerieImpl
		 * @see whisky.impl.WhiskyPackageImpl#getDistillerie()
		 * @generated
		 */
		EClass DISTILLERIE = eINSTANCE.getDistillerie();

		/**
		 * The meta object literal for the '<em><b>Hersteller</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTILLERIE__HERSTELLER = eINSTANCE.getDistillerie_Hersteller();

		/**
		 * The meta object literal for the '<em><b>Umsatz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTILLERIE__UMSATZ = eINSTANCE.getDistillerie_Umsatz();

		/**
		 * The meta object literal for the '<em><b>Herkunft</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTILLERIE__HERKUNFT = eINSTANCE.getDistillerie_Herkunft();

		/**
		 * The meta object literal for the '{@link whisky.impl.LagerungImpl <em>Lagerung</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see whisky.impl.LagerungImpl
		 * @see whisky.impl.WhiskyPackageImpl#getLagerung()
		 * @generated
		 */
		EClass LAGERUNG = eINSTANCE.getLagerung();

		/**
		 * The meta object literal for the '<em><b>Fass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAGERUNG__FASS = eINSTANCE.getLagerung_Fass();

		/**
		 * The meta object literal for the '<em><b>Dauer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAGERUNG__DAUER = eINSTANCE.getLagerung_Dauer();

		/**
		 * The meta object literal for the '{@link whisky.impl.HerstellungImpl <em>Herstellung</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see whisky.impl.HerstellungImpl
		 * @see whisky.impl.WhiskyPackageImpl#getHerstellung()
		 * @generated
		 */
		EClass HERSTELLUNG = eINSTANCE.getHerstellung();

		/**
		 * The meta object literal for the '<em><b>Filtrierung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HERSTELLUNG__FILTRIERUNG = eINSTANCE.getHerstellung_Filtrierung();

		/**
		 * The meta object literal for the '<em><b>Farbstoffe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HERSTELLUNG__FARBSTOFFE = eINSTANCE.getHerstellung_Farbstoffe();

		/**
		 * The meta object literal for the '<em><b>Single Malt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HERSTELLUNG__SINGLE_MALT = eINSTANCE.getHerstellung_SingleMalt();

		/**
		 * The meta object literal for the '{@link whisky.impl.BlendImpl <em>Blend</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see whisky.impl.BlendImpl
		 * @see whisky.impl.WhiskyPackageImpl#getBlend()
		 * @generated
		 */
		EClass BLEND = eINSTANCE.getBlend();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLEND__SOURCE = eINSTANCE.getBlend_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLEND__TARGET = eINSTANCE.getBlend_Target();

		/**
		 * The meta object literal for the '<em><b>Menge Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLEND__MENGE_SOURCE = eINSTANCE.getBlend_MengeSource();

		/**
		 * The meta object literal for the '<em><b>Typ Herstellung</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLEND__TYP_HERSTELLUNG = eINSTANCE.getBlend_TypHerstellung();

		/**
		 * The meta object literal for the '<em><b>Typ Lagerung</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLEND__TYP_LAGERUNG = eINSTANCE.getBlend_TypLagerung();

	}

} //WhiskyPackage
