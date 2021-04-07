/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDDiagram.java,v 1.7 2005/08/26 15:43:09 smoreno Exp $
 */
package biz.bi.vtcd.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyTestObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.vtcd.model.VTCDDiagram#getM_VTCDNote <em>MVTCD Note</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDDiagram()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface VTCDDiagram extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>MVTCD Note</b></em>' containment reference list.
	 * The list contents are of type {@link biz.bi.vtcd.model.VTCDNote}.
	 * It is bidirectional and its opposite is '{@link biz.bi.vtcd.model.VTCDNote#getM_VTCDDiagram <em>MVTCD Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MVTCD Note</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MVTCD Note</em>' containment reference list.
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDDiagram_M_VTCDNote()
	 * @see biz.bi.vtcd.model.VTCDNote#getM_VTCDDiagram
	 * @model type="biz.bi.vtcd.model.VTCDNote" opposite="m_VTCDDiagram" containment="true"
	 * @generated
	 */
	EList getM_VTCDNote();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model many="false" parameters=""
	 * @generated
	 */
	EList getChildren();

	EList getM_VTCDFigureElement();

	CMProxyTestObject getM_TestObject();

	/**
	 * Get a VTCDFigure element from a combination diagram by his element
	 * @param p_Element
	 * @return
	 */
	VTCDFigureElement getM_VTCDFigureElement(CMProxyElement p_Element);

} // VTCDDiagram
