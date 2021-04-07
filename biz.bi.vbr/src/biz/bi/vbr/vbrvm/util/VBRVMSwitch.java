/**
 * <copyright>
 * </copyright>
 *
 * $Id: VBRVMSwitch.java,v 1.5 2005/09/09 18:40:07 hcanedo Exp $
 */
package biz.bi.vbr.vbrvm.util;

import biz.bi.vbr.vbrvm.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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
 * @see biz.bi.vbr.vbrvm.VBRVMPackage
 * @generated
 */
public class VBRVMSwitch {
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
	protected static VBRVMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRVMSwitch() {
		if (modelPackage == null) {
			modelPackage = VBRVMPackage.eINSTANCE;
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
		case VBRVMPackage.MAIN_DIAGRAM: {
			MainDiagram mainDiagram = (MainDiagram) theEObject;
			Object result = caseMainDiagram(mainDiagram);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VBRVMPackage.VBR_TREE_VIEW: {
			VBRTreeView vbrTreeView = (VBRTreeView) theEObject;
			Object result = caseVBRTreeView(vbrTreeView);
			if (result == null)
				result = caseAbstractView(vbrTreeView);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VBRVMPackage.VBR_ELEMENT_VIEW: {
			VBRElementView vbrElementView = (VBRElementView) theEObject;
			Object result = caseVBRElementView(vbrElementView);
			if (result == null)
				result = caseAbstractView(vbrElementView);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VBRVMPackage.ABSTRACT_VIEW: {
			AbstractView abstractView = (AbstractView) theEObject;
			Object result = caseAbstractView(abstractView);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW: {
			VBRElementValueView vbrElementValueView = (VBRElementValueView) theEObject;
			Object result = caseVBRElementValueView(vbrElementValueView);
			if (result == null)
				result = caseAbstractView(vbrElementValueView);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VBRVMPackage.VBR_ACTION_VIEW: {
			VBRActionView vbrActionView = (VBRActionView) theEObject;
			Object result = caseVBRActionView(vbrActionView);
			if (result == null)
				result = caseAbstractView(vbrActionView);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VBRVMPackage.ABSTRACT_LINE: {
			AbstractLine abstractLine = (AbstractLine) theEObject;
			Object result = caseAbstractLine(abstractLine);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VBRVMPackage.VBR_ELEMENT_CONNECT_ELEMENT_VALUE: {
			VBRElementConnectElementValue vbrElementConnectElementValue = (VBRElementConnectElementValue) theEObject;
			Object result = caseVBRElementConnectElementValue(vbrElementConnectElementValue);
			if (result == null)
				result = caseAbstractLine(vbrElementConnectElementValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VBRVMPackage.VBR_ELEMENT_VALUE_CONNECT_ELEMENT_VALUE: {
			VBRElementValueConnectElementValue vbrElementValueConnectElementValue = (VBRElementValueConnectElementValue) theEObject;
			Object result = caseVBRElementValueConnectElementValue(vbrElementValueConnectElementValue);
			if (result == null)
				result = caseAbstractLine(vbrElementValueConnectElementValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VBRVMPackage.VBR_ELEMENT_VALUE_CONNECT_ACTION: {
			VBRElementValueConnectAction vbrElementValueConnectAction = (VBRElementValueConnectAction) theEObject;
			Object result = caseVBRElementValueConnectAction(vbrElementValueConnectAction);
			if (result == null)
				result = caseAbstractLine(vbrElementValueConnectAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VBRVMPackage.VBR_ACTION_CONNECT_ELEMENT_VALUE: {
			VBRActionConnectElementValue vbrActionConnectElementValue = (VBRActionConnectElementValue) theEObject;
			Object result = caseVBRActionConnectElementValue(vbrActionConnectElementValue);
			if (result == null)
				result = caseAbstractLine(vbrActionConnectElementValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VBRVMPackage.VBR_TREE_CONNECT_ELEMENT_VALUE: {
			VBRTreeConnectElementValue vbrTreeConnectElementValue = (VBRTreeConnectElementValue) theEObject;
			Object result = caseVBRTreeConnectElementValue(vbrTreeConnectElementValue);
			if (result == null)
				result = caseAbstractLine(vbrTreeConnectElementValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Main Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Main Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMainDiagram(MainDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>VBR Tree View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>VBR Tree View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVBRTreeView(VBRTreeView object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>VBR Element View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>VBR Element View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVBRElementView(VBRElementView object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Abstract View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Abstract View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAbstractView(AbstractView object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>VBR Element Value View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>VBR Element Value View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVBRElementValueView(VBRElementValueView object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>VBR Action View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>VBR Action View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVBRActionView(VBRActionView object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Abstract Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Abstract Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAbstractLine(AbstractLine object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>VBR Element Connect Element Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>VBR Element Connect Element Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVBRElementConnectElementValue(
			VBRElementConnectElementValue object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>VBR Element Value Connect Element Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>VBR Element Value Connect Element Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVBRElementValueConnectElementValue(
			VBRElementValueConnectElementValue object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>VBR Element Value Connect Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>VBR Element Value Connect Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVBRElementValueConnectAction(
			VBRElementValueConnectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>VBR Action Connect Element Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>VBR Action Connect Element Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVBRActionConnectElementValue(
			VBRActionConnectElementValue object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>VBR Tree Connect Element Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>VBR Tree Connect Element Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVBRTreeConnectElementValue(
			VBRTreeConnectElementValue object) {
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

} //VBRVMSwitch