/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.gef.outline;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.swt.graphics.Image;

import biz.bi.cmcore.model.CMProxyEffect;
import biz.bi.vtcd.provider.VTCDImages;

/**
 * @author hcanedo
 * @18-08-2005
 * @hcanedo
 */
public class VTCDEffectTreeEditPart extends VTCDBaseTreeEditPart {

	/**
	 * @param p_model
	 */
	public VTCDEffectTreeEditPart(Object p_model) {
		super(p_model);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.gef.outline.VTCDBaseTreeEditPart#handlePropertyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	protected void handlePropertyChanged(Notification p_msg) {
		// TODO Auto-generated method stub
		//System.out.println(p_msg.getFeatureID(EClass.class));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractTreeEditPart#getImage()
	 */
	protected Image getImage() {
		return VTCDImages.getImage(VTCDImages.CAUSE_EFFECT_ICON);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractTreeEditPart#getText()
	 */
	protected String getText() {
		return getCMProxyEffect().toString();
	}
	public CMProxyEffect getCMProxyEffect(){
		return (CMProxyEffect)getModel();
	}

}
