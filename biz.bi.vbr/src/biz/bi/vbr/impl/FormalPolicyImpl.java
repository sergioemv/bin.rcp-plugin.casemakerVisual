/**
 * <copyright>
 * </copyright>
 *
 * $Id: FormalPolicyImpl.java,v 1.6 2005/09/20 19:03:42 hcanedo Exp $
 */
package biz.bi.vbr.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import biz.bi.vbr.BusinessAction;
import biz.bi.vbr.BusinessObject;
import biz.bi.vbr.FormalPolicy;
import biz.bi.vbr.VBRPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formal Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link biz.bi.vbr.impl.FormalPolicyImpl#getFpDescription <em>Fp Description</em>}</li>
 *   <li>{@link biz.bi.vbr.impl.FormalPolicyImpl#getUniqueId <em>Unique Id</em>}</li>
 *   <li>{@link biz.bi.vbr.impl.FormalPolicyImpl#getM_BusinessObject <em>MBusiness Object</em>}</li>
 *   <li>{@link biz.bi.vbr.impl.FormalPolicyImpl#getM_BusinessAction <em>MBusiness Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormalPolicyImpl extends EObjectImpl implements FormalPolicy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getFpDescription() <em>Fp Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFpDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String FP_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFpDescription() <em>Fp Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFpDescription()
	 * @generated
	 * @ordered
	 */
	protected String fpDescription = FP_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUniqueId() <em>Unique Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueId()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUniqueId() <em>Unique Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueId()
	 * @generated
	 * @ordered
	 */
	protected String uniqueId = UNIQUE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getM_BusinessObject() <em>MBusiness Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_BusinessObject()
	 * @generated
	 * @ordered
	 */
	protected EList m_BusinessObject = null;

	/**
	 * The cached value of the '{@link #getM_BusinessAction() <em>MBusiness Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_BusinessAction()
	 * @generated
	 * @ordered
	 */
	protected EList m_BusinessAction = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormalPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return VBRPackage.eINSTANCE.getFormalPolicy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFpDescription() {
		return fpDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFpDescription(String newFpDescription) {
		String oldFpDescription = fpDescription;
		fpDescription = newFpDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VBRPackage.FORMAL_POLICY__FP_DESCRIPTION, oldFpDescription,
					fpDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getM_BusinessObject() {
		if (m_BusinessObject == null) {
			m_BusinessObject = new EObjectContainmentEList(
					BusinessObject.class, this,
					VBRPackage.FORMAL_POLICY__MBUSINESS_OBJECT);
		}
		return m_BusinessObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getM_BusinessAction() {
		if (m_BusinessAction == null) {
			m_BusinessAction = new EObjectContainmentEList(
					BusinessAction.class, this,
					VBRPackage.FORMAL_POLICY__MBUSINESS_ACTION);
		}
		return m_BusinessAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUniqueId() {
		return uniqueId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueId(String newUniqueId) {
		String oldUniqueId = uniqueId;
		uniqueId = newUniqueId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VBRPackage.FORMAL_POLICY__UNIQUE_ID, oldUniqueId, uniqueId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
			case VBRPackage.FORMAL_POLICY__MBUSINESS_OBJECT:
				return ((InternalEList) getM_BusinessObject()).basicRemove(
						otherEnd, msgs);
			case VBRPackage.FORMAL_POLICY__MBUSINESS_ACTION:
				return ((InternalEList) getM_BusinessAction()).basicRemove(
						otherEnd, msgs);
			default:
				return eDynamicInverseRemove(otherEnd, featureID, baseClass,
						msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
		case VBRPackage.FORMAL_POLICY__FP_DESCRIPTION:
			return getFpDescription();
		case VBRPackage.FORMAL_POLICY__UNIQUE_ID:
			return getUniqueId();
		case VBRPackage.FORMAL_POLICY__MBUSINESS_OBJECT:
			return getM_BusinessObject();
		case VBRPackage.FORMAL_POLICY__MBUSINESS_ACTION:
			return getM_BusinessAction();
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
		case VBRPackage.FORMAL_POLICY__FP_DESCRIPTION:
			setFpDescription((String) newValue);
			return;
		case VBRPackage.FORMAL_POLICY__UNIQUE_ID:
			setUniqueId((String) newValue);
			return;
		case VBRPackage.FORMAL_POLICY__MBUSINESS_OBJECT:
			getM_BusinessObject().clear();
			getM_BusinessObject().addAll((Collection) newValue);
			return;
		case VBRPackage.FORMAL_POLICY__MBUSINESS_ACTION:
			getM_BusinessAction().clear();
			getM_BusinessAction().addAll((Collection) newValue);
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
		case VBRPackage.FORMAL_POLICY__FP_DESCRIPTION:
			setFpDescription(FP_DESCRIPTION_EDEFAULT);
			return;
		case VBRPackage.FORMAL_POLICY__UNIQUE_ID:
			setUniqueId(UNIQUE_ID_EDEFAULT);
			return;
		case VBRPackage.FORMAL_POLICY__MBUSINESS_OBJECT:
			getM_BusinessObject().clear();
			return;
		case VBRPackage.FORMAL_POLICY__MBUSINESS_ACTION:
			getM_BusinessAction().clear();
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
		case VBRPackage.FORMAL_POLICY__FP_DESCRIPTION:
			return FP_DESCRIPTION_EDEFAULT == null ? fpDescription != null
					: !FP_DESCRIPTION_EDEFAULT.equals(fpDescription);
		case VBRPackage.FORMAL_POLICY__UNIQUE_ID:
			return UNIQUE_ID_EDEFAULT == null ? uniqueId != null
					: !UNIQUE_ID_EDEFAULT.equals(uniqueId);
		case VBRPackage.FORMAL_POLICY__MBUSINESS_OBJECT:
			return m_BusinessObject != null && !m_BusinessObject.isEmpty();
		case VBRPackage.FORMAL_POLICY__MBUSINESS_ACTION:
			return m_BusinessAction != null && !m_BusinessAction.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (fpDescription: "); //$NON-NLS-1$
		result.append(fpDescription);
		result.append(", uniqueId: "); //$NON-NLS-1$
		result.append(uniqueId);
		result.append(')');
		return result.toString();
	}

	public void saveFormalPolicy() {
		// TODO Auto-generated method stub

	}

} //FormalPolicyImpl
