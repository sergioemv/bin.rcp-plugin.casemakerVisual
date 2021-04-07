/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDLinkDependencyElementImpl.java,v 1.7 2005/08/04 13:37:12 smoreno Exp $
 */
package biz.bi.vtcd.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.graphics.Color;

import biz.bi.vtcd.model.VTCDFigureDependency;
import biz.bi.vtcd.model.VTCDFigureElement;
import biz.bi.vtcd.model.VTCDLinkDependencyElement;
import biz.bi.vtcd.model.VTCDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Dependency Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDLinkDependencyElementImpl#getSourceDependency <em>Source Dependency</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDLinkDependencyElementImpl#getDestElement <em>Dest Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VTCDLinkDependencyElementImpl extends VTCDAbstractLinkImpl
		implements VTCDLinkDependencyElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getDestElement() <em>Dest Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestElement()
	 * @generated
	 * @ordered
	 */
	protected VTCDFigureElement destElement = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTCDLinkDependencyElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return VTCDPackage.eINSTANCE.getVTCDLinkDependencyElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTCDFigureDependency getSourceDependency() {
		if (eContainerFeatureID != VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__SOURCE_DEPENDENCY)
			return null;
		return (VTCDFigureDependency) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDependency(VTCDFigureDependency newSourceDependency) {
		if (newSourceDependency != eContainer
				|| (eContainerFeatureID != VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__SOURCE_DEPENDENCY && newSourceDependency != null)) {
			if (EcoreUtil.isAncestor(this, newSourceDependency))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSourceDependency != null)
				msgs = ((InternalEObject) newSourceDependency)
						.eInverseAdd(
								this,
								VTCDPackage.VTCD_FIGURE_DEPENDENCY__MVTCD_LINK_DEPENDENCY_ELEMENT,
								VTCDFigureDependency.class, msgs);
			msgs = eBasicSetContainer(
					(InternalEObject) newSourceDependency,
					VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__SOURCE_DEPENDENCY,
					msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__SOURCE_DEPENDENCY,
					newSourceDependency, newSourceDependency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTCDFigureElement getDestElement() {
		if (destElement != null && destElement.eIsProxy()) {
			VTCDFigureElement oldDestElement = destElement;
			destElement = (VTCDFigureElement) eResolveProxy((InternalEObject) destElement);
			if (destElement != oldDestElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__DEST_ELEMENT,
							oldDestElement, destElement));
			}
		}
		return destElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTCDFigureElement basicGetDestElement() {
		return destElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestElement(
			VTCDFigureElement newDestElement, NotificationChain msgs) {
		VTCDFigureElement oldDestElement = destElement;
		destElement = newDestElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__DEST_ELEMENT,
					oldDestElement, newDestElement);
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
	public void setDestElement(VTCDFigureElement newDestElement) {
		if (newDestElement != destElement) {
			NotificationChain msgs = null;
			if (destElement != null)
				msgs = ((InternalEObject) destElement)
						.eInverseRemove(
								this,
								VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_LINK_DEPENDENCY_ELEMENT,
								VTCDFigureElement.class, msgs);
			if (newDestElement != null)
				msgs = ((InternalEObject) newDestElement)
						.eInverseAdd(
								this,
								VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_LINK_DEPENDENCY_ELEMENT,
								VTCDFigureElement.class, msgs);
			msgs = basicSetDestElement(newDestElement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__DEST_ELEMENT,
					newDestElement, newDestElement));
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
			case VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__SOURCE_DEPENDENCY:
				if (eContainer != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(
						otherEnd,
						VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__SOURCE_DEPENDENCY,
						msgs);
			case VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__DEST_ELEMENT:
				if (destElement != null)
					msgs = ((InternalEObject) destElement)
							.eInverseRemove(
									this,
									VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_LINK_DEPENDENCY_ELEMENT,
									VTCDFigureElement.class, msgs);
				return basicSetDestElement((VTCDFigureElement) otherEnd, msgs);
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
			case VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__SOURCE_DEPENDENCY:
				return eBasicSetContainer(
						null,
						VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__SOURCE_DEPENDENCY,
						msgs);
			case VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__DEST_ELEMENT:
				return basicSetDestElement(null, msgs);
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
			case VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__SOURCE_DEPENDENCY:
				return eContainer
						.eInverseRemove(
								this,
								VTCDPackage.VTCD_FIGURE_DEPENDENCY__MVTCD_LINK_DEPENDENCY_ELEMENT,
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
		case VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__COLOR:
			return getColor();
		case VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__WIDTH:
			return new Integer(getWidth());
		case VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__BEND_POINTS:
			return getBendPoints();
		case VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__SOURCE_TERMINAL:
			return getSourceTerminal();
		case VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__TARGET_TERMINAL:
			return getTargetTerminal();
		case VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__SOURCE_DEPENDENCY:
			return getSourceDependency();
		case VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__DEST_ELEMENT:
			if (resolve)
				return getDestElement();
			return basicGetDestElement();
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
		case VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__COLOR:
			setColor((Color) newValue);
			return;
		case VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__WIDTH:
			setWidth(((Integer) newValue).intValue());
			return;
		case VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__BEND_POINTS:
			getBendPoints().clear();
			getBendPoints().addAll((Collection) newValue);
			return;
		case VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__SOURCE_TERMINAL:
			setSourceTerminal((String) newValue);
			return;
		case VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__TARGET_TERMINAL:
			setTargetTerminal((String) newValue);
			return;
		case VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__SOURCE_DEPENDENCY:
			setSourceDependency((VTCDFigureDependency) newValue);
			return;
		case VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__DEST_ELEMENT:
			setDestElement((VTCDFigureElement) newValue);
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
		case VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__COLOR:
			setColor(COLOR_EDEFAULT);
			return;
		case VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__BEND_POINTS:
			getBendPoints().clear();
			return;
		case VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__SOURCE_TERMINAL:
			setSourceTerminal(SOURCE_TERMINAL_EDEFAULT);
			return;
		case VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__TARGET_TERMINAL:
			setTargetTerminal(TARGET_TERMINAL_EDEFAULT);
			return;
		case VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__SOURCE_DEPENDENCY:
			setSourceDependency((VTCDFigureDependency) null);
			return;
		case VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__DEST_ELEMENT:
			setDestElement((VTCDFigureElement) null);
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
		case VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__COLOR:
			return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT
					.equals(color);
		case VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__WIDTH:
			return width != WIDTH_EDEFAULT;
		case VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__BEND_POINTS:
			return bendPoints != null && !bendPoints.isEmpty();
		case VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__SOURCE_TERMINAL:
			return SOURCE_TERMINAL_EDEFAULT == null ? sourceTerminal != null
					: !SOURCE_TERMINAL_EDEFAULT.equals(sourceTerminal);
		case VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__TARGET_TERMINAL:
			return TARGET_TERMINAL_EDEFAULT == null ? targetTerminal != null
					: !TARGET_TERMINAL_EDEFAULT.equals(targetTerminal);
		case VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__SOURCE_DEPENDENCY:
			return getSourceDependency() != null;
		case VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT__DEST_ELEMENT:
			return destElement != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //VTCDLinkDependencyElementImpl
