/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDFigureEquivalenceClassEditPart.java,v 1.30 2005/08/27 21:25:51 smoreno Exp $
 */

package biz.bi.vtcd.editparts;

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.Panel;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.AccessibleAnchorProvider;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.gef.requests.DropRequest;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

import biz.bi.cmcore.model.CMProxyEffect;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.cmcore.model.commands.CMProxyCommandFactory;
import biz.bi.vtcd.dialogs.VTCDEquivalenceClassDialog;
import biz.bi.vtcd.editpolicies.VTCDFigureEquivalenceClassComponentEditPolicy;
import biz.bi.vtcd.editpolicies.VTCDFigureEquivalenceClassSelectionEditPolicy;
import biz.bi.vtcd.editpolicies.VTCDFigureGraphicalNodeEditPolicy;
import biz.bi.vtcd.figures.VTCDFigureEquivalenceClassView;
import biz.bi.vtcd.figures.VTCDNodeFigure;
import biz.bi.vtcd.gef.editors.VTCDBaseEditor;
import biz.bi.vtcd.model.VTCDFigureEquivalenceClass;
import biz.bi.vtcd.model.VTCDLinkCombinationEClass;
import biz.bi.vtcd.model.VTCDPackage;


public class VTCDFigureEquivalenceClassEditPart extends VTCDBaseNodeEditPart{
  
  
  public VTCDFigureEquivalenceClassEditPart(Object model) {
	  this.setModel(model);

  }
  
  
  public VTCDFigureEquivalenceClass getVTCDFigureEquivalenceClass() {
    return (VTCDFigureEquivalenceClass)this.getModel();
  }
  
 
  protected IFigure createFigure() {
	//svonborries 19072005 begin
	  Label l_Value = new Label();
	  int l_RiskLevel= 0;
	  Label l_State = new Label();
	  String s_CauseEffect = "";
	  Label l_CauseEffect = new Label();
	  l_Value.setText(getVTCDFigureEquivalenceClass().getM_EquivalenceClass().getValue());
	  l_RiskLevel = getVTCDFigureEquivalenceClass().getM_EquivalenceClass().getRiskLevel();
	  l_State.setText(getVTCDFigureEquivalenceClass().getM_EquivalenceClass().getStateName());
	  for (Iterator i= getVTCDFigureEquivalenceClass().getM_EquivalenceClass().getProxyEffect().iterator();i.hasNext();){
		  s_CauseEffect = ((CMProxyEffect)i.next()).getName() + " " + s_CauseEffect;
	  }
	  l_CauseEffect.setText(s_CauseEffect);

	  VTCDFigureEquivalenceClassView l_EquivalenceClass = new VTCDFigureEquivalenceClassView(l_Value.getText(), l_State.getText(), l_RiskLevel,l_CauseEffect.getText());
	  //refreshVisuals();
	  l_EquivalenceClass.setParentWidth(getVTCDFigureEquivalenceClass().getM_VTCDFigureElement().getWidth());
	  return l_EquivalenceClass;

  }

  
  public IFigure getContentPane() {
    return (Panel)getFigure();
  }

  
  public void refreshVisuals() {
	  int l_RiskLevel= 0;
	  Label l_State = new Label();
	  String s_CauseEffect = "";
	  Label l_CauseEffect = new Label();

	  Label l_Value = new Label();
	  l_Value.setText(getVTCDFigureEquivalenceClass().getM_EquivalenceClass().getValue());
	  l_RiskLevel = getVTCDFigureEquivalenceClass().getM_EquivalenceClass().getRiskLevel();
	  l_State.setText(getVTCDFigureEquivalenceClass().getM_EquivalenceClass().getStateName());
	  for (Iterator i= getVTCDFigureEquivalenceClass().getM_EquivalenceClass().getProxyEffect().iterator();i.hasNext();){
		  s_CauseEffect = ((CMProxyEffect)i.next()).getName() + " " + s_CauseEffect;
	  }
	  l_CauseEffect.setText(s_CauseEffect);

	((VTCDFigureEquivalenceClassView)this.getFigure()).setState(l_State.getText());
	((VTCDFigureEquivalenceClassView)this.getFigure()).setRiskLevel(l_RiskLevel);
	((VTCDFigureEquivalenceClassView)this.getFigure()).setValue(l_Value.getText());
	((VTCDFigureEquivalenceClassView)this.getFigure()).setCauseEffect(l_CauseEffect.getText());
	if (getVTCDFigureEquivalenceClass().getM_VTCDFigureElement()!=null)
	((VTCDFigureEquivalenceClassView)this.getFigure()).setParentWidth(getVTCDFigureEquivalenceClass().getM_VTCDFigureElement().getWidth());
	
	if (!this.getVTCDFigureEquivalenceClass().getM_EquivalenceClass().getDescription().equalsIgnoreCase(""))
		this.getFigure().setToolTip(new Label(this.getVTCDFigureEquivalenceClass().getM_EquivalenceClass().getDescription()));
	else
		this.getFigure().setToolTip(null);
  }

  
  protected void createEditPolicies() {
    super.createEditPolicies();
	installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new VTCDFigureGraphicalNodeEditPolicy());
    installEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE, new VTCDFigureEquivalenceClassSelectionEditPolicy());
    installEditPolicy(EditPolicy.COMPONENT_ROLE, new VTCDFigureEquivalenceClassComponentEditPolicy());
  }
  protected List getModelSourceConnections()
  {
  	return ((VTCDFigureEquivalenceClass)this.getModel()).getM_VTCDLinkCombinationEClass(); 
  }

