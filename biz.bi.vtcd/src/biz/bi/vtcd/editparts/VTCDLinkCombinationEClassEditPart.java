package biz.bi.vtcd.editparts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import org.eclipse.swt.graphics.Color;

import biz.bi.cmcore.model.CMProxyCombination;
import biz.bi.cmcore.model.commands.CMProxyCommandFactory;
import biz.bi.vtcd.model.VTCDLinkCombinationEClass;
import biz.bi.vtcd.model.VTCDPackage;
import biz.bi.vtcd.model.commands.VTCDCommandFactory;
import biz.bi.vtcd.provider.VTCDGraphicConstants;

public class VTCDLinkCombinationEClassEditPart extends
		VTCDBaseLinkEditPart {

	VTCDLinkCombinationEClassEditPart(Object model)
	{
		this.setModel(model);
	}
	protected IFigure createFigure()
	{
		PolylineConnection connection =
			(PolylineConnection) super.createFigure();
		connection.setSourceDecoration(new PolylineDecoration());
		
		Object objectCombination =  getModel();
		VTCDLinkCombinationEClass figureCombination = (VTCDLinkCombinationEClass) objectCombination;
		return connection;
	}
	protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new ComponentEditPolicy()
				{
			protected Command createDeleteCommand(GroupRequest deleteRequest)
				{
					CompoundCommand cc = new CompoundCommand();
					VTCDLinkCombinationEClass link = (VTCDLinkCombinationEClass)getHost().getModel();
					cc.add(CMProxyCommandFactory.INSTANCE.createRemoveReferenceCommand(link.getSourceCombination().getM_Combination(),link.getDestEquivalenceClass().getM_EquivalenceClass()));
					cc.add(VTCDCommandFactory.INSTANCE.createDeleteFigureCommand(link));
					return cc;
				}
			});
	}
	protected void handlePropertyChanged(Notification msg) {
		if(msg.getNotifier() instanceof CMProxyCombination)
		{
			refreshVisuals();
			return;
		}
		switch (msg.getFeatureID(EClass.class)) 
		{
		case VTCDPackage.VTCD_ABSTRACT_LINK__BEND_POINTS:
			this.refreshVisuals();
			return;
		}
		
	}
//	svonborries 22082005 begin	
	public void refreshVisuals() {
		
		super.refreshVisuals();
		PolylineConnection connection = (PolylineConnection) getFigure();
		Object objectCombination =  getModel();
		VTCDLinkCombinationEClass figureCombination = (VTCDLinkCombinationEClass) objectCombination;
		if (figureCombination.getSourceCombination()!=null)
		{
		int riskLevel = figureCombination.getSourceCombination().getM_Combination().getRiskLevel(); 
		if( riskLevel>=0 && riskLevel <=10) 
			connection.setForegroundColor((Color)VTCDGraphicConstants.VTCD_RISK_LEVEL_COLORS.get(riskLevel));
		else
			connection.setForegroundColor((Color)VTCDGraphicConstants.VTCD_RISK_LEVEL_COLORS.get(0));
		}
	}
//	svonborries 22082005 end	

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.editparts.VTCDBaseEditPart#activate()
	 */
	public void activate() {
		super.activate();
		if (((VTCDLinkCombinationEClass)getModel()).getSourceCombination()!=null)
		((VTCDLinkCombinationEClass)getModel()).getSourceCombination().getM_Combination().eAdapters().add(modelListener);
	}

	public void deactivate() {
		if (((VTCDLinkCombinationEClass)getModel()).getSourceCombination()!=null)
			((VTCDLinkCombinationEClass)getModel()).getSourceCombination().getM_Combination().eAdapters().remove(modelListener);
		super.deactivate();
	}
}
