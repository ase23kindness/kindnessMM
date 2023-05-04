/**
 */
package Psycho_Social_Factor.Psychological.impl;

import Psycho_Social_Factor.Psychological.*;

import org.eclipse.emf.ecore.EClass;
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
public class PsychologicalFactoryImpl extends EFactoryImpl implements PsychologicalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PsychologicalFactory init() {
		try {
			PsychologicalFactory thePsychologicalFactory = (PsychologicalFactory) EPackage.Registry.INSTANCE
					.getEFactory(PsychologicalPackage.eNS_URI);
			if (thePsychologicalFactory != null) {
				return thePsychologicalFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PsychologicalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PsychologicalFactoryImpl() {
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
		case PsychologicalPackage.EMOTION:
			return createEmotion();
		case PsychologicalPackage.SELF_EFFICACY:
			return createSelfEfficacy();
		case PsychologicalPackage.CHARACTER_TRAIT:
			return createCharacterTrait();
		case PsychologicalPackage.HUMAN_VALUE:
			return createHumanValue();
		case PsychologicalPackage.OTHER_PSYCHOLOGICAL_FACTOR:
			return createOtherPsychologicalFactor();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Emotion createEmotion() {
		EmotionImpl emotion = new EmotionImpl();
		return emotion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelfEfficacy createSelfEfficacy() {
		SelfEfficacyImpl selfEfficacy = new SelfEfficacyImpl();
		return selfEfficacy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterTrait createCharacterTrait() {
		CharacterTraitImpl characterTrait = new CharacterTraitImpl();
		return characterTrait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanValue createHumanValue() {
		HumanValueImpl humanValue = new HumanValueImpl();
		return humanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherPsychologicalFactor createOtherPsychologicalFactor() {
		OtherPsychologicalFactorImpl otherPsychologicalFactor = new OtherPsychologicalFactorImpl();
		return otherPsychologicalFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PsychologicalPackage getPsychologicalPackage() {
		return (PsychologicalPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PsychologicalPackage getPackage() {
		return PsychologicalPackage.eINSTANCE;
	}

} //PsychologicalFactoryImpl
