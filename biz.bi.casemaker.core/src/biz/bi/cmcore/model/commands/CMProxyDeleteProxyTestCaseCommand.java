/**
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved. 
 */
package biz.bi.cmcore.model.commands;

import model.TestCase;

import org.eclipse.gef.commands.Command;

import biz.bi.cmcore.model.CMProxyTestCase;
import biz.bi.cmcore.model.CMProxyTestObject;

/**
 * @author smoreno
 *
 */
public class CMProxyDeleteProxyTestCaseCommand extends Command {
	
	private CMProxyTestObject parent;
	private CMProxyTestCase child;
	private TestCase child_model;
	private boolean doCMModel = true;
	
	public void execute()
	{
		parent = child.getProxyTestObject();
		child_model = child.getM_TestCase();
		parent.removeProxyTestCase(child,doCMModel);
	}
	public void undo()
	{
		child.setM_TestCase(child_model);
		parent.addProxyTestCase(child,doCMModel,child_model.getState());
	}
	public CMProxyTestCase getChild() {
		return this.child;
	}
	public void setChild(CMProxyTestCase p_child) {
		this.child = p_child;
	}
	public TestCase getChild_model() {
		return this.child_model;
	}
	public void setChild_model(TestCase p_child_model) {
		this.child_model = p_child_model;
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
