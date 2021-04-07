package biz.bi.vbr.gef.editparts;

import java.util.List;

import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.SnapFeedbackPolicy;

import biz.bi.vbr.gef.policies.VBRMainDiagramLayoutEditPolicy;
import biz.bi.vbr.vbrvm.MainDiagram;
import biz.bi.vbr.vbrvm.VBRVMPackage;

public class MainDiagramEditPart extends VBRBaseEditPart {

	public MainDiagramEditPart(Object model) {
		super();
		this.setModel(model);
	}
    
	 public List getModelChildren() {
			
		return ((MainDiagram)getModel()).getChildren();
	}
	 
	protected IFigure createFigure() {
		Layer l_figure = new FreeformLayer();
		l_figure.setBorder(new MarginBorder(5));
		l_figure.setLayoutManager(new FreeformLayout());
		
		Label l_name = new Label();
		l_name.setText(getModel().toString());
		l_figure.add(l_name, new Rectangle(10,10,-1,-1));
		return l_figure;
	}

	protected void createEditPolicies() {
		installEditPolicy("Snap Feedback", new SnapFeedbackPolicy()); //$NON-NLS-1$	}
	//	installEditPolicy(EditPolicy.COMPONENT_ROLE, new RootComponentEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new VBRMainDiagramLayoutEditPolicy());
	}
	 public void refreshVisuals() {
		  super.refreshVisuals();
	 }
	 
	 protected void handlePropertyChanged(Notification msg) {
			switch (msg.getFeatureID(EClass.class)) 
			{
			case VBRVMPackage.MAIN_DIAGRAM__MTREE_VIEW:
				  refreshChildren();
				  return;
				  
			case VBRVMPackage.MAIN_DIAGRAM__MVBR_ELEMENT_VIEW:
				  refreshChildren();
				  return;
				  
			case VBRVMPackage.MAIN_DIAGRAM__MVBR_ELEMENT_VALUE_VIEW:
				  refreshChildren();	
				  return;
				  
			case  VBRVMPackage.MAIN_DIAGRAM__MVBR_ACTION_VIEW:
				  refreshChildren();
				  return;
			}
			// refreshing children of Main diagram
	 }		
}
