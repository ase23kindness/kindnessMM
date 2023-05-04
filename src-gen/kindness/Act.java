/**
 */
package kindness;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kindness.Act#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link kindness.Act#getPostcondition <em>Postcondition</em>}</li>
 * </ul>
 *
 * @see kindness.KindnessPackage#getAct()
 * @model abstract="true"
 * @generated
 */
public interface Act extends EObject {
	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' containment reference.
	 * @see #setPrecondition(Condition)
	 * @see kindness.KindnessPackage#getAct_Precondition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getPrecondition();

	/**
	 * Sets the value of the '{@link kindness.Act#getPrecondition <em>Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition</em>' containment reference.
	 * @see #getPrecondition()
	 * @generated
	 */
	void setPrecondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Postcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postcondition</em>' containment reference.
	 * @see #setPostcondition(Condition)
	 * @see kindness.KindnessPackage#getAct_Postcondition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getPostcondition();

	/**
	 * Sets the value of the '{@link kindness.Act#getPostcondition <em>Postcondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postcondition</em>' containment reference.
	 * @see #getPostcondition()
	 * @generated
	 */
	void setPostcondition(Condition value);

} // Act
