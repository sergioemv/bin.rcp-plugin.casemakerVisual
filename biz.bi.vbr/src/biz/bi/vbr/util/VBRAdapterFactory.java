/**
 * <copyright>
 * </copyright>
 *
 * $Id: VBRAdapterFactory.java,v 1.2 2005/09/01 22:17:38 hcanedo Exp $
 */
package biz.bi.vbr.util;

import biz.bi.vbr.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see biz.bi.vbr.VBRPackage
 * @generated
 */
public class VBRAdapterFactory extends AdapterFactoryImpl {
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
	protected static VBRPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VBRPackage.eINSTANCE;
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
	protected VBRSwitch modelSwitch = new VBRSwitch() {
		public Object caseBusinessObject(BusinessObject object) {
			return createBusinessObjectAdapter();
		}

		public Object caseBusinessValue(BusinessValue object) {
			return createBusinessValueAdapter();
		}

		public Object caseBusinessAction(BusinessAction object) {
			return createBusinessActionAdapter();
		}

		public Object caseFormalPolicy(FormalPolicy object) {
			return createFormalPolicyAdapter();
		}

		public Object caseInferenceRule(InferenceRule object) {
			return createInferenceRuleAdapter();
		}

		public Object caseAbstractInferenceRuleContents(
				AbstractInferenceRuleContents object) {
			return createAbstractInferenceRuleContentsAdapter();
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
	 * Creates a new adapter for an object of class '{@link biz.bi.vbr.BusinessObject <em>Business Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.vbr.BusinessObject
	 * @generated
	 */
	public Adapter createBusinessObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.vbr.BusinessValue <em>Business Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.vbr.BusinessValue
	 * @generated
	 */
	public Adapter createBusinessValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.vbr.BusinessAction <em>Business Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.vbr.BusinessAction
	 * @generated
	 */
	public Adapter createBusinessActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.vbr.FormalPolicy <em>Formal Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.vbr.FormalPolicy
	 * @generated
	 */
	public Adapter createFormalPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.vbr.InferenceRule <em>Inference Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.vbr.InferenceRule
	 * @generated
	 */
	public Adapter createInferenceRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.vbr.AbstractInferenceRuleContents <em>Abstract Inference Rule Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.vbr.AbstractInferenceRuleContents
	 * @generated
	 */
	public Adapter createAbstractInferenceRuleContentsAdapter() {
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

} //VBRAdapterFactory
