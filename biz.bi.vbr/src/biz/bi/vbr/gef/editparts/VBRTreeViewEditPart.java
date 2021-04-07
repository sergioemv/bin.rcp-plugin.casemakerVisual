package biz.bi.vbr.gef.editparts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.GraphicalEditPart;

import biz.bi.vbr.vbrvm.VBRTreeView;
import biz.bi.vbr.vbrvm.VBRVMPackage;
import biz.bi.vbr.vbrvm.impl.VBRTreeViewImpl;

public class VBRTreeViewEditPart extends VBRBaseEditPart {

	public VBRTreeViewEditPart(Object model) {
		
		 this.setModel(model);
	}

	public VBRTreeViewImpl getVBRTreeViewImpl() {
		return (VBRTreeViewImpl)getModel();
		
	}
	
	public void activate() {
		if(!isActive()){
			
		super.activate();	
		}
	}
	
	public void deactivate() {
	
		super.deactivate();	
		
	}
	protected IFigure createFigure() {
		// TODO Auto-generated method stub
		
		return new Label("hiTRee");
	}

	protected void createEditPolicies() {
		// TODO Auto-generated method stub
		
	}
	

	/* (non-Javadoc)
	 * @see biz.bi.vbr.editparts.VBRBaseEditPart#handlePropertyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	protected void handlePropertyChanged(Notification p_msg) {
		switch (p_msg.getFeatureID(EClass.class)) {
		case VBRVMPackage.VBR_TREE_VIEW__HEIGTH:
			refreshVisuals();
			break;
		case VBRVMPackage.VBR_TREE_VIEW__WIDTH:
			refreshVisuals();
			break;
		case VBRVMPackage.VBR_TREE_VIEW__X:
			refreshVisuals();
			break;
		case VBRVMPackage.VBR_TREE_VIEW__Y:
			refreshVisuals();
			break;
		default:
			break;
		}
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#refreshVisuals()
	 */
	protected void refreshVisuals() {
		Label l=(Label)getFigure();
		l.setText("<<tree>>");
		Point loc = new Point(((VBRTreeView)getModel()).getX(),((VBRTreeView)getModel()).getY());
 	    Dimension size = new Dimension(((VBRTreeView)getModel()).getWidth(), ((VBRTreeView)getModel()).getHeigth());
	    Rectangle r = new Rectangle(loc, size);
		if (getParent() instanceof GraphicalEditPart)
	    	((GraphicalEditPart) getParent()).setLayoutConstraint(this, getFigure(), r);

	}
	

}
