/**
 * <copyright>
 * </copyright>
 *
 * $Id: CMCoreSwitch.java,v 1.5 2005/09/20 15:08:08 smoreno Exp $
 */
package biz.bi.cmcore.model.util;

import biz.bi.cmcore.model.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import biz.bi.cmcore.model.CMCorePackage;
import biz.bi.cmcore.model.CMProxyCombination;
import biz.bi.cmcore.model.CMProxyDependency;
import biz.bi.cmcore.model.CMProxyEffect;
import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.cmcore.model.CMProxyObject;
import biz.bi.cmcore.model.CMProxyTestObject;

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
 * @see biz.bi.cmcore.model.CMCorePackage
 * @generated
 */
public class CMCoreSwitch {
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
	protected static CMCorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMCoreSwitch() {
		if (modelPackage == null) {
			modelPackage = CMCorePackage.eINSTANCE;
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
		case CMCorePackage.CM_PROXY_TEST_OBJECT: {
			CMProxyTestObject cmProxyTestObject = (CMProxyTestObject) theEObject;
			Object result = caseCMProxyTestObject(cmProxyTestObject);
			if (result == null)
				result = caseCMProxyObject(cmProxyTestObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CMCorePackage.CM_PROXY_ELEMENT: {
			CMProxyElement cmProxyElement = (CMProxyElement) theEObject;
			Object result = caseCMProxyElement(cmProxyElement);
			if (result == null)
				result = caseCMProxyObject(cmProxyElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CMCorePackage.CM_PROXY_OBJECT: {
			CMProxyObject cmProxyObject = (CMProxyObject) theEObject;
			Object result = caseCMProxyObject(cmProxyObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS: {
			CMProxyEquivalenceClass cmProxyEquivalenceClass = (CMProxyEquivalenceClass) theEObject;
			Object result = caseCMProxyEquivalenceClass(cmProxyEquivalenceClass);
			if (result == null)
				result = caseCMProxyObject(cmProxyEquivalenceClass);
			if (result == null)
				result = caseCMProxyRiskObject(cmProxyEquivalenceClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CMCorePackage.CM_PROXY_EFFECT: {
			CMProxyEffect cmProxyEffect = (CMProxyEffect) theEObject;
			Object result = caseCMProxyEffect(cmProxyEffect);
			if (result == null)
				result = caseCMProxyObject(cmProxyEffect);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CMCorePackage.CM_PROXY_DEPENDENCY: {
			CMProxyDependency cmProxyDependency = (CMProxyDependency) theEObject;
			Object result = caseCMProxyDependency(cmProxyDependency);
			if (result == null)
				result = caseCMProxyObject(cmProxyDependency);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CMCorePackage.CM_PROXY_COMBINATION: {
			CMProxyCombination cmProxyCombination = (CMProxyCombination) theEObject;
			Object result = caseCMProxyCombination(cmProxyCombination);
			if (result == null)
				result = caseCMProxyObject(cmProxyCombination);
			if (result == null)
				result = caseCMProxyRiskObject(cmProxyCombination);
			if (result == null)
				result = caseCMProxyGeneratedObject(cmProxyCombination);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CMCorePackage.CM_PROXY_RISK_OBJECT: {
			CMProxyRiskObject cmProxyRiskObject = (CMProxyRiskObject) theEObject;
			Object result = caseCMProxyRiskObject(cmProxyRiskObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CMCorePackage.CM_PROXY_TEST_CASE: {
			CMProxyTestCase cmProxyTestCase = (CMProxyTestCase) theEObject;
			Object result = caseCMProxyTestCase(cmProxyTestCase);
			if (result == null)
				result = caseCMProxyObject(cmProxyTestCase);
			if (result == null)
				result = caseCMProxyRiskObject(cmProxyTestCase);
			if (result == null)
				result = caseCMProxyGeneratedObject(cmProxyTestCase);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CMCorePackage.CM_PROXY_GENERATED_OBJECT: {
			CMProxyGeneratedObject cmProxyGeneratedObject = (CMProxyGeneratedObject) theEObject;
			Object result = caseCMProxyGeneratedObject(cmProxyGeneratedObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CMCorePackage.CM_PROXY_STD_COMBINATION: {
			CMProxySTDCombination cmProxySTDCombination = (CMProxySTDCombination) theEObject;
			Object result = caseCMProxySTDCombination(cmProxySTDCombination);
			if (result == null)
				result = caseCMProxyCombination(cmProxySTDCombination);
			if (result == null)
				result = caseCMProxyObject(cmProxySTDCombination);
			if (result == null)
				result = caseCMProxyRiskObject(cmProxySTDCombination);
			if (result == null)
				result = caseCMProxyGeneratedObject(cmProxySTDCombination);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CM Proxy Test Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CM Proxy Test Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCMProxyTestObject(CMProxyTestObject object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CM Proxy Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CM Proxy Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCMProxyElement(CMProxyElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CM Proxy Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CM Proxy Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCMProxyObject(CMProxyObject object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CM Proxy Equivalence Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CM Proxy Equivalence Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCMProxyEquivalenceClass(CMProxyEquivalenceClass object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CM Proxy Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CM Proxy Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCMProxyEffect(CMProxyEffect object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CM Proxy Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CM Proxy Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCMProxyDependency(CMProxyDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CM Proxy Combination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CM Proxy Combination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCMProxyCombination(CMProxyCombination object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CM Proxy Risk Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CM Proxy Risk Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCMProxyRiskObject(CMProxyRiskObject object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CM Proxy Test Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CM Proxy Test Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCMProxyTestCase(CMProxyTestCase object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CM Proxy Generated Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CM Proxy Generated Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCMProxyGeneratedObject(CMProxyGeneratedObject object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CM Proxy STD Combination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CM Proxy STD Combination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCMProxySTDCombination(CMProxySTDCombination object) {
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

} //CMCoreSwitch
