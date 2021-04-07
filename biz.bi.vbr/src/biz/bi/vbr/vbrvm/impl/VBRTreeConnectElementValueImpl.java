/**
 * <copyright>
 * </copyright>
 *
 * $Id: VBRTreeConnectElementValueImpl.java,v 1.2 2005/09/01 22:17:38 hcanedo Exp $
 */
package biz.bi.vbr.vbrvm.impl;

import biz.bi.vbr.vbrvm.VBRElementValueView;
import biz.bi.vbr.vbrvm.VBRTreeConnectElementValue;
import biz.bi.vbr.vbrvm.VBRTreeView;
import biz.bi.vbr.vbrvm.VBRVMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VBR Tree Connect Element Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link biz.bi.vbr.vbrvm.impl.VBRTreeConnectElementValueImpl#getSourceTr <em>Source Tr</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.impl.VBRTreeConnectElementValueImpl#getTargetEV <em>Target EV</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VBRTreeConnectElementValueImpl extends AbstractLineImpl implements
		VBRTreeConnectElementValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getSourceTr() <em>Source Tr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceTr()
	 * @generated
	 * @ordered
	 */
	protected VBRTreeView sourceTr = null;

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
	protected VBRTreeConnectElementValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return VBRVMPackage.eINSTANCE.getVBRTreeConnectElementValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRTreeView getSourceTr() {
		if (sourceTr != null && sourceTr.eIsProxy()) {
			VBRTreeView oldSourceTr = sourceTr;
			sourceTr = (VBRTreeView) eResolveProxy((InternalEObject) sourceTr);
			if (sourceTr != oldSourceTr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							VBRVMPackage.VBR_TREE_CONNECT_ELEMENT_VALUE__SOURCE_TR,
							oldSourceTr, sourceTr));
			}
		}
		return sourceTr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRTreeView basicGetSourceTr() {
		return sourceTr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceTr(VBRTreeView newSourceTr) {
		VBRTreeView oldSourceTr = sourceTr;
		sourceTr = newSourceTr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VBRVMPackage.VBR_TREE_CONNECT_ELEMENT_VALUE__SOURCE_TR,
					oldSourceTr, sourceTr));
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
							VBRVMPackage.VBR_TREE_CONNECT_ELEMENT_VALUE__TARGET_EV,
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
					VBRVMPackage.VBR_TREE_CONNECT_ELEMENT_VALUE__TARGET_EV,
					oldTargetEV, targetEV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
		case VBRVMPackage.VBR_TREE_CONNECT_ELEMENT_VALUE__X:
			return new Integer(getX());
		case VBRVMPackage.VBR_TREE_CONNECT_ELEMENT_VALUE__WIDTH:
			return new Integer(getWidth());
		case VBRVMPackage.VBR_TREE_CONNECT_ELEMENT_VALUE__Y:
			return new Integer(getY());
		case VBRVMPackage.VBR_TREE_CONNECT_ELEMENT_VALUE__SOURCE_TR:
			if (resolve)
				return getSourceTr();
			return basicGetSourceTr();
		case VBRVMPackage.VBR_TREE_CONNECT_ELEMENT_VALUE__TARGET_EV:
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
		case VBRVMPackage.VBR_TREE_CONNECT_ELEMENT_VALUE__X:
			setX(((Integer) newValue).intValue());
			return;
		case VBRVMPackage.VBR_TREE_CONNECT_ELEMENT_VALUE__WIDTH:
			setWidth(((Integer) newValue).intValue());
			return;
		case VBRVMPackage.VBR_TREE_CONNECT_ELEMENT_VALUE__Y:
			setY(((Integer) newValue).intValue());
			return;
		case VBRVMPackage.VBR_TREE_CONNECT_ELEMENT_VALUE__SOURCE_TR:
			setSourceTr((VBRTreeView) newValue);
			return;
		case VBRVMPackage.VBR_TREE_CONNECT_ELEMENT_VALUE__TARGET_EV:
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
		case VBRVMPackage.VBR_TREE_CONNECT_ELEMENT_VALUE__X:
			setX(X_EDEFAULT);
			return;
		case VBRVMPackage.VBR_TREE_CONNECT_ELEMENT_VALUE__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case VBRVMPackage.VBR_TREE_CONNECT_ELEMENT_VALUE__Y:
			setY(Y_EDEFAULT);
			return;
		case VBRVMPackage.VBR_TREE_CONNECT_ELEMENT_VALUE__SOURCE_TR:
			setSourceTr((VBRTreeView) null);
			return;
		case VBRVMPackage.VBR_TREE_CONNECT_ELEMENT_VALUE__TARGET_EV:
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
		case VBRVMPackage.VBR_TREE_CONNECT_ELEMENT_VALUE__X:
			return x != X_EDEFAULT;
		case VBRVMPackage.VBR_TREE_CONNECT_ELEMENT_VALUE__WIDTH:
			return width != WIDTH_EDEFAULT;
		case VBRVMPackage.VBR_TREE_CONNECT_ELEMENT_VALUE__Y:
			return y != Y_EDEFAULT;
		case VBRVMPackage.VBR_TREE_CONNECT_ELEMENT_VALUE__SOURCE_TR:
			return sourceTr != null;
		case VBRVMPackage.VBR_TREE_CONNECT_ELEMENT_VALUE__TARGET_EV:
			return targetEV != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //VBRTreeConnectElementValueImpl
