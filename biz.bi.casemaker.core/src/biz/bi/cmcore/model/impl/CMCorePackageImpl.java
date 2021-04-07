/**
 * <copyright>
 * </copyright>
 *
 * $Id: CMCorePackageImpl.java,v 1.16 2005/09/20 15:08:08 smoreno Exp $
 */
package biz.bi.cmcore.model.impl;

import model.BusinessRules;
import model.Combination;
import model.Dependency;
import model.Effect;
import model.Element;
import model.EquivalenceClass;
import model.Project;
import model.Structure;
import model.TestCase;
import model.TestObject;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import bi.view.utils.CMMessages;
import biz.bi.cmcore.model.CMCoreFactory;
import biz.bi.cmcore.model.CMCorePackage;
import biz.bi.cmcore.model.CMProxyCombination;
import biz.bi.cmcore.model.CMProxyDependency;
import biz.bi.cmcore.model.CMProxyEffect;
import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.cmcore.model.CMProxyGeneratedObject;
import biz.bi.cmcore.model.CMProxyObject;
import biz.bi.cmcore.model.CMProxyRiskObject;
import biz.bi.cmcore.model.CMProxySTDCombination;
import biz.bi.cmcore.model.CMProxyTestCase;
import biz.bi.cmcore.model.CMProxyTestObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CMCorePackageImpl extends EPackageImpl implements CMCorePackage {
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
	private EClass cmProxyTestObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmProxyElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmProxyObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmProxyEquivalenceClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmProxyEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmProxyDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmProxyCombinationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmProxyRiskObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmProxyTestCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmProxyGeneratedObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmProxySTDCombinationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType elementEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType testObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dependencyEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType equivalenceClassEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType combinationEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType effectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType structureEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType testCaseEDataType = null;

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
	 * @see biz.bi.cmcore.model.CMCorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CMCorePackageImpl() {
		super(eNS_URI, CMCoreFactory.eINSTANCE);
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
	public static CMCorePackage init() {
		if (isInited)
			return (CMCorePackage) EPackage.Registry.INSTANCE
					.getEPackage(CMCorePackage.eNS_URI);

		// Obtain or create and register package
		CMCorePackageImpl theCMCorePackage = (CMCorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI) instanceof CMCorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI)
				: new CMCorePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCMCorePackage.createPackageContents();

		// Initialize created meta-data
		theCMCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCMCorePackage.freeze();

		return theCMCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCMProxyTestObject() {
		return cmProxyTestObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCMProxyTestObject_M_TestObject() {
		return (EAttribute) cmProxyTestObjectEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMProxyTestObject_ProxyElement() {
		return (EReference) cmProxyTestObjectEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMProxyTestObject_ProxyDependency() {
		return (EReference) cmProxyTestObjectEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMProxyTestObject_ProxyEffect() {
		return (EReference) cmProxyTestObjectEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCMProxyTestObject_M_path() {
		return (EAttribute) cmProxyTestObjectEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMProxyTestObject_ProxySTDCombination() {
		return (EReference) cmProxyTestObjectEClass.getEStructuralFeatures()
				.get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMProxyTestObject_ProxyTestCase() {
		return (EReference) cmProxyTestObjectEClass.getEStructuralFeatures()
				.get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCMProxyElement() {
		return cmProxyElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCMProxyElement_M_Element() {
		return (EAttribute) cmProxyElementEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMProxyElement_ProxyTestObject() {
		return (EReference) cmProxyElementEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMProxyElement_ProxyEquivalenceClass() {
		return (EReference) cmProxyElementEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCMProxyElement_UniqueId() {
		return (EAttribute) cmProxyElementEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCMProxyObject() {
		return cmProxyObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCMProxyEquivalenceClass() {
		return cmProxyEquivalenceClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCMProxyEquivalenceClass_M_EquivalenceClass() {
		return (EAttribute) cmProxyEquivalenceClassEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMProxyEquivalenceClass_ProxyElement() {
		return (EReference) cmProxyEquivalenceClassEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMProxyEquivalenceClass_ProxyEffect() {
		return (EReference) cmProxyEquivalenceClassEClass
				.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCMProxyEquivalenceClass_UniqueId() {
		return (EAttribute) cmProxyEquivalenceClassEClass
				.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCMProxyEffect() {
		return cmProxyEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCMProxyEffect_M_Effect() {
		return (EAttribute) cmProxyEffectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMProxyEffect_ProxyEquivalenceClass() {
		return (EReference) cmProxyEffectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMProxyEffect_ProxyTestObject() {
		return (EReference) cmProxyEffectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCMProxyEffect_UniqueId() {
		return (EAttribute) cmProxyEffectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMProxyEffect_ProxyCombination() {
		return (EReference) cmProxyEffectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCMProxyDependency() {
		return cmProxyDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCMProxyDependency_M_Dependency() {
		return (EAttribute) cmProxyDependencyEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMProxyDependency_ProxyElement() {
		return (EReference) cmProxyDependencyEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMProxyDependency_ProxyCombination() {
		return (EReference) cmProxyDependencyEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMProxyDependency_ProxyTestObject() {
		return (EReference) cmProxyDependencyEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCMProxyDependency_UniqueId() {
		return (EAttribute) cmProxyDependencyEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMProxyDependency_ProxyEquivalenceClass() {
		return (EReference) cmProxyDependencyEClass.getEStructuralFeatures()
				.get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCMProxyCombination() {
		return cmProxyCombinationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCMProxyCombination_M_Combination() {
		return (EAttribute) cmProxyCombinationEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMProxyCombination_ProxyDependency() {
		return (EReference) cmProxyCombinationEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMProxyCombination_ProxyEquivalenceClass() {
		return (EReference) cmProxyCombinationEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMProxyCombination_ProxyEffect() {
		return (EReference) cmProxyCombinationEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCMProxyCombination_UniqueId() {
		return (EAttribute) cmProxyCombinationEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCMProxyRiskObject() {
		return cmProxyRiskObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCMProxyTestCase() {
		return cmProxyTestCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCMProxyTestCase_UniqueId() {
		return (EAttribute) cmProxyTestCaseEClass.getEStructuralFeatures().get(
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCMProxyTestCase_M_TestCase() {
		return (EAttribute) cmProxyTestCaseEClass.getEStructuralFeatures().get(
				1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMProxyTestCase_ProxyTestObject() {
		return (EReference) cmProxyTestCaseEClass.getEStructuralFeatures().get(
				2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMProxyTestCase_ProxyCombination() {
		return (EReference) cmProxyTestCaseEClass.getEStructuralFeatures().get(
				3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMProxyTestCase_ProxyEquivalenceClass() {
		return (EReference) cmProxyTestCaseEClass.getEStructuralFeatures().get(
				4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCMProxyGeneratedObject() {
		return cmProxyGeneratedObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCMProxySTDCombination() {
		return cmProxySTDCombinationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMProxySTDCombination_ProxyTestObject() {
		return (EReference) cmProxySTDCombinationEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getElement() {
		return elementEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTestObject() {
		return testObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDependency() {
		return dependencyEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEquivalenceClass() {
		return equivalenceClassEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCombination() {
		return combinationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEffect() {
		return effectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStructure() {
		return structureEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTestCase() {
		return testCaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMCoreFactory getCMCoreFactory() {
		return (CMCoreFactory) getEFactoryInstance();
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
		cmProxyTestObjectEClass = createEClass(CM_PROXY_TEST_OBJECT);
		createEAttribute(cmProxyTestObjectEClass,
				CM_PROXY_TEST_OBJECT__MTEST_OBJECT);
		createEReference(cmProxyTestObjectEClass,
				CM_PROXY_TEST_OBJECT__PROXY_ELEMENT);
		createEReference(cmProxyTestObjectEClass,
				CM_PROXY_TEST_OBJECT__PROXY_DEPENDENCY);
		createEReference(cmProxyTestObjectEClass,
				CM_PROXY_TEST_OBJECT__PROXY_EFFECT);
		createEAttribute(cmProxyTestObjectEClass, CM_PROXY_TEST_OBJECT__MPATH);
		createEReference(cmProxyTestObjectEClass,
				CM_PROXY_TEST_OBJECT__PROXY_STD_COMBINATION);
		createEReference(cmProxyTestObjectEClass,
				CM_PROXY_TEST_OBJECT__PROXY_TEST_CASE);

		cmProxyElementEClass = createEClass(CM_PROXY_ELEMENT);
		createEAttribute(cmProxyElementEClass, CM_PROXY_ELEMENT__MELEMENT);
		createEReference(cmProxyElementEClass,
				CM_PROXY_ELEMENT__PROXY_TEST_OBJECT);
		createEReference(cmProxyElementEClass,
				CM_PROXY_ELEMENT__PROXY_EQUIVALENCE_CLASS);
		createEAttribute(cmProxyElementEClass, CM_PROXY_ELEMENT__UNIQUE_ID);

		cmProxyObjectEClass = createEClass(CM_PROXY_OBJECT);

		cmProxyEquivalenceClassEClass = createEClass(CM_PROXY_EQUIVALENCE_CLASS);
		createEAttribute(cmProxyEquivalenceClassEClass,
				CM_PROXY_EQUIVALENCE_CLASS__MEQUIVALENCE_CLASS);
		createEReference(cmProxyEquivalenceClassEClass,
				CM_PROXY_EQUIVALENCE_CLASS__PROXY_ELEMENT);
		createEReference(cmProxyEquivalenceClassEClass,
				CM_PROXY_EQUIVALENCE_CLASS__PROXY_EFFECT);
		createEAttribute(cmProxyEquivalenceClassEClass,
				CM_PROXY_EQUIVALENCE_CLASS__UNIQUE_ID);

		cmProxyEffectEClass = createEClass(CM_PROXY_EFFECT);
		createEAttribute(cmProxyEffectEClass, CM_PROXY_EFFECT__MEFFECT);
		createEReference(cmProxyEffectEClass,
				CM_PROXY_EFFECT__PROXY_EQUIVALENCE_CLASS);
		createEReference(cmProxyEffectEClass,
				CM_PROXY_EFFECT__PROXY_TEST_OBJECT);
		createEAttribute(cmProxyEffectEClass, CM_PROXY_EFFECT__UNIQUE_ID);
		createEReference(cmProxyEffectEClass,
				CM_PROXY_EFFECT__PROXY_COMBINATION);

		cmProxyDependencyEClass = createEClass(CM_PROXY_DEPENDENCY);
		createEAttribute(cmProxyDependencyEClass,
				CM_PROXY_DEPENDENCY__MDEPENDENCY);
		createEReference(cmProxyDependencyEClass,
				CM_PROXY_DEPENDENCY__PROXY_ELEMENT);
		createEReference(cmProxyDependencyEClass,
				CM_PROXY_DEPENDENCY__PROXY_COMBINATION);
		createEReference(cmProxyDependencyEClass,
				CM_PROXY_DEPENDENCY__PROXY_TEST_OBJECT);
		createEAttribute(cmProxyDependencyEClass,
				CM_PROXY_DEPENDENCY__UNIQUE_ID);
		createEReference(cmProxyDependencyEClass,
				CM_PROXY_DEPENDENCY__PROXY_EQUIVALENCE_CLASS);

		cmProxyCombinationEClass = createEClass(CM_PROXY_COMBINATION);
		createEAttribute(cmProxyCombinationEClass,
				CM_PROXY_COMBINATION__MCOMBINATION);
		createEReference(cmProxyCombinationEClass,
				CM_PROXY_COMBINATION__PROXY_DEPENDENCY);
		createEReference(cmProxyCombinationEClass,
				CM_PROXY_COMBINATION__PROXY_EQUIVALENCE_CLASS);
		createEReference(cmProxyCombinationEClass,
				CM_PROXY_COMBINATION__PROXY_EFFECT);
		createEAttribute(cmProxyCombinationEClass,
				CM_PROXY_COMBINATION__UNIQUE_ID);

		cmProxyRiskObjectEClass = createEClass(CM_PROXY_RISK_OBJECT);

		cmProxyTestCaseEClass = createEClass(CM_PROXY_TEST_CASE);
		createEAttribute(cmProxyTestCaseEClass, CM_PROXY_TEST_CASE__UNIQUE_ID);
		createEAttribute(cmProxyTestCaseEClass, CM_PROXY_TEST_CASE__MTEST_CASE);
		createEReference(cmProxyTestCaseEClass,
				CM_PROXY_TEST_CASE__PROXY_TEST_OBJECT);
		createEReference(cmProxyTestCaseEClass,
				CM_PROXY_TEST_CASE__PROXY_COMBINATION);
		createEReference(cmProxyTestCaseEClass,
				CM_PROXY_TEST_CASE__PROXY_EQUIVALENCE_CLASS);

		cmProxyGeneratedObjectEClass = createEClass(CM_PROXY_GENERATED_OBJECT);

		cmProxySTDCombinationEClass = createEClass(CM_PROXY_STD_COMBINATION);
		createEReference(cmProxySTDCombinationEClass,
				CM_PROXY_STD_COMBINATION__PROXY_TEST_OBJECT);

		// Create data types
		elementEDataType = createEDataType(ELEMENT);
		testObjectEDataType = createEDataType(TEST_OBJECT);
		dependencyEDataType = createEDataType(DEPENDENCY);
		equivalenceClassEDataType = createEDataType(EQUIVALENCE_CLASS);
		combinationEDataType = createEDataType(COMBINATION);
		effectEDataType = createEDataType(EFFECT);
		structureEDataType = createEDataType(STRUCTURE);
		testCaseEDataType = createEDataType(TEST_CASE);
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

		// Add supertypes to classes
		cmProxyTestObjectEClass.getESuperTypes().add(this.getCMProxyObject());
		cmProxyElementEClass.getESuperTypes().add(this.getCMProxyObject());
		cmProxyEquivalenceClassEClass.getESuperTypes().add(
				this.getCMProxyObject());
		cmProxyEquivalenceClassEClass.getESuperTypes().add(
				this.getCMProxyRiskObject());
		cmProxyEffectEClass.getESuperTypes().add(this.getCMProxyObject());
		cmProxyDependencyEClass.getESuperTypes().add(this.getCMProxyObject());
		cmProxyCombinationEClass.getESuperTypes().add(this.getCMProxyObject());
		cmProxyCombinationEClass.getESuperTypes().add(
				this.getCMProxyRiskObject());
		cmProxyCombinationEClass.getESuperTypes().add(
				this.getCMProxyGeneratedObject());
		cmProxyTestCaseEClass.getESuperTypes().add(this.getCMProxyObject());
		cmProxyTestCaseEClass.getESuperTypes().add(this.getCMProxyRiskObject());
		cmProxyTestCaseEClass.getESuperTypes().add(
				this.getCMProxyGeneratedObject());
		cmProxySTDCombinationEClass.getESuperTypes().add(
				this.getCMProxyCombination());

		// Initialize classes and features; add operations and parameters
		initEClass(
				cmProxyTestObjectEClass,
				CMProxyTestObject.class,
				"CMProxyTestObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getCMProxyTestObject_M_TestObject(),
				this.getTestObject(),
				"m_TestObject", null, 1, 1, CMProxyTestObject.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getCMProxyTestObject_ProxyElement(),
				this.getCMProxyElement(),
				this.getCMProxyElement_ProxyTestObject(),
				"proxyElement", null, 0, -1, CMProxyTestObject.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getCMProxyTestObject_ProxyDependency(),
				this.getCMProxyDependency(),
				this.getCMProxyDependency_ProxyTestObject(),
				"proxyDependency", null, 0, -1, CMProxyTestObject.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getCMProxyTestObject_ProxyEffect(),
				this.getCMProxyEffect(),
				this.getCMProxyEffect_ProxyTestObject(),
				"proxyEffect", null, 0, -1, CMProxyTestObject.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getCMProxyTestObject_M_path(),
				ecorePackage.getEString(),
				"m_path", null, 0, 1, CMProxyTestObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getCMProxyTestObject_ProxySTDCombination(),
				this.getCMProxySTDCombination(),
				this.getCMProxySTDCombination_ProxyTestObject(),
				"proxySTDCombination", null, 0, -1, CMProxyTestObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getCMProxyTestObject_ProxyTestCase(),
				this.getCMProxyTestCase(),
				this.getCMProxyTestCase_ProxyTestObject(),
				"proxyTestCase", null, 0, -1, CMProxyTestObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(cmProxyTestObjectEClass, this.getStructure(),
				"getStructure"); //$NON-NLS-1$

		addEOperation(cmProxyTestObjectEClass, ecorePackage.getEString(),
				"getState"); //$NON-NLS-1$

		addEOperation(cmProxyTestObjectEClass, ecorePackage.getEString(),
				"getUser"); //$NON-NLS-1$

		initEClass(
				cmProxyElementEClass,
				CMProxyElement.class,
				"CMProxyElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getCMProxyElement_M_Element(),
				this.getElement(),
				"m_Element", null, 1, 1, CMProxyElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getCMProxyElement_ProxyTestObject(),
				this.getCMProxyTestObject(),
				this.getCMProxyTestObject_ProxyElement(),
				"proxyTestObject", null, 1, 1, CMProxyElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getCMProxyElement_ProxyEquivalenceClass(),
				this.getCMProxyEquivalenceClass(),
				this.getCMProxyEquivalenceClass_ProxyElement(),
				"proxyEquivalenceClass", null, 0, -1, CMProxyElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getCMProxyElement_UniqueId(),
				ecorePackage.getEString(),
				"uniqueId", null, 0, 1, CMProxyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				cmProxyObjectEClass,
				CMProxyObject.class,
				"CMProxyObject", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		addEOperation(cmProxyObjectEClass, ecorePackage.getEString(), "getId"); //$NON-NLS-1$

		addEOperation(cmProxyObjectEClass, ecorePackage.getEString(), "getName"); //$NON-NLS-1$

		addEOperation(cmProxyObjectEClass, ecorePackage.getEString(),
				"getDescription"); //$NON-NLS-1$

		addEOperation(cmProxyObjectEClass, ecorePackage.getEBoolean(),
				"isProxyModelSet"); //$NON-NLS-1$

		EOperation op = addEOperation(cmProxyObjectEClass, null,
				"setDescription"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "p_Description"); //$NON-NLS-1$

		op = addEOperation(cmProxyObjectEClass, null, "setName"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "p_Name"); //$NON-NLS-1$

		addEOperation(cmProxyObjectEClass, ecorePackage.getEJavaObject(),
				"getCMModel"); //$NON-NLS-1$

		op = addEOperation(cmProxyObjectEClass, null, "setCMModel"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEJavaObject(), "model"); //$NON-NLS-1$

		addEOperation(cmProxyObjectEClass, ecorePackage.getEDate(),
				"getTimeStamp"); //$NON-NLS-1$

		op = addEOperation(cmProxyObjectEClass, null, "setTimeStamp"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDate(), "p_TimeStamp"); //$NON-NLS-1$

		initEClass(
				cmProxyEquivalenceClassEClass,
				CMProxyEquivalenceClass.class,
				"CMProxyEquivalenceClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getCMProxyEquivalenceClass_M_EquivalenceClass(),
				this.getEquivalenceClass(),
				"m_EquivalenceClass", null, 1, 1, CMProxyEquivalenceClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getCMProxyEquivalenceClass_ProxyElement(),
				this.getCMProxyElement(),
				this.getCMProxyElement_ProxyEquivalenceClass(),
				"proxyElement", null, 1, 1, CMProxyEquivalenceClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getCMProxyEquivalenceClass_ProxyEffect(),
				this.getCMProxyEffect(),
				this.getCMProxyEffect_ProxyEquivalenceClass(),
				"proxyEffect", null, 0, -1, CMProxyEquivalenceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getCMProxyEquivalenceClass_UniqueId(),
				ecorePackage.getEString(),
				"uniqueId", null, 0, 1, CMProxyEquivalenceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(cmProxyEquivalenceClassEClass, ecorePackage.getEString(),
				"getStateName"); //$NON-NLS-1$

		addEOperation(cmProxyEquivalenceClassEClass, ecorePackage.getEString(),
				"getValue"); //$NON-NLS-1$

		op = addEOperation(cmProxyEquivalenceClassEClass, null, "setValue"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "p_Value"); //$NON-NLS-1$

		initEClass(
				cmProxyEffectEClass,
				CMProxyEffect.class,
				"CMProxyEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getCMProxyEffect_M_Effect(),
				this.getEffect(),
				"m_Effect", null, 1, 1, CMProxyEffect.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getCMProxyEffect_ProxyEquivalenceClass(),
				this.getCMProxyEquivalenceClass(),
				this.getCMProxyEquivalenceClass_ProxyEffect(),
				"proxyEquivalenceClass", null, 0, -1, CMProxyEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getCMProxyEffect_ProxyTestObject(),
				this.getCMProxyTestObject(),
				this.getCMProxyTestObject_ProxyEffect(),
				"proxyTestObject", null, 1, 1, CMProxyEffect.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getCMProxyEffect_UniqueId(),
				ecorePackage.getEString(),
				"uniqueId", null, 0, 1, CMProxyEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getCMProxyEffect_ProxyCombination(),
				this.getCMProxyCombination(),
				this.getCMProxyCombination_ProxyEffect(),
				"proxyCombination", null, 0, -1, CMProxyEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(cmProxyEffectEClass, ecorePackage.getEBoolean(), "isUsed"); //$NON-NLS-1$

		initEClass(
				cmProxyDependencyEClass,
				CMProxyDependency.class,
				"CMProxyDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getCMProxyDependency_M_Dependency(),
				this.getDependency(),
				"m_Dependency", null, 1, 1, CMProxyDependency.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getCMProxyDependency_ProxyElement(),
				this.getCMProxyElement(),
				null,
				"proxyElement", null, 0, -1, CMProxyDependency.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getCMProxyDependency_ProxyCombination(),
				this.getCMProxyCombination(),
				this.getCMProxyCombination_ProxyDependency(),
				"proxyCombination", null, 0, -1, CMProxyDependency.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getCMProxyDependency_ProxyTestObject(),
				this.getCMProxyTestObject(),
				this.getCMProxyTestObject_ProxyDependency(),
				"proxyTestObject", null, 1, 1, CMProxyDependency.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getCMProxyDependency_UniqueId(),
				ecorePackage.getEString(),
				"uniqueId", null, 0, 1, CMProxyDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getCMProxyDependency_ProxyEquivalenceClass(),
				this.getCMProxyEquivalenceClass(),
				null,
				"proxyEquivalenceClass", null, 0, -1, CMProxyDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(cmProxyDependencyEClass, ecorePackage.getEString(),
				"getLabel"); //$NON-NLS-1$

		op = addEOperation(cmProxyDependencyEClass, null, "setLabel"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "p_Label"); //$NON-NLS-1$

		initEClass(
				cmProxyCombinationEClass,
				CMProxyCombination.class,
				"CMProxyCombination", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getCMProxyCombination_M_Combination(),
				this.getCombination(),
				"m_Combination", null, 1, 1, CMProxyCombination.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getCMProxyCombination_ProxyDependency(),
				this.getCMProxyDependency(),
				this.getCMProxyDependency_ProxyCombination(),
				"proxyDependency", null, 1, 1, CMProxyCombination.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getCMProxyCombination_ProxyEquivalenceClass(),
				this.getCMProxyEquivalenceClass(),
				null,
				"proxyEquivalenceClass", null, 0, -1, CMProxyCombination.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getCMProxyCombination_ProxyEffect(),
				this.getCMProxyEffect(),
				this.getCMProxyEffect_ProxyCombination(),
				"proxyEffect", null, 0, -1, CMProxyCombination.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getCMProxyCombination_UniqueId(),
				ecorePackage.getEString(),
				"uniqueId", null, 0, 1, CMProxyCombination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				cmProxyRiskObjectEClass,
				CMProxyRiskObject.class,
				"CMProxyRiskObject", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		addEOperation(cmProxyRiskObjectEClass, ecorePackage.getEInt(),
				"getRiskLevel"); //$NON-NLS-1$

		op = addEOperation(cmProxyRiskObjectEClass, null, "setRiskLevel"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEInt(), "P_RiskLevel"); //$NON-NLS-1$

		addEOperation(cmProxyRiskObjectEClass, ecorePackage.getEInt(),
				"getState"); //$NON-NLS-1$

		op = addEOperation(cmProxyRiskObjectEClass, null, "setState"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEInt(), "p_State"); //$NON-NLS-1$

		initEClass(
				cmProxyTestCaseEClass,
				CMProxyTestCase.class,
				"CMProxyTestCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getCMProxyTestCase_UniqueId(),
				ecorePackage.getEString(),
				"uniqueId", null, 0, 1, CMProxyTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getCMProxyTestCase_M_TestCase(),
				this.getTestCase(),
				"m_TestCase", null, 0, 1, CMProxyTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getCMProxyTestCase_ProxyTestObject(),
				this.getCMProxyTestObject(),
				this.getCMProxyTestObject_ProxyTestCase(),
				"proxyTestObject", null, 0, 1, CMProxyTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getCMProxyTestCase_ProxyCombination(),
				this.getCMProxyCombination(),
				null,
				"proxyCombination", null, 0, -1, CMProxyTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getCMProxyTestCase_ProxyEquivalenceClass(),
				this.getCMProxyEquivalenceClass(),
				null,
				"proxyEquivalenceClass", null, 0, -1, CMProxyTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				cmProxyGeneratedObjectEClass,
				CMProxyGeneratedObject.class,
				"CMProxyGeneratedObject", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		addEOperation(cmProxyGeneratedObjectEClass, ecorePackage.getEString(),
				"getOriginType"); //$NON-NLS-1$

		op = addEOperation(cmProxyGeneratedObjectEClass, null, "setOriginType"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "p_OriginType"); //$NON-NLS-1$

		initEClass(
				cmProxySTDCombinationEClass,
				CMProxySTDCombination.class,
				"CMProxySTDCombination", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getCMProxySTDCombination_ProxyTestObject(),
				this.getCMProxyTestObject(),
				this.getCMProxyTestObject_ProxySTDCombination(),
				"proxyTestObject", null, 0, 1, CMProxySTDCombination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Initialize data types
		initEDataType(elementEDataType, Element.class,
				"Element", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(testObjectEDataType, TestObject.class,
				"TestObject", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(dependencyEDataType, Dependency.class,
				"Dependency", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(
				equivalenceClassEDataType,
				EquivalenceClass.class,
				"EquivalenceClass", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(combinationEDataType, Combination.class,
				"Combination", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(effectEDataType, Effect.class,
				"Effect", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(structureEDataType, Structure.class,
				"Structure", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(testCaseEDataType, TestCase.class,
				"TestCase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.CMCorePackage#getEquivalenceClassState()
	 */
	public String[] getEquivalenceClassState() {
		String positive = BusinessRules.STATE_POSITIVE_LABEL;
		String negative = BusinessRules.STATE_NEGATIVE_LABEL;
		String faulty = CMMessages.getString("STATE_FAULTY_LABEL");
		String irrelevant = CMMessages.getString("STATE_IRRELEVANT_LABEL");
		String[] states = { positive, negative, faulty, irrelevant };
		return states;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.CMCorePackage#getEquivalenceClassStateIntValue()
	 */
	public int[] getEquivalenceClassStateIntValue() {
		int positive = BusinessRules.STATE_POSITIVE;
		int negative = BusinessRules.STATE_NEGATIVE;
		int faulty = BusinessRules.STATE_FAULTY;
		int irrelevant = BusinessRules.STATE_IRRELEVANT;
		int[] states = { positive, negative, faulty, irrelevant };

		return states;
	}

} //CMCorePackageImpl
