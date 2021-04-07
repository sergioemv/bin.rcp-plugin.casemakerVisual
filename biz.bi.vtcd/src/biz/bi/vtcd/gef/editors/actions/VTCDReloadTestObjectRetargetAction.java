/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.gef.editors.actions;

import org.eclipse.ui.actions.RetargetAction;

import biz.bi.vtcd.provider.VTCDEditPlugin;
import biz.bi.vtcd.provider.VTCDImages;

/**
 * @author svonborries
 * @08-08-2005
 * @svonborries
 */
public class VTCDReloadTestObjectRetargetAction extends RetargetAction {

	/**
	 * @param p_actionID
	 * @param p_text
	 */
	public VTCDReloadTestObjectRetargetAction() {
		super(VTCDReloadTestObjectAction.id, VTCDEditPlugin.INSTANCE
				.getString("_UI_ReloadTestObject_menu_item_text"));
		
		this.setToolTipText(VTCDEditPlugin.INSTANCE
				.getString("_UI_ReloadTestObject_menu_item_tooltip"));
		this.setImageDescriptor(VTCDImages.getImageDescriptor(VTCDImages.TOOLBAR_RELOADTESTOBJECT));
	}

}
