/**
 * <copyright>
 * </copyright>
 *
 * $Id: CMCorePackage.java,v 1.13 2005/09/20 15:08:08 smoreno Exp $
 */
package biz.bi.cmcore.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see biz.bi.cmcore.model.CMCoreFactory
 * @model kind="package"
 * @generated
 */
public interface CMCorePackage extends EPackage {

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
	String eNAME = "cmcore"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://biz.bi.cmcore"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CMKR"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CMCorePackage eINSTANCE = biz.bi.cmcore.model.impl.CMCorePackageImpl.init();

	/**
	 * The meta object id for the '{@link biz.bi.cmcore.model.CMProxyObject <em>CM Proxy Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.cmcore.model.CMProxyObject
	 * @see biz.bi.cmcore.model.impl.CMCorePackageImpl#getCMProxyObject()
	 * @generated
	 */
	int CM_PROXY_OBJECT = 2;

	/**
	 * The number of structural features of the the '<em>CM Proxy Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_OBJECT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link biz.bi.cmcore.model.impl.CMProxyTestObjectImpl <em>CM Proxy Test Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.cmcore.model.impl.CMProxyTestObjectImpl
	 * @see biz.bi.cmcore.model.impl.CMCorePackageImpl#getCMProxyTestObject()
	 * @generated
	 */
	int CM_PROXY_TEST_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>MTest Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_TEST_OBJECT__MTEST_OBJECT = CM_PROXY_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Proxy Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_TEST_OBJECT__PROXY_ELEMENT = CM_PROXY_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Proxy Dependency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_TEST_OBJECT__PROXY_DEPENDENCY = CM_PROXY_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Proxy Effect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_TEST_OBJECT__PROXY_EFFECT = CM_PROXY_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_TEST_OBJECT__MPATH = CM_PROXY_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Proxy STD Combination</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_TEST_OBJECT__PROXY_STD_COMBINATION = CM_PROXY_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Proxy Test Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_TEST_OBJECT__PROXY_TEST_CASE = CM_PROXY_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the the '<em>CM Proxy Test Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_TEST_OBJECT_FEATURE_COUNT = CM_PROXY_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link biz.bi.cmcore.model.impl.CMProxyElementImpl <em>CM Proxy Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.cmcore.model.impl.CMProxyElementImpl
	 * @see biz.bi.cmcore.model.impl.CMCorePackageImpl#getCMProxyElement()
	 * @generated
	 */
	int CM_PROXY_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>MElement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_ELEMENT__MELEMENT = CM_PROXY_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Proxy Test Object</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_ELEMENT__PROXY_TEST_OBJECT = CM_PROXY_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Proxy Equivalence Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_ELEMENT__PROXY_EQUIVALENCE_CLASS = CM_PROXY_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_ELEMENT__UNIQUE_ID = CM_PROXY_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the the '<em>CM Proxy Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_ELEMENT_FEATURE_COUNT = CM_PROXY_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link biz.bi.cmcore.model.impl.CMProxyEquivalenceClassImpl <em>CM Proxy Equivalence Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.cmcore.model.impl.CMProxyEquivalenceClassImpl
	 * @see biz.bi.cmcore.model.impl.CMCorePackageImpl#getCMProxyEquivalenceClass()
	 * @generated
	 */
	int CM_PROXY_EQUIVALENCE_CLASS = 3;

	/**
	 * The feature id for the '<em><b>MEquivalence Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_EQUIVALENCE_CLASS__MEQUIVALENCE_CLASS = CM_PROXY_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Proxy Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_EQUIVALENCE_CLASS__PROXY_ELEMENT = CM_PROXY_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Proxy Effect</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_EQUIVALENCE_CLASS__PROXY_EFFECT = CM_PROXY_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_EQUIVALENCE_CLASS__UNIQUE_ID = CM_PROXY_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the the '<em>CM Proxy Equivalence Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_EQUIVALENCE_CLASS_FEATURE_COUNT = CM_PROXY_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link biz.bi.cmcore.model.impl.CMProxyEffectImpl <em>CM Proxy Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.cmcore.model.impl.CMProxyEffectImpl
	 * @see biz.bi.cmcore.model.impl.CMCorePackageImpl#getCMProxyEffect()
	 * @generated
	 */
	int CM_PROXY_EFFECT = 4;

