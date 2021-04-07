/**
 * <copyright>
 * </copyright>
 *
 * $Id: BusinessActionImpl.java,v 1.6 2005/09/20 19:03:42 hcanedo Exp $
 */
package biz.bi.vbr.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import biz.bi.vbr.BusinessAction;
import biz.bi.vbr.BusinessValue;
import biz.bi.vbr.VBRPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link biz.bi.vbr.impl.BusinessActionImpl#getId <em>Id</em>}</li>
 *   <li>{@link biz.bi.vbr.impl.BusinessActionImpl#getBaDescription <em>Ba Description</em>}</li>
 *   <li>{@link biz.bi.vbr.impl.BusinessActionImpl#getM_besidebv <em>Mbesidebv</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessActionImpl extends AbstractInferenceRuleContentsImpl
		implements BusinessAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaDescription() <em>Ba Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String BA_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaDescription() <em>Ba Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaDescription()
	 * @generated
	 * @ordered
	 */
	protected String baDescription = BA_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getM_besidebv() <em>Mbesidebv</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_besidebv()
	 * @generated
	 * @ordered
	 */
	protected EList m_besidebv = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return VBRPackage.eINSTANCE.getBusinessAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VBRPackage.BUSINESS_ACTION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaDescription() {
		return baDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaDescription(String newBaDescription) {
		String oldBaDescription = baDescription;
		baDescription = newBaDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VBRPackage.BUSINESS_ACTION__BA_DESCRIPTION,
					oldBaDescription, baDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getM_besidebv() {
		if (m_besidebv == null) {
			m_besidebv = new EObjectResolvingEList(BusinessValue.class, this,
					VBRPackage.BUSINESS_ACTION__MBESIDEBV);
		}
		return m_besidebv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
		case VBRPackage.BUSINESS_ACTION__NAME:
			return getName();
		case VBRPackage.BUSINESS_ACTION__TIME_STAMP:
			return getTimeStamp();
		case VBRPackage.BUSINESS_ACTION__ID:
			return getId();
		case VBRPackage.BUSINESS_ACTION__BA_DESCRIPTION:
			return getBaDescription();
		case VBRPackage.BUSINESS_ACTION__MBESIDEBV:
			return getM_besidebv();
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
		case VBRPackage.BUSINESS_ACTION__NAME:
			setName((String) newValue);
			return;
		case VBRPackage.BUSINESS_ACTION__TIME_STAMP:
			setTimeStamp((Date) newValue);
			return;
		case VBRPackage.BUSINESS_ACTION__ID:
			setId((String) newValue);
			return;
		case VBRPackage.BUSINESS_ACTION__BA_DESCRIPTION:
			setBaDescription((String) newValue);
			return;
		case VBRPackage.BUSINESS_ACTION__MBESIDEBV:
			getM_besidebv().clear();
			getM_besidebv().addAll((Collection) newValue);
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
		case VBRPackage.BUSINESS_ACTION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case VBRPackage.BUSINESS_ACTION__TIME_STAMP:
			setTimeStamp(TIME_STAMP_EDEFAULT);
			return;
		case VBRPackage.BUSINESS_ACTION__ID:
			setId(ID_EDEFAULT);
			return;
		case VBRPackage.BUSINESS_ACTION__BA_DESCRIPTION:
			setBaDescription(BA_DESCRIPTION_EDEFAULT);
			return;
		case VBRPackage.BUSINESS_ACTION__MBESIDEBV:
			getM_besidebv().clear();
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
		case VBRPackage.BUSINESS_ACTION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case VBRPackage.BUSINESS_ACTION__TIME_STAMP:
			return TIME_STAMP_EDEFAULT == null ? timeStamp != null
					: !TIME_STAMP_EDEFAULT.equals(timeStamp);
		case VBRPackage.BUSINESS_ACTION__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case VBRPackage.BUSINESS_ACTION__BA_DESCRIPTION:
			return BA_DESCRIPTION_EDEFAULT == null ? baDescription != null
					: !BA_DESCRIPTION_EDEFAULT.equals(baDescription);
		case VBRPackage.BUSINESS_ACTION__MBESIDEBV:
			return m_besidebv != null && !m_besidebv.isEmpty();
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
		result.append(" (id: "); //$NON-NLS-1$
		result.append(id);
		result.append(", baDescription: "); //$NON-NLS-1$
		result.append(baDescription);
		result.append(')');
		return result.toString();
	}

} //BusinessActionImpl
