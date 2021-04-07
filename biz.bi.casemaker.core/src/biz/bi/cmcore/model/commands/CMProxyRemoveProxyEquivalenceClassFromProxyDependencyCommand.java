/**
 * 
 */
package biz.bi.cmcore.model.commands;

import org.eclipse.gef.commands.Command;

import biz.bi.cmcore.model.CMProxyDependency;
import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;

/**
 * @author smoreno
 *
 */
public class CMProxyRemoveProxyEquivalenceClassFromProxyDependencyCommand extends Command {

	private  CMProxyDependency parent;
	private CMProxyEquivalenceClass child;
	private boolean doCMModel = true;
	/**
	 * @return Returns the child.
	 */
	public void execute()
	{
		parent.removeProxyEquivalenceClass(child,doCMModel);
		
	}
	public void undo()
	{
		parent.addProxyEquivalenceClass(child,doCMModel);
	}
	public boolean canExecute()
	{return child!=null&&parent!=null;}
	/**
	 * @return Returns the child.
	 */
	public CMProxyEquivalenceClass getChild() {
		return this.child;
	}
	public void setChild(CMProxyEquivalenceClass p_child) {
		this.child = p_child;
	}
	public CMProxyDependency getParent() {
		return this.parent;
	}
	public void setParent(CMProxyDependency p_parent) {
		this.parent = p_parent;
	}
	public boolean isDoCMModel() {
		return this.doCMModel;
	}
	public void setDoCMModel(boolean p_doCMModel) {
		this.doCMModel = p_doCMModel;
	}
	
	}
