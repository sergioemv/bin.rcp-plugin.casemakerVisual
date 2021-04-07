/**
 * 
 */
package biz.bi.vtcd.gef.editors.actions;

import org.eclipse.ui.actions.RetargetAction;

import biz.bi.vtcd.provider.VTCDEditPlugin;
import biz.bi.vtcd.provider.VTCDImages;

/**
 * @author smoreno
 *
 */
public class VTCDAutomaticLayoutRetargetAction extends RetargetAction {

	/**
	 * @param p_actionID
	 * @param p_text
	 */
	public VTCDAutomaticLayoutRetargetAction() {
		
		super(VTCDAutomaticLayoutAction.id,
				VTCDEditPlugin.INSTANCE
				.getString("_UI_AutomaticLayout_menu_item_text"));
		this.setToolTipText(VTCDEditPlugin.INSTANCE
				.getString("_UI_AutomaticLayout_menu_item_tooltip"));
		this.setImageDescriptor(VTCDImages.getImageDescriptor(VTCDImages.TOOLBAR_AUTOMATICLAYOUT));
		// TODO Auto-generated constructor stub
	}

}
