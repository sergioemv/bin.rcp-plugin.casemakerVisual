/**
 * <copyright>
 * </copyright>
 *
 * $Id: CMProxyDependencyImpl.java,v 1.32 2005/09/20 15:08:08 smoreno Exp $
 */
package biz.bi.cmcore.model.impl;

import java.util.Collection;
import java.util.Date;

import java.util.HashMap;
import java.util.Iterator;

import model.Combination;
import model.Dependency;
import model.Element;
import model.EquivalenceClass;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import biz.bi.cmcore.CMCorePlugin;
import biz.bi.cmcore.model.CMCorePackage;
import biz.bi.cmcore.model.CMProxyCombination;
import biz.bi.cmcore.model.CMProxyDependency;
import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.cmcore.model.CMProxyTestObject;
import biz.bi.cmcore.policies.CMProxyCasemakerPolicyFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proxy Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyDependencyImpl#getM_Dependency <em>MDependency</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyDependencyImpl#getProxyElement <em>Proxy Element</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyDependencyImpl#getProxyCombination <em>Proxy Combination</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyDependencyImpl#getProxyTestObject <em>Proxy Test Object</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyDependencyImpl#getUniqueId <em>Unique Id</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyDependencyImpl#getProxyEquivalenceClass <em>Proxy Equivalence Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CMProxyDependencyImpl extends EObjectImpl implements
		CMProxyDependency {
	protected static HashMap activeDependencies = new HashMap();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getM_Dependency() <em>MDependency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_Dependency()
	 * @generated
	 * @ordered
	 */
	protected static final Dependency MDEPENDENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getM_Dependency() <em>MDependency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_Dependency()
	 * @generated
	 * @ordered
	 */
	protected Dependency m_Dependency = MDEPENDENCY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProxyElement() <em>Proxy Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyElement()
	 * @generated
	 * @ordered
	 */
	protected EList proxyElement = null;

	/**
	 * The cached value of the '{@link #getProxyCombination() <em>Proxy Combination</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyCombination()
	 * @generated
	 * @ordered
	 */
	protected EList proxyCombination = null;

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
	 * The cached value of the '{@link #getProxyEquivalenceClass() <em>Proxy Equivalence Class</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyEquivalenceClass()
	 * @generated
	 * @ordered
	 */
	protected EList proxyEquivalenceClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CMProxyDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CMCorePackage.eINSTANCE.getCMProxyDependency();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency getM_Dependency() {
		return m_Dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_Dependency(Dependency newM_Dependency) {
		Dependency oldM_Dependency = m_Dependency;
		m_Dependency = newM_Dependency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CMCorePackage.CM_PROXY_DEPENDENCY__MDEPENDENCY,
					oldM_Dependency, m_Dependency));
	}

	/*public void setM_Dependency(Dependency newM_Dependency) {
	 //call the original set
	 setM_DependencyGen(newM_Dependency);
	 //check the related elements to add the relation
	 checkElements();
	 //check the children combinations
	 checkCombinations();

	 }*/

	/**
	 * Check for the children combination on the proxydependency
	 * if they doesn't exists then creates new ones according to the model
	 */
	protected void checkCombinations() {
		Collection candidateCombinations = m_Dependency.getLnkCombinations();
		//delete the not used Combinations
		for (Iterator i = this.getProxyCombination().iterator(); i.hasNext();) {
			CMProxyCombination l_ProxyCombination = (CMProxyCombination) i
					.next();
			if (!candidateCombinations.contains(l_ProxyCombination
					.getM_Combination()))
				this.getProxyCombination().remove(l_ProxyCombination);
		}
		//create the Combinations that are in the model
		for (Iterator j = candidateCombinations.iterator(); j.hasNext();) {
			Combination l_Combination = (Combination) j.next();
			if (getProxyCombination(l_Combination) == null) {
				CMProxyCombination l_ProxyCombination = CMCorePackage.eINSTANCE
						.getCMCoreFactory().createCMProxyCombination(
								l_Combination);
				this.getProxyCombination().add(l_ProxyCombination);
				l_ProxyCombination.setProxyDependency(this);
				//check for the related effects of the combination
				((CMProxyCombinationImpl) l_ProxyCombination).checkEffects();
				//check for tha related eclasses of the combination
				((CMProxyCombinationImpl) l_ProxyCombination)
						.checkEquivalenceClasses();

			}
		}
	}

	/**
	 * Check if the elements corresponding to the diagram are already connected
	 * if not it searches on the main diagram and assigns them 
	 * it doesn't try to create a new Proxyelement
	 */
	protected void checkElements() {
		CMProxyElement l_CMProxyElement = null;
		for (Iterator i = this.getM_Dependency().getLnkElements().iterator(); i
				.hasNext();) {
			Element l_Element = (Element) i.next();

			if (this.getProxyElement(l_Element) == null) {
				if (this.getProxyTestObject() != null)
					l_CMProxyElement = ((CMProxyTestObjectImpl) this
							.getProxyTestObject()).getProxyElement(l_Element);

				if (l_CMProxyElement != null)

				{
					this.getProxyElement().add(l_CMProxyElement);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProxyElement() {
		if (proxyElement == null) {
			proxyElement = new EObjectResolvingEList(CMProxyElement.class,
					this, CMCorePackage.CM_PROXY_DEPENDENCY__PROXY_ELEMENT);
		}
		return proxyElement;
	}

	public CMProxyElement getProxyElement(Element p_Element) {
		for (Iterator iter = this.getProxyElement().iterator(); iter.hasNext();) {
			CMProxyElement l_CMProxyElement = (CMProxyElement) iter.next();
			if (p_Element.equals((l_CMProxyElement).getM_Element()))
				return l_CMProxyElement;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProxyCombination() {
		if (proxyCombination == null) {
			proxyCombination = new EObjectContainmentWithInverseEList(
					CMProxyCombination.class, this,
					CMCorePackage.CM_PROXY_DEPENDENCY__PROXY_COMBINATION,
					CMCorePackage.CM_PROXY_COMBINATION__PROXY_DEPENDENCY);
		}
		return proxyCombination;
	}

	public CMProxyCombination getProxyCombination(Combination p_Combination) {
		for (Iterator iter = this.getProxyCombination().iterator(); iter
				.hasNext();) {
			CMProxyCombination l_ProxyCombination = (CMProxyCombination) iter
					.next();
			if (p_Combination.equals((l_ProxyCombination).getM_Combination()))
				return l_ProxyCombination;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMProxyTestObject getProxyTestObject() {
		if (eContainerFeatureID != CMCorePackage.CM_PROXY_DEPENDENCY__PROXY_TEST_OBJECT)
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
				|| (eContainerFeatureID != CMCorePackage.CM_PROXY_DEPENDENCY__PROXY_TEST_OBJECT && newProxyTestObject != null)) {
			if (EcoreUtil.isAncestor(this, newProxyTestObject))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProxyTestObject != null)
				msgs = ((InternalEObject) newProxyTestObject).eInverseAdd(this,
						CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_DEPENDENCY,
						CMProxyTestObject.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newProxyTestObject,
					CMCorePackage.CM_PROXY_DEPENDENCY__PROXY_TEST_OBJECT, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CMCorePackage.CM_PROXY_DEPENDENCY__PROXY_TEST_OBJECT,
					newProxyTestObject, newProxyTestObject));
	}

	public void setProxyTestObject(CMProxyTestObject newProxyTestObject) {

		//the original set
		setProxyTestObjectGen(newProxyTestObject);
		//set the correct unique id
		if (newProxyTestObject != null)
			this.setUniqueId(newProxyTestObject.getM_path()
					+ CMCorePlugin.INSTANCE.getString("ID_separator")
					+ CMCorePlugin.INSTANCE.getString("DEPENDENCY_separator")
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
					CMCorePackage.CM_PROXY_DEPENDENCY__UNIQUE_ID, oldUniqueId,
					uniqueId));
	}

	public void setUniqueId(String newUniqueId) {

		//delete the old reference from the opened elements list
		if (uniqueId != null)
			activeDependencies.remove(uniqueId);
		//call the original set
		setUniqueIdGen(newUniqueId);
		//put the new id on the map
		activeDependencies.put(uniqueId, this);

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
					CMCorePackage.CM_PROXY_DEPENDENCY__PROXY_EQUIVALENCE_CLASS);
		}
		return proxyEquivalenceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author Sergio M
	 */
	public String getId() {

		if (isProxyModelSet())
			return new Integer(m_Dependency.getId()).toString();
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
			return m_Dependency.getName();
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
			return m_Dependency.getDescription();
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

		return m_Dependency != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author hcanedo
	 */
	public void setDescription(String p_Description) {
		if (isProxyModelSet()) {
			String oldDescription = m_Dependency.getDescription();
			m_Dependency.setDescription(p_Description);
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET,
						CMCorePackage.CM_PROXY_DEPENDENCY__MDEPENDENCY,
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
			String oldName = m_Dependency.getName();
			m_Dependency.setName(p_Name);
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET,
						CMCorePackage.CM_PROXY_DEPENDENCY__MDEPENDENCY,
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

		return this.getM_Dependency();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public void setCMModel(Object CMModel) {
		this.setM_Dependency((Dependency) CMModel);
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
	 * @generated
	 */
	public String getLabel() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String p_Label) {
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
			case CMCorePackage.CM_PROXY_DEPENDENCY__PROXY_COMBINATION:
				return ((InternalEList) getProxyCombination()).basicAdd(
						otherEnd, msgs);
			case CMCorePackage.CM_PROXY_DEPENDENCY__PROXY_TEST_OBJECT:
				if (eContainer != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
						CMCorePackage.CM_PROXY_DEPENDENCY__PROXY_TEST_OBJECT,
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
			case CMCorePackage.CM_PROXY_DEPENDENCY__PROXY_COMBINATION:
				return ((InternalEList) getProxyCombination()).basicRemove(
						otherEnd, msgs);
			case CMCorePackage.CM_PROXY_DEPENDENCY__PROXY_TEST_OBJECT:
				return eBasicSetContainer(null,
						CMCorePackage.CM_PROXY_DEPENDENCY__PROXY_TEST_OBJECT,
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
			case CMCorePackage.CM_PROXY_DEPENDENCY__PROXY_TEST_OBJECT:
				return eContainer.eInverseRemove(this,
						CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_DEPENDENCY,
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
		case CMCorePackage.CM_PROXY_DEPENDENCY__MDEPENDENCY:
			return getM_Dependency();
		case CMCorePackage.CM_PROXY_DEPENDENCY__PROXY_ELEMENT:
			return getProxyElement();
		case CMCorePackage.CM_PROXY_DEPENDENCY__PROXY_COMBINATION:
			return getProxyCombination();
		case CMCorePackage.CM_PROXY_DEPENDENCY__PROXY_TEST_OBJECT:
			return getProxyTestObject();
		case CMCorePackage.CM_PROXY_DEPENDENCY__UNIQUE_ID:
			return getUniqueId();
		case CMCorePackage.CM_PROXY_DEPENDENCY__PROXY_EQUIVALENCE_CLASS:
			return getProxyEquivalenceClass();
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
		case CMCorePackage.CM_PROXY_DEPENDENCY__MDEPENDENCY:
			setM_Dependency((Dependency) newValue);
			return;
		case CMCorePackage.CM_PROXY_DEPENDENCY__PROXY_ELEMENT:
			getProxyElement().clear();
			getProxyElement().addAll((Collection) newValue);
			return;
		case CMCorePackage.CM_PROXY_DEPENDENCY__PROXY_COMBINATION:
			getProxyCombination().clear();
			getProxyCombination().addAll((Collection) newValue);
			return;
		case CMCorePackage.CM_PROXY_DEPENDENCY__PROXY_TEST_OBJECT:
			setProxyTestObject((CMProxyTestObject) newValue);
			return;
		case CMCorePackage.CM_PROXY_DEPENDENCY__UNIQUE_ID:
			setUniqueId((String) newValue);
			return;
		case CMCorePackage.CM_PROXY_DEPENDENCY__PROXY_EQUIVALENCE_CLASS:
			getProxyEquivalenceClass().clear();
			getProxyEquivalenceClass().addAll((Collection) newValue);
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
		case CMCorePackage.CM_PROXY_DEPENDENCY__MDEPENDENCY:
			setM_Dependency(MDEPENDENCY_EDEFAULT);
			return;
		case CMCorePackage.CM_PROXY_DEPENDENCY__PROXY_ELEMENT:
			getProxyElement().clear();
			return;
		case CMCorePackage.CM_PROXY_DEPENDENCY__PROXY_COMBINATION:
			getProxyCombination().clear();
			return;
		case CMCorePackage.CM_PROXY_DEPENDENCY__PROXY_TEST_OBJECT:
			setProxyTestObject((CMProxyTestObject) null);
			return;
		case CMCorePackage.CM_PROXY_DEPENDENCY__UNIQUE_ID:
			setUniqueId(UNIQUE_ID_EDEFAULT);
			return;
		case CMCorePackage.CM_PROXY_DEPENDENCY__PROXY_EQUIVALENCE_CLASS:
			getProxyEquivalenceClass().clear();
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
		case CMCorePackage.CM_PROXY_DEPENDENCY__MDEPENDENCY:
			return MDEPENDENCY_EDEFAULT == null ? m_Dependency != null
					: !MDEPENDENCY_EDEFAULT.equals(m_Dependency);
		case CMCorePackage.CM_PROXY_DEPENDENCY__PROXY_ELEMENT:
			return proxyElement != null && !proxyElement.isEmpty();
		case CMCorePackage.CM_PROXY_DEPENDENCY__PROXY_COMBINATION:
			return proxyCombination != null && !proxyCombination.isEmpty();
		case CMCorePackage.CM_PROXY_DEPENDENCY__PROXY_TEST_OBJECT:
			return getProxyTestObject() != null;
		case CMCorePackage.CM_PROXY_DEPENDENCY__UNIQUE_ID:
			return UNIQUE_ID_EDEFAULT == null ? uniqueId != null
					: !UNIQUE_ID_EDEFAULT.equals(uniqueId);
		case CMCorePackage.CM_PROXY_DEPENDENCY__PROXY_EQUIVALENCE_CLASS:
			return proxyEquivalenceClass != null
					&& !proxyEquivalenceClass.isEmpty();
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

	public void addProxyElement(CMProxyElement p_ProxyElement, boolean doCMModel) {
		if (doCMModel)
			if (this.isProxyModelSet()) {

				CMProxyCasemakerPolicyFactory.INSTANCE
						.insertElementInDependency(p_ProxyElement
								.getM_Element(), this.getM_Dependency(), this
								.getProxyTestObject().getStructure());
			}
		this.getProxyElement().add(p_ProxyElement);

	}

	public void removeProxyElement(CMProxyElement p_ProxyElement,
			boolean doCMModel) {
		if (doCMModel)
			if (isProxyModelSet() && p_ProxyElement.isProxyModelSet()) {
				CMProxyCasemakerPolicyFactory.INSTANCE
						.removeElementInDependency(p_ProxyElement
								.getM_Element(), this.getM_Dependency(), this
								.getProxyTestObject().getStructure());
			}
		this.getProxyElement().remove(p_ProxyElement);

	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.CMProxyDependency#removeProxyCombination(biz.bi.cmcore.model.CMProxyCombination)
	 */
	public void removeProxyCombination(CMProxyCombination p_combination,
			boolean doCMModel) {
		if (doCMModel)
			if (isProxyModelSet() && p_combination.isProxyModelSet()) {
				CMCorePlugin.INSTANCE.getM_SessionManager()
						.getCombinationManager().deleteCombination(
								p_combination.getM_Combination(),
								this.getM_Dependency());
				this.getM_Dependency().getLnkCombinations().remove(
						p_combination.getM_Combination());
				p_combination.setM_Combination(null);
			}

		this.getProxyCombination().remove(p_combination);
		p_combination.setProxyDependency(null);

	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.CMProxyDependency#addProxyCombination(biz.bi.cmcore.model.CMProxyCombination)
	 */
	public void addProxyCombination(CMProxyCombination p_combination,
			boolean doCMModel) {
		if (doCMModel)
			if (p_combination.isProxyModelSet()) {
				this.getM_Dependency().getLnkCombinations().add(
						p_combination.getM_Combination());
			} else {
				Combination l_Combination = CMCorePlugin.INSTANCE
						.getM_SessionManager().getCombinationManager()
						.createCombination(this.getM_Dependency());
				this.getM_Dependency().getLnkCombinations().add(l_Combination);
				p_combination.setM_Combination(l_Combination);
			}

		this.getProxyCombination().add(p_combination);
		p_combination.setProxyDependency(this);

	}

	/**
	 * @param p_equivalenceClass
	 * @return
	 */
	public CMProxyEquivalenceClass getProxyEquivalenceClass(EquivalenceClass p_equivalenceClass) {
		for (Iterator iter = this.getProxyEquivalenceClass().iterator(); iter.hasNext();) {
			CMProxyEquivalenceClass l_CMProxyEquivalenceClass = (CMProxyEquivalenceClass) iter.next();
			if (p_equivalenceClass.equals((l_CMProxyEquivalenceClass).getM_EquivalenceClass()))
				return l_CMProxyEquivalenceClass;
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.CMProxyDependency#addProxyEquivalenceClass(biz.bi.cmcore.model.CMProxyEquivalenceClass, boolean)
	 */
	public void addProxyEquivalenceClass(CMProxyEquivalenceClass p_child, boolean p_doCMModel) {
		if (p_doCMModel)
			if (this.isProxyModelSet()) {
				this.getM_Dependency().getLnkEquivalenceClasses().add(p_child.getM_EquivalenceClass());
			}
		this.getProxyEquivalenceClass().add(p_child);
		
		
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.CMProxyDependency#removeProxyEquivalenceClass(biz.bi.cmcore.model.CMProxyEquivalenceClass, boolean)
	 */
	public void removeProxyEquivalenceClass(CMProxyEquivalenceClass p_child, boolean p_doCMModel) {
		if (p_doCMModel)
			if (isProxyModelSet() && p_child.isProxyModelSet())
			{
				this.getM_Dependency().getLnkEquivalenceClasses().remove(p_child.getM_EquivalenceClass());
			}
		this.getProxyElement().remove(p_child);
		
	}

} //CMProxyDependencyImpl
