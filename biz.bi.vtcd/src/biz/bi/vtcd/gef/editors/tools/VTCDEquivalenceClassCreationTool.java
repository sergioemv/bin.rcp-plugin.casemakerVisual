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
import biz.bi.cmcore.model.CMProxyEffect;
import biz.bi.cmcore.model.commands.CMProxyAddProxyEquivalenceClassCommand;
import biz.bi.cmcore.model.commands.CMProxyCommandFactory;
import biz.bi.vtcd.dialogs.VTCDEquivalenceClassDialog;

/**
 * @author svonborries
 * @09-ago-2005
 * @Malon
 */
public class VTCDEquivalenceClassCreationTool extends CreationTool{

	public VTCDEquivalenceClassCreationTool(CreationFactory p_factory){
		super(p_factory);
	}
	
	protected void performCreation(int p_button){
		
		EditPartViewer viewer = this.getCurrentViewer();
		CompoundCommand cc = (CompoundCommand)getCurrentCommand();
		
		CMProxyAddProxyEquivalenceClassCommand proxyEquivalence = (CMProxyAddProxyEquivalenceClassCommand) cc.getCommands().get(0);
		VTCDEquivalenceClassDialog dialog = new VTCDEquivalenceClassDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell());
		dialog.setAvailableEffectList(proxyEquivalence.getParent().getProxyTestObject().getProxyEffect());
	
		
		if(dialog.open() != Dialog.CANCEL )
		{	
			if(dialog.getValueString()!="")
				cc.add(CMProxyCommandFactory.INSTANCE.createChangeValueCommand(proxyEquivalence.getChild(),dialog.getValueString()));
			if (!dialog.getDescriptionString().equalsIgnoreCase(""))
				cc.add(CMProxyCommandFactory.INSTANCE.createChangeDescriptionCommand(proxyEquivalence.getChild(),dialog.getDescriptionString()));
			 if(dialog.getRiskLevelValue()>=0 && dialog.getRiskLevelValue()<=10)
				cc.add(CMProxyCommandFactory.INSTANCE.createChangeRiskLevelCommand(proxyEquivalence.getChild(),dialog.getRiskLevelValue()));
			else
				cc.add(CMProxyCommandFactory.INSTANCE.createChangeRiskLevelCommand(proxyEquivalence.getChild(),0));
			if(dialog.getStateValue()>=0 && dialog.getStateValue() <=3)
				cc.add(CMProxyCommandFactory.INSTANCE.createChangeStateCommand(proxyEquivalence.getChild(),dialog.getStateValue()));
			else
				cc.add(CMProxyCommandFactory.INSTANCE.createChangeStateCommand(proxyEquivalence.getChild(),0));
			if(dialog.getEffectList()!=null)
				for (Iterator iter = dialog.getEffectList().iterator(); iter.hasNext();) {
					CMProxyEffect element = (CMProxyEffect) iter.next();
					cc.add(CMProxyCommandFactory.INSTANCE.createAddProxyEffectToProxyEquivalenceClassCommand(proxyEquivalence.getChild(),element));
				}
			
			this.setViewer(viewer);
			super.performCreation(p_button);
		}
		
	}
}

