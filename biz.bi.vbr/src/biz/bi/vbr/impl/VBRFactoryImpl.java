/**
 * <copyright>
 * </copyright>
 *
 * $Id: VBRFactoryImpl.java,v 1.3 2005/09/01 22:17:38 hcanedo Exp $
 */
package biz.bi.vbr.impl;

import biz.bi.vbr.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import biz.bi.vbr.BusinessObject;
import biz.bi.vbr.VBRFactory;
import biz.bi.vbr.VBRPackage;
import biz.bi.vbr.FormalPolicy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VBRFactoryImpl extends EFactoryImpl implements VBRFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case VBRPackage.BUSINESS_OBJECT:
			return createBusinessObject();
		case VBRPackage.BUSINESS_VALUE:
			return createBusinessValue();
		case VBRPackage.BUSINESS_ACTION:
			return createBusinessAction();
		case VBRPackage.FORMAL_POLICY:
			return createFormalPolicy();
		case VBRPackage.INFERENCE_RULE:
			return createInferenceRule();
		default:
			throw new IllegalArgumentException(
					"The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessObject createBusinessObject() {
		BusinessObjectImpl businessObject = new BusinessObjectImpl();
		return businessObject;
	}

	public BusinessObject createBusinessObject(String id) {
		BusinessObject l_businessObject = null;
		return l_businessObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessValue createBusinessValue() {
		BusinessValueImpl businessValue = new BusinessValueImpl();
		return businessValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessAction createBusinessAction() {
		BusinessActionImpl businessAction = new BusinessActionImpl();
		return businessAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalPolicy createFormalPolicy() {
		FormalPolicyImpl formalPolicy = new FormalPolicyImpl();
		return formalPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InferenceRule createInferenceRule() {
		InferenceRuleImpl inferenceRule = new InferenceRuleImpl();
		return inferenceRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRPackage getVBRPackage() {
		return (VBRPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static VBRPackage getPackage() {
		return VBRPackage.eINSTANCE;
	}

} //VBRFactoryImpl
