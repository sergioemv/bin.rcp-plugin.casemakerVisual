/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vbr.gef.editors;


import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.MarqueeToolEntry;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.PaletteStack;
import org.eclipse.gef.palette.SelectionToolEntry;
import org.eclipse.gef.palette.ToolEntry;

import biz.bi.vbr.gef.editors.tools.VBRBusinessActionCreationToolEntry;
import biz.bi.vbr.gef.editors.tools.VBRBusinessTreeCreationToolEntry;
import biz.bi.vbr.gef.editors.tools.VBRElementCreationToolEntry;
import biz.bi.vbr.gef.editors.tools.VBRElementValueCreationToolEntry;
import biz.bi.vbr.provider.VBRModelEditPlugin;
import biz.bi.vbr.vbrvm.VBRVMPackage;
import biz.bi.vbr.vbrvm.provider.VBRImages;


/**
 * @author hcanedo
 * @since 05-09-2005
 */
public class VBRMainDiagramPaletteFactory {

	public static final PaletteRoot createPalette() {
		PaletteRoot l_PaletteRoot = new PaletteRoot();
		createControlGroup(l_PaletteRoot);
		createConnectionGroup(l_PaletteRoot);
		createComponentsGroup(l_PaletteRoot);
		return l_PaletteRoot;
	}

	/**
	 * @param p_paletteRoot
	 */
	private static void createComponentsGroup(PaletteRoot p_paletteRoot) {
		PaletteGroup componentsGroup = new PaletteGroup("biz.bi.vbr.ComponentsGroup");
		PaletteDrawer drawer2 = null;
		
		EClass eClass = null;
	
		
		drawer2 = new PaletteDrawer(VBRModelEditPlugin.INSTANCE.getString("_UI_DiagramMain_Drawer_caption"), null);
		
	    //BusinessTree
		eClass = VBRVMPackage.eINSTANCE.getVBRTreeView() ;
		drawer2.add(new VBRBusinessTreeCreationToolEntry(
				VBRModelEditPlugin.INSTANCE.getString("_UI_VBRBusinessTree_caption"),
				VBRModelEditPlugin.INSTANCE.getString("_UI_VBRBusinessTree_tooltip"), eClass, 
				new VBRCreationFactory(eClass),
						VBRImages.getImageDescriptor(VBRImages.PALETTE_BUSINESSTREE),
						VBRImages.getImageDescriptor(VBRImages.PALETTE_BUSINESSTREE)));
	
		//Element
		eClass = VBRVMPackage.eINSTANCE.getVBRElementView();
		drawer2.add(new VBRElementCreationToolEntry(
				VBRModelEditPlugin.INSTANCE.getString("_UI_VBR_Element_caption"),
				VBRModelEditPlugin.INSTANCE.getString("_UI_VBR_Element_tooltip"), eClass,
				new VBRCreationFactory(eClass), 
				VBRImages.getImageDescriptor(VBRImages.PALETTE_ELEMENT),
				VBRImages.getImageDescriptor(VBRImages.PALETTE_ELEMENT)));
		
	    //ElementValue
		eClass = VBRVMPackage.eINSTANCE.getVBRElementValueView();
		drawer2.add(new VBRElementValueCreationToolEntry(
				VBRModelEditPlugin.INSTANCE.getString("_UI_VBR_Element_Value_caption"),
				VBRModelEditPlugin.INSTANCE.getString("_UI_VBR_Element_Value_tooltip"), eClass,
				new VBRCreationFactory(eClass), 
				VBRImages.getImageDescriptor(VBRImages.PALETTE_ELEMENTVAUE),
				VBRImages.getImageDescriptor(VBRImages.PALETTE_ELEMENTVAUE)));

		//BusinessAction
		eClass = VBRVMPackage.eINSTANCE.getVBRActionView();
		drawer2.add(new VBRBusinessActionCreationToolEntry(
				VBRModelEditPlugin.INSTANCE.getString("_UI_VBR_Business_Action_caption"),
				VBRModelEditPlugin.INSTANCE.getString("_UI_VBR_Business_Action_tooltip"), eClass,
				new VBRCreationFactory(eClass), 
				VBRImages.getImageDescriptor(VBRImages.PALETTE_BUSINESSACTION),
				VBRImages.getImageDescriptor(VBRImages.PALETTE_BUSINESSACTION)));
		
		
		if (!drawer2.getChildren().isEmpty())
			componentsGroup.add(drawer2);
		p_paletteRoot.add(componentsGroup);

	}

