/**
 * <copyright>
 * </copyright>
 *
 * $Id: VBRElementValueConnectActionImpl.java,v 1.2 2005/09/01 22:17:38 hcanedo Exp $
 */
package biz.bi.vbr.vbrvm.impl;

import biz.bi.vbr.vbrvm.VBRActionView;
import biz.bi.vbr.vbrvm.VBRElementValueConnectAction;
import biz.bi.vbr.vbrvm.VBRElementValueView;
import biz.bi.vbr.vbrvm.VBRVMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VBR Element Value Connect Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link biz.bi.vbr.vbrvm.impl.VBRElementValueConnectActionImpl#getSourceE <em>Source E</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.impl.VBRElementValueConnectActionImpl#getTargetACT <em>Target ACT</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VBRElementValueConnectActionImpl extends AbstractLineImpl
		implements VBRElementValueConnectAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getSourceE() <em>Source E</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceE()
	 * @generated
	 * @ordered
	 */
	protected VBRElementValueView sourceE = null;

	/**
	 * The cached value of the '{@link #getTargetACT() <em>Target ACT</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetACT()
	 * @generated
	 * @ordered
	 */
	protected VBRActionView targetACT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VBRElementValueConnectActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return VBRVMPackage.eINSTANCE.getVBRElementValueConnectAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRElementValueView getSourceE() {
		if (sourceE != null && sourceE.eIsProxy()) {
			VBRElementValueView oldSourceE = sourceE;
			sourceE = (VBRElementValueView) eResolveProxy((InternalEObject) sourceE);
			if (sourceE != oldSourceE) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							VBRVMPackage.VBR_ELEMENT_VALUE_CONNECT_ACTION__SOURCE_E,
							oldSourceE, sourceE));
			}
		}
		return sourceE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRElementValueView basicGetSourceE() {
		return sourceE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceE(VBRElementValueView newSourceE) {
		VBRElementValueView oldSourceE = sourceE;
		sourceE = newSourceE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VBRVMPackage.VBR_ELEMENT_VALUE_CONNECT_ACTION__SOURCE_E,
					oldSourceE, sourceE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRActionView getTargetACT() {
		if (targetACT != null && targetACT.eIsProxy()) {
			VBRActionView oldTargetACT = targetACT;
			targetACT = (VBRActionView) eResolveProxy((InternalEObject) targetACT);
			if (targetACT != oldTargetACT) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							VBRVMPackage.VBR_ELEMENT_VALUE_CONNECT_ACTION__TARGET_ACT,
							oldTargetACT, targetACT));
			}
		}
		return targetACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRActionView basicGetTargetACT() {
		return targetACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetACT(VBRActionView newTargetACT) {
		VBRActionView oldTargetACT = targetACT;
		targetACT = newTargetACT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VBRVMPackage.VBR_ELEMENT_VALUE_CONNECT_ACTION__TARGET_ACT,
					oldTargetACT, targetACT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
		case VBRVMPackage.VBR_ELEMENT_VALUE_CONNECT_ACTION__X:
			return new Integer(getX());
		case VBRVMPackage.VBR_ELEMENT_VALUE_CONNECT_ACTION__WIDTH:
			return new Integer(getWidth());
		case VBRVMPackage.VBR_ELEMENT_VALUE_CONNECT_ACTION__Y:
			return new Integer(getY());
		case VBRVMPackage.VBR_ELEMENT_VALUE_CONNECT_ACTION__SOURCE_E:
			if (resolve)
				return getSourceE();
			return basicGetSourceE();
		case VBRVMPackage.VBR_ELEMENT_VALUE_CONNECT_ACTION__TARGET_ACT:
			if (resolve)
				return getTargetACT();
			return basicGetTargetACT();
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
		case VBRVMPackage.VBR_ELEMENT_VALUE_CONNECT_ACTION__X:
			setX(((Integer) newValue).intValue());
			return;
		case VBRVMPackage.VBR_ELEMENT_VALUE_CONNECT_ACTION__WIDTH:
			setWidth(((Integer) newValue).intValue());
			return;
		case VBRVMPackage.VBR_ELEMENT_VALUE_CONNECT_ACTION__Y:
			setY(((Integer) newValue).intValue());
			return;
		case VBRVMPackage.VBR_ELEMENT_VALUE_CONNECT_ACTION__SOURCE_E:
			setSourceE((VBRElementValueView) newValue);
			return;
		case VBRVMPackage.VBR_ELEMENT_VALUE_CONNECT_ACTION__TARGET_ACT:
			setTargetACT((VBRActionView) newValue);
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
		case VBRVMPackage.VBR_ELEMENT_VALUE_CONNECT_ACTION__X:
			setX(X_EDEFAULT);
			return;
		case VBRVMPackage.VBR_ELEMENT_VALUE_CONNECT_ACTION__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case VBRVMPackage.VBR_ELEMENT_VALUE_CONNECT_ACTION__Y:
			setY(Y_EDEFAULT);
			return;
		case VBRVMPackage.VBR_ELEMENT_VALUE_CONNECT_ACTION__SOURCE_E:
			setSourceE((VBRElementValueView) null);
			return;
		case VBRVMPackage.VBR_ELEMENT_VALUE_CONNECT_ACTION__TARGET_ACT:
			setTargetACT((VBRActionView) null);
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
		case VBRVMPackage.VBR_ELEMENT_VALUE_CONNECT_ACTION__X:
			return x != X_EDEFAULT;
		case VBRVMPackage.VBR_ELEMENT_VALUE_CONNECT_ACTION__WIDTH:
			return width != WIDTH_EDEFAULT;
		case VBRVMPackage.VBR_ELEMENT_VALUE_CONNECT_ACTION__Y:
			return y != Y_EDEFAULT;
		case VBRVMPackage.VBR_ELEMENT_VALUE_CONNECT_ACTION__SOURCE_E:
			return sourceE != null;
		case VBRVMPackage.VBR_ELEMENT_VALUE_CONNECT_ACTION__TARGET_ACT:
			return targetACT != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //VBRElementValueConnectActionImpl
