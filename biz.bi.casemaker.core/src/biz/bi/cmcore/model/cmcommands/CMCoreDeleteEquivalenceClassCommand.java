/**
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved. 
 */
package biz.bi.cmcore.model.cmcommands;

import model.EquivalenceClass;

import org.eclipse.gef.commands.Command;

import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;

/**
 * @author smoreno
 *
 */
public class CMCoreDeleteEquivalenceClassCommand extends Command {
	
	private CMProxyElement parent;
	private CMProxyEquivalenceClass child;
	private EquivalenceClass child_model;
	private boolean doCMModel = true;
	
	public void execute()
	{
		parent = child.getProxyElement();
		child_model = child.getM_EquivalenceClass();
		parent.removeEquivalenceClass(child,doCMModel);
		child.setProxyElement(null);
	}
	public void undo()
	{
		child.setM_EquivalenceClass(child_model);
		parent.addEquivalenceClass(child,doCMModel);
		child.setProxyElement(parent);
	}
	public CMProxyEquivalenceClass getChild() {
		return this.child;
	}
	public void setChild(CMProxyEquivalenceClass p_child) {
		this.child = p_child;
	}
	public CMProxyElement getParent() {
		return this.parent;
	}
	public void setParent(CMProxyElement p_parent) {
		this.parent = p_parent;
	}
	public boolean isDoCMModel() {
		return this.doCMModel;
	}
	public void setDoCMModel(boolean p_doCMModel) {
		this.doCMModel = p_doCMModel;
	}

}
