/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.gef.editors.tools;

import java.util.Iterator;

import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.requests.CreationFactory;
import org.eclipse.gef.tools.CreationTool;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.ui.PlatformUI;

import biz.bi.cmcore.model.CMProxyDependency;
import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.commands.CMProxyCommandFactory;
import biz.bi.cmcore.policies.CMProxyPolicyFactory;
import biz.bi.vtcd.dialogs.VTCDDependencyDialog;
import biz.bi.vtcd.model.VTCDDiagramCombination;
import biz.bi.vtcd.model.VTCDFactory;
import biz.bi.vtcd.model.VTCDFigureDependency;
import biz.bi.vtcd.model.VTCDFigureElement;
import biz.bi.vtcd.model.commands.VTCDCommandFactory;
import biz.bi.vtcd.model.commands.VTCDCreateDependencyCommand;
import biz.bi.vtcd.policies.VTCDPolicyFactory;


/**
 * @author svonborries
 * @27-07-2005
 * @svonborries
 */
public class VTCDDependencyCreationTool extends CreationTool{

	public VTCDDependencyCreationTool(CreationFactory p_factory){
		super(p_factory);
	}
	
	protected void performCreation(int p_button){
		
		EditPartViewer viewer = this.getCurrentViewer();
		CompoundCommand cc = (CompoundCommand)getCurrentCommand();
		
		VTCDCreateDependencyCommand thisCommand = (VTCDCreateDependencyCommand)cc.getCommands().get(1);
		VTCDDiagramCombination diagramCombination = VTCDFactory.eINSTANCE.createVTCDDiagramCombination();
		cc.add(VTCDCommandFactory.INSTANCE.createDiagramCombinationCommand((VTCDFigureDependency)thisCommand.getChild(),(VTCDDiagramCombination)diagramCombination));
		
		VTCDDependencyDialog dialog = new VTCDDependencyDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell());
			dialog.setAvailableElements(((VTCDCreateDependencyCommand)thisCommand).getParent().getM_VTCDFigureElement());
		CMProxyDependency l_proxyDependency = thisCommand.getChild().getM_Dependency();	
		if((dialog.open() != Dialog.CANCEL )&& (dialog.elementSelected == true))
		{	
			
			for (Iterator iter = dialog.getDependentElements().iterator(); iter.hasNext();) {
				VTCDFigureElement element = (VTCDFigureElement) iter.next();
				CMProxyElement l_proxyElement = element.getM_Element();
				cc.add(CMProxyCommandFactory.INSTANCE.createAddProxyElementToProxyDependencyCommand(l_proxyDependency,l_proxyElement));
			}
			if (!dialog.s_Description.equalsIgnoreCase(""))
				cc.add(CMProxyCommandFactory.INSTANCE.createChangeDescriptionCommand(thisCommand.getChild().getM_Dependency(),dialog.s_Description));
			cc.add(CMProxyPolicyFactory.INSTANCE.createReloadProxyTestObjectPolicy(thisCommand.getParent().getM_TestObject()));
			cc.add(VTCDPolicyFactory.INSTANCE.createReloadDiagramMainPolicy(thisCommand.getParent()));
			cc.add(VTCDCommandFactory.INSTANCE.createAutomaticLayoutCommand((VTCDDiagramCombination)diagramCombination));
			this.setViewer(viewer);
			super.performCreation(p_button);
			
			;
		}
	
	
			
		
		
		
		
		
	}
	
}
