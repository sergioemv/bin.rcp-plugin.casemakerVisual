/**
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved. 
 */
package biz.bi.cmcore.model.cmcommands;

import model.Effect;

import org.eclipse.gef.commands.Command;

import biz.bi.cmcore.model.CMProxyEffect;
import biz.bi.cmcore.model.CMProxyTestObject;

/**
 * @author smoreno
 *
 */
public class CMCoreDeleteEffectCommand extends Command {
	
	private CMProxyTestObject parent;
	private CMProxyEffect child;
	private Effect child_model;
	private boolean doCMModel = true;
	
	public void execute()
	{
		parent = child.getProxyTestObject();
		child_model = child.getM_Effect();
		parent.removeProxyEffect(child,doCMModel);
	}
	public void undo()
	{
		child.setM_Effect(child_model);
		parent.addProxyEffect(child,doCMModel);
	}
	public CMProxyEffect getChild() {
		return this.child;
	}
	public void setChild(CMProxyEffect p_child) {
		this.child = p_child;
	}
	public Effect getChild_model() {
		return this.child_model;
	}
	public void setChild_model(Effect p_child_model) {
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
