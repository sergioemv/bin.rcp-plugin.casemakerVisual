/**
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 D�az und Hilterscheid Unternehmensberatung. All rights reserved. 
 */
package biz.bi.cmcore.model.commands;

import org.eclipse.gef.commands.Command;

import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyRiskObject;
import biz.bi.cmcore.model.CMProxyTestCase;
import biz.bi.cmcore.model.CMProxyTestObject;

/**
 * @author smoreno
 *
 */
public class CMProxyAddProxyTestCaseCommand extends Command {
	private CMProxyTestObject parent;
	private CMProxyTestCase child;
	private int creationState = CMProxyRiskObject.STATE_POSITIVE;
	private boolean doCMModel = true;
	
	public void execute() {
		
		
		parent.addProxyTestCase(child,doCMModel,creationState);
		child.setProxyTestObject(parent);
			
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.command.Command#redo()
	 */
	public void undo()
	{
		
		parent.removeProxyTestCase(child,doCMModel);
		child.setProxyTestObject(null);
	}

	/**
	 * @return Returns the child.
	 */
	public CMProxyTestCase getChild() {
		return this.child;
	}

	/**
	 * @param p_child The child to set.
	 */
	public void setChild(CMProxyTestCase p_child) {
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

	public boolean canExecute()
	{ return (parent != null && child != null);}

	public boolean isDoCMModel() {
		return this.doCMModel;
	}

	public void setDoCMModel(boolean p_doCMModel) {
		this.doCMModel = p_doCMModel;
	}

	/**
	 * @return Returns the creationState.
	 */
	public int getCreationState() {
		return this.creationState;
	}

	/**
	 * @param p_creationState The creationState to set.
	 */
	public void setCreationState(int p_creationState) {
		this.creationState = p_creationState;
	}

}
