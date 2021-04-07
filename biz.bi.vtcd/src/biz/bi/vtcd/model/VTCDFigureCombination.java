/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDFigureCombination.java,v 1.16 2005/09/20 16:04:53 smoreno Exp $
 */
package biz.bi.vtcd.model;

import org.eclipse.emf.common.util.EList;

import biz.bi.cmcore.model.CMCorePackage;
import biz.bi.cmcore.model.CMProxyCombination;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Figure Combination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.vtcd.model.VTCDFigureCombination#getM_VTCDDiagramCombination <em>MVTCD Diagram Combination</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.VTCDFigureCombination#getM_VTCDLinkCombinationEClass <em>MVTCD Link Combination EClass</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.VTCDFigureCombination#getM_Combination <em>MCombination</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDFigureCombination()
 * @model
 * @generated
 */
public interface VTCDFigureCombination extends VTCDAbstractFigure,
		VTCDCMProxyFigure {
	/**
	 * The default value of the ' {@link #getM_Combination()  <em>MCombination</em>} ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getM_Combination()
	 * @generated  NOT
	 * @author  Sergio M
	 * @ordered
	 */
	public static final CMProxyCombination COMBINATION_EDEFAULT = CMCorePackage.eINSTANCE
			.getCMCoreFactory().createCMProxyCombination();

	/**
	 * @author   smoreno initial height on an element do not confuse with HEIGHT_EDEFAULT wich is from EMF 
	 */
	public static final int HEIGHT_DEFAULT = 30;//19;

	/**
	 * @author   smoreno initial width on an element do not confuse with WIDTH_EDEFAULT wich is from EMF 
	 */
	public static final int WIDTH_DEFAULT = -1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>MVTCD Diagram Combination</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link biz.bi.vtcd.model.VTCDDiagramCombination#getM_VTCDFigureCombination <em>MVTCD Figure Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MVTCD Diagram Combination</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MVTCD Diagram Combination</em>' container reference.
	 * @see #setM_VTCDDiagramCombination(VTCDDiagramCombination)
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDFigureCombination_M_VTCDDiagramCombination()
	 * @see biz.bi.vtcd.model.VTCDDiagramCombination#getM_VTCDFigureCombination
	 * @model opposite="m_VTCDFigureCombination" required="true"
	 * @generated
	 */
	VTCDDiagramCombination getM_VTCDDiagramCombination();

	/**
	 * Sets the value of the '{@link biz.bi.vtcd.model.VTCDFigureCombination#getM_VTCDDiagramCombination <em>MVTCD Diagram Combination</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MVTCD Diagram Combination</em>' container reference.
	 * @see #getM_VTCDDiagramCombination()
	 * @generated
	 */
	void setM_VTCDDiagramCombination(VTCDDiagramCombination value);

	/**
	 * Returns the value of the '<em><b>MVTCD Link Combination EClass</b></em>' containment reference list.
	 * The list contents are of type {@link biz.bi.vtcd.model.VTCDLinkCombinationEClass}.
	 * It is bidirectional and its opposite is '{@link biz.bi.vtcd.model.VTCDLinkCombinationEClass#getSourceCombination <em>Source Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MVTCD Link Combination EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MVTCD Link Combination EClass</em>' containment reference list.
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDFigureCombination_M_VTCDLinkCombinationEClass()
	 * @see biz.bi.vtcd.model.VTCDLinkCombinationEClass#getSourceCombination
	 * @model type="biz.bi.vtcd.model.VTCDLinkCombinationEClass" opposite="sourceCombination" containment="true"
	 * @generated
	 */
	EList getM_VTCDLinkCombinationEClass();

	VTCDLinkCombinationEClass getM_VTCDLinkCombinationEClass(
			CMProxyEquivalenceClass p_EquivalenceClass);

	/**
	 * Returns the value of the '<em><b>MCombination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MCombination</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MCombination</em>' attribute.
	 * @see #setM_Combination(CMProxyCombination)
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDFigureCombination_M_Combination()
	 * @model dataType="biz.bi.vtcd.model.Combination" required="true"
	 * @generated
	 */
	CMProxyCombination getM_Combination();

	/**
	 * Sets the value of the '{@link biz.bi.vtcd.model.VTCDFigureCombination#getM_Combination <em>MCombination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MCombination</em>' attribute.
	 * @see #getM_Combination()
	 * @generated
	 */
	void setM_Combination(CMProxyCombination value);

} // VTCDFigureCombination
