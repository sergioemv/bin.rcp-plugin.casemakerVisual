package biz.bi.vtcd.editpolicies;



import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;

import biz.bi.cmcore.model.CMProxyObject;
import biz.bi.cmcore.model.commands.CMProxyCommandFactory;
import biz.bi.vtcd.editparts.VTCDFigureCombinationEditPart;
import biz.bi.vtcd.editparts.VTCDFigureDependencyEditPart;
import biz.bi.vtcd.editparts.VTCDFigureElementEditPart;
import biz.bi.vtcd.editparts.VTCDFigureEquivalenceClassEditPart;
import biz.bi.vtcd.figures.VTCDNodeFigure;
import biz.bi.vtcd.model.VTCDAbstractFigure;
import biz.bi.vtcd.model.VTCDAbstractLink;
import biz.bi.vtcd.model.VTCDCMProxyFigure;
import biz.bi.vtcd.model.VTCDFigureDependency;
import biz.bi.vtcd.model.VTCDFigureElement;
import biz.bi.vtcd.model.VTCDFigureEquivalenceClass;
import biz.bi.vtcd.model.commands.VTCDCommandFactory;
import biz.bi.vtcd.model.commands.VTCDCreateLinkCommand;
import biz.bi.vtcd.policies.VTCDPolicyFactory;

public class VTCDFigureGraphicalNodeEditPolicy extends GraphicalNodeEditPolicy {
	CompoundCommand cc = new CompoundCommand();
	/* (non-Javadoc)
	 * @see org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy#getConnectionCompleteCommand(org.eclipse.gef.requests.CreateConnectionRequest)
	 */
	protected Command getConnectionCompleteCommand(CreateConnectionRequest request) {
		
		
		cc.getCommands().clear();
		VTCDCreateLinkCommand linkcommand =(VTCDCreateLinkCommand) request.getStartCommand();
		
		if (((getHost().getModel() instanceof VTCDFigureElement))||	
			(getHost().getModel() instanceof VTCDFigureEquivalenceClass))
		{	
			
		 	linkcommand.setTarget((VTCDAbstractFigure)getHost().getModel());
		 	cc.add(CMProxyCommandFactory.INSTANCE.createAddExistentProxyObjectCommand(
		 			(CMProxyObject)((VTCDCMProxyFigure)linkcommand.getSource()).getProxyModel(),
		 			(CMProxyObject)((VTCDCMProxyFigure)linkcommand.getTarget()).getProxyModel()));
		 	 cc.add(linkcommand);	
		}
		
		if ((getHost() instanceof VTCDFigureElementEditPart) &&
			(linkcommand.getSource() instanceof VTCDFigureDependency))
			cc.add(VTCDPolicyFactory.INSTANCE.createAddFigureElementtoDiagramPolicy(
					((VTCDFigureDependency)linkcommand.getSource()).getM_VTCDDiagramCombination(),
					((VTCDFigureElement)getHost().getModel()).getM_Element()));
		
		
		if (getHost() instanceof VTCDFigureEquivalenceClassEditPart)
		{	
		    VTCDFigureEquivalenceClassEditPart ecEditPart =((VTCDFigureEquivalenceClassEditPart)getHost());  
		    ConnectionAnchor ca = ecEditPart.getSourceConnectionAnchor(request);
		 	String terminal = ((VTCDNodeFigure)ecEditPart.getFigure()).getConnectionAnchorName(ca);
		 	linkcommand.setTargetTerminal(terminal);
		}
		 return cc;
		}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy#getConnectionCreateCommand(org.eclipse.gef.requests.CreateConnectionRequest)
	 */
	protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
		
		Command command = null;
		if ((request.getTargetEditPart() instanceof VTCDFigureDependencyEditPart)||
		(request.getTargetEditPart() instanceof VTCDFigureCombinationEditPart))
		{
		        command = VTCDCommandFactory.INSTANCE.createLinkCommand((VTCDAbstractFigure)getHost().getModel(),
				null,(VTCDAbstractLink)request.getNewObject());
          		request.setStartCommand(command);
		}
		return command;

	}

	/* (”ñ Javadoc)
	 * @see org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy#getReconnectTargetCommand(org.eclipse.gef.requests.ReconnectRequest)
	 */
	protected Command getReconnectTargetCommand(ReconnectRequest request) {
		return null;
	}

	/* (”ñ Javadoc)
	 * @see org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy#getReconnectSourceCommand(org.eclipse.gef.requests.ReconnectRequest)
	 */
	protected Command getReconnectSourceCommand(ReconnectRequest request) {
		return null;
	}
	
	
}
