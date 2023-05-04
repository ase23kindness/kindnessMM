/**
 */
package kindness;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kindness.KindnessAct#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see kindness.KindnessPackage#getKindnessAct()
 * @model
 * @generated
 */
public interface KindnessAct extends Act {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(KindnessAct)
	 * @see kindness.KindnessPackage#getKindnessAct_Next()
	 * @model
	 * @generated
	 */
	KindnessAct getNext();

	/**
	 * Sets the value of the '{@link kindness.KindnessAct#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(KindnessAct value);

} // KindnessAct
