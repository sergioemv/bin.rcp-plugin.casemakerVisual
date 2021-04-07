/**
 * <copyright>
 * </copyright>
 *
 * $Id: BusinessValueImpl.java,v 1.5 2005/09/20 19:03:42 hcanedo Exp $
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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import biz.bi.vbr.BusinessObject;
import biz.bi.vbr.BusinessValue;
import biz.bi.vbr.InferenceRule;
import biz.bi.vbr.VBRPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link biz.bi.vbr.impl.BusinessValueImpl#getId <em>Id</em>}</li>
 *   <li>{@link biz.bi.vbr.impl.BusinessValueImpl#getBvState <em>Bv State</em>}</li>
 *   <li>{@link biz.bi.vbr.impl.BusinessValueImpl#getBvRisk <em>Bv Risk</em>}</li>
 *   <li>{@link biz.bi.vbr.impl.BusinessValueImpl#getM_BusinessObject <em>MBusiness Object</em>}</li>
 *   <li>{@link biz.bi.vbr.impl.BusinessValueImpl#getM_InferenceRule <em>MInference Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessValueImpl extends AbstractInferenceRuleContentsImpl
		implements BusinessValue {
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
	 * The default value of the '{@link #getBvState() <em>Bv State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBvState()
	 * @generated
	 * @ordered
	 */
	protected static final String BV_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBvState() <em>Bv State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBvState()
	 * @generated
	 * @ordered
	 */
	protected String bvState = BV_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBvRisk() <em>Bv Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBvRisk()
	 * @generated
	 * @ordered
	 */
	protected static final int BV_RISK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBvRisk() <em>Bv Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBvRisk()
	 * @generated
	 * @ordered
	 */
	protected int bvRisk = BV_RISK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getM_InferenceRule() <em>MInference Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_InferenceRule()
	 * @generated
	 * @ordered
	 */
	protected EList m_InferenceRule = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return VBRPackage.eINSTANCE.getBusinessValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBvState() {
		return bvState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBvState(String newBvState) {
		String oldBvState = bvState;
		bvState = newBvState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VBRPackage.BUSINESS_VALUE__BV_STATE, oldBvState, bvState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBvRisk() {
		return bvRisk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBvRisk(int newBvRisk) {
		int oldBvRisk = bvRisk;
		bvRisk = newBvRisk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VBRPackage.BUSINESS_VALUE__BV_RISK, oldBvRisk, bvRisk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessObject getM_BusinessObject() {
		if (eContainerFeatureID != VBRPackage.BUSINESS_VALUE__MBUSINESS_OBJECT)
			return null;
		return (BusinessObject) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_BusinessObject(BusinessObject newM_BusinessObject) {
		if (newM_BusinessObject != eContainer
				|| (eContainerFeatureID != VBRPackage.BUSINESS_VALUE__MBUSINESS_OBJECT && newM_BusinessObject != null)) {
			if (EcoreUtil.isAncestor(this, newM_BusinessObject))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newM_BusinessObject != null)
				msgs = ((InternalEObject) newM_BusinessObject).eInverseAdd(
						this, VBRPackage.BUSINESS_OBJECT__MBUSINESS_VALUE,
						BusinessObject.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newM_BusinessObject,
					VBRPackage.BUSINESS_VALUE__MBUSINESS_OBJECT, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VBRPackage.BUSINESS_VALUE__MBUSINESS_OBJECT,
					newM_BusinessObject, newM_BusinessObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getM_InferenceRule() {
		if (m_InferenceRule == null) {
			m_InferenceRule = new EObjectContainmentEList(InferenceRule.class,
					this, VBRPackage.BUSINESS_VALUE__MINFERENCE_RULE);
		}
		return m_InferenceRule;
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
					VBRPackage.BUSINESS_VALUE__ID, oldId, id));
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
			case VBRPackage.BUSINESS_VALUE__MBUSINESS_OBJECT:
				if (eContainer != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
						VBRPackage.BUSINESS_VALUE__MBUSINESS_OBJECT, msgs);
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
			case VBRPackage.BUSINESS_VALUE__MBUSINESS_OBJECT:
				return eBasicSetContainer(null,
						VBRPackage.BUSINESS_VALUE__MBUSINESS_OBJECT, msgs);
			case VBRPackage.BUSINESS_VALUE__MINFERENCE_RULE:
				return ((InternalEList) getM_InferenceRule()).basicRemove(
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
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
			case VBRPackage.BUSINESS_VALUE__MBUSINESS_OBJECT:
				return eContainer.eInverseRemove(this,
						VBRPackage.BUSINESS_OBJECT__MBUSINESS_VALUE,
						BusinessObject.class, msgs);
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
		case VBRPackage.BUSINESS_VALUE__NAME:
			return getName();
		case VBRPackage.BUSINESS_VALUE__TIME_STAMP:
			return getTimeStamp();
		case VBRPackage.BUSINESS_VALUE__ID:
			return getId();
		case VBRPackage.BUSINESS_VALUE__BV_STATE:
			return getBvState();
		case VBRPackage.BUSINESS_VALUE__BV_RISK:
			return new Integer(getBvRisk());
		case VBRPackage.BUSINESS_VALUE__MBUSINESS_OBJECT:
			return getM_BusinessObject();
		case VBRPackage.BUSINESS_VALUE__MINFERENCE_RULE:
			return getM_InferenceRule();
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
		case VBRPackage.BUSINESS_VALUE__NAME:
			setName((String) newValue);
			return;
		case VBRPackage.BUSINESS_VALUE__TIME_STAMP:
			setTimeStamp((Date) newValue);
			return;
		case VBRPackage.BUSINESS_VALUE__ID:
			setId((String) newValue);
			return;
		case VBRPackage.BUSINESS_VALUE__BV_STATE:
			setBvState((String) newValue);
			return;
		case VBRPackage.BUSINESS_VALUE__BV_RISK:
			setBvRisk(((Integer) newValue).intValue());
			return;
		case VBRPackage.BUSINESS_VALUE__MBUSINESS_OBJECT:
			setM_BusinessObject((BusinessObject) newValue);
			return;
		case VBRPackage.BUSINESS_VALUE__MINFERENCE_RULE:
			getM_InferenceRule().clear();
			getM_InferenceRule().addAll((Collection) newValue);
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
		case VBRPackage.BUSINESS_VALUE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case VBRPackage.BUSINESS_VALUE__TIME_STAMP:
			setTimeStamp(TIME_STAMP_EDEFAULT);
			return;
		case VBRPackage.BUSINESS_VALUE__ID:
			setId(ID_EDEFAULT);
			return;
		case VBRPackage.BUSINESS_VALUE__BV_STATE:
			setBvState(BV_STATE_EDEFAULT);
			return;
		case VBRPackage.BUSINESS_VALUE__BV_RISK:
			setBvRisk(BV_RISK_EDEFAULT);
			return;
		case VBRPackage.BUSINESS_VALUE__MBUSINESS_OBJECT:
			setM_BusinessObject((BusinessObject) null);
			return;
		case VBRPackage.BUSINESS_VALUE__MINFERENCE_RULE:
			getM_InferenceRule().clear();
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
		case VBRPackage.BUSINESS_VALUE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case VBRPackage.BUSINESS_VALUE__TIME_STAMP:
			return TIME_STAMP_EDEFAULT == null ? timeStamp != null
					: !TIME_STAMP_EDEFAULT.equals(timeStamp);
		case VBRPackage.BUSINESS_VALUE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case VBRPackage.BUSINESS_VALUE__BV_STATE:
			return BV_STATE_EDEFAULT == null ? bvState != null
					: !BV_STATE_EDEFAULT.equals(bvState);
		case VBRPackage.BUSINESS_VALUE__BV_RISK:
			return bvRisk != BV_RISK_EDEFAULT;
		case VBRPackage.BUSINESS_VALUE__MBUSINESS_OBJECT:
			return getM_BusinessObject() != null;
		case VBRPackage.BUSINESS_VALUE__MINFERENCE_RULE:
			return m_InferenceRule != null && !m_InferenceRule.isEmpty();
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
		result.append(", bvState: "); //$NON-NLS-1$
		result.append(bvState);
		result.append(", bvRisk: "); //$NON-NLS-1$
		result.append(bvRisk);
		result.append(')');
		return result.toString();
	}

} //BusinessValueImpl
