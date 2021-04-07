/**
 * <copyright>
 * </copyright>
 *
 * $Id: RiskLevel.java,v 1.2 2005/09/01 22:17:38 hcanedo Exp $
 */
package biz.bi.vbr;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Risk Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.vbr.RiskLevel#getRlRisk <em>Rl Risk</em>}</li>
 *   <li>{@link biz.bi.vbr.RiskLevel#getRlState <em>Rl State</em>}</li>
 *   <li>{@link biz.bi.vbr.RiskLevel#getRlDescription <em>Rl Description</em>}</li>
 *   <li>{@link biz.bi.vbr.RiskLevel#getId <em>Id</em>}</li>
 *   <li>{@link biz.bi.vbr.RiskLevel#getRltimeStamp <em>Rltime Stamp</em>}</li>
 *   <li>{@link biz.bi.vbr.RiskLevel#getM_BusinessValue <em>MBusiness Value</em>}</li>
 *   <li>{@link biz.bi.vbr.RiskLevel#getM_BusinessAction <em>MBusiness Action</em>}</li>
 *   <li>{@link biz.bi.vbr.RiskLevel#getM_FromalPolicy <em>MFromal Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.vbr.VBRPackage#getRiskLevel()
 * @model
 * @generated
 */
public interface RiskLevel extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Rl Risk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rl Risk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rl Risk</em>' attribute.
	 * @see #setRlRisk(int)
	 * @see biz.bi.vbr.VBRPackage#getRiskLevel_RlRisk()
	 * @model
	 * @generated
	 */
	int getRlRisk();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.RiskLevel#getRlRisk <em>Rl Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rl Risk</em>' attribute.
	 * @see #getRlRisk()
	 * @generated
	 */
	void setRlRisk(int value);

	/**
	 * Returns the value of the '<em><b>Rl State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rl State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rl State</em>' attribute.
	 * @see #setRlState(String)
	 * @see biz.bi.vbr.VBRPackage#getRiskLevel_RlState()
	 * @model
	 * @generated
	 */
	String getRlState();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.RiskLevel#getRlState <em>Rl State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rl State</em>' attribute.
	 * @see #getRlState()
	 * @generated
	 */
	void setRlState(String value);

	/**
	 * Returns the value of the '<em><b>Rl Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rl Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rl Description</em>' attribute.
	 * @see #setRlDescription(String)
	 * @see biz.bi.vbr.VBRPackage#getRiskLevel_RlDescription()
	 * @model
	 * @generated
	 */
	String getRlDescription();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.RiskLevel#getRlDescription <em>Rl Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rl Description</em>' attribute.
	 * @see #getRlDescription()
	 * @generated
	 */
	void setRlDescription(String value);

	/**
	 * Returns the value of the '<em><b>Rltime Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rltime Stamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rltime Stamp</em>' attribute.
	 * @see #setRltimeStamp(Date)
	 * @see biz.bi.vbr.VBRPackage#getRiskLevel_RltimeStamp()
	 * @model
	 * @generated
	 */
	Date getRltimeStamp();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.RiskLevel#getRltimeStamp <em>Rltime Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rltime Stamp</em>' attribute.
	 * @see #getRltimeStamp()
	 * @generated
	 */
	void setRltimeStamp(Date value);

	/**
	 * Returns the value of the '<em><b>MBusiness Value</b></em>' reference list.
	 * The list contents are of type {@link biz.bi.vbr.BusinessValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MBusiness Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MBusiness Value</em>' reference list.
	 * @see biz.bi.vbr.VBRPackage#getRiskLevel_M_BusinessValue()
	 * @model type="biz.bi.vbr.BusinessValue" required="true"
	 * @generated
	 */
	EList getM_BusinessValue();

	/**
	 * Returns the value of the '<em><b>MBusiness Action</b></em>' reference list.
	 * The list contents are of type {@link biz.bi.vbr.BusinessAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MBusiness Action</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MBusiness Action</em>' reference list.
	 * @see biz.bi.vbr.VBRPackage#getRiskLevel_M_BusinessAction()
	 * @model type="biz.bi.vbr.BusinessAction"
	 * @generated
	 */
	EList getM_BusinessAction();

	/**
	 * Returns the value of the '<em><b>MFromal Policy</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link biz.bi.vbr.FormalPolicy#getM_RiskLevel <em>MRisk Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MFromal Policy</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFromal Policy</em>' container reference.
	 * @see #setM_FromalPolicy(FormalPolicy)
	 * @see biz.bi.vbr.VBRPackage#getRiskLevel_M_FromalPolicy()
	 * @see biz.bi.vbr.FormalPolicy#getM_RiskLevel
	 * @model opposite="m_RiskLevel" required="true"
	 * @generated
	 */
	FormalPolicy getM_FromalPolicy();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.RiskLevel#getM_FromalPolicy <em>MFromal Policy</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MFromal Policy</em>' container reference.
	 * @see #getM_FromalPolicy()
	 * @generated
	 */
	void setM_FromalPolicy(FormalPolicy value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see biz.bi.vbr.VBRPackage#getRiskLevel_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.RiskLevel#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // RiskLevel
