/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.editpolicies;



import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import biz.bi.cmcore.model.commands.CMProxyCommandFactory;
import biz.bi.cmcore.policies.CMProxyPolicyFactory;
import biz.bi.vtcd.model.VTCDDiagramCombination;
import biz.bi.vtcd.model.VTCDFigureCombination;
import biz.bi.vtcd.policies.VTCDPolicyFactory;

/**
 * @author Sergio M
 * @02-ago-2005
 * @Sergio M
 */
public class VTCDFigureCombinationComponentEditPolicy extends
		ComponentEditPolicy {

	protected Command createDeleteCommand(GroupRequest deleteRequest) {
		CompoundCommand cc = new CompoundCommand();
		//validate all the links of the Combination
		cc.add(CMProxyCommandFactory.INSTANCE.createDeleteProxyCombinationCommand(((VTCDFigureCombination)getHost().getModel()).getM_Combination()));
		//cc.add(VTCDPolicyFactory.INSTANCE.createDeleteFigureAndLinksPolicy((VTCDAbstractFigure)getHost().getModel()));
		cc.add(CMProxyPolicyFactory.INSTANCE.createReloadProxyDependencyPolicy(((VTCDDiagramCombination)getHost().getParent().getModel()).getM_FigureDependency().getM_Dependency()));
		cc.add(VTCDPolicyFactory.INSTANCE.createReloadDiagramMainPolicy(((VTCDDiagramCombination)getHost().getParent().getModel()).getM_FigureDependency().getM_VTCDDiagramMain()));
		return cc;
	}

}
