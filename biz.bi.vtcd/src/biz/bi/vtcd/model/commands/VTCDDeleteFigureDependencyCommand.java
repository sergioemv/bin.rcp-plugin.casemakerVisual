/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.model.commands;

import org.eclipse.gef.commands.Command;

import biz.bi.vtcd.model.VTCDDiagramMain;
import biz.bi.vtcd.model.VTCDFigureDependency;

/**
 * @author smoreno
 * @15-08-2005
 * @smoreno
 */
public class VTCDDeleteFigureDependencyCommand extends Command {
	private VTCDDiagramMain parent;
	private VTCDFigureDependency child;
	
	public void execute()
	{
		
		parent.getM_VTCDFigureDependency().remove(child);
	
	}
	public void undo()
	{
		parent.getM_VTCDFigureDependency().add(child);
	}
	public boolean canExecute()
	{ return parent!=null&&child!=null;}
	public VTCDFigureDependency getChild() {
		return this.child;
	}
	public void setChild(VTCDFigureDependency p_child) {
		parent = p_child.getM_VTCDDiagramMain(); 
		this.child = p_child;
	}
}
