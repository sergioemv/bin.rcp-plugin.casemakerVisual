/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDFigureCombinationImpl.java,v 1.11 2005/08/26 15:43:09 smoreno Exp $
 */
package biz.bi.vtcd.model.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import biz.bi.cmcore.model.CMProxyCombination;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.vtcd.model.VTCDDiagramCombination;
import biz.bi.vtcd.model.VTCDFigureCombination;
import biz.bi.vtcd.model.VTCDLinkCombinationEClass;
import biz.bi.vtcd.model.VTCDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Figure Combination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDFigureCombinationImpl#getM_VTCDDiagramCombination <em>MVTCD Diagram Combination</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDFigureCombinationImpl#getM_VTCDLinkCombinationEClass <em>MVTCD Link Combination EClass</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDFigureCombinationImpl#getM_Combination <em>MCombination</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VTCDFigureCombinationImpl extends VTCDAbstractFigureImpl implements
		VTCDFigureCombination {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getM_VTCDLinkCombinationEClass() <em>MVTCD Link Combination EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_VTCDLinkCombinationEClass()
	 * @generated
	 * @ordered
	 */
	protected EList m_VTCDLinkCombinationEClass = null;

	/**
	 * The default value of the '{@link #getM_Combination() <em>MCombination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_Combination()
	 * @generated
	 * @ordered
	 */
	protected static final CMProxyCombination MCOMBINATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getM_Combination() <em>MCombination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_Combination()
	 * @generated NOT
	 * @author smoreno
	 * @ordered
	 */
	protected CMProxyCombination m_Combination = COMBINATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTCDFigureCombinationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return VTCDPackage.eINSTANCE.getVTCDFigureCombination();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTCDDiagramCombination getM_VTCDDiagramCombination() {
		if (eContainerFeatureID != VTCDPackage.VTCD_FIGURE_COMBINATION__MVTCD_DIAGRAM_COMBINATION)
			return null;
		return (VTCDDiagramCombination) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_VTCDDiagramCombination(
			VTCDDiagramCombination newM_VTCDDiagramCombination) {
		if (newM_VTCDDiagramCombination != eContainer
				|| (eContainerFeatureID != VTCDPackage.VTCD_FIGURE_COMBINATION__MVTCD_DIAGRAM_COMBINATION && newM_VTCDDiagramCombination != null)) {
			if (EcoreUtil.isAncestor(this, newM_VTCDDiagramCombination))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newM_VTCDDiagramCombination != null)
				msgs = ((InternalEObject) newM_VTCDDiagramCombination)
						.eInverseAdd(
								this,
								VTCDPackage.VTCD_DIAGRAM_COMBINATION__MVTCD_FIGURE_COMBINATION,
								VTCDDiagramCombination.class, msgs);
			msgs = eBasicSetContainer(
					(InternalEObject) newM_VTCDDiagramCombination,
					VTCDPackage.VTCD_FIGURE_COMBINATION__MVTCD_DIAGRAM_COMBINATION,
					msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					VTCDPackage.VTCD_FIGURE_COMBINATION__MVTCD_DIAGRAM_COMBINATION,
					newM_VTCDDiagramCombination, newM_VTCDDiagramCombination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getM_VTCDLinkCombinationEClass() {
		if (m_VTCDLinkCombinationEClass == null) {
			m_VTCDLinkCombinationEClass = new EObjectContainmentWithInverseEList(
					VTCDLinkCombinationEClass.class,
					this,
					VTCDPackage.VTCD_FIGURE_COMBINATION__MVTCD_LINK_COMBINATION_ECLASS,
					VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__SOURCE_COMBINATION);
		}
		return m_VTCDLinkCombinationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMProxyCombination getM_Combination() {
		return m_Combination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_Combination(CMProxyCombination newM_Combination) {
		CMProxyCombination oldM_Combination = m_Combination;
		m_Combination = newM_Combination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VTCDPackage.VTCD_FIGURE_COMBINATION__MCOMBINATION,
					oldM_Combination, m_Combination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public EObject getProxyModel() {
		return this.getM_Combination();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public void setProxyModel(EObject model) {

		if (model instanceof CMProxyCombination)
			this.setM_Combination((CMProxyCombination) model);
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
			case VTCDPackage.VTCD_FIGURE_COMBINATION__MVTCD_DIAGRAM_COMBINATION:
				if (eContainer != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(
						otherEnd,
						VTCDPackage.VTCD_FIGURE_COMBINATION__MVTCD_DIAGRAM_COMBINATION,
						msgs);
			case VTCDPackage.VTCD_FIGURE_COMBINATION__MVTCD_LINK_COMBINATION_ECLASS:
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
			case VTCDPackage.VTCD_FIGURE_COMBINATION__MVTCD_DIAGRAM_COMBINATION:
				return eBasicSetContainer(
						null,
						VTCDPackage.VTCD_FIGURE_COMBINATION__MVTCD_DIAGRAM_COMBINATION,
						msgs);
			case VTCDPackage.VTCD_FIGURE_COMBINATION__MVTCD_LINK_COMBINATION_ECLASS:
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
			case VTCDPackage.VTCD_FIGURE_COMBINATION__MVTCD_DIAGRAM_COMBINATION:
				return eContainer
						.eInverseRemove(
								this,
								VTCDPackage.VTCD_DIAGRAM_COMBINATION__MVTCD_FIGURE_COMBINATION,
								VTCDDiagramCombination.class, msgs);
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
		case VTCDPackage.VTCD_FIGURE_COMBINATION__HEIGHT:
			return new Integer(getHeight());
		case VTCDPackage.VTCD_FIGURE_COMBINATION__WIDTH:
			return new Integer(getWidth());
		case VTCDPackage.VTCD_FIGURE_COMBINATION__X:
			return new Integer(getX());
		case VTCDPackage.VTCD_FIGURE_COMBINATION__Y:
			return new Integer(getY());
		case VTCDPackage.VTCD_FIGURE_COMBINATION__MVTCD_DIAGRAM_COMBINATION:
			return getM_VTCDDiagramCombination();
		case VTCDPackage.VTCD_FIGURE_COMBINATION__MVTCD_LINK_COMBINATION_ECLASS:
			return getM_VTCDLinkCombinationEClass();
		case VTCDPackage.VTCD_FIGURE_COMBINATION__MCOMBINATION:
			return getM_Combination();
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
		case VTCDPackage.VTCD_FIGURE_COMBINATION__HEIGHT:
			setHeight(((Integer) newValue).intValue());
			return;
		case VTCDPackage.VTCD_FIGURE_COMBINATION__WIDTH:
			setWidth(((Integer) newValue).intValue());
			return;
		case VTCDPackage.VTCD_FIGURE_COMBINATION__X:
			setX(((Integer) newValue).intValue());
			return;
		case VTCDPackage.VTCD_FIGURE_COMBINATION__Y:
			setY(((Integer) newValue).intValue());
			return;
		case VTCDPackage.VTCD_FIGURE_COMBINATION__MVTCD_DIAGRAM_COMBINATION:
			setM_VTCDDiagramCombination((VTCDDiagramCombination) newValue);
			return;
		case VTCDPackage.VTCD_FIGURE_COMBINATION__MVTCD_LINK_COMBINATION_ECLASS:
			getM_VTCDLinkCombinationEClass().clear();
			getM_VTCDLinkCombinationEClass().addAll((Collection) newValue);
			return;
		case VTCDPackage.VTCD_FIGURE_COMBINATION__MCOMBINATION:
			setM_Combination((CMProxyCombination) newValue);
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
		case VTCDPackage.VTCD_FIGURE_COMBINATION__HEIGHT:
			setHeight(HEIGHT_EDEFAULT);
			return;
		case VTCDPackage.VTCD_FIGURE_COMBINATION__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case VTCDPackage.VTCD_FIGURE_COMBINATION__X:
			setX(X_EDEFAULT);
			return;
		case VTCDPackage.VTCD_FIGURE_COMBINATION__Y:
			setY(Y_EDEFAULT);
			return;
		case VTCDPackage.VTCD_FIGURE_COMBINATION__MVTCD_DIAGRAM_COMBINATION:
			setM_VTCDDiagramCombination((VTCDDiagramCombination) null);
			return;
		case VTCDPackage.VTCD_FIGURE_COMBINATION__MVTCD_LINK_COMBINATION_ECLASS:
			getM_VTCDLinkCombinationEClass().clear();
			return;
		case VTCDPackage.VTCD_FIGURE_COMBINATION__MCOMBINATION:
			setM_Combination(MCOMBINATION_EDEFAULT);
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
		case VTCDPackage.VTCD_FIGURE_COMBINATION__HEIGHT:
			return height != HEIGHT_EDEFAULT;
		case VTCDPackage.VTCD_FIGURE_COMBINATION__WIDTH:
			return width != WIDTH_EDEFAULT;
		case VTCDPackage.VTCD_FIGURE_COMBINATION__X:
			return x != X_EDEFAULT;
		case VTCDPackage.VTCD_FIGURE_COMBINATION__Y:
			return y != Y_EDEFAULT;
		case VTCDPackage.VTCD_FIGURE_COMBINATION__MVTCD_DIAGRAM_COMBINATION:
			return getM_VTCDDiagramCombination() != null;
		case VTCDPackage.VTCD_FIGURE_COMBINATION__MVTCD_LINK_COMBINATION_ECLASS:
			return m_VTCDLinkCombinationEClass != null
					&& !m_VTCDLinkCombinationEClass.isEmpty();
		case VTCDPackage.VTCD_FIGURE_COMBINATION__MCOMBINATION:
			return MCOMBINATION_EDEFAULT == null ? m_Combination != null
					: !MCOMBINATION_EDEFAULT.equals(m_Combination);
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
		result.append(" (m_Combination: "); //$NON-NLS-1$
		result.append(m_Combination);
		result.append(')');
		return result.toString();
	}

	public VTCDLinkCombinationEClass getM_VTCDLinkCombinationEClass(
			CMProxyEquivalenceClass p_EquivalenceClass) {
		for (Iterator iter = this.getM_VTCDLinkCombinationEClass().iterator(); iter
				.hasNext();) {
			VTCDLinkCombinationEClass l_VTCDLinkCombinationEClass = (VTCDLinkCombinationEClass) iter
					.next();
			if (p_EquivalenceClass.equals((l_VTCDLinkCombinationEClass)
					.getDestEquivalenceClass().getM_EquivalenceClass()))
				return l_VTCDLinkCombinationEClass;
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.model.impl.VTCDAbstractFigureImpl#getLinks()
	 */
	public EList getLinks() {
		
		return this.getM_VTCDLinkCombinationEClass();
	}

} //VTCDFigureCombinationImpl
