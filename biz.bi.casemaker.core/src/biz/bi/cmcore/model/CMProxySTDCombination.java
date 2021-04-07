/**
 * <copyright>
 * </copyright>
 *
 * $Id: CMProxySTDCombination.java,v 1.2 2005/09/20 15:08:08 smoreno Exp $
 */
package biz.bi.cmcore.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CM Proxy STD Combination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.cmcore.model.CMProxySTDCombination#getProxyTestObject <em>Proxy Test Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxySTDCombination()
 * @model
 * @generated
 */
public interface CMProxySTDCombination extends CMProxyCombination {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Proxy Test Object</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link biz.bi.cmcore.model.CMProxyTestObject#getProxySTDCombination <em>Proxy STD Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Test Object</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Test Object</em>' container reference.
	 * @see #setProxyTestObject(CMProxyTestObject)
	 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxySTDCombination_ProxyTestObject()
	 * @see biz.bi.cmcore.model.CMProxyTestObject#getProxySTDCombination
	 * @model opposite="proxySTDCombination"
	 * @generated
	 */
	CMProxyTestObject getProxyTestObject();

	/**
	 * Sets the value of the '{@link biz.bi.cmcore.model.CMProxySTDCombination#getProxyTestObject <em>Proxy Test Object</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy Test Object</em>' container reference.
	 * @see #getProxyTestObject()
	 * @generated
	 */
	void setProxyTestObject(CMProxyTestObject value);

} // CMProxySTDCombination
