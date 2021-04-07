/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vbr.gef.editparts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

/**
 * @author cmendezroca
 * 
 **/
public abstract class VBRBaseEditPart  extends AbstractGraphicalEditPart {
	protected Adapter modelListener = new AdapterImpl() {
		public void notifyChanged(Notification msg) {
			handlePropertyChanged(msg);
		}
	};
	protected abstract void handlePropertyChanged(Notification msg);
	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
	 */
	protected IFigure createFigure() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
	 */
	protected void createEditPolicies() {
		
		installEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE, null);
	}
	
	//	observer list
	public void activate() {
		super.activate();
		((EObject)getModel()).eAdapters().add(modelListener);
	}
	
	public void deactivate() {
		((EObject)getModel()).eAdapters().remove(modelListener);
		super.deactivate();
	}

}
