package biz.bi.vtcd.editparts;

import java.awt.Toolkit;
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

import biz.bi.cmcore.model.CMProxyCombination;
import biz.bi.cmcore.model.CMProxyEffect;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.cmcore.model.commands.CMProxyAddProxyCombinationCommand;
import biz.bi.cmcore.model.commands.CMProxyAddProxyEquivalenceClassCommand;
import biz.bi.cmcore.model.commands.CMProxyCommandFactory;
import biz.bi.vtcd.dialogs.VTCDCombinationEditDialog;
import biz.bi.vtcd.dialogs.VTCDEquivalenceClassDialog;
import biz.bi.vtcd.editpolicies.VTCDFigureCombinationComponentEditPolicy;
import biz.bi.vtcd.editpolicies.VTCDFigureGraphicalNodeEditPolicy;
import biz.bi.vtcd.figures.VTCDFigureCombinationView;
import biz.bi.vtcd.figures.VTCDFigureEllipseCombinationLabel;
import biz.bi.vtcd.gef.editors.VTCDBaseEditor;
import biz.bi.vtcd.gef.editors.actions.VTCDGoToDiagramCombinationAction;
import biz.bi.vtcd.model.VTCDFigureCombination;
import biz.bi.vtcd.model.VTCDFigureDependency;
import biz.bi.vtcd.model.VTCDFigureEquivalenceClass;
import biz.bi.vtcd.model.VTCDPackage;


public class VTCDFigureCombinationEditPart extends VTCDBaseNodeEditPart{
 
  public VTCDFigureCombinationEditPart(Object model) {
	  this.setModel(model);

  }
  
  
  public VTCDFigureCombination getVTCDFigureCombination() {
    return (VTCDFigureCombination)this.getModel();
  }
  
  
  protected IFigure createFigure() {	  
	    
	  VTCDFigureCombinationView figureCombination = new VTCDFigureCombinationView("",0,"");
	  
	 /* ImageFigure l_Ellipse = new ImageFigure();
		 l_Ellipse.setBackgroundColor(ColorConstants.white);
		 l_Ellipse.setOpaque(true);
		 l_Ellipse.setImage(VTCDImages.getImage(VTCDImages.COMBINATION));*/
		 
		 return figureCombination;
  }

 

 
  public void refreshVisuals() {
	  String name= ((VTCDFigureCombination)getModel()).getM_Combination().getName(); 
	  
	  int l_RiskLevel= 0;
	  String s_CauseEffect = "";
	  super.refreshVisuals();
	  IFigure l_Ellipse = this.getFigure();
	    l_Ellipse.setToolTip(new Label(getVTCDFigureCombination().getM_Combination().getDescription()));
		
	    Point loc = new Point(((VTCDFigureCombination)getModel()).getX(),((VTCDFigureCombination)getModel()).getY());
	    Dimension size = new Dimension(((VTCDFigureCombination)getModel()).getWidth(), ((VTCDFigureCombination)getModel()).getHeight());
	    Ellipse e = new Ellipse();
	    Rectangle r = new Rectangle(loc, size);
	    e.setBounds(r);
	  
	    l_Ellipse.setSize(size);
	    l_Ellipse.setLocation(loc);
	    
	    if (getParent() instanceof GraphicalEditPart)
	    	((GraphicalEditPart) getParent()).setLayoutConstraint(this, getFigure(), r);

	    l_RiskLevel = this.getVTCDFigureCombination().getM_Combination().getRiskLevel();
		  for (Iterator i= getVTCDFigureCombination().getM_Combination().getProxyEffect().iterator();i.hasNext();){
			  s_CauseEffect = ((CMProxyEffect)i.next()).getName() + " " + s_CauseEffect;
		  }
		  ((VTCDFigureCombinationView)this.getFigure()).setEffect(new Label(s_CauseEffect));
		  ((VTCDFigureCombinationView)this.getFigure()).setRiskLevel(l_RiskLevel);
		  ((VTCDFigureCombinationView)this.getFigure()).setName(name);
		  
		 
		}
        

  
  protected void createEditPolicies() {
	  super.createEditPolicies();
      installEditPolicy(EditPolicy.COMPONENT_ROLE, new VTCDFigureCombinationComponentEditPolicy());
      installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new VTCDFigureGraphicalNodeEditPolicy());
  }


/* (non-Javadoc)
 * @see biz.bi.vtcd.editparts.VTCDBaseEditPart#handlePropertyChanged(org.eclipse.emf.common.notify.Notification)
 */
