package biz.bi.vbr.gef.editparts;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.GraphicalEditPart;

import biz.bi.vbr.BusinessObject;
import biz.bi.vbr.gef.figures.VBRFigureElement;
import biz.bi.vbr.vbrvm.VBRElementView;
import biz.bi.vbr.vbrvm.VBRVMPackage;
import biz.bi.vbr.vbrvm.impl.VBRElementViewImpl;

public class VBRElementViewEditPart extends VBRBaseEditPart{
    
	public VBRElementViewEditPart(Object model) {
		
		 this.setModel(model);
	}

	public VBRElementViewImpl getVBRElementView() {
		return (VBRElementViewImpl)getModel();
		
	}
	
	public void activate() {
		if(!isActive()){
		//	((VBRElementView)getModel()).getM_BObjectM().eAdapters().add(modelListener);
		super.activate();
		}
	}
	
	public void deactivate() {
		//((VBRElementView)getModel()).getM_BObjectM().eAdapters().add(modelListener);
		super.deactivate();
	}
	protected IFigure createFigure() {
	//svonborries 12102005 begin
		VBRFigureElement l_Element = new VBRFigureElement(new Label());
		return l_Element;
//svonborries 12105005 end		
	}

	protected void createEditPolicies() {
		 super.createEditPolicies();
		
	}
	
	/* (non-Javadoc)
	 * @see biz.bi.vbr.editparts.VBRBaseEditPart#handlePropertyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	protected void handlePropertyChanged(Notification p_msg) {
		
		switch (p_msg.getFeatureID(EClass.class)) 
		{
			case VBRVMPackage.VBR_ELEMENT_VIEW__HEIGTH:
				refreshVisuals();
				return;
			case VBRVMPackage.VBR_ELEMENT_VIEW__WIDTH:
				refreshVisuals();
				return;
			case VBRVMPackage.VBR_ELEMENT_VIEW__X:
				refreshVisuals();
				return;
			case VBRVMPackage.VBR_ELEMENT_VIEW__Y:
				refreshVisuals();
				return;
			case VBRVMPackage.VBR_ELEMENT_VIEW__MVBR_ELEMENT_CONNECT_ELEMENT_VALUE:
				refreshTargetConnections();
				return;
		}
		
	}
  
	protected List getModelTargetConnections(){
		
		return (List) ((VBRElementView)getModel()).getM_VBRElementConnectElementValue();		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#refreshVisuals()
	 */
	
	
//svonborries 12102005 begin	
	public void refreshVisuals(){
		VBRFigureElement l_Header = (VBRFigureElement)this.getFigure();
		BusinessObject l_model = (BusinessObject) this.getModel();
		
		l_Header.setHeader(l_model.getBoName());
		
		if (!l_model.getBoDescription().equalsIgnoreCase("")){
			l_Header.setToolTip(new Label(l_model.getBoDescription()));
		}
		else{
			l_Header.setToolTip(null);
		}
		
		Point l_Point = new Point(((VBRElementView)getModel()).getX(),((VBRElementView)getModel()).getY());
		Dimension l_Dimension = new Dimension(((VBRElementView)getModel()).getWidth(),((VBRElementView)getModel()).getHeigth());
		Rectangle l_Rec = new Rectangle(l_Point,l_Dimension);
		
		if(getParent() instanceof GraphicalEditPart){
			((GraphicalEditPart)getParent()).setLayoutConstraint(this,this.getFigure(),l_Rec);
		}
	}
//svonborries 12102005 end
}
