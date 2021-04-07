/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.model.commands;

import org.eclipse.gef.commands.Command;

import biz.bi.vtcd.model.VTCDFigureElement;
import biz.bi.vtcd.model.VTCDFigureEquivalenceClass;

/**
 * @author smoreno
 * @04-08-2005
 * @smoreno
 */
public class VTCDDeleteEquivalenceClassCommand extends Command {

	VTCDFigureEquivalenceClass child;
	VTCDFigureElement parent;
	public VTCDFigureEquivalenceClass getChild() {
		return this.child;
	}
	public void setChild(VTCDFigureEquivalenceClass p_child) {
		this.child = p_child;
		this.parent = p_child.getM_VTCDFigureElement();
	}
	public boolean canExecute()
	{ return this.child!=null;}
	
	public void execute()
	{
	//	if (parent.getM_Element().getProxyEquivalenceClass().contains(child.getM_EquivalenceClass()))
	//		parent.getM_Element().removeEquivalenceClass(child.getM_EquivalenceClass());
		parent.getM_VTCDFigureEquivalenceClass().remove(child);
	}
	public void undo()
	{
	//	if(!parent.getM_Element().getProxyEquivalenceClass().contains(child.getM_EquivalenceClass()))
	//		parent.getM_Element().addEquivalenceClass(child.getM_EquivalenceClass());
		parent.getM_VTCDFigureEquivalenceClass().add(child);
		
	}
	
}
