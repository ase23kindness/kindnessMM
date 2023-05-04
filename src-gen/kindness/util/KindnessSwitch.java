/**
 */
package kindness.util;

import Psycho_Social_Factor.AbsPsychologicalFactors;
import Psycho_Social_Factor.AbsSocialFactors;

import diagram.AbsKindnessEntity;
import diagram.AbsKindnessOpportunity;

import kindness.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see kindness.KindnessPackage
 * @generated
 */
public class KindnessSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KindnessPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindnessSwitch() {
		if (modelPackage == null) {
			modelPackage = KindnessPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case KindnessPackage.PROPERTY: {
			Property property = (Property) theEObject;
			T result = caseProperty(property);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case KindnessPackage.KINDNESS_OPPORTUNITY: {
			KindnessOpportunity kindnessOpportunity = (KindnessOpportunity) theEObject;
			T result = caseKindnessOpportunity(kindnessOpportunity);
			if (result == null)
				result = caseAbsKindnessOpportunity(kindnessOpportunity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case KindnessPackage.KINDNESS_ACT: {
			KindnessAct kindnessAct = (KindnessAct) theEObject;
			T result = caseKindnessAct(kindnessAct);
			if (result == null)
				result = caseAct(kindnessAct);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case KindnessPackage.CONDITION: {
			Condition condition = (Condition) theEObject;
			T result = caseCondition(condition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case KindnessPackage.KINDNESS_ENTITY: {
			KindnessEntity kindnessEntity = (KindnessEntity) theEObject;
			T result = caseKindnessEntity(kindnessEntity);
			if (result == null)
				result = caseAbsKindnessEntity(kindnessEntity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case KindnessPackage.LOCATION: {
			Location location = (Location) theEObject;
			T result = caseLocation(location);
			if (result == null)
				result = caseKindnessEntity(location);
			if (result == null)
				result = caseAbsKindnessEntity(location);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case KindnessPackage.TIME: {
			Time time = (Time) theEObject;
			T result = caseTime(time);
			if (result == null)
				result = caseKindnessEntity(time);
			if (result == null)
				result = caseAbsKindnessEntity(time);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case KindnessPackage.ACTOR: {
			Actor actor = (Actor) theEObject;
			T result = caseActor(actor);
			if (result == null)
				result = caseKindnessEntity(actor);
			if (result == null)
				result = caseAbsKindnessEntity(actor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case KindnessPackage.GIVER: {
			Giver giver = (Giver) theEObject;
			T result = caseGiver(giver);
			if (result == null)
				result = caseActor(giver);
			if (result == null)
				result = caseKindnessEntity(giver);
			if (result == null)
				result = caseAbsKindnessEntity(giver);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case KindnessPackage.RECEIVER: {
			Receiver receiver = (Receiver) theEObject;
			T result = caseReceiver(receiver);
			if (result == null)
				result = caseActor(receiver);
			if (result == null)
				result = caseKindnessEntity(receiver);
			if (result == null)
				result = caseAbsKindnessEntity(receiver);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case KindnessPackage.OBSERVER: {
			Observer observer = (Observer) theEObject;
			T result = caseObserver(observer);
			if (result == null)
				result = caseActor(observer);
			if (result == null)
				result = caseKindnessEntity(observer);
			if (result == null)
				result = caseAbsKindnessEntity(observer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case KindnessPackage.MOTIVATION: {
			Motivation motivation = (Motivation) theEObject;
			T result = caseMotivation(motivation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case KindnessPackage.SOCIAL_FACTORS: {
			Social_Factors social_Factors = (Social_Factors) theEObject;
			T result = caseSocial_Factors(social_Factors);
			if (result == null)
				result = caseAbsSocialFactors(social_Factors);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case KindnessPackage.PSYCHOLOGICAL_FACTORS: {
			Psychological_Factors psychological_Factors = (Psychological_Factors) theEObject;
			T result = casePsychological_Factors(psychological_Factors);
			if (result == null)
				result = caseAbsPsychologicalFactors(psychological_Factors);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case KindnessPackage.CONTEXT: {
			Context context = (Context) theEObject;
			T result = caseContext(context);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case KindnessPackage.SUPPORTING_ACT: {
			SupportingAct supportingAct = (SupportingAct) theEObject;
			T result = caseSupportingAct(supportingAct);
			if (result == null)
				result = caseAct(supportingAct);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case KindnessPackage.MOTIVATION_ACT: {
			MotivationAct motivationAct = (MotivationAct) theEObject;
			T result = caseMotivationAct(motivationAct);
			if (result == null)
				result = caseSupportingAct(motivationAct);
			if (result == null)
				result = caseAct(motivationAct);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case KindnessPackage.ABILITY_ACT: {
			AbilityAct abilityAct = (AbilityAct) theEObject;
			T result = caseAbilityAct(abilityAct);
			if (result == null)
				result = caseSupportingAct(abilityAct);
			if (result == null)
				result = caseAct(abilityAct);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case KindnessPackage.ACT: {
			Act act = (Act) theEObject;
			T result = caseAct(act);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case KindnessPackage.PROMPT_ACT: {
			PromptAct promptAct = (PromptAct) theEObject;
			T result = casePromptAct(promptAct);
			if (result == null)
				result = caseSupportingAct(promptAct);
			if (result == null)
				result = caseAct(promptAct);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opportunity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opportunity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKindnessOpportunity(KindnessOpportunity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKindnessAct(KindnessAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKindnessEntity(KindnessEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTime(Time object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Giver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Giver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGiver(Giver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receiver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receiver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiver(Receiver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObserver(Observer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Motivation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Motivation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMotivation(Motivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Social Factors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Social Factors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSocial_Factors(Social_Factors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Psychological Factors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Psychological Factors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePsychological_Factors(Psychological_Factors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContext(Context object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supporting Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supporting Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportingAct(SupportingAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Motivation Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Motivation Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMotivationAct(MotivationAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ability Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ability Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbilityAct(AbilityAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAct(Act object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prompt Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prompt Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePromptAct(PromptAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abs Kindness Opportunity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abs Kindness Opportunity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsKindnessOpportunity(AbsKindnessOpportunity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abs Kindness Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abs Kindness Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsKindnessEntity(AbsKindnessEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abs Social Factors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abs Social Factors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsSocialFactors(AbsSocialFactors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abs Psychological Factors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abs Psychological Factors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsPsychologicalFactors(AbsPsychologicalFactors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //KindnessSwitch
