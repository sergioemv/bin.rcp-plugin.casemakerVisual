package biz.bi.vtcd.model.commands;



import org.eclipse.draw2d.AbsoluteBendpoint;
import org.eclipse.draw2d.Bendpoint;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

import biz.bi.vtcd.model.VTCDAbstractLink;

public class VTCDCreateLinkBendpointCommand extends Command {
	private VTCDAbstractLink connection;
	private Bendpoint location; 
	private int index;
	/* (”ñ Javadoc)
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	public void execute() {
		connection.getBendPoints().add(index,location);
	}

	public void setConnection(Object model) {
		connection = (VTCDAbstractLink) model;
	}

	public void setLocation(Point point) {
		location = new AbsoluteBendpoint(point);
	}

	public void setIndex(int index)
	{
		this.index = index;
	}
	/* (”ñ Javadoc)
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	public void undo() {
		connection.getBendPoints().remove(index);
	}
}

