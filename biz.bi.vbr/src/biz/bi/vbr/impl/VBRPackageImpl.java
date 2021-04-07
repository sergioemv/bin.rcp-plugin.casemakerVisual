/**
 * <copyright>
 * </copyright>
 *
 * $Id: VBRPackageImpl.java,v 1.5 2005/09/12 13:55:27 hcanedo Exp $
 */
package biz.bi.vbr.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import biz.bi.vbr.AbstractInferenceRuleContents;
import biz.bi.vbr.BusinessAction;
import biz.bi.vbr.BusinessObject;
import biz.bi.vbr.BusinessValue;
import biz.bi.vbr.FormalPolicy;
import biz.bi.vbr.InferenceRule;
import biz.bi.vbr.VBRFactory;
import biz.bi.vbr.VBRPackage;
import biz.bi.vbr.vbrvm.VBRVMPackage;
import biz.bi.vbr.vbrvm.impl.VBRVMPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VBRPackageImpl extends EPackageImpl implements VBRPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formalPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inferenceRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractInferenceRuleContentsEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see biz.bi.vbr.VBRPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VBRPackageImpl() {
		super(eNS_URI, VBRFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VBRPackage init() {
		if (isInited)
			return (VBRPackage) EPackage.Registry.INSTANCE
					.getEPackage(VBRPackage.eNS_URI);

		// Obtain or create and register package
		VBRPackageImpl theVBRPackage = (VBRPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI) instanceof VBRPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI)
				: new VBRPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		VBRVMPackageImpl theVBRVMPackage = (VBRVMPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(VBRVMPackage.eNS_URI) instanceof VBRVMPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(VBRVMPackage.eNS_URI)
				: VBRVMPackage.eINSTANCE);

		// Create package meta-data objects
		theVBRPackage.createPackageContents();
		theVBRVMPackage.createPackageContents();

		// Initialize created meta-data
		theVBRPackage.initializePackageContents();
		theVBRVMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVBRPackage.freeze();

		return theVBRPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessObject() {
		return businessObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessObject_BoName() {
		return (EAttribute) businessObjectEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessObject_BoDescription() {
		return (EAttribute) businessObjectEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessObject_M_BusinessValue() {
		return (EReference) businessObjectEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessObject_M_FromalPolicy() {
		return (EReference) businessObjectEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessObject_BotimeStamp() {
		return (EAttribute) businessObjectEClass.getEStructuralFeatures()
				.get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessObject_Id() {
		return (EAttribute) businessObjectEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessValue() {
		return businessValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessValue_BvState() {
		return (EAttribute) businessValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessValue_BvRisk() {
		return (EAttribute) businessValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessValue_M_BusinessObject() {
		return (EReference) businessValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessValue_M_InferenceRule() {
		return (EReference) businessValueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessValue_Id() {
		return (EAttribute) businessValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessAction() {
		return businessActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessAction_Id() {
		return (EAttribute) businessActionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessAction_BaDescription() {
		return (EAttribute) businessActionEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessAction_M_besidebv() {
		return (EReference) businessActionEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormalPolicy() {
		return formalPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormalPolicy_FpDescription() {
		return (EAttribute) formalPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormalPolicy_M_BusinessObject() {
		return (EReference) formalPolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormalPolicy_M_BusinessAction() {
		return (EReference) formalPolicyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormalPolicy_UniqueId() {
		return (EAttribute) formalPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInferenceRule() {
		return inferenceRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInferenceRule_TruePart() {
		return (EReference) inferenceRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInferenceRule_FalsePart() {
		return (EReference) inferenceRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractInferenceRuleContents() {
		return abstractInferenceRuleContentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractInferenceRuleContents_Name() {
		return (EAttribute) abstractInferenceRuleContentsEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractInferenceRuleContents_TimeStamp() {
		return (EAttribute) abstractInferenceRuleContentsEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRFactory getVBRFactory() {
		return (VBRFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		businessObjectEClass = createEClass(BUSINESS_OBJECT);
		createEAttribute(businessObjectEClass, BUSINESS_OBJECT__ID);
		createEAttribute(businessObjectEClass, BUSINESS_OBJECT__BO_NAME);
		createEAttribute(businessObjectEClass, BUSINESS_OBJECT__BO_DESCRIPTION);
		createEReference(businessObjectEClass, BUSINESS_OBJECT__MBUSINESS_VALUE);
		createEReference(businessObjectEClass, BUSINESS_OBJECT__MFROMAL_POLICY);
		createEAttribute(businessObjectEClass, BUSINESS_OBJECT__BOTIME_STAMP);

		businessValueEClass = createEClass(BUSINESS_VALUE);
		createEAttribute(businessValueEClass, BUSINESS_VALUE__ID);
		createEAttribute(businessValueEClass, BUSINESS_VALUE__BV_STATE);
		createEAttribute(businessValueEClass, BUSINESS_VALUE__BV_RISK);
		createEReference(businessValueEClass, BUSINESS_VALUE__MBUSINESS_OBJECT);
		createEReference(businessValueEClass, BUSINESS_VALUE__MINFERENCE_RULE);

		businessActionEClass = createEClass(BUSINESS_ACTION);
		createEAttribute(businessActionEClass, BUSINESS_ACTION__ID);
		createEAttribute(businessActionEClass, BUSINESS_ACTION__BA_DESCRIPTION);
		createEReference(businessActionEClass, BUSINESS_ACTION__MBESIDEBV);

		formalPolicyEClass = createEClass(FORMAL_POLICY);
		createEAttribute(formalPolicyEClass, FORMAL_POLICY__FP_DESCRIPTION);
		createEAttribute(formalPolicyEClass, FORMAL_POLICY__UNIQUE_ID);
		createEReference(formalPolicyEClass, FORMAL_POLICY__MBUSINESS_OBJECT);
		createEReference(formalPolicyEClass, FORMAL_POLICY__MBUSINESS_ACTION);

		inferenceRuleEClass = createEClass(INFERENCE_RULE);
		createEReference(inferenceRuleEClass, INFERENCE_RULE__TRUE_PART);
		createEReference(inferenceRuleEClass, INFERENCE_RULE__FALSE_PART);

		abstractInferenceRuleContentsEClass = createEClass(ABSTRACT_INFERENCE_RULE_CONTENTS);
		createEAttribute(abstractInferenceRuleContentsEClass,
				ABSTRACT_INFERENCE_RULE_CONTENTS__NAME);
		createEAttribute(abstractInferenceRuleContentsEClass,
				ABSTRACT_INFERENCE_RULE_CONTENTS__TIME_STAMP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		VBRVMPackageImpl theVBRVMPackage = (VBRVMPackageImpl) EPackage.Registry.INSTANCE
				.getEPackage(VBRVMPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theVBRVMPackage);

		// Add supertypes to classes
		businessValueEClass.getESuperTypes().add(
				this.getAbstractInferenceRuleContents());
		businessActionEClass.getESuperTypes().add(
				this.getAbstractInferenceRuleContents());

		// Initialize classes and features; add operations and parameters
		initEClass(
				businessObjectEClass,
				BusinessObject.class,
				"BusinessObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getBusinessObject_Id(),
				ecorePackage.getEString(),
				"id", null, 0, 1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getBusinessObject_BoName(),
				ecorePackage.getEString(),
				"boName", null, 0, 1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getBusinessObject_BoDescription(),
				ecorePackage.getEString(),
				"boDescription", null, 0, 1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getBusinessObject_M_BusinessValue(),
				this.getBusinessValue(),
				this.getBusinessValue_M_BusinessObject(),
				"m_BusinessValue", null, 1, -1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getBusinessObject_M_FromalPolicy(),
				this.getFormalPolicy(),
				this.getFormalPolicy_M_BusinessObject(),
				"m_FromalPolicy", null, 1, 1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getBusinessObject_BotimeStamp(),
				ecorePackage.getEDate(),
				"botimeStamp", null, 0, 1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				businessValueEClass,
				BusinessValue.class,
				"BusinessValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getBusinessValue_Id(),
				ecorePackage.getEString(),
				"id", null, 0, 1, BusinessValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getBusinessValue_BvState(),
				ecorePackage.getEString(),
				"bvState", null, 0, 1, BusinessValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getBusinessValue_BvRisk(),
				ecorePackage.getEInt(),
				"bvRisk", null, 0, 1, BusinessValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getBusinessValue_M_BusinessObject(),
				this.getBusinessObject(),
				this.getBusinessObject_M_BusinessValue(),
				"m_BusinessObject", null, 1, 1, BusinessValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getBusinessValue_M_InferenceRule(),
				this.getInferenceRule(),
				null,
				"m_InferenceRule", null, 1, -1, BusinessValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				businessActionEClass,
				BusinessAction.class,
				"BusinessAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getBusinessAction_Id(),
				ecorePackage.getEString(),
				"id", null, 0, 1, BusinessAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getBusinessAction_BaDescription(),
				ecorePackage.getEString(),
				"baDescription", null, 0, 1, BusinessAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getBusinessAction_M_besidebv(),
				this.getBusinessValue(),
				null,
				"m_besidebv", null, 1, -1, BusinessAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				formalPolicyEClass,
				FormalPolicy.class,
				"FormalPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getFormalPolicy_FpDescription(),
				ecorePackage.getEString(),
				"fpDescription", null, 0, 1, FormalPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getFormalPolicy_UniqueId(),
				ecorePackage.getEString(),
				"uniqueId", null, 0, 1, FormalPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getFormalPolicy_M_BusinessObject(),
				this.getBusinessObject(),
				null,
				"m_BusinessObject", null, 1, -1, FormalPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getFormalPolicy_M_BusinessAction(),
				this.getBusinessAction(),
				null,
				"m_BusinessAction", null, 1, -1, FormalPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				inferenceRuleEClass,
				InferenceRule.class,
				"InferenceRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getInferenceRule_TruePart(),
				this.getAbstractInferenceRuleContents(),
				null,
				"TruePart", null, 0, 1, InferenceRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getInferenceRule_FalsePart(),
				this.getAbstractInferenceRuleContents(),
				null,
				"FalsePart", null, 0, 1, InferenceRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				abstractInferenceRuleContentsEClass,
				AbstractInferenceRuleContents.class,
				"AbstractInferenceRuleContents", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getAbstractInferenceRuleContents_Name(),
				ecorePackage.getEString(),
				"name", null, 0, 1, AbstractInferenceRuleContents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getAbstractInferenceRuleContents_TimeStamp(),
				ecorePackage.getEDate(),
				"timeStamp", null, 0, 1, AbstractInferenceRuleContents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //VBRPackageImpl
