/**
 */
package Psycho_Social_Factor.Psychological.util;

import Psycho_Social_Factor.Factor;

import Psycho_Social_Factor.Psychological.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Psycho_Social_Factor.Psychological.PsychologicalPackage
 * @generated
 */
public class PsychologicalAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PsychologicalPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PsychologicalAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PsychologicalPackage.eINSTANCE;
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
	protected PsychologicalSwitch<Adapter> modelSwitch = new PsychologicalSwitch<Adapter>() {
		@Override
		public Adapter caseEmotion(Emotion object) {
			return createEmotionAdapter();
		}

		@Override
		public Adapter caseSelfEfficacy(SelfEfficacy object) {
			return createSelfEfficacyAdapter();
		}

		@Override
		public Adapter caseCharacterTrait(CharacterTrait object) {
			return createCharacterTraitAdapter();
		}

		@Override
		public Adapter caseHumanValue(HumanValue object) {
			return createHumanValueAdapter();
		}

		@Override
		public Adapter casePsychologicalFactor(PsychologicalFactor object) {
			return createPsychologicalFactorAdapter();
		}

		@Override
		public Adapter caseOtherPsychologicalFactor(OtherPsychologicalFactor object) {
			return createOtherPsychologicalFactorAdapter();
		}

		@Override
		public Adapter caseFactor(Factor object) {
			return createFactorAdapter();
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
	 * Creates a new adapter for an object of class '{@link Psycho_Social_Factor.Psychological.Emotion <em>Emotion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Psycho_Social_Factor.Psychological.Emotion
	 * @generated
	 */
	public Adapter createEmotionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Psycho_Social_Factor.Psychological.SelfEfficacy <em>Self Efficacy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Psycho_Social_Factor.Psychological.SelfEfficacy
	 * @generated
	 */
	public Adapter createSelfEfficacyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Psycho_Social_Factor.Psychological.CharacterTrait <em>Character Trait</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Psycho_Social_Factor.Psychological.CharacterTrait
	 * @generated
	 */
	public Adapter createCharacterTraitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Psycho_Social_Factor.Psychological.HumanValue <em>Human Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Psycho_Social_Factor.Psychological.HumanValue
	 * @generated
	 */
	public Adapter createHumanValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Psycho_Social_Factor.Psychological.PsychologicalFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Psycho_Social_Factor.Psychological.PsychologicalFactor
	 * @generated
	 */
	public Adapter createPsychologicalFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Psycho_Social_Factor.Psychological.OtherPsychologicalFactor <em>Other Psychological Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Psycho_Social_Factor.Psychological.OtherPsychologicalFactor
	 * @generated
	 */
	public Adapter createOtherPsychologicalFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Psycho_Social_Factor.Factor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Psycho_Social_Factor.Factor
	 * @generated
	 */
	public Adapter createFactorAdapter() {
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

} //PsychologicalAdapterFactory
