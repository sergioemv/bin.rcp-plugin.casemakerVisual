package biz.bi.vtcd.model.commands;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import biz.bi.vtcd.model.VTCDDiagramMain;
import biz.bi.vtcd.model.VTCDFigureDependency;
;




public class VTCDCreateDependencyCommand extends Command {
	
	private VTCDFigureDependency child;
	private VTCDDiagramMain parent;//could be a main diagram or a combination diagram
	private Rectangle constraint = new Rectangle (0,0,-1,-1);
	
	
	public void execute() {
				
			 parent.getM_VTCDFigureDependency().add(child);
			 child.setM_VTCDDiagramMain(parent);
			 child.setWidth(constraint.width);
			 child.setHeight(constraint.height);
			 child.setX(constraint.x);
			 child.setY(constraint.y);
			
		
	}

	public boolean canExecute()
	{
		return (parent!=null) && (child!=null) ;
	}
	public void undo() {
	

			parent.getM_VTCDFigureDependency().remove(child);
			child.setM_VTCDDiagramCombination(null);
			child.setM_VTCDDiagramMain(null);
	}

	public void setChild(VTCDFigureDependency child) {
		this.child = child;
		
	}

	

	public void setParent(VTCDDiagramMain parent) {
		this.parent = parent;
	}

	public VTCDFigureDependency getChild() {
		return this.child;
	}

	public VTCDDiagramMain getParent() {
		return this.parent;
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

}
