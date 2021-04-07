/**
 * <copyright>
 * Sergio Moreno
 * </copyright>
 *
 * $Id: VTCDDiagramMainImpl.java,v 1.15 2005/08/26 15:43:09 smoreno Exp $
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
import org.eclipse.emf.ecore.util.InternalEList;

import biz.bi.cmcore.model.CMProxyDependency;
import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyTestObject;
import biz.bi.vtcd.model.VTCDDiagramCombination;
import biz.bi.vtcd.model.VTCDDiagramMain;
import biz.bi.vtcd.model.VTCDFigureDependency;
import biz.bi.vtcd.model.VTCDFigureElement;
import biz.bi.vtcd.model.VTCDNote;
import biz.bi.vtcd.model.VTCDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Main</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDDiagramMainImpl#getM_VTCDNote <em>MVTCD Note</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDDiagramMainImpl#getM_VTCDFigureElement <em>MVTCD Figure Element</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDDiagramMainImpl#getM_VTCDFigureDependency <em>MVTCD Figure Dependency</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDDiagramMainImpl#getM_TestObject <em>MTest Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VTCDDiagramMainImpl extends EObjectImpl implements VTCDDiagramMain {
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
	 * The cached value of the '{@link #getM_VTCDFigureElement() <em>MVTCD Figure Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_VTCDFigureElement()
	 * @generated
	 * @ordered
	 */
	protected EList m_VTCDFigureElement = null;

	/**
	 * The cached value of the '{@link #getM_VTCDFigureDependency() <em>MVTCD Figure Dependency</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_VTCDFigureDependency()
	 * @generated
	 * @ordered
	 */
	protected EList m_VTCDFigureDependency = null;

	/**
	 * The default value of the '{@link #getM_TestObject() <em>MTest Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_TestObject()
	 * @generated
	 * @ordered
	 */
	protected static final CMProxyTestObject MTEST_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getM_TestObject() <em>MTest Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_TestObject()
	 * @generated NOT
	 * @author smoreno
	 * @ordered
	 */
	protected CMProxyTestObject m_TestObject = TESTOBJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTCDDiagramMainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return VTCDPackage.eINSTANCE.getVTCDDiagramMain();
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
					VTCDPackage.VTCD_DIAGRAM_MAIN__MVTCD_FIGURE_ELEMENT,
					VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_DIAGRAM_MAIN);
		}
		return m_VTCDFigureElement;
	}

	protected VTCDFigureElement getVTCDFigureElement(
			CMProxyElement p_ProxyElement) {
		for (Iterator iter = this.getM_VTCDFigureElement().iterator(); iter
				.hasNext();) {
			VTCDFigureElement l_FigureElement = (VTCDFigureElement) iter.next();
			if (p_ProxyElement.equals((l_FigureElement).getM_Element()))
				return l_FigureElement;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getM_VTCDFigureDependency() {
		if (m_VTCDFigureDependency == null) {
			m_VTCDFigureDependency = new EObjectContainmentWithInverseEList(
					VTCDFigureDependency.class, this,
					VTCDPackage.VTCD_DIAGRAM_MAIN__MVTCD_FIGURE_DEPENDENCY,
					VTCDPackage.VTCD_FIGURE_DEPENDENCY__MVTCD_DIAGRAM_MAIN);
		}
		return m_VTCDFigureDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMProxyTestObject getM_TestObject() {
		return m_TestObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_TestObjectGen(CMProxyTestObject newM_TestObject) {
		CMProxyTestObject oldM_TestObject = m_TestObject;
		m_TestObject = newM_TestObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VTCDPackage.VTCD_DIAGRAM_MAIN__MTEST_OBJECT,
					oldM_TestObject, m_TestObject));
	}

	public void setM_TestObject(CMProxyTestObject newM_TestObject) {

		//call the original set
		setM_TestObjectGen(newM_TestObject);
		//check the model's elements for creation of new ones
		//checkFigureElements();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getM_VTCDNote() {
		if (m_VTCDNote == null) {
			m_VTCDNote = new EObjectContainmentWithInverseEList(VTCDNote.class,
					this, VTCDPackage.VTCD_DIAGRAM_MAIN__MVTCD_NOTE,
					VTCDPackage.VTCD_NOTE__MVTCD_DIAGRAM);
		}
		return m_VTCDNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * gets all the children in one big list
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public EList getChildren() {
		EList list = new BasicEList();
		list.addAll(getM_VTCDFigureElement());
		list.addAll(getM_VTCDFigureDependency());
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
		return this.getM_TestObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public void setProxyModel(EObject model) {
		if (model instanceof CMProxyTestObject)
			this.setM_TestObject((CMProxyTestObject) model);
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
			case VTCDPackage.VTCD_DIAGRAM_MAIN__MVTCD_NOTE:
				return ((InternalEList) getM_VTCDNote()).basicAdd(otherEnd,
						msgs);
			case VTCDPackage.VTCD_DIAGRAM_MAIN__MVTCD_FIGURE_ELEMENT:
				return ((InternalEList) getM_VTCDFigureElement()).basicAdd(
						otherEnd, msgs);
			case VTCDPackage.VTCD_DIAGRAM_MAIN__MVTCD_FIGURE_DEPENDENCY:
				return ((InternalEList) getM_VTCDFigureDependency()).basicAdd(
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
			case VTCDPackage.VTCD_DIAGRAM_MAIN__MVTCD_NOTE:
				return ((InternalEList) getM_VTCDNote()).basicRemove(otherEnd,
						msgs);
			case VTCDPackage.VTCD_DIAGRAM_MAIN__MVTCD_FIGURE_ELEMENT:
				return ((InternalEList) getM_VTCDFigureElement()).basicRemove(
						otherEnd, msgs);
			case VTCDPackage.VTCD_DIAGRAM_MAIN__MVTCD_FIGURE_DEPENDENCY:
				return ((InternalEList) getM_VTCDFigureDependency())
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
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
		case VTCDPackage.VTCD_DIAGRAM_MAIN__MVTCD_NOTE:
			return getM_VTCDNote();
		case VTCDPackage.VTCD_DIAGRAM_MAIN__MVTCD_FIGURE_ELEMENT:
			return getM_VTCDFigureElement();
		case VTCDPackage.VTCD_DIAGRAM_MAIN__MVTCD_FIGURE_DEPENDENCY:
			return getM_VTCDFigureDependency();
		case VTCDPackage.VTCD_DIAGRAM_MAIN__MTEST_OBJECT:
			return getM_TestObject();
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
		case VTCDPackage.VTCD_DIAGRAM_MAIN__MVTCD_NOTE:
			getM_VTCDNote().clear();
			getM_VTCDNote().addAll((Collection) newValue);
			return;
		case VTCDPackage.VTCD_DIAGRAM_MAIN__MVTCD_FIGURE_ELEMENT:
			getM_VTCDFigureElement().clear();
			getM_VTCDFigureElement().addAll((Collection) newValue);
			return;
		case VTCDPackage.VTCD_DIAGRAM_MAIN__MVTCD_FIGURE_DEPENDENCY:
			getM_VTCDFigureDependency().clear();
			getM_VTCDFigureDependency().addAll((Collection) newValue);
			return;
		case VTCDPackage.VTCD_DIAGRAM_MAIN__MTEST_OBJECT:
			setM_TestObject((CMProxyTestObject) newValue);
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
		case VTCDPackage.VTCD_DIAGRAM_MAIN__MVTCD_NOTE:
			getM_VTCDNote().clear();
			return;
		case VTCDPackage.VTCD_DIAGRAM_MAIN__MVTCD_FIGURE_ELEMENT:
			getM_VTCDFigureElement().clear();
			return;
		case VTCDPackage.VTCD_DIAGRAM_MAIN__MVTCD_FIGURE_DEPENDENCY:
			getM_VTCDFigureDependency().clear();
			return;
		case VTCDPackage.VTCD_DIAGRAM_MAIN__MTEST_OBJECT:
			setM_TestObject(MTEST_OBJECT_EDEFAULT);
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
		case VTCDPackage.VTCD_DIAGRAM_MAIN__MVTCD_NOTE:
			return m_VTCDNote != null && !m_VTCDNote.isEmpty();
		case VTCDPackage.VTCD_DIAGRAM_MAIN__MVTCD_FIGURE_ELEMENT:
			return m_VTCDFigureElement != null
					&& !m_VTCDFigureElement.isEmpty();
		case VTCDPackage.VTCD_DIAGRAM_MAIN__MVTCD_FIGURE_DEPENDENCY:
			return m_VTCDFigureDependency != null
					&& !m_VTCDFigureDependency.isEmpty();
		case VTCDPackage.VTCD_DIAGRAM_MAIN__MTEST_OBJECT:
			return MTEST_OBJECT_EDEFAULT == null ? m_TestObject != null
					: !MTEST_OBJECT_EDEFAULT.equals(m_TestObject);
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
		result.append(" (m_TestObject: "); //$NON-NLS-1$
		result.append(m_TestObject);
		result.append(')');
		return result.toString();
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

	public VTCDDiagramCombination getM_VTCDDiagramCombination(
			CMProxyDependency p_Dependency) {

		return this.getM_VTCDFigureDependency(p_Dependency)
				.getM_VTCDDiagramCombination();
	}

	public VTCDFigureDependency getM_VTCDFigureDependency(
			CMProxyDependency p_Dependency) {
		for (Iterator iter = this.getM_VTCDFigureDependency().iterator(); iter
				.hasNext();) {
			VTCDFigureDependency l_VTCDFigureDependency = (VTCDFigureDependency) iter
					.next();
			if (p_Dependency.equals((l_VTCDFigureDependency).getM_Dependency()))
				return l_VTCDFigureDependency;
		}
		return null;
	}

} //VTCDDiagramMainImpl
