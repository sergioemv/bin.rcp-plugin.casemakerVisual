package biz.bi.vtcd.model.commands;



import org.eclipse.draw2d.AbsoluteBendpoint;
import org.eclipse.draw2d.Bendpoint;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

import biz.bi.vtcd.model.VTCDAbstractLink;

public class VTCDMoveLinkBendpointCommand extends Command {
	private VTCDAbstractLink connection;
	private Bendpoint oldLocation, newLocation;
	private int index;

	/* (”ñ Javadoc)
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	public void execute() {
		oldLocation = (Bendpoint) connection.getBendPoints().get(index);
		connection.getBendPoints().set(index, newLocation);
	}

	public void setConnectionModel(Object model) {
		connection = (VTCDAbstractLink) model;
	}

	public void setIndex(int i) {
		index = i;
	}

	public void setNewLocation(Point point) {
		newLocation = new AbsoluteBendpoint(point);
	}

	/* (”ñ Javadoc)
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	public void undo() {
		connection.getBendPoints().set(index, oldLocation);
	}

}
