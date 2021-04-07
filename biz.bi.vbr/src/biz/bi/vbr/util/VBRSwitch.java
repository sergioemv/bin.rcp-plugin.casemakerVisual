/**
 * <copyright>
 * </copyright>
 *
 * $Id: VBRSwitch.java,v 1.2 2005/09/01 22:17:38 hcanedo Exp $
 */
package biz.bi.vbr.util;

import biz.bi.vbr.*;

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
 * @see biz.bi.vbr.VBRPackage
 * @generated
 */
public class VBRSwitch {
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
	protected static VBRPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRSwitch() {
		if (modelPackage == null) {
			modelPackage = VBRPackage.eINSTANCE;
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
		case VBRPackage.BUSINESS_OBJECT: {
			BusinessObject businessObject = (BusinessObject) theEObject;
			Object result = caseBusinessObject(businessObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VBRPackage.BUSINESS_VALUE: {
			BusinessValue businessValue = (BusinessValue) theEObject;
			Object result = caseBusinessValue(businessValue);
			if (result == null)
				result = caseAbstractInferenceRuleContents(businessValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VBRPackage.BUSINESS_ACTION: {
			BusinessAction businessAction = (BusinessAction) theEObject;
			Object result = caseBusinessAction(businessAction);
			if (result == null)
				result = caseAbstractInferenceRuleContents(businessAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VBRPackage.FORMAL_POLICY: {
			FormalPolicy formalPolicy = (FormalPolicy) theEObject;
			Object result = caseFormalPolicy(formalPolicy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VBRPackage.INFERENCE_RULE: {
			InferenceRule inferenceRule = (InferenceRule) theEObject;
			Object result = caseInferenceRule(inferenceRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VBRPackage.ABSTRACT_INFERENCE_RULE_CONTENTS: {
			AbstractInferenceRuleContents abstractInferenceRuleContents = (AbstractInferenceRuleContents) theEObject;
			Object result = caseAbstractInferenceRuleContents(abstractInferenceRuleContents);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Business Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Business Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBusinessObject(BusinessObject object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Business Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Business Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBusinessValue(BusinessValue object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Business Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Business Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBusinessAction(BusinessAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Formal Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Formal Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFormalPolicy(FormalPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Inference Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Inference Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInferenceRule(InferenceRule object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Abstract Inference Rule Contents</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Abstract Inference Rule Contents</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAbstractInferenceRuleContents(
			AbstractInferenceRuleContents object) {
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

} //VBRSwitch
