/**
 */
package Psycho_Social_Factor.Social.impl;

import Psycho_Social_Factor.Social.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SocialFactoryImpl extends EFactoryImpl implements SocialFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SocialFactory init() {
		try {
			SocialFactory theSocialFactory = (SocialFactory) EPackage.Registry.INSTANCE
					.getEFactory(SocialPackage.eNS_URI);
			if (theSocialFactory != null) {
				return theSocialFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SocialFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SocialPackage.LEVEL_OF_NEED:
			return createLevelOfNeed();
		case SocialPackage.RELATEDNESS:
			return createRelatedness();
		case SocialPackage.RECIPROCITY:
			return createReciprocity();
		case SocialPackage.OPPORTUNITY_TO_CONNECT:
			return createOpportunityToConnect();
		case SocialPackage.TRUST:
			return createTrust();
		case SocialPackage.OTHER_SOCIAL_FACTOR:
			return createOtherSocialFactor();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelOfNeed createLevelOfNeed() {
		LevelOfNeedImpl levelOfNeed = new LevelOfNeedImpl();
		return levelOfNeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relatedness createRelatedness() {
		RelatednessImpl relatedness = new RelatednessImpl();
		return relatedness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reciprocity createReciprocity() {
		ReciprocityImpl reciprocity = new ReciprocityImpl();
		return reciprocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpportunityToConnect createOpportunityToConnect() {
		OpportunityToConnectImpl opportunityToConnect = new OpportunityToConnectImpl();
		return opportunityToConnect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trust createTrust() {
		TrustImpl trust = new TrustImpl();
		return trust;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherSocialFactor createOtherSocialFactor() {
		OtherSocialFactorImpl otherSocialFactor = new OtherSocialFactorImpl();
		return otherSocialFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialPackage getSocialPackage() {
		return (SocialPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SocialPackage getPackage() {
		return SocialPackage.eINSTANCE;
	}

} //SocialFactoryImpl
