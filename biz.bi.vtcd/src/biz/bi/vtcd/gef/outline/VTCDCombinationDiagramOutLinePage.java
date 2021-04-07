package biz.bi.vtcd.gef.outline;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.Viewport;
import org.eclipse.draw2d.parts.ScrollableThumbnail;
import org.eclipse.draw2d.parts.Thumbnail;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.gef.editparts.ScalableRootEditPart;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.parts.ContentOutlinePage;
import org.eclipse.gef.ui.parts.TreeViewer;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.part.IPageSite;
import org.eclipse.ui.part.PageBook;

import biz.bi.vtcd.gef.editors.VTCDCombinationDiagramEditor;
import biz.bi.vtcd.provider.VTCDEditPlugin;



public class VTCDCombinationDiagramOutLinePage extends ContentOutlinePage implements IAdaptable {
	static final int ID_OUTLINE  = 0;
	  static final int ID_OVERVIEW = 1;
	  
	  private AdapterFactory adapterFactory;
	  private VTCDCombinationDiagramEditor editor;
	  
	  private TreeViewer viewer;  
	  private Control outline;
	  private Canvas overview;
	  private Thumbnail thumbnail;
	  private DisposeListener disposeListener;
	  private PageBook pageBook;
	  
	  private IAction showOutlineAction;
	  private IAction showOverviewAction;
	  
	public VTCDCombinationDiagramOutLinePage(VTCDCombinationDiagramEditor editor, AdapterFactory p_adapterFactory) {
		super(new TreeViewer());
	    this.viewer = (TreeViewer) getViewer();
	    this.editor = editor;
	    this.adapterFactory = p_adapterFactory;
	}

	public Object getAdapter(Class adapter) {
		if (adapter == ZoomManager.class)
		      return editor.getGraphicalViewer().getProperty(ZoomManager.class.toString());
		    return null;
	}
	protected void hookOutlineViewer(){
	    editor.getSelectionSynchronizer().addViewer(getViewer());
	  }
	protected void unhookOutlineViewer(){
	    editor.getSelectionSynchronizer().removeViewer(getViewer());
	    if (disposeListener != null && editor.getGraphicalViewer().getControl() != null && !editor.getGraphicalViewer().getControl().isDisposed())
	      editor.getGraphicalViewer().getControl().removeDisposeListener(disposeListener);
	  }
	protected void initializeOverview() {
	    LightweightSystem lws = new LightweightSystem(overview);
	    RootEditPart rootEditPart = editor.getGraphicalViewer().getRootEditPart();
	    if (rootEditPart instanceof ScalableFreeformRootEditPart) {
	      ScalableFreeformRootEditPart root = (ScalableFreeformRootEditPart) editor.getGraphicalViewer().getRootEditPart();
	      thumbnail = new ScrollableThumbnail((Viewport)root.getFigure());
	      thumbnail.setBorder(new MarginBorder(3));
	      thumbnail.setSource(root.getLayer(LayerConstants.PRINTABLE_LAYERS));
	      lws.setContents(thumbnail);
	      disposeListener = new DisposeListener() {
	        public void widgetDisposed(DisposeEvent e) {
	          if (thumbnail != null) {
	            thumbnail.deactivate();
	            thumbnail = null;
	          }
	        }
	      };
	      editor.getGraphicalViewer().getControl().addDisposeListener(disposeListener);
	    }
	    if (rootEditPart instanceof ScalableRootEditPart) {
	      ScalableRootEditPart root = (ScalableRootEditPart) editor.getGraphicalViewer().getRootEditPart();
	      thumbnail = new ScrollableThumbnail((Viewport)root.getFigure());
	      thumbnail.setBorder(new MarginBorder(3));
	      thumbnail.setSource(root.getLayer(LayerConstants.PRINTABLE_LAYERS));
	      lws.setContents(thumbnail);
	      disposeListener = new DisposeListener() {
	        public void widgetDisposed(DisposeEvent e) {
	          if (thumbnail != null) {
	            thumbnail.deactivate();
	            thumbnail = null;
	          }
	        }
	      };
	      editor.getGraphicalViewer().getControl().addDisposeListener(disposeListener);
	    }
	  }

