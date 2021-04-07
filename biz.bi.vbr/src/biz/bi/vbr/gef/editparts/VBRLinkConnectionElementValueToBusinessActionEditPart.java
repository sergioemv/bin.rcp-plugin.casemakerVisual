/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vbr.gef.editparts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.emf.common.notify.Notification;

/**
 * @author svonborries
 * @since 09-09-2005
 */
public class VBRLinkConnectionElementValueToBusinessActionEditPart extends VBRBaseLinkEditPart{

	/* (non-Javadoc)
	 * @see biz.bi.vbr.gef.editparts.VBRBaseLinkEditPart#handlePropertyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	
	VBRLinkConnectionElementValueToBusinessActionEditPart(Object model){
		this.setModel(model);
	}
	
	protected void handlePropertyChanged(Notification p_msg) {
		// TODO Auto-generated method stub
	}

	protected IFigure createFigure(){
		PolylineConnection l_conn = (PolylineConnection)super.createFigure();
		l_conn.setTargetDecoration(new PolygonDecoration());
		return l_conn;
	}
	
	protected void createEditPolicies(){
		//TODO install policies
	}
	
	
}
