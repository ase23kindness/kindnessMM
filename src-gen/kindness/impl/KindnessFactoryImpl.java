/**
 */
package kindness.impl;

import kindness.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KindnessFactoryImpl extends EFactoryImpl implements KindnessFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KindnessFactory init() {
		try {
			KindnessFactory theKindnessFactory = (KindnessFactory) EPackage.Registry.INSTANCE
					.getEFactory(KindnessPackage.eNS_URI);
			if (theKindnessFactory != null) {
				return theKindnessFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KindnessFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindnessFactoryImpl() {
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
		case KindnessPackage.PROPERTY:
			return createProperty();
		case KindnessPackage.KINDNESS_OPPORTUNITY:
			return createKindnessOpportunity();
		case KindnessPackage.KINDNESS_ACT:
			return createKindnessAct();
		case KindnessPackage.CONDITION:
			return createCondition();
		case KindnessPackage.KINDNESS_ENTITY:
			return createKindnessEntity();
		case KindnessPackage.LOCATION:
			return createLocation();
		case KindnessPackage.TIME:
			return createTime();
		case KindnessPackage.ACTOR:
			return createActor();
		case KindnessPackage.GIVER:
			return createGiver();
		case KindnessPackage.RECEIVER:
			return createReceiver();
		case KindnessPackage.OBSERVER:
			return createObserver();
		case KindnessPackage.MOTIVATION:
			return createMotivation();
		case KindnessPackage.SOCIAL_FACTORS:
			return createSocial_Factors();
		case KindnessPackage.PSYCHOLOGICAL_FACTORS:
			return createPsychological_Factors();
		case KindnessPackage.CONTEXT:
			return createContext();
		case KindnessPackage.SUPPORTING_ACT:
			return createSupportingAct();
		case KindnessPackage.MOTIVATION_ACT:
			return createMotivationAct();
		case KindnessPackage.ABILITY_ACT:
			return createAbilityAct();
		case KindnessPackage.PROMPT_ACT:
			return createPromptAct();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case KindnessPackage.MOTIVATION_TYPE:
			return createMotivationTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case KindnessPackage.MOTIVATION_TYPE:
			return convertMotivationTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindnessOpportunity createKindnessOpportunity() {
		KindnessOpportunityImpl kindnessOpportunity = new KindnessOpportunityImpl();
		return kindnessOpportunity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindnessAct createKindnessAct() {
		KindnessActImpl kindnessAct = new KindnessActImpl();
		return kindnessAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindnessEntity createKindnessEntity() {
		KindnessEntityImpl kindnessEntity = new KindnessEntityImpl();
		return kindnessEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time createTime() {
		TimeImpl time = new TimeImpl();
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Giver createGiver() {
		GiverImpl giver = new GiverImpl();
		return giver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receiver createReceiver() {
		ReceiverImpl receiver = new ReceiverImpl();
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observer createObserver() {
		ObserverImpl observer = new ObserverImpl();
		return observer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Motivation createMotivation() {
		MotivationImpl motivation = new MotivationImpl();
		return motivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Social_Factors createSocial_Factors() {
		Social_FactorsImpl social_Factors = new Social_FactorsImpl();
		return social_Factors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Psychological_Factors createPsychological_Factors() {
		Psychological_FactorsImpl psychological_Factors = new Psychological_FactorsImpl();
		return psychological_Factors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportingAct createSupportingAct() {
		SupportingActImpl supportingAct = new SupportingActImpl();
		return supportingAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotivationAct createMotivationAct() {
		MotivationActImpl motivationAct = new MotivationActImpl();
		return motivationAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbilityAct createAbilityAct() {
		AbilityActImpl abilityAct = new AbilityActImpl();
		return abilityAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PromptAct createPromptAct() {
		PromptActImpl promptAct = new PromptActImpl();
		return promptAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotivationType createMotivationTypeFromString(EDataType eDataType, String initialValue) {
		MotivationType result = MotivationType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMotivationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindnessPackage getKindnessPackage() {
		return (KindnessPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KindnessPackage getPackage() {
		return KindnessPackage.eINSTANCE;
	}

} //KindnessFactoryImpl
