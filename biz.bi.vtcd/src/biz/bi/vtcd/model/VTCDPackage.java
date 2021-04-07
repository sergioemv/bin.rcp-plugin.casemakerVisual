/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDPackage.java,v 1.23 2005/08/26 15:43:09 smoreno Exp $
 */
package biz.bi.vtcd.model;

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
 * @see biz.bi.vtcd.model.VTCDFactory
 * @generated
 */
public interface VTCDPackage extends EPackage {
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vtcd"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://biz.bi.vtcd"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "VTCD"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VTCDPackage eINSTANCE = biz.bi.vtcd.model.impl.VTCDPackageImpl.init();

	/**
	 * The meta object id for the '{@link biz.bi.vtcd.model.VTCDDiagram <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.vtcd.model.VTCDDiagram
	 * @see biz.bi.vtcd.model.impl.VTCDPackageImpl#getVTCDDiagram()
	 * @generated
	 */
	int VTCD_DIAGRAM = 11;

	/**
	 * The feature id for the '<em><b>MVTCD Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_DIAGRAM__MVTCD_NOTE = 0;

	/**
	 * The number of structural features of the the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_DIAGRAM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link biz.bi.vtcd.model.impl.VTCDAbstractFigureImpl <em>Abstract Figure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.vtcd.model.impl.VTCDAbstractFigureImpl
	 * @see biz.bi.vtcd.model.impl.VTCDPackageImpl#getVTCDAbstractFigure()
	 * @generated
	 */
	int VTCD_ABSTRACT_FIGURE = 6;

	/**
	 * The meta object id for the '{@link biz.bi.vtcd.model.impl.VTCDDiagramCombinationImpl <em>Diagram Combination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.vtcd.model.impl.VTCDDiagramCombinationImpl
	 * @see biz.bi.vtcd.model.impl.VTCDPackageImpl#getVTCDDiagramCombination()
	 * @generated
	 */
	int VTCD_DIAGRAM_COMBINATION = 0;

	/**
	 * The feature id for the '<em><b>MVTCD Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_DIAGRAM_COMBINATION__MVTCD_NOTE = VTCD_DIAGRAM__MVTCD_NOTE;

	/**
	 * The feature id for the '<em><b>MVTCD Figure Combination</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_DIAGRAM_COMBINATION__MVTCD_FIGURE_COMBINATION = VTCD_DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MVTCD Figure Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_DIAGRAM_COMBINATION__MVTCD_FIGURE_ELEMENT = VTCD_DIAGRAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MFigure Dependency</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_DIAGRAM_COMBINATION__MFIGURE_DEPENDENCY = VTCD_DIAGRAM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the the '<em>Diagram Combination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_DIAGRAM_COMBINATION_FEATURE_COUNT = VTCD_DIAGRAM_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link biz.bi.vtcd.model.impl.VTCDDiagramMainImpl <em>Diagram Main</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.vtcd.model.impl.VTCDDiagramMainImpl
	 * @see biz.bi.vtcd.model.impl.VTCDPackageImpl#getVTCDDiagramMain()
	 * @generated
	 */
	int VTCD_DIAGRAM_MAIN = 1;

	/**
	 * The feature id for the '<em><b>MVTCD Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_DIAGRAM_MAIN__MVTCD_NOTE = VTCD_DIAGRAM__MVTCD_NOTE;

	/**
	 * The feature id for the '<em><b>MVTCD Figure Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_DIAGRAM_MAIN__MVTCD_FIGURE_ELEMENT = VTCD_DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MVTCD Figure Dependency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_DIAGRAM_MAIN__MVTCD_FIGURE_DEPENDENCY = VTCD_DIAGRAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MTest Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_DIAGRAM_MAIN__MTEST_OBJECT = VTCD_DIAGRAM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the the '<em>Diagram Main</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_DIAGRAM_MAIN_FEATURE_COUNT = VTCD_DIAGRAM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_ABSTRACT_FIGURE__HEIGHT = 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_ABSTRACT_FIGURE__WIDTH = 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_ABSTRACT_FIGURE__X = 2;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_ABSTRACT_FIGURE__Y = 3;

	/**
	 * The number of structural features of the the '<em>Abstract Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_ABSTRACT_FIGURE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link biz.bi.vtcd.model.impl.VTCDFigureCombinationImpl <em>Figure Combination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.vtcd.model.impl.VTCDFigureCombinationImpl
	 * @see biz.bi.vtcd.model.impl.VTCDPackageImpl#getVTCDFigureCombination()
	 * @generated
	 */
	int VTCD_FIGURE_COMBINATION = 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_COMBINATION__HEIGHT = VTCD_ABSTRACT_FIGURE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_COMBINATION__WIDTH = VTCD_ABSTRACT_FIGURE__WIDTH;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_COMBINATION__X = VTCD_ABSTRACT_FIGURE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_COMBINATION__Y = VTCD_ABSTRACT_FIGURE__Y;

