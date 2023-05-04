/**
 */
package kindness.impl;

import diagram.impl.AbsKindnessOpportunityImpl;

import java.util.Collection;
import java.util.List;

import kindness.Act;
import kindness.Actor;
import kindness.KindnessEntity;
import kindness.KindnessOpportunity;
import kindness.KindnessPackage;
import kindness.Motivation;
import kindness.MotivationAct;
import kindness.Property;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opportunity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kindness.impl.KindnessOpportunityImpl#getName <em>Name</em>}</li>
 *   <li>{@link kindness.impl.KindnessOpportunityImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link kindness.impl.KindnessOpportunityImpl#getAct <em>Act</em>}</li>
 *   <li>{@link kindness.impl.KindnessOpportunityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link kindness.impl.KindnessOpportunityImpl#getKindnessentity <em>Kindnessentity</em>}</li>
 *   <li>{@link kindness.impl.KindnessOpportunityImpl#getActor <em>Actor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KindnessOpportunityImpl extends AbsKindnessOpportunityImpl implements KindnessOpportunity {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The cached value of the '{@link #getAct() <em>Act</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAct()
	 * @generated
	 * @ordered
	 */
	protected EList<Act> act;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKindnessentity() <em>Kindnessentity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindnessentity()
	 * @generated
	 * @ordered
	 */
	protected EList<KindnessEntity> kindnessentity;

	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KindnessOpportunityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KindnessPackage.Literals.KINDNESS_OPPORTUNITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KindnessPackage.KINDNESS_OPPORTUNITY__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this,
					KindnessPackage.KINDNESS_OPPORTUNITY__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Act> getAct() {
		if (act == null) {
			act = new EObjectContainmentEList<Act>(Act.class, this, KindnessPackage.KINDNESS_OPPORTUNITY__ACT);
		}
		return act;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KindnessPackage.KINDNESS_OPPORTUNITY__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KindnessEntity> getKindnessentity() {
		if (kindnessentity == null) {
			kindnessentity = new EObjectContainmentEList<KindnessEntity>(KindnessEntity.class, this,
					KindnessPackage.KINDNESS_OPPORTUNITY__KINDNESSENTITY);
		}
		return kindnessentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getActor() {
		if (actor == null) {
			actor = new EObjectContainmentEList<Actor>(Actor.class, this, KindnessPackage.KINDNESS_OPPORTUNITY__ACTOR);
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case KindnessPackage.KINDNESS_OPPORTUNITY__PROPERTIES:
			return ((InternalEList<?>) getProperties()).basicRemove(otherEnd, msgs);
		case KindnessPackage.KINDNESS_OPPORTUNITY__ACT:
			return ((InternalEList<?>) getAct()).basicRemove(otherEnd, msgs);
		case KindnessPackage.KINDNESS_OPPORTUNITY__KINDNESSENTITY:
			return ((InternalEList<?>) getKindnessentity()).basicRemove(otherEnd, msgs);
		case KindnessPackage.KINDNESS_OPPORTUNITY__ACTOR:
			return ((InternalEList<?>) getActor()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case KindnessPackage.KINDNESS_OPPORTUNITY__NAME:
			return getName();
		case KindnessPackage.KINDNESS_OPPORTUNITY__PROPERTIES:
			return getProperties();
		case KindnessPackage.KINDNESS_OPPORTUNITY__ACT:
			return getAct();
		case KindnessPackage.KINDNESS_OPPORTUNITY__DESCRIPTION:
			return getDescription();
		case KindnessPackage.KINDNESS_OPPORTUNITY__KINDNESSENTITY:
			return getKindnessentity();
		case KindnessPackage.KINDNESS_OPPORTUNITY__ACTOR:
			return getActor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case KindnessPackage.KINDNESS_OPPORTUNITY__NAME:
			setName((String) newValue);
			return;
		case KindnessPackage.KINDNESS_OPPORTUNITY__PROPERTIES:
			getProperties().clear();
			getProperties().addAll((Collection<? extends Property>) newValue);
			return;
		case KindnessPackage.KINDNESS_OPPORTUNITY__ACT:
			getAct().clear();
			getAct().addAll((Collection<? extends Act>) newValue);
			return;
		case KindnessPackage.KINDNESS_OPPORTUNITY__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case KindnessPackage.KINDNESS_OPPORTUNITY__KINDNESSENTITY:
			getKindnessentity().clear();
			getKindnessentity().addAll((Collection<? extends KindnessEntity>) newValue);
			return;
		case KindnessPackage.KINDNESS_OPPORTUNITY__ACTOR:
			getActor().clear();
			getActor().addAll((Collection<? extends Actor>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case KindnessPackage.KINDNESS_OPPORTUNITY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case KindnessPackage.KINDNESS_OPPORTUNITY__PROPERTIES:
			getProperties().clear();
			return;
		case KindnessPackage.KINDNESS_OPPORTUNITY__ACT:
			getAct().clear();
			return;
		case KindnessPackage.KINDNESS_OPPORTUNITY__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case KindnessPackage.KINDNESS_OPPORTUNITY__KINDNESSENTITY:
			getKindnessentity().clear();
			return;
		case KindnessPackage.KINDNESS_OPPORTUNITY__ACTOR:
			getActor().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case KindnessPackage.KINDNESS_OPPORTUNITY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case KindnessPackage.KINDNESS_OPPORTUNITY__PROPERTIES:
			return properties != null && !properties.isEmpty();
		case KindnessPackage.KINDNESS_OPPORTUNITY__ACT:
			return act != null && !act.isEmpty();
		case KindnessPackage.KINDNESS_OPPORTUNITY__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case KindnessPackage.KINDNESS_OPPORTUNITY__KINDNESSENTITY:
			return kindnessentity != null && !kindnessentity.isEmpty();
		case KindnessPackage.KINDNESS_OPPORTUNITY__ACTOR:
			return actor != null && !actor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}
	
	/**
	 * Determine if an opportunity is a KindnessOpportunity
	 *
	 * @param M_g a list of motivations for the giver
	 * @param M_a a list of motivation acts affecting the opportunity
	 * @return true if the opportunity is a kindness opportunity, false otherwise
	 */
	public boolean isKindnessOpportunity(List<Motivation> M_g, List<MotivationAct> M_a) {
	    int O_B = 0; // initialize other betterment
	    int S_B = 0; // initialize self betterment
	    for (Motivation m : M_g) { // consider giver motivations
	        if (m.getType().equals("OTHER_BETTERMENT")) {
	            O_B += m.getLevel();
	        } else if (m.getType().equals("SELF_BETTERMENT")) {
	            S_B += m.getLevel();
	        }
	    }
	    for (MotivationAct m : M_a) { // consider motivation acts
	        if (m.getIncreaseOtherBetterment()) {
	            O_B += m.getValue();
	        }
	        if (m.getDecreaseSelfBetterment()) {
	            S_B -= m.getValue();
	        }
	    }
	    return O_B > S_B; 
	}


} //KindnessOpportunityImpl
