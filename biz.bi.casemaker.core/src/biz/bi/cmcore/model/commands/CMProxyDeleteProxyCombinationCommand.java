/**
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved. 
 */
package biz.bi.cmcore.model.commands;

import java.util.Vector;

import model.Combination;

import org.eclipse.gef.commands.Command;

import biz.bi.cmcore.model.CMProxyCombination;
import biz.bi.cmcore.model.CMProxyDependency;
import biz.bi.cmcore.model.CMProxyEffect;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;

/**
 * @author smoreno
 *
 */
public class CMProxyDeleteProxyCombinationCommand extends Command {
	
	private CMProxyDependency parent;
	private CMProxyCombination child;
	private Combination child_model;
	private Vector relatedProxyEquivalenceClasses = new Vector();
	private Vector relatedProxyEffects = new Vector();
	private boolean doCMModel = true;
	
	public CMProxyCombination getChild() {
		return this.child;
	}
	public void setChild(CMProxyCombination p_child) {
		this.child = p_child;
	}
	public CMProxyDependency getParent() {
		return this.parent;
	}
	public void setParent(CMProxyDependency p_parent) {
		this.parent = p_parent;
	}
	
	public void execute()
	{
		parent = child.getProxyDependency();
		child_model = child.getM_Combination();
		relatedProxyEquivalenceClasses.addAll(child.getProxyEquivalenceClass());
		relatedProxyEffects.addAll(child.getProxyEffect());
		parent.removeProxyCombination(child,doCMModel);
		child.getProxyEquivalenceClass().removeAll(relatedProxyEquivalenceClasses);
		child.getProxyEffect().removeAll(relatedProxyEffects);
//		for(Iterator i = relatedProxyEffects.iterator();i.hasNext();)
//			child.removeProxyEffect((CMProxyEffect)i.next(),false);
//		for(Iterator j = relatedProxyEquivalenceClasses.iterator();j.hasNext();)
//			child.removeProxyEquivalenceClass((CMProxyEquivalenceClass)j.next(),false);
	}
	public void undo()
	{
		child.setM_Combination(child_model);
		for(int i = relatedProxyEffects.size();i>0;i--)
		{
			child.addProxyEffect((CMProxyEffect)relatedProxyEffects.get(i-1),doCMModel);
		}
		for(int j = relatedProxyEquivalenceClasses.size();j>0;j--)
			child.addProxyEquivalenceClass((CMProxyEquivalenceClass)relatedProxyEquivalenceClasses.get(j-1),doCMModel);
		parent.addProxyCombination(child,doCMModel);
		
	}
	public boolean isDoCMModel() {
		return this.doCMModel;
	}
	public void setDoCMModel(boolean p_doCMModel) {
		this.doCMModel = p_doCMModel;
	}

}