	/**
	 * The feature id for the '<em><b>MEffect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_EFFECT__MEFFECT = CM_PROXY_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Proxy Equivalence Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_EFFECT__PROXY_EQUIVALENCE_CLASS = CM_PROXY_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Proxy Test Object</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_EFFECT__PROXY_TEST_OBJECT = CM_PROXY_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_EFFECT__UNIQUE_ID = CM_PROXY_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Proxy Combination</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_EFFECT__PROXY_COMBINATION = CM_PROXY_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the the '<em>CM Proxy Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_EFFECT_FEATURE_COUNT = CM_PROXY_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link biz.bi.cmcore.model.impl.CMProxyDependencyImpl <em>CM Proxy Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.cmcore.model.impl.CMProxyDependencyImpl
	 * @see biz.bi.cmcore.model.impl.CMCorePackageImpl#getCMProxyDependency()
	 * @generated
	 */
	int CM_PROXY_DEPENDENCY = 5;

	/**
	 * The feature id for the '<em><b>MDependency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_DEPENDENCY__MDEPENDENCY = CM_PROXY_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Proxy Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_DEPENDENCY__PROXY_ELEMENT = CM_PROXY_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Proxy Combination</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_DEPENDENCY__PROXY_COMBINATION = CM_PROXY_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Proxy Test Object</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_DEPENDENCY__PROXY_TEST_OBJECT = CM_PROXY_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_DEPENDENCY__UNIQUE_ID = CM_PROXY_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Proxy Equivalence Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_DEPENDENCY__PROXY_EQUIVALENCE_CLASS = CM_PROXY_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the the '<em>CM Proxy Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_DEPENDENCY_FEATURE_COUNT = CM_PROXY_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link biz.bi.cmcore.model.impl.CMProxyCombinationImpl <em>CM Proxy Combination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.cmcore.model.impl.CMProxyCombinationImpl
	 * @see biz.bi.cmcore.model.impl.CMCorePackageImpl#getCMProxyCombination()
	 * @generated
	 */
	int CM_PROXY_COMBINATION = 6;

	/**
	 * The feature id for the '<em><b>MCombination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_COMBINATION__MCOMBINATION = CM_PROXY_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Proxy Dependency</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_COMBINATION__PROXY_DEPENDENCY = CM_PROXY_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Proxy Equivalence Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_COMBINATION__PROXY_EQUIVALENCE_CLASS = CM_PROXY_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Proxy Effect</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_COMBINATION__PROXY_EFFECT = CM_PROXY_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_COMBINATION__UNIQUE_ID = CM_PROXY_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the the '<em>CM Proxy Combination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_COMBINATION_FEATURE_COUNT = CM_PROXY_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link biz.bi.cmcore.model.CMProxyRiskObject <em>CM Proxy Risk Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.cmcore.model.CMProxyRiskObject
	 * @see biz.bi.cmcore.model.impl.CMCorePackageImpl#getCMProxyRiskObject()
	 * @generated
	 */
	int CM_PROXY_RISK_OBJECT = 7;

	/**
	 * The number of structural features of the the '<em>CM Proxy Risk Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_RISK_OBJECT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link biz.bi.cmcore.model.impl.CMProxyTestCaseImpl <em>CM Proxy Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.cmcore.model.impl.CMProxyTestCaseImpl
	 * @see biz.bi.cmcore.model.impl.CMCorePackageImpl#getCMProxyTestCase()
	 * @generated
	 */
	int CM_PROXY_TEST_CASE = 8;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_TEST_CASE__UNIQUE_ID = CM_PROXY_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MTest Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_TEST_CASE__MTEST_CASE = CM_PROXY_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Proxy Test Object</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_TEST_CASE__PROXY_TEST_OBJECT = CM_PROXY_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Proxy Combination</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_TEST_CASE__PROXY_COMBINATION = CM_PROXY_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Proxy Equivalence Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_TEST_CASE__PROXY_EQUIVALENCE_CLASS = CM_PROXY_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the the '<em>CM Proxy Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_TEST_CASE_FEATURE_COUNT = CM_PROXY_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link biz.bi.cmcore.model.CMProxyGeneratedObject <em>CM Proxy Generated Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.cmcore.model.CMProxyGeneratedObject
	 * @see biz.bi.cmcore.model.impl.CMCorePackageImpl#getCMProxyGeneratedObject()
	 * @generated
	 */
	int CM_PROXY_GENERATED_OBJECT = 9;

