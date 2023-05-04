/**
 */
package kindness;

import diagram.AbsKindnessEntity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kindness.KindnessEntity#getName <em>Name</em>}</li>
 *   <li>{@link kindness.KindnessEntity#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see kindness.KindnessPackage#getKindnessEntity()
 * @model
 * @generated
 */
public interface KindnessEntity extends AbsKindnessEntity {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see kindness.KindnessPackage#getKindnessEntity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kindness.KindnessEntity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link kindness.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see kindness.KindnessPackage#getKindnessEntity_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

} // KindnessEntity
