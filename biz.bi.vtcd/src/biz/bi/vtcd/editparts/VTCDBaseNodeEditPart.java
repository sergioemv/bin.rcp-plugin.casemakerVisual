package biz.bi.vtcd.editparts;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.DirectEditPolicy;

/**
 * @author smoreno
 * Base class for all edit parts that are nodes in the diagram 
 * the model's observer list
 */
public abstract class VTCDBaseNodeEditPart extends VTCDBaseEditPart
implements NodeEditPart{

	public ConnectionAnchor getSourceConnectionAnchor(ConnectionEditPart connection) {
		//add personalized figures for the anchors
		
		return new ChopboxAnchor(this.getFigure());
	}

	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
	
		return new ChopboxAnchor(this.getFigure());
	}

	public ConnectionAnchor getTargetConnectionAnchor(ConnectionEditPart connection) {
		// add personalized figures for the anchors
		return new ChopboxAnchor(this.getFigure());
		
	}

	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
		// add personalized figures for the anchors
		return new ChopboxAnchor(this.getFigure());
	}
	protected abstract DirectEditPolicy createDirectEditPolicy();
	protected void createEditPolicies() {
		super.createEditPolicies();
	
		// By default, can't add anything to a node
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, createDirectEditPolicy());
}
	
	
	
	
	
	
}