	/**
	 * The number of structural features of the the '<em>CM Proxy Generated Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_GENERATED_OBJECT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link biz.bi.cmcore.model.impl.CMProxySTDCombinationImpl <em>CM Proxy STD Combination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.cmcore.model.impl.CMProxySTDCombinationImpl
	 * @see biz.bi.cmcore.model.impl.CMCorePackageImpl#getCMProxySTDCombination()
	 * @generated
	 */
	int CM_PROXY_STD_COMBINATION = 10;

	/**
	 * The feature id for the '<em><b>MCombination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_STD_COMBINATION__MCOMBINATION = CM_PROXY_COMBINATION__MCOMBINATION;

	/**
	 * The feature id for the '<em><b>Proxy Dependency</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_STD_COMBINATION__PROXY_DEPENDENCY = CM_PROXY_COMBINATION__PROXY_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Proxy Equivalence Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_STD_COMBINATION__PROXY_EQUIVALENCE_CLASS = CM_PROXY_COMBINATION__PROXY_EQUIVALENCE_CLASS;

	/**
	 * The feature id for the '<em><b>Proxy Effect</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_STD_COMBINATION__PROXY_EFFECT = CM_PROXY_COMBINATION__PROXY_EFFECT;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_STD_COMBINATION__UNIQUE_ID = CM_PROXY_COMBINATION__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Proxy Test Object</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_STD_COMBINATION__PROXY_TEST_OBJECT = CM_PROXY_COMBINATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>CM Proxy STD Combination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PROXY_STD_COMBINATION_FEATURE_COUNT = CM_PROXY_COMBINATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '<em>Element</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.Element
	 * @see biz.bi.cmcore.model.impl.CMCorePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 11;

	/**
	 * The meta object id for the '<em>Test Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.TestObject
	 * @see biz.bi.cmcore.model.impl.CMCorePackageImpl#getTestObject()
	 * @generated
	 */
	int TEST_OBJECT = 12;

	/**
	 * The meta object id for the '<em>Dependency</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.Dependency
	 * @see biz.bi.cmcore.model.impl.CMCorePackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 13;

	/**
	 * The meta object id for the '<em>Equivalence Class</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.EquivalenceClass
	 * @see biz.bi.cmcore.model.impl.CMCorePackageImpl#getEquivalenceClass()
	 * @generated
	 */
	int EQUIVALENCE_CLASS = 14;

	/**
	 * The meta object id for the '<em>Combination</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.Combination
	 * @see biz.bi.cmcore.model.impl.CMCorePackageImpl#getCombination()
	 * @generated
	 */
	int COMBINATION = 15;

	/**
	 * The meta object id for the '<em>Effect</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.Effect
	 * @see biz.bi.cmcore.model.impl.CMCorePackageImpl#getEffect()
	 * @generated
	 */
	int EFFECT = 16;

	/**
	 * The meta object id for the '<em>Structure</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.Structure
	 * @see biz.bi.cmcore.model.impl.CMCorePackageImpl#getStructure()
	 * @generated
	 */
	int STRUCTURE = 17;

	/**
	 * The meta object id for the '<em>Test Case</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.TestCase
	 * @see biz.bi.cmcore.model.impl.CMCorePackageImpl#getTestCase()
	 * @generated
	 */
	int TEST_CASE = 18;

	int CMPROXYELEMENT_NAME = 100;

	int CMPROXYELEMENT_DESCRIPTION = 101;

