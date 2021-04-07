/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vbr.gef.editparts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ManhattanConnectionRouter;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;


/**
 * @author svonborries
 * @since 05-09-2005
 */
public abstract class VBRBaseLinkEditPart extends AbstractConnectionEditPart{

	protected Adapter modelListener = new AdapterImpl();
	
	public void notifyChanged(Notification msg){
		this.handlePropertyChanged(msg);
	}
	
	protected abstract void handlePropertyChanged (Notification msg);
	
	protected IFigure createFigure(){
		PolylineConnection connection = new PolylineConnection();
		connection.setConnectionRouter(new ManhattanConnectionRouter());
		return connection;
	}
	
	public void activate(){
		super.activate();
		((EObject)getModel()).eAdapters().add(this.modelListener);
	}
	
	public void deactivate(){
		((EObject)getModel()).eAdapters().remove(this.modelListener);
		super.deactivate();
	}
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
	 */
	protected void createEditPolicies() {
		// TODO Auto-generated method stub
		
	}
	
	public void setSelected(int value) {
		super.setSelected(value);
		if (value != EditPart.SELECTED_NONE)
			((PolylineConnection)getFigure()).setLineWidth(2);
		else
			((PolylineConnection)getFigure()).setLineWidth(1);
	}

}
