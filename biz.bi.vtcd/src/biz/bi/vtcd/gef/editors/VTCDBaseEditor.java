/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.gef.editors;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gef.KeyHandler;
import org.eclipse.gef.KeyStroke;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.AlignmentAction;
import org.eclipse.gef.ui.actions.DirectEditAction;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.gef.ui.actions.MatchHeightAction;
import org.eclipse.gef.ui.actions.MatchWidthAction;
import org.eclipse.gef.ui.palette.FlyoutPaletteComposite.FlyoutPreferences;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;
import org.eclipse.jface.action.IAction;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertySheetPage;

import biz.bi.vtcd.gef.editors.actions.VTCDAssignEffectAction;
import biz.bi.vtcd.gef.editors.actions.VTCDAutomaticLayoutAction;
import biz.bi.vtcd.gef.editors.actions.VTCDCancelableDeleteAction;
import biz.bi.vtcd.gef.editors.actions.VTCDGoToDiagramCombinationAction;
import biz.bi.vtcd.gef.editors.actions.VTCDReloadTestObjectAction;

/**
 * @author smoreno
 * @10-ago-2005
 * @smoreno
 */
public class VTCDBaseEditor extends GraphicalEditorWithFlyoutPalette {

	protected KeyHandler sharedKeyHandler;

	/* (non-Javadoc)
	 * @see org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette#getPalettePreferences()
	 */
	
	public Object getAdapter(Class type) {
		if (type == CommandStack.class) 
			return this.getCommandStack();
			else
		return super.getAdapter(type);
	}
	protected FlyoutPreferences getPalettePreferences() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette#getPaletteRoot()
	 */
	protected PaletteRoot getPaletteRoot() {
		// TODO Auto-generated method stub
		return null;
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

	public KeyHandler getCommonKeyHandler() {
		if (sharedKeyHandler == null) {
			sharedKeyHandler = new KeyHandler();
			sharedKeyHandler
					.put(KeyStroke.getPressed(SWT.DEL, 127, 0),
							getActionRegistry().getAction(
									VTCDCancelableDeleteAction.ID));
			sharedKeyHandler.put(KeyStroke.getPressed(SWT.F2, 0),
					getActionRegistry().getAction(
							GEFActionConstants.DIRECT_EDIT));
		}
		return sharedKeyHandler;
	}

	protected void createActions() {
		super.createActions();
		ActionRegistry registry = getActionRegistry();
		IAction action;
		
		VTCDAssignEffectAction l_AssignEffectAction = new VTCDAssignEffectAction(this);
		getSelectionActions().add(l_AssignEffectAction.getId());
		registry.registerAction(l_AssignEffectAction);
		
		action = new DirectEditAction((IWorkbenchPart) this);
		registry.registerAction(action);
		getSelectionActions().add(action.getId());
		
		VTCDCancelableDeleteAction l_cancelableDeleteAction = new VTCDCancelableDeleteAction(this);
		getActionRegistry().registerAction(l_cancelableDeleteAction);
		getSelectionActions().add(l_cancelableDeleteAction.getId());
		l_cancelableDeleteAction.setDeleteAction(this.getActionRegistry().getAction(ActionFactory.DELETE.getId()));
		
		VTCDGoToDiagramCombinationAction l_GoToCombinationDiagramAction = new VTCDGoToDiagramCombinationAction(this);
		getSelectionActions().add(l_GoToCombinationDiagramAction.getId());
		registry.registerAction(l_GoToCombinationDiagramAction);
		
		VTCDAutomaticLayoutAction l_AutomaticLayoutAction = new VTCDAutomaticLayoutAction(this);
		getSelectionActions().add(l_AutomaticLayoutAction.getId());
		registry.registerAction(l_AutomaticLayoutAction);
	
		VTCDReloadTestObjectAction l_ReloadTestObjectAction = new VTCDReloadTestObjectAction(this);
		getSelectionActions().add(l_ReloadTestObjectAction.getId());
		registry.registerAction(l_ReloadTestObjectAction);
		
	
		action = new MatchWidthAction(this);
		registry.registerAction(action);
		getSelectionActions().add(action.getId());
		
		action = new MatchHeightAction(this);
		registry.registerAction(action);
		getSelectionActions().add(action.getId());
		
		action = new AlignmentAction((IWorkbenchPart)this, PositionConstants.LEFT);
		registry.registerAction(action);
		getSelectionActions().add(action.getId());
	
		action = new AlignmentAction((IWorkbenchPart)this, PositionConstants.RIGHT);
		registry.registerAction(action);
		getSelectionActions().add(action.getId());
	
		action = new AlignmentAction((IWorkbenchPart)this, PositionConstants.TOP);
		registry.registerAction(action);
		getSelectionActions().add(action.getId());
	
		action = new AlignmentAction((IWorkbenchPart)this, PositionConstants.BOTTOM);
		registry.registerAction(action);
		getSelectionActions().add(action.getId());
	
		action = new AlignmentAction((IWorkbenchPart)this, PositionConstants.CENTER);
		registry.registerAction(action);
		getSelectionActions().add(action.getId());
	
		action = new AlignmentAction((IWorkbenchPart)this, PositionConstants.MIDDLE);
		registry.registerAction(action);
		getSelectionActions().add(action.getId());
		
		
			
			
	}

}
