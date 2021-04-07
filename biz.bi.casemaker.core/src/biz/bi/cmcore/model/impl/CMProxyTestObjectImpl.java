/**
 * <copyright>
 * </copyright>
 *
 * $Id: CMProxyTestObjectImpl.java,v 1.26 2005/09/20 15:08:08 smoreno Exp $
 */
package biz.bi.cmcore.model.impl;

import java.util.Collection;
import java.util.Date;

import java.util.HashMap;
import java.util.Iterator;

import model.Dependency;
import model.Effect;
import model.Element;
import model.EquivalenceClass;
import model.Project;
import model.Structure;
import model.TestCase;
import model.TestObject;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import biz.bi.cmcore.CMCorePlugin;
import biz.bi.cmcore.model.CMCorePackage;
import biz.bi.cmcore.model.CMProxyDependency;
import biz.bi.cmcore.model.CMProxyEffect;
import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxySTDCombination;
import biz.bi.cmcore.model.CMProxyTestCase;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.cmcore.model.CMProxyTestObject;
import biz.bi.cmcore.policies.CMProxyCasemakerPolicyFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proxy Test Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyTestObjectImpl#getM_TestObject <em>MTest Object</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyTestObjectImpl#getProxyElement <em>Proxy Element</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyTestObjectImpl#getProxyDependency <em>Proxy Dependency</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyTestObjectImpl#getProxyEffect <em>Proxy Effect</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyTestObjectImpl#getM_path <em>Mpath</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyTestObjectImpl#getProxySTDCombination <em>Proxy STD Combination</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyTestObjectImpl#getProxyTestCase <em>Proxy Test Case</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CMProxyTestObjectImpl extends EObjectImpl implements
		CMProxyTestObject {

	protected static HashMap activeTestObjects = new HashMap();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getM_TestObject() <em>MTest Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_TestObject()
	 * @generated
	 * @ordered
	 */
	protected static final TestObject MTEST_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getM_TestObject() <em>MTest Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_TestObject()
	 * @generated
	 * @ordered
	 */
	protected TestObject m_TestObject = MTEST_OBJECT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProxyElement() <em>Proxy Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyElement()
	 * @generated
	 * @ordered
	 */
	protected EList proxyElement = null;

	/**
	 * The cached value of the '{@link #getProxyDependency() <em>Proxy Dependency</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyDependency()
	 * @generated
	 * @ordered
	 */
	protected EList proxyDependency = null;

	/**
	 * The cached value of the '{@link #getProxyEffect() <em>Proxy Effect</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyEffect()
	 * @generated
	 * @ordered
	 */
	protected EList proxyEffect = null;

	/**
	 * The default value of the '{@link #getM_path() <em>Mpath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_path()
	 * @generated
	 * @ordered
	 */
	protected static final String MPATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getM_path() <em>Mpath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_path()
	 * @generated
	 * @ordered
	 */
	protected String m_path = MPATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProxySTDCombination() <em>Proxy STD Combination</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxySTDCombination()
	 * @generated
	 * @ordered
	 */
	protected EList proxySTDCombination = null;

	/**
	 * The cached value of the '{@link #getProxyTestCase() <em>Proxy Test Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyTestCase()
	 * @generated
	 * @ordered
	 */
	protected EList proxyTestCase = null;

	protected CMProxyTestObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CMCorePackage.eINSTANCE.getCMProxyTestObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestObject getM_TestObject() {
		return m_TestObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_TestObject(TestObject newM_TestObject) {
		TestObject oldM_TestObject = m_TestObject;
		m_TestObject = newM_TestObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CMCorePackage.CM_PROXY_TEST_OBJECT__MTEST_OBJECT,
					oldM_TestObject, m_TestObject));
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.CMProxyTestObject#setM_TestObject(model.TestObject)
	 */
	/*	public void setM_TestObject(TestObject newM_TestObject) {
	 //call the original set
	 setM_TestObjectGen(newM_TestObject);
	 //verify the structure of effects
	 checkEffects();
	 //verify the structure of elements
	 checkElements();
	 //verify the structure of dependencies
	 checkDependencies();
	 }*/

	/**
	 * Checks if the dependencies specified in the model are consequent
	 * with the ones of this model
	 */
	protected void checkDependencies() {
		Collection candidateDependencies = this.getM_TestObject()
				.getM_Structure().getLnkDependencies();
		//delete the not used Dependencies
		for (Iterator i = this.getProxyDependency().iterator(); i.hasNext();) {

			CMProxyDependency l_ProxyDependency = (CMProxyDependency) i.next();
			if (!candidateDependencies.contains((l_ProxyDependency)
					.getM_Dependency()))
				this.getProxyEffect().remove(l_ProxyDependency);
		}
		//create the Dependencies that are in the model
		for (Iterator j = candidateDependencies.iterator(); j.hasNext();) {
			Dependency l_Dependency = (Dependency) j.next();
			if (getProxyDependency(l_Dependency) == null) {

				CMProxyDependency l_ProxyDependency = CMCorePackage.eINSTANCE
						.getCMCoreFactory().createCMProxyDependency(
								l_Dependency);

				this.getProxyDependency().add(l_ProxyDependency);
				l_ProxyDependency.setProxyTestObject(this);
				//check for his elements
				((CMProxyDependencyImpl) l_ProxyDependency).checkElements();
				//check for his combinations
				((CMProxyDependencyImpl) l_ProxyDependency).checkCombinations();

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
			proxyElement = new EObjectContainmentWithInverseEList(
					CMProxyElement.class, this,
					CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_ELEMENT,
					CMCorePackage.CM_PROXY_ELEMENT__PROXY_TEST_OBJECT);
		}
		return proxyElement;
	}

	/**
	 * Gets a specific CMproxy element that represents a element
	 * @param p_Element
	 * @return
	 */
	public CMProxyElement getProxyElement(Element p_Element) {
		for (Iterator iter = this.getProxyElement().iterator(); iter.hasNext();) {
			CMProxyElement l_ProxyElement = (CMProxyElement) iter.next();

			if (p_Element.equals((l_ProxyElement).getM_Element()))
				return l_ProxyElement;
		}
		return null;
	}

	public CMProxyEquivalenceClass getProxyEquivalenceClass(
			EquivalenceClass p_equivalenceClass) {
		return ((CMProxyElementImpl) this.getProxyElement(p_equivalenceClass
				.getLnkElement())).getProxyEquivalenceClass(p_equivalenceClass);
	}

	/**
	 * Gets a specific CMproxy dependency that represents a dependency
	 * @param p_Dependency
	 * @return
	 */
	public CMProxyDependency getProxyDependency(Dependency p_Dependency) {
		for (Iterator iter = this.getProxyDependency().iterator(); iter
				.hasNext();) {
			CMProxyDependency l_ProxyDependency = (CMProxyDependency) iter
					.next();
			if (p_Dependency.equals((l_ProxyDependency).getM_Dependency()))
				return l_ProxyDependency;
		}
		return null;
	}

	/**
	 * Check for inconsistences 
	 * in the elements of the model
	 */
	protected void checkElements() {
		Collection candidateElements = this.getM_TestObject().getM_Structure()
				.getLnkElements();
		//delete the not used Elements
		for (Iterator i = this.getProxyElement().iterator(); i.hasNext();) {
			CMProxyElement l_ProxyElement = (CMProxyElement) i.next();
			if (!candidateElements.contains((l_ProxyElement).getM_Element()))
				this.getProxyElement().remove(l_ProxyElement);
		}
		//create the Elements that are in the model
		for (Iterator j = candidateElements.iterator(); j.hasNext();) {
			Element l_Element = (Element) j.next();
			if (getProxyElement(l_Element) == null) {
				CMProxyElement l_ProxyElement = CMCorePackage.eINSTANCE
						.getCMCoreFactory().createCMProxyElement(l_Element);
				this.getProxyElement().add(l_ProxyElement);
				l_ProxyElement.setProxyTestObject(this);
				((CMProxyElementImpl) l_ProxyElement).checkEquivalenceClasses();
			}
		}
	}

	/**
	 * Check for inconsistences in the Effects model with
	 * the actual model
	 */
	protected void checkEffects() {
		Collection candidateEffects = this.getM_TestObject().getM_Structure()
				.getLnkEffects();
		//delete the not used effects
		for (Iterator i = this.getProxyEffect().iterator(); i.hasNext();) {
			CMProxyEffect l_ProxyEffect = (CMProxyEffect) i.next();
			if (!candidateEffects.contains((l_ProxyEffect).getM_Effect()))
				this.getProxyEffect().remove(l_ProxyEffect);
		}
		//create the effects that are in the model
		for (Iterator j = candidateEffects.iterator(); j.hasNext();) {
			Effect l_Effect = (Effect) j.next();
			if (getProxyEffect(l_Effect) == null) {
				this.getProxyEffect().add(
						CMCorePackage.eINSTANCE.getCMCoreFactory()
								.createCMProxyEffect(l_Effect));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProxyDependency() {
		if (proxyDependency == null) {
			proxyDependency = new EObjectContainmentWithInverseEList(
					CMProxyDependency.class, this,
					CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_DEPENDENCY,
					CMCorePackage.CM_PROXY_DEPENDENCY__PROXY_TEST_OBJECT);
		}
		return proxyDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProxyEffect() {
		if (proxyEffect == null) {
			proxyEffect = new EObjectContainmentWithInverseEList(
					CMProxyEffect.class, this,
					CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_EFFECT,
					CMCorePackage.CM_PROXY_EFFECT__PROXY_TEST_OBJECT);
		}
		return proxyEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getM_path() {
		return m_path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_pathGen(String newM_path) {
		String oldM_path = m_path;
		m_path = newM_path;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CMCorePackage.CM_PROXY_TEST_OBJECT__MPATH, oldM_path,
					m_path));
	}

	public void setM_path(String newM_path) {

		//remove the old reference from 
		if (m_path != MPATH_EDEFAULT)
			activeTestObjects.remove(m_path);
		//call the original set
		setM_pathGen(newM_path);
		//put the new path on the map
		activeTestObjects.put(m_path, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProxySTDCombination() {
		if (proxySTDCombination == null) {
			proxySTDCombination = new EObjectContainmentWithInverseEList(
					CMProxySTDCombination.class, this,
					CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_STD_COMBINATION,
					CMCorePackage.CM_PROXY_STD_COMBINATION__PROXY_TEST_OBJECT);
		}
		return proxySTDCombination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProxyTestCase() {
		if (proxyTestCase == null) {
			proxyTestCase = new EObjectContainmentWithInverseEList(
					CMProxyTestCase.class, this,
					CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_TEST_CASE,
					CMCorePackage.CM_PROXY_TEST_CASE__PROXY_TEST_OBJECT);
		}
		return proxyTestCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public String getId() {

		if (m_TestObject != null)
			return getM_path();
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
		if (m_TestObject != null)
			return m_TestObject.getM_Name();
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
		if (m_TestObject != null)
			return m_TestObject.getM_Name();
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
		return this.getM_TestObject() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String p_Description) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
		return this.getM_TestObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public void setCMModel(Object CMModel) {

		this.setM_TestObject((TestObject) CMModel);

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
	public Structure getStructure() {
		if (this.getM_TestObject() != null)
			return this.getM_TestObject().getM_Structure();
		else
			return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUser() {
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
			case CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_ELEMENT:
				return ((InternalEList) getProxyElement()).basicAdd(otherEnd,
						msgs);
			case CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_DEPENDENCY:
				return ((InternalEList) getProxyDependency()).basicAdd(
						otherEnd, msgs);
			case CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_EFFECT:
				return ((InternalEList) getProxyEffect()).basicAdd(otherEnd,
						msgs);
			case CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_STD_COMBINATION:
				return ((InternalEList) getProxySTDCombination()).basicAdd(
						otherEnd, msgs);
			case CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_TEST_CASE:
				return ((InternalEList) getProxyTestCase()).basicAdd(otherEnd,
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
			case CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_ELEMENT:
				return ((InternalEList) getProxyElement()).basicRemove(
						otherEnd, msgs);
			case CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_DEPENDENCY:
				return ((InternalEList) getProxyDependency()).basicRemove(
						otherEnd, msgs);
			case CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_EFFECT:
				return ((InternalEList) getProxyEffect()).basicRemove(otherEnd,
						msgs);
			case CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_STD_COMBINATION:
				return ((InternalEList) getProxySTDCombination()).basicRemove(
						otherEnd, msgs);
			case CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_TEST_CASE:
				return ((InternalEList) getProxyTestCase()).basicRemove(
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
		case CMCorePackage.CM_PROXY_TEST_OBJECT__MTEST_OBJECT:
			return getM_TestObject();
		case CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_ELEMENT:
			return getProxyElement();
		case CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_DEPENDENCY:
			return getProxyDependency();
		case CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_EFFECT:
			return getProxyEffect();
		case CMCorePackage.CM_PROXY_TEST_OBJECT__MPATH:
			return getM_path();
		case CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_STD_COMBINATION:
			return getProxySTDCombination();
		case CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_TEST_CASE:
			return getProxyTestCase();
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
		case CMCorePackage.CM_PROXY_TEST_OBJECT__MTEST_OBJECT:
			setM_TestObject((TestObject) newValue);
			return;
		case CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_ELEMENT:
			getProxyElement().clear();
			getProxyElement().addAll((Collection) newValue);
			return;
		case CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_DEPENDENCY:
			getProxyDependency().clear();
			getProxyDependency().addAll((Collection) newValue);
			return;
		case CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_EFFECT:
			getProxyEffect().clear();
			getProxyEffect().addAll((Collection) newValue);
			return;
		case CMCorePackage.CM_PROXY_TEST_OBJECT__MPATH:
			setM_path((String) newValue);
			return;
		case CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_STD_COMBINATION:
			getProxySTDCombination().clear();
			getProxySTDCombination().addAll((Collection) newValue);
			return;
		case CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_TEST_CASE:
			getProxyTestCase().clear();
			getProxyTestCase().addAll((Collection) newValue);
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
		case CMCorePackage.CM_PROXY_TEST_OBJECT__MTEST_OBJECT:
			setM_TestObject(MTEST_OBJECT_EDEFAULT);
			return;
		case CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_ELEMENT:
			getProxyElement().clear();
			return;
		case CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_DEPENDENCY:
			getProxyDependency().clear();
			return;
		case CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_EFFECT:
			getProxyEffect().clear();
			return;
		case CMCorePackage.CM_PROXY_TEST_OBJECT__MPATH:
			setM_path(MPATH_EDEFAULT);
			return;
		case CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_STD_COMBINATION:
			getProxySTDCombination().clear();
			return;
		case CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_TEST_CASE:
			getProxyTestCase().clear();
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
		case CMCorePackage.CM_PROXY_TEST_OBJECT__MTEST_OBJECT:
			return MTEST_OBJECT_EDEFAULT == null ? m_TestObject != null
					: !MTEST_OBJECT_EDEFAULT.equals(m_TestObject);
		case CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_ELEMENT:
			return proxyElement != null && !proxyElement.isEmpty();
		case CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_DEPENDENCY:
			return proxyDependency != null && !proxyDependency.isEmpty();
		case CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_EFFECT:
			return proxyEffect != null && !proxyEffect.isEmpty();
		case CMCorePackage.CM_PROXY_TEST_OBJECT__MPATH:
			return MPATH_EDEFAULT == null ? m_path != null : !MPATH_EDEFAULT
					.equals(m_path);
		case CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_STD_COMBINATION:
			return proxySTDCombination != null
					&& !proxySTDCombination.isEmpty();
		case CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_TEST_CASE:
			return proxyTestCase != null && !proxyTestCase.isEmpty();
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
		result.append(" (m_TestObject: "); //$NON-NLS-1$
		result.append(m_TestObject);
		result.append(", m_path: "); //$NON-NLS-1$
		result.append(m_path);
		result.append(')');
		return result.toString();
	}

	public CMProxyEffect getProxyEffect(Effect p_Effect) {
		for (Iterator iter = this.getProxyEffect().iterator(); iter.hasNext();) {
			CMProxyEffect l_ProxyEffect = (CMProxyEffect) iter.next();
			if (p_Effect.equals((l_ProxyEffect).getM_Effect()))
				return l_ProxyEffect;
		}
		return null;
	}

	public void checkTestObjectConsistency() {
		if (this.m_TestObject != null) {
			//verify the structure of effects
			checkEffects();
			//verify the structure of elements
			checkElements();
			//verify the structure of dependencies
			checkDependencies();

		}
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.CMProxyTestObject#removeProxyDependency(biz.bi.cmcore.model.CMProxyDependency)
	 */

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.CMProxyTestObject#removeProxyElement(biz.bi.cmcore.model.CMProxyElement)
	 */

	/**
	 * Gets all the dependencies that are related to one proxyelement
	 * @param p_ProxyElement
	 * @return
	 */
	protected EList getProxyDependency(CMProxyElement p_ProxyElement) {
		EList l_dependencies = new BasicEList();
		for (Iterator iter = this.getProxyDependency().iterator(); iter
				.hasNext();) {
			CMProxyDependency l_ProxyDependency = (CMProxyDependency) iter
					.next();
			if (l_ProxyDependency.getProxyElement().contains(p_ProxyElement))
				l_dependencies.add(l_ProxyDependency);

		}
		return l_dependencies;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.CMProxyTestObject#saveTestObject()
	 */
	public void saveTestObject() {
		CMCorePlugin.INSTANCE.getM_SessionManager().getM_WorkspaceManager()
				.writeTestObjectToFile2(m_TestObject, m_path);
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.CMProxyTestObject#createTestObject()
	 */
	public TestObject createTestObject() {
		TestObject newTestObject = CMCorePlugin.INSTANCE.getM_SessionManager()
				.getM_WorkspaceManager().createTestObject();
		return newTestObject;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.CMProxyTestObject#addProxyElement(biz.bi.cmcore.model.CMProxyElement)
	 */
	public void addProxyElement(CMProxyElement p_child, boolean doCMModel) {
		if (doCMModel)
			if (p_child.isProxyModelSet()) {
				if (!this.getStructure().getLnkElements().contains(
						p_child.getM_Element())) {
					this.getStructure().getLnkElements().add(
							p_child.getM_Element());
				}
			} else {
				Element l_Element = CMCorePlugin.INSTANCE.getM_SessionManager()
						.getElementManager().createElement(this.getStructure());
				this.getStructure().getLnkElements().add(l_Element);
				p_child.setM_Element(l_Element);
			}
		this.getProxyElement().add(p_child);
		p_child.setProxyTestObject(this);

	}

	public void removeProxyElement(CMProxyElement p_ProxyElement,
			boolean doCMModel) {
		if (doCMModel)
			if (p_ProxyElement.isProxyModelSet() && this.isProxyModelSet()) {
				CMProxyCasemakerPolicyFactory.INSTANCE.deleteElement(this
						.getStructure(), p_ProxyElement.getM_Element());
				p_ProxyElement.setM_Element(null);
			}
		this.getProxyElement().remove(p_ProxyElement);
		p_ProxyElement.setProxyTestObject(null);

	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.CMProxyTestObject#removeProxyEffect(biz.bi.cmcore.model.CMProxyEffect)
	 */
	public void removeProxyEffect(CMProxyEffect p_child, boolean doCMModel) {
		if (doCMModel)
			if (p_child.isProxyModelSet() && this.isProxyModelSet()) {
				//TODO The policy should do this
				//				CMCorePlugin.INSTANCE.getM_SessionManager().getEffectManager()
				//						.delete(p_child.getM_Effect(), this.getStructure());
				this.getStructure().getLnkEffects().remove(
						p_child.getM_Effect());
				p_child.setM_Effect(null);
			}
		this.getProxyEffect().remove(p_child);
		p_child.setProxyTestObject(null);

	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.CMProxyTestObject#addProxyEffect(biz.bi.cmcore.model.CMProxyEffect)
	 */
	public void addProxyEffect(CMProxyEffect p_child, boolean doCMModel) {
		if (doCMModel)
			if (p_child.isProxyModelSet()) {
				if (!this.getStructure().getLnkEffects().contains(
						p_child.getM_Effect())) {
					this.getStructure().getLnkEffects().add(
							p_child.getM_Effect());
				}
			} else {
				Effect l_Effect = CMCorePlugin.INSTANCE.getM_SessionManager()
						.getEffectManager().createEffect(this.getStructure());
				this.getStructure().getLnkEffects().add(l_Effect);
				p_child.setM_Effect(l_Effect);
			}
		this.getProxyEffect().add(p_child);
		p_child.setProxyTestObject(this);

	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.CMProxyTestObject#addProxyDependency(biz.bi.cmcore.model.CMProxyDependency)
	 */
	public void addProxyDependency(CMProxyDependency p_child, boolean doCMModel) {
		if (doCMModel)
			if (p_child.isProxyModelSet()) {
				if (!this.getStructure().getLnkDependencies().contains(
						p_child.getM_Dependency())) {
					this.getStructure().getLnkDependencies().add(
							p_child.getM_Dependency());
				}
			} else {
				Dependency l_Dependency = CMCorePlugin.INSTANCE
						.getM_SessionManager().getDependencyManager()
						.createDependency(this.getStructure());
				this.getStructure().getLnkDependencies().add(l_Dependency);
				p_child.setM_Dependency(l_Dependency);
			}
		this.getProxyDependency().add(p_child);
		p_child.setProxyTestObject(this);

	}

	public void removeProxyDependency(CMProxyDependency p_ProxyDependency,
			boolean doCMModel) {
		//TODO remove dependency (check the inverse remove) this needs more testing!!!
		if (doCMModel)
			if (p_ProxyDependency.isProxyModelSet() && this.isProxyModelSet()) {
				//TODO the policy should do this
				//				CMCorePlugin.INSTANCE.getM_SessionManager()
				//						.getDependencyManager().getLnkTestCaseManager()
				//						.deleteCombinationsOfDependencyInTestCases(
				//								p_ProxyDependency.getM_Dependency(),
				//								this.getStructure());
				this.getStructure().getLnkDependencies().remove(
						p_ProxyDependency.getM_Dependency());
				p_ProxyDependency.setM_Dependency(null);
			}
		this.getProxyDependency().remove(p_ProxyDependency);
		p_ProxyDependency.setProxyTestObject(null);
	}

	/**
	 * @param p_testCase
	 * @return
	 */
	public CMProxyTestCase getProxyTestCase(TestCase p_testCase) {
		for (Iterator iter = this.getProxyTestCase().iterator(); iter.hasNext();) {
			CMProxyTestCase l_ProxyTestCase = (CMProxyTestCase) iter.next();

			if (p_testCase.equals((l_ProxyTestCase).getM_TestCase()))
				return l_ProxyTestCase;
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.CMProxyTestObject#addProxyTestCase(biz.bi.cmcore.model.CMProxyTestCase, boolean)
	 */
	public void addProxyTestCase(CMProxyTestCase p_child, boolean p_doCMModel, int p_state) {
	
		if (p_doCMModel)
			if (p_child.isProxyModelSet()) {
				if (!this.getStructure().getLnkTestCases().contains(
						p_child.getM_TestCase())) {
					this.getStructure().getLnkDependencies().add(
							p_child.getM_TestCase());
				}
			} else {
				TestCase l_TestCase = CMCorePlugin.INSTANCE
						.getM_SessionManager().getTestCaseManager()
						.createTestCase(this.getStructure(),p_state);
				this.getStructure().getLnkTestCases().add(l_TestCase);
				p_child.setM_TestCase(l_TestCase);
			}
		this.getProxyTestCase().add(p_child);
		p_child.setProxyTestObject(this);
		
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.CMProxyTestObject#removeProxyTestCase(biz.bi.cmcore.model.CMProxyTestCase, boolean)
	 */
	public void removeProxyTestCase(CMProxyTestCase p_child, boolean p_doCMModel) {
		// TODO Auto-generated method stub
		
	}

} //CMProxyTestObjectImpl
