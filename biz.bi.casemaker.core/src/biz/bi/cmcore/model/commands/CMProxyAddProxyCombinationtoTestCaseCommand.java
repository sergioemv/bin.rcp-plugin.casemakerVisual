/**
 * 
 */
package biz.bi.cmcore.model.commands;


import org.eclipse.gef.commands.Command;

import biz.bi.cmcore.model.CMProxyCombination;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.cmcore.model.CMProxyTestCase;


/**
 * @author Sergio M
 *
 */
public class CMProxyAddProxyCombinationtoTestCaseCommand extends Command{

	private CMProxyTestCase parent;
	private CMProxyCombination child;
	private boolean doCMModel = true;
	
	/**
	 * 
	 */
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.command.Command#execute()
	 */
	public void execute() {
		
		parent.addProxyCombination(child,doCMModel);
			
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.command.Command#redo()
	 */
	public void undo()
	{
	
		parent.removeProxyCombination(child,doCMModel);

	}

	/**
	 * @return Returns the child.
	 */
	public CMProxyCombination getChild() {
		return this.child;
	}

	/**
	 * @param p_child The child to set.
	 */
	public void setChild(CMProxyCombination p_child) {
		this.child = p_child;
	}

	/**
	 * @return Returns the parent.
	 */
	public CMProxyTestCase getParent() {
		return this.parent;
	}

	/**
	 * @param p_parent The parent to set.
	 */
	public void setParent(CMProxyTestCase p_parent) {
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
