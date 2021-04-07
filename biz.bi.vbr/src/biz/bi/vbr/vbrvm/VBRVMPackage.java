/**
 * <copyright>
 * </copyright>
 *
 * $Id: VBRVMPackage.java,v 1.6 2005/09/20 14:35:07 hcanedo Exp $
 */
package biz.bi.vbr.vbrvm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see biz.bi.vbr.vbrvm.VBRVMFactory
 * @generated
 */
public interface VBRVMPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vbrvm"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://biz.bi.vbr.vm"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "VBRVM"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VBRVMPackage eINSTANCE = biz.bi.vbr.vbrvm.impl.VBRVMPackageImpl.init();

	/**
	 * The meta object id for the '{@link biz.bi.vbr.vbrvm.impl.MainDiagramImpl <em>Main Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.vbr.vbrvm.impl.MainDiagramImpl
	 * @see biz.bi.vbr.vbrvm.impl.VBRVMPackageImpl#getMainDiagram()
	 * @generated
	 */
	int MAIN_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>MTree View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_DIAGRAM__MTREE_VIEW = 0;

	/**
	 * The feature id for the '<em><b>Mvbr Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_DIAGRAM__MVBR_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>MVBR Element View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_DIAGRAM__MVBR_ELEMENT_VIEW = 2;

	/**
	 * The feature id for the '<em><b>MVBR Element Value View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_DIAGRAM__MVBR_ELEMENT_VALUE_VIEW = 3;

	/**
	 * The feature id for the '<em><b>MVBR Action View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_DIAGRAM__MVBR_ACTION_VIEW = 4;

	/**
	 * The number of structural features of the the '<em>Main Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_DIAGRAM_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link biz.bi.vbr.vbrvm.impl.VBRTreeViewImpl <em>VBR Tree View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.vbr.vbrvm.impl.VBRTreeViewImpl
	 * @see biz.bi.vbr.vbrvm.impl.VBRVMPackageImpl#getVBRTreeView()
	 * @generated
	 */
	int VBR_TREE_VIEW = 1;

	/**
	 * The meta object id for the '{@link biz.bi.vbr.vbrvm.impl.AbstractViewImpl <em>Abstract View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.vbr.vbrvm.impl.AbstractViewImpl
	 * @see biz.bi.vbr.vbrvm.impl.VBRVMPackageImpl#getAbstractView()
	 * @generated
	 */
	int ABSTRACT_VIEW = 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VIEW__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VIEW__Y = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VIEW__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VIEW__HEIGTH = 3;

	/**
	 * The number of structural features of the the '<em>Abstract View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VIEW_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_TREE_VIEW__X = ABSTRACT_VIEW__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_TREE_VIEW__Y = ABSTRACT_VIEW__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_TREE_VIEW__WIDTH = ABSTRACT_VIEW__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_TREE_VIEW__HEIGTH = ABSTRACT_VIEW__HEIGTH;

	/**
	 * The feature id for the '<em><b>Main Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_TREE_VIEW__MAIN_DIAGRAM = ABSTRACT_VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_TREE_VIEW__ICON = ABSTRACT_VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MVBR Tree Connect Element Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_TREE_VIEW__MVBR_TREE_CONNECT_ELEMENT_VALUE = ABSTRACT_VIEW_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the the '<em>VBR Tree View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_TREE_VIEW_FEATURE_COUNT = ABSTRACT_VIEW_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link biz.bi.vbr.vbrvm.impl.VBRElementViewImpl <em>VBR Element View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.vbr.vbrvm.impl.VBRElementViewImpl
	 * @see biz.bi.vbr.vbrvm.impl.VBRVMPackageImpl#getVBRElementView()
	 * @generated
	 */
	int VBR_ELEMENT_VIEW = 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_VIEW__X = ABSTRACT_VIEW__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_VIEW__Y = ABSTRACT_VIEW__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_VIEW__WIDTH = ABSTRACT_VIEW__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_VIEW__HEIGTH = ABSTRACT_VIEW__HEIGTH;

	/**
	 * The feature id for the '<em><b>MMain Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_VIEW__MMAIN_DIAGRAM = ABSTRACT_VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MBObject M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_VIEW__MBOBJECT_M = ABSTRACT_VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MVBR Element Connect Element Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_VIEW__MVBR_ELEMENT_CONNECT_ELEMENT_VALUE = ABSTRACT_VIEW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>MElement Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_VIEW__MELEMENT_VALUE = ABSTRACT_VIEW_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the the '<em>VBR Element View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_VIEW_FEATURE_COUNT = ABSTRACT_VIEW_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link biz.bi.vbr.vbrvm.impl.AbstractLineImpl <em>Abstract Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.vbr.vbrvm.impl.AbstractLineImpl
	 * @see biz.bi.vbr.vbrvm.impl.VBRVMPackageImpl#getAbstractLine()
	 * @generated
	 */
	int ABSTRACT_LINE = 6;

	/**
	 * The meta object id for the '{@link biz.bi.vbr.vbrvm.impl.VBRElementConnectElementValueImpl <em>VBR Element Connect Element Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.vbr.vbrvm.impl.VBRElementConnectElementValueImpl
	 * @see biz.bi.vbr.vbrvm.impl.VBRVMPackageImpl#getVBRElementConnectElementValue()
	 * @generated
	 */
	int VBR_ELEMENT_CONNECT_ELEMENT_VALUE = 7;

	/**
	 * The meta object id for the '{@link biz.bi.vbr.vbrvm.impl.VBRElementValueConnectElementValueImpl <em>VBR Element Value Connect Element Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.vbr.vbrvm.impl.VBRElementValueConnectElementValueImpl
	 * @see biz.bi.vbr.vbrvm.impl.VBRVMPackageImpl#getVBRElementValueConnectElementValue()
	 * @generated
	 */
	int VBR_ELEMENT_VALUE_CONNECT_ELEMENT_VALUE = 8;

	/**
	 * The meta object id for the '{@link biz.bi.vbr.vbrvm.impl.VBRElementValueConnectActionImpl <em>VBR Element Value Connect Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.vbr.vbrvm.impl.VBRElementValueConnectActionImpl
	 * @see biz.bi.vbr.vbrvm.impl.VBRVMPackageImpl#getVBRElementValueConnectAction()
	 * @generated
	 */
	int VBR_ELEMENT_VALUE_CONNECT_ACTION = 9;

	/**
	 * The meta object id for the '{@link biz.bi.vbr.vbrvm.impl.VBRElementValueViewImpl <em>VBR Element Value View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.vbr.vbrvm.impl.VBRElementValueViewImpl
	 * @see biz.bi.vbr.vbrvm.impl.VBRVMPackageImpl#getVBRElementValueView()
	 * @generated
	 */
	int VBR_ELEMENT_VALUE_VIEW = 4;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_VALUE_VIEW__X = ABSTRACT_VIEW__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_VALUE_VIEW__Y = ABSTRACT_VIEW__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_VALUE_VIEW__WIDTH = ABSTRACT_VIEW__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_VALUE_VIEW__HEIGTH = ABSTRACT_VIEW__HEIGTH;

	/**
	 * The feature id for the '<em><b>MMain Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_VALUE_VIEW__MMAIN_DIAGRAM = ABSTRACT_VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MVBR Element Value Connect Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_VALUE_VIEW__MVBR_ELEMENT_VALUE_CONNECT_ACTION = ABSTRACT_VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EColor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_VALUE_VIEW__ECOLOR = ABSTRACT_VIEW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mbvaluem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_VALUE_VIEW__MBVALUEM = ABSTRACT_VIEW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>MVBR Element Value Connect Element Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_VALUE_VIEW__MVBR_ELEMENT_VALUE_CONNECT_ELEMENT_VALUE = ABSTRACT_VIEW_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>MElement View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_VALUE_VIEW__MELEMENT_VIEW = ABSTRACT_VIEW_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the the '<em>VBR Element Value View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_VALUE_VIEW_FEATURE_COUNT = ABSTRACT_VIEW_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link biz.bi.vbr.vbrvm.impl.VBRActionViewImpl <em>VBR Action View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.vbr.vbrvm.impl.VBRActionViewImpl
	 * @see biz.bi.vbr.vbrvm.impl.VBRVMPackageImpl#getVBRActionView()
	 * @generated
	 */
	int VBR_ACTION_VIEW = 5;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ACTION_VIEW__X = ABSTRACT_VIEW__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ACTION_VIEW__Y = ABSTRACT_VIEW__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ACTION_VIEW__WIDTH = ABSTRACT_VIEW__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ACTION_VIEW__HEIGTH = ABSTRACT_VIEW__HEIGTH;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ACTION_VIEW__COLOR = ABSTRACT_VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ACTION_VIEW__ICON = ABSTRACT_VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MBActionm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ACTION_VIEW__MBACTIONM = ABSTRACT_VIEW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>MVBR Action Connect Element Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ACTION_VIEW__MVBR_ACTION_CONNECT_ELEMENT_VALUE = ABSTRACT_VIEW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>MMain Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ACTION_VIEW__MMAIN_DIAGRAM = ABSTRACT_VIEW_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the the '<em>VBR Action View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ACTION_VIEW_FEATURE_COUNT = ABSTRACT_VIEW_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINE__X = 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINE__WIDTH = 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINE__Y = 2;

	/**
	 * The number of structural features of the the '<em>Abstract Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINE_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_CONNECT_ELEMENT_VALUE__X = ABSTRACT_LINE__X;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_CONNECT_ELEMENT_VALUE__WIDTH = ABSTRACT_LINE__WIDTH;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_CONNECT_ELEMENT_VALUE__Y = ABSTRACT_LINE__Y;

	/**
	 * The feature id for the '<em><b>ESource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_CONNECT_ELEMENT_VALUE__ESOURCE = ABSTRACT_LINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EV Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_CONNECT_ELEMENT_VALUE__EV_TARGET = ABSTRACT_LINE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>VBR Element Connect Element Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_CONNECT_ELEMENT_VALUE_FEATURE_COUNT = ABSTRACT_LINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_VALUE_CONNECT_ELEMENT_VALUE__X = ABSTRACT_LINE__X;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_VALUE_CONNECT_ELEMENT_VALUE__WIDTH = ABSTRACT_LINE__WIDTH;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_VALUE_CONNECT_ELEMENT_VALUE__Y = ABSTRACT_LINE__Y;

	/**
	 * The feature id for the '<em><b>EV Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_VALUE_CONNECT_ELEMENT_VALUE__EV_SOURCE = ABSTRACT_LINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EV Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_VALUE_CONNECT_ELEMENT_VALUE__EV_TARGET = ABSTRACT_LINE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>VBR Element Value Connect Element Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_VALUE_CONNECT_ELEMENT_VALUE_FEATURE_COUNT = ABSTRACT_LINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_VALUE_CONNECT_ACTION__X = ABSTRACT_LINE__X;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_VALUE_CONNECT_ACTION__WIDTH = ABSTRACT_LINE__WIDTH;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_VALUE_CONNECT_ACTION__Y = ABSTRACT_LINE__Y;

	/**
	 * The feature id for the '<em><b>Source E</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_VALUE_CONNECT_ACTION__SOURCE_E = ABSTRACT_LINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target ACT</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_VALUE_CONNECT_ACTION__TARGET_ACT = ABSTRACT_LINE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>VBR Element Value Connect Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ELEMENT_VALUE_CONNECT_ACTION_FEATURE_COUNT = ABSTRACT_LINE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link biz.bi.vbr.vbrvm.impl.VBRActionConnectElementValueImpl <em>VBR Action Connect Element Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.vbr.vbrvm.impl.VBRActionConnectElementValueImpl
	 * @see biz.bi.vbr.vbrvm.impl.VBRVMPackageImpl#getVBRActionConnectElementValue()
	 * @generated
	 */
	int VBR_ACTION_CONNECT_ELEMENT_VALUE = 10;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ACTION_CONNECT_ELEMENT_VALUE__X = ABSTRACT_LINE__X;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ACTION_CONNECT_ELEMENT_VALUE__WIDTH = ABSTRACT_LINE__WIDTH;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ACTION_CONNECT_ELEMENT_VALUE__Y = ABSTRACT_LINE__Y;

	/**
	 * The feature id for the '<em><b>Source ACT</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ACTION_CONNECT_ELEMENT_VALUE__SOURCE_ACT = ABSTRACT_LINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target EV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ACTION_CONNECT_ELEMENT_VALUE__TARGET_EV = ABSTRACT_LINE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>VBR Action Connect Element Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_ACTION_CONNECT_ELEMENT_VALUE_FEATURE_COUNT = ABSTRACT_LINE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link biz.bi.vbr.vbrvm.impl.VBRTreeConnectElementValueImpl <em>VBR Tree Connect Element Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.vbr.vbrvm.impl.VBRTreeConnectElementValueImpl
	 * @see biz.bi.vbr.vbrvm.impl.VBRVMPackageImpl#getVBRTreeConnectElementValue()
	 * @generated
	 */
	int VBR_TREE_CONNECT_ELEMENT_VALUE = 11;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_TREE_CONNECT_ELEMENT_VALUE__X = ABSTRACT_LINE__X;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_TREE_CONNECT_ELEMENT_VALUE__WIDTH = ABSTRACT_LINE__WIDTH;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_TREE_CONNECT_ELEMENT_VALUE__Y = ABSTRACT_LINE__Y;

	/**
	 * The feature id for the '<em><b>Source Tr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_TREE_CONNECT_ELEMENT_VALUE__SOURCE_TR = ABSTRACT_LINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target EV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_TREE_CONNECT_ELEMENT_VALUE__TARGET_EV = ABSTRACT_LINE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>VBR Tree Connect Element Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBR_TREE_CONNECT_ELEMENT_VALUE_FEATURE_COUNT = ABSTRACT_LINE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '<em>Color</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.swt.graphics.Color
	 * @see biz.bi.vbr.vbrvm.impl.VBRVMPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 12;

	/**
	 * The meta object id for the '<em>BM Business Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.vbr.BusinessObject
	 * @see biz.bi.vbr.vbrvm.impl.VBRVMPackageImpl#getBMBusinessObject()
	 * @generated
	 */
	int BM_BUSINESS_OBJECT = 13;

	/**
	 * The meta object id for the '<em>BM Business Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.vbr.BusinessValue
	 * @see biz.bi.vbr.vbrvm.impl.VBRVMPackageImpl#getBMBusinessValue()
	 * @generated
	 */
	int BM_BUSINESS_VALUE = 14;

	/**
	 * The meta object id for the '<em>BM Business Action</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.vbr.BusinessAction
	 * @see biz.bi.vbr.vbrvm.impl.VBRVMPackageImpl#getBMBusinessAction()
	 * @generated
	 */
	int BM_BUSINESS_ACTION = 15;

	/**
	 * The meta object id for the '<em>BM Formal Policy</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.vbr.FormalPolicy
	 * @see biz.bi.vbr.vbrvm.impl.VBRVMPackageImpl#getBMFormalPolicy()
	 * @generated
	 */
	int BM_FORMAL_POLICY = 16;

	/**
	 * Returns the meta object for class '{@link biz.bi.vbr.vbrvm.MainDiagram <em>Main Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Diagram</em>'.
	 * @see biz.bi.vbr.vbrvm.MainDiagram
	 * @generated
	 */
	EClass getMainDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link biz.bi.vbr.vbrvm.MainDiagram#getM_TreeView <em>MTree View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MTree View</em>'.
	 * @see biz.bi.vbr.vbrvm.MainDiagram#getM_TreeView()
	 * @see #getMainDiagram()
	 * @generated
	 */
	EReference getMainDiagram_M_TreeView();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vbr.vbrvm.MainDiagram#getM_vbrObject <em>Mvbr Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mvbr Object</em>'.
	 * @see biz.bi.vbr.vbrvm.MainDiagram#getM_vbrObject()
	 * @see #getMainDiagram()
	 * @generated
	 */
	EAttribute getMainDiagram_M_vbrObject();

	/**
	 * Returns the meta object for the containment reference list '{@link biz.bi.vbr.vbrvm.MainDiagram#getM_VBRElementView <em>MVBR Element View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MVBR Element View</em>'.
	 * @see biz.bi.vbr.vbrvm.MainDiagram#getM_VBRElementView()
	 * @see #getMainDiagram()
	 * @generated
	 */
	EReference getMainDiagram_M_VBRElementView();

	/**
	 * Returns the meta object for the containment reference list '{@link biz.bi.vbr.vbrvm.MainDiagram#getM_VBRElementValueView <em>MVBR Element Value View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MVBR Element Value View</em>'.
	 * @see biz.bi.vbr.vbrvm.MainDiagram#getM_VBRElementValueView()
	 * @see #getMainDiagram()
	 * @generated
	 */
	EReference getMainDiagram_M_VBRElementValueView();

	/**
	 * Returns the meta object for the containment reference list '{@link biz.bi.vbr.vbrvm.MainDiagram#getM_VBRActionView <em>MVBR Action View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MVBR Action View</em>'.
	 * @see biz.bi.vbr.vbrvm.MainDiagram#getM_VBRActionView()
	 * @see #getMainDiagram()
	 * @generated
	 */
	EReference getMainDiagram_M_VBRActionView();

	/**
	 * Returns the meta object for class '{@link biz.bi.vbr.vbrvm.VBRTreeView <em>VBR Tree View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VBR Tree View</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRTreeView
	 * @generated
	 */
	EClass getVBRTreeView();

	/**
	 * Returns the meta object for the container reference '{@link biz.bi.vbr.vbrvm.VBRTreeView#getMainDiagram <em>Main Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Main Diagram</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRTreeView#getMainDiagram()
	 * @see #getVBRTreeView()
	 * @generated
	 */
	EReference getVBRTreeView_MainDiagram();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vbr.vbrvm.VBRTreeView#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRTreeView#getIcon()
	 * @see #getVBRTreeView()
	 * @generated
	 */
	EAttribute getVBRTreeView_Icon();

	/**
	 * Returns the meta object for the reference '{@link biz.bi.vbr.vbrvm.VBRTreeView#getM_VBRTreeConnectElementValue <em>MVBR Tree Connect Element Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>MVBR Tree Connect Element Value</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRTreeView#getM_VBRTreeConnectElementValue()
	 * @see #getVBRTreeView()
	 * @generated
	 */
	EReference getVBRTreeView_M_VBRTreeConnectElementValue();

	/**
	 * Returns the meta object for class '{@link biz.bi.vbr.vbrvm.VBRElementView <em>VBR Element View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VBR Element View</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRElementView
	 * @generated
	 */
	EClass getVBRElementView();

	/**
	 * Returns the meta object for the container reference '{@link biz.bi.vbr.vbrvm.VBRElementView#getM_MainDiagram <em>MMain Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>MMain Diagram</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRElementView#getM_MainDiagram()
	 * @see #getVBRElementView()
	 * @generated
	 */
	EReference getVBRElementView_M_MainDiagram();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vbr.vbrvm.VBRElementView#getM_BObjectM <em>MBObject M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MBObject M</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRElementView#getM_BObjectM()
	 * @see #getVBRElementView()
	 * @generated
	 */
	EAttribute getVBRElementView_M_BObjectM();

	/**
	 * Returns the meta object for the reference '{@link biz.bi.vbr.vbrvm.VBRElementView#getM_VBRElementConnectElementValue <em>MVBR Element Connect Element Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>MVBR Element Connect Element Value</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRElementView#getM_VBRElementConnectElementValue()
	 * @see #getVBRElementView()
	 * @generated
	 */
	EReference getVBRElementView_M_VBRElementConnectElementValue();

	/**
	 * Returns the meta object for the reference list '{@link biz.bi.vbr.vbrvm.VBRElementView#getM_ElementValue <em>MElement Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>MElement Value</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRElementView#getM_ElementValue()
	 * @see #getVBRElementView()
	 * @generated
	 */
	EReference getVBRElementView_M_ElementValue();

	/**
	 * Returns the meta object for class '{@link biz.bi.vbr.vbrvm.AbstractView <em>Abstract View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract View</em>'.
	 * @see biz.bi.vbr.vbrvm.AbstractView
	 * @generated
	 */
	EClass getAbstractView();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vbr.vbrvm.AbstractView#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see biz.bi.vbr.vbrvm.AbstractView#getX()
	 * @see #getAbstractView()
	 * @generated
	 */
	EAttribute getAbstractView_X();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vbr.vbrvm.AbstractView#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see biz.bi.vbr.vbrvm.AbstractView#getY()
	 * @see #getAbstractView()
	 * @generated
	 */
	EAttribute getAbstractView_Y();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vbr.vbrvm.AbstractView#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see biz.bi.vbr.vbrvm.AbstractView#getWidth()
	 * @see #getAbstractView()
	 * @generated
	 */
	EAttribute getAbstractView_Width();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vbr.vbrvm.AbstractView#getHeigth <em>Heigth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heigth</em>'.
	 * @see biz.bi.vbr.vbrvm.AbstractView#getHeigth()
	 * @see #getAbstractView()
	 * @generated
	 */
	EAttribute getAbstractView_Heigth();

	/**
	 * Returns the meta object for class '{@link biz.bi.vbr.vbrvm.VBRElementValueView <em>VBR Element Value View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VBR Element Value View</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRElementValueView
	 * @generated
	 */
	EClass getVBRElementValueView();

	/**
	 * Returns the meta object for the container reference '{@link biz.bi.vbr.vbrvm.VBRElementValueView#getM_MainDiagram <em>MMain Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>MMain Diagram</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRElementValueView#getM_MainDiagram()
	 * @see #getVBRElementValueView()
	 * @generated
	 */
	EReference getVBRElementValueView_M_MainDiagram();

	/**
	 * Returns the meta object for the reference list '{@link biz.bi.vbr.vbrvm.VBRElementValueView#getM_VBRElementValueConnectAction <em>MVBR Element Value Connect Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>MVBR Element Value Connect Action</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRElementValueView#getM_VBRElementValueConnectAction()
	 * @see #getVBRElementValueView()
	 * @generated
	 */
	EReference getVBRElementValueView_M_VBRElementValueConnectAction();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vbr.vbrvm.VBRElementValueView#getEColor <em>EColor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EColor</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRElementValueView#getEColor()
	 * @see #getVBRElementValueView()
	 * @generated
	 */
	EAttribute getVBRElementValueView_EColor();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vbr.vbrvm.VBRElementValueView#getM_bvaluem <em>Mbvaluem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mbvaluem</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRElementValueView#getM_bvaluem()
	 * @see #getVBRElementValueView()
	 * @generated
	 */
	EAttribute getVBRElementValueView_M_bvaluem();

	/**
	 * Returns the meta object for the reference list '{@link biz.bi.vbr.vbrvm.VBRElementValueView#getM_VBRElementValueConnectElementValue <em>MVBR Element Value Connect Element Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>MVBR Element Value Connect Element Value</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRElementValueView#getM_VBRElementValueConnectElementValue()
	 * @see #getVBRElementValueView()
	 * @generated
	 */
	EReference getVBRElementValueView_M_VBRElementValueConnectElementValue();

	/**
	 * Returns the meta object for the reference '{@link biz.bi.vbr.vbrvm.VBRElementValueView#getM_ElementView <em>MElement View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>MElement View</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRElementValueView#getM_ElementView()
	 * @see #getVBRElementValueView()
	 * @generated
	 */
	EReference getVBRElementValueView_M_ElementView();

	/**
	 * Returns the meta object for class '{@link biz.bi.vbr.vbrvm.VBRActionView <em>VBR Action View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VBR Action View</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRActionView
	 * @generated
	 */
	EClass getVBRActionView();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vbr.vbrvm.VBRActionView#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRActionView#getColor()
	 * @see #getVBRActionView()
	 * @generated
	 */
	EAttribute getVBRActionView_Color();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vbr.vbrvm.VBRActionView#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRActionView#getIcon()
	 * @see #getVBRActionView()
	 * @generated
	 */
	EAttribute getVBRActionView_Icon();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vbr.vbrvm.VBRActionView#getM_BActionm <em>MBActionm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MBActionm</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRActionView#getM_BActionm()
	 * @see #getVBRActionView()
	 * @generated
	 */
	EAttribute getVBRActionView_M_BActionm();

	/**
	 * Returns the meta object for the reference '{@link biz.bi.vbr.vbrvm.VBRActionView#getM_VBRActionConnectElementValue <em>MVBR Action Connect Element Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>MVBR Action Connect Element Value</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRActionView#getM_VBRActionConnectElementValue()
	 * @see #getVBRActionView()
	 * @generated
	 */
	EReference getVBRActionView_M_VBRActionConnectElementValue();

	/**
	 * Returns the meta object for the reference '{@link biz.bi.vbr.vbrvm.VBRActionView#getM_MainDiagram <em>MMain Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>MMain Diagram</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRActionView#getM_MainDiagram()
	 * @see #getVBRActionView()
	 * @generated
	 */
	EReference getVBRActionView_M_MainDiagram();

	/**
	 * Returns the meta object for class '{@link biz.bi.vbr.vbrvm.AbstractLine <em>Abstract Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Line</em>'.
	 * @see biz.bi.vbr.vbrvm.AbstractLine
	 * @generated
	 */
	EClass getAbstractLine();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vbr.vbrvm.AbstractLine#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see biz.bi.vbr.vbrvm.AbstractLine#getX()
	 * @see #getAbstractLine()
	 * @generated
	 */
	EAttribute getAbstractLine_X();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vbr.vbrvm.AbstractLine#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see biz.bi.vbr.vbrvm.AbstractLine#getWidth()
	 * @see #getAbstractLine()
	 * @generated
	 */
	EAttribute getAbstractLine_Width();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vbr.vbrvm.AbstractLine#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see biz.bi.vbr.vbrvm.AbstractLine#getY()
	 * @see #getAbstractLine()
	 * @generated
	 */
	EAttribute getAbstractLine_Y();

	/**
	 * Returns the meta object for class '{@link biz.bi.vbr.vbrvm.VBRElementConnectElementValue <em>VBR Element Connect Element Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VBR Element Connect Element Value</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRElementConnectElementValue
	 * @generated
	 */
	EClass getVBRElementConnectElementValue();

	/**
	 * Returns the meta object for the reference '{@link biz.bi.vbr.vbrvm.VBRElementConnectElementValue#getESource <em>ESource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>ESource</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRElementConnectElementValue#getESource()
	 * @see #getVBRElementConnectElementValue()
	 * @generated
	 */
	EReference getVBRElementConnectElementValue_ESource();

	/**
	 * Returns the meta object for the reference '{@link biz.bi.vbr.vbrvm.VBRElementConnectElementValue#getEVTarget <em>EV Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EV Target</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRElementConnectElementValue#getEVTarget()
	 * @see #getVBRElementConnectElementValue()
	 * @generated
	 */
	EReference getVBRElementConnectElementValue_EVTarget();

	/**
	 * Returns the meta object for class '{@link biz.bi.vbr.vbrvm.VBRElementValueConnectElementValue <em>VBR Element Value Connect Element Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VBR Element Value Connect Element Value</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRElementValueConnectElementValue
	 * @generated
	 */
	EClass getVBRElementValueConnectElementValue();

	/**
	 * Returns the meta object for the reference '{@link biz.bi.vbr.vbrvm.VBRElementValueConnectElementValue#getEVSource <em>EV Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EV Source</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRElementValueConnectElementValue#getEVSource()
	 * @see #getVBRElementValueConnectElementValue()
	 * @generated
	 */
	EReference getVBRElementValueConnectElementValue_EVSource();

	/**
	 * Returns the meta object for the reference '{@link biz.bi.vbr.vbrvm.VBRElementValueConnectElementValue#getEVTarget <em>EV Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EV Target</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRElementValueConnectElementValue#getEVTarget()
	 * @see #getVBRElementValueConnectElementValue()
	 * @generated
	 */
	EReference getVBRElementValueConnectElementValue_EVTarget();

	/**
	 * Returns the meta object for class '{@link biz.bi.vbr.vbrvm.VBRElementValueConnectAction <em>VBR Element Value Connect Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VBR Element Value Connect Action</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRElementValueConnectAction
	 * @generated
	 */
	EClass getVBRElementValueConnectAction();

	/**
	 * Returns the meta object for the reference '{@link biz.bi.vbr.vbrvm.VBRElementValueConnectAction#getSourceE <em>Source E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source E</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRElementValueConnectAction#getSourceE()
	 * @see #getVBRElementValueConnectAction()
	 * @generated
	 */
	EReference getVBRElementValueConnectAction_SourceE();

	/**
	 * Returns the meta object for the reference '{@link biz.bi.vbr.vbrvm.VBRElementValueConnectAction#getTargetACT <em>Target ACT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target ACT</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRElementValueConnectAction#getTargetACT()
	 * @see #getVBRElementValueConnectAction()
	 * @generated
	 */
	EReference getVBRElementValueConnectAction_TargetACT();

	/**
	 * Returns the meta object for class '{@link biz.bi.vbr.vbrvm.VBRActionConnectElementValue <em>VBR Action Connect Element Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VBR Action Connect Element Value</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRActionConnectElementValue
	 * @generated
	 */
	EClass getVBRActionConnectElementValue();

	/**
	 * Returns the meta object for the reference '{@link biz.bi.vbr.vbrvm.VBRActionConnectElementValue#getSourceACT <em>Source ACT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source ACT</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRActionConnectElementValue#getSourceACT()
	 * @see #getVBRActionConnectElementValue()
	 * @generated
	 */
	EReference getVBRActionConnectElementValue_SourceACT();

	/**
	 * Returns the meta object for the reference '{@link biz.bi.vbr.vbrvm.VBRActionConnectElementValue#getTargetEV <em>Target EV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target EV</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRActionConnectElementValue#getTargetEV()
	 * @see #getVBRActionConnectElementValue()
	 * @generated
	 */
	EReference getVBRActionConnectElementValue_TargetEV();

	/**
	 * Returns the meta object for class '{@link biz.bi.vbr.vbrvm.VBRTreeConnectElementValue <em>VBR Tree Connect Element Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VBR Tree Connect Element Value</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRTreeConnectElementValue
	 * @generated
	 */
	EClass getVBRTreeConnectElementValue();

	/**
	 * Returns the meta object for the reference '{@link biz.bi.vbr.vbrvm.VBRTreeConnectElementValue#getSourceTr <em>Source Tr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Tr</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRTreeConnectElementValue#getSourceTr()
	 * @see #getVBRTreeConnectElementValue()
	 * @generated
	 */
	EReference getVBRTreeConnectElementValue_SourceTr();

	/**
	 * Returns the meta object for the reference '{@link biz.bi.vbr.vbrvm.VBRTreeConnectElementValue#getTargetEV <em>Target EV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target EV</em>'.
	 * @see biz.bi.vbr.vbrvm.VBRTreeConnectElementValue#getTargetEV()
	 * @see #getVBRTreeConnectElementValue()
	 * @generated
	 */
	EReference getVBRTreeConnectElementValue_TargetEV();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.swt.graphics.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color</em>'.
	 * @see org.eclipse.swt.graphics.Color
	 * @model instanceClass="org.eclipse.swt.graphics.Color"
	 * @generated
	 */
	EDataType getColor();

	/**
	 * Returns the meta object for data type '{@link biz.bi.vbr.BusinessObject <em>BM Business Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BM Business Object</em>'.
	 * @see biz.bi.vbr.BusinessObject
	 * @model instanceClass="biz.bi.vbr.BusinessObject"
	 * @generated
	 */
	EDataType getBMBusinessObject();

	/**
	 * Returns the meta object for data type '{@link biz.bi.vbr.BusinessValue <em>BM Business Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BM Business Value</em>'.
	 * @see biz.bi.vbr.BusinessValue
	 * @model instanceClass="biz.bi.vbr.BusinessValue"
	 * @generated
	 */
	EDataType getBMBusinessValue();

	/**
	 * Returns the meta object for data type '{@link biz.bi.vbr.BusinessAction <em>BM Business Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BM Business Action</em>'.
	 * @see biz.bi.vbr.BusinessAction
	 * @model instanceClass="biz.bi.vbr.BusinessAction"
	 * @generated
	 */
	EDataType getBMBusinessAction();

	/**
	 * Returns the meta object for data type '{@link biz.bi.vbr.FormalPolicy <em>BM Formal Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BM Formal Policy</em>'.
	 * @see biz.bi.vbr.FormalPolicy
	 * @model instanceClass="biz.bi.vbr.FormalPolicy"
	 * @generated
	 */
	EDataType getBMFormalPolicy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VBRVMFactory getVBRVMFactory();

} //VBRVMPackage