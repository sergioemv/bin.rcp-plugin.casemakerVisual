/**
 * 
 */
package biz.bi.cmcore.model.commands;


import org.eclipse.gef.commands.Command;

import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyTestObject;


/**
 * @author Sergio M
 *
 */
public class CMProxyAddProxyElementCommand extends Command{

	private CMProxyTestObject parent;
	private CMProxyElement child;
	private boolean doCMModel = true;
	
	/**
	 * 
	 */
	public CMProxyAddProxyElementCommand() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.command.Command#execute()
	 */
	public void execute() {
		
		
		parent.addProxyElement(child,doCMModel);
		child.setProxyTestObject(parent);
			
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.command.Command#redo()
	 */
	public void undo()
	{
		
		parent.removeProxyElement(child,doCMModel);
		child.setProxyTestObject(null);
	}

	/**
	 * @return Returns the child.
	 */
	public CMProxyElement getChild() {
		return this.child;
	}

	/**
	 * @param p_child The child to set.
	 */
	public void setChild(CMProxyElement p_child) {
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
}
