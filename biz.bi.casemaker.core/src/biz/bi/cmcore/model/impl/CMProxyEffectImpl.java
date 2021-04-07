/**
 * <copyright>
 * </copyright>
 *
 * $Id: CMProxyEffectImpl.java,v 1.19 2005/09/20 15:08:08 smoreno Exp $
 */
package biz.bi.cmcore.model.impl;

import java.util.Collection;
import java.util.Date;

import java.util.HashMap;

import model.Effect;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import biz.bi.cmcore.CMCorePlugin;
import biz.bi.cmcore.model.CMCorePackage;
import biz.bi.cmcore.model.CMProxyCombination;
import biz.bi.cmcore.model.CMProxyEffect;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.cmcore.model.CMProxyTestObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proxy Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyEffectImpl#getM_Effect <em>MEffect</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyEffectImpl#getProxyEquivalenceClass <em>Proxy Equivalence Class</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyEffectImpl#getProxyTestObject <em>Proxy Test Object</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyEffectImpl#getUniqueId <em>Unique Id</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyEffectImpl#getProxyCombination <em>Proxy Combination</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CMProxyEffectImpl extends EObjectImpl implements CMProxyEffect {
	protected static HashMap activeEffects = new HashMap();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getM_Effect() <em>MEffect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_Effect()
	 * @generated
	 * @ordered
	 */
	protected static final Effect MEFFECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getM_Effect() <em>MEffect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_Effect()
	 * @generated
	 * @ordered
	 */
	protected Effect m_Effect = MEFFECT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProxyEquivalenceClass() <em>Proxy Equivalence Class</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyEquivalenceClass()
	 * @generated
	 * @ordered
	 */
	protected EList proxyEquivalenceClass = null;

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
	 * The cached value of the '{@link #getProxyCombination() <em>Proxy Combination</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyCombination()
	 * @generated
	 * @ordered
	 */
	protected EList proxyCombination = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CMProxyEffectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CMCorePackage.eINSTANCE.getCMProxyEffect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Effect getM_Effect() {
		return m_Effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_Effect(Effect newM_Effect) {
		Effect oldM_Effect = m_Effect;
		m_Effect = newM_Effect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CMCorePackage.CM_PROXY_EFFECT__MEFFECT, oldM_Effect,
					m_Effect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProxyEquivalenceClass() {
		if (proxyEquivalenceClass == null) {
			proxyEquivalenceClass = new EObjectWithInverseResolvingEList.ManyInverse(
					CMProxyEquivalenceClass.class, this,
					CMCorePackage.CM_PROXY_EFFECT__PROXY_EQUIVALENCE_CLASS,
					CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__PROXY_EFFECT);
		}
		return proxyEquivalenceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMProxyTestObject getProxyTestObject() {
		if (eContainerFeatureID != CMCorePackage.CM_PROXY_EFFECT__PROXY_TEST_OBJECT)
			return null;
		return (CMProxyTestObject) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProxyTestObjectGen(CMProxyTestObject newProxyTestObject) {
		if (newProxyTestObject != eContainer
				|| (eContainerFeatureID != CMCorePackage.CM_PROXY_EFFECT__PROXY_TEST_OBJECT && newProxyTestObject != null)) {
			if (EcoreUtil.isAncestor(this, newProxyTestObject))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProxyTestObject != null)
				msgs = ((InternalEObject) newProxyTestObject).eInverseAdd(this,
						CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_EFFECT,
						CMProxyTestObject.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newProxyTestObject,
					CMCorePackage.CM_PROXY_EFFECT__PROXY_TEST_OBJECT, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CMCorePackage.CM_PROXY_EFFECT__PROXY_TEST_OBJECT,
					newProxyTestObject, newProxyTestObject));
	}

	public void setProxyTestObject(CMProxyTestObject newProxyTestObject) {
		//call the original set
		setProxyTestObjectGen(newProxyTestObject);
		//set the unique id
		if (newProxyTestObject != null)
			this.setUniqueId(newProxyTestObject.getM_path()
					+ CMCorePlugin.INSTANCE.getString("ID_separator")
					+ CMCorePlugin.INSTANCE.getString("EFFECT_separator")
					+ this.getId());
		else
			this.setUniqueId("DELETED");

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
	public void setUniqueIdGen(String newUniqueId) {
		String oldUniqueId = uniqueId;
		uniqueId = newUniqueId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CMCorePackage.CM_PROXY_EFFECT__UNIQUE_ID, oldUniqueId,
					uniqueId));
	}

	public void setUniqueId(String newUniqueId) {
		//delete the old reference from the opened elements list
		if (uniqueId != null)
			activeEffects.remove(uniqueId);
		//call the original set
		setUniqueIdGen(newUniqueId);
		//put the new id on the map
		activeEffects.put(uniqueId, this);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProxyCombination() {
		if (proxyCombination == null) {
			proxyCombination = new EObjectWithInverseResolvingEList.ManyInverse(
					CMProxyCombination.class, this,
					CMCorePackage.CM_PROXY_EFFECT__PROXY_COMBINATION,
					CMCorePackage.CM_PROXY_COMBINATION__PROXY_EFFECT);
		}
		return proxyCombination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author Sergio M
	 */
	public String getId() {
		if (m_Effect != null)
			return m_Effect.getName();
		else
			return CMCorePlugin.getPlugin().getString("NOMODEL_id");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author Sergio M
	 */
	public String getName() {
		if (m_Effect != null)
			return m_Effect.getName();
		else
			return CMCorePlugin.getPlugin().getString("NOMODEL_name");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author Sergio M
	 */
	public String getDescription() {
		if (m_Effect != null)
			return m_Effect.getDescription();
		else
			return CMCorePlugin.getPlugin().getString("NOMODEL_description");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author hcanedo
	 */
	public boolean isProxyModelSet() {
		return (m_Effect != null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author hcanedo
	 */
	public void setDescription(String p_Description) {
		if (isProxyModelSet()) {
			String oldDescription = m_Effect.getDescription();
			m_Effect.setDescription(p_Description);
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET,
						CMCorePackage.CM_PROXY_ELEMENT__MELEMENT,
						oldDescription, p_Description));

		} else {
			throw new UnsupportedOperationException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String p_Name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public Object getCMModel() {

		return this.getM_Effect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public void setCMModel(Object CMModel) {
		this.setM_Effect((Effect) CMModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimeStamp() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeStamp(Date p_TimeStamp) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public boolean isUsed() {
		return (this.getProxyCombination().size() > 0)
				|| (this.getProxyEquivalenceClass().size() > 0);
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
			case CMCorePackage.CM_PROXY_EFFECT__PROXY_EQUIVALENCE_CLASS:
				return ((InternalEList) getProxyEquivalenceClass()).basicAdd(
						otherEnd, msgs);
			case CMCorePackage.CM_PROXY_EFFECT__PROXY_TEST_OBJECT:
				if (eContainer != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
						CMCorePackage.CM_PROXY_EFFECT__PROXY_TEST_OBJECT, msgs);
			case CMCorePackage.CM_PROXY_EFFECT__PROXY_COMBINATION:
				return ((InternalEList) getProxyCombination()).basicAdd(
						otherEnd, msgs);
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
			case CMCorePackage.CM_PROXY_EFFECT__PROXY_EQUIVALENCE_CLASS:
				return ((InternalEList) getProxyEquivalenceClass())
						.basicRemove(otherEnd, msgs);
			case CMCorePackage.CM_PROXY_EFFECT__PROXY_TEST_OBJECT:
				return eBasicSetContainer(null,
						CMCorePackage.CM_PROXY_EFFECT__PROXY_TEST_OBJECT, msgs);
			case CMCorePackage.CM_PROXY_EFFECT__PROXY_COMBINATION:
				return ((InternalEList) getProxyCombination()).basicRemove(
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
			case CMCorePackage.CM_PROXY_EFFECT__PROXY_TEST_OBJECT:
				return eContainer.eInverseRemove(this,
						CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_EFFECT,
						CMProxyTestObject.class, msgs);
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
		case CMCorePackage.CM_PROXY_EFFECT__MEFFECT:
			return getM_Effect();
		case CMCorePackage.CM_PROXY_EFFECT__PROXY_EQUIVALENCE_CLASS:
			return getProxyEquivalenceClass();
		case CMCorePackage.CM_PROXY_EFFECT__PROXY_TEST_OBJECT:
			return getProxyTestObject();
		case CMCorePackage.CM_PROXY_EFFECT__UNIQUE_ID:
			return getUniqueId();
		case CMCorePackage.CM_PROXY_EFFECT__PROXY_COMBINATION:
			return getProxyCombination();
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
		case CMCorePackage.CM_PROXY_EFFECT__MEFFECT:
			setM_Effect((Effect) newValue);
			return;
		case CMCorePackage.CM_PROXY_EFFECT__PROXY_EQUIVALENCE_CLASS:
			getProxyEquivalenceClass().clear();
			getProxyEquivalenceClass().addAll((Collection) newValue);
			return;
		case CMCorePackage.CM_PROXY_EFFECT__PROXY_TEST_OBJECT:
			setProxyTestObject((CMProxyTestObject) newValue);
			return;
		case CMCorePackage.CM_PROXY_EFFECT__UNIQUE_ID:
			setUniqueId((String) newValue);
			return;
		case CMCorePackage.CM_PROXY_EFFECT__PROXY_COMBINATION:
			getProxyCombination().clear();
			getProxyCombination().addAll((Collection) newValue);
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
		case CMCorePackage.CM_PROXY_EFFECT__MEFFECT:
			setM_Effect(MEFFECT_EDEFAULT);
			return;
		case CMCorePackage.CM_PROXY_EFFECT__PROXY_EQUIVALENCE_CLASS:
			getProxyEquivalenceClass().clear();
			return;
		case CMCorePackage.CM_PROXY_EFFECT__PROXY_TEST_OBJECT:
			setProxyTestObject((CMProxyTestObject) null);
			return;
		case CMCorePackage.CM_PROXY_EFFECT__UNIQUE_ID:
			setUniqueId(UNIQUE_ID_EDEFAULT);
			return;
		case CMCorePackage.CM_PROXY_EFFECT__PROXY_COMBINATION:
			getProxyCombination().clear();
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
		case CMCorePackage.CM_PROXY_EFFECT__MEFFECT:
			return MEFFECT_EDEFAULT == null ? m_Effect != null
					: !MEFFECT_EDEFAULT.equals(m_Effect);
		case CMCorePackage.CM_PROXY_EFFECT__PROXY_EQUIVALENCE_CLASS:
			return proxyEquivalenceClass != null
					&& !proxyEquivalenceClass.isEmpty();
		case CMCorePackage.CM_PROXY_EFFECT__PROXY_TEST_OBJECT:
			return getProxyTestObject() != null;
		case CMCorePackage.CM_PROXY_EFFECT__UNIQUE_ID:
			return UNIQUE_ID_EDEFAULT == null ? uniqueId != null
					: !UNIQUE_ID_EDEFAULT.equals(uniqueId);
		case CMCorePackage.CM_PROXY_EFFECT__PROXY_COMBINATION:
			return proxyCombination != null && !proxyCombination.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author hcanedo
	 */
	public String toString() {

		if (eIsProxy())
			return super.toString();

		return getName();
	}

} //CMProxyEffectImpl
