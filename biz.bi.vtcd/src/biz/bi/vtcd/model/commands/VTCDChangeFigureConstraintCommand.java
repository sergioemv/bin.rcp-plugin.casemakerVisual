package biz.bi.vtcd.model.commands;



import java.util.Iterator;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import biz.bi.vtcd.model.VTCDAbstractFigure;
import biz.bi.vtcd.model.VTCDFigureCombination;
import biz.bi.vtcd.model.VTCDFigureDependency;
import biz.bi.vtcd.model.VTCDFigureElement;
import biz.bi.vtcd.model.VTCDFigureEquivalenceClass;

/**
 * @author smoreno
 * Command that allows the relocation and resizing of figure elements
 */
public class VTCDChangeFigureConstraintCommand extends Command {
	private VTCDAbstractFigure model ; // the related model to modify
	private Rectangle constraint; // the rectangle that is the actual contraint
	private Rectangle oldConstraint; // the rectangle that is the old constraint

	public boolean canExecute()
	{
		if (model!=null)
			if ((model instanceof VTCDFigureDependency))
				
				if ((constraint.height!=oldConstraint.height)||
					(constraint.width!=oldConstraint.width))
					return false;
		return true;
		
	}
	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	public void execute() {
		model.setWidth(constraint.width);
		if (!(model instanceof VTCDFigureElement)
			)
			model.setHeight(constraint.height);
		else
		{
			model.setHeight(-1);
			for (Iterator i = ((VTCDFigureElement)model).getM_VTCDFigureEquivalenceClass().iterator();i.hasNext();)
			{
				//dummy setX that provoques a chidren refreshvisuals
				VTCDFigureEquivalenceClass l_EquiClass=(VTCDFigureEquivalenceClass)i.next();
				l_EquiClass.setX(l_EquiClass.getX()+1);
				l_EquiClass.setX(l_EquiClass.getX()-1);
			}
		}
		model.setX(constraint.x);
		model.setY(constraint.y);
	/*	if ((model instanceof VTCDFigureDependency))
			
		{
			if (model.getHeight()!=model.getWidth())
			{
				model.setHeight(model.getWidth());
				model.setHeight(-1);
			}
		}*/
	
		if ((model instanceof VTCDFigureCombination))
			
		{
			
				model.setHeight(VTCDFigureCombination.HEIGHT_DEFAULT);
				model.setWidth(VTCDFigureCombination.WIDTH_DEFAULT);
		}
	
	}

	
	public void setConstraint(Rectangle rect) {
		constraint = rect;
	}

	public void setModel(Object p_model) {
		model = (VTCDAbstractFigure) p_model;

		Point loc = new Point(model.getX(),model.getY());
	    Dimension size = new Dimension(model.getWidth(), model.getHeight());
	    oldConstraint = new Rectangle(loc, size);
	    
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	public void undo() {
		model.setWidth(oldConstraint.width);
		if (!(model instanceof VTCDFigureElement))
			model.setHeight(constraint.height);
		else
		{
			for (Iterator i = ((VTCDFigureElement)model).getM_VTCDFigureEquivalenceClass().iterator();i.hasNext();)
			{
				//dummy setX that provoques a chidren refreshvisuals
				VTCDFigureEquivalenceClass l_EquiClass=(VTCDFigureEquivalenceClass)i.next();
				l_EquiClass.setX(l_EquiClass.getX()+1);
				l_EquiClass.setX(l_EquiClass.getX()-1);
			}
		}
		
		model.setX(oldConstraint.x);
		model.setY(oldConstraint.y);
	}

}
