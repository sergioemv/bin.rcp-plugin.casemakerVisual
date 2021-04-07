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

import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.cmcore.model.commands.CMProxyCommandFactory;
import biz.bi.cmcore.policies.CMProxyPolicyFactory;
import biz.bi.vtcd.model.VTCDDiagramCombination;
import biz.bi.vtcd.model.VTCDDiagramMain;
import biz.bi.vtcd.model.VTCDFigureEquivalenceClass;
import biz.bi.vtcd.model.impl.VTCDDiagramCombinationImpl;
import biz.bi.vtcd.policies.VTCDPolicyFactory;


/**
 * @author Sergio M
 * @02-ago-2005
 * @Sergio M
 */
public class VTCDFigureEquivalenceClassComponentEditPolicy extends
		ComponentEditPolicy {

	protected Command createDeleteCommand(GroupRequest deleteRequest) {
		CompoundCommand cc = new CompoundCommand();
		//search for all equivalence classes with the same model
		
		VTCDFigureEquivalenceClass equivalence = (VTCDFigureEquivalenceClass)getHost().getModel();
		CMProxyEquivalenceClass l_ProxyEquivalenceClass = equivalence.getM_EquivalenceClass();
		VTCDDiagramMain main = null;
		if (getHost().getParent().getParent().getModel() instanceof VTCDDiagramCombinationImpl)
			main = ((VTCDDiagramCombination)getHost().getParent().getParent().getModel()).getM_FigureDependency().getM_VTCDDiagramMain();	
		else
			main = (VTCDDiagramMain)getHost().getParent().getParent().getModel();
		
		cc.add(CMProxyCommandFactory.INSTANCE.createDeleteProxyEquivalenceClassCommand(l_ProxyEquivalenceClass));
		cc.add(CMProxyPolicyFactory.INSTANCE.createReloadProxyTestObjectPolicy(main.getM_TestObject()));
		cc.add(VTCDPolicyFactory.INSTANCE.createReloadDiagramMainPolicy(main));
			
		return cc;
	

  }
}
