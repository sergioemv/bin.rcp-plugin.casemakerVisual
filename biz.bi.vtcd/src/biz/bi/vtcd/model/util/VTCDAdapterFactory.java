/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDAdapterFactory.java,v 1.8 2005/08/26 15:43:09 smoreno Exp $
 */
package biz.bi.vtcd.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import biz.bi.vtcd.model.VTCDAbstractFigure;
import biz.bi.vtcd.model.VTCDAbstractLink;
import biz.bi.vtcd.model.VTCDCMProxyFigure;
import biz.bi.vtcd.model.VTCDDiagram;
import biz.bi.vtcd.model.VTCDDiagramCombination;
import biz.bi.vtcd.model.VTCDDiagramMain;
import biz.bi.vtcd.model.VTCDFigureCombination;
import biz.bi.vtcd.model.VTCDFigureDependency;
import biz.bi.vtcd.model.VTCDFigureElement;
import biz.bi.vtcd.model.VTCDFigureEquivalenceClass;
import biz.bi.vtcd.model.VTCDLinkCombinationEClass;
import biz.bi.vtcd.model.VTCDLinkDependencyElement;
import biz.bi.vtcd.model.VTCDNote;
import biz.bi.vtcd.model.VTCDPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see biz.bi.vtcd.model.VTCDPackage
 * @generated
 */
public class VTCDAdapterFactory extends AdapterFactoryImpl {
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
	protected static VTCDPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTCDAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VTCDPackage.eINSTANCE;
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
	protected VTCDSwitch modelSwitch = new VTCDSwitch() {
		public Object caseVTCDDiagramCombination(VTCDDiagramCombination object) {
			return createVTCDDiagramCombinationAdapter();
		}

		public Object caseVTCDDiagramMain(VTCDDiagramMain object) {
			return createVTCDDiagramMainAdapter();
		}

		public Object caseVTCDFigureCombination(VTCDFigureCombination object) {
			return createVTCDFigureCombinationAdapter();
		}

		public Object caseVTCDFigureElement(VTCDFigureElement object) {
			return createVTCDFigureElementAdapter();
		}

		public Object caseVTCDFigureDependency(VTCDFigureDependency object) {
			return createVTCDFigureDependencyAdapter();
		}

		public Object caseVTCDFigureEquivalenceClass(
				VTCDFigureEquivalenceClass object) {
			return createVTCDFigureEquivalenceClassAdapter();
		}

		public Object caseVTCDAbstractFigure(VTCDAbstractFigure object) {
			return createVTCDAbstractFigureAdapter();
		}

		public Object caseVTCDLinkDependencyElement(
				VTCDLinkDependencyElement object) {
			return createVTCDLinkDependencyElementAdapter();
		}

		public Object caseVTCDLinkCombinationEClass(
				VTCDLinkCombinationEClass object) {
			return createVTCDLinkCombinationEClassAdapter();
		}

		public Object caseVTCDAbstractLink(VTCDAbstractLink object) {
			return createVTCDAbstractLinkAdapter();
		}

		public Object caseVTCDNote(VTCDNote object) {
			return createVTCDNoteAdapter();
		}

		public Object caseVTCDDiagram(VTCDDiagram object) {
			return createVTCDDiagramAdapter();
		}

		public Object caseVTCDCMProxyFigure(VTCDCMProxyFigure object) {
			return createVTCDCMProxyFigureAdapter();
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
	 * Creates a new adapter for an object of class '{@link biz.bi.vtcd.model.VTCDDiagramCombination <em>Diagram Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.vtcd.model.VTCDDiagramCombination
	 * @generated
	 */
	public Adapter createVTCDDiagramCombinationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.vtcd.model.VTCDDiagramMain <em>Diagram Main</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.vtcd.model.VTCDDiagramMain
	 * @generated
	 */
	public Adapter createVTCDDiagramMainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.vtcd.model.VTCDFigureCombination <em>Figure Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.vtcd.model.VTCDFigureCombination
	 * @generated
	 */
	public Adapter createVTCDFigureCombinationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.vtcd.model.VTCDFigureElement <em>Figure Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.vtcd.model.VTCDFigureElement
	 * @generated
	 */
	public Adapter createVTCDFigureElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.vtcd.model.VTCDFigureDependency <em>Figure Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.vtcd.model.VTCDFigureDependency
	 * @generated
	 */
	public Adapter createVTCDFigureDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.vtcd.model.VTCDFigureEquivalenceClass <em>Figure Equivalence Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.vtcd.model.VTCDFigureEquivalenceClass
	 * @generated
	 */
	public Adapter createVTCDFigureEquivalenceClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.vtcd.model.VTCDAbstractFigure <em>Abstract Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.vtcd.model.VTCDAbstractFigure
	 * @generated
	 */
	public Adapter createVTCDAbstractFigureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.vtcd.model.VTCDLinkDependencyElement <em>Link Dependency Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.vtcd.model.VTCDLinkDependencyElement
	 * @generated
	 */
	public Adapter createVTCDLinkDependencyElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.vtcd.model.VTCDLinkCombinationEClass <em>Link Combination EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.vtcd.model.VTCDLinkCombinationEClass
	 * @generated
	 */
	public Adapter createVTCDLinkCombinationEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.vtcd.model.VTCDAbstractLink <em>Abstract Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.vtcd.model.VTCDAbstractLink
	 * @generated
	 */
	public Adapter createVTCDAbstractLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.vtcd.model.VTCDNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.vtcd.model.VTCDNote
	 * @generated
	 */
	public Adapter createVTCDNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.vtcd.model.VTCDDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.vtcd.model.VTCDDiagram
	 * @generated
	 */
	public Adapter createVTCDDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link biz.bi.vtcd.model.VTCDCMProxyFigure <em>CM Proxy Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see biz.bi.vtcd.model.VTCDCMProxyFigure
	 * @generated
	 */
	public Adapter createVTCDCMProxyFigureAdapter() {
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

} //VTCDAdapterFactory
