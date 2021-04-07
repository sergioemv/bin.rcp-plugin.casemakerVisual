package biz.bi.vbr.gef.editparts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.GraphicalEditPart;

import biz.bi.vbr.vbrvm.VBRActionView;
import biz.bi.vbr.vbrvm.VBRVMPackage;
import biz.bi.vbr.vbrvm.impl.VBRActionViewImpl;


public class VBRActionViewEditPart extends VBRBaseEditPart {

	public VBRActionViewEditPart(Object model) {
		 this.setModel(model);
	}
    
	public VBRActionViewImpl getVBRActionView() {
		return (VBRActionViewImpl)this.getModel();
		
	}
	
	public void activate(){
	//	((VBRActionView)getModel()).getM_BActionm().eAdapters().add(modelListener);
		super.activate();
	}
	public void deactivate(){
		super.deactivate();
	}
	
	protected IFigure createFigure() {
		Label l_name = new Label();
		l_name.setText("<<Action>>");//getVBRActionView().getM_BActionm().getName());
		return l_name;
	}

	protected void createEditPolicies() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see biz.bi.vbr.editparts.VBRBaseEditPart#handlePropertyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	protected void handlePropertyChanged(Notification p_msg) {
		
		switch (p_msg.getFeatureID(EClass.class)) 
		{
			case VBRVMPackage.VBR_ACTION_VIEW__WIDTH:
				refreshVisuals();
				return;
				
			case VBRVMPackage.VBR_ACTION_VIEW__HEIGTH:
				refreshVisuals();
				return;
		   
		    case VBRVMPackage.VBR_ACTION_VIEW__X:
				refreshVisuals();
				return;	
				
		    case VBRVMPackage.VBR_ACTION_VIEW__Y:
				refreshVisuals();
				return;	
				
		    case VBRVMPackage.VBR_ACTION_VIEW__MVBR_ACTION_CONNECT_ELEMENT_VALUE:	
	            refreshSourceConnections();
				return;	
		
		}
	}
	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#refreshVisuals()
	 */
	protected void refreshVisuals() {
		Label l=(Label)getFigure();
		l.setText("<<ACtion>>");
		Point loc = new Point(((VBRActionView)getModel()).getX(),((VBRActionView)getModel()).getY());
	    Dimension size = new Dimension(((VBRActionView)getModel()).getWidth(), ((VBRActionView)getModel()).getHeigth());
	    Rectangle r = new Rectangle(loc, size);
		if (getParent() instanceof GraphicalEditPart)
	    	((GraphicalEditPart) getParent()).setLayoutConstraint(this, getFigure(), r);

	}
}
