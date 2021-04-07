/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vbr.gef.editors;


import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gef.ui.actions.ActionBarContributor;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.gef.ui.actions.MatchHeightRetargetAction;
import org.eclipse.gef.ui.actions.MatchWidthRetargetAction;
import org.eclipse.gef.ui.actions.RedoRetargetAction;
import org.eclipse.gef.ui.actions.UndoRetargetAction;
import org.eclipse.gef.ui.actions.ZoomComboContributionItem;
import org.eclipse.gef.ui.actions.ZoomInRetargetAction;
import org.eclipse.gef.ui.actions.ZoomOutRetargetAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.actions.ActionFactory;

import biz.bi.vbr.provider.VBRModelEditPlugin;

/**
 * @author hcanedo
 * @since 05-09-2005
 * Manages the installation/deinstallation of global actions for multi-page editors.
 * Responsible for the redirection of global actions to the active editor.
 * Multi-page contributor replaces the contributors for the individual editors in the multi-page editor.
 */
public class VBRMainDiagramActionBarContributor extends ActionBarContributor {

	/**
	 * 
	 * @author hcanedo
	 * @since 05-09-2005
	 */
	public VBRMainDiagramActionBarContributor() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.ui.actions.ActionBarContributor#buildActions()
	 */
	protected void buildActions() {
		addRetargetAction(new UndoRetargetAction());
		addRetargetAction(new RedoRetargetAction());
		addRetargetAction(new ZoomInRetargetAction());
		addRetargetAction(new ZoomOutRetargetAction());
		addRetargetAction(new MatchWidthRetargetAction());
		addRetargetAction(new MatchHeightRetargetAction());

	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.ui.actions.ActionBarContributor#declareGlobalActionKeys()
	 */
	protected void declareGlobalActionKeys() {
		addGlobalActionKey(ActionFactory.PRINT.getId());
		addGlobalActionKey(ActionFactory.SELECT_ALL.getId());
		addGlobalActionKey(ActionFactory.PASTE.getId());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorActionBarContributor#contributeToMenu(org.eclipse.jface.action.IMenuManager)
	 */
	public void contributeToMenu(IMenuManager p_menuManager) {
		MenuManager l_ViewMenu = new MenuManager(VBRModelEditPlugin.INSTANCE.getString("_UI_VBR_ViewMenu"));
		l_ViewMenu.add(getAction(GEFActionConstants.ZOOM_IN));
		l_ViewMenu.add(getAction(GEFActionConstants.ZOOM_OUT));
		l_ViewMenu.add(new Separator());
		l_ViewMenu.add(getAction(GEFActionConstants.MATCH_WIDTH));
		l_ViewMenu.add(getAction(GEFActionConstants.MATCH_HEIGHT));
		p_menuManager.insertAfter(IWorkbenchActionConstants.M_EDIT, l_ViewMenu);
		super.contributeToMenu(p_menuManager);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorActionBarContributor#contributeToToolBar(org.eclipse.jface.action.IToolBarManager)
	 */
	public void contributeToToolBar(IToolBarManager p_toolBarManager) {
		p_toolBarManager.add(getAction(ActionFactory.UNDO.getId()));
		p_toolBarManager.add(getAction(ActionFactory.REDO.getId()));
		
		p_toolBarManager.add(new Separator());
		p_toolBarManager.add(getAction(GEFActionConstants.MATCH_WIDTH));
		p_toolBarManager.add(getAction(GEFActionConstants.MATCH_HEIGHT));
		p_toolBarManager.add(new Separator());	
		String[] zoomStrings = new String[] {	ZoomManager.FIT_ALL, 
												ZoomManager.FIT_HEIGHT, 
												ZoomManager.FIT_WIDTH	};
		p_toolBarManager.add(new ZoomComboContributionItem(getPage(), zoomStrings));
		super.contributeToToolBar(p_toolBarManager);
	}

}
