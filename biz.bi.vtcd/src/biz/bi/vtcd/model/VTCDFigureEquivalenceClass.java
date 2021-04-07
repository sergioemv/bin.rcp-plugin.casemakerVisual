/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDFigureEquivalenceClass.java,v 1.8 2005/08/26 15:43:09 smoreno Exp $
 */
package biz.bi.vtcd.model;

import org.eclipse.emf.common.util.EList;

import biz.bi.cmcore.model.CMCorePackage;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Figure Equivalence Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.vtcd.model.VTCDFigureEquivalenceClass#getM_VTCDFigureElement <em>MVTCD Figure Element</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.VTCDFigureEquivalenceClass#getM_VTCDLinkCombinationEClass <em>MVTCD Link Combination EClass</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.VTCDFigureEquivalenceClass#getM_EquivalenceClass <em>MEquivalence Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDFigureEquivalenceClass()
 * @model
 * @generated
 */
public interface VTCDFigureEquivalenceClass extends VTCDAbstractFigure,
		VTCDCMProxyFigure {
	/**
	 * The default value of the ' {@link #getM_EquivalenceClass()  <em>MEquivalence Class</em>} ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getM_EquivalenceClass()
	 * @generated  NOT
	 * @author  Sergio M
	 * @ordered
	 */
	static final CMProxyEquivalenceClass EQUIVALENCECLASS_EDEFAULT = CMCorePackage.eINSTANCE
			.getCMCoreFactory().createCMProxyEquivalenceClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>MVTCD Figure Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link biz.bi.vtcd.model.VTCDFigureElement#getM_VTCDFigureEquivalenceClass <em>MVTCD Figure Equivalence Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MVTCD Figure Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MVTCD Figure Element</em>' container reference.
	 * @see #setM_VTCDFigureElement(VTCDFigureElement)
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDFigureEquivalenceClass_M_VTCDFigureElement()
	 * @see biz.bi.vtcd.model.VTCDFigureElement#getM_VTCDFigureEquivalenceClass
	 * @model opposite="m_VTCDFigureEquivalenceClass" required="true"
	 * @generated
	 */
	VTCDFigureElement getM_VTCDFigureElement();

	/**
	 * Sets the value of the '{@link biz.bi.vtcd.model.VTCDFigureEquivalenceClass#getM_VTCDFigureElement <em>MVTCD Figure Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MVTCD Figure Element</em>' container reference.
	 * @see #getM_VTCDFigureElement()
	 * @generated
	 */
	void setM_VTCDFigureElement(VTCDFigureElement value);

	/**
	 * Returns the value of the '<em><b>MVTCD Link Combination EClass</b></em>' reference list.
	 * The list contents are of type {@link biz.bi.vtcd.model.VTCDLinkCombinationEClass}.
	 * It is bidirectional and its opposite is '{@link biz.bi.vtcd.model.VTCDLinkCombinationEClass#getDestEquivalenceClass <em>Dest Equivalence Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MVTCD Link Combination EClass</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MVTCD Link Combination EClass</em>' reference list.
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDFigureEquivalenceClass_M_VTCDLinkCombinationEClass()
	 * @see biz.bi.vtcd.model.VTCDLinkCombinationEClass#getDestEquivalenceClass
	 * @model type="biz.bi.vtcd.model.VTCDLinkCombinationEClass" opposite="destEquivalenceClass"
	 * @generated
	 */
	EList getM_VTCDLinkCombinationEClass();

	/**
	 * Returns the value of the '<em><b>MEquivalence Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MEquivalence Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MEquivalence Class</em>' attribute.
	 * @see #setM_EquivalenceClass(CMProxyEquivalenceClass)
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDFigureEquivalenceClass_M_EquivalenceClass()
	 * @model dataType="biz.bi.vtcd.model.EquivalenceClass" required="true"
	 * @generated
	 */
	CMProxyEquivalenceClass getM_EquivalenceClass();

	/**
	 * Sets the value of the '{@link biz.bi.vtcd.model.VTCDFigureEquivalenceClass#getM_EquivalenceClass <em>MEquivalence Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MEquivalence Class</em>' attribute.
	 * @see #getM_EquivalenceClass()
	 * @generated
	 */
	void setM_EquivalenceClass(CMProxyEquivalenceClass value);

} // VTCDFigureEquivalenceClass
