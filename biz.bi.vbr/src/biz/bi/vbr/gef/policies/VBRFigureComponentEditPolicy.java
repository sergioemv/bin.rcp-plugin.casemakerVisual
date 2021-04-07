/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vbr.gef.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import biz.bi.vbr.vbrvm.MainDiagram;

/**
 * @author hcanedo
 * @since 16-09-2005
 */
public class VBRFigureComponentEditPolicy extends ComponentEditPolicy {

	/**
	 * 
	 * @author hcanedo
	 * @since 16-09-2005
	 */
	public VBRFigureComponentEditPolicy() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	protected Command createDeleteCommand(GroupRequest deleteRequest) {
	//	CompoundCommand cc = new CompoundCommand();
		if(getHost().getParent().getModel() instanceof MainDiagram){
			
		}
		return UnexecutableCommand.INSTANCE;
	}

}