	int CMPROXYEQUIVALENCECLASS_VALUE = 102;

	/**
	 * Returns the meta object for class '{@link biz.bi.cmcore.model.CMProxyTestObject <em>CM Proxy Test Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CM Proxy Test Object</em>'.
	 * @see biz.bi.cmcore.model.CMProxyTestObject
	 * @generated
	 */
	EClass getCMProxyTestObject();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.cmcore.model.CMProxyTestObject#getM_TestObject <em>MTest Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MTest Object</em>'.
	 * @see biz.bi.cmcore.model.CMProxyTestObject#getM_TestObject()
	 * @see #getCMProxyTestObject()
	 * @generated
	 */
	EAttribute getCMProxyTestObject_M_TestObject();

	/**
	 * Returns the meta object for the containment reference list '{@link biz.bi.cmcore.model.CMProxyTestObject#getProxyElement <em>Proxy Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Proxy Element</em>'.
	 * @see biz.bi.cmcore.model.CMProxyTestObject#getProxyElement()
	 * @see #getCMProxyTestObject()
	 * @generated
	 */
	EReference getCMProxyTestObject_ProxyElement();

	/**
	 * Returns the meta object for the containment reference list '{@link biz.bi.cmcore.model.CMProxyTestObject#getProxyDependency <em>Proxy Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Proxy Dependency</em>'.
	 * @see biz.bi.cmcore.model.CMProxyTestObject#getProxyDependency()
	 * @see #getCMProxyTestObject()
	 * @generated
	 */
	EReference getCMProxyTestObject_ProxyDependency();

	/**
	 * Returns the meta object for the containment reference list '{@link biz.bi.cmcore.model.CMProxyTestObject#getProxyEffect <em>Proxy Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Proxy Effect</em>'.
	 * @see biz.bi.cmcore.model.CMProxyTestObject#getProxyEffect()
	 * @see #getCMProxyTestObject()
	 * @generated
	 */
	EReference getCMProxyTestObject_ProxyEffect();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.cmcore.model.CMProxyTestObject#getM_path <em>Mpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mpath</em>'.
	 * @see biz.bi.cmcore.model.CMProxyTestObject#getM_path()
	 * @see #getCMProxyTestObject()
	 * @generated
	 */
	EAttribute getCMProxyTestObject_M_path();

	/**
	 * Returns the meta object for the containment reference list '{@link biz.bi.cmcore.model.CMProxyTestObject#getProxySTDCombination <em>Proxy STD Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Proxy STD Combination</em>'.
	 * @see biz.bi.cmcore.model.CMProxyTestObject#getProxySTDCombination()
	 * @see #getCMProxyTestObject()
	 * @generated
	 */
	EReference getCMProxyTestObject_ProxySTDCombination();

	/**
	 * Returns the meta object for the containment reference list '{@link biz.bi.cmcore.model.CMProxyTestObject#getProxyTestCase <em>Proxy Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Proxy Test Case</em>'.
	 * @see biz.bi.cmcore.model.CMProxyTestObject#getProxyTestCase()
	 * @see #getCMProxyTestObject()
	 * @generated
	 */
	EReference getCMProxyTestObject_ProxyTestCase();

	/**
	 * Returns the meta object for class '{@link biz.bi.cmcore.model.CMProxyElement <em>CM Proxy Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CM Proxy Element</em>'.
	 * @see biz.bi.cmcore.model.CMProxyElement
	 * @generated
	 */
	EClass getCMProxyElement();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.cmcore.model.CMProxyElement#getM_Element <em>MElement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MElement</em>'.
	 * @see biz.bi.cmcore.model.CMProxyElement#getM_Element()
	 * @see #getCMProxyElement()
	 * @generated
	 */
	EAttribute getCMProxyElement_M_Element();

	/**
	 * Returns the meta object for the container reference '{@link biz.bi.cmcore.model.CMProxyElement#getProxyTestObject <em>Proxy Test Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Proxy Test Object</em>'.
	 * @see biz.bi.cmcore.model.CMProxyElement#getProxyTestObject()
	 * @see #getCMProxyElement()
	 * @generated
	 */
	EReference getCMProxyElement_ProxyTestObject();

