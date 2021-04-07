/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDDiagramMainEditPart.java,v 1.16 2005/08/26 03:41:27 smoreno Exp $
 */

package biz.bi.vtcd.editparts;

import java.util.List;

import org.eclipse.draw2d.ConnectionLayer;
import org.eclipse.draw2d.FanRouter;
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
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.editpolicies.SnapFeedbackPolicy;

import biz.bi.vtcd.editpolicies.VTCDDiagramXYLayoutEditPolicy;
import biz.bi.vtcd.model.VTCDDiagramMain;
import biz.bi.vtcd.model.VTCDPackage;
import biz.bi.vtcd.model.impl.VTCDDiagramMainImpl;


public class VTCDDiagramMainEditPart extends VTCDBaseEditPart{
  
 

  public VTCDDiagramMainImpl getVTCDDiagramMain() {
    return (VTCDDiagramMainImpl)getModel();
  }
 
  public VTCDDiagramMainEditPart(Object model)
  {
	  //smoreno_begin
	  super();
	  this.setModel(model);
	  //smoreno_end
  }
 
  protected IFigure createFigure() {
	  //smoreno_begin
	  
		

		Layer l_figure = new FreeformLayer();
		l_figure.setBorder(new MarginBorder(5));
		l_figure.setLayoutManager(new FreeformLayout());
		
		Label l_name = new Label();
		l_name.setText("Test Object : "+((VTCDDiagramMain)getModel()).getM_TestObject().getName());
		
		l_figure.add(l_name, new Rectangle(10,10,-1,-1));
		ConnectionLayer connLayer = (ConnectionLayer)getLayer(LayerConstants.CONNECTION_LAYER);
		FanRouter router = new FanRouter();
		router.setSeparation(20);
		router.setNextRouter(new ShortestPathConnectionRouter(l_figure));
		connLayer.setConnectionRouter(router);
		
		return l_figure;
		//smoreno_end
	
  }

  
  

  
  public void refreshVisuals() {
	  super.refreshVisuals();
    /*String name = getENode().getName();
    if (name == null || name.trim().length() == 0)
      name = getLabelProvider().getText(getENode().getEObject());
    Label l = (Label) ((ENodeFigure) getFigure()).getHeader();
    l.setText(name);

    Point loc = getENode().getLocation();
    Dimension size = new Dimension((int) getENode().getWidth(), (int) getENode().getHeight());
    Rectangle r = new Rectangle(loc, size);

    if (getParent() instanceof GraphicalEditPart)
    	((GraphicalEditPart) getParent()).setLayoutConstraint(this, getFigure(), r);*/
  }

  
  protected void createEditPolicies() {
     //Node Container & Layout Edit Policy
	installEditPolicy("Snap Feedback", new SnapFeedbackPolicy());  
    installEditPolicy(EditPolicy.LAYOUT_ROLE, new VTCDDiagramXYLayoutEditPolicy());
    // Node Component Edit Policy
    /*installEditPolicy(EditPolicy.COMPONENT_ROLE, new VTCDDiagramMainComponentEditPolicy());
    // Node Direct Edit Policy
    installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new VTCDDiagramMainDirectEditPolicy());
    // Node Graphical Node Edit Policy
    installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new VTCDDiagramMainGraphicalNodeEditPolicy());*/
  }

protected List getModelChildren()
  {
	   	
	  return ((VTCDDiagramMain)getModel()).getChildren();
  }

protected void handlePropertyChanged(Notification msg) {
	switch (msg.getFeatureID(EClass.class)) 
	{
	case VTCDPackage.VTCD_DIAGRAM_MAIN__MVTCD_FIGURE_ELEMENT:
		refreshChildren();
		return;
	case VTCDPackage.VTCD_DIAGRAM_MAIN__MVTCD_FIGURE_DEPENDENCY:
		refreshChildren();
		return;
		
	//add more handlers here for more children....		
	}	
}

/* (non-Javadoc)
 * @see biz.bi.vtcd.editparts.VTCDBaseEditPart#createDirectEditPolicy()
 */
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