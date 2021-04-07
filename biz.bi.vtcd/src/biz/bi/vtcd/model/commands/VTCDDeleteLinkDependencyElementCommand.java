/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.model.commands;

import org.eclipse.gef.commands.Command;

import biz.bi.vtcd.model.VTCDFigureDependency;
import biz.bi.vtcd.model.VTCDFigureElement;
import biz.bi.vtcd.model.VTCDLinkDependencyElement;

/**
 * @author smoreno
 * @03-ago-2005
 * @smoreno
 */
public class VTCDDeleteLinkDependencyElementCommand extends Command {
	 private VTCDLinkDependencyElement connection;
	 private VTCDFigureDependency source;
	 private VTCDFigureElement target;

	/**
	 * @return Returns the connection.
	 */

	public void execute()
	{
		    //remove the reference in the model
		    source = connection.getSourceDependency();
		    target = connection.getDestElement();
		 	source.getM_VTCDLinkDependencyElement().remove(connection);
			target.getM_VTCDLinkDependencyElement().remove(connection);
			
		
	}

	public void undo()
	{
		target.getM_VTCDLinkDependencyElement().add(connection);
		source.getM_VTCDLinkDependencyElement().add(connection);
	}

	public boolean canExecute()
	{
		return connection!=null;
	}

	public VTCDLinkDependencyElement getConnection() {
		return this.connection;
	}

	public void setConnection(VTCDLinkDependencyElement p_connection) {
		this.connection = p_connection;
	}

	public VTCDFigureDependency getSource() {
		return this.source;
	}

	public void setSource(VTCDFigureDependency p_source) {
		this.source = p_source;
	}

	public VTCDFigureElement getTarget() {
		return this.target;
	}

	public void setTarget(VTCDFigureElement p_target) {
		this.target = p_target;
	}

}
