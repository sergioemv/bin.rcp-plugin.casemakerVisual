/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDSwitch.java,v 1.8 2005/08/26 15:43:09 smoreno Exp $
 */
package biz.bi.vtcd.model.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import biz.bi.vtcd.model.VTCDAbstractFigure;
import biz.bi.vtcd.model.VTCDAbstractLink;
import biz.bi.vtcd.model.VTCDCMProxyFigure;
import biz.bi.vtcd.model.VTCDDiagram;
import biz.bi.vtcd.model.VTCDDiagramCombination;
import biz.bi.vtcd.model.VTCDDiagramMain;
import biz.bi.vtcd.model.VTCDFigureCombination;
import biz.bi.vtcd.model.VTCDFigureDependency;
import biz.bi.vtcd.model.VTCDFigureElement;
import biz.bi.vtcd.model.VTCDFigureEquivalenceClass;
import biz.bi.vtcd.model.VTCDLinkCombinationEClass;
import biz.bi.vtcd.model.VTCDLinkDependencyElement;
import biz.bi.vtcd.model.VTCDNote;
import biz.bi.vtcd.model.VTCDPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see biz.bi.vtcd.model.VTCDPackage
 * @generated
 */
public class VTCDSwitch {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VTCDPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTCDSwitch() {
		if (modelPackage == null) {
			modelPackage = VTCDPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(
					(EClass) eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case VTCDPackage.VTCD_DIAGRAM_COMBINATION: {
			VTCDDiagramCombination vtcdDiagramCombination = (VTCDDiagramCombination) theEObject;
			Object result = caseVTCDDiagramCombination(vtcdDiagramCombination);
			if (result == null)
				result = caseVTCDDiagram(vtcdDiagramCombination);
			if (result == null)
				result = caseVTCDCMProxyFigure(vtcdDiagramCombination);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VTCDPackage.VTCD_DIAGRAM_MAIN: {
			VTCDDiagramMain vtcdDiagramMain = (VTCDDiagramMain) theEObject;
			Object result = caseVTCDDiagramMain(vtcdDiagramMain);
			if (result == null)
				result = caseVTCDDiagram(vtcdDiagramMain);
			if (result == null)
				result = caseVTCDCMProxyFigure(vtcdDiagramMain);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VTCDPackage.VTCD_FIGURE_COMBINATION: {
			VTCDFigureCombination vtcdFigureCombination = (VTCDFigureCombination) theEObject;
			Object result = caseVTCDFigureCombination(vtcdFigureCombination);
			if (result == null)
				result = caseVTCDAbstractFigure(vtcdFigureCombination);
			if (result == null)
				result = caseVTCDCMProxyFigure(vtcdFigureCombination);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VTCDPackage.VTCD_FIGURE_ELEMENT: {
			VTCDFigureElement vtcdFigureElement = (VTCDFigureElement) theEObject;
			Object result = caseVTCDFigureElement(vtcdFigureElement);
			if (result == null)
				result = caseVTCDAbstractFigure(vtcdFigureElement);
			if (result == null)
				result = caseVTCDCMProxyFigure(vtcdFigureElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY: {
			VTCDFigureDependency vtcdFigureDependency = (VTCDFigureDependency) theEObject;
			Object result = caseVTCDFigureDependency(vtcdFigureDependency);
			if (result == null)
				result = caseVTCDAbstractFigure(vtcdFigureDependency);
			if (result == null)
				result = caseVTCDCMProxyFigure(vtcdFigureDependency);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS: {
			VTCDFigureEquivalenceClass vtcdFigureEquivalenceClass = (VTCDFigureEquivalenceClass) theEObject;
			Object result = caseVTCDFigureEquivalenceClass(vtcdFigureEquivalenceClass);
			if (result == null)
				result = caseVTCDAbstractFigure(vtcdFigureEquivalenceClass);
			if (result == null)
				result = caseVTCDCMProxyFigure(vtcdFigureEquivalenceClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VTCDPackage.VTCD_ABSTRACT_FIGURE: {
			VTCDAbstractFigure vtcdAbstractFigure = (VTCDAbstractFigure) theEObject;
			Object result = caseVTCDAbstractFigure(vtcdAbstractFigure);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT: {
			VTCDLinkDependencyElement vtcdLinkDependencyElement = (VTCDLinkDependencyElement) theEObject;
			Object result = caseVTCDLinkDependencyElement(vtcdLinkDependencyElement);
			if (result == null)
				result = caseVTCDAbstractLink(vtcdLinkDependencyElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VTCDPackage.VTCD_LINK_COMBINATION_ECLASS: {
			VTCDLinkCombinationEClass vtcdLinkCombinationEClass = (VTCDLinkCombinationEClass) theEObject;
			Object result = caseVTCDLinkCombinationEClass(vtcdLinkCombinationEClass);
			if (result == null)
				result = caseVTCDAbstractLink(vtcdLinkCombinationEClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VTCDPackage.VTCD_ABSTRACT_LINK: {
			VTCDAbstractLink vtcdAbstractLink = (VTCDAbstractLink) theEObject;
			Object result = caseVTCDAbstractLink(vtcdAbstractLink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VTCDPackage.VTCD_NOTE: {
			VTCDNote vtcdNote = (VTCDNote) theEObject;
			Object result = caseVTCDNote(vtcdNote);
			if (result == null)
				result = caseVTCDAbstractFigure(vtcdNote);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VTCDPackage.VTCD_DIAGRAM: {
			VTCDDiagram vtcdDiagram = (VTCDDiagram) theEObject;
			Object result = caseVTCDDiagram(vtcdDiagram);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VTCDPackage.VTCD_CM_PROXY_FIGURE: {
			VTCDCMProxyFigure vtcdcmProxyFigure = (VTCDCMProxyFigure) theEObject;
			Object result = caseVTCDCMProxyFigure(vtcdcmProxyFigure);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Diagram Combination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Diagram Combination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVTCDDiagramCombination(VTCDDiagramCombination object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Diagram Main</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Diagram Main</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVTCDDiagramMain(VTCDDiagramMain object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Figure Combination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Figure Combination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVTCDFigureCombination(VTCDFigureCombination object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Figure Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Figure Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVTCDFigureElement(VTCDFigureElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Figure Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Figure Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVTCDFigureDependency(VTCDFigureDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Figure Equivalence Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Figure Equivalence Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVTCDFigureEquivalenceClass(
			VTCDFigureEquivalenceClass object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Abstract Figure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Abstract Figure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVTCDAbstractFigure(VTCDAbstractFigure object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Link Dependency Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Link Dependency Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVTCDLinkDependencyElement(VTCDLinkDependencyElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Link Combination EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Link Combination EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVTCDLinkCombinationEClass(VTCDLinkCombinationEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Abstract Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Abstract Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVTCDAbstractLink(VTCDAbstractLink object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVTCDNote(VTCDNote object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVTCDDiagram(VTCDDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CM Proxy Figure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CM Proxy Figure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVTCDCMProxyFigure(VTCDCMProxyFigure object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //VTCDSwitch
