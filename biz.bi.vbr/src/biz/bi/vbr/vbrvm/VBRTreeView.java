/**
 * <copyright>
 * </copyright>
 *
 * $Id: VBRTreeView.java,v 1.7 2005/09/20 19:03:42 hcanedo Exp $
 */
package biz.bi.vbr.vbrvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VBR Tree View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.vbr.vbrvm.VBRTreeView#getMainDiagram <em>Main Diagram</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.VBRTreeView#getIcon <em>Icon</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.VBRTreeView#getM_VBRTreeConnectElementValue <em>MVBR Tree Connect Element Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRTreeView()
 * @model
 * @generated
 */
public interface VBRTreeView extends AbstractView {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Main Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link biz.bi.vbr.vbrvm.MainDiagram#getM_TreeView <em>MTree View</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Diagram</em>' container reference.
	 * @see #setMainDiagram(MainDiagram)
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRTreeView_MainDiagram()
	 * @see biz.bi.vbr.vbrvm.MainDiagram#getM_TreeView
	 * @model opposite="m_TreeView" required="true"
	 * @generated
	 */
	MainDiagram getMainDiagram();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.vbrvm.VBRTreeView#getMainDiagram <em>Main Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Diagram</em>' container reference.
	 * @see #getMainDiagram()
	 * @generated
	 */
	void setMainDiagram(MainDiagram value);

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
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRTreeView_Icon()
	 * @model
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.vbrvm.VBRTreeView#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(String value);

	/**
	 * Returns the value of the '<em><b>MVBR Tree Connect Element Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MVBR Tree Connect Element Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MVBR Tree Connect Element Value</em>' reference.
	 * @see #setM_VBRTreeConnectElementValue(VBRTreeConnectElementValue)
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getVBRTreeView_M_VBRTreeConnectElementValue()
	 * @model required="true"
	 * @generated
	 */
	VBRTreeConnectElementValue getM_VBRTreeConnectElementValue();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.vbrvm.VBRTreeView#getM_VBRTreeConnectElementValue <em>MVBR Tree Connect Element Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MVBR Tree Connect Element Value</em>' reference.
	 * @see #getM_VBRTreeConnectElementValue()
	 * @generated
	 */
	void setM_VBRTreeConnectElementValue(VBRTreeConnectElementValue value);

} // VBRTreeView
