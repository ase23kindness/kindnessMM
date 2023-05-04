/**
 */
package Psycho_Social_Factor.Psychological.impl;

import Psycho_Social_Factor.Psycho_Social_FactorPackage;

import Psycho_Social_Factor.Psychological.CharacterTrait;
import Psycho_Social_Factor.Psychological.Emotion;
import Psycho_Social_Factor.Psychological.HumanValue;
import Psycho_Social_Factor.Psychological.OtherPsychologicalFactor;
import Psycho_Social_Factor.Psychological.PsychologicalFactor;
import Psycho_Social_Factor.Psychological.PsychologicalFactory;
import Psycho_Social_Factor.Psychological.PsychologicalPackage;
import Psycho_Social_Factor.Psychological.SelfEfficacy;

import Psycho_Social_Factor.Social.SocialPackage;

import Psycho_Social_Factor.Social.impl.SocialPackageImpl;

import Psycho_Social_Factor.impl.Psycho_Social_FactorPackageImpl;

import diagram.DiagramPackage;

import diagram.impl.DiagramPackageImpl;

import kindness.KindnessPackage;

import kindness.impl.KindnessPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PsychologicalPackageImpl extends EPackageImpl implements PsychologicalPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emotionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selfEfficacyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterTraitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass humanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass psychologicalFactorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass otherPsychologicalFactorEClass = null;

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
	 * @see Psycho_Social_Factor.Psychological.PsychologicalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PsychologicalPackageImpl() {
		super(eNS_URI, PsychologicalFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PsychologicalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PsychologicalPackage init() {
		if (isInited)
			return (PsychologicalPackage) EPackage.Registry.INSTANCE.getEPackage(PsychologicalPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPsychologicalPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PsychologicalPackageImpl thePsychologicalPackage = registeredPsychologicalPackage instanceof PsychologicalPackageImpl
				? (PsychologicalPackageImpl) registeredPsychologicalPackage
				: new PsychologicalPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(KindnessPackage.eNS_URI);
		KindnessPackageImpl theKindnessPackage = (KindnessPackageImpl) (registeredPackage instanceof KindnessPackageImpl
				? registeredPackage
				: KindnessPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DiagramPackage.eNS_URI);
		DiagramPackageImpl theDiagramPackage = (DiagramPackageImpl) (registeredPackage instanceof DiagramPackageImpl
				? registeredPackage
				: DiagramPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Psycho_Social_FactorPackage.eNS_URI);
		Psycho_Social_FactorPackageImpl thePsycho_Social_FactorPackage = (Psycho_Social_FactorPackageImpl) (registeredPackage instanceof Psycho_Social_FactorPackageImpl
				? registeredPackage
				: Psycho_Social_FactorPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SocialPackage.eNS_URI);
		SocialPackageImpl theSocialPackage = (SocialPackageImpl) (registeredPackage instanceof SocialPackageImpl
				? registeredPackage
				: SocialPackage.eINSTANCE);

		// Create package meta-data objects
		thePsychologicalPackage.createPackageContents();
		theKindnessPackage.createPackageContents();
		theDiagramPackage.createPackageContents();
		thePsycho_Social_FactorPackage.createPackageContents();
		theSocialPackage.createPackageContents();

		// Initialize created meta-data
		thePsychologicalPackage.initializePackageContents();
		theKindnessPackage.initializePackageContents();
		theDiagramPackage.initializePackageContents();
		thePsycho_Social_FactorPackage.initializePackageContents();
		theSocialPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePsychologicalPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PsychologicalPackage.eNS_URI, thePsychologicalPackage);
		return thePsychologicalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmotion() {
		return emotionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmotion_Type() {
		return (EAttribute) emotionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelfEfficacy() {
		return selfEfficacyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacterTrait() {
		return characterTraitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterTrait_Trait() {
		return (EAttribute) characterTraitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHumanValue() {
		return humanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHumanValue_Value() {
		return (EAttribute) humanValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPsychologicalFactor() {
		return psychologicalFactorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOtherPsychologicalFactor() {
		return otherPsychologicalFactorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PsychologicalFactory getPsychologicalFactory() {
		return (PsychologicalFactory) getEFactoryInstance();
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
		emotionEClass = createEClass(EMOTION);
		createEAttribute(emotionEClass, EMOTION__TYPE);

		selfEfficacyEClass = createEClass(SELF_EFFICACY);

		characterTraitEClass = createEClass(CHARACTER_TRAIT);
		createEAttribute(characterTraitEClass, CHARACTER_TRAIT__TRAIT);

		humanValueEClass = createEClass(HUMAN_VALUE);
		createEAttribute(humanValueEClass, HUMAN_VALUE__VALUE);

		psychologicalFactorEClass = createEClass(PSYCHOLOGICAL_FACTOR);

		otherPsychologicalFactorEClass = createEClass(OTHER_PSYCHOLOGICAL_FACTOR);
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

		// Obtain other dependent packages
		Psycho_Social_FactorPackage thePsycho_Social_FactorPackage = (Psycho_Social_FactorPackage) EPackage.Registry.INSTANCE
				.getEPackage(Psycho_Social_FactorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		emotionEClass.getESuperTypes().add(this.getPsychologicalFactor());
		selfEfficacyEClass.getESuperTypes().add(this.getPsychologicalFactor());
		characterTraitEClass.getESuperTypes().add(this.getPsychologicalFactor());
		humanValueEClass.getESuperTypes().add(this.getPsychologicalFactor());
		psychologicalFactorEClass.getESuperTypes().add(thePsycho_Social_FactorPackage.getFactor());
		otherPsychologicalFactorEClass.getESuperTypes().add(this.getPsychologicalFactor());

		// Initialize classes, features, and operations; add parameters
		initEClass(emotionEClass, Emotion.class, "Emotion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmotion_Type(), thePsycho_Social_FactorPackage.getEmotionType(), "type", null, 0, 1,
				Emotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(selfEfficacyEClass, SelfEfficacy.class, "SelfEfficacy", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(characterTraitEClass, CharacterTrait.class, "CharacterTrait", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCharacterTrait_Trait(), thePsycho_Social_FactorPackage.getTraitType(), "trait", null, 0, 1,
				CharacterTrait.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(humanValueEClass, HumanValue.class, "HumanValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHumanValue_Value(), thePsycho_Social_FactorPackage.getHumanValueType(), "value", null, 0, 1,
				HumanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(psychologicalFactorEClass, PsychologicalFactor.class, "PsychologicalFactor", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(otherPsychologicalFactorEClass, OtherPsychologicalFactor.class, "OtherPsychologicalFactor",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //PsychologicalPackageImpl
