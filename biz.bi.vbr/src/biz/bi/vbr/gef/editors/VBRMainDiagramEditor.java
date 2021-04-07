/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vbr.gef.editors;


import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.ZoomInAction;
import org.eclipse.gef.ui.actions.ZoomOutAction;
import org.eclipse.gef.ui.palette.FlyoutPaletteComposite.FlyoutPreferences;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;
import org.eclipse.gef.ui.parts.ScrollingGraphicalViewer;
import org.eclipse.jface.action.IAction;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertySheetPage;

import biz.bi.vbr.gef.editparts.VBREditPartFactory;
import biz.bi.vbr.provider.VBRModelEditPlugin;
import biz.bi.vbr.vbrvm.MainDiagram;


/**
 * @author hcanedo
 * @since 02-09-2005
 */
public class VBRMainDiagramEditor extends GraphicalEditorWithFlyoutPalette {
///////////////////////////CONSTANTS//////////////////////////////////////
	
	public static final String PALETTE_DOCK_LOCATION = "DockLocation"; //$NON-NLS-1$

	public static final String PALETTE_SIZE = "PaletteSize"; //$NON-NLS-1$

	public static final String PALETTE_STATE = "PaletteState"; //$NON-NLS-1$
	
///////////////////////GLOBALS VARIABLES /////////////////////////////////	


	
	private PaletteRoot m_PaletteRoot;

	protected IPropertySheetPage m_PropertySheetPage;

	protected IContentOutlinePage m_OutlinePage;
	
	private final ResourceSet m_ResourceSet = new ResourceSetImpl();
	
	private MainDiagram m_VBRMainDiagram;
	private ResourceTracker m_ResourceTracker;

	
/////////////////////////////////////////////////////////////////////////
	
	
	/**
	 * 
	 * @author hcanedo
	 * @since 02-09-2005
	 */
	public VBRMainDiagramEditor() {
		super();
		setEditDomain(new DefaultEditDomain(this));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette#getPalettePreferences()
	 */
	protected FlyoutPreferences getPalettePreferences() {
		return new FlyoutPreferences() {
			public int getDockLocation() {
				return VBRModelEditPlugin.getPlugin().getPluginPreferences()
						.getInt(PALETTE_DOCK_LOCATION);
			}

			public int getPaletteState() {
				return VBRModelEditPlugin.getPlugin().getPluginPreferences()
						.getInt(PALETTE_STATE);
			}

			public int getPaletteWidth() {
				return VBRModelEditPlugin.getPlugin().getPluginPreferences()
						.getInt(PALETTE_SIZE);
			}

			public void setDockLocation(int location) {
				VBRModelEditPlugin.getPlugin().getPluginPreferences().setValue(
						PALETTE_DOCK_LOCATION, location);
			}

			public void setPaletteState(int state) {
				VBRModelEditPlugin.getPlugin().getPluginPreferences().setValue(
						PALETTE_STATE, state);
			}

			public void setPaletteWidth(int width) {
				VBRModelEditPlugin.getPlugin().getPluginPreferences().setValue(
						PALETTE_SIZE, width);
			}
		};
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette#getPaletteRoot()
	 */
	protected PaletteRoot getPaletteRoot() {
		if (m_PaletteRoot == null)
			m_PaletteRoot = VBRMainDiagramPaletteFactory.createPalette();
		this.getEditDomain().loadDefaultTool();
		return m_PaletteRoot;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#doSave(org.eclipse.core.runtime.IProgressMonitor)
	 */
	public void doSave(IProgressMonitor p_monitor) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#doSaveAs()
	 */
	public void doSaveAs() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#isSaveAsAllowed()
	 */
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * 
	 * @author hcanedo
	 * @since 02-09-2005
	 * @param save boolean
	 */
	void closeEditor(final boolean save)
	{
	    getSite().getShell().getDisplay().syncExec(new Runnable()
	    {
	        public void run()
	        {
	            getSite().getPage().closeEditor(VBRMainDiagramEditor.this, save);
	        }
	    });
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette#getAdapter(java.lang.Class)
	 */
	public Object getAdapter(Class p_type) {
		if (p_type == CommandStack.class) 
			return this.getCommandStack();
		else if (p_type == ZoomManager.class)
			return getGraphicalViewer().getProperty(
					ZoomManager.class.toString());
		return super.getAdapter(p_type);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.ui.parts.GraphicalEditor#configureGraphicalViewer()
	 */
	protected void configureGraphicalViewer() {
		ScrollingGraphicalViewer viewer = (ScrollingGraphicalViewer) getGraphicalViewer();
		ScalableFreeformRootEditPart root = new ScalableFreeformRootEditPart();
		List zoomLevels = new ArrayList(3);
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
		viewer.getControl().setBackground(ColorConstants.listBackground);
		viewer.setRootEditPart(root);
		getEditDomain().addViewer(viewer);
		viewer.setEditPartFactory(new VBREditPartFactory());

	}
	
	private ResourceTracker getResourceTracker()
	{
	    if (m_ResourceTracker == null)
	    {
	    	m_ResourceTracker = new ResourceTracker();
	
	    }
	
	    return m_ResourceTracker;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.ui.parts.GraphicalEditor#init(org.eclipse.ui.IEditorSite, org.eclipse.ui.IEditorInput)
	 */
	public void init(IEditorSite p_site, IEditorInput p_input) throws PartInitException {
		if (!(p_input instanceof IFileEditorInput))
			throw new PartInitException ("Invalid input : Must be an IFileEditorInput");
	    super.init(p_site, p_input);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#setInput(org.eclipse.ui.IEditorInput)
	 */
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
	    if (input instanceof IFileEditorInput)
	    {
	    	IFile file = ((IFileEditorInput)input).getFile();
	    	URI uri = URI.createPlatformResourceURI(file.getFullPath().toString());
	    	Resource resource = m_ResourceSet.getResource(uri, true);
	    	m_VBRMainDiagram = (MainDiagram)resource.getContents().get(0);
	    }
	}

	/**
	 * @return Returns the vBRMainDiagram.
	 * @author hcanedo
	 * @since 06-09-2005
	 */
	public MainDiagram getVBRMainDiagram() {
		return m_VBRMainDiagram;
	}

	/**
	 * @param p_mainDiagram The vBRMainDiagram to set.
	 * @author hcanedo
	 * @since 06-09-2005
	 */
	public void setVBRMainDiagram(MainDiagram p_mainDiagram) {
		m_VBRMainDiagram = p_mainDiagram;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette#initializeGraphicalViewer()
	 */
	protected void initializeGraphicalViewer() {
		super.initializeGraphicalViewer();
		if (getVBRMainDiagram()!=null)
			getGraphicalViewer().setContents(getVBRMainDiagram());
		else
			System.out.println("VBRDiagram is null?");
		updateTitle();
	}
	
	private void updateTitle()
	{
		IEditorInput input = getEditorInput();
		setPartName("Main :"+input.getName());
		setTitleToolTip(input.getToolTipText());
	}
	
	public ActionRegistry getActionRegistry() {
		return super.getActionRegistry();
	}
	
	public void commandStackChanged(EventObject event) {
		firePropertyChange(PROP_DIRTY);
		super.commandStackChanged(event);
	}
//////////////////////////////INNER CLASS///////////////////////////////////////////
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
        	VBRModelEditPlugin.getPlugin().getLog().log(exception.getStatus());
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
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

	
}
