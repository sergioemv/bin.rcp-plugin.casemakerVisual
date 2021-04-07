package biz.bi.vtcd.model.commands;



import org.eclipse.gef.commands.Command;

import biz.bi.vtcd.model.VTCDAbstractFigure;
import biz.bi.vtcd.model.VTCDAbstractLink;
import biz.bi.vtcd.model.VTCDFigureCombination;
import biz.bi.vtcd.model.VTCDFigureDependency;
import biz.bi.vtcd.model.VTCDFigureElement;
import biz.bi.vtcd.model.VTCDFigureEquivalenceClass;
import biz.bi.vtcd.model.VTCDLinkCombinationEClass;
import biz.bi.vtcd.model.VTCDLinkDependencyElement;

public class VTCDCreateLinkCommand extends Command {
	private VTCDAbstractFigure source; 
	private VTCDAbstractFigure target;
	private VTCDAbstractLink connection;

	public boolean canExecute() {
	
		if (source == null || target == null || connection ==null )
			return false;
	//if the connection already exists dont create it again
		if (connection instanceof VTCDLinkDependencyElement) 
		if (((VTCDFigureDependency)source).getM_VTCDLinkDependencyElement(((VTCDFigureElement)target).getM_Element())!=null)	
			 return false;
	
		if (connection instanceof VTCDLinkCombinationEClass)
			if (((VTCDFigureCombination)source).getM_VTCDLinkCombinationEClass(((VTCDFigureEquivalenceClass)target).getM_EquivalenceClass())!=null)
				return false;	
		
		return true;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	public void execute() {

		//ource.getM_Dependency().addProxyElement(target.getM_Element());
		source.getLinks().add(connection);
		target.getLinks().add(connection);
	}

	public void setConnection(VTCDAbstractLink model) {
		connection =  model;
	}
	public void setSource(VTCDAbstractFigure model) {
		source = model;
		
	}

	public void setTarget(VTCDAbstractFigure model) {
		target =  model;
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	public void undo() {
		//source.getM_Dependency().removeProxyElement(target.getM_Element());
		source.getLinks().remove(connection);	
		target.getLinks().remove(connection);
		
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

	public VTCDAbstractLink getConnection() {
		return this.connection;
	}

	public VTCDAbstractFigure getSource() {
		return this.source;
	}

	public VTCDAbstractFigure getTarget() {
		return this.target;
	}
}
