/**
 * <copyright>
 * </copyright>
 *
 * $Id: CMProxyEquivalenceClass.java,v 1.11 2005/09/20 15:08:08 smoreno Exp $
 */
package biz.bi.cmcore.model;

import model.EquivalenceClass;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proxy Equivalence Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.cmcore.model.CMProxyEquivalenceClass#getM_EquivalenceClass <em>MEquivalence Class</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.CMProxyEquivalenceClass#getProxyElement <em>Proxy Element</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.CMProxyEquivalenceClass#getProxyEffect <em>Proxy Effect</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.CMProxyEquivalenceClass#getUniqueId <em>Unique Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyEquivalenceClass()
 * @model
 * @generated
 */
public interface CMProxyEquivalenceClass extends CMProxyObject,
		CMProxyRiskObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>MEquivalence Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MEquivalence Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MEquivalence Class</em>' attribute.
	 * @see #setM_EquivalenceClass(EquivalenceClass)
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyEquivalenceClass_M_EquivalenceClass()
	 * @model dataType="biz.bi.cmcore.model.EquivalenceClass" required="true" transient="true"
	 * @generated
	 */
	EquivalenceClass getM_EquivalenceClass();

	/**
	 * Sets the value of the '{@link biz.bi.cmcore.model.CMProxyEquivalenceClass#getM_EquivalenceClass <em>MEquivalence Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MEquivalence Class</em>' attribute.
	 * @see #getM_EquivalenceClass()
	 * @generated
	 */
	void setM_EquivalenceClass(EquivalenceClass value);

	/**
	 * Returns the value of the '<em><b>Proxy Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link biz.bi.cmcore.model.CMProxyElement#getProxyEquivalenceClass <em>Proxy Equivalence Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Element</em>' container reference.
	 * @see #setProxyElement(CMProxyElement)
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyEquivalenceClass_ProxyElement()
	 * @see biz.bi.cmcore.model.CMProxyElement#getProxyEquivalenceClass
	 * @model opposite="proxyEquivalenceClass" required="true"
	 * @generated
	 */
	CMProxyElement getProxyElement();

	/**
	 * Sets the value of the '{@link biz.bi.cmcore.model.CMProxyEquivalenceClass#getProxyElement <em>Proxy Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy Element</em>' container reference.
	 * @see #getProxyElement()
	 * @generated
	 */
	void setProxyElement(CMProxyElement value);

	/**
	 * Returns the value of the '<em><b>Proxy Effect</b></em>' reference list.
	 * The list contents are of type {@link biz.bi.cmcore.model.CMProxyEffect}.
	 * It is bidirectional and its opposite is '{@link biz.bi.cmcore.model.CMProxyEffect#getProxyEquivalenceClass <em>Proxy Equivalence Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Effect</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Effect</em>' reference list.
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyEquivalenceClass_ProxyEffect()
	 * @see biz.bi.cmcore.model.CMProxyEffect#getProxyEquivalenceClass
	 * @model type="biz.bi.cmcore.model.CMProxyEffect" opposite="proxyEquivalenceClass"
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
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyEquivalenceClass_UniqueId()
	 * @model
	 * @generated
	 */
	String getUniqueId();

	/**
	 * Sets the value of the '{@link biz.bi.cmcore.model.CMProxyEquivalenceClass#getUniqueId <em>Unique Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Id</em>' attribute.
	 * @see #getUniqueId()
	 * @generated
	 */
	void setUniqueId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getStateName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated NOT
	 * @author hcanedo
	 */
	void setRiskLevel(int p_RiskLevel);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setValue(String p_Value);

	/**
	 * @param p_child
	 */
	void addProxyEffect(CMProxyEffect p_child, boolean doCMModel);

	/**
	 * @param p_child
	 */
	void removeProxyEffect(CMProxyEffect p_child, boolean doCMModel);

} // CMProxyEquivalenceClass
