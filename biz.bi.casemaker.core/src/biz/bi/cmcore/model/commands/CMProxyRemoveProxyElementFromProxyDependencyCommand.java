/**
 * 
 */
package biz.bi.cmcore.model.commands;

import org.eclipse.gef.commands.Command;

import biz.bi.cmcore.model.CMProxyDependency;
import biz.bi.cmcore.model.CMProxyElement;

/**
 * @author smoreno
 *
 */
public class CMProxyRemoveProxyElementFromProxyDependencyCommand extends Command {

	private  CMProxyDependency parent;
	private CMProxyElement child;
	private boolean doCMModel = true;
	/**
	 * @return Returns the child.
	 */
	public void execute()
	{
		parent.removeProxyElement(child,doCMModel);
		
	}
	public void undo()
	{
		parent.addProxyElement(child,doCMModel);
	}
	public boolean canExecute()
	{return child!=null&&parent!=null;}
	/**
	 * @return Returns the child.
	 */
	public CMProxyElement getChild() {
		return this.child;
	}
	public void setChild(CMProxyElement p_child) {
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
