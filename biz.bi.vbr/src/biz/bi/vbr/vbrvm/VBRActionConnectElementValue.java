/**
 * <copyright>
 * </copyright>
 *
 * $Id: VBRActionConnectElementValue.java,v 1.2 2005/09/01 22:17:38 hcanedo Exp $
 */
package biz.bi.vbr.vbrvm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VBR Action Connect Element Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.vbr.vbrvm.VBRActionConnectElementValue#getSourceACT <em>Source ACT</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.VBRActionConnectElementValue#getTargetEV <em>Target EV</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRActionConnectElementValue()
 * @model
 * @generated
 */
public interface VBRActionConnectElementValue extends AbstractLine {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Source ACT</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source ACT</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source ACT</em>' reference.
	 * @see #setSourceACT(VBRActionView)
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRActionConnectElementValue_SourceACT()
	 * @model required="true"
	 * @generated
	 */
	VBRActionView getSourceACT();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.vbrvm.VBRActionConnectElementValue#getSourceACT <em>Source ACT</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source ACT</em>' reference.
	 * @see #getSourceACT()
	 * @generated
	 */
	void setSourceACT(VBRActionView value);

	/**
	 * Returns the value of the '<em><b>Target EV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target EV</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target EV</em>' reference.
	 * @see #setTargetEV(VBRElementValueView)
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRActionConnectElementValue_TargetEV()
	 * @model required="true"
	 * @generated
	 */
	VBRElementValueView getTargetEV();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.vbrvm.VBRActionConnectElementValue#getTargetEV <em>Target EV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target EV</em>' reference.
	 * @see #getTargetEV()
	 * @generated
	 */
	void setTargetEV(VBRElementValueView value);

} // VBRActionConnectElementValue
