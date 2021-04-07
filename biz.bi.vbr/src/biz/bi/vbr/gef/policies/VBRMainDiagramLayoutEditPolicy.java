/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vbr.gef.policies;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;

import biz.bi.vbr.vbrvm.AbstractView;
import biz.bi.vbr.vbrvm.MainDiagram;
import biz.bi.vbr.vbrvm.commands.VBRVMCommandFactory;

/**
 * @author hcanedo
 * @since 12-09-2005
 */
public class VBRMainDiagramLayoutEditPolicy extends XYLayoutEditPolicy {

	/**
	 * 
	 * @author hcanedo
	 * @since 12-09-2005
	 */
	public VBRMainDiagramLayoutEditPolicy() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editpolicies.LayoutEditPolicy#createChildEditPolicy(org.eclipse.gef.EditPart)
	 */
	protected EditPolicy createChildEditPolicy(EditPart p_child) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editpolicies.LayoutEditPolicy#getCreateCommand(org.eclipse.gef.requests.CreateRequest)
	 */
	protected Command getCreateCommand(CreateRequest p_request) {
		Point l_Loc =p_request.getLocation();
		CompoundCommand command = new CompoundCommand();
		MainDiagram l_Parent=(MainDiagram)getHost().getModel();
		AbstractView visualmodel=(AbstractView)p_request.getNewObject();
		command.add(VBRVMCommandFactory.INSTANCE.createAddVBRVMFigureCommand(l_Parent,visualmodel,l_Loc));
		return command;
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editpolicies.LayoutEditPolicy#getDeleteDependantCommand(org.eclipse.gef.Request)
	 */
	protected Command getDeleteDependantCommand(Request p_request) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editpolicies.LayoutEditPolicy#getMoveChildrenCommand(org.eclipse.gef.Request)
	 */
	protected Command getMoveChildrenCommand(Request p_request) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editpolicies.ConstrainedLayoutEditPolicy#createAddCommand(org.eclipse.gef.EditPart, java.lang.Object)
	 */
	protected Command createAddCommand(EditPart p_child, Object p_constraint) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editpolicies.ConstrainedLayoutEditPolicy#createChangeConstraintCommand(org.eclipse.gef.EditPart, java.lang.Object)
	 */
	protected Command createChangeConstraintCommand(EditPart p_child, Object p_constraint) {
		// TODO Auto-generated method stub
		return null;
	}

}
