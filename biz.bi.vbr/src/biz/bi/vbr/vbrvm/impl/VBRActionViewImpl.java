/**
 * <copyright>
 * </copyright>
 *
 * $Id: VBRActionViewImpl.java,v 1.2 2005/09/01 22:17:38 hcanedo Exp $
 */
package biz.bi.vbr.vbrvm.impl;

import biz.bi.vbr.BusinessAction;

import biz.bi.vbr.vbrvm.MainDiagram;
import biz.bi.vbr.vbrvm.VBRActionConnectElementValue;
import biz.bi.vbr.vbrvm.VBRActionView;

import biz.bi.vbr.vbrvm.VBRVMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.swt.graphics.Color;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VBR Action View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link biz.bi.vbr.vbrvm.impl.VBRActionViewImpl#getColor <em>Color</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.impl.VBRActionViewImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.impl.VBRActionViewImpl#getM_BActionm <em>MBActionm</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.impl.VBRActionViewImpl#getM_VBRActionConnectElementValue <em>MVBR Action Connect Element Value</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.impl.VBRActionViewImpl#getM_MainDiagram <em>MMain Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VBRActionViewImpl extends AbstractViewImpl implements
		VBRActionView {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Color color = COLOR_EDEFAULT;

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
	 * The default value of the '{@link #getM_BActionm() <em>MBActionm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_BActionm()
	 * @generated
	 * @ordered
	 */
	protected static final BusinessAction MBACTIONM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getM_BActionm() <em>MBActionm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_BActionm()
	 * @generated
	 * @ordered
	 */
	protected BusinessAction m_BActionm = MBACTIONM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getM_VBRActionConnectElementValue() <em>MVBR Action Connect Element Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_VBRActionConnectElementValue()
	 * @generated
	 * @ordered
	 */
	protected VBRActionConnectElementValue m_VBRActionConnectElementValue = null;

	/**
	 * The cached value of the '{@link #getM_MainDiagram() <em>MMain Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_MainDiagram()
	 * @generated
	 * @ordered
	 */
	protected MainDiagram m_MainDiagram = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VBRActionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return VBRVMPackage.eINSTANCE.getVBRActionView();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Color newColor) {
		Color oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VBRVMPackage.VBR_ACTION_VIEW__COLOR, oldColor, color));
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
					VBRVMPackage.VBR_ACTION_VIEW__ICON, oldIcon, icon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessAction getM_BActionm() {
		return m_BActionm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_BActionm(BusinessAction newM_BActionm) {
		BusinessAction oldM_BActionm = m_BActionm;
		m_BActionm = newM_BActionm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VBRVMPackage.VBR_ACTION_VIEW__MBACTIONM, oldM_BActionm,
					m_BActionm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRActionConnectElementValue getM_VBRActionConnectElementValue() {
		if (m_VBRActionConnectElementValue != null
				&& m_VBRActionConnectElementValue.eIsProxy()) {
			VBRActionConnectElementValue oldM_VBRActionConnectElementValue = m_VBRActionConnectElementValue;
			m_VBRActionConnectElementValue = (VBRActionConnectElementValue) eResolveProxy((InternalEObject) m_VBRActionConnectElementValue);
			if (m_VBRActionConnectElementValue != oldM_VBRActionConnectElementValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							VBRVMPackage.VBR_ACTION_VIEW__MVBR_ACTION_CONNECT_ELEMENT_VALUE,
							oldM_VBRActionConnectElementValue,
							m_VBRActionConnectElementValue));
			}
		}
		return m_VBRActionConnectElementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRActionConnectElementValue basicGetM_VBRActionConnectElementValue() {
		return m_VBRActionConnectElementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_VBRActionConnectElementValue(
			VBRActionConnectElementValue newM_VBRActionConnectElementValue) {
		VBRActionConnectElementValue oldM_VBRActionConnectElementValue = m_VBRActionConnectElementValue;
		m_VBRActionConnectElementValue = newM_VBRActionConnectElementValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					VBRVMPackage.VBR_ACTION_VIEW__MVBR_ACTION_CONNECT_ELEMENT_VALUE,
					oldM_VBRActionConnectElementValue,
					m_VBRActionConnectElementValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainDiagram getM_MainDiagram() {
		if (m_MainDiagram != null && m_MainDiagram.eIsProxy()) {
			MainDiagram oldM_MainDiagram = m_MainDiagram;
			m_MainDiagram = (MainDiagram) eResolveProxy((InternalEObject) m_MainDiagram);
			if (m_MainDiagram != oldM_MainDiagram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							VBRVMPackage.VBR_ACTION_VIEW__MMAIN_DIAGRAM,
							oldM_MainDiagram, m_MainDiagram));
			}
		}
		return m_MainDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainDiagram basicGetM_MainDiagram() {
		return m_MainDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_MainDiagram(MainDiagram newM_MainDiagram) {
		MainDiagram oldM_MainDiagram = m_MainDiagram;
		m_MainDiagram = newM_MainDiagram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VBRVMPackage.VBR_ACTION_VIEW__MMAIN_DIAGRAM,
					oldM_MainDiagram, m_MainDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
		case VBRVMPackage.VBR_ACTION_VIEW__X:
			return new Integer(getX());
		case VBRVMPackage.VBR_ACTION_VIEW__Y:
			return new Integer(getY());
		case VBRVMPackage.VBR_ACTION_VIEW__WIDTH:
			return new Integer(getWidth());
		case VBRVMPackage.VBR_ACTION_VIEW__HEIGTH:
			return new Integer(getHeigth());
		case VBRVMPackage.VBR_ACTION_VIEW__COLOR:
			return getColor();
		case VBRVMPackage.VBR_ACTION_VIEW__ICON:
			return getIcon();
		case VBRVMPackage.VBR_ACTION_VIEW__MBACTIONM:
			return getM_BActionm();
		case VBRVMPackage.VBR_ACTION_VIEW__MVBR_ACTION_CONNECT_ELEMENT_VALUE:
			if (resolve)
				return getM_VBRActionConnectElementValue();
			return basicGetM_VBRActionConnectElementValue();
		case VBRVMPackage.VBR_ACTION_VIEW__MMAIN_DIAGRAM:
			if (resolve)
				return getM_MainDiagram();
			return basicGetM_MainDiagram();
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
		case VBRVMPackage.VBR_ACTION_VIEW__X:
			setX(((Integer) newValue).intValue());
			return;
		case VBRVMPackage.VBR_ACTION_VIEW__Y:
			setY(((Integer) newValue).intValue());
			return;
		case VBRVMPackage.VBR_ACTION_VIEW__WIDTH:
			setWidth(((Integer) newValue).intValue());
			return;
		case VBRVMPackage.VBR_ACTION_VIEW__HEIGTH:
			setHeigth(((Integer) newValue).intValue());
			return;
		case VBRVMPackage.VBR_ACTION_VIEW__COLOR:
			setColor((Color) newValue);
			return;
		case VBRVMPackage.VBR_ACTION_VIEW__ICON:
			setIcon((String) newValue);
			return;
		case VBRVMPackage.VBR_ACTION_VIEW__MBACTIONM:
			setM_BActionm((BusinessAction) newValue);
			return;
		case VBRVMPackage.VBR_ACTION_VIEW__MVBR_ACTION_CONNECT_ELEMENT_VALUE:
			setM_VBRActionConnectElementValue((VBRActionConnectElementValue) newValue);
			return;
		case VBRVMPackage.VBR_ACTION_VIEW__MMAIN_DIAGRAM:
			setM_MainDiagram((MainDiagram) newValue);
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
		case VBRVMPackage.VBR_ACTION_VIEW__X:
			setX(X_EDEFAULT);
			return;
		case VBRVMPackage.VBR_ACTION_VIEW__Y:
			setY(Y_EDEFAULT);
			return;
		case VBRVMPackage.VBR_ACTION_VIEW__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case VBRVMPackage.VBR_ACTION_VIEW__HEIGTH:
			setHeigth(HEIGTH_EDEFAULT);
			return;
		case VBRVMPackage.VBR_ACTION_VIEW__COLOR:
			setColor(COLOR_EDEFAULT);
			return;
		case VBRVMPackage.VBR_ACTION_VIEW__ICON:
			setIcon(ICON_EDEFAULT);
			return;
		case VBRVMPackage.VBR_ACTION_VIEW__MBACTIONM:
			setM_BActionm(MBACTIONM_EDEFAULT);
			return;
		case VBRVMPackage.VBR_ACTION_VIEW__MVBR_ACTION_CONNECT_ELEMENT_VALUE:
			setM_VBRActionConnectElementValue((VBRActionConnectElementValue) null);
			return;
		case VBRVMPackage.VBR_ACTION_VIEW__MMAIN_DIAGRAM:
			setM_MainDiagram((MainDiagram) null);
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
		case VBRVMPackage.VBR_ACTION_VIEW__X:
			return x != X_EDEFAULT;
		case VBRVMPackage.VBR_ACTION_VIEW__Y:
			return y != Y_EDEFAULT;
		case VBRVMPackage.VBR_ACTION_VIEW__WIDTH:
			return width != WIDTH_EDEFAULT;
		case VBRVMPackage.VBR_ACTION_VIEW__HEIGTH:
			return heigth != HEIGTH_EDEFAULT;
		case VBRVMPackage.VBR_ACTION_VIEW__COLOR:
			return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT
					.equals(color);
		case VBRVMPackage.VBR_ACTION_VIEW__ICON:
			return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT
					.equals(icon);
		case VBRVMPackage.VBR_ACTION_VIEW__MBACTIONM:
			return MBACTIONM_EDEFAULT == null ? m_BActionm != null
					: !MBACTIONM_EDEFAULT.equals(m_BActionm);
		case VBRVMPackage.VBR_ACTION_VIEW__MVBR_ACTION_CONNECT_ELEMENT_VALUE:
			return m_VBRActionConnectElementValue != null;
		case VBRVMPackage.VBR_ACTION_VIEW__MMAIN_DIAGRAM:
			return m_MainDiagram != null;
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
		result.append(" (color: "); //$NON-NLS-1$
		result.append(color);
		result.append(", icon: "); //$NON-NLS-1$
		result.append(icon);
		result.append(", m_BActionm: "); //$NON-NLS-1$
		result.append(m_BActionm);
		result.append(')');
		return result.toString();
	}

} //VBRActionViewImpl
