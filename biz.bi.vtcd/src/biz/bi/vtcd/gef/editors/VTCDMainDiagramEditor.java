package biz.bi.vtcd.gef.editors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EventObject;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.commands.CommandStack;
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
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;

import biz.bi.vtcd.editparts.VTCDEditPartFactory;
import biz.bi.vtcd.gef.editors.domains.VTCDDiagramEditDomain;
import biz.bi.vtcd.gef.editors.tools.VTCDDependencyCreationToolEntry;
import biz.bi.vtcd.gef.editors.tools.VTCDElementCreationToolEntry;
import biz.bi.vtcd.gef.editors.tools.VTCDEquivalenceClassCreationToolEntry;
import biz.bi.vtcd.gef.outline.VTCDMainDiagramOutLinePage;
import biz.bi.vtcd.model.VTCDDiagramMain;
import biz.bi.vtcd.model.VTCDPackage;
import biz.bi.vtcd.provider.VTCDEditPlugin;
import biz.bi.vtcd.provider.VTCDImages;
import biz.bi.vtcd.provider.VTCDItemProviderAdapterFactory;

/**
 * @author smoreno
 * @version 1.0
 * 
 */
public  class VTCDMainDiagramEditor extends
		VTCDBaseEditor {

	private class ResourceTracker
	    implements IResourceChangeListener, IResourceDeltaVisitor
	{
	    /* (non-Javadoc)
	     * @see org.eclipse.core.resources.IResourceChangeListener#resourceChanged(org.eclipse.core.resources.IResourceChangeEvent)
	     */
	    public void resourceChanged(IResourceChangeEvent event)
	    {
	        IResourceDelta delta = event.getDelta();
	        try
	        {
	            if (delta != null)
	                delta.accept(this);
	        }
	        catch (CoreException exception)
	        {
	            VTCDEditPlugin.getPlugin().getLog().log(exception.getStatus());
	            exception.printStackTrace();
	        }
	    }
	
	    /* (non-Javadoc)
	     * @see org.eclipse.core.resources.IResourceDeltaVisitor#visit(org.eclipse.core.resources.IResourceDelta)
	     */
	    public boolean visit(IResourceDelta delta)
	    {
	        if (delta == null
	            || !delta.getResource().equals(
	                ((IFileEditorInput) getEditorInput()).getFile()))
	            return true;
	
	        if (delta.getKind() == IResourceDelta.REMOVED)
	        {
	            if ((IResourceDelta.MOVED_TO & delta.getFlags()) == 0)
	            {
	                // if the file was deleted
	                // NOTE: The case where an open, unsaved file is deleted is being handled by the 
	                // PartListener added to the Workbench in the initialize() method.
	                if (!isDirty())
	                    closeEditor(false);
	            }	
	            else
	            {
	                // else if it was moved or renamed
	                final IFile newFile =
	                    ResourcesPlugin.getWorkspace().getRoot().getFile(
	                        delta.getMovedToPath());
	                Display display = getSite().getShell().getDisplay();
	                display.asyncExec(new Runnable()
	                {
	                    public void run()
	                    {
	                        setInput(new FileEditorInput(newFile));
	                    }
	                });
	            }
	        }
	        return false;
	    }
	}

	
	public static final String PALETTE_DOCK_LOCATION = "DockLocation"; //$NON-NLS-1$

	public static final String PALETTE_SIZE = "PaletteSize"; //$NON-NLS-1$

	public static final String PALETTE_STATE = "PaletteState"; //$NON-NLS-1$

	private PaletteRoot m_PaletteRoot;


	protected IPropertySheetPage propertySheetPage;

	protected IContentOutlinePage outlinePage;

	protected AdapterFactory adapterFactory;

	private VTCDDiagramMain m_VTCDDiagramMain;
	
	private ResourceTracker resourceTracker;
	
	private List m_CombinationEditors;
	
	public IPartListener m_PartListener = new IPartListener()
	{

		public void partActivated(IWorkbenchPart p_part) {
			// TODO Auto-generated method stub
			
		}

		public void partBroughtToTop(IWorkbenchPart p_part) {
			// TODO Auto-generated method stub
			
		}

		public synchronized void partClosed(IWorkbenchPart p_part) {
			// TODO Auto-generated method stub
			if (p_part instanceof VTCDCombinationDiagramEditor)
			{
				getCombinationEditors().remove(p_part);
			}
			if(p_part instanceof VTCDMainDiagramEditor)
			{
				//close all chidren
				for (Iterator i = getCombinationEditors().iterator();i.hasNext();)
				{
					VTCDCombinationDiagramEditor ed = (VTCDCombinationDiagramEditor) i.next();
					ed.closeEditor(true);
				}
			}
		}

		public void partDeactivated(IWorkbenchPart p_part) {
			// TODO Auto-generated method stub
			
		}

		public void partOpened(IWorkbenchPart p_part) {
			// TODO Auto-generated method stub
			//System.out.print("Editor abierto");
		}
		
	};
	private final ResourceSet rsrcSet = new ResourceSetImpl();



	private RulerComposite rulerComp;

	private CommandStack mainCommandStack = new CommandStack();
	
	
	public VTCDMainDiagramEditor() {
		
		super();
	
		setEditDomain(new VTCDDiagramEditDomain(this));// domain);
		m_CombinationEditors = new Vector();
	}

	protected void setSite(IWorkbenchPartSite site){
		super.setSite(site);
		getSite().getWorkbenchWindow().getPartService().addPartListener(m_PartListener);
	}
	
	protected FlyoutPreferences getPalettePreferences() {
		return new FlyoutPreferences() {
			public int getDockLocation() {
				return VTCDEditPlugin.getPlugin().getPluginPreferences()
						.getInt(PALETTE_DOCK_LOCATION);
			}

			public int getPaletteState() {
				return VTCDEditPlugin.getPlugin().getPluginPreferences()
						.getInt(PALETTE_STATE);
			}

			public int getPaletteWidth() {
				return VTCDEditPlugin.getPlugin().getPluginPreferences()
						.getInt(PALETTE_SIZE);
			}

			public void setDockLocation(int location) {
				VTCDEditPlugin.getPlugin().getPluginPreferences().setValue(
						PALETTE_DOCK_LOCATION, location);
			}

			public void setPaletteState(int state) {
				VTCDEditPlugin.getPlugin().getPluginPreferences().setValue(
						PALETTE_STATE, state);
			}

			public void setPaletteWidth(int width) {
				VTCDEditPlugin.getPlugin().getPluginPreferences().setValue(
						PALETTE_SIZE, width);
			}
		};
	}

	protected PaletteRoot getPaletteRoot() {
		if (m_PaletteRoot == null)
			m_PaletteRoot = createPaletteRoot();
		  ((VTCDDiagramEditDomain)this.getEditDomain()).setInitialized(true);
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

	protected IContentOutlinePage createOutlinePage() {
		return new VTCDMainDiagramOutLinePage(this, adapterFactory);
	}

	protected void createComponentsGroup(PaletteRoot paletteRoot) {
		PaletteGroup componentsGroup = new PaletteGroup("Components Group");
		createComponentsDrawerEntries(componentsGroup);
		paletteRoot.add(componentsGroup);
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
		page.setRootEntry(new UndoablePropertySheetEntry(mainCommandStack));
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
	
		/*
		 * eClass = VTCDPackage.eINSTANCE.getVTCDDiagramCombination(); combined =
		 * new CombinedTemplateCreationEntry( "Combination", "Create a new
		 * Diagram Combination", eClass, new VTCDCreationFactory(eClass),
		 * ImageDescriptor.createFromURL(VTCDEditPlugin.getPlugin().getBundle().getEntry("icons/object.gif")),
		 * ImageDescriptor.createFromURL(VTCDEditPlugin.getPlugin().getBundle().getEntry("icons/object.gif")));
		 * drawer.add(combined);
		 */
		
		/*eClass = VTCDPackage.eINSTANCE.getVTCDFigureCombination();
		combined = new CombinedTemplateCreationEntry("Combination",
				"Create a new Figure Combination", eClass,
				new VTCDCreationFactory(eClass), ImageDescriptor
						.createFromURL(VTCDEditPlugin.getPlugin().getBundle()
								.getEntry("icons/bola.gif")), ImageDescriptor
						.createFromURL(VTCDEditPlugin.getPlugin().getBundle()
								.getEntry("icons/bola.gif")));
		drawer2.add(combined);*/
		eClass = VTCDPackage.eINSTANCE.getVTCDFigureElement();
		drawer2.add(new VTCDElementCreationToolEntry(
				VTCDEditPlugin.INSTANCE.getString("_UI_VTCDFigureElement_caption"),
				VTCDEditPlugin.INSTANCE.getString("_UI_VTCDFigureElement_tooltip"), eClass, new VTCDCreationFactory(
						eClass),
				VTCDImages.getImageDescriptor(VTCDImages.PALETTE_ELEMENT),
				VTCDImages.getImageDescriptor(VTCDImages.PALETTE_ELEMENT)));
//svonborries09082005 end		
		eClass = VTCDPackage.eINSTANCE.getVTCDFigureEquivalenceClass();
		drawer2.add(new VTCDEquivalenceClassCreationToolEntry(
				VTCDEditPlugin.INSTANCE.getString("_UI_VTCDFigureEquivalenceClass_caption"),
				VTCDEditPlugin.INSTANCE.getString("_UI_VTCDFigureEquivalenceClass_tooltip"), eClass,
				new VTCDCreationFactory(eClass), 
				VTCDImages.getImageDescriptor(VTCDImages.PALETTE_EQUIVALENCECLASS),
				VTCDImages.getImageDescriptor(VTCDImages.PALETTE_EQUIVALENCECLASS)));
//svonborries10082005 end
		
//		svonborries27072005 begin		
		eClass = VTCDPackage.eINSTANCE.getVTCDFigureDependency();
		drawer2.add(new VTCDDependencyCreationToolEntry(
				VTCDEditPlugin.INSTANCE.getString("_UI_VTCDFigureDependency_caption"),
				VTCDEditPlugin.INSTANCE.getString("_UI_VTCDFigureDependency_tooltip"), eClass,
				new VTCDCreationFactory(eClass), 
				VTCDImages.getImageDescriptor(VTCDImages.PALETTE_DEPENDENCY),
				VTCDImages.getImageDescriptor(VTCDImages.PALETTE_DEPENDENCY)));
//svonborries27072005 end	
		
		
		if (!drawer2.getChildren().isEmpty())
			container.add(drawer2);
	}

	protected void createReferenceConnectionEntries(PaletteContainer container) {
		
		  ConnectionCreationToolEntry tool = null;
		  //EClass eClass = null; 
		  /*tool = new ConnectionCreationToolEntry( "Combination to EquivalenceClass", "Creating Combination to EquivalenceClass connection", new EReferenceLinkTemplateCreationFactory(VTCDPackage.eINSTANCE.getVTCDFigureCombination_M_VTCDFigureEquivalenceClass()),
		  ImageDescriptor.createFromURL(GefPlugin.getPlugin().getBundle().getEntry("icons/referenceLink.gif")),
		  ImageDescriptor.createFromURL(GefPlugin.getPlugin().getBundle().getEntry("icons/referenceLink.gif")));
		  container.add(tool);*/ 
		  //TODO externalize the strings and use VTCDImages to get the descriptor
		  tool = new ConnectionCreationToolEntry( VTCDEditPlugin.INSTANCE.getString("_UI_VTCDLinkDependencyElement_caption"), 
				  VTCDEditPlugin.INSTANCE.getString("_UI_VTCDLinkDependencyElement_tooltip"),
		  new VTCDCreationFactory(VTCDPackage.eINSTANCE.getVTCDLinkDependencyElement()),
		  VTCDImages.getImageDescriptor(VTCDImages.PALETTE_LINK_DEPENDENCY_ELEMENTS),
		  VTCDImages.getImageDescriptor(VTCDImages.PALETTE_LINK_DEPENDENCY_ELEMENTS));
		  container.add(tool);
		
	}

	// the set contents must be done on the initialize
	protected void initializeGraphicalViewer() {
		if (getM_VTCDDiagramMain()!=null)
			getGraphicalViewer().setContents(getM_VTCDDiagramMain());
		else
			System.out.println("VTCDDiagram is null?");
		
		updateTitle();
	}

	

	

	void closeEditor(final boolean save)
	{
	    getSite().getShell().getDisplay().syncExec(new Runnable()
	    {
	        public void run()
	        {
	            getSite().getPage().closeEditor(VTCDMainDiagramEditor.this, save);
	        }
	    });
	}

	

	public void dispose() {
		getSite().getWorkbenchWindow().getPartService().removePartListener(m_PartListener);
		m_PartListener = null;
		((IFileEditorInput)getEditorInput()).getFile().getWorkspace()
				.removeResourceChangeListener(resourceTracker);
		super.dispose();
	}

	public void doSave(IProgressMonitor monitor) {
		try
        {
			for (Iterator iter = rsrcSet.getResources().iterator(); iter.hasNext();)
				((Resource)iter.next()).save(Collections.EMPTY_MAP);
			m_VTCDDiagramMain.getM_TestObject().saveTestObject();
            getCommandStack().markSaveLocation();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
	}

	public void doSaveAs() {
		
	}

	public VTCDDiagramMain getM_VTCDDiagramMain() {
		return m_VTCDDiagramMain;
	}

	private ResourceTracker getResourceTracker()
	{
	    if (resourceTracker == null)
	    {
	        resourceTracker = new ResourceTracker();
	
	    }
	
	    return resourceTracker;
	}



	public void init(IEditorSite site, IEditorInput editorInput)
		throws PartInitException {

	
		if (!(editorInput instanceof IFileEditorInput))
			throw new PartInitException ("Invalid input : Must be an IFileEditorInput");
	    super.init(site, editorInput);
	  	}

	public boolean isSaveAsAllowed() {
		return false;
	}

	

	protected void setInput(IEditorInput input) {
	    if (getEditorInput() != null)
	    {
	        IFile file = ((FileEditorInput) getEditorInput()).getFile();
	        file.getWorkspace().removeResourceChangeListener(
	         getResourceTracker()   );
	        
	    }
	
	    super.setInput(input);
	
	    if (getEditorInput() != null)
	    {
	        IFile file = ((FileEditorInput) getEditorInput()).getFile();
	        file.getWorkspace().addResourceChangeListener(getResourceTracker());
	    }
	    //smoreno_begin
	    if (input instanceof IFileEditorInput)
	    {
	    IFile file = ((IFileEditorInput)input).getFile();
		URI uri = URI.createPlatformResourceURI(file.getFullPath().toString());
		Resource resource = rsrcSet.getResource(uri, true);
		m_VTCDDiagramMain = (VTCDDiagramMain)resource.getContents().get(0);
	    }
		//smoreno_end
	}

	public void setM_VTCDDiagramMain(VTCDDiagramMain diagramMain) {
		m_VTCDDiagramMain = diagramMain;
	}

	void updateTitle()
	{
		IEditorInput input = getEditorInput();
		setPartName("Main :"+input.getName());
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
	/*public void selectionChanged(IWorkbenchPart part, ISelection selection)
	{
		IEditorPart activeEditor = getSite().getPage().getActiveEditor();
		 if (this.equals(activeEditor)
				 || ((m_Parent != null) && m_Parent.equals(activeEditor))) {
				 updateActions(getSelectionActions());
	}
	}*/

	/**
	 * @return Returns the combinationEditors.
	 */
	public List getCombinationEditors() {
		return this.m_CombinationEditors;
	}

	public CommandStack getMainCommandStack() {
		return this.mainCommandStack;
	}
	

}
