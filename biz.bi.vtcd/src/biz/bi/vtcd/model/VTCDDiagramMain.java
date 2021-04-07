/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDDiagramMain.java,v 1.12 2005/08/26 15:43:09 smoreno Exp $
 */
package biz.bi.vtcd.model;

import org.eclipse.emf.common.util.EList;

import biz.bi.cmcore.model.CMCorePackage;
import biz.bi.cmcore.model.CMProxyDependency;
import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyTestObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Main</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.vtcd.model.VTCDDiagramMain#getM_VTCDFigureElement <em>MVTCD Figure Element</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.VTCDDiagramMain#getM_VTCDFigureDependency <em>MVTCD Figure Dependency</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.VTCDDiagramMain#getM_TestObject <em>MTest Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDDiagramMain()
 * @model
 * @generated
 */
public interface VTCDDiagramMain extends VTCDDiagram, VTCDCMProxyFigure {
	/**
	 * The default value of the ' {@link #getM_TestObject()  <em>MTest Object</em>} ' attribute. <!-- begin-user-doc --> must not be null <!-- end-user-doc -->
	 * @see #getM_TestObject()
	 * @generated  NOT
	 * @author  Sergio M
	 * @ordered
	 */
	static final CMProxyTestObject TESTOBJECT_EDEFAULT = CMCorePackage.eINSTANCE
			.getCMCoreFactory().createCMProxyTestObject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>MVTCD Figure Element</b></em>' containment reference list.
	 * The list contents are of type {@link biz.bi.vtcd.model.VTCDFigureElement}.
	 * It is bidirectional and its opposite is '{@link biz.bi.vtcd.model.VTCDFigureElement#getM_VTCDDiagramMain <em>MVTCD Diagram Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MVTCD Figure Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MVTCD Figure Element</em>' containment reference list.
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDDiagramMain_M_VTCDFigureElement()
	 * @see biz.bi.vtcd.model.VTCDFigureElement#getM_VTCDDiagramMain
	 * @model type="biz.bi.vtcd.model.VTCDFigureElement" opposite="m_VTCDDiagramMain" containment="true"
	 * @generated
	 */
	EList getM_VTCDFigureElement();

	VTCDFigureElement getM_VTCDFigureElement(CMProxyElement p_Element);

	/**
	 * Returns the value of the '<em><b>MVTCD Figure Dependency</b></em>' containment reference list.
	 * The list contents are of type {@link biz.bi.vtcd.model.VTCDFigureDependency}.
	 * It is bidirectional and its opposite is '{@link biz.bi.vtcd.model.VTCDFigureDependency#getM_VTCDDiagramMain <em>MVTCD Diagram Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MVTCD Figure Dependency</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MVTCD Figure Dependency</em>' containment reference list.
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDDiagramMain_M_VTCDFigureDependency()
	 * @see biz.bi.vtcd.model.VTCDFigureDependency#getM_VTCDDiagramMain
	 * @model type="biz.bi.vtcd.model.VTCDFigureDependency" opposite="m_VTCDDiagramMain" containment="true"
	 * @generated
	 */
	EList getM_VTCDFigureDependency();

	VTCDFigureDependency getM_VTCDFigureDependency(
			CMProxyDependency p_Dependency);

	VTCDDiagramCombination getM_VTCDDiagramCombination(
			CMProxyDependency p_Dependency);

	/**
	 * Returns the value of the '<em><b>MTest Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MTest Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MTest Object</em>' attribute.
	 * @see #setM_TestObject(CMProxyTestObject)
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDDiagramMain_M_TestObject()
	 * @model dataType="biz.bi.vtcd.model.TestObject" required="true"
	 * @generated
	 */
	CMProxyTestObject getM_TestObject();

	/**
	 * Sets the value of the '{@link biz.bi.vtcd.model.VTCDDiagramMain#getM_TestObject <em>MTest Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MTest Object</em>' attribute.
	 * @see #getM_TestObject()
	 * @generated
	 */
	void setM_TestObject(CMProxyTestObject value);

} // VTCDDiagramMain