/* (non-Javadoc)
 * @see biz.bi.vtcd.editparts.VTCDBaseEditPart#handlePropertyChanged(org.eclipse.emf.common.notify.Notification)
 */
protected void handlePropertyChanged(Notification p_msg) {
	
	if(p_msg.getNotifier() instanceof CMProxyEquivalenceClass)
	{
		refreshVisuals();
		return;
	}
	switch (p_msg.getFeatureID(EClass.class)) 
	{
	case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__X:
		//responding to a dumm set
		refreshVisuals();
		return;
	case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__MVTCD_LINK_COMBINATION_ECLASS:
		refreshSourceConnections();
		return;
		
	}
}
public Object getAdapter(Class key) {
	if (key == AccessibleAnchorProvider.class)
		return new DefaultAccessibleAnchorProvider() { 
				public List getTargetAnchorLocations() {
				List list = new ArrayList();
				Vector targetAnchors = ((VTCDNodeFigure)getFigure()).getTargetConnectionAnchors();
				for (int i=0; i<targetAnchors.size(); i++) {
					ConnectionAnchor anchor = (ConnectionAnchor)targetAnchors.get(i);
					list.add(anchor.getReferencePoint().getTranslated(0, 3));
				}
				return list;
			}
		};
	return super.getAdapter(key);
}



/**
 * @return
 */
private VTCDFigureEquivalenceClassView getEquivalenceClassFigure() {
	return (VTCDFigureEquivalenceClassView)this.getFigure();
}
public ConnectionAnchor getSourceConnectionAnchor(Request request) {
	Point pt = new Point(((DropRequest)request).getLocation());
	return getEquivalenceClassFigure().getSourceConnectionAnchorAt(pt);
}
public ConnectionAnchor getSourceConnectionAnchor(ConnectionEditPart connEditPart) {
		VTCDLinkCombinationEClass link = (VTCDLinkCombinationEClass) connEditPart.getModel();
//	     if (link.getTargetTerminal()!=null)
	    	 return getEquivalenceClassFigure().getConnectionAnchor(link.getTargetTerminal());
//	     else
//	    	 return null;

}

/* (non-Javadoc)
 * @see biz.bi.vtcd.editparts.VTCDBaseEditPart#activate()
 */
public void activate() {
	super.activate();
	((VTCDFigureEquivalenceClass)getModel()).getM_EquivalenceClass().eAdapters().add(modelListener);
}

public void deactivate() {
	((VTCDFigureEquivalenceClass)getModel()).getM_EquivalenceClass().eAdapters().remove(modelListener);
	super.deactivate();
}	
	
