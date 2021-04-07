package biz.bi.vtcd.model.commands;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import biz.bi.vtcd.model.VTCDDiagram;
import biz.bi.vtcd.model.VTCDDiagramCombination;
import biz.bi.vtcd.model.VTCDDiagramMain;
import biz.bi.vtcd.model.VTCDFigureElement;
;




public class VTCDCreateElementCommand extends Command {
	
	private VTCDFigureElement child;
	private VTCDDiagram parent;
	private Rectangle constraint = new Rectangle(VTCDFigureElement.HEIGHT_DEFAULT,VTCDFigureElement.WIDTH_DEFAULT,-1,-1); 
	private boolean folded = true;
	
	public void execute() {
		 	
			 parent.getM_VTCDFigureElement().add(child);
			 child.setHeight(constraint.height);
			 child.setWidth(constraint.width);
			 child.setX(constraint.x);
			 child.setY(constraint.y);
			 child.setFolded(folded);
			 if (parent instanceof VTCDDiagramMain)
				 child.setM_VTCDDiagramMain(((VTCDDiagramMain)parent));
		
			 if (parent instanceof VTCDDiagramCombination)
				 child.setM_VTCDDiagramCombination((VTCDDiagramCombination)parent);
//			 System.out.println("CREADA FIGURA ELEMENT"+child+" DEL DIAGRAMA "+parent);
	}

	public boolean canExecute()
	{
		return (parent!=null) && (child!=null) ;
	}
	public void undo() {
		
			parent.getM_VTCDFigureElement().remove(child);			
	}

	public void setChild(VTCDFigureElement child) {
		this.child = child;
		
	}

	

	public void setParent(VTCDDiagram parent) {
		this.parent = parent;
	}

	/**
	 * @return Returns the constraint.
	 */
	public Rectangle getConstraint() {
		return this.constraint;
	}

	/**
	 * @param p_constraint The constraint to set.
	 */
	public void setConstraint(Rectangle p_constraint) {
		this.constraint = p_constraint;
	}

	/**
	 * @return Returns the child.
	 */
	public VTCDFigureElement getChild() {
		return this.child;
	}

	/**
	 * @return Returns the parent.
	 */
	public VTCDDiagram getParent() {
		return this.parent;
	}

	/**
	 * @param p_folded The folded to set.
	 */
	public void setFolded(boolean p_folded) {
		this.folded = p_folded;
	}

}
