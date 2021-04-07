/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDDiagramCombinationImpl.java,v 1.18 2005/08/26 15:43:09 smoreno Exp $
 */
package biz.bi.vtcd.model.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import biz.bi.cmcore.model.CMProxyCombination;
import biz.bi.cmcore.model.CMProxyDependency;
import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.cmcore.model.CMProxyTestObject;
import biz.bi.vtcd.model.VTCDDiagramCombination;
import biz.bi.vtcd.model.VTCDFigureCombination;
import biz.bi.vtcd.model.VTCDFigureDependency;
import biz.bi.vtcd.model.VTCDFigureElement;
import biz.bi.vtcd.model.VTCDFigureEquivalenceClass;
import biz.bi.vtcd.model.VTCDNote;
import biz.bi.vtcd.model.VTCDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Combination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDDiagramCombinationImpl#getM_VTCDNote <em>MVTCD Note</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDDiagramCombinationImpl#getM_VTCDFigureCombination <em>MVTCD Figure Combination</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDDiagramCombinationImpl#getM_VTCDFigureElement <em>MVTCD Figure Element</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDDiagramCombinationImpl#getM_FigureDependency <em>MFigure Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VTCDDiagramCombinationImpl extends EObjectImpl implements
		VTCDDiagramCombination {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getM_VTCDNote() <em>MVTCD Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_VTCDNote()
	 * @generated
	 * @ordered
	 */
	protected EList m_VTCDNote = null;

	/**
	 * The cached value of the '{@link #getM_VTCDFigureCombination() <em>MVTCD Figure Combination</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_VTCDFigureCombination()
	 * @generated
	 * @ordered
	 */
	protected EList m_VTCDFigureCombination = null;

	/**
	 * The cached value of the '{@link #getM_VTCDFigureElement() <em>MVTCD Figure Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_VTCDFigureElement()
	 * @generated
	 * @ordered
	 */
	protected EList m_VTCDFigureElement = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTCDDiagramCombinationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return VTCDPackage.eINSTANCE.getVTCDDiagramCombination();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getM_VTCDNote() {
		if (m_VTCDNote == null) {
			m_VTCDNote = new EObjectContainmentWithInverseEList(VTCDNote.class,
					this, VTCDPackage.VTCD_DIAGRAM_COMBINATION__MVTCD_NOTE,
					VTCDPackage.VTCD_NOTE__MVTCD_DIAGRAM);
		}
		return m_VTCDNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getM_VTCDFigureCombination() {
		if (m_VTCDFigureCombination == null) {
			m_VTCDFigureCombination = new EObjectContainmentWithInverseEList(
					VTCDFigureCombination.class,
					this,
					VTCDPackage.VTCD_DIAGRAM_COMBINATION__MVTCD_FIGURE_COMBINATION,
					VTCDPackage.VTCD_FIGURE_COMBINATION__MVTCD_DIAGRAM_COMBINATION);
		}
		return m_VTCDFigureCombination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getM_VTCDFigureElement() {
		if (m_VTCDFigureElement == null) {
			m_VTCDFigureElement = new EObjectContainmentWithInverseEList(
					VTCDFigureElement.class, this,
					VTCDPackage.VTCD_DIAGRAM_COMBINATION__MVTCD_FIGURE_ELEMENT,
					VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_DIAGRAM_COMBINATION);
		}
		return m_VTCDFigureElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTCDFigureDependency getM_FigureDependency() {
		if (eContainerFeatureID != VTCDPackage.VTCD_DIAGRAM_COMBINATION__MFIGURE_DEPENDENCY)
			return null;
		return (VTCDFigureDependency) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_FigureDependency(VTCDFigureDependency newM_FigureDependency) {
		if (newM_FigureDependency != eContainer
				|| (eContainerFeatureID != VTCDPackage.VTCD_DIAGRAM_COMBINATION__MFIGURE_DEPENDENCY && newM_FigureDependency != null)) {
			if (EcoreUtil.isAncestor(this, newM_FigureDependency))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newM_FigureDependency != null)
				msgs = ((InternalEObject) newM_FigureDependency)
						.eInverseAdd(
								this,
								VTCDPackage.VTCD_FIGURE_DEPENDENCY__MVTCD_DIAGRAM_COMBINATION,
								VTCDFigureDependency.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newM_FigureDependency,
					VTCDPackage.VTCD_DIAGRAM_COMBINATION__MFIGURE_DEPENDENCY,
					msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VTCDPackage.VTCD_DIAGRAM_COMBINATION__MFIGURE_DEPENDENCY,
					newM_FigureDependency, newM_FigureDependency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author Sergio M
	 */
	public EList getChildren() {
		EList list = new BasicEList();
		list.addAll(getM_VTCDFigureElement());
		list.addAll(getM_VTCDFigureCombination());
		//list.addAll(getM_VTCDNote());
		//list.addAll(getM_VTCDDiagramCombination());
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public EObject getProxyModel() {
		return this.getM_FigureDependency().getM_Dependency();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public void setProxyModel(EObject model) {
		if (model instanceof CMProxyDependency)
			this.getM_FigureDependency().setM_Dependency(
					(CMProxyDependency) model);
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
			case VTCDPackage.VTCD_DIAGRAM_COMBINATION__MVTCD_NOTE:
				return ((InternalEList) getM_VTCDNote()).basicAdd(otherEnd,
						msgs);
			case VTCDPackage.VTCD_DIAGRAM_COMBINATION__MVTCD_FIGURE_COMBINATION:
				return ((InternalEList) getM_VTCDFigureCombination()).basicAdd(
						otherEnd, msgs);
			case VTCDPackage.VTCD_DIAGRAM_COMBINATION__MVTCD_FIGURE_ELEMENT:
				return ((InternalEList) getM_VTCDFigureElement()).basicAdd(
						otherEnd, msgs);
			case VTCDPackage.VTCD_DIAGRAM_COMBINATION__MFIGURE_DEPENDENCY:
				if (eContainer != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(
						otherEnd,
						VTCDPackage.VTCD_DIAGRAM_COMBINATION__MFIGURE_DEPENDENCY,
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
			case VTCDPackage.VTCD_DIAGRAM_COMBINATION__MVTCD_NOTE:
				return ((InternalEList) getM_VTCDNote()).basicRemove(otherEnd,
						msgs);
			case VTCDPackage.VTCD_DIAGRAM_COMBINATION__MVTCD_FIGURE_COMBINATION:
				return ((InternalEList) getM_VTCDFigureCombination())
						.basicRemove(otherEnd, msgs);
			case VTCDPackage.VTCD_DIAGRAM_COMBINATION__MVTCD_FIGURE_ELEMENT:
				return ((InternalEList) getM_VTCDFigureElement()).basicRemove(
						otherEnd, msgs);
			case VTCDPackage.VTCD_DIAGRAM_COMBINATION__MFIGURE_DEPENDENCY:
				return eBasicSetContainer(
						null,
						VTCDPackage.VTCD_DIAGRAM_COMBINATION__MFIGURE_DEPENDENCY,
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
			case VTCDPackage.VTCD_DIAGRAM_COMBINATION__MFIGURE_DEPENDENCY:
				return eContainer
						.eInverseRemove(
								this,
								VTCDPackage.VTCD_FIGURE_DEPENDENCY__MVTCD_DIAGRAM_COMBINATION,
								VTCDFigureDependency.class, msgs);
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
		case VTCDPackage.VTCD_DIAGRAM_COMBINATION__MVTCD_NOTE:
			return getM_VTCDNote();
		case VTCDPackage.VTCD_DIAGRAM_COMBINATION__MVTCD_FIGURE_COMBINATION:
			return getM_VTCDFigureCombination();
		case VTCDPackage.VTCD_DIAGRAM_COMBINATION__MVTCD_FIGURE_ELEMENT:
			return getM_VTCDFigureElement();
		case VTCDPackage.VTCD_DIAGRAM_COMBINATION__MFIGURE_DEPENDENCY:
			return getM_FigureDependency();
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
		case VTCDPackage.VTCD_DIAGRAM_COMBINATION__MVTCD_NOTE:
			getM_VTCDNote().clear();
			getM_VTCDNote().addAll((Collection) newValue);
			return;
		case VTCDPackage.VTCD_DIAGRAM_COMBINATION__MVTCD_FIGURE_COMBINATION:
			getM_VTCDFigureCombination().clear();
			getM_VTCDFigureCombination().addAll((Collection) newValue);
			return;
		case VTCDPackage.VTCD_DIAGRAM_COMBINATION__MVTCD_FIGURE_ELEMENT:
			getM_VTCDFigureElement().clear();
			getM_VTCDFigureElement().addAll((Collection) newValue);
			return;
		case VTCDPackage.VTCD_DIAGRAM_COMBINATION__MFIGURE_DEPENDENCY:
			setM_FigureDependency((VTCDFigureDependency) newValue);
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
		case VTCDPackage.VTCD_DIAGRAM_COMBINATION__MVTCD_NOTE:
			getM_VTCDNote().clear();
			return;
		case VTCDPackage.VTCD_DIAGRAM_COMBINATION__MVTCD_FIGURE_COMBINATION:
			getM_VTCDFigureCombination().clear();
			return;
		case VTCDPackage.VTCD_DIAGRAM_COMBINATION__MVTCD_FIGURE_ELEMENT:
			getM_VTCDFigureElement().clear();
			return;
		case VTCDPackage.VTCD_DIAGRAM_COMBINATION__MFIGURE_DEPENDENCY:
			setM_FigureDependency((VTCDFigureDependency) null);
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
		case VTCDPackage.VTCD_DIAGRAM_COMBINATION__MVTCD_NOTE:
			return m_VTCDNote != null && !m_VTCDNote.isEmpty();
		case VTCDPackage.VTCD_DIAGRAM_COMBINATION__MVTCD_FIGURE_COMBINATION:
			return m_VTCDFigureCombination != null
					&& !m_VTCDFigureCombination.isEmpty();
		case VTCDPackage.VTCD_DIAGRAM_COMBINATION__MVTCD_FIGURE_ELEMENT:
			return m_VTCDFigureElement != null
					&& !m_VTCDFigureElement.isEmpty();
		case VTCDPackage.VTCD_DIAGRAM_COMBINATION__MFIGURE_DEPENDENCY:
			return getM_FigureDependency() != null;
		}
		return eDynamicIsSet(eFeature);
	}

	public VTCDFigureElement getM_VTCDFigureElement(CMProxyElement p_Element) {
		for (Iterator iter = this.getM_VTCDFigureElement().iterator(); iter
				.hasNext();) {
			VTCDFigureElement l_VTCDFigureElement = (VTCDFigureElement) iter
					.next();
			if (p_Element.equals((l_VTCDFigureElement).getM_Element()))
				return l_VTCDFigureElement;
		}
		return null;
	}

	public VTCDFigureCombination getM_VTCDFigureCombination(
			CMProxyCombination p_Combination) {
		for (Iterator iter = this.getM_VTCDFigureCombination().iterator(); iter
				.hasNext();) {
			VTCDFigureCombination l_VTCDFigureCombination = (VTCDFigureCombination) iter
					.next();
			if (p_Combination.equals((l_VTCDFigureCombination)
					.getM_Combination()))
				return l_VTCDFigureCombination;
		}
		return null;
	}

	public VTCDFigureEquivalenceClass getM_VTCDFigureEquivalenceClass(
			CMProxyEquivalenceClass p_EquivalenceClass) {
		for (Iterator i = this.getM_VTCDFigureElement().iterator(); i.hasNext();) {
			VTCDFigureElement l_FigureElement = (VTCDFigureElement) i.next();
			VTCDFigureEquivalenceClass l_FigureEquivalenceClass = l_FigureElement
					.getM_VTCDFigureEquivalenceClass(p_EquivalenceClass);
			if (l_FigureEquivalenceClass != null)
				return l_FigureEquivalenceClass;
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.model.VTCDDiagram#getM_TestObject()
	 */
	public CMProxyTestObject getM_TestObject() {

		return this.getM_FigureDependency().getM_Dependency()
				.getProxyTestObject();
	}

} //VTCDDiagramCombinationImpl