	/**
	 * Returns the meta object for the containment reference list '{@link biz.bi.cmcore.model.CMProxyElement#getProxyEquivalenceClass <em>Proxy Equivalence Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Proxy Equivalence Class</em>'.
	 * @see biz.bi.cmcore.model.CMProxyElement#getProxyEquivalenceClass()
	 * @see #getCMProxyElement()
	 * @generated
	 */
	EReference getCMProxyElement_ProxyEquivalenceClass();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.cmcore.model.CMProxyElement#getUniqueId <em>Unique Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Id</em>'.
	 * @see biz.bi.cmcore.model.CMProxyElement#getUniqueId()
	 * @see #getCMProxyElement()
	 * @generated
	 */
	EAttribute getCMProxyElement_UniqueId();

	/**
	 * Returns the meta object for class '{@link biz.bi.cmcore.model.CMProxyObject <em>CM Proxy Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CM Proxy Object</em>'.
	 * @see biz.bi.cmcore.model.CMProxyObject
	 * @generated
	 */
	EClass getCMProxyObject();

	/**
	 * Returns the meta object for class '{@link biz.bi.cmcore.model.CMProxyEquivalenceClass <em>CM Proxy Equivalence Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CM Proxy Equivalence Class</em>'.
	 * @see biz.bi.cmcore.model.CMProxyEquivalenceClass
	 * @generated
	 */
	EClass getCMProxyEquivalenceClass();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.cmcore.model.CMProxyEquivalenceClass#getM_EquivalenceClass <em>MEquivalence Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MEquivalence Class</em>'.
	 * @see biz.bi.cmcore.model.CMProxyEquivalenceClass#getM_EquivalenceClass()
	 * @see #getCMProxyEquivalenceClass()
	 * @generated
	 */
	EAttribute getCMProxyEquivalenceClass_M_EquivalenceClass();

	/**
	 * Returns the meta object for the container reference '{@link biz.bi.cmcore.model.CMProxyEquivalenceClass#getProxyElement <em>Proxy Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Proxy Element</em>'.
	 * @see biz.bi.cmcore.model.CMProxyEquivalenceClass#getProxyElement()
	 * @see #getCMProxyEquivalenceClass()
	 * @generated
	 */
	EReference getCMProxyEquivalenceClass_ProxyElement();

	/**
	 * Returns the meta object for the reference list '{@link biz.bi.cmcore.model.CMProxyEquivalenceClass#getProxyEffect <em>Proxy Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Proxy Effect</em>'.
	 * @see biz.bi.cmcore.model.CMProxyEquivalenceClass#getProxyEffect()
	 * @see #getCMProxyEquivalenceClass()
	 * @generated
	 */
	EReference getCMProxyEquivalenceClass_ProxyEffect();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.cmcore.model.CMProxyEquivalenceClass#getUniqueId <em>Unique Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Id</em>'.
	 * @see biz.bi.cmcore.model.CMProxyEquivalenceClass#getUniqueId()
	 * @see #getCMProxyEquivalenceClass()
	 * @generated
	 */
	EAttribute getCMProxyEquivalenceClass_UniqueId();

	/**
	 * Returns the meta object for class '{@link biz.bi.cmcore.model.CMProxyEffect <em>CM Proxy Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CM Proxy Effect</em>'.
	 * @see biz.bi.cmcore.model.CMProxyEffect
	 * @generated
	 */
	EClass getCMProxyEffect();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.cmcore.model.CMProxyEffect#getM_Effect <em>MEffect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MEffect</em>'.
	 * @see biz.bi.cmcore.model.CMProxyEffect#getM_Effect()
	 * @see #getCMProxyEffect()
	 * @generated
	 */
	EAttribute getCMProxyEffect_M_Effect();

	/**
	 * Returns the meta object for the reference list '{@link biz.bi.cmcore.model.CMProxyEffect#getProxyEquivalenceClass <em>Proxy Equivalence Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Proxy Equivalence Class</em>'.
	 * @see biz.bi.cmcore.model.CMProxyEffect#getProxyEquivalenceClass()
	 * @see #getCMProxyEffect()
	 * @generated
	 */
	EReference getCMProxyEffect_ProxyEquivalenceClass();

