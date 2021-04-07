/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDCMProxyFigure.java,v 1.3 2005/08/10 14:37:07 smoreno Exp $
 */
package biz.bi.vtcd.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CM Proxy Figure</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDCMProxyFigure()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface VTCDCMProxyFigure extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EObject getProxyModel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setProxyModel(EObject model);

} // VTCDCMProxyFigure
