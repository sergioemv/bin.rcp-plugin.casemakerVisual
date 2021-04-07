/**
 * <copyright>
 * </copyright>
 *
 * $Id: CMProxyTestCaseImpl.java,v 1.2 2005/09/20 15:08:08 smoreno Exp $
 */
package biz.bi.cmcore.model.impl;

import biz.bi.cmcore.model.CMCorePackage;
import biz.bi.cmcore.model.CMProxyCombination;
import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.cmcore.model.CMProxyTestCase;
import biz.bi.cmcore.model.CMProxyTestObject;

import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

import model.Combination;
import model.EquivalenceClass;
import model.TestCase;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CM Proxy Test Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyTestCaseImpl#getUniqueId <em>Unique Id</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyTestCaseImpl#getM_TestCase <em>MTest Case</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyTestCaseImpl#getProxyTestObject <em>Proxy Test Object</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyTestCaseImpl#getProxyCombination <em>Proxy Combination</em>}</li>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxyTestCaseImpl#getProxyEquivalenceClass <em>Proxy Equivalence Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CMProxyTestCaseImpl extends EObjectImpl implements CMProxyTestCase {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

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
	 * The default value of the '{@link #getM_TestCase() <em>MTest Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_TestCase()
	 * @generated
	 * @ordered
	 */
	protected static final TestCase MTEST_CASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getM_TestCase() <em>MTest Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_TestCase()
	 * @generated
	 * @ordered
	 */
	protected TestCase m_TestCase = MTEST_CASE_EDEFAULT;

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
	protected CMProxyTestCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CMCorePackage.eINSTANCE.getCMProxyTestCase();
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
					CMCorePackage.CM_PROXY_TEST_CASE__UNIQUE_ID, oldUniqueId,
					uniqueId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestCase getM_TestCase() {
		return m_TestCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_TestCase(TestCase newM_TestCase) {
		TestCase oldM_TestCase = m_TestCase;
		m_TestCase = newM_TestCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CMCorePackage.CM_PROXY_TEST_CASE__MTEST_CASE,
					oldM_TestCase, m_TestCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMProxyTestObject getProxyTestObject() {
		if (eContainerFeatureID != CMCorePackage.CM_PROXY_TEST_CASE__PROXY_TEST_OBJECT)
			return null;
		return (CMProxyTestObject) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProxyTestObject(CMProxyTestObject newProxyTestObject) {
		if (newProxyTestObject != eContainer
				|| (eContainerFeatureID != CMCorePackage.CM_PROXY_TEST_CASE__PROXY_TEST_OBJECT && newProxyTestObject != null)) {
			if (EcoreUtil.isAncestor(this, newProxyTestObject))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProxyTestObject != null)
				msgs = ((InternalEObject) newProxyTestObject).eInverseAdd(this,
						CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_TEST_CASE,
						CMProxyTestObject.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newProxyTestObject,
					CMCorePackage.CM_PROXY_TEST_CASE__PROXY_TEST_OBJECT, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CMCorePackage.CM_PROXY_TEST_CASE__PROXY_TEST_OBJECT,
					newProxyTestObject, newProxyTestObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProxyCombination() {
		if (proxyCombination == null) {
			proxyCombination = new EObjectResolvingEList(
					CMProxyCombination.class, this,
					CMCorePackage.CM_PROXY_TEST_CASE__PROXY_COMBINATION);
		}
		return proxyCombination;
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
					CMCorePackage.CM_PROXY_TEST_CASE__PROXY_EQUIVALENCE_CLASS);
		}
		return proxyEquivalenceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProxyModelSet() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	 * @generated
	 */
	public Object getCMModel() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCMModel(Object model) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	public int getRiskLevel() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRiskLevel(int P_RiskLevel) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getState() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(int p_State) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
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
			case CMCorePackage.CM_PROXY_TEST_CASE__PROXY_TEST_OBJECT:
				if (eContainer != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
						CMCorePackage.CM_PROXY_TEST_CASE__PROXY_TEST_OBJECT,
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
			case CMCorePackage.CM_PROXY_TEST_CASE__PROXY_TEST_OBJECT:
				return eBasicSetContainer(null,
						CMCorePackage.CM_PROXY_TEST_CASE__PROXY_TEST_OBJECT,
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
			case CMCorePackage.CM_PROXY_TEST_CASE__PROXY_TEST_OBJECT:
				return eContainer.eInverseRemove(this,
						CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_TEST_CASE,
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
		case CMCorePackage.CM_PROXY_TEST_CASE__UNIQUE_ID:
			return getUniqueId();
		case CMCorePackage.CM_PROXY_TEST_CASE__MTEST_CASE:
			return getM_TestCase();
		case CMCorePackage.CM_PROXY_TEST_CASE__PROXY_TEST_OBJECT:
			return getProxyTestObject();
		case CMCorePackage.CM_PROXY_TEST_CASE__PROXY_COMBINATION:
			return getProxyCombination();
		case CMCorePackage.CM_PROXY_TEST_CASE__PROXY_EQUIVALENCE_CLASS:
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
		case CMCorePackage.CM_PROXY_TEST_CASE__UNIQUE_ID:
			setUniqueId((String) newValue);
			return;
		case CMCorePackage.CM_PROXY_TEST_CASE__MTEST_CASE:
			setM_TestCase((TestCase) newValue);
			return;
		case CMCorePackage.CM_PROXY_TEST_CASE__PROXY_TEST_OBJECT:
			setProxyTestObject((CMProxyTestObject) newValue);
			return;
		case CMCorePackage.CM_PROXY_TEST_CASE__PROXY_COMBINATION:
			getProxyCombination().clear();
			getProxyCombination().addAll((Collection) newValue);
			return;
		case CMCorePackage.CM_PROXY_TEST_CASE__PROXY_EQUIVALENCE_CLASS:
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
		case CMCorePackage.CM_PROXY_TEST_CASE__UNIQUE_ID:
			setUniqueId(UNIQUE_ID_EDEFAULT);
			return;
		case CMCorePackage.CM_PROXY_TEST_CASE__MTEST_CASE:
			setM_TestCase(MTEST_CASE_EDEFAULT);
			return;
		case CMCorePackage.CM_PROXY_TEST_CASE__PROXY_TEST_OBJECT:
			setProxyTestObject((CMProxyTestObject) null);
			return;
		case CMCorePackage.CM_PROXY_TEST_CASE__PROXY_COMBINATION:
			getProxyCombination().clear();
			return;
		case CMCorePackage.CM_PROXY_TEST_CASE__PROXY_EQUIVALENCE_CLASS:
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
		case CMCorePackage.CM_PROXY_TEST_CASE__UNIQUE_ID:
			return UNIQUE_ID_EDEFAULT == null ? uniqueId != null
					: !UNIQUE_ID_EDEFAULT.equals(uniqueId);
		case CMCorePackage.CM_PROXY_TEST_CASE__MTEST_CASE:
			return MTEST_CASE_EDEFAULT == null ? m_TestCase != null
					: !MTEST_CASE_EDEFAULT.equals(m_TestCase);
		case CMCorePackage.CM_PROXY_TEST_CASE__PROXY_TEST_OBJECT:
			return getProxyTestObject() != null;
		case CMCorePackage.CM_PROXY_TEST_CASE__PROXY_COMBINATION:
			return proxyCombination != null && !proxyCombination.isEmpty();
		case CMCorePackage.CM_PROXY_TEST_CASE__PROXY_EQUIVALENCE_CLASS:
			return proxyEquivalenceClass != null
					&& !proxyEquivalenceClass.isEmpty();
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
		result.append(" (uniqueId: "); //$NON-NLS-1$
		result.append(uniqueId);
		result.append(", m_TestCase: "); //$NON-NLS-1$
		result.append(m_TestCase);
		result.append(')');
		return result.toString();
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

	/**
	 * @param p_combination
	 * @return
	 */
	public Object getProxyCombination(Combination p_combination) {
		for (Iterator iter = this.getProxyCombination().iterator(); iter.hasNext();) {
			CMProxyCombination l_CMProxyCombination = (CMProxyCombination) iter.next();
			if (p_combination.equals((l_CMProxyCombination).getM_Combination()))
				return l_CMProxyCombination;
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.CMProxyTestCase#addProxyEquivalenceClass(biz.bi.cmcore.model.CMProxyEquivalenceClass, boolean)
	 */
	public void addProxyEquivalenceClass(CMProxyEquivalenceClass p_child, boolean p_doCMModel) {
		if (p_doCMModel)
			if ((isProxyModelSet())
					&& p_child.isProxyModelSet()) {
				this.getM_TestCase().getLnkEquivalenceClasses().add(
						p_child.getM_EquivalenceClass());
			}
		this.getProxyEquivalenceClass().add(p_child);
		
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.CMProxyTestCase#removeProxyEquivalenceClass(biz.bi.cmcore.model.CMProxyEquivalenceClass, boolean)
	 */
	public void removeProxyEquivalenceClass(CMProxyEquivalenceClass p_child, boolean p_doCMModel) {
		if (p_doCMModel)
			if (isProxyModelSet() && p_child.isProxyModelSet()) {
				this.getM_TestCase().getLnkEquivalenceClasses().remove(
						p_child.getM_EquivalenceClass());
			}
		this.getProxyEquivalenceClass().remove(p_child);

		
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.CMProxyTestCase#addProxyCombination(biz.bi.cmcore.model.CMProxyCombination, boolean)
	 */
	public void addProxyCombination(CMProxyCombination p_child, boolean p_doCMModel) {
		if (p_doCMModel)
			if ((isProxyModelSet())
					&& p_child.isProxyModelSet()) {
				this.getM_TestCase().getLnkCombinations().add(
						p_child.getM_Combination());
			}
		this.getProxyCombination().add(p_child);
		
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.CMProxyTestCase#removeProxyCombination(biz.bi.cmcore.model.CMProxyCombination, boolean)
	 */
	public void removeProxyCombination(CMProxyCombination p_child, boolean p_doCMModel) {
		if (p_doCMModel)
			if (isProxyModelSet() && p_child.isProxyModelSet()) {
				this.getM_TestCase().getLnkCombinations().remove(
						p_child.getM_Combination());
			}
		this.getProxyCombination().remove(p_child);
	
	}

} //CMProxyTestCaseImpl
