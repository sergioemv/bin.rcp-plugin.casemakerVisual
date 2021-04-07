/**
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved. 
 */
package biz.bi.cmcore.model.cmcommands;

import model.Combination;
import model.Dependency;

import org.eclipse.gef.commands.Command;

import biz.bi.cmcore.CMCorePlugin;

/**
 * @author smoreno
 *
 */
public class CMCoreDeleteCombinationCommand extends Command {
	
	private Dependency parent;
	private Combination child;
	
	
	
	
	public void execute()
	{
		CMCorePlugin.INSTANCE.getM_SessionManager().getCombinationManager()
		.deleteCombination(child,parent);
		parent.getLnkCombinations().remove(child);
//p_combination.setM_Combination(null);
//		parent = child.getProxyDependency();
//		child_model = child.getM_Combination();
//		relatedProxyEquivalenceClasses = (BasicEList)child.getProxyEquivalenceClass();
//		relatedProxyEffects = (BasicEList)child.getProxyEffect();
//		parent.removeProxyCombination(child,doCMModel);
		
		
	}
	public void undo()
	{
		
//		child.setM_Combination(child_model);
//		child.getProxyEquivalenceClass().addAll(relatedProxyEquivalenceClasses);
//		child.getProxyEffect().addAll(relatedProxyEffects);
//		parent.addProxyCombination(child,doCMModel);
		
	}
	public Combination getChild() {
		return this.child;
	}
	public void setChild(Combination p_child) {
		this.child = p_child;
	}
	public Dependency getParent() {
		return this.parent;
	}
	public void setParent(Dependency p_parent) {
		this.parent = p_parent;
	}

}