IFigure getDirectEditFigure() {
	return ((VTCDFigureEquivalenceClassView)getFigure()).getValue();
}


/* (non-Javadoc)
 * @see biz.bi.vtcd.editparts.VTCDBaseNodeEditPart#createDirectEditPolicy()
 */
protected DirectEditPolicy createDirectEditPolicy() {
	
		return new DirectEditPolicy() {

			protected Command getDirectEditCommand(DirectEditRequest p_request) {
				
				return CMProxyCommandFactory.INSTANCE.createChangeValueCommand(  
						((VTCDFigureEquivalenceClass)getModel()).getM_EquivalenceClass(),
						(String)p_request.getCellEditor().getValue());
			}

			protected void showCurrentEditValue(DirectEditRequest p_request) {
				IFigure fig = getDirectEditFigure();
				if(fig instanceof Label){
					((Label)fig).setText((String)p_request.getCellEditor().getValue());
					fig.getUpdateManager().performUpdate();
				
				}
			}
			
		};
	}


/* (non-Javadoc)
 * @see biz.bi.vtcd.editparts.VTCDBaseEditPart#performOpen(org.eclipse.gef.Request)
 */
public void performOpen(Request p_request) {
	Shell s = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	VTCDEquivalenceClassDialog dialog = new VTCDEquivalenceClassDialog(s);
	CMProxyEquivalenceClass l_ProxyEquivalenceClass = ((VTCDFigureEquivalenceClass)this.getModel()).getM_EquivalenceClass();
	dialog.setAvailableEffectList(l_ProxyEquivalenceClass.getProxyElement().getProxyTestObject().getProxyEffect());
	dialog.setEffectList(l_ProxyEquivalenceClass.getProxyEffect());
	dialog.setDescriptionString(l_ProxyEquivalenceClass.getDescription());
	dialog.setIdString(l_ProxyEquivalenceClass.getId());
	dialog.setRiskLevelString(new Integer(l_ProxyEquivalenceClass.getRiskLevel()).toString());
	dialog.setValueString(l_ProxyEquivalenceClass.getValue());
	dialog.setStateString(l_ProxyEquivalenceClass.getState());
	if (dialog.open()==Dialog.OK)
	{
		CompoundCommand cc = new CompoundCommand();
		for (Iterator i = dialog.getEffectList().iterator();i.hasNext();)
		{
			CMProxyEffect l_proxyEffect = (CMProxyEffect)i.next();
			if (!l_ProxyEquivalenceClass.getProxyEffect().contains(l_proxyEffect))
				cc.add(CMProxyCommandFactory.INSTANCE.createAddProxyEffectToProxyEquivalenceClassCommand(l_ProxyEquivalenceClass,l_proxyEffect));
		}
		for (Iterator j = l_ProxyEquivalenceClass.getProxyEffect().iterator();j.hasNext();)
		{
			CMProxyEffect l_proxyEffect = (CMProxyEffect)j.next();
			if (!dialog.getEffectList().contains(l_proxyEffect))
				cc.add(CMProxyCommandFactory.INSTANCE.createRemoveProxyEffectFromEquivalenceCommand(l_ProxyEquivalenceClass,l_proxyEffect));
		}	
		cc.add(CMProxyCommandFactory.INSTANCE.createChangeDescriptionCommand(l_ProxyEquivalenceClass,dialog.getDescriptionString()));
		cc.add(CMProxyCommandFactory.INSTANCE.createChangeValueCommand(l_ProxyEquivalenceClass,dialog.getValueString()));
		cc.add(CMProxyCommandFactory.INSTANCE.createChangeStateCommand(l_ProxyEquivalenceClass,dialog.getStateValue()));
		cc.add(CMProxyCommandFactory.INSTANCE.createChangeRiskLevelCommand(l_ProxyEquivalenceClass,new Integer(dialog.getRiskLevelString()).intValue()));
		//after these a reload is neccesary
		
		IEditorPart editor = 
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		((CommandStack)((VTCDBaseEditor)editor).getAdapter(CommandStack.class)).execute(cc);
		
	}
}
	
}



//svonborries 11082005 end

