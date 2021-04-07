/**
 * <copyright>
 * </copyright>
 *
 * $Id: VBRElementValueViewImpl.java,v 1.6 2005/09/20 19:03:42 hcanedo Exp $
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
import org.eclipse.swt.graphics.Color;

import biz.bi.vbr.BusinessValue;
import biz.bi.vbr.vbrvm.MainDiagram;
import biz.bi.vbr.vbrvm.VBRElementValueConnectAction;
import biz.bi.vbr.vbrvm.VBRElementValueConnectElementValue;
import biz.bi.vbr.vbrvm.VBRElementValueView;
import biz.bi.vbr.vbrvm.VBRElementView;
import biz.bi.vbr.vbrvm.VBRVMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VBR Element Value View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link biz.bi.vbr.vbrvm.impl.VBRElementValueViewImpl#getM_MainDiagram <em>MMain Diagram</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.impl.VBRElementValueViewImpl#getM_VBRElementValueConnectAction <em>MVBR Element Value Connect Action</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.impl.VBRElementValueViewImpl#getEColor <em>EColor</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.impl.VBRElementValueViewImpl#getM_bvaluem <em>Mbvaluem</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.impl.VBRElementValueViewImpl#getM_VBRElementValueConnectElementValue <em>MVBR Element Value Connect Element Value</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.impl.VBRElementValueViewImpl#getM_ElementView <em>MElement View</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VBRElementValueViewImpl extends AbstractViewImpl implements
		VBRElementValueView {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getM_VBRElementValueConnectAction() <em>MVBR Element Value Connect Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_VBRElementValueConnectAction()
	 * @generated
	 * @ordered
	 */
	protected EList m_VBRElementValueConnectAction = null;

	/**
	 * The default value of the '{@link #getEColor() <em>EColor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color ECOLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEColor() <em>EColor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEColor()
	 * @generated
	 * @ordered
	 */
	protected Color eColor = ECOLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getM_bvaluem() <em>Mbvaluem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_bvaluem()
	 * @generated
	 * @ordered
	 */
	protected static final BusinessValue MBVALUEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getM_bvaluem() <em>Mbvaluem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_bvaluem()
	 * @generated
	 * @ordered
	 */
	protected BusinessValue m_bvaluem = MBVALUEM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getM_VBRElementValueConnectElementValue() <em>MVBR Element Value Connect Element Value</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_VBRElementValueConnectElementValue()
	 * @generated
	 * @ordered
	 */
	protected EList m_VBRElementValueConnectElementValue = null;

	/**
	 * The cached value of the '{@link #getM_ElementView() <em>MElement View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_ElementView()
	 * @generated
	 * @ordered
	 */
	protected VBRElementView m_ElementView = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VBRElementValueViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return VBRVMPackage.eINSTANCE.getVBRElementValueView();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainDiagram getM_MainDiagram() {
		if (eContainerFeatureID != VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MMAIN_DIAGRAM)
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
				|| (eContainerFeatureID != VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MMAIN_DIAGRAM && newM_MainDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newM_MainDiagram))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newM_MainDiagram != null)
				msgs = ((InternalEObject) newM_MainDiagram).eInverseAdd(this,
						VBRVMPackage.MAIN_DIAGRAM__MVBR_ELEMENT_VALUE_VIEW,
						MainDiagram.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newM_MainDiagram,
					VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MMAIN_DIAGRAM, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MMAIN_DIAGRAM,
					newM_MainDiagram, newM_MainDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getM_VBRElementValueConnectAction() {
		if (m_VBRElementValueConnectAction == null) {
			m_VBRElementValueConnectAction = new EObjectResolvingEList(
					VBRElementValueConnectAction.class,
					this,
					VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MVBR_ELEMENT_VALUE_CONNECT_ACTION);
		}
		return m_VBRElementValueConnectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getEColor() {
		return eColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEColor(Color newEColor) {
		Color oldEColor = eColor;
		eColor = newEColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__ECOLOR, oldEColor,
					eColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessValue getM_bvaluem() {
		return m_bvaluem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_bvaluem(BusinessValue newM_bvaluem) {
		BusinessValue oldM_bvaluem = m_bvaluem;
		m_bvaluem = newM_bvaluem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MBVALUEM,
					oldM_bvaluem, m_bvaluem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getM_VBRElementValueConnectElementValue() {
		if (m_VBRElementValueConnectElementValue == null) {
			m_VBRElementValueConnectElementValue = new EObjectResolvingEList(
					VBRElementValueConnectElementValue.class,
					this,
					VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MVBR_ELEMENT_VALUE_CONNECT_ELEMENT_VALUE);
		}
		return m_VBRElementValueConnectElementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRElementView getM_ElementView() {
		if (m_ElementView != null && m_ElementView.eIsProxy()) {
			VBRElementView oldM_ElementView = m_ElementView;
			m_ElementView = (VBRElementView) eResolveProxy((InternalEObject) m_ElementView);
			if (m_ElementView != oldM_ElementView) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MELEMENT_VIEW,
							oldM_ElementView, m_ElementView));
			}
		}
		return m_ElementView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRElementView basicGetM_ElementView() {
		return m_ElementView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_ElementView(VBRElementView newM_ElementView) {
		VBRElementView oldM_ElementView = m_ElementView;
		m_ElementView = newM_ElementView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MELEMENT_VIEW,
					oldM_ElementView, m_ElementView));
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
			case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MMAIN_DIAGRAM:
				if (eContainer != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
						VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MMAIN_DIAGRAM,
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
			case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MMAIN_DIAGRAM:
				return eBasicSetContainer(null,
						VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MMAIN_DIAGRAM,
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
			case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MMAIN_DIAGRAM:
				return eContainer.eInverseRemove(this,
						VBRVMPackage.MAIN_DIAGRAM__MVBR_ELEMENT_VALUE_VIEW,
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
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__X:
			return new Integer(getX());
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__Y:
			return new Integer(getY());
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__WIDTH:
			return new Integer(getWidth());
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__HEIGTH:
			return new Integer(getHeigth());
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MMAIN_DIAGRAM:
			return getM_MainDiagram();
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MVBR_ELEMENT_VALUE_CONNECT_ACTION:
			return getM_VBRElementValueConnectAction();
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__ECOLOR:
			return getEColor();
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MBVALUEM:
			return getM_bvaluem();
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MVBR_ELEMENT_VALUE_CONNECT_ELEMENT_VALUE:
			return getM_VBRElementValueConnectElementValue();
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MELEMENT_VIEW:
			if (resolve)
				return getM_ElementView();
			return basicGetM_ElementView();
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
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__X:
			setX(((Integer) newValue).intValue());
			return;
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__Y:
			setY(((Integer) newValue).intValue());
			return;
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__WIDTH:
			setWidth(((Integer) newValue).intValue());
			return;
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__HEIGTH:
			setHeigth(((Integer) newValue).intValue());
			return;
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MMAIN_DIAGRAM:
			setM_MainDiagram((MainDiagram) newValue);
			return;
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MVBR_ELEMENT_VALUE_CONNECT_ACTION:
			getM_VBRElementValueConnectAction().clear();
			getM_VBRElementValueConnectAction().addAll((Collection) newValue);
			return;
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__ECOLOR:
			setEColor((Color) newValue);
			return;
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MBVALUEM:
			setM_bvaluem((BusinessValue) newValue);
			return;
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MVBR_ELEMENT_VALUE_CONNECT_ELEMENT_VALUE:
			getM_VBRElementValueConnectElementValue().clear();
			getM_VBRElementValueConnectElementValue().addAll(
					(Collection) newValue);
			return;
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MELEMENT_VIEW:
			setM_ElementView((VBRElementView) newValue);
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
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__X:
			setX(X_EDEFAULT);
			return;
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__Y:
			setY(Y_EDEFAULT);
			return;
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__HEIGTH:
			setHeigth(HEIGTH_EDEFAULT);
			return;
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MMAIN_DIAGRAM:
			setM_MainDiagram((MainDiagram) null);
			return;
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MVBR_ELEMENT_VALUE_CONNECT_ACTION:
			getM_VBRElementValueConnectAction().clear();
			return;
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__ECOLOR:
			setEColor(ECOLOR_EDEFAULT);
			return;
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MBVALUEM:
			setM_bvaluem(MBVALUEM_EDEFAULT);
			return;
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MVBR_ELEMENT_VALUE_CONNECT_ELEMENT_VALUE:
			getM_VBRElementValueConnectElementValue().clear();
			return;
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MELEMENT_VIEW:
			setM_ElementView((VBRElementView) null);
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
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__X:
			return x != X_EDEFAULT;
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__Y:
			return y != Y_EDEFAULT;
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__WIDTH:
			return width != WIDTH_EDEFAULT;
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__HEIGTH:
			return heigth != HEIGTH_EDEFAULT;
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MMAIN_DIAGRAM:
			return getM_MainDiagram() != null;
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MVBR_ELEMENT_VALUE_CONNECT_ACTION:
			return m_VBRElementValueConnectAction != null
					&& !m_VBRElementValueConnectAction.isEmpty();
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__ECOLOR:
			return ECOLOR_EDEFAULT == null ? eColor != null : !ECOLOR_EDEFAULT
					.equals(eColor);
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MBVALUEM:
			return MBVALUEM_EDEFAULT == null ? m_bvaluem != null
					: !MBVALUEM_EDEFAULT.equals(m_bvaluem);
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MVBR_ELEMENT_VALUE_CONNECT_ELEMENT_VALUE:
			return m_VBRElementValueConnectElementValue != null
					&& !m_VBRElementValueConnectElementValue.isEmpty();
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MELEMENT_VIEW:
			return m_ElementView != null;
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
		result.append(" (eColor: "); //$NON-NLS-1$
		result.append(eColor);
		result.append(", m_bvaluem: "); //$NON-NLS-1$
		result.append(m_bvaluem);
		result.append(')');
		return result.toString();
	}

} //VBRElementValueViewImpl

