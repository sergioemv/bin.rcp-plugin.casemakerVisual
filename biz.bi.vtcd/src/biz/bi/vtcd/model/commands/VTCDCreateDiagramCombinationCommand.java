/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.model.commands;

import org.eclipse.gef.commands.Command;

import biz.bi.vtcd.model.VTCDDiagramCombination;
import biz.bi.vtcd.model.VTCDFigureDependency;

/**
 * @author smoreno
 * @09-08-2005
 * @smoreno
 */
public class VTCDCreateDiagramCombinationCommand extends Command {

	private VTCDFigureDependency parent;
	private VTCDDiagramCombination child;
	public VTCDDiagramCombination getChild() {
		return this.child;
	}
	public void setChild(VTCDDiagramCombination p_child) {
		parent = p_child.getM_FigureDependency();
		this.child = p_child;
	}
	public VTCDFigureDependency getParent() {
		return this.parent;
	}
	public void setParent(VTCDFigureDependency p_parent) {
		this.parent = p_parent;
	}
	
	public void execute()
	{
		parent.setM_VTCDDiagramCombination(child);
		child.setM_FigureDependency(parent);
	}
	
	public void undo()
	{
		parent.setM_VTCDDiagramCombination(null);
		child.setM_FigureDependency(null);
	}
	
	public boolean canExecute()
	{ return child!=null && parent!=null;}
}
