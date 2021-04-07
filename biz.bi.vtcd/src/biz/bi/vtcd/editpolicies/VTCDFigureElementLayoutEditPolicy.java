package biz.bi.vtcd.editpolicies;




import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;

import biz.bi.cmcore.model.CMCoreFactory;
import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.cmcore.model.commands.CMProxyCommandFactory;
import biz.bi.vtcd.model.VTCDDiagramCombination;
import biz.bi.vtcd.model.VTCDDiagramMain;
import biz.bi.vtcd.model.VTCDFigureElement;
import biz.bi.vtcd.model.VTCDFigureEquivalenceClass;
import biz.bi.vtcd.policies.VTCDPolicyFactory;


/**
 * @author smoreno
 * Layout policy for the vtcd main diagram
 *
 */
public class VTCDFigureElementLayoutEditPolicy extends LayoutEditPolicy {

	
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


	protected Command getCreateCommand(CreateRequest request) {
		CompoundCommand cc = new CompoundCommand();
		if (request.getNewObject() instanceof VTCDFigureEquivalenceClass)
		{	
			CMProxyElement l_element = ((VTCDFigureElement)getHost().getModel()).getM_Element();
			CMProxyEquivalenceClass l_ProxyEquivalence = CMCoreFactory.eINSTANCE.createCMProxyEquivalenceClass();	
			cc.add(CMProxyCommandFactory.INSTANCE.createAddNewProxyObjectCommand(l_element,l_ProxyEquivalence));
			VTCDDiagramMain main;
			if (getHost().getParent().getModel() instanceof VTCDDiagramMain)
				main = (VTCDDiagramMain)getHost().getParent().getModel();
			else	
				main = ((VTCDDiagramCombination)getHost().getParent().getModel()).getM_FigureDependency().getM_VTCDDiagramMain();
			
			cc.add(VTCDPolicyFactory.INSTANCE.createReloadDiagramMainPolicy(main));
			
			
		return cc;
		}
		
		return UnexecutableCommand.INSTANCE;
	}

	protected Command getDeleteDependantCommand(Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editpolicies.ConstrainedLayoutEditPolicy#createChangeConstraintCommand(org.eclipse.gef.EditPart, java.lang.Object)
	 */
	
	protected EditPolicy createChildEditPolicy(EditPart child) {
		// TODO Auto-generated method stub
		return null;
	}

	protected Command getMoveChildrenCommand(Request request) {
		// TODO Auto-generated method stub
		return null;
	}
}
