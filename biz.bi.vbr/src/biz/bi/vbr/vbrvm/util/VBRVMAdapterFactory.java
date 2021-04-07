/**
 * <copyright>
 * </copyright>
 *
 * $Id: VBRVMAdapterFactory.java,v 1.3 2005/09/09 17:29:34 svonborries Exp $
 */
package biz.bi.vbr.vbrvm.util;

import biz.bi.vbr.vbrvm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see biz.bi.vbr.vbrvm.VBRVMPackage
 * @generated
 */
public class VBRVMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VBRVMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRVMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VBRVMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VBRVMSwitch modelSwitch = new VBRVMSwitch() {
		public Object caseMainDiagram(MainDiagram object) {
			return createMainDiagramAdapter();
		}

		public Object caseVBRTreeView(VBRTreeView object) {
			return createVBRTreeViewAdapter();
		}

		public Object caseVBRElementView(VBRElementView object) {
			return createVBRElementViewAdapter();
		}

		public Object caseAbstractView(AbstractView object) {
			return createAbstractViewAdapter();
		}

		public Object caseVBRElementValueView(VBRElementValueView object) {
			return createVBRElementValueViewAdapter();
		}

		public Object caseVBRActionView(VBRActionView object) {
			return createVBRActionViewAdapter();
		}

		public Object caseAbstractLine(AbstractLine object) {
			return createAbstractLineAdapter();
		}

		public Object caseVBRElementConnectElementValue(
				VBRElementConnectElementValue object) {
			return createVBRElementConnectElementValueAdapter();
		}

		public Object caseVBRElementValueConnectElementValue(
				VBRElementValueConnectElementValue object) {
			return createVBRElementValueConnectElementValueAdapter();
		}

		public Object caseVBRElementValueConnectAction(
				VBRElementValueConnectAction object) {
			return createVBRElementValueConnectActionAdapter();
		}

		public Object caseVBRActionConnectElementValue(
				VBRActionConnectElementValue object) {
			return createVBRActionConnectElementValueAdapter();
		}

		public Object caseVBRTreeConnectElementValue(
				VBRTreeConnectElementValue object) {
			return createVBRTreeConnectElementValueAdapter();
		}

		public Object defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter) modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.vbr.vbrvm.MainDiagram <em>Main Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.vbr.vbrvm.MainDiagram
	 * @generated
	 */
	public Adapter createMainDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.vbr.vbrvm.VBRTreeView <em>VBR Tree View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.vbr.vbrvm.VBRTreeView
	 * @generated
	 */
	public Adapter createVBRTreeViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.vbr.vbrvm.VBRElementView <em>VBR Element View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.vbr.vbrvm.VBRElementView
	 * @generated
	 */
	public Adapter createVBRElementViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.vbr.vbrvm.AbstractView <em>Abstract View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.vbr.vbrvm.AbstractView
	 * @generated
	 */
	public Adapter createAbstractViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.vbr.vbrvm.VBRElementValueView <em>VBR Element Value View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.vbr.vbrvm.VBRElementValueView
	 * @generated
	 */
	public Adapter createVBRElementValueViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.vbr.vbrvm.VBRActionView <em>VBR Action View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.vbr.vbrvm.VBRActionView
	 * @generated
	 */
	public Adapter createVBRActionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.vbr.vbrvm.AbstractLine <em>Abstract Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.vbr.vbrvm.AbstractLine
	 * @generated
	 */
	public Adapter createAbstractLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.vbr.vbrvm.VBRElementConnectElementValue <em>VBR Element Connect Element Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.vbr.vbrvm.VBRElementConnectElementValue
	 * @generated
	 */
	public Adapter createVBRElementConnectElementValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.vbr.vbrvm.VBRElementValueConnectElementValue <em>VBR Element Value Connect Element Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.vbr.vbrvm.VBRElementValueConnectElementValue
	 * @generated
	 */
	public Adapter createVBRElementValueConnectElementValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.vbr.vbrvm.VBRElementValueConnectAction <em>VBR Element Value Connect Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.vbr.vbrvm.VBRElementValueConnectAction
	 * @generated
	 */
	public Adapter createVBRElementValueConnectActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.vbr.vbrvm.VBRActionConnectElementValue <em>VBR Action Connect Element Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.vbr.vbrvm.VBRActionConnectElementValue
	 * @generated
	 */
	public Adapter createVBRActionConnectElementValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.vbr.vbrvm.VBRTreeConnectElementValue <em>VBR Tree Connect Element Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.vbr.vbrvm.VBRTreeConnectElementValue
	 * @generated
	 */
	public Adapter createVBRTreeConnectElementValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //VBRVMAdapterFactory
