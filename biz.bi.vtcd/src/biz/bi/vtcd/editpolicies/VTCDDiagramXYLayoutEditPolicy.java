package biz.bi.vtcd.editpolicies;



import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;

import biz.bi.cmcore.model.CMCoreFactory;
import biz.bi.cmcore.model.CMProxyObject;
import biz.bi.cmcore.model.commands.CMProxyCommandFactory;
import biz.bi.vtcd.model.VTCDAbstractFigure;
import biz.bi.vtcd.model.VTCDCMProxyFigure;
import biz.bi.vtcd.model.VTCDDiagram;
import biz.bi.vtcd.model.VTCDFigureCombination;
import biz.bi.vtcd.model.VTCDFigureDependency;
import biz.bi.vtcd.model.VTCDFigureElement;
import biz.bi.vtcd.model.commands.VTCDChangeFigureConstraintCommand;
import biz.bi.vtcd.model.commands.VTCDCommandFactory;

/**
 * @author smoreno
 * Layout policy for the vtcd main diagram
 *
 */
public class VTCDDiagramXYLayoutEditPolicy extends XYLayoutEditPolicy {

	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.EditPolicy#getCommand(org.eclipse.gef.Request)
	 */
	//this overriden method is to see the type of request on the main diagram
	public Command getCommand (Request request) 
	{//System.out.println (request.getType ());  
	return super.getCommand (request); }
	
	protected Command createAddCommand(EditPart child, Object constraint) {
		// TODO Auto-generated method stub
		return null;
	}

	protected Command createChangeConstraintCommand(EditPart child,
			Object constraint) {
		
		VTCDChangeFigureConstraintCommand command = new VTCDChangeFigureConstraintCommand();
		command.setModel(child.getModel());
		command.setConstraint(checkIntersections(child.getParent().getChildren(),child,(Rectangle)constraint));
		return command;
		}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editpolicies.LayoutEditPolicy#getCreateCommand(org.eclipse.gef.requests.CreateRequest)
	 */
	protected Command getCreateCommand(CreateRequest request) {
		CompoundCommand command = new CompoundCommand();	
		Rectangle constraint = checkIntersections(getHost().getChildren(),null,(Rectangle) getConstraintFor(request));	
		VTCDDiagram parent = (VTCDDiagram)getHost().getModel();
		
		if (request.getNewObject() instanceof VTCDFigureElement)
		{	
			constraint.height = -1;
			if (constraint.width == -1)
				constraint.width = VTCDFigureElement.WIDTH_DEFAULT;
		}
		else
		if (request.getNewObject() instanceof VTCDFigureDependency)
		{		
			constraint.height = VTCDFigureDependency.HEIGHT_DEFAULT;
			constraint.width = VTCDFigureDependency.WIDTH_DEFAULT;
		}
		else
		if (request.getNewObject() instanceof VTCDFigureCombination)
		{
			
			constraint.height = VTCDFigureCombination.HEIGHT_DEFAULT;
			 constraint.width = VTCDFigureCombination.WIDTH_DEFAULT;			
		}	
		else
			return UnexecutableCommand.INSTANCE;
		VTCDCMProxyFigure model = (VTCDCMProxyFigure)request.getNewObject();
		CMProxyObject businessModel = (CMProxyObject)CMCoreFactory.eINSTANCE.create(model.getProxyModel().eClass());
		model.setProxyModel(businessModel);
		command.add(CMProxyCommandFactory.INSTANCE.createAddNewProxyObjectCommand((CMProxyObject)((VTCDCMProxyFigure)parent).getProxyModel(),businessModel));
		command.add(VTCDCommandFactory.INSTANCE.createAddVTCDFigureCommand(parent,(VTCDAbstractFigure)model,constraint));
//		System.out.println(command.canExecute());
		return command;


	}

	protected Command getDeleteDependantCommand(Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	private Rectangle checkIntersections(List eParts,EditPart child,Rectangle constraint)
	{
		for (Iterator i = eParts.iterator();
		i.hasNext();)
		{
			GraphicalEditPart l_EditPart = (GraphicalEditPart) i.next();
			if (!l_EditPart.equals(child))
				if (constraint.intersects(l_EditPart.getFigure().getBounds()))
				{
					Rectangle newConstraint = constraint;
					newConstraint.y = l_EditPart.getFigure().getBounds().y + l_EditPart.getFigure().getBounds().height+10;
					return checkIntersections(eParts,child,newConstraint) ;
				}
		}
		return constraint;
	}
}
