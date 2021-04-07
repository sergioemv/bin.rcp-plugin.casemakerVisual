/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractView.java,v 1.1 2005/07/29 20:10:45 cmendezroca Exp $
 */
package biz.bi.vbr.vbrvm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.vbr.vbrvm.AbstractView#getX <em>X</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.AbstractView#getY <em>Y</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.AbstractView#getWidth <em>Width</em>}</li>
 *   <li>{@link biz.bi.vbr.vbrvm.AbstractView#getHeigth <em>Heigth</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getAbstractView()
 * @model abstract="true"
 * @generated
 */
public interface AbstractView extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(int)
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getAbstractView_X()
	 * @model
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.vbrvm.AbstractView#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(int)
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getAbstractView_Y()
	 * @model
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.vbrvm.AbstractView#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getAbstractView_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.vbrvm.AbstractView#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heigth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heigth</em>' attribute.
	 * @see #setHeigth(int)
	 * @see biz.bi.vbr.vbrvm.VBRVMPackage#getAbstractView_Heigth()
	 * @model
	 * @generated
	 */
	int getHeigth();

	/**
	 * Sets the value of the '{@link biz.bi.vbr.vbrvm.AbstractView#getHeigth <em>Heigth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heigth</em>' attribute.
	 * @see #getHeigth()
	 * @generated
	 */
	void setHeigth(int value);

} // AbstractView