	/**
	 * Returns the meta object for the container reference '{@link biz.bi.cmcore.model.CMProxyEffect#getProxyTestObject <em>Proxy Test Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Proxy Test Object</em>'.
	 * @see biz.bi.cmcore.model.CMProxyEffect#getProxyTestObject()
	 * @see #getCMProxyEffect()
	 * @generated
	 */
	EReference getCMProxyEffect_ProxyTestObject();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.cmcore.model.CMProxyEffect#getUniqueId <em>Unique Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Id</em>'.
	 * @see biz.bi.cmcore.model.CMProxyEffect#getUniqueId()
	 * @see #getCMProxyEffect()
	 * @generated
	 */
	EAttribute getCMProxyEffect_UniqueId();

	/**
	 * Returns the meta object for the reference list '{@link biz.bi.cmcore.model.CMProxyEffect#getProxyCombination <em>Proxy Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Proxy Combination</em>'.
	 * @see biz.bi.cmcore.model.CMProxyEffect#getProxyCombination()
	 * @see #getCMProxyEffect()
	 * @generated
	 */
	EReference getCMProxyEffect_ProxyCombination();

	/**
	 * Returns the meta object for class '{@link biz.bi.cmcore.model.CMProxyDependency <em>CM Proxy Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CM Proxy Dependency</em>'.
	 * @see biz.bi.cmcore.model.CMProxyDependency
	 * @generated
	 */
	EClass getCMProxyDependency();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.cmcore.model.CMProxyDependency#getM_Dependency <em>MDependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MDependency</em>'.
	 * @see biz.bi.cmcore.model.CMProxyDependency#getM_Dependency()
	 * @see #getCMProxyDependency()
	 * @generated
	 */
	EAttribute getCMProxyDependency_M_Dependency();

	/**
	 * Returns the meta object for the reference list '{@link biz.bi.cmcore.model.CMProxyDependency#getProxyElement <em>Proxy Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Proxy Element</em>'.
	 * @see biz.bi.cmcore.model.CMProxyDependency#getProxyElement()
	 * @see #getCMProxyDependency()
	 * @generated
	 */
	EReference getCMProxyDependency_ProxyElement();

	/**
	 * Returns the meta object for the containment reference list '{@link biz.bi.cmcore.model.CMProxyDependency#getProxyCombination <em>Proxy Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Proxy Combination</em>'.
	 * @see biz.bi.cmcore.model.CMProxyDependency#getProxyCombination()
	 * @see #getCMProxyDependency()
	 * @generated
	 */
	EReference getCMProxyDependency_ProxyCombination();

	/**
	 * Returns the meta object for the container reference '{@link biz.bi.cmcore.model.CMProxyDependency#getProxyTestObject <em>Proxy Test Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Proxy Test Object</em>'.
	 * @see biz.bi.cmcore.model.CMProxyDependency#getProxyTestObject()
	 * @see #getCMProxyDependency()
	 * @generated
	 */
	EReference getCMProxyDependency_ProxyTestObject();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.cmcore.model.CMProxyDependency#getUniqueId <em>Unique Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Id</em>'.
	 * @see biz.bi.cmcore.model.CMProxyDependency#getUniqueId()
	 * @see #getCMProxyDependency()
	 * @generated
	 */
	EAttribute getCMProxyDependency_UniqueId();

	/**
	 * Returns the meta object for the reference list '{@link biz.bi.cmcore.model.CMProxyDependency#getProxyEquivalenceClass <em>Proxy Equivalence Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Proxy Equivalence Class</em>'.
	 * @see biz.bi.cmcore.model.CMProxyDependency#getProxyEquivalenceClass()
	 * @see #getCMProxyDependency()
	 * @generated
	 */
	EReference getCMProxyDependency_ProxyEquivalenceClass();

