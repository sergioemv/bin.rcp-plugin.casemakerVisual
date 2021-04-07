/**
 * <copyright>
 * </copyright>
 *
 * $Id: BusinessAction.java,v 1.2 2005/09/01 22:17:38 hcanedo Exp $
 */
package biz.bi.vbr;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.vbr.BusinessAction#getId <em>Id</em>}</li>
 *   <li>{@link biz.bi.vbr.BusinessAction#getBaDescription <em>Ba Description</em>}</li>
 *   <li>{@link biz.bi.vbr.BusinessAction#getM_besidebv <em>Mbesidebv</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.vbr.VBRPackage#getBusinessAction()
 * @model
 * @generated
 */
public interface BusinessAction extends AbstractInferenceRuleContents {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

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
	 * @see biz.bi.vbr.VBRPackage#getBusinessAction_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.BusinessAction#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Ba Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ba Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ba Description</em>' attribute.
	 * @see #setBaDescription(String)
	 * @see biz.bi.vbr.VBRPackage#getBusinessAction_BaDescription()
	 * @model
	 * @generated
	 */
	String getBaDescription();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.BusinessAction#getBaDescription <em>Ba Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ba Description</em>' attribute.
	 * @see #getBaDescription()
	 * @generated
	 */
	void setBaDescription(String value);

	/**
	 * Returns the value of the '<em><b>Mbesidebv</b></em>' reference list.
	 * The list contents are of type {@link biz.bi.vbr.BusinessValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mbesidebv</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mbesidebv</em>' reference list.
	 * @see biz.bi.vbr.VBRPackage#getBusinessAction_M_besidebv()
	 * @model type="biz.bi.vbr.BusinessValue" required="true"
	 * @generated
	 */
	EList getM_besidebv();

} // BusinessAction
