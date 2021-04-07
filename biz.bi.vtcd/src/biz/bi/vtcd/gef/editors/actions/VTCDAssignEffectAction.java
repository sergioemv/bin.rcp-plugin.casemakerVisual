/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.gef.editors.actions;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import biz.bi.cmcore.model.CMProxyCombination;
import biz.bi.cmcore.model.CMProxyEffect;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.cmcore.model.commands.CMProxyCommandFactory;
import biz.bi.vtcd.dialogs.VTCDAssignEffectDialog;
import biz.bi.vtcd.editparts.VTCDFigureCombinationEditPart;
import biz.bi.vtcd.editparts.VTCDFigureEquivalenceClassEditPart;
import biz.bi.vtcd.provider.VTCDEditPlugin;
import biz.bi.vtcd.provider.VTCDImages;

/**
 * @author hcanedo
 * @17-08-2005
 * @hcanedo
 */
public class VTCDAssignEffectAction extends SelectionAction {

	public static final String ID = "ASSIGNCAUSEEFFECT";
	private CMProxyEquivalenceClass m_ProxyEquivalenceClass=null;
	private CMProxyCombination m_ProxyCombination=null;
	/**
	 * @param p_part
	 * @param p_style
	 */
	public VTCDAssignEffectAction(IWorkbenchPart p_part, int p_style) {
		super(p_part, p_style);
		setEnabled(false);
		setId(ID);
	
		setText(VTCDEditPlugin.INSTANCE.getString("_UI_VTCDAssignCauseEffect_Label"));
		setImageDescriptor(VTCDImages.getImageDescriptor(VTCDImages.CAUSE_EFFECT_ICON));

	}

	/**
	 * @param p_part
	 */
	public VTCDAssignEffectAction(IWorkbenchPart p_part) {
		super(p_part);
		setEnabled(false);
		setId(ID);
	
		setText(VTCDEditPlugin.INSTANCE.getString("_UI_VTCDAssignCauseEffect_Label"));
		setImageDescriptor(VTCDImages.getImageDescriptor(VTCDImages.CAUSE_EFFECT_ICON));

	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.action.Action#run()
	 */
	public void run() {
		if((m_ProxyCombination != null) ||(m_ProxyEquivalenceClass!= null)){
			boolean proxyCombinationSelected=false;
			Shell parentShell=PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
			String dialogTitle=VTCDEditPlugin.INSTANCE.getString("_UI_VTCDAssignCauseEffect_Label");
			Image imagenTitle=VTCDImages.getImage(VTCDImages.CAUSE_EFFECT_ICON);
			List assignEffect= null;
			List availablesEffect= null;
			if(m_ProxyCombination != null){
				proxyCombinationSelected=true;
				assignEffect=m_ProxyCombination.getProxyEffect();
				availablesEffect=m_ProxyCombination.getProxyDependency().getProxyTestObject().getProxyEffect();
			}
			else{
				assignEffect=m_ProxyEquivalenceClass.getProxyEffect();
				availablesEffect=m_ProxyEquivalenceClass.getProxyElement().getProxyTestObject().getProxyEffect();
			}
			VTCDAssignEffectDialog cmd=new VTCDAssignEffectDialog(parentShell, dialogTitle, imagenTitle, availablesEffect, assignEffect);
			cmd.create();
			cmd.open();
			if(cmd.isOkSelected()){
				CompoundCommand cCommand= new CompoundCommand();
				List toAddList=new Vector(cmd.getSelectProxyEffects());
				List toRemoveList= new Vector(assignEffect);
				toAddList.removeAll(assignEffect);
				toRemoveList.retainAll(cmd.getAvailablesProxyEffects());
				if(proxyCombinationSelected){
					for(Iterator iter=toAddList.iterator();iter.hasNext();){
						CMProxyEffect effect=(CMProxyEffect) iter.next();
						Command c=CMProxyCommandFactory.INSTANCE.createAddProxyEffectToProxyCombinationCommand(m_ProxyCombination, effect);
						cCommand.add(c);
					}
					for(Iterator iter=toRemoveList.iterator();iter.hasNext();){
						CMProxyEffect effect=(CMProxyEffect) iter.next();
						Command c=CMProxyCommandFactory.INSTANCE.createRemoveProxyEffectFromCombinationCommand(m_ProxyCombination, effect);
						cCommand.add(c);
					}
				}
				else{
					for(Iterator iter=toAddList.iterator();iter.hasNext();){
						CMProxyEffect effect=(CMProxyEffect) iter.next();
						Command c=CMProxyCommandFactory.INSTANCE.createAddProxyEffectToProxyEquivalenceClassCommand(m_ProxyEquivalenceClass, effect);
						cCommand.add(c);
					}
					for(Iterator iter=toRemoveList.iterator();iter.hasNext();){
						CMProxyEffect effect=(CMProxyEffect) iter.next();
						Command c=CMProxyCommandFactory.INSTANCE.createRemoveProxyEffectFromEquivalenceCommand(m_ProxyEquivalenceClass, effect);
						cCommand.add(c);
					}
				}
				execute(cCommand);
				
			}
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.ui.actions.WorkbenchPartAction#calculateEnabled()
	 */
	protected boolean calculateEnabled() {
		if (((StructuredSelection)getSelection()).getFirstElement() instanceof VTCDFigureEquivalenceClassEditPart){
			 m_ProxyEquivalenceClass = ((VTCDFigureEquivalenceClassEditPart)((StructuredSelection)getSelection()).getFirstElement()).getVTCDFigureEquivalenceClass().getM_EquivalenceClass();
		}
		else
			if (((StructuredSelection)getSelection()).getFirstElement() instanceof VTCDFigureCombinationEditPart){
				 m_ProxyCombination = ((VTCDFigureCombinationEditPart)((StructuredSelection)getSelection()).getFirstElement()).getVTCDFigureCombination().getM_Combination();
			}

		 
		return (((StructuredSelection)getSelection()).size()==1)
		&& ((((StructuredSelection)getSelection()).getFirstElement() instanceof VTCDFigureEquivalenceClassEditPart)|| 
			  (((StructuredSelection)getSelection()).getFirstElement() instanceof VTCDFigureCombinationEditPart));
	}

}
