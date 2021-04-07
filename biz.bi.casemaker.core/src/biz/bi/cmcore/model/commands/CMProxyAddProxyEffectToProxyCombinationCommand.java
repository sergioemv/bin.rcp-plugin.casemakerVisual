/**
 * 
 */
package biz.bi.cmcore.model.commands;


import org.eclipse.gef.commands.Command;

import biz.bi.cmcore.model.CMProxyCombination;
import biz.bi.cmcore.model.CMProxyEffect;


/**
 * @author Sergio M
 *
 */
public class CMProxyAddProxyEffectToProxyCombinationCommand extends Command{

	private CMProxyCombination parent;
	private CMProxyEffect child;
	private boolean doCMModel = true;
	/**
	 * 
	 */
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.command.Command#execute()
	 */
	public void execute() {
		
		parent.addProxyEffect(child,doCMModel);
			
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.command.Command#redo()
	 */
	public void undo()
	{
	
		parent.removeProxyEffect(child,doCMModel);

	}

	
	/**
	 * @return Returns the child.
	 */
	public CMProxyEffect getChild() {
		return this.child;
	}

	/**
	 * @param p_child The child to set.
	 */
	public void setChild(CMProxyEffect p_child) {
		this.child = p_child;
	}

	
	public boolean canExecute()
	{ return (parent != null && child != null);}

	public CMProxyCombination getParent() {
		return this.parent;
	}

	public void setParent(CMProxyCombination p_parent) {
		this.parent = p_parent;
	}

	public boolean isDoCMModel() {
		return this.doCMModel;
	}

	public void setDoCMModel(boolean p_doCMModel) {
		this.doCMModel = p_doCMModel;
	}
}
