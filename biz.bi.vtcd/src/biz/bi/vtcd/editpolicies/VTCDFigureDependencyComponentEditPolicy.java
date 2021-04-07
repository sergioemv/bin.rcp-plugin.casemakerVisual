/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.editpolicies;



import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import biz.bi.cmcore.model.CMProxyCombination;
import biz.bi.cmcore.model.commands.CMProxyCommandFactory;
import biz.bi.cmcore.policies.CMProxyPolicyFactory;
import biz.bi.vtcd.model.VTCDDiagramMain;
import biz.bi.vtcd.model.VTCDFigureDependency;
import biz.bi.vtcd.policies.VTCDPolicyFactory;


/**
 * @author Sergio M
 * @02-ago-2005
 * @Sergio M
 */
public class VTCDFigureDependencyComponentEditPolicy extends
		ComponentEditPolicy {

	protected Command createDeleteCommand(GroupRequest deleteRequest) {
		CompoundCommand cc = new CompoundCommand();
		//validate all the links of the Combination
		Collection combinations = new Vector(); 
		combinations.addAll(((VTCDFigureDependency)getHost().getModel()).getM_Dependency().getProxyCombination());
		for (Iterator i = combinations.iterator();i.hasNext();)
			cc.add(CMProxyCommandFactory.INSTANCE.createDeleteProxyCombinationCommand((CMProxyCombination)i.next()));
		cc.add(CMProxyCommandFactory.INSTANCE.createDeleteProxyDependencyCommand(((VTCDFigureDependency)getHost().getModel()).getM_Dependency()));
		//cc.add(VTCDPolicyFactory.INSTANCE.createDeleteFigureAndLinksPolicy((VTCDAbstractFigure)getHost().getModel()));
		cc.add(CMProxyPolicyFactory.INSTANCE.createReloadProxyTestObjectPolicy(((VTCDDiagramMain)getHost().getParent().getModel()).getM_TestObject()));
		cc.add(VTCDPolicyFactory.INSTANCE.createReloadDiagramMainPolicy(((VTCDDiagramMain)getHost().getParent().getModel())));
		return cc;
	}

}
