/**
 * 
 */
package biz.bi.cmcore.model.cmcommands;



import org.eclipse.gef.commands.Command;

import biz.bi.cmcore.model.CMProxyCombination;
import biz.bi.cmcore.model.CMProxyDependency;


/**
 * @author Sergio M
 *
 */
public class CMCoreAddCombinationCommand extends Command{

	private CMProxyDependency parent;
	private CMProxyCombination child;
	private boolean doCMModel = true;
	
	/**
	 * 
	 */
	public CMCoreAddCombinationCommand() {
		super();
		// TODO Auto-generated constructor stub
	}

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
	public CMProxyDependency getParent() {
		return this.parent;
	}

	/**
	 * @param p_parent The parent to set.
	 */
	public void setParent(CMProxyDependency p_parent) {
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
