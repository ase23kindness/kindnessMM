/**
 */
package kindness;

import Psycho_Social_Factor.Psycho_Social_FactorPackage;

import diagram.DiagramPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see kindness.KindnessFactory
 * @model kind="package"
 * @generated
 */
public interface KindnessPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "kindness";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/kindness_metamodel_core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "kindness";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KindnessPackage eINSTANCE = kindness.impl.KindnessPackageImpl.init();

	/**
	 * The meta object id for the '{@link kindness.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness.impl.PropertyImpl
	 * @see kindness.impl.KindnessPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kindness.impl.KindnessOpportunityImpl <em>Opportunity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness.impl.KindnessOpportunityImpl
	 * @see kindness.impl.KindnessPackageImpl#getKindnessOpportunity()
	 * @generated
	 */
	int KINDNESS_OPPORTUNITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDNESS_OPPORTUNITY__NAME = DiagramPackage.ABS_KINDNESS_OPPORTUNITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDNESS_OPPORTUNITY__PROPERTIES = DiagramPackage.ABS_KINDNESS_OPPORTUNITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Act</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDNESS_OPPORTUNITY__ACT = DiagramPackage.ABS_KINDNESS_OPPORTUNITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDNESS_OPPORTUNITY__DESCRIPTION = DiagramPackage.ABS_KINDNESS_OPPORTUNITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Kindnessentity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDNESS_OPPORTUNITY__KINDNESSENTITY = DiagramPackage.ABS_KINDNESS_OPPORTUNITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDNESS_OPPORTUNITY__ACTOR = DiagramPackage.ABS_KINDNESS_OPPORTUNITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Opportunity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDNESS_OPPORTUNITY_FEATURE_COUNT = DiagramPackage.ABS_KINDNESS_OPPORTUNITY_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Opportunity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDNESS_OPPORTUNITY_OPERATION_COUNT = DiagramPackage.ABS_KINDNESS_OPPORTUNITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kindness.impl.ActImpl <em>Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness.impl.ActImpl
	 * @see kindness.impl.KindnessPackageImpl#getAct()
	 * @generated
	 */
	int ACT = 18;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__PRECONDITION = 0;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__POSTCONDITION = 1;

	/**
	 * The number of structural features of the '<em>Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kindness.impl.KindnessActImpl <em>Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness.impl.KindnessActImpl
	 * @see kindness.impl.KindnessPackageImpl#getKindnessAct()
	 * @generated
	 */
	int KINDNESS_ACT = 2;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDNESS_ACT__PRECONDITION = ACT__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDNESS_ACT__POSTCONDITION = ACT__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDNESS_ACT__NEXT = ACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDNESS_ACT_FEATURE_COUNT = ACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDNESS_ACT_OPERATION_COUNT = ACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kindness.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness.impl.ConditionImpl
	 * @see kindness.impl.KindnessPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Refkindnessentity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__REFKINDNESSENTITY = 1;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kindness.impl.KindnessEntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness.impl.KindnessEntityImpl
	 * @see kindness.impl.KindnessPackageImpl#getKindnessEntity()
	 * @generated
	 */
	int KINDNESS_ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDNESS_ENTITY__NAME = DiagramPackage.ABS_KINDNESS_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDNESS_ENTITY__PROPERTIES = DiagramPackage.ABS_KINDNESS_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDNESS_ENTITY_FEATURE_COUNT = DiagramPackage.ABS_KINDNESS_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDNESS_ENTITY_OPERATION_COUNT = DiagramPackage.ABS_KINDNESS_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kindness.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness.impl.LocationImpl
	 * @see kindness.impl.KindnessPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = KINDNESS_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__PROPERTIES = KINDNESS_ENTITY__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = KINDNESS_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = KINDNESS_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kindness.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness.impl.TimeImpl
	 * @see kindness.impl.KindnessPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__NAME = KINDNESS_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__PROPERTIES = KINDNESS_ENTITY__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = KINDNESS_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OPERATION_COUNT = KINDNESS_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kindness.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness.impl.ActorImpl
	 * @see kindness.impl.KindnessPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = KINDNESS_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__PROPERTIES = KINDNESS_ENTITY__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Social factors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__SOCIAL_FACTORS = KINDNESS_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Psychological factors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__PSYCHOLOGICAL_FACTORS = KINDNESS_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = KINDNESS_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = KINDNESS_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kindness.impl.GiverImpl <em>Giver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness.impl.GiverImpl
	 * @see kindness.impl.KindnessPackageImpl#getGiver()
	 * @generated
	 */
	int GIVER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVER__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVER__PROPERTIES = ACTOR__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Social factors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVER__SOCIAL_FACTORS = ACTOR__SOCIAL_FACTORS;

	/**
	 * The feature id for the '<em><b>Psychological factors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVER__PSYCHOLOGICAL_FACTORS = ACTOR__PSYCHOLOGICAL_FACTORS;

	/**
	 * The feature id for the '<em><b>Motivations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVER__MOTIVATIONS = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Giver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVER_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Giver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVER_OPERATION_COUNT = ACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kindness.impl.ReceiverImpl <em>Receiver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness.impl.ReceiverImpl
	 * @see kindness.impl.KindnessPackageImpl#getReceiver()
	 * @generated
	 */
	int RECEIVER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER__PROPERTIES = ACTOR__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Social factors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER__SOCIAL_FACTORS = ACTOR__SOCIAL_FACTORS;

	/**
	 * The feature id for the '<em><b>Psychological factors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER__PSYCHOLOGICAL_FACTORS = ACTOR__PSYCHOLOGICAL_FACTORS;

	/**
	 * The number of structural features of the '<em>Receiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Receiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_OPERATION_COUNT = ACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kindness.impl.ObserverImpl <em>Observer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness.impl.ObserverImpl
	 * @see kindness.impl.KindnessPackageImpl#getObserver()
	 * @generated
	 */
	int OBSERVER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER__PROPERTIES = ACTOR__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Social factors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER__SOCIAL_FACTORS = ACTOR__SOCIAL_FACTORS;

	/**
	 * The feature id for the '<em><b>Psychological factors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER__PSYCHOLOGICAL_FACTORS = ACTOR__PSYCHOLOGICAL_FACTORS;

	/**
	 * The number of structural features of the '<em>Observer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Observer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_OPERATION_COUNT = ACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kindness.impl.MotivationImpl <em>Motivation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness.impl.MotivationImpl
	 * @see kindness.impl.KindnessPackageImpl#getMotivation()
	 * @generated
	 */
	int MOTIVATION = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVATION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVATION__LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Towards</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVATION__TOWARDS = 2;

	/**
	 * The number of structural features of the '<em>Motivation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Motivation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kindness.impl.Social_FactorsImpl <em>Social Factors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness.impl.Social_FactorsImpl
	 * @see kindness.impl.KindnessPackageImpl#getSocial_Factors()
	 * @generated
	 */
	int SOCIAL_FACTORS = 12;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_FACTORS__CONNECTION = Psycho_Social_FactorPackage.ABS_SOCIAL_FACTORS__CONNECTION;

	/**
	 * The feature id for the '<em><b>Socialfactor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_FACTORS__SOCIALFACTOR = Psycho_Social_FactorPackage.ABS_SOCIAL_FACTORS__SOCIALFACTOR;

	/**
	 * The number of structural features of the '<em>Social Factors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_FACTORS_FEATURE_COUNT = Psycho_Social_FactorPackage.ABS_SOCIAL_FACTORS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Social Factors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_FACTORS_OPERATION_COUNT = Psycho_Social_FactorPackage.ABS_SOCIAL_FACTORS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kindness.impl.Psychological_FactorsImpl <em>Psychological Factors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness.impl.Psychological_FactorsImpl
	 * @see kindness.impl.KindnessPackageImpl#getPsychological_Factors()
	 * @generated
	 */
	int PSYCHOLOGICAL_FACTORS = 13;

	/**
	 * The feature id for the '<em><b>Psychologicalfactor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSYCHOLOGICAL_FACTORS__PSYCHOLOGICALFACTOR = Psycho_Social_FactorPackage.ABS_PSYCHOLOGICAL_FACTORS__PSYCHOLOGICALFACTOR;

	/**
	 * The number of structural features of the '<em>Psychological Factors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSYCHOLOGICAL_FACTORS_FEATURE_COUNT = Psycho_Social_FactorPackage.ABS_PSYCHOLOGICAL_FACTORS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Psychological Factors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSYCHOLOGICAL_FACTORS_OPERATION_COUNT = Psycho_Social_FactorPackage.ABS_PSYCHOLOGICAL_FACTORS_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link kindness.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness.impl.ContextImpl
	 * @see kindness.impl.KindnessPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 14;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__TIME = 1;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kindness.impl.SupportingActImpl <em>Supporting Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness.impl.SupportingActImpl
	 * @see kindness.impl.KindnessPackageImpl#getSupportingAct()
	 * @generated
	 */
	int SUPPORTING_ACT = 15;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_ACT__PRECONDITION = ACT__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_ACT__POSTCONDITION = ACT__POSTCONDITION;

	/**
	 * The number of structural features of the '<em>Supporting Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_ACT_FEATURE_COUNT = ACT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Supporting Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_ACT_OPERATION_COUNT = ACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kindness.impl.MotivationActImpl <em>Motivation Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness.impl.MotivationActImpl
	 * @see kindness.impl.KindnessPackageImpl#getMotivationAct()
	 * @generated
	 */
	int MOTIVATION_ACT = 16;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVATION_ACT__PRECONDITION = SUPPORTING_ACT__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVATION_ACT__POSTCONDITION = SUPPORTING_ACT__POSTCONDITION;

	/**
	 * The number of structural features of the '<em>Motivation Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVATION_ACT_FEATURE_COUNT = SUPPORTING_ACT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Motivation Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVATION_ACT_OPERATION_COUNT = SUPPORTING_ACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kindness.impl.AbilityActImpl <em>Ability Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness.impl.AbilityActImpl
	 * @see kindness.impl.KindnessPackageImpl#getAbilityAct()
	 * @generated
	 */
	int ABILITY_ACT = 17;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY_ACT__PRECONDITION = SUPPORTING_ACT__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY_ACT__POSTCONDITION = SUPPORTING_ACT__POSTCONDITION;

	/**
	 * The number of structural features of the '<em>Ability Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY_ACT_FEATURE_COUNT = SUPPORTING_ACT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ability Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY_ACT_OPERATION_COUNT = SUPPORTING_ACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kindness.impl.PromptActImpl <em>Prompt Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness.impl.PromptActImpl
	 * @see kindness.impl.KindnessPackageImpl#getPromptAct()
	 * @generated
	 */
	int PROMPT_ACT = 19;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_ACT__PRECONDITION = SUPPORTING_ACT__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_ACT__POSTCONDITION = SUPPORTING_ACT__POSTCONDITION;

	/**
	 * The number of structural features of the '<em>Prompt Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_ACT_FEATURE_COUNT = SUPPORTING_ACT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Prompt Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_ACT_OPERATION_COUNT = SUPPORTING_ACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kindness.MotivationType <em>Motivation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness.MotivationType
	 * @see kindness.impl.KindnessPackageImpl#getMotivationType()
	 * @generated
	 */
	int MOTIVATION_TYPE = 20;

	/**
	 * Returns the meta object for class '{@link kindness.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see kindness.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link kindness.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kindness.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link kindness.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see kindness.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for class '{@link kindness.KindnessOpportunity <em>Opportunity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opportunity</em>'.
	 * @see kindness.KindnessOpportunity
	 * @generated
	 */
	EClass getKindnessOpportunity();

	/**
	 * Returns the meta object for the attribute '{@link kindness.KindnessOpportunity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kindness.KindnessOpportunity#getName()
	 * @see #getKindnessOpportunity()
	 * @generated
	 */
	EAttribute getKindnessOpportunity_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link kindness.KindnessOpportunity#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see kindness.KindnessOpportunity#getProperties()
	 * @see #getKindnessOpportunity()
	 * @generated
	 */
	EReference getKindnessOpportunity_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link kindness.KindnessOpportunity#getAct <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Act</em>'.
	 * @see kindness.KindnessOpportunity#getAct()
	 * @see #getKindnessOpportunity()
	 * @generated
	 */
	EReference getKindnessOpportunity_Act();

	/**
	 * Returns the meta object for the attribute '{@link kindness.KindnessOpportunity#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see kindness.KindnessOpportunity#getDescription()
	 * @see #getKindnessOpportunity()
	 * @generated
	 */
	EAttribute getKindnessOpportunity_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link kindness.KindnessOpportunity#getKindnessentity <em>Kindnessentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kindnessentity</em>'.
	 * @see kindness.KindnessOpportunity#getKindnessentity()
	 * @see #getKindnessOpportunity()
	 * @generated
	 */
	EReference getKindnessOpportunity_Kindnessentity();

	/**
	 * Returns the meta object for the containment reference list '{@link kindness.KindnessOpportunity#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actor</em>'.
	 * @see kindness.KindnessOpportunity#getActor()
	 * @see #getKindnessOpportunity()
	 * @generated
	 */
	EReference getKindnessOpportunity_Actor();

	/**
	 * Returns the meta object for class '{@link kindness.KindnessAct <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Act</em>'.
	 * @see kindness.KindnessAct
	 * @generated
	 */
	EClass getKindnessAct();

	/**
	 * Returns the meta object for the reference '{@link kindness.KindnessAct#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see kindness.KindnessAct#getNext()
	 * @see #getKindnessAct()
	 * @generated
	 */
	EReference getKindnessAct_Next();

	/**
	 * Returns the meta object for class '{@link kindness.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see kindness.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link kindness.Condition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kindness.Condition#getName()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link kindness.Condition#getRefkindnessentity <em>Refkindnessentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Refkindnessentity</em>'.
	 * @see kindness.Condition#getRefkindnessentity()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Refkindnessentity();

	/**
	 * Returns the meta object for class '{@link kindness.KindnessEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see kindness.KindnessEntity
	 * @generated
	 */
	EClass getKindnessEntity();

	/**
	 * Returns the meta object for the attribute '{@link kindness.KindnessEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kindness.KindnessEntity#getName()
	 * @see #getKindnessEntity()
	 * @generated
	 */
	EAttribute getKindnessEntity_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link kindness.KindnessEntity#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see kindness.KindnessEntity#getProperties()
	 * @see #getKindnessEntity()
	 * @generated
	 */
	EReference getKindnessEntity_Properties();

	/**
	 * Returns the meta object for class '{@link kindness.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see kindness.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for class '{@link kindness.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see kindness.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for class '{@link kindness.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see kindness.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the containment reference '{@link kindness.Actor#getSocial_factors <em>Social factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Social factors</em>'.
	 * @see kindness.Actor#getSocial_factors()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Social_factors();

	/**
	 * Returns the meta object for the containment reference '{@link kindness.Actor#getPsychological_factors <em>Psychological factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Psychological factors</em>'.
	 * @see kindness.Actor#getPsychological_factors()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Psychological_factors();

	/**
	 * Returns the meta object for class '{@link kindness.Giver <em>Giver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Giver</em>'.
	 * @see kindness.Giver
	 * @generated
	 */
	EClass getGiver();

	/**
	 * Returns the meta object for the reference list '{@link kindness.Giver#getMotivations <em>Motivations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Motivations</em>'.
	 * @see kindness.Giver#getMotivations()
	 * @see #getGiver()
	 * @generated
	 */
	EReference getGiver_Motivations();

	/**
	 * Returns the meta object for class '{@link kindness.Receiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receiver</em>'.
	 * @see kindness.Receiver
	 * @generated
	 */
	EClass getReceiver();

	/**
	 * Returns the meta object for class '{@link kindness.Observer <em>Observer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observer</em>'.
	 * @see kindness.Observer
	 * @generated
	 */
	EClass getObserver();

	/**
	 * Returns the meta object for class '{@link kindness.Motivation <em>Motivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motivation</em>'.
	 * @see kindness.Motivation
	 * @generated
	 */
	EClass getMotivation();

	/**
	 * Returns the meta object for the attribute '{@link kindness.Motivation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see kindness.Motivation#getType()
	 * @see #getMotivation()
	 * @generated
	 */
	EAttribute getMotivation_Type();

	/**
	 * Returns the meta object for the attribute '{@link kindness.Motivation#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see kindness.Motivation#getLevel()
	 * @see #getMotivation()
	 * @generated
	 */
	EAttribute getMotivation_Level();

	/**
	 * Returns the meta object for the reference '{@link kindness.Motivation#getTowards <em>Towards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Towards</em>'.
	 * @see kindness.Motivation#getTowards()
	 * @see #getMotivation()
	 * @generated
	 */
	EReference getMotivation_Towards();

	/**
	 * Returns the meta object for class '{@link kindness.Social_Factors <em>Social Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social Factors</em>'.
	 * @see kindness.Social_Factors
	 * @generated
	 */
	EClass getSocial_Factors();

	/**
	 * Returns the meta object for class '{@link kindness.Psychological_Factors <em>Psychological Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Psychological Factors</em>'.
	 * @see kindness.Psychological_Factors
	 * @generated
	 */
	EClass getPsychological_Factors();

	/**
	 * Returns the meta object for class '{@link kindness.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see kindness.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the containment reference list '{@link kindness.Context#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location</em>'.
	 * @see kindness.Context#getLocation()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link kindness.Context#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time</em>'.
	 * @see kindness.Context#getTime()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Time();

	/**
	 * Returns the meta object for class '{@link kindness.SupportingAct <em>Supporting Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supporting Act</em>'.
	 * @see kindness.SupportingAct
	 * @generated
	 */
	EClass getSupportingAct();

	/**
	 * Returns the meta object for class '{@link kindness.MotivationAct <em>Motivation Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motivation Act</em>'.
	 * @see kindness.MotivationAct
	 * @generated
	 */
	EClass getMotivationAct();

	/**
	 * Returns the meta object for class '{@link kindness.AbilityAct <em>Ability Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ability Act</em>'.
	 * @see kindness.AbilityAct
	 * @generated
	 */
	EClass getAbilityAct();

	/**
	 * Returns the meta object for class '{@link kindness.Act <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Act</em>'.
	 * @see kindness.Act
	 * @generated
	 */
	EClass getAct();

	/**
	 * Returns the meta object for the containment reference '{@link kindness.Act#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Precondition</em>'.
	 * @see kindness.Act#getPrecondition()
	 * @see #getAct()
	 * @generated
	 */
	EReference getAct_Precondition();

	/**
	 * Returns the meta object for the containment reference '{@link kindness.Act#getPostcondition <em>Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postcondition</em>'.
	 * @see kindness.Act#getPostcondition()
	 * @see #getAct()
	 * @generated
	 */
	EReference getAct_Postcondition();

	/**
	 * Returns the meta object for class '{@link kindness.PromptAct <em>Prompt Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prompt Act</em>'.
	 * @see kindness.PromptAct
	 * @generated
	 */
	EClass getPromptAct();

	/**
	 * Returns the meta object for enum '{@link kindness.MotivationType <em>Motivation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Motivation Type</em>'.
	 * @see kindness.MotivationType
	 * @generated
	 */
	EEnum getMotivationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KindnessFactory getKindnessFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link kindness.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness.impl.PropertyImpl
		 * @see kindness.impl.KindnessPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link kindness.impl.KindnessOpportunityImpl <em>Opportunity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness.impl.KindnessOpportunityImpl
		 * @see kindness.impl.KindnessPackageImpl#getKindnessOpportunity()
		 * @generated
		 */
		EClass KINDNESS_OPPORTUNITY = eINSTANCE.getKindnessOpportunity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KINDNESS_OPPORTUNITY__NAME = eINSTANCE.getKindnessOpportunity_Name();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KINDNESS_OPPORTUNITY__PROPERTIES = eINSTANCE.getKindnessOpportunity_Properties();

		/**
		 * The meta object literal for the '<em><b>Act</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KINDNESS_OPPORTUNITY__ACT = eINSTANCE.getKindnessOpportunity_Act();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KINDNESS_OPPORTUNITY__DESCRIPTION = eINSTANCE.getKindnessOpportunity_Description();

		/**
		 * The meta object literal for the '<em><b>Kindnessentity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KINDNESS_OPPORTUNITY__KINDNESSENTITY = eINSTANCE.getKindnessOpportunity_Kindnessentity();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KINDNESS_OPPORTUNITY__ACTOR = eINSTANCE.getKindnessOpportunity_Actor();

		/**
		 * The meta object literal for the '{@link kindness.impl.KindnessActImpl <em>Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness.impl.KindnessActImpl
		 * @see kindness.impl.KindnessPackageImpl#getKindnessAct()
		 * @generated
		 */
		EClass KINDNESS_ACT = eINSTANCE.getKindnessAct();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KINDNESS_ACT__NEXT = eINSTANCE.getKindnessAct_Next();

		/**
		 * The meta object literal for the '{@link kindness.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness.impl.ConditionImpl
		 * @see kindness.impl.KindnessPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__NAME = eINSTANCE.getCondition_Name();

		/**
		 * The meta object literal for the '<em><b>Refkindnessentity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__REFKINDNESSENTITY = eINSTANCE.getCondition_Refkindnessentity();

		/**
		 * The meta object literal for the '{@link kindness.impl.KindnessEntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness.impl.KindnessEntityImpl
		 * @see kindness.impl.KindnessPackageImpl#getKindnessEntity()
		 * @generated
		 */
		EClass KINDNESS_ENTITY = eINSTANCE.getKindnessEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KINDNESS_ENTITY__NAME = eINSTANCE.getKindnessEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KINDNESS_ENTITY__PROPERTIES = eINSTANCE.getKindnessEntity_Properties();

		/**
		 * The meta object literal for the '{@link kindness.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness.impl.LocationImpl
		 * @see kindness.impl.KindnessPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '{@link kindness.impl.TimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness.impl.TimeImpl
		 * @see kindness.impl.KindnessPackageImpl#getTime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '{@link kindness.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness.impl.ActorImpl
		 * @see kindness.impl.KindnessPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Social factors</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__SOCIAL_FACTORS = eINSTANCE.getActor_Social_factors();

		/**
		 * The meta object literal for the '<em><b>Psychological factors</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__PSYCHOLOGICAL_FACTORS = eINSTANCE.getActor_Psychological_factors();

		/**
		 * The meta object literal for the '{@link kindness.impl.GiverImpl <em>Giver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness.impl.GiverImpl
		 * @see kindness.impl.KindnessPackageImpl#getGiver()
		 * @generated
		 */
		EClass GIVER = eINSTANCE.getGiver();

		/**
		 * The meta object literal for the '<em><b>Motivations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIVER__MOTIVATIONS = eINSTANCE.getGiver_Motivations();

		/**
		 * The meta object literal for the '{@link kindness.impl.ReceiverImpl <em>Receiver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness.impl.ReceiverImpl
		 * @see kindness.impl.KindnessPackageImpl#getReceiver()
		 * @generated
		 */
		EClass RECEIVER = eINSTANCE.getReceiver();

		/**
		 * The meta object literal for the '{@link kindness.impl.ObserverImpl <em>Observer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness.impl.ObserverImpl
		 * @see kindness.impl.KindnessPackageImpl#getObserver()
		 * @generated
		 */
		EClass OBSERVER = eINSTANCE.getObserver();

		/**
		 * The meta object literal for the '{@link kindness.impl.MotivationImpl <em>Motivation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness.impl.MotivationImpl
		 * @see kindness.impl.KindnessPackageImpl#getMotivation()
		 * @generated
		 */
		EClass MOTIVATION = eINSTANCE.getMotivation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTIVATION__TYPE = eINSTANCE.getMotivation_Type();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTIVATION__LEVEL = eINSTANCE.getMotivation_Level();

		/**
		 * The meta object literal for the '<em><b>Towards</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTIVATION__TOWARDS = eINSTANCE.getMotivation_Towards();

		/**
		 * The meta object literal for the '{@link kindness.impl.Social_FactorsImpl <em>Social Factors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness.impl.Social_FactorsImpl
		 * @see kindness.impl.KindnessPackageImpl#getSocial_Factors()
		 * @generated
		 */
		EClass SOCIAL_FACTORS = eINSTANCE.getSocial_Factors();

		/**
		 * The meta object literal for the '{@link kindness.impl.Psychological_FactorsImpl <em>Psychological Factors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness.impl.Psychological_FactorsImpl
		 * @see kindness.impl.KindnessPackageImpl#getPsychological_Factors()
		 * @generated
		 */
		EClass PSYCHOLOGICAL_FACTORS = eINSTANCE.getPsychological_Factors();

		/**
		 * The meta object literal for the '{@link kindness.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness.impl.ContextImpl
		 * @see kindness.impl.KindnessPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__LOCATION = eINSTANCE.getContext_Location();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__TIME = eINSTANCE.getContext_Time();

		/**
		 * The meta object literal for the '{@link kindness.impl.SupportingActImpl <em>Supporting Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness.impl.SupportingActImpl
		 * @see kindness.impl.KindnessPackageImpl#getSupportingAct()
		 * @generated
		 */
		EClass SUPPORTING_ACT = eINSTANCE.getSupportingAct();

		/**
		 * The meta object literal for the '{@link kindness.impl.MotivationActImpl <em>Motivation Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness.impl.MotivationActImpl
		 * @see kindness.impl.KindnessPackageImpl#getMotivationAct()
		 * @generated
		 */
		EClass MOTIVATION_ACT = eINSTANCE.getMotivationAct();

		/**
		 * The meta object literal for the '{@link kindness.impl.AbilityActImpl <em>Ability Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness.impl.AbilityActImpl
		 * @see kindness.impl.KindnessPackageImpl#getAbilityAct()
		 * @generated
		 */
		EClass ABILITY_ACT = eINSTANCE.getAbilityAct();

		/**
		 * The meta object literal for the '{@link kindness.impl.ActImpl <em>Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness.impl.ActImpl
		 * @see kindness.impl.KindnessPackageImpl#getAct()
		 * @generated
		 */
		EClass ACT = eINSTANCE.getAct();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACT__PRECONDITION = eINSTANCE.getAct_Precondition();

		/**
		 * The meta object literal for the '<em><b>Postcondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACT__POSTCONDITION = eINSTANCE.getAct_Postcondition();

		/**
		 * The meta object literal for the '{@link kindness.impl.PromptActImpl <em>Prompt Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness.impl.PromptActImpl
		 * @see kindness.impl.KindnessPackageImpl#getPromptAct()
		 * @generated
		 */
		EClass PROMPT_ACT = eINSTANCE.getPromptAct();

		/**
		 * The meta object literal for the '{@link kindness.MotivationType <em>Motivation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness.MotivationType
		 * @see kindness.impl.KindnessPackageImpl#getMotivationType()
		 * @generated
		 */
		EEnum MOTIVATION_TYPE = eINSTANCE.getMotivationType();

	}

} //KindnessPackage
