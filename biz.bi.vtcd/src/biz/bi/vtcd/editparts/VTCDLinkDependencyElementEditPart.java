package biz.bi.vtcd.editparts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import biz.bi.cmcore.model.commands.CMProxyCommandFactory;
import biz.bi.cmcore.policies.CMProxyPolicyFactory;
import biz.bi.vtcd.model.VTCDLinkDependencyElement;
import biz.bi.vtcd.model.VTCDPackage;
import biz.bi.vtcd.policies.VTCDPolicyFactory;

public class VTCDLinkDependencyElementEditPart extends
		VTCDBaseLinkEditPart {

	VTCDLinkDependencyElementEditPart(Object model)
	{
		this.setModel(model);
	}
	protected IFigure createFigure()
	{
		PolylineConnection connection =
			(PolylineConnection) super.createFigure();
		connection.setSourceDecoration(new PolygonDecoration());
		return connection;
	}
	protected void createEditPolicies() {
		super.createEditPolicies();
		// TODO Auto-generated method stub
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new ComponentEditPolicy()
				{
			protected Command createDeleteCommand(GroupRequest deleteRequest)
				{
					CompoundCommand cc = new CompoundCommand();
					
					VTCDLinkDependencyElement link = (VTCDLinkDependencyElement)getHost().getModel();
					//System.out.println(link.getSourceDependency().getM_VTCDLinkDependencyElement().size());
					
					if (link.getSourceDependency().getM_VTCDLinkDependencyElement().size()>2)
					{
						cc.add(CMProxyCommandFactory.INSTANCE.createRemoveProxyElementFromProxyDependency(link.getSourceDependency().getM_Dependency(),link.getDestElement().getM_Element()));
						cc.add(CMProxyPolicyFactory.INSTANCE.createReloadProxyTestObjectPolicy(link.getSourceDependency().getM_VTCDDiagramMain().getM_TestObject()));
						cc.add(VTCDPolicyFactory.INSTANCE.createReloadDiagramMainPolicy(link.getSourceDependency().getM_VTCDDiagramMain()));
						//	cc.add(VTCDCommandFactory.INSTANCE.createDeleteFigureCommand(link));
						return cc;
					}
					else
						return UnexecutableCommand.INSTANCE;
				}
			});

	}
	protected void handlePropertyChanged(Notification msg) {
		switch (msg.getFeatureID(EClass.class)) 
		{
		case VTCDPackage.VTCD_ABSTRACT_LINK__BEND_POINTS:
			refreshVisuals();
			return;
		}
		
	}

}
