package biz.bi.vtcd.model.commands;



import org.eclipse.gef.commands.Command;

import biz.bi.vtcd.model.VTCDFigureCombination;
import biz.bi.vtcd.model.VTCDFigureEquivalenceClass;
import biz.bi.vtcd.model.VTCDLinkCombinationEClass;

public class VTCDCreateLinkCombinationEClassCommand extends Command {
	private VTCDFigureCombination source; 
	private VTCDFigureEquivalenceClass target;
	private VTCDLinkCombinationEClass connection;

	public boolean canExecute() {
	
		if ((source == null || target == null))
		{
			return false;
		}
		if (connection == null)
				return false;
	//if the connection already exists dont create it again
		if (source.getM_VTCDLinkCombinationEClass(target.getM_EquivalenceClass())!=null)
			{
			  	
			 return false;
			}
		
	//if a conection between the combination and any equivalence from the same element
/*	if (target.getM_VTCDFigureElement() != null)
		for (Iterator i  = target.getM_VTCDFigureElement().getM_Element().getProxyEquivalenceClass().iterator();i.hasNext();)
		{
			if (source.getM_VTCDLinkCombinationEClass((CMProxyEquivalenceClass)i.next())!=null)
			{
				return false;
			}
		} */
		return true;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	public void execute() {

		source.getM_VTCDLinkCombinationEClass().add(connection);
		//add the connection in the model
		//source.getM_Combination().addProxyEquivalenceClass(target.getM_EquivalenceClass());
		target.getM_VTCDLinkCombinationEClass().add(connection);
	}

	public void setConnection(VTCDLinkCombinationEClass model) {
		connection =  model;
	}
	public void setSource(VTCDFigureCombination model) {
		source = model;
		
	}

	public void setTarget(VTCDFigureEquivalenceClass model) {
		target =  model;
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	public void undo() {
		
		source.getM_VTCDLinkCombinationEClass().remove(connection);	
		//source.getM_Combination().removeProxyEquivalenceClass(target.getM_EquivalenceClass());
		target.getM_VTCDLinkCombinationEClass().remove(connection);
		
	}

	/**
	 * @return Returns the targetTerminal.
	 */
	public String getTargetTerminal() {
		return this.connection.getTargetTerminal();
	}

	/**
	 * @param p_targetTerminal The targetTerminal to set.
	 */
	public void setTargetTerminal(String p_targetTerminal) {
		this.connection.setTargetTerminal( p_targetTerminal);
	}
}
