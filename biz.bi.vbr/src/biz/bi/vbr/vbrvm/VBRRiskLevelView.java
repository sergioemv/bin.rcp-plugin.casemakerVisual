/**
 * <copyright>
 * </copyright>
 *
 * $Id: VBRRiskLevelView.java,v 1.2 2005/09/01 22:17:38 hcanedo Exp $
 */
package biz.bi.vbr.vbrvm;

import biz.bi.vbr.RiskLevel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.swt.graphics.Color;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VBR Risk Level View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.vbr.vbrvm.VBRRiskLevelView#getM_VBRActionView <em>MVBR Action View</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.VBRRiskLevelView#getM_BRElementValueView <em>MBR Element Value View</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.VBRRiskLevelView#getColor <em>Color</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.VBRRiskLevelView#getM_RiskLm <em>MRisk Lm</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRRiskLevelView()
 * @model
 * @generated
 */
public interface VBRRiskLevelView extends AbstractView {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>MVBR Action View</b></em>' reference list.
	 * The list contents are of type {@link biz.bi.vbr.vbrvm.VBRActionView}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MVBR Action View</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MVBR Action View</em>' reference list.
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRRiskLevelView_M_VBRActionView()
	 * @model type="biz.bi.vbr.vbrvm.VBRActionView"
	 * @generated
	 */
	EList getM_VBRActionView();

	/**
	 * Returns the value of the '<em><b>MBR Element Value View</b></em>' reference list.
	 * The list contents are of type {@link biz.bi.vbr.vbrvm.VBRElementValueView}.
	 * It is bidirectional and its opposite is '{@link biz.bi.vbr.vbrvm.VBRElementValueView#getM_VBRRiskLevelView <em>MVBR Risk Level View</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MBR Element Value View</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MBR Element Value View</em>' reference list.
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRRiskLevelView_M_BRElementValueView()
	 * @see biz.bi.vbr.vbrvm.VBRElementValueView#getM_VBRRiskLevelView
	 * @model type="biz.bi.vbr.vbrvm.VBRElementValueView" opposite="m_VBRRiskLevelView" required="true"
	 * @generated
	 */
	EList getM_BRElementValueView();

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
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRRiskLevelView_Color()
	 * @model dataType="biz.bi.vbr.vbrvm.Color"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.vbrvm.VBRRiskLevelView#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Returns the value of the '<em><b>MRisk Lm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MRisk Lm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MRisk Lm</em>' attribute.
	 * @see #setM_RiskLm(RiskLevel)
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRRiskLevelView_M_RiskLm()
	 * @model dataType="biz.bi.vbr.vbrvm.bmRiskLevel" required="true"
	 * @generated
	 */
	RiskLevel getM_RiskLm();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.vbrvm.VBRRiskLevelView#getM_RiskLm <em>MRisk Lm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MRisk Lm</em>' attribute.
	 * @see #getM_RiskLm()
	 * @generated
	 */
	void setM_RiskLm(RiskLevel value);

} // VBRRiskLevelView
