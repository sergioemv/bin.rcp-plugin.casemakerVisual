/**
 * <copyright>
 * </copyright>
 *
 * $Id: CMProxyEffect.java,v 1.7 2005/09/20 15:08:08 smoreno Exp $
 */
package biz.bi.cmcore.model;

import model.Effect;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proxy Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.cmcore.model.CMProxyEffect#getM_Effect <em>MEffect</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.CMProxyEffect#getProxyEquivalenceClass <em>Proxy Equivalence Class</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.CMProxyEffect#getProxyTestObject <em>Proxy Test Object</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.CMProxyEffect#getUniqueId <em>Unique Id</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.CMProxyEffect#getProxyCombination <em>Proxy Combination</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyEffect()
 * @model
 * @generated
 */
public interface CMProxyEffect extends CMProxyObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>MEffect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MEffect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MEffect</em>' attribute.
	 * @see #setM_Effect(Effect)
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyEffect_M_Effect()
	 * @model dataType="biz.bi.cmcore.model.Effect" required="true" transient="true"
	 * @generated
	 */
	Effect getM_Effect();

	/**
	 * Sets the value of the '{@link biz.bi.cmcore.model.CMProxyEffect#getM_Effect <em>MEffect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MEffect</em>' attribute.
	 * @see #getM_Effect()
	 * @generated
	 */
	void setM_Effect(Effect value);

	/**
	 * Returns the value of the '<em><b>Proxy Equivalence Class</b></em>' reference list.
	 * The list contents are of type {@link biz.bi.cmcore.model.CMProxyEquivalenceClass}.
	 * It is bidirectional and its opposite is '{@link biz.bi.cmcore.model.CMProxyEquivalenceClass#getProxyEffect <em>Proxy Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Equivalence Class</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Equivalence Class</em>' reference list.
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyEffect_ProxyEquivalenceClass()
	 * @see biz.bi.cmcore.model.CMProxyEquivalenceClass#getProxyEffect
	 * @model type="biz.bi.cmcore.model.CMProxyEquivalenceClass" opposite="proxyEffect"
	 * @generated
	 */
	EList getProxyEquivalenceClass();

	/**
	 * Returns the value of the '<em><b>Proxy Test Object</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link biz.bi.cmcore.model.CMProxyTestObject#getProxyEffect <em>Proxy Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Test Object</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Test Object</em>' container reference.
	 * @see #setProxyTestObject(CMProxyTestObject)
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyEffect_ProxyTestObject()
	 * @see biz.bi.cmcore.model.CMProxyTestObject#getProxyEffect
	 * @model opposite="proxyEffect" required="true"
	 * @generated
	 */
	CMProxyTestObject getProxyTestObject();

	/**
	 * Sets the value of the '{@link biz.bi.cmcore.model.CMProxyEffect#getProxyTestObject <em>Proxy Test Object</em>}' container reference.
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
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyEffect_UniqueId()
	 * @model
	 * @generated
	 */
	String getUniqueId();

	/**
	 * Sets the value of the '{@link biz.bi.cmcore.model.CMProxyEffect#getUniqueId <em>Unique Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Id</em>' attribute.
	 * @see #getUniqueId()
	 * @generated
	 */
	void setUniqueId(String value);

	/**
	 * Returns the value of the '<em><b>Proxy Combination</b></em>' reference list.
	 * The list contents are of type {@link biz.bi.cmcore.model.CMProxyCombination}.
	 * It is bidirectional and its opposite is '{@link biz.bi.cmcore.model.CMProxyCombination#getProxyEffect <em>Proxy Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Combination</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Combination</em>' reference list.
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyEffect_ProxyCombination()
	 * @see biz.bi.cmcore.model.CMProxyCombination#getProxyEffect
	 * @model type="biz.bi.cmcore.model.CMProxyCombination" opposite="proxyEffect"
	 * @generated
	 */
	EList getProxyCombination();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isUsed();

} // CMProxyEffect
