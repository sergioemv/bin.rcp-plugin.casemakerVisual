/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.gef.editors.domains;

import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.ui.IEditorPart;

import biz.bi.vtcd.gef.editors.VTCDCombinationDiagramEditor;
import biz.bi.vtcd.gef.editors.VTCDMainDiagramEditor;

/**
 * @author smoreno
 * @02-08-2005
 * @smoreno
 */
public class VTCDDiagramEditDomain extends DefaultEditDomain {

	/**
	 * @param p_editorPart
	 */
	private boolean initialized=false;
	public VTCDDiagramEditDomain(IEditorPart p_editorPart) {
		
		super(p_editorPart);
		
		// TODO Auto-generated constructor stub
	}
	public CommandStack getCommandStack()
	{
		if (this.getEditorPart() instanceof VTCDMainDiagramEditor)
			return ((VTCDMainDiagramEditor)this.getEditorPart()).getMainCommandStack();
		if  (this.getEditorPart() instanceof VTCDCombinationDiagramEditor)
			return ((VTCDCombinationDiagramEditor)this.getEditorPart()).getMainDiagramEditor().getMainCommandStack();
		 
		return null;
	}
	
	public void loadDefaultTool()
	{
		if (initialized)
			super.loadDefaultTool();
	}
	public boolean isInitialized() {
		return this.initialized;
	}
	public void setInitialized(boolean p_initialized) {
		this.initialized = p_initialized;
		loadDefaultTool();
	}

}
