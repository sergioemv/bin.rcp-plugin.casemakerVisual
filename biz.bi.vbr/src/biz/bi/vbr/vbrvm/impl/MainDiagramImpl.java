/**
 * <copyright>
 * </copyright>
 *
 * $Id: MainDiagramImpl.java,v 1.6 2005/09/20 14:35:07 hcanedo Exp $
 */
package biz.bi.vbr.vbrvm.impl;

import biz.bi.vbr.FormalPolicy;

import biz.bi.vbr.vbrvm.MainDiagram;
import biz.bi.vbr.vbrvm.VBRActionView;
import biz.bi.vbr.vbrvm.VBRElementValueView;
import biz.bi.vbr.vbrvm.VBRElementView;
import biz.bi.vbr.vbrvm.VBRTreeView;
import biz.bi.vbr.vbrvm.VBRVMPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link biz.bi.vbr.vbrvm.impl.MainDiagramImpl#getM_TreeView <em>MTree View</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.impl.MainDiagramImpl#getM_vbrObject <em>Mvbr Object</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.impl.MainDiagramImpl#getM_VBRElementView <em>MVBR Element View</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.impl.MainDiagramImpl#getM_VBRElementValueView <em>MVBR Element Value View</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.impl.MainDiagramImpl#getM_VBRActionView <em>MVBR Action View</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MainDiagramImpl extends EObjectImpl implements MainDiagram {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getM_TreeView() <em>MTree View</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_TreeView()
	 * @generated
	 * @ordered
	 */
	protected EList m_TreeView = null;

	/**
	 * The default value of the '{@link #getM_vbrObject() <em>Mvbr Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_vbrObject()
	 * @generated
	 * @ordered
	 */
	protected static final FormalPolicy MVBR_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getM_vbrObject() <em>Mvbr Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_vbrObject()
	 * @generated
	 * @ordered
	 */
	protected FormalPolicy m_vbrObject = MVBR_OBJECT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getM_VBRElementView() <em>MVBR Element View</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_VBRElementView()
	 * @generated
	 * @ordered
	 */
	protected EList m_VBRElementView = null;

	/**
	 * The cached value of the '{@link #getM_VBRElementValueView() <em>MVBR Element Value View</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_VBRElementValueView()
	 * @generated
	 * @ordered
	 */
	protected EList m_VBRElementValueView = null;

	/**
	 * The cached value of the '{@link #getM_VBRActionView() <em>MVBR Action View</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_VBRActionView()
	 * @generated
	 * @ordered
	 */
	protected EList m_VBRActionView = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return VBRVMPackage.eINSTANCE.getMainDiagram();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getM_TreeView() {
		if (m_TreeView == null) {
			m_TreeView = new EObjectContainmentWithInverseEList(
					VBRTreeView.class, this,
					VBRVMPackage.MAIN_DIAGRAM__MTREE_VIEW,
					VBRVMPackage.VBR_TREE_VIEW__MAIN_DIAGRAM);
		}
		return m_TreeView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalPolicy getM_vbrObject() {
		return m_vbrObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_vbrObject(FormalPolicy newM_vbrObject) {
		FormalPolicy oldM_vbrObject = m_vbrObject;
		m_vbrObject = newM_vbrObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VBRVMPackage.MAIN_DIAGRAM__MVBR_OBJECT, oldM_vbrObject,
					m_vbrObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getM_VBRElementView() {
		if (m_VBRElementView == null) {
			m_VBRElementView = new EObjectContainmentWithInverseEList(
					VBRElementView.class, this,
					VBRVMPackage.MAIN_DIAGRAM__MVBR_ELEMENT_VIEW,
					VBRVMPackage.VBR_ELEMENT_VIEW__MMAIN_DIAGRAM);
		}
		return m_VBRElementView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getM_VBRElementValueView() {
		if (m_VBRElementValueView == null) {
			m_VBRElementValueView = new EObjectContainmentWithInverseEList(
					VBRElementValueView.class, this,
					VBRVMPackage.MAIN_DIAGRAM__MVBR_ELEMENT_VALUE_VIEW,
					VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MMAIN_DIAGRAM);
		}
		return m_VBRElementValueView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getM_VBRActionView() {
		if (m_VBRActionView == null) {
			m_VBRActionView = new EObjectContainmentEList(VBRActionView.class,
					this, VBRVMPackage.MAIN_DIAGRAM__MVBR_ACTION_VIEW);
		}
		return m_VBRActionView;
	}

	public void setM_vbrObjectC(FormalPolicy newM_vbrObject) {
		setM_vbrObject(newM_vbrObject);
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
			case VBRVMPackage.MAIN_DIAGRAM__MTREE_VIEW:
				return ((InternalEList) getM_TreeView()).basicAdd(otherEnd,
						msgs);
			case VBRVMPackage.MAIN_DIAGRAM__MVBR_ELEMENT_VIEW:
				return ((InternalEList) getM_VBRElementView()).basicAdd(
						otherEnd, msgs);
			case VBRVMPackage.MAIN_DIAGRAM__MVBR_ELEMENT_VALUE_VIEW:
				return ((InternalEList) getM_VBRElementValueView()).basicAdd(
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
			case VBRVMPackage.MAIN_DIAGRAM__MTREE_VIEW:
				return ((InternalEList) getM_TreeView()).basicRemove(otherEnd,
						msgs);
			case VBRVMPackage.MAIN_DIAGRAM__MVBR_ELEMENT_VIEW:
				return ((InternalEList) getM_VBRElementView()).basicRemove(
						otherEnd, msgs);
			case VBRVMPackage.MAIN_DIAGRAM__MVBR_ELEMENT_VALUE_VIEW:
				return ((InternalEList) getM_VBRElementValueView())
						.basicRemove(otherEnd, msgs);
			case VBRVMPackage.MAIN_DIAGRAM__MVBR_ACTION_VIEW:
				return ((InternalEList) getM_VBRActionView()).basicRemove(
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
		case VBRVMPackage.MAIN_DIAGRAM__MTREE_VIEW:
			return getM_TreeView();
		case VBRVMPackage.MAIN_DIAGRAM__MVBR_OBJECT:
			return getM_vbrObject();
		case VBRVMPackage.MAIN_DIAGRAM__MVBR_ELEMENT_VIEW:
			return getM_VBRElementView();
		case VBRVMPackage.MAIN_DIAGRAM__MVBR_ELEMENT_VALUE_VIEW:
			return getM_VBRElementValueView();
		case VBRVMPackage.MAIN_DIAGRAM__MVBR_ACTION_VIEW:
			return getM_VBRActionView();
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
		case VBRVMPackage.MAIN_DIAGRAM__MTREE_VIEW:
			getM_TreeView().clear();
			getM_TreeView().addAll((Collection) newValue);
			return;
		case VBRVMPackage.MAIN_DIAGRAM__MVBR_OBJECT:
			setM_vbrObject((FormalPolicy) newValue);
			return;
		case VBRVMPackage.MAIN_DIAGRAM__MVBR_ELEMENT_VIEW:
			getM_VBRElementView().clear();
			getM_VBRElementView().addAll((Collection) newValue);
			return;
		case VBRVMPackage.MAIN_DIAGRAM__MVBR_ELEMENT_VALUE_VIEW:
			getM_VBRElementValueView().clear();
			getM_VBRElementValueView().addAll((Collection) newValue);
			return;
		case VBRVMPackage.MAIN_DIAGRAM__MVBR_ACTION_VIEW:
			getM_VBRActionView().clear();
			getM_VBRActionView().addAll((Collection) newValue);
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
		case VBRVMPackage.MAIN_DIAGRAM__MTREE_VIEW:
			getM_TreeView().clear();
			return;
		case VBRVMPackage.MAIN_DIAGRAM__MVBR_OBJECT:
			setM_vbrObject(MVBR_OBJECT_EDEFAULT);
			return;
		case VBRVMPackage.MAIN_DIAGRAM__MVBR_ELEMENT_VIEW:
			getM_VBRElementView().clear();
			return;
		case VBRVMPackage.MAIN_DIAGRAM__MVBR_ELEMENT_VALUE_VIEW:
			getM_VBRElementValueView().clear();
			return;
		case VBRVMPackage.MAIN_DIAGRAM__MVBR_ACTION_VIEW:
			getM_VBRActionView().clear();
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
		case VBRVMPackage.MAIN_DIAGRAM__MTREE_VIEW:
			return m_TreeView != null && !m_TreeView.isEmpty();
		case VBRVMPackage.MAIN_DIAGRAM__MVBR_OBJECT:
			return MVBR_OBJECT_EDEFAULT == null ? m_vbrObject != null
					: !MVBR_OBJECT_EDEFAULT.equals(m_vbrObject);
		case VBRVMPackage.MAIN_DIAGRAM__MVBR_ELEMENT_VIEW:
			return m_VBRElementView != null && !m_VBRElementView.isEmpty();
		case VBRVMPackage.MAIN_DIAGRAM__MVBR_ELEMENT_VALUE_VIEW:
			return m_VBRElementValueView != null
					&& !m_VBRElementValueView.isEmpty();
		case VBRVMPackage.MAIN_DIAGRAM__MVBR_ACTION_VIEW:
			return m_VBRActionView != null && !m_VBRActionView.isEmpty();
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
		result.append(" (m_vbrObject: "); //$NON-NLS-1$
		result.append(m_vbrObject);
		result.append(')');
		return result.toString();
	}

	/* (non-Javadoc)
	 * @see biz.bi.vbr.vbrvm.MainDiagram#getChildren()
	 */
	public List getChildren() {
		List childrens = new ArrayList();
		if (m_TreeView != null)
			childrens.addAll(m_TreeView);
		if (m_VBRActionView != null)
			childrens.addAll(m_VBRActionView);
		if (m_VBRElementValueView != null)
			childrens.addAll(m_VBRElementValueView);
		if (m_VBRElementView != null)
			childrens.addAll(m_VBRElementView);
		return childrens;
	}

} //MainDiagramImpl
