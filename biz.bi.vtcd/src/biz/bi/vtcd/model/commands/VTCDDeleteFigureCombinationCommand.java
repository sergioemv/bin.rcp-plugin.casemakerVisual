/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.model.commands;

import org.eclipse.gef.commands.Command;

import biz.bi.vtcd.model.VTCDDiagramCombination;
import biz.bi.vtcd.model.VTCDFigureCombination;

/**
 * @author Sergio M
 * @02-ago-2005
 * @Sergio M
 */
public class VTCDDeleteFigureCombinationCommand extends Command {

	private VTCDFigureCombination combination;
	private VTCDDiagramCombination diagram;
	/**
	 * 
	 */
	public VTCDDeleteFigureCombinationCommand() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param p_label
	 */
	public VTCDDeleteFigureCombinationCommand(String p_label) {
		super(p_label);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return Returns the combination.
	 */
	public VTCDFigureCombination getCombination() {
		return this.combination;
	}

	/**
	 * @param p_combination The combination to set.
	 */
	public void setCombination(VTCDFigureCombination p_combination) {
		this.combination = p_combination;
		this.diagram = p_combination.getM_VTCDDiagramCombination();
	}

	/**
	 * @return Returns the diagram.
	 */
	public VTCDDiagramCombination getDiagram() {
		return this.diagram;
	}


	public boolean canExecute()
	{ return (this.combination!=null)&&(this.diagram!=null); }
	public void execute() {
		
		
		diagram.getM_VTCDFigureCombination().remove(combination);
		combination.setM_VTCDDiagramCombination(null);
		
	}
	public void undo()
	{
		this.diagram.getM_VTCDFigureCombination().add(combination);
		combination.setM_VTCDDiagramCombination(diagram);
	}
	

}
