/**
 * <copyright>
 * </copyright>
 *
 * $Id: VBRActionConnectElementValueImpl.java,v 1.2 2005/09/01 22:17:38 hcanedo Exp $
 */
package biz.bi.vbr.vbrvm.impl;

import biz.bi.vbr.vbrvm.VBRActionConnectElementValue;
import biz.bi.vbr.vbrvm.VBRActionView;
import biz.bi.vbr.vbrvm.VBRElementValueView;
import biz.bi.vbr.vbrvm.VBRVMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VBR Action Connect Element Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link biz.bi.vbr.vbrvm.impl.VBRActionConnectElementValueImpl#getSourceACT <em>Source ACT</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.impl.VBRActionConnectElementValueImpl#getTargetEV <em>Target EV</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VBRActionConnectElementValueImpl extends AbstractLineImpl
		implements VBRActionConnectElementValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getSourceACT() <em>Source ACT</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceACT()
	 * @generated
	 * @ordered
	 */
	protected VBRActionView sourceACT = null;

	/**
	 * The cached value of the '{@link #getTargetEV() <em>Target EV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetEV()
	 * @generated
	 * @ordered
	 */
	protected VBRElementValueView targetEV = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VBRActionConnectElementValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return VBRVMPackage.eINSTANCE.getVBRActionConnectElementValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRActionView getSourceACT() {
		if (sourceACT != null && sourceACT.eIsProxy()) {
			VBRActionView oldSourceACT = sourceACT;
			sourceACT = (VBRActionView) eResolveProxy((InternalEObject) sourceACT);
			if (sourceACT != oldSourceACT) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							VBRVMPackage.VBR_ACTION_CONNECT_ELEMENT_VALUE__SOURCE_ACT,
							oldSourceACT, sourceACT));
			}
		}
		return sourceACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRActionView basicGetSourceACT() {
		return sourceACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceACT(VBRActionView newSourceACT) {
		VBRActionView oldSourceACT = sourceACT;
		sourceACT = newSourceACT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VBRVMPackage.VBR_ACTION_CONNECT_ELEMENT_VALUE__SOURCE_ACT,
					oldSourceACT, sourceACT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRElementValueView getTargetEV() {
		if (targetEV != null && targetEV.eIsProxy()) {
			VBRElementValueView oldTargetEV = targetEV;
			targetEV = (VBRElementValueView) eResolveProxy((InternalEObject) targetEV);
			if (targetEV != oldTargetEV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							VBRVMPackage.VBR_ACTION_CONNECT_ELEMENT_VALUE__TARGET_EV,
							oldTargetEV, targetEV));
			}
		}
		return targetEV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRElementValueView basicGetTargetEV() {
		return targetEV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetEV(VBRElementValueView newTargetEV) {
		VBRElementValueView oldTargetEV = targetEV;
		targetEV = newTargetEV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VBRVMPackage.VBR_ACTION_CONNECT_ELEMENT_VALUE__TARGET_EV,
					oldTargetEV, targetEV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
		case VBRVMPackage.VBR_ACTION_CONNECT_ELEMENT_VALUE__X:
			return new Integer(getX());
		case VBRVMPackage.VBR_ACTION_CONNECT_ELEMENT_VALUE__WIDTH:
			return new Integer(getWidth());
		case VBRVMPackage.VBR_ACTION_CONNECT_ELEMENT_VALUE__Y:
			return new Integer(getY());
		case VBRVMPackage.VBR_ACTION_CONNECT_ELEMENT_VALUE__SOURCE_ACT:
			if (resolve)
				return getSourceACT();
			return basicGetSourceACT();
		case VBRVMPackage.VBR_ACTION_CONNECT_ELEMENT_VALUE__TARGET_EV:
			if (resolve)
				return getTargetEV();
			return basicGetTargetEV();
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
		case VBRVMPackage.VBR_ACTION_CONNECT_ELEMENT_VALUE__X:
			setX(((Integer) newValue).intValue());
			return;
		case VBRVMPackage.VBR_ACTION_CONNECT_ELEMENT_VALUE__WIDTH:
			setWidth(((Integer) newValue).intValue());
			return;
		case VBRVMPackage.VBR_ACTION_CONNECT_ELEMENT_VALUE__Y:
			setY(((Integer) newValue).intValue());
			return;
		case VBRVMPackage.VBR_ACTION_CONNECT_ELEMENT_VALUE__SOURCE_ACT:
			setSourceACT((VBRActionView) newValue);
			return;
		case VBRVMPackage.VBR_ACTION_CONNECT_ELEMENT_VALUE__TARGET_EV:
			setTargetEV((VBRElementValueView) newValue);
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
		case VBRVMPackage.VBR_ACTION_CONNECT_ELEMENT_VALUE__X:
			setX(X_EDEFAULT);
			return;
		case VBRVMPackage.VBR_ACTION_CONNECT_ELEMENT_VALUE__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case VBRVMPackage.VBR_ACTION_CONNECT_ELEMENT_VALUE__Y:
			setY(Y_EDEFAULT);
			return;
		case VBRVMPackage.VBR_ACTION_CONNECT_ELEMENT_VALUE__SOURCE_ACT:
			setSourceACT((VBRActionView) null);
			return;
		case VBRVMPackage.VBR_ACTION_CONNECT_ELEMENT_VALUE__TARGET_EV:
			setTargetEV((VBRElementValueView) null);
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
		case VBRVMPackage.VBR_ACTION_CONNECT_ELEMENT_VALUE__X:
			return x != X_EDEFAULT;
		case VBRVMPackage.VBR_ACTION_CONNECT_ELEMENT_VALUE__WIDTH:
			return width != WIDTH_EDEFAULT;
		case VBRVMPackage.VBR_ACTION_CONNECT_ELEMENT_VALUE__Y:
			return y != Y_EDEFAULT;
		case VBRVMPackage.VBR_ACTION_CONNECT_ELEMENT_VALUE__SOURCE_ACT:
			return sourceACT != null;
		case VBRVMPackage.VBR_ACTION_CONNECT_ELEMENT_VALUE__TARGET_EV:
			return targetEV != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //VBRActionConnectElementValueImpl
