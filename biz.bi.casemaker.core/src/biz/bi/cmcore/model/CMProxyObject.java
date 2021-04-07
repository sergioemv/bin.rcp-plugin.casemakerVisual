/**
 * <copyright>
 * </copyright>
 *
 * $Id: CMProxyObject.java,v 1.8 2005/09/20 15:08:08 smoreno Exp $
 */
package biz.bi.cmcore.model;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proxy Object</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyObject()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface CMProxyObject extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getDescription();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isProxyModelSet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model p_DescriptionRequired="true"
	 * @generated
	 */
	void setDescription(String p_Description);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model p_NameRequired="true"
	 * @generated
	 */
	void setName(String p_Name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Object getCMModel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model modelRequired="true"
	 * @generated
	 */
	void setCMModel(Object CMModel);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Date getTimeStamp();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setTimeStamp(Date p_TimeStamp);

} // CMProxyObject
