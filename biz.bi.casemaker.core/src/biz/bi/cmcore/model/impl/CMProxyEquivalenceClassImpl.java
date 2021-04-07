/**
 * <copyright>
 * </copyright>
 *
 * $Id: CMProxyEquivalenceClassImpl.java,v 1.26 2005/09/20 15:08:08 smoreno Exp $
 */
package biz.bi.cmcore.model.impl;

import java.util.Collection;
import java.util.Date;

import java.util.HashMap;
import java.util.Iterator;

import model.Effect;
import model.EquivalenceClass;

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
import biz.bi.cmcore.model.CMProxyEffect;
import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proxy Equivalence Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyEquivalenceClassImpl#getM_EquivalenceClass <em>MEquivalence Class</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyEquivalenceClassImpl#getProxyElement <em>Proxy Element</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyEquivalenceClassImpl#getProxyEffect <em>Proxy Effect</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyEquivalenceClassImpl#getUniqueId <em>Unique Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CMProxyEquivalenceClassImpl extends EObjectImpl implements
		CMProxyEquivalenceClass {
	protected static HashMap activeEquivalenceClasses = new HashMap();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getM_EquivalenceClass() <em>MEquivalence Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_EquivalenceClass()
	 * @generated
	 * @ordered
	 */
	protected static final EquivalenceClass MEQUIVALENCE_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getM_EquivalenceClass() <em>MEquivalence Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_EquivalenceClass()
	 * @generated
	 * @ordered
	 */
	protected EquivalenceClass m_EquivalenceClass = MEQUIVALENCE_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProxyEffect() <em>Proxy Effect</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyEffect()
	 * @generated
	 * @ordered
	 */
	protected EList proxyEffect = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CMProxyEquivalenceClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CMCorePackage.eINSTANCE.getCMProxyEquivalenceClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalenceClass getM_EquivalenceClass() {
		return m_EquivalenceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_EquivalenceClass(EquivalenceClass newM_EquivalenceClass) {
		EquivalenceClass oldM_EquivalenceClass = m_EquivalenceClass;
		m_EquivalenceClass = newM_EquivalenceClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__MEQUIVALENCE_CLASS,
					oldM_EquivalenceClass, m_EquivalenceClass));
	}

	/*	public void setM_EquivalenceClass(EquivalenceClass newM_EquivalenceClass) {
	 //call the old set
	 setM_EquivalenceClassGen(newM_EquivalenceClass);
	 //check for the effects present on the testObject
	 checkEffects();

	 }/*

	 /**
	 * Check the effects referenced on the model
	 * search thje testobject for the ProxyEffects
	 * it doesnt try to create new ones 
	 */
	protected void checkEffects() {
		CMProxyEffect l_CMProxyEffect = null;
		for (Iterator i = this.getM_EquivalenceClass().getLnkEffects()
				.iterator(); i.hasNext();) {
			Effect l_Effect = (Effect) i.next();
			if (this.getProxyEffect(l_Effect) == null) {
				if (this.getProxyElement() != null)
					if (this.getProxyElement().getProxyTestObject() != null)
						l_CMProxyEffect = ((CMProxyTestObjectImpl) this
								.getProxyElement().getProxyTestObject())
								.getProxyEffect(l_Effect);
				if (l_CMProxyEffect != null) {
					this.getProxyEffect().add(l_CMProxyEffect);
					l_CMProxyEffect.getProxyEquivalenceClass().add(this);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMProxyElement getProxyElement() {
		if (eContainerFeatureID != CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__PROXY_ELEMENT)
			return null;
		return (CMProxyElement) eContainer;
	}

	public void setProxyElement(CMProxyElement newProxyElement) {
		{
			//call the original set
			setProxyElementGen(newProxyElement);
			//set the unique ID
			//set the correct unique id
			if (newProxyElement != null)
				this.setUniqueId(newProxyElement.getUniqueId()
						+ CMCorePlugin.INSTANCE.getString("ID_separator")
						+ CMCorePlugin.INSTANCE.getString("ECLASS_separator")
						+ this.getId());
			else
				this.setUniqueId("DELETED");

		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProxyElementGen(CMProxyElement newProxyElement) {
		if (newProxyElement != eContainer
				|| (eContainerFeatureID != CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__PROXY_ELEMENT && newProxyElement != null)) {
			if (EcoreUtil.isAncestor(this, newProxyElement))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProxyElement != null)
				msgs = ((InternalEObject) newProxyElement)
						.eInverseAdd(
								this,
								CMCorePackage.CM_PROXY_ELEMENT__PROXY_EQUIVALENCE_CLASS,
								CMProxyElement.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newProxyElement,
					CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__PROXY_ELEMENT,
					msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__PROXY_ELEMENT,
					newProxyElement, newProxyElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProxyEffect() {
		if (proxyEffect == null) {
			proxyEffect = new EObjectWithInverseResolvingEList.ManyInverse(
					CMProxyEffect.class, this,
					CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__PROXY_EFFECT,
					CMCorePackage.CM_PROXY_EFFECT__PROXY_EQUIVALENCE_CLASS);
		}
		return proxyEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String newUniqueId) {
		{
			//delete the old reference from the opened elements list
			if (uniqueId != null)
				activeEquivalenceClasses.remove(uniqueId);
			//call the original set
			setUniqueIdGen(newUniqueId);
			//put the new id on the map
			activeEquivalenceClasses.put(uniqueId, this);
		}
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
					CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__UNIQUE_ID,
					oldUniqueId, uniqueId));
	}

	public CMProxyEffect getProxyEffect(Effect p_Effect) {
		for (Iterator iter = this.getProxyEffect().iterator(); iter.hasNext();) {
			CMProxyEffect l_CMProxyEffect = (CMProxyEffect) iter.next();
			if (p_Effect.equals((l_CMProxyEffect).getM_Effect()))
				return l_CMProxyEffect;
		}
		return null;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author Sergio M
	 */
	public String getId() {
		if (isProxyModelSet())
			return new Integer(m_EquivalenceClass.getId()).toString();
		else
			return CMCorePlugin.getPlugin().getString("NOMODEL_id");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 * @author smoreno
	 */
	public String getName() {
		if (isProxyModelSet())
			return m_EquivalenceClass.getName();
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
		if (isProxyModelSet())
			return m_EquivalenceClass.getDescription();
		else
			return CMCorePlugin.getPlugin().getString("NOMODEL_description");

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author Sergio M
	 */
	public boolean isProxyModelSet() {
		return (m_EquivalenceClass != null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author hcanedo
	 */
	public void setDescription(String p_Description) {
		if (isProxyModelSet()) {
			String oldDescription = m_EquivalenceClass.getDescription();
			m_EquivalenceClass.setDescription(p_Description);
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(
						this,
						Notification.SET,
						CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__MEQUIVALENCE_CLASS,
						oldDescription, p_Description));
		} else {
			throw new UnsupportedOperationException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author hcanedo
	 */
	public void setName(String p_Name) {
		if (isProxyModelSet()) {
			String oldName = m_EquivalenceClass.getName();
			m_EquivalenceClass.setName(p_Name);
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(
						this,
						Notification.SET,
						CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__MEQUIVALENCE_CLASS,
						oldName, p_Name));
		} else {
			throw new UnsupportedOperationException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public Object getCMModel() {
		return this.getM_EquivalenceClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public void setCMModel(Object CMModel) {
		this.setM_EquivalenceClass((EquivalenceClass) CMModel);
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
	public int getRiskLevel() {
		if (isProxyModelSet()) {
			return m_EquivalenceClass.getM_RiskLevel();
		} else
			return -1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public int getState() {
		if (isProxyModelSet()) {
			return m_EquivalenceClass.getState();
		} else
			return -1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author Sergio M
	 */
	public String getStateName() {
		if (isProxyModelSet()) {
			return m_EquivalenceClass.getStateName();
		} else
			return CMCorePlugin.getPlugin().getString("NOMODEL_name");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author Sergio M
	 */
	public String getValue() {
		if (isProxyModelSet())
			return m_EquivalenceClass.getValue();
		else
			return CMCorePlugin.getPlugin().getString("NOMODEL_name");

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author hcanedo
	 */
	public void setRiskLevel(int p_RiskLevel) {
		if (isProxyModelSet()) {
			int oldRiskLevel = m_EquivalenceClass.getM_RiskLevel();
			m_EquivalenceClass.setM_RiskLevel(p_RiskLevel);
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(
						this,
						Notification.SET,
						CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__MEQUIVALENCE_CLASS,
						oldRiskLevel, p_RiskLevel));
		} else {
			throw new UnsupportedOperationException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public void setValue(String p_Value) {
		if (isProxyModelSet()) {
			String oldValue = m_EquivalenceClass.getValue();
			m_EquivalenceClass.setValue(p_Value);
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(
						this,
						Notification.SET,
						CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__MEQUIVALENCE_CLASS,
						oldValue, p_Value));
		} else {
			throw new UnsupportedOperationException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author Sergio M
	 */
	public void setState(int p_State) {
		if (isProxyModelSet()) {
			int oldState = getState();
			this.m_EquivalenceClass.setState(p_State);
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(
						this,
						Notification.SET,
						CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__MEQUIVALENCE_CLASS,
						oldState, p_State));
		} else
			throw new UnsupportedOperationException();
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
			case CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__PROXY_ELEMENT:
				if (eContainer != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(
						otherEnd,
						CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__PROXY_ELEMENT,
						msgs);
			case CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__PROXY_EFFECT:
				return ((InternalEList) getProxyEffect()).basicAdd(otherEnd,
						msgs);
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
			case CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__PROXY_ELEMENT:
				return eBasicSetContainer(
						null,
						CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__PROXY_ELEMENT,
						msgs);
			case CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__PROXY_EFFECT:
				return ((InternalEList) getProxyEffect()).basicRemove(otherEnd,
						msgs);
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
			case CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__PROXY_ELEMENT:
				return eContainer
						.eInverseRemove(
								this,
								CMCorePackage.CM_PROXY_ELEMENT__PROXY_EQUIVALENCE_CLASS,
								CMProxyElement.class, msgs);
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
		case CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__MEQUIVALENCE_CLASS:
			return getM_EquivalenceClass();
		case CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__PROXY_ELEMENT:
			return getProxyElement();
		case CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__PROXY_EFFECT:
			return getProxyEffect();
		case CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__UNIQUE_ID:
			return getUniqueId();
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
		case CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__MEQUIVALENCE_CLASS:
			setM_EquivalenceClass((EquivalenceClass) newValue);
			return;
		case CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__PROXY_ELEMENT:
			setProxyElement((CMProxyElement) newValue);
			return;
		case CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__PROXY_EFFECT:
			getProxyEffect().clear();
			getProxyEffect().addAll((Collection) newValue);
			return;
		case CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__UNIQUE_ID:
			setUniqueId((String) newValue);
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
		case CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__MEQUIVALENCE_CLASS:
			setM_EquivalenceClass(MEQUIVALENCE_CLASS_EDEFAULT);
			return;
		case CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__PROXY_ELEMENT:
			setProxyElement((CMProxyElement) null);
			return;
		case CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__PROXY_EFFECT:
			getProxyEffect().clear();
			return;
		case CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__UNIQUE_ID:
			setUniqueId(UNIQUE_ID_EDEFAULT);
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
		case CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__MEQUIVALENCE_CLASS:
			return MEQUIVALENCE_CLASS_EDEFAULT == null ? m_EquivalenceClass != null
					: !MEQUIVALENCE_CLASS_EDEFAULT.equals(m_EquivalenceClass);
		case CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__PROXY_ELEMENT:
			return getProxyElement() != null;
		case CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__PROXY_EFFECT:
			return proxyEffect != null && !proxyEffect.isEmpty();
		case CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__UNIQUE_ID:
			return UNIQUE_ID_EDEFAULT == null ? uniqueId != null
					: !UNIQUE_ID_EDEFAULT.equals(uniqueId);
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

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.CMProxyEquivalenceClass#addProxyEffect(biz.bi.cmcore.model.CMProxyEffect)
	 */
	public void addProxyEffect(CMProxyEffect p_child, boolean doCMModel) {
		if (doCMModel)
			if ((this.isProxyModelSet()) && (p_child.isProxyModelSet()))
				if (!this.getM_EquivalenceClass().getLnkEffects().contains(
						p_child.getM_Effect())) {
					this.getM_EquivalenceClass().getLnkEffects().add(
							p_child.getM_Effect());
					p_child.getM_Effect().getLnkEquivalenceClasses().add(
							this.getM_EquivalenceClass());
				}
		this.getProxyEffect().add(p_child);
		p_child.getProxyEquivalenceClass().add(this);

	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.CMProxyEquivalenceClass#removeProxyEffect(biz.bi.cmcore.model.CMProxyEffect)
	 */
	public void removeProxyEffect(CMProxyEffect p_child, boolean doCMModel) {
		if (doCMModel)
			if ((this.isProxyModelSet()) && (p_child.isProxyModelSet()))
				if (this.getM_EquivalenceClass().getLnkEffects().contains(
						p_child.getM_Effect())) {
					this.getM_EquivalenceClass().getLnkEffects().remove(
							p_child.getM_Effect());
					p_child.getM_Effect().getLnkEquivalenceClasses().remove(
							this.getM_EquivalenceClass());
				}
		this.getProxyEffect().remove(p_child);
		p_child.getProxyEquivalenceClass().remove(this);

	}

} //CMProxyEquivalenceClassImpl
