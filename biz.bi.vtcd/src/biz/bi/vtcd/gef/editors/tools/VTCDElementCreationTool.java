/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.gef.editors.tools;

import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.requests.CreationFactory;
import org.eclipse.gef.tools.CreationTool;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.PlatformUI;

import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.commands.CMProxyCommandFactory;
import biz.bi.vtcd.dialogs.VTCDElementDialog;
import biz.bi.vtcd.model.commands.VTCDCommandFactory;
import biz.bi.vtcd.model.commands.VTCDCreateElementCommand;

/**
 * @author svonborries
 * @09-ago-2005
 * @Malon
 */
public class VTCDElementCreationTool extends CreationTool{
	
	public VTCDElementCreationTool(CreationFactory p_Factory){
		super(p_Factory);
	}
	
	protected void performCreation(int p_button){
		EditPartViewer viewer = this.getCurrentViewer();
		CompoundCommand cc = (CompoundCommand)getCurrentCommand();
		
		VTCDCreateElementCommand thisComand = (VTCDCreateElementCommand)cc.getCommands().get(1);
		
		VTCDElementDialog dialog = new VTCDElementDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell());
		CMProxyElement proxyElement = thisComand.getChild().getM_Element();
		
		if(dialog.open()!= Window.CANCEL){
			//super.setCurrentCommand(thisCommand);
			//cc.add(CMProxyCommandFactory.INSTANCE.createAddProxyElementCommand(thisComand.getParent().getM_TestObject(),proxyElement));
			
			if(!(dialog.getNameString().equalsIgnoreCase("")) || !(dialog.getDescriptionString().equalsIgnoreCase(""))){
				cc.add(CMProxyCommandFactory.INSTANCE.createChangeNameCommand(proxyElement,dialog.getNameString()));
				cc.add(CMProxyCommandFactory.INSTANCE.createChangeDescriptionCommand(proxyElement,dialog.getDescriptionString()));
			
			}
			if((dialog.getAssignIcon()!=null) && (!dialog.getAssignIcon().equalsIgnoreCase(""))){
					cc.add(VTCDCommandFactory.INSTANCE.createChangeElementIconCommand(thisComand.getChild(),dialog.getAssignIcon()));
			}
			if(dialog.get_isOk() == true){
				this.setViewer(viewer);
				super.performCreation(p_button);
			}
			
		}
	}
}
