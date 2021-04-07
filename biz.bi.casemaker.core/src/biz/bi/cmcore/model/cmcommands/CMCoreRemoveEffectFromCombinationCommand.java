/**
 * 
 */
package biz.bi.cmcore.model.cmcommands;

import org.eclipse.gef.commands.Command;

import biz.bi.cmcore.model.CMProxyCombination;
import biz.bi.cmcore.model.CMProxyEffect;

/**
 * @author smoreno
 *
 */
public class CMCoreRemoveEffectFromCombinationCommand extends Command {

	private  CMProxyCombination parent;
	private CMProxyEffect child;
	private boolean doCMModel = true;
	/**
	 * @return Returns the child.
	 */
	public void execute()
	{
		parent.removeProxyEffect(child,doCMModel);
	}
	public void undo()
	{
		parent.addProxyEffect(child,doCMModel);
	}
	public boolean canExecute()
	{return child!=null;}
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
