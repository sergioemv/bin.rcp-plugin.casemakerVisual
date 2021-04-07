/**
 * <copyright>
 * </copyright>
 *
 * $Id: CMProxyRiskObject.java,v 1.2 2005/09/20 15:08:08 smoreno Exp $
 */
package biz.bi.cmcore.model;

import model.BusinessRules;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CM Proxy Risk Object</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see biz.bi.cmcore.model.CMCorePackage#getCMProxyRiskObject()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface CMProxyRiskObject extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	public static final String[] RISK_LEVELS = { "0", "1", "2", "3", "4", "5",
			"6", "7", "8", "9", "10" };

	public static final String[] STATE_NAMES = { "F", "I", "-", "+" };
	
	int STATE_POSITIVE = BusinessRules.STATE_POSITIVE;
	int STATE_NEGATIVE = BusinessRules.STATE_NEGATIVE;
	int STATE_FAULTY= BusinessRules.STATE_FAULTY;
	int STATE_IRRELEVANT = BusinessRules.STATE_IRRELEVANT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getRiskLevel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setRiskLevel(int P_RiskLevel);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getState();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setState(int p_State);

} // CMProxyRiskObject
