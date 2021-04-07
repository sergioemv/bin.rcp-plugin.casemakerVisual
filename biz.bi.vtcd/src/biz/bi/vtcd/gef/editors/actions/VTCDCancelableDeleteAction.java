/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.gef.editors.actions;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import biz.bi.vtcd.model.VTCDPackage;
import biz.bi.vtcd.provider.VTCDEditPlugin;
import biz.bi.vtcd.provider.VTCDImages;

/**
 * @author smoreno
 * @05-08-2005
 * @smoreno
 * action for customize the call for the default delete action
 * 
 */
public class VTCDCancelableDeleteAction extends SelectionAction {

	public static final String ID = "VTCDCANCELABLEDELETE";
	private IAction deleteAction;
	private GraphicalEditPart currentselection;
	/**
	 * @param p_part
	 */
	public VTCDCancelableDeleteAction(IWorkbenchPart p_part) {
		super(p_part);
		this.setEnabled(false);
		this.setId(ID);
		this.setText(VTCDEditPlugin.INSTANCE.getString("_ACTION_CancelableDelete_label"));
		this.setImageDescriptor(VTCDImages.getImageDescriptor(VTCDImages.TOOLBAR_CANCELABLEDELETE));
		//this.deleteAction = ((GraphicalEditorWithFlyoutPalette)p_part).ge
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.ui.actions.WorkbenchPartAction#calculateEnabled()
	 */
	protected boolean calculateEnabled() {
		// TODO Auto-generated method stub
		//System.out.println("calculando enabled");
		if (getSelection()!=null&&(deleteAction!=null))
		if (((StructuredSelection)getSelection()).getFirstElement() instanceof GraphicalEditPart)	
		{
			StructuredSelection selected=((StructuredSelection)getSelection());
			currentselection = (GraphicalEditPart)selected.getFirstElement();
			return (((StructuredSelection)getSelection()).size()==1)&&deleteAction.isEnabled();
			
		}
	
		return false;
	

		}
	public void run()
	{	
		Shell parentShell=PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		String deleteLabel="";
		String messageDelete="";
		switch (((EObject)currentselection.getModel()).eClass().getClassifierID()) {
		case VTCDPackage.VTCD_FIGURE_DEPENDENCY:
			deleteLabel=VTCDEditPlugin.INSTANCE.getString("_UI_Delete_Dependency_label");
			messageDelete = VTCDEditPlugin.INSTANCE.getString("_UI_Delete_Dependency_Message");
			break;
			
		case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS:
			deleteLabel=VTCDEditPlugin.INSTANCE.getString("_UI_Delete_EquivalenceClass_label");
			messageDelete = VTCDEditPlugin.INSTANCE.getString("_UI_Delete_EquivalenceClass_Message");
			break;
			
		case VTCDPackage.VTCD_FIGURE_ELEMENT:
			deleteLabel=VTCDEditPlugin.INSTANCE.getString("_UI_Delete_Element_label");
			messageDelete = VTCDEditPlugin.INSTANCE.getString("_UI_Delete_Element_Message");
			break;
		default:
			deleteAction.run();
			return;
		}
		if (MessageDialog.openConfirm(parentShell, deleteLabel, messageDelete))
			deleteAction.run();
	
	}

	public IAction getDeleteAction() {
		return this.deleteAction;
	}

	public void setDeleteAction(IAction p_deleteAction) {
		this.deleteAction = p_deleteAction;
	}
	

}
