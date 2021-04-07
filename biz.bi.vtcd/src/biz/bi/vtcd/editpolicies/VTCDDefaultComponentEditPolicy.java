/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.editpolicies;



import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import biz.bi.vtcd.model.commands.VTCDCommandFactory;

/**
 * @author Sergio M
 * @02-ago-2005
 * @Sergio M
 */
public class VTCDDefaultComponentEditPolicy extends
		ComponentEditPolicy {

	protected Command createDeleteCommand(GroupRequest deleteRequest) {
	   
		return  VTCDCommandFactory.INSTANCE.createDeleteFigureCommand(getHost().getModel());
	}

}
