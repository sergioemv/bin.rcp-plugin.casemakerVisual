/**
 * <copyright>
 * </copyright>
 *
 * $Id: BusinessObjectImpl.java,v 1.3 2005/09/07 16:35:11 hcanedo Exp $
 */
package biz.bi.vbr.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import biz.bi.vbr.BusinessObject;
import biz.bi.vbr.BusinessValue;
import biz.bi.vbr.FormalPolicy;
import biz.bi.vbr.VBRPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link biz.bi.vbr.impl.BusinessObjectImpl#getId <em>Id</em>}</li>
 *   <li>{@link biz.bi.vbr.impl.BusinessObjectImpl#getBoName <em>Bo Name</em>}</li>
 *   <li>{@link biz.bi.vbr.impl.BusinessObjectImpl#getBoDescription <em>Bo Description</em>}</li>
 *   <li>{@link biz.bi.vbr.impl.BusinessObjectImpl#getM_BusinessValue <em>MBusiness Value</em>}</li>
 *   <li>{@link biz.bi.vbr.impl.BusinessObjectImpl#getM_FromalPolicy <em>MFromal Policy</em>}</li>
 *   <li>{@link biz.bi.vbr.impl.BusinessObjectImpl#getBotimeStamp <em>Botime Stamp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessObjectImpl extends EObjectImpl implements BusinessObject {
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
	 * The default value of the '{@link #getBoName() <em>Bo Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoName()
	 * @generated
	 * @ordered
	 */
	protected static final String BO_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoName() <em>Bo Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoName()
	 * @generated
	 * @ordered
	 */
	protected String boName = BO_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBoDescription() <em>Bo Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String BO_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoDescription() <em>Bo Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoDescription()
	 * @generated
	 * @ordered
	 */
	protected String boDescription = BO_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getM_BusinessValue() <em>MBusiness Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_BusinessValue()
	 * @generated
	 * @ordered
	 */
	protected EList m_BusinessValue = null;

	/**
	 * The default value of the '{@link #getBotimeStamp() <em>Botime Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBotimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date BOTIME_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBotimeStamp() <em>Botime Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBotimeStamp()
	 * @generated
	 * @ordered
	 */
	protected Date botimeStamp = BOTIME_STAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return VBRPackage.eINSTANCE.getBusinessObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBoName() {
		return boName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoName(String newBoName) {
		String oldBoName = boName;
		boName = newBoName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VBRPackage.BUSINESS_OBJECT__BO_NAME, oldBoName, boName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBoDescription() {
		return boDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoDescription(String newBoDescription) {
		String oldBoDescription = boDescription;
		boDescription = newBoDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VBRPackage.BUSINESS_OBJECT__BO_DESCRIPTION,
					oldBoDescription, boDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getM_BusinessValue() {
		if (m_BusinessValue == null) {
			m_BusinessValue = new EObjectContainmentWithInverseEList(
					BusinessValue.class, this,
					VBRPackage.BUSINESS_OBJECT__MBUSINESS_VALUE,
					VBRPackage.BUSINESS_VALUE__MBUSINESS_OBJECT);
		}
		return m_BusinessValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalPolicy getM_FromalPolicy() {
		if (eContainerFeatureID != VBRPackage.BUSINESS_OBJECT__MFROMAL_POLICY)
			return null;
		return (FormalPolicy) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_FromalPolicy(FormalPolicy newM_FromalPolicy) {
		if (newM_FromalPolicy != eContainer
				|| (eContainerFeatureID != VBRPackage.BUSINESS_OBJECT__MFROMAL_POLICY && newM_FromalPolicy != null)) {
			if (EcoreUtil.isAncestor(this, newM_FromalPolicy))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newM_FromalPolicy != null)
				msgs = ((InternalEObject) newM_FromalPolicy).eInverseAdd(this,
						VBRPackage.FORMAL_POLICY__MBUSINESS_OBJECT,
						FormalPolicy.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newM_FromalPolicy,
					VBRPackage.BUSINESS_OBJECT__MFROMAL_POLICY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VBRPackage.BUSINESS_OBJECT__MFROMAL_POLICY,
					newM_FromalPolicy, newM_FromalPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBotimeStamp() {
		return botimeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBotimeStamp(Date newBotimeStamp) {
		Date oldBotimeStamp = botimeStamp;
		botimeStamp = newBotimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VBRPackage.BUSINESS_OBJECT__BOTIME_STAMP, oldBotimeStamp,
					botimeStamp));
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
					VBRPackage.BUSINESS_OBJECT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
			case VBRPackage.BUSINESS_OBJECT__MBUSINESS_VALUE:
				return ((InternalEList) getM_BusinessValue()).basicAdd(
						otherEnd, msgs);
			case VBRPackage.BUSINESS_OBJECT__MFROMAL_POLICY:
				if (eContainer != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
						VBRPackage.BUSINESS_OBJECT__MFROMAL_POLICY, msgs);
			default:
				return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
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
			case VBRPackage.BUSINESS_OBJECT__MBUSINESS_VALUE:
				return ((InternalEList) getM_BusinessValue()).basicRemove(
						otherEnd, msgs);
			case VBRPackage.BUSINESS_OBJECT__MFROMAL_POLICY:
				return eBasicSetContainer(null,
						VBRPackage.BUSINESS_OBJECT__MFROMAL_POLICY, msgs);
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
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
			case VBRPackage.BUSINESS_OBJECT__MFROMAL_POLICY:
				return eContainer.eInverseRemove(this,
						VBRPackage.FORMAL_POLICY__MBUSINESS_OBJECT,
						FormalPolicy.class, msgs);
			default:
				return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
				- eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
		case VBRPackage.BUSINESS_OBJECT__ID:
			return getId();
		case VBRPackage.BUSINESS_OBJECT__BO_NAME:
			return getBoName();
		case VBRPackage.BUSINESS_OBJECT__BO_DESCRIPTION:
			return getBoDescription();
		case VBRPackage.BUSINESS_OBJECT__MBUSINESS_VALUE:
			return getM_BusinessValue();
		case VBRPackage.BUSINESS_OBJECT__MFROMAL_POLICY:
			return getM_FromalPolicy();
		case VBRPackage.BUSINESS_OBJECT__BOTIME_STAMP:
			return getBotimeStamp();
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
		case VBRPackage.BUSINESS_OBJECT__ID:
			setId((String) newValue);
			return;
		case VBRPackage.BUSINESS_OBJECT__BO_NAME:
			setBoName((String) newValue);
			return;
		case VBRPackage.BUSINESS_OBJECT__BO_DESCRIPTION:
			setBoDescription((String) newValue);
			return;
		case VBRPackage.BUSINESS_OBJECT__MBUSINESS_VALUE:
			getM_BusinessValue().clear();
			getM_BusinessValue().addAll((Collection) newValue);
			return;
		case VBRPackage.BUSINESS_OBJECT__MFROMAL_POLICY:
			setM_FromalPolicy((FormalPolicy) newValue);
			return;
		case VBRPackage.BUSINESS_OBJECT__BOTIME_STAMP:
			setBotimeStamp((Date) newValue);
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
		case VBRPackage.BUSINESS_OBJECT__ID:
			setId(ID_EDEFAULT);
			return;
		case VBRPackage.BUSINESS_OBJECT__BO_NAME:
			setBoName(BO_NAME_EDEFAULT);
			return;
		case VBRPackage.BUSINESS_OBJECT__BO_DESCRIPTION:
			setBoDescription(BO_DESCRIPTION_EDEFAULT);
			return;
		case VBRPackage.BUSINESS_OBJECT__MBUSINESS_VALUE:
			getM_BusinessValue().clear();
			return;
		case VBRPackage.BUSINESS_OBJECT__MFROMAL_POLICY:
			setM_FromalPolicy((FormalPolicy) null);
			return;
		case VBRPackage.BUSINESS_OBJECT__BOTIME_STAMP:
			setBotimeStamp(BOTIME_STAMP_EDEFAULT);
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
		case VBRPackage.BUSINESS_OBJECT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case VBRPackage.BUSINESS_OBJECT__BO_NAME:
			return BO_NAME_EDEFAULT == null ? boName != null
					: !BO_NAME_EDEFAULT.equals(boName);
		case VBRPackage.BUSINESS_OBJECT__BO_DESCRIPTION:
			return BO_DESCRIPTION_EDEFAULT == null ? boDescription != null
					: !BO_DESCRIPTION_EDEFAULT.equals(boDescription);
		case VBRPackage.BUSINESS_OBJECT__MBUSINESS_VALUE:
			return m_BusinessValue != null && !m_BusinessValue.isEmpty();
		case VBRPackage.BUSINESS_OBJECT__MFROMAL_POLICY:
			return getM_FromalPolicy() != null;
		case VBRPackage.BUSINESS_OBJECT__BOTIME_STAMP:
			return BOTIME_STAMP_EDEFAULT == null ? botimeStamp != null
					: !BOTIME_STAMP_EDEFAULT.equals(botimeStamp);
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
		result.append(", boName: "); //$NON-NLS-1$
		result.append(boName);
		result.append(", boDescription: "); //$NON-NLS-1$
		result.append(boDescription);
		result.append(", botimeStamp: "); //$NON-NLS-1$
		result.append(botimeStamp);
		result.append(')');
		return result.toString();
	}

} //BusinessObjectImpl
