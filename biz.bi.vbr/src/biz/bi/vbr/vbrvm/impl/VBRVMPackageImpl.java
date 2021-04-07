/**
 * <copyright>
 * </copyright>
 *
 * $Id: VBRVMPackageImpl.java,v 1.8 2005/09/20 19:03:42 hcanedo Exp $
 */
package biz.bi.vbr.vbrvm.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.swt.graphics.Color;

import biz.bi.vbr.BusinessAction;
import biz.bi.vbr.BusinessObject;
import biz.bi.vbr.BusinessValue;
import biz.bi.vbr.FormalPolicy;
import biz.bi.vbr.VBRPackage;
import biz.bi.vbr.impl.VBRPackageImpl;
import biz.bi.vbr.vbrvm.AbstractLine;
import biz.bi.vbr.vbrvm.AbstractView;
import biz.bi.vbr.vbrvm.MainDiagram;
import biz.bi.vbr.vbrvm.VBRActionConnectElementValue;
import biz.bi.vbr.vbrvm.VBRActionView;
import biz.bi.vbr.vbrvm.VBRElementConnectElementValue;
import biz.bi.vbr.vbrvm.VBRElementValueConnectAction;
import biz.bi.vbr.vbrvm.VBRElementValueConnectElementValue;
import biz.bi.vbr.vbrvm.VBRElementValueView;
import biz.bi.vbr.vbrvm.VBRElementView;
import biz.bi.vbr.vbrvm.VBRTreeConnectElementValue;
import biz.bi.vbr.vbrvm.VBRTreeView;
import biz.bi.vbr.vbrvm.VBRVMFactory;
import biz.bi.vbr.vbrvm.VBRVMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VBRVMPackageImpl extends EPackageImpl implements VBRVMPackage {
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
	private EClass mainDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vbrTreeViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vbrElementViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vbrElementValueViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vbrActionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vbrElementConnectElementValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vbrElementValueConnectElementValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vbrElementValueConnectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vbrActionConnectElementValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vbrTreeConnectElementValueEClass = null;

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
	private EDataType bmBusinessObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bmBusinessValueEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bmBusinessActionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bmFormalPolicyEDataType = null;

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
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VBRVMPackageImpl() {
		super(eNS_URI, VBRVMFactory.eINSTANCE);
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
	public static VBRVMPackage init() {
		if (isInited)
			return (VBRVMPackage) EPackage.Registry.INSTANCE
					.getEPackage(VBRVMPackage.eNS_URI);

		// Obtain or create and register package
		VBRVMPackageImpl theVBRVMPackage = (VBRVMPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI) instanceof VBRVMPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI)
				: new VBRVMPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		VBRPackageImpl theVBRPackage = (VBRPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(VBRPackage.eNS_URI) instanceof VBRPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(VBRPackage.eNS_URI)
				: VBRPackage.eINSTANCE);

		// Create package meta-data objects
		theVBRVMPackage.createPackageContents();
		theVBRPackage.createPackageContents();

		// Initialize created meta-data
		theVBRVMPackage.initializePackageContents();
		theVBRPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVBRVMPackage.freeze();

		return theVBRVMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMainDiagram() {
		return mainDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainDiagram_M_TreeView() {
		return (EReference) mainDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMainDiagram_M_vbrObject() {
		return (EAttribute) mainDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainDiagram_M_VBRElementView() {
		return (EReference) mainDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainDiagram_M_VBRElementValueView() {
		return (EReference) mainDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainDiagram_M_VBRActionView() {
		return (EReference) mainDiagramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVBRTreeView() {
		return vbrTreeViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVBRTreeView_MainDiagram() {
		return (EReference) vbrTreeViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVBRTreeView_Icon() {
		return (EAttribute) vbrTreeViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVBRTreeView_M_VBRTreeConnectElementValue() {
		return (EReference) vbrTreeViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVBRElementView() {
		return vbrElementViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVBRElementView_M_MainDiagram() {
		return (EReference) vbrElementViewEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVBRElementView_M_BObjectM() {
		return (EAttribute) vbrElementViewEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVBRElementView_M_VBRElementConnectElementValue() {
		return (EReference) vbrElementViewEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVBRElementView_M_ElementValue() {
		return (EReference) vbrElementViewEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractView() {
		return abstractViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractView_X() {
		return (EAttribute) abstractViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractView_Y() {
		return (EAttribute) abstractViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractView_Width() {
		return (EAttribute) abstractViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractView_Heigth() {
		return (EAttribute) abstractViewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVBRElementValueView() {
		return vbrElementValueViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVBRElementValueView_M_MainDiagram() {
		return (EReference) vbrElementValueViewEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVBRElementValueView_M_VBRElementValueConnectAction() {
		return (EReference) vbrElementValueViewEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVBRElementValueView_EColor() {
		return (EAttribute) vbrElementValueViewEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVBRElementValueView_M_bvaluem() {
		return (EAttribute) vbrElementValueViewEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVBRElementValueView_M_VBRElementValueConnectElementValue() {
		return (EReference) vbrElementValueViewEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVBRElementValueView_M_ElementView() {
		return (EReference) vbrElementValueViewEClass.getEStructuralFeatures()
				.get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVBRActionView() {
		return vbrActionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVBRActionView_Color() {
		return (EAttribute) vbrActionViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVBRActionView_Icon() {
		return (EAttribute) vbrActionViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVBRActionView_M_BActionm() {
		return (EAttribute) vbrActionViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVBRActionView_M_VBRActionConnectElementValue() {
		return (EReference) vbrActionViewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVBRActionView_M_MainDiagram() {
		return (EReference) vbrActionViewEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractLine() {
		return abstractLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractLine_X() {
		return (EAttribute) abstractLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractLine_Width() {
		return (EAttribute) abstractLineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractLine_Y() {
		return (EAttribute) abstractLineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVBRElementConnectElementValue() {
		return vbrElementConnectElementValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVBRElementConnectElementValue_ESource() {
		return (EReference) vbrElementConnectElementValueEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVBRElementConnectElementValue_EVTarget() {
		return (EReference) vbrElementConnectElementValueEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVBRElementValueConnectElementValue() {
		return vbrElementValueConnectElementValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVBRElementValueConnectElementValue_EVSource() {
		return (EReference) vbrElementValueConnectElementValueEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVBRElementValueConnectElementValue_EVTarget() {
		return (EReference) vbrElementValueConnectElementValueEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVBRElementValueConnectAction() {
		return vbrElementValueConnectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVBRElementValueConnectAction_SourceE() {
		return (EReference) vbrElementValueConnectActionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVBRElementValueConnectAction_TargetACT() {
		return (EReference) vbrElementValueConnectActionEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVBRActionConnectElementValue() {
		return vbrActionConnectElementValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVBRActionConnectElementValue_SourceACT() {
		return (EReference) vbrActionConnectElementValueEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVBRActionConnectElementValue_TargetEV() {
		return (EReference) vbrActionConnectElementValueEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVBRTreeConnectElementValue() {
		return vbrTreeConnectElementValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVBRTreeConnectElementValue_SourceTr() {
		return (EReference) vbrTreeConnectElementValueEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVBRTreeConnectElementValue_TargetEV() {
		return (EReference) vbrTreeConnectElementValueEClass
				.getEStructuralFeatures().get(1);
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
	public EDataType getBMBusinessObject() {
		return bmBusinessObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBMBusinessValue() {
		return bmBusinessValueEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBMBusinessAction() {
		return bmBusinessActionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBMFormalPolicy() {
		return bmFormalPolicyEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRVMFactory getVBRVMFactory() {
		return (VBRVMFactory) getEFactoryInstance();
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
		mainDiagramEClass = createEClass(MAIN_DIAGRAM);
		createEReference(mainDiagramEClass, MAIN_DIAGRAM__MTREE_VIEW);
		createEAttribute(mainDiagramEClass, MAIN_DIAGRAM__MVBR_OBJECT);
		createEReference(mainDiagramEClass, MAIN_DIAGRAM__MVBR_ELEMENT_VIEW);
		createEReference(mainDiagramEClass,
				MAIN_DIAGRAM__MVBR_ELEMENT_VALUE_VIEW);
		createEReference(mainDiagramEClass, MAIN_DIAGRAM__MVBR_ACTION_VIEW);

		vbrTreeViewEClass = createEClass(VBR_TREE_VIEW);
		createEReference(vbrTreeViewEClass, VBR_TREE_VIEW__MAIN_DIAGRAM);
		createEAttribute(vbrTreeViewEClass, VBR_TREE_VIEW__ICON);
		createEReference(vbrTreeViewEClass,
				VBR_TREE_VIEW__MVBR_TREE_CONNECT_ELEMENT_VALUE);

		vbrElementViewEClass = createEClass(VBR_ELEMENT_VIEW);
		createEReference(vbrElementViewEClass, VBR_ELEMENT_VIEW__MMAIN_DIAGRAM);
		createEAttribute(vbrElementViewEClass, VBR_ELEMENT_VIEW__MBOBJECT_M);
		createEReference(vbrElementViewEClass,
				VBR_ELEMENT_VIEW__MVBR_ELEMENT_CONNECT_ELEMENT_VALUE);
		createEReference(vbrElementViewEClass, VBR_ELEMENT_VIEW__MELEMENT_VALUE);

		abstractViewEClass = createEClass(ABSTRACT_VIEW);
		createEAttribute(abstractViewEClass, ABSTRACT_VIEW__X);
		createEAttribute(abstractViewEClass, ABSTRACT_VIEW__Y);
		createEAttribute(abstractViewEClass, ABSTRACT_VIEW__WIDTH);
		createEAttribute(abstractViewEClass, ABSTRACT_VIEW__HEIGTH);

		vbrElementValueViewEClass = createEClass(VBR_ELEMENT_VALUE_VIEW);
		createEReference(vbrElementValueViewEClass,
				VBR_ELEMENT_VALUE_VIEW__MMAIN_DIAGRAM);
		createEReference(vbrElementValueViewEClass,
				VBR_ELEMENT_VALUE_VIEW__MVBR_ELEMENT_VALUE_CONNECT_ACTION);
		createEAttribute(vbrElementValueViewEClass,
				VBR_ELEMENT_VALUE_VIEW__ECOLOR);
		createEAttribute(vbrElementValueViewEClass,
				VBR_ELEMENT_VALUE_VIEW__MBVALUEM);
		createEReference(vbrElementValueViewEClass,
				VBR_ELEMENT_VALUE_VIEW__MVBR_ELEMENT_VALUE_CONNECT_ELEMENT_VALUE);
		createEReference(vbrElementValueViewEClass,
				VBR_ELEMENT_VALUE_VIEW__MELEMENT_VIEW);

		vbrActionViewEClass = createEClass(VBR_ACTION_VIEW);
		createEAttribute(vbrActionViewEClass, VBR_ACTION_VIEW__COLOR);
		createEAttribute(vbrActionViewEClass, VBR_ACTION_VIEW__ICON);
		createEAttribute(vbrActionViewEClass, VBR_ACTION_VIEW__MBACTIONM);
		createEReference(vbrActionViewEClass,
				VBR_ACTION_VIEW__MVBR_ACTION_CONNECT_ELEMENT_VALUE);
		createEReference(vbrActionViewEClass, VBR_ACTION_VIEW__MMAIN_DIAGRAM);

		abstractLineEClass = createEClass(ABSTRACT_LINE);
		createEAttribute(abstractLineEClass, ABSTRACT_LINE__X);
		createEAttribute(abstractLineEClass, ABSTRACT_LINE__WIDTH);
		createEAttribute(abstractLineEClass, ABSTRACT_LINE__Y);

		vbrElementConnectElementValueEClass = createEClass(VBR_ELEMENT_CONNECT_ELEMENT_VALUE);
		createEReference(vbrElementConnectElementValueEClass,
				VBR_ELEMENT_CONNECT_ELEMENT_VALUE__ESOURCE);
		createEReference(vbrElementConnectElementValueEClass,
				VBR_ELEMENT_CONNECT_ELEMENT_VALUE__EV_TARGET);

		vbrElementValueConnectElementValueEClass = createEClass(VBR_ELEMENT_VALUE_CONNECT_ELEMENT_VALUE);
		createEReference(vbrElementValueConnectElementValueEClass,
				VBR_ELEMENT_VALUE_CONNECT_ELEMENT_VALUE__EV_SOURCE);
		createEReference(vbrElementValueConnectElementValueEClass,
				VBR_ELEMENT_VALUE_CONNECT_ELEMENT_VALUE__EV_TARGET);

		vbrElementValueConnectActionEClass = createEClass(VBR_ELEMENT_VALUE_CONNECT_ACTION);
		createEReference(vbrElementValueConnectActionEClass,
				VBR_ELEMENT_VALUE_CONNECT_ACTION__SOURCE_E);
		createEReference(vbrElementValueConnectActionEClass,
				VBR_ELEMENT_VALUE_CONNECT_ACTION__TARGET_ACT);

		vbrActionConnectElementValueEClass = createEClass(VBR_ACTION_CONNECT_ELEMENT_VALUE);
		createEReference(vbrActionConnectElementValueEClass,
				VBR_ACTION_CONNECT_ELEMENT_VALUE__SOURCE_ACT);
		createEReference(vbrActionConnectElementValueEClass,
				VBR_ACTION_CONNECT_ELEMENT_VALUE__TARGET_EV);

		vbrTreeConnectElementValueEClass = createEClass(VBR_TREE_CONNECT_ELEMENT_VALUE);
		createEReference(vbrTreeConnectElementValueEClass,
				VBR_TREE_CONNECT_ELEMENT_VALUE__SOURCE_TR);
		createEReference(vbrTreeConnectElementValueEClass,
				VBR_TREE_CONNECT_ELEMENT_VALUE__TARGET_EV);

		// Create data types
		colorEDataType = createEDataType(COLOR);
		bmBusinessObjectEDataType = createEDataType(BM_BUSINESS_OBJECT);
		bmBusinessValueEDataType = createEDataType(BM_BUSINESS_VALUE);
		bmBusinessActionEDataType = createEDataType(BM_BUSINESS_ACTION);
		bmFormalPolicyEDataType = createEDataType(BM_FORMAL_POLICY);
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
		vbrTreeViewEClass.getESuperTypes().add(this.getAbstractView());
		vbrElementViewEClass.getESuperTypes().add(this.getAbstractView());
		vbrElementValueViewEClass.getESuperTypes().add(this.getAbstractView());
		vbrActionViewEClass.getESuperTypes().add(this.getAbstractView());
		vbrElementConnectElementValueEClass.getESuperTypes().add(
				this.getAbstractLine());
		vbrElementValueConnectElementValueEClass.getESuperTypes().add(
				this.getAbstractLine());
		vbrElementValueConnectActionEClass.getESuperTypes().add(
				this.getAbstractLine());
		vbrActionConnectElementValueEClass.getESuperTypes().add(
				this.getAbstractLine());
		vbrTreeConnectElementValueEClass.getESuperTypes().add(
				this.getAbstractLine());

		// Initialize classes and features; add operations and parameters
		initEClass(
				mainDiagramEClass,
				MainDiagram.class,
				"MainDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getMainDiagram_M_TreeView(),
				this.getVBRTreeView(),
				this.getVBRTreeView_MainDiagram(),
				"m_TreeView", null, 0, -1, MainDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getMainDiagram_M_vbrObject(),
				this.getBMFormalPolicy(),
				"m_vbrObject", null, 1, 1, MainDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getMainDiagram_M_VBRElementView(),
				this.getVBRElementView(),
				this.getVBRElementView_M_MainDiagram(),
				"m_VBRElementView", null, 0, -1, MainDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getMainDiagram_M_VBRElementValueView(),
				this.getVBRElementValueView(),
				this.getVBRElementValueView_M_MainDiagram(),
				"m_VBRElementValueView", null, 0, -1, MainDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getMainDiagram_M_VBRActionView(),
				this.getVBRActionView(),
				null,
				"m_VBRActionView", null, 0, -1, MainDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				vbrTreeViewEClass,
				VBRTreeView.class,
				"VBRTreeView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getVBRTreeView_MainDiagram(),
				this.getMainDiagram(),
				this.getMainDiagram_M_TreeView(),
				"mainDiagram", null, 1, 1, VBRTreeView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getVBRTreeView_Icon(),
				ecorePackage.getEString(),
				"icon", null, 0, 1, VBRTreeView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getVBRTreeView_M_VBRTreeConnectElementValue(),
				this.getVBRTreeConnectElementValue(),
				null,
				"m_VBRTreeConnectElementValue", null, 1, 1, VBRTreeView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				vbrElementViewEClass,
				VBRElementView.class,
				"VBRElementView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getVBRElementView_M_MainDiagram(),
				this.getMainDiagram(),
				this.getMainDiagram_M_VBRElementView(),
				"m_MainDiagram", null, 1, 1, VBRElementView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getVBRElementView_M_BObjectM(),
				this.getBMBusinessObject(),
				"m_BObjectM", null, 1, 1, VBRElementView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getVBRElementView_M_VBRElementConnectElementValue(),
				this.getVBRElementConnectElementValue(),
				null,
				"m_VBRElementConnectElementValue", null, 1, 1, VBRElementView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getVBRElementView_M_ElementValue(),
				this.getVBRElementValueView(),
				null,
				"m_ElementValue", null, 1, -1, VBRElementView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				abstractViewEClass,
				AbstractView.class,
				"AbstractView", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getAbstractView_X(),
				ecorePackage.getEInt(),
				"X", null, 0, 1, AbstractView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getAbstractView_Y(),
				ecorePackage.getEInt(),
				"Y", null, 0, 1, AbstractView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getAbstractView_Width(),
				ecorePackage.getEInt(),
				"Width", null, 0, 1, AbstractView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getAbstractView_Heigth(),
				ecorePackage.getEInt(),
				"Heigth", null, 0, 1, AbstractView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				vbrElementValueViewEClass,
				VBRElementValueView.class,
				"VBRElementValueView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getVBRElementValueView_M_MainDiagram(),
				this.getMainDiagram(),
				this.getMainDiagram_M_VBRElementValueView(),
				"m_MainDiagram", null, 1, 1, VBRElementValueView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getVBRElementValueView_M_VBRElementValueConnectAction(),
				this.getVBRElementValueConnectAction(),
				null,
				"m_VBRElementValueConnectAction", null, 1, -1, VBRElementValueView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getVBRElementValueView_EColor(),
				this.getColor(),
				"eColor", null, 0, 1, VBRElementValueView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getVBRElementValueView_M_bvaluem(),
				this.getBMBusinessValue(),
				"m_bvaluem", null, 1, 1, VBRElementValueView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getVBRElementValueView_M_VBRElementValueConnectElementValue(),
				this.getVBRElementValueConnectElementValue(),
				null,
				"m_VBRElementValueConnectElementValue", null, 1, -1, VBRElementValueView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getVBRElementValueView_M_ElementView(),
				this.getVBRElementView(),
				null,
				"m_ElementView", null, 1, 1, VBRElementValueView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				vbrActionViewEClass,
				VBRActionView.class,
				"VBRActionView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getVBRActionView_Color(),
				this.getColor(),
				"color", null, 0, 1, VBRActionView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getVBRActionView_Icon(),
				ecorePackage.getEString(),
				"icon", null, 0, 1, VBRActionView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getVBRActionView_M_BActionm(),
				this.getBMBusinessAction(),
				"m_BActionm", null, 1, 1, VBRActionView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getVBRActionView_M_VBRActionConnectElementValue(),
				this.getVBRActionConnectElementValue(),
				null,
				"m_VBRActionConnectElementValue", null, 1, 1, VBRActionView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getVBRActionView_M_MainDiagram(),
				this.getMainDiagram(),
				null,
				"m_MainDiagram", null, 1, 1, VBRActionView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				abstractLineEClass,
				AbstractLine.class,
				"AbstractLine", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getAbstractLine_X(),
				ecorePackage.getEInt(),
				"x", null, 0, 1, AbstractLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getAbstractLine_Width(),
				ecorePackage.getEInt(),
				"width", null, 0, 1, AbstractLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getAbstractLine_Y(),
				ecorePackage.getEInt(),
				"y", null, 0, 1, AbstractLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				vbrElementConnectElementValueEClass,
				VBRElementConnectElementValue.class,
				"VBRElementConnectElementValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getVBRElementConnectElementValue_ESource(),
				this.getVBRElementView(),
				null,
				"ESource", null, 1, 1, VBRElementConnectElementValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getVBRElementConnectElementValue_EVTarget(),
				this.getVBRElementValueView(),
				null,
				"EVTarget", null, 1, 1, VBRElementConnectElementValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				vbrElementValueConnectElementValueEClass,
				VBRElementValueConnectElementValue.class,
				"VBRElementValueConnectElementValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getVBRElementValueConnectElementValue_EVSource(),
				this.getVBRElementValueView(),
				null,
				"EVSource", null, 1, 1, VBRElementValueConnectElementValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getVBRElementValueConnectElementValue_EVTarget(),
				this.getVBRElementValueView(),
				null,
				"EVTarget", null, 1, 1, VBRElementValueConnectElementValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				vbrElementValueConnectActionEClass,
				VBRElementValueConnectAction.class,
				"VBRElementValueConnectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getVBRElementValueConnectAction_SourceE(),
				this.getVBRElementValueView(),
				null,
				"SourceE", null, 1, 1, VBRElementValueConnectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getVBRElementValueConnectAction_TargetACT(),
				this.getVBRActionView(),
				null,
				"TargetACT", null, 1, 1, VBRElementValueConnectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				vbrActionConnectElementValueEClass,
				VBRActionConnectElementValue.class,
				"VBRActionConnectElementValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getVBRActionConnectElementValue_SourceACT(),
				this.getVBRActionView(),
				null,
				"SourceACT", null, 1, 1, VBRActionConnectElementValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getVBRActionConnectElementValue_TargetEV(),
				this.getVBRElementValueView(),
				null,
				"TargetEV", null, 1, 1, VBRActionConnectElementValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				vbrTreeConnectElementValueEClass,
				VBRTreeConnectElementValue.class,
				"VBRTreeConnectElementValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getVBRTreeConnectElementValue_SourceTr(),
				this.getVBRTreeView(),
				null,
				"SourceTr", null, 1, 1, VBRTreeConnectElementValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getVBRTreeConnectElementValue_TargetEV(),
				this.getVBRElementValueView(),
				null,
				"TargetEV", null, 1, 1, VBRTreeConnectElementValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Initialize data types
		initEDataType(colorEDataType, Color.class,
				"Color", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(
				bmBusinessObjectEDataType,
				BusinessObject.class,
				"BMBusinessObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(
				bmBusinessValueEDataType,
				BusinessValue.class,
				"BMBusinessValue", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(
				bmBusinessActionEDataType,
				BusinessAction.class,
				"BMBusinessAction", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(bmFormalPolicyEDataType, FormalPolicy.class,
				"BMFormalPolicy", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
	}

} //VBRVMPackageImpl
