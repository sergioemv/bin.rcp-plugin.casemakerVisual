/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDAbstractLinkImpl.java,v 1.7 2005/08/04 13:37:12 smoreno Exp $
 */
package biz.bi.vtcd.model.impl;

import java.util.Collection;

import org.eclipse.draw2d.AbsoluteBendpoint;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.swt.graphics.Color;

import biz.bi.vtcd.model.VTCDAbstractLink;
import biz.bi.vtcd.model.VTCDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDAbstractLinkImpl#getColor <em>Color</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDAbstractLinkImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDAbstractLinkImpl#getBendPoints <em>Bend Points</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDAbstractLinkImpl#getSourceTerminal <em>Source Terminal</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDAbstractLinkImpl#getTargetTerminal <em>Target Terminal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VTCDAbstractLinkImpl extends EObjectImpl implements
		VTCDAbstractLink {
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
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBendPoints() <em>Bend Points</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBendPoints()
	 * @generated
	 * @ordered
	 */
	protected EList bendPoints = null;

	/**
	 * The default value of the '{@link #getSourceTerminal() <em>Source Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceTerminal()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_TERMINAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceTerminal() <em>Source Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceTerminal()
	 * @generated
	 * @ordered
	 */
	protected String sourceTerminal = SOURCE_TERMINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetTerminal() <em>Target Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetTerminal()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_TERMINAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetTerminal() <em>Target Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetTerminal()
	 * @generated
	 * @ordered
	 */
	protected String targetTerminal = TARGET_TERMINAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTCDAbstractLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return VTCDPackage.eINSTANCE.getVTCDAbstractLink();
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
					VTCDPackage.VTCD_ABSTRACT_LINK__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VTCDPackage.VTCD_ABSTRACT_LINK__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBendPoints() {
		if (bendPoints == null) {
			bendPoints = new EDataTypeUniqueEList(AbsoluteBendpoint.class,
					this, VTCDPackage.VTCD_ABSTRACT_LINK__BEND_POINTS);
		}
		return bendPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceTerminal() {
		return sourceTerminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceTerminal(String newSourceTerminal) {
		String oldSourceTerminal = sourceTerminal;
		sourceTerminal = newSourceTerminal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VTCDPackage.VTCD_ABSTRACT_LINK__SOURCE_TERMINAL,
					oldSourceTerminal, sourceTerminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetTerminal() {
		return targetTerminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetTerminal(String newTargetTerminal) {
		String oldTargetTerminal = targetTerminal;
		targetTerminal = newTargetTerminal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VTCDPackage.VTCD_ABSTRACT_LINK__TARGET_TERMINAL,
					oldTargetTerminal, targetTerminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
		case VTCDPackage.VTCD_ABSTRACT_LINK__COLOR:
			return getColor();
		case VTCDPackage.VTCD_ABSTRACT_LINK__WIDTH:
			return new Integer(getWidth());
		case VTCDPackage.VTCD_ABSTRACT_LINK__BEND_POINTS:
			return getBendPoints();
		case VTCDPackage.VTCD_ABSTRACT_LINK__SOURCE_TERMINAL:
			return getSourceTerminal();
		case VTCDPackage.VTCD_ABSTRACT_LINK__TARGET_TERMINAL:
			return getTargetTerminal();
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
		case VTCDPackage.VTCD_ABSTRACT_LINK__COLOR:
			setColor((Color) newValue);
			return;
		case VTCDPackage.VTCD_ABSTRACT_LINK__WIDTH:
			setWidth(((Integer) newValue).intValue());
			return;
		case VTCDPackage.VTCD_ABSTRACT_LINK__BEND_POINTS:
			getBendPoints().clear();
			getBendPoints().addAll((Collection) newValue);
			return;
		case VTCDPackage.VTCD_ABSTRACT_LINK__SOURCE_TERMINAL:
			setSourceTerminal((String) newValue);
			return;
		case VTCDPackage.VTCD_ABSTRACT_LINK__TARGET_TERMINAL:
			setTargetTerminal((String) newValue);
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
		case VTCDPackage.VTCD_ABSTRACT_LINK__COLOR:
			setColor(COLOR_EDEFAULT);
			return;
		case VTCDPackage.VTCD_ABSTRACT_LINK__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case VTCDPackage.VTCD_ABSTRACT_LINK__BEND_POINTS:
			getBendPoints().clear();
			return;
		case VTCDPackage.VTCD_ABSTRACT_LINK__SOURCE_TERMINAL:
			setSourceTerminal(SOURCE_TERMINAL_EDEFAULT);
			return;
		case VTCDPackage.VTCD_ABSTRACT_LINK__TARGET_TERMINAL:
			setTargetTerminal(TARGET_TERMINAL_EDEFAULT);
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
		case VTCDPackage.VTCD_ABSTRACT_LINK__COLOR:
			return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT
					.equals(color);
		case VTCDPackage.VTCD_ABSTRACT_LINK__WIDTH:
			return width != WIDTH_EDEFAULT;
		case VTCDPackage.VTCD_ABSTRACT_LINK__BEND_POINTS:
			return bendPoints != null && !bendPoints.isEmpty();
		case VTCDPackage.VTCD_ABSTRACT_LINK__SOURCE_TERMINAL:
			return SOURCE_TERMINAL_EDEFAULT == null ? sourceTerminal != null
					: !SOURCE_TERMINAL_EDEFAULT.equals(sourceTerminal);
		case VTCDPackage.VTCD_ABSTRACT_LINK__TARGET_TERMINAL:
			return TARGET_TERMINAL_EDEFAULT == null ? targetTerminal != null
					: !TARGET_TERMINAL_EDEFAULT.equals(targetTerminal);
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
		result.append(", width: "); //$NON-NLS-1$
		result.append(width);
		result.append(", bendPoints: "); //$NON-NLS-1$
		result.append(bendPoints);
		result.append(", sourceTerminal: "); //$NON-NLS-1$
		result.append(sourceTerminal);
		result.append(", targetTerminal: "); //$NON-NLS-1$
		result.append(targetTerminal);
		result.append(')');
		return result.toString();
	}

} //VTCDAbstractLinkImpl
