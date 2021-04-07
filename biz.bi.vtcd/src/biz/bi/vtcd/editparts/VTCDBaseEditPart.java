package biz.bi.vtcd.editparts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.text.TextFlow;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.ui.views.properties.IPropertySource;

import biz.bi.vtcd.model.properties.VTCDPropertySourceFactory;

/**
 * @author smoreno
 * Base class for all edit parts that allow adding and deleting from 
 * the model's observer list
 */
public abstract class VTCDBaseEditPart extends AbstractGraphicalEditPart {
	
	protected VTCDLabelDirectEditManager manager;
	protected Adapter modelListener = new AdapterImpl() {
		public void notifyChanged(Notification msg) {
			handlePropertyChanged(msg);
		}
	};
	public void notifyChanged(Notification msg) {
		handlePropertyChanged(msg);
	}
	
	
//this method should be implemented by all edit parts
//refresh their properties
protected abstract void handlePropertyChanged(Notification msg);
protected IFigure createFigure() {
	//default figure
		return new Label();
	}
protected abstract DirectEditPolicy createDirectEditPolicy();
protected void createEditPolicies() {
	installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, createDirectEditPolicy());
	installEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE, null);

	}
	
	//add the edit part to the observer list
	public void activate() {
		super.activate();
		((EObject)getModel()).eAdapters().add(modelListener);
	}
	//remove the edit part from the observer list
	public void deactivate() {
		((EObject)getModel()).eAdapters().remove(modelListener);
		super.deactivate();
	}
	public Object getAdapter(Class p_adapter) {
		if (IPropertySource.class == p_adapter)
			return VTCDPropertySourceFactory.getPropertySource(getModel());
		return super.getAdapter(p_adapter);
	}
//svonborries09082005 begin	
	IFigure getDirectEditFigure() {
		return getFigure();
	}

	String getDirectEditText() {
		IFigure fig = getDirectEditFigure();
		if (fig instanceof Label) {
			return ((Label)fig).getText();
		} else if (fig instanceof TextFlow) {
			return ((TextFlow)fig).getText();
		}
		return ""; //$NON-NLS-1$
	}
	
	protected void performDirectEdit() {
		if(manager == null)
			manager = new VTCDLabelDirectEditManager(this, TextCellEditor.class, 
					new VTCDLabelCellEditorLocator(getDirectEditFigure()));
		manager.show();
		
		
	}
	
	public void performRequest(Request request){
		if (request.getType() == RequestConstants.REQ_DIRECT_EDIT)
			performDirectEdit();
		else
			if (request.getType() == RequestConstants.REQ_OPEN)
				performOpen(request);
		super.performRequest(request);
	}
//svonborries09082005 end


	/**
	 * @param p_request
	 */
	public abstract void performOpen(Request p_request);
	
}
