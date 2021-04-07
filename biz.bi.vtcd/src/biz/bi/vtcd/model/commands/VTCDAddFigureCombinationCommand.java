/**
 * 
 */
package biz.bi.vtcd.model.commands;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import biz.bi.vtcd.model.VTCDDiagramCombination;
import biz.bi.vtcd.model.VTCDFigureCombination;

/**
 * @author smoreno
 *
 */
public class VTCDAddFigureCombinationCommand extends Command {
	
	private VTCDDiagramCombination parent;
	private VTCDFigureCombination child;
	private Rectangle constraint;
	/**
	 * @return Returns the child.
	 */
	public VTCDFigureCombination getChild() {
		return this.child;
	}
	/**
	 * @param p_child The child to set.
	 */
	public void setChild(VTCDFigureCombination p_child) {
		this.child = p_child;
	}
	/**
	 * @return Returns the parent.
	 */
	public VTCDDiagramCombination getParent() {
		return this.parent;
	}
	/**
	 * @param p_parent The parent to set.
	 */
	public void setParent(VTCDDiagramCombination p_parent) {
		this.parent = p_parent;
	}
	public boolean canExecute()
	{
		return (parent!=null) && (child!=null) ;
	}
	public void undo() {
		
		parent.getM_VTCDFigureCombination().remove(child);
		child.setM_VTCDDiagramCombination(null);
	}
	public void execute() {	
		 parent.getM_VTCDFigureCombination().add(child);
		 child.setM_VTCDDiagramCombination(parent);
		 child.setHeight(constraint.height);
		 child.setWidth(constraint.width);
		 child.setX(constraint.x);
		 child.setY(constraint.y);
	
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