	/**
	 * The feature id for the '<em><b>MVTCD Diagram Combination</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_COMBINATION__MVTCD_DIAGRAM_COMBINATION = VTCD_ABSTRACT_FIGURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MVTCD Link Combination EClass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_COMBINATION__MVTCD_LINK_COMBINATION_ECLASS = VTCD_ABSTRACT_FIGURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MCombination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_COMBINATION__MCOMBINATION = VTCD_ABSTRACT_FIGURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the the '<em>Figure Combination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_COMBINATION_FEATURE_COUNT = VTCD_ABSTRACT_FIGURE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link biz.bi.vtcd.model.impl.VTCDFigureElementImpl <em>Figure Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.vtcd.model.impl.VTCDFigureElementImpl
	 * @see biz.bi.vtcd.model.impl.VTCDPackageImpl#getVTCDFigureElement()
	 * @generated
	 */
	int VTCD_FIGURE_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_ELEMENT__HEIGHT = VTCD_ABSTRACT_FIGURE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_ELEMENT__WIDTH = VTCD_ABSTRACT_FIGURE__WIDTH;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_ELEMENT__X = VTCD_ABSTRACT_FIGURE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_ELEMENT__Y = VTCD_ABSTRACT_FIGURE__Y;

	/**
	 * The feature id for the '<em><b>MVTCD Diagram Combination</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_ELEMENT__MVTCD_DIAGRAM_COMBINATION = VTCD_ABSTRACT_FIGURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MVTCD Diagram Main</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_ELEMENT__MVTCD_DIAGRAM_MAIN = VTCD_ABSTRACT_FIGURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MVTCD Figure Equivalence Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_ELEMENT__MVTCD_FIGURE_EQUIVALENCE_CLASS = VTCD_ABSTRACT_FIGURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>MVTCD Link Dependency Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_ELEMENT__MVTCD_LINK_DEPENDENCY_ELEMENT = VTCD_ABSTRACT_FIGURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>MElement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_ELEMENT__MELEMENT = VTCD_ABSTRACT_FIGURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_ELEMENT__ICON = VTCD_ABSTRACT_FIGURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Folded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_ELEMENT__FOLDED = VTCD_ABSTRACT_FIGURE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the the '<em>Figure Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_ELEMENT_FEATURE_COUNT = VTCD_ABSTRACT_FIGURE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link biz.bi.vtcd.model.impl.VTCDFigureDependencyImpl <em>Figure Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.vtcd.model.impl.VTCDFigureDependencyImpl
	 * @see biz.bi.vtcd.model.impl.VTCDPackageImpl#getVTCDFigureDependency()
	 * @generated
	 */
	int VTCD_FIGURE_DEPENDENCY = 4;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_DEPENDENCY__HEIGHT = VTCD_ABSTRACT_FIGURE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_DEPENDENCY__WIDTH = VTCD_ABSTRACT_FIGURE__WIDTH;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_DEPENDENCY__X = VTCD_ABSTRACT_FIGURE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_DEPENDENCY__Y = VTCD_ABSTRACT_FIGURE__Y;

	/**
	 * The feature id for the '<em><b>MVTCD Diagram Main</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_DEPENDENCY__MVTCD_DIAGRAM_MAIN = VTCD_ABSTRACT_FIGURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_DEPENDENCY__ICON = VTCD_ABSTRACT_FIGURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MVTCD Link Dependency Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_DEPENDENCY__MVTCD_LINK_DEPENDENCY_ELEMENT = VTCD_ABSTRACT_FIGURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>MDependency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_DEPENDENCY__MDEPENDENCY = VTCD_ABSTRACT_FIGURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>MVTCD Diagram Combination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_DEPENDENCY__MVTCD_DIAGRAM_COMBINATION = VTCD_ABSTRACT_FIGURE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the the '<em>Figure Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_DEPENDENCY_FEATURE_COUNT = VTCD_ABSTRACT_FIGURE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link biz.bi.vtcd.model.impl.VTCDFigureEquivalenceClassImpl <em>Figure Equivalence Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.vtcd.model.impl.VTCDFigureEquivalenceClassImpl
	 * @see biz.bi.vtcd.model.impl.VTCDPackageImpl#getVTCDFigureEquivalenceClass()
	 * @generated
	 */
	int VTCD_FIGURE_EQUIVALENCE_CLASS = 5;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_EQUIVALENCE_CLASS__HEIGHT = VTCD_ABSTRACT_FIGURE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_EQUIVALENCE_CLASS__WIDTH = VTCD_ABSTRACT_FIGURE__WIDTH;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_EQUIVALENCE_CLASS__X = VTCD_ABSTRACT_FIGURE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_EQUIVALENCE_CLASS__Y = VTCD_ABSTRACT_FIGURE__Y;

