/**
 * <copyright>
 * </copyright>
 *
 * $Id: VBRElementValueConnectElementValue.java,v 1.2 2005/09/01 22:17:38 hcanedo Exp $
 */
package biz.bi.vbr.vbrvm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VBR Element Value Connect Element Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.vbr.vbrvm.VBRElementValueConnectElementValue#getEVSource <em>EV Source</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.VBRElementValueConnectElementValue#getEVTarget <em>EV Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRElementValueConnectElementValue()
 * @model
 * @generated
 */
public interface VBRElementValueConnectElementValue extends AbstractLine {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>EV Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EV Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EV Source</em>' reference.
	 * @see #setEVSource(VBRElementValueView)
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRElementValueConnectElementValue_EVSource()
	 * @model required="true"
	 * @generated
	 */
	VBRElementValueView getEVSource();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.vbrvm.VBRElementValueConnectElementValue#getEVSource <em>EV Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EV Source</em>' reference.
	 * @see #getEVSource()
	 * @generated
	 */
	void setEVSource(VBRElementValueView value);

	/**
	 * Returns the value of the '<em><b>EV Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EV Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EV Target</em>' reference.
	 * @see #setEVTarget(VBRElementValueView)
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRElementValueConnectElementValue_EVTarget()
	 * @model required="true"
	 * @generated
	 */
	VBRElementValueView getEVTarget();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.vbrvm.VBRElementValueConnectElementValue#getEVTarget <em>EV Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EV Target</em>' reference.
	 * @see #getEVTarget()
	 * @generated
	 */
	void setEVTarget(VBRElementValueView value);

} // VBRElementValueConnectElementValue
