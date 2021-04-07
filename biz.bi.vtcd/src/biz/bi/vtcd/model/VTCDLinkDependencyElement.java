/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDLinkDependencyElement.java,v 1.2 2005/06/14 04:15:43 smoreno Exp $
 */
package biz.bi.vtcd.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Dependency Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.vtcd.model.VTCDLinkDependencyElement#getSourceDependency <em>Source Dependency</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.VTCDLinkDependencyElement#getDestElement <em>Dest Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDLinkDependencyElement()
 * @model
 * @generated
 */
public interface VTCDLinkDependencyElement extends VTCDAbstractLink {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Source Dependency</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link biz.bi.vtcd.model.VTCDFigureDependency#getM_VTCDLinkDependencyElement <em>MVTCD Link Dependency Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Dependency</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Dependency</em>' container reference.
	 * @see #setSourceDependency(VTCDFigureDependency)
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDLinkDependencyElement_SourceDependency()
	 * @see biz.bi.vtcd.model.VTCDFigureDependency#getM_VTCDLinkDependencyElement
	 * @model opposite="m_VTCDLinkDependencyElement" required="true"
	 * @generated
	 */
	VTCDFigureDependency getSourceDependency();

	/**
	 * Sets the value of the '{@link biz.bi.vtcd.model.VTCDLinkDependencyElement#getSourceDependency <em>Source Dependency</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Dependency</em>' container reference.
	 * @see #getSourceDependency()
	 * @generated
	 */
	void setSourceDependency(VTCDFigureDependency value);

	/**
	 * Returns the value of the '<em><b>Dest Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link biz.bi.vtcd.model.VTCDFigureElement#getM_VTCDLinkDependencyElement <em>MVTCD Link Dependency Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Element</em>' reference.
	 * @see #setDestElement(VTCDFigureElement)
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDLinkDependencyElement_DestElement()
	 * @see biz.bi.vtcd.model.VTCDFigureElement#getM_VTCDLinkDependencyElement
	 * @model opposite="m_VTCDLinkDependencyElement" required="true"
	 * @generated
	 */
	VTCDFigureElement getDestElement();

	/**
	 * Sets the value of the '{@link biz.bi.vtcd.model.VTCDLinkDependencyElement#getDestElement <em>Dest Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Element</em>' reference.
	 * @see #getDestElement()
	 * @generated
	 */
	void setDestElement(VTCDFigureElement value);

} // VTCDLinkDependencyElement
