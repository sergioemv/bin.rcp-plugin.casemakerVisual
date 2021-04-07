/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDFigureElementEditPart.java,v 1.34 2005/09/20 16:04:53 smoreno Exp $
 */

package biz.bi.vtcd.editparts;


import java.util.HashMap;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MouseListener;
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
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.commands.CMProxyCommandFactory;
import biz.bi.cmcore.model.impl.CMProxyElementImpl;
import biz.bi.vtcd.dialogs.VTCDElementDialog;
import biz.bi.vtcd.editpolicies.VTCDFigureElementComponentEditPolicy;
import biz.bi.vtcd.editpolicies.VTCDFigureElementLayoutEditPolicy;
import biz.bi.vtcd.editpolicies.VTCDFigureGraphicalNodeEditPolicy;
import biz.bi.vtcd.figures.VTCDFigureElementView;
import biz.bi.vtcd.gef.editors.VTCDBaseEditor;
import biz.bi.vtcd.model.VTCDFigureElement;
import biz.bi.vtcd.model.VTCDPackage;
import biz.bi.vtcd.model.commands.VTCDCommandFactory;
import biz.bi.vtcd.model.impl.VTCDFigureElementImpl;
import biz.bi.vtcd.provider.VTCDImages;



public class VTCDFigureElementEditPart extends VTCDBaseNodeEditPart{
  private HashMap mapIcon = new HashMap();
  
  public MouseListener listener = new MouseListener() {
		public void mousePressed(org.eclipse.draw2d.MouseEvent me) {
					
			((VTCDFigureElement)getModel()).setFolded(!((VTCDFigureElement)getModel()).isFolded());
			((VTCDFigureElementView)getFigure()).setFolding(((VTCDFigureElement)getModel()).isFolded());
						
		}			

		public void mouseReleased(org.eclipse.draw2d.MouseEvent me) {
				
		}

		public void mouseDoubleClicked(org.eclipse.draw2d.MouseEvent me) {
		}
	};

public VTCDFigureElementEditPart(Object model) {
	  this.setModel(model);
  }
  
  
  public VTCDFigureElementImpl getVTCDFigureElement() {
    return (VTCDFigureElementImpl)getModel();
  }
  
  
  protected IFigure createFigure() {
  Label l_name = new Label();	  
   //l_name.setText(getVTCDFigureElement().getM_Element().getName());
   //Use the figure that is defined on the figure class
  //((VTCDFigureElementView)this.getFigure()).setFolding();  
   VTCDFigureElementView l_FigureElementView = new VTCDFigureElementView((IFigure) l_name);
   if (this.getParent() instanceof VTCDDiagramMainEditPart)
   {
   l_FigureElementView.setFolding(((VTCDFigureElement)getModel()).isFolded());
   l_FigureElementView.getFoldingIcon().addMouseListener(listener);
   }
   else
   {
	   l_FigureElementView.getFoldingIcon().setVisible(false);
	   l_FigureElementView.setFolding(false);
	   
   }
	

    return l_FigureElementView;
	  
  }

 
  public void refreshVisuals() {
	String name= ((VTCDFigureElement)getModel()).getM_Element().getName(); ;
    Label l = (Label) ((VTCDFigureElementView)this.getFigure()).getHeader();
    l.setText(name);
  
    if (!this.getVTCDFigureElement().getM_Element().getDescription().equalsIgnoreCase(""))
    	this.getFigure().setToolTip(new Label(this.getVTCDFigureElement().getM_Element().getDescription()));
    else
    	this.getFigure().setToolTip(null);
//	 svonborries 06072005 begin
    if (getVTCDFigureElement().getIcon() != null && (!getVTCDFigureElement().getIcon().equalsIgnoreCase(""))){
    		Image image = VTCDImages.getImageFromDir(getVTCDFigureElement().getIcon());
    		l.setIcon(image);
    		}
    else{
         l.setIcon(VTCDImages.getImage(VTCDImages.PALETTE_ELEMENT));}
//  svonborries 06072005 end
    if (this.getParent() instanceof VTCDDiagramMainEditPart)
    if (((VTCDFigureElement)getModel()).getM_VTCDFigureEquivalenceClass().size()==0)
    	((Label) ((VTCDFigureElementView)this.getFigure()).getFoldingIcon()).setVisible(false);
    else
    	((Label) ((VTCDFigureElementView)this.getFigure()).getFoldingIcon()).setVisible(true);
    //((VTCDFigureElementView)this.getFigure()).setFolding(((VTCDFigureElement)getModel()).isFolded());
    
    Point loc = new Point(((VTCDFigureElement)getModel()).getX(),((VTCDFigureElement)getModel()).getY());
    Dimension size = new Dimension(((VTCDFigureElement)getModel()).getWidth(), ((VTCDFigureElement)getModel()).getHeight());
    Rectangle r = new Rectangle(loc, size);
  
    if (getParent() instanceof GraphicalEditPart)
    	((GraphicalEditPart) getParent()).setLayoutConstraint(this, getFigure(), r);
    
  }
 
