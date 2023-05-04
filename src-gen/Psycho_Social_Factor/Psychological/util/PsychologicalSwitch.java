/**
 */
package Psycho_Social_Factor.Psychological.util;

import Psycho_Social_Factor.Factor;

import Psycho_Social_Factor.Psychological.*;

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
 * @see Psycho_Social_Factor.Psychological.PsychologicalPackage
 * @generated
 */
public class PsychologicalSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PsychologicalPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PsychologicalSwitch() {
		if (modelPackage == null) {
			modelPackage = PsychologicalPackage.eINSTANCE;
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
		case PsychologicalPackage.EMOTION: {
			Emotion emotion = (Emotion) theEObject;
			T result = caseEmotion(emotion);
			if (result == null)
				result = casePsychologicalFactor(emotion);
			if (result == null)
				result = caseFactor(emotion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PsychologicalPackage.SELF_EFFICACY: {
			SelfEfficacy selfEfficacy = (SelfEfficacy) theEObject;
			T result = caseSelfEfficacy(selfEfficacy);
			if (result == null)
				result = casePsychologicalFactor(selfEfficacy);
			if (result == null)
				result = caseFactor(selfEfficacy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PsychologicalPackage.CHARACTER_TRAIT: {
			CharacterTrait characterTrait = (CharacterTrait) theEObject;
			T result = caseCharacterTrait(characterTrait);
			if (result == null)
				result = casePsychologicalFactor(characterTrait);
			if (result == null)
				result = caseFactor(characterTrait);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PsychologicalPackage.HUMAN_VALUE: {
			HumanValue humanValue = (HumanValue) theEObject;
			T result = caseHumanValue(humanValue);
			if (result == null)
				result = casePsychologicalFactor(humanValue);
			if (result == null)
				result = caseFactor(humanValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PsychologicalPackage.PSYCHOLOGICAL_FACTOR: {
			PsychologicalFactor psychologicalFactor = (PsychologicalFactor) theEObject;
			T result = casePsychologicalFactor(psychologicalFactor);
			if (result == null)
				result = caseFactor(psychologicalFactor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PsychologicalPackage.OTHER_PSYCHOLOGICAL_FACTOR: {
			OtherPsychologicalFactor otherPsychologicalFactor = (OtherPsychologicalFactor) theEObject;
			T result = caseOtherPsychologicalFactor(otherPsychologicalFactor);
			if (result == null)
				result = casePsychologicalFactor(otherPsychologicalFactor);
			if (result == null)
				result = caseFactor(otherPsychologicalFactor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emotion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emotion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmotion(Emotion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Self Efficacy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Self Efficacy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelfEfficacy(SelfEfficacy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Trait</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Trait</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacterTrait(CharacterTrait object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Human Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Human Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHumanValue(HumanValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePsychologicalFactor(PsychologicalFactor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Other Psychological Factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Other Psychological Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOtherPsychologicalFactor(OtherPsychologicalFactor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactor(Factor object) {
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

} //PsychologicalSwitch
