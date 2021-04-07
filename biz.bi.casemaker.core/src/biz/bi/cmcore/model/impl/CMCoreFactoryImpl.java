/**
 * <copyright>
 * </copyright>
 *
 * $Id: CMCoreFactoryImpl.java,v 1.27 2005/09/20 15:08:08 smoreno Exp $
 */
package biz.bi.cmcore.model.impl;

import biz.bi.cmcore.model.*;

import model.Combination;
import model.Dependency;
import model.Effect;
import model.Element;
import model.EquivalenceClass;
import model.Project;
import model.Structure;
import model.TestCase;

import model.TestObject;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

import bi.controller.WorkspaceManager;
import biz.bi.cmcore.CMCorePlugin;
import biz.bi.cmcore.model.CMCoreFactory;
import biz.bi.cmcore.model.CMCorePackage;
import biz.bi.cmcore.model.CMProxyCombination;
import biz.bi.cmcore.model.CMProxyDependency;
import biz.bi.cmcore.model.CMProxyEffect;
import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.cmcore.model.CMProxyTestCase;
import biz.bi.cmcore.model.CMProxyTestObject;
import biz.bi.cmcore.policies.CMProxyCasemakerPolicyFactory;
import biz.bi.cmcore.policies.CMProxyPolicyFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CMCoreFactoryImpl extends EFactoryImpl implements CMCoreFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	private WorkspaceManager m_WorkspaceManager = null;

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public CMCoreFactoryImpl() {
		super();
		m_WorkspaceManager = CMCorePlugin.INSTANCE.getM_SessionManager()
				.getM_WorkspaceManager();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CMCorePackage.CM_PROXY_TEST_OBJECT:
			return createCMProxyTestObject();
		case CMCorePackage.CM_PROXY_ELEMENT:
			return createCMProxyElement();
		case CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS:
			return createCMProxyEquivalenceClass();
		case CMCorePackage.CM_PROXY_EFFECT:
			return createCMProxyEffect();
		case CMCorePackage.CM_PROXY_DEPENDENCY:
			return createCMProxyDependency();
		case CMCorePackage.CM_PROXY_COMBINATION:
			return createCMProxyCombination();
		case CMCorePackage.CM_PROXY_TEST_CASE:
			return createCMProxyTestCase();
		case CMCorePackage.CM_PROXY_STD_COMBINATION:
			return createCMProxySTDCombination();
		default:
			throw new IllegalArgumentException(
					"The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case CMCorePackage.EQUIVALENCE_CLASS:
			return createEquivalenceClassFromString(eDataType, initialValue);
		case CMCorePackage.COMBINATION:
			return createCombinationFromString(eDataType, initialValue);
		case CMCorePackage.EFFECT:
			return createEffectFromString(eDataType, initialValue);
		case CMCorePackage.STRUCTURE:
			return createStructureFromString(eDataType, initialValue);
		case CMCorePackage.TEST_CASE:
			return createTestCaseFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException(
					"The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case CMCorePackage.EQUIVALENCE_CLASS:
			return convertEquivalenceClassToString(eDataType, instanceValue);
		case CMCorePackage.COMBINATION:
			return convertCombinationToString(eDataType, instanceValue);
		case CMCorePackage.EFFECT:
			return convertEffectToString(eDataType, instanceValue);
		case CMCorePackage.STRUCTURE:
			return convertStructureToString(eDataType, instanceValue);
		case CMCorePackage.TEST_CASE:
			return convertTestCaseToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException(
					"The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public CMProxyTestObject createCMProxyTestObject() {
		CMProxyTestObjectImpl cmProxyTestObject = new CMProxyTestObjectImpl();
		//create and assign a new testObject
		/*	cmProxyTestObject
		 .setM_TestObject(m_WorkspaceManager.createTestObject());*/
		return cmProxyTestObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMProxyElement createCMProxyElement() {
		CMProxyElementImpl cmProxyElement = new CMProxyElementImpl();
		return cmProxyElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMProxyEquivalenceClass createCMProxyEquivalenceClass() {
		CMProxyEquivalenceClassImpl cmProxyEquivalenceClass = new CMProxyEquivalenceClassImpl();
		return cmProxyEquivalenceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMProxyEffect createCMProxyEffect() {
		CMProxyEffectImpl cmProxyEffect = new CMProxyEffectImpl();
		return cmProxyEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMProxyDependency createCMProxyDependency() {
		CMProxyDependencyImpl cmProxyDependency = new CMProxyDependencyImpl();
		return cmProxyDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMProxyCombination createCMProxyCombination() {
		CMProxyCombinationImpl cmProxyCombination = new CMProxyCombinationImpl();
		return cmProxyCombination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMProxyTestCase createCMProxyTestCase() {
		CMProxyTestCaseImpl cmProxyTestCase = new CMProxyTestCaseImpl();
		return cmProxyTestCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMProxySTDCombination createCMProxySTDCombination() {
		CMProxySTDCombinationImpl cmProxySTDCombination = new CMProxySTDCombinationImpl();
		return cmProxySTDCombination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalenceClass createEquivalenceClassFromString(
			EDataType eDataType, String initialValue) {
		return (EquivalenceClass) super.createFromString(eDataType,
				initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEquivalenceClassToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Combination createCombinationFromString(EDataType eDataType,
			String initialValue) {
		return (Combination) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCombinationToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Effect createEffectFromString(EDataType eDataType,
			String initialValue) {
		return (Effect) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEffectToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure createStructureFromString(EDataType eDataType,
			String initialValue) {
		return (Structure) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestCase createTestCaseFromString(EDataType eDataType,
			String initialValue) {
		return (TestCase) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestCaseToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMCorePackage getCMCorePackage() {
		return (CMCorePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static CMCorePackage getPackage() {
		return CMCorePackage.eINSTANCE;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.CMCoreFactory#createCMProxyTestObject(java.lang.String)
	 */
	public CMProxyTestObject createCMProxyTestObject(String p_filename) {
		CMProxyTestObject l_ProxyTestObject;
		//if (!CMProxyTestObjectImpl.activeTestObjects.containsKey(p_filename)) {
		//TestObject l_TestObject = CMProxyCasemakerPolicyFactory.INSTANCE.readTestObject(p_filename);
		//l_ProxyTestObject = createCMProxyTestObject(l_TestObject);
		l_ProxyTestObject = createCMProxyTestObject();
		l_ProxyTestObject.setM_path(p_filename);
		CMProxyPolicyFactory.INSTANCE.createRereadProxyTestObjectPolicy(
				l_ProxyTestObject).execute();

		//l_ProxyTestObject.checkTestObjectConsistency();
		/*} else {
		 l_ProxyTestObject = (CMProxyTestObject) CMProxyTestObjectImpl.activeTestObjects
		 .get(p_filename);
		 l_ProxyTestObject.checkTestObjectConsistency();
		 System.out.println("Cached read " + p_filename);
		 }*/
		return l_ProxyTestObject;

	}

	public CMProxyTestObject createCMProxyTestObject(TestObject p_TestObject) {
		CMProxyTestObject l_CMProxyTestObject = createCMProxyTestObject();
		l_CMProxyTestObject.setM_TestObject(p_TestObject);
		//build the children objects
		//l_CMProxyTestObject.checkTestObjectConsistency();
		return l_CMProxyTestObject;
	}

	public CMProxyElement createCMProxyElement(Element p_Element) {
		CMProxyElement l_ProxyElement = createCMProxyElement();
		l_ProxyElement.setM_Element(p_Element);
		//createdElements.put(l_ProxyElement.getUniqueId(), l_ProxyElement);
		return l_ProxyElement;
	}

	public CMProxyEquivalenceClass createCMProxyEquivalenceClass(
			EquivalenceClass p_EquivalenceClass) {

		CMProxyEquivalenceClass l_CMProxyEquivalenceClass = createCMProxyEquivalenceClass();
		l_CMProxyEquivalenceClass.setM_EquivalenceClass(p_EquivalenceClass);
		return l_CMProxyEquivalenceClass;
	}

	public CMProxyEffect createCMProxyEffect(Effect p_Effect) {
		CMProxyEffect l_ProxyEffect = createCMProxyEffect();
		l_ProxyEffect.setM_Effect(p_Effect);

		return l_ProxyEffect;
	}

	public CMProxyDependency createCMProxyDependency(Dependency p_Dependency) {
		CMProxyDependency l_ProxyDependency = createCMProxyDependency();
		l_ProxyDependency.setM_Dependency(p_Dependency);

		return l_ProxyDependency;
	}

	public CMProxyCombination createCMProxyCombination(Combination p_Combination) {
		CMProxyCombination l_ProxyCombination = createCMProxyCombination();
		l_ProxyCombination.setM_Combination(p_Combination);

		return l_ProxyCombination;
	}

	public CMProxyElement createCMProxyElement(String id) {
		CMProxyElement l_ProxyElement;

		if (!CMProxyElementImpl.activeElements.containsKey(id)) {
			l_ProxyElement = createCMProxyElement();
			System.out.println("Element Id " + id + " not found");
		} else {
			l_ProxyElement = (CMProxyElement) CMProxyElementImpl.activeElements
					.get(id);
		}
		return l_ProxyElement;
	}

	public CMProxyEquivalenceClass createCMProxyEquivalenceClass(String id) {
		CMProxyEquivalenceClass l_ProxyEquivalenceClass;

		if (!CMProxyEquivalenceClassImpl.activeEquivalenceClasses
				.containsKey(id)) {
			l_ProxyEquivalenceClass = createCMProxyEquivalenceClass();
			System.out.println("EquivalenceClass Id " + id + " not found");
		} else {
			l_ProxyEquivalenceClass = (CMProxyEquivalenceClass) CMProxyEquivalenceClassImpl.activeEquivalenceClasses
					.get(id);
		}
		return l_ProxyEquivalenceClass;
	}

	public CMProxyEffect createCMProxyEffect(String id) {
		CMProxyEffect l_ProxyEffect;
		if (!CMProxyEffectImpl.activeEffects.containsKey(id)) {
			l_ProxyEffect = createCMProxyEffect();
			System.out.println("Effect Id " + id + " not found");
		} else {
			l_ProxyEffect = (CMProxyEffect) CMProxyEffectImpl.activeEffects
					.get(id);
		}
		return l_ProxyEffect;

	}

	public CMProxyDependency createCMProxyDependency(String id) {
		CMProxyDependency l_ProxyDependency;
		if (!CMProxyDependencyImpl.activeDependencies.containsKey(id)) {
			l_ProxyDependency = createCMProxyDependency();
			System.out.println("Dependency Id " + id + " not found");
		} else {
			l_ProxyDependency = (CMProxyDependency) CMProxyDependencyImpl.activeDependencies
					.get(id);
		}
		return l_ProxyDependency;
	}

	public CMProxyCombination createCMProxyCombination(String id) {
		CMProxyCombination l_ProxyCombination;
		if (!CMProxyCombinationImpl.activeCombinations.containsKey(id)) {
			l_ProxyCombination = createCMProxyCombination();
			System.out.println("Combination Id " + id + " not found");
		} else {
			l_ProxyCombination = (CMProxyCombination) CMProxyCombinationImpl.activeCombinations
					.get(id);
		}
		return l_ProxyCombination;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.CMCoreFactory#createCMProxyElement(biz.bi.cmcore.model.CMProxyTestObject)
	 */
	public CMProxyElement createCMProxyElement(
			CMProxyTestObject p_ProxyTestObject) {
		Element l_Element = m_WorkspaceManager.getM_SessionManager()
				.getElementManager().createElement(
						p_ProxyTestObject.getStructure());
		p_ProxyTestObject.getStructure().getLnkElements().add(l_Element);

		l_Element.setName(CMCorePlugin.getPlugin().getString(
				"DEFAULT_ELEMENT_name"));
		CMProxyElement l_ProxyElement = createCMProxyElement(l_Element);
		p_ProxyTestObject.getProxyElement().add(l_ProxyElement);
		l_ProxyElement.setProxyTestObject(p_ProxyTestObject);

		return l_ProxyElement;
	}

	public CMProxyDependency createCMProxyDependency(
			CMProxyTestObject p_TestObject) {
		Dependency l_Dependency = m_WorkspaceManager.getM_SessionManager()
				.getDependencyManager().createDependency(
						p_TestObject.getStructure());
		p_TestObject.getStructure().getLnkDependencies().add(l_Dependency);
		l_Dependency.setDescription(CMCorePlugin.getPlugin().getString(
				"DEFAULT_DEPENDENCY_description"));
		CMProxyDependency l_ProxyDependency = createCMProxyDependency(l_Dependency);
		p_TestObject.getProxyDependency().add(l_ProxyDependency);
		l_ProxyDependency.setProxyTestObject(p_TestObject);

		return l_ProxyDependency;
	}

	public CMProxyEquivalenceClass createCMProxyEquivalenceClass(
			CMProxyElement p_Parent) {

		EquivalenceClass l_EquivalenceClass = m_WorkspaceManager
				.getM_SessionManager().getEquivalenceClassManager()
				.createEquivalenceClass(p_Parent.getM_Element());
		p_Parent.getM_Element().getLnkEquivalenceClasses().add(
				l_EquivalenceClass);
		l_EquivalenceClass.setLnkElement(p_Parent.getM_Element());
		CMProxyEquivalenceClass l_ProxyEquivalenceClass = createCMProxyEquivalenceClass(l_EquivalenceClass);
		p_Parent.getProxyEquivalenceClass().add(l_ProxyEquivalenceClass);
		l_ProxyEquivalenceClass.setProxyElement(p_Parent);

		return l_ProxyEquivalenceClass;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.CMCoreFactory#createCMProxyCombination(biz.bi.cmcore.model.CMProxyDependency)
	 */
	public CMProxyCombination createCMProxyCombination(
			CMProxyDependency p_dependency) {
		Combination l_Combination = m_WorkspaceManager.getM_SessionManager()
				.getCombinationManager().createCombination(
						p_dependency.getM_Dependency());
		p_dependency.getM_Dependency().getLnkCombinations().add(l_Combination);
		l_Combination.setDescription(CMCorePlugin.getPlugin().getString(
				"DEFAULT_COMBINATION_description"));
		CMProxyCombination l_ProxyCombination = createCMProxyCombination(l_Combination);
		p_dependency.getProxyCombination().add(l_ProxyCombination);
		l_ProxyCombination.setProxyDependency(p_dependency);

		return l_ProxyCombination;
	}

	public CMProxyTestObject createCMProxyTestObject(String p_filename,
			boolean p_NewTestObject) {
		CMProxyTestObject l_ProxyTestObject;
		TestObject l_TestObject;
		if (p_NewTestObject) {
			l_TestObject = CMProxyCasemakerPolicyFactory.INSTANCE
					.createTestObject(p_filename);
		} else {
			l_TestObject = CMProxyCasemakerPolicyFactory.INSTANCE
					.readTestObject(p_filename);
		}
		l_ProxyTestObject = createCMProxyTestObject(l_TestObject);
		l_ProxyTestObject.setM_path(p_filename);
		if (p_NewTestObject) {
			l_ProxyTestObject.saveTestObject();
		}
		CMProxyPolicyFactory.INSTANCE.createReloadProxyTestObjectPolicy(
				l_ProxyTestObject).execute();

		return l_ProxyTestObject;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.CMCoreFactory#createCMProxyTestCase(biz.bi.cmcore.model.CMProxyTestCase)
	 */
	public CMProxyTestCase createCMProxyTestCase(TestCase p_TestCase) {
		CMProxyTestCase proxyTestCase = createCMProxyTestCase();
		proxyTestCase.setM_TestCase(p_TestCase);
		return proxyTestCase;
	}
} //CMCoreFactoryImpl