	/**
	 * The feature id for the '<em><b>MVTCD Figure Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_EQUIVALENCE_CLASS__MVTCD_FIGURE_ELEMENT = VTCD_ABSTRACT_FIGURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MVTCD Link Combination EClass</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_EQUIVALENCE_CLASS__MVTCD_LINK_COMBINATION_ECLASS = VTCD_ABSTRACT_FIGURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MEquivalence Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_EQUIVALENCE_CLASS__MEQUIVALENCE_CLASS = VTCD_ABSTRACT_FIGURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the the '<em>Figure Equivalence Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_FIGURE_EQUIVALENCE_CLASS_FEATURE_COUNT = VTCD_ABSTRACT_FIGURE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link biz.bi.vtcd.model.impl.VTCDAbstractLinkImpl <em>Abstract Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.vtcd.model.impl.VTCDAbstractLinkImpl
	 * @see biz.bi.vtcd.model.impl.VTCDPackageImpl#getVTCDAbstractLink()
	 * @generated
	 */
	int VTCD_ABSTRACT_LINK = 9;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_ABSTRACT_LINK__COLOR = 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_ABSTRACT_LINK__WIDTH = 1;

	/**
	 * The feature id for the '<em><b>Bend Points</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_ABSTRACT_LINK__BEND_POINTS = 2;

	/**
	 * The feature id for the '<em><b>Source Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_ABSTRACT_LINK__SOURCE_TERMINAL = 3;

	/**
	 * The feature id for the '<em><b>Target Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_ABSTRACT_LINK__TARGET_TERMINAL = 4;

	/**
	 * The number of structural features of the the '<em>Abstract Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_ABSTRACT_LINK_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link biz.bi.vtcd.model.impl.VTCDLinkDependencyElementImpl <em>Link Dependency Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.vtcd.model.impl.VTCDLinkDependencyElementImpl
	 * @see biz.bi.vtcd.model.impl.VTCDPackageImpl#getVTCDLinkDependencyElement()
	 * @generated
	 */
	int VTCD_LINK_DEPENDENCY_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_LINK_DEPENDENCY_ELEMENT__COLOR = VTCD_ABSTRACT_LINK__COLOR;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_LINK_DEPENDENCY_ELEMENT__WIDTH = VTCD_ABSTRACT_LINK__WIDTH;

	/**
	 * The feature id for the '<em><b>Bend Points</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_LINK_DEPENDENCY_ELEMENT__BEND_POINTS = VTCD_ABSTRACT_LINK__BEND_POINTS;

	/**
	 * The feature id for the '<em><b>Source Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_LINK_DEPENDENCY_ELEMENT__SOURCE_TERMINAL = VTCD_ABSTRACT_LINK__SOURCE_TERMINAL;

	/**
	 * The feature id for the '<em><b>Target Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_LINK_DEPENDENCY_ELEMENT__TARGET_TERMINAL = VTCD_ABSTRACT_LINK__TARGET_TERMINAL;

	/**
	 * The feature id for the '<em><b>Source Dependency</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_LINK_DEPENDENCY_ELEMENT__SOURCE_DEPENDENCY = VTCD_ABSTRACT_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dest Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_LINK_DEPENDENCY_ELEMENT__DEST_ELEMENT = VTCD_ABSTRACT_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Link Dependency Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_LINK_DEPENDENCY_ELEMENT_FEATURE_COUNT = VTCD_ABSTRACT_LINK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link biz.bi.vtcd.model.impl.VTCDLinkCombinationEClassImpl <em>Link Combination EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.vtcd.model.impl.VTCDLinkCombinationEClassImpl
	 * @see biz.bi.vtcd.model.impl.VTCDPackageImpl#getVTCDLinkCombinationEClass()
	 * @generated
	 */
	int VTCD_LINK_COMBINATION_ECLASS = 8;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_LINK_COMBINATION_ECLASS__COLOR = VTCD_ABSTRACT_LINK__COLOR;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_LINK_COMBINATION_ECLASS__WIDTH = VTCD_ABSTRACT_LINK__WIDTH;

	/**
	 * The feature id for the '<em><b>Bend Points</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_LINK_COMBINATION_ECLASS__BEND_POINTS = VTCD_ABSTRACT_LINK__BEND_POINTS;

	/**
	 * The feature id for the '<em><b>Source Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_LINK_COMBINATION_ECLASS__SOURCE_TERMINAL = VTCD_ABSTRACT_LINK__SOURCE_TERMINAL;

	/**
	 * The feature id for the '<em><b>Target Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_LINK_COMBINATION_ECLASS__TARGET_TERMINAL = VTCD_ABSTRACT_LINK__TARGET_TERMINAL;

	/**
	 * The feature id for the '<em><b>Source Combination</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_LINK_COMBINATION_ECLASS__SOURCE_COMBINATION = VTCD_ABSTRACT_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dest Equivalence Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_LINK_COMBINATION_ECLASS__DEST_EQUIVALENCE_CLASS = VTCD_ABSTRACT_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Link Combination EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_LINK_COMBINATION_ECLASS_FEATURE_COUNT = VTCD_ABSTRACT_LINK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link biz.bi.vtcd.model.impl.VTCDNoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.vtcd.model.impl.VTCDNoteImpl
	 * @see biz.bi.vtcd.model.impl.VTCDPackageImpl#getVTCDNote()
	 * @generated
	 */
	int VTCD_NOTE = 10;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_NOTE__HEIGHT = VTCD_ABSTRACT_FIGURE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_NOTE__WIDTH = VTCD_ABSTRACT_FIGURE__WIDTH;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_NOTE__X = VTCD_ABSTRACT_FIGURE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_NOTE__Y = VTCD_ABSTRACT_FIGURE__Y;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_NOTE__TEXT = VTCD_ABSTRACT_FIGURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MVTCD Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_NOTE__MVTCD_DIAGRAM = VTCD_ABSTRACT_FIGURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_NOTE_FEATURE_COUNT = VTCD_ABSTRACT_FIGURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link biz.bi.vtcd.model.VTCDCMProxyFigure <em>CM Proxy Figure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.vtcd.model.VTCDCMProxyFigure
	 * @see biz.bi.vtcd.model.impl.VTCDPackageImpl#getVTCDCMProxyFigure()
	 * @generated
	 */
	int VTCD_CM_PROXY_FIGURE = 12;

