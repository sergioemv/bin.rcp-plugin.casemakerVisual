/**
 * <copyright>
 * </copyright>
 *
 * $Id: VBRActionView.java,v 1.2 2005/09/01 22:17:38 hcanedo Exp $
 */
package biz.bi.vbr.vbrvm;

import biz.bi.vbr.BusinessAction;

import org.eclipse.swt.graphics.Color;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VBR Action View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.vbr.vbrvm.VBRActionView#getColor <em>Color</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.VBRActionView#getIcon <em>Icon</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.VBRActionView#getM_BActionm <em>MBActionm</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.VBRActionView#getM_VBRActionConnectElementValue <em>MVBR Action Connect Element Value</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.VBRActionView#getM_MainDiagram <em>MMain Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRActionView()
 * @model
 * @generated
 */
public interface VBRActionView extends AbstractView {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(Color)
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRActionView_Color()
	 * @model dataType="biz.bi.vbr.vbrvm.Color"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.vbrvm.VBRActionView#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(String)
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRActionView_Icon()
	 * @model
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.vbrvm.VBRActionView#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(String value);

	/**
	 * Returns the value of the '<em><b>MBActionm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MBActionm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MBActionm</em>' attribute.
	 * @see #setM_BActionm(BusinessAction)
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRActionView_M_BActionm()
	 * @model dataType="biz.bi.vbr.vbrvm.BMBusinessAction" required="true"
	 * @generated
	 */
	BusinessAction getM_BActionm();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.vbrvm.VBRActionView#getM_BActionm <em>MBActionm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MBActionm</em>' attribute.
	 * @see #getM_BActionm()
	 * @generated
	 */
	void setM_BActionm(BusinessAction value);

	/**
	 * Returns the value of the '<em><b>MVBR Action Connect Element Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MVBR Action Connect Element Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MVBR Action Connect Element Value</em>' reference.
	 * @see #setM_VBRActionConnectElementValue(VBRActionConnectElementValue)
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRActionView_M_VBRActionConnectElementValue()
	 * @model required="true"
	 * @generated
	 */
	VBRActionConnectElementValue getM_VBRActionConnectElementValue();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.vbrvm.VBRActionView#getM_VBRActionConnectElementValue <em>MVBR Action Connect Element Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MVBR Action Connect Element Value</em>' reference.
	 * @see #getM_VBRActionConnectElementValue()
	 * @generated
	 */
	void setM_VBRActionConnectElementValue(VBRActionConnectElementValue value);

	/**
	 * Returns the value of the '<em><b>MMain Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MMain Diagram</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMain Diagram</em>' reference.
	 * @see #setM_MainDiagram(MainDiagram)
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRActionView_M_MainDiagram()
	 * @model required="true"
	 * @generated
	 */
	MainDiagram getM_MainDiagram();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.vbrvm.VBRActionView#getM_MainDiagram <em>MMain Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MMain Diagram</em>' reference.
	 * @see #getM_MainDiagram()
	 * @generated
	 */
	void setM_MainDiagram(MainDiagram value);

} // VBRActionView
