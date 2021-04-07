/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.gef.outline;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.swt.graphics.Image;

import biz.bi.cmcore.model.CMProxyDependency;
import biz.bi.cmcore.model.impl.CMProxyDependencyImpl;
import biz.bi.vtcd.provider.VTCDImages;

/**
 * @author hcanedo
 * @18-08-2005
 * @hcanedo
 */
public class VTCDDependencyTreeEditPart extends VTCDBaseTreeEditPart {

	/**
	 * @param p_model
	 */
	public VTCDDependencyTreeEditPart(Object p_model) {
		super(p_model);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#getModelChildren()
	 */
	protected List getModelChildren() {
		return ((CMProxyDependency)getModel()).getProxyCombination();
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.gef.outline.VTCDBaseTreeEditPart#handlePropertyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	protected void handlePropertyChanged(Notification p_msg) {
		if(p_msg.getNotifier() instanceof CMProxyDependencyImpl){
			refreshChildren();
			return;
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractTreeEditPart#getImage()
	 */
	protected Image getImage() {
		return VTCDImages.getImage(VTCDImages.DEPENDENCY);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractTreeEditPart#getText()
	 */
	protected String getText() {
		return getCMProxyDependecy().toString();
	}
	public CMProxyDependency getCMProxyDependecy(){
		return (CMProxyDependency)getModel();
	}

}