	/**
	 * @param p_paletteRoot
	 */
	private static void createConnectionGroup(PaletteRoot p_paletteRoot) {
		PaletteGroup connectionGroup = new PaletteGroup("biz.bi.vbr.ConnectionGroup");
		PaletteStack referenceConnections = new PaletteStack("Reference Links",	"Create Reference Links", VBRImages.getImageDescriptor(""));
		ConnectionCreationToolEntry tool = null;
		
		////BusinessActionToElementValue
		tool = new ConnectionCreationToolEntry( VBRModelEditPlugin.INSTANCE.getString("_UI_VBRActionConnectElementValue_caption"), 
				VBRModelEditPlugin.INSTANCE.getString("_UI_VBRActionConnectElementValue_tooltip"),
				
		  new VBRCreationFactory(VBRVMPackage.eINSTANCE.getVBRActionConnectElementValue()),
		  VBRImages.getImageDescriptor(VBRImages.PALETTE_LINK_VBRACTION_ELEMENTVALUE),
		  VBRImages.getImageDescriptor(VBRImages.PALETTE_LINK_VBRACTION_ELEMENTVALUE));
		referenceConnections.add(tool);
		
		////ElementValueToBusinessAction
		tool = new ConnectionCreationToolEntry( VBRModelEditPlugin.INSTANCE.getString("_UI_ElementValueConnectVBRAction_caption"), 
				VBRModelEditPlugin.INSTANCE.getString("_UI_ElementValueConnectVBRAction_tooltip"),
				
		  new VBRCreationFactory(VBRVMPackage.eINSTANCE.getVBRElementValueConnectAction()),
		  VBRImages.getImageDescriptor(VBRImages.PALETTE_LINK_ELEMENTVALUE_VBRACTION),
		  VBRImages.getImageDescriptor(VBRImages.PALETTE_LINK_ELEMENTVALUE_VBRACTION));
		referenceConnections.add(tool);
		
		///ElementValueToElementValue
		tool = new ConnectionCreationToolEntry( VBRModelEditPlugin.INSTANCE.getString("_UI_ElementValueConnectElementValue_caption"), 
				VBRModelEditPlugin.INSTANCE.getString("_UI_ElementValueConnectElementValue_tooltip"),
				
		  new VBRCreationFactory(VBRVMPackage.eINSTANCE.getVBRElementValueConnectElementValue()),
		  VBRImages.getImageDescriptor(VBRImages.PALETTE_LINK_ELEMENTVALUE_ELEMENTVALUE),
		  VBRImages.getImageDescriptor(VBRImages.PALETTE_LINK_ELEMENTVALUE_ELEMENTVALUE));
		referenceConnections.add(tool);
		if (!referenceConnections.getChildren().isEmpty())
			connectionGroup.add(referenceConnections);
		p_paletteRoot.add(connectionGroup);
		
	}

	/**
	 * @param p_paletteRoot
	 */
	private static void createControlGroup(PaletteRoot p_paletteRoot) {
		PaletteGroup controlGroup = new PaletteGroup(VBRModelEditPlugin.INSTANCE.getString("_UI_Control_Group_Label"));
		ToolEntry tool = new SelectionToolEntry();
		controlGroup.add(tool);
		p_paletteRoot.setDefaultEntry(tool);
		tool = new MarqueeToolEntry();
		controlGroup.add(tool);
		PaletteSeparator sep = new PaletteSeparator("biz.bi.vbr.palette.separator.controlGroup");
		sep.setUserModificationPermission(PaletteEntry.PERMISSION_NO_MODIFICATION);
		controlGroup.add(sep);
		p_paletteRoot.add(controlGroup);
		
	}

}
