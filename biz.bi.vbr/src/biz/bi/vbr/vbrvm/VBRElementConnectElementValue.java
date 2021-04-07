/**
 * <copyright>
 * </copyright>
 *
 * $Id: VBRElementConnectElementValue.java,v 1.2 2005/09/01 22:17:38 hcanedo Exp $
 */
package biz.bi.vbr.vbrvm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VBR Element Connect Element Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.vbr.vbrvm.VBRElementConnectElementValue#getESource <em>ESource</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.VBRElementConnectElementValue#getEVTarget <em>EV Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRElementConnectElementValue()
 * @model
 * @generated
 */
public interface VBRElementConnectElementValue extends AbstractLine {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>ESource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ESource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ESource</em>' reference.
	 * @see #setESource(VBRElementView)
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRElementConnectElementValue_ESource()
	 * @model required="true"
	 * @generated
	 */
	VBRElementView getESource();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.vbrvm.VBRElementConnectElementValue#getESource <em>ESource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ESource</em>' reference.
	 * @see #getESource()
	 * @generated
	 */
	void setESource(VBRElementView value);

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
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRElementConnectElementValue_EVTarget()
	 * @model required="true"
	 * @generated
	 */
	VBRElementValueView getEVTarget();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.vbrvm.VBRElementConnectElementValue#getEVTarget <em>EV Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EV Target</em>' reference.
	 * @see #getEVTarget()
	 * @generated
	 */
	void setEVTarget(VBRElementValueView value);

} // VBRElementConnectElementValue
