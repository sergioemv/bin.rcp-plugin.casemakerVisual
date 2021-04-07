/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDLinkCombinationEClassImpl.java,v 1.7 2005/08/04 13:37:12 smoreno Exp $
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

import biz.bi.vtcd.model.VTCDFigureCombination;
import biz.bi.vtcd.model.VTCDFigureEquivalenceClass;
import biz.bi.vtcd.model.VTCDLinkCombinationEClass;
import biz.bi.vtcd.model.VTCDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Combination EClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDLinkCombinationEClassImpl#getSourceCombination <em>Source Combination</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDLinkCombinationEClassImpl#getDestEquivalenceClass <em>Dest Equivalence Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VTCDLinkCombinationEClassImpl extends VTCDAbstractLinkImpl
		implements VTCDLinkCombinationEClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getDestEquivalenceClass() <em>Dest Equivalence Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestEquivalenceClass()
	 * @generated
	 * @ordered
	 */
	protected VTCDFigureEquivalenceClass destEquivalenceClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTCDLinkCombinationEClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return VTCDPackage.eINSTANCE.getVTCDLinkCombinationEClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTCDFigureCombination getSourceCombination() {
		if (eContainerFeatureID != VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__SOURCE_COMBINATION)
			return null;
		return (VTCDFigureCombination) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceCombination(VTCDFigureCombination newSourceCombination) {
		if (newSourceCombination != eContainer
				|| (eContainerFeatureID != VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__SOURCE_COMBINATION && newSourceCombination != null)) {
			if (EcoreUtil.isAncestor(this, newSourceCombination))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSourceCombination != null)
				msgs = ((InternalEObject) newSourceCombination)
						.eInverseAdd(
								this,
								VTCDPackage.VTCD_FIGURE_COMBINATION__MVTCD_LINK_COMBINATION_ECLASS,
								VTCDFigureCombination.class, msgs);
			msgs = eBasicSetContainer(
					(InternalEObject) newSourceCombination,
					VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__SOURCE_COMBINATION,
					msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__SOURCE_COMBINATION,
					newSourceCombination, newSourceCombination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTCDFigureEquivalenceClass getDestEquivalenceClass() {
		if (destEquivalenceClass != null && destEquivalenceClass.eIsProxy()) {
			VTCDFigureEquivalenceClass oldDestEquivalenceClass = destEquivalenceClass;
			destEquivalenceClass = (VTCDFigureEquivalenceClass) eResolveProxy((InternalEObject) destEquivalenceClass);
			if (destEquivalenceClass != oldDestEquivalenceClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__DEST_EQUIVALENCE_CLASS,
							oldDestEquivalenceClass, destEquivalenceClass));
			}
		}
		return destEquivalenceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTCDFigureEquivalenceClass basicGetDestEquivalenceClass() {
		return destEquivalenceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestEquivalenceClass(
			VTCDFigureEquivalenceClass newDestEquivalenceClass,
			NotificationChain msgs) {
		VTCDFigureEquivalenceClass oldDestEquivalenceClass = destEquivalenceClass;
		destEquivalenceClass = newDestEquivalenceClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__DEST_EQUIVALENCE_CLASS,
					oldDestEquivalenceClass, newDestEquivalenceClass);
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
	public void setDestEquivalenceClass(
			VTCDFigureEquivalenceClass newDestEquivalenceClass) {
		if (newDestEquivalenceClass != destEquivalenceClass) {
			NotificationChain msgs = null;
			if (destEquivalenceClass != null)
				msgs = ((InternalEObject) destEquivalenceClass)
						.eInverseRemove(
								this,
								VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__MVTCD_LINK_COMBINATION_ECLASS,
								VTCDFigureEquivalenceClass.class, msgs);
			if (newDestEquivalenceClass != null)
				msgs = ((InternalEObject) newDestEquivalenceClass)
						.eInverseAdd(
								this,
								VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__MVTCD_LINK_COMBINATION_ECLASS,
								VTCDFigureEquivalenceClass.class, msgs);
			msgs = basicSetDestEquivalenceClass(newDestEquivalenceClass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__DEST_EQUIVALENCE_CLASS,
					newDestEquivalenceClass, newDestEquivalenceClass));
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
			case VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__SOURCE_COMBINATION:
				if (eContainer != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(
						otherEnd,
						VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__SOURCE_COMBINATION,
						msgs);
			case VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__DEST_EQUIVALENCE_CLASS:
				if (destEquivalenceClass != null)
					msgs = ((InternalEObject) destEquivalenceClass)
							.eInverseRemove(
									this,
									VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__MVTCD_LINK_COMBINATION_ECLASS,
									VTCDFigureEquivalenceClass.class, msgs);
				return basicSetDestEquivalenceClass(
						(VTCDFigureEquivalenceClass) otherEnd, msgs);
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
			case VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__SOURCE_COMBINATION:
				return eBasicSetContainer(
						null,
						VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__SOURCE_COMBINATION,
						msgs);
			case VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__DEST_EQUIVALENCE_CLASS:
				return basicSetDestEquivalenceClass(null, msgs);
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
			case VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__SOURCE_COMBINATION:
				return eContainer
						.eInverseRemove(
								this,
								VTCDPackage.VTCD_FIGURE_COMBINATION__MVTCD_LINK_COMBINATION_ECLASS,
								VTCDFigureCombination.class, msgs);
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
		case VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__COLOR:
			return getColor();
		case VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__WIDTH:
			return new Integer(getWidth());
		case VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__BEND_POINTS:
			return getBendPoints();
		case VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__SOURCE_TERMINAL:
			return getSourceTerminal();
		case VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__TARGET_TERMINAL:
			return getTargetTerminal();
		case VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__SOURCE_COMBINATION:
			return getSourceCombination();
		case VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__DEST_EQUIVALENCE_CLASS:
			if (resolve)
				return getDestEquivalenceClass();
			return basicGetDestEquivalenceClass();
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
		case VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__COLOR:
			setColor((Color) newValue);
			return;
		case VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__WIDTH:
			setWidth(((Integer) newValue).intValue());
			return;
		case VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__BEND_POINTS:
			getBendPoints().clear();
			getBendPoints().addAll((Collection) newValue);
			return;
		case VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__SOURCE_TERMINAL:
			setSourceTerminal((String) newValue);
			return;
		case VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__TARGET_TERMINAL:
			setTargetTerminal((String) newValue);
			return;
		case VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__SOURCE_COMBINATION:
			setSourceCombination((VTCDFigureCombination) newValue);
			return;
		case VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__DEST_EQUIVALENCE_CLASS:
			setDestEquivalenceClass((VTCDFigureEquivalenceClass) newValue);
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
		case VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__COLOR:
			setColor(COLOR_EDEFAULT);
			return;
		case VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__BEND_POINTS:
			getBendPoints().clear();
			return;
		case VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__SOURCE_TERMINAL:
			setSourceTerminal(SOURCE_TERMINAL_EDEFAULT);
			return;
		case VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__TARGET_TERMINAL:
			setTargetTerminal(TARGET_TERMINAL_EDEFAULT);
			return;
		case VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__SOURCE_COMBINATION:
			setSourceCombination((VTCDFigureCombination) null);
			return;
		case VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__DEST_EQUIVALENCE_CLASS:
			setDestEquivalenceClass((VTCDFigureEquivalenceClass) null);
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
		case VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__COLOR:
			return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT
					.equals(color);
		case VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__WIDTH:
			return width != WIDTH_EDEFAULT;
		case VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__BEND_POINTS:
			return bendPoints != null && !bendPoints.isEmpty();
		case VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__SOURCE_TERMINAL:
			return SOURCE_TERMINAL_EDEFAULT == null ? sourceTerminal != null
					: !SOURCE_TERMINAL_EDEFAULT.equals(sourceTerminal);
		case VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__TARGET_TERMINAL:
			return TARGET_TERMINAL_EDEFAULT == null ? targetTerminal != null
					: !TARGET_TERMINAL_EDEFAULT.equals(targetTerminal);
		case VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__SOURCE_COMBINATION:
			return getSourceCombination() != null;
		case VTCDPackage.VTCD_LINK_COMBINATION_ECLASS__DEST_EQUIVALENCE_CLASS:
			return destEquivalenceClass != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //VTCDLinkCombinationEClassImpl