	/**
	 * The number of structural features of the the '<em>CM Proxy Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCD_CM_PROXY_FIGURE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '<em>Test Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.cmcore.model.CMProxyTestObject
	 * @see biz.bi.vtcd.model.impl.VTCDPackageImpl#getTestObject()
	 * @generated
	 */
	int TEST_OBJECT = 13;

	/**
	 * The meta object id for the '<em>Dependency</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.cmcore.model.CMProxyDependency
	 * @see biz.bi.vtcd.model.impl.VTCDPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 14;

	/**
	 * The meta object id for the '<em>Color</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.swt.graphics.Color
	 * @see biz.bi.vtcd.model.impl.VTCDPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 15;

	/**
	 * The meta object id for the '<em>Element</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.cmcore.model.CMProxyElement
	 * @see biz.bi.vtcd.model.impl.VTCDPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 16;

	/**
	 * The meta object id for the '<em>Combination</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.cmcore.model.CMProxyCombination
	 * @see biz.bi.vtcd.model.impl.VTCDPackageImpl#getCombination()
	 * @generated
	 */
	int COMBINATION = 17;

	/**
	 * The meta object id for the '<em>Equivalence Class</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see biz.bi.cmcore.model.CMProxyEquivalenceClass
	 * @see biz.bi.vtcd.model.impl.VTCDPackageImpl#getEquivalenceClass()
	 * @generated
	 */
	int EQUIVALENCE_CLASS = 18;

	/**
	 * The meta object id for the '<em>Absolute Bend Point</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.AbsoluteBendpoint
	 * @see biz.bi.vtcd.model.impl.VTCDPackageImpl#getAbsoluteBendPoint()
	 * @generated
	 */
	int ABSOLUTE_BEND_POINT = 19;
	
	
	
	String VTCD_MAINDIAGRAMEDITOR = "biz.bi.vtcd.editors.VTCDMainDiagramEditor";
	
	String VTCD_COMBINATIONDIAGRAMEDITOR = "biz.bi.vtcd.editors.VTCDCombinationDiagramEditor";
	
	String VTCD_MAINDIAGRAMEDITORACTIONBARCONTRIBUTOR= "biz.bi.vtcd.gef.editors.VTCDMainDiagramEditorActionBarContributor";
	
	String VTCD_MODELWIZARD = "biz.bi.vtcd.presentation.VTCDModelWizard";
	
	/**
	 * Returns the meta object for class '{@link biz.bi.vtcd.model.VTCDDiagramCombination <em>Diagram Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Combination</em>'.
	 * @see biz.bi.vtcd.model.VTCDDiagramCombination
	 * @generated
	 */
	EClass getVTCDDiagramCombination();

	/**
	 * Returns the meta object for the containment reference list '{@link biz.bi.vtcd.model.VTCDDiagramCombination#getM_VTCDFigureCombination <em>MVTCD Figure Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MVTCD Figure Combination</em>'.
	 * @see biz.bi.vtcd.model.VTCDDiagramCombination#getM_VTCDFigureCombination()
	 * @see #getVTCDDiagramCombination()
	 * @generated
	 */
	EReference getVTCDDiagramCombination_M_VTCDFigureCombination();

	/**
	 * Returns the meta object for the containment reference list '{@link biz.bi.vtcd.model.VTCDDiagramCombination#getM_VTCDFigureElement <em>MVTCD Figure Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MVTCD Figure Element</em>'.
	 * @see biz.bi.vtcd.model.VTCDDiagramCombination#getM_VTCDFigureElement()
	 * @see #getVTCDDiagramCombination()
	 * @generated
	 */
	EReference getVTCDDiagramCombination_M_VTCDFigureElement();

	/**
	 * Returns the meta object for the container reference '{@link biz.bi.vtcd.model.VTCDDiagramCombination#getM_FigureDependency <em>MFigure Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>MFigure Dependency</em>'.
	 * @see biz.bi.vtcd.model.VTCDDiagramCombination#getM_FigureDependency()
	 * @see #getVTCDDiagramCombination()
	 * @generated
	 */
	EReference getVTCDDiagramCombination_M_FigureDependency();

	/**
	 * Returns the meta object for class '{@link biz.bi.vtcd.model.VTCDDiagramMain <em>Diagram Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Main</em>'.
	 * @see biz.bi.vtcd.model.VTCDDiagramMain
	 * @generated
	 */
	EClass getVTCDDiagramMain();

