package biz.bi.vtcd.editpolicies;


import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.BendpointEditPolicy;
import org.eclipse.gef.requests.BendpointRequest;

import biz.bi.vtcd.model.commands.VTCDCreateLinkBendpointCommand;
import biz.bi.vtcd.model.commands.VTCDDeleteLinkBendpointCommand;
import biz.bi.vtcd.model.commands.VTCDMoveLinkBendpointCommand;

public class VTCDLinkBendpointEditPolicy extends BendpointEditPolicy {

	/* (”ñ Javadoc)
	 * @see org.eclipse.gef.editpolicies.BendpointEditPolicy#getCreateBendpointCommand(org.eclipse.gef.requests.BendpointRequest)
	 */
	protected Command getCreateBendpointCommand(BendpointRequest request) {
		
		Point point = request.getLocation();
		getConnection().translateToRelative(point);

		VTCDCreateLinkBendpointCommand command = new VTCDCreateLinkBendpointCommand();
		command.setLocation(point);
		command.setConnection(getHost().getModel());
		command.setIndex(request.getIndex());
		return command;
		
	}

	/* (”ñ Javadoc)
	 * @see org.eclipse.gef.editpolicies.BendpointEditPolicy#getDeleteBendpointCommand(org.eclipse.gef.requests.BendpointRequest)
	 */
	protected Command getDeleteBendpointCommand(BendpointRequest request) {
		VTCDDeleteLinkBendpointCommand command = new VTCDDeleteLinkBendpointCommand();
		command.setConnectionModel(getHost().getModel());
		command.setIndex(request.getIndex());
		return command;		
	}

	/* (”ñ Javadoc)
	 * @see org.eclipse.gef.editpolicies.BendpointEditPolicy#getMoveBendpointCommand(org.eclipse.gef.requests.BendpointRequest)
	 */
	protected Command getMoveBendpointCommand(BendpointRequest request) {
		Point location = request.getLocation();
		getConnection().translateToRelative(location);

		VTCDMoveLinkBendpointCommand command = new VTCDMoveLinkBendpointCommand();
		command.setConnectionModel(getHost().getModel());
		command.setIndex(request.getIndex());
		command.setNewLocation(location);

		return command;
		
	}

}
