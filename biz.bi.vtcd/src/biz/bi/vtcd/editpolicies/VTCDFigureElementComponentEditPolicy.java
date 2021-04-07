/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.editpolicies;



import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import biz.bi.cmcore.model.commands.CMProxyCommandFactory;
import biz.bi.cmcore.policies.CMProxyPolicyFactory;
import biz.bi.vtcd.model.VTCDDiagramMain;
import biz.bi.vtcd.model.VTCDFigureElement;
import biz.bi.vtcd.policies.VTCDPolicyFactory;


/**
 * @author Sergio M
 * @02-ago-2005
 * @Sergio M
 */
public class VTCDFigureElementComponentEditPolicy extends
		ComponentEditPolicy {

	protected Command createDeleteCommand(GroupRequest deleteRequest) {
		CompoundCommand cc = new CompoundCommand();

		if (getHost().getParent().getModel() instanceof VTCDDiagramMain)
		{
			cc.add(CMProxyCommandFactory.INSTANCE.createDeleteProxyElementCommand(((VTCDFigureElement)getHost().getModel()).getM_Element()));
			cc.add(CMProxyPolicyFactory.INSTANCE.createReloadProxyTestObjectPolicy(((VTCDDiagramMain)getHost().getParent().getModel()).getM_TestObject()));
			cc.add(VTCDPolicyFactory.INSTANCE.createReloadDiagramMainPolicy(((VTCDDiagramMain)getHost().getParent().getModel())));
			return cc;
		}
		else return UnexecutableCommand.INSTANCE;
	}

}
