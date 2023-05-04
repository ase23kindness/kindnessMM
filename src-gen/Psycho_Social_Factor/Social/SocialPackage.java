/**
 */
package Psycho_Social_Factor.Social;

import Psycho_Social_Factor.Psycho_Social_FactorPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see Psycho_Social_Factor.Social.SocialFactory
 * @model kind="package"
 * @generated
 */
public interface SocialPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Social";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/kindness_metamodel_factors_social";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "package_socialfactors";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SocialPackage eINSTANCE = Psycho_Social_Factor.Social.impl.SocialPackageImpl.init();

	/**
	 * The meta object id for the '{@link Psycho_Social_Factor.Social.impl.SocialFactorImpl <em>Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Psycho_Social_Factor.Social.impl.SocialFactorImpl
	 * @see Psycho_Social_Factor.Social.impl.SocialPackageImpl#getSocialFactor()
	 * @generated
	 */
	int SOCIAL_FACTOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_FACTOR__NAME = Psycho_Social_FactorPackage.FACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Affectedfactor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_FACTOR__AFFECTEDFACTOR = Psycho_Social_FactorPackage.FACTOR__AFFECTEDFACTOR;

	/**
	 * The feature id for the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_FACTOR__OTHER = Psycho_Social_FactorPackage.FACTOR__OTHER;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_FACTOR__LEVEL = Psycho_Social_FactorPackage.FACTOR__LEVEL;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_FACTOR__CONNECTION = Psycho_Social_FactorPackage.FACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_FACTOR_FEATURE_COUNT = Psycho_Social_FactorPackage.FACTOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Impact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_FACTOR___COMPUTE_IMPACT__FACTORIMPACT = Psycho_Social_FactorPackage.FACTOR___COMPUTE_IMPACT__FACTORIMPACT;

	/**
	 * The number of operations of the '<em>Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_FACTOR_OPERATION_COUNT = Psycho_Social_FactorPackage.FACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Psycho_Social_Factor.Social.impl.LevelOfNeedImpl <em>Level Of Need</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Psycho_Social_Factor.Social.impl.LevelOfNeedImpl
	 * @see Psycho_Social_Factor.Social.impl.SocialPackageImpl#getLevelOfNeed()
	 * @generated
	 */
	int LEVEL_OF_NEED = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OF_NEED__NAME = SOCIAL_FACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Affectedfactor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OF_NEED__AFFECTEDFACTOR = SOCIAL_FACTOR__AFFECTEDFACTOR;

	/**
	 * The feature id for the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OF_NEED__OTHER = SOCIAL_FACTOR__OTHER;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OF_NEED__LEVEL = SOCIAL_FACTOR__LEVEL;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OF_NEED__CONNECTION = SOCIAL_FACTOR__CONNECTION;

	/**
	 * The feature id for the '<em><b>Need</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OF_NEED__NEED = SOCIAL_FACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Level Of Need</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OF_NEED_FEATURE_COUNT = SOCIAL_FACTOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Impact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OF_NEED___COMPUTE_IMPACT__FACTORIMPACT = SOCIAL_FACTOR___COMPUTE_IMPACT__FACTORIMPACT;

	/**
	 * The number of operations of the '<em>Level Of Need</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OF_NEED_OPERATION_COUNT = SOCIAL_FACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Psycho_Social_Factor.Social.impl.RelatednessImpl <em>Relatedness</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Psycho_Social_Factor.Social.impl.RelatednessImpl
	 * @see Psycho_Social_Factor.Social.impl.SocialPackageImpl#getRelatedness()
	 * @generated
	 */
	int RELATEDNESS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATEDNESS__NAME = SOCIAL_FACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Affectedfactor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATEDNESS__AFFECTEDFACTOR = SOCIAL_FACTOR__AFFECTEDFACTOR;

	/**
	 * The feature id for the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATEDNESS__OTHER = SOCIAL_FACTOR__OTHER;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATEDNESS__LEVEL = SOCIAL_FACTOR__LEVEL;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATEDNESS__CONNECTION = SOCIAL_FACTOR__CONNECTION;

	/**
	 * The feature id for the '<em><b>Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATEDNESS__DEGREE = SOCIAL_FACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relatedness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATEDNESS_FEATURE_COUNT = SOCIAL_FACTOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Impact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATEDNESS___COMPUTE_IMPACT__FACTORIMPACT = SOCIAL_FACTOR___COMPUTE_IMPACT__FACTORIMPACT;

	/**
	 * The number of operations of the '<em>Relatedness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATEDNESS_OPERATION_COUNT = SOCIAL_FACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Psycho_Social_Factor.Social.impl.ReciprocityImpl <em>Reciprocity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Psycho_Social_Factor.Social.impl.ReciprocityImpl
	 * @see Psycho_Social_Factor.Social.impl.SocialPackageImpl#getReciprocity()
	 * @generated
	 */
	int RECIPROCITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPROCITY__NAME = SOCIAL_FACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Affectedfactor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPROCITY__AFFECTEDFACTOR = SOCIAL_FACTOR__AFFECTEDFACTOR;

	/**
	 * The feature id for the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPROCITY__OTHER = SOCIAL_FACTOR__OTHER;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPROCITY__LEVEL = SOCIAL_FACTOR__LEVEL;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPROCITY__CONNECTION = SOCIAL_FACTOR__CONNECTION;

	/**
	 * The feature id for the '<em><b>Is Reciprocal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPROCITY__IS_RECIPROCAL = SOCIAL_FACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reciprocity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPROCITY_FEATURE_COUNT = SOCIAL_FACTOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Impact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPROCITY___COMPUTE_IMPACT__FACTORIMPACT = SOCIAL_FACTOR___COMPUTE_IMPACT__FACTORIMPACT;

	/**
	 * The number of operations of the '<em>Reciprocity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPROCITY_OPERATION_COUNT = SOCIAL_FACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Psycho_Social_Factor.Social.impl.OpportunityToConnectImpl <em>Opportunity To Connect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Psycho_Social_Factor.Social.impl.OpportunityToConnectImpl
	 * @see Psycho_Social_Factor.Social.impl.SocialPackageImpl#getOpportunityToConnect()
	 * @generated
	 */
	int OPPORTUNITY_TO_CONNECT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPORTUNITY_TO_CONNECT__NAME = SOCIAL_FACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Affectedfactor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPORTUNITY_TO_CONNECT__AFFECTEDFACTOR = SOCIAL_FACTOR__AFFECTEDFACTOR;

	/**
	 * The feature id for the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPORTUNITY_TO_CONNECT__OTHER = SOCIAL_FACTOR__OTHER;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPORTUNITY_TO_CONNECT__LEVEL = SOCIAL_FACTOR__LEVEL;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPORTUNITY_TO_CONNECT__CONNECTION = SOCIAL_FACTOR__CONNECTION;

	/**
	 * The feature id for the '<em><b>Opportunity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPORTUNITY_TO_CONNECT__OPPORTUNITY = SOCIAL_FACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Opportunity To Connect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPORTUNITY_TO_CONNECT_FEATURE_COUNT = SOCIAL_FACTOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Impact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPORTUNITY_TO_CONNECT___COMPUTE_IMPACT__FACTORIMPACT = SOCIAL_FACTOR___COMPUTE_IMPACT__FACTORIMPACT;

	/**
	 * The number of operations of the '<em>Opportunity To Connect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPORTUNITY_TO_CONNECT_OPERATION_COUNT = SOCIAL_FACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Psycho_Social_Factor.Social.impl.TrustImpl <em>Trust</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Psycho_Social_Factor.Social.impl.TrustImpl
	 * @see Psycho_Social_Factor.Social.impl.SocialPackageImpl#getTrust()
	 * @generated
	 */
	int TRUST = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST__NAME = SOCIAL_FACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Affectedfactor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST__AFFECTEDFACTOR = SOCIAL_FACTOR__AFFECTEDFACTOR;

	/**
	 * The feature id for the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST__OTHER = SOCIAL_FACTOR__OTHER;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST__LEVEL = SOCIAL_FACTOR__LEVEL;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST__CONNECTION = SOCIAL_FACTOR__CONNECTION;

	/**
	 * The number of structural features of the '<em>Trust</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST_FEATURE_COUNT = SOCIAL_FACTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Impact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST___COMPUTE_IMPACT__FACTORIMPACT = SOCIAL_FACTOR___COMPUTE_IMPACT__FACTORIMPACT;

	/**
	 * The number of operations of the '<em>Trust</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST_OPERATION_COUNT = SOCIAL_FACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Psycho_Social_Factor.Social.impl.OtherSocialFactorImpl <em>Other Social Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Psycho_Social_Factor.Social.impl.OtherSocialFactorImpl
	 * @see Psycho_Social_Factor.Social.impl.SocialPackageImpl#getOtherSocialFactor()
	 * @generated
	 */
	int OTHER_SOCIAL_FACTOR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_SOCIAL_FACTOR__NAME = SOCIAL_FACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Affectedfactor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_SOCIAL_FACTOR__AFFECTEDFACTOR = SOCIAL_FACTOR__AFFECTEDFACTOR;

	/**
	 * The feature id for the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_SOCIAL_FACTOR__OTHER = SOCIAL_FACTOR__OTHER;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_SOCIAL_FACTOR__LEVEL = SOCIAL_FACTOR__LEVEL;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_SOCIAL_FACTOR__CONNECTION = SOCIAL_FACTOR__CONNECTION;

	/**
	 * The number of structural features of the '<em>Other Social Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_SOCIAL_FACTOR_FEATURE_COUNT = SOCIAL_FACTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Impact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_SOCIAL_FACTOR___COMPUTE_IMPACT__FACTORIMPACT = SOCIAL_FACTOR___COMPUTE_IMPACT__FACTORIMPACT;

	/**
	 * The number of operations of the '<em>Other Social Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_SOCIAL_FACTOR_OPERATION_COUNT = SOCIAL_FACTOR_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link Psycho_Social_Factor.Social.LevelOfNeed <em>Level Of Need</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Level Of Need</em>'.
	 * @see Psycho_Social_Factor.Social.LevelOfNeed
	 * @generated
	 */
	EClass getLevelOfNeed();

	/**
	 * Returns the meta object for the attribute '{@link Psycho_Social_Factor.Social.LevelOfNeed#getNeed <em>Need</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Need</em>'.
	 * @see Psycho_Social_Factor.Social.LevelOfNeed#getNeed()
	 * @see #getLevelOfNeed()
	 * @generated
	 */
	EAttribute getLevelOfNeed_Need();

	/**
	 * Returns the meta object for class '{@link Psycho_Social_Factor.Social.Relatedness <em>Relatedness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relatedness</em>'.
	 * @see Psycho_Social_Factor.Social.Relatedness
	 * @generated
	 */
	EClass getRelatedness();

	/**
	 * Returns the meta object for the attribute '{@link Psycho_Social_Factor.Social.Relatedness#getDegree <em>Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Degree</em>'.
	 * @see Psycho_Social_Factor.Social.Relatedness#getDegree()
	 * @see #getRelatedness()
	 * @generated
	 */
	EAttribute getRelatedness_Degree();

	/**
	 * Returns the meta object for class '{@link Psycho_Social_Factor.Social.Reciprocity <em>Reciprocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reciprocity</em>'.
	 * @see Psycho_Social_Factor.Social.Reciprocity
	 * @generated
	 */
	EClass getReciprocity();

	/**
	 * Returns the meta object for the attribute '{@link Psycho_Social_Factor.Social.Reciprocity#isIsReciprocal <em>Is Reciprocal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Reciprocal</em>'.
	 * @see Psycho_Social_Factor.Social.Reciprocity#isIsReciprocal()
	 * @see #getReciprocity()
	 * @generated
	 */
	EAttribute getReciprocity_IsReciprocal();

	/**
	 * Returns the meta object for class '{@link Psycho_Social_Factor.Social.SocialFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factor</em>'.
	 * @see Psycho_Social_Factor.Social.SocialFactor
	 * @generated
	 */
	EClass getSocialFactor();

	/**
	 * Returns the meta object for the reference '{@link Psycho_Social_Factor.Social.SocialFactor#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection</em>'.
	 * @see Psycho_Social_Factor.Social.SocialFactor#getConnection()
	 * @see #getSocialFactor()
	 * @generated
	 */
	EReference getSocialFactor_Connection();

	/**
	 * Returns the meta object for class '{@link Psycho_Social_Factor.Social.OpportunityToConnect <em>Opportunity To Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opportunity To Connect</em>'.
	 * @see Psycho_Social_Factor.Social.OpportunityToConnect
	 * @generated
	 */
	EClass getOpportunityToConnect();

	/**
	 * Returns the meta object for the attribute '{@link Psycho_Social_Factor.Social.OpportunityToConnect#getOpportunity <em>Opportunity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opportunity</em>'.
	 * @see Psycho_Social_Factor.Social.OpportunityToConnect#getOpportunity()
	 * @see #getOpportunityToConnect()
	 * @generated
	 */
	EAttribute getOpportunityToConnect_Opportunity();

	/**
	 * Returns the meta object for class '{@link Psycho_Social_Factor.Social.Trust <em>Trust</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trust</em>'.
	 * @see Psycho_Social_Factor.Social.Trust
	 * @generated
	 */
	EClass getTrust();

	/**
	 * Returns the meta object for class '{@link Psycho_Social_Factor.Social.OtherSocialFactor <em>Other Social Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other Social Factor</em>'.
	 * @see Psycho_Social_Factor.Social.OtherSocialFactor
	 * @generated
	 */
	EClass getOtherSocialFactor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SocialFactory getSocialFactory();

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
		 * The meta object literal for the '{@link Psycho_Social_Factor.Social.impl.LevelOfNeedImpl <em>Level Of Need</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Psycho_Social_Factor.Social.impl.LevelOfNeedImpl
		 * @see Psycho_Social_Factor.Social.impl.SocialPackageImpl#getLevelOfNeed()
		 * @generated
		 */
		EClass LEVEL_OF_NEED = eINSTANCE.getLevelOfNeed();

		/**
		 * The meta object literal for the '<em><b>Need</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVEL_OF_NEED__NEED = eINSTANCE.getLevelOfNeed_Need();

		/**
		 * The meta object literal for the '{@link Psycho_Social_Factor.Social.impl.RelatednessImpl <em>Relatedness</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Psycho_Social_Factor.Social.impl.RelatednessImpl
		 * @see Psycho_Social_Factor.Social.impl.SocialPackageImpl#getRelatedness()
		 * @generated
		 */
		EClass RELATEDNESS = eINSTANCE.getRelatedness();

		/**
		 * The meta object literal for the '<em><b>Degree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATEDNESS__DEGREE = eINSTANCE.getRelatedness_Degree();

		/**
		 * The meta object literal for the '{@link Psycho_Social_Factor.Social.impl.ReciprocityImpl <em>Reciprocity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Psycho_Social_Factor.Social.impl.ReciprocityImpl
		 * @see Psycho_Social_Factor.Social.impl.SocialPackageImpl#getReciprocity()
		 * @generated
		 */
		EClass RECIPROCITY = eINSTANCE.getReciprocity();

		/**
		 * The meta object literal for the '<em><b>Is Reciprocal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIPROCITY__IS_RECIPROCAL = eINSTANCE.getReciprocity_IsReciprocal();

		/**
		 * The meta object literal for the '{@link Psycho_Social_Factor.Social.impl.SocialFactorImpl <em>Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Psycho_Social_Factor.Social.impl.SocialFactorImpl
		 * @see Psycho_Social_Factor.Social.impl.SocialPackageImpl#getSocialFactor()
		 * @generated
		 */
		EClass SOCIAL_FACTOR = eINSTANCE.getSocialFactor();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCIAL_FACTOR__CONNECTION = eINSTANCE.getSocialFactor_Connection();

		/**
		 * The meta object literal for the '{@link Psycho_Social_Factor.Social.impl.OpportunityToConnectImpl <em>Opportunity To Connect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Psycho_Social_Factor.Social.impl.OpportunityToConnectImpl
		 * @see Psycho_Social_Factor.Social.impl.SocialPackageImpl#getOpportunityToConnect()
		 * @generated
		 */
		EClass OPPORTUNITY_TO_CONNECT = eINSTANCE.getOpportunityToConnect();

		/**
		 * The meta object literal for the '<em><b>Opportunity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPPORTUNITY_TO_CONNECT__OPPORTUNITY = eINSTANCE.getOpportunityToConnect_Opportunity();

		/**
		 * The meta object literal for the '{@link Psycho_Social_Factor.Social.impl.TrustImpl <em>Trust</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Psycho_Social_Factor.Social.impl.TrustImpl
		 * @see Psycho_Social_Factor.Social.impl.SocialPackageImpl#getTrust()
		 * @generated
		 */
		EClass TRUST = eINSTANCE.getTrust();

		/**
		 * The meta object literal for the '{@link Psycho_Social_Factor.Social.impl.OtherSocialFactorImpl <em>Other Social Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Psycho_Social_Factor.Social.impl.OtherSocialFactorImpl
		 * @see Psycho_Social_Factor.Social.impl.SocialPackageImpl#getOtherSocialFactor()
		 * @generated
		 */
		EClass OTHER_SOCIAL_FACTOR = eINSTANCE.getOtherSocialFactor();

	}

} //SocialPackage
