/**
 */
package kindness;

import diagram.AbsKindnessOpportunity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opportunity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kindness.KindnessOpportunity#getName <em>Name</em>}</li>
 *   <li>{@link kindness.KindnessOpportunity#getProperties <em>Properties</em>}</li>
 *   <li>{@link kindness.KindnessOpportunity#getAct <em>Act</em>}</li>
 *   <li>{@link kindness.KindnessOpportunity#getDescription <em>Description</em>}</li>
 *   <li>{@link kindness.KindnessOpportunity#getKindnessentity <em>Kindnessentity</em>}</li>
 *   <li>{@link kindness.KindnessOpportunity#getActor <em>Actor</em>}</li>
 * </ul>
 *
 * @see kindness.KindnessPackage#getKindnessOpportunity()
 * @model
 * @generated
 */
public interface KindnessOpportunity extends AbsKindnessOpportunity {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see kindness.KindnessPackage#getKindnessOpportunity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kindness.KindnessOpportunity#getName <em>Name</em>}' attribute.
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
	 * @see kindness.KindnessPackage#getKindnessOpportunity_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Act</b></em>' containment reference list.
	 * The list contents are of type {@link kindness.Act}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Act</em>' containment reference list.
	 * @see kindness.KindnessPackage#getKindnessOpportunity_Act()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Act> getAct();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see kindness.KindnessPackage#getKindnessOpportunity_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link kindness.KindnessOpportunity#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Kindnessentity</b></em>' containment reference list.
	 * The list contents are of type {@link kindness.KindnessEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kindnessentity</em>' containment reference list.
	 * @see kindness.KindnessPackage#getKindnessOpportunity_Kindnessentity()
	 * @model containment="true"
	 * @generated
	 */
	EList<KindnessEntity> getKindnessentity();

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' containment reference list.
	 * The list contents are of type {@link kindness.Actor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' containment reference list.
	 * @see kindness.KindnessPackage#getKindnessOpportunity_Actor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actor> getActor();

} // KindnessOpportunity
