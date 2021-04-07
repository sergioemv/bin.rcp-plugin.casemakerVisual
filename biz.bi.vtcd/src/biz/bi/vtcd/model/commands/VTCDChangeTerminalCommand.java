/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.model.commands;

import org.eclipse.gef.commands.Command;

import biz.bi.vtcd.model.VTCDAbstractLink;

/**
 * @author smoreno
 * @15-08-2005
 * @smoreno
 */
public class VTCDChangeTerminalCommand extends Command {
	private VTCDAbstractLink link;
	private String oldValue;
	private String newValue;
	private boolean target = true;
	
	public void execute()
	{
		if (target)
		{
			oldValue= link.getTargetTerminal();
			link.setTargetTerminal(newValue);
		}
		else
		{
			oldValue = link.getSourceTerminal();
			link.setSourceTerminal(newValue);
		}
	
	}
	public void undo()
	{
		if (target)
		{
			
			link.setTargetTerminal(oldValue);
		}
		else
		{
			
			link.setSourceTerminal(oldValue);
		}
	}
	public boolean canExecute()
	{
		return (link!=null);
	}
	public VTCDAbstractLink getLink() {
		return this.link;
	}
	public void setLink(VTCDAbstractLink p_link) {
		this.link = p_link;
	}
	public void setNewValue(String p_newValue) {
		this.newValue = p_newValue;
	}
	public String getOldValue() {
		return this.oldValue;
	}
	public boolean isTarget() {
		return this.target;
	}
	public void setTarget(boolean p_target) {
		this.target = p_target;
	}


}
