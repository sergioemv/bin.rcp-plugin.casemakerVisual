/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDFactory.java,v 1.19 2005/08/26 15:43:09 smoreno Exp $
 */
package biz.bi.vtcd.model;

import org.eclipse.emf.ecore.EFactory;

import biz.bi.cmcore.model.CMProxyCombination;
import biz.bi.cmcore.model.CMProxyDependency;
import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see biz.bi.vtcd.model.VTCDPackage
 * @generated
 */
public interface VTCDFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VTCDFactory eINSTANCE = new biz.bi.vtcd.model.impl.VTCDFactoryImpl();

	/**
	 * Returns a new object of class '<em>Diagram Combination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Combination</em>'.
	 * @generated
	 */
	VTCDDiagramCombination createVTCDDiagramCombination();

	/**
	 * Returns a new object of class '<em>Diagram Main</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Main</em>'.
	 * @generated
	 */
	VTCDDiagramMain createVTCDDiagramMain();

	/**
	 * Creates a main diagram from a existing test object in its filename
	 * @param p_filename
	 * @return
	 */
	VTCDDiagramMain createVTCDDiagramMain(String p_filename, boolean flag);

	/**
	 * Returns a new object of class '<em>Figure Combination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Figure Combination</em>'.
	 * @generated
	 */
	VTCDFigureCombination createVTCDFigureCombination();

	VTCDFigureCombination createVTCDFigureCombination(
			CMProxyCombination p_Combination);

	VTCDDiagramCombination createVTCDDiagramCombination(
			VTCDFigureDependency p_FigureDependency);

	/**
	 * Returns a new object of class '<em>Figure Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Figure Element</em>'.
	 * @generated
	 */
	VTCDFigureElement createVTCDFigureElement();

	/**
	 * Returns a new VTCDFigureElement with a asociated CMProxyElement
	 * @param p_ProxyElement
	 * @return
	 */
	VTCDFigureElement createVTCDFigureElement(CMProxyElement p_ProxyElement);

	/**
	 * Returns a new object of class '<em>Figure Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Figure Dependency</em>'.
	 * @generated
	 */
	VTCDFigureDependency createVTCDFigureDependency();

	VTCDFigureDependency createVTCDFigureDependency(
			CMProxyDependency p_Dependency);

	/**
	 * Returns a new object of class '<em>Figure Equivalence Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Figure Equivalence Class</em>'.
	 * @generated
	 */
	VTCDFigureEquivalenceClass createVTCDFigureEquivalenceClass();

	VTCDFigureEquivalenceClass createVTCDFigureEquivalenceClass(
			CMProxyEquivalenceClass p_EquivalenceClass);

	/**
	 * Returns a new object of class '<em>Link Dependency Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Dependency Element</em>'.
	 * @generated
	 */
	VTCDLinkDependencyElement createVTCDLinkDependencyElement();

	VTCDLinkDependencyElement createVTCDLinkDependencyElement(
			VTCDFigureDependency p_FigureDependency,
			VTCDFigureElement p_FigureElement);

	/**
	 * Returns a new object of class '<em>Link Combination EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Combination EClass</em>'.
	 * @generated
	 */
	VTCDLinkCombinationEClass createVTCDLinkCombinationEClass();

	/**
	 * create and assign the corresponding linked figures
	 * @param p_FigureCombination
	 * @param p_FigureEquivalenceClass
	 * @return
	 * @author smoreno
	 */
	VTCDLinkCombinationEClass createVTCDLinkCombinationEClass(
			VTCDFigureCombination p_FigureCombination,
			VTCDFigureEquivalenceClass p_FigureEquivalenceClass);

	/**
	 * Returns a new object of class '<em>Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Note</em>'.
	 * @generated
	 */
	VTCDNote createVTCDNote();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VTCDPackage getVTCDPackage();

} //VTCDFactory