	/**
	 * Returns the meta object for the containment reference list '{@link biz.bi.vtcd.model.VTCDDiagramMain#getM_VTCDFigureElement <em>MVTCD Figure Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MVTCD Figure Element</em>'.
	 * @see biz.bi.vtcd.model.VTCDDiagramMain#getM_VTCDFigureElement()
	 * @see #getVTCDDiagramMain()
	 * @generated
	 */
	EReference getVTCDDiagramMain_M_VTCDFigureElement();

	/**
	 * Returns the meta object for the containment reference list '{@link biz.bi.vtcd.model.VTCDDiagramMain#getM_VTCDFigureDependency <em>MVTCD Figure Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MVTCD Figure Dependency</em>'.
	 * @see biz.bi.vtcd.model.VTCDDiagramMain#getM_VTCDFigureDependency()
	 * @see #getVTCDDiagramMain()
	 * @generated
	 */
	EReference getVTCDDiagramMain_M_VTCDFigureDependency();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vtcd.model.VTCDDiagramMain#getM_TestObject <em>MTest Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MTest Object</em>'.
	 * @see biz.bi.vtcd.model.VTCDDiagramMain#getM_TestObject()
	 * @see #getVTCDDiagramMain()
	 * @generated
	 */
	EAttribute getVTCDDiagramMain_M_TestObject();

	/**
	 * Returns the meta object for class '{@link biz.bi.vtcd.model.VTCDFigureCombination <em>Figure Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Figure Combination</em>'.
	 * @see biz.bi.vtcd.model.VTCDFigureCombination
	 * @generated
	 */
	EClass getVTCDFigureCombination();

	/**
	 * Returns the meta object for the container reference '{@link biz.bi.vtcd.model.VTCDFigureCombination#getM_VTCDDiagramCombination <em>MVTCD Diagram Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>MVTCD Diagram Combination</em>'.
	 * @see biz.bi.vtcd.model.VTCDFigureCombination#getM_VTCDDiagramCombination()
	 * @see #getVTCDFigureCombination()
	 * @generated
	 */
	EReference getVTCDFigureCombination_M_VTCDDiagramCombination();

	/**
	 * Returns the meta object for the containment reference list '{@link biz.bi.vtcd.model.VTCDFigureCombination#getM_VTCDLinkCombinationEClass <em>MVTCD Link Combination EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MVTCD Link Combination EClass</em>'.
	 * @see biz.bi.vtcd.model.VTCDFigureCombination#getM_VTCDLinkCombinationEClass()
	 * @see #getVTCDFigureCombination()
	 * @generated
	 */
	EReference getVTCDFigureCombination_M_VTCDLinkCombinationEClass();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vtcd.model.VTCDFigureCombination#getM_Combination <em>MCombination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MCombination</em>'.
	 * @see biz.bi.vtcd.model.VTCDFigureCombination#getM_Combination()
	 * @see #getVTCDFigureCombination()
	 * @generated
	 */
	EAttribute getVTCDFigureCombination_M_Combination();

	/**
	 * Returns the meta object for class '{@link biz.bi.vtcd.model.VTCDFigureElement <em>Figure Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Figure Element</em>'.
	 * @see biz.bi.vtcd.model.VTCDFigureElement
	 * @generated
	 */
	EClass getVTCDFigureElement();

	/**
	 * Returns the meta object for the container reference '{@link biz.bi.vtcd.model.VTCDFigureElement#getM_VTCDDiagramCombination <em>MVTCD Diagram Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>MVTCD Diagram Combination</em>'.
	 * @see biz.bi.vtcd.model.VTCDFigureElement#getM_VTCDDiagramCombination()
	 * @see #getVTCDFigureElement()
	 * @generated
	 */
	EReference getVTCDFigureElement_M_VTCDDiagramCombination();

	/**
	 * Returns the meta object for the container reference '{@link biz.bi.vtcd.model.VTCDFigureElement#getM_VTCDDiagramMain <em>MVTCD Diagram Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>MVTCD Diagram Main</em>'.
	 * @see biz.bi.vtcd.model.VTCDFigureElement#getM_VTCDDiagramMain()
	 * @see #getVTCDFigureElement()
	 * @generated
	 */
	EReference getVTCDFigureElement_M_VTCDDiagramMain();

	/**
	 * Returns the meta object for the containment reference list '{@link biz.bi.vtcd.model.VTCDFigureElement#getM_VTCDFigureEquivalenceClass <em>MVTCD Figure Equivalence Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MVTCD Figure Equivalence Class</em>'.
	 * @see biz.bi.vtcd.model.VTCDFigureElement#getM_VTCDFigureEquivalenceClass()
	 * @see #getVTCDFigureElement()
	 * @generated
	 */
	EReference getVTCDFigureElement_M_VTCDFigureEquivalenceClass();

