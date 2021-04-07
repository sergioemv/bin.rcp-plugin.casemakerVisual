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
 * @15-08-2005
 * @smoreno
 */
public class VTCDSetDiagramCombination extends Command {
	private VTCDFigureDependency parent;
	private VTCDDiagramCombination child,oldChild;

	public VTCDDiagramCombination getChild() {
		return this.child;
	}

	public void setChild(VTCDDiagramCombination p_child) {
		this.child = p_child;
	}

	public VTCDFigureDependency getParent() {
		return this.parent;
	}

	public void setParent(VTCDFigureDependency p_parent) {
		this.parent = p_parent;
	}

	public boolean canExecute() {
		
		return parent!=null&&child!=null;
	}

	public void execute() {
		oldChild = parent.getM_VTCDDiagramCombination();
		parent.setM_VTCDDiagramCombination(child);		
	}

	public void undo() {
		parent.setM_VTCDDiagramCombination(oldChild);
	}

}
