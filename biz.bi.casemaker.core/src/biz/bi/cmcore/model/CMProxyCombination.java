/**
 * <copyright>
 * </copyright>
 *
 * $Id: CMProxyCombination.java,v 1.15 2005/09/20 15:08:08 smoreno Exp $
 */
package biz.bi.cmcore.model;

import model.Combination;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proxy Combination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.cmcore.model.CMProxyCombination#getM_Combination <em>MCombination</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.CMProxyCombination#getProxyDependency <em>Proxy Dependency</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.CMProxyCombination#getProxyEquivalenceClass <em>Proxy Equivalence Class</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.CMProxyCombination#getProxyEffect <em>Proxy Effect</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.CMProxyCombination#getUniqueId <em>Unique Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyCombination()
 * @model
 * @generated
 */
public interface CMProxyCombination extends CMProxyObject, CMProxyRiskObject,
		CMProxyGeneratedObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>MCombination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MCombination</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MCombination</em>' attribute.
	 * @see #setM_Combination(Combination)
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyCombination_M_Combination()
	 * @model dataType="biz.bi.cmcore.model.Combination" required="true" transient="true"
	 * @generated
	 */
	Combination getM_Combination();

	/**
	 * Sets the value of the '{@link biz.bi.cmcore.model.CMProxyCombination#getM_Combination <em>MCombination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MCombination</em>' attribute.
	 * @see #getM_Combination()
	 * @generated
	 */
	void setM_Combination(Combination value);

	/**
	 * Returns the value of the '<em><b>Proxy Dependency</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link biz.bi.cmcore.model.CMProxyDependency#getProxyCombination <em>Proxy Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Dependency</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Dependency</em>' container reference.
	 * @see #setProxyDependency(CMProxyDependency)
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyCombination_ProxyDependency()
	 * @see biz.bi.cmcore.model.CMProxyDependency#getProxyCombination
	 * @model opposite="proxyCombination" required="true"
	 * @generated
	 */
	CMProxyDependency getProxyDependency();

	/**
	 * Sets the value of the '{@link biz.bi.cmcore.model.CMProxyCombination#getProxyDependency <em>Proxy Dependency</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy Dependency</em>' container reference.
	 * @see #getProxyDependency()
	 * @generated
	 */
	void setProxyDependency(CMProxyDependency value);

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
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyCombination_ProxyEquivalenceClass()
	 * @model type="biz.bi.cmcore.model.CMProxyEquivalenceClass" transient="true"
	 * @generated
	 */
	EList getProxyEquivalenceClass();

	/**
	 * Returns the value of the '<em><b>Proxy Effect</b></em>' reference list.
	 * The list contents are of type {@link biz.bi.cmcore.model.CMProxyEffect}.
	 * It is bidirectional and its opposite is '{@link biz.bi.cmcore.model.CMProxyEffect#getProxyCombination <em>Proxy Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Effect</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Effect</em>' reference list.
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyCombination_ProxyEffect()
	 * @see biz.bi.cmcore.model.CMProxyEffect#getProxyCombination
	 * @model type="biz.bi.cmcore.model.CMProxyEffect" opposite="proxyCombination" transient="true"
	 * @generated
	 */
	EList getProxyEffect();

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
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyCombination_UniqueId()
	 * @model
	 * @generated
	 */
	String getUniqueId();

	/**
	 * Sets the value of the '{@link biz.bi.cmcore.model.CMProxyCombination#getUniqueId <em>Unique Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Id</em>' attribute.
	 * @see #getUniqueId()
	 * @generated
	 */
	void setUniqueId(String value);

	void addProxyEquivalenceClass(
			CMProxyEquivalenceClass p_ProxyEquivalenceClass, boolean doCMModel);

	void removeProxyEquivalenceClass(
			CMProxyEquivalenceClass p_ProxyEquivalenceClass, boolean doCMModel);

	/**
	 * @param p_child
	 */
	void addProxyEffect(CMProxyEffect p_child, boolean doCMModel);

	/**
	 * @param p_child
	 */
	void removeProxyEffect(CMProxyEffect p_child, boolean doCMModel);

} // CMProxyCombination
