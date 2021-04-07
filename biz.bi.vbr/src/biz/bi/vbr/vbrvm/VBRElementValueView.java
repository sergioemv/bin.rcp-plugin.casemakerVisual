/**
 * <copyright>
 * </copyright>
 *
 * $Id: VBRElementValueView.java,v 1.3 2005/09/20 14:35:07 hcanedo Exp $
 */
package biz.bi.vbr.vbrvm;

import biz.bi.vbr.BusinessValue;

import org.eclipse.emf.common.util.EList;

import org.eclipse.swt.graphics.Color;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VBR Element Value View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.vbr.vbrvm.VBRElementValueView#getM_MainDiagram <em>MMain Diagram</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.VBRElementValueView#getM_VBRElementValueConnectAction <em>MVBR Element Value Connect Action</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.VBRElementValueView#getEColor <em>EColor</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.VBRElementValueView#getM_bvaluem <em>Mbvaluem</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.VBRElementValueView#getM_VBRElementValueConnectElementValue <em>MVBR Element Value Connect Element Value</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.VBRElementValueView#getM_ElementView <em>MElement View</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRElementValueView()
 * @model
 * @generated
 */
public interface VBRElementValueView extends AbstractView {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>MMain Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link biz.bi.vbr.vbrvm.MainDiagram#getM_VBRElementValueView <em>MVBR Element Value View</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MMain Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMain Diagram</em>' container reference.
	 * @see #setM_MainDiagram(MainDiagram)
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRElementValueView_M_MainDiagram()
	 * @see biz.bi.vbr.vbrvm.MainDiagram#getM_VBRElementValueView
	 * @model opposite="m_VBRElementValueView" required="true"
	 * @generated
	 */
	MainDiagram getM_MainDiagram();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.vbrvm.VBRElementValueView#getM_MainDiagram <em>MMain Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MMain Diagram</em>' container reference.
	 * @see #getM_MainDiagram()
	 * @generated
	 */
	void setM_MainDiagram(MainDiagram value);

	/**
	 * Returns the value of the '<em><b>MVBR Element Value Connect Action</b></em>' reference list.
	 * The list contents are of type {@link biz.bi.vbr.vbrvm.VBRElementValueConnectAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MVBR Element Value Connect Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MVBR Element Value Connect Action</em>' reference list.
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRElementValueView_M_VBRElementValueConnectAction()
	 * @model type="biz.bi.vbr.vbrvm.VBRElementValueConnectAction" required="true"
	 * @generated
	 */
	EList getM_VBRElementValueConnectAction();

	/**
	 * Returns the value of the '<em><b>EColor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EColor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EColor</em>' attribute.
	 * @see #setEColor(Color)
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRElementValueView_EColor()
	 * @model dataType="biz.bi.vbr.vbrvm.Color"
	 * @generated
	 */
	Color getEColor();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.vbrvm.VBRElementValueView#getEColor <em>EColor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EColor</em>' attribute.
	 * @see #getEColor()
	 * @generated
	 */
	void setEColor(Color value);

	/**
	 * Returns the value of the '<em><b>Mbvaluem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mbvaluem</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mbvaluem</em>' attribute.
	 * @see #setM_bvaluem(BusinessValue)
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRElementValueView_M_bvaluem()
	 * @model dataType="biz.bi.vbr.vbrvm.BMBusinessValue" required="true"
	 * @generated
	 */
	BusinessValue getM_bvaluem();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.vbrvm.VBRElementValueView#getM_bvaluem <em>Mbvaluem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mbvaluem</em>' attribute.
	 * @see #getM_bvaluem()
	 * @generated
	 */
	void setM_bvaluem(BusinessValue value);

	/**
	 * Returns the value of the '<em><b>MVBR Element Value Connect Element Value</b></em>' reference list.
	 * The list contents are of type {@link biz.bi.vbr.vbrvm.VBRElementValueConnectElementValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MVBR Element Value Connect Element Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MVBR Element Value Connect Element Value</em>' reference list.
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRElementValueView_M_VBRElementValueConnectElementValue()
	 * @model type="biz.bi.vbr.vbrvm.VBRElementValueConnectElementValue" required="true"
	 * @generated
	 */
	EList getM_VBRElementValueConnectElementValue();

	/**
	 * Returns the value of the '<em><b>MElement View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MElement View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MElement View</em>' reference.
	 * @see #setM_ElementView(VBRElementView)
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRElementValueView_M_ElementView()
	 * @model required="true"
	 * @generated
	 */
	VBRElementView getM_ElementView();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.vbrvm.VBRElementValueView#getM_ElementView <em>MElement View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MElement View</em>' reference.
	 * @see #getM_ElementView()
	 * @generated
	 */
	void setM_ElementView(VBRElementView value);

} // VBRElementValueView
