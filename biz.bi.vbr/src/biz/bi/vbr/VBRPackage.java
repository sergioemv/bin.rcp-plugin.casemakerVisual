/**
 * <copyright>
 * </copyright>
 *
 * $Id: VBRPackage.java,v 1.2 2005/09/01 22:17:38 hcanedo Exp $
 */
package biz.bi.vbr;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see biz.bi.vbr.VBRFactory
 * @generated
 */
public interface VBRPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vbr"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://biz.bi.vbr"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vbr"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VBRPackage eINSTANCE = biz.bi.vbr.impl.VBRPackageImpl.init();

	/**
	 * The meta object id for the '{@link biz.bi.vbr.impl.BusinessObjectImpl <em>Business Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.vbr.impl.BusinessObjectImpl
	 * @see biz.bi.vbr.impl.VBRPackageImpl#getBusinessObject()
	 * @generated
	 */
	int BUSINESS_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__ID = 0;

	/**
	 * The feature id for the '<em><b>Bo Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__BO_NAME = 1;

	/**
	 * The feature id for the '<em><b>Bo Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__BO_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>MBusiness Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__MBUSINESS_VALUE = 3;

	/**
	 * The feature id for the '<em><b>MFromal Policy</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__MFROMAL_POLICY = 4;

	/**
	 * The feature id for the '<em><b>Botime Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__BOTIME_STAMP = 5;

	/**
	 * The number of structural features of the the '<em>Business Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link biz.bi.vbr.impl.AbstractInferenceRuleContentsImpl <em>Abstract Inference Rule Contents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.vbr.impl.AbstractInferenceRuleContentsImpl
	 * @see biz.bi.vbr.impl.VBRPackageImpl#getAbstractInferenceRuleContents()
	 * @generated
	 */
	int ABSTRACT_INFERENCE_RULE_CONTENTS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INFERENCE_RULE_CONTENTS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INFERENCE_RULE_CONTENTS__TIME_STAMP = 1;

	/**
	 * The number of structural features of the the '<em>Abstract Inference Rule Contents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INFERENCE_RULE_CONTENTS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link biz.bi.vbr.impl.BusinessValueImpl <em>Business Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.vbr.impl.BusinessValueImpl
	 * @see biz.bi.vbr.impl.VBRPackageImpl#getBusinessValue()
	 * @generated
	 */
	int BUSINESS_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_VALUE__NAME = ABSTRACT_INFERENCE_RULE_CONTENTS__NAME;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_VALUE__TIME_STAMP = ABSTRACT_INFERENCE_RULE_CONTENTS__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_VALUE__ID = ABSTRACT_INFERENCE_RULE_CONTENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bv State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_VALUE__BV_STATE = ABSTRACT_INFERENCE_RULE_CONTENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bv Risk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_VALUE__BV_RISK = ABSTRACT_INFERENCE_RULE_CONTENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>MBusiness Object</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_VALUE__MBUSINESS_OBJECT = ABSTRACT_INFERENCE_RULE_CONTENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>MInference Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_VALUE__MINFERENCE_RULE = ABSTRACT_INFERENCE_RULE_CONTENTS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the the '<em>Business Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_VALUE_FEATURE_COUNT = ABSTRACT_INFERENCE_RULE_CONTENTS_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link biz.bi.vbr.impl.BusinessActionImpl <em>Business Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.vbr.impl.BusinessActionImpl
	 * @see biz.bi.vbr.impl.VBRPackageImpl#getBusinessAction()
	 * @generated
	 */
	int BUSINESS_ACTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTION__NAME = ABSTRACT_INFERENCE_RULE_CONTENTS__NAME;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTION__TIME_STAMP = ABSTRACT_INFERENCE_RULE_CONTENTS__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTION__ID = ABSTRACT_INFERENCE_RULE_CONTENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ba Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTION__BA_DESCRIPTION = ABSTRACT_INFERENCE_RULE_CONTENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mbesidebv</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTION__MBESIDEBV = ABSTRACT_INFERENCE_RULE_CONTENTS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the the '<em>Business Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTION_FEATURE_COUNT = ABSTRACT_INFERENCE_RULE_CONTENTS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link biz.bi.vbr.impl.FormalPolicyImpl <em>Formal Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.vbr.impl.FormalPolicyImpl
	 * @see biz.bi.vbr.impl.VBRPackageImpl#getFormalPolicy()
	 * @generated
	 */
	int FORMAL_POLICY = 3;

	/**
	 * The feature id for the '<em><b>Fp Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_POLICY__FP_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_POLICY__UNIQUE_ID = 1;

	/**
	 * The feature id for the '<em><b>MBusiness Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_POLICY__MBUSINESS_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>MBusiness Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_POLICY__MBUSINESS_ACTION = 3;

	/**
	 * The number of structural features of the the '<em>Formal Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_POLICY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link biz.bi.vbr.impl.InferenceRuleImpl <em>Inference Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.vbr.impl.InferenceRuleImpl
	 * @see biz.bi.vbr.impl.VBRPackageImpl#getInferenceRule()
	 * @generated
	 */
	int INFERENCE_RULE = 4;

	/**
	 * The feature id for the '<em><b>True Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFERENCE_RULE__TRUE_PART = 0;

	/**
	 * The feature id for the '<em><b>False Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFERENCE_RULE__FALSE_PART = 1;

	/**
	 * The number of structural features of the the '<em>Inference Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFERENCE_RULE_FEATURE_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link biz.bi.vbr.BusinessObject <em>Business Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Object</em>'.
	 * @see biz.bi.vbr.BusinessObject
	 * @generated
	 */
	EClass getBusinessObject();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vbr.BusinessObject#getBoName <em>Bo Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bo Name</em>'.
	 * @see biz.bi.vbr.BusinessObject#getBoName()
	 * @see #getBusinessObject()
	 * @generated
	 */
	EAttribute getBusinessObject_BoName();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vbr.BusinessObject#getBoDescription <em>Bo Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bo Description</em>'.
	 * @see biz.bi.vbr.BusinessObject#getBoDescription()
	 * @see #getBusinessObject()
	 * @generated
	 */
	EAttribute getBusinessObject_BoDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link biz.bi.vbr.BusinessObject#getM_BusinessValue <em>MBusiness Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MBusiness Value</em>'.
	 * @see biz.bi.vbr.BusinessObject#getM_BusinessValue()
	 * @see #getBusinessObject()
	 * @generated
	 */
	EReference getBusinessObject_M_BusinessValue();

	/**
	 * Returns the meta object for the container reference '{@link biz.bi.vbr.BusinessObject#getM_FromalPolicy <em>MFromal Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>MFromal Policy</em>'.
	 * @see biz.bi.vbr.BusinessObject#getM_FromalPolicy()
	 * @see #getBusinessObject()
	 * @generated
	 */
	EReference getBusinessObject_M_FromalPolicy();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vbr.BusinessObject#getBotimeStamp <em>Botime Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Botime Stamp</em>'.
	 * @see biz.bi.vbr.BusinessObject#getBotimeStamp()
	 * @see #getBusinessObject()
	 * @generated
	 */
	EAttribute getBusinessObject_BotimeStamp();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vbr.BusinessObject#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see biz.bi.vbr.BusinessObject#getId()
	 * @see #getBusinessObject()
	 * @generated
	 */
	EAttribute getBusinessObject_Id();

	/**
	 * Returns the meta object for class '{@link biz.bi.vbr.BusinessValue <em>Business Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Value</em>'.
	 * @see biz.bi.vbr.BusinessValue
	 * @generated
	 */
	EClass getBusinessValue();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vbr.BusinessValue#getBvState <em>Bv State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bv State</em>'.
	 * @see biz.bi.vbr.BusinessValue#getBvState()
	 * @see #getBusinessValue()
	 * @generated
	 */
	EAttribute getBusinessValue_BvState();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vbr.BusinessValue#getBvRisk <em>Bv Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bv Risk</em>'.
	 * @see biz.bi.vbr.BusinessValue#getBvRisk()
	 * @see #getBusinessValue()
	 * @generated
	 */
	EAttribute getBusinessValue_BvRisk();

	/**
	 * Returns the meta object for the container reference '{@link biz.bi.vbr.BusinessValue#getM_BusinessObject <em>MBusiness Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>MBusiness Object</em>'.
	 * @see biz.bi.vbr.BusinessValue#getM_BusinessObject()
	 * @see #getBusinessValue()
	 * @generated
	 */
	EReference getBusinessValue_M_BusinessObject();

	/**
	 * Returns the meta object for the containment reference list '{@link biz.bi.vbr.BusinessValue#getM_InferenceRule <em>MInference Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MInference Rule</em>'.
	 * @see biz.bi.vbr.BusinessValue#getM_InferenceRule()
	 * @see #getBusinessValue()
	 * @generated
	 */
	EReference getBusinessValue_M_InferenceRule();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vbr.BusinessValue#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see biz.bi.vbr.BusinessValue#getId()
	 * @see #getBusinessValue()
	 * @generated
	 */
	EAttribute getBusinessValue_Id();

	/**
	 * Returns the meta object for class '{@link biz.bi.vbr.BusinessAction <em>Business Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Action</em>'.
	 * @see biz.bi.vbr.BusinessAction
	 * @generated
	 */
	EClass getBusinessAction();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vbr.BusinessAction#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see biz.bi.vbr.BusinessAction#getId()
	 * @see #getBusinessAction()
	 * @generated
	 */
	EAttribute getBusinessAction_Id();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vbr.BusinessAction#getBaDescription <em>Ba Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ba Description</em>'.
	 * @see biz.bi.vbr.BusinessAction#getBaDescription()
	 * @see #getBusinessAction()
	 * @generated
	 */
	EAttribute getBusinessAction_BaDescription();

	/**
	 * Returns the meta object for the reference list '{@link biz.bi.vbr.BusinessAction#getM_besidebv <em>Mbesidebv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mbesidebv</em>'.
	 * @see biz.bi.vbr.BusinessAction#getM_besidebv()
	 * @see #getBusinessAction()
	 * @generated
	 */
	EReference getBusinessAction_M_besidebv();

	/**
	 * Returns the meta object for class '{@link biz.bi.vbr.FormalPolicy <em>Formal Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Policy</em>'.
	 * @see biz.bi.vbr.FormalPolicy
	 * @generated
	 */
	EClass getFormalPolicy();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vbr.FormalPolicy#getFpDescription <em>Fp Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fp Description</em>'.
	 * @see biz.bi.vbr.FormalPolicy#getFpDescription()
	 * @see #getFormalPolicy()
	 * @generated
	 */
	EAttribute getFormalPolicy_FpDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link biz.bi.vbr.FormalPolicy#getM_BusinessObject <em>MBusiness Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MBusiness Object</em>'.
	 * @see biz.bi.vbr.FormalPolicy#getM_BusinessObject()
	 * @see #getFormalPolicy()
	 * @generated
	 */
	EReference getFormalPolicy_M_BusinessObject();

	/**
	 * Returns the meta object for the containment reference list '{@link biz.bi.vbr.FormalPolicy#getM_BusinessAction <em>MBusiness Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MBusiness Action</em>'.
	 * @see biz.bi.vbr.FormalPolicy#getM_BusinessAction()
	 * @see #getFormalPolicy()
	 * @generated
	 */
	EReference getFormalPolicy_M_BusinessAction();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vbr.FormalPolicy#getUniqueId <em>Unique Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Id</em>'.
	 * @see biz.bi.vbr.FormalPolicy#getUniqueId()
	 * @see #getFormalPolicy()
	 * @generated
	 */
	EAttribute getFormalPolicy_UniqueId();

	/**
	 * Returns the meta object for class '{@link biz.bi.vbr.InferenceRule <em>Inference Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inference Rule</em>'.
	 * @see biz.bi.vbr.InferenceRule
	 * @generated
	 */
	EClass getInferenceRule();

	/**
	 * Returns the meta object for the reference '{@link biz.bi.vbr.InferenceRule#getTruePart <em>True Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>True Part</em>'.
	 * @see biz.bi.vbr.InferenceRule#getTruePart()
	 * @see #getInferenceRule()
	 * @generated
	 */
	EReference getInferenceRule_TruePart();

	/**
	 * Returns the meta object for the reference '{@link biz.bi.vbr.InferenceRule#getFalsePart <em>False Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>False Part</em>'.
	 * @see biz.bi.vbr.InferenceRule#getFalsePart()
	 * @see #getInferenceRule()
	 * @generated
	 */
	EReference getInferenceRule_FalsePart();

	/**
	 * Returns the meta object for class '{@link biz.bi.vbr.AbstractInferenceRuleContents <em>Abstract Inference Rule Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Inference Rule Contents</em>'.
	 * @see biz.bi.vbr.AbstractInferenceRuleContents
	 * @generated
	 */
	EClass getAbstractInferenceRuleContents();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vbr.AbstractInferenceRuleContents#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see biz.bi.vbr.AbstractInferenceRuleContents#getName()
	 * @see #getAbstractInferenceRuleContents()
	 * @generated
	 */
	EAttribute getAbstractInferenceRuleContents_Name();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vbr.AbstractInferenceRuleContents#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see biz.bi.vbr.AbstractInferenceRuleContents#getTimeStamp()
	 * @see #getAbstractInferenceRuleContents()
	 * @generated
	 */
	EAttribute getAbstractInferenceRuleContents_TimeStamp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VBRFactory getVBRFactory();

} //VBRPackage
