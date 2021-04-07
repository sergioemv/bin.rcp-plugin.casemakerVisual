/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.wizards;

import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.ide.IDE;

import biz.bi.vtcd.provider.VTCDEditPlugin;
import biz.bi.vtcd.provider.VTCDImages;
/**
 * @author hcanedo
 * @19-08-2005
 * @hcanedo
 */
public class VTCDExportWizard extends Wizard implements IExportWizard {

	private IStructuredSelection selection;

    private VTCDWizardExportPage mainPage;
	/**
	 * 
	 */
	public VTCDExportWizard() {
		super();
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	public boolean performFinish() {
		return mainPage.performFinish();
	}
	/* (non-Javadoc)
     * Method declared on IWizard.
     */
    public void addPages() {
        super.addPages();

        mainPage = new VTCDWizardExportPage(VTCDEditPlugin.INSTANCE.getString("_UI_Export_Title_Label"),selection);
        addPage(mainPage);
    }

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
	 */
	public void init(IWorkbench p_workbench, IStructuredSelection p_selection) {
		this.selection = p_selection;
        List selectedResources = IDE.computeSelectedResources(p_selection);
        if (!selectedResources.isEmpty()) {
            this.selection = new StructuredSelection(selectedResources);
        }

        // look it up if current selection (after resource adapting) is empty
        if (selection.isEmpty() && p_workbench.getActiveWorkbenchWindow() != null) {
            IWorkbenchPage page = p_workbench.getActiveWorkbenchWindow()
                    .getActivePage();
            if (page != null) {
                IEditorPart currentEditor = page.getActiveEditor();
                if (currentEditor != null) {
                    Object selectedResource = currentEditor.getEditorInput()
                            .getAdapter(IResource.class);
                    if (selectedResource != null) {
                        selection = new StructuredSelection(selectedResource);
                    }
                }
            }
        }

        setWindowTitle(VTCDEditPlugin.INSTANCE.getString("_UI_Export_Title_Label")); //$NON-NLS-1$

        setDefaultPageImageDescriptor(VTCDImages.getImageDescriptor(VTCDImages.WIZARD_EXPORT_ICON_LARGE));//$NON-NLS-1$
        setNeedsProgressMonitor(true);
	}

}
