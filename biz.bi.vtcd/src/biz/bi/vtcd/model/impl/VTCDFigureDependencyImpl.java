/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDFigureDependencyImpl.java,v 1.14 2005/08/26 15:43:09 smoreno Exp $
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

import biz.bi.cmcore.model.CMProxyDependency;
import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.vtcd.model.VTCDDiagramCombination;
import biz.bi.vtcd.model.VTCDDiagramMain;
import biz.bi.vtcd.model.VTCDFigureDependency;
import biz.bi.vtcd.model.VTCDLinkDependencyElement;
import biz.bi.vtcd.model.VTCDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Figure Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDFigureDependencyImpl#getM_VTCDDiagramMain <em>MVTCD Diagram Main</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDFigureDependencyImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDFigureDependencyImpl#getM_VTCDLinkDependencyElement <em>MVTCD Link Dependency Element</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDFigureDependencyImpl#getM_Dependency <em>MDependency</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDFigureDependencyImpl#getM_VTCDDiagramCombination <em>MVTCD Diagram Combination</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VTCDFigureDependencyImpl extends VTCDAbstractFigureImpl implements
		VTCDFigureDependency {
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
	 * The cached value of the '{@link #getM_VTCDLinkDependencyElement() <em>MVTCD Link Dependency Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_VTCDLinkDependencyElement()
	 * @generated
	 * @ordered
	 */
	protected EList m_VTCDLinkDependencyElement = null;

	/**
	 * The default value of the '{@link #getM_Dependency() <em>MDependency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_Dependency()
	 * @generated
	 * @ordered
	 */
	protected static final CMProxyDependency MDEPENDENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getM_Dependency() <em>MDependency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_Dependency()
	 * @generated NOT
	 * @author smoreno
	 * @ordered
	 */
	protected CMProxyDependency m_Dependency = DEPENDENCY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getM_VTCDDiagramCombination() <em>MVTCD Diagram Combination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_VTCDDiagramCombination()
	 * @generated
	 * @ordered
	 */
	protected VTCDDiagramCombination m_VTCDDiagramCombination = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTCDFigureDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return VTCDPackage.eINSTANCE.getVTCDFigureDependency();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTCDDiagramMain getM_VTCDDiagramMain() {
		if (eContainerFeatureID != VTCDPackage.VTCD_FIGURE_DEPENDENCY__MVTCD_DIAGRAM_MAIN)
			return null;
		return (VTCDDiagramMain) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_VTCDDiagramMain(VTCDDiagramMain newM_VTCDDiagramMain) {
		if (newM_VTCDDiagramMain != eContainer
				|| (eContainerFeatureID != VTCDPackage.VTCD_FIGURE_DEPENDENCY__MVTCD_DIAGRAM_MAIN && newM_VTCDDiagramMain != null)) {
			if (EcoreUtil.isAncestor(this, newM_VTCDDiagramMain))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newM_VTCDDiagramMain != null)
				msgs = ((InternalEObject) newM_VTCDDiagramMain).eInverseAdd(
						this,
						VTCDPackage.VTCD_DIAGRAM_MAIN__MVTCD_FIGURE_DEPENDENCY,
						VTCDDiagramMain.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newM_VTCDDiagramMain,
					VTCDPackage.VTCD_FIGURE_DEPENDENCY__MVTCD_DIAGRAM_MAIN,
					msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VTCDPackage.VTCD_FIGURE_DEPENDENCY__MVTCD_DIAGRAM_MAIN,
					newM_VTCDDiagramMain, newM_VTCDDiagramMain));
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
					VTCDPackage.VTCD_FIGURE_DEPENDENCY__ICON, oldIcon, icon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getM_VTCDLinkDependencyElement() {
		if (m_VTCDLinkDependencyElement == null) {
			m_VTCDLinkDependencyElement = new EObjectContainmentWithInverseEList(
					VTCDLinkDependencyElement.class,
					this,
					VTCDPackage.VTCD_FIGURE_DEPENDENCY__MVTCD_LINK_DEPENDENCY_ELEMENT,
					VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__SOURCE_DEPENDENCY);
		}
		return m_VTCDLinkDependencyElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMProxyDependency getM_Dependency() {
		return m_Dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_Dependency(CMProxyDependency newM_Dependency) {
		CMProxyDependency oldM_Dependency = m_Dependency;
		m_Dependency = newM_Dependency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VTCDPackage.VTCD_FIGURE_DEPENDENCY__MDEPENDENCY,
					oldM_Dependency, m_Dependency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTCDDiagramCombination getM_VTCDDiagramCombination() {
		return m_VTCDDiagramCombination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetM_VTCDDiagramCombination(
			VTCDDiagramCombination newM_VTCDDiagramCombination,
			NotificationChain msgs) {
		VTCDDiagramCombination oldM_VTCDDiagramCombination = m_VTCDDiagramCombination;
		m_VTCDDiagramCombination = newM_VTCDDiagramCombination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					VTCDPackage.VTCD_FIGURE_DEPENDENCY__MVTCD_DIAGRAM_COMBINATION,
					oldM_VTCDDiagramCombination, newM_VTCDDiagramCombination);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_VTCDDiagramCombination(
			VTCDDiagramCombination newM_VTCDDiagramCombination) {
		if (newM_VTCDDiagramCombination != m_VTCDDiagramCombination) {
			NotificationChain msgs = null;
			if (m_VTCDDiagramCombination != null)
				msgs = ((InternalEObject) m_VTCDDiagramCombination)
						.eInverseRemove(
								this,
								VTCDPackage.VTCD_DIAGRAM_COMBINATION__MFIGURE_DEPENDENCY,
								VTCDDiagramCombination.class, msgs);
			if (newM_VTCDDiagramCombination != null)
				msgs = ((InternalEObject) newM_VTCDDiagramCombination)
						.eInverseAdd(
								this,
								VTCDPackage.VTCD_DIAGRAM_COMBINATION__MFIGURE_DEPENDENCY,
								VTCDDiagramCombination.class, msgs);
			msgs = basicSetM_VTCDDiagramCombination(
					newM_VTCDDiagramCombination, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					VTCDPackage.VTCD_FIGURE_DEPENDENCY__MVTCD_DIAGRAM_COMBINATION,
					newM_VTCDDiagramCombination, newM_VTCDDiagramCombination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public EObject getProxyModel() {

		return this.getM_Dependency();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public void setProxyModel(EObject model) {
		if (model instanceof CMProxyDependency)
			this.setM_Dependency((CMProxyDependency) model);
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
			case VTCDPackage.VTCD_FIGURE_DEPENDENCY__MVTCD_DIAGRAM_MAIN:
				if (eContainer != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
						VTCDPackage.VTCD_FIGURE_DEPENDENCY__MVTCD_DIAGRAM_MAIN,
						msgs);
			case VTCDPackage.VTCD_FIGURE_DEPENDENCY__MVTCD_LINK_DEPENDENCY_ELEMENT:
				return ((InternalEList) getM_VTCDLinkDependencyElement())
						.basicAdd(otherEnd, msgs);
			case VTCDPackage.VTCD_FIGURE_DEPENDENCY__MVTCD_DIAGRAM_COMBINATION:
				if (m_VTCDDiagramCombination != null)
					msgs = ((InternalEObject) m_VTCDDiagramCombination)
							.eInverseRemove(
									this,
									EOPPOSITE_FEATURE_BASE
											- VTCDPackage.VTCD_FIGURE_DEPENDENCY__MVTCD_DIAGRAM_COMBINATION,
									null, msgs);
				return basicSetM_VTCDDiagramCombination(
						(VTCDDiagramCombination) otherEnd, msgs);
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
			case VTCDPackage.VTCD_FIGURE_DEPENDENCY__MVTCD_DIAGRAM_MAIN:
				return eBasicSetContainer(null,
						VTCDPackage.VTCD_FIGURE_DEPENDENCY__MVTCD_DIAGRAM_MAIN,
						msgs);
			case VTCDPackage.VTCD_FIGURE_DEPENDENCY__MVTCD_LINK_DEPENDENCY_ELEMENT:
				return ((InternalEList) getM_VTCDLinkDependencyElement())
						.basicRemove(otherEnd, msgs);
			case VTCDPackage.VTCD_FIGURE_DEPENDENCY__MVTCD_DIAGRAM_COMBINATION:
				return basicSetM_VTCDDiagramCombination(null, msgs);
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
			case VTCDPackage.VTCD_FIGURE_DEPENDENCY__MVTCD_DIAGRAM_MAIN:
				return eContainer.eInverseRemove(this,
						VTCDPackage.VTCD_DIAGRAM_MAIN__MVTCD_FIGURE_DEPENDENCY,
						VTCDDiagramMain.class, msgs);
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
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__HEIGHT:
			return new Integer(getHeight());
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__WIDTH:
			return new Integer(getWidth());
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__X:
			return new Integer(getX());
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__Y:
			return new Integer(getY());
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__MVTCD_DIAGRAM_MAIN:
			return getM_VTCDDiagramMain();
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__ICON:
			return getIcon();
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__MVTCD_LINK_DEPENDENCY_ELEMENT:
			return getM_VTCDLinkDependencyElement();
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__MDEPENDENCY:
			return getM_Dependency();
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__MVTCD_DIAGRAM_COMBINATION:
			return getM_VTCDDiagramCombination();
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
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__HEIGHT:
			setHeight(((Integer) newValue).intValue());
			return;
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__WIDTH:
			setWidth(((Integer) newValue).intValue());
			return;
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__X:
			setX(((Integer) newValue).intValue());
			return;
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__Y:
			setY(((Integer) newValue).intValue());
			return;
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__MVTCD_DIAGRAM_MAIN:
			setM_VTCDDiagramMain((VTCDDiagramMain) newValue);
			return;
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__ICON:
			setIcon((String) newValue);
			return;
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__MVTCD_LINK_DEPENDENCY_ELEMENT:
			getM_VTCDLinkDependencyElement().clear();
			getM_VTCDLinkDependencyElement().addAll((Collection) newValue);
			return;
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__MDEPENDENCY:
			setM_Dependency((CMProxyDependency) newValue);
			return;
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__MVTCD_DIAGRAM_COMBINATION:
			setM_VTCDDiagramCombination((VTCDDiagramCombination) newValue);
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
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__HEIGHT:
			setHeight(HEIGHT_EDEFAULT);
			return;
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__X:
			setX(X_EDEFAULT);
			return;
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__Y:
			setY(Y_EDEFAULT);
			return;
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__MVTCD_DIAGRAM_MAIN:
			setM_VTCDDiagramMain((VTCDDiagramMain) null);
			return;
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__ICON:
			setIcon(ICON_EDEFAULT);
			return;
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__MVTCD_LINK_DEPENDENCY_ELEMENT:
			getM_VTCDLinkDependencyElement().clear();
			return;
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__MDEPENDENCY:
			setM_Dependency(MDEPENDENCY_EDEFAULT);
			return;
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__MVTCD_DIAGRAM_COMBINATION:
			setM_VTCDDiagramCombination((VTCDDiagramCombination) null);
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
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__HEIGHT:
			return height != HEIGHT_EDEFAULT;
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__WIDTH:
			return width != WIDTH_EDEFAULT;
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__X:
			return x != X_EDEFAULT;
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__Y:
			return y != Y_EDEFAULT;
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__MVTCD_DIAGRAM_MAIN:
			return getM_VTCDDiagramMain() != null;
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__ICON:
			return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT
					.equals(icon);
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__MVTCD_LINK_DEPENDENCY_ELEMENT:
			return m_VTCDLinkDependencyElement != null
					&& !m_VTCDLinkDependencyElement.isEmpty();
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__MDEPENDENCY:
			return MDEPENDENCY_EDEFAULT == null ? m_Dependency != null
					: !MDEPENDENCY_EDEFAULT.equals(m_Dependency);
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY__MVTCD_DIAGRAM_COMBINATION:
			return m_VTCDDiagramCombination != null;
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
		result.append(", m_Dependency: "); //$NON-NLS-1$
		result.append(m_Dependency);
		result.append(')');
		return result.toString();
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.model.VTCDFigureDependency#getM_VTCDLinkDependencyElement(biz.bi.cmcore.model.CMProxyElement)
	 */
	public VTCDLinkDependencyElement getM_VTCDLinkDependencyElement(
			CMProxyElement p_Element) {
		for (Iterator iter = this.getM_VTCDLinkDependencyElement().iterator(); iter
				.hasNext();) {
			VTCDLinkDependencyElement l_VTCDLinkDependencyElement = (VTCDLinkDependencyElement) iter
					.next();
			if (p_Element.equals((l_VTCDLinkDependencyElement).getDestElement()
					.getM_Element()))
				return l_VTCDLinkDependencyElement;
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.model.impl.VTCDAbstractFigureImpl#getLinks()
	 */
	public EList getLinks() {
		
		return this.getM_VTCDLinkDependencyElement();
	}

} //VTCDFigureDependencyImpl
