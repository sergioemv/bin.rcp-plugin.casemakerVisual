package biz.bi.vtcd.editparts;


import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.ui.views.properties.IPropertySource;

import biz.bi.vtcd.editpolicies.VTCDLinkBendpointEditPolicy;
import biz.bi.vtcd.editpolicies.VTCDLinkConnectionEditPolicy;
import biz.bi.vtcd.editpolicies.VTCDLinkConnectionEndpointEditPolicy;
import biz.bi.vtcd.model.VTCDAbstractLink;
import biz.bi.vtcd.model.properties.VTCDPropertySourceFactory;

public abstract class VTCDBaseLinkEditPart extends AbstractConnectionEditPart {
	protected Adapter modelListener = new AdapterImpl() {
		public void notifyChanged(Notification msg) {
			handlePropertyChanged(msg);
		}
	};
//this method should be implemented by all edit parts
//refresh their properties
protected abstract void handlePropertyChanged(Notification msg);
// the default line is a line with bendpoints
protected IFigure createFigure() {
	PolylineConnection connection = new PolylineConnection();
	connection.setConnectionRouter(new BendpointConnectionRouter());
	return connection;
}
protected void createEditPolicies() {
	
	installEditPolicy(
			EditPolicy.CONNECTION_BENDPOINTS_ROLE,
			new VTCDLinkBendpointEditPolicy());
	installEditPolicy(EditPolicy.CONNECTION_ROLE,
			new VTCDLinkConnectionEditPolicy()
			);
	
	installEditPolicy(
			EditPolicy.CONNECTION_ENDPOINTS_ROLE,
			new VTCDLinkConnectionEndpointEditPolicy());
	
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

	
	protected void refreshVisuals()
	{
		getConnectionFigure().setRoutingConstraint(((VTCDAbstractLink)getModel()).getBendPoints());
	}
	public Object getAdapter(Class p_adapter) {
		if (IPropertySource.class == p_adapter)
			return VTCDPropertySourceFactory.getPropertySource(getModel());
		return super.getAdapter(p_adapter);
	}
	
}
