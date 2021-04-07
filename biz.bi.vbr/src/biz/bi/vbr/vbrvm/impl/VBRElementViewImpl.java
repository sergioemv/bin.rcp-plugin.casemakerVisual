/**
 * <copyright>
 * </copyright>
 *
 * $Id: VBRElementViewImpl.java,v 1.6 2005/09/20 19:03:42 hcanedo Exp $
 */
package biz.bi.vbr.vbrvm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import biz.bi.vbr.BusinessObject;
import biz.bi.vbr.vbrvm.MainDiagram;
import biz.bi.vbr.vbrvm.VBRElementConnectElementValue;
import biz.bi.vbr.vbrvm.VBRElementValueView;
import biz.bi.vbr.vbrvm.VBRElementView;
import biz.bi.vbr.vbrvm.VBRVMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VBR Element View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link biz.bi.vbr.vbrvm.impl.VBRElementViewImpl#getM_MainDiagram <em>MMain Diagram</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.impl.VBRElementViewImpl#getM_BObjectM <em>MBObject M</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.impl.VBRElementViewImpl#getM_VBRElementConnectElementValue <em>MVBR Element Connect Element Value</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.impl.VBRElementViewImpl#getM_ElementValue <em>MElement Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VBRElementViewImpl extends AbstractViewImpl implements
		VBRElementView {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getM_BObjectM() <em>MBObject M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_BObjectM()
	 * @generated
	 * @ordered
	 */
	protected static final BusinessObject MBOBJECT_M_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getM_BObjectM() <em>MBObject M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_BObjectM()
	 * @generated
	 * @ordered
	 */
	protected BusinessObject m_BObjectM = MBOBJECT_M_EDEFAULT;

	/**
	 * The cached value of the '{@link #getM_VBRElementConnectElementValue() <em>MVBR Element Connect Element Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_VBRElementConnectElementValue()
	 * @generated
	 * @ordered
	 */
	protected VBRElementConnectElementValue m_VBRElementConnectElementValue = null;

	/**
	 * The cached value of the '{@link #getM_ElementValue() <em>MElement Value</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_ElementValue()
	 * @generated
	 * @ordered
	 */
	protected EList m_ElementValue = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VBRElementViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return VBRVMPackage.eINSTANCE.getVBRElementView();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainDiagram getM_MainDiagram() {
		if (eContainerFeatureID != VBRVMPackage.VBR_ELEMENT_VIEW__MMAIN_DIAGRAM)
			return null;
		return (MainDiagram) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_MainDiagram(MainDiagram newM_MainDiagram) {
		if (newM_MainDiagram != eContainer
				|| (eContainerFeatureID != VBRVMPackage.VBR_ELEMENT_VIEW__MMAIN_DIAGRAM && newM_MainDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newM_MainDiagram))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newM_MainDiagram != null)
				msgs = ((InternalEObject) newM_MainDiagram).eInverseAdd(this,
						VBRVMPackage.MAIN_DIAGRAM__MVBR_ELEMENT_VIEW,
						MainDiagram.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newM_MainDiagram,
					VBRVMPackage.VBR_ELEMENT_VIEW__MMAIN_DIAGRAM, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VBRVMPackage.VBR_ELEMENT_VIEW__MMAIN_DIAGRAM,
					newM_MainDiagram, newM_MainDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessObject getM_BObjectM() {
		return m_BObjectM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_BObjectM(BusinessObject newM_BObjectM) {
		BusinessObject oldM_BObjectM = m_BObjectM;
		m_BObjectM = newM_BObjectM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VBRVMPackage.VBR_ELEMENT_VIEW__MBOBJECT_M, oldM_BObjectM,
					m_BObjectM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRElementConnectElementValue getM_VBRElementConnectElementValue() {
		if (m_VBRElementConnectElementValue != null
				&& m_VBRElementConnectElementValue.eIsProxy()) {
			VBRElementConnectElementValue oldM_VBRElementConnectElementValue = m_VBRElementConnectElementValue;
			m_VBRElementConnectElementValue = (VBRElementConnectElementValue) eResolveProxy((InternalEObject) m_VBRElementConnectElementValue);
			if (m_VBRElementConnectElementValue != oldM_VBRElementConnectElementValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							VBRVMPackage.VBR_ELEMENT_VIEW__MVBR_ELEMENT_CONNECT_ELEMENT_VALUE,
							oldM_VBRElementConnectElementValue,
							m_VBRElementConnectElementValue));
			}
		}
		return m_VBRElementConnectElementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRElementConnectElementValue basicGetM_VBRElementConnectElementValue() {
		return m_VBRElementConnectElementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_VBRElementConnectElementValue(
			VBRElementConnectElementValue newM_VBRElementConnectElementValue) {
		VBRElementConnectElementValue oldM_VBRElementConnectElementValue = m_VBRElementConnectElementValue;
		m_VBRElementConnectElementValue = newM_VBRElementConnectElementValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					VBRVMPackage.VBR_ELEMENT_VIEW__MVBR_ELEMENT_CONNECT_ELEMENT_VALUE,
					oldM_VBRElementConnectElementValue,
					m_VBRElementConnectElementValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getM_ElementValue() {
		if (m_ElementValue == null) {
			m_ElementValue = new EObjectResolvingEList(
					VBRElementValueView.class, this,
					VBRVMPackage.VBR_ELEMENT_VIEW__MELEMENT_VALUE);
		}
		return m_ElementValue;
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
			case VBRVMPackage.VBR_ELEMENT_VIEW__MMAIN_DIAGRAM:
				if (eContainer != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
						VBRVMPackage.VBR_ELEMENT_VIEW__MMAIN_DIAGRAM, msgs);
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
			case VBRVMPackage.VBR_ELEMENT_VIEW__MMAIN_DIAGRAM:
				return eBasicSetContainer(null,
						VBRVMPackage.VBR_ELEMENT_VIEW__MMAIN_DIAGRAM, msgs);
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
			case VBRVMPackage.VBR_ELEMENT_VIEW__MMAIN_DIAGRAM:
				return eContainer.eInverseRemove(this,
						VBRVMPackage.MAIN_DIAGRAM__MVBR_ELEMENT_VIEW,
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
		case VBRVMPackage.VBR_ELEMENT_VIEW__X:
			return new Integer(getX());
		case VBRVMPackage.VBR_ELEMENT_VIEW__Y:
			return new Integer(getY());
		case VBRVMPackage.VBR_ELEMENT_VIEW__WIDTH:
			return new Integer(getWidth());
		case VBRVMPackage.VBR_ELEMENT_VIEW__HEIGTH:
			return new Integer(getHeigth());
		case VBRVMPackage.VBR_ELEMENT_VIEW__MMAIN_DIAGRAM:
			return getM_MainDiagram();
		case VBRVMPackage.VBR_ELEMENT_VIEW__MBOBJECT_M:
			return getM_BObjectM();
		case VBRVMPackage.VBR_ELEMENT_VIEW__MVBR_ELEMENT_CONNECT_ELEMENT_VALUE:
			if (resolve)
				return getM_VBRElementConnectElementValue();
			return basicGetM_VBRElementConnectElementValue();
		case VBRVMPackage.VBR_ELEMENT_VIEW__MELEMENT_VALUE:
			return getM_ElementValue();
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
		case VBRVMPackage.VBR_ELEMENT_VIEW__X:
			setX(((Integer) newValue).intValue());
			return;
		case VBRVMPackage.VBR_ELEMENT_VIEW__Y:
			setY(((Integer) newValue).intValue());
			return;
		case VBRVMPackage.VBR_ELEMENT_VIEW__WIDTH:
			setWidth(((Integer) newValue).intValue());
			return;
		case VBRVMPackage.VBR_ELEMENT_VIEW__HEIGTH:
			setHeigth(((Integer) newValue).intValue());
			return;
		case VBRVMPackage.VBR_ELEMENT_VIEW__MMAIN_DIAGRAM:
			setM_MainDiagram((MainDiagram) newValue);
			return;
		case VBRVMPackage.VBR_ELEMENT_VIEW__MBOBJECT_M:
			setM_BObjectM((BusinessObject) newValue);
			return;
		case VBRVMPackage.VBR_ELEMENT_VIEW__MVBR_ELEMENT_CONNECT_ELEMENT_VALUE:
			setM_VBRElementConnectElementValue((VBRElementConnectElementValue) newValue);
			return;
		case VBRVMPackage.VBR_ELEMENT_VIEW__MELEMENT_VALUE:
			getM_ElementValue().clear();
			getM_ElementValue().addAll((Collection) newValue);
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
		case VBRVMPackage.VBR_ELEMENT_VIEW__X:
			setX(X_EDEFAULT);
			return;
		case VBRVMPackage.VBR_ELEMENT_VIEW__Y:
			setY(Y_EDEFAULT);
			return;
		case VBRVMPackage.VBR_ELEMENT_VIEW__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case VBRVMPackage.VBR_ELEMENT_VIEW__HEIGTH:
			setHeigth(HEIGTH_EDEFAULT);
			return;
		case VBRVMPackage.VBR_ELEMENT_VIEW__MMAIN_DIAGRAM:
			setM_MainDiagram((MainDiagram) null);
			return;
		case VBRVMPackage.VBR_ELEMENT_VIEW__MBOBJECT_M:
			setM_BObjectM(MBOBJECT_M_EDEFAULT);
			return;
		case VBRVMPackage.VBR_ELEMENT_VIEW__MVBR_ELEMENT_CONNECT_ELEMENT_VALUE:
			setM_VBRElementConnectElementValue((VBRElementConnectElementValue) null);
			return;
		case VBRVMPackage.VBR_ELEMENT_VIEW__MELEMENT_VALUE:
			getM_ElementValue().clear();
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
		case VBRVMPackage.VBR_ELEMENT_VIEW__X:
			return x != X_EDEFAULT;
		case VBRVMPackage.VBR_ELEMENT_VIEW__Y:
			return y != Y_EDEFAULT;
		case VBRVMPackage.VBR_ELEMENT_VIEW__WIDTH:
			return width != WIDTH_EDEFAULT;
		case VBRVMPackage.VBR_ELEMENT_VIEW__HEIGTH:
			return heigth != HEIGTH_EDEFAULT;
		case VBRVMPackage.VBR_ELEMENT_VIEW__MMAIN_DIAGRAM:
			return getM_MainDiagram() != null;
		case VBRVMPackage.VBR_ELEMENT_VIEW__MBOBJECT_M:
			return MBOBJECT_M_EDEFAULT == null ? m_BObjectM != null
					: !MBOBJECT_M_EDEFAULT.equals(m_BObjectM);
		case VBRVMPackage.VBR_ELEMENT_VIEW__MVBR_ELEMENT_CONNECT_ELEMENT_VALUE:
			return m_VBRElementConnectElementValue != null;
		case VBRVMPackage.VBR_ELEMENT_VIEW__MELEMENT_VALUE:
			return m_ElementValue != null && !m_ElementValue.isEmpty();
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
		result.append(" (m_BObjectM: "); //$NON-NLS-1$
		result.append(m_BObjectM);
		result.append(')');
		return result.toString();
	}

} //VBRElementViewImpl
