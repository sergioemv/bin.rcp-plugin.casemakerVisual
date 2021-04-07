/**
 * <copyright>
 * </copyright>
 *
 * $Id: VBRVMFactory.java,v 1.2 2005/09/01 22:17:38 hcanedo Exp $
 */
package biz.bi.vbr.vbrvm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see biz.bi.vbr.vbrvm.VBRVMPackage
 * @generated
 */
public interface VBRVMFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VBRVMFactory eINSTANCE = new biz.bi.vbr.vbrvm.impl.VBRVMFactoryImpl();

	/**
	 * Returns a new object of class '<em>Main Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Main Diagram</em>'.
	 * @generated
	 */
	MainDiagram createMainDiagram();

	/**
	 * Returns a new object of class '<em>VBR Tree View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VBR Tree View</em>'.
	 * @generated
	 */
	VBRTreeView createVBRTreeView();

	/**
	 * Returns a new object of class '<em>VBR Element View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VBR Element View</em>'.
	 * @generated
	 */
	VBRElementView createVBRElementView();

	/**
	 * Returns a new object of class '<em>VBR Element Value View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VBR Element Value View</em>'.
	 * @generated
	 */
	VBRElementValueView createVBRElementValueView();

	/**
	 * Returns a new object of class '<em>VBR Action View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VBR Action View</em>'.
	 * @generated
	 */
	VBRActionView createVBRActionView();

	/**
	 * Returns a new object of class '<em>VBR Element Connect Element Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VBR Element Connect Element Value</em>'.
	 * @generated
	 */
	VBRElementConnectElementValue createVBRElementConnectElementValue();

	/**
	 * Returns a new object of class '<em>VBR Element Value Connect Element Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VBR Element Value Connect Element Value</em>'.
	 * @generated
	 */
	VBRElementValueConnectElementValue createVBRElementValueConnectElementValue();

	/**
	 * Returns a new object of class '<em>VBR Element Value Connect Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VBR Element Value Connect Action</em>'.
	 * @generated
	 */
	VBRElementValueConnectAction createVBRElementValueConnectAction();

	/**
	 * Returns a new object of class '<em>VBR Action Connect Element Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VBR Action Connect Element Value</em>'.
	 * @generated
	 */
	VBRActionConnectElementValue createVBRActionConnectElementValue();

	/**
	 * Returns a new object of class '<em>VBR Tree Connect Element Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VBR Tree Connect Element Value</em>'.
	 * @generated
	 */
	VBRTreeConnectElementValue createVBRTreeConnectElementValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VBRVMPackage getVBRVMPackage();

} //VBRVMFactory
