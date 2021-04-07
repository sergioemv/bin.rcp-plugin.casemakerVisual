package biz.bi.vtcd.model.commands;



import org.eclipse.gef.commands.Command;

import biz.bi.vtcd.model.VTCDFigureDependency;
import biz.bi.vtcd.model.VTCDFigureElement;
import biz.bi.vtcd.model.VTCDLinkDependencyElement;

public class VTCDCreateLinkDependencyElementCommand extends Command {
	private VTCDFigureDependency source; 
	private VTCDFigureElement target;
	private VTCDLinkDependencyElement connection;

	public boolean canExecute() {
	
		if (source == null || target == null)
			return false;
	//if the connection already exists dont create it again
		/*if (source.getM_VTCDLinkDependencyElement(target.getM_Element())!=null)
			{
			  	
			 return false;
			}*/
		return true;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	public void execute() {

		//source.getM_Dependency().addProxyElement(target.getM_Element());
		source.getM_VTCDLinkDependencyElement().add(connection);
		connection.setSourceDependency(source);
		target.getM_VTCDLinkDependencyElement().add(connection);
		connection.setDestElement(target);
		//System.out.println("CREADA CONEXXION ENTRE "+source.getM_Dependency().getName()+" y "+target.getM_Element().getName());
	}

	public void setConnection(VTCDLinkDependencyElement model) {
		connection =  model;
	}
	public void setSource(VTCDFigureDependency model) {
		source = model;
		
	}

	public void setTarget(VTCDFigureElement model) {
		target =  model;
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	public void undo() {
		//source.getM_Dependency().removeProxyElement(target.getM_Element());
		source.getM_VTCDLinkDependencyElement().remove(connection);
		connection.setSourceDependency(null);
		target.getM_VTCDLinkDependencyElement().remove(connection);
		connection.setDestElement(null);
		
	}
}
