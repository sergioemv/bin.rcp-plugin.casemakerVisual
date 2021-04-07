/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.model.commands;

import org.eclipse.gef.commands.Command;

import biz.bi.vtcd.model.VTCDDiagram;
import biz.bi.vtcd.model.VTCDFigureElement;

/**
 * @author smoreno
 * @15-08-2005
 * @smoreno
 */
public class VTCDDeleteFigureElementCommand extends Command {
	private VTCDDiagram parent;
	private VTCDFigureElement child;
	public VTCDFigureElement getChild() {
		return this.child;
	}
	public void setChild(VTCDFigureElement p_child) {
		if (p_child.getM_VTCDDiagramMain()==null)
			parent = p_child.getM_VTCDDiagramCombination();
		else
			parent = p_child.getM_VTCDDiagramMain(); 
		this.child = p_child;
	}
	public VTCDDiagram getParent() {
		return this.parent;
	}
	public void setParent(VTCDDiagram p_parent) {
		this.parent = p_parent;
	}
	public void execute()
	{
		 
		parent.getM_VTCDFigureElement().remove(child);
		//System.out.println("BORRADA FIGURE "+child );
	
	}
	public void undo()
	{
		parent.getM_VTCDFigureElement().add(child);
	}
	public boolean canExecute()
	{ return parent!=null&&child!=null;}
}
