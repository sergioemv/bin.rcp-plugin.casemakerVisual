package biz.bi.vbr.gef.editparts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.GraphicalEditPart;

import biz.bi.vbr.BusinessValue;
import biz.bi.vbr.gef.figures.VBRFigureElementValue;
import biz.bi.vbr.vbrvm.VBRElementValueView;
import biz.bi.vbr.vbrvm.VBRVMPackage;
import biz.bi.vbr.vbrvm.impl.VBRElementValueViewImpl;

public class VBRElementValueViewEditPart extends VBRBaseEditPart{

	public VBRElementValueViewEditPart(Object model) {
		// TODO Auto-generated constructor stub
		 this.setModel(model);
	}
    
	public VBRElementValueViewImpl getVBRElementValueView() {
		return (VBRElementValueViewImpl)this.getModel();
		
	}
		 
	public void activate() {
	//	((VBRElementValueView)getModel()).getM_bvaluem().eAdapters().add(modelListener);
		super.activate();
	}
	
	public void deactivate() {
		//((VBRElementValueView)getModel()).getM_bvaluem().eAdapters().remove(modelListener);
		super.deactivate();
	}
	
	protected IFigure createFigure() {
//svonborries 13092005 begin		
		Label l_name = new Label();
		int l_RiskLevel = 0;
		
		l_RiskLevel = getVBRElementValueView().getM_bvaluem().getBvRisk();
		l_name.setText(getVBRElementValueView().getM_bvaluem().getName());
		
		VBRFigureElementValue l_Figure = new VBRFigureElementValue(l_name,l_RiskLevel);
		return l_Figure;
	}
//svonborries 13092005 end
	protected void createEditPolicies() {
		// TODO Auto-generated method stub
		
	}
   	
	/* (non-Javadoc)
	 * @see biz.bi.vbr.editparts.VBRBaseEditPart#handlePropertyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	protected void handlePropertyChanged(Notification p_msg) 
	{
		
		switch (p_msg.getFeatureID(EClass.class)) 
		{
			case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__WIDTH:
				refreshVisuals();
				return;
				
			case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__HEIGTH:
				refreshVisuals();
				return;
				
			case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__X:
				refreshVisuals();
				return;
				
			case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__Y:
				refreshVisuals();
				return;
				
			case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MVBR_ELEMENT_VALUE_CONNECT_ACTION:
				refreshTargetConnections();
				return;
				
			case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW__MVBR_ELEMENT_VALUE_CONNECT_ELEMENT_VALUE:
				refreshTargetConnections();
				return; 
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#refreshVisuals()
	 */
	protected void refreshVisuals() {
		VBRFigureElementValue l_Figure = (VBRFigureElementValue)this.getFigure();
		BusinessValue l_Object = (BusinessValue)this.getModel();
		
		l_Figure.setHeaderText(l_Object.getName());
		l_Figure.setRiskLevel(l_Object.getBvRisk());

		Point loc = new Point(((VBRElementValueView)getModel()).getX(),((VBRElementValueView)getModel()).getY());
	    Dimension size = new Dimension(((VBRElementValueView)getModel()).getWidth(), ((VBRElementValueView)getModel()).getHeigth());
	    Rectangle r = new Rectangle(loc, size);
		if (getParent() instanceof GraphicalEditPart)
	    	((GraphicalEditPart) getParent()).setLayoutConstraint(this, getFigure(), r);

	}
	
	// method to obtein the target EqC 
		

}
