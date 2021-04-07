/**
 * <copyright>
 * </copyright>
 *
 * $Id: InferenceRule.java,v 1.3 2005/09/07 16:35:11 hcanedo Exp $
 */
package biz.bi.vbr;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inference Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.vbr.InferenceRule#getTruePart <em>True Part</em>}</li>
 *   <li>{@link biz.bi.vbr.InferenceRule#getFalsePart <em>False Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.vbr.VBRPackage#getInferenceRule()
 * @model
 * @generated
 */
public interface InferenceRule extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>True Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>True Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>True Part</em>' reference.
	 * @see #setTruePart(AbstractInferenceRuleContents)
	 * @see biz.bi.vbr.VBRPackage#getInferenceRule_TruePart()
	 * @model
	 * @generated
	 */
	AbstractInferenceRuleContents getTruePart();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.InferenceRule#getTruePart <em>True Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>True Part</em>' reference.
	 * @see #getTruePart()
	 * @generated
	 */
	void setTruePart(AbstractInferenceRuleContents value);

	/**
	 * Returns the value of the '<em><b>False Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>False Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>False Part</em>' reference.
	 * @see #setFalsePart(AbstractInferenceRuleContents)
	 * @see biz.bi.vbr.VBRPackage#getInferenceRule_FalsePart()
	 * @model
	 * @generated
	 */
	AbstractInferenceRuleContents getFalsePart();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.InferenceRule#getFalsePart <em>False Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>False Part</em>' reference.
	 * @see #getFalsePart()
	 * @generated
	 */
	void setFalsePart(AbstractInferenceRuleContents value);

} // InferenceRule