	/**
	 * Returns the meta object for the reference list '{@link biz.bi.vtcd.model.VTCDFigureElement#getM_VTCDLinkDependencyElement <em>MVTCD Link Dependency Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>MVTCD Link Dependency Element</em>'.
	 * @see biz.bi.vtcd.model.VTCDFigureElement#getM_VTCDLinkDependencyElement()
	 * @see #getVTCDFigureElement()
	 * @generated
	 */
	EReference getVTCDFigureElement_M_VTCDLinkDependencyElement();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vtcd.model.VTCDFigureElement#getM_Element <em>MElement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MElement</em>'.
	 * @see biz.bi.vtcd.model.VTCDFigureElement#getM_Element()
	 * @see #getVTCDFigureElement()
	 * @generated
	 */
	EAttribute getVTCDFigureElement_M_Element();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vtcd.model.VTCDFigureElement#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see biz.bi.vtcd.model.VTCDFigureElement#getIcon()
	 * @see #getVTCDFigureElement()
	 * @generated
	 */
	EAttribute getVTCDFigureElement_Icon();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vtcd.model.VTCDFigureElement#isFolded <em>Folded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Folded</em>'.
	 * @see biz.bi.vtcd.model.VTCDFigureElement#isFolded()
	 * @see #getVTCDFigureElement()
	 * @generated
	 */
	EAttribute getVTCDFigureElement_Folded();

	/**
	 * Returns the meta object for class '{@link biz.bi.vtcd.model.VTCDFigureDependency <em>Figure Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Figure Dependency</em>'.
	 * @see biz.bi.vtcd.model.VTCDFigureDependency
	 * @generated
	 */
	EClass getVTCDFigureDependency();

	/**
	 * Returns the meta object for the container reference '{@link biz.bi.vtcd.model.VTCDFigureDependency#getM_VTCDDiagramMain <em>MVTCD Diagram Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>MVTCD Diagram Main</em>'.
	 * @see biz.bi.vtcd.model.VTCDFigureDependency#getM_VTCDDiagramMain()
	 * @see #getVTCDFigureDependency()
	 * @generated
	 */
	EReference getVTCDFigureDependency_M_VTCDDiagramMain();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vtcd.model.VTCDFigureDependency#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see biz.bi.vtcd.model.VTCDFigureDependency#getIcon()
	 * @see #getVTCDFigureDependency()
	 * @generated
	 */
	EAttribute getVTCDFigureDependency_Icon();

	/**
	 * Returns the meta object for the containment reference list '{@link biz.bi.vtcd.model.VTCDFigureDependency#getM_VTCDLinkDependencyElement <em>MVTCD Link Dependency Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MVTCD Link Dependency Element</em>'.
	 * @see biz.bi.vtcd.model.VTCDFigureDependency#getM_VTCDLinkDependencyElement()
	 * @see #getVTCDFigureDependency()
	 * @generated
	 */
	EReference getVTCDFigureDependency_M_VTCDLinkDependencyElement();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vtcd.model.VTCDFigureDependency#getM_Dependency <em>MDependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MDependency</em>'.
	 * @see biz.bi.vtcd.model.VTCDFigureDependency#getM_Dependency()
	 * @see #getVTCDFigureDependency()
	 * @generated
	 */
	EAttribute getVTCDFigureDependency_M_Dependency();

	/**
	 * Returns the meta object for the containment reference '{@link biz.bi.vtcd.model.VTCDFigureDependency#getM_VTCDDiagramCombination <em>MVTCD Diagram Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MVTCD Diagram Combination</em>'.
	 * @see biz.bi.vtcd.model.VTCDFigureDependency#getM_VTCDDiagramCombination()
	 * @see #getVTCDFigureDependency()
	 * @generated
	 */
	EReference getVTCDFigureDependency_M_VTCDDiagramCombination();

	/**
	 * Returns the meta object for class '{@link biz.bi.vtcd.model.VTCDFigureEquivalenceClass <em>Figure Equivalence Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Figure Equivalence Class</em>'.
	 * @see biz.bi.vtcd.model.VTCDFigureEquivalenceClass
	 * @generated
	 */
	EClass getVTCDFigureEquivalenceClass();

	/**
	 * Returns the meta object for the container reference '{@link biz.bi.vtcd.model.VTCDFigureEquivalenceClass#getM_VTCDFigureElement <em>MVTCD Figure Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>MVTCD Figure Element</em>'.
	 * @see biz.bi.vtcd.model.VTCDFigureEquivalenceClass#getM_VTCDFigureElement()
	 * @see #getVTCDFigureEquivalenceClass()
	 * @generated
	 */
	EReference getVTCDFigureEquivalenceClass_M_VTCDFigureElement();

	/**
	 * Returns the meta object for the reference list '{@link biz.bi.vtcd.model.VTCDFigureEquivalenceClass#getM_VTCDLinkCombinationEClass <em>MVTCD Link Combination EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>MVTCD Link Combination EClass</em>'.
	 * @see biz.bi.vtcd.model.VTCDFigureEquivalenceClass#getM_VTCDLinkCombinationEClass()
	 * @see #getVTCDFigureEquivalenceClass()
	 * @generated
	 */
	EReference getVTCDFigureEquivalenceClass_M_VTCDLinkCombinationEClass();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vtcd.model.VTCDFigureEquivalenceClass#getM_EquivalenceClass <em>MEquivalence Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MEquivalence Class</em>'.
	 * @see biz.bi.vtcd.model.VTCDFigureEquivalenceClass#getM_EquivalenceClass()
	 * @see #getVTCDFigureEquivalenceClass()
	 * @generated
	 */
	EAttribute getVTCDFigureEquivalenceClass_M_EquivalenceClass();

