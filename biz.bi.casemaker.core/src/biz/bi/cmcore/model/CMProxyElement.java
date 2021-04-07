/**
 * <copyright>
 * </copyright>
 *
 * $Id: CMProxyElement.java,v 1.11 2005/08/25 19:27:47 smoreno Exp $
 */
package biz.bi.cmcore.model;

import model.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proxy Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.cmcore.model.CMProxyElement#getM_Element <em>MElement</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.CMProxyElement#getProxyTestObject <em>Proxy Test Object</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.CMProxyElement#getProxyEquivalenceClass <em>Proxy Equivalence Class</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.CMProxyElement#getUniqueId <em>Unique Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyElement()
 * @model
 * @generated
 */
public interface CMProxyElement extends CMProxyObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>MElement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MElement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MElement</em>' attribute.
	 * @see #setM_Element(Element)
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyElement_M_Element()
	 * @model dataType="biz.bi.cmcore.model.Element" required="true" transient="true"
	 * @generated
	 */
	Element getM_Element();

	/**
	 * Sets the value of the '{@link biz.bi.cmcore.model.CMProxyElement#getM_Element <em>MElement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MElement</em>' attribute.
	 * @see #getM_Element()
	 * @generated
	 */
	void setM_Element(Element value);

	/**
	 * Returns the value of the '<em><b>Proxy Test Object</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link biz.bi.cmcore.model.CMProxyTestObject#getProxyElement <em>Proxy Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Test Object</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Test Object</em>' container reference.
	 * @see #setProxyTestObject(CMProxyTestObject)
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyElement_ProxyTestObject()
	 * @see biz.bi.cmcore.model.CMProxyTestObject#getProxyElement
	 * @model opposite="proxyElement" required="true"
	 * @generated
	 */
	CMProxyTestObject getProxyTestObject();

	/**
	 * Sets the value of the '{@link biz.bi.cmcore.model.CMProxyElement#getProxyTestObject <em>Proxy Test Object</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy Test Object</em>' container reference.
	 * @see #getProxyTestObject()
	 * @generated
	 */
	void setProxyTestObject(CMProxyTestObject value);

	/**
	 * Returns the value of the '<em><b>Proxy Equivalence Class</b></em>' containment reference list.
	 * The list contents are of type {@link biz.bi.cmcore.model.CMProxyEquivalenceClass}.
	 * It is bidirectional and its opposite is '{@link biz.bi.cmcore.model.CMProxyEquivalenceClass#getProxyElement <em>Proxy Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Equivalence Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Equivalence Class</em>' containment reference list.
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyElement_ProxyEquivalenceClass()
	 * @see biz.bi.cmcore.model.CMProxyEquivalenceClass#getProxyElement
	 * @model type="biz.bi.cmcore.model.CMProxyEquivalenceClass" opposite="proxyElement" containment="true" transient="true"
	 * @generated
	 */
	EList getProxyEquivalenceClass();

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
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyElement_UniqueId()
	 * @model
	 * @generated
	 */
	String getUniqueId();

	/**
	 * Sets the value of the '{@link biz.bi.cmcore.model.CMProxyElement#getUniqueId <em>Unique Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Id</em>' attribute.
	 * @see #getUniqueId()
	 * @generated
	 */
	void setUniqueId(String value);

	/**
	 * @param p_equivalenceClass
	 */
	void removeEquivalenceClass(CMProxyEquivalenceClass p_equivalenceClass,
			boolean doCMModel);

	/**
	 * @param p_equivalenceClass
	 */
	void addEquivalenceClass(CMProxyEquivalenceClass p_equivalenceClass,
			boolean doCMModel);

} // CMProxyElement
