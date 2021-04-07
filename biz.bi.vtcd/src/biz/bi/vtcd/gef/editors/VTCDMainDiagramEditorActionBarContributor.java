package biz.bi.vtcd.gef.editors;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gef.internal.GEFMessages;
import org.eclipse.gef.ui.actions.ActionBarContributor;
import org.eclipse.gef.ui.actions.AlignmentRetargetAction;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.gef.ui.actions.MatchHeightRetargetAction;
import org.eclipse.gef.ui.actions.MatchWidthRetargetAction;
import org.eclipse.gef.ui.actions.RedoRetargetAction;
import org.eclipse.gef.ui.actions.UndoRetargetAction;
import org.eclipse.gef.ui.actions.ZoomComboContributionItem;
import org.eclipse.gef.ui.actions.ZoomInRetargetAction;
import org.eclipse.gef.ui.actions.ZoomOutRetargetAction;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.RetargetAction;

import biz.bi.vtcd.gef.editors.actions.VTCDAutomaticLayoutAction;
import biz.bi.vtcd.gef.editors.actions.VTCDAutomaticLayoutRetargetAction;
import biz.bi.vtcd.gef.editors.actions.VTCDCancelableDeleteAction;
import biz.bi.vtcd.gef.editors.actions.VTCDCancelableDeleteRetargetAction;
import biz.bi.vtcd.gef.editors.actions.VTCDReloadTestObjectAction;
import biz.bi.vtcd.gef.editors.actions.VTCDReloadTestObjectRetargetAction;
import biz.bi.vtcd.provider.VTCDEditPlugin;

/**
 * @author Harold Canedo Lopez
 * @since 06/06/2005
 * @version 1.0
 * Manages the installation/deinstallation of global actions for multi-page editors.
 * Responsible for the redirection of global actions to the active editor.
 * Multi-page contributor replaces the contributors for the individual editors in the multi-page editor.
 */
public class VTCDMainDiagramEditorActionBarContributor extends ActionBarContributor{
	private IEditorPart activeEditorPart;
	protected IAction showPropertiesViewAction = new Action() //$NON-NLS-1$
	{
		
		public void run() {
			try {
				getPage().showView("org.eclipse.ui.views.PropertySheet"); //$NON-NLS-1$
			} catch (PartInitException exception) {
				VTCDEditPlugin.INSTANCE.log(exception);
			}
		}
	};
	
