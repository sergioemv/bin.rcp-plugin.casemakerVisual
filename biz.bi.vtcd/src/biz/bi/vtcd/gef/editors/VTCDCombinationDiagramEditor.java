package biz.bi.vtcd.gef.editors;

import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gef.palette.CombinedTemplateCreationEntry;
import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.MarqueeToolEntry;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.PaletteStack;
import org.eclipse.gef.palette.SelectionToolEntry;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.ToggleGridAction;
import org.eclipse.gef.ui.actions.ToggleRulerVisibilityAction;
import org.eclipse.gef.ui.actions.ToggleSnapToGeometryAction;
import org.eclipse.gef.ui.actions.ZoomInAction;
import org.eclipse.gef.ui.actions.ZoomOutAction;
import org.eclipse.gef.ui.palette.FlyoutPaletteComposite.FlyoutPreferences;
import org.eclipse.gef.ui.parts.GraphicalViewerKeyHandler;
import org.eclipse.gef.ui.parts.ScrollingGraphicalViewer;
import org.eclipse.gef.ui.parts.SelectionSynchronizer;
import org.eclipse.gef.ui.properties.UndoablePropertySheetEntry;
import org.eclipse.gef.ui.rulers.RulerComposite;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;

import biz.bi.vtcd.editparts.VTCDEditPartFactory;
import biz.bi.vtcd.gef.editors.domains.VTCDDiagramEditDomain;
import biz.bi.vtcd.gef.editors.inputs.VTCDCombinationDiagramEditorInput;
import biz.bi.vtcd.gef.outline.VTCDCombinationDiagramOutLinePage;
import biz.bi.vtcd.model.VTCDDiagramCombination;
import biz.bi.vtcd.model.VTCDPackage;
import biz.bi.vtcd.provider.VTCDEditPlugin;
import biz.bi.vtcd.provider.VTCDImages;
import biz.bi.vtcd.provider.VTCDItemProviderAdapterFactory;

/**
 * @author smoreno
 * @version 1.0
 * 
 */
