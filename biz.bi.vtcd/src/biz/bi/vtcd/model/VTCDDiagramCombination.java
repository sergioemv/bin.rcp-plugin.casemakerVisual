/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDDiagramCombination.java,v 1.14 2005/08/26 15:43:09 smoreno Exp $
 */
package biz.bi.vtcd.model;

import org.eclipse.emf.common.util.EList;

import biz.bi.cmcore.model.CMProxyCombination;
import biz.bi.cmcore.model.CMProxyDependency;
import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Combination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.vtcd.model.VTCDDiagramCombination#getM_VTCDFigureCombination <em>MVTCD Figure Combination</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.VTCDDiagramCombination#getM_VTCDFigureElement <em>MVTCD Figure Element</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.VTCDDiagramCombination#getM_FigureDependency <em>MFigure Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDDiagramCombination()
 * @model
 * @generated
 */
public interface VTCDDiagramCombination extends VTCDDiagram, VTCDCMProxyFigure {
	/**
	 * The default value of the ' {@link #getM_Dependency()  <em>MDependency</em>} ' attribute. <!-- begin-user-doc --> the default value is a proxydependency (without a resolved proxy)  <!-- end-user-doc -->
	 * @see #getM_Dependency()
	 * @generated  NOT
	 * @author  Sergio M
	 * @ordered
	 */
	static final CMProxyDependency DEPENDENCY_EDEFAULT = VTCDFigureDependency.DEPENDENCY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>MVTCD Figure Combination</b></em>' containment reference list.
	 * The list contents are of type {@link biz.bi.vtcd.model.VTCDFigureCombination}.
	 * It is bidirectional and its opposite is '{@link biz.bi.vtcd.model.VTCDFigureCombination#getM_VTCDDiagramCombination <em>MVTCD Diagram Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MVTCD Figure Combination</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MVTCD Figure Combination</em>' containment reference list.
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDDiagramCombination_M_VTCDFigureCombination()
	 * @see biz.bi.vtcd.model.VTCDFigureCombination#getM_VTCDDiagramCombination
	 * @model type="biz.bi.vtcd.model.VTCDFigureCombination" opposite="m_VTCDDiagramCombination" containment="true"
	 * @generated
	 */
	EList getM_VTCDFigureCombination();

	VTCDFigureCombination getM_VTCDFigureCombination(
			CMProxyCombination p_Combination);

	/**
	 * Returns the value of the '<em><b>MVTCD Figure Element</b></em>' containment reference list.
	 * The list contents are of type {@link biz.bi.vtcd.model.VTCDFigureElement}.
	 * It is bidirectional and its opposite is '{@link biz.bi.vtcd.model.VTCDFigureElement#getM_VTCDDiagramCombination <em>MVTCD Diagram Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MVTCD Figure Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MVTCD Figure Element</em>' containment reference list.
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDDiagramCombination_M_VTCDFigureElement()
	 * @see biz.bi.vtcd.model.VTCDFigureElement#getM_VTCDDiagramCombination
	 * @model type="biz.bi.vtcd.model.VTCDFigureElement" opposite="m_VTCDDiagramCombination" containment="true"
	 * @generated
	 */
	EList getM_VTCDFigureElement();

	/**
	 * Returns the value of the '<em><b>MFigure Dependency</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link biz.bi.vtcd.model.VTCDFigureDependency#getM_VTCDDiagramCombination <em>MVTCD Diagram Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MFigure Dependency</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFigure Dependency</em>' container reference.
	 * @see #setM_FigureDependency(VTCDFigureDependency)
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDDiagramCombination_M_FigureDependency()
	 * @see biz.bi.vtcd.model.VTCDFigureDependency#getM_VTCDDiagramCombination
	 * @model opposite="m_VTCDDiagramCombination" required="true"
	 * @generated
	 */
	VTCDFigureDependency getM_FigureDependency();

	/**
	 * Sets the value of the '{@link biz.bi.vtcd.model.VTCDDiagramCombination#getM_FigureDependency <em>MFigure Dependency</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MFigure Dependency</em>' container reference.
	 * @see #getM_FigureDependency()
	 * @generated
	 */
	void setM_FigureDependency(VTCDFigureDependency value);

	/**
	 * Get a VTCDFigure element from a combination diagram by his element
	 * @param p_Element
	 * @return
	 */
	VTCDFigureElement getM_VTCDFigureElement(CMProxyElement p_Element);

	/**
	 * Get a Figure equivalence class that is contained on one of its children elements
	 * @param p_EquivalenceClass
	 * @return
	 */
	VTCDFigureEquivalenceClass getM_VTCDFigureEquivalenceClass(
			CMProxyEquivalenceClass p_EquivalenceClass);

} // VTCDDiagramCombination
