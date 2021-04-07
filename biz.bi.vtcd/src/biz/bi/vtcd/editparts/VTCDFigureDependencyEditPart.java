/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDFigureDependencyEditPart.java,v 1.21 2005/09/20 16:04:53 smoreno Exp $
 */

package biz.bi.vtcd.editparts;

import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.internal.ui.palette.editparts.DetailedLabelFigure;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

import biz.bi.cmcore.model.impl.CMProxyDependencyImpl;
import biz.bi.vtcd.dialogs.VTCDCombinationEditDialog;
import biz.bi.vtcd.dialogs.VTCDEquivalenceClassDialog;
import biz.bi.vtcd.editpolicies.VTCDFigureDependencyComponentEditPolicy;
import biz.bi.vtcd.editpolicies.VTCDFigureGraphicalNodeEditPolicy;
import biz.bi.vtcd.figures.VTCDFigureDependencyView;
import biz.bi.vtcd.figures.VTCDFigureElementView;
import biz.bi.vtcd.gef.editors.actions.VTCDGoToDiagramCombinationAction;
import biz.bi.vtcd.model.VTCDFigureDependency;
import biz.bi.vtcd.model.VTCDFigureElement;
import biz.bi.vtcd.model.VTCDPackage;
import biz.bi.vtcd.provider.VTCDImages;



public class VTCDFigureDependencyEditPart extends VTCDBaseNodeEditPart
implements NodeEditPart{
  
 
  public VTCDFigureDependencyEditPart(Object model) {
	  setModel(model);
  }
  
 
  public VTCDFigureDependency getVTCDFigureDependency() {
    return (VTCDFigureDependency) getModel();
  }
  
  
  protected IFigure createFigure() {
    /* ImageFigure l_Ellipse = new ImageFigure();
	 l_Ellipse.setBackgroundColor(ColorConstants.white);
	 l_Ellipse.setOpaque(true);
	 l_Ellipse.setImage(VTCDImages.getImage(VTCDImages.DEPENDENCY));
	 //CCastedo begins with vtcd with my first task...........
	    
	 return l_Ellipse;*/
	
	 Label l_name = new Label();	  
	
     VTCDFigureDependencyView l_FigureDependencyView = new VTCDFigureDependencyView(l_name);
     return l_FigureDependencyView;
	  
	  
  }


  

  
  public void refreshVisuals() {

	    
	/*   ImageFigure l_Ellipse = (ImageFigure) (this.getFigure());
	    l_Ellipse.setToolTip(new Label(getVTCDFigureDependency().getM_Dependency().getDescription()));
		
	    Point loc = new Point(((VTCDFigureDependency)getModel()).getX(),((VTCDFigureDependency)getModel()).getY());
	    Dimension size = new Dimension(((VTCDFigureDependency)getModel()).getWidth(), ((VTCDFigureDependency)getModel()).getHeight());
	    Ellipse e = new Ellipse();
	    Rectangle r = new Rectangle(loc, size);
	    e.setBounds(r);
	  
	    l_Ellipse.setSize(size);
	    l_Ellipse.setLocation(loc);
	    
	    if (getParent() instanceof GraphicalEditPart)
	    	((GraphicalEditPart) getParent()).setLayoutConstraint(this, getFigure(), r);

 
		super.refreshVisuals();*/  
	
		String name= ((VTCDFigureDependency)getModel()).getM_Dependency().getName(); 
		
		Label l= (Label)((VTCDFigureDependencyView)this.getFigure()).getHeader();
        l.setText(name);  
        l.setTextPlacement(Label.SOUTH);
      //  ((VTCDFigureDependencyView)this.getFigure()).setToolTip(new Label(name));

      //  l.setIcon(VTCDImages.getImage(VTCDImages.DEPENDENCY));
  
        Point loc = new Point(((VTCDFigureDependency)getModel()).getX(),((VTCDFigureDependency)getModel()).getY());
	    Dimension size = new Dimension(((VTCDFigureDependency)getModel()).getWidth(), ((VTCDFigureDependency)getModel()).getHeight());
	    //Ellipse e = new Ellipse();
	    Rectangle r = new Rectangle(loc, size);
	  //  e.setBounds(r);  
	    
	    if (getParent() instanceof GraphicalEditPart)
	    	((GraphicalEditPart) getParent()).setLayoutConstraint(this, getFigure(), r);

 
		super.refreshVisuals();
		 
  }

 
  protected void createEditPolicies() {
	  super.createEditPolicies();
    // Node Container & Layout Edit Policy
    //installEditPolicy(EditPolicy.LAYOUT_ROLE, new VTCDFigureDependencyLayoutEditPolicy());
    // Node Component Edit Policy
    installEditPolicy(EditPolicy.COMPONENT_ROLE, new VTCDFigureDependencyComponentEditPolicy());
    // Node Direct Edit Policy
   // installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new VTCDFigureDependencyDirectEditPolicy());
    // Node Graphical Node Edit Policy
    installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new VTCDFigureGraphicalNodeEditPolicy());
    //installEditPolicy(EditPolicy.);
  }


protected void handlePropertyChanged(Notification msg) {
//	This is parche because the CMProxyPackage and VTCDPackage have the same constants
	//and when change manually this constants the plugins don´t work
	if(msg.getNotifier() instanceof CMProxyDependencyImpl){
		refreshVisuals();
		return;
	}	
	switch (msg.getFeatureID(EClass.class)) 
	{
	case VTCDPackage.VTCD_FIGURE_DEPENDENCY__HEIGHT:
		refreshVisuals();
		return;
	case VTCDPackage.VTCD_FIGURE_DEPENDENCY__WIDTH:
		refreshVisuals();
		return;
	case VTCDPackage.VTCD_FIGURE_DEPENDENCY__X:
		refreshVisuals();
		return;
	case VTCDPackage.VTCD_FIGURE_DEPENDENCY__Y:
		refreshVisuals();
		return;
		
	case VTCDPackage.VTCD_FIGURE_DEPENDENCY__MVTCD_LINK_DEPENDENCY_ELEMENT:
		refreshTargetConnections();
		return;
		
			
	}
}


protected List getModelTargetConnections()
{
	return ((VTCDFigureDependency)this.getModel()).getM_VTCDLinkDependencyElement(); 
}

/* (non-Javadoc)
 * @see biz.bi.vtcd.editparts.VTCDBaseEditPart#activate()
 */
public void activate() {
	super.activate();
	((VTCDFigureDependency)getModel()).getM_Dependency().eAdapters().add(modelListener);
	
}


/* (non-Javadoc)
 * @see biz.bi.vtcd.editparts.VTCDBaseEditPart#deactivate()
 */
public void deactivate() {
	((VTCDFigureDependency)getModel()).getM_Dependency().eAdapters().remove(modelListener);
	super.deactivate();
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
	IEditorPart editor = 
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
	((ActionRegistry)editor.getAdapter(ActionRegistry.class)).getAction(VTCDGoToDiagramCombinationAction.ID).run();
	
	
}	

}