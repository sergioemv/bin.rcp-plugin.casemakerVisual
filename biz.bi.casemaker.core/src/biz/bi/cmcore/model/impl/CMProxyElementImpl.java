/**
 * <copyright>
 * </copyright>
 *
 * $Id: CMProxyElementImpl.java,v 1.27 2005/09/20 15:08:08 smoreno Exp $
 */
package biz.bi.cmcore.model.impl;

import java.util.Collection;
import java.util.Date;

import java.util.HashMap;
import java.util.Iterator;

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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import biz.bi.cmcore.CMCorePlugin;
import biz.bi.cmcore.model.CMCorePackage;
import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.cmcore.model.CMProxyTestObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proxy Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyElementImpl#getM_Element <em>MElement</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyElementImpl#getProxyTestObject <em>Proxy Test Object</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyElementImpl#getProxyEquivalenceClass <em>Proxy Equivalence Class</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyElementImpl#getUniqueId <em>Unique Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CMProxyElementImpl extends EObjectImpl implements CMProxyElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getM_Element() <em>MElement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_Element()
	 * @generated
	 * @ordered
	 */
	protected static final Element MELEMENT_EDEFAULT = null;

	protected static HashMap activeElements = new HashMap();

	/**
	 * The cached value of the '{@link #getM_Element() <em>MElement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_Element()
	 * @generated
	 * @ordered
	 */

	protected Element m_Element = MELEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProxyEquivalenceClass() <em>Proxy Equivalence Class</em>}' containment reference list.
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

	/*private ElementManager m_ElementManager = CMCoreModelPlugin.INSTANCE
	 .getM_SessionManager().getElementManager();*/

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CMProxyElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CMCorePackage.eINSTANCE.getCMProxyElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getM_Element() {
		return m_Element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_Element(Element newM_Element) {
		Element oldM_Element = m_Element;
		m_Element = newM_Element;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CMCorePackage.CM_PROXY_ELEMENT__MELEMENT, oldM_Element,
					m_Element));
	}

	/*	public void setM_Element(Element newM_Element) {
	 //before setting the element the parent mus be setted		

	 //Call the original set
	 setM_ElementGen(newM_Element);
	 //check for the equivalence classes
	 checkEquivalenceClasses();

	 }*/

	protected void checkEquivalenceClasses() {
		Collection candidateEquivalenceClasses = m_Element
				.getLnkEquivalenceClasses();
		//delete the not used EquivalenceClasses
		for (Iterator i = this.getProxyEquivalenceClass().iterator(); i
				.hasNext();) {
			CMProxyEquivalenceClass l_ProxyEquivalenceClass = (CMProxyEquivalenceClass) i
					.next();
			if (!candidateEquivalenceClasses.contains(l_ProxyEquivalenceClass
					.getM_EquivalenceClass()))
				this.getProxyEquivalenceClass().remove(
						(l_ProxyEquivalenceClass));
		}
		//create the EquivalenceClasses that are in the model
		for (Iterator j = candidateEquivalenceClasses.iterator(); j.hasNext();) {
			EquivalenceClass l_EquivalenceClass = (EquivalenceClass) j.next();
			if (getProxyEquivalenceClass(l_EquivalenceClass) == null) {
				CMProxyEquivalenceClass l_ProxyEquivalenceClass = CMCorePackage.eINSTANCE
						.getCMCoreFactory().createCMProxyEquivalenceClass(
								l_EquivalenceClass);
				//add the equivalenceclass to the model
				this.getProxyEquivalenceClass().add(l_ProxyEquivalenceClass);

				l_ProxyEquivalenceClass.setProxyElement(this);
				//check for related effects of the equivalenceclass
				((CMProxyEquivalenceClassImpl) l_ProxyEquivalenceClass)
						.checkEffects();
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMProxyTestObject getProxyTestObject() {
		if (eContainerFeatureID != CMCorePackage.CM_PROXY_ELEMENT__PROXY_TEST_OBJECT)
			return null;
		return (CMProxyTestObject) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setProxyTestObjectGen(CMProxyTestObject newProxyTestObject) {
		if (newProxyTestObject != eContainer
				|| (eContainerFeatureID != CMCorePackage.CM_PROXY_ELEMENT__PROXY_TEST_OBJECT && newProxyTestObject != null)) {
			if (EcoreUtil.isAncestor(this, newProxyTestObject))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProxyTestObject != null)
				msgs = ((InternalEObject) newProxyTestObject).eInverseAdd(this,
						CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_ELEMENT,
						CMProxyTestObject.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newProxyTestObject,
					CMCorePackage.CM_PROXY_ELEMENT__PROXY_TEST_OBJECT, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CMCorePackage.CM_PROXY_ELEMENT__PROXY_TEST_OBJECT,
					newProxyTestObject, newProxyTestObject));
	}

	public void setProxyTestObject(CMProxyTestObject newProxyTestObject) {
		{
			//call the original set
			setProxyTestObjectGen(newProxyTestObject);
			//set the correct unique id
			if (newProxyTestObject != null)
				this.setUniqueId(newProxyTestObject.getM_path()
						+ CMCorePlugin.INSTANCE.getString("ID_separator")
						+ CMCorePlugin.INSTANCE.getString("ELEMENT_separator")
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
	public EList getProxyEquivalenceClass() {
		if (proxyEquivalenceClass == null) {
			proxyEquivalenceClass = new EObjectContainmentWithInverseEList(
					CMProxyEquivalenceClass.class, this,
					CMCorePackage.CM_PROXY_ELEMENT__PROXY_EQUIVALENCE_CLASS,
					CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__PROXY_ELEMENT);
		}
		return proxyEquivalenceClass;
	}

	public CMProxyEquivalenceClass getProxyEquivalenceClass(
			EquivalenceClass p_EquivalenceClass) {
		for (Iterator iter = this.getProxyEquivalenceClass().iterator(); iter
				.hasNext();) {
			CMProxyEquivalenceClass l_ProxyEquivalenceClass = (CMProxyEquivalenceClass) iter
					.next();
			if (p_EquivalenceClass.equals((l_ProxyEquivalenceClass)
					.getM_EquivalenceClass()))
				return l_ProxyEquivalenceClass;
		}
		return null;
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
					CMCorePackage.CM_PROXY_ELEMENT__UNIQUE_ID, oldUniqueId,
					uniqueId));
	}

	public void setUniqueId(String newUniqueId) {
		//delete the old reference from the opened elements list
		if (uniqueId != null)
			activeElements.remove(uniqueId);
		//call the original set
		setUniqueIdGen(newUniqueId);
		//put the new id on the map
		activeElements.put(uniqueId, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author Sergio M
	 */
	public String getId() {
		if (isProxyModelSet())
			return new Integer(m_Element.getId()).toString();
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
			return m_Element.getName();
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
			return m_Element.getDescription();
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

		return (m_Element != null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author hcanedo
	 */
	public void setDescription(String p_Description) {
		if (isProxyModelSet()) {
			String oldDescription = m_Element.getDescription();
			m_Element.setDescription(p_Description);
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
	 * @generated NOT
	 * @author hcanedo
	 */
	public void setName(String p_Name) {
		if (isProxyModelSet()) {
			String oldName = m_Element.getName();
			m_Element.setName(p_Name);
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET,
						CMCorePackage.CM_PROXY_ELEMENT__MELEMENT, oldName,
						p_Name));
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

		return this.getM_Element();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public void setCMModel(Object CMModel) {
		this.setM_Element((Element) CMModel);
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
			case CMCorePackage.CM_PROXY_ELEMENT__PROXY_TEST_OBJECT:
				if (eContainer != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
						CMCorePackage.CM_PROXY_ELEMENT__PROXY_TEST_OBJECT, msgs);
			case CMCorePackage.CM_PROXY_ELEMENT__PROXY_EQUIVALENCE_CLASS:
				return ((InternalEList) getProxyEquivalenceClass()).basicAdd(
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
			case CMCorePackage.CM_PROXY_ELEMENT__PROXY_TEST_OBJECT:
				return eBasicSetContainer(null,
						CMCorePackage.CM_PROXY_ELEMENT__PROXY_TEST_OBJECT, msgs);
			case CMCorePackage.CM_PROXY_ELEMENT__PROXY_EQUIVALENCE_CLASS:
				return ((InternalEList) getProxyEquivalenceClass())
						.basicRemove(otherEnd, msgs);
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
			case CMCorePackage.CM_PROXY_ELEMENT__PROXY_TEST_OBJECT:
				return eContainer.eInverseRemove(this,
						CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_ELEMENT,
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
		case CMCorePackage.CM_PROXY_ELEMENT__MELEMENT:
			return getM_Element();
		case CMCorePackage.CM_PROXY_ELEMENT__PROXY_TEST_OBJECT:
			return getProxyTestObject();
		case CMCorePackage.CM_PROXY_ELEMENT__PROXY_EQUIVALENCE_CLASS:
			return getProxyEquivalenceClass();
		case CMCorePackage.CM_PROXY_ELEMENT__UNIQUE_ID:
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
		case CMCorePackage.CM_PROXY_ELEMENT__MELEMENT:
			setM_Element((Element) newValue);
			return;
		case CMCorePackage.CM_PROXY_ELEMENT__PROXY_TEST_OBJECT:
			setProxyTestObject((CMProxyTestObject) newValue);
			return;
		case CMCorePackage.CM_PROXY_ELEMENT__PROXY_EQUIVALENCE_CLASS:
			getProxyEquivalenceClass().clear();
			getProxyEquivalenceClass().addAll((Collection) newValue);
			return;
		case CMCorePackage.CM_PROXY_ELEMENT__UNIQUE_ID:
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
		case CMCorePackage.CM_PROXY_ELEMENT__MELEMENT:
			setM_Element(MELEMENT_EDEFAULT);
			return;
		case CMCorePackage.CM_PROXY_ELEMENT__PROXY_TEST_OBJECT:
			setProxyTestObject((CMProxyTestObject) null);
			return;
		case CMCorePackage.CM_PROXY_ELEMENT__PROXY_EQUIVALENCE_CLASS:
			getProxyEquivalenceClass().clear();
			return;
		case CMCorePackage.CM_PROXY_ELEMENT__UNIQUE_ID:
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
		case CMCorePackage.CM_PROXY_ELEMENT__MELEMENT:
			return MELEMENT_EDEFAULT == null ? m_Element != null
					: !MELEMENT_EDEFAULT.equals(m_Element);
		case CMCorePackage.CM_PROXY_ELEMENT__PROXY_TEST_OBJECT:
			return getProxyTestObject() != null;
		case CMCorePackage.CM_PROXY_ELEMENT__PROXY_EQUIVALENCE_CLASS:
			return proxyEquivalenceClass != null
					&& !proxyEquivalenceClass.isEmpty();
		case CMCorePackage.CM_PROXY_ELEMENT__UNIQUE_ID:
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
	 * @see biz.bi.cmcore.model.CMProxyElement#removeEquivalenceClass(biz.bi.cmcore.model.CMProxyEquivalenceClass)
	 */
	public void removeEquivalenceClass(
			CMProxyEquivalenceClass p_equivalenceClass, boolean doCMModel) {
		if (doCMModel)
			if (p_equivalenceClass.isProxyModelSet()) {
				//remove it from the original model
				CMCorePlugin.INSTANCE.getM_SessionManager()
						.getEquivalenceClassManager().deleteEquivalenceClass(
								p_equivalenceClass.getM_EquivalenceClass(),
								p_equivalenceClass.getProxyElement()
										.getProxyTestObject().getStructure());
				p_equivalenceClass.setM_EquivalenceClass(null);
			}
		//remove it from this element

		this.getProxyEquivalenceClass().remove(p_equivalenceClass);

	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.CMProxyElement#addEquivalenceClass(biz.bi.cmcore.model.CMProxyEquivalenceClass)
	 */
	public void addEquivalenceClass(CMProxyEquivalenceClass p_equivalenceClass,
			boolean doCMModel) {
		if (doCMModel)
			if (p_equivalenceClass.isProxyModelSet()) {
				if (!this.getM_Element().getLnkEquivalenceClasses().contains(
						p_equivalenceClass.getM_EquivalenceClass())) {
					this.getM_Element().getLnkEquivalenceClasses().add(
							p_equivalenceClass.getM_EquivalenceClass());
					p_equivalenceClass.getM_EquivalenceClass().setLnkElement(
							this.getM_Element());
				}
			} else {
				EquivalenceClass l_EquivalenceClass = CMCorePlugin.INSTANCE
						.getM_SessionManager().getEquivalenceClassManager()
						.createEquivalenceClass(this.getM_Element());
				this.getM_Element().getLnkEquivalenceClasses().add(
						l_EquivalenceClass);
				l_EquivalenceClass.setLnkElement(this.getM_Element());
				p_equivalenceClass.setM_EquivalenceClass(l_EquivalenceClass);
			}
		this.getProxyEquivalenceClass().add(p_equivalenceClass);
		p_equivalenceClass.setProxyElement(this);
	}

} //CMProxyElementImpl
