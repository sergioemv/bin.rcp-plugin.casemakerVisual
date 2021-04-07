/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDFactoryImpl.java,v 1.29 2005/08/26 15:43:09 smoreno Exp $
 */
package biz.bi.vtcd.model.impl;

import java.util.StringTokenizer;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.AbsoluteBendpoint;
import org.eclipse.draw2d.Bendpoint;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

import biz.bi.cmcore.model.CMCorePackage;
import biz.bi.cmcore.model.CMProxyCombination;
import biz.bi.cmcore.model.CMProxyDependency;
import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.cmcore.model.CMProxyTestObject;
import biz.bi.vtcd.model.VTCDDiagramCombination;
import biz.bi.vtcd.model.VTCDDiagramMain;
import biz.bi.vtcd.model.VTCDFactory;
import biz.bi.vtcd.model.VTCDFigureCombination;
import biz.bi.vtcd.model.VTCDFigureDependency;
import biz.bi.vtcd.model.VTCDFigureElement;
import biz.bi.vtcd.model.VTCDFigureEquivalenceClass;
import biz.bi.vtcd.model.VTCDLinkCombinationEClass;
import biz.bi.vtcd.model.VTCDLinkDependencyElement;
import biz.bi.vtcd.model.VTCDNote;
import biz.bi.vtcd.model.VTCDPackage;
import biz.bi.vtcd.provider.VTCDEditPlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VTCDFactoryImpl extends EFactoryImpl implements VTCDFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTCDFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case VTCDPackage.VTCD_DIAGRAM_COMBINATION:
			return createVTCDDiagramCombination();
		case VTCDPackage.VTCD_DIAGRAM_MAIN:
			return createVTCDDiagramMain();
		case VTCDPackage.VTCD_FIGURE_COMBINATION:
			return createVTCDFigureCombination();
		case VTCDPackage.VTCD_FIGURE_ELEMENT:
			return createVTCDFigureElement();
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY:
			return createVTCDFigureDependency();
		case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS:
			return createVTCDFigureEquivalenceClass();
		case VTCDPackage.VTCD_LINK_DEPENDENCY_ELEMENT:
			return createVTCDLinkDependencyElement();
		case VTCDPackage.VTCD_LINK_COMBINATION_ECLASS:
			return createVTCDLinkCombinationEClass();
		case VTCDPackage.VTCD_NOTE:
			return createVTCDNote();
		default:
			throw new IllegalArgumentException(
					"The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case VTCDPackage.TEST_OBJECT:
			return createTestObjectFromString(eDataType, initialValue);
		case VTCDPackage.DEPENDENCY:
			return createDependencyFromString(eDataType, initialValue);
		case VTCDPackage.COLOR:
			return createColorFromString(eDataType, initialValue);
		case VTCDPackage.ELEMENT:
			return createElementFromString(eDataType, initialValue);
		case VTCDPackage.COMBINATION:
			return createCombinationFromString(eDataType, initialValue);
		case VTCDPackage.EQUIVALENCE_CLASS:
			return createEquivalenceClassFromString(eDataType, initialValue);
		case VTCDPackage.ABSOLUTE_BEND_POINT:
			return createAbsoluteBendPointFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException(
					"The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case VTCDPackage.TEST_OBJECT:
			return convertTestObjectToString(eDataType, instanceValue);
		case VTCDPackage.DEPENDENCY:
			return convertDependencyToString(eDataType, instanceValue);
		case VTCDPackage.COLOR:
			return convertColorToString(eDataType, instanceValue);
		case VTCDPackage.ELEMENT:
			return convertElementToString(eDataType, instanceValue);
		case VTCDPackage.COMBINATION:
			return convertCombinationToString(eDataType, instanceValue);
		case VTCDPackage.EQUIVALENCE_CLASS:
			return convertEquivalenceClassToString(eDataType, instanceValue);
		case VTCDPackage.ABSOLUTE_BEND_POINT:
			return convertAbsoluteBendPointToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException(
					"The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTCDDiagramCombination createVTCDDiagramCombination() {
		VTCDDiagramCombinationImpl vtcdDiagramCombination = new VTCDDiagramCombinationImpl();
		return vtcdDiagramCombination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTCDDiagramMain createVTCDDiagramMain() {
		VTCDDiagramMainImpl vtcdDiagramMain = new VTCDDiagramMainImpl();
		return vtcdDiagramMain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTCDFigureCombination createVTCDFigureCombination() {
		VTCDFigureCombinationImpl vtcdFigureCombination = new VTCDFigureCombinationImpl();
		return vtcdFigureCombination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTCDFigureElement createVTCDFigureElement() {
		VTCDFigureElementImpl vtcdFigureElement = new VTCDFigureElementImpl();
		return vtcdFigureElement;
	}

	public VTCDFigureElement createVTCDFigureElement(
			CMProxyElement p_ProxyElement) {
		VTCDFigureElementImpl vtcdFigureElement = new VTCDFigureElementImpl();
		vtcdFigureElement.setM_Element(p_ProxyElement);
		return vtcdFigureElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTCDFigureDependency createVTCDFigureDependency() {
		VTCDFigureDependencyImpl vtcdFigureDependency = new VTCDFigureDependencyImpl();
		return vtcdFigureDependency;
	}

	public VTCDFigureDependency createVTCDFigureDependency(
			CMProxyDependency p_Dependency) {
		VTCDFigureDependencyImpl vtcdFigureDependency = new VTCDFigureDependencyImpl();
		vtcdFigureDependency.setM_Dependency(p_Dependency);
		return vtcdFigureDependency;
	}

	public VTCDDiagramCombination createVTCDDiagramCombination(
			VTCDFigureDependency p_FigureDependency) {
		VTCDDiagramCombinationImpl vtcdDiagramCombination = new VTCDDiagramCombinationImpl();
		vtcdDiagramCombination.setM_FigureDependency(p_FigureDependency);
		return vtcdDiagramCombination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTCDFigureEquivalenceClass createVTCDFigureEquivalenceClass() {
		VTCDFigureEquivalenceClassImpl vtcdFigureEquivalenceClass = new VTCDFigureEquivalenceClassImpl();
		return vtcdFigureEquivalenceClass;
	}

	public VTCDFigureEquivalenceClass createVTCDFigureEquivalenceClass(
			CMProxyEquivalenceClass p_EquivalenceClass)

	{
		VTCDFigureEquivalenceClassImpl vtcdFigureEquivalenceClass = new VTCDFigureEquivalenceClassImpl();
		vtcdFigureEquivalenceClass.setM_EquivalenceClass(p_EquivalenceClass);
		return vtcdFigureEquivalenceClass;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTCDLinkDependencyElement createVTCDLinkDependencyElement() {
		VTCDLinkDependencyElementImpl vtcdLinkDependencyElement = new VTCDLinkDependencyElementImpl();
		return vtcdLinkDependencyElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTCDLinkCombinationEClass createVTCDLinkCombinationEClass() {
		VTCDLinkCombinationEClassImpl vtcdLinkCombinationEClass = new VTCDLinkCombinationEClassImpl();
		return vtcdLinkCombinationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTCDNote createVTCDNote() {
		VTCDNoteImpl vtcdNote = new VTCDNoteImpl();
		return vtcdNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public CMProxyTestObject createTestObjectFromString(EDataType eDataType,
			String initialValue) {

		//return null;
		CMProxyTestObject l_CMProxyTestObject = null;
		try {
			l_CMProxyTestObject = CMCorePackage.eINSTANCE.getCMCoreFactory()
					.createCMProxyTestObject(initialValue);
		} catch (Exception e) {
			Status status = new Status(IStatus.ERROR, "biz.bi.vtcd", 0, e
					.toString(), null);

			ErrorDialog
					.openError(
							Display.getDefault().getActiveShell(),
							VTCDEditPlugin.INSTANCE
									.getString("_UI_ErrorDialog_title"),
							VTCDEditPlugin.INSTANCE
									.getString("_UI_ErrorDialogCreateTestObjectFromStringFailed_msg"),
							status);
			VTCDEditPlugin.INSTANCE.log(e);
		}
		return l_CMProxyTestObject;
		/*(CMProxyTestObject) super.createFromString(eDataType,
		 initialValue);*/

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public String convertTestObjectToString(EDataType eDataType,
			Object instanceValue) {
		return ((CMProxyTestObject) instanceValue).getId();
		//return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author Sergio M
	 */
	public CMProxyDependency createDependencyFromString(EDataType eDataType,
			String initialValue) {
		return CMCorePackage.eINSTANCE.getCMCoreFactory()
				.createCMProxyDependency(initialValue);
		/*return (CMProxyDependency) super.createFromString(eDataType,
		 initialValue);*/
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author Sergio M
	 */
	public String convertDependencyToString(EDataType eDataType,
			Object instanceValue) {

		return ((CMProxyDependency) instanceValue).getUniqueId();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color createColorFromString(EDataType eDataType, String initialValue) {
		return (Color) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public CMProxyElement createElementFromString(EDataType eDataType,
			String initialValue) {

		return CMCorePackage.eINSTANCE.getCMCoreFactory().createCMProxyElement(
				initialValue);
		/*(CMProxyElement) super.createFromString(eDataType, initialValue);*/
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public String convertElementToString(EDataType eDataType,
			Object instanceValue) {
		return ((CMProxyElement) instanceValue).getUniqueId();
		/*super.convertToString(eDataType, instanceValue);*/
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author Sergio M
	 */
	public CMProxyCombination createCombinationFromString(EDataType eDataType,
			String initialValue) {

		return CMCorePackage.eINSTANCE.getCMCoreFactory()
				.createCMProxyCombination(initialValue);
		/*return (CMProxyCombination) super.createFromString(eDataType,
		 initialValue);*/
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author Sergio M
	 */
	public String convertCombinationToString(EDataType eDataType,
			Object instanceValue) {

		return ((CMProxyCombination) instanceValue).getUniqueId();
		/*return super.convertToString(eDataType, instanceValue);*/
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author Sergio M
	 */
	public CMProxyEquivalenceClass createEquivalenceClassFromString(
			EDataType eDataType, String initialValue) {

		return CMCorePackage.eINSTANCE.getCMCoreFactory()
				.createCMProxyEquivalenceClass(initialValue);
		/*return (CMProxyEquivalenceClass) super.createFromString(eDataType,
		 initialValue);*/
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author Sergio M
	 */
	public String convertEquivalenceClassToString(EDataType eDataType,
			Object instanceValue) {
		return ((CMProxyEquivalenceClass) instanceValue).getUniqueId();
		/*return super.convertToString(eDataType, instanceValue);*/
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public AbsoluteBendpoint createAbsoluteBendPointFromString(
			EDataType eDataType, String initialValue) {
		return new AbsoluteBendpoint(createPointFromString(null, initialValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public String convertAbsoluteBendPointToString(EDataType eDataType,
			Object instanceValue) {
		return convertPointToString(null, ((Bendpoint) instanceValue)
				.getLocation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTCDPackage getVTCDPackage() {
		return (VTCDPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static VTCDPackage getPackage() {
		return VTCDPackage.eINSTANCE;
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.model.VTCDFactory#createVTCDDiagramMain(java.lang.String)
	 */
	public VTCDDiagramMain createVTCDDiagramMain(String p_filename,
			boolean p_NewTestObject) {
		VTCDDiagramMainImpl vtcdDiagramMain = new VTCDDiagramMainImpl();

		vtcdDiagramMain.setM_TestObject(CMCorePackage.eINSTANCE
				.getCMCoreFactory().createCMProxyTestObject(p_filename,
						p_NewTestObject));

		return vtcdDiagramMain;
	}

	public VTCDLinkDependencyElement createVTCDLinkDependencyElement(
			VTCDFigureDependency p_FigureDependency,
			VTCDFigureElement p_FigureElement) {
		VTCDLinkDependencyElementImpl vtcdLinkDependencyElement = new VTCDLinkDependencyElementImpl();
		vtcdLinkDependencyElement.setSourceDependency(p_FigureDependency);
		vtcdLinkDependencyElement.setDestElement(p_FigureElement);
		return vtcdLinkDependencyElement;

	}

	public VTCDFigureCombination createVTCDFigureCombination(
			CMProxyCombination p_Combination) {
		VTCDFigureCombinationImpl vtcdFigureCombination = new VTCDFigureCombinationImpl();
		vtcdFigureCombination.setM_Combination(p_Combination);
		return vtcdFigureCombination;
	}

	public VTCDLinkCombinationEClass createVTCDLinkCombinationEClass(
			VTCDFigureCombination p_FigureCombination,
			VTCDFigureEquivalenceClass p_FigureEquivalenceClass) {
		VTCDLinkCombinationEClassImpl vtcdLinkCombinationEClass = new VTCDLinkCombinationEClassImpl();
		vtcdLinkCombinationEClass.setSourceCombination(p_FigureCombination);
		vtcdLinkCombinationEClass
				.setDestEquivalenceClass(p_FigureEquivalenceClass);
		return vtcdLinkCombinationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Point createPointFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null || initialValue.length() == 0)
			return new Point();

		initialValue = initialValue.trim();
		StringTokenizer tokenizer = new StringTokenizer(initialValue, ","); //$NON-NLS-1$
		int x = 0, y = 0;
		try {
			x = new Integer(tokenizer.nextToken().trim()).intValue();
			y = new Integer(tokenizer.nextToken().trim()).intValue();
		} catch (NumberFormatException nfe) {
		}
		return new Point(x, y);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String convertPointToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null)
			return "0,0";
		Point p = (Point) instanceValue;
		return p.x + "," + p.y;
	}
} //VTCDFactoryImpl
