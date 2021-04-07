/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDPackageImpl.java,v 1.18 2005/08/26 15:43:09 smoreno Exp $
 */
package biz.bi.vtcd.model.impl;

import org.eclipse.draw2d.AbsoluteBendpoint;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.swt.graphics.Color;

import biz.bi.cmcore.model.CMProxyCombination;
import biz.bi.cmcore.model.CMProxyDependency;
import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.cmcore.model.CMProxyTestObject;
import biz.bi.vtcd.model.VTCDAbstractFigure;
import biz.bi.vtcd.model.VTCDAbstractLink;
import biz.bi.vtcd.model.VTCDCMProxyFigure;
import biz.bi.vtcd.model.VTCDDiagram;
import biz.bi.vtcd.model.VTCDDiagramCombination;
import biz.bi.vtcd.model.VTCDDiagramMain;
import biz.bi.vtcd.model.VTCDFactory;
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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VTCDPackageImpl extends EPackageImpl implements VTCDPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vtcdDiagramCombinationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vtcdDiagramMainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vtcdFigureCombinationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vtcdFigureElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vtcdFigureDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vtcdFigureEquivalenceClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vtcdAbstractFigureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vtcdLinkDependencyElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vtcdLinkCombinationEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vtcdAbstractLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vtcdNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vtcdDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vtcdcmProxyFigureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType testObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dependencyEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType elementEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType combinationEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType equivalenceClassEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType absoluteBendPointEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see biz.bi.vtcd.model.VTCDPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VTCDPackageImpl() {
		super(eNS_URI, VTCDFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VTCDPackage init() {
		if (isInited)
			return (VTCDPackage) EPackage.Registry.INSTANCE
					.getEPackage(VTCDPackage.eNS_URI);

		// Obtain or create and register package
		VTCDPackageImpl theVTCDPackage = (VTCDPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI) instanceof VTCDPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI)
				: new VTCDPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theVTCDPackage.createPackageContents();

		// Initialize created meta-data
		theVTCDPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVTCDPackage.freeze();

		return theVTCDPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTCDDiagramCombination() {
		return vtcdDiagramCombinationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTCDDiagramCombination_M_VTCDFigureCombination() {
		return (EReference) vtcdDiagramCombinationEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTCDDiagramCombination_M_VTCDFigureElement() {
		return (EReference) vtcdDiagramCombinationEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTCDDiagramCombination_M_FigureDependency() {
		return (EReference) vtcdDiagramCombinationEClass
				.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTCDDiagramMain() {
		return vtcdDiagramMainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTCDDiagramMain_M_VTCDFigureElement() {
		return (EReference) vtcdDiagramMainEClass.getEStructuralFeatures().get(
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTCDDiagramMain_M_VTCDFigureDependency() {
		return (EReference) vtcdDiagramMainEClass.getEStructuralFeatures().get(
				1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTCDDiagramMain_M_TestObject() {
		return (EAttribute) vtcdDiagramMainEClass.getEStructuralFeatures().get(
				2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTCDFigureCombination() {
		return vtcdFigureCombinationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTCDFigureCombination_M_VTCDDiagramCombination() {
		return (EReference) vtcdFigureCombinationEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTCDFigureCombination_M_VTCDLinkCombinationEClass() {
		return (EReference) vtcdFigureCombinationEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTCDFigureCombination_M_Combination() {
		return (EAttribute) vtcdFigureCombinationEClass
				.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTCDFigureElement() {
		return vtcdFigureElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTCDFigureElement_M_VTCDDiagramCombination() {
		return (EReference) vtcdFigureElementEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTCDFigureElement_M_VTCDDiagramMain() {
		return (EReference) vtcdFigureElementEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTCDFigureElement_M_VTCDFigureEquivalenceClass() {
		return (EReference) vtcdFigureElementEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTCDFigureElement_M_VTCDLinkDependencyElement() {
		return (EReference) vtcdFigureElementEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTCDFigureElement_M_Element() {
		return (EAttribute) vtcdFigureElementEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTCDFigureElement_Icon() {
		return (EAttribute) vtcdFigureElementEClass.getEStructuralFeatures()
				.get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTCDFigureElement_Folded() {
		return (EAttribute) vtcdFigureElementEClass.getEStructuralFeatures()
				.get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTCDFigureDependency() {
		return vtcdFigureDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTCDFigureDependency_M_VTCDDiagramMain() {
		return (EReference) vtcdFigureDependencyEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTCDFigureDependency_Icon() {
		return (EAttribute) vtcdFigureDependencyEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTCDFigureDependency_M_VTCDLinkDependencyElement() {
		return (EReference) vtcdFigureDependencyEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTCDFigureDependency_M_Dependency() {
		return (EAttribute) vtcdFigureDependencyEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTCDFigureDependency_M_VTCDDiagramCombination() {
		return (EReference) vtcdFigureDependencyEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTCDFigureEquivalenceClass() {
		return vtcdFigureEquivalenceClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTCDFigureEquivalenceClass_M_VTCDFigureElement() {
		return (EReference) vtcdFigureEquivalenceClassEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTCDFigureEquivalenceClass_M_VTCDLinkCombinationEClass() {
		return (EReference) vtcdFigureEquivalenceClassEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTCDFigureEquivalenceClass_M_EquivalenceClass() {
		return (EAttribute) vtcdFigureEquivalenceClassEClass
				.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTCDAbstractFigure() {
		return vtcdAbstractFigureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTCDAbstractFigure_Height() {
		return (EAttribute) vtcdAbstractFigureEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTCDAbstractFigure_Width() {
		return (EAttribute) vtcdAbstractFigureEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTCDAbstractFigure_X() {
		return (EAttribute) vtcdAbstractFigureEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTCDAbstractFigure_Y() {
		return (EAttribute) vtcdAbstractFigureEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTCDLinkDependencyElement() {
		return vtcdLinkDependencyElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTCDLinkDependencyElement_SourceDependency() {
		return (EReference) vtcdLinkDependencyElementEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTCDLinkDependencyElement_DestElement() {
		return (EReference) vtcdLinkDependencyElementEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTCDLinkCombinationEClass() {
		return vtcdLinkCombinationEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTCDLinkCombinationEClass_SourceCombination() {
		return (EReference) vtcdLinkCombinationEClassEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTCDLinkCombinationEClass_DestEquivalenceClass() {
		return (EReference) vtcdLinkCombinationEClassEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTCDAbstractLink() {
		return vtcdAbstractLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTCDAbstractLink_Color() {
		return (EAttribute) vtcdAbstractLinkEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTCDAbstractLink_Width() {
		return (EAttribute) vtcdAbstractLinkEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTCDAbstractLink_BendPoints() {
		return (EAttribute) vtcdAbstractLinkEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTCDAbstractLink_SourceTerminal() {
		return (EAttribute) vtcdAbstractLinkEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTCDAbstractLink_TargetTerminal() {
		return (EAttribute) vtcdAbstractLinkEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTCDNote() {
		return vtcdNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTCDNote_Text() {
		return (EAttribute) vtcdNoteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTCDNote_M_VTCDDiagram() {
		return (EReference) vtcdNoteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTCDDiagram() {
		return vtcdDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTCDDiagram_M_VTCDNote() {
		return (EReference) vtcdDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTCDCMProxyFigure() {
		return vtcdcmProxyFigureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTestObject() {
		return testObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDependency() {
		return dependencyEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColor() {
		return colorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getElement() {
		return elementEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCombination() {
		return combinationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEquivalenceClass() {
		return equivalenceClassEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAbsoluteBendPoint() {
		return absoluteBendPointEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTCDFactory getVTCDFactory() {
		return (VTCDFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		vtcdDiagramCombinationEClass = createEClass(VTCD_DIAGRAM_COMBINATION);
		createEReference(vtcdDiagramCombinationEClass,
				VTCD_DIAGRAM_COMBINATION__MVTCD_FIGURE_COMBINATION);
		createEReference(vtcdDiagramCombinationEClass,
				VTCD_DIAGRAM_COMBINATION__MVTCD_FIGURE_ELEMENT);
		createEReference(vtcdDiagramCombinationEClass,
				VTCD_DIAGRAM_COMBINATION__MFIGURE_DEPENDENCY);

		vtcdDiagramMainEClass = createEClass(VTCD_DIAGRAM_MAIN);
		createEReference(vtcdDiagramMainEClass,
				VTCD_DIAGRAM_MAIN__MVTCD_FIGURE_ELEMENT);
		createEReference(vtcdDiagramMainEClass,
				VTCD_DIAGRAM_MAIN__MVTCD_FIGURE_DEPENDENCY);
		createEAttribute(vtcdDiagramMainEClass, VTCD_DIAGRAM_MAIN__MTEST_OBJECT);

		vtcdFigureCombinationEClass = createEClass(VTCD_FIGURE_COMBINATION);
		createEReference(vtcdFigureCombinationEClass,
				VTCD_FIGURE_COMBINATION__MVTCD_DIAGRAM_COMBINATION);
		createEReference(vtcdFigureCombinationEClass,
				VTCD_FIGURE_COMBINATION__MVTCD_LINK_COMBINATION_ECLASS);
		createEAttribute(vtcdFigureCombinationEClass,
				VTCD_FIGURE_COMBINATION__MCOMBINATION);

		vtcdFigureElementEClass = createEClass(VTCD_FIGURE_ELEMENT);
		createEReference(vtcdFigureElementEClass,
				VTCD_FIGURE_ELEMENT__MVTCD_DIAGRAM_COMBINATION);
		createEReference(vtcdFigureElementEClass,
				VTCD_FIGURE_ELEMENT__MVTCD_DIAGRAM_MAIN);
		createEReference(vtcdFigureElementEClass,
				VTCD_FIGURE_ELEMENT__MVTCD_FIGURE_EQUIVALENCE_CLASS);
		createEReference(vtcdFigureElementEClass,
				VTCD_FIGURE_ELEMENT__MVTCD_LINK_DEPENDENCY_ELEMENT);
		createEAttribute(vtcdFigureElementEClass, VTCD_FIGURE_ELEMENT__MELEMENT);
		createEAttribute(vtcdFigureElementEClass, VTCD_FIGURE_ELEMENT__ICON);
		createEAttribute(vtcdFigureElementEClass, VTCD_FIGURE_ELEMENT__FOLDED);

		vtcdFigureDependencyEClass = createEClass(VTCD_FIGURE_DEPENDENCY);
		createEReference(vtcdFigureDependencyEClass,
				VTCD_FIGURE_DEPENDENCY__MVTCD_DIAGRAM_MAIN);
		createEAttribute(vtcdFigureDependencyEClass,
				VTCD_FIGURE_DEPENDENCY__ICON);
		createEReference(vtcdFigureDependencyEClass,
				VTCD_FIGURE_DEPENDENCY__MVTCD_LINK_DEPENDENCY_ELEMENT);
		createEAttribute(vtcdFigureDependencyEClass,
				VTCD_FIGURE_DEPENDENCY__MDEPENDENCY);
		createEReference(vtcdFigureDependencyEClass,
				VTCD_FIGURE_DEPENDENCY__MVTCD_DIAGRAM_COMBINATION);

		vtcdFigureEquivalenceClassEClass = createEClass(VTCD_FIGURE_EQUIVALENCE_CLASS);
		createEReference(vtcdFigureEquivalenceClassEClass,
				VTCD_FIGURE_EQUIVALENCE_CLASS__MVTCD_FIGURE_ELEMENT);
		createEReference(vtcdFigureEquivalenceClassEClass,
				VTCD_FIGURE_EQUIVALENCE_CLASS__MVTCD_LINK_COMBINATION_ECLASS);
		createEAttribute(vtcdFigureEquivalenceClassEClass,
				VTCD_FIGURE_EQUIVALENCE_CLASS__MEQUIVALENCE_CLASS);

		vtcdAbstractFigureEClass = createEClass(VTCD_ABSTRACT_FIGURE);
		createEAttribute(vtcdAbstractFigureEClass, VTCD_ABSTRACT_FIGURE__HEIGHT);
		createEAttribute(vtcdAbstractFigureEClass, VTCD_ABSTRACT_FIGURE__WIDTH);
		createEAttribute(vtcdAbstractFigureEClass, VTCD_ABSTRACT_FIGURE__X);
		createEAttribute(vtcdAbstractFigureEClass, VTCD_ABSTRACT_FIGURE__Y);

		vtcdLinkDependencyElementEClass = createEClass(VTCD_LINK_DEPENDENCY_ELEMENT);
		createEReference(vtcdLinkDependencyElementEClass,
				VTCD_LINK_DEPENDENCY_ELEMENT__SOURCE_DEPENDENCY);
		createEReference(vtcdLinkDependencyElementEClass,
				VTCD_LINK_DEPENDENCY_ELEMENT__DEST_ELEMENT);

		vtcdLinkCombinationEClassEClass = createEClass(VTCD_LINK_COMBINATION_ECLASS);
		createEReference(vtcdLinkCombinationEClassEClass,
				VTCD_LINK_COMBINATION_ECLASS__SOURCE_COMBINATION);
		createEReference(vtcdLinkCombinationEClassEClass,
				VTCD_LINK_COMBINATION_ECLASS__DEST_EQUIVALENCE_CLASS);

		vtcdAbstractLinkEClass = createEClass(VTCD_ABSTRACT_LINK);
		createEAttribute(vtcdAbstractLinkEClass, VTCD_ABSTRACT_LINK__COLOR);
		createEAttribute(vtcdAbstractLinkEClass, VTCD_ABSTRACT_LINK__WIDTH);
		createEAttribute(vtcdAbstractLinkEClass,
				VTCD_ABSTRACT_LINK__BEND_POINTS);
		createEAttribute(vtcdAbstractLinkEClass,
				VTCD_ABSTRACT_LINK__SOURCE_TERMINAL);
		createEAttribute(vtcdAbstractLinkEClass,
				VTCD_ABSTRACT_LINK__TARGET_TERMINAL);

		vtcdNoteEClass = createEClass(VTCD_NOTE);
		createEAttribute(vtcdNoteEClass, VTCD_NOTE__TEXT);
		createEReference(vtcdNoteEClass, VTCD_NOTE__MVTCD_DIAGRAM);

		vtcdDiagramEClass = createEClass(VTCD_DIAGRAM);
		createEReference(vtcdDiagramEClass, VTCD_DIAGRAM__MVTCD_NOTE);

		vtcdcmProxyFigureEClass = createEClass(VTCD_CM_PROXY_FIGURE);

		// Create data types
		testObjectEDataType = createEDataType(TEST_OBJECT);
		dependencyEDataType = createEDataType(DEPENDENCY);
		colorEDataType = createEDataType(COLOR);
		elementEDataType = createEDataType(ELEMENT);
		combinationEDataType = createEDataType(COMBINATION);
		equivalenceClassEDataType = createEDataType(EQUIVALENCE_CLASS);
		absoluteBendPointEDataType = createEDataType(ABSOLUTE_BEND_POINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Add supertypes to classes
		vtcdDiagramCombinationEClass.getESuperTypes()
				.add(this.getVTCDDiagram());
		vtcdDiagramCombinationEClass.getESuperTypes().add(
				this.getVTCDCMProxyFigure());
		vtcdDiagramMainEClass.getESuperTypes().add(this.getVTCDDiagram());
		vtcdDiagramMainEClass.getESuperTypes().add(this.getVTCDCMProxyFigure());
		vtcdFigureCombinationEClass.getESuperTypes().add(
				this.getVTCDAbstractFigure());
		vtcdFigureCombinationEClass.getESuperTypes().add(
				this.getVTCDCMProxyFigure());
		vtcdFigureElementEClass.getESuperTypes().add(
				this.getVTCDAbstractFigure());
		vtcdFigureElementEClass.getESuperTypes().add(
				this.getVTCDCMProxyFigure());
		vtcdFigureDependencyEClass.getESuperTypes().add(
				this.getVTCDAbstractFigure());
		vtcdFigureDependencyEClass.getESuperTypes().add(
				this.getVTCDCMProxyFigure());
		vtcdFigureEquivalenceClassEClass.getESuperTypes().add(
				this.getVTCDAbstractFigure());
		vtcdFigureEquivalenceClassEClass.getESuperTypes().add(
				this.getVTCDCMProxyFigure());
		vtcdLinkDependencyElementEClass.getESuperTypes().add(
				this.getVTCDAbstractLink());
		vtcdLinkCombinationEClassEClass.getESuperTypes().add(
				this.getVTCDAbstractLink());
		vtcdNoteEClass.getESuperTypes().add(this.getVTCDAbstractFigure());

		// Initialize classes and features; add operations and parameters
		initEClass(
				vtcdDiagramCombinationEClass,
				VTCDDiagramCombination.class,
				"VTCDDiagramCombination", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getVTCDDiagramCombination_M_VTCDFigureCombination(),
				this.getVTCDFigureCombination(),
				this.getVTCDFigureCombination_M_VTCDDiagramCombination(),
				"m_VTCDFigureCombination", null, 0, -1, VTCDDiagramCombination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getVTCDDiagramCombination_M_VTCDFigureElement(),
				this.getVTCDFigureElement(),
				this.getVTCDFigureElement_M_VTCDDiagramCombination(),
				"m_VTCDFigureElement", null, 0, -1, VTCDDiagramCombination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getVTCDDiagramCombination_M_FigureDependency(),
				this.getVTCDFigureDependency(),
				this.getVTCDFigureDependency_M_VTCDDiagramCombination(),
				"m_FigureDependency", null, 1, 1, VTCDDiagramCombination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				vtcdDiagramMainEClass,
				VTCDDiagramMain.class,
				"VTCDDiagramMain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getVTCDDiagramMain_M_VTCDFigureElement(),
				this.getVTCDFigureElement(),
				this.getVTCDFigureElement_M_VTCDDiagramMain(),
				"m_VTCDFigureElement", null, 0, -1, VTCDDiagramMain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getVTCDDiagramMain_M_VTCDFigureDependency(),
				this.getVTCDFigureDependency(),
				this.getVTCDFigureDependency_M_VTCDDiagramMain(),
				"m_VTCDFigureDependency", null, 0, -1, VTCDDiagramMain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getVTCDDiagramMain_M_TestObject(),
				this.getTestObject(),
				"m_TestObject", null, 1, 1, VTCDDiagramMain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				vtcdFigureCombinationEClass,
				VTCDFigureCombination.class,
				"VTCDFigureCombination", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getVTCDFigureCombination_M_VTCDDiagramCombination(),
				this.getVTCDDiagramCombination(),
				this.getVTCDDiagramCombination_M_VTCDFigureCombination(),
				"m_VTCDDiagramCombination", null, 1, 1, VTCDFigureCombination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getVTCDFigureCombination_M_VTCDLinkCombinationEClass(),
				this.getVTCDLinkCombinationEClass(),
				this.getVTCDLinkCombinationEClass_SourceCombination(),
				"m_VTCDLinkCombinationEClass", null, 0, -1, VTCDFigureCombination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getVTCDFigureCombination_M_Combination(),
				this.getCombination(),
				"m_Combination", null, 1, 1, VTCDFigureCombination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				vtcdFigureElementEClass,
				VTCDFigureElement.class,
				"VTCDFigureElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getVTCDFigureElement_M_VTCDDiagramCombination(),
				this.getVTCDDiagramCombination(),
				this.getVTCDDiagramCombination_M_VTCDFigureElement(),
				"m_VTCDDiagramCombination", null, 1, 1, VTCDFigureElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getVTCDFigureElement_M_VTCDDiagramMain(),
				this.getVTCDDiagramMain(),
				this.getVTCDDiagramMain_M_VTCDFigureElement(),
				"m_VTCDDiagramMain", null, 1, 1, VTCDFigureElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getVTCDFigureElement_M_VTCDFigureEquivalenceClass(),
				this.getVTCDFigureEquivalenceClass(),
				this.getVTCDFigureEquivalenceClass_M_VTCDFigureElement(),
				"m_VTCDFigureEquivalenceClass", null, 0, -1, VTCDFigureElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getVTCDFigureElement_M_VTCDLinkDependencyElement(),
				this.getVTCDLinkDependencyElement(),
				this.getVTCDLinkDependencyElement_DestElement(),
				"m_VTCDLinkDependencyElement", null, 0, -1, VTCDFigureElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getVTCDFigureElement_M_Element(),
				this.getElement(),
				"m_Element", null, 1, 1, VTCDFigureElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getVTCDFigureElement_Icon(),
				ecorePackage.getEString(),
				"icon", null, 0, 1, VTCDFigureElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getVTCDFigureElement_Folded(),
				ecorePackage.getEBoolean(),
				"folded", null, 0, 1, VTCDFigureElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				vtcdFigureDependencyEClass,
				VTCDFigureDependency.class,
				"VTCDFigureDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getVTCDFigureDependency_M_VTCDDiagramMain(),
				this.getVTCDDiagramMain(),
				this.getVTCDDiagramMain_M_VTCDFigureDependency(),
				"m_VTCDDiagramMain", null, 1, 1, VTCDFigureDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getVTCDFigureDependency_Icon(),
				ecorePackage.getEString(),
				"icon", null, 0, 1, VTCDFigureDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getVTCDFigureDependency_M_VTCDLinkDependencyElement(),
				this.getVTCDLinkDependencyElement(),
				this.getVTCDLinkDependencyElement_SourceDependency(),
				"m_VTCDLinkDependencyElement", null, 0, -1, VTCDFigureDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getVTCDFigureDependency_M_Dependency(),
				this.getDependency(),
				"m_Dependency", null, 1, 1, VTCDFigureDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getVTCDFigureDependency_M_VTCDDiagramCombination(),
				this.getVTCDDiagramCombination(),
				this.getVTCDDiagramCombination_M_FigureDependency(),
				"m_VTCDDiagramCombination", null, 1, 1, VTCDFigureDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				vtcdFigureEquivalenceClassEClass,
				VTCDFigureEquivalenceClass.class,
				"VTCDFigureEquivalenceClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getVTCDFigureEquivalenceClass_M_VTCDFigureElement(),
				this.getVTCDFigureElement(),
				this.getVTCDFigureElement_M_VTCDFigureEquivalenceClass(),
				"m_VTCDFigureElement", null, 1, 1, VTCDFigureEquivalenceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getVTCDFigureEquivalenceClass_M_VTCDLinkCombinationEClass(),
				this.getVTCDLinkCombinationEClass(),
				this.getVTCDLinkCombinationEClass_DestEquivalenceClass(),
				"m_VTCDLinkCombinationEClass", null, 0, -1, VTCDFigureEquivalenceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getVTCDFigureEquivalenceClass_M_EquivalenceClass(),
				this.getEquivalenceClass(),
				"m_EquivalenceClass", null, 1, 1, VTCDFigureEquivalenceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				vtcdAbstractFigureEClass,
				VTCDAbstractFigure.class,
				"VTCDAbstractFigure", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getVTCDAbstractFigure_Height(),
				ecorePackage.getEInt(),
				"height", null, 0, 1, VTCDAbstractFigure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getVTCDAbstractFigure_Width(),
				ecorePackage.getEInt(),
				"width", null, 0, 1, VTCDAbstractFigure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getVTCDAbstractFigure_X(),
				ecorePackage.getEInt(),
				"x", null, 0, 1, VTCDAbstractFigure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getVTCDAbstractFigure_Y(),
				ecorePackage.getEInt(),
				"y", null, 0, 1, VTCDAbstractFigure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(vtcdAbstractFigureEClass, ecorePackage.getEEList(),
				"getLinks"); //$NON-NLS-1$

		initEClass(
				vtcdLinkDependencyElementEClass,
				VTCDLinkDependencyElement.class,
				"VTCDLinkDependencyElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getVTCDLinkDependencyElement_SourceDependency(),
				this.getVTCDFigureDependency(),
				this.getVTCDFigureDependency_M_VTCDLinkDependencyElement(),
				"sourceDependency", null, 1, 1, VTCDLinkDependencyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getVTCDLinkDependencyElement_DestElement(),
				this.getVTCDFigureElement(),
				this.getVTCDFigureElement_M_VTCDLinkDependencyElement(),
				"destElement", null, 1, 1, VTCDLinkDependencyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				vtcdLinkCombinationEClassEClass,
				VTCDLinkCombinationEClass.class,
				"VTCDLinkCombinationEClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getVTCDLinkCombinationEClass_SourceCombination(),
				this.getVTCDFigureCombination(),
				this.getVTCDFigureCombination_M_VTCDLinkCombinationEClass(),
				"sourceCombination", null, 1, 1, VTCDLinkCombinationEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getVTCDLinkCombinationEClass_DestEquivalenceClass(),
				this.getVTCDFigureEquivalenceClass(),
				this
						.getVTCDFigureEquivalenceClass_M_VTCDLinkCombinationEClass(),
				"destEquivalenceClass", null, 1, 1, VTCDLinkCombinationEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				vtcdAbstractLinkEClass,
				VTCDAbstractLink.class,
				"VTCDAbstractLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getVTCDAbstractLink_Color(),
				this.getColor(),
				"color", null, 0, 1, VTCDAbstractLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getVTCDAbstractLink_Width(),
				ecorePackage.getEInt(),
				"width", null, 0, 1, VTCDAbstractLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getVTCDAbstractLink_BendPoints(),
				this.getAbsoluteBendPoint(),
				"bendPoints", null, 0, -1, VTCDAbstractLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getVTCDAbstractLink_SourceTerminal(),
				ecorePackage.getEString(),
				"sourceTerminal", null, 0, 1, VTCDAbstractLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getVTCDAbstractLink_TargetTerminal(),
				ecorePackage.getEString(),
				"targetTerminal", null, 0, 1, VTCDAbstractLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				vtcdNoteEClass,
				VTCDNote.class,
				"VTCDNote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getVTCDNote_Text(),
				ecorePackage.getEString(),
				"text", null, 0, 1, VTCDNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getVTCDNote_M_VTCDDiagram(),
				this.getVTCDDiagram(),
				this.getVTCDDiagram_M_VTCDNote(),
				"m_VTCDDiagram", null, 1, 1, VTCDNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				vtcdDiagramEClass,
				VTCDDiagram.class,
				"VTCDDiagram", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getVTCDDiagram_M_VTCDNote(),
				this.getVTCDNote(),
				this.getVTCDNote_M_VTCDDiagram(),
				"m_VTCDNote", null, 0, -1, VTCDDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(vtcdDiagramEClass, ecorePackage.getEEList(),
				"getChildren"); //$NON-NLS-1$

		initEClass(
				vtcdcmProxyFigureEClass,
				VTCDCMProxyFigure.class,
				"VTCDCMProxyFigure", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		addEOperation(vtcdcmProxyFigureEClass, ecorePackage.getEObject(),
				"getProxyModel"); //$NON-NLS-1$

		EOperation op = addEOperation(vtcdcmProxyFigureEClass, null,
				"setProxyModel"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEObject(), "model"); //$NON-NLS-1$

		// Initialize data types
		initEDataType(testObjectEDataType, CMProxyTestObject.class,
				"TestObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(dependencyEDataType, CMProxyDependency.class,
				"Dependency", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(colorEDataType, Color.class,
				"Color", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(elementEDataType, CMProxyElement.class,
				"Element", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(combinationEDataType, CMProxyCombination.class,
				"Combination", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(
				equivalenceClassEDataType,
				CMProxyEquivalenceClass.class,
				"EquivalenceClass", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(
				absoluteBendPointEDataType,
				AbsoluteBendpoint.class,
				"AbsoluteBendPoint", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //VTCDPackageImpl