	protected IAction refreshViewerAction = new Action() //$NON-NLS-1$
	{
		public boolean isEnabled() {
			return activeEditorPart instanceof IViewerProvider;
		}

		public void run() {
			if (activeEditorPart instanceof IViewerProvider) {
				Viewer viewer = ((IViewerProvider) activeEditorPart)
						.getViewer();
				if (viewer != null) {
					viewer.refresh();
				}
			}
		}
	};
	/**
	 * Creates a multi-page contributor.
	 */
	public VTCDMainDiagramEditorActionBarContributor() {
		super();
	}
	/**
	 * Returns the action registed with the given text editor.
	 * @return IAction or null if editor is null.
	 */
	
	
	protected void buildActions() {
		addRetargetAction(new UndoRetargetAction());
		addRetargetAction(new RedoRetargetAction());
		//addRetargetAction(new DeleteRetargetAction());
		
		addRetargetAction(new AlignmentRetargetAction(PositionConstants.LEFT));
		addRetargetAction(new AlignmentRetargetAction(PositionConstants.CENTER));
		addRetargetAction(new AlignmentRetargetAction(PositionConstants.RIGHT));
		addRetargetAction(new AlignmentRetargetAction(PositionConstants.TOP));
		addRetargetAction(new AlignmentRetargetAction(PositionConstants.MIDDLE));
		addRetargetAction(new AlignmentRetargetAction(PositionConstants.BOTTOM));
		
		addRetargetAction(new ZoomInRetargetAction());
		addRetargetAction(new ZoomOutRetargetAction());
		
		addRetargetAction(new MatchWidthRetargetAction());
		addRetargetAction(new MatchHeightRetargetAction());
		
		addRetargetAction(new RetargetAction(
				GEFActionConstants.TOGGLE_RULER_VISIBILITY, 
				GEFMessages.ToggleRulerVisibility_Label, IAction.AS_CHECK_BOX));
		
		addRetargetAction(new RetargetAction(
				GEFActionConstants.TOGGLE_SNAP_TO_GEOMETRY, 
				GEFMessages.ToggleSnapToGeometry_Label, IAction.AS_CHECK_BOX));

		addRetargetAction(new RetargetAction(GEFActionConstants.TOGGLE_GRID_VISIBILITY, 
				GEFMessages.ToggleGrid_Label, IAction.AS_CHECK_BOX));
		addRetargetAction(new VTCDAutomaticLayoutRetargetAction());
		addRetargetAction(new VTCDCancelableDeleteRetargetAction());
		addRetargetAction(new VTCDReloadTestObjectRetargetAction());
	}
	
	
	public void contributeToMenu(IMenuManager menu) {
		super.contributeToMenu(menu);
		MenuManager viewMenu = new MenuManager(VTCDEditPlugin.INSTANCE.getString("_UI_VTCD_ViewMenu"));
		viewMenu.add(getAction(GEFActionConstants.ZOOM_IN));
		viewMenu.add(getAction(GEFActionConstants.ZOOM_OUT));
		viewMenu.add(new Separator());
		viewMenu.add(getAction(GEFActionConstants.TOGGLE_RULER_VISIBILITY));
		viewMenu.add(getAction(GEFActionConstants.TOGGLE_GRID_VISIBILITY));
		viewMenu.add(getAction(GEFActionConstants.TOGGLE_SNAP_TO_GEOMETRY));
		viewMenu.add(new Separator());
		viewMenu.add(getAction(GEFActionConstants.MATCH_WIDTH));
		viewMenu.add(getAction(GEFActionConstants.MATCH_HEIGHT));
		viewMenu.add(getAction(VTCDAutomaticLayoutAction.id));
		menu.insertAfter(IWorkbenchActionConstants.M_EDIT, viewMenu);
	
	}
	public void contributeToToolBar(IToolBarManager tbm) {
		//the non retarget actions
		tbm.add(getAction(VTCDAutomaticLayoutAction.id));
		tbm.add(getAction(ActionFactory.UNDO.getId()));
		tbm.add(getAction(ActionFactory.REDO.getId()));
		
		tbm.add(new Separator());
		tbm.add(getAction(VTCDReloadTestObjectAction.id));
		//tbm.add(getAction(ActionFactory.DELETE.getId()));
		tbm.add(getAction(VTCDCancelableDeleteAction.ID));
		tbm.add(new Separator());
		tbm.add(getAction(GEFActionConstants.ALIGN_LEFT));
		tbm.add(getAction(GEFActionConstants.ALIGN_CENTER));
		tbm.add(getAction(GEFActionConstants.ALIGN_RIGHT));
		tbm.add(new Separator());
		tbm.add(getAction(GEFActionConstants.ALIGN_TOP));
		tbm.add(getAction(GEFActionConstants.ALIGN_MIDDLE));
		tbm.add(getAction(GEFActionConstants.ALIGN_BOTTOM));
		
		tbm.add(new Separator());	
		tbm.add(getAction(GEFActionConstants.MATCH_WIDTH));
		tbm.add(getAction(GEFActionConstants.MATCH_HEIGHT));
		
		tbm.add(new Separator());	
		String[] zoomStrings = new String[] {	ZoomManager.FIT_ALL, 
												ZoomManager.FIT_HEIGHT, 
												ZoomManager.FIT_WIDTH	};
		tbm.add(new ZoomComboContributionItem(getPage(), zoomStrings));
	}
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
	 */

	protected void declareGlobalActionKeys() {
		addGlobalActionKey(ActionFactory.PRINT.getId());
		addGlobalActionKey(ActionFactory.SELECT_ALL.getId());
		addGlobalActionKey(ActionFactory.PASTE.getId());
		addGlobalActionKey(VTCDCancelableDeleteAction.ID);
	}
}
