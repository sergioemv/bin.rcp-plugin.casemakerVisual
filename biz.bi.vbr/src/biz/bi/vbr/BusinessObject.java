/**
 * <copyright>
 * </copyright>
 *
 * $Id: BusinessObject.java,v 1.2 2005/09/01 22:17:38 hcanedo Exp $
 */
package biz.bi.vbr;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.vbr.BusinessObject#getId <em>Id</em>}</li>
 *   <li>{@link biz.bi.vbr.BusinessObject#getBoName <em>Bo Name</em>}</li>
 *   <li>{@link biz.bi.vbr.BusinessObject#getBoDescription <em>Bo Description</em>}</li>
 *   <li>{@link biz.bi.vbr.BusinessObject#getM_BusinessValue <em>MBusiness Value</em>}</li>
 *   <li>{@link biz.bi.vbr.BusinessObject#getM_FromalPolicy <em>MFromal Policy</em>}</li>
 *   <li>{@link biz.bi.vbr.BusinessObject#getBotimeStamp <em>Botime Stamp</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.vbr.VBRPackage#getBusinessObject()
 * @model
 * @generated
 */
public interface BusinessObject extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Bo Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bo Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bo Name</em>' attribute.
	 * @see #setBoName(String)
	 * @see biz.bi.vbr.VBRPackage#getBusinessObject_BoName()
	 * @model
	 * @generated
	 */
	String getBoName();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.BusinessObject#getBoName <em>Bo Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bo Name</em>' attribute.
	 * @see #getBoName()
	 * @generated
	 */
	void setBoName(String value);

	/**
	 * Returns the value of the '<em><b>Bo Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bo Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bo Description</em>' attribute.
	 * @see #setBoDescription(String)
	 * @see biz.bi.vbr.VBRPackage#getBusinessObject_BoDescription()
	 * @model
	 * @generated
	 */
	String getBoDescription();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.BusinessObject#getBoDescription <em>Bo Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bo Description</em>' attribute.
	 * @see #getBoDescription()
	 * @generated
	 */
	void setBoDescription(String value);

	/**
	 * Returns the value of the '<em><b>MBusiness Value</b></em>' containment reference list.
	 * The list contents are of type {@link biz.bi.vbr.BusinessValue}.
	 * It is bidirectional and its opposite is '{@link biz.bi.vbr.BusinessValue#getM_BusinessObject <em>MBusiness Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MBusiness Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MBusiness Value</em>' containment reference list.
	 * @see biz.bi.vbr.VBRPackage#getBusinessObject_M_BusinessValue()
	 * @see biz.bi.vbr.BusinessValue#getM_BusinessObject
	 * @model type="biz.bi.vbr.BusinessValue" opposite="m_BusinessObject" containment="true" required="true"
	 * @generated
	 */
	EList getM_BusinessValue();

	/**
	 * Returns the value of the '<em><b>MFromal Policy</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link biz.bi.vbr.FormalPolicy#getM_BusinessObject <em>MBusiness Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MFromal Policy</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFromal Policy</em>' container reference.
	 * @see #setM_FromalPolicy(FormalPolicy)
	 * @see biz.bi.vbr.VBRPackage#getBusinessObject_M_FromalPolicy()
	 * @see biz.bi.vbr.FormalPolicy#getM_BusinessObject
	 * @model opposite="m_BusinessObject" required="true"
	 * @generated
	 */
	FormalPolicy getM_FromalPolicy();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.BusinessObject#getM_FromalPolicy <em>MFromal Policy</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MFromal Policy</em>' container reference.
	 * @see #getM_FromalPolicy()
	 * @generated
	 */
	void setM_FromalPolicy(FormalPolicy value);

	/**
	 * Returns the value of the '<em><b>Botime Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Botime Stamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Botime Stamp</em>' attribute.
	 * @see #setBotimeStamp(Date)
	 * @see biz.bi.vbr.VBRPackage#getBusinessObject_BotimeStamp()
	 * @model
	 * @generated
	 */
	Date getBotimeStamp();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.BusinessObject#getBotimeStamp <em>Botime Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Botime Stamp</em>' attribute.
	 * @see #getBotimeStamp()
	 * @generated
	 */
	void setBotimeStamp(Date value);

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
	 * @see biz.bi.vbr.VBRPackage#getBusinessObject_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.BusinessObject#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // BusinessObject
