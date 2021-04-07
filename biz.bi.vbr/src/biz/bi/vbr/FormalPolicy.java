/**
 * <copyright>
 * </copyright>
 *
 * $Id: FormalPolicy.java,v 1.2 2005/09/01 22:17:38 hcanedo Exp $
 */
package biz.bi.vbr;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.vbr.FormalPolicy#getFpDescription <em>Fp Description</em>}</li>
 *   <li>{@link biz.bi.vbr.FormalPolicy#getUniqueId <em>Unique Id</em>}</li>
 *   <li>{@link biz.bi.vbr.FormalPolicy#getM_BusinessObject <em>MBusiness Object</em>}</li>
 *   <li>{@link biz.bi.vbr.FormalPolicy#getM_BusinessAction <em>MBusiness Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.vbr.VBRPackage#getFormalPolicy()
 * @model
 * @generated
 */
public interface FormalPolicy extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Fp Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fp Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fp Description</em>' attribute.
	 * @see #setFpDescription(String)
	 * @see biz.bi.vbr.VBRPackage#getFormalPolicy_FpDescription()
	 * @model
	 * @generated
	 */
	String getFpDescription();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.FormalPolicy#getFpDescription <em>Fp Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fp Description</em>' attribute.
	 * @see #getFpDescription()
	 * @generated
	 */
	void setFpDescription(String value);

	/**
	 * Returns the value of the '<em><b>MBusiness Object</b></em>' containment reference list.
	 * The list contents are of type {@link biz.bi.vbr.BusinessObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MBusiness Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MBusiness Object</em>' containment reference list.
	 * @see biz.bi.vbr.VBRPackage#getFormalPolicy_M_BusinessObject()
	 * @model type="biz.bi.vbr.BusinessObject" containment="true" resolveProxies="false" required="true"
	 * @generated
	 */
	EList getM_BusinessObject();

	/**
	 * Returns the value of the '<em><b>MBusiness Action</b></em>' containment reference list.
	 * The list contents are of type {@link biz.bi.vbr.BusinessAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MBusiness Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MBusiness Action</em>' containment reference list.
	 * @see biz.bi.vbr.VBRPackage#getFormalPolicy_M_BusinessAction()
	 * @model type="biz.bi.vbr.BusinessAction" containment="true" required="true"
	 * @generated
	 */
	EList getM_BusinessAction();

	/**
	 * Returns the value of the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Id</em>' attribute.
	 * @see #setUniqueId(String)
	 * @see biz.bi.vbr.VBRPackage#getFormalPolicy_UniqueId()
	 * @model
	 * @generated
	 */
	String getUniqueId();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.FormalPolicy#getUniqueId <em>Unique Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Id</em>' attribute.
	 * @see #getUniqueId()
	 * @generated
	 */
	void setUniqueId(String value);

	void saveFormalPolicy();
} // FormalPolicy
