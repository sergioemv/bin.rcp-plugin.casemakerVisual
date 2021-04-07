/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDFigureDependency.java,v 1.13 2005/09/20 16:04:53 smoreno Exp $
 */
package biz.bi.vtcd.model;

import org.eclipse.emf.common.util.EList;

import biz.bi.cmcore.model.CMCorePackage;
import biz.bi.cmcore.model.CMProxyDependency;
import biz.bi.cmcore.model.CMProxyElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Figure Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.vtcd.model.VTCDFigureDependency#getM_VTCDDiagramMain <em>MVTCD Diagram Main</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.VTCDFigureDependency#getIcon <em>Icon</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.VTCDFigureDependency#getM_VTCDLinkDependencyElement <em>MVTCD Link Dependency Element</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.VTCDFigureDependency#getM_Dependency <em>MDependency</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.VTCDFigureDependency#getM_VTCDDiagramCombination <em>MVTCD Diagram Combination</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDFigureDependency()
 * @model
 * @generated
 */
public interface VTCDFigureDependency extends VTCDAbstractFigure,
		VTCDCMProxyFigure {
	/**
	 * The default value of the ' {@link #getM_Dependency()  <em>MDependency</em>} ' attribute. <!-- begin-user-doc --> must not be null <!-- end-user-doc -->
	 * @see #getM_Dependency()
	 * @generated  NOT
	 * @author  Sergio M
	 * @ordered
	 */
	public static final CMProxyDependency DEPENDENCY_EDEFAULT = CMCorePackage.eINSTANCE
			.getCMCoreFactory().createCMProxyDependency();

	/**
	 * @author  smoreno initial height on an element do not confuse with HEIGHT_EDEFAULT wich is from EMF 
	 */
	public static final int HEIGHT_DEFAULT  = -1;

	/**
	 * @author  smoreno initial width on an element do not confuse with WIDTH_EDEFAULT wich is from EMF 
	 */
	public static final int WIDTH_DEFAULT = -1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>MVTCD Diagram Main</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link biz.bi.vtcd.model.VTCDDiagramMain#getM_VTCDFigureDependency <em>MVTCD Figure Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MVTCD Diagram Main</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MVTCD Diagram Main</em>' container reference.
	 * @see #setM_VTCDDiagramMain(VTCDDiagramMain)
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDFigureDependency_M_VTCDDiagramMain()
	 * @see biz.bi.vtcd.model.VTCDDiagramMain#getM_VTCDFigureDependency
	 * @model opposite="m_VTCDFigureDependency" required="true"
	 * @generated
	 */
	VTCDDiagramMain getM_VTCDDiagramMain();

	/**
	 * Sets the value of the '{@link biz.bi.vtcd.model.VTCDFigureDependency#getM_VTCDDiagramMain <em>MVTCD Diagram Main</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MVTCD Diagram Main</em>' container reference.
	 * @see #getM_VTCDDiagramMain()
	 * @generated
	 */
	void setM_VTCDDiagramMain(VTCDDiagramMain value);

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(String)
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDFigureDependency_Icon()
	 * @model
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link biz.bi.vtcd.model.VTCDFigureDependency#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(String value);

	/**
	 * Returns the value of the '<em><b>MVTCD Link Dependency Element</b></em>' containment reference list.
	 * The list contents are of type {@link biz.bi.vtcd.model.VTCDLinkDependencyElement}.
	 * It is bidirectional and its opposite is '{@link biz.bi.vtcd.model.VTCDLinkDependencyElement#getSourceDependency <em>Source Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MVTCD Link Dependency Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MVTCD Link Dependency Element</em>' containment reference list.
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDFigureDependency_M_VTCDLinkDependencyElement()
	 * @see biz.bi.vtcd.model.VTCDLinkDependencyElement#getSourceDependency
	 * @model type="biz.bi.vtcd.model.VTCDLinkDependencyElement" opposite="sourceDependency" containment="true"
	 * @generated
	 */
	EList getM_VTCDLinkDependencyElement();

	VTCDLinkDependencyElement getM_VTCDLinkDependencyElement(
			CMProxyElement p_Element);

	/**
	 * Returns the value of the '<em><b>MDependency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MDependency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MDependency</em>' attribute.
	 * @see #setM_Dependency(CMProxyDependency)
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDFigureDependency_M_Dependency()
	 * @model dataType="biz.bi.vtcd.model.Dependency" required="true"
	 * @generated
	 */
	CMProxyDependency getM_Dependency();

	/**
	 * Sets the value of the '{@link biz.bi.vtcd.model.VTCDFigureDependency#getM_Dependency <em>MDependency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MDependency</em>' attribute.
	 * @see #getM_Dependency()
	 * @generated
	 */
	void setM_Dependency(CMProxyDependency value);

	/**
	 * Returns the value of the '<em><b>MVTCD Diagram Combination</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link biz.bi.vtcd.model.VTCDDiagramCombination#getM_FigureDependency <em>MFigure Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MVTCD Diagram Combination</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MVTCD Diagram Combination</em>' containment reference.
	 * @see #setM_VTCDDiagramCombination(VTCDDiagramCombination)
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDFigureDependency_M_VTCDDiagramCombination()
	 * @see biz.bi.vtcd.model.VTCDDiagramCombination#getM_FigureDependency
	 * @model opposite="m_FigureDependency" containment="true" required="true"
	 * @generated
	 */
	VTCDDiagramCombination getM_VTCDDiagramCombination();

	/**
	 * Sets the value of the '{@link biz.bi.vtcd.model.VTCDFigureDependency#getM_VTCDDiagramCombination <em>MVTCD Diagram Combination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MVTCD Diagram Combination</em>' containment reference.
	 * @see #getM_VTCDDiagramCombination()
	 * @generated
	 */
	void setM_VTCDDiagramCombination(VTCDDiagramCombination value);

} // VTCDFigureDependency
