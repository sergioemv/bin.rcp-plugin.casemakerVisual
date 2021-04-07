package biz.bi.vtcd.views;

import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.RetargetAction;
import org.eclipse.ui.part.ViewPart;

import biz.bi.vtcd.gef.editors.VTCDCombinationDiagramEditor;
import biz.bi.vtcd.gef.editors.VTCDMainDiagramEditor;
import biz.bi.vtcd.gef.editors.actions.VTCDGoToDiagramCombinationRetargetAction;
import biz.bi.vtcd.gef.editors.inputs.VTCDCombinationDiagramEditorInput;
import biz.bi.vtcd.model.VTCDDiagramCombination;

public class VTCDDiagramExplorerView extends ViewPart implements IPartListener {
	public static final String view_id ="biz.bi.vtcd.views.VTCDDiagramExplorerView";
	
	
	private TreeViewer m_treeViewer;
	private VTCDDiagramExplorerLabelProvider labelProvider;
	private VTCDMainDiagramEditor root;
	private RetargetAction m_OpenCombinationEditor = new VTCDGoToDiagramCombinationRetargetAction();
	
		public VTCDDiagramExplorerView() {
		super();
		// TODO Auto-generated constructor stub
	}

	private void hookActions()
	{
		IActionBars bars = getViewSite().getActionBars();
		bars.getToolBarManager().add(m_OpenCombinationEditor);
	}
		
	private void createListeners()
	{
		m_treeViewer.addDoubleClickListener(new IDoubleClickListener()
				{

					public void doubleClick(DoubleClickEvent p_event) {
						Object selection = ((StructuredSelection)p_event.getSelection()).getFirstElement();
						if (selection instanceof VTCDDiagramCombination)
						{
							IWorkbenchWindow dw = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
							if (dw != null) 
							   {
							   IWorkbenchPage page = dw.getActivePage();
							   if (page != null)
							   {
								 	 VTCDCombinationDiagramEditorInput input =  new VTCDCombinationDiagramEditorInput((VTCDDiagramCombination)selection,root);			 
									 try {
										 VTCDCombinationDiagramEditor ed =(VTCDCombinationDiagramEditor)
										 page.openEditor(input,VTCDCombinationDiagramEditor.ID);
										 ed.setMainDiagramEditor(root);
										 ((VTCDMainDiagramEditor)root).getCombinationEditors().add(ed);
									 	} catch (PartInitException e) 
									 	{
										// TODO Auto-generated catch block
										e.printStackTrace();
										}
									
								
							   }
							   }
						
					}
					}});
	}

	
	public void createPartControl(Composite p_parent) {
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		layout.verticalSpacing = 2;
		layout.marginWidth = 0;
		layout.marginHeight = 2;
		p_parent.setLayout(layout);
		m_treeViewer = new TreeViewer(p_parent);
		m_treeViewer.setContentProvider(new VTCDDiagramExplorerContentProvider());
		labelProvider = new VTCDDiagramExplorerLabelProvider();
		m_treeViewer.setLabelProvider(labelProvider);
		
		m_treeViewer.setUseHashlookup(true);
		
		GridData layoutData = new GridData();
		layoutData = new GridData();
		layoutData.grabExcessHorizontalSpace = true;
		layoutData.grabExcessVerticalSpace = true;
		layoutData.horizontalAlignment = GridData.FILL;
		layoutData.verticalAlignment = GridData.FILL;
		m_treeViewer.getControl().setLayoutData(layoutData);
		
		getViewSite().getPage().addPartListener(this);
		
		if (getViewSite().getPage().getActiveEditor() instanceof VTCDMainDiagramEditor) 
		   root = (VTCDMainDiagramEditor) getViewSite().getPage().getActiveEditor();
		else if (getViewSite().getPage().getActiveEditor() instanceof VTCDCombinationDiagramEditor)
		{
			VTCDCombinationDiagramEditor combinationEditor=(VTCDCombinationDiagramEditor)getViewSite().getPage().getActiveEditor();
			root =combinationEditor.getMainDiagramEditor();
		}
		if (root!=null)
		{
			m_treeViewer.setInput(((VTCDMainDiagramEditor)root).getGraphicalViewer().getEditPartRegistry().get(((VTCDMainDiagramEditor)root).getM_VTCDDiagramMain()));
					m_treeViewer.refresh();
			m_treeViewer.expandAll();
		}
		
		hookActions();
		createListeners();
//		treeViewer.setInput();
//		treeViewer.expandAll();
	}

	public void setFocus() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IPartListener#partActivated(org.eclipse.ui.IWorkbenchPart)
	 */
	public void partActivated(IWorkbenchPart p_part) {
		
		if ((p_part instanceof VTCDMainDiagramEditor))
		{
			root = (VTCDMainDiagramEditor)p_part;
			m_treeViewer.setInput(((VTCDMainDiagramEditor)p_part).getGraphicalViewer().getEditPartRegistry().get(((VTCDMainDiagramEditor)p_part).getM_VTCDDiagramMain()));
			m_treeViewer.refresh();
			m_treeViewer.expandAll();
		
		
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IPartListener#partBroughtToTop(org.eclipse.ui.IWorkbenchPart)
	 */
	public void partBroughtToTop(IWorkbenchPart p_part) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IPartListener#partClosed(org.eclipse.ui.IWorkbenchPart)
	 */
	public void partClosed(IWorkbenchPart p_part) {
		
		if (p_part instanceof VTCDMainDiagramEditor)
			
		{
			if (PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()!=null)
			{
			IEditorPart editor = 
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
			if (!(editor instanceof VTCDMainDiagramEditor))
			{
			root = null;
			m_treeViewer.setInput(null);
			m_treeViewer.refresh();
			}
			}
		}
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IPartListener#partDeactivated(org.eclipse.ui.IWorkbenchPart)
	 */
	public void partDeactivated(IWorkbenchPart p_part) {
		
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IPartListener#partOpened(org.eclipse.ui.IWorkbenchPart)
	 */
	public void partOpened(IWorkbenchPart p_part) {
		if (p_part instanceof VTCDMainDiagramEditor)
		{
			root = (VTCDMainDiagramEditor)p_part;
			m_treeViewer.setInput(((VTCDMainDiagramEditor)p_part).getGraphicalViewer().getEditPartRegistry().get(((VTCDMainDiagramEditor)p_part).getM_VTCDDiagramMain()));
			m_treeViewer.refresh();
			m_treeViewer.expandAll();
			
		}
		
	}
	public void dispose() {
		getViewSite().getPage().removePartListener(this);
		super.dispose();
	}

}