	/**
	 * Returns the meta object for class '{@link biz.bi.cmcore.model.CMProxyCombination <em>CM Proxy Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CM Proxy Combination</em>'.
	 * @see biz.bi.cmcore.model.CMProxyCombination
	 * @generated
	 */
	EClass getCMProxyCombination();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.cmcore.model.CMProxyCombination#getM_Combination <em>MCombination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MCombination</em>'.
	 * @see biz.bi.cmcore.model.CMProxyCombination#getM_Combination()
	 * @see #getCMProxyCombination()
	 * @generated
	 */
	EAttribute getCMProxyCombination_M_Combination();

	/**
	 * Returns the meta object for the container reference '{@link biz.bi.cmcore.model.CMProxyCombination#getProxyDependency <em>Proxy Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Proxy Dependency</em>'.
	 * @see biz.bi.cmcore.model.CMProxyCombination#getProxyDependency()
	 * @see #getCMProxyCombination()
	 * @generated
	 */
	EReference getCMProxyCombination_ProxyDependency();

	/**
	 * Returns the meta object for the reference list '{@link biz.bi.cmcore.model.CMProxyCombination#getProxyEquivalenceClass <em>Proxy Equivalence Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Proxy Equivalence Class</em>'.
	 * @see biz.bi.cmcore.model.CMProxyCombination#getProxyEquivalenceClass()
	 * @see #getCMProxyCombination()
	 * @generated
	 */
	EReference getCMProxyCombination_ProxyEquivalenceClass();

	/**
	 * Returns the meta object for the reference list '{@link biz.bi.cmcore.model.CMProxyCombination#getProxyEffect <em>Proxy Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Proxy Effect</em>'.
	 * @see biz.bi.cmcore.model.CMProxyCombination#getProxyEffect()
	 * @see #getCMProxyCombination()
	 * @generated
	 */
	EReference getCMProxyCombination_ProxyEffect();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.cmcore.model.CMProxyCombination#getUniqueId <em>Unique Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Id</em>'.
	 * @see biz.bi.cmcore.model.CMProxyCombination#getUniqueId()
	 * @see #getCMProxyCombination()
	 * @generated
	 */
	EAttribute getCMProxyCombination_UniqueId();

	/**
	 * Returns the meta object for class '{@link biz.bi.cmcore.model.CMProxyRiskObject <em>CM Proxy Risk Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CM Proxy Risk Object</em>'.
	 * @see biz.bi.cmcore.model.CMProxyRiskObject
	 * @generated
	 */
	EClass getCMProxyRiskObject();

	/**
	 * Returns the meta object for class '{@link biz.bi.cmcore.model.CMProxyTestCase <em>CM Proxy Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CM Proxy Test Case</em>'.
	 * @see biz.bi.cmcore.model.CMProxyTestCase
	 * @generated
	 */
	EClass getCMProxyTestCase();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.cmcore.model.CMProxyTestCase#getUniqueId <em>Unique Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Id</em>'.
	 * @see biz.bi.cmcore.model.CMProxyTestCase#getUniqueId()
	 * @see #getCMProxyTestCase()
	 * @generated
	 */
	EAttribute getCMProxyTestCase_UniqueId();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.cmcore.model.CMProxyTestCase#getM_TestCase <em>MTest Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MTest Case</em>'.
	 * @see biz.bi.cmcore.model.CMProxyTestCase#getM_TestCase()
	 * @see #getCMProxyTestCase()
	 * @generated
	 */
	EAttribute getCMProxyTestCase_M_TestCase();

	/**
	 * Returns the meta object for the container reference '{@link biz.bi.cmcore.model.CMProxyTestCase#getProxyTestObject <em>Proxy Test Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Proxy Test Object</em>'.
	 * @see biz.bi.cmcore.model.CMProxyTestCase#getProxyTestObject()
	 * @see #getCMProxyTestCase()
	 * @generated
	 */
	EReference getCMProxyTestCase_ProxyTestObject();

