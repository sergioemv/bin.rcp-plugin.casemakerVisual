/**
 * <copyright>
 * </copyright>
 *
 * $Id: CMProxyTestObject.java,v 1.17 2005/09/20 15:08:08 smoreno Exp $
 */
package biz.bi.cmcore.model;

import model.Project;
import model.Structure;
import model.TestObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proxy Test Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.cmcore.model.CMProxyTestObject#getM_TestObject <em>MTest Object</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.CMProxyTestObject#getProxyElement <em>Proxy Element</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.CMProxyTestObject#getProxyDependency <em>Proxy Dependency</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.CMProxyTestObject#getProxyEffect <em>Proxy Effect</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.CMProxyTestObject#getM_path <em>Mpath</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.CMProxyTestObject#getProxySTDCombination <em>Proxy STD Combination</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.CMProxyTestObject#getProxyTestCase <em>Proxy Test Case</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyTestObject()
 * @model
 * @generated
 */
public interface CMProxyTestObject extends CMProxyObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>MTest Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MTest Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MTest Object</em>' attribute.
	 * @see #setM_TestObject(TestObject)
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyTestObject_M_TestObject()
	 * @model dataType="biz.bi.cmcore.model.TestObject" required="true" transient="true"
	 * @generated
	 */
	TestObject getM_TestObject();

	/**
	 * Sets the value of the '{@link biz.bi.cmcore.model.CMProxyTestObject#getM_TestObject <em>MTest Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MTest Object</em>' attribute.
	 * @see #getM_TestObject()
	 * @generated
	 */
	void setM_TestObject(TestObject value);

	/**
	 * Returns the value of the '<em><b>Proxy Element</b></em>' containment reference list.
	 * The list contents are of type {@link biz.bi.cmcore.model.CMProxyElement}.
	 * It is bidirectional and its opposite is '{@link biz.bi.cmcore.model.CMProxyElement#getProxyTestObject <em>Proxy Test Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Element</em>' containment reference list.
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyTestObject_ProxyElement()
	 * @see biz.bi.cmcore.model.CMProxyElement#getProxyTestObject
	 * @model type="biz.bi.cmcore.model.CMProxyElement" opposite="proxyTestObject" containment="true" transient="true"
	 * @generated
	 */
	EList getProxyElement();

	/**
	 * Returns the value of the '<em><b>Proxy Dependency</b></em>' containment reference list.
	 * The list contents are of type {@link biz.bi.cmcore.model.CMProxyDependency}.
	 * It is bidirectional and its opposite is '{@link biz.bi.cmcore.model.CMProxyDependency#getProxyTestObject <em>Proxy Test Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Dependency</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Dependency</em>' containment reference list.
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyTestObject_ProxyDependency()
	 * @see biz.bi.cmcore.model.CMProxyDependency#getProxyTestObject
	 * @model type="biz.bi.cmcore.model.CMProxyDependency" opposite="proxyTestObject" containment="true" transient="true"
	 * @generated
	 */
	EList getProxyDependency();

	/**
	 * Returns the value of the '<em><b>Proxy Effect</b></em>' containment reference list.
	 * The list contents are of type {@link biz.bi.cmcore.model.CMProxyEffect}.
	 * It is bidirectional and its opposite is '{@link biz.bi.cmcore.model.CMProxyEffect#getProxyTestObject <em>Proxy Test Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Effect</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Effect</em>' containment reference list.
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyTestObject_ProxyEffect()
	 * @see biz.bi.cmcore.model.CMProxyEffect#getProxyTestObject
	 * @model type="biz.bi.cmcore.model.CMProxyEffect" opposite="proxyTestObject" containment="true" transient="true"
	 * @generated
	 */
	EList getProxyEffect();

	/**
	 * Returns the value of the '<em><b>Mpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mpath</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mpath</em>' attribute.
	 * @see #setM_path(String)
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyTestObject_M_path()
	 * @model
	 * @generated
	 */
	String getM_path();

	/**
	 * Sets the value of the '{@link biz.bi.cmcore.model.CMProxyTestObject#getM_path <em>Mpath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mpath</em>' attribute.
	 * @see #getM_path()
	 * @generated
	 */
	void setM_path(String value);

	/**
	 * Returns the value of the '<em><b>Proxy STD Combination</b></em>' containment reference list.
	 * The list contents are of type {@link biz.bi.cmcore.model.CMProxySTDCombination}.
	 * It is bidirectional and its opposite is '{@link biz.bi.cmcore.model.CMProxySTDCombination#getProxyTestObject <em>Proxy Test Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy STD Combination</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy STD Combination</em>' containment reference list.
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyTestObject_ProxySTDCombination()
	 * @see biz.bi.cmcore.model.CMProxySTDCombination#getProxyTestObject
	 * @model type="biz.bi.cmcore.model.CMProxySTDCombination" opposite="proxyTestObject" containment="true"
	 * @generated
	 */
	EList getProxySTDCombination();

	/**
	 * Returns the value of the '<em><b>Proxy Test Case</b></em>' containment reference list.
	 * The list contents are of type {@link biz.bi.cmcore.model.CMProxyTestCase}.
	 * It is bidirectional and its opposite is '{@link biz.bi.cmcore.model.CMProxyTestCase#getProxyTestObject <em>Proxy Test Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Test Case</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Test Case</em>' containment reference list.
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyTestObject_ProxyTestCase()
	 * @see biz.bi.cmcore.model.CMProxyTestCase#getProxyTestObject
	 * @model type="biz.bi.cmcore.model.CMProxyTestCase" opposite="proxyTestObject" containment="true"
	 * @generated
	 */
	EList getProxyTestCase();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="biz.bi.cmcore.model.Structure"
	 * @generated
	 */
	Structure getStructure();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getState();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getUser();

	void removeProxyDependency(CMProxyDependency p_Dependency, boolean doCMModel);

	void removeProxyElement(CMProxyElement p_Element, boolean doCMModel);

	/**
	 * @author hcanedo
	 * Save Test Object associated with current CMProxyTestObject
	 */
	void saveTestObject();

	/**
	 * @author hcanedo
	 * @return New Test Object
	 */
	TestObject createTestObject();

	/**
	 * @param p_child
	 */
	void addProxyElement(CMProxyElement p_child, boolean doCMModel);

	/**
	 * @param p_child
	 */
	void removeProxyEffect(CMProxyEffect p_child, boolean doCMModel);

	/**
	 * @param p_child
	 */
	void addProxyEffect(CMProxyEffect p_child, boolean doCMModel);

	/**
	 * @param p_child
	 */
	void addProxyDependency(CMProxyDependency p_child, boolean doCMModel);

	/**
	 * @param p_child
	 * @param p_doCMModel
	 */
	void addProxyTestCase(CMProxyTestCase p_child, boolean p_doCMModel,int state);

	/**
	 * @param p_child
	 * @param p_doCMModel
	 */
	void removeProxyTestCase(CMProxyTestCase p_child, boolean p_doCMModel);
} // CMProxyTestObject
