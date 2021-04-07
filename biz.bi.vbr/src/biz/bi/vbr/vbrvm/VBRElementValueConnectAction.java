/**
 * <copyright>
 * </copyright>
 *
 * $Id: VBRElementValueConnectAction.java,v 1.2 2005/09/01 22:17:38 hcanedo Exp $
 */
package biz.bi.vbr.vbrvm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VBR Element Value Connect Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.vbr.vbrvm.VBRElementValueConnectAction#getSourceE <em>Source E</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.VBRElementValueConnectAction#getTargetACT <em>Target ACT</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRElementValueConnectAction()
 * @model
 * @generated
 */
public interface VBRElementValueConnectAction extends AbstractLine {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Source E</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source E</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source E</em>' reference.
	 * @see #setSourceE(VBRElementValueView)
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRElementValueConnectAction_SourceE()
	 * @model required="true"
	 * @generated
	 */
	VBRElementValueView getSourceE();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.vbrvm.VBRElementValueConnectAction#getSourceE <em>Source E</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source E</em>' reference.
	 * @see #getSourceE()
	 * @generated
	 */
	void setSourceE(VBRElementValueView value);

	/**
	 * Returns the value of the '<em><b>Target ACT</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target ACT</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target ACT</em>' reference.
	 * @see #setTargetACT(VBRActionView)
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRElementValueConnectAction_TargetACT()
	 * @model required="true"
	 * @generated
	 */
	VBRActionView getTargetACT();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.vbrvm.VBRElementValueConnectAction#getTargetACT <em>Target ACT</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target ACT</em>' reference.
	 * @see #getTargetACT()
	 * @generated
	 */
	void setTargetACT(VBRActionView value);

} // VBRElementValueConnectAction
