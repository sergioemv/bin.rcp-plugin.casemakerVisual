/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDFigureElementImpl.java,v 1.18 2005/08/26 15:43:09 smoreno Exp $
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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.vtcd.model.VTCDDiagramCombination;
import biz.bi.vtcd.model.VTCDDiagramMain;
import biz.bi.vtcd.model.VTCDFigureElement;
import biz.bi.vtcd.model.VTCDFigureEquivalenceClass;
import biz.bi.vtcd.model.VTCDLinkDependencyElement;
import biz.bi.vtcd.model.VTCDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Figure Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDFigureElementImpl#getM_VTCDDiagramCombination <em>MVTCD Diagram Combination</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDFigureElementImpl#getM_VTCDDiagramMain <em>MVTCD Diagram Main</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDFigureElementImpl#getM_VTCDFigureEquivalenceClass <em>MVTCD Figure Equivalence Class</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDFigureElementImpl#getM_VTCDLinkDependencyElement <em>MVTCD Link Dependency Element</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDFigureElementImpl#getM_Element <em>MElement</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDFigureElementImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDFigureElementImpl#isFolded <em>Folded</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VTCDFigureElementImpl extends VTCDAbstractFigureImpl implements
		VTCDFigureElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getM_VTCDFigureEquivalenceClass() <em>MVTCD Figure Equivalence Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_VTCDFigureEquivalenceClass()
	 * @generated
	 * @ordered
	 */
	protected EList m_VTCDFigureEquivalenceClass = null;

	/**
	 * The cached value of the '{@link #getM_VTCDLinkDependencyElement() <em>MVTCD Link Dependency Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_VTCDLinkDependencyElement()
	 * @generated
	 * @ordered
	 */
	protected EList m_VTCDLinkDependencyElement = null;

	/**
	 * The default value of the '{@link #getM_Element() <em>MElement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_Element()
	 * @generated
	 * @ordered
	 */
	protected static final CMProxyElement MELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getM_Element() <em>MElement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_Element()
	 * @generated NOT
	 * @author smoreno
	 * @ordered
	 */
	protected CMProxyElement m_Element = ELEMENT_EDEFAULT;

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
	 * The default value of the '{@link #isFolded() <em>Folded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFolded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FOLDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFolded() <em>Folded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFolded()
	 * @generated
	 * @ordered
	 */
	protected boolean folded = FOLDED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTCDFigureElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return VTCDPackage.eINSTANCE.getVTCDFigureElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTCDDiagramCombination getM_VTCDDiagramCombination() {
		if (eContainerFeatureID != VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_DIAGRAM_COMBINATION)
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
				|| (eContainerFeatureID != VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_DIAGRAM_COMBINATION && newM_VTCDDiagramCombination != null)) {
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
								VTCDPackage.VTCD_DIAGRAM_COMBINATION__MVTCD_FIGURE_ELEMENT,
								VTCDDiagramCombination.class, msgs);
			msgs = eBasicSetContainer(
					(InternalEObject) newM_VTCDDiagramCombination,
					VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_DIAGRAM_COMBINATION,
					msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_DIAGRAM_COMBINATION,
					newM_VTCDDiagramCombination, newM_VTCDDiagramCombination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTCDDiagramMain getM_VTCDDiagramMain() {
		if (eContainerFeatureID != VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_DIAGRAM_MAIN)
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
				|| (eContainerFeatureID != VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_DIAGRAM_MAIN && newM_VTCDDiagramMain != null)) {
			if (EcoreUtil.isAncestor(this, newM_VTCDDiagramMain))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newM_VTCDDiagramMain != null)
				msgs = ((InternalEObject) newM_VTCDDiagramMain).eInverseAdd(
						this,
						VTCDPackage.VTCD_DIAGRAM_MAIN__MVTCD_FIGURE_ELEMENT,
						VTCDDiagramMain.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newM_VTCDDiagramMain,
					VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_DIAGRAM_MAIN, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_DIAGRAM_MAIN,
					newM_VTCDDiagramMain, newM_VTCDDiagramMain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getM_VTCDFigureEquivalenceClass() {
		if (m_VTCDFigureEquivalenceClass == null) {
			m_VTCDFigureEquivalenceClass = new EObjectContainmentWithInverseEList(
					VTCDFigureEquivalenceClass.class,
					this,
					VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_FIGURE_EQUIVALENCE_CLASS,
					VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__MVTCD_FIGURE_ELEMENT);
		}
		return m_VTCDFigureEquivalenceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getM_VTCDLinkDependencyElement() {
		if (m_VTCDLinkDependencyElement == null) {
			m_VTCDLinkDependencyElement = new EObjectWithInverseResolvingEList(
					VTCDLinkDependencyElement.class,
					this,
					VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_LINK_DEPENDENCY_ELEMENT,
					VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__DEST_ELEMENT);
		}
		return m_VTCDLinkDependencyElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMProxyElement getM_Element() {
		return m_Element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_Element(CMProxyElement newM_Element) {
		CMProxyElement oldM_Element = m_Element;
		m_Element = newM_Element;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VTCDPackage.VTCD_FIGURE_ELEMENT__MELEMENT, oldM_Element,
					m_Element));
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
					VTCDPackage.VTCD_FIGURE_ELEMENT__ICON, oldIcon, icon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFolded() {
		return folded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFolded(boolean newFolded) {
		boolean oldFolded = folded;
		folded = newFolded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VTCDPackage.VTCD_FIGURE_ELEMENT__FOLDED, oldFolded, folded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public EObject getProxyModel() {

		return this.getM_Element();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public void setProxyModel(EObject model) {

		if (model instanceof CMProxyElement)
			this.setM_Element((CMProxyElement) model);
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
			case VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_DIAGRAM_COMBINATION:
				if (eContainer != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(
						otherEnd,
						VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_DIAGRAM_COMBINATION,
						msgs);
			case VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_DIAGRAM_MAIN:
				if (eContainer != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
						VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_DIAGRAM_MAIN,
						msgs);
			case VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_FIGURE_EQUIVALENCE_CLASS:
				return ((InternalEList) getM_VTCDFigureEquivalenceClass())
						.basicAdd(otherEnd, msgs);
			case VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_LINK_DEPENDENCY_ELEMENT:
				return ((InternalEList) getM_VTCDLinkDependencyElement())
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
			case VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_DIAGRAM_COMBINATION:
				return eBasicSetContainer(
						null,
						VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_DIAGRAM_COMBINATION,
						msgs);
			case VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_DIAGRAM_MAIN:
				return eBasicSetContainer(null,
						VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_DIAGRAM_MAIN,
						msgs);
			case VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_FIGURE_EQUIVALENCE_CLASS:
				return ((InternalEList) getM_VTCDFigureEquivalenceClass())
						.basicRemove(otherEnd, msgs);
			case VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_LINK_DEPENDENCY_ELEMENT:
				return ((InternalEList) getM_VTCDLinkDependencyElement())
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
			case VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_DIAGRAM_COMBINATION:
				return eContainer
						.eInverseRemove(
								this,
								VTCDPackage.VTCD_DIAGRAM_COMBINATION__MVTCD_FIGURE_ELEMENT,
								VTCDDiagramCombination.class, msgs);
			case VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_DIAGRAM_MAIN:
				return eContainer.eInverseRemove(this,
						VTCDPackage.VTCD_DIAGRAM_MAIN__MVTCD_FIGURE_ELEMENT,
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
		case VTCDPackage.VTCD_FIGURE_ELEMENT__HEIGHT:
			return new Integer(getHeight());
		case VTCDPackage.VTCD_FIGURE_ELEMENT__WIDTH:
			return new Integer(getWidth());
		case VTCDPackage.VTCD_FIGURE_ELEMENT__X:
			return new Integer(getX());
		case VTCDPackage.VTCD_FIGURE_ELEMENT__Y:
			return new Integer(getY());
		case VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_DIAGRAM_COMBINATION:
			return getM_VTCDDiagramCombination();
		case VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_DIAGRAM_MAIN:
			return getM_VTCDDiagramMain();
		case VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_FIGURE_EQUIVALENCE_CLASS:
			return getM_VTCDFigureEquivalenceClass();
		case VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_LINK_DEPENDENCY_ELEMENT:
			return getM_VTCDLinkDependencyElement();
		case VTCDPackage.VTCD_FIGURE_ELEMENT__MELEMENT:
			return getM_Element();
		case VTCDPackage.VTCD_FIGURE_ELEMENT__ICON:
			return getIcon();
		case VTCDPackage.VTCD_FIGURE_ELEMENT__FOLDED:
			return isFolded() ? Boolean.TRUE : Boolean.FALSE;
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
		case VTCDPackage.VTCD_FIGURE_ELEMENT__HEIGHT:
			setHeight(((Integer) newValue).intValue());
			return;
		case VTCDPackage.VTCD_FIGURE_ELEMENT__WIDTH:
			setWidth(((Integer) newValue).intValue());
			return;
		case VTCDPackage.VTCD_FIGURE_ELEMENT__X:
			setX(((Integer) newValue).intValue());
			return;
		case VTCDPackage.VTCD_FIGURE_ELEMENT__Y:
			setY(((Integer) newValue).intValue());
			return;
		case VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_DIAGRAM_COMBINATION:
			setM_VTCDDiagramCombination((VTCDDiagramCombination) newValue);
			return;
		case VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_DIAGRAM_MAIN:
			setM_VTCDDiagramMain((VTCDDiagramMain) newValue);
			return;
		case VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_FIGURE_EQUIVALENCE_CLASS:
			getM_VTCDFigureEquivalenceClass().clear();
			getM_VTCDFigureEquivalenceClass().addAll((Collection) newValue);
			return;
		case VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_LINK_DEPENDENCY_ELEMENT:
			getM_VTCDLinkDependencyElement().clear();
			getM_VTCDLinkDependencyElement().addAll((Collection) newValue);
			return;
		case VTCDPackage.VTCD_FIGURE_ELEMENT__MELEMENT:
			setM_Element((CMProxyElement) newValue);
			return;
		case VTCDPackage.VTCD_FIGURE_ELEMENT__ICON:
			setIcon((String) newValue);
			return;
		case VTCDPackage.VTCD_FIGURE_ELEMENT__FOLDED:
			setFolded(((Boolean) newValue).booleanValue());
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
		case VTCDPackage.VTCD_FIGURE_ELEMENT__HEIGHT:
			setHeight(HEIGHT_EDEFAULT);
			return;
		case VTCDPackage.VTCD_FIGURE_ELEMENT__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case VTCDPackage.VTCD_FIGURE_ELEMENT__X:
			setX(X_EDEFAULT);
			return;
		case VTCDPackage.VTCD_FIGURE_ELEMENT__Y:
			setY(Y_EDEFAULT);
			return;
		case VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_DIAGRAM_COMBINATION:
			setM_VTCDDiagramCombination((VTCDDiagramCombination) null);
			return;
		case VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_DIAGRAM_MAIN:
			setM_VTCDDiagramMain((VTCDDiagramMain) null);
			return;
		case VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_FIGURE_EQUIVALENCE_CLASS:
			getM_VTCDFigureEquivalenceClass().clear();
			return;
		case VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_LINK_DEPENDENCY_ELEMENT:
			getM_VTCDLinkDependencyElement().clear();
			return;
		case VTCDPackage.VTCD_FIGURE_ELEMENT__MELEMENT:
			setM_Element(MELEMENT_EDEFAULT);
			return;
		case VTCDPackage.VTCD_FIGURE_ELEMENT__ICON:
			setIcon(ICON_EDEFAULT);
			return;
		case VTCDPackage.VTCD_FIGURE_ELEMENT__FOLDED:
			setFolded(FOLDED_EDEFAULT);
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
		case VTCDPackage.VTCD_FIGURE_ELEMENT__HEIGHT:
			return height != HEIGHT_EDEFAULT;
		case VTCDPackage.VTCD_FIGURE_ELEMENT__WIDTH:
			return width != WIDTH_EDEFAULT;
		case VTCDPackage.VTCD_FIGURE_ELEMENT__X:
			return x != X_EDEFAULT;
		case VTCDPackage.VTCD_FIGURE_ELEMENT__Y:
			return y != Y_EDEFAULT;
		case VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_DIAGRAM_COMBINATION:
			return getM_VTCDDiagramCombination() != null;
		case VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_DIAGRAM_MAIN:
			return getM_VTCDDiagramMain() != null;
		case VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_FIGURE_EQUIVALENCE_CLASS:
			return m_VTCDFigureEquivalenceClass != null
					&& !m_VTCDFigureEquivalenceClass.isEmpty();
		case VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_LINK_DEPENDENCY_ELEMENT:
			return m_VTCDLinkDependencyElement != null
					&& !m_VTCDLinkDependencyElement.isEmpty();
		case VTCDPackage.VTCD_FIGURE_ELEMENT__MELEMENT:
			return MELEMENT_EDEFAULT == null ? m_Element != null
					: !MELEMENT_EDEFAULT.equals(m_Element);
		case VTCDPackage.VTCD_FIGURE_ELEMENT__ICON:
			return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT
					.equals(icon);
		case VTCDPackage.VTCD_FIGURE_ELEMENT__FOLDED:
			return folded != FOLDED_EDEFAULT;
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
		result.append(" (m_Element: "); //$NON-NLS-1$
		result.append(m_Element);
		result.append(", icon: "); //$NON-NLS-1$
		result.append(icon);
		result.append(", folded: "); //$NON-NLS-1$
		result.append(folded);
		result.append(')');
		return result.toString();
	}

	public VTCDFigureEquivalenceClass getM_VTCDFigureEquivalenceClass(
			CMProxyEquivalenceClass p_EquivalenceClass) {
		for (Iterator iter = this.getM_VTCDFigureEquivalenceClass().iterator(); iter
				.hasNext();) {
			VTCDFigureEquivalenceClass l_VTCDFigureEquivalenceClass = (VTCDFigureEquivalenceClass) iter
					.next();
			if (p_EquivalenceClass.equals((l_VTCDFigureEquivalenceClass)
					.getM_EquivalenceClass()))
				return l_VTCDFigureEquivalenceClass;
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.model.impl.VTCDAbstractFigureImpl#getLinks()
	 */
	public EList getLinks() {
		
		return this.getM_VTCDLinkDependencyElement();
	}

} //VTCDFigureElementImpl
