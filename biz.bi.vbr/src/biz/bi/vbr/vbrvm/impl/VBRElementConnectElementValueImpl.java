/**
 * <copyright>
 * </copyright>
 *
 * $Id: VBRElementConnectElementValueImpl.java,v 1.2 2005/09/01 22:17:38 hcanedo Exp $
 */
package biz.bi.vbr.vbrvm.impl;

import biz.bi.vbr.vbrvm.VBRElementConnectElementValue;
import biz.bi.vbr.vbrvm.VBRElementValueView;
import biz.bi.vbr.vbrvm.VBRElementView;
import biz.bi.vbr.vbrvm.VBRVMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VBR Element Connect Element Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link biz.bi.vbr.vbrvm.impl.VBRElementConnectElementValueImpl#getESource <em>ESource</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.impl.VBRElementConnectElementValueImpl#getEVTarget <em>EV Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VBRElementConnectElementValueImpl extends AbstractLineImpl
		implements VBRElementConnectElementValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getESource() <em>ESource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESource()
	 * @generated
	 * @ordered
	 */
	protected VBRElementView eSource = null;

	/**
	 * The cached value of the '{@link #getEVTarget() <em>EV Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEVTarget()
	 * @generated
	 * @ordered
	 */
	protected VBRElementValueView evTarget = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VBRElementConnectElementValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return VBRVMPackage.eINSTANCE.getVBRElementConnectElementValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRElementView getESource() {
		if (eSource != null && eSource.eIsProxy()) {
			VBRElementView oldESource = eSource;
			eSource = (VBRElementView) eResolveProxy((InternalEObject) eSource);
			if (eSource != oldESource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							VBRVMPackage.VBR_ELEMENT_CONNECT_ELEMENT_VALUE__ESOURCE,
							oldESource, eSource));
			}
		}
		return eSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRElementView basicGetESource() {
		return eSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setESource(VBRElementView newESource) {
		VBRElementView oldESource = eSource;
		eSource = newESource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VBRVMPackage.VBR_ELEMENT_CONNECT_ELEMENT_VALUE__ESOURCE,
					oldESource, eSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRElementValueView getEVTarget() {
		if (evTarget != null && evTarget.eIsProxy()) {
			VBRElementValueView oldEVTarget = evTarget;
			evTarget = (VBRElementValueView) eResolveProxy((InternalEObject) evTarget);
			if (evTarget != oldEVTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							VBRVMPackage.VBR_ELEMENT_CONNECT_ELEMENT_VALUE__EV_TARGET,
							oldEVTarget, evTarget));
			}
		}
		return evTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRElementValueView basicGetEVTarget() {
		return evTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEVTarget(VBRElementValueView newEVTarget) {
		VBRElementValueView oldEVTarget = evTarget;
		evTarget = newEVTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VBRVMPackage.VBR_ELEMENT_CONNECT_ELEMENT_VALUE__EV_TARGET,
					oldEVTarget, evTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
		case VBRVMPackage.VBR_ELEMENT_CONNECT_ELEMENT_VALUE__X:
			return new Integer(getX());
		case VBRVMPackage.VBR_ELEMENT_CONNECT_ELEMENT_VALUE__WIDTH:
			return new Integer(getWidth());
		case VBRVMPackage.VBR_ELEMENT_CONNECT_ELEMENT_VALUE__Y:
			return new Integer(getY());
		case VBRVMPackage.VBR_ELEMENT_CONNECT_ELEMENT_VALUE__ESOURCE:
			if (resolve)
				return getESource();
			return basicGetESource();
		case VBRVMPackage.VBR_ELEMENT_CONNECT_ELEMENT_VALUE__EV_TARGET:
			if (resolve)
				return getEVTarget();
			return basicGetEVTarget();
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
		case VBRVMPackage.VBR_ELEMENT_CONNECT_ELEMENT_VALUE__X:
			setX(((Integer) newValue).intValue());
			return;
		case VBRVMPackage.VBR_ELEMENT_CONNECT_ELEMENT_VALUE__WIDTH:
			setWidth(((Integer) newValue).intValue());
			return;
		case VBRVMPackage.VBR_ELEMENT_CONNECT_ELEMENT_VALUE__Y:
			setY(((Integer) newValue).intValue());
			return;
		case VBRVMPackage.VBR_ELEMENT_CONNECT_ELEMENT_VALUE__ESOURCE:
			setESource((VBRElementView) newValue);
			return;
		case VBRVMPackage.VBR_ELEMENT_CONNECT_ELEMENT_VALUE__EV_TARGET:
			setEVTarget((VBRElementValueView) newValue);
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
		case VBRVMPackage.VBR_ELEMENT_CONNECT_ELEMENT_VALUE__X:
			setX(X_EDEFAULT);
			return;
		case VBRVMPackage.VBR_ELEMENT_CONNECT_ELEMENT_VALUE__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case VBRVMPackage.VBR_ELEMENT_CONNECT_ELEMENT_VALUE__Y:
			setY(Y_EDEFAULT);
			return;
		case VBRVMPackage.VBR_ELEMENT_CONNECT_ELEMENT_VALUE__ESOURCE:
			setESource((VBRElementView) null);
			return;
		case VBRVMPackage.VBR_ELEMENT_CONNECT_ELEMENT_VALUE__EV_TARGET:
			setEVTarget((VBRElementValueView) null);
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
		case VBRVMPackage.VBR_ELEMENT_CONNECT_ELEMENT_VALUE__X:
			return x != X_EDEFAULT;
		case VBRVMPackage.VBR_ELEMENT_CONNECT_ELEMENT_VALUE__WIDTH:
			return width != WIDTH_EDEFAULT;
		case VBRVMPackage.VBR_ELEMENT_CONNECT_ELEMENT_VALUE__Y:
			return y != Y_EDEFAULT;
		case VBRVMPackage.VBR_ELEMENT_CONNECT_ELEMENT_VALUE__ESOURCE:
			return eSource != null;
		case VBRVMPackage.VBR_ELEMENT_CONNECT_ELEMENT_VALUE__EV_TARGET:
			return evTarget != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //VBRElementConnectElementValueImpl