	/**
	 * Returns the meta object for class '{@link biz.bi.vtcd.model.VTCDAbstractFigure <em>Abstract Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Figure</em>'.
	 * @see biz.bi.vtcd.model.VTCDAbstractFigure
	 * @generated
	 */
	EClass getVTCDAbstractFigure();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vtcd.model.VTCDAbstractFigure#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see biz.bi.vtcd.model.VTCDAbstractFigure#getHeight()
	 * @see #getVTCDAbstractFigure()
	 * @generated
	 */
	EAttribute getVTCDAbstractFigure_Height();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vtcd.model.VTCDAbstractFigure#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see biz.bi.vtcd.model.VTCDAbstractFigure#getWidth()
	 * @see #getVTCDAbstractFigure()
	 * @generated
	 */
	EAttribute getVTCDAbstractFigure_Width();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vtcd.model.VTCDAbstractFigure#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see biz.bi.vtcd.model.VTCDAbstractFigure#getX()
	 * @see #getVTCDAbstractFigure()
	 * @generated
	 */
	EAttribute getVTCDAbstractFigure_X();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vtcd.model.VTCDAbstractFigure#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see biz.bi.vtcd.model.VTCDAbstractFigure#getY()
	 * @see #getVTCDAbstractFigure()
	 * @generated
	 */
	EAttribute getVTCDAbstractFigure_Y();

	/**
	 * Returns the meta object for class '{@link biz.bi.vtcd.model.VTCDLinkDependencyElement <em>Link Dependency Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Dependency Element</em>'.
	 * @see biz.bi.vtcd.model.VTCDLinkDependencyElement
	 * @generated
	 */
	EClass getVTCDLinkDependencyElement();

	/**
	 * Returns the meta object for the container reference '{@link biz.bi.vtcd.model.VTCDLinkDependencyElement#getSourceDependency <em>Source Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source Dependency</em>'.
	 * @see biz.bi.vtcd.model.VTCDLinkDependencyElement#getSourceDependency()
	 * @see #getVTCDLinkDependencyElement()
	 * @generated
	 */
	EReference getVTCDLinkDependencyElement_SourceDependency();

	/**
	 * Returns the meta object for the reference '{@link biz.bi.vtcd.model.VTCDLinkDependencyElement#getDestElement <em>Dest Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dest Element</em>'.
	 * @see biz.bi.vtcd.model.VTCDLinkDependencyElement#getDestElement()
	 * @see #getVTCDLinkDependencyElement()
	 * @generated
	 */
	EReference getVTCDLinkDependencyElement_DestElement();

	/**
	 * Returns the meta object for class '{@link biz.bi.vtcd.model.VTCDLinkCombinationEClass <em>Link Combination EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Combination EClass</em>'.
	 * @see biz.bi.vtcd.model.VTCDLinkCombinationEClass
	 * @generated
	 */
	EClass getVTCDLinkCombinationEClass();

	/**
	 * Returns the meta object for the container reference '{@link biz.bi.vtcd.model.VTCDLinkCombinationEClass#getSourceCombination <em>Source Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source Combination</em>'.
	 * @see biz.bi.vtcd.model.VTCDLinkCombinationEClass#getSourceCombination()
	 * @see #getVTCDLinkCombinationEClass()
	 * @generated
	 */
	EReference getVTCDLinkCombinationEClass_SourceCombination();

	/**
	 * Returns the meta object for the reference '{@link biz.bi.vtcd.model.VTCDLinkCombinationEClass#getDestEquivalenceClass <em>Dest Equivalence Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dest Equivalence Class</em>'.
	 * @see biz.bi.vtcd.model.VTCDLinkCombinationEClass#getDestEquivalenceClass()
	 * @see #getVTCDLinkCombinationEClass()
	 * @generated
	 */
	EReference getVTCDLinkCombinationEClass_DestEquivalenceClass();

	/**
	 * Returns the meta object for class '{@link biz.bi.vtcd.model.VTCDAbstractLink <em>Abstract Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Link</em>'.
	 * @see biz.bi.vtcd.model.VTCDAbstractLink
	 * @generated
	 */
	EClass getVTCDAbstractLink();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vtcd.model.VTCDAbstractLink#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see biz.bi.vtcd.model.VTCDAbstractLink#getColor()
	 * @see #getVTCDAbstractLink()
	 * @generated
	 */
	EAttribute getVTCDAbstractLink_Color();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vtcd.model.VTCDAbstractLink#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see biz.bi.vtcd.model.VTCDAbstractLink#getWidth()
	 * @see #getVTCDAbstractLink()
	 * @generated
	 */
	EAttribute getVTCDAbstractLink_Width();