	/**
	 * Returns the meta object for the reference list '{@link biz.bi.cmcore.model.CMProxyTestCase#getProxyCombination <em>Proxy Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Proxy Combination</em>'.
	 * @see biz.bi.cmcore.model.CMProxyTestCase#getProxyCombination()
	 * @see #getCMProxyTestCase()
	 * @generated
	 */
	EReference getCMProxyTestCase_ProxyCombination();

	/**
	 * Returns the meta object for the reference list '{@link biz.bi.cmcore.model.CMProxyTestCase#getProxyEquivalenceClass <em>Proxy Equivalence Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Proxy Equivalence Class</em>'.
	 * @see biz.bi.cmcore.model.CMProxyTestCase#getProxyEquivalenceClass()
	 * @see #getCMProxyTestCase()
	 * @generated
	 */
	EReference getCMProxyTestCase_ProxyEquivalenceClass();

	/**
	 * Returns the meta object for class '{@link biz.bi.cmcore.model.CMProxyGeneratedObject <em>CM Proxy Generated Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CM Proxy Generated Object</em>'.
	 * @see biz.bi.cmcore.model.CMProxyGeneratedObject
	 * @generated
	 */
	EClass getCMProxyGeneratedObject();

	/**
	 * Returns the meta object for class '{@link biz.bi.cmcore.model.CMProxySTDCombination <em>CM Proxy STD Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CM Proxy STD Combination</em>'.
	 * @see biz.bi.cmcore.model.CMProxySTDCombination
	 * @generated
	 */
	EClass getCMProxySTDCombination();

	/**
	 * Returns the meta object for the container reference '{@link biz.bi.cmcore.model.CMProxySTDCombination#getProxyTestObject <em>Proxy Test Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Proxy Test Object</em>'.
	 * @see biz.bi.cmcore.model.CMProxySTDCombination#getProxyTestObject()
	 * @see #getCMProxySTDCombination()
	 * @generated
	 */
	EReference getCMProxySTDCombination_ProxyTestObject();

	/**
	 * Returns the meta object for data type '{@link model.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Element</em>'.
	 * @see model.Element
	 * @model instanceClass="model.Element" serializable="false"
	 * @generated
	 */
	EDataType getElement();

	/**
	 * Returns the meta object for data type '{@link model.TestObject <em>Test Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Object</em>'.
	 * @see model.TestObject
	 * @model instanceClass="model.TestObject" serializable="false"
	 * @generated
	 */
	EDataType getTestObject();

	/**
	 * Returns the meta object for data type '{@link model.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Dependency</em>'.
	 * @see model.Dependency
	 * @model instanceClass="model.Dependency" serializable="false"
	 * @generated
	 */
	EDataType getDependency();

	/**
	 * Returns the meta object for data type '{@link model.EquivalenceClass <em>Equivalence Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Equivalence Class</em>'.
	 * @see model.EquivalenceClass
	 * @model instanceClass="model.EquivalenceClass"
	 * @generated
	 */
	EDataType getEquivalenceClass();

	/**
	 * Returns the meta object for data type '{@link model.Combination <em>Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Combination</em>'.
	 * @see model.Combination
	 * @model instanceClass="model.Combination"
	 * @generated
	 */
	EDataType getCombination();

	/**
	 * Returns the meta object for data type '{@link model.Effect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Effect</em>'.
	 * @see model.Effect
	 * @model instanceClass="model.Effect"
	 * @generated
	 */
	EDataType getEffect();

	/**
	 * Returns the meta object for data type '{@link model.Structure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Structure</em>'.
	 * @see model.Structure
	 * @model instanceClass="model.Structure"
	 * @generated
	 */
	EDataType getStructure();

	/**
	 * Returns the meta object for data type '{@link model.TestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Case</em>'.
	 * @see model.TestCase
	 * @model instanceClass="model.TestCase"
	 * @generated
	 */
	EDataType getTestCase();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CMCoreFactory getCMCoreFactory();

	/**
	 * 
	 * @return the array of String for equivalence class state.
	 */
	String[] getEquivalenceClassState();

	/**
	 * 
	 * @return the array of inv values of states for equivalence class state.
	 */
	int[] getEquivalenceClassStateIntValue();

} //CMCorePackage
