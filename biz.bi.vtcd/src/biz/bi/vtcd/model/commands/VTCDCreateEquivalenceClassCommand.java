package biz.bi.vtcd.model.commands;

import org.eclipse.gef.commands.Command;

import biz.bi.vtcd.model.VTCDFigureElement;
import biz.bi.vtcd.model.VTCDFigureEquivalenceClass;
;




public class VTCDCreateEquivalenceClassCommand extends Command {
	
	private VTCDFigureEquivalenceClass child;
	private VTCDFigureElement parent;//could be a main diagram or a combination diagram
	
	
	public void execute() {
			
			 	
			 parent.getM_VTCDFigureEquivalenceClass().add(child);
			 child.setM_VTCDFigureElement(parent);
		  
		
	}

	public boolean canExecute()
	{
		return (parent!=null) && (child!=null) ;
	}
	public void undo() {
	
		parent.getM_VTCDFigureEquivalenceClass().remove(child);	
		child.setM_VTCDFigureElement(null);
	}

	public void setChild(VTCDFigureEquivalenceClass child) {
		this.child = child;
		
	}

	

	public void setParent(VTCDFigureElement parent) {
		this.parent = parent;
	}

	public VTCDFigureEquivalenceClass getChild() {
		return this.child;
	}

	public VTCDFigureElement getParent() {
		return this.parent;
	}


	
	
	
	
	
	
	
	


}
