/**
 * <copyright>
 * </copyright>
 *
 * $Id: InferenceRuleImpl.java,v 1.5 2005/09/12 13:55:27 hcanedo Exp $
 */
package biz.bi.vbr.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import biz.bi.vbr.AbstractInferenceRuleContents;
import biz.bi.vbr.InferenceRule;
import biz.bi.vbr.VBRPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inference Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link biz.bi.vbr.impl.InferenceRuleImpl#getTruePart <em>True Part</em>}</li>
 *   <li>{@link biz.bi.vbr.impl.InferenceRuleImpl#getFalsePart <em>False Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InferenceRuleImpl extends EObjectImpl implements InferenceRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getTruePart() <em>True Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTruePart()
	 * @generated
	 * @ordered
	 */
	protected AbstractInferenceRuleContents truePart = null;

	/**
	 * The cached value of the '{@link #getFalsePart() <em>False Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFalsePart()
	 * @generated
	 * @ordered
	 */
	protected AbstractInferenceRuleContents falsePart = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InferenceRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return VBRPackage.eINSTANCE.getInferenceRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractInferenceRuleContents getTruePart() {
		if (truePart != null && truePart.eIsProxy()) {
			AbstractInferenceRuleContents oldTruePart = truePart;
			truePart = (AbstractInferenceRuleContents) eResolveProxy((InternalEObject) truePart);
			if (truePart != oldTruePart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							VBRPackage.INFERENCE_RULE__TRUE_PART, oldTruePart,
							truePart));
			}
		}
		return truePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractInferenceRuleContents basicGetTruePart() {
		return truePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTruePart(AbstractInferenceRuleContents newTruePart) {
		AbstractInferenceRuleContents oldTruePart = truePart;
		truePart = newTruePart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VBRPackage.INFERENCE_RULE__TRUE_PART, oldTruePart, truePart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractInferenceRuleContents getFalsePart() {
		if (falsePart != null && falsePart.eIsProxy()) {
			AbstractInferenceRuleContents oldFalsePart = falsePart;
			falsePart = (AbstractInferenceRuleContents) eResolveProxy((InternalEObject) falsePart);
			if (falsePart != oldFalsePart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							VBRPackage.INFERENCE_RULE__FALSE_PART,
							oldFalsePart, falsePart));
			}
		}
		return falsePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractInferenceRuleContents basicGetFalsePart() {
		return falsePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFalsePart(AbstractInferenceRuleContents newFalsePart) {
		AbstractInferenceRuleContents oldFalsePart = falsePart;
		falsePart = newFalsePart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VBRPackage.INFERENCE_RULE__FALSE_PART, oldFalsePart,
					falsePart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
		case VBRPackage.INFERENCE_RULE__TRUE_PART:
			if (resolve)
				return getTruePart();
			return basicGetTruePart();
		case VBRPackage.INFERENCE_RULE__FALSE_PART:
			if (resolve)
				return getFalsePart();
			return basicGetFalsePart();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
		case VBRPackage.INFERENCE_RULE__TRUE_PART:
			setTruePart((AbstractInferenceRuleContents) newValue);
			return;
		case VBRPackage.INFERENCE_RULE__FALSE_PART:
			setFalsePart((AbstractInferenceRuleContents) newValue);
			return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
		case VBRPackage.INFERENCE_RULE__TRUE_PART:
			setTruePart((AbstractInferenceRuleContents) null);
			return;
		case VBRPackage.INFERENCE_RULE__FALSE_PART:
			setFalsePart((AbstractInferenceRuleContents) null);
			return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
		case VBRPackage.INFERENCE_RULE__TRUE_PART:
			return truePart != null;
		case VBRPackage.INFERENCE_RULE__FALSE_PART:
			return falsePart != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //InferenceRuleImpl
