/**
 * <copyright>
 * </copyright>
 *
 * $Id: VBRFactory.java,v 1.3 2005/09/01 22:17:38 hcanedo Exp $
 */
package biz.bi.vbr;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see biz.bi.vbr.VBRPackage
 * @generated
 */
public interface VBRFactory extends EFactory {
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
	VBRFactory eINSTANCE = new biz.bi.vbr.impl.VBRFactoryImpl();

	/**
	 * Returns a new object of class '<em>Business Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Object</em>'.
	 * @generated
	 */
	BusinessObject createBusinessObject();

	/**
	 * Returns a new object of class '<em>Business Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Value</em>'.
	 * @generated
	 */
	BusinessValue createBusinessValue();

	/**
	 * Returns a new object of class '<em>Business Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Action</em>'.
	 * @generated
	 */
	BusinessAction createBusinessAction();

	/**
	 * Returns a new object of class '<em>Formal Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formal Policy</em>'.
	 * @generated
	 */
	FormalPolicy createFormalPolicy();

	/**
	 * Returns a new object of class '<em>Inference Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inference Rule</em>'.
	 * @generated
	 */
	InferenceRule createInferenceRule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VBRPackage getVBRPackage();

} //VBRFactory
