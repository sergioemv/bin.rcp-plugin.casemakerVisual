/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.gef.outline;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.editparts.AbstractTreeEditPart;

/**
 * @author hcanedo
 * @18-08-2005
 * @hcanedo
 */
public abstract class VTCDBaseTreeEditPart extends AbstractTreeEditPart {

	protected Adapter modelListener = new AdapterImpl() {
		public void notifyChanged(Notification msg) {
			handlePropertyChanged(msg);
		}
	};
	/**
	 * @param p_model
	 */
	public VTCDBaseTreeEditPart(Object p_model) {
		super(p_model);
	}


	public void activate() {
		super.activate();
		((EObject)getModel()).eAdapters().add(modelListener);
	}
	public void deactivate() {
		((EObject)getModel()).eAdapters().remove(modelListener);
		super.deactivate();
	}
	
	protected abstract void handlePropertyChanged(Notification msg);

}
