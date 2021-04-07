/**
 * 
 */
package biz.bi.cmcore.model.cmcommands;

import org.eclipse.gef.commands.Command;

import biz.bi.cmcore.model.CMProxyCombination;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;

/**
 * @author smoreno
 *
 */
public class CMCoreRemoveEquivalenceFromCombinationCommand extends Command {

	private CMProxyCombination parent;
	private CMProxyEquivalenceClass child;
	private boolean doCMModel = true;
	/**
	 * @return Returns the child.
	 */
	public CMProxyEquivalenceClass getChild() {
		return this.child;
	}
	/**
	 * @param p_child The child to set.
	 */
	public void setChild(CMProxyEquivalenceClass p_child) {
		this.child = p_child;
	}
	public void execute()
	{
		parent.removeProxyEquivalenceClass(child,doCMModel);
	}
	public void undo()
	{
		parent.addProxyEquivalenceClass(child,doCMModel);
	}
	public boolean canExecute()
	{return child!=null;}
	/**
	 * @return Returns the parent.
	 */
	public CMProxyCombination getParent() {
		return this.parent;
	}
	/**
	 * @param p_parent The parent to set.
	 */
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
