/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.model.commands;

import org.eclipse.gef.commands.Command;

import biz.bi.vtcd.model.VTCDDiagram;
import biz.bi.vtcd.policies.VTCDAutomaticLayoutPolicy;

/**
 * @author smoreno
 * @08-08-2005
 * @smoreno
 */
public class VTCDCreateAutomaticLayoutCommand extends Command {
	
	private VTCDDiagram diagram;
	private VTCDAutomaticLayoutPolicy layout;
	public void execute()
	{
		layout = new VTCDAutomaticLayoutPolicy(diagram);
		layout.getCCommand().execute();
	}
	public void undo()
	{ 
		layout.getCCommand().undo();
	}
	public boolean canExecute()
	{ return diagram != null;}
	public VTCDDiagram getDiagram() {
		return this.diagram;
	}

	public void setDiagram(VTCDDiagram p_diagram) {
		this.diagram = p_diagram;
	}
	

}
