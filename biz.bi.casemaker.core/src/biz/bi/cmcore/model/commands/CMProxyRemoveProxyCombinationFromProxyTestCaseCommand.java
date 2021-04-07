/**
 * 
 */
package biz.bi.cmcore.model.commands;

import org.eclipse.gef.commands.Command;

import biz.bi.cmcore.model.CMProxyCombination;
import biz.bi.cmcore.model.CMProxyDependency;
import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.cmcore.model.CMProxyTestCase;

/**
 * @author smoreno
 *
 */
public class CMProxyRemoveProxyCombinationFromProxyTestCaseCommand extends Command {

	private  CMProxyTestCase parent;
	private CMProxyCombination child;
	private boolean doCMModel = true;
	/**
	 * @return Returns the child.
	 */
	public void execute()
	{
		parent.removeProxyCombination(child,doCMModel);
		
	}
	public void undo()
	{
		parent.addProxyCombination(child,doCMModel);
	}
	public boolean canExecute()
	{return child!=null&&parent!=null;}
	/**
	 * @return Returns the child.
	 */
	public CMProxyCombination getChild() {
		return this.child;
	}
	public void setChild(CMProxyCombination p_child) {
		this.child = p_child;
	}
	public CMProxyTestCase getParent() {
		return this.parent;
	}
	public void setParent(CMProxyTestCase p_parent) {
		this.parent = p_parent;
	}
	public boolean isDoCMModel() {
		return this.doCMModel;
	}
	public void setDoCMModel(boolean p_doCMModel) {
		this.doCMModel = p_doCMModel;
	}
	
	}
