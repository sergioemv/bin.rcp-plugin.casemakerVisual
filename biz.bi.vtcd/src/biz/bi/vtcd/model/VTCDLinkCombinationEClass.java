/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDLinkCombinationEClass.java,v 1.2 2005/06/14 04:15:43 smoreno Exp $
 */
package biz.bi.vtcd.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Combination EClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.vtcd.model.VTCDLinkCombinationEClass#getSourceCombination <em>Source Combination</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.VTCDLinkCombinationEClass#getDestEquivalenceClass <em>Dest Equivalence Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDLinkCombinationEClass()
 * @model
 * @generated
 */
public interface VTCDLinkCombinationEClass extends VTCDAbstractLink {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Source Combination</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link biz.bi.vtcd.model.VTCDFigureCombination#getM_VTCDLinkCombinationEClass <em>MVTCD Link Combination EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Combination</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Combination</em>' container reference.
	 * @see #setSourceCombination(VTCDFigureCombination)
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDLinkCombinationEClass_SourceCombination()
	 * @see biz.bi.vtcd.model.VTCDFigureCombination#getM_VTCDLinkCombinationEClass
	 * @model opposite="m_VTCDLinkCombinationEClass" required="true"
	 * @generated
	 */
	VTCDFigureCombination getSourceCombination();

	/**
	 * Sets the value of the '{@link biz.bi.vtcd.model.VTCDLinkCombinationEClass#getSourceCombination <em>Source Combination</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Combination</em>' container reference.
	 * @see #getSourceCombination()
	 * @generated
	 */
	void setSourceCombination(VTCDFigureCombination value);

	/**
	 * Returns the value of the '<em><b>Dest Equivalence Class</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link biz.bi.vtcd.model.VTCDFigureEquivalenceClass#getM_VTCDLinkCombinationEClass <em>MVTCD Link Combination EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest Equivalence Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Equivalence Class</em>' reference.
	 * @see #setDestEquivalenceClass(VTCDFigureEquivalenceClass)
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDLinkCombinationEClass_DestEquivalenceClass()
	 * @see biz.bi.vtcd.model.VTCDFigureEquivalenceClass#getM_VTCDLinkCombinationEClass
	 * @model opposite="m_VTCDLinkCombinationEClass" required="true"
	 * @generated
	 */
	VTCDFigureEquivalenceClass getDestEquivalenceClass();

	/**
	 * Sets the value of the '{@link biz.bi.vtcd.model.VTCDLinkCombinationEClass#getDestEquivalenceClass <em>Dest Equivalence Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Equivalence Class</em>' reference.
	 * @see #getDestEquivalenceClass()
	 * @generated
	 */
	void setDestEquivalenceClass(VTCDFigureEquivalenceClass value);

} // VTCDLinkCombinationEClass