public  class VTCDCombinationDiagramEditor extends
		VTCDBaseEditor {

	private VTCDMainDiagramEditor m_MainDiagramEditor;
	
	public static final String ID = "biz.bi.vtcd.presentation.VTCDCombinationDiagramEditor";
	
	private PaletteRoot m_PaletteRoot;


	protected IPropertySheetPage propertySheetPage;

	protected IContentOutlinePage outlinePage;

	protected AdapterFactory adapterFactory;

	private VTCDDiagramCombination m_VTCDDiagramCombination;

	private RulerComposite rulerComp;
	
	protected Adapter modelListener = new AdapterImpl() {
		public void notifyChanged(Notification msg) {
			handlePropertyChanged(msg);
		}
	};

	public VTCDCombinationDiagramEditor() {
		super();
	
		setEditDomain(new VTCDDiagramEditDomain(this));// domain);
	}

	/**
	 * close the editor if there is no model
	 * @param p_msg
	 */
	protected void handlePropertyChanged(Notification p_msg) {
			
			if (this.getVTCDDiagramCombination().getM_FigureDependency() == null)
				this.closeEditor(false);
			else
				updateTitle();
			
		
	}

	protected FlyoutPreferences getPalettePreferences() {
		return new FlyoutPreferences() {
			public int getDockLocation() {
				return VTCDEditPlugin.getPlugin().getPluginPreferences()
						.getInt(VTCDMainDiagramEditor.PALETTE_DOCK_LOCATION);
			}

			public int getPaletteState() {
				return VTCDEditPlugin.getPlugin().getPluginPreferences()
						.getInt(VTCDMainDiagramEditor.PALETTE_STATE);
			}

			public int getPaletteWidth() {
				return VTCDEditPlugin.getPlugin().getPluginPreferences()
						.getInt(VTCDMainDiagramEditor.PALETTE_SIZE);
			}

			public void setDockLocation(int location) {
				VTCDEditPlugin.getPlugin().getPluginPreferences().setValue(
						VTCDMainDiagramEditor.PALETTE_DOCK_LOCATION, location);
			}

			public void setPaletteState(int state) {
				VTCDEditPlugin.getPlugin().getPluginPreferences().setValue(
						VTCDMainDiagramEditor.PALETTE_STATE, state);
			}

			public void setPaletteWidth(int width) {
				VTCDEditPlugin.getPlugin().getPluginPreferences().setValue(
						VTCDMainDiagramEditor.PALETTE_SIZE, width);
			}
		};
	}

	protected PaletteRoot getPaletteRoot() {
		if (m_PaletteRoot == null)
			m_PaletteRoot = createPaletteRoot();
		
		return m_PaletteRoot;
	}

	protected PaletteRoot createPaletteRoot() {
		PaletteRoot paletteRoot = new PaletteRoot();
		createControlGroup(paletteRoot);
		createConnectionGroup(paletteRoot);
		createComponentsGroup(paletteRoot);
		return paletteRoot;
	}

	protected void createControlGroup(PaletteRoot paletteRoot) {
		PaletteGroup controlGroup = new PaletteGroup("Control Group");
		ToolEntry tool = new SelectionToolEntry();
		controlGroup.add(tool);
		paletteRoot.setDefaultEntry(tool);
		tool = new MarqueeToolEntry();
		controlGroup.add(tool);
		PaletteSeparator sep = new PaletteSeparator(
				"biz.bi.vtcd.palette.separatpor.1");
		sep
				.setUserModificationPermission(PaletteEntry.PERMISSION_NO_MODIFICATION);
		controlGroup.add(sep);
		paletteRoot.add(controlGroup);
	}

	protected void createConnectionGroup(PaletteRoot paletteRoot) {
		PaletteGroup connectionGroup = new PaletteGroup("Connection Group");
		PaletteStack referenceConnections = new PaletteStack("Reference Links",
				"Create Reference Links", ImageDescriptor
						.createFromURL(VTCDEditPlugin.getPlugin().getBundle()
								.getEntry("icons/connection16.gif")));
		createReferenceConnectionEntries(referenceConnections);
		if (!referenceConnections.getChildren().isEmpty())
			connectionGroup.add(referenceConnections);
		createClassConnectionEntries(connectionGroup);
		paletteRoot.add(connectionGroup);
	}

	protected void createComponentsGroup(PaletteRoot paletteRoot) {
		PaletteGroup componentsGroup = new PaletteGroup("Components Group");
		createComponentsDrawerEntries(componentsGroup);
		paletteRoot.add(componentsGroup);
	}

	
	protected void setSite(IWorkbenchPartSite site){
		super.setSite(site);
	}
	public AdapterFactory getAdapterFactory() {
		if (adapterFactory == null)
			adapterFactory = createAdapterFactory();
		return adapterFactory;
	}

	protected AdapterFactory createAdapterFactory() {
		List factories = new ArrayList();
		factories.add(new ResourceItemProviderAdapterFactory());
		factories.add(new VTCDItemProviderAdapterFactory());
		factories.add(new ReflectiveItemProviderAdapterFactory());
		ComposedAdapterFactory adapterFactory2 = new ComposedAdapterFactory(
				factories);
		return adapterFactory2;
	}

	protected IPropertySheetPage createPropertySheetPage() {
		PropertySheetPage page = new PropertySheetPage();
		page.setRootEntry(new UndoablePropertySheetEntry(m_MainDiagramEditor.getMainCommandStack()));
		return page;
	}

	public Object getAdapter(Class type) {
		if (type == IPropertySheetPage.class) {
			if (propertySheetPage == null) {
				propertySheetPage = createPropertySheetPage();
			}
			return propertySheetPage;
		} else if (type == IContentOutlinePage.class) {
			if (outlinePage == null) {
				outlinePage = createOutlinePage();
			}
			return outlinePage;
		} else if (type == ZoomManager.class)
			return getGraphicalViewer().getProperty(
					ZoomManager.class.toString());
		return super.getAdapter(type);
	}

	public GraphicalViewer getGraphicalViewer() {
		return super.getGraphicalViewer();
	}

	public SelectionSynchronizer getSelectionSynchronizer() {
		return super.getSelectionSynchronizer();
	}

	

	public ActionRegistry getActionRegistry() {
		return super.getActionRegistry();
	}

	public void setOutlinePage(IContentOutlinePage page) {
		this.outlinePage = page;
	}



	protected void configureGraphicalViewer() {
		//smoreno
		ScrollingGraphicalViewer viewer = (ScrollingGraphicalViewer) getGraphicalViewer();
		ScalableFreeformRootEditPart root = new ScalableFreeformRootEditPart();
		List zoomLevels = new ArrayList(3);
		//Zoom Levels
		zoomLevels.add(ZoomManager.FIT_ALL);
		zoomLevels.add(ZoomManager.FIT_WIDTH);
		zoomLevels.add(ZoomManager.FIT_HEIGHT);
		root.getZoomManager().setZoomLevelContributions(zoomLevels);

		IAction zoomIn = new ZoomInAction(root.getZoomManager());
		IAction zoomOut = new ZoomOutAction(root.getZoomManager());
		getActionRegistry().registerAction(zoomIn);
		getActionRegistry().registerAction(zoomOut);
		getSite().getKeyBindingService().registerAction(zoomIn);
		getSite().getKeyBindingService().registerAction(zoomOut);
		//background color	
		//TODO load the preferences from the model
		viewer.getControl().setBackground(ColorConstants.listBackground);
		//the root editpart
		viewer.setRootEditPart(root);
		//the editpartfactory
		viewer.setEditPartFactory(new VTCDEditPartFactory());
		//for keyboard manipulation
		viewer.setKeyHandler(
				new GraphicalViewerKeyHandler(getGraphicalViewer())
						.setParent(getCommonKeyHandler()));
		
		//default context menu
		
		ContextMenuProvider cmProvider =
			new VTCDMainDiagramEditorContextMenuProvider(viewer, getActionRegistry());
	viewer.setContextMenu(cmProvider);
	getSite().registerContextMenu(cmProvider, viewer);
		//getGraphicalViewer().setContents(getM_Parent().getM_VTCDDiagramMain());
	IAction showRulers = new ToggleRulerVisibilityAction(getGraphicalViewer());
	getActionRegistry().registerAction(showRulers);
	
	IAction snapAction = new ToggleSnapToGeometryAction(getGraphicalViewer());
	getActionRegistry().registerAction(snapAction);

	IAction showGrid = new ToggleGridAction(getGraphicalViewer());
	getActionRegistry().registerAction(showGrid);
	
	Listener listener = new Listener() {
		public void handleEvent(Event event) {
			handleActivationChanged(event);
		}
	};
	getGraphicalControl().addListener(SWT.Activate, listener);
	getGraphicalControl().addListener(SWT.Deactivate, listener);
	
	}

	

	protected void createClassConnectionEntries(PaletteContainer container) {
		PaletteStack paletteStack = null;
		ConnectionCreationToolEntry tool = null;
		EClass eClass = null;
	}

	protected void createComponentsDrawerEntries(PaletteContainer container) {
		
		PaletteDrawer drawer2 = null;
	
		CombinedTemplateCreationEntry combined = null;
		EClass eClass = null;	
		drawer2 = new PaletteDrawer(VTCDEditPlugin.INSTANCE.getString("_UI_DiagramMain_Drawer_caption"), null);	
		
		eClass = VTCDPackage.eINSTANCE.getVTCDFigureEquivalenceClass();
		combined = new CombinedTemplateCreationEntry(
				VTCDEditPlugin.INSTANCE.getString("_UI_VTCDFigureEquivalenceClass_caption"),
				VTCDEditPlugin.INSTANCE.getString("_UI_VTCDFigureEquivalenceClass_tooltip"), eClass,
				new VTCDCreationFactory(eClass), 
				VTCDImages.getImageDescriptor(VTCDImages.PALETTE_EQUIVALENCECLASS),
				VTCDImages.getImageDescriptor(VTCDImages.PALETTE_EQUIVALENCECLASS));
		drawer2.add(combined);
		
		eClass = VTCDPackage.eINSTANCE.getVTCDFigureCombination();
		combined = new CombinedTemplateCreationEntry(VTCDEditPlugin.INSTANCE.getString("_UI_VTCDFigureCombination_Palette_caption"),
				VTCDEditPlugin.INSTANCE.getString("_UI_VTCDFigureCombination_Palette_tooltip"), eClass,
				new VTCDCreationFactory(eClass), VTCDImages.getImageDescriptor(VTCDImages.PALETTE_COMBINATION), 
				VTCDImages.getImageDescriptor(VTCDImages.PALETTE_COMBINATION));
		drawer2.add(combined);
	
		
		
		if (!drawer2.getChildren().isEmpty())
			container.add(drawer2);
	}

	protected IContentOutlinePage createOutlinePage() {
		return new VTCDCombinationDiagramOutLinePage(this, adapterFactory);
	}

	protected void createReferenceConnectionEntries(PaletteContainer container) {
		
		  ConnectionCreationToolEntry tool = null;
	  tool = new ConnectionCreationToolEntry( VTCDEditPlugin.INSTANCE.getString("_UI_VTCDLinkCombinationEClass_caption"), 
				  VTCDEditPlugin.INSTANCE.getString("_UI_VTCDLinkCombinationEClass_tooltip"),
		  new VTCDCreationFactory(VTCDPackage.eINSTANCE.getVTCDLinkCombinationEClass()),
		  VTCDImages.getImageDescriptor(VTCDImages.PALETTE_LINK_COMBINATION_ECLASS),
		  VTCDImages.getImageDescriptor(VTCDImages.PALETTE_LINK_COMBINATION_ECLASS));
		  container.add(tool);
		
	}

	// the set contents must be done on the initialize
	protected void initializeGraphicalViewer() {
		if(getVTCDDiagramCombination()!=null)
			getGraphicalViewer().setContents(getVTCDDiagramCombination());
		else
			System.out.println("VTCDCombinationDiagram is null?");
		updateTitle();
		((VTCDDiagramEditDomain)this.getEditDomain()).setInitialized(true);
	}

	public void closeEditor(final boolean save)
	{
	    getSite().getShell().getDisplay().asyncExec(new Runnable()
	    {
	        public void run()
	        {
	        	
	            getSite().getPage().closeEditor(VTCDCombinationDiagramEditor.this, save);
	        }
	    });
	}

	

	public void dispose() {
		//ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		getSite().getWorkbenchWindow().getPartService().removePartListener(this.getMainDiagramEditor().m_PartListener);
		this.getVTCDDiagramCombination().eAdapters().remove(modelListener);
		this.getVTCDDiagramCombination().getM_FigureDependency().getM_Dependency().eAdapters().remove(modelListener);
		super.dispose();
	}

	public void doSave(IProgressMonitor monitor) {
		try
        {
			m_MainDiagramEditor.doSave(monitor);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
	}

	public void doSaveAs() {
		
	}





	public void init(IEditorSite site, IEditorInput editorInput)
		throws PartInitException {
	
	
		if (!(editorInput instanceof VTCDCombinationDiagramEditorInput))
			throw new PartInitException ("Invalid input : Must be a Combination Diagram");
	    super.init(site, editorInput);
	}

	public boolean isSaveAsAllowed() {
		return false;
	}

	

	protected void setInput(IEditorInput input) {
	 
	    super.setInput(input);
	
	 
	    //smoreno_begin
	    if (input instanceof VTCDCombinationDiagramEditorInput)
	    {
	  	setVTCDDiagramCombination(((VTCDCombinationDiagramEditorInput)input).getDiagramCombination());
	  	setMainDiagramEditor((VTCDMainDiagramEditor)((VTCDCombinationDiagramEditorInput)input).getParent());
	  	m_MainDiagramEditor.getCombinationEditors().add(this);
	    }
		//smoreno_end
	}

	
	void updateTitle()
	{
		IEditorInput input = getEditorInput();
		
		setPartName("Dependency :"+input.getName());
		setTitleToolTip(input.getToolTipText());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.ui.parts.GraphicalEditor#commandStackChanged(java.util.EventObject)
	 */
	public void commandStackChanged(EventObject p_event) {
		firePropertyChange(PROP_DIRTY);
		super.commandStackChanged(p_event);
	}
	protected void handleActivationChanged(Event event) {
		IAction copy = null;
		if (event.type == SWT.Deactivate)
			copy = getActionRegistry().getAction(ActionFactory.COPY.getId());
		if (getEditorSite().getActionBars().getGlobalActionHandler(ActionFactory.COPY.getId()) 
				!= copy) {
			getEditorSite().getActionBars().setGlobalActionHandler(
					ActionFactory.COPY.getId(), copy);
			getEditorSite().getActionBars().updateActionBars();
		}
	}
	

	/**
	 * @return Returns the mainDiagramEditor.
	 */
	public VTCDMainDiagramEditor getMainDiagramEditor() {
		return this.m_MainDiagramEditor;
	}

	/**
	 * @param p_mainDiagramEditor The mainDiagramEditor to set.
	 */
	public void setMainDiagramEditor(VTCDMainDiagramEditor p_mainDiagramEditor) {
		this.m_MainDiagramEditor = p_mainDiagramEditor;
		getSite().getWorkbenchWindow().getPartService().addPartListener(this.getMainDiagramEditor().m_PartListener);

	}

	/**
	 * @return Returns the vTCDDiagramCombination.
	 */
	public VTCDDiagramCombination getVTCDDiagramCombination() {
		return this.m_VTCDDiagramCombination;
	}

	/**
	 * @param p_diagramCombination The vTCDDiagramCombination to set.
	 */
	public void setVTCDDiagramCombination(
			VTCDDiagramCombination p_diagramCombination) {
		this.m_VTCDDiagramCombination = p_diagramCombination;
		//add the listener
		p_diagramCombination.eAdapters().add(modelListener);
		p_diagramCombination.getM_FigureDependency().getM_Dependency().eAdapters().add(modelListener);
		//
	}
	

}
