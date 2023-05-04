/**
 */
package kindness.util;

import Psycho_Social_Factor.AbsPsychologicalFactors;
import Psycho_Social_Factor.AbsSocialFactors;

import diagram.AbsKindnessEntity;
import diagram.AbsKindnessOpportunity;

import kindness.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see kindness.KindnessPackage
 * @generated
 */
public class KindnessAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KindnessPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindnessAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = KindnessPackage.eINSTANCE;
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
	protected KindnessSwitch<Adapter> modelSwitch = new KindnessSwitch<Adapter>() {
		@Override
		public Adapter caseProperty(Property object) {
			return createPropertyAdapter();
		}

		@Override
		public Adapter caseKindnessOpportunity(KindnessOpportunity object) {
			return createKindnessOpportunityAdapter();
		}

		@Override
		public Adapter caseKindnessAct(KindnessAct object) {
			return createKindnessActAdapter();
		}

		@Override
		public Adapter caseCondition(Condition object) {
			return createConditionAdapter();
		}

		@Override
		public Adapter caseKindnessEntity(KindnessEntity object) {
			return createKindnessEntityAdapter();
		}

		@Override
		public Adapter caseLocation(Location object) {
			return createLocationAdapter();
		}

		@Override
		public Adapter caseTime(Time object) {
			return createTimeAdapter();
		}

		@Override
		public Adapter caseActor(Actor object) {
			return createActorAdapter();
		}

		@Override
		public Adapter caseGiver(Giver object) {
			return createGiverAdapter();
		}

		@Override
		public Adapter caseReceiver(Receiver object) {
			return createReceiverAdapter();
		}

		@Override
		public Adapter caseObserver(Observer object) {
			return createObserverAdapter();
		}

		@Override
		public Adapter caseMotivation(Motivation object) {
			return createMotivationAdapter();
		}

		@Override
		public Adapter caseSocial_Factors(Social_Factors object) {
			return createSocial_FactorsAdapter();
		}

		@Override
		public Adapter casePsychological_Factors(Psychological_Factors object) {
			return createPsychological_FactorsAdapter();
		}

		@Override
		public Adapter caseContext(Context object) {
			return createContextAdapter();
		}

		@Override
		public Adapter caseSupportingAct(SupportingAct object) {
			return createSupportingActAdapter();
		}

		@Override
		public Adapter caseMotivationAct(MotivationAct object) {
			return createMotivationActAdapter();
		}

		@Override
		public Adapter caseAbilityAct(AbilityAct object) {
			return createAbilityActAdapter();
		}

		@Override
		public Adapter caseAct(Act object) {
			return createActAdapter();
		}

		@Override
		public Adapter casePromptAct(PromptAct object) {
			return createPromptActAdapter();
		}

		@Override
		public Adapter caseAbsKindnessOpportunity(AbsKindnessOpportunity object) {
			return createAbsKindnessOpportunityAdapter();
		}

		@Override
		public Adapter caseAbsKindnessEntity(AbsKindnessEntity object) {
			return createAbsKindnessEntityAdapter();
		}

		@Override
		public Adapter caseAbsSocialFactors(AbsSocialFactors object) {
			return createAbsSocialFactorsAdapter();
		}

		@Override
		public Adapter caseAbsPsychologicalFactors(AbsPsychologicalFactors object) {
			return createAbsPsychologicalFactorsAdapter();
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
	 * Creates a new adapter for an object of class '{@link kindness.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness.KindnessOpportunity <em>Opportunity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness.KindnessOpportunity
	 * @generated
	 */
	public Adapter createKindnessOpportunityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness.KindnessAct <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness.KindnessAct
	 * @generated
	 */
	public Adapter createKindnessActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness.KindnessEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness.KindnessEntity
	 * @generated
	 */
	public Adapter createKindnessEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness.Time
	 * @generated
	 */
	public Adapter createTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness.Giver <em>Giver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness.Giver
	 * @generated
	 */
	public Adapter createGiverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness.Receiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness.Receiver
	 * @generated
	 */
	public Adapter createReceiverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness.Observer <em>Observer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness.Observer
	 * @generated
	 */
	public Adapter createObserverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness.Motivation <em>Motivation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness.Motivation
	 * @generated
	 */
	public Adapter createMotivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness.Social_Factors <em>Social Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness.Social_Factors
	 * @generated
	 */
	public Adapter createSocial_FactorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness.Psychological_Factors <em>Psychological Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness.Psychological_Factors
	 * @generated
	 */
	public Adapter createPsychological_FactorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness.Context
	 * @generated
	 */
	public Adapter createContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness.SupportingAct <em>Supporting Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness.SupportingAct
	 * @generated
	 */
	public Adapter createSupportingActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness.MotivationAct <em>Motivation Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness.MotivationAct
	 * @generated
	 */
	public Adapter createMotivationActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness.AbilityAct <em>Ability Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness.AbilityAct
	 * @generated
	 */
	public Adapter createAbilityActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness.Act <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness.Act
	 * @generated
	 */
	public Adapter createActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness.PromptAct <em>Prompt Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness.PromptAct
	 * @generated
	 */
	public Adapter createPromptActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagram.AbsKindnessOpportunity <em>Abs Kindness Opportunity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagram.AbsKindnessOpportunity
	 * @generated
	 */
	public Adapter createAbsKindnessOpportunityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagram.AbsKindnessEntity <em>Abs Kindness Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagram.AbsKindnessEntity
	 * @generated
	 */
	public Adapter createAbsKindnessEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Psycho_Social_Factor.AbsSocialFactors <em>Abs Social Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Psycho_Social_Factor.AbsSocialFactors
	 * @generated
	 */
	public Adapter createAbsSocialFactorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Psycho_Social_Factor.AbsPsychologicalFactors <em>Abs Psychological Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Psycho_Social_Factor.AbsPsychologicalFactors
	 * @generated
	 */
	public Adapter createAbsPsychologicalFactorsAdapter() {
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

} //KindnessAdapterFactory
