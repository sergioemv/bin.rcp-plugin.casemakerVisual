/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.model.commands;

import org.eclipse.gef.commands.Command;

import biz.bi.vtcd.model.VTCDFigureCombination;
import biz.bi.vtcd.model.VTCDFigureEquivalenceClass;
import biz.bi.vtcd.model.VTCDLinkCombinationEClass;

/**
 * @author smoreno
 * @03-ago-2005
 * @smoreno
 */
public class VTCDDeleteLinkCombinationEClassCommand extends Command {

private VTCDLinkCombinationEClass connection;
private VTCDFigureCombination source;
private VTCDFigureEquivalenceClass target;

/**
* @return Returns the connection.
*/
public VTCDLinkCombinationEClass getConnection() {
	return this.connection;
}

/**
* @param p_connection The connection to set.
*/
public void setConnection(VTCDLinkCombinationEClass p_connection) {
	this.connection = p_connection;
	this.source = p_connection.getSourceCombination();
	this.target = p_connection.getDestEquivalenceClass();
}

public void execute()
{
	    //remove the reference in the model
	 	source.getM_VTCDLinkCombinationEClass().remove(connection);
		target.getM_VTCDLinkCombinationEClass().remove(connection);
		
	
}

public void undo()
{
	target.getM_VTCDLinkCombinationEClass().add(connection);
	source.getM_VTCDLinkCombinationEClass().add(connection);
}

public boolean canExecute()
{
	return connection!=null;
}
}
