/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.gef.outline;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.swt.graphics.Image;

import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.vtcd.provider.VTCDImages;

/**
 * @author hcanedo
 * @18-08-2005
 * @hcanedo
 */
public class VTCDEquivalenceClassTreeEditPart extends VTCDBaseTreeEditPart {

	/**
	 * @param p_model
	 */
	public VTCDEquivalenceClassTreeEditPart(Object p_model) {
		super(p_model);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractTreeEditPart#getImage()
	 */
	protected Image getImage() {
		return VTCDImages.getImage(VTCDImages.PALETTE_EQUIVALENCECLASS);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractTreeEditPart#getText()
	 */
	protected String getText() {
		return getCMProxyEquivalenceClass().toString();
	}
	
	public CMProxyEquivalenceClass getCMProxyEquivalenceClass(){
		return (CMProxyEquivalenceClass)getModel();
	}
	/* (non-Javadoc)
	 * @see biz.bi.vtcd.gef.outline.VTCDBaseTreeEditPart#handlePropertyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	protected void handlePropertyChanged(Notification p_msg) {
		//System.out.println(p_msg.getFeatureID(EClass.class));

	}

}
