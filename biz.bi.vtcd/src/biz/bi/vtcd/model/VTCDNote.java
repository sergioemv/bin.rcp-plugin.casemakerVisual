/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDNote.java,v 1.4 2005/07/09 00:21:27 smoreno Exp $
 */
package biz.bi.vtcd.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.vtcd.model.VTCDNote#getText <em>Text</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.VTCDNote#getM_VTCDDiagram <em>MVTCD Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDNote()
 * @model
 * @generated
 */
public interface VTCDNote extends VTCDAbstractFigure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDNote_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link biz.bi.vtcd.model.VTCDNote#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>MVTCD Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link biz.bi.vtcd.model.VTCDDiagram#getM_VTCDNote <em>MVTCD Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MVTCD Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MVTCD Diagram</em>' container reference.
	 * @see #setM_VTCDDiagram(VTCDDiagram)
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDNote_M_VTCDDiagram()
	 * @see biz.bi.vtcd.model.VTCDDiagram#getM_VTCDNote
	 * @model opposite="m_VTCDNote" required="true"
	 * @generated
	 */
	VTCDDiagram getM_VTCDDiagram();

	/**
	 * Sets the value of the '{@link biz.bi.vtcd.model.VTCDNote#getM_VTCDDiagram <em>MVTCD Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MVTCD Diagram</em>' container reference.
	 * @see #getM_VTCDDiagram()
	 * @generated
	 */
	void setM_VTCDDiagram(VTCDDiagram value);

} // VTCDNote
