/**
 * <copyright>
 * </copyright>
 *
 * $Id: VBRTreeConnectElementValue.java,v 1.2 2005/09/01 22:17:38 hcanedo Exp $
 */
package biz.bi.vbr.vbrvm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VBR Tree Connect Element Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.vbr.vbrvm.VBRTreeConnectElementValue#getSourceTr <em>Source Tr</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.VBRTreeConnectElementValue#getTargetEV <em>Target EV</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRTreeConnectElementValue()
 * @model
 * @generated
 */
public interface VBRTreeConnectElementValue extends AbstractLine {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Source Tr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Tr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Tr</em>' reference.
	 * @see #setSourceTr(VBRTreeView)
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRTreeConnectElementValue_SourceTr()
	 * @model required="true"
	 * @generated
	 */
	VBRTreeView getSourceTr();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.vbrvm.VBRTreeConnectElementValue#getSourceTr <em>Source Tr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Tr</em>' reference.
	 * @see #getSourceTr()
	 * @generated
	 */
	void setSourceTr(VBRTreeView value);

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
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRTreeConnectElementValue_TargetEV()
	 * @model required="true"
	 * @generated
	 */
	VBRElementValueView getTargetEV();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.vbrvm.VBRTreeConnectElementValue#getTargetEV <em>Target EV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target EV</em>' reference.
	 * @see #getTargetEV()
	 * @generated
	 */
	void setTargetEV(VBRElementValueView value);

} // VBRTreeConnectElementValue
