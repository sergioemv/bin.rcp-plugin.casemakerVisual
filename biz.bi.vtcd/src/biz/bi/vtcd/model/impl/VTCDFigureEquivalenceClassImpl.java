/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDFigureEquivalenceClassImpl.java,v 1.8 2005/08/26 15:43:09 smoreno Exp $
 */
package biz.bi.vtcd.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.vtcd.model.VTCDFigureElement;
import biz.bi.vtcd.model.VTCDFigureEquivalenceClass;
import biz.bi.vtcd.model.VTCDLinkCombinationEClass;
import biz.bi.vtcd.model.VTCDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Figure Equivalence Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDFigureEquivalenceClassImpl#getM_VTCDFigureElement <em>MVTCD Figure Element</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDFigureEquivalenceClassImpl#getM_VTCDLinkCombinationEClass <em>MVTCD Link Combination EClass</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDFigureEquivalenceClassImpl#getM_EquivalenceClass <em>MEquivalence Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VTCDFigureEquivalenceClassImpl extends VTCDAbstractFigureImpl
		implements VTCDFigureEquivalenceClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getM_VTCDLinkCombinationEClass() <em>MVTCD Link Combination EClass</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_VTCDLinkCombinationEClass()
	 * @generated
	 * @ordered
	 */
	protected EList m_VTCDLinkCombinationEClass = null;

	/**
	 * The default value of the '{@link #getM_EquivalenceClass() <em>MEquivalence Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_EquivalenceClass()
	 * @generated
	 * @ordered
	 */
	protected static final CMProxyEquivalenceClass MEQUIVALENCE_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getM_EquivalenceClass() <em>MEquivalence Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_EquivalenceClass()
	 * @generated NOT
	 * @author smoreno
	 * @ordered
	 */
	protected CMProxyEquivalenceClass m_EquivalenceClass = EQUIVALENCECLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTCDFigureEquivalenceClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return VTCDPackage.eINSTANCE.getVTCDFigureEquivalenceClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTCDFigureElement getM_VTCDFigureElement() {
		if (eContainerFeatureID != VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__MVTCD_FIGURE_ELEMENT)
			return null;
		return (VTCDFigureElement) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_VTCDFigureElement(VTCDFigureElement newM_VTCDFigureElement) {
		if (newM_VTCDFigureElement != eContainer
				|| (eContainerFeatureID != VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__MVTCD_FIGURE_ELEMENT && newM_VTCDFigureElement != null)) {
			if (EcoreUtil.isAncestor(this, newM_VTCDFigureElement))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newM_VTCDFigureElement != null)
				msgs = ((InternalEObject) newM_VTCDFigureElement)
						.eInverseAdd(
								this,
								VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_FIGURE_EQUIVALENCE_CLASS,
								VTCDFigureElement.class, msgs);
			msgs = eBasicSetContainer(
					(InternalEObject) newM_VTCDFigureElement,
					VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__MVTCD_FIGURE_ELEMENT,
					msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__MVTCD_FIGURE_ELEMENT,
					newM_VTCDFigureElement, newM_VTCDFigureElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getM_VTCDLinkCombinationEClass() {
		if (m_VTCDLinkCombinationEClass == null) {
			m_VTCDLinkCombinationEClass = new EObjectWithInverseResolvingEList(
					VTCDLinkCombinationEClass.class,
					this,
					VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__MVTCD_LINK_COMBINATION_ECLASS,
					VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__DEST_EQUIVALENCE_CLASS);
		}
		return m_VTCDLinkCombinationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMProxyEquivalenceClass getM_EquivalenceClass() {
		return m_EquivalenceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_EquivalenceClass(
			CMProxyEquivalenceClass newM_EquivalenceClass) {
		CMProxyEquivalenceClass oldM_EquivalenceClass = m_EquivalenceClass;
		m_EquivalenceClass = newM_EquivalenceClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__MEQUIVALENCE_CLASS,
					oldM_EquivalenceClass, m_EquivalenceClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public EObject getProxyModel() {
		return this.getM_EquivalenceClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public void setProxyModel(EObject model) {
		if (model instanceof CMProxyEquivalenceClass)
			this.setM_EquivalenceClass((CMProxyEquivalenceClass) model);
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
			case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__MVTCD_FIGURE_ELEMENT:
				if (eContainer != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(
						otherEnd,
						VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__MVTCD_FIGURE_ELEMENT,
						msgs);
			case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__MVTCD_LINK_COMBINATION_ECLASS:
				return ((InternalEList) getM_VTCDLinkCombinationEClass())
						.basicAdd(otherEnd, msgs);
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
			case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__MVTCD_FIGURE_ELEMENT:
				return eBasicSetContainer(
						null,
						VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__MVTCD_FIGURE_ELEMENT,
						msgs);
			case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__MVTCD_LINK_COMBINATION_ECLASS:
				return ((InternalEList) getM_VTCDLinkCombinationEClass())
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
			case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__MVTCD_FIGURE_ELEMENT:
				return eContainer
						.eInverseRemove(
								this,
								VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_FIGURE_EQUIVALENCE_CLASS,
								VTCDFigureElement.class, msgs);
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
		case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__HEIGHT:
			return new Integer(getHeight());
		case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__WIDTH:
			return new Integer(getWidth());
		case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__X:
			return new Integer(getX());
		case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__Y:
			return new Integer(getY());
		case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__MVTCD_FIGURE_ELEMENT:
			return getM_VTCDFigureElement();
		case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__MVTCD_LINK_COMBINATION_ECLASS:
			return getM_VTCDLinkCombinationEClass();
		case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__MEQUIVALENCE_CLASS:
			return getM_EquivalenceClass();
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
		case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__HEIGHT:
			setHeight(((Integer) newValue).intValue());
			return;
		case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__WIDTH:
			setWidth(((Integer) newValue).intValue());
			return;
		case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__X:
			setX(((Integer) newValue).intValue());
			return;
		case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__Y:
			setY(((Integer) newValue).intValue());
			return;
		case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__MVTCD_FIGURE_ELEMENT:
			setM_VTCDFigureElement((VTCDFigureElement) newValue);
			return;
		case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__MVTCD_LINK_COMBINATION_ECLASS:
			getM_VTCDLinkCombinationEClass().clear();
			getM_VTCDLinkCombinationEClass().addAll((Collection) newValue);
			return;
		case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__MEQUIVALENCE_CLASS:
			setM_EquivalenceClass((CMProxyEquivalenceClass) newValue);
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
		case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__HEIGHT:
			setHeight(HEIGHT_EDEFAULT);
			return;
		case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__X:
			setX(X_EDEFAULT);
			return;
		case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__Y:
			setY(Y_EDEFAULT);
			return;
		case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__MVTCD_FIGURE_ELEMENT:
			setM_VTCDFigureElement((VTCDFigureElement) null);
			return;
		case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__MVTCD_LINK_COMBINATION_ECLASS:
			getM_VTCDLinkCombinationEClass().clear();
			return;
		case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__MEQUIVALENCE_CLASS:
			setM_EquivalenceClass(MEQUIVALENCE_CLASS_EDEFAULT);
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
		case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__HEIGHT:
			return height != HEIGHT_EDEFAULT;
		case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__WIDTH:
			return width != WIDTH_EDEFAULT;
		case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__X:
			return x != X_EDEFAULT;
		case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__Y:
			return y != Y_EDEFAULT;
		case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__MVTCD_FIGURE_ELEMENT:
			return getM_VTCDFigureElement() != null;
		case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__MVTCD_LINK_COMBINATION_ECLASS:
			return m_VTCDLinkCombinationEClass != null
					&& !m_VTCDLinkCombinationEClass.isEmpty();
		case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__MEQUIVALENCE_CLASS:
			return MEQUIVALENCE_CLASS_EDEFAULT == null ? m_EquivalenceClass != null
					: !MEQUIVALENCE_CLASS_EDEFAULT.equals(m_EquivalenceClass);
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
		result.append(" (m_EquivalenceClass: "); //$NON-NLS-1$
		result.append(m_EquivalenceClass);
		result.append(')');
		return result.toString();
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.model.impl.VTCDAbstractFigureImpl#getLinks()
	 */
	public EList getLinks() {
		return this.getM_VTCDLinkCombinationEClass();
	}

} //VTCDFigureEquivalenceClassImpl
