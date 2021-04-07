/**
 * <copyright>
 * </copyright>
 *
 * $Id: CMCoreAdapterFactory.java,v 1.5 2005/09/20 15:08:08 smoreno Exp $
 */
package biz.bi.cmcore.model.util;

import biz.bi.cmcore.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see biz.bi.cmcore.model.CMCorePackage
 * @generated
 */
public class CMCoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CMCorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMCoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CMCorePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CMCoreSwitch modelSwitch = new CMCoreSwitch() {
		public Object caseCMProxyTestObject(CMProxyTestObject object) {
			return createCMProxyTestObjectAdapter();
		}

		public Object caseCMProxyElement(CMProxyElement object) {
			return createCMProxyElementAdapter();
		}

		public Object caseCMProxyObject(CMProxyObject object) {
			return createCMProxyObjectAdapter();
		}

		public Object caseCMProxyEquivalenceClass(CMProxyEquivalenceClass object) {
			return createCMProxyEquivalenceClassAdapter();
		}

		public Object caseCMProxyEffect(CMProxyEffect object) {
			return createCMProxyEffectAdapter();
		}

		public Object caseCMProxyDependency(CMProxyDependency object) {
			return createCMProxyDependencyAdapter();
		}

		public Object caseCMProxyCombination(CMProxyCombination object) {
			return createCMProxyCombinationAdapter();
		}

		public Object caseCMProxyRiskObject(CMProxyRiskObject object) {
			return createCMProxyRiskObjectAdapter();
		}

		public Object caseCMProxyTestCase(CMProxyTestCase object) {
			return createCMProxyTestCaseAdapter();
		}

		public Object caseCMProxyGeneratedObject(CMProxyGeneratedObject object) {
			return createCMProxyGeneratedObjectAdapter();
		}

		public Object caseCMProxySTDCombination(CMProxySTDCombination object) {
			return createCMProxySTDCombinationAdapter();
		}

		public Object defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter) modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.cmcore.model.CMProxyTestObject <em>CM Proxy Test Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.cmcore.model.CMProxyTestObject
	 * @generated
	 */
	public Adapter createCMProxyTestObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.cmcore.model.CMProxyElement <em>CM Proxy Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.cmcore.model.CMProxyElement
	 * @generated
	 */
	public Adapter createCMProxyElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.cmcore.model.CMProxyObject <em>CM Proxy Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.cmcore.model.CMProxyObject
	 * @generated
	 */
	public Adapter createCMProxyObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.cmcore.model.CMProxyEquivalenceClass <em>CM Proxy Equivalence Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.cmcore.model.CMProxyEquivalenceClass
	 * @generated
	 */
	public Adapter createCMProxyEquivalenceClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.cmcore.model.CMProxyEffect <em>CM Proxy Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.cmcore.model.CMProxyEffect
	 * @generated
	 */
	public Adapter createCMProxyEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.cmcore.model.CMProxyDependency <em>CM Proxy Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.cmcore.model.CMProxyDependency
	 * @generated
	 */
	public Adapter createCMProxyDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.cmcore.model.CMProxyCombination <em>CM Proxy Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.cmcore.model.CMProxyCombination
	 * @generated
	 */
	public Adapter createCMProxyCombinationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.cmcore.model.CMProxyRiskObject <em>CM Proxy Risk Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.cmcore.model.CMProxyRiskObject
	 * @generated
	 */
	public Adapter createCMProxyRiskObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.cmcore.model.CMProxyTestCase <em>CM Proxy Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.cmcore.model.CMProxyTestCase
	 * @generated
	 */
	public Adapter createCMProxyTestCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.cmcore.model.CMProxyGeneratedObject <em>CM Proxy Generated Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.cmcore.model.CMProxyGeneratedObject
	 * @generated
	 */
	public Adapter createCMProxyGeneratedObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.cmcore.model.CMProxySTDCombination <em>CM Proxy STD Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.cmcore.model.CMProxySTDCombination
	 * @generated
	 */
	public Adapter createCMProxySTDCombinationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CMCoreAdapterFactory
