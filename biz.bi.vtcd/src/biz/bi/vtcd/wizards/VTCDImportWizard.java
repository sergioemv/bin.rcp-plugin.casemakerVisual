/**
 * 
 */
package biz.bi.vtcd.wizards;

import java.util.List;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.ide.IDE;

import biz.bi.vtcd.provider.VTCDEditPlugin;
import biz.bi.vtcd.provider.VTCDImages;


/**
 * @author hcanedo
 *
 */
public class VTCDImportWizard extends Wizard implements IImportWizard {

    private IStructuredSelection selection;
	private VTCDwizardImportPage mainPage;
	/**
	 * 
	 */
	public VTCDImportWizard() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	public boolean performFinish() {
		return mainPage.perfromFinish();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;

        List selectedResources = IDE.computeSelectedResources(selection);
        if (!selectedResources.isEmpty()) {
            this.selection = new StructuredSelection(selectedResources);
        }

        setWindowTitle(VTCDEditPlugin.INSTANCE.getString("_UI_Import_Title_Label"));
        setDefaultPageImageDescriptor(VTCDImages.getImageDescriptor(VTCDImages.WIZARD_IMPORT_ICON_LARGE));//$NON-NLS-1$
        setNeedsProgressMonitor(true);

	}
	/* (non-Javadoc)
     * Method declared on IWizard.
     */
    public void addPages() {
        super.addPages();
        mainPage = new VTCDwizardImportPage(VTCDEditPlugin.INSTANCE.getString("_UI_Import_VTCD_File_Title"), selection);
        addPage(mainPage);
    }

}
