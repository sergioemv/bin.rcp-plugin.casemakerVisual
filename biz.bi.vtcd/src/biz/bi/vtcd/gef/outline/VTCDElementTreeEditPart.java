/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.gef.outline;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.swt.graphics.Image;

import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.impl.CMProxyElementImpl;
import biz.bi.vtcd.model.VTCDPackage;
import biz.bi.vtcd.provider.VTCDImages;

/**
 * @author hcanedo
 * @18-08-2005
 * @hcanedo
 */
public class VTCDElementTreeEditPart extends VTCDBaseTreeEditPart {

	/**
	 * @param p_model
	 */
	public VTCDElementTreeEditPart(Object p_model) {
		super(p_model);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#getModelChildren()
	 */
	protected List getModelChildren() {
		return ((CMProxyElement)getModel()).getProxyEquivalenceClass();
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.gef.outline.VTCDBaseTreeEditPart#handlePropertyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	protected void handlePropertyChanged(Notification p_msg) {
		if(p_msg.getNotifier() instanceof CMProxyElementImpl){
			refreshVisuals();
			refreshChildren();
			return;
		}
		switch (p_msg.getFeatureID(EClass.class)) 
		{
			case VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_FIGURE_EQUIVALENCE_CLASS:
				refreshChildren();
				refreshVisuals();
				return;

		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractTreeEditPart#getImage()
	 */
	protected Image getImage() {
		return VTCDImages.getImage(VTCDImages.PALETTE_ELEMENT);
	}

	public CMProxyElement getCMProxyElement(){
		return (CMProxyElement)getModel();
	}
	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractTreeEditPart#getText()
	 */
	protected String getText() {
		return getCMProxyElement().toString();
	}

}
