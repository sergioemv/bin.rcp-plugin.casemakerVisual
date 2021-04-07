/**
 * <copyright>
 * </copyright>
 *
 * $Id: CMProxySTDCombinationImpl.java,v 1.2 2005/09/20 15:08:08 smoreno Exp $
 */
package biz.bi.cmcore.model.impl;

import biz.bi.cmcore.model.CMCorePackage;
import biz.bi.cmcore.model.CMProxyDependency;
import biz.bi.cmcore.model.CMProxySTDCombination;
import biz.bi.cmcore.model.CMProxyTestObject;

import java.util.Collection;

import model.Combination;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CM Proxy STD Combination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link biz.bi.cmcore.model.impl.CMProxySTDCombinationImpl#getProxyTestObject <em>Proxy Test Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CMProxySTDCombinationImpl extends CMProxyCombinationImpl implements
		CMProxySTDCombination {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CMProxySTDCombinationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CMCorePackage.eINSTANCE.getCMProxySTDCombination();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMProxyTestObject getProxyTestObject() {
		if (eContainerFeatureID != CMCorePackage.CM_PROXY_STD_COMBINATION__PROXY_TEST_OBJECT)
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
				|| (eContainerFeatureID != CMCorePackage.CM_PROXY_STD_COMBINATION__PROXY_TEST_OBJECT && newProxyTestObject != null)) {
			if (EcoreUtil.isAncestor(this, newProxyTestObject))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProxyTestObject != null)
				msgs = ((InternalEObject) newProxyTestObject)
						.eInverseAdd(
								this,
								CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_STD_COMBINATION,
								CMProxyTestObject.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newProxyTestObject,
					CMCorePackage.CM_PROXY_STD_COMBINATION__PROXY_TEST_OBJECT,
					msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CMCorePackage.CM_PROXY_STD_COMBINATION__PROXY_TEST_OBJECT,
					newProxyTestObject, newProxyTestObject));
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
			case CMCorePackage.CM_PROXY_STD_COMBINATION__PROXY_DEPENDENCY:
				if (eContainer != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(
						otherEnd,
						CMCorePackage.CM_PROXY_STD_COMBINATION__PROXY_DEPENDENCY,
						msgs);
			case CMCorePackage.CM_PROXY_STD_COMBINATION__PROXY_EFFECT:
				return ((InternalEList) getProxyEffect()).basicAdd(otherEnd,
						msgs);
			case CMCorePackage.CM_PROXY_STD_COMBINATION__PROXY_TEST_OBJECT:
				if (eContainer != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(
						otherEnd,
						CMCorePackage.CM_PROXY_STD_COMBINATION__PROXY_TEST_OBJECT,
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
			case CMCorePackage.CM_PROXY_STD_COMBINATION__PROXY_DEPENDENCY:
				return eBasicSetContainer(
						null,
						CMCorePackage.CM_PROXY_STD_COMBINATION__PROXY_DEPENDENCY,
						msgs);
			case CMCorePackage.CM_PROXY_STD_COMBINATION__PROXY_EFFECT:
				return ((InternalEList) getProxyEffect()).basicRemove(otherEnd,
						msgs);
			case CMCorePackage.CM_PROXY_STD_COMBINATION__PROXY_TEST_OBJECT:
				return eBasicSetContainer(
						null,
						CMCorePackage.CM_PROXY_STD_COMBINATION__PROXY_TEST_OBJECT,
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
			case CMCorePackage.CM_PROXY_STD_COMBINATION__PROXY_DEPENDENCY:
				return eContainer.eInverseRemove(this,
						CMCorePackage.CM_PROXY_DEPENDENCY__PROXY_COMBINATION,
						CMProxyDependency.class, msgs);
			case CMCorePackage.CM_PROXY_STD_COMBINATION__PROXY_TEST_OBJECT:
				return eContainer
						.eInverseRemove(
								this,
								CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_STD_COMBINATION,
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
		case CMCorePackage.CM_PROXY_STD_COMBINATION__MCOMBINATION:
			return getM_Combination();
		case CMCorePackage.CM_PROXY_STD_COMBINATION__PROXY_DEPENDENCY:
			return getProxyDependency();
		case CMCorePackage.CM_PROXY_STD_COMBINATION__PROXY_EQUIVALENCE_CLASS:
			return getProxyEquivalenceClass();
		case CMCorePackage.CM_PROXY_STD_COMBINATION__PROXY_EFFECT:
			return getProxyEffect();
		case CMCorePackage.CM_PROXY_STD_COMBINATION__UNIQUE_ID:
			return getUniqueId();
		case CMCorePackage.CM_PROXY_STD_COMBINATION__PROXY_TEST_OBJECT:
			return getProxyTestObject();
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
		case CMCorePackage.CM_PROXY_STD_COMBINATION__MCOMBINATION:
			setM_Combination((Combination) newValue);
			return;
		case CMCorePackage.CM_PROXY_STD_COMBINATION__PROXY_DEPENDENCY:
			setProxyDependency((CMProxyDependency) newValue);
			return;
		case CMCorePackage.CM_PROXY_STD_COMBINATION__PROXY_EQUIVALENCE_CLASS:
			getProxyEquivalenceClass().clear();
			getProxyEquivalenceClass().addAll((Collection) newValue);
			return;
		case CMCorePackage.CM_PROXY_STD_COMBINATION__PROXY_EFFECT:
			getProxyEffect().clear();
			getProxyEffect().addAll((Collection) newValue);
			return;
		case CMCorePackage.CM_PROXY_STD_COMBINATION__UNIQUE_ID:
			setUniqueId((String) newValue);
			return;
		case CMCorePackage.CM_PROXY_STD_COMBINATION__PROXY_TEST_OBJECT:
			setProxyTestObject((CMProxyTestObject) newValue);
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
		case CMCorePackage.CM_PROXY_STD_COMBINATION__MCOMBINATION:
			setM_Combination(MCOMBINATION_EDEFAULT);
			return;
		case CMCorePackage.CM_PROXY_STD_COMBINATION__PROXY_DEPENDENCY:
			setProxyDependency((CMProxyDependency) null);
			return;
		case CMCorePackage.CM_PROXY_STD_COMBINATION__PROXY_EQUIVALENCE_CLASS:
			getProxyEquivalenceClass().clear();
			return;
		case CMCorePackage.CM_PROXY_STD_COMBINATION__PROXY_EFFECT:
			getProxyEffect().clear();
			return;
		case CMCorePackage.CM_PROXY_STD_COMBINATION__UNIQUE_ID:
			setUniqueId(UNIQUE_ID_EDEFAULT);
			return;
		case CMCorePackage.CM_PROXY_STD_COMBINATION__PROXY_TEST_OBJECT:
			setProxyTestObject((CMProxyTestObject) null);
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
		case CMCorePackage.CM_PROXY_STD_COMBINATION__MCOMBINATION:
			return MCOMBINATION_EDEFAULT == null ? m_Combination != null
					: !MCOMBINATION_EDEFAULT.equals(m_Combination);
		case CMCorePackage.CM_PROXY_STD_COMBINATION__PROXY_DEPENDENCY:
			return getProxyDependency() != null;
		case CMCorePackage.CM_PROXY_STD_COMBINATION__PROXY_EQUIVALENCE_CLASS:
			return proxyEquivalenceClass != null
					&& !proxyEquivalenceClass.isEmpty();
		case CMCorePackage.CM_PROXY_STD_COMBINATION__PROXY_EFFECT:
			return proxyEffect != null && !proxyEffect.isEmpty();
		case CMCorePackage.CM_PROXY_STD_COMBINATION__UNIQUE_ID:
			return UNIQUE_ID_EDEFAULT == null ? uniqueId != null
					: !UNIQUE_ID_EDEFAULT.equals(uniqueId);
		case CMCorePackage.CM_PROXY_STD_COMBINATION__PROXY_TEST_OBJECT:
			return getProxyTestObject() != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //CMProxySTDCombinationImpl
