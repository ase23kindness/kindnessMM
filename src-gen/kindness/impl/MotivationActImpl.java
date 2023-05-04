/**
 */
package kindness.impl;

import kindness.KindnessPackage;
import kindness.MotivationAct;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Motivation Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MotivationActImpl extends SupportingActImpl implements MotivationAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MotivationActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KindnessPackage.Literals.MOTIVATION_ACT;
	}
	
	public boolean getIncreaseOtherBetterment() {
		boolean otherIncreased = true;
		
		return otherIncreased;
	}
	
	
	public boolean getDecreaseSelfBetterment() {
		boolean selfDecrease = true;
		
		return selfDecrease;
	}

	
	public float getValue() {
		float effectValue = 0;
		
		return effectValue;
	}
} //MotivationActImpl
