/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDAbstractLink.java,v 1.8 2005/08/04 13:37:12 smoreno Exp $
 */
package biz.bi.vtcd.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.Color;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link biz.bi.vtcd.model.VTCDAbstractLink#getColor <em>Color</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.VTCDAbstractLink#getWidth <em>Width</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.VTCDAbstractLink#getBendPoints <em>Bend Points</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.VTCDAbstractLink#getSourceTerminal <em>Source Terminal</em>}</li>
 *   <li>{@link biz.bi.vtcd.model.VTCDAbstractLink#getTargetTerminal <em>Target Terminal</em>}</li>
 * </ul>
 * </p>
 *
 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDAbstractLink()
 * @model abstract="true"
 * @generated
 */
public interface VTCDAbstractLink extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(Color)
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDAbstractLink_Color()
	 * @model dataType="biz.bi.vtcd.model.Color"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link biz.bi.vtcd.model.VTCDAbstractLink#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

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
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDAbstractLink_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link biz.bi.vtcd.model.VTCDAbstractLink#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Bend Points</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.draw2d.AbsoluteBendpoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bend Points</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bend Points</em>' attribute list.
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDAbstractLink_BendPoints()
	 * @model type="org.eclipse.draw2d.AbsoluteBendpoint" dataType="biz.bi.vtcd.model.AbsoluteBendPoint"
	 * @generated
	 */
	EList getBendPoints();

	/**
	 * Returns the value of the '<em><b>Source Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Terminal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Terminal</em>' attribute.
	 * @see #setSourceTerminal(String)
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDAbstractLink_SourceTerminal()
	 * @model
	 * @generated
	 */
	String getSourceTerminal();

	/**
	 * Sets the value of the '{@link biz.bi.vtcd.model.VTCDAbstractLink#getSourceTerminal <em>Source Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Terminal</em>' attribute.
	 * @see #getSourceTerminal()
	 * @generated
	 */
	void setSourceTerminal(String value);

	/**
	 * Returns the value of the '<em><b>Target Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Terminal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Terminal</em>' attribute.
	 * @see #setTargetTerminal(String)
	 * @see biz.bi.vtcd.model.VTCDPackage#getVTCDAbstractLink_TargetTerminal()
	 * @model
	 * @generated
	 */
	String getTargetTerminal();

	/**
	 * Sets the value of the '{@link biz.bi.vtcd.model.VTCDAbstractLink#getTargetTerminal <em>Target Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Terminal</em>' attribute.
	 * @see #getTargetTerminal()
	 * @generated
	 */
	void setTargetTerminal(String value);

} // VTCDAbstractLink
