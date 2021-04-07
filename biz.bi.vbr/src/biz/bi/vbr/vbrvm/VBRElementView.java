/**
 * <copyright>
 * </copyright>
 *
 * $Id: VBRElementView.java,v 1.4 2005/09/20 14:35:07 hcanedo Exp $
 */
package biz.bi.vbr.vbrvm;

import biz.bi.vbr.BusinessObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VBR Element View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.vbr.vbrvm.VBRElementView#getM_MainDiagram <em>MMain Diagram</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.VBRElementView#getM_BObjectM <em>MBObject M</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.VBRElementView#getM_VBRElementConnectElementValue <em>MVBR Element Connect Element Value</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.VBRElementView#getM_ElementValue <em>MElement Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRElementView()
 * @model
 * @generated
 */
public interface VBRElementView extends AbstractView {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>MMain Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link biz.bi.vbr.vbrvm.MainDiagram#getM_VBRElementView <em>MVBR Element View</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MMain Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMain Diagram</em>' container reference.
	 * @see #setM_MainDiagram(MainDiagram)
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRElementView_M_MainDiagram()
	 * @see biz.bi.vbr.vbrvm.MainDiagram#getM_VBRElementView
	 * @model opposite="m_VBRElementView" required="true"
	 * @generated
	 */
	MainDiagram getM_MainDiagram();

	//svonborries 12102005 begin
	public static final int WIDTH_DEFAULT = 100;

	public static final int HEIGHT_DEFAULT = 30;

	//svonborries 12102005 end

	/**
	 * Sets the value of the '{@link biz.bi.vbr.vbrvm.VBRElementView#getM_MainDiagram <em>MMain Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MMain Diagram</em>' container reference.
	 * @see #getM_MainDiagram()
	 * @generated
	 */
	void setM_MainDiagram(MainDiagram value);

	/**
	 * Returns the value of the '<em><b>MBObject M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MBObject M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MBObject M</em>' attribute.
	 * @see #setM_BObjectM(BusinessObject)
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRElementView_M_BObjectM()
	 * @model dataType="biz.bi.vbr.vbrvm.BMBusinessObject" required="true"
	 * @generated
	 */
	BusinessObject getM_BObjectM();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.vbrvm.VBRElementView#getM_BObjectM <em>MBObject M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MBObject M</em>' attribute.
	 * @see #getM_BObjectM()
	 * @generated
	 */
	void setM_BObjectM(BusinessObject value);

	/**
	 * Returns the value of the '<em><b>MVBR Element Connect Element Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MVBR Element Connect Element Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MVBR Element Connect Element Value</em>' reference.
	 * @see #setM_VBRElementConnectElementValue(VBRElementConnectElementValue)
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRElementView_M_VBRElementConnectElementValue()
	 * @model required="true"
	 * @generated
	 */
	VBRElementConnectElementValue getM_VBRElementConnectElementValue();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.vbrvm.VBRElementView#getM_VBRElementConnectElementValue <em>MVBR Element Connect Element Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MVBR Element Connect Element Value</em>' reference.
	 * @see #getM_VBRElementConnectElementValue()
	 * @generated
	 */
	void setM_VBRElementConnectElementValue(VBRElementConnectElementValue value);

	/**
	 * Returns the value of the '<em><b>MElement Value</b></em>' reference list.
	 * The list contents are of type {@link biz.bi.vbr.vbrvm.VBRElementValueView}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MElement Value</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MElement Value</em>' reference list.
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRElementView_M_ElementValue()
	 * @model type="biz.bi.vbr.vbrvm.VBRElementValueView" required="true"
	 * @generated
	 */
	EList getM_ElementValue();

} // VBRElementView
