/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.gef.outline;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import biz.bi.cmcore.model.CMProxyTestObject;
import biz.bi.cmcore.model.impl.CMProxyTestObjectImpl;
import biz.bi.vtcd.model.VTCDPackage;

/**
 * @author hcanedo
 * @18-08-2005
 * @hcanedo
 */
public class VTCDTestObjectTreeEditPart extends VTCDBaseTreeEditPart {

	/**
	 * @param p_model
	 */
	public VTCDTestObjectTreeEditPart(Object p_model) {
		super(p_model);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#getModelChildren()
	 */
	protected List getModelChildren() {
		EList list = new BasicEList();
		CMProxyTestObject testObject =(CMProxyTestObject)getModel();
		list.addAll(testObject.getProxyElement());
		list.addAll(testObject.getProxyDependency());
		list.addAll(testObject.getProxyEffect());
		return list;
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.gef.outline.VTCDBaseTreeEditPart#handlePropertyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	protected void handlePropertyChanged(Notification p_msg) {
		if(p_msg.getNotifier() instanceof CMProxyTestObjectImpl){
			refreshChildren();
			return;
		}
		switch (p_msg.getFeatureID(EClass.class)) 
		{
		case VTCDPackage.VTCD_DIAGRAM_MAIN__MVTCD_FIGURE_ELEMENT:
			refreshChildren();
			return;
		case VTCDPackage.VTCD_DIAGRAM_MAIN__MVTCD_FIGURE_DEPENDENCY:
			refreshChildren();
			return;
		
		}
			
	}

}
