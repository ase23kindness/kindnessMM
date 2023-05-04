/**
 */
package kindness.impl;

import kindness.AbilityAct;
import kindness.KindnessPackage;
import kindness.MotivationAct;
import kindness.PromptAct;

import java.util.List;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prompt Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PromptActImpl extends SupportingActImpl implements PromptAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PromptActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KindnessPackage.Literals.PROMPT_ACT;
	}
	
	
	// Calculate if overall motivation and ability exceed action line,
    // i.e. if they are enough to trigger prompts.
    public static boolean canTriggerPrompt(double G, List<MotivationAct> M, List<AbilityAct> A, double AL) {

        // Set total motivation to giver's motivation
        double T_M = G;

        // Loop through motivation acts
        for (MotivationAct m : M) {
            if (m.getIncreaseOtherBetterment()) { // If act increases other betterment
                T_M += m.getValue(); // Add act's value to total motivation
            } else if (m.getDecreaseSelfBetterment()) { // If act decreases self betterment
                T_M -= m.getValue(); // Subtract act's value from total motivation
            }
        }

        // Set total ability to 0
        double T_A = 0;

        // Loop through ability acts
        for (AbilityAct a : A) {
            if (a.getEffect().equals("positive")) { // If ability effect is positive
                T_A += a.getValue(); // Add ability's value to total ability
            } else if (a.getEffect().equals("negative")) { // If ability effect is negative
                T_A -= a.getValue(); // Subtract ability's value from total ability
            }
        }

        // Calculate action score using a given formula
        double AS = f(T_M, T_A);

        // Return true if action score is greater than or equal to action line
        return (AS >= AL);
    }

    // A method to calculate action score using a given formula
    private static double f(double T_M, double T_A) {
        return (T_M / (1 + Math.exp(-T_A)));
    }


} //PromptActImpl
