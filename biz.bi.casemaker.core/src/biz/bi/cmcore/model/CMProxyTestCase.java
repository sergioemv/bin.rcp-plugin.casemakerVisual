/**
 * <copyright>
 * </copyright>
 *
 * $Id: CMProxyTestCase.java,v 1.2 2005/09/20 15:08:08 smoreno Exp $
 */
package biz.bi.cmcore.model;

import model.TestCase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CM Proxy Test Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.cmcore.model.CMProxyTestCase#getUniqueId <em>Unique Id</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.CMProxyTestCase#getM_TestCase <em>MTest Case</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.CMProxyTestCase#getProxyTestObject <em>Proxy Test Object</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.CMProxyTestCase#getProxyCombination <em>Proxy Combination</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.CMProxyTestCase#getProxyEquivalenceClass <em>Proxy Equivalence Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyTestCase()
 * @model
 * @generated
 */
public interface CMProxyTestCase extends CMProxyObject, CMProxyRiskObject,
		CMProxyGeneratedObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$


	/**
	 * Returns the value of the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Id</em>' attribute.
	 * @see #setUniqueId(String)
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyTestCase_UniqueId()
	 * @model
	 * @generated
	 */
	String getUniqueId();

	/**
	 * Sets the value of the '{@link biz.bi.cmcore.model.CMProxyTestCase#getUniqueId <em>Unique Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Id</em>' attribute.
	 * @see #getUniqueId()
	 * @generated
	 */
	void setUniqueId(String value);

	/**
	 * Returns the value of the '<em><b>MTest Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MTest Case</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MTest Case</em>' attribute.
	 * @see #setM_TestCase(TestCase)
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyTestCase_M_TestCase()
	 * @model dataType="biz.bi.cmcore.model.TestCase"
	 * @generated
	 */
	TestCase getM_TestCase();

	/**
	 * Sets the value of the '{@link biz.bi.cmcore.model.CMProxyTestCase#getM_TestCase <em>MTest Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MTest Case</em>' attribute.
	 * @see #getM_TestCase()
	 * @generated
	 */
	void setM_TestCase(TestCase value);

	/**
	 * Returns the value of the '<em><b>Proxy Test Object</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link biz.bi.cmcore.model.CMProxyTestObject#getProxyTestCase <em>Proxy Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Test Object</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Test Object</em>' container reference.
	 * @see #setProxyTestObject(CMProxyTestObject)
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyTestCase_ProxyTestObject()
	 * @see biz.bi.cmcore.model.CMProxyTestObject#getProxyTestCase
	 * @model opposite="proxyTestCase"
	 * @generated
	 */
	CMProxyTestObject getProxyTestObject();

	/**
	 * Sets the value of the '{@link biz.bi.cmcore.model.CMProxyTestCase#getProxyTestObject <em>Proxy Test Object</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy Test Object</em>' container reference.
	 * @see #getProxyTestObject()
	 * @generated
	 */
	void setProxyTestObject(CMProxyTestObject value);

	/**
	 * Returns the value of the '<em><b>Proxy Combination</b></em>' reference list.
	 * The list contents are of type {@link biz.bi.cmcore.model.CMProxyCombination}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Combination</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Combination</em>' reference list.
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyTestCase_ProxyCombination()
	 * @model type="biz.bi.cmcore.model.CMProxyCombination"
	 * @generated
	 */
	EList getProxyCombination();

	/**
	 * Returns the value of the '<em><b>Proxy Equivalence Class</b></em>' reference list.
	 * The list contents are of type {@link biz.bi.cmcore.model.CMProxyEquivalenceClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Equivalence Class</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Equivalence Class</em>' reference list.
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyTestCase_ProxyEquivalenceClass()
	 * @model type="biz.bi.cmcore.model.CMProxyEquivalenceClass"
	 * @generated
	 */
	EList getProxyEquivalenceClass();

	/**
	 * @param p_child
	 * @param p_doCMModel
	 */
	void addProxyEquivalenceClass(CMProxyEquivalenceClass p_child, boolean p_doCMModel);

	/**
	 * @param p_child
	 * @param p_doCMModel
	 */
	void removeProxyEquivalenceClass(CMProxyEquivalenceClass p_child, boolean p_doCMModel);

	/**
	 * @param p_child
	 * @param p_doCMModel
	 */
	void addProxyCombination(CMProxyCombination p_child, boolean p_doCMModel);

	/**
	 * @param p_child
	 * @param p_doCMModel
	 */
	void removeProxyCombination(CMProxyCombination p_child, boolean p_doCMModel);

} // CMProxyTestCase