	/**
	 * Returns the meta object for the attribute list '{@link biz.bi.vtcd.model.VTCDAbstractLink#getBendPoints <em>Bend Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bend Points</em>'.
	 * @see biz.bi.vtcd.model.VTCDAbstractLink#getBendPoints()
	 * @see #getVTCDAbstractLink()
	 * @generated
	 */
	EAttribute getVTCDAbstractLink_BendPoints();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vtcd.model.VTCDAbstractLink#getSourceTerminal <em>Source Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Terminal</em>'.
	 * @see biz.bi.vtcd.model.VTCDAbstractLink#getSourceTerminal()
	 * @see #getVTCDAbstractLink()
	 * @generated
	 */
	EAttribute getVTCDAbstractLink_SourceTerminal();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vtcd.model.VTCDAbstractLink#getTargetTerminal <em>Target Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Terminal</em>'.
	 * @see biz.bi.vtcd.model.VTCDAbstractLink#getTargetTerminal()
	 * @see #getVTCDAbstractLink()
	 * @generated
	 */
	EAttribute getVTCDAbstractLink_TargetTerminal();

	/**
	 * Returns the meta object for class '{@link biz.bi.vtcd.model.VTCDNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see biz.bi.vtcd.model.VTCDNote
	 * @generated
	 */
	EClass getVTCDNote();

	/**
	 * Returns the meta object for the attribute '{@link biz.bi.vtcd.model.VTCDNote#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see biz.bi.vtcd.model.VTCDNote#getText()
	 * @see #getVTCDNote()
	 * @generated
	 */
	EAttribute getVTCDNote_Text();

	/**
	 * Returns the meta object for the container reference '{@link biz.bi.vtcd.model.VTCDNote#getM_VTCDDiagram <em>MVTCD Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>MVTCD Diagram</em>'.
	 * @see biz.bi.vtcd.model.VTCDNote#getM_VTCDDiagram()
	 * @see #getVTCDNote()
	 * @generated
	 */
	EReference getVTCDNote_M_VTCDDiagram();

	/**
	 * Returns the meta object for class '{@link biz.bi.vtcd.model.VTCDDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see biz.bi.vtcd.model.VTCDDiagram
	 * @generated
	 */
	EClass getVTCDDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link biz.bi.vtcd.model.VTCDDiagram#getM_VTCDNote <em>MVTCD Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MVTCD Note</em>'.
	 * @see biz.bi.vtcd.model.VTCDDiagram#getM_VTCDNote()
	 * @see #getVTCDDiagram()
	 * @generated
	 */
	EReference getVTCDDiagram_M_VTCDNote();

	/**
	 * Returns the meta object for class '{@link biz.bi.vtcd.model.VTCDCMProxyFigure <em>CM Proxy Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CM Proxy Figure</em>'.
	 * @see biz.bi.vtcd.model.VTCDCMProxyFigure
	 * @generated
	 */
	EClass getVTCDCMProxyFigure();

	/**
	 * Returns the meta object for data type '{@link biz.bi.cmcore.model.CMProxyTestObject <em>Test Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Object</em>'.
	 * @see biz.bi.cmcore.model.CMProxyTestObject
	 * @model instanceClass="biz.bi.cmcore.model.CMProxyTestObject"
	 * @generated
	 */
	EDataType getTestObject();

	/**
	 * Returns the meta object for data type '{@link biz.bi.cmcore.model.CMProxyDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Dependency</em>'.
	 * @see biz.bi.cmcore.model.CMProxyDependency
	 * @model instanceClass="biz.bi.cmcore.model.CMProxyDependency"
	 * @generated
	 */
	EDataType getDependency();

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
	 * Returns the meta object for data type '{@link biz.bi.cmcore.model.CMProxyElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Element</em>'.
	 * @see biz.bi.cmcore.model.CMProxyElement
	 * @model instanceClass="biz.bi.cmcore.model.CMProxyElement"
	 * @generated
	 */
	EDataType getElement();

	/**
	 * Returns the meta object for data type '{@link biz.bi.cmcore.model.CMProxyCombination <em>Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Combination</em>'.
	 * @see biz.bi.cmcore.model.CMProxyCombination
	 * @model instanceClass="biz.bi.cmcore.model.CMProxyCombination"
	 * @generated
	 */
	EDataType getCombination();

	/**
	 * Returns the meta object for data type '{@link biz.bi.cmcore.model.CMProxyEquivalenceClass <em>Equivalence Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Equivalence Class</em>'.
	 * @see biz.bi.cmcore.model.CMProxyEquivalenceClass
	 * @model instanceClass="biz.bi.cmcore.model.CMProxyEquivalenceClass"
	 * @generated
	 */
	EDataType getEquivalenceClass();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.draw2d.AbsoluteBendpoint <em>Absolute Bend Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Absolute Bend Point</em>'.
	 * @see org.eclipse.draw2d.AbsoluteBendpoint
	 * @model instanceClass="org.eclipse.draw2d.AbsoluteBendpoint"
	 * @generated
	 */
	EDataType getAbsoluteBendPoint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VTCDFactory getVTCDFactory();

} //VTCDPackage
