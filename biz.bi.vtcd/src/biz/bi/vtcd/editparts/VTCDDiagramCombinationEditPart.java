/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDDiagramCombinationEditPart.java,v 1.14 2005/08/26 03:41:27 smoreno Exp $
 */

package biz.bi.vtcd.editparts;

import java.util.List;

import org.eclipse.draw2d.ConnectionLayer;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.ShortestPathConnectionRouter;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.editpolicies.SnapFeedbackPolicy;

import biz.bi.cmcore.model.CMProxyDependency;
import biz.bi.vtcd.editpolicies.VTCDDiagramXYLayoutEditPolicy;
import biz.bi.vtcd.model.VTCDDiagramCombination;
import biz.bi.vtcd.model.VTCDPackage;


public class VTCDDiagramCombinationEditPart extends VTCDBaseEditPart{
  
 private Label title = new Label();
  
  public VTCDDiagramCombinationEditPart(Object model) {
	 super();
	  setModel(model);
  }
  
  public VTCDDiagramCombination getVTCDDiagramCombination() {
    return (VTCDDiagramCombination)getModel();
  }
  
 protected IFigure createFigure() {
		Layer l_figure = new FreeformLayer();
		l_figure.setBorder(new MarginBorder(5));
		l_figure.setLayoutManager(new FreeformLayout());
		
		
		title.setText("Dependency : "+getVTCDDiagramCombination().getM_FigureDependency().getM_Dependency().getDescription());
		
		l_figure.add(title, new Rectangle(10,10,-1,-1));
		ConnectionLayer connLayer = (ConnectionLayer)getLayer(LayerConstants.CONNECTION_LAYER);
		
		ShortestPathConnectionRouter router = new ShortestPathConnectionRouter(l_figure);
		//ManhattanConnectionRouter router = new ManhattanConnectionRouter();
		connLayer.setConnectionRouter(router);
		
		return l_figure;
  }

  

 
  public void refreshVisuals() {
	  title.setText("Dependency : "+getVTCDDiagramCombination().getM_FigureDependency().getM_Dependency().getDescription());
	  super.refreshVisuals();
    
  }

  
  protected void createEditPolicies() {
    // Node Container & Layout Edit Policy
	  installEditPolicy("Snap Feedback", new SnapFeedbackPolicy());  
	 installEditPolicy(EditPolicy.LAYOUT_ROLE, new VTCDDiagramXYLayoutEditPolicy());   
	 //installEditPolicy(EditPolicy.COMPONENT_ROLE, new VTCDDiagramCombinationComponentEditPolicy());
    // Node Direct Edit Policy
   // installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new VTCDDiagramCombinationDirectEditPolicy());
    // Node Graphical Node Edit Policy
    //installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new VTCDDiagramCombinationGraphicalNodeEditPolicy());*/
  }

/* (non-Javadoc)
 * @see biz.bi.vtcd.editparts.VTCDBaseEditPart#handlePropertyChanged(org.eclipse.emf.common.notify.Notification)
 */
  protected List getModelChildren()
  {
	   	
	  return getVTCDDiagramCombination().getChildren();
  }

  
 protected void handlePropertyChanged(Notification p_msg) {
	 if (p_msg.getNotifier() instanceof CMProxyDependency)
		 if (getVTCDDiagramCombination().getM_FigureDependency()!=null)
			 refreshVisuals();
	
		switch (p_msg.getFeatureID(EClass.class)) 
		{
		case VTCDPackage.VTCD_DIAGRAM_COMBINATION__MVTCD_FIGURE_ELEMENT:
			refreshChildren();
			return;
		case VTCDPackage.VTCD_DIAGRAM_COMBINATION__MVTCD_FIGURE_COMBINATION:
			refreshChildren();
			return;
	
		}
 }
 
 public void activate()
 { super.activate();
   ((EObject)((VTCDDiagramCombination)this.getModel()).getM_FigureDependency().getM_Dependency()).eAdapters().add(modelListener); 	
 }
 public void deactivate()
 { super.activate();
 if (((EObject)((VTCDDiagramCombination)this.getModel()).getM_FigureDependency())!=null)
 ((EObject)((VTCDDiagramCombination)this.getModel()).getM_FigureDependency().getM_Dependency()).eAdapters().remove(modelListener);}
 protected DirectEditPolicy createDirectEditPolicy() {
	// TODO Auto-generated method stub
	return null;
}

/* (non-Javadoc)
 * @see biz.bi.vtcd.editparts.VTCDBaseEditPart#performOpen(org.eclipse.gef.Request)
 */
public void performOpen(Request p_request) {
	// TODO Auto-generated method stub
	
}
 
 
}