protected void handlePropertyChanged(Notification p_msg) 
{

	if(p_msg.getNotifier() instanceof CMProxyCombination)
	{
		refreshVisuals();
		refreshTargetConnections();
		return;
	}
	switch (p_msg.getFeatureID(EClass.class)) 
	{
	case VTCDPackage.VTCD_FIGURE_COMBINATION__HEIGHT:
		refreshVisuals();
		return;
	case VTCDPackage.VTCD_FIGURE_COMBINATION__WIDTH:
		refreshVisuals();
		return;
	case VTCDPackage.VTCD_FIGURE_COMBINATION__X:
		refreshVisuals();
		return;
	case VTCDPackage.VTCD_FIGURE_COMBINATION__Y:
		refreshVisuals();
		return;
	case VTCDPackage.VTCD_FIGURE_COMBINATION__MVTCD_LINK_COMBINATION_ECLASS:
		refreshTargetConnections();
		return;
	
		
			
	}	
	
	
}
protected List getModelTargetConnections()
{
	return ((VTCDFigureCombination)this.getModel()).getM_VTCDLinkCombinationEClass(); 
}


/* (non-Javadoc)
 * @see biz.bi.vtcd.editparts.VTCDBaseEditPart#createDirectEditPolicy()
 */
protected DirectEditPolicy createDirectEditPolicy() {
	// TODO Auto-generated method stub
	return null;
}
/*
IFigure getDirectEditFigure(){
	return ((VTCDFigureCombinationView)getFigure()).getEffect();
}*/

public void activate() {
	super.activate();
	((VTCDFigureCombination)getModel()).getM_Combination().eAdapters().add(modelListener);
}

public void deactivate() {
	((VTCDFigureCombination)getModel()).getM_Combination().eAdapters().remove(modelListener);
	super.deactivate();
}


/* (non-Javadoc)
 * @see biz.bi.vtcd.editparts.VTCDBaseEditPart#performOpen(org.eclipse.gef.Request)
 */
public void performOpen(Request p_request) {
	Shell s = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	
	VTCDCombinationEditDialog dialog = new VTCDCombinationEditDialog(s,1);

	CMProxyCombination l_ProxyCombination = ((VTCDFigureCombination)this.getModel()).getM_Combination();
	dialog.setAvailableEffectList(l_ProxyCombination.getProxyDependency().getProxyTestObject().getProxyEffect());
	dialog.setEffectList(l_ProxyCombination.getProxyEffect());
	dialog.setDescriptionString(l_ProxyCombination.getDescription());
	dialog.setIdString(l_ProxyCombination.getName());
	dialog.setRiskLevelString(new Integer(l_ProxyCombination.getRiskLevel()).toString());	
	dialog.setStateString(l_ProxyCombination.getState());
	
	dialog.open();
	if (dialog.isOK())
	{
		CompoundCommand cc = new CompoundCommand();
		for (Iterator i = dialog.getEffectList().iterator();i.hasNext();)
		{
			CMProxyEffect l_proxyEffect = (CMProxyEffect)i.next();
			if (!l_ProxyCombination.getProxyEffect().contains(l_proxyEffect))
				cc.add(CMProxyCommandFactory.INSTANCE.createAddProxyEffectToProxyCombinationCommand(l_ProxyCombination,l_proxyEffect));
		}
		
		for (Iterator j = l_ProxyCombination.getProxyEffect().iterator();j.hasNext();)
		{
			CMProxyEffect l_proxyEffect = (CMProxyEffect)j.next();
			if (!dialog.getEffectList().contains(l_proxyEffect))
				cc.add(CMProxyCommandFactory.INSTANCE.createRemoveProxyEffectFromCombinationCommand(l_ProxyCombination,l_proxyEffect));
		}	
		cc.add(CMProxyCommandFactory.INSTANCE.createChangeDescriptionCommand(l_ProxyCombination,dialog.getDescriptionString()));		
		cc.add(CMProxyCommandFactory.INSTANCE.createChangeStateCommand(l_ProxyCombination,dialog.getStateValue()));
		cc.add(CMProxyCommandFactory.INSTANCE.createChangeRiskLevelCommand(l_ProxyCombination,new Integer(dialog.getRiskLevelString()).intValue()));
		for (Iterator i = cc.getCommands().iterator();i.hasNext();)
		{System.out.println(((Command)i.next()).canExecute());}
		IEditorPart editor = 
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		((CommandStack)((VTCDBaseEditor)editor).getAdapter(CommandStack.class)).execute(cc);
		
	}
	
	//dialog.close();
	
}

}