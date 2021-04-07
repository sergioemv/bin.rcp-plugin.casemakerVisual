/**
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved. 
 */
package biz.bi.cmcore.model.commands;

import model.Element;

import org.eclipse.gef.commands.Command;

import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyTestObject;

/**
 * @author smoreno
 *
 */
public class CMProxyDeleteProxyElementCommand extends Command {
	
	private CMProxyTestObject parent;
	private CMProxyElement child;
	private Element child_model;
	private boolean doCMModel = true;
	
	public void execute()
	{
		parent = child.getProxyTestObject();
		child_model = child.getM_Element();
		parent.removeProxyElement(child,doCMModel);
	}
	public void undo()
	{
		child.setM_Element(child_model);
		parent.addProxyElement(child,doCMModel);
	}
	public CMProxyElement getChild() {
		return this.child;
	}
	public void setChild(CMProxyElement p_child) {
		this.child = p_child;
	}
	public CMProxyTestObject getParent() {
		return this.parent;
	}
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
