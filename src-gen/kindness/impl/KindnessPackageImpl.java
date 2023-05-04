/**
 */
package kindness.impl;

import Psycho_Social_Factor.Psycho_Social_FactorPackage;

import Psycho_Social_Factor.Psychological.PsychologicalPackage;

import Psycho_Social_Factor.Psychological.impl.PsychologicalPackageImpl;

import Psycho_Social_Factor.Social.SocialPackage;

import Psycho_Social_Factor.Social.impl.SocialPackageImpl;

import Psycho_Social_Factor.impl.Psycho_Social_FactorPackageImpl;

import diagram.DiagramPackage;

import diagram.impl.DiagramPackageImpl;

import kindness.AbilityAct;
import kindness.Act;
import kindness.Actor;
import kindness.Condition;
import kindness.Context;
import kindness.Giver;
import kindness.KindnessAct;
import kindness.KindnessEntity;
import kindness.KindnessFactory;
import kindness.KindnessOpportunity;
import kindness.KindnessPackage;
import kindness.Location;
import kindness.Motivation;
import kindness.MotivationAct;
import kindness.MotivationType;
import kindness.Observer;
import kindness.PromptAct;
import kindness.Property;
import kindness.Psychological_Factors;
import kindness.Receiver;
import kindness.Social_Factors;
import kindness.SupportingAct;
import kindness.Time;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KindnessPackageImpl extends EPackageImpl implements KindnessPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kindnessOpportunityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kindnessActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kindnessEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass giverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass social_FactorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass psychological_FactorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportingActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motivationActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abilityActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass promptActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum motivationTypeEEnum = null;

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
	 * @see kindness.KindnessPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KindnessPackageImpl() {
		super(eNS_URI, KindnessFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link KindnessPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static KindnessPackage init() {
		if (isInited)
			return (KindnessPackage) EPackage.Registry.INSTANCE.getEPackage(KindnessPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredKindnessPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		KindnessPackageImpl theKindnessPackage = registeredKindnessPackage instanceof KindnessPackageImpl
				? (KindnessPackageImpl) registeredKindnessPackage
				: new KindnessPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DiagramPackage.eNS_URI);
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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PsychologicalPackage.eNS_URI);
		PsychologicalPackageImpl thePsychologicalPackage = (PsychologicalPackageImpl) (registeredPackage instanceof PsychologicalPackageImpl
				? registeredPackage
				: PsychologicalPackage.eINSTANCE);

		// Create package meta-data objects
		theKindnessPackage.createPackageContents();
		theDiagramPackage.createPackageContents();
		thePsycho_Social_FactorPackage.createPackageContents();
		theSocialPackage.createPackageContents();
		thePsychologicalPackage.createPackageContents();

		// Initialize created meta-data
		theKindnessPackage.initializePackageContents();
		theDiagramPackage.initializePackageContents();
		thePsycho_Social_FactorPackage.initializePackageContents();
		theSocialPackage.initializePackageContents();
		thePsychologicalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKindnessPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(KindnessPackage.eNS_URI, theKindnessPackage);
		return theKindnessPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Name() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Value() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKindnessOpportunity() {
		return kindnessOpportunityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKindnessOpportunity_Name() {
		return (EAttribute) kindnessOpportunityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKindnessOpportunity_Properties() {
		return (EReference) kindnessOpportunityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKindnessOpportunity_Act() {
		return (EReference) kindnessOpportunityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKindnessOpportunity_Description() {
		return (EAttribute) kindnessOpportunityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKindnessOpportunity_Kindnessentity() {
		return (EReference) kindnessOpportunityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKindnessOpportunity_Actor() {
		return (EReference) kindnessOpportunityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKindnessAct() {
		return kindnessActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKindnessAct_Next() {
		return (EReference) kindnessActEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_Name() {
		return (EAttribute) conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Refkindnessentity() {
		return (EReference) conditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKindnessEntity() {
		return kindnessEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKindnessEntity_Name() {
		return (EAttribute) kindnessEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKindnessEntity_Properties() {
		return (EReference) kindnessEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTime() {
		return timeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_Social_factors() {
		return (EReference) actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_Psychological_factors() {
		return (EReference) actorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGiver() {
		return giverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGiver_Motivations() {
		return (EReference) giverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiver() {
		return receiverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObserver() {
		return observerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotivation() {
		return motivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotivation_Type() {
		return (EAttribute) motivationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotivation_Level() {
		return (EAttribute) motivationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMotivation_Towards() {
		return (EReference) motivationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocial_Factors() {
		return social_FactorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPsychological_Factors() {
		return psychological_FactorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_Location() {
		return (EReference) contextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_Time() {
		return (EReference) contextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportingAct() {
		return supportingActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotivationAct() {
		return motivationActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbilityAct() {
		return abilityActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAct() {
		return actEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAct_Precondition() {
		return (EReference) actEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAct_Postcondition() {
		return (EReference) actEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPromptAct() {
		return promptActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMotivationType() {
		return motivationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindnessFactory getKindnessFactory() {
		return (KindnessFactory) getEFactoryInstance();
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
		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__NAME);
		createEAttribute(propertyEClass, PROPERTY__VALUE);

		kindnessOpportunityEClass = createEClass(KINDNESS_OPPORTUNITY);
		createEAttribute(kindnessOpportunityEClass, KINDNESS_OPPORTUNITY__NAME);
		createEReference(kindnessOpportunityEClass, KINDNESS_OPPORTUNITY__PROPERTIES);
		createEReference(kindnessOpportunityEClass, KINDNESS_OPPORTUNITY__ACT);
		createEAttribute(kindnessOpportunityEClass, KINDNESS_OPPORTUNITY__DESCRIPTION);
		createEReference(kindnessOpportunityEClass, KINDNESS_OPPORTUNITY__KINDNESSENTITY);
		createEReference(kindnessOpportunityEClass, KINDNESS_OPPORTUNITY__ACTOR);

		kindnessActEClass = createEClass(KINDNESS_ACT);
		createEReference(kindnessActEClass, KINDNESS_ACT__NEXT);

		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__NAME);
		createEReference(conditionEClass, CONDITION__REFKINDNESSENTITY);

		kindnessEntityEClass = createEClass(KINDNESS_ENTITY);
		createEAttribute(kindnessEntityEClass, KINDNESS_ENTITY__NAME);
		createEReference(kindnessEntityEClass, KINDNESS_ENTITY__PROPERTIES);

		locationEClass = createEClass(LOCATION);

		timeEClass = createEClass(TIME);

		actorEClass = createEClass(ACTOR);
		createEReference(actorEClass, ACTOR__SOCIAL_FACTORS);
		createEReference(actorEClass, ACTOR__PSYCHOLOGICAL_FACTORS);

		giverEClass = createEClass(GIVER);
		createEReference(giverEClass, GIVER__MOTIVATIONS);

		receiverEClass = createEClass(RECEIVER);

		observerEClass = createEClass(OBSERVER);

		motivationEClass = createEClass(MOTIVATION);
		createEAttribute(motivationEClass, MOTIVATION__TYPE);
		createEAttribute(motivationEClass, MOTIVATION__LEVEL);
		createEReference(motivationEClass, MOTIVATION__TOWARDS);

		social_FactorsEClass = createEClass(SOCIAL_FACTORS);

		psychological_FactorsEClass = createEClass(PSYCHOLOGICAL_FACTORS);

		contextEClass = createEClass(CONTEXT);
		createEReference(contextEClass, CONTEXT__LOCATION);
		createEReference(contextEClass, CONTEXT__TIME);

		supportingActEClass = createEClass(SUPPORTING_ACT);

		motivationActEClass = createEClass(MOTIVATION_ACT);

		abilityActEClass = createEClass(ABILITY_ACT);

		actEClass = createEClass(ACT);
		createEReference(actEClass, ACT__PRECONDITION);
		createEReference(actEClass, ACT__POSTCONDITION);

		promptActEClass = createEClass(PROMPT_ACT);

		// Create enums
		motivationTypeEEnum = createEEnum(MOTIVATION_TYPE);
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
		DiagramPackage theDiagramPackage = (DiagramPackage) EPackage.Registry.INSTANCE
				.getEPackage(DiagramPackage.eNS_URI);
		Psycho_Social_FactorPackage thePsycho_Social_FactorPackage = (Psycho_Social_FactorPackage) EPackage.Registry.INSTANCE
				.getEPackage(Psycho_Social_FactorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		kindnessOpportunityEClass.getESuperTypes().add(theDiagramPackage.getAbsKindnessOpportunity());
		kindnessActEClass.getESuperTypes().add(this.getAct());
		kindnessEntityEClass.getESuperTypes().add(theDiagramPackage.getAbsKindnessEntity());
		locationEClass.getESuperTypes().add(this.getKindnessEntity());
		timeEClass.getESuperTypes().add(this.getKindnessEntity());
		actorEClass.getESuperTypes().add(this.getKindnessEntity());
		giverEClass.getESuperTypes().add(this.getActor());
		receiverEClass.getESuperTypes().add(this.getActor());
		observerEClass.getESuperTypes().add(this.getActor());
		social_FactorsEClass.getESuperTypes().add(thePsycho_Social_FactorPackage.getAbsSocialFactors());
		psychological_FactorsEClass.getESuperTypes().add(thePsycho_Social_FactorPackage.getAbsPsychologicalFactors());
		supportingActEClass.getESuperTypes().add(this.getAct());
		motivationActEClass.getESuperTypes().add(this.getSupportingAct());
		abilityActEClass.getESuperTypes().add(this.getSupportingAct());
		promptActEClass.getESuperTypes().add(this.getSupportingAct());

		// Initialize classes, features, and operations; add parameters
		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, Property.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kindnessOpportunityEClass, KindnessOpportunity.class, "KindnessOpportunity", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKindnessOpportunity_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				KindnessOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKindnessOpportunity_Properties(), this.getProperty(), null, "properties", null, 0, -1,
				KindnessOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKindnessOpportunity_Act(), this.getAct(), null, "act", null, 1, -1, KindnessOpportunity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKindnessOpportunity_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				KindnessOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKindnessOpportunity_Kindnessentity(), this.getKindnessEntity(), null, "kindnessentity", null,
				0, -1, KindnessOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKindnessOpportunity_Actor(), this.getActor(), null, "actor", null, 0, -1,
				KindnessOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kindnessActEClass, KindnessAct.class, "KindnessAct", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKindnessAct_Next(), this.getKindnessAct(), null, "next", null, 0, 1, KindnessAct.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_Name(), ecorePackage.getEString(), "name", null, 0, 1, Condition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_Refkindnessentity(), this.getKindnessEntity(), null, "refkindnessentity", null, 1,
				-1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kindnessEntityEClass, KindnessEntity.class, "KindnessEntity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKindnessEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, KindnessEntity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKindnessEntity_Properties(), this.getProperty(), null, "properties", null, 0, -1,
				KindnessEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeEClass, Time.class, "Time", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActor_Social_factors(), this.getSocial_Factors(), null, "social_factors", null, 0, 1,
				Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_Psychological_factors(), this.getPsychological_Factors(), null, "psychological_factors",
				null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(giverEClass, Giver.class, "Giver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGiver_Motivations(), this.getMotivation(), null, "motivations", null, 0, -1, Giver.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(receiverEClass, Receiver.class, "Receiver", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(observerEClass, Observer.class, "Observer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(motivationEClass, Motivation.class, "Motivation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMotivation_Type(), this.getMotivationType(), "type", null, 0, 1, Motivation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotivation_Level(), ecorePackage.getEFloat(), "level", null, 0, 1, Motivation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMotivation_Towards(), this.getReceiver(), null, "towards", null, 0, 1, Motivation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(social_FactorsEClass, Social_Factors.class, "Social_Factors", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(psychological_FactorsEClass, Psychological_Factors.class, "Psychological_Factors", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContext_Location(), this.getLocation(), null, "location", null, 0, -1, Context.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContext_Time(), this.getTime(), null, "time", null, 0, -1, Context.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(supportingActEClass, SupportingAct.class, "SupportingAct", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(motivationActEClass, MotivationAct.class, "MotivationAct", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(abilityActEClass, AbilityAct.class, "AbilityAct", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(actEClass, Act.class, "Act", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAct_Precondition(), this.getCondition(), null, "precondition", null, 1, 1, Act.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAct_Postcondition(), this.getCondition(), null, "postcondition", null, 1, 1, Act.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(promptActEClass, PromptAct.class, "PromptAct", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(motivationTypeEEnum, MotivationType.class, "MotivationType");
		addEEnumLiteral(motivationTypeEEnum, MotivationType.OTHER_BETTERMENT);
		addEEnumLiteral(motivationTypeEEnum, MotivationType.SELF_BETTERMENT);

		// Create resource
		createResource(eNS_URI);
	}

} //KindnessPackageImpl
