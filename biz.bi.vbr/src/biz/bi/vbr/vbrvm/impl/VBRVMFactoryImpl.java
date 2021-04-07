/**
 * <copyright>
 * </copyright>
 *
 * $Id: VBRVMFactoryImpl.java,v 1.12 2005/09/20 19:03:42 hcanedo Exp $
 */
package biz.bi.vbr.vbrvm.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.swt.graphics.Color;

import biz.bi.vbr.BusinessAction;
import biz.bi.vbr.BusinessObject;
import biz.bi.vbr.BusinessValue;
import biz.bi.vbr.FormalPolicy;
import biz.bi.vbr.vbrvm.MainDiagram;
import biz.bi.vbr.vbrvm.VBRActionConnectElementValue;
import biz.bi.vbr.vbrvm.VBRActionView;
import biz.bi.vbr.vbrvm.VBRElementConnectElementValue;
import biz.bi.vbr.vbrvm.VBRElementValueConnectAction;
import biz.bi.vbr.vbrvm.VBRElementValueConnectElementValue;
import biz.bi.vbr.vbrvm.VBRElementValueView;
import biz.bi.vbr.vbrvm.VBRElementView;
import biz.bi.vbr.vbrvm.VBRTreeConnectElementValue;
import biz.bi.vbr.vbrvm.VBRTreeView;
import biz.bi.vbr.vbrvm.VBRVMFactory;
import biz.bi.vbr.vbrvm.VBRVMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VBRVMFactoryImpl extends EFactoryImpl implements VBRVMFactory {
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
	public VBRVMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case VBRVMPackage.MAIN_DIAGRAM:
			return createMainDiagram();
		case VBRVMPackage.VBR_TREE_VIEW:
			return createVBRTreeView();
		case VBRVMPackage.VBR_ELEMENT_VIEW:
			return createVBRElementView();
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW:
			return createVBRElementValueView();
		case VBRVMPackage.VBR_ACTION_VIEW:
			return createVBRActionView();
		case VBRVMPackage.VBR_ELEMENT_CONNECT_ELEMENT_VALUE:
			return createVBRElementConnectElementValue();
		case VBRVMPackage.VBR_ELEMENT_VALUE_CONNECT_ELEMENT_VALUE:
			return createVBRElementValueConnectElementValue();
		case VBRVMPackage.VBR_ELEMENT_VALUE_CONNECT_ACTION:
			return createVBRElementValueConnectAction();
		case VBRVMPackage.VBR_ACTION_CONNECT_ELEMENT_VALUE:
			return createVBRActionConnectElementValue();
		case VBRVMPackage.VBR_TREE_CONNECT_ELEMENT_VALUE:
			return createVBRTreeConnectElementValue();
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
		case VBRVMPackage.COLOR:
			return createColorFromString(eDataType, initialValue);
		case VBRVMPackage.BM_BUSINESS_OBJECT:
			return createBMBusinessObjectFromString(eDataType, initialValue);
		case VBRVMPackage.BM_BUSINESS_VALUE:
			return createBMBusinessValueFromString(eDataType, initialValue);
		case VBRVMPackage.BM_BUSINESS_ACTION:
			return createBMBusinessActionFromString(eDataType, initialValue);
		case VBRVMPackage.BM_FORMAL_POLICY:
			return createBMFormalPolicyFromString(eDataType, initialValue);
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
		case VBRVMPackage.COLOR:
			return convertColorToString(eDataType, instanceValue);
		case VBRVMPackage.BM_BUSINESS_OBJECT:
			return convertBMBusinessObjectToString(eDataType, instanceValue);
		case VBRVMPackage.BM_BUSINESS_VALUE:
			return convertBMBusinessValueToString(eDataType, instanceValue);
		case VBRVMPackage.BM_BUSINESS_ACTION:
			return convertBMBusinessActionToString(eDataType, instanceValue);
		case VBRVMPackage.BM_FORMAL_POLICY:
			return convertBMFormalPolicyToString(eDataType, instanceValue);
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
	public MainDiagram createMainDiagram() {
		MainDiagramImpl mainDiagram = new MainDiagramImpl();
		return mainDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRTreeView createVBRTreeView() {
		VBRTreeViewImpl vbrTreeView = new VBRTreeViewImpl();
		return vbrTreeView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRElementView createVBRElementView() {
		VBRElementViewImpl vbrElementView = new VBRElementViewImpl();
		return vbrElementView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRElementValueView createVBRElementValueView() {
		VBRElementValueViewImpl vbrElementValueView = new VBRElementValueViewImpl();
		return vbrElementValueView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRActionView createVBRActionView() {
		VBRActionViewImpl vbrActionView = new VBRActionViewImpl();
		return vbrActionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRElementConnectElementValue createVBRElementConnectElementValue() {
		VBRElementConnectElementValueImpl vbrElementConnectElementValue = new VBRElementConnectElementValueImpl();
		return vbrElementConnectElementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRElementValueConnectElementValue createVBRElementValueConnectElementValue() {
		VBRElementValueConnectElementValueImpl vbrElementValueConnectElementValue = new VBRElementValueConnectElementValueImpl();
		return vbrElementValueConnectElementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRElementValueConnectAction createVBRElementValueConnectAction() {
		VBRElementValueConnectActionImpl vbrElementValueConnectAction = new VBRElementValueConnectActionImpl();
		return vbrElementValueConnectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRActionConnectElementValue createVBRActionConnectElementValue() {
		VBRActionConnectElementValueImpl vbrActionConnectElementValue = new VBRActionConnectElementValueImpl();
		return vbrActionConnectElementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRTreeConnectElementValue createVBRTreeConnectElementValue() {
		VBRTreeConnectElementValueImpl vbrTreeConnectElementValue = new VBRTreeConnectElementValueImpl();
		return vbrTreeConnectElementValue;
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
	 * @generated
	 */
	public BusinessObject createBMBusinessObjectFromString(EDataType eDataType,
			String initialValue) {
		return (BusinessObject) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBMBusinessObjectToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessValue createBMBusinessValueFromString(EDataType eDataType,
			String initialValue) {
		return (BusinessValue) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBMBusinessValueToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessAction createBMBusinessActionFromString(EDataType eDataType,
			String initialValue) {
		return (BusinessAction) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBMBusinessActionToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author hcanedo
	 */
	public FormalPolicy createBMFormalPolicyFromString(EDataType eDataType,
			String initialValue) {
		ResourceSet rsrcSet = new ResourceSetImpl();
		if (initialValue.indexOf("file") >= 0) {
			initialValue = initialValue.substring(initialValue.indexOf("file"),
					initialValue.length() - 1);
		}
		URI uri = URI.createURI(initialValue);
		URIConverter conv = new URIConverterImpl();
		conv.normalize(uri);
		Resource resource = null;
		try {
			resource = rsrcSet.getResource(uri, true);
		} catch (Exception e) {
			uri = URI.createFileURI(initialValue);
			conv = new URIConverterImpl();
			conv.normalize(uri);
			resource = rsrcSet.getResource(uri, true);
		}
		return (FormalPolicy) resource.getContents().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBMFormalPolicyToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 
	 public FormalPolicy createbmFormalPolicyFromString(EDataType eDataType,
	 String initialValue) {
	 ResourceSet rsrcSet = new ResourceSetImpl();

	 URI uri = URI.createURI(initialValue);
	 URIConverter conv = new URIConverterImpl();
	 conv.normalize(uri);
	 Resource resource = rsrcSet.getResource(uri, true);
	 return (FormalPolicy) resource.getContents().get(0);

	 }*/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 **/
	public static FormalPolicy createBMFormalPolicyFromString2(
			EDataType eDataType, String initialValue) {
		ResourceSet rsrcSet = new ResourceSetImpl();

		URI uri = URI.createFileURI(initialValue);
		URIConverter conv = new URIConverterImpl();
		conv.normalize(uri);
		Resource resource = rsrcSet.getResource(uri, true);
		return (FormalPolicy) resource.getContents().get(0);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRVMPackage getVBRVMPackage() {
		return (VBRVMPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static VBRVMPackage getPackage() {
		return VBRVMPackage.eINSTANCE;
	}

} //VBRVMFactoryImpl