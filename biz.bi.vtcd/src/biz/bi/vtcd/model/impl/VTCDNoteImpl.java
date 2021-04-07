/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDNoteImpl.java,v 1.9 2005/08/26 15:43:09 smoreno Exp $
 */
package biz.bi.vtcd.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import biz.bi.vtcd.model.VTCDDiagram;
import biz.bi.vtcd.model.VTCDNote;
import biz.bi.vtcd.model.VTCDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDNoteImpl#getText <em>Text</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.impl.VTCDNoteImpl#getM_VTCDDiagram <em>MVTCD Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VTCDNoteImpl extends VTCDAbstractFigureImpl implements VTCDNote {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTCDNoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return VTCDPackage.eINSTANCE.getVTCDNote();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VTCDPackage.VTCD_NOTE__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTCDDiagram getM_VTCDDiagram() {
		if (eContainerFeatureID != VTCDPackage.VTCD_NOTE__MVTCD_DIAGRAM)
			return null;
		return (VTCDDiagram) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_VTCDDiagram(VTCDDiagram newM_VTCDDiagram) {
		if (newM_VTCDDiagram != eContainer
				|| (eContainerFeatureID != VTCDPackage.VTCD_NOTE__MVTCD_DIAGRAM && newM_VTCDDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newM_VTCDDiagram))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newM_VTCDDiagram != null)
				msgs = ((InternalEObject) newM_VTCDDiagram).eInverseAdd(this,
						VTCDPackage.VTCD_DIAGRAM__MVTCD_NOTE,
						VTCDDiagram.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newM_VTCDDiagram,
					VTCDPackage.VTCD_NOTE__MVTCD_DIAGRAM, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VTCDPackage.VTCD_NOTE__MVTCD_DIAGRAM, newM_VTCDDiagram,
					newM_VTCDDiagram));
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
			case VTCDPackage.VTCD_NOTE__MVTCD_DIAGRAM:
				if (eContainer != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
						VTCDPackage.VTCD_NOTE__MVTCD_DIAGRAM, msgs);
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
			case VTCDPackage.VTCD_NOTE__MVTCD_DIAGRAM:
				return eBasicSetContainer(null,
						VTCDPackage.VTCD_NOTE__MVTCD_DIAGRAM, msgs);
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
			case VTCDPackage.VTCD_NOTE__MVTCD_DIAGRAM:
				return eContainer.eInverseRemove(this,
						VTCDPackage.VTCD_DIAGRAM__MVTCD_NOTE,
						VTCDDiagram.class, msgs);
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
		case VTCDPackage.VTCD_NOTE__HEIGHT:
			return new Integer(getHeight());
		case VTCDPackage.VTCD_NOTE__WIDTH:
			return new Integer(getWidth());
		case VTCDPackage.VTCD_NOTE__X:
			return new Integer(getX());
		case VTCDPackage.VTCD_NOTE__Y:
			return new Integer(getY());
		case VTCDPackage.VTCD_NOTE__TEXT:
			return getText();
		case VTCDPackage.VTCD_NOTE__MVTCD_DIAGRAM:
			return getM_VTCDDiagram();
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
		case VTCDPackage.VTCD_NOTE__HEIGHT:
			setHeight(((Integer) newValue).intValue());
			return;
		case VTCDPackage.VTCD_NOTE__WIDTH:
			setWidth(((Integer) newValue).intValue());
			return;
		case VTCDPackage.VTCD_NOTE__X:
			setX(((Integer) newValue).intValue());
			return;
		case VTCDPackage.VTCD_NOTE__Y:
			setY(((Integer) newValue).intValue());
			return;
		case VTCDPackage.VTCD_NOTE__TEXT:
			setText((String) newValue);
			return;
		case VTCDPackage.VTCD_NOTE__MVTCD_DIAGRAM:
			setM_VTCDDiagram((VTCDDiagram) newValue);
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
		case VTCDPackage.VTCD_NOTE__HEIGHT:
			setHeight(HEIGHT_EDEFAULT);
			return;
		case VTCDPackage.VTCD_NOTE__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case VTCDPackage.VTCD_NOTE__X:
			setX(X_EDEFAULT);
			return;
		case VTCDPackage.VTCD_NOTE__Y:
			setY(Y_EDEFAULT);
			return;
		case VTCDPackage.VTCD_NOTE__TEXT:
			setText(TEXT_EDEFAULT);
			return;
		case VTCDPackage.VTCD_NOTE__MVTCD_DIAGRAM:
			setM_VTCDDiagram((VTCDDiagram) null);
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
		case VTCDPackage.VTCD_NOTE__HEIGHT:
			return height != HEIGHT_EDEFAULT;
		case VTCDPackage.VTCD_NOTE__WIDTH:
			return width != WIDTH_EDEFAULT;
		case VTCDPackage.VTCD_NOTE__X:
			return x != X_EDEFAULT;
		case VTCDPackage.VTCD_NOTE__Y:
			return y != Y_EDEFAULT;
		case VTCDPackage.VTCD_NOTE__TEXT:
			return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT
					.equals(text);
		case VTCDPackage.VTCD_NOTE__MVTCD_DIAGRAM:
			return getM_VTCDDiagram() != null;
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
		result.append(" (text: "); //$NON-NLS-1$
		result.append(text);
		result.append(')');
		return result.toString();
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.model.impl.VTCDAbstractFigureImpl#getLinks()
	 */
	public EList getLinks() {
		//no links to the notes?
		return null;
	}

} //VTCDNoteImpl
