/**
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved. 
 */
package biz.bi.vtcd.gef.editors.actions;

import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import biz.bi.vtcd.editparts.VTCDFigureDependencyEditPart;
import biz.bi.vtcd.gef.editors.VTCDCombinationDiagramEditor;
import biz.bi.vtcd.gef.editors.VTCDMainDiagramEditor;
import biz.bi.vtcd.gef.editors.inputs.VTCDCombinationDiagramEditorInput;
import biz.bi.vtcd.model.VTCDDiagramCombination;
import biz.bi.vtcd.provider.VTCDEditPlugin;
import biz.bi.vtcd.provider.VTCDImages;

/**
 * Action that goes from the main diagram to the combination diagram when
 * a depedencency is selected
 * @author smoreno
 *
 */
public class VTCDGoToDiagramCombinationAction extends SelectionAction {

	public static final String ID = "GOTODIAGRAMCOMBINATION";
	private VTCDDiagramCombination m_diagramCombination;
	public VTCDGoToDiagramCombinationAction(
			IWorkbenchPart part)
	{
	
		super(part);
		setEnabled(false);
		setId(ID);
	
		setText(VTCDEditPlugin.INSTANCE.getString("_UI_VTCDGoToCombinationDiagramAction_text"));
		setImageDescriptor(VTCDImages.getImageDescriptor(VTCDImages.TOOLBAR_GOTOCOMBINATIONDIAGRAM));
	
	}
	public void run()
	{
		IWorkbenchWindow dw = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		   if (dw != null) 
		   {
		   IWorkbenchPage page = dw.getActivePage();
		   if (page != null)
		   {
			 	 VTCDCombinationDiagramEditorInput input = null;
				 if (VTCDCombinationDiagramEditorInput.openedInputs.get(m_diagramCombination)!=null)
				  input =(VTCDCombinationDiagramEditorInput) VTCDCombinationDiagramEditorInput.openedInputs.get(m_diagramCombination);
				  else
				  	input = new VTCDCombinationDiagramEditorInput(m_diagramCombination,this.getWorkbenchPart());			 
				 try {
					 VTCDCombinationDiagramEditor ed =(VTCDCombinationDiagramEditor)
					 page.openEditor(input,VTCDCombinationDiagramEditor.ID);
					 ed.setMainDiagramEditor((VTCDMainDiagramEditor)getWorkbenchPart());
					 ((VTCDMainDiagramEditor)getWorkbenchPart()).getCombinationEditors().add(ed);
				 	} catch (PartInitException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				 	}
				
			
		   }
		   }

	}
	/* (non-Javadoc)
	 * @see org.eclipse.gef.ui.actions.WorkbenchPartAction#calculateEnabled()
	 */
	protected boolean calculateEnabled() {
		// TODO Auto-generated method stub
		if (((StructuredSelection)getSelection()).getFirstElement() instanceof VTCDFigureDependencyEditPart)
			 m_diagramCombination = ((VTCDFigureDependencyEditPart)((StructuredSelection)getSelection()).getFirstElement()).getVTCDFigureDependency().getM_VTCDDiagramCombination();
		 
		return (((StructuredSelection)getSelection()).size()==1)
		&& ((StructuredSelection)getSelection()).getFirstElement() instanceof VTCDFigureDependencyEditPart;
	}
}
