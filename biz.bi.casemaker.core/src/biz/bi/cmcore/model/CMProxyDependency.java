/**
 * <copyright>
 * </copyright>
 *
 * $Id: CMProxyDependency.java,v 1.11 2005/09/20 15:08:08 smoreno Exp $
 */
package biz.bi.cmcore.model;

import model.Dependency;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proxy Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.cmcore.model.CMProxyDependency#getM_Dependency <em>MDependency</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.CMProxyDependency#getProxyElement <em>Proxy Element</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.CMProxyDependency#getProxyCombination <em>Proxy Combination</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.CMProxyDependency#getProxyTestObject <em>Proxy Test Object</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.CMProxyDependency#getUniqueId <em>Unique Id</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.CMProxyDependency#getProxyEquivalenceClass <em>Proxy Equivalence Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyDependency()
 * @model
 * @generated
 */
public interface CMProxyDependency extends CMProxyObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>MDependency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MDependency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MDependency</em>' attribute.
	 * @see #setM_Dependency(Dependency)
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyDependency_M_Dependency()
	 * @model dataType="biz.bi.cmcore.model.Dependency" required="true" transient="true"
	 * @generated
	 */
	Dependency getM_Dependency();

	/**
	 * Sets the value of the '{@link biz.bi.cmcore.model.CMProxyDependency#getM_Dependency <em>MDependency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MDependency</em>' attribute.
	 * @see #getM_Dependency()
	 * @generated
	 */
	void setM_Dependency(Dependency value);

	/**
	 * Returns the value of the '<em><b>Proxy Element</b></em>' reference list.
	 * The list contents are of type {@link biz.bi.cmcore.model.CMProxyElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Element</em>' reference list.
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyDependency_ProxyElement()
	 * @model type="biz.bi.cmcore.model.CMProxyElement" transient="true"
	 * @generated
	 */
	EList getProxyElement();

	/**
	 * Returns the value of the '<em><b>Proxy Combination</b></em>' containment reference list.
	 * The list contents are of type {@link biz.bi.cmcore.model.CMProxyCombination}.
	 * It is bidirectional and its opposite is '{@link biz.bi.cmcore.model.CMProxyCombination#getProxyDependency <em>Proxy Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Combination</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Combination</em>' containment reference list.
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyDependency_ProxyCombination()
	 * @see biz.bi.cmcore.model.CMProxyCombination#getProxyDependency
	 * @model type="biz.bi.cmcore.model.CMProxyCombination" opposite="proxyDependency" containment="true" transient="true"
	 * @generated
	 */
	EList getProxyCombination();

	/**
	 * Returns the value of the '<em><b>Proxy Test Object</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link biz.bi.cmcore.model.CMProxyTestObject#getProxyDependency <em>Proxy Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Test Object</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Test Object</em>' container reference.
	 * @see #setProxyTestObject(CMProxyTestObject)
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyDependency_ProxyTestObject()
	 * @see biz.bi.cmcore.model.CMProxyTestObject#getProxyDependency
	 * @model opposite="proxyDependency" required="true"
	 * @generated
	 */
	CMProxyTestObject getProxyTestObject();

	/**
	 * Sets the value of the '{@link biz.bi.cmcore.model.CMProxyDependency#getProxyTestObject <em>Proxy Test Object</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy Test Object</em>' container reference.
	 * @see #getProxyTestObject()
	 * @generated
	 */
	void setProxyTestObject(CMProxyTestObject value);

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
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyDependency_UniqueId()
	 * @model
	 * @generated
	 */
	String getUniqueId();

	/**
	 * Sets the value of the '{@link biz.bi.cmcore.model.CMProxyDependency#getUniqueId <em>Unique Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Id</em>' attribute.
	 * @see #getUniqueId()
	 * @generated
	 */
	void setUniqueId(String value);

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
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyDependency_ProxyEquivalenceClass()
	 * @model type="biz.bi.cmcore.model.CMProxyEquivalenceClass"
	 * @generated
	 */
	EList getProxyEquivalenceClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getLabel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setLabel(String p_Label);

	void addProxyElement(CMProxyElement p_ProxyElement, boolean doCMModel);

	void removeProxyElement(CMProxyElement p_ProxyElement, boolean doCMModel);

	/**
	 * remove a combination from a dependency
	 * @param p_combination
	 */
	void removeProxyCombination(CMProxyCombination p_combination,
			boolean doCMModel);

	/**
	 * @param p_combination
	 */
	void addProxyCombination(CMProxyCombination p_combination, boolean doCMModel);

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

} // CMProxyDependency
