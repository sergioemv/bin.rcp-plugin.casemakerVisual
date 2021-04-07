/**
 * <copyright>
 * </copyright>
 *
 * $Id: VBRTreeViewImpl.java,v 1.7 2005/09/20 19:03:42 hcanedo Exp $
 */
package biz.bi.vbr.vbrvm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import biz.bi.vbr.vbrvm.MainDiagram;
import biz.bi.vbr.vbrvm.VBRTreeConnectElementValue;
import biz.bi.vbr.vbrvm.VBRTreeView;
import biz.bi.vbr.vbrvm.VBRVMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VBR Tree View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link biz.bi.vbr.vbrvm.impl.VBRTreeViewImpl#getMainDiagram <em>Main Diagram</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.impl.VBRTreeViewImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.impl.VBRTreeViewImpl#getM_VBRTreeConnectElementValue <em>MVBR Tree Connect Element Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VBRTreeViewImpl extends AbstractViewImpl implements VBRTreeView {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected String icon = ICON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getM_VBRTreeConnectElementValue() <em>MVBR Tree Connect Element Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_VBRTreeConnectElementValue()
	 * @generated
	 * @ordered
	 */
	protected VBRTreeConnectElementValue m_VBRTreeConnectElementValue = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VBRTreeViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return VBRVMPackage.eINSTANCE.getVBRTreeView();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainDiagram getMainDiagram() {
		if (eContainerFeatureID != VBRVMPackage.VBR_TREE_VIEW__MAIN_DIAGRAM)
			return null;
		return (MainDiagram) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainDiagram(MainDiagram newMainDiagram) {
		if (newMainDiagram != eContainer
				|| (eContainerFeatureID != VBRVMPackage.VBR_TREE_VIEW__MAIN_DIAGRAM && newMainDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newMainDiagram))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMainDiagram != null)
				msgs = ((InternalEObject) newMainDiagram).eInverseAdd(this,
						VBRVMPackage.MAIN_DIAGRAM__MTREE_VIEW,
						MainDiagram.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newMainDiagram,
					VBRVMPackage.VBR_TREE_VIEW__MAIN_DIAGRAM, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VBRVMPackage.VBR_TREE_VIEW__MAIN_DIAGRAM, newMainDiagram,
					newMainDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(String newIcon) {
		String oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VBRVMPackage.VBR_TREE_VIEW__ICON, oldIcon, icon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRTreeConnectElementValue getM_VBRTreeConnectElementValue() {
		if (m_VBRTreeConnectElementValue != null
				&& m_VBRTreeConnectElementValue.eIsProxy()) {
			VBRTreeConnectElementValue oldM_VBRTreeConnectElementValue = m_VBRTreeConnectElementValue;
			m_VBRTreeConnectElementValue = (VBRTreeConnectElementValue) eResolveProxy((InternalEObject) m_VBRTreeConnectElementValue);
			if (m_VBRTreeConnectElementValue != oldM_VBRTreeConnectElementValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							VBRVMPackage.VBR_TREE_VIEW__MVBR_TREE_CONNECT_ELEMENT_VALUE,
							oldM_VBRTreeConnectElementValue,
							m_VBRTreeConnectElementValue));
			}
		}
		return m_VBRTreeConnectElementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRTreeConnectElementValue basicGetM_VBRTreeConnectElementValue() {
		return m_VBRTreeConnectElementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_VBRTreeConnectElementValue(
			VBRTreeConnectElementValue newM_VBRTreeConnectElementValue) {
		VBRTreeConnectElementValue oldM_VBRTreeConnectElementValue = m_VBRTreeConnectElementValue;
		m_VBRTreeConnectElementValue = newM_VBRTreeConnectElementValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					VBRVMPackage.VBR_TREE_VIEW__MVBR_TREE_CONNECT_ELEMENT_VALUE,
					oldM_VBRTreeConnectElementValue,
					m_VBRTreeConnectElementValue));
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
			case VBRVMPackage.VBR_TREE_VIEW__MAIN_DIAGRAM:
				if (eContainer != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
						VBRVMPackage.VBR_TREE_VIEW__MAIN_DIAGRAM, msgs);
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
			case VBRVMPackage.VBR_TREE_VIEW__MAIN_DIAGRAM:
				return eBasicSetContainer(null,
						VBRVMPackage.VBR_TREE_VIEW__MAIN_DIAGRAM, msgs);
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
			case VBRVMPackage.VBR_TREE_VIEW__MAIN_DIAGRAM:
				return eContainer.eInverseRemove(this,
						VBRVMPackage.MAIN_DIAGRAM__MTREE_VIEW,
						MainDiagram.class, msgs);
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
		case VBRVMPackage.VBR_TREE_VIEW__X:
			return new Integer(getX());
		case VBRVMPackage.VBR_TREE_VIEW__Y:
			return new Integer(getY());
		case VBRVMPackage.VBR_TREE_VIEW__WIDTH:
			return new Integer(getWidth());
		case VBRVMPackage.VBR_TREE_VIEW__HEIGTH:
			return new Integer(getHeigth());
		case VBRVMPackage.VBR_TREE_VIEW__MAIN_DIAGRAM:
			return getMainDiagram();
		case VBRVMPackage.VBR_TREE_VIEW__ICON:
			return getIcon();
		case VBRVMPackage.VBR_TREE_VIEW__MVBR_TREE_CONNECT_ELEMENT_VALUE:
			if (resolve)
				return getM_VBRTreeConnectElementValue();
			return basicGetM_VBRTreeConnectElementValue();
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
		case VBRVMPackage.VBR_TREE_VIEW__X:
			setX(((Integer) newValue).intValue());
			return;
		case VBRVMPackage.VBR_TREE_VIEW__Y:
			setY(((Integer) newValue).intValue());
			return;
		case VBRVMPackage.VBR_TREE_VIEW__WIDTH:
			setWidth(((Integer) newValue).intValue());
			return;
		case VBRVMPackage.VBR_TREE_VIEW__HEIGTH:
			setHeigth(((Integer) newValue).intValue());
			return;
		case VBRVMPackage.VBR_TREE_VIEW__MAIN_DIAGRAM:
			setMainDiagram((MainDiagram) newValue);
			return;
		case VBRVMPackage.VBR_TREE_VIEW__ICON:
			setIcon((String) newValue);
			return;
		case VBRVMPackage.VBR_TREE_VIEW__MVBR_TREE_CONNECT_ELEMENT_VALUE:
			setM_VBRTreeConnectElementValue((VBRTreeConnectElementValue) newValue);
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
		case VBRVMPackage.VBR_TREE_VIEW__X:
			setX(X_EDEFAULT);
			return;
		case VBRVMPackage.VBR_TREE_VIEW__Y:
			setY(Y_EDEFAULT);
			return;
		case VBRVMPackage.VBR_TREE_VIEW__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case VBRVMPackage.VBR_TREE_VIEW__HEIGTH:
			setHeigth(HEIGTH_EDEFAULT);
			return;
		case VBRVMPackage.VBR_TREE_VIEW__MAIN_DIAGRAM:
			setMainDiagram((MainDiagram) null);
			return;
		case VBRVMPackage.VBR_TREE_VIEW__ICON:
			setIcon(ICON_EDEFAULT);
			return;
		case VBRVMPackage.VBR_TREE_VIEW__MVBR_TREE_CONNECT_ELEMENT_VALUE:
			setM_VBRTreeConnectElementValue((VBRTreeConnectElementValue) null);
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
		case VBRVMPackage.VBR_TREE_VIEW__X:
			return x != X_EDEFAULT;
		case VBRVMPackage.VBR_TREE_VIEW__Y:
			return y != Y_EDEFAULT;
		case VBRVMPackage.VBR_TREE_VIEW__WIDTH:
			return width != WIDTH_EDEFAULT;
		case VBRVMPackage.VBR_TREE_VIEW__HEIGTH:
			return heigth != HEIGTH_EDEFAULT;
		case VBRVMPackage.VBR_TREE_VIEW__MAIN_DIAGRAM:
			return getMainDiagram() != null;
		case VBRVMPackage.VBR_TREE_VIEW__ICON:
			return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT
					.equals(icon);
		case VBRVMPackage.VBR_TREE_VIEW__MVBR_TREE_CONNECT_ELEMENT_VALUE:
			return m_VBRTreeConnectElementValue != null;
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
		result.append(" (icon: "); //$NON-NLS-1$
		result.append(icon);
		result.append(')');
		return result.toString();
	}

} //VBRTreeViewImpl
