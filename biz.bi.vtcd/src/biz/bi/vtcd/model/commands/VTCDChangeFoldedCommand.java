/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.model.commands;

import org.eclipse.gef.commands.Command;

import biz.bi.vtcd.model.VTCDFigureElement;

/**
 * @author smoreno
 * @15-08-2005
 * @smoreno
 */
public class VTCDChangeFoldedCommand extends Command {
	private VTCDFigureElement element;
	private boolean oldValue;
	private boolean newValue;
	public VTCDFigureElement getElement() {
		return this.element;
	}
	public void setElement(VTCDFigureElement p_element) {
		this.element = p_element;
	}
	public boolean isNewValue() {
		return this.newValue;
	}
	public void setNewValue(boolean p_newValue) {
		this.newValue = p_newValue;
	}
	public boolean isOldValue() {
		return this.oldValue;
	}
	public void setOldValue(boolean p_oldValue) {
		this.oldValue = p_oldValue;
	}
	
	public void execute()
	{
		oldValue = element.isFolded();
		element.setFolded(newValue);
	}
	public void undo()
	{
		element.setFolded(oldValue);
	}
	public boolean canExecute()
	{
		return (element!=null);
	}

}
