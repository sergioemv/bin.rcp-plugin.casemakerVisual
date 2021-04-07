/**
 * <copyright>
 * </copyright>
 *
 * $Id: CMCoreFactory.java,v 1.13 2005/09/20 15:08:08 smoreno Exp $
 */
package biz.bi.cmcore.model;

import model.Combination;
import model.Dependency;
import model.Effect;
import model.Element;
import model.EquivalenceClass;
import model.TestCase;
import model.TestObject;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see biz.bi.cmcore.model.CMCorePackage
 * @generated
 */
public interface CMCoreFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CMCoreFactory eINSTANCE = new biz.bi.cmcore.model.impl.CMCoreFactoryImpl();

	/**
	 * Returns a new object of class '<em>CM Proxy Test Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CM Proxy Test Object</em>'.
	 * @generated
	 */
	CMProxyTestObject createCMProxyTestObject();

	/**
	 * Loads a testObject and his components from a testobject file 
	 * @param p_filename
	 * @return
	 */
	CMProxyTestObject createCMProxyTestObject(String p_filename);

	/**
	 * Creates a Proxy Test Object and asigns an existent test object 
	 * @param p_TestObject
	 * @return
	 */
	CMProxyTestObject createCMProxyTestObject(TestObject p_TestObject);

	/**
	 * Returns a new object of class '<em>CM Proxy Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CM Proxy Element</em>'.
	 * @generated
	 */
	CMProxyElement createCMProxyElement();

	/**
	 * Returns a new CMProxyElement with a element in it
	 * @param p_Element
	 * @return
	 */
	CMProxyElement createCMProxyElement(Element p_Element);

	/**
	 * Returns a new CMProxyElement with a new element atached to the parent 
	 * testobject 
	 * @param p_Element
	 * @return
	 */
	CMProxyElement createCMProxyElement(CMProxyTestObject p_ProxyTestObject);

	/**
	 * Returns a new CMProxyElement with a new element in it
	 * @param p_Element
	 * @return
	 */
	CMProxyElement createCMProxyElement(String id);

	/**
	 * Returns a new object of class '<em>CM Proxy Equivalence Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CM Proxy Equivalence Class</em>'.
	 * @generated
	 */
	CMProxyEquivalenceClass createCMProxyEquivalenceClass();

	/**
	 * Returns a new CMProxyEquivalence Class from a existent equivalence class
	 * @param p_EquivalenceClass
	 * @return
	 */
	CMProxyEquivalenceClass createCMProxyEquivalenceClass(
			EquivalenceClass p_EquivalenceClass);

	CMProxyEquivalenceClass createCMProxyEquivalenceClass(
			CMProxyElement p_Parent);

	/**
	 * Returns a new CMProxyEquivalence Class from a ID String
	 * @param p_EquivalenceClass
	 * @return
	 */
	CMProxyEquivalenceClass createCMProxyEquivalenceClass(String id);

	/**
	 * Returns a new object of class '<em>CM Proxy Effect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CM Proxy Effect</em>'.
	 * @generated
	 */
	CMProxyEffect createCMProxyEffect();

	/**
	 * Returns a new CMProxyEffect from a existent effect
	 * @param p_Effect
	 * @return
	 */
	CMProxyEffect createCMProxyEffect(Effect p_Effect);

	/**
	 * Returns a new CMProxyEffect from a existent effect
	 * @param p_Effect
	 * @return
	 */
	CMProxyEffect createCMProxyEffect(String ID);

	/**
	 * Returns a new object of class '<em>CM Proxy Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CM Proxy Dependency</em>'.
	 * @generated
	 */
	CMProxyDependency createCMProxyDependency();

	/**
	 * Returns a new CMProxyDependency from a existing Dependency
	 * @param p_Dependency
	 * @return
	 */
	CMProxyDependency createCMProxyDependency(Dependency p_Dependency);

	/**
	 * Returns a new CMProxyDependency from a existing Dependency
	 * @param p_Dependency
	 * @return
	 */
	CMProxyDependency createCMProxyDependency(String id);

	CMProxyDependency createCMProxyDependency(CMProxyTestObject p_TestObject);

	/**
	 * Returns a new object of class '<em>CM Proxy Combination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CM Proxy Combination</em>'.
	 * @generated
	 */
	CMProxyCombination createCMProxyCombination();

	/**
	 * Returns a new object of class '<em>CM Proxy Test Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CM Proxy Test Case</em>'.
	 * @generated
	 */
	CMProxyTestCase createCMProxyTestCase();

	/**
	 * Returns a new object of class '<em>CM Proxy STD Combination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CM Proxy STD Combination</em>'.
	 * @generated
	 */
	CMProxySTDCombination createCMProxySTDCombination();

	/**
	 * Returns a new CMProxycombination  based on a existing combination
	 * @param p_Combination
	 * @return
	 * @author smoreno
	 */
	CMProxyCombination createCMProxyCombination(Combination p_Combination);

	/**
	 * Returns a new CMProxycombination  based on a existing combination
	 * @param p_Combination
	 * @return
	 * @author smoreno
	 */
	CMProxyCombination createCMProxyCombination(String id);

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CMCorePackage getCMCorePackage();

	/**
	 * @param p_dependency
	 * @return
	 */
	CMProxyCombination createCMProxyCombination(CMProxyDependency p_dependency);

	/**
	 * Loads a testObject and his components from a testobject file 
	 * @param p_filename
	 * @return
	 */
	CMProxyTestObject createCMProxyTestObject(String p_filename,
			boolean p_NewTestObject);

	/**
	 * @param p_proxyTestCase
	 * @return
	 */
	CMProxyTestCase createCMProxyTestCase(TestCase p_TestCase);

	/**
	 * @param p_proxyTestCase
	 * @return
	 */


} //CMCoreFactory
