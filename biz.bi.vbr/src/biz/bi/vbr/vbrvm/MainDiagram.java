/**
 * <copyright>
 * </copyright>
 *
 * $Id: MainDiagram.java,v 1.4 2005/09/07 18:57:28 hcanedo Exp $
 */
package biz.bi.vbr.vbrvm;

import java.util.List;

import biz.bi.vbr.FormalPolicy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.vbr.vbrvm.MainDiagram#getM_TreeView <em>MTree View</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.MainDiagram#getM_vbrObject <em>Mvbr Object</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.MainDiagram#getM_VBRElementView <em>MVBR Element View</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.MainDiagram#getM_VBRElementValueView <em>MVBR Element Value View</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.MainDiagram#getM_VBRActionView <em>MVBR Action View</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getMainDiagram()
 * @model
 * @generated
 */
public interface MainDiagram extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>MTree View</b></em>' containment reference list.
	 * The list contents are of type {@link biz.bi.vbr.vbrvm.VBRTreeView}.
	 * It is bidirectional and its opposite is '{@link biz.bi.vbr.vbrvm.VBRTreeView#getMainDiagram <em>Main Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MTree View</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MTree View</em>' containment reference list.
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getMainDiagram_M_TreeView()
	 * @see biz.bi.vbr.vbrvm.VBRTreeView#getMainDiagram
	 * @model type="biz.bi.vbr.vbrvm.VBRTreeView" opposite="mainDiagram" containment="true"
	 * @generated
	 */
	EList getM_TreeView();

	/**
	 * Returns the value of the '<em><b>Mvbr Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mvbr Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mvbr Object</em>' attribute.
	 * @see #setM_vbrObject(FormalPolicy)
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getMainDiagram_M_vbrObject()
	 * @model dataType="biz.bi.vbr.vbrvm.BMFormalPolicy" required="true"
	 * @generated
	 */
	FormalPolicy getM_vbrObject();

	public void setM_vbrObject(FormalPolicy newM_vbrObject);

	/**
	 * Returns the value of the '<em><b>MVBR Element View</b></em>' containment reference list.
	 * The list contents are of type {@link biz.bi.vbr.vbrvm.VBRElementView}.
	 * It is bidirectional and its opposite is '{@link biz.bi.vbr.vbrvm.VBRElementView#getM_MainDiagram <em>MMain Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MVBR Element View</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MVBR Element View</em>' containment reference list.
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getMainDiagram_M_VBRElementView()
	 * @see biz.bi.vbr.vbrvm.VBRElementView#getM_MainDiagram
	 * @model type="biz.bi.vbr.vbrvm.VBRElementView" opposite="m_MainDiagram" containment="true"
	 * @generated
	 */
	EList getM_VBRElementView();

	/**
	 * Returns the value of the '<em><b>MVBR Element Value View</b></em>' containment reference list.
	 * The list contents are of type {@link biz.bi.vbr.vbrvm.VBRElementValueView}.
	 * It is bidirectional and its opposite is '{@link biz.bi.vbr.vbrvm.VBRElementValueView#getM_MainDiagram <em>MMain Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MVBR Element Value View</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MVBR Element Value View</em>' containment reference list.
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getMainDiagram_M_VBRElementValueView()
	 * @see biz.bi.vbr.vbrvm.VBRElementValueView#getM_MainDiagram
	 * @model type="biz.bi.vbr.vbrvm.VBRElementValueView" opposite="m_MainDiagram" containment="true"
	 * @generated
	 */
	EList getM_VBRElementValueView();

	/**
	 * Returns the value of the '<em><b>MVBR Action View</b></em>' containment reference list.
	 * The list contents are of type {@link biz.bi.vbr.vbrvm.VBRActionView}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MVBR Action View</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MVBR Action View</em>' containment reference list.
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getMainDiagram_M_VBRActionView()
	 * @model type="biz.bi.vbr.vbrvm.VBRActionView" containment="true"
	 * @generated
	 */
	EList getM_VBRActionView();

	/**
	 * @return
	 */
	List getChildren();

} // MainDiagram