	protected void showPage(int id) {
	    if (id == ID_OUTLINE) {
	      showOutlineAction.setChecked(true);
	      showOverviewAction.setChecked(false);
	      pageBook.showPage(outline);
	      if (thumbnail != null)
	        thumbnail.setVisible(false);
	    } else if (id == ID_OVERVIEW) {
	      if (thumbnail == null)
	        initializeOverview();
	      showOutlineAction.setChecked(false);
	      showOverviewAction.setChecked(true);
	      pageBook.showPage(overview);
	      if (thumbnail != null)
	        thumbnail.setVisible(true);
	    }
	  }
	private void configureOutlineViewer() {
	    viewer.setEditDomain(new EditDomain());
	    viewer.setEditPartFactory(VTCDTreeEditPartFactory.getInstance());    
	   // viewer.addDragSourceListener(new OutlineDragSourceListener(viewer, editor.getTransferInstance()));
	    viewer.setKeyHandler(editor.getCommonKeyHandler());
	    IToolBarManager tbm = getSite().getActionBars().getToolBarManager();
	    showOutlineAction = new Action() {
	      public void run() {
	        showPage(ID_OUTLINE);
	      }
	    };
	    showOutlineAction.setImageDescriptor(ImageDescriptor.createFromURL(
	    		VTCDEditPlugin.getPlugin().getBundle().getEntry("icons/outline.gif"))); //$NON-NLS-1$
	    tbm.add(showOutlineAction);
	    showOutlineAction.setToolTipText("Show Outline Tree");
	    showOverviewAction = new Action() {
	      public void run() {
	        showPage(ID_OVERVIEW);
	      }
	    };
	    showOverviewAction.setImageDescriptor(ImageDescriptor.createFromURL(
	        VTCDEditPlugin.getPlugin().getBundle().getEntry("icons/overview.gif"))); //$NON-NLS-1$
	    tbm.add(showOverviewAction);
	    showOverviewAction.setToolTipText("Show Overview");
	    showPage(ID_OUTLINE);
	  }

	public void dispose(){
	    unhookOutlineViewer();
	    if (thumbnail != null) {
	      thumbnail.deactivate();
	      thumbnail = null;
	    }
	    super.dispose();
	    editor.setOutlinePage(null);
	  }
	public Control getControl() {
	    return pageBook;
	  }
	public void createControl(Composite parent) {
	    pageBook = new PageBook(parent, SWT.NONE);
	    outline = getViewer().createControl(pageBook);
	    overview = new Canvas(pageBook, SWT.NONE);
	    pageBook.showPage(outline);
	    configureOutlineViewer();
	    hookOutlineViewer();
	    initializeOutlineViewer();                    
	  }

	public void init(IPageSite pageSite) {
	    super.init(pageSite);
	    ActionRegistry registry = editor.getActionRegistry();
	    IActionBars bars = pageSite.getActionBars();
	    String id = ActionFactory.UNDO.getId();
	    bars.setGlobalActionHandler(id, registry.getAction(id));
	    id = ActionFactory.REDO.getId();
	    bars.setGlobalActionHandler(id, registry.getAction(id));
	    bars.updateActionBars();
	    IToolBarManager manager = bars.getToolBarManager();
	    IAction action = new Action() {
	      public void run() {
	        expand(((Tree) viewer.getControl()).getItems());
	      }
	      private void expand(TreeItem[] items) {
	        for (int i = 0; i < items.length; i++) {
	          expand(items[i].getItems());
	          items[i].setExpanded(false);
	        }
	      }
	    };
	    action.setImageDescriptor(ImageDescriptor.createFromURL(
	    		VTCDEditPlugin.getPlugin().getBundle().getEntry("icons/collapseall.gif"))); //$NON-NLS-1$
	    action.setToolTipText("Collapse All");
	    manager.add(action);
	    action = new Action() {
	      public void run() {
	        expand(((Tree) viewer.getControl()).getItems());
	      }
	      private void expand(TreeItem[] items) {
	        for (int i = 0; i < items.length; i++) {
	          expand(items[i].getItems());
	          items[i].setExpanded(true);
	        }
	      }
	    };
	    action.setImageDescriptor(ImageDescriptor.createFromURL(
	        VTCDEditPlugin.getPlugin().getBundle().getEntry("icons/expandall.gif"))); //$NON-NLS-1$
	    action.setToolTipText("Expand All");
	    manager.add(action);
	  }
	 
	private void initializeOutlineViewer() {
	    viewer.setContents(editor.getMainDiagramEditor().getM_VTCDDiagramMain().getM_TestObject());
	  }
}