  protected void createEditPolicies() {
	  super.createEditPolicies();
    // Node Container & Layout Edit Policy
     installEditPolicy(EditPolicy.LAYOUT_ROLE, new VTCDFigureElementLayoutEditPolicy());
    // Node Component Edit Policy
    installEditPolicy(EditPolicy.COMPONENT_ROLE, new VTCDFigureElementComponentEditPolicy());
    // Node Direct Edit Policy
    //installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new VTCDFigureElementDirectEditPolicy());
    // Node Graphical Node Edit Policy
    installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new VTCDFigureGraphicalNodeEditPolicy());
  }


protected void handlePropertyChanged(Notification msg) {
//	This is parche because the CMProxyPackage and VTCDPackage have the same constants
	//and when change manually this constants the plugins don´t work
	if(msg.getNotifier() instanceof CMProxyElementImpl){
		refreshVisuals();
		return;
	}
	switch (msg.getFeatureID(EClass.class)) 
	{
	case VTCDPackage.VTCD_FIGURE_ELEMENT__HEIGHT:
		refreshVisuals();
		return;
	case VTCDPackage.VTCD_FIGURE_ELEMENT__WIDTH:
		refreshVisuals();
		return;
	case VTCDPackage.VTCD_FIGURE_ELEMENT__X:
		refreshVisuals();
		return;
	case VTCDPackage.VTCD_FIGURE_ELEMENT__Y:
		refreshVisuals();
		return;
	case VTCDPackage.VTCD_FIGURE_ELEMENT__ICON:
		refreshVisuals();
		return;
	case VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_LINK_DEPENDENCY_ELEMENT:
		refreshSourceConnections();
		return;
		
	case VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_FIGURE_EQUIVALENCE_CLASS:
	
		if ((this.getVTCDFigureElement().isFolded())&&
		   (this.getVTCDFigureElement().getM_VTCDFigureEquivalenceClass().size()>=1))
			listener.mousePressed(null);
		
		if ((!this.getVTCDFigureElement().isFolded())&&
				   (this.getVTCDFigureElement().getM_VTCDFigureEquivalenceClass().size()==0))
					listener.mousePressed(null);
				
		refreshChildren();
		refreshVisuals();
		return;
	}
	
		
	
}

// svonborries 06072005 begin
public IFigure getContentPane(){
	
	return ((VTCDFigureElementView)getFigure()).getContentPane();
}
//svonborries 06072005 end

protected List getModelSourceConnections()
{
	return ((VTCDFigureElement)this.getModel()).getM_VTCDLinkDependencyElement(); 
}
protected List getModelChildren()
{
	//System.out.print("Cargando equivalence Classes");
	return ((VTCDFigureElement)this.getModel()).getM_VTCDFigureEquivalenceClass();
}

protected void refreshChildren()
{
	super.refreshChildren();

	
}	
/* (non-Javadoc)
 * @see biz.bi.vtcd.editparts.VTCDBaseEditPart#activate()
 */
public void activate() {
	super.activate();
	((VTCDFigureElement)getModel()).getM_Element().eAdapters().add(modelListener);
}

public void deactivate() {
	((VTCDFigureElement)getModel()).getM_Element().eAdapters().remove(modelListener);
	super.deactivate();
}	
//svonborries09082005 begin	
IFigure getDirectEditFigure() {
	return ((VTCDFigureElementView)getFigure()).getHeader();
}


/* (non-Javadoc)
 * @see biz.bi.vtcd.editparts.VTCDBaseEditPart#createDirectEditPolicy()
 */
protected DirectEditPolicy createDirectEditPolicy() {
	return new DirectEditPolicy() {

		protected Command getDirectEditCommand(DirectEditRequest p_request) {
			return CMProxyCommandFactory.INSTANCE.createChangeNameCommand(  
					((VTCDFigureElement)getModel()).getM_Element(),
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
	VTCDElementDialog dialog = new VTCDElementDialog(s);
	CMProxyElement proxyElement = ((VTCDFigureElement)this.getModel()).getM_Element();
	dialog.setNameString(proxyElement.getName());
	dialog.setDescriptionString(proxyElement.getDescription());
	dialog.setIDString(proxyElement.getId());
	dialog.setBrowseString(this.getVTCDFigureElement().getIcon());
	if(dialog.open()!=Dialog.CANCEL){
		if(dialog.get_isOk() == true){
			CompoundCommand cc = new CompoundCommand();
			
			cc.add(CMProxyCommandFactory.INSTANCE.createChangeNameCommand(proxyElement,dialog.getNameString()));
			cc.add(CMProxyCommandFactory.INSTANCE.createChangeDescriptionCommand(proxyElement,dialog.getDescriptionString()));
			cc.add(VTCDCommandFactory.INSTANCE.createChangeElementIconCommand(this.getVTCDFigureElement(),dialog.getBrowseString()));
			
		IEditorPart editor = 
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		((CommandStack)((VTCDBaseEditor)editor).getAdapter(CommandStack.class)).execute(cc);}
	}
}

}