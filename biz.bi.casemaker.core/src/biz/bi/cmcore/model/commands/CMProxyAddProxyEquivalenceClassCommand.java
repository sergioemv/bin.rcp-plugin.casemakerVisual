/**
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved. 
 */
package biz.bi.cmcore.model.commands;

import org.eclipse.gef.commands.Command;

import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;

/**
 * @author smoreno
 *
 */
public class CMProxyAddProxyEquivalenceClassCommand extends Command {

	private CMProxyElement parent;
	private CMProxyEquivalenceClass child;
	private boolean doCMModel = true;
	public CMProxyElement getParent() {
		return this.parent;
	}
	public void setParent(CMProxyElement p_parent) {
		this.parent = p_parent;
	}
	public CMProxyEquivalenceClass getChild() {
		return this.child;
	}
	public void setChild(CMProxyEquivalenceClass p_child) {
		this.child = p_child;
	}
	public void execute()
	{
			
		parent.addEquivalenceClass(child,doCMModel);
		child.setProxyElement(parent);
		// if the element is dragged from the outline??
	}
	public void undo()
	{
		parent.removeEquivalenceClass(child,doCMModel);
		child.setProxyElement(null);
	}
	public boolean canExecute()
	{ return this.parent!= null && this.child!=null;}
	public boolean isDoCMModel() {
		return this.doCMModel;
	}
	public void setDoCMModel(boolean p_doCMModel) {
		this.doCMModel = p_doCMModel;
	}
	
}
