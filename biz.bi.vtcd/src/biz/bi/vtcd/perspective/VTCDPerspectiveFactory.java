/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import biz.bi.vtcd.views.VTCDCauseEffectView;
import biz.bi.vtcd.views.VTCDDiagramExplorerView;

/**
 * @author svonborries
 * @11-08-2005
 * @svonborries
 */
public class VTCDPerspectiveFactory implements IPerspectiveFactory{

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IPerspectiveFactory#createInitialLayout(org.eclipse.ui.IPageLayout)
	 */
	public void createInitialLayout(IPageLayout p_layout) {
		String editorArea = p_layout.getEditorArea();
		
		IFolderLayout left = p_layout.createFolder("left",IPageLayout.LEFT,0.25f,editorArea);
		left.addView(IPageLayout.ID_RES_NAV);

		
		
		IFolderLayout leftbotton = p_layout.createFolder("leftbotton",IPageLayout.BOTTOM,0.50f,"left");	
		leftbotton.addView(IPageLayout.ID_OUTLINE);
		
		
		IFolderLayout botton = p_layout.createFolder("botton",
				IPageLayout.BOTTOM, 0.66f, editorArea);
		botton.addView(IPageLayout.ID_PROP_SHEET);
		botton.addView(VTCDCauseEffectView.view_id);
		botton.addView(IPageLayout.ID_TASK_LIST);
		botton.addPlaceholder(IPageLayout.ID_PROBLEM_VIEW);
		
		IFolderLayout bottonright = p_layout.createFolder("bottonright",IPageLayout.RIGHT,0.50f,"botton");
		bottonright.addView(VTCDDiagramExplorerView.view_id);

		
	}
	

}
