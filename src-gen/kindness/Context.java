/**
 */
package kindness;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kindness.Context#getLocation <em>Location</em>}</li>
 *   <li>{@link kindness.Context#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see kindness.KindnessPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference list.
	 * The list contents are of type {@link kindness.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference list.
	 * @see kindness.KindnessPackage#getContext_Location()
	 * @model containment="true"
	 * @generated
	 */
	EList<Location> getLocation();

	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference list.
	 * The list contents are of type {@link kindness.Time}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' containment reference list.
	 * @see kindness.KindnessPackage#getContext_Time()
	 * @model containment="true"
	 * @generated
	 */
	EList<Time> getTime();

} // Context
