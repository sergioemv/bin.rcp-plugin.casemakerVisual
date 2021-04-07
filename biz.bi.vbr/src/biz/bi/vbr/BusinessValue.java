/**
 * <copyright>
 * </copyright>
 *
 * $Id: BusinessValue.java,v 1.2 2005/09/01 22:17:38 hcanedo Exp $
 */
package biz.bi.vbr;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.vbr.BusinessValue#getId <em>Id</em>}</li>
 *   <li>{@link biz.bi.vbr.BusinessValue#getBvState <em>Bv State</em>}</li>
 *   <li>{@link biz.bi.vbr.BusinessValue#getBvRisk <em>Bv Risk</em>}</li>
 *   <li>{@link biz.bi.vbr.BusinessValue#getM_BusinessObject <em>MBusiness Object</em>}</li>
 *   <li>{@link biz.bi.vbr.BusinessValue#getM_InferenceRule <em>MInference Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.vbr.VBRPackage#getBusinessValue()
 * @model
 * @generated
 */
public interface BusinessValue extends AbstractInferenceRuleContents {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Bv State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bv State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bv State</em>' attribute.
	 * @see #setBvState(String)
	 * @see biz.bi.vbr.VBRPackage#getBusinessValue_BvState()
	 * @model
	 * @generated
	 */
	String getBvState();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.BusinessValue#getBvState <em>Bv State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bv State</em>' attribute.
	 * @see #getBvState()
	 * @generated
	 */
	void setBvState(String value);

	/**
	 * Returns the value of the '<em><b>Bv Risk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bv Risk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bv Risk</em>' attribute.
	 * @see #setBvRisk(int)
	 * @see biz.bi.vbr.VBRPackage#getBusinessValue_BvRisk()
	 * @model
	 * @generated
	 */
	int getBvRisk();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.BusinessValue#getBvRisk <em>Bv Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bv Risk</em>' attribute.
	 * @see #getBvRisk()
	 * @generated
	 */
	void setBvRisk(int value);

	/**
	 * Returns the value of the '<em><b>MBusiness Object</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link biz.bi.vbr.BusinessObject#getM_BusinessValue <em>MBusiness Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MBusiness Object</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MBusiness Object</em>' container reference.
	 * @see #setM_BusinessObject(BusinessObject)
	 * @see biz.bi.vbr.VBRPackage#getBusinessValue_M_BusinessObject()
	 * @see biz.bi.vbr.BusinessObject#getM_BusinessValue
	 * @model opposite="m_BusinessValue" required="true"
	 * @generated
	 */
	BusinessObject getM_BusinessObject();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.BusinessValue#getM_BusinessObject <em>MBusiness Object</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MBusiness Object</em>' container reference.
	 * @see #getM_BusinessObject()
	 * @generated
	 */
	void setM_BusinessObject(BusinessObject value);

	/**
	 * Returns the value of the '<em><b>MInference Rule</b></em>' containment reference list.
	 * The list contents are of type {@link biz.bi.vbr.InferenceRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MInference Rule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MInference Rule</em>' containment reference list.
	 * @see biz.bi.vbr.VBRPackage#getBusinessValue_M_InferenceRule()
	 * @model type="biz.bi.vbr.InferenceRule" containment="true" required="true"
	 * @generated
	 */
	EList getM_InferenceRule();

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
	 * @see biz.bi.vbr.VBRPackage#getBusinessValue_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.BusinessValue#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // BusinessValue
