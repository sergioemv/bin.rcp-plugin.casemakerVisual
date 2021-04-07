/**
 * 
 */
package biz.bi.cmcore.model.cmcommands;


import org.eclipse.gef.commands.Command;

import biz.bi.cmcore.model.CMProxyEffect;
import biz.bi.cmcore.model.CMProxyTestObject;


/**
 * @author Sergio M
 *
 */
public class CMCoreAddEffectCommand extends Command{

	private CMProxyTestObject parent;
	private CMProxyEffect child;
	private boolean doCMModel = true;
	
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.command.Command#execute()
	 */
	public void execute() {
		
		
		parent.addProxyEffect(child,doCMModel);
		child.setProxyTestObject(parent);
			
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.command.Command#redo()
	 */
	public void undo()
	{
		
		parent.removeProxyEffect(child,doCMModel);
		child.setProxyTestObject(null);
	}

	/**
	 * @return Returns the child.
	 */
	
	public boolean canExecute()
	{ return (parent != null && child != null);}

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
