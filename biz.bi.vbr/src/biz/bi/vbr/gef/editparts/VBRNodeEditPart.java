package biz.bi.vbr.gef.editparts;

import java.util.List;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartListener;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.NodeListener;
import org.eclipse.gef.Request;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;


public abstract class VBRNodeEditPart extends VBRBaseEditPart implements NodeEditPart{

	public ConnectionAnchor getSourceConnectionAnchor(ConnectionEditPart connection) {
		// TODO Auto-generated method stub
		return new ChopboxAnchor(this.getFigure());
	}

	public ConnectionAnchor getTargetConnectionAnchor(ConnectionEditPart connection) {
		// TODO Auto-generated method stub
		return new ChopboxAnchor(this.getFigure());
	}

	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
		// TODO Auto-generated method stub
		return new ChopboxAnchor(this.getFigure());
	}

	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
		// TODO Auto-generated method stub
		return new ChopboxAnchor(this.getFigure());
	}

	protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, createDirectEditPolicy());
}
	protected abstract DirectEditPolicy createDirectEditPolicy();
	
	public void addNodeListener(NodeListener listener) {
		// TODO Auto-generated method stub
		
	}

	public IFigure getFigure() {
		// TODO Auto-generated method stub
		return null;
	}

	public List getSourceConnections() {
		// TODO Auto-generated method stub
		return null;
	}

	public List getTargetConnections() {
		// TODO Auto-generated method stub
		return null;
	}

	public IFigure getContentPane() {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeNodeListener(NodeListener listener) {
		// TODO Auto-generated method stub
		
	}

	public void setLayoutConstraint(EditPart child, IFigure figure, Object constraint) {
		// TODO Auto-generated method stub
		
	}

	public void activate() {
		// TODO Auto-generated method stub
		
	}

	public void addEditPartListener(EditPartListener listener) {
		// TODO Auto-generated method stub
		
	}

	public void addNotify() {
		// TODO Auto-generated method stub
		
	}

	public void deactivate() {
		// TODO Auto-generated method stub
		
	}

	public void eraseSourceFeedback(Request request) {
		// TODO Auto-generated method stub
		
	}

	public void eraseTargetFeedback(Request request) {
		// TODO Auto-generated method stub
		
	}

	public List getChildren() {
		// TODO Auto-generated method stub
		return null;
	}

	public Command getCommand(Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	public DragTracker getDragTracker(Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	public EditPolicy getEditPolicy(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getModel() {
		// TODO Auto-generated method stub
		return null;
	}

	public EditPart getParent() {
		// TODO Auto-generated method stub
		return null;
	}

	public RootEditPart getRoot() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getSelected() {
		// TODO Auto-generated method stub
		return 0;
	}

	public EditPart getTargetEditPart(Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	public EditPartViewer getViewer() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean hasFocus() {
		// TODO Auto-generated method stub
		return false;
	}

	public void installEditPolicy(Object role, EditPolicy editPolicy) {
		// TODO Auto-generated method stub
		
	}

	public boolean isActive() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isSelectable() {
		// TODO Auto-generated method stub
		return false;
	}

	public void performRequest(Request request) {
		// TODO Auto-generated method stub
		
	}

	public void refresh() {
		// TODO Auto-generated method stub
		
	}

	public void removeEditPartListener(EditPartListener listener) {
		// TODO Auto-generated method stub
		
	}

	public void removeEditPolicy(Object role) {
		// TODO Auto-generated method stub
		
	}

	public void removeNotify() {
		// TODO Auto-generated method stub
		
	}

	public void setFocus(boolean hasFocus) {
		// TODO Auto-generated method stub
		
	}

	public void setModel(Object model) {
		// TODO Auto-generated method stub
		
	}

	public void setParent(EditPart parent) {
		// TODO Auto-generated method stub
		
	}

	public void setSelected(int value) {
		// TODO Auto-generated method stub
		
	}

	public void showSourceFeedback(Request request) {
		// TODO Auto-generated method stub
		
	}

	public void showTargetFeedback(Request request) {
		// TODO Auto-generated method stub
		
	}

	public boolean understandsRequest(Request request) {
		// TODO Auto-generated method stub
		return false;
	}

	public Object getAdapter(Class adapter) {
		// TODO Auto-generated method stub
		return null;
	}

}
