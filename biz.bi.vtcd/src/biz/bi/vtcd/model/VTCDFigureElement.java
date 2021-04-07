/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDFigureElement.java,v 1.16 2005/08/26 15:43:09 smoreno Exp $
 */
package biz.bi.vtcd.model;

import org.eclipse.emf.common.util.EList;

import biz.bi.cmcore.model.CMCorePackage;
import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Figure Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.vtcd.model.VTCDFigureElement#getM_VTCDDiagramCombination <em>MVTCD Diagram Combination</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.VTCDFigureElement#getM_VTCDDiagramMain <em>MVTCD Diagram Main</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.VTCDFigureElement#getM_VTCDFigureEquivalenceClass <em>MVTCD Figure Equivalence Class</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.VTCDFigureElement#getM_VTCDLinkDependencyElement <em>MVTCD Link Dependency Element</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.VTCDFigureElement#getM_Element <em>MElement</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.VTCDFigureElement#getIcon <em>Icon</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.VTCDFigureElement#isFolded <em>Folded</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDFigureElement()
 * @model
 * @generated
 */
public interface VTCDFigureElement extends VTCDAbstractFigure,
		VTCDCMProxyFigure {
	/**
	 * The default value of the ' {@link #getM_Element()  <em>MElement</em>} ' attribute. <!-- begin-user-doc --> the default value is a proxyelement (without a resolved proxy) <!-- end-user-doc -->
	 * @see #getM_Element()
	 * @generated  NOT
	 * @author smoreno
	 * @ordered
	 */
	public static final CMProxyElement ELEMENT_EDEFAULT = CMCorePackage.eINSTANCE.getCMCoreFactory().createCMProxyElement();

	/**
	 *@author smoreno
	 *initial width on an element
	 *do not confuse with WIDTH_EDEFAULT wich is from EMF 
	 */
	public static final int WIDTH_DEFAULT = 150;

	/**
	 *@author smoreno
	 *initial height on an element
	 *do not confuse with HEIGHT_EDEFAULT wich is from EMF 
	 *is set to -1 to allow auto resize
	 */
	public static final int HEIGHT_DEFAULT = 50;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>MVTCD Diagram Combination</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link biz.bi.vtcd.model.VTCDDiagramCombination#getM_VTCDFigureElement <em>MVTCD Figure Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MVTCD Diagram Combination</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MVTCD Diagram Combination</em>' container reference.
	 * @see #setM_VTCDDiagramCombination(VTCDDiagramCombination)
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDFigureElement_M_VTCDDiagramCombination()
	 * @see biz.bi.vtcd.model.VTCDDiagramCombination#getM_VTCDFigureElement
	 * @model opposite="m_VTCDFigureElement" required="true"
	 * @generated
	 */
	VTCDDiagramCombination getM_VTCDDiagramCombination();

	/**
	 * Sets the value of the '{@link biz.bi.vtcd.model.VTCDFigureElement#getM_VTCDDiagramCombination <em>MVTCD Diagram Combination</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MVTCD Diagram Combination</em>' container reference.
	 * @see #getM_VTCDDiagramCombination()
	 * @generated
	 */
	void setM_VTCDDiagramCombination(VTCDDiagramCombination value);

	/**
	 * Returns the value of the '<em><b>MVTCD Diagram Main</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link biz.bi.vtcd.model.VTCDDiagramMain#getM_VTCDFigureElement <em>MVTCD Figure Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MVTCD Diagram Main</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MVTCD Diagram Main</em>' container reference.
	 * @see #setM_VTCDDiagramMain(VTCDDiagramMain)
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDFigureElement_M_VTCDDiagramMain()
	 * @see biz.bi.vtcd.model.VTCDDiagramMain#getM_VTCDFigureElement
	 * @model opposite="m_VTCDFigureElement" required="true"
	 * @generated
	 */
	VTCDDiagramMain getM_VTCDDiagramMain();

	/**
	 * Sets the value of the '{@link biz.bi.vtcd.model.VTCDFigureElement#getM_VTCDDiagramMain <em>MVTCD Diagram Main</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MVTCD Diagram Main</em>' container reference.
	 * @see #getM_VTCDDiagramMain()
	 * @generated
	 */
	void setM_VTCDDiagramMain(VTCDDiagramMain value);

	/**
	 * Returns the value of the '<em><b>MVTCD Figure Equivalence Class</b></em>' containment reference list.
	 * The list contents are of type {@link biz.bi.vtcd.model.VTCDFigureEquivalenceClass}.
	 * It is bidirectional and its opposite is '{@link biz.bi.vtcd.model.VTCDFigureEquivalenceClass#getM_VTCDFigureElement <em>MVTCD Figure Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MVTCD Figure Equivalence Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MVTCD Figure Equivalence Class</em>' containment reference list.
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDFigureElement_M_VTCDFigureEquivalenceClass()
	 * @see biz.bi.vtcd.model.VTCDFigureEquivalenceClass#getM_VTCDFigureElement
	 * @model type="biz.bi.vtcd.model.VTCDFigureEquivalenceClass" opposite="m_VTCDFigureElement" containment="true"
	 * @generated
	 */
	EList getM_VTCDFigureEquivalenceClass();

	VTCDFigureEquivalenceClass getM_VTCDFigureEquivalenceClass(
			CMProxyEquivalenceClass p_EquivalenceClass);

	/**
	 * Returns the value of the '<em><b>MVTCD Link Dependency Element</b></em>' reference list.
	 * The list contents are of type {@link biz.bi.vtcd.model.VTCDLinkDependencyElement}.
	 * It is bidirectional and its opposite is '{@link biz.bi.vtcd.model.VTCDLinkDependencyElement#getDestElement <em>Dest Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MVTCD Link Dependency Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MVTCD Link Dependency Element</em>' reference list.
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDFigureElement_M_VTCDLinkDependencyElement()
	 * @see biz.bi.vtcd.model.VTCDLinkDependencyElement#getDestElement
	 * @model type="biz.bi.vtcd.model.VTCDLinkDependencyElement" opposite="destElement"
	 * @generated
	 */
	EList getM_VTCDLinkDependencyElement();

	/**
	 * Returns the value of the '<em><b>MElement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MElement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MElement</em>' attribute.
	 * @see #setM_Element(CMProxyElement)
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDFigureElement_M_Element()
	 * @model dataType="biz.bi.vtcd.model.Element" required="true"
	 * @generated
	 */
	CMProxyElement getM_Element();

	/**
	 * Sets the value of the '{@link biz.bi.vtcd.model.VTCDFigureElement#getM_Element <em>MElement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MElement</em>' attribute.
	 * @see #getM_Element()
	 * @generated
	 */
	void setM_Element(CMProxyElement value);

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
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDFigureElement_Icon()
	 * @model
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link biz.bi.vtcd.model.VTCDFigureElement#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(String value);

	/**
	 * Returns the value of the '<em><b>Folded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Folded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folded</em>' attribute.
	 * @see #setFolded(boolean)
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDFigureElement_Folded()
	 * @model
	 * @generated
	 */
	boolean isFolded();

	/**
	 * Sets the value of the '{@link biz.bi.vtcd.model.VTCDFigureElement#isFolded <em>Folded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folded</em>' attribute.
	 * @see #isFolded()
	 * @generated
	 */
	void setFolded(boolean value);

} // VTCDFigureElement
