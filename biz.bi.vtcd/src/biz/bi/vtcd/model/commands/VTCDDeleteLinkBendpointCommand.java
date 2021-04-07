package biz.bi.vtcd.model.commands;



import org.eclipse.draw2d.Bendpoint;
import org.eclipse.gef.commands.Command;

import biz.bi.vtcd.model.VTCDAbstractLink;

public class VTCDDeleteLinkBendpointCommand extends Command {
	private VTCDAbstractLink connection;
	private Bendpoint oldLocation;
	private int index;

	/* (”ñ Javadoc)
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	public void execute() {
		oldLocation = (Bendpoint) connection.getBendPoints().get(index);
		connection.getBendPoints().remove(index);
	}

	public void setConnectionModel(Object model) {
		connection = (VTCDAbstractLink) model;
	}

	public void setIndex(int i) {
		index = i;
	}

	/* (”ñ Javadoc)
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	public void undo() {
		connection.getBendPoints().add(index, oldLocation);
	}
}
