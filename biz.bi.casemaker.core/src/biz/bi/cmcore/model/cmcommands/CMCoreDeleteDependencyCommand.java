/**
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 D�az und Hilterscheid Unternehmensberatung. All rights reserved. 
 */
package biz.bi.cmcore.model.cmcommands;

import model.Dependency;

import org.eclipse.gef.commands.Command;

import biz.bi.cmcore.model.CMProxyDependency;
import biz.bi.cmcore.model.CMProxyTestObject;

/**
 * @author smoreno
 *
 */
public class CMCoreDeleteDependencyCommand extends Command {
	
	private CMProxyTestObject parent;
	private CMProxyDependency child;
	private Dependency child_model;
	private boolean doCMModel = true;
	
	public void execute()
	{
		parent = child.getProxyTestObject();
		child_model = child.getM_Dependency();
		parent.removeProxyDependency(child,doCMModel);
	}
	public void undo()
	{
		child.setM_Dependency(child_model);
		parent.addProxyDependency(child,doCMModel);
	}
	/**
	 * @return Returns the child.
	 */
	public CMProxyDependency getChild() {
		return this.child;
	}
	/**
	 * @param p_child The child to set.
	 */
	public void setChild(CMProxyDependency p_child) {
		this.child = p_child;
	}
	/**
	 * @return Returns the parent.
	 */
	public CMProxyTestObject getParent() {
		return this.parent;
	}
	/**
	 * @param p_parent The parent to set.
	 */
	public void setParent(CMProxyTestObject p_parent) {
		this.parent = p_parent;
	}
	public boolean isDoCMModel() {
		return this.doCMModel;
	}
	public void setDoCMModel(boolean p_doCMModel) {
		this.doCMModel = p_doCMModel;
	}
	

}
