/**
 * <copyright>
 * </copyright>
 *
 * $Id: CMProxyCombinationImpl.java,v 1.28 2005/09/20 15:08:08 smoreno Exp $
 */
package biz.bi.cmcore.model.impl;

import java.util.Collection;
import java.util.Date;

import java.util.HashMap;
import java.util.Iterator;

import model.Combination;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import biz.bi.cmcore.CMCorePlugin;
import biz.bi.cmcore.model.CMCorePackage;
import biz.bi.cmcore.model.CMProxyCombination;
import biz.bi.cmcore.model.CMProxyDependency;
import biz.bi.cmcore.model.CMProxyEffect;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proxy Combination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyCombinationImpl#getM_Combination <em>MCombination</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyCombinationImpl#getProxyDependency <em>Proxy Dependency</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyCombinationImpl#getProxyEquivalenceClass <em>Proxy Equivalence Class</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyCombinationImpl#getProxyEffect <em>Proxy Effect</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyCombinationImpl#getUniqueId <em>Unique Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CMProxyCombinationImpl extends EObjectImpl implements
		CMProxyCombination {
	protected static HashMap activeCombinations = new HashMap();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getM_Combination() <em>MCombination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_Combination()
	 * @generated
	 * @ordered
	 */
	protected static final Combination MCOMBINATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getM_Combination() <em>MCombination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_Combination()
	 * @generated
	 * @ordered
	 */
	protected Combination m_Combination = MCOMBINATION_EDEFAULT;

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
	protected CMProxyCombinationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CMCorePackage.eINSTANCE.getCMProxyCombination();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Combination getM_Combination() {
		return m_Combination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_Combination(Combination newM_Combination) {
		Combination oldM_Combination = m_Combination;
		m_Combination = newM_Combination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CMCorePackage.CM_PROXY_COMBINATION__MCOMBINATION,
					oldM_Combination, m_Combination));
	}

	/*public void setM_Combination(Combination newM_Combination)
	 {
	 //call the original set
	 setM_CombinationGen(newM_Combination);
	 //check for the effects related to the combination
	 checkEffects();
	 }*/

	/**
	 * Check the effects referenced on the model
	 * search thje testobject for the ProxyEffects
	 * it doesnt try to create new ones 
	 */
	protected void checkEffects() {
		CMProxyEffect l_CMProxyEffect = null;
		for (Iterator i = this.getM_Combination().getLnkEffects().iterator(); i
				.hasNext();) {
			Effect l_Effect = (Effect) i.next();
			if (this.getProxyEffect(l_Effect) == null) {
				if (this.getProxyDependency() != null)
					if (this.getProxyDependency().getProxyTestObject() != null)
						l_CMProxyEffect = ((CMProxyTestObjectImpl) this
								.getProxyDependency().getProxyTestObject())
								.getProxyEffect(l_Effect);
				if (l_CMProxyEffect != null) {
					this.getProxyEffect().add(l_CMProxyEffect);
					l_CMProxyEffect.getProxyCombination().add(this);
				}
			}
		}
	}

	/**
	 * Check if the equivalenceClasses corresponding to the diagram are already connected
	 * if not it searches on the main diagram and assigns them 
	 * it doesn't try to create a new ProxyEquivalenceClass
	 */
	protected void checkEquivalenceClasses() {
		CMProxyEquivalenceClass l_CMProxyEquivalenceClass = null;
		for (Iterator i = this.getM_Combination().getLnkEquivalenceClasses()
				.iterator(); i.hasNext();) {
			EquivalenceClass l_EquivalenceClass = (EquivalenceClass) i.next();
			if (this.getProxyEquivalenceClass(l_EquivalenceClass) == null) {
				if (this.getProxyDependency() != null)
					if (this.getProxyDependency().getProxyElement() != null)
						//loop trough all elements to find the correct eclass
						for (Iterator j = this.getProxyDependency()
								.getProxyElement().iterator(); j.hasNext();) {
							l_CMProxyEquivalenceClass = ((CMProxyElementImpl) j
									.next())
									.getProxyEquivalenceClass(l_EquivalenceClass);
							if (l_CMProxyEquivalenceClass != null) {
								this.getProxyEquivalenceClass().add(
										l_CMProxyEquivalenceClass);
								break;
							}

						}
			}
		}
	}

	/**
	 * Get a proxyeffect by his related effect
	 * @param p_Effect
	 * @return
	 */
	public CMProxyEffect getProxyEffect(Effect p_Effect) {
		for (Iterator iter = this.getProxyEffect().iterator(); iter.hasNext();) {
			CMProxyEffect l_ProxyEffect = (CMProxyEffect) iter.next();
			if (p_Effect.equals(l_ProxyEffect.getM_Effect()))
				return l_ProxyEffect;
		}
		return null;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMProxyDependency getProxyDependency() {
		if (eContainerFeatureID != CMCorePackage.CM_PROXY_COMBINATION__PROXY_DEPENDENCY)
			return null;
		return (CMProxyDependency) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProxyDependencyGen(CMProxyDependency newProxyDependency) {
		if (newProxyDependency != eContainer
				|| (eContainerFeatureID != CMCorePackage.CM_PROXY_COMBINATION__PROXY_DEPENDENCY && newProxyDependency != null)) {
			if (EcoreUtil.isAncestor(this, newProxyDependency))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProxyDependency != null)
				msgs = ((InternalEObject) newProxyDependency).eInverseAdd(this,
						CMCorePackage.CM_PROXY_DEPENDENCY__PROXY_COMBINATION,
						CMProxyDependency.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newProxyDependency,
					CMCorePackage.CM_PROXY_COMBINATION__PROXY_DEPENDENCY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CMCorePackage.CM_PROXY_COMBINATION__PROXY_DEPENDENCY,
					newProxyDependency, newProxyDependency));
	}

	public void setProxyDependency(CMProxyDependency newProxyDependency) {
		//call the original set
		setProxyDependencyGen(newProxyDependency);
		//set the unique id 
		if (newProxyDependency != null)
			this.setUniqueId(newProxyDependency.getUniqueId()
					+ CMCorePlugin.INSTANCE.getString("ID_separator")
					+ CMCorePlugin.INSTANCE.getString("COMBINATION_separator")
					+ this.getId());
		else
			this.setUniqueId("DELETED");

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProxyEquivalenceClass() {
		if (proxyEquivalenceClass == null) {
			proxyEquivalenceClass = new EObjectResolvingEList(
					CMProxyEquivalenceClass.class, this,
					CMCorePackage.CM_PROXY_COMBINATION__PROXY_EQUIVALENCE_CLASS);
		}
		return proxyEquivalenceClass;
	}

	public CMProxyEquivalenceClass getProxyEquivalenceClass(
			EquivalenceClass p_EquivalenceClass) {
		for (Iterator iter = this.getProxyEquivalenceClass().iterator(); iter
				.hasNext();) {
			CMProxyEquivalenceClass l_CMProxyEquivalenceClass = (CMProxyEquivalenceClass) iter
					.next();
			if (p_EquivalenceClass.equals((l_CMProxyEquivalenceClass)
					.getM_EquivalenceClass()))
				return l_CMProxyEquivalenceClass;
		}
		return null;
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
					CMCorePackage.CM_PROXY_COMBINATION__PROXY_EFFECT,
					CMCorePackage.CM_PROXY_EFFECT__PROXY_COMBINATION);
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
					CMCorePackage.CM_PROXY_COMBINATION__UNIQUE_ID, oldUniqueId,
					uniqueId));
	}

	public void setUniqueId(String newUniqueId) {
		//		delete the old reference from the opened elements list
		if (uniqueId != null)
			activeCombinations.remove(uniqueId);
		//call the original set
		setUniqueIdGen(newUniqueId);
		//put the new id on the map
		activeCombinations.put(uniqueId, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author Sergio M
	 */
	public String getId() {

		if (m_Combination != null)
			return new Integer(m_Combination.getId()).toString();
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
		if (isProxyModelSet())
			return m_Combination.getName();
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
		if (m_Combination != null)
			return m_Combination.getDescription();
		else
			return CMCorePlugin.getPlugin().getString("NOMODEL_description");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public boolean isProxyModelSet() {
		return (m_Combination != null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public void setDescription(String p_Description) {

		if (isProxyModelSet()) {
			String oldName = m_Combination.getDescription();
			this.m_Combination.setDescription(p_Description);
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET,
						CMCorePackage.CM_PROXY_COMBINATION__MCOMBINATION,
						oldName, p_Description));
		} else
			throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author svonborries
	 */
	public void setName(String p_Name) {
		if (isProxyModelSet()) {
			String oldName = m_Combination.getName();
			this.m_Combination.setName(p_Name);
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET,
						CMCorePackage.CM_PROXY_COMBINATION__MCOMBINATION,
						oldName, p_Name));
		} else
			throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public Object getCMModel() {
		return this.getM_Combination();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 * 
	 */
	public void setCMModel(Object CMModel) {
		this.setM_Combination((Combination) CMModel);
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
	 */
	public int getRiskLevel() {
		if (m_Combination != null)
			return m_Combination.getM_RiskLevel();
		else
			return -1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author svonborries
	 */
	public void setRiskLevel(int p_RiskLevel) {
		if (isProxyModelSet()) {
			int oldRiskLevel = m_Combination.getM_RiskLevel();
			this.m_Combination.setM_RiskLevel(p_RiskLevel);
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET,
						CMCorePackage.CM_PROXY_COMBINATION__MCOMBINATION,
						oldRiskLevel, p_RiskLevel));
		} else
			throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public int getState() {

		if (isProxyModelSet())
			return this.getM_Combination().getState();
		else
			return -1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public void setState(int p_State) {
		if (isProxyModelSet()) {
			int oldState = m_Combination.getState();
			this.m_Combination.setState(p_State);
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET,
						CMCorePackage.CM_PROXY_COMBINATION__MCOMBINATION,
						oldState, p_State));
		} else
			throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginType() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginType(String p_OriginType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
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
			case CMCorePackage.CM_PROXY_COMBINATION__PROXY_DEPENDENCY:
				if (eContainer != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
						CMCorePackage.CM_PROXY_COMBINATION__PROXY_DEPENDENCY,
						msgs);
			case CMCorePackage.CM_PROXY_COMBINATION__PROXY_EFFECT:
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
			case CMCorePackage.CM_PROXY_COMBINATION__PROXY_DEPENDENCY:
				return eBasicSetContainer(null,
						CMCorePackage.CM_PROXY_COMBINATION__PROXY_DEPENDENCY,
						msgs);
			case CMCorePackage.CM_PROXY_COMBINATION__PROXY_EFFECT:
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
			case CMCorePackage.CM_PROXY_COMBINATION__PROXY_DEPENDENCY:
				return eContainer.eInverseRemove(this,
						CMCorePackage.CM_PROXY_DEPENDENCY__PROXY_COMBINATION,
						CMProxyDependency.class, msgs);
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
		case CMCorePackage.CM_PROXY_COMBINATION__MCOMBINATION:
			return getM_Combination();
		case CMCorePackage.CM_PROXY_COMBINATION__PROXY_DEPENDENCY:
			return getProxyDependency();
		case CMCorePackage.CM_PROXY_COMBINATION__PROXY_EQUIVALENCE_CLASS:
			return getProxyEquivalenceClass();
		case CMCorePackage.CM_PROXY_COMBINATION__PROXY_EFFECT:
			return getProxyEffect();
		case CMCorePackage.CM_PROXY_COMBINATION__UNIQUE_ID:
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
		case CMCorePackage.CM_PROXY_COMBINATION__MCOMBINATION:
			setM_Combination((Combination) newValue);
			return;
		case CMCorePackage.CM_PROXY_COMBINATION__PROXY_DEPENDENCY:
			setProxyDependency((CMProxyDependency) newValue);
			return;
		case CMCorePackage.CM_PROXY_COMBINATION__PROXY_EQUIVALENCE_CLASS:
			getProxyEquivalenceClass().clear();
			getProxyEquivalenceClass().addAll((Collection) newValue);
			return;
		case CMCorePackage.CM_PROXY_COMBINATION__PROXY_EFFECT:
			getProxyEffect().clear();
			getProxyEffect().addAll((Collection) newValue);
			return;
		case CMCorePackage.CM_PROXY_COMBINATION__UNIQUE_ID:
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
		case CMCorePackage.CM_PROXY_COMBINATION__MCOMBINATION:
			setM_Combination(MCOMBINATION_EDEFAULT);
			return;
		case CMCorePackage.CM_PROXY_COMBINATION__PROXY_DEPENDENCY:
			setProxyDependency((CMProxyDependency) null);
			return;
		case CMCorePackage.CM_PROXY_COMBINATION__PROXY_EQUIVALENCE_CLASS:
			getProxyEquivalenceClass().clear();
			return;
		case CMCorePackage.CM_PROXY_COMBINATION__PROXY_EFFECT:
			getProxyEffect().clear();
			return;
		case CMCorePackage.CM_PROXY_COMBINATION__UNIQUE_ID:
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
		case CMCorePackage.CM_PROXY_COMBINATION__MCOMBINATION:
			return MCOMBINATION_EDEFAULT == null ? m_Combination != null
					: !MCOMBINATION_EDEFAULT.equals(m_Combination);
		case CMCorePackage.CM_PROXY_COMBINATION__PROXY_DEPENDENCY:
			return getProxyDependency() != null;
		case CMCorePackage.CM_PROXY_COMBINATION__PROXY_EQUIVALENCE_CLASS:
			return proxyEquivalenceClass != null
					&& !proxyEquivalenceClass.isEmpty();
		case CMCorePackage.CM_PROXY_COMBINATION__PROXY_EFFECT:
			return proxyEffect != null && !proxyEffect.isEmpty();
		case CMCorePackage.CM_PROXY_COMBINATION__UNIQUE_ID:
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
	 * @see biz.bi.cmcore.model.CMProxyCombination#attachProxyEquivalenceClass(biz.bi.cmcore.model.CMProxyEquivalenceClass)
	 */
	public void addProxyEquivalenceClass(
			CMProxyEquivalenceClass p_ProxyEquivalenceClass, boolean doCMModel) {
		if (doCMModel)
			if ((isProxyModelSet())
					&& p_ProxyEquivalenceClass.isProxyModelSet()) {
				this.getM_Combination().getLnkEquivalenceClasses().add(
						p_ProxyEquivalenceClass.getM_EquivalenceClass());
			}
		this.getProxyEquivalenceClass().add(p_ProxyEquivalenceClass);
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.CMProxyCombination#detachProxyEquivalenceClass(biz.bi.cmcore.model.CMProxyEquivalenceClass)
	 */
	public void removeProxyEquivalenceClass(
			CMProxyEquivalenceClass p_ProxyEquivalenceClass, boolean doCMModel) {
		if (doCMModel)
			if (isProxyModelSet() && p_ProxyEquivalenceClass.isProxyModelSet()) {
				this.getM_Combination().getLnkEquivalenceClasses().remove(
						p_ProxyEquivalenceClass.getM_EquivalenceClass());
			}
		this.getProxyEquivalenceClass().remove(p_ProxyEquivalenceClass);

	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.CMProxyCombination#addProxyEffect(biz.bi.cmcore.model.CMProxyEffect)
	 */
	public void addProxyEffect(CMProxyEffect p_child, boolean doCMModel) {
		if (doCMModel)
			if ((this.isProxyModelSet()) && (p_child.isProxyModelSet()))
				if (!this.getM_Combination().getLnkEffects().contains(
						p_child.getM_Effect())) {
					this.getM_Combination().getLnkEffects().add(
							p_child.getM_Effect());
					p_child.getM_Effect().getLnkEquivalenceClasses().add(
							this.getM_Combination());
				}
		this.getProxyEffect().add(p_child);
		p_child.getProxyCombination().add(this);

	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.CMProxyCombination#removeProxyEffect(biz.bi.cmcore.model.CMProxyEffect)
	 */
	public void removeProxyEffect(CMProxyEffect p_child, boolean doCMModel) {
		if (doCMModel)
			if ((this.isProxyModelSet()) && (p_child.isProxyModelSet()))
				if (!this.getM_Combination().getLnkEffects().contains(
						p_child.getM_Effect())) {
					this.getM_Combination().getLnkEffects().remove(
							p_child.getM_Effect());
					p_child.getM_Effect().getLnkEquivalenceClasses().remove(
							this.getM_Combination());
				}
		this.getProxyEffect().remove(p_child);
		p_child.getProxyCombination().remove(this);

	}

} //CMProxyCombinationImpl
