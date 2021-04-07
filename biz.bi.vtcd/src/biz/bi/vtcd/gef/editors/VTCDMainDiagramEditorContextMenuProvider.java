package biz.bi.vtcd.gef.editors;

import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.actions.ActionFactory;

import biz.bi.vtcd.gef.editors.actions.VTCDAssignEffectAction;
import biz.bi.vtcd.gef.editors.actions.VTCDAutomaticLayoutAction;
import biz.bi.vtcd.gef.editors.actions.VTCDCancelableDeleteAction;
import biz.bi.vtcd.gef.editors.actions.VTCDGoToDiagramCombinationAction;
import biz.bi.vtcd.gef.editors.actions.VTCDReloadTestObjectAction;
import biz.bi.vtcd.provider.VTCDEditPlugin;


/**
 * Provides context menu actions for the Main Diagram Editor.
 * @author smoreno
 */
class VTCDMainDiagramEditorContextMenuProvider extends ContextMenuProvider {

/** The editor's action registry. */
private ActionRegistry actionRegistry;
private EditPartViewer viewer; 
	
/**
 * Instantiate a new menu context provider for the specified EditPartViewer 
 * and ActionRegistry.
 * @param viewer	the editor's graphical viewer
 * @param registry	the editor's action registry
 * @throws IllegalArgumentException if registry is <tt>null</tt>. 
 */
public VTCDMainDiagramEditorContextMenuProvider(EditPartViewer viewer, ActionRegistry registry) {
	super(viewer);
	if (registry == null) {
		throw new IllegalArgumentException();
	}
	actionRegistry = registry;
	this.viewer = viewer; 
}

/**
 * Called when the context menu is about to show. Actions, 
 * whose state is enabled, will appear in the context menu.
 * @see org.eclipse.gef.ContextMenuProvider#buildContextMenu(org.eclipse.jface.action.IMenuManager)
 */
public void buildContextMenu(IMenuManager menu) {
	IAction action;
	// Add standard action groups to the menu
	GEFActionConstants.addStandardActionGroups(menu);

	// Add actions to the menu
	action = getAction(ActionFactory.UNDO.getId()); 
	menu.appendToGroup(
			GEFActionConstants.GROUP_UNDO, // target group id
			action); // action to add
	action = getAction(ActionFactory.REDO.getId());
	menu.appendToGroup(
			GEFActionConstants.GROUP_UNDO, 
			action);
	//Delete action
	action = getAction(VTCDCancelableDeleteAction.ID);
	if (action.isEnabled())
		menu.appendToGroup(GEFActionConstants.GROUP_EDIT,action);
	
	action = getAction(VTCDGoToDiagramCombinationAction.ID);
	if (action!=null)
	if (action.isEnabled())
	menu.appendToGroup(
			GEFActionConstants.GROUP_VIEW, 
			action);
	
	action = getAction(VTCDAssignEffectAction.ID);
	if (action!=null)
	if (action.isEnabled())
	menu.appendToGroup(
			GEFActionConstants.GROUP_VIEW, 
			action);

	action = getAction(VTCDAutomaticLayoutAction.id);
	if (action.isEnabled())
	menu.appendToGroup(
			GEFActionConstants.GROUP_VIEW, 
			action);
	
	action = getAction(VTCDReloadTestObjectAction.id);
	if (action.isEnabled())
	menu.appendToGroup(
			GEFActionConstants.GROUP_VIEW, 
			action);
	// Alignment Actions
	MenuManager submenu = new MenuManager(VTCDEditPlugin.INSTANCE.getString("_UI_VTCD_AlignMenu"));

	action = getAction(GEFActionConstants.ALIGN_LEFT);
	if (action.isEnabled())
		submenu.add(action);

	action = getAction(GEFActionConstants.ALIGN_CENTER);
	if (action.isEnabled())
		submenu.add(action);

	action = getAction(GEFActionConstants.ALIGN_RIGHT);
	if (action.isEnabled())
		submenu.add(action);
		
	submenu.add(new Separator());
	
	action = getAction(GEFActionConstants.ALIGN_TOP);
	if (action.isEnabled())
		submenu.add(action);

	action = getAction(GEFActionConstants.ALIGN_MIDDLE);
	if (action.isEnabled())
		submenu.add(action);

	action = getAction(GEFActionConstants.ALIGN_BOTTOM);
	if (action.isEnabled())
		submenu.add(action);
	if (!submenu.isEmpty())
		menu.appendToGroup(GEFActionConstants.GROUP_REST, submenu);


}

private IAction getAction(String actionId) {
	return actionRegistry.getAction(actionId);
}

